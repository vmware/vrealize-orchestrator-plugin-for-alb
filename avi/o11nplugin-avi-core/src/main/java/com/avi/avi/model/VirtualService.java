package com.avi.avi.model;

import org.json.JSONObject;
import org.json.simple.JSONValue;
import java.io.IOException;
import java.util.ArrayList;

//import java.nio.charset.Charset;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//
//import org.springframework.web.client.RestTemplate;
//import org.apache.commons.codec.binary.Base64;
import com.avi.avi.model.AviSession;


public class VirtualService {
	
	//Get AVI session class from AviSession
	public AviSession service = new AviSession();
	
	//All attributes
	JSONObject jsonData = new JSONObject();
	private String data;
	
	private String  networkProfileRef;
	private Integer weight; 
	private Boolean enabled;
	private String  flowDist;
	private Boolean delayFairness;
	private Boolean markedForDelete;
	private String  vrfContextRef;
	private String  analyticsProfileRef;
	private String  cloudRef;
	private String  seGroupRef; 
	private Boolean scaleoutEcmp; 
	private Integer maxCpsPerClient;
	private Integer redisDb; 
	private String  version; 
	private Integer sslSessCacheAvgSize; 
	private Boolean useBridgeIpAsVip; 
	private String  applicationProfileRef; 
	private Boolean selfSeElection; 
	private String  poolRef; 
	private Boolean ignPoolNetReach; 
	private Boolean eastWestPlacement;
	private Boolean limitDoser; 
	private String  name; 
	private Boolean enableAutogw; 
	private String  tenantRef; 
	private String  removeListeningPortOnVsDown;
	private Integer redisPort; 
	private String  networkSecurityPolicyRef;
//	private JSONArray servicePort = new JSONArray();
//	private JSONArray vip = new JSONArray();
	private ArrayList servicePort = new ArrayList(); 
	private ArrayList vip = new ArrayList(); 

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ArrayList setVip(String value){
		JSONObject singleVip = new JSONObject();
		JSONObject ip = new JSONObject();
		ip.put("type", "V4");
		ip.put("addr", value);	
		singleVip.put("vip_id", 1);
		singleVip.put("avi_allocated_fip", false);
		singleVip.put("auto_allocate_ip", false);
		singleVip.put("enabled", true);
		singleVip.put("auto_allocate_floating_ip", false);
		singleVip.put("avi_allocated_vip", false);
		singleVip.put("auto_allocate_ip_type", "V4_ONLY");	
		singleVip.put("ip_address", ip);
		vip.add(singleVip);
		return vip;
	}
	
	@SuppressWarnings({"unchecked", "rawtypes"})
	public ArrayList setServicePort(Integer value) { 
		JSONObject serv = new JSONObject();
		serv.put("enable_ssl", false);
		serv.put("port_range_end", value);
		serv.put("port", value);
		servicePort.add(serv);
		return servicePort;
	}
	
	public String setNetworkProfileRef(String value){
	    this.networkProfileRef = value;
	    return this.networkProfileRef;
	}
	
	
	public Integer setWeight(Integer value){
	    this.weight = value;
	    return this.weight;
	    
	}
	
	public Boolean setEnabled(Boolean value){
	    this.enabled = value;
	    return this.enabled;
	}
	
	public String setFlowDist(String value){
	    this.flowDist = value;
	    return this.flowDist;
	}
	
	public Boolean setDelayFairness(Boolean value){
	    this.delayFairness = value;
	    return this.delayFairness;
	}
	
	public Boolean setMarkedForDelete(Boolean value){
	    this.markedForDelete = value;
	    return this.markedForDelete;
	}
	
	public String setVrfContextRef(String value){
	    this.vrfContextRef = value;
	    return this.vrfContextRef;
	}
	
	public String setAnalyticsProfileRef(String value){
	    this.analyticsProfileRef = value;
	    return this.analyticsProfileRef;
	}
	
	
	public String setCloudRef(String value){
	    this.cloudRef = value;
	    return this.cloudRef;
	}
	

