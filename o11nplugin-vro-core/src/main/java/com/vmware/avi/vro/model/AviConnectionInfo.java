package com.vmware.avi.vro.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.vmware.avi.vro.Constants;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;

 /**
 * Object to store all the AVI connection details for vRO endpoints.
 *
 */
@VsoObject(create = false, name = "AviConnectionInfo")
@VsoFinder(name = Constants.FINDER_VRO_CLIENT_INFO)
@Service
public class AviConnectionInfo {
	
	private static final Logger log = LoggerFactory.getLogger(AviConnectionInfo.class);

	private boolean isValid;
	private String id;
	private String controller;
	private String username;
	private String password;
	private String tenant;
	private String version;
	private String token;
	private String sessionID;
	private String configurationId;

	public AviConnectionInfo(String id) {
		super();
		this.id = id;
	}
	
	public AviConnectionInfo() {
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(String configurationId) {
		this.configurationId = configurationId;
	}

	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getVersion() {
		return version;
	}

	public boolean isValid() {
		return this.isValid;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public String getDisplayName() {
		return getController() + "-" + getTenant();
	}
	
	/**
	 * Updates this connection with the provided info. This operation will destroy
	 * the existing third party client, causing all associated operations to fail.
	 */
	public synchronized void update(AviConnectionInfo connectionInfo) {
		if (this.getController() != null && !connectionInfo.getId().equals(this.getId())) {
			throw new IllegalArgumentException("Cannot update using different id");
		}
		destroy();
	}

	public synchronized void destroy() {
		// Destroy the third party client
	}

	@Override
	public String toString() {
		return "AviConnectionInfo [id=" + id + ", controller=" + controller + ", username=" + username
				+ ", password=" + password + ", tenant=" + tenant + ", version=" + version + ", sessionID=" + sessionID
				+ "]";
	}
}