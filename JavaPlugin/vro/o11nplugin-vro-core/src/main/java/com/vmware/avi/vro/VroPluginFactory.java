package com.vmware.avi.vro;


import java.util.List;


import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;
import com.vmware.o11n.plugin.sdk.spring.InventoryRef;
import com.vmware.o11n.plugin.sdk.spring.PluginFactoryLifecycleAware;

import ch.dunes.vso.sdk.api.QueryResult;


public final class VroPluginFactory extends AbstractSpringPluginFactory implements PluginFactoryLifecycleAware {
	
    @Override
    public Object find(InventoryRef ref) {
    	if (ref.isOfType(Constants.FINDER_AVI_VRO_CLIENT)) {
    		AviVroClient aviVroClient = new AviVroClient();
    		return aviVroClient;
    	}else if (ref.isOfType(Constants.FINDER_VRO_PLUGIN)) {
    		Vro vro = new Vro();
    		return vro;
    	}else {
    		throw new UnsupportedOperationException("implement me");
    	}
    }
    
    @Override
    public QueryResult findAll(String type, String query) {
        throw new UnsupportedOperationException("implement me");
    }

    @Override
    public List<?> findChildrenInRootRelation(String type, String relationName) {
        throw new UnsupportedOperationException("implement me");
    }

    @Override
    public List<?> findChildrenInRelation(InventoryRef parent, String relationName) {
        throw new UnsupportedOperationException("implement me");
    }

	@Override
	public void beforeFactoryUninstall() {
		// TODO Auto-generated method stub
		
	}
}