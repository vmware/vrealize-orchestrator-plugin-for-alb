package com.vmware.avi.vro.configuration;

import java.util.List;

import com.vmware.avi.vro.model.AviConnectionInfo;

/**
 * 
 * @author mayur
 *
 */
public interface ConfigurationService {
	
	/**
	 * Stores a connection info or updates it if already available. The
	 * persister checks the availability of a connection by its ID
	 */
	public AviConnectionInfo save(AviConnectionInfo info);
	
	/**
	 * Deletes a connection info. The persister will use the ID of the
	 * connection
	 */
	public void delete(AviConnectionInfo info);
	
	/**
	 * Returns a collection by its ID or null if not found
	 */
	public AviConnectionInfo findById(String id);
	
	/**
	 * Returns a collection of all stored configurations (resources under a
	 * folder with the plug-in name)
	 */
	List<AviConnectionInfo> getAll();
	
	/**
	 * Forces the persister to read all the configurations and trigger the
	 * events. This method is invoked when the plug-in is loaded on server
	 * start-up.
	 */
	public void load();
	
	/**
	 * Allows us to subscribe to the events of the persister. For example, if a
	 * connection is deleted, the persister will trigger an event, notifying all
	 * subscribers. This is an implementation of the observer pattern.
	 */
	void addChangeListener(ConfigurationChangeListener configurationChangeListener);

}
