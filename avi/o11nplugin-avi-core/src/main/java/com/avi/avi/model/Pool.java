package com.avi.avi.model;

import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.json.simple.JSONValue;
//import org.json.simple.JSONArray;

import java.nio.charset.Charset;
import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.apache.commons.codec.binary.Base64;



public class Pool {
	
	// Store response as string
	private String data;
	
	// Pool enum properties declaration
	private enum LBAlgorithmType {LB_ALGORITHM_LEAST_CONNECTIONS};
	private enum LBAlgorithmHashType  {LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS};
	
	// Pool properties go here
	private String  name;
	private Boolean enabled;
	private String tenantRef;
	private String cloudRef;
	private LBAlgorithmType LBAlgorithm;
	private Boolean useServicePort;
	private Boolean rewriteHostHeaderToServerName;
	private Boolean hostCheckEnabled;
	private Boolean rewriteHostHeaderToSni;
	private Boolean deleteServerOnDnsRefresh;
	private Boolean capacityEstimation;
	private Integer fewestTasksFeedbackDelay;
	private Integer capacityEstimationTtfbThresh;
	private Boolean lookupServerByName;
	private LBAlgorithmHashType LBAlgorithmHash;
	private String analyticsProfileRef;
	private Integer lbAlgorithmCoreNonaffinity;
	private Integer gracefulDisableTimeout;
	private String vrfRef;
	private Boolean inlineHealthMonitor;
	private Integer defaultServerPort;
	private Integer requestQueueDepth;
	private Boolean sniEnabled;
	private Integer serverTimeout;
	private Boolean requestQueueEnabled;
	private Integer maxConcurrentConnectionsPerServer;
	private Integer connectionRampDuration;
	
	public String  setName(String value){
		this.name = value;
		return this.name;
	}
	
	public Boolean setEnabled(Boolean value){
		this.enabled = value;
		return this.enabled;
	}
	
	public String setTenantRef(String value){
		this.tenantRef = value;
		return this.tenantRef;
	}
	
	
	public String setCloudRef(String value){
		this.cloudRef = value;
		return this.cloudRef;
	}
	
	public Boolean setLBAlgorithm(String value){
		this.LBAlgorithm = LBAlgorithmType.valueOf(value);
		return true;
	}
	public Boolean setUseServicePort(Boolean value){
		this.useServicePort = value;
		return this.useServicePort;
	}
	
	public Boolean setRewriteHostHeaderToServerName(Boolean value){
		this.rewriteHostHeaderToServerName = value;
		return this.rewriteHostHeaderToServerName;
	}
	
	public Boolean setHostCheckEnabled(Boolean value){
		this.hostCheckEnabled = value;
		return this.hostCheckEnabled;
	}
	
	public Boolean setRewriteHostHeaderToSni(Boolean value){
		this.rewriteHostHeaderToSni = value;
		return this.rewriteHostHeaderToSni;
	}
	
	public Boolean setDeleteServerOnDnsRefresh(Boolean value){
		this.deleteServerOnDnsRefresh = value;
		return this.deleteServerOnDnsRefresh;
	}
	
	public Boolean setCapacityEstimation(Boolean value){
		this.capacityEstimation = value;
		return this.capacityEstimation;
	}
	
	public Integer setFewestTasksFeedbackDelay(Integer value){
		this.fewestTasksFeedbackDelay = value;
		return this.fewestTasksFeedbackDelay;
	}

	public Integer setCapacityEstimationTtfbThresh(Integer value){
		this.capacityEstimationTtfbThresh = value;
		return this.capacityEstimationTtfbThresh;
	}
	
	public Boolean setLookupServerByName(Boolean value){
		this.lookupServerByName = value;
		return this.lookupServerByName;
	}
	
	public Boolean setLBAlgorithmHash(String value){
		this.LBAlgorithmHash = LBAlgorithmHashType.valueOf(value);
		return true;
	}
	
	public String setAnalyticsProfileRef(String value){
		this.analyticsProfileRef = value;
		return this.analyticsProfileRef;
	}
	
	public Integer setLBAlgorithmCoreNonaffinity(Integer value){
		this.lbAlgorithmCoreNonaffinity = value;
		return this.lbAlgorithmCoreNonaffinity;
	}
	
	public Integer setGracefulDisableTimeout(Integer value){
		this.gracefulDisableTimeout = value;
		return this.gracefulDisableTimeout;
	}
	
	public Boolean setInlineHealthMonitor(Boolean value){
		this.inlineHealthMonitor = value;
		return this.inlineHealthMonitor;
	}
	
	public Integer setDefaultServerPort(Integer value){
		this.defaultServerPort = value;
		return this.defaultServerPort;
	}
	
	public Integer setRequestQueueDepth(Integer value){
		this.requestQueueDepth = value;
		return this.requestQueueDepth;
	}
	
	public Boolean setSniEnabled(Boolean value){
		this.sniEnabled = value;
		return this.sniEnabled;
	}
	
	public Integer setServerTimeout(Integer value){
		this.serverTimeout = value;
		return this.serverTimeout;
	}
	
	public Boolean setRequestQueueEnabled(Boolean value){
		this.requestQueueEnabled = value;
		return this.requestQueueEnabled;
	}
	
	public Integer setMaxConcurrentConnectionsPerServer(Integer value){
		this.maxConcurrentConnectionsPerServer = value;
		return this.maxConcurrentConnectionsPerServer;
	}
	
	public Integer setConnectionRampDuration(Integer value){
		this.connectionRampDuration = value;
		return this.connectionRampDuration;
	}
	
	// Property getter functions go here
	public String  getName(){
		return this.name;
	}
	
	public Boolean getEnabled(){
		return this.enabled;
	}
	
	public String getTenantRef(){
		return this.tenantRef;
	}
	
	public String getCloudRef(){
		return this.cloudRef;
	}
	
	public LBAlgorithmType getLBAlgorithm(){
		return this.LBAlgorithm;
	}
	public Boolean getUseServicePort(){
		return this.useServicePort;
	}
	
	public Boolean getRewriteHostHeaderToServerName(){
		return this.rewriteHostHeaderToServerName;
	}
	
	public Boolean getHostCheckEnabled(){
		return this.hostCheckEnabled;
	}
	
	public Boolean getRewriteHostHeaderToSni(){
		return this.rewriteHostHeaderToSni;
	}
	
	public Boolean getDeleteSErverOnDnsRefresh(){
		return this.deleteServerOnDnsRefresh;
	}
	
	public Boolean getCapacityEstimation(){
		return this.capacityEstimation;
	}
	
	public Integer getFewestTasksFeedbackDelay(){
		return this.fewestTasksFeedbackDelay;
	}

	public Integer getCapacityEstimationTtfbThresh(){
		return this.capacityEstimationTtfbThresh;
	}
		
	public Boolean getLookupServerByName(){
		return this.lookupServerByName;
	}
	
	public LBAlgorithmHashType getLBAlgorithmHash(){
		return this.LBAlgorithmHash;
	}
	
	public String getAnalyticsProfileRef(){
		return this.analyticsProfileRef;
	}
	
	public Integer getLBAlgorithmCoreNonaffinity(){
		return this.lbAlgorithmCoreNonaffinity;
	}
	
	public Integer getGracefulDisableTimeout(){
		return this.gracefulDisableTimeout;
	}
	
	public Boolean getInlineHealthMonitor(){
		return this.inlineHealthMonitor;
	}
	
	public Integer getDefaultServerPort(){
		return this.defaultServerPort;
	}
	
	public Integer getRequestQueueDepth(){
		return this.requestQueueDepth;
	}
	
	public Boolean getSniEnabled(){
		return this.sniEnabled;
	}
	
	public Integer getServerTimeout(){
		return this.serverTimeout;
	}
	
	public Boolean getRequestQueueEnabled(){
		return this.requestQueueEnabled;
	}
	
	public Integer getMaxConcurrentConnectionsPerServer(){
		return this.maxConcurrentConnectionsPerServer;
	}
	
	public Integer getConnectionRampDuration(){
		return this.connectionRampDuration;
	}
	
	
	public String getPoolObject() throws IOException {
		JSONObject jsonData = new JSONObject();
		jsonData.put("name", this.name);
		jsonData.put("enabled", this.enabled);
		jsonData.put("tenant_ref", this.tenantRef);
		jsonData.put("cloud_ref", this.cloudRef);
		jsonData.put("lb_Algorithm", this.LBAlgorithm);
		jsonData.put("lb_Algorithm_hash", this.LBAlgorithmHash);
		jsonData.put("default_server_port", this.defaultServerPort);
		jsonData.put("use_service_port", this.useServicePort);
		jsonData.put("rewrite_host_header_to_server_name", this.rewriteHostHeaderToServerName);
		jsonData.put("host_check_enabled", this.hostCheckEnabled);
		jsonData.put("rewrite_host_header_to_sni", this.rewriteHostHeaderToSni);
		jsonData.put("capacity_estimation", this.capacityEstimation);
		jsonData.put("fewest_tasks_feedback_delay", this.fewestTasksFeedbackDelay);
		jsonData.put("capacity_estimation_ttfb_thresh", this.capacityEstimationTtfbThresh);
		jsonData.put("lookup_server_by_name", this.lookupServerByName);
		jsonData.put("analytics_profile_ref", this.analyticsProfileRef);
		jsonData.put("lbAlgorithm_core_nonaffinity", this.lbAlgorithmCoreNonaffinity);
		jsonData.put("graceful_disable_timeout", this.gracefulDisableTimeout);
		jsonData.put("vrf_ref", this.vrfRef);
		jsonData.put("inline_health_monitor", this.inlineHealthMonitor);
		jsonData.put("request_queue_depth", this.requestQueueDepth);
		jsonData.put("sni_enabled", this.sniEnabled);
		jsonData.put("server_timeout", this.serverTimeout);
		jsonData.put("request_queue_enabled", this.requestQueueEnabled);
		jsonData.put("max_concurrent_connections_per_server", this.maxConcurrentConnectionsPerServer);
		jsonData.put("connection_ramp_duration", this.connectionRampDuration);
		this.data = JSONValue.toJSONString(jsonData);
		return data;
	
	}
	
	public String createObject(String controllerIP, String username, String password) throws IOException {
		
		// Set all values
		this.getPoolObject();
		
		String postUrl = controllerIP + "/api/pool/";
		String auth = username + ":" + password;		   
		byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
		String authHeader = "Basic " + new String(encodedAuth);
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", authHeader);
		headers.set("X-Avi-Version", "18.2.3");
		headers.setContentType(MediaType.APPLICATION_JSON);
	   	   
		HttpEntity<String> request = new HttpEntity<String>(data, headers);
	   	   
		ResponseEntity<String>  response = restTemplate.exchange(postUrl, HttpMethod.POST, request, String.class);
		this.data = response.getBody();
		return data;
		
	}
	

	public String deleteObject(String controllerIP, String username, String password) throws IOException {
		
		JSONObject jObject = new JSONObject(data);
		String uuid = (String) jObject.get("uuid");
		String postUrl = controllerIP + "/api/pool/"+ uuid;
		
		String auth = username + ":" + password;		   
		byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
		String authHeader = "Basic " + new String(encodedAuth);
		   		   
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", authHeader);
		headers.set("X-Avi-Version", "18.2.3");
		   
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> request = new HttpEntity<String>(headers);  		     
		
		ResponseEntity<String>  response = restTemplate.exchange(postUrl, HttpMethod.DELETE, request, String.class);
		String result = response.getStatusCode().toString();
		
		return "Object Deleted!"+ result;				  
	}
	
}