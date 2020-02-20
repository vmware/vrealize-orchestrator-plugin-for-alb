package com.vmware.avi.vro;

import ch.dunes.vso.sdk.api.IPluginFactory;

import com.vmware.avi.vro.Constants;
import org.springframework.beans.factory.annotation.Autowired;

import com.vmware.avi.sdk.AviCredentials;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;

@VsoObject(singleton = true, create = false)
@VsoFinder(name = Constants.FINDER_VRO_PLUGIN)
public class Vro {
	public static final String TYPE = "Vro";

	@Autowired
	private AviVroClient service;

	public static Vro createScriptingSingleton(IPluginFactory factory) {
		return ((AbstractSpringPluginFactory) factory).createScriptingObject(Vro.class);
	}
	
	@VsoMethod
	public AviVroClient connect(String controller, String username, String password, String tenant, String version) {
		AviCredentials creds = new AviCredentials(controller, username, password);
		creds.setTenant(tenant);
		creds.setVersion(version);
		service.setCred(creds);
		return service;
	}

}
