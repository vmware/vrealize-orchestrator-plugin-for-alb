package com.vmware.avi.vro;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	public static void initializeModelMap() throws ClassNotFoundException {
		VroPluginFactory.fetchClassNames("com.vmware.avi.vro.model");
		System.out.println("Object map after fetchClassNames " + VroPluginFactory.getModelMap());
		VroPluginFactory.modelMap.put("PLUGIN", "Vro");
		VroPluginFactory.modelMap.put("CLIENT", "AviVroClient");
		VroPluginFactory.modelMap.put("PLUGIN_NAME", "Avi");
	}

	@Override
	public Object find(InventoryRef ref) {
		System.out.println("Reference :: " + ref);
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
		} else {
			throw new UnsupportedOperationException("Error in find..");
		}
	}

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
	public static void fetchClassNames(String packageName) throws ClassNotFoundException {
		Class[] classes = null;
		try {
			classes = getClasses(packageName);
		} catch (IOException e) {

			logger.info("Unable to fetch class names : " + e.getMessage());
		}
		for (Class c : classes) {

			modelMap.put(c.getSimpleName().toUpperCase(), c.getSimpleName());
		}

	}

	/**
	 * Scans all classes accessible from the context class loader which belong to
	 * the given package and subpackages.
	 *
	 * @param packageName The base package
	 * @return The classes
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	private static Class[] getClasses(String packageName) throws ClassNotFoundException, IOException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		assert classLoader != null;
		String path = packageName.replace('.', '/');
		Enumeration resources = classLoader.getResources(path);
		List<File> dirs = new ArrayList();
		while (resources.hasMoreElements()) {
			URL resource = (URL) resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		ArrayList classes = new ArrayList();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packageName));
		}
		return (Class[]) classes.toArray(new Class[classes.size()]);
	}

	/**
	 * Recursive method used to find all classes in a given directory and subdirs.
	 *
	 * @param directory   The base directory
	 * @param packageName The package name for classes found inside the base
	 *                    directory
	 * @return The classes
	 * @throws ClassNotFoundException
	 */
	private static List findClasses(File directory, String packageName) throws ClassNotFoundException {
		List classes = new ArrayList();
		if (!directory.exists()) {
			return classes;
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClasses(file, packageName + "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				classes.add(
						Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
			}
		}
		return classes;
	}

}