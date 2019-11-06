package com.vmware.avi.vro.model;

import org.json.JSONObject;
import org.json.simple.JSONValue;
import java.io.IOException;
import java.util.ArrayList;

import com.vmware.avi.vro.AviSession;


public class VirtualService {
	
	//Get AVI session class from AviSession
	public AviSession service = new AviSession();
	
	// For convert all values into JSON object 
	JSONObject jsonData = new JSONObject();
	
	// For store response as string
	private String data;
	
	// Set all attributes
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
	@SuppressWarnings("rawtypes")
	private ArrayList servicePort = new ArrayList();
	@SuppressWarnings("rawtypes")
	private ArrayList vip = new ArrayList(); 
	
	
	@SuppressWarnings("unchecked")
	public void setVip(String value){
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
	}
	
	
	@SuppressWarnings("unchecked")
	public void setServicePort(Integer value) { 
		JSONObject serv = new JSONObject();
		serv.put("enable_ssl", false);
		serv.put("port_range_end", value);
		serv.put("port", value);
		servicePort.add(serv);
	}
	
	public void setNetworkProfileRef(String value){
	    this.networkProfileRef = value;
	}
	
	
	public void setWeight(Integer value){
	    this.weight = value;
	    
	}
	
	public void setEnabled(Boolean value){
	    this.enabled = value;
	}
	
	public void setFlowDist(String value){
	    this.flowDist = value;
	}
	
	public void setDelayFairness(Boolean value){
	    this.delayFairness = value;
	}
	
	public void setMarkedForDelete(Boolean value){
	    this.markedForDelete = value;
	}
	
	public void setVrfContextRef(String value){
	    this.vrfContextRef = value;
	}
	
	public void setAnalyticsProfileRef(String value){
	    this.analyticsProfileRef = value;
	}
	
	
	public void setCloudRef(String value){
	    this.cloudRef = value;
	}
	

	public void setSeGroupRef(String value){
	    this.seGroupRef = value;
	}
	
	public void setScaleoutEcmp(Boolean value){
	    this.scaleoutEcmp = value;
	}
	
	public void setMaxCpsPerClient(Integer value){
	    this.maxCpsPerClient = value;
	}
	
	public void setRedisDb(Integer value){
	    this.redisDb = value;
	}
	
	public void setVersion(String value){
	    this.version = value;
	}
	
	public void setSslSessCacheAvgSize(Integer value){
	    this.sslSessCacheAvgSize = value;
	}
	
	public void setUseBridgeIpAsVip(Boolean value){
	    this.useBridgeIpAsVip = value;
	}
	
	public void setApplicationProfileRef(String value){
	    this.applicationProfileRef = value;
	}
	
	
	public void setSelfSeElection(Boolean value){
	    this.selfSeElection = value;
	}
	
	public void setPoolRef(String value){
		this.poolRef = value;
	}
	
	public void setIgnPoolNetReach(Boolean value){
	    this.ignPoolNetReach = value;
	}
	
	public void setEastWestPlacement(Boolean value){
	    this.eastWestPlacement = value;
	}
	
	public void setLimitDoser(Boolean value){
	    this.limitDoser = value;
	}
	
	public void setName(String value){
	    this.name = value;
	}
	

	public void setEnableAutogw(Boolean value){
	    this.enableAutogw = value;
	}
	
	public void setTenantRef(String value){
	    this.tenantRef = value;
	}
	
	public void setRemoveListeningPortOnVsDown(String value){
	    this.removeListeningPortOnVsDown = value;
	}
	
	
	public void setRedisPort(Integer value){
	    this.redisPort = value;
	}
	
	public void setNetworkSecurityPolicyRef(String value){
	    this.networkSecurityPolicyRef = value;
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
	
	@SuppressWarnings("rawtypes")
	public ArrayList getVip(){
		return this.vip;
	}
	
	@SuppressWarnings("rawtypes")
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