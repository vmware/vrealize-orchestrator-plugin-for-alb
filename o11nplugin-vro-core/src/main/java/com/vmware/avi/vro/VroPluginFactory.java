package com.vmware.avi.vro;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.avi.vro.model.AviRestResource;
import com.vmware.avi.vro.model.Pool;
import com.vmware.avi.vro.model.VirtualService;
import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;
import com.vmware.o11n.plugin.sdk.spring.InventoryRef;

import ch.dunes.vso.sdk.api.QueryResult;

/**
 * 
 * @author tushar
 *
 */
public class VroPluginFactory extends AbstractSpringPluginFactory {
	private static final Logger logger = LoggerFactory.getLogger(VroPluginFactory.class);
	public static Map<String, AviVroClient> aviVroClientMap = new HashMap<String, AviVroClient>();
	public static Map<String, String> modelMap = new HashMap<String, String>();

	/***
	 * This method initialize modelMap.
	 * 
	 * @throws ClassNotFoundException
	 */
	public static void initializeModelMap() {
		VroPluginFactory.fetchClassNames("com.vmware.avi.vro.model");
		VroPluginFactory.modelMap.put("PLUGIN", "Vro");
		VroPluginFactory.modelMap.put("CLIENT", "AviVroClient");
		VroPluginFactory.modelMap.put("PLUGIN_NAME", "Avi");
	}

	@Override
	public Object find(InventoryRef ref) {
		String object = ref.getType();
		System.out.println("objectType : " + object + "\n ID : " + ref.getId());
		System.out.println("Attached Controllers : " + aviVroClientMap.values());
		switch (object) {
		case "VirtualService":
			VirtualService virtualService = null;
			String uuid = getUUID(ref.getId());
			for (AviVroClient aviVroClient : aviVroClientMap.values()) {
				System.out.println("Controller : " + aviVroClient.getCred().getController());
				try {
					virtualService = (VirtualService) aviVroClient.getObjectByUUID(ref.getType().toLowerCase(), uuid);
					if (virtualService.getUuid() != null) {
						System.out.println("Returning vs : " + virtualService);
						return virtualService;
					}
				} catch (Exception e) {
					logger.error(e.getMessage());
				}
			}
			return new VirtualService();
		case "Pool":
			Pool pool = null;
			String uuid1 = getUUID(ref.getId());
			for (AviVroClient aviVroClient : aviVroClientMap.values()) {
				try {
					pool = (Pool) aviVroClient.getObjectByUUID(ref.getType().toLowerCase(), uuid1);
					if (pool.getUuid() != null) {
						System.out.println("Returning Pool : " + pool);
						return pool;
					}
				} catch (Exception e) {
					logger.error(e.getMessage());
				}
			}
			return new Pool();
		case "AviVroClient":
			String controllerIp = ref.getId();
			System.out.println("controllerIp : " + controllerIp);
			AviVroClient vroClient = VroPluginFactory.aviVroClientMap.get(controllerIp);
			System.out.println("vroClient : " + vroClient);
			return vroClient;
		default:
			String location = "com.vmware.avi.vro.model." + ref.getType();
			System.out.println(location);
			Class<?> cls;
			Object obj = null;
			try {
				cls = Class.forName(location);
				obj = cls.newInstance();
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				logger.debug("Exception : " + e.getMessage());
				throw new UnsupportedOperationException("Error in find..");
			}
			return obj;
		}
	}

	/***
	 * This method will return UUID of the Object from the Inventory ID.
	 * 
	 * @param objectID
	 * @return uuid
	 */
	public String getUUID(String objectID) {
		System.out.println("objectID : " + objectID);
		String uuid = objectID.substring(objectID.indexOf("(") + 1, objectID.length() - 1);
		System.out.println("uuid : " + uuid);
		return uuid;
	}

	@Override
	public QueryResult findAll(String type, String query) {
		return new QueryResult(getListOfAviVroClientList());
	}

	@Override
	public List<?> findChildrenInRootRelation(String type, String relationName) {
		return getListOfAviVroClientList();
	}

	@Override
	public synchronized List<?> findChildrenInRelation(InventoryRef parent, String relationName) {
		List<AviRestResource> aviRestResources = null;
		if (relationName.equals("VirtualService")) {
			try {
				AviVroClient client = VroPluginFactory.aviVroClientMap.get(parent.getId());
				if (client != null) {
					aviRestResources = client.getObject("virtualservice", null);
				}
			} catch (Exception e) {
				logger.debug("Exception : " + e.getMessage());
			}
			return aviRestResources;
		} else if (relationName.equals("Pool")) {
			try {
				HashMap<String, String> param = new HashMap<String, String>();
				String parentId = parent.getId();
				String uuid = parentId.substring(parentId.indexOf("(") + 1, (parentId.indexOf("::")));
				String controller = parentId.substring(parentId.indexOf("::") + 2, (parentId.length() - 1));
				if ((controller != null) && (uuid != null)) {
					AviVroClient client = VroPluginFactory.aviVroClientMap.get(controller);
					String referred_by = "virtualservice:" + uuid;
					param.put("referred_by", referred_by);
					aviRestResources = client.getObject("pool", param);
				}
			} catch (Exception e) {
				logger.debug("Exception : " + e.getMessage());
			}
			return aviRestResources;
		} else {
			try {
				HashMap<String, String> param = new HashMap<String, String>();
				String parentId = parent.getId();
				String uuid = parentId.substring(parentId.indexOf("(") + 1, (parentId.indexOf("::")));
				String controller = parentId.substring(parentId.indexOf("::") + 2, (parentId.length() - 1));
				if ((controller != null) && (uuid != null)) {
					AviVroClient client = VroPluginFactory.aviVroClientMap.get(controller);
					String referred_by = "pool:" + uuid;
					param.put("referred_by", referred_by);
					aviRestResources = client.getObject("healthmonitor", param);
				}
			} catch (Exception e) {
				logger.debug("Exception : " + e.getMessage());
			}
			return aviRestResources;
		}
	}

	public static List<AviVroClient> getListOfAviVroClientList() {
		List<AviVroClient> listOfAviVroClient = new ArrayList<AviVroClient>(aviVroClientMap.values());
		return listOfAviVroClient;
	}

	/**
	 * This method return modelMap.
	 * 
	 * @return modelMap
	 */
	public static Map<String, String> getModelMap() {
		return modelMap;
	}

	/**
	 * This method return aviVroClientMap.
	 * 
	 * @return aviVroClientMap
	 */
	public static Map<String, AviVroClient> getListOfAviVroClientMap() {
		return aviVroClientMap;
	}

	/**
	 * This method will add Class names from the package into the modelMap.
	 * 
	 * @param packageName fully qualified package name
	 * @throws ClassNotFoundException
	 */
	public static void fetchClassNames(String packageName) {
		ConfigurationBuilder configurationBuilder = new ConfigurationBuilder().setScanners(new SubTypesScanner(false),
				new ResourcesScanner());
		configurationBuilder.setUrls(ClasspathHelper.forPackage(packageName))
				.filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix(packageName)));
		Reflections reflection = new Reflections(configurationBuilder);
		Set<Class<?>> classes = reflection.getSubTypesOf(Object.class);
		for (Class c : classes) {
			VroPluginFactory.modelMap.put(c.getSimpleName().toUpperCase(), c.getSimpleName());
		}

	}
}