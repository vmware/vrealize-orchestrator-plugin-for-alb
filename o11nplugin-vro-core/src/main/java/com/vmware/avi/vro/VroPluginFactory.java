package com.vmware.avi.vro;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.SSLContext;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.vmware.avi.sdk.AviCredentials;
import com.vmware.avi.vro.configuration.ConfigurationService;
import com.vmware.avi.vro.model.AviConnectionInfo;
import com.vmware.avi.vro.model.AviRestResource;
import com.vmware.avi.vro.model.HealthMonitor;
import com.vmware.avi.vro.model.Pool;
import com.vmware.avi.vro.model.VirtualService;
import com.vmware.avi.vro.model.VsVip;
import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;
import com.vmware.o11n.plugin.sdk.spring.InventoryRef;

import ch.dunes.vso.sdk.IServiceRegistry;
import ch.dunes.vso.sdk.api.QueryResult;
import ch.dunes.vso.sdk.context.IContext;
import ch.dunes.vso.sdk.ssl.ISslService;

/**
 * 
 * @author tushar
 *
 */
public class VroPluginFactory extends AbstractSpringPluginFactory {

	private static final Logger logger = LoggerFactory.getLogger(VroPluginFactory.class);
	public static Map<String, String> modelMap = new HashMap<String, String>();

	public Map<String, AviVroClient> aviVroClientMap = new HashMap<String, AviVroClient>();


	@Autowired
	private IServiceRegistry serviceRegistry;

	@Autowired
	private ConfigurationService configurationService;

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
		logger.debug("__INIT__ find > type: " + ref.getType() + ", id: " + ref.getId());
		logger.debug("__DEBUG__:: Inside find aviVroClientMap -> " + aviVroClientMap.toString());
		if (ref.isOfType(Constants.FINDER_VRO_CLIENT)) {
			AviConnectionInfo connectionInfo = configurationService.findById(ref.getId());
			AviVroClient vroClient = null;
			if (!aviVroClientMap.containsKey(ref.getId())) {
				vroClient = getAviVroClient(connectionInfo);
			} else {
				vroClient = aviVroClientMap.get(ref.getId());
			}
			return vroClient;
		}
		if (ref.isOfType(Constants.FINDER_VRO_VIRTUALSERVICE)) {
			VirtualService virtualService = null;
			String uuid = getUUID(ref.getId());
			logger.debug("__DEBUG__:: Inside find virtualService -> " + uuid);
			if (aviVroClientMap.isEmpty()) {
				reloadAviEndpoints();
			}
			logger.debug("__DEBUG__:: Inside find virtualService aviVroClientMap -> " + aviVroClientMap.values());
			for (AviVroClient aviVroClient: aviVroClientMap.values()) {
				try {
					String tenant = aviVroClient.getCred().getTenant();
					virtualService = (VirtualService) aviVroClient.getObjectByUUID(ref.getType().toLowerCase(), uuid, tenant);
					logger.debug("__DEBUG__:: Inside find virtualService Object -> " + virtualService);
					if (virtualService.getUuid() != null) {
						return virtualService;
					}
				} catch (Exception e) {
					logger.error("__ERROR__:: " + e.getMessage());
				}
			}
			return new VirtualService();
		}
		if (ref.isOfType(Constants.FINDER_VRO_POOL)) {
			Pool pool = null;
			String uuid = getUUID(ref.getId());
			if (aviVroClientMap.isEmpty()) {
				reloadAviEndpoints();
			}
			for (AviVroClient aviVroClient: aviVroClientMap.values()) {
				try {
					String tenant = aviVroClient.getCred().getTenant();
					pool = (Pool) aviVroClient.getObjectByUUID(ref.getType().toLowerCase(), uuid, tenant);
					if (pool.getUuid() != null) {
						return pool;
					}
				} catch (Exception e) {
					logger.error(e.getMessage());
				}
			}
			return new Pool();
		}
		if (ref.isOfType(Constants.FINDER_VRO_WORKFLOW_RUNTIME)) {
			return new WorkflowRuntime();
		}
		try {
			String location = "com.vmware.avi.vro.model." + ref.getType();
			Class<?> cls;
			Object obj = null;
			try {
				cls = Class.forName(location);
				obj = cls.newInstance();
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				logger.error("Exception in find : " + e.getMessage());
			}
			return obj;
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return null;
	}

	/**
	 * Method to load AVI credentials
	 *
	 * @param controller controller IP.
	 * @param username   username of the controller
	 * @param password   password of the controller
	 * @param tenant     tenant name
	 * @param token      token
	 * @param version    version
	 * @return instance of AviVroClient
	 * @return
	 * @throws Exception
	 */
	private AviVroClient getAviVroClient(AviConnectionInfo connectionInfo){
		try {
			logger.debug("__INIT__:: Inside getAviVroClient: ");
			SSLContext context = null;
			try {
				context = getSslService().newSslContext("TLS");
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			AviCredentials aviCredentials = new AviCredentials();
			String addedController = connectionInfo.getController() + "-" + connectionInfo.getTenant();
			aviCredentials.setController(connectionInfo.getController());
			aviCredentials.setUsername(connectionInfo.getUsername());
			aviCredentials.setPassword(connectionInfo.getPassword());
			aviCredentials.setToken(connectionInfo.getToken());
			aviCredentials.setTenant(connectionInfo.getTenant());
			aviCredentials.setVersion(connectionInfo.getVersion());
			aviCredentials.setSslContext(context);

			AviVroClient aviVroClient = new AviVroClient();
			aviVroClient.setCred(aviCredentials);
			aviVroClientMap.put(addedController, aviVroClient);
			return aviVroClient;
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return null;
	}

	/***
	 * This method will return UUID of the Object from the Inventory ID.
	 * 
	 * @param objectID
	 * @return uuid
	 */
	public String getUUID(String objectID) {
		String uuid = objectID.substring(objectID.indexOf("(") + 1, objectID.length() - 1);
		return uuid;
	}

	@Override
	public QueryResult findAll(String type, String query) {
		logger.debug("__INIT__:: findAll -> type: " + type + ", query: " + query);
		reloadAviEndpoints();
		if (Constants.FINDER_VRO_CLIENT.equals(type)) {
			return new QueryResult(getListOfAviVroClientList());
		}
		return null;
	}

	private void reloadAviEndpoints() {
		logger.info("__INIT__:: Inside reload endpoints to the map");
		aviVroClientMap.clear();
		List<AviConnectionInfo> infos = configurationService.getAll();
		for (AviConnectionInfo info: infos) {
			getAviVroClient(info);
		}
		logger.info("__DONE__:: Reload endpoint execution done.");
	}

	@Override
	public List<?> findChildrenInRootRelation(String type, String relationName) {
		logger.debug("__INIT__:: findChildrenInRootRelation > type: " + type + ", relationName: " + relationName);
		if (VroPluginAdaptor.REL_ROOTS.equals(type) && Constants.FINDER_VRO_CLIENT.equals(relationName)) {
			return findAll(relationName, null).getElements();
		}
		return null;
	}

	@Override
	public synchronized List<?> findChildrenInRelation(InventoryRef parent, String relationName) {
		logger.debug("__INIT__:: findChildrenInRelation -> parent: " + parent + ", relationName: " + relationName);
		List<AviRestResource> aviRestResources = null;
		if (Constants.FINDER_VRO_VIRTUALSERVICE.equals(relationName)) {
			try {
				String parentId = parent.getId();
				String tenant = parentId.substring(parentId.lastIndexOf("-") + 1).toLowerCase();
				AviVroClient client = aviVroClientMap.get(parentId);
				if (client != null) {
					aviRestResources = client.getObject("virtualservice", null, tenant);
				}
			} catch (Exception e) {
				logger.debug("Exception : " + e.getMessage());
			}
			return aviRestResources;
		}
		if (Constants.FINDER_VRO_POOL.equals(relationName)) {
			try {
				HashMap<String, String> param = new HashMap<String, String>();
				String parentUuid = getUUID(parent.getId());
				if (parentUuid != null) {
					if (aviVroClientMap.isEmpty()) {
						reloadAviEndpoints();
					}
					for (AviVroClient aviVroClient: aviVroClientMap.values()) {
						String tenant = aviVroClient.getCred().getTenant();
						String referred_by = "virtualservice:" + parentUuid;
						param.put("referred_by", referred_by);
						aviRestResources = aviVroClient.getObject("pool", param, tenant);
					}
				}
			} catch (Exception e) {
				logger.debug("Exception in findChildrenInRelation: " + e.getMessage());
			}
			return aviRestResources;
		}
		if (Constants.FINDER_VRO_HEALTHMONITOR.equals(relationName)) {
			try {
				HashMap<String, String> param = new HashMap<String, String>();
				String parentUuid = getUUID(parent.getId());
				if (parentUuid != null) {
					if (aviVroClientMap.isEmpty()) {
						reloadAviEndpoints();
					}
					for (AviVroClient aviVroClient: aviVroClientMap.values()) {
						String tenant = aviVroClient.getCred().getTenant();
						String referred_by = "pool:" + parentUuid;
						param.put("referred_by", referred_by);
						aviRestResources = aviVroClient.getObject("healthmonitor", param, tenant);
					}
				}
			} catch (Exception e) {
				logger.debug("Exception in findChildrenInRelation: " + e.getMessage());
			}
			return aviRestResources;
		} else {
			return null;
		}
	}

	public List<AviVroClient> getListOfAviVroClientList() {
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

	public ISslService getSslService() {
		return (ISslService) serviceRegistry.getService(IServiceRegistry.SSL_SERVICE);
	}

	public IContext getContextService() {
		return (IContext) serviceRegistry.getService(IServiceRegistry.CONTEXT_SERVICE);
	}

}
