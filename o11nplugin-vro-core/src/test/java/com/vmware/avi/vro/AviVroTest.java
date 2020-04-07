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
import java.util.List;

import org.json.JSONObject;
import org.junit.Test;

import com.vmware.avi.sdk.AviCredentials;
import com.vmware.avi.vro.AviVroClient;

public class AviVroTest {
	private static final String CONTROLLER = System.getenv("AVI_CONTROLLER");
	private static final String USERNAME = System.getenv("AVI_USERNAME");
	private static final String PASSWORD = System.getenv("AVI_PASSWORD");
	private static final String VERSION = System.getenv("AVI_VERSION");
	private static final String TENANT = System.getenv("AVI_TENANT");

	private static AviCredentials creds = null;

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
	 * @throws java.text.ParseException
	 */

	@Test
	public void testVroExecuteWorkFlowWithValidSequence() throws java.text.ParseException {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// exceute workflow
			testingVRO.executeWorkflow();

			// verify object is created
			assertNotNull(testingVRO.getObjectDataByName("healthmonitor", "test-hm-1"));
			assertNotNull(testingVRO.getObjectDataByName("pool", "test-pool-1"));
			assertNotNull(testingVRO.getObjectDataByName("virtualservice", "test-vs-1"));

			// add vs, pool, hm to delete
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

			// verify object is deleted
			assertNull(testingVRO.getObjectDataByName("healthmonitor", "tes-hm-1"));
			assertNull(testingVRO.getObjectDataByName("pool", "test-pool-1"));
			assertNull(testingVRO.getObjectDataByName("virtualservice", "test-vs-1"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Given an object with invalid sequence to execute workflow like vs, pool, hm .
	 * It will raise an error while creating vs that pool object not found as we
	 * have given pool reference in vs.
	 * 
	 * @throws java.text.ParseException
	 */
	@Test
	public void testVroExecuteWorkFlowWithInvalidSequence() throws java.text.ParseException {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMData());

			testingVRO.executeWorkflow();

			// verify none of the object is created
			assertNull(testingVRO.getObjectDataByName("virtualservice", "test-vs-1"));
			assertNull(testingVRO.getObjectDataByName("pool", "test-pool-1"));
			assertNull(testingVRO.getObjectDataByName("healthmonitor", "test-hm-1"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * Create hm, pool and vs but vs creation failed then it will rollback and
	 * delete hm and pool also.
	 * 
	 * @throws java.text.ParseException
	 */
	@Test
	public void testVroRollbackWhenVsFailedToCreate() throws java.text.ParseException {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMDataVs3());

			// add pool
			testingVRO.add("pool", testObject.getPoolDataVs3());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSDataWithInvalidConfig());

			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// verify object is not created
			assertNull(testingVRO.getObjectDataByName("healthmonitor", "tes-hm-3"));
			assertNull(testingVRO.getObjectDataByName("pool", "test-pool-3"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * create pools and PG and failed at vs creation so it will delete pools as well
	 * as PG.
	 */
	@Test
	public void testVsCreatewithInvalidConfig() throws java.text.ParseException {
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

			// add vs
			testingVRO.add("virtualservice", testObject.getVSDataWithInvalidConfigPg());
			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// verify object is not created
			assertNull(testingVRO.getObjectDataByName("pool", "pool-1"));
			assertNull(testingVRO.getObjectDataByName("pool", "pool-2"));
			assertNull(testingVRO.getObjectDataByName("pool", "pool-3"));
			assertNull(testingVRO.getObjectDataByName("poolgroup", "poolgroup-1"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * create hm , pool, vs. Update hm and verify it is updated and delete all the
	 * objects
	 * 
	 * @throws java.text.ParseException
	 */
	@Test
	public void testVroExecuteFlowOfUpdate() throws java.text.ParseException {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add healthmonitor and execute it
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// execute workflow and check send_interval value of hm
			String response = testingVRO.executeWorkflow();
			assertTrue("send_interval value not as expected", response.contains("\"send_interval\":20"));

			// update healthmonitor and execute flow
			testingVRO.add("healthmonitor", testObject.getUpdatedHMData());
			String response1 = testingVRO.executeWorkflow();
			assertTrue("send_interval value not as expected", response1.contains("\"send_interval\":30"));

			// delete virtualservice and its refered objects
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create hm, pool and vs . Update hm twice where the second update step will
	 * fail and it will roll back to previous workflow stage. Need to cleanup object
	 * at the end of test execution
	 * 
	 * @throws java.text.ParseException
	 */
	@Test
	public void testVroRollbackOfUpdate() throws java.text.ParseException {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add healthmonitor and execute it
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// execute workflow and check send_interval value of hm
			String response = testingVRO.executeWorkflow();
			assertTrue("send_interval value not as expected", response.contains("\"send_interval\":20"));

			// update healthmonitor and execute work flow
			testingVRO.add("healthmonitor", testObject.getUpdatedHMData());
			testingVRO.add("healthmonitor", testObject.getInvalidHMData());
			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// After rollback we should get original send_interval value of hm which is 20
			JSONObject dataHmAfterUpdate = testingVRO.getObjectDataByName("healthmonitor", "test-hm-1");
			Integer sendInterval = (Integer) dataHmAfterUpdate.get("send_interval");
			assertTrue("Rollback failed, not get expected send_interval value of hm", sendInterval == 20);

			// delete virtualservice and its refered objects
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create hm , pool and vs in the first workflow . In the second workflow create
	 * another vs with different name but the same config as previous vs then it
	 * will fail with an error like overlapping IPs.
	 * 
	 * @throws java.text.ParseException
	 */

	@Test
	public void testVroExecuteflowForOverlappingIps() throws java.text.ParseException {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {

			// add healthmonitor and execute it
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

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
				assertTrue(message.contains("has overlapping IPs with other VIPs in the system"));
			}
			// delete virtualservice and its refered objects
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create a pool group with pools and try to create the same pool group again
	 * and it should pass.
	 * 
	 * @throws java.text.ParseException
	 */
	@Test
	public void testPoolgroupCreateTwice() throws java.text.ParseException {
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
			assertNotNull(testingVRO.getObjectDataByName("pool", "pool-1"));
			assertNotNull(testingVRO.getObjectDataByName("pool", "pool-2"));
			assertNotNull(testingVRO.getObjectDataByName("pool", "pool-3"));
			assertNotNull(testingVRO.getObjectDataByName("poolgroup", "poolgroup-1"));

			// add pools
			testingVRO.add("pool", testObject.getPoolData1());
			testingVRO.add("pool", testObject.getPoolData2());
			testingVRO.add("pool", testObject.getPoolData3());

			// add poolgroup
			testingVRO.add("poolgroup", testObject.getPoolgroup());

			// verify poolgroup is created
			assertNotNull(testingVRO.getObjectDataByName("poolgroup", "poolgroup-1"));

			// delete all objects
			testingVRO.delete("poolgroup", testObject.deletePoolgroup());
			testingVRO.delete("pool", testObject.deletePool1());
			testingVRO.delete("pool", testObject.deletePool2());
			testingVRO.delete("pool", testObject.deletePool3());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create, update and delete pool group with pool. In this test case we are
	 * updating pool object attached to poolgroup.
	 */
	@Test
	public void testPoolgroupUpdate() throws java.text.ParseException {
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
			assertNotNull(testingVRO.getObjectDataByName("poolgroup", "poolgroup-1"));

			// add pools and check pool is updated or not
			testingVRO.add("pool", testObject.getPoolDataUpdate());
			String response1 = testingVRO.executeWorkflow();
			assertTrue("poolgroup not created", response1.contains("\"enabled\":false"));

			// delete all objects
			testingVRO.delete("poolgroup", testObject.deletePoolgroup());
			testingVRO.delete("pool", testObject.deletePool1());
			testingVRO.delete("pool", testObject.deletePool2());
			testingVRO.delete("pool", testObject.deletePool3());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create, update and delete pool group with pool. In this test case we are
	 * updating poolgroup by removing pool-3 from it.
	 */
	@Test
	public void testPoolgroupCreateAndUpdateAndDelete() throws java.text.ParseException {
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
			assertNotNull(testingVRO.getObjectDataByName("poolgroup", "poolgroup-1"));

			testingVRO.add("poolgroup", testObject.getUpdatedPoolgroup());
			String response1 = testingVRO.executeWorkflow();
			assertFalse("poolgroup not updated correctly, pool-3 is still attched to poolgroup",
					response1.contains("#pool-3"));

			// delete objects
			testingVRO.delete("poolgroup", testObject.deletePoolgroup());
			testingVRO.delete("pool", testObject.deletePool1());
			testingVRO.delete("pool", testObject.deletePool2());
			testingVRO.delete("pool", testObject.deletePool3());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create pools but pool group creation failed due to invalid config then it
	 * should rollback and delete created pool which refereed in pool group.
	 */
	@Test
	public void testPoolgroupCreatewithInvalidConfig() throws java.text.ParseException {
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
			assertNull(testingVRO.getObjectDataByName("poolgroup", "poolgroup-1"));
			assertNull(testingVRO.getObjectDataByName("pool", "pool-1"));
			assertNull(testingVRO.getObjectDataByName("pool", "pool-2"));
			assertNull(testingVRO.getObjectDataByName("pool", "pool-3"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Delete hm , pool and vs but vs deletion failed then it will rollback and
	 * create vs, hm and pool.
	 * 
	 * @throws java.text.ParseException
	 */
	@Test
	public void testRollbackOfDelete() throws java.text.ParseException {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {
			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// execute workflow
			testingVRO.executeWorkflow();

			// delete virtualservice
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.delete("pool", testObject.deletePool());

			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// Verify object is not deleted
			assertNotNull(testingVRO.getObjectDataByName("healthmonitor", "test-hm-1"));
			assertNotNull(testingVRO.getObjectDataByName("pool", "test-pool-1"));
			assertNotNull(testingVRO.getObjectDataByName("virtualservice", "test-vs-1"));

			// delete virtualservice, pool and hm
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Test deletion of object which is not present on controller. In this case it
	 * will not generate error instead of that it silently ignore this.
	 * 
	 * @throws java.text.ParseException
	 */
	@Test
	public void testDeleteExecuteworkflowandRollback() throws java.text.ParseException {
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
			assertNotNull(testingVRO.getObjectDataByName("healthmonitor", "test-hm-1"));
			assertNotNull(testingVRO.getObjectDataByName("pool", "test-pool-1"));

			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create hm , pool and vs in the first workflow. Then delete vs and try to
	 * create vs with invalid config in the second workflow then it will rollback
	 * and create deleted vs.
	 * 
	 * @throws java.text.ParseException
	 */
	@Test
	public void testVroRollbackVsDeleteAndCreate() throws java.text.ParseException {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {

			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMData());

			// add pool
			testingVRO.add("pool", testObject.getPoolData());

			// add virtualservice
			testingVRO.add("virtualservice", testObject.getVSData());

			// execute workflow
			testingVRO.executeWorkflow();

			// add object for delete
			testingVRO.delete("virtualservice", testObject.deleteVS());

			// add vs for creation
			testingVRO.add("virtualservice", testObject.getVSDataWithInvalidConfig());

			// execute workflow
			try {
				testingVRO.executeWorkflow();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// Verify object is not deleted as we rollback action performed
			assertNotNull(testingVRO.getObjectDataByName("virtualservice", "test-vs-1"));

			// add vs, pool, hm to delete
			testingVRO.delete("virtualservice", testObject.deleteVS());
			testingVRO.delete("pool", testObject.deletePool());
			testingVRO.delete("healthmonitor", testObject.deleteHM());
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create hm and get hm by uuid and update hm and verify its updated.
	 * 
	 * @throws java.text.ParseException
	 */
	@Test
	public void testObjectByUUID() throws java.text.ParseException {
		AviVroTest testObject = new AviVroTest();
		AviVroClient testingVRO = new AviVroClient();
		testingVRO.setCred(AviVroTest.getCreds());

		try {

			// add healthmonitor
			testingVRO.add("healthmonitor", testObject.getHMData());

			// execute workflow
			testingVRO.executeWorkflow();

			// get object by name
			JSONObject dataHm = testingVRO.getObjectDataByName("healthmonitor", "test-hm-1");
			String uuid = (String) dataHm.get("uuid");
			String name = (String) dataHm.get("name");

			// get object by uuid
			JSONObject dataHm1 = testingVRO.getObjectDataByUUID("healthmonitor", uuid);
			dataHm1.put("name", "test-hm-new");
			String hmStr = dataHm1.toString();

			// update hm name
			testingVRO.add("healthmonitor", hmStr);
			String response = testingVRO.executeWorkflow();
			assertTrue("healthmonitor not updated", response.contains("test-hm-new"));

			// verify name is updated or not
			JSONObject dataHmUpdated = testingVRO.getObjectDataByUUID("healthmonitor", uuid);
			String nameUpdated = (String) dataHmUpdated.get("name");
			assertTrue("Hm not updated", name != nameUpdated);

			// delete hm
			String hmData = "{\n" + "\"name\": \"test-hm-new\"\n" + "}";
			testingVRO.delete("healthmonitor", hmData);
			testingVRO.executeWorkflow();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}