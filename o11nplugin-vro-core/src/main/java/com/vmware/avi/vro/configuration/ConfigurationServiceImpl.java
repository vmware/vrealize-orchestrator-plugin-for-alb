package com.vmware.avi.vro.configuration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vmware.avi.vro.model.AviConnectionInfo;

import ch.dunes.vso.sdk.cipher.ICipher;
import ch.dunes.vso.sdk.endpoints.IEndpointConfiguration;
import ch.dunes.vso.sdk.endpoints.IEndpointConfigurationService;

/**
 * 
 * 
 * @author mayur
 *
 */
@Component
public class ConfigurationServiceImpl implements ConfigurationService {

	private static final Logger log = LoggerFactory.getLogger(ConfigurationServiceImpl.class);

	/**
	 * A list of listeners, who have subscribed to any configuration events, such as
	 * connection updates and deletions.
	 */
	private final Collection<ConfigurationChangeListener> listeners;
	
	@Autowired
	private ICipher cipherService ;

	public ConfigurationServiceImpl() {
		listeners = new CopyOnWriteArrayList<ConfigurationChangeListener>();
	}

	/*
	 * Constants of the key names under which the connection values will be stored.
	 */
	private static final String ID = "connectionId";
	private static final String CONTROLLER = "controller";
	private static final String USERNAME = "username";
	private static final String PASSWORD = "password";
	private static final String TENANT = "tenant";
	private static final String VERSION = "version";
	private static final String SESSION_ID = "sessionId";
	private static final String TYPE = "Avi";

	/*
	 * The platform-provided service for configuration persistence
	 */
	@Autowired
	private IEndpointConfigurationService endpointConfigurationService;

	/*
	 * Returns a collection of all stored configurations for this plug-in only The
	 * service is aware of the plug-in name, thus will return only configurations
	 * for this plug-in.
	 */
	@Override
	public List<AviConnectionInfo> getAll() {
		log.debug("__INFO__:: In getAll method...");
		Collection<IEndpointConfiguration> configs;
		try {
			configs = endpointConfigurationService.getEndpointConfigurations();
			List<AviConnectionInfo> result = new ArrayList<>(configs.size());
			for (IEndpointConfiguration config : configs) {
				AviConnectionInfo connectionInfo = getConnectionInfo(config);
				if (connectionInfo != null) {
					log.debug("Adding connection info to result map: " + connectionInfo);
					result.add(connectionInfo);
				}
			}
			log.debug("__DONE__:: In getAll method and all endpoints are: " + result.toString());
			return result;
		} catch (IOException e) {
			log.error("Error reading connections.", e);
			throw new RuntimeException(e);
		}
	}

