package com.avi.sdk.model;

import org.springframework.beans.factory.annotation.Autowired;

import ch.dunes.vso.sdk.api.IPluginFactory;

import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;

@VsoObject(singleton = true)
public class sdkGreeter {
    public static final String TYPE = "sdkGreeter";
    
    @Autowired
    private sdkGreetingService service;


    public sdkGreeter() {
    }

    public static sdkGreeter createScriptingSingleton(IPluginFactory factory) {
        return ((AbstractSpringPluginFactory) factory).createScriptingObject(sdkGreeter.class);
    }

    @VsoMethod
    public String greet(String name) {
        return service.greet(name);
    }
}
