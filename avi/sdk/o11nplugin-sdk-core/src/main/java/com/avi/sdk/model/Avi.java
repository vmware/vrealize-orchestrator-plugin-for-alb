package com.avi.sdk.model;

import ch.dunes.vso.sdk.api.IPluginFactory;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;

@VsoObject(singleton = true)
public class Avi {
    public static final String TYPE = "SDK";

    @Autowired
    private AviSession service;
    
    public Avi() {
    }

    public static Avi createScriptingSingleton(IPluginFactory factory) {
        return ((AbstractSpringPluginFactory) factory).createScriptingObject(Avi.class);
    }

    @VsoMethod
    public Pool makePoolObject() {
    	Pool p1 = new Pool();
    	return p1;
    }
        
    @VsoMethod
    public VirtualService makeVSObject() {
    	VirtualService vs1 = new VirtualService();
    	return vs1;
    }
    
    @VsoMethod
    public String createSerialize(String controllerIP,String username,String  password, String objectType, String data) throws IOException {
    	return service.createObject(controllerIP, username, password, objectType, data);
    }
    
    @VsoMethod
    public Object createObject(String objectType) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    	String location = "com.avi.sdk.model."+objectType;
    	Class<?> cls = Class.forName(location);
    	Object obj = cls.newInstance();
    	return obj;
    }
}