	/*
	 * Returns a AviConnectionInfo by its ID The service is aware of the plug-in name,
	 * thus cannot return a configuration for another plug-in.
	 */
	@Override
	public AviConnectionInfo findById(String id) {
		log.debug("__INFO__:: In findById method:");
		// Sanity checks
		Validate.notNull(id, "Id cannot be null.");
		IEndpointConfiguration endpointConfiguration;
		try {
			endpointConfiguration = endpointConfigurationService.getEndpointConfiguration(id.toString());
			log.debug("__DONE__:: In findById method id is: " + id);
			return getConnectionInfo(endpointConfiguration);
		} catch (IOException e) {
			log.error("Error finding connection by id: " + id.toString(), e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * Save or update a connection info. The service is aware of the plug-in name,
	 * thus cannot save the configuration under the name of another plug-in.
	 */
	@Override
	public AviConnectionInfo save(AviConnectionInfo connectionInfo) {
		log.debug("__INFO__:: Inside save method:");
		IEndpointConfiguration endpointConfiguration;
		// Sanity checks
		Validate.notNull(connectionInfo, "Connection info cannot be null.");
		try {			
			endpointConfiguration = endpointConfigurationService
					.getEndpointConfiguration(connectionInfo.getId().toString());
			if (endpointConfiguration == null) {
				endpointConfiguration = endpointConfigurationService
						.newEndpointConfiguration(connectionInfo.getId().toString());
			}
			addConnectionInfoToConfig(endpointConfiguration, connectionInfo);
			endpointConfigurationService.saveEndpointConfiguration(endpointConfiguration);
			fireConnectionUpdated(connectionInfo);
			log.debug("__DONE__:: Save Config method.");
			return connectionInfo;
		} catch (IOException e) {
			log.error("Error saving connection " + connectionInfo, e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * Delete a connection info. The service is aware of the plug-in name, thus
	 * cannot delete a configuration from another plug-in.
	 */
	@Override
	public void delete(AviConnectionInfo connectionInfo) {
		try {
			endpointConfigurationService.deleteEndpointConfiguration(connectionInfo.getId().toString());
			fireConnectionRemoved(connectionInfo);
		} catch (IOException e) {
			log.error("Error deleting endpoint configuration: " + connectionInfo, e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * This method is used to load the entire configuration set of the plug-in. As a
	 * second step we fire a notification to all subscribers. This method is used
	 * when the plug-in is being loaded (on server startup).
	 */
	@Override
	public void load() {
		log.debug("__INFO__:: In load method...");
		List<AviConnectionInfo> findAll = getAll();
		for (AviConnectionInfo connectionInfo : findAll) {
			fireConnectionUpdated(connectionInfo);
		}
		log.debug("__DONE__:: In load method...");
	}

	/**
	 * Attach a configuration listener which will be called when a connection is
	 * created/updated/deleted
	 */

	@Override
	public void addChangeListener(ConfigurationChangeListener listener) {
		listeners.add(listener);
	}

	/*
	 * A helper method which iterates all event subscribers and fires the update
	 * notification for the provided connection info.
	 */
	private void fireConnectionUpdated(AviConnectionInfo connectionInfo) {
		for (ConfigurationChangeListener li : listeners) {
			li.connectionUpdated(TYPE, connectionInfo.getId());
		}
	}

	/*
	 * A helper method which iterates all event subscribers and fires the delete
	 * notification for the provided connection info.
	 */
	private void fireConnectionRemoved(AviConnectionInfo connectionInfo) {
		for (ConfigurationChangeListener li : listeners) {
			li.connectionRemoved(TYPE, connectionInfo.getId());
		}
	}

	/*
	 * A helper method which converts our domain object the AviConnectionInfo to an
	 * IEndpointConfiguration
	 */
	private void addConnectionInfoToConfig(IEndpointConfiguration config, AviConnectionInfo info) {
		log.debug("__INFO__:: In addConnectionInfoToConfig method...");
		try {
			config.setString(ID, info.getId());
			config.setString(CONTROLLER, info.getController());
			config.setString(USERNAME, info.getUsername());
			config.setString(PASSWORD, ecryptPasswordIfNecessary(info.getPassword()));
			config.setString(TENANT, info.getTenant());
			config.setString(VERSION, info.getVersion());
			log.info("__DONE__:: addConnectionInfoToConfig method.");
		} catch (Exception e) {
			log.error("Error converting AviConnectionInfo to IEndpointConfiguration.", e);
			throw new RuntimeException(e);
		}
	}

	/*
	 * A helper method which converts the IEndpointConfiguration to our domain
	 * object the AviConnectionInfo
	 */
	private AviConnectionInfo getConnectionInfo(IEndpointConfiguration config) {
		log.debug("__INFO__:: In getConnectionInfo method...");
		AviConnectionInfo info = null;
		try {
			if (config == null) {
				log.error("Endpoint config is not found");
			} else {
				info = new AviConnectionInfo(config.getString(ID));
				info.setController(config.getString(CONTROLLER));
				info.setUsername(config.getString(USERNAME));
				info.setPassword(decryptPasswordIfNecessary(config.getString(PASSWORD)));
				info.setTenant(config.getString(TENANT));
				info.setVersion(config.getString(VERSION));
			}
			log.debug("__DONE__:: getConnectionInfo method.");
		} catch (IllegalArgumentException e) {
			log.warn("Cannot convert IEndpointConfiguration to ConnectionInfo: ", e);
		}
		return info;
	}

    /*
     * Method which decrypt the sensitive fields of the configurations.
     */
	private String decryptPasswordIfNecessary(String password) {
		log.debug("__INFO__:: In decryptPasswordIfNecessary method...");
		if (password != null) {
			password = cipherService.decrypt(password);
		}
		log.debug("__DONE__:: Password is successfully decrypted.");
		return password;
	}

    /*
     * Method which encrypt the sensitive fields of the configurations.
     */
	private String ecryptPasswordIfNecessary(String password) {
		log.debug("__INFO__:: In ecryptPasswordIfNecessary method...");
		if (password != null) {
			log.trace("Password {} will be ecrypted.", password);
			password = cipherService.encrypt(password);
		}
		log.debug("__DONE__:: Password is successfully encrypted.");
		return password;
	}
}
