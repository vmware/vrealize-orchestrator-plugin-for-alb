package com.vmware.avi.vro;

import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.vmware.avi.sdk.AviApi;
import com.vmware.avi.sdk.AviCredentials;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;

import ch.dunes.vso.sdk.api.IPluginFactory;

@VsoObject(singleton = true, create = false)
@VsoFinder(name = Constants.FINDER_VRO_PLUGIN)
public class VroPlugin {
	public static final String TYPE = "Vro";

	@Autowired
	private AviVroClient service;

	public static VroPlugin createScriptingSingleton(IPluginFactory factory) {
		return ((AbstractSpringPluginFactory) factory).createScriptingObject(VroPlugin.class);
	}

	/***
	 * Method will create AVI API session.
	 * 
	 * @param controller controller IP.
	 * @param username   username of the controller.
	 * @param password   password of the controller.
	 * @param tenant     tenant name.
	 * @param version    version.
	 * @return instance of AviVroClient
	 */
	@VsoMethod
	public AviVroClient connect(String controller, String username, String password, String tenant, String version) {
		AviCredentials creds = new AviCredentials(controller, username, password);
		creds.setTenant(tenant);
		creds.setVersion(version);
		service.setCred(creds);
		return service;
	}

	/***
	 * Method will create AVI API session.
	 * 
	 * @param controller controller IP.
	 * @token token for authentication.
	 * @param tenant  tenant name.
	 * @param version version.
	 * @return instance of AviVroClient
	 */
	@VsoMethod
	public AviVroClient connect(String controller, String token, String tenant, String version) {
		AviCredentials creds = new AviCredentials();
		creds.setController(controller);
		creds.setToken(token);
		creds.setTenant(tenant);
		creds.setVersion(version);
		service.setCred(creds);
		return service;
	}

	/***
	 * Method will create AVI API session.
	 * 
	 * @param controller controller IP.
	 * @param username   username of the controller
	 * @param password   password of the controller
	 * @param tenant     tenant name
	 * @param version    version
	 * @return instance of AviVroClient
	 */
	@VsoMethod
	public void addVroClient(String controller, String username, String password, String tenant, String version,
			String token) {
		AviCredentials aviCredentials = new AviCredentials();
		aviCredentials.setController(controller);
		aviCredentials.setUsername(username);
		aviCredentials.setPassword(password);
		aviCredentials.setToken(token);
		aviCredentials.setTenant(tenant);
		aviCredentials.setVersion(version);
		AviVroClient aviVroClient = new AviVroClient();
		aviVroClient.setCred(aviCredentials);
		VroPluginFactory.aviVroClientMap.put(controller, aviVroClient);

	}

	/****
	 * This method add controller into the Plugin.
	 * 
	 * @param controller controller IP.
	 * @param username   username of the controller
	 * @param password   password of the controller
	 * @param tenant     tenant name
	 * @param version    version
	 */
	@VsoMethod
	@Deprecated
	public void addVroClient(String controller, String username, String password, String tenant, String version) {
		AviCredentials aviCredentials = new AviCredentials(controller, username, password);
		aviCredentials.setTenant(tenant);
		aviCredentials.setVersion(version);
		AviVroClient aviVroClient = new AviVroClient();
		aviVroClient.setCred(aviCredentials);
		VroPluginFactory.aviVroClientMap.put(controller, aviVroClient);
	}

	/**
	 * This method remove controller from the Plugin
	 * 
	 * @param controller controller IP.
	 */
	@VsoMethod
	public void removeVroClient(String controller) {
		Map<String, AviVroClient> aviVroClientsMap = VroPluginFactory.getListOfAviVroClientMap();
		if (aviVroClientsMap.containsKey(controller)) {
			aviVroClientsMap.remove(controller);
		}
	}
}
