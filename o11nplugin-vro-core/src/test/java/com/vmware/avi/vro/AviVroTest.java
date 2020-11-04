package com.vmware.avi.vro;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import com.vmware.avi.sdk.AviCredentials;
import com.vmware.avi.vro.model.AviRestResource;
import com.vmware.avi.vro.model.HealthMonitor;
import com.vmware.avi.vro.model.Pool;

public class AviVroTest {
	private static final String CONTROLLER = System.getenv("AVI_CONTROLLER");
	private static final String USERNAME = System.getenv("AVI_USERNAME");
	private static final String PASSWORD = System.getenv("AVI_PASSWORD");
	private static final String VERSION = System.getenv("AVI_VERSION");
	private static final String TENANT = System.getenv("AVI_TENANT");

	private static AviCredentials creds = null;

	@Before
	public void init() {
		VroPluginFactory.initializeModelMap();
	}

	static AviCredentials getCreds() {
		if (null == AviVroTest.creds) {
			AviVroTest.creds = new AviCredentials(AviVroTest.CONTROLLER, AviVroTest.USERNAME, AviVroTest.PASSWORD);
			creds.setVersion(AviVroTest.VERSION);
			creds.setTenant(AviVroTest.TENANT);
			return creds;
		} else {
			return AviVroTest.creds;
		}
	}

	public JSONObject getJsonObject() throws IOException {
		String content = readFile("InputFile.json", StandardCharsets.UTF_8);
		JSONObject obj = new JSONObject(content);
		return obj;
	}

	public String getVsVipData() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject hmData = (JSONObject) obj.get("vsvipData");
		String hmStr = hmData.toString();
		return hmStr;
	}

	public String getVsVip3Data() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject hmData = (JSONObject) obj.get("vsvipData3");
		String hmStr = hmData.toString();
		return hmStr;
	}

	public String getHMData() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject hmData = (JSONObject) obj.get("hmData");
		String hmStr = hmData.toString();
		return hmStr;
	}

	public String getPoolData() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject poolData = (JSONObject) obj.get("poolData");
		String poolStr = poolData.toString();
		return poolStr;
	}

	public String getHMDataVs3() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject hmData = (JSONObject) obj.get("hmDataVs3");
		String hmStr = hmData.toString();
		return hmStr;
	}

	public String getPoolDataVs3() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject poolData = (JSONObject) obj.get("poolDataVs3");
		String poolStr = poolData.toString();
		return poolStr;
	}

	public String getVSData() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject vsData = (JSONObject) obj.get("vsData");
		String vsStr = vsData.toString();
		return vsStr;
	}

	public String getVSDataWithInvalidConfig() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject vsData = (JSONObject) obj.get("vsDataWithInvalidConfig");
		String vsStr = vsData.toString();
		return vsStr;
	}

	public String getPoolData1() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject poolData = (JSONObject) obj.get("poolData1");
		String poolStr = poolData.toString();
		return poolStr;
	}

	public String getPoolData2() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject poolData = (JSONObject) obj.get("poolData2");
		String poolStr = poolData.toString();
		return poolStr;
	}

	public String getPoolData3() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject poolData = (JSONObject) obj.get("poolData3");
		String poolStr = poolData.toString();
		return poolStr;
	}

	public String getPoolgroup() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject poolData = (JSONObject) obj.get("poolgroupData");
		String poolStr = poolData.toString();
		return poolStr;
	}

	public String getPoolDataUpdate() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject poolData = (JSONObject) obj.get("poolDataUpdate");
		String poolStr = poolData.toString();
		return poolStr;
	}

	public String getInvalidPoolgroup() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject poolData = (JSONObject) obj.get("poolgroupInvalidData");
		String poolStr = poolData.toString();
		return poolStr;
	}

	public String getUpdatedPoolgroup() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject poolData = (JSONObject) obj.get("poolgroupData1");
		String poolStr = poolData.toString();
		return poolStr;
	}

	public String getVSDataWithInvalidConfigPg() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject vsData = (JSONObject) obj.get("vsDataWithInvalidConfigPg");
		String vsStr = vsData.toString();
		return vsStr;
	}

	public String getVSDataWithSameIp() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject vsData = (JSONObject) obj.get("vsDataWithSameIp");
		String vsStr = vsData.toString();
		return vsStr;
	}

	public String getUpdatedHMData() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject hmData = (JSONObject) obj.get("hmUpdatedData");
		String hmStr = hmData.toString();
		return hmStr;
	}

	public String getInvalidHMData() throws IOException {
		JSONObject obj = getJsonObject();
		JSONObject hmData = (JSONObject) obj.get("hmInvalidData");
		String hmStr = hmData.toString();
		return hmStr;
	}

	public static String readFile(String path, Charset encoding) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(path), encoding);
		return String.join(System.lineSeparator(), lines);
	}

	public String deleteVS() {
		return "{\n" + "\"name\": \"test-vs-1\"\n" + "}";
	}

	public String deleteVSVIP() {
		return "{\n" + "\"name\": \"test_vsvip\"\n" + "}";
	}

	public String deletePool() {
		return "{\n" + "\"name\": \"test-pool-1\"\n" + "}";
	}

	public String deleteHM() {
		return "{\n" + "\"name\": \"test-hm-1\"\n" + "}";
	}

	public String deleteInvalidHM() {
		return "{\n" + "\"name\": \"test-hm-5\"\n" + "}";
	}

	public String deletePoolgroup() {
		return "{\n" + "\"name\": \"poolgroup-1\"\n" + "}";
	}

	public String deletePool1() {
		return "{\n" + "\"name\": \"pool-1\"\n" + "}";
	}

	public String deletePool2() {
		return "{\n" + "\"name\": \"pool-2\"\n" + "}";
	}

	public String deletePool3() {
		return "{\n" + "\"name\": \"pool-3\"\n" + "}";
	}

	/**
	 * Given objects in sequence to execute workflow like hm, pool and vs.
	 * 
	 * @throws Exception
	 */

	@Test
	public void testVroExecuteWorkFlowWithValidSequence() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add vsvip
			testingVRO.add("vsvip", testObject.getVsVipData());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// exceute workflow
			testingVRO.executeWorkflow();

			// verify object is created
			assertNotNull(testingVRO.getObjectDataByName("healthmonitor", "test-hm-1", null));
			assertNotNull(testingVRO.getObjectDataByName("pool", "test-pool-1", null));
			assertNotNull(testingVRO.getObjectDataByName("virtualservice", "test-vs-1", null));

			// add vs, pool, hm to delete
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

			// verify object is deleted
			assertNull(testingVRO.getObjectDataByName("healthmonitor", "tes-hm-1", null));
			assertNull(testingVRO.getObjectDataByName("pool", "test-pool-1", null));
			assertNull(testingVRO.getObjectDataByName("virtualservice", "test-vs-1", null));

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

	/**
	 * Given an object with invalid sequence to execute workflow like vs, pool, hm .
	 * It will raise an error while creating vs that pool object not found as we
	 * have given pool reference in vs.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testVroExecuteWorkFlowWithInvalidSequence() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// add vsvip
			testingVRO.add("vsvip", testObject.getVsVipData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMData());

			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// verify none of the object is created
			assertNull(testingVRO.getObjectDataByName("virtualservice", "test-vs-1", null));
			assertNull(testingVRO.getObjectDataByName("pool", "test-pool-1", null));
			assertNull(testingVRO.getObjectDataByName("healthmonitor", "test-hm-1", null));

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

	/**
	 * 
	 * Create hm, pool and vs but vs creation failed then it will rollback and
	 * delete hm and pool also.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testVroRollbackWhenVsFailedToCreate() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMDataVs3());

			// add pool
			testingVRO.add("pool", testObject.getPoolDataVs3());

			// add vsvip
			testingVRO.add("vsvip", testObject.getVsVipData());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSDataWithInvalidConfig());

			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// verify object is not created
			assertNull(testingVRO.getObjectDataByName("healthmonitor", "tes-hm-3", null));
			assertNull(testingVRO.getObjectDataByName("pool", "test-pool-3", null));

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

	/**
	 * create pools and PG and failed at vs creation so it will delete pools as well
	 * as PG.
	 * 
	 * @throws Exception
	 */
	// @Test
	public void testVsCreatewithInvalidConfig() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add pools
			testingVRO.add("pool", testObject.getPoolData1());
			testingVRO.add("pool", testObject.getPoolData2());
			testingVRO.add("pool", testObject.getPoolData3());

			// add poolgroup
			testingVRO.add("poolgroup", testObject.getPoolgroup());

			// add vsvip
			testingVRO.add("vsvip", testObject.getVsVipData());

			// add vs
			testingVRO.add("virtualservice", testObject.getVSDataWithInvalidConfigPg());
			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// verify object is not created
			assertNull(testingVRO.getObjectDataByName("pool", "pool-1", null));
			assertNull(testingVRO.getObjectDataByName("pool", "pool-2", null));
			assertNull(testingVRO.getObjectDataByName("pool", "pool-3", null));
			assertNull(testingVRO.getObjectDataByName("poolgroup", "poolgroup-1", null));

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

	/**
	 * create hm , pool, vs. Update hm and verify it is updated and delete all the
	 * objects
	 * 
	 * @throws Exception
	 */
	@Test
	public void testVroExecuteFlowOfUpdate() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add healthmonitor and execute it
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add vsvip
			testingVRO.add("vsvip", testObject.getVsVipData());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// execute workflow and check send_interval value of hm
			ArrayList<AviRestResource> response = testingVRO.executeWorkflow();
			HealthMonitor healthMonitor = (HealthMonitor) response.get(0);

			assertTrue("send_interval value not as expected", healthMonitor.getSendInterval() == 20);

			// update healthmonitor and execute flow
			testingVRO.add("healthmonitor", testObject.getUpdatedHMData());
			ArrayList<AviRestResource> response1 = testingVRO.executeWorkflow();
			HealthMonitor healthMonitor2=(HealthMonitor)testingVRO.getObjectByName("healthmonitor", "test-hm-1");
			//HealthMonitor healthMonitor2 = (HealthMonitor) response1.get(0);
				
			assertTrue("send_interval value not as expected", healthMonitor2.getSendInterval() == 30);

			// delete virtualservice and its refered objects
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

	/**
	 * Create hm, pool and vs . Update hm twice where the second update step will
	 * fail and it will roll back to previous workflow stage. Need to cleanup object
	 * at the end of test execution
	 * 
	 * @throws Exception
	 */
	@Test
	public void testVroRollbackOfUpdate() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add healthmonitor and execute it
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());
			// add vsvip
			testingVRO.add("vsvip", testObject.getVsVipData());
			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// execute workflow and check send_interval value of hm
			ArrayList<AviRestResource> response = testingVRO.executeWorkflow();
			HealthMonitor response1 = (HealthMonitor) response.get(0);
			assertTrue("send_interval value not as expected", response1.getSendInterval() == 20);

			// update healthmonitor and execute work flow
			testingVRO.add("healthmonitor", testObject.getUpdatedHMData());
			testingVRO.add("healthmonitor", testObject.getInvalidHMData());
			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// After rollback we should get original send_interval value of hm which is 20
			JSONObject dataHmAfterUpdate = testingVRO.getObjectDataByName("healthmonitor", "test-hm-1", null);
			Integer sendInterval = (Integer) dataHmAfterUpdate.get("send_interval");
			assertTrue("Rollback failed, not get expected send_interval value of hm", sendInterval == 20);

			// delete virtualservice and its refered objects
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

	/**
	 * Create hm , pool and vs in the first workflow . In the second workflow create
	 * another vs with different name but the same config as previous vs then it
	 * will fail with an error like overlapping IPs.
	 * 
	 * @throws Exception
	 */

	@Test
	public void testVroExecuteflowForOverlappingIps() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {

			// add healthmonitor and execute it
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add vsvip
			testingVRO.add("vsvip", testObject.getVsVipData());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// execute workflow
			testingVRO.executeWorkflow();

			/*
			 * add virtualservice with different name but same configuration as previous vs
			 * and it will throws an exception like overlapping IPs with other VIPs in the
			 * system
			 */
			testingVRO.add("virtualservice", testObject.getVSDataWithSameIp());

			// execute workflow
			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				String message = e.getMessage();
				//assertTrue(message.contains("BAD REQUEST"));
				assertTrue(message.contains("shares the same VIP"));
			}
			// delete virtualservice and its refered objects
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

	/**
	 * Create a pool group with pools and try to create the same pool group again
	 * and it should pass.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testPoolgroupCreateTwice() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add pools
			testingVRO.add("pool", testObject.getPoolData1());
			testingVRO.add("pool", testObject.getPoolData2());
			testingVRO.add("pool", testObject.getPoolData3());

			// add poolgroup
			testingVRO.add("poolgroup", testObject.getPoolgroup());

			// execute work flow
			testingVRO.executeWorkflow();

			// verify object is created
			assertNotNull(testingVRO.getObjectDataByName("pool", "pool-1", null));
			assertNotNull(testingVRO.getObjectDataByName("pool", "pool-2", null));
			assertNotNull(testingVRO.getObjectDataByName("pool", "pool-3", null));
			assertNotNull(testingVRO.getObjectDataByName("poolgroup", "poolgroup-1", null));

			// add pools
			testingVRO.add("pool", testObject.getPoolData1());
			testingVRO.add("pool", testObject.getPoolData2());
			testingVRO.add("pool", testObject.getPoolData3());

			// add poolgroup
			testingVRO.add("poolgroup", testObject.getPoolgroup());

			// verify poolgroup is created
			assertNotNull(testingVRO.getObjectDataByName("poolgroup", "poolgroup-1", null));

			// delete all objects
			testingVRO.delete("poolgroup", testObject.deletePoolgroup());
			testingVRO.delete("pool", testObject.deletePool1());
			testingVRO.delete("pool", testObject.deletePool2());
			testingVRO.delete("pool", testObject.deletePool3());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}
	}

	/**
	 * Create, update and delete pool group with pool. In this test case we are
	 * updating pool object attached to poolgroup.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testPoolgroupUpdate() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add pools
			testingVRO.add("pool", testObject.getPoolData1());
			testingVRO.add("pool", testObject.getPoolData2());
			testingVRO.add("pool", testObject.getPoolData3());

			// add poolgroup
			testingVRO.add("poolgroup", testObject.getPoolgroup());

			testingVRO.executeWorkflow();

			// verify poolgroup is created
			assertNotNull(testingVRO.getObjectDataByName("poolgroup", "poolgroup-1", null));

			// add pools and check pool is updated or not
			testingVRO.add("pool", testObject.getPoolDataUpdate());
			ArrayList<AviRestResource> response1 = testingVRO.executeWorkflow();
			Pool pool = (Pool) response1.get(0);
			assertTrue("poolgroup not updated", pool.getEnabled() == false);

			// delete all objects
			testingVRO.delete("poolgroup", testObject.deletePoolgroup());
			testingVRO.delete("pool", testObject.deletePool1());
			testingVRO.delete("pool", testObject.deletePool2());
			testingVRO.delete("pool", testObject.deletePool3());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}
	}

	/**
	 * Create, update and delete pool group with pool. In this test case we are
	 * updating poolgroup by removing pool-3 from it.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testPoolgroupCreateAndUpdateAndDelete() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add pools
			testingVRO.add("pool", testObject.getPoolData1());
			testingVRO.add("pool", testObject.getPoolData2());
			testingVRO.add("pool", testObject.getPoolData3());

			// add poolgroup
			testingVRO.add("poolgroup", testObject.getPoolgroup());

			testingVRO.executeWorkflow();

			// verify poolgroup is created
			assertNotNull(testingVRO.getObjectDataByName("poolgroup", "poolgroup-1", null));

			testingVRO.add("poolgroup", testObject.getUpdatedPoolgroup());
			ArrayList<AviRestResource> response1 = testingVRO.executeWorkflow();
			assertFalse("poolgroup not updated correctly, pool-3 is still attched to poolgroup",
					response1.contains("#pool-3"));

			// delete objects
			testingVRO.delete("poolgroup", testObject.deletePoolgroup());
			testingVRO.delete("pool", testObject.deletePool1());
			testingVRO.delete("pool", testObject.deletePool2());
			testingVRO.delete("pool", testObject.deletePool3());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

	/**
	 * Create pools but pool group creation failed due to invalid config then it
	 * should rollback and delete created pool which refereed in pool group.
	 * 
	 * @throws Exception
	 */
	// @Test
	public void testPoolgroupCreatewithInvalidConfig() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add pools
			testingVRO.add("pool", testObject.getPoolData1());
			testingVRO.add("pool", testObject.getPoolData2());
			testingVRO.add("pool", testObject.getPoolData3());

			// add poolgroup
			testingVRO.add("poolgroup", testObject.getInvalidPoolgroup());
			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// verify pool and poolgroup not created
			assertNull(testingVRO.getObjectDataByName("poolgroup", "poolgroup-1", null));
			assertNull(testingVRO.getObjectDataByName("pool", "pool-1", null));
			assertNull(testingVRO.getObjectDataByName("pool", "pool-2", null));
			assertNull(testingVRO.getObjectDataByName("pool", "pool-3", null));

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

	/**
	 * Delete hm , pool and vs but vs deletion failed then it will rollback and
	 * create vs, hm and pool.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testRollbackOfDelete() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add vsvip
			testingVRO.add("vsvip", testObject.getVsVipData());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// execute workflow
			testingVRO.executeWorkflow();

			// delete virtualservice
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("pool", testObject.deletePool());

			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// Verify object is not deleted
			assertNotNull(testingVRO.getObjectDataByName("healthmonitor", "test-hm-1", null));
			assertNotNull(testingVRO.getObjectDataByName("pool", "test-pool-1", null));
			assertNotNull(testingVRO.getObjectDataByName("virtualservice", "test-vs-1", null));

			// delete virtualservice, pool and hm
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

	/**
	 * Test deletion of object which is not present on controller. In this case it
	 * will not generate error instead of that it silently ignore this.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testDeleteExecuteworkflowandRollback() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {

			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMData());
			testingVRO.executeWorkflow();

			String vsData = "{\n" + "\"name\": \"test-vs-5\"\n" + "}";
			String poolData = "{\n" + "\"name\": \"test-pool-5\"\n" + "}";

			// delete virtualservice, pool which not present on controller and hm which is
			// present on controller
			testingVRO.delete("virtualservice", vsData);
			testingVRO.delete("pool", poolData);
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add vsvip
			testingVRO.add("vsvip", testObject.getVsVipData());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// delete vs
			testingVRO.delete("virtualservice", testObject.deleteVS());

			// execute workflow
			testingVRO.executeWorkflow();

			// delete virtualservice which not present
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.executeWorkflow();

			// delete hm which present on controller but it will not delete because we have
			// refered it in pool and it will rollback
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.delete("pool", testObject.deletePool());
			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// Verify object is not deleted
			assertNotNull(testingVRO.getObjectDataByName("healthmonitor", "test-hm-1", null));
			assertNotNull(testingVRO.getObjectDataByName("pool", "test-pool-1", null));

			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

	/**
	 * Create hm , pool and vs in the first workflow. Then delete vs and try to
	 * create vs with invalid config in the second workflow then it will rollback
	 * and create deleted vs.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testVroRollbackVsDeleteAndCreate() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {

			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add vsvip
			testingVRO.add("vsvip", testObject.getVsVipData());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// execute workflow
			testingVRO.executeWorkflow();

			// add object for delete

			testingVRO.delete("vsvip", testObject.getVsVipData());
			testingVRO.delete("virtualservice", testObject.deleteVS());

			// add vsvip
			testingVRO.add("vsvip", testObject.getVsVip3Data());
			// add vs for creation
			testingVRO.add("virtualservice", testObject.getVSDataWithInvalidConfig());

			// execute workflow
			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// Verify object is not deleted as we rollback action performed
			assertNotNull(testingVRO.getObjectDataByName("virtualservice", "test-vs-1", null));

			// add vs, pool, hm to delete
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("vsvip", testObject.deleteVSVIP());
			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

	/**
	 * Create hm and get hm by uuid and update hm and verify its updated.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testObjectByUUID() throws Exception {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {

			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMData());

			// execute workflow
			testingVRO.executeWorkflow();

			// get object by name
			JSONObject dataHm = testingVRO.getObjectDataByName("healthmonitor", "test-hm-1", null);
			String uuid = (String) dataHm.get("uuid");
			String name = (String) dataHm.get("name");

			// get object by uuid
			JSONObject dataHm1 = testingVRO.getObjectDataByUUID("healthmonitor", uuid, null);
			dataHm1.put("name", "test-hm-new");
			String hmStr = dataHm1.toString();

			// update hm name
			testingVRO.add("healthmonitor", hmStr);
			ArrayList<AviRestResource> response = testingVRO.executeWorkflow();
			HealthMonitor healthMonitor = (HealthMonitor) response.get(0);
			assertTrue("healthmonitor not updated", healthMonitor.getName().equals("test-hm-new"));

			// verify name is updated or not
			JSONObject dataHmUpdated = testingVRO.getObjectDataByUUID("healthmonitor", uuid, null);
			String nameUpdated = (String) dataHmUpdated.get("name");
			assertTrue("Hm not updated", name != nameUpdated);

			// delete hm
			String hmData = "{\n" + "\"name\": \"test-hm-new\"\n" + "}";
			testingVRO.delete("healthmonitor", hmData);
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw e;
		}

	}

}
