package com.vmware.avi.vro;

import com.vmware.o11n.plugin.sdk.module.ModuleBuilder;

/**
 * This class contains all the configuration stuff. Auto-generated class stub
 * 
 *
 */
public final class VroModuleBuilder extends ModuleBuilder {

	private static final String DESCRIPTION = "vro plug-in for vRealize Orchestrator";

	private static final String DATASOURCE = "main-datasource";

	@Override
	public void configure() {
		module(Constants.FINDER_VRO_PLUGIN_NAME).displayName(Constants.FINDER_VRO_PLUGIN_NAME)
				.inventory(VroPluginAdaptor.REL_ROOTS).withDescription(DESCRIPTION).withImage("images/a.png")
				.basePackages(VroModuleBuilder.class.getPackage().getName()).version("${project.version}");

		installation(InstallationMode.VERSION).action(ActionType.INSTALL_PACKAGE,
				"packages/${project.artifactId}-package-${project.version}.package");

		finderDatasource(VroPluginAdaptor.class, DATASOURCE).anonymousLogin(LoginMode.INTERNAL);

		finder(VroPluginAdaptor.REL_ROOTS, DATASOURCE).addRelation(Constants.FINDER_VRO_CLIENT);

		finder(Constants.FINDER_VRO_CLIENT, DATASOURCE).addRelation(Constants.FINDER_VRO_VIRTUALSERVICE)
				.image("images/c.png");

		finder(Constants.FINDER_VRO_VIRTUALSERVICE, DATASOURCE).addRelation(Constants.FINDER_VRO_POOL)
				.image("images/v.png");

		// finder(Constants.FINDER_VRO_POOL, DATASOURCE).image("images/p.png");
		finder(Constants.FINDER_VRO_POOL, DATASOURCE).addRelation(Constants.FINDER_VRO_HEALTHMONITOR)
				.image("images/p_16*16.png");
		finder(Constants.FINDER_VRO_HEALTHMONITOR, DATASOURCE).image("images/h.png");
	}
}
