package com.vmware.avi.vro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;
import com.vmware.o11n.plugin.sdk.spring.InventoryRef;

import ch.dunes.vso.sdk.api.QueryResult;

/**
 * 
 * @author tushar
 *
 */
public class VroPluginFactory extends AbstractSpringPluginFactory {

	public static Map<String, AviVroClient> aviVroClientMap = new HashMap<String, AviVroClient>();
	public static Map<String, String> modelMap = new HashMap<String, String>();
	
	public static void initializeModelMap() throws ClassNotFoundException {
		VroPluginFactory.fetchClassNames("com.vmware.avi.vro.model");
		VroPluginFactory.modelMap.put("PLUGIN", "Vro");
		VroPluginFactory.modelMap.put("CLIENT", "AviVroClient");
		VroPluginFactory.modelMap.put("PLUGIN_NAME", "Avi");
	}
	
	@Override
	public Object find(InventoryRef ref) {
		System.out.println("Reference :: "+ ref);
		String objectName = modelMap.get(ref.getType().toUpperCase());
		if (ref.isOfType(objectName)) {
			String location = "com.vmware.avi.vro.model." + objectName;
			Class<?> cls;
			Object obj = null;
			try {
				cls = Class.forName(location);
				obj = cls.newInstance();
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			return obj;
		}else {
			throw new UnsupportedOperationException("Error in find..");
		}
	}

	/*
	 * @Overridetype
	 * 
	 * public QueryResult findAll(String type, String query) { throw new
	 * UnsupportedOperationException("implement me"); }
	 */
	@Override
	public QueryResult findAll(String type, String query) {
		return new QueryResult(getListOfAviVroClientList());
	}

	@Override
	public List<?> findChildrenInRootRelation(String type, String relationName) {
		throw new UnsupportedOperationException("findChildrenInRootRelation Not implemented.");
	}

	@Override
	public List<?> findChildrenInRelation(InventoryRef parent, String relationName) {
		throw new UnsupportedOperationException("findChildrenInRelation Not implemented.");
	}

	public static List<AviVroClient> getListOfAviVroClientList() {
		List<AviVroClient> listOfAviVroClient = new ArrayList<AviVroClient>(aviVroClientMap.values());
		return listOfAviVroClient;
	}

	public static Map<String, String> getModelMap() {
		return modelMap;
	}
	
	public static Map<String, AviVroClient> getListOfAviVroClientMap() {
		return aviVroClientMap;
	}
	
	/*
	 * fetchClassNames() which will fetch autogenrated class names from the
	 * package.
	 * @param package_name
	 */
	public static void fetchClassNames(String packageName) throws ClassNotFoundException {
		List<ClassLoader> classLoadersList = new LinkedList<ClassLoader>();
		classLoadersList.add(ClasspathHelper.contextClassLoader());
		classLoadersList.add(ClasspathHelper.staticClassLoader());

		Reflections reflections = new Reflections(new ConfigurationBuilder()
				.setScanners(new SubTypesScanner(false), new ResourcesScanner())
				.setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[0])))
				.filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix(packageName))));
		
		Set<Class<?>> classes = reflections.getSubTypesOf(Object.class);
		for (Class<?> className : classes) {
			String value = className.getSimpleName();
			String key = value.toUpperCase();
		    modelMap.put(key, value);
		}
	}
	public static void main(String[] args) throws ClassNotFoundException {
		fetchClassNames("com.vmware.avi.vro.model");
	}
}