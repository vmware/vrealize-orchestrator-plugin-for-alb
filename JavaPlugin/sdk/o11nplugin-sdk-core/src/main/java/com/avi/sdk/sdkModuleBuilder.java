package com.avi.sdk;

import com.vmware.o11n.plugin.sdk.module.ModuleBuilder;
import com.avi.sdk.model.sdkGreeter;

public final class sdkModuleBuilder extends ModuleBuilder {

    private static final String DESCRIPTION = "avisdk plug-in for vRealize Orchestrator";

    private static final String DATASOURCE = "main-datasource";

    @Override
    public void configure() {
        module("sdk").withDescription(DESCRIPTION).withImage("images/default-16x16.png")
                .basePackages(sdkModuleBuilder.class.getPackage().getName()).version(
                "${project.version}");

        installation(InstallationMode.BUILD).action(ActionType.INSTALL_PACKAGE,
                "packages/${project.artifactId}-package-${project.version}.package");

        finderDatasource(sdkPluginAdaptor.class, DATASOURCE).anonymousLogin(LoginMode.INTERNAL);
    }
}
