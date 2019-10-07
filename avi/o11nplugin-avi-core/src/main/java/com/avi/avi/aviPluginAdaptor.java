package com.avi.avi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginAdaptor;


public final class aviPluginAdaptor extends  AbstractSpringPluginAdaptor{

        private static final String DEFAULT_CONFIG = "com/avi/avi/pluginConfig.xml";
    
    public static final String PLUGIN_NAME = "avi";
    
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