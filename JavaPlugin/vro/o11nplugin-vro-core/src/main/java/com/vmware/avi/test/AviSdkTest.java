package com.vmware.avi.test;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.vmware.avi.sdk.AviCredentials;
import com.vmware.avi.vro.AviVroClient;
public class AviSdkTest {
	private static final Logger logger = Logger.getLogger(AviSdkTest.class);
	private static final String CONTROLLER = System.getenv("AVI_CONTROLLER");
	private static final String USERNAME = System.getenv("AVI_USERNAME");
	private static final String PASSWORD = System.getenv("AVI_PASSWORD");
	private static final String VERSION = System.getenv("AVI_VERSION");
	private static final String TENANT = System.getenv("AVI_TENANT");
	private static AviCredentials creds = null;
	static AviCredentials getCreds() {
		if (null == AviSdkTest.creds) {
			AviSdkTest.creds = new AviCredentials(AviSdkTest.CONTROLLER, AviSdkTest.USERNAME, AviSdkTest.PASSWORD);
			creds.setVersion(AviSdkTest.VERSION);
			creds.setTenant(AviSdkTest.TENANT);
			return creds;
		} else {
			return AviSdkTest.creds;
		}
	}
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
		return "{\n" + "\"name\": \"test_vs\"\n" + "}";
	}
	@Test
	public void testVroExecuteFlow() throws java.text.ParseException {
		AviSdkTest testObject = new AviSdkTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviSdkTest.getCreds());
		testingVRO.delete("virtualservice", testObject.deleteVS());
		testingVRO.add("healthmonitor", testObject.getHMData());
		testingVRO.add("pool", testObject.getPoolData());
		testingVRO.add("virtualservice", testObject.getVSData());
		testingVRO.delete("virtualservice", testObject.deleteVS());
		try {
			String response1 = testingVRO.executeWorkflow();
			logger.info("Workflow execution copmleted :" + response1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}