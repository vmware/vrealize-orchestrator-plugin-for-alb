package com.vmware.avi.vro.configuration;

/**
 * An extension point of the configuration service. Serves the role of an
 * Observer when a certain connection is created, modified or deleted.
 * 
 */
public interface ConfigurationChangeListener {

	/**
	 * Invoked when a connection is updated or created
	 */
	void connectionUpdated(String type, String id);

	/**
	 * Invoked when the ConnectionInfo input is deleted
	 */
	void connectionRemoved(String type, String id);

}
