package com.vmware.avi.vro;

import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.vmware.avi.sdk.AviApi;
import com.vmware.avi.sdk.AviApiException;
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
	 * @param username   username of the controller
	 * @param password   password of the controller
	 * @param tenant     tenant name
	 * @param version    version
	 * @return instance of AviVroClient
	 * @throws Exception
	 */
	@VsoMethod
	public void addVroClient(String controller, String username, String password, String tenant, String version,
			String token) throws Exception {
		try {
			AviCredentials aviCredentials = new AviCredentials();
			aviCredentials.setController(controller);
			aviCredentials.setUsername(username);
			aviCredentials.setPassword(password);
			aviCredentials.setToken(token);
			aviCredentials.setTenant(tenant);
			aviCredentials.setVersion(version);
			AviVroClient aviVroClient = new AviVroClient();
			aviVroClient.setCred(aviCredentials);
			aviVroClient.get("tenant", null, tenant);
			String addedController = controller +"-"+ tenant;
			if (!VroPluginFactory.aviVroClientMap.containsKey(addedController)) {
				VroPluginFactory.aviVroClientMap.put(controller+ "-" + tenant, aviVroClient);
			}else {
				throw new AviApiException("Controller with this tenant is already Exists.");
			}
		}catch (Exception e) {
			throw new AviApiException(e.getMessage());
		}
	}

	/****
	 * This method add controller into the Plugin.
	 * 
	 * @param controller controller IP.
	 * @param username   username of the controller
	 * @param password   password of the controller
	 * @param tenant     tenant name
	 * @param version    version
	 * @throws Exception
	 */
	@VsoMethod
	@Deprecated
	public void addVroClient(String controller, String username, String password, String tenant, String version) throws Exception {
		try {
			AviCredentials aviCredentials = new AviCredentials(controller, username, password);
			aviCredentials.setTenant(tenant);
			aviCredentials.setVersion(version);
			AviVroClient aviVroClient = new AviVroClient();
			aviVroClient.setCred(aviCredentials);
			aviVroClient.get("tenant", null, tenant);
			String addedController = controller +"-"+ tenant;
			if (!VroPluginFactory.aviVroClientMap.containsKey(addedController)) {
				VroPluginFactory.aviVroClientMap.put(controller+ "-" + tenant, aviVroClient);
			}else {
				throw new AviApiException("Controller with this tenant is already Exists.");
			}
		}catch (Exception e) {
			throw new AviApiException(e.getMessage());
		}
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
