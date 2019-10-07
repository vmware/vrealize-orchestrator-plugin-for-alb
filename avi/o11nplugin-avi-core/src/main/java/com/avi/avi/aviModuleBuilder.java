package com.avi.avi;

import com.vmware.o11n.plugin.sdk.module.ModuleBuilder;
import com.avi.avi.model.SDK;

public final class aviModuleBuilder extends ModuleBuilder {

    private static final String DESCRIPTION = "avi plug-in for vRealize Orchestrator";

    private static final String DATASOURCE = "main-datasource";

    @Override
    public void configure() {
        module("avi").withDescription(DESCRIPTION).withImage("images/default-16x16.png")
                .basePackages(aviModuleBuilder.class.getPackage().getName()).version(
                "${project.version}");

        installation(InstallationMode.BUILD).action(ActionType.INSTALL_PACKAGE,
                "packages/${project.artifactId}-package-${project.version}.package");

        finderDatasource(aviPluginAdaptor.class, DATASOURCE).anonymousLogin(LoginMode.INTERNAL);
    }
}
