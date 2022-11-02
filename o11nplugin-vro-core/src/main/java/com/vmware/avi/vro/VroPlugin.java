package com.vmware.avi.vro;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.vmware.avi.sdk.AviApiException;
import com.vmware.avi.vro.configuration.ConfigurationService;
import com.vmware.avi.vro.model.AviConnectionInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;
import com.vmware.o11n.plugin.sdk.spring.platform.GlobalPluginNotificationHandler;

import ch.dunes.vso.sdk.api.IPluginFactory;

@VsoObject(singleton = true, name = "VroPlugin")
@VsoFinder(name = "VroPlugin")
@Scope(value = "prototype")
public class VroPlugin {
	public static final String TYPE = "Vro";

	private static final Logger log = LoggerFactory.getLogger(VroPlugin.class);

	public static VroPlugin createScriptingSingleton(IPluginFactory factory) {
		return ((AbstractSpringPluginFactory) factory).createScriptingObject(VroPlugin.class);
	}

	@Autowired
	private ConfigurationService configurationService;

	@Autowired
	private GlobalPluginNotificationHandler notificationHandler;

	/***
	 * Method will create AVI endpoints
	 *
	 * @param controller controller IP.
	 * @param username   username of the controller
	 * @param password   password of the controller
	 * @param tenant     tenant name
	 * @param version    version
	 * @return instance of AviVroClient
	 * @throws Exception
	 */
	@VsoMethod
	public String addVroClient(String controller, String username, String password, String tenant, String version,
			String token) throws Exception {
		String ctl = null;
		try {
			log.debug("__INIT__:: Inside addVroClient ");
			AviConnectionInfo aviConnectionInfo = new AviConnectionInfo();
			aviConnectionInfo.setController(controller);
			aviConnectionInfo.setUsername(username);
			aviConnectionInfo.setPassword(password);
			aviConnectionInfo.setTenant(tenant);
			aviConnectionInfo.setVersion(version);
			aviConnectionInfo.setToken(token);
			String addedController = controller + "-" + tenant;
			aviConnectionInfo.setId(addedController);

			ctl = this.saveAviConnectionEndpoint(addedController, aviConnectionInfo);
			log.debug("__DONE__:: Inside addVroClient ");
		} catch (Exception e) {
			log.error("__ERROR__:: Inside addVroClient Catch: " + e.getMessage());
			throw new Exception(e);
		}
		return ctl;
	}

	/**
	 * Method to store the all AVI endpoint
	 *
	 * @throws Exception
	 * @throws IOException
	 */
	public String saveAviConnectionEndpoint(String id, AviConnectionInfo aviConnectionInfo) throws Exception {
		AviConnectionInfo info = null;
		log.debug("__INIT__:: Inside storeAviConnections to store new connection by id: " + id);
		try {
			info = this.getVroClientById(id);
			if (info != null) {
				throw new Exception("Controller with the same IP is already exists: "+ id);
			}else {
				log.debug("__DEBUG__:: Adding new Avi connection to the endpoint. ");
				info = configurationService.save(aviConnectionInfo);
				notificationHandler.notifyElementsInvalidate();
			}
		} catch (Exception e) {
			log.error("__ERROR__:: Inside storeAviConnections Catch: ");
			throw new Exception(e.getMessage());
		}
		log.debug("__DONE__:: Added new Avi connection to the endpoint. ");
		return info.getController();
	}

	/**
	 * Method get all added AVI vro clients
	 *
	 * @return
	 * @throws Exception
	 */
	@VsoMethod
	public List<AviConnectionInfo> getAllAviClients() throws Exception {
		try {
			return configurationService.getAll();
		} catch (Exception e) {
			throw new AviApiException(e.getMessage());
		}
	}

	/**
	 * Method get added AVI vro clients by id
	 *
	 * @return
	 * @throws Exception
	 */
	private AviConnectionInfo getVroClientById(String id) throws Exception {
		try {
			return configurationService.findById(id);
		} catch (Exception e) {
			throw new AviApiException(e.getMessage());
		}
	}

	@VsoMethod(description = "Loads the configuration of all brokers.")
	public void loadConfiguration() {
		configurationService.load();
		notificationHandler.notifyElementsInvalidate();
	}

	/**
	 * Method remove added AVI vro clients
	 *
	 * @return
	 * @throws Exception
	 */
	@VsoMethod
	public void removeVroClient(String controller) throws Exception {
		log.debug("__INIT__:: Inside removeAviClient to remove connection by id: " + controller);
		try {
			AviConnectionInfo info = configurationService.findById(controller);
			log.debug("__DEBUG__:: Fetch avi connection from added endpoints: " + info);
			configurationService.delete(info);
			log.debug("__DONE__:: Succefully removed Avi connection from the endpoint.");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
