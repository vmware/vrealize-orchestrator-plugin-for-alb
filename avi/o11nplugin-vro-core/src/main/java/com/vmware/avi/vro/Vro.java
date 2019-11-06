package com.vmware.avi.vro;

import ch.dunes.vso.sdk.api.IPluginFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;

@VsoObject(singleton = true)
public class Vro {
    public static final String TYPE = "Vro";
    
    private static Map<String, String> objMapping = new HashMap<String, String>();
    
    @Autowired
    private AviSession service;
    
    static {
    	objMapping.put("pool", "Pool");
    	objMapping.put("virtualservice", "VirtualService");
    }
    public static Vro createScriptingSingleton(IPluginFactory factory) {
        return ((AbstractSpringPluginFactory) factory).createScriptingObject(Vro.class);
    }

    @VsoMethod
    public String createSerialize(String controllerIP,String username,String  password, String objectType, String data) throws IOException {
    	return service.createObject(controllerIP, username, password, objectType, data);
    }
    
    @VsoMethod
    public Object createObject(String objectType) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    	String location = "com.vmware.avi.vro.model."+objMapping.get(objectType);
    	Class<?> cls = Class.forName(location);
    	Object obj = cls.newInstance();
    	return obj;
    }
}
