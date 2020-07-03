package com.vmware.avi.vro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginAdaptor;

/**
 * This class instantiate the Application context.
 * 
 * @author tushar
 *
 */
public final class VroPluginAdaptor extends AbstractSpringPluginAdaptor {

	private static final String DEFAULT_CONFIG = "com/vmware/avi/vro/pluginConfig.xml";

	static final String ROOT = "Endpoint";
	static final String REL_ROOTS = "roots";

	@Override
	protected ApplicationContext createApplicationContext(ApplicationContext defaultParent) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { DEFAULT_CONFIG }, false, defaultParent);
		applicationContext.setClassLoader(getClass().getClassLoader());
		applicationContext.refresh();
		VroPluginFactory.initializeModelMap();
		return applicationContext;
	}
}