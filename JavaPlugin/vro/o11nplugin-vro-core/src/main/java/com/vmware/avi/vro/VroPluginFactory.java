package com.vmware.avi.vro;

import java.util.List;

import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;
import com.vmware.o11n.plugin.sdk.spring.InventoryRef;

import ch.dunes.vso.sdk.api.QueryResult;

public final class VroPluginFactory extends AbstractSpringPluginFactory {

	@Override
	public Object find(InventoryRef ref) {
		if (ref.isOfType(Constants.FINDER_AVI_VRO_CLIENT)) {
			return new AviVroClient();
		} else if (ref.isOfType(Constants.FINDER_VRO_PLUGIN)) {
			return new VroPulgin();
		} else {
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
}