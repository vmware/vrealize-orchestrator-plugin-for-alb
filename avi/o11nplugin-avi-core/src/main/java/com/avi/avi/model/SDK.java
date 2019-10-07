package com.avi.avi.model;

import ch.dunes.vso.sdk.api.IPluginFactory;

import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;


@VsoObject(singleton = true)
public class SDK {
    public static final String TYPE = "SDK";
    
    public SDK() {
    }
    
    public static SDK createScriptingSingleton(IPluginFactory factory) {
        return ((AbstractSpringPluginFactory) factory).createScriptingObject(SDK.class);
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
    public Object createObject(String objectType) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    	String location = "com.avi.avi.model."+objectType;
    	Class<?> cls = Class.forName(location);
    	Object obj = cls.newInstance();
    	return obj;
    }
}
