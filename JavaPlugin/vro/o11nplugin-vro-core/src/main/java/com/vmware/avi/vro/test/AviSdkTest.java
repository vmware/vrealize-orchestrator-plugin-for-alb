package com.vmware.avi.vro.test;

import com.vmware.avi.sdk.AviCredentials;
import com.vmware.avi.vro.AviVroClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AviSdkTest {
	private static final Logger logger = Logger.getLogger(AviSdkTest.class);

	public String getVSData() {
		String vsData = "{  \"tenant_ref\": \"/api/tenant?name=admin\",\"vip\": [{"
				+ "\"auto_allocate_ip\": false,\"enabled\": true," + "\"vip_id\": 0,"
				+ "\"ip_address\": {\"type\": \"V4\"," + "\"addr\": \"1.1.1.1\"}}]," + "\"services\": [{\"port\": 80}],"
				+ "\"pool_ref\":  \"/api/pool?name=test-pool\"," + "\"name\": \"test_vs\" }";
		return vsData;
	}

	public String getPoolData() {
		String poolData = "{\n" + "	\"lb_algorithm\": \"LB_ALGORITHM_LEAST_CONNECTIONS\",\n"
				+ "   \"health_monitor_refs\":  [\"/api/healthmonitor?name=test_hm\"],"
				+ "	\"default_server_port\": 80,\n" + "	\"enabled\": true,\n" + "	\"servers\": [{\n"
				+ "		\"enabled\": false,\n" + "		\"ip\": {\n" + "			\"addr\": \"1.2.3.4\",\n"
				+ "			\"type\": \"V4\"\n" + "		}\n" + "	}],\n" + "	\"name\": \"test-pool\"\n" + "}";
		return poolData;
	}

	public String getHMData() {
		String hmData = "{\n" + "\"type\": \"HEALTH_MONITOR_PING\",\n" + "\"name\": \"test_hm\"\n"
				+ "	\"send_interval\": \"20\"\n" + "}";
		return hmData;
	}

	public String deleteVS() {
		return "{\n" +"\"name\": \"test_vs\"\n" + "}";
	}

	public static void main(String[] args) throws Exception {
		AviSdkTest testObject = new AviSdkTest();

		// AviVroClient testingVRO = new AviVroClient("10.10.28.135", "admin",
		// "avi123$%", "admin", "18.2.7");
		
		AviVroClient testingVRO = new AviVroClient();
		AviCredentials creds = new AviCredentials("10.79.109.242", "admin", "admin");
		creds.setTenant("admin");
		creds.setVersion("18.2.8");
		testingVRO.setCred(creds);
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", "pool1");
		JSONArray response = testingVRO.get("pool", params);
		System.out.println(response);
		logger.info("Workflow execution copmleted :"+response);

//		try {
//			testingVRO.delete("virtualservice", testObject.deleteVS());
//			testingVRO.add("healthmonitor", testObject.getHMData());
//			testingVRO.add("pool", testObject.getPoolData());
//			testingVRO.add("virtualservice", testObject.getVSData());
						
			
//			testingVRO.delete("virtualservice", testObject.deleteVS());
			
//
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}

//		try {
//			ArrayList<JSONObject> response = testingVRO.executeWorkflow();
//			logger.info("Workflow execution copmleted :"+response);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}