package com.vmware.avi.vro.model;

import org.json.JSONObject;
import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.io.IOException;

import com.vmware.avi.vro.AviSession;



public class Pool {
	
	// Set rest call 
	private AviSession service = new AviSession();
	
	// Store response as string
	private String data;
	
	// Set all data into JSON Object
	JSONObject jsonData = new JSONObject();
	
	// Pool enum properties declaration
	private enum LBAlgorithmType {LB_ALGORITHM_LEAST_CONNECTIONS};
	private enum LBAlgorithmHashType  {LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS};
	
	// Pool properties go here
	private String  name;
	private Boolean enabled;
	private String tenantRef;
	private String cloudRef;
	private LBAlgorithmType LBAlgorithm;
	private LBAlgorithmHashType LBAlgorithmHash;
	private Boolean useServicePort;
	private Boolean rewriteHostHeaderToServerName;
	private Boolean hostCheckEnabled;
	private Boolean rewriteHostHeaderToSni;
	private Boolean deleteServerOnDnsRefresh;
	private Boolean capacityEstimation;
	private Integer fewestTasksFeedbackDelay;
	private Integer capacityEstimationTtfbThresh;
	private Boolean lookupServerByName;
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
	private ArrayList<String> healthMonitorRefs = new ArrayList<String>();
	
	public void  setName(String value){
		this.name = value;
	}
	
	public void setEnabled(Boolean value){
		this.enabled = value;
	}
	
	public void setTenantRef(String value){
		this.tenantRef = value;
	}
	
	
	public void setCloudRef(String value){
		this.cloudRef = value;
	}
	
	public void setLBAlgorithm(String value){
		this.LBAlgorithm = LBAlgorithmType.valueOf(value);
	}
	
	public void setUseServicePort(Boolean value){
		this.useServicePort = value;
	}
	
	public void setRewriteHostHeaderToServerName(Boolean value){
		this.rewriteHostHeaderToServerName = value;
	}
	
	public void setHostCheckEnabled(Boolean value){
		this.hostCheckEnabled = value;
	}
	
	public void setRewriteHostHeaderToSni(Boolean value){
		this.rewriteHostHeaderToSni = value;
	}
	
	public void setDeleteServerOnDnsRefresh(Boolean value){
		this.deleteServerOnDnsRefresh = value;
	}
	
	public void setCapacityEstimation(Boolean value){
		this.capacityEstimation = value;
	}
	
	public void setFewestTasksFeedbackDelay(Integer value){
		this.fewestTasksFeedbackDelay = value;
	}

	public void setCapacityEstimationTtfbThresh(Integer value){
		this.capacityEstimationTtfbThresh = value;
	}
	
	public void setLookupServerByName(Boolean value){
		this.lookupServerByName = value;
	}
	
	public void setLBAlgorithmHash(String value){
		this.LBAlgorithmHash = LBAlgorithmHashType.valueOf(value);
	}
	
	public void setAnalyticsProfileRef(String value){
		this.analyticsProfileRef = value;
	}
	
	public void setLBAlgorithmCoreNonaffinity(Integer value){
		this.lbAlgorithmCoreNonaffinity = value;
	}
	
	public void setGracefulDisableTimeout(Integer value){
		this.gracefulDisableTimeout = value;
	}
	
	public void setInlineHealthMonitor(Boolean value){
		this.inlineHealthMonitor = value;
	}
	
	@SuppressWarnings("unchecked")
	public void setHealthMonitorRefs(String value) {
		healthMonitorRefs.add(value);
	}
	
	public void setDefaultServerPort(Integer value){
		this.defaultServerPort = value;
	}
	
	public void setRequestQueueDepth(Integer value){
		this.requestQueueDepth = value;
	}
	
	public void setSniEnabled(Boolean value){
		this.sniEnabled = value;
	}
	
	public void setServerTimeout(Integer value){
		this.serverTimeout = value;
	}
	
	public void setRequestQueueEnabled(Boolean value){
		this.requestQueueEnabled = value;
	}
	
	public void setMaxConcurrentConnectionsPerServer(Integer value){
		this.maxConcurrentConnectionsPerServer = value;
	}
	
	public void setConnectionRampDuration(Integer value){
		this.connectionRampDuration = value;
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
	
	public ArrayList<String> getHealthMonitorRefs() {
		return this.healthMonitorRefs;
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
		jsonData.put("health_monitor_refs", this.healthMonitorRefs);
		jsonData.put("request_queue_depth", this.requestQueueDepth);
		jsonData.put("sni_enabled", this.sniEnabled);
		jsonData.put("server_timeout", this.serverTimeout);
		jsonData.put("request_queue_enabled", this.requestQueueEnabled);
		jsonData.put("max_concurrent_connections_per_server", this.maxConcurrentConnectionsPerServer);
		jsonData.put("connection_ramp_duration", this.connectionRampDuration);
		this.data = JSONValue.toJSONString(jsonData);
		return data;
	
	}
		
	public String getObject(String controllerIP, String username, String password, String objectType, String objectName) throws IOException {
		return service.getObject(controllerIP, username, password, objectType, objectName);	
	}
	
	public String createObject(String controllerIP, String username, String password, String objectType) throws IOException{
		this.getPoolObject();
		return service.createObject(controllerIP, username, password, objectType, this.data);
	}
	
	public String deleteObject(String controllerIP, String username, String password, String objectType) throws IOException {
		return service.deleteObject(controllerIP, username, password, objectType, this.data);
	}
		
}
