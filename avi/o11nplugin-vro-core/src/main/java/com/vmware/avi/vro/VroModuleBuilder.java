package com.vmware.avi.vro;

import com.vmware.o11n.plugin.sdk.module.ModuleBuilder;
import com.vmware.avi.vro.Vro;

public final class VroModuleBuilder extends ModuleBuilder {

    private static final String DESCRIPTION = "vro plug-in for vRealize Orchestrator";

    private static final String DATASOURCE = "main-datasource";

    @Override
    public void configure() {
        module("avi").withDescription(DESCRIPTION).withImage("images/default-16x16.png")
                .basePackages(VroModuleBuilder.class.getPackage().getName()).version(
                "${project.version}");

        installation(InstallationMode.BUILD).action(ActionType.INSTALL_PACKAGE,
                "packages/${project.artifactId}-package-${project.version}.package");

        finderDatasource(VroPluginAdaptor.class, DATASOURCE).anonymousLogin(LoginMode.INTERNAL);
    }
}
