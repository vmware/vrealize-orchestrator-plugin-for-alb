package com.avi.sdk;

import com.vmware.o11n.plugin.sdk.module.ModuleBuilder;
import com.avi.sdk.model.Avi;

public final class AviModuleBuilder extends ModuleBuilder {

    private static final String DESCRIPTION = "sdk plug-in for vRealize Orchestrator";

    private static final String DATASOURCE = "main-datasource";

    @Override
    public void configure() {
        module("sdk").withDescription(DESCRIPTION).withImage("images/default-16x16.png")
                .basePackages(AviModuleBuilder.class.getPackage().getName()).version(
                "${project.version}");

        installation(InstallationMode.BUILD).action(ActionType.INSTALL_PACKAGE,
                "packages/${project.artifactId}-package-${project.version}.package");

        finderDatasource(AviPluginAdaptor.class, DATASOURCE).anonymousLogin(LoginMode.INTERNAL);
    }
}
