package com.vmware.avi.vro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginAdaptor;


public final class VroPluginAdaptor extends  AbstractSpringPluginAdaptor{

        private static final String DEFAULT_CONFIG = "com/vmware/avi/vro/pluginConfig.xml";
    
    public static final String PLUGIN_NAME = "vro";
    
    static final String ROOT = "${rootElement}Finder";
    static final String REL_ROOTS = "roots";
    
    @Override
    protected ApplicationContext createApplicationContext(ApplicationContext defaultParent) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                new String[] { DEFAULT_CONFIG }, false, defaultParent);
        applicationContext.setClassLoader(getClass().getClassLoader());
        applicationContext.refresh();
    
        return applicationContext;
    }
}