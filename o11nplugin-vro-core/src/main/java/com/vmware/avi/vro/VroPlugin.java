package com.vmware.avi.vro;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

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

	@VsoMethod
	public AviVroClient connect(String controller, String username, String password, String tenant, String version) {
		AviCredentials creds = new AviCredentials(controller, username, password);
		creds.setTenant(tenant);
		creds.setVersion(version);
		service.setCred(creds);
		return service;
	}
	@VsoMethod
	public void addVroClient(String controller, String username, String password, String tenant, String version) {

		AviCredentials aviCredentials = new AviCredentials(controller, username, password);
		aviCredentials.setTenant(tenant);
		aviCredentials.setVersion(version);
		AviVroClient aviVroClient = new AviVroClient();
		aviVroClient.setCred(aviCredentials);
		// List<AviVroClient> listOfAviVroClients = VroPluginFactory.listOfAviVroClient;
		// VroPluginFactory.listOfAviVroClient.add(aviVroClient);
		
		VroPluginFactory.aviVroClientMap.put(controller, aviVroClient);
	}

	@VsoMethod
	public void removeVroClient(String controller) {
		Map<String, AviVroClient> aviVroClientsMap = VroPluginFactory.getListOfAviVroClientMap();
		if (aviVroClientsMap.containsKey(controller)) {
			aviVroClientsMap.remove(controller);
		}
	}
}