	public String setSeGroupRef(String value){
	    this.seGroupRef = value;
	    return this.seGroupRef;
	}
	
	public Boolean setScaleoutEcmp(Boolean value){
	    this.scaleoutEcmp = value;
	    return this.scaleoutEcmp;
	}
	
	public Integer setMaxCpsPerClient(Integer value){
	    this.maxCpsPerClient = value;
	    return this.maxCpsPerClient;
	}
	
	public Integer setRedisDb(Integer value){
	    this.redisDb = value;
	    return this.redisDb;
	}
	
	public String setVersion(String value){
	    this.version = value;
	    return this.version;
	}
	
	public Integer setSslSessCacheAvgSize(Integer value){
	    this.sslSessCacheAvgSize = value;
	    return this.sslSessCacheAvgSize;
	}
	
	public Boolean setUseBridgeIpAsVip(Boolean value){
	    this.useBridgeIpAsVip = value;
	    return this.useBridgeIpAsVip;
	}
	
	public String setApplicationProfileRef(String value){
	    this.applicationProfileRef = value;
	    return this.applicationProfileRef;
	}
	
	
	public Boolean setSelfSeElection(Boolean value){
	    this.selfSeElection = value;
	    return this.selfSeElection;
	}
	
	public String setPoolRef(String value){
		this.poolRef = value;
	    return this.poolRef;
	}
	
	public Boolean setIgnPoolNetReach(Boolean value){
	    this.ignPoolNetReach = value;
	    return this.ignPoolNetReach;
	}
	
	public Boolean setEastWestPlacement(Boolean value){
	    this.eastWestPlacement = value;
	    return this.eastWestPlacement;
	}
	
	public Boolean setLimitDoser(Boolean value){
	    this.limitDoser = value;
	    return this.limitDoser;
	}
	
	public String setName(String value){
	    this.name = value;
	    return this.name;
	}
	

	public Boolean setEnableAutogw(Boolean value){
	    this.enableAutogw = value;
	    return this.enableAutogw;
	}
	
	public String setTenantRef(String value){
	    this.tenantRef = value;
	    return this.tenantRef;
	}
	
	public String setRemoveListeningPortOnVsDown(String value){
	    this.removeListeningPortOnVsDown = value;
	    return this.removeListeningPortOnVsDown;
	}
	
	
	public Integer setRedisPort(Integer value){
	    this.redisPort = value;
	    return this.redisPort;
	}
	
	public String setNetworkSecurityPolicyRef(String value){
	    this.networkSecurityPolicyRef = value;
	    return this.networkSecurityPolicyRef;
	}

	// Set getter methods
	public String getNetworkProfileRef(){
	    return this.networkProfileRef;
	}
	
	public Integer getWeight(){
	    return this.weight;
	}
	
	
	public Boolean getEnabled(){
	    return this.enabled;
	}
	
	
	public String getFlowDist(){
	    return this.flowDist;
	}
	
	
	public Boolean getDelayFairness(){
	    return this.delayFairness;
	}
	
	
	public Boolean get_marked_for_delete(){
	    return this.markedForDelete;
	}
	
	
	public String getVrfContextRef(){
	    return this.vrfContextRef;
	}
	
	
	public String getAnalyticsProfileRef(){
	    return this.analyticsProfileRef;
	}
	
	
	public String getCloudRef(){
	    return this.cloudRef;
	}
	
	
	public String getSeGroupRef(){
	    return this.seGroupRef;
	}
	
	
	public Boolean getScaleoutEcmp(){
	    return this.scaleoutEcmp;
	}
	
	
	public Integer getMaxCpsPerClient(){
	    return this.maxCpsPerClient;
	}
	
	
	public Integer getRedisDb(){
	    return this.redisDb;
	}
	
	
	public String getVersion(){
	    return this.version;
	}
	
	
	public Integer getSslSessCacheAvgSize(){
	    return this.sslSessCacheAvgSize;
	}
	
	
	public Boolean getUseBridgeIpAsVip(){
	    return this.useBridgeIpAsVip;
	}
	
	
	public String getApplicationProfileRef(){
	    return this.applicationProfileRef;
	}
	
	
	public Boolean getSelfSeElection(){
	    return this.selfSeElection;
	}
	
	public String getPoolRef(){
	    return this.poolRef;
	}
	
	
	public Boolean getIgnPoolNetReach(){
	    return this.ignPoolNetReach;
	}
	
	
	public Boolean getEastWestPlacement(){
	    return this.eastWestPlacement;
	}
	
	
	public Boolean getLimitDoser(){
	    return this.limitDoser;
	}
	
	
	public String getName(){
	    return this.name;
	}
	
		
	public Boolean getEnableAutogw(){
	    return this.enableAutogw;
	}
		
	public String getTenantRef(){
	    return this.tenantRef;
	}
	
	
	public String getRemoveListeningPortOnVsDown(){
	    return this.removeListeningPortOnVsDown;
	}
	
	
	public Integer getRedisPort(){
	    return this.redisPort;
	}
	
	public ArrayList getVip(){
		return this.vip;
	}
	
	public ArrayList getServicePort() { 
		return this.servicePort;
	}
	
	public String getNetworkSecurityPolicyRef(){
	    return this.networkSecurityPolicyRef;
	}	
	
	
	public String getVirtualServiceObject() {
		jsonData.put("name", this.name);
		jsonData.put("enabled", this.enabled);
		jsonData.put("tenant_ref", this.tenantRef);
		jsonData.put("cloud_ref", this.cloudRef);
		jsonData.put("pool_ref", this.poolRef);
		jsonData.put("network_profile_ref", this.networkProfileRef);
		jsonData.put("weight", this.weight);
		jsonData.put("flow_dist", this.flowDist);
		jsonData.put("delay_fairness", this.delayFairness);
		jsonData.put("marked_for_delete", this.markedForDelete);
		jsonData.put("vrf_context_ref", this.vrfContextRef);
		jsonData.put("analytics_profile_ref", this.analyticsProfileRef);
		jsonData.put("se_group_ref", this.seGroupRef);
		jsonData.put("scaleout_ecmp", this.scaleoutEcmp);
		jsonData.put("max_cps_per_client", this.maxCpsPerClient);
		jsonData.put("redis_db", this.redisDb);
		jsonData.put("version", this.version);
		jsonData.put("ssl_sess_cache_avg_size", this.sslSessCacheAvgSize);
		jsonData.put("use_bridge_ip_as_vip", this.useBridgeIpAsVip);
		jsonData.put("application_profile_ref", this.applicationProfileRef);
		jsonData.put("self_se_election", this.selfSeElection);
		jsonData.put("ign_pool_net_reach", this.ignPoolNetReach);
		jsonData.put("east_west_placement", this.eastWestPlacement);
		jsonData.put("limit_doser", this.limitDoser);
		jsonData.put("enable_autogw", this.enableAutogw);
		jsonData.put("remove_listening_port_on_vs_down", this.removeListeningPortOnVsDown);
		jsonData.put("redis_port", this.redisPort);
		jsonData.put("network_security_policy_ref", this.networkSecurityPolicyRef);
		jsonData.put("vip", this.vip);
		jsonData.put("services", this.servicePort);
		this.data = JSONValue.toJSONString(jsonData);
		return data;
	}
	
	public String getObject(String controllerIP, String username, String password, String objectType, String objectName) throws IOException {
		return service.getObject(controllerIP, username, password, objectType, objectName);
	}
	
	public String createObject(String controllerIP, String username, String password, String objectType) throws IOException {
		this.getVirtualServiceObject();
		return service.createObject(controllerIP, username, password, objectType, this.data);
	}
	
	public String deleteObject(String controllerIP, String username, String password, String objectType) throws IOException {
		return service.deleteObject(controllerIP, username, password, objectType, this.data);
	}
		
}