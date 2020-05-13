package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AlertRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * AlertConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AlertConfig")
@VsoFinder(name = Constants.FINDER_VRO_ALERTCONFIG, idAccessor = "getObjectID()")
@Service
public class AlertConfig extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("action_group_ref")
  private String actionGroupRef = null;

  @JsonProperty("alert_rule")
  private AlertRule alertRule = null;

  @JsonProperty("autoscale_alert")
  private Boolean autoscaleAlert = null;

  @JsonProperty("category")
  private String category = "REALTIME";

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("expiry_time")
  private Integer expiryTime = 86400;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("obj_uuid")
  private String objUuid = null;

  @JsonProperty("object_type")
  private String objectType = null;

  @JsonProperty("recommendation")
  private String recommendation = null;

  @JsonProperty("rolling_window")
  private Integer rollingWindow = 300;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("threshold")
  private Integer threshold = 1;

  @JsonProperty("throttle")
  private Integer throttle = 600;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * The alert config will trigger the selected alert action, which can send notifications and execute a controlscript. It is a reference to an object of type ActionGroupConfig.
   * @return actionGroupRef
  **/
  @ApiModelProperty(value = "The alert config will trigger the selected alert action, which can send notifications and execute a controlscript. It is a reference to an object of type ActionGroupConfig.")


 
  @VsoMethod  
  public String getActionGroupRef() {
    return actionGroupRef;
  }
    
  @VsoMethod
  public void setActionGroupRef(String actionGroupRef) {
    this.actionGroupRef = actionGroupRef;
  }

  
  /**
   * list of filters matching on events or client logs used for triggering alerts.
   * @return alertRule
  **/
  @ApiModelProperty(required = true, value = "list of filters matching on events or client logs used for triggering alerts.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public AlertRule getAlertRule() {
    return alertRule;
  }
    
  @VsoMethod
  public void setAlertRule(AlertRule alertRule) {
    this.alertRule = alertRule;
  }

  
  /**
   * This alert config applies to auto scale alerts.
   * @return autoscaleAlert
  **/
  @ApiModelProperty(value = "This alert config applies to auto scale alerts.")


 
  @VsoMethod  
  public Boolean isAutoscaleAlert() {
    return autoscaleAlert;
  }
    
  @VsoMethod
  public void setAutoscaleAlert(Boolean autoscaleAlert) {
    this.autoscaleAlert = autoscaleAlert;
  }

  
  /**
   * Determines whether an alert is raised immediately when event occurs (realtime) or after specified number of events occurs within rolling time window. Enum options - REALTIME, ROLLINGWINDOW, WATERMARK.
   * @return category
  **/
  @ApiModelProperty(required = true, value = "Determines whether an alert is raised immediately when event occurs (realtime) or after specified number of events occurs within rolling time window. Enum options - REALTIME, ROLLINGWINDOW, WATERMARK.")
  @NotNull


 
  @VsoMethod  
  public String getCategory() {
    return category;
  }
    
  @VsoMethod
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * A custom description field.
   * @return description
  **/
  @ApiModelProperty(value = "A custom description field.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Enable or disable this alert config from generating new alerts.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable or disable this alert config from generating new alerts.")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * An alert is expired and deleted after the expiry time has elapsed.  The original event triggering the alert remains in the event's log. Allowed values are 1-31536000.
   * @return expiryTime
  **/
  @ApiModelProperty(value = "An alert is expired and deleted after the expiry time has elapsed.  The original event triggering the alert remains in the event's log. Allowed values are 1-31536000.")


 
  @VsoMethod  
  public Integer getExpiryTime() {
    return expiryTime;
  }
    
  @VsoMethod
  public void setExpiryTime(Integer expiryTime) {
    this.expiryTime = expiryTime;
  }

  
  /**
   * Name of the alert configuration.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the alert configuration.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * UUID of the resource for which alert was raised.
   * @return objUuid
  **/
  @ApiModelProperty(value = "UUID of the resource for which alert was raised.")


 
  @VsoMethod  
  public String getObjUuid() {
    return objUuid;
  }
    
  @VsoMethod
  public void setObjUuid(String objUuid) {
    this.objUuid = objUuid;
  }

  
  /**
   * The object type to which the Alert Config is associated with. Valid object types are - Virtual Service, Pool, Service Engine. Enum options - VIRTUALSERVICE, POOL, HEALTHMONITOR, NETWORKPROFILE, APPLICATIONPROFILE, HTTPPOLICYSET, DNSPOLICY, SECURITYPOLICY, IPADDRGROUP, STRINGGROUP, SSLPROFILE, SSLKEYANDCERTIFICATE, NETWORKSECURITYPOLICY, APPLICATIONPERSISTENCEPROFILE, ANALYTICSPROFILE, VSDATASCRIPTSET, TENANT, PKIPROFILE, AUTHPROFILE, CLOUD, SERVERAUTOSCALEPOLICY, AUTOSCALELAUNCHCONFIG, MICROSERVICEGROUP, IPAMPROFILE, HARDWARESECURITYMODULEGROUP, POOLGROUP, PRIORITYLABELS, POOLGROUPDEPLOYMENTPOLICY, GSLBSERVICE, GSLBSERVICERUNTIME, SCHEDULER, GSLBGEODBPROFILE, GSLBAPPLICATIONPERSISTENCEPROFILE, TRAFFICCLONEPROFILE, VSVIP, WAFPOLICY, WAFPROFILE, ERRORPAGEPROFILE, ERRORPAGEBODY, L4POLICYSET, GSLBSERVICERUNTIMEBATCH, WAFPOLICYPSMGROUP, PINGACCESSAGENT, NETWORKSERVICE, NATPOLICY, SSOPOLICY, PROTOCOLPARSER, EXAMPLECHILD, TESTSEDATASTORELEVEL1, TESTSEDATASTORELEVEL2, TESTSEDATASTORELEVEL3, FILEOBJECT, IPREPUTATIONDB, SERVICEENGINE, DEBUGSERVICEENGINE, DEBUGCONTROLLER, DEBUGVIRTUALSERVICE, SERVICEENGINEGROUP, SEPROPERTIES, NETWORK, CONTROLLERNODE, CONTROLLERPROPERTIES, SYSTEMCONFIGURATION, VRFCONTEXT, USER, ALERTCONFIG, ALERTSYSLOGCONFIG, ALERTEMAILCONFIG, ALERTTYPECONFIG, APPLICATION, ROLE, CLOUDPROPERTIES, SNMPTRAPPROFILE, ACTIONGROUPPROFILE, MICROSERVICE, ALERTPARAMS, ACTIONGROUPCONFIG, CLOUDCONNECTORUSER, GSLB, GSLBDNSUPDATE, GSLBSITEOPS, GLBMGRWARMSTART, IPAMDNSRECORD, GSLBDNSGSSTATUS, GSLBDNSGEOFILEOPS, GSLBDNSGEOUPDATE, GSLBDNSGEOCLUSTEROPS, GSLBDNSCLEANUP, GSLBSITEOPSRESYNC, IPAMDNSPROVIDERPROFILE, ALBSERVICESCONFIG, TCPSTATRUNTIME, UDPSTATRUNTIME, IPSTATRUNTIME, ARPSTATRUNTIME, MBSTATRUNTIME, IPSTKQSTATSRUNTIME, MALLOCSTATRUNTIME, SHMALLOCSTATRUNTIME, CPUUSAGERUNTIME, L7GLOBALSTATSRUNTIME, L7VIRTUALSERVICESTATSRUNTIME, SEAGENTVNICDBRUNTIME, SEAGENTGRAPHDBRUNTIME, SEAGENTSTATERUNTIME, INTERFACERUNTIME, ARPTABLERUNTIME, DISPATCHERSTATRUNTIME, DISPATCHERSTATCLEARRUNTIME, DISPATCHERTABLEDUMPRUNTIME, DISPATCHERREMOTETIMERLISTDUMPRUNTIME, METRICSAGENTMESSAGE, HEALTHMONITORSTATRUNTIME, METRICSENTITYRUNTIME, PERSISTENCEINTERNAL, HTTPPOLICYSETINTERNAL, DNSPOLICYINTERNAL, CONNECTIONDUMPRUNTIME, SHAREDDBSTATS, SHAREDDBSTATSCLEAR, ICMPSTATRUNTIME, ROUTETABLERUNTIME, VIRTUALMACHINE, POOLSERVER, SEVSLIST, MEMINFORUNTIME, RTERINGSTATRUNTIME, ALGOSTATRUNTIME, HEALTHMONITORRUNTIME, CPUSTATRUNTIME, SEVM, HOST, PORTGROUP, CLUSTER, DATACENTER, VCENTER, HTTPPOLICYSETSTATS, DNSPOLICYSTATS, METRICSSESTATS, RATELIMITERSTATRUNTIME, NETWORKSECURITYPOLICYSTATS, TCPCONNRUNTIME, POOLSTATS, CONNPOOLINTERNAL, CONNPOOLSTATS, VSHASHSHOWRUNTIME, SELOGSTATSRUNTIME, NETWORKSECURITYPOLICYDETAIL, LICENSERUNTIME, SERVERRUNTIME, METRICSRUNTIMESUMMARY, METRICSRUNTIMEDETAIL, DISPATCHERSEHMPROBETEMPDISABLERUNTIME, POOLDEBUG, VSLOGMGRMAP, SERUMINSERTIONSTATS, HTTPCACHE, HTTPCACHESTATS, SEDOSSTATRUNTIME, VSDOSSTATRUNTIME, SERVERUPDATEREQ, VSSCALEOUTLIST, SEMEMDISTRUNTIME, TCPCONNRUNTIMEDETAIL, SEUPGRADESTATUS, SEUPGRADEPREVIEW, SEFAULTINJECTEXHAUSTM, SEFAULTINJECTEXHAUSTMCL, SEFAULTINJECTEXHAUSTMCLSMALL, SEFAULTINJECTEXHAUSTCONN, SEHEADLESSONLINEREQ, SEUPGRADE, SEUPGRADESTATUSDETAIL, SERESERVEDVS, SERESERVEDVSCLEAR, VSCANDIDATESEHOSTLIST, SEGROUPUPGRADE, REBALANCE, SEGROUPREBALANCE, SEAUTHSTATSRUNTIME, AUTOSCALESTATE, VIRTUALSERVICEAUTHSTATS, NETWORKSECURITYPOLICYDOS, KEYVALINTERNAL, KEYVALSUMMARYINTERNAL, SERVERSTATEUPDATEINFO, CLTRACKINTERNAL, CLTRACKSUMMARYINTERNAL, MICROSERVICERUNTIME, SEMICROSERVICE, VIRTUALSERVICEANALYSIS, CLIENTINTERNAL, CLIENTSUMMARYINTERNAL, MICROSERVICEGROUPRUNTIME, BGPRUNTIME, REQUESTQUEUERUNTIME, MIGRATEALL, MIGRATEALLSTATUSSUMMARY, MIGRATEALLSTATUSDETAIL, INTERFACESUMMARYRUNTIME, INTERFACELACPRUNTIME, DNSTABLE, GSLBSERVICEDETAIL, GSLBSERVICEINTERNAL, GSLBSERVICEHMONSTAT, SETROLESREQUEST, TRAFFICCLONERUNTIME, GEOLOCATIONINFO, SEVSHBSTATRUNTIME, GEODBINTERNAL, GSLBSITEINTERNAL, WAFSTATS, USERDEFINEDDATASCRIPTCOUNTERS, LLDPRUNTIME, VSESSHARINGPOOL, NDTABLERUNTIME, IP6STATRUNTIME, ICMP6STATRUNTIME, SEVSSPLACEMENT, L4POLICYSETSTATS, L4POLICYSETINTERNAL, BGPDEBUGINFO, SHARD, CPUSTATRUNTIMEDETAIL, SEASSERTSTATRUNTIME, SEFAULTINJECTINFRA, SEAGENTASSERTSTATRUNTIME, SEDATASTORESTATUS, DIFFQUEUESTATUS, IP6ROUTETABLERUNTIME, SECURITYMGRSTATE, VIRTUALSERVICESESCALEOUTSTATUS, SHARDSERVERSTATUS, SEAGENTSHARDCLIENTRESOURCEMAP, SEAGENTCONSISTENTHASH, SEAGENTVNICDBHISTORY, SEAGENTSHARDCLIENTAPPMAP, SEAGENTSHARDCLIENTEVENTHISTORY, NATSTATRUNTIME, NATFLOWRUNTIME, SECUTIRYMGRRUNTIME, SSOPOLICYSTATS, SENETWORKSERVICERUNTIME, SEGEORUNTIME, NATPOLICYSTATS, SEFAULTRUNTIME, VIRTUALSERVICESCALEOUTSTATUS, VIRTUALSERVICESCALEOUTSTATUSDETAIL, SECURITYMGRLEARN, SECURITYMGRTOPN, SSLSESSIONCACHE, SEGEODETAILS, GSLBSERVICEALGOSTAT, HTTPCONNECTIONRUNTIME, HTTPCONNECTIONRUNTIMEDETAIL, SERESOURCEPROTO, SECONSUMERPROTO, SECREATEPENDINGPROTO, PLACEMENTSTATS, SEVIPPROTO, RMVRFPROTO, VCENTERMAP, VIMGRVCENTERRUNTIME, INTERESTEDVMS, INTERESTEDHOSTS, VCENTERSUPPORTEDCOUNTERS, ENTITYCOUNTERS, TRANSACTIONSTATS, SEVMCREATEPROGRESS, PLACEMENTSTATUS, VISUBFOLDERS, VIDATASTORE, VIHOSTRESOURCES, CLOUDCONNECTOR, VINETWORKSUBNETVMS, VIDATASTORECONTENTS, VIMGRVCENTERCLOUDRUNTIME, VIVCENTERPORTGROUPS, VIVCENTERDATACENTERS, VIMGRHOSTRUNTIME, PLACEMENTGLOBALS, ALBSERVICES, APICCONFIGURATION, CIFTABLE, APICTRANSACTION, VIRTUALSERVICESTATEDBCACHESUMMARY, POOLSTATEDBCACHESUMMARY, SERVERSTATEDBCACHESUMMARY, APICAGENTINTERNAL, APICTRANSACTIONFLAP, APICGRAPHINSTANCES, APICEPGS, APICEPGEPS, APICDEVICEPKGVER, APICTENANTS, APICVMMDOMAINS, NSXCONFIGURATION, NSXSGTABLE, NSXAGENTINTERNAL, NSXSGINFO, NSXSGIPS, NSXAGENTINTERNALCLI, MAXOBJECTS.
   * @return objectType
  **/
  @ApiModelProperty(value = "The object type to which the Alert Config is associated with. Valid object types are - Virtual Service, Pool, Service Engine. Enum options - VIRTUALSERVICE, POOL, HEALTHMONITOR, NETWORKPROFILE, APPLICATIONPROFILE, HTTPPOLICYSET, DNSPOLICY, SECURITYPOLICY, IPADDRGROUP, STRINGGROUP, SSLPROFILE, SSLKEYANDCERTIFICATE, NETWORKSECURITYPOLICY, APPLICATIONPERSISTENCEPROFILE, ANALYTICSPROFILE, VSDATASCRIPTSET, TENANT, PKIPROFILE, AUTHPROFILE, CLOUD, SERVERAUTOSCALEPOLICY, AUTOSCALELAUNCHCONFIG, MICROSERVICEGROUP, IPAMPROFILE, HARDWARESECURITYMODULEGROUP, POOLGROUP, PRIORITYLABELS, POOLGROUPDEPLOYMENTPOLICY, GSLBSERVICE, GSLBSERVICERUNTIME, SCHEDULER, GSLBGEODBPROFILE, GSLBAPPLICATIONPERSISTENCEPROFILE, TRAFFICCLONEPROFILE, VSVIP, WAFPOLICY, WAFPROFILE, ERRORPAGEPROFILE, ERRORPAGEBODY, L4POLICYSET, GSLBSERVICERUNTIMEBATCH, WAFPOLICYPSMGROUP, PINGACCESSAGENT, NETWORKSERVICE, NATPOLICY, SSOPOLICY, PROTOCOLPARSER, EXAMPLECHILD, TESTSEDATASTORELEVEL1, TESTSEDATASTORELEVEL2, TESTSEDATASTORELEVEL3, FILEOBJECT, IPREPUTATIONDB, SERVICEENGINE, DEBUGSERVICEENGINE, DEBUGCONTROLLER, DEBUGVIRTUALSERVICE, SERVICEENGINEGROUP, SEPROPERTIES, NETWORK, CONTROLLERNODE, CONTROLLERPROPERTIES, SYSTEMCONFIGURATION, VRFCONTEXT, USER, ALERTCONFIG, ALERTSYSLOGCONFIG, ALERTEMAILCONFIG, ALERTTYPECONFIG, APPLICATION, ROLE, CLOUDPROPERTIES, SNMPTRAPPROFILE, ACTIONGROUPPROFILE, MICROSERVICE, ALERTPARAMS, ACTIONGROUPCONFIG, CLOUDCONNECTORUSER, GSLB, GSLBDNSUPDATE, GSLBSITEOPS, GLBMGRWARMSTART, IPAMDNSRECORD, GSLBDNSGSSTATUS, GSLBDNSGEOFILEOPS, GSLBDNSGEOUPDATE, GSLBDNSGEOCLUSTEROPS, GSLBDNSCLEANUP, GSLBSITEOPSRESYNC, IPAMDNSPROVIDERPROFILE, ALBSERVICESCONFIG, TCPSTATRUNTIME, UDPSTATRUNTIME, IPSTATRUNTIME, ARPSTATRUNTIME, MBSTATRUNTIME, IPSTKQSTATSRUNTIME, MALLOCSTATRUNTIME, SHMALLOCSTATRUNTIME, CPUUSAGERUNTIME, L7GLOBALSTATSRUNTIME, L7VIRTUALSERVICESTATSRUNTIME, SEAGENTVNICDBRUNTIME, SEAGENTGRAPHDBRUNTIME, SEAGENTSTATERUNTIME, INTERFACERUNTIME, ARPTABLERUNTIME, DISPATCHERSTATRUNTIME, DISPATCHERSTATCLEARRUNTIME, DISPATCHERTABLEDUMPRUNTIME, DISPATCHERREMOTETIMERLISTDUMPRUNTIME, METRICSAGENTMESSAGE, HEALTHMONITORSTATRUNTIME, METRICSENTITYRUNTIME, PERSISTENCEINTERNAL, HTTPPOLICYSETINTERNAL, DNSPOLICYINTERNAL, CONNECTIONDUMPRUNTIME, SHAREDDBSTATS, SHAREDDBSTATSCLEAR, ICMPSTATRUNTIME, ROUTETABLERUNTIME, VIRTUALMACHINE, POOLSERVER, SEVSLIST, MEMINFORUNTIME, RTERINGSTATRUNTIME, ALGOSTATRUNTIME, HEALTHMONITORRUNTIME, CPUSTATRUNTIME, SEVM, HOST, PORTGROUP, CLUSTER, DATACENTER, VCENTER, HTTPPOLICYSETSTATS, DNSPOLICYSTATS, METRICSSESTATS, RATELIMITERSTATRUNTIME, NETWORKSECURITYPOLICYSTATS, TCPCONNRUNTIME, POOLSTATS, CONNPOOLINTERNAL, CONNPOOLSTATS, VSHASHSHOWRUNTIME, SELOGSTATSRUNTIME, NETWORKSECURITYPOLICYDETAIL, LICENSERUNTIME, SERVERRUNTIME, METRICSRUNTIMESUMMARY, METRICSRUNTIMEDETAIL, DISPATCHERSEHMPROBETEMPDISABLERUNTIME, POOLDEBUG, VSLOGMGRMAP, SERUMINSERTIONSTATS, HTTPCACHE, HTTPCACHESTATS, SEDOSSTATRUNTIME, VSDOSSTATRUNTIME, SERVERUPDATEREQ, VSSCALEOUTLIST, SEMEMDISTRUNTIME, TCPCONNRUNTIMEDETAIL, SEUPGRADESTATUS, SEUPGRADEPREVIEW, SEFAULTINJECTEXHAUSTM, SEFAULTINJECTEXHAUSTMCL, SEFAULTINJECTEXHAUSTMCLSMALL, SEFAULTINJECTEXHAUSTCONN, SEHEADLESSONLINEREQ, SEUPGRADE, SEUPGRADESTATUSDETAIL, SERESERVEDVS, SERESERVEDVSCLEAR, VSCANDIDATESEHOSTLIST, SEGROUPUPGRADE, REBALANCE, SEGROUPREBALANCE, SEAUTHSTATSRUNTIME, AUTOSCALESTATE, VIRTUALSERVICEAUTHSTATS, NETWORKSECURITYPOLICYDOS, KEYVALINTERNAL, KEYVALSUMMARYINTERNAL, SERVERSTATEUPDATEINFO, CLTRACKINTERNAL, CLTRACKSUMMARYINTERNAL, MICROSERVICERUNTIME, SEMICROSERVICE, VIRTUALSERVICEANALYSIS, CLIENTINTERNAL, CLIENTSUMMARYINTERNAL, MICROSERVICEGROUPRUNTIME, BGPRUNTIME, REQUESTQUEUERUNTIME, MIGRATEALL, MIGRATEALLSTATUSSUMMARY, MIGRATEALLSTATUSDETAIL, INTERFACESUMMARYRUNTIME, INTERFACELACPRUNTIME, DNSTABLE, GSLBSERVICEDETAIL, GSLBSERVICEINTERNAL, GSLBSERVICEHMONSTAT, SETROLESREQUEST, TRAFFICCLONERUNTIME, GEOLOCATIONINFO, SEVSHBSTATRUNTIME, GEODBINTERNAL, GSLBSITEINTERNAL, WAFSTATS, USERDEFINEDDATASCRIPTCOUNTERS, LLDPRUNTIME, VSESSHARINGPOOL, NDTABLERUNTIME, IP6STATRUNTIME, ICMP6STATRUNTIME, SEVSSPLACEMENT, L4POLICYSETSTATS, L4POLICYSETINTERNAL, BGPDEBUGINFO, SHARD, CPUSTATRUNTIMEDETAIL, SEASSERTSTATRUNTIME, SEFAULTINJECTINFRA, SEAGENTASSERTSTATRUNTIME, SEDATASTORESTATUS, DIFFQUEUESTATUS, IP6ROUTETABLERUNTIME, SECURITYMGRSTATE, VIRTUALSERVICESESCALEOUTSTATUS, SHARDSERVERSTATUS, SEAGENTSHARDCLIENTRESOURCEMAP, SEAGENTCONSISTENTHASH, SEAGENTVNICDBHISTORY, SEAGENTSHARDCLIENTAPPMAP, SEAGENTSHARDCLIENTEVENTHISTORY, NATSTATRUNTIME, NATFLOWRUNTIME, SECUTIRYMGRRUNTIME, SSOPOLICYSTATS, SENETWORKSERVICERUNTIME, SEGEORUNTIME, NATPOLICYSTATS, SEFAULTRUNTIME, VIRTUALSERVICESCALEOUTSTATUS, VIRTUALSERVICESCALEOUTSTATUSDETAIL, SECURITYMGRLEARN, SECURITYMGRTOPN, SSLSESSIONCACHE, SEGEODETAILS, GSLBSERVICEALGOSTAT, HTTPCONNECTIONRUNTIME, HTTPCONNECTIONRUNTIMEDETAIL, SERESOURCEPROTO, SECONSUMERPROTO, SECREATEPENDINGPROTO, PLACEMENTSTATS, SEVIPPROTO, RMVRFPROTO, VCENTERMAP, VIMGRVCENTERRUNTIME, INTERESTEDVMS, INTERESTEDHOSTS, VCENTERSUPPORTEDCOUNTERS, ENTITYCOUNTERS, TRANSACTIONSTATS, SEVMCREATEPROGRESS, PLACEMENTSTATUS, VISUBFOLDERS, VIDATASTORE, VIHOSTRESOURCES, CLOUDCONNECTOR, VINETWORKSUBNETVMS, VIDATASTORECONTENTS, VIMGRVCENTERCLOUDRUNTIME, VIVCENTERPORTGROUPS, VIVCENTERDATACENTERS, VIMGRHOSTRUNTIME, PLACEMENTGLOBALS, ALBSERVICES, APICCONFIGURATION, CIFTABLE, APICTRANSACTION, VIRTUALSERVICESTATEDBCACHESUMMARY, POOLSTATEDBCACHESUMMARY, SERVERSTATEDBCACHESUMMARY, APICAGENTINTERNAL, APICTRANSACTIONFLAP, APICGRAPHINSTANCES, APICEPGS, APICEPGEPS, APICDEVICEPKGVER, APICTENANTS, APICVMMDOMAINS, NSXCONFIGURATION, NSXSGTABLE, NSXAGENTINTERNAL, NSXSGINFO, NSXSGIPS, NSXAGENTINTERNALCLI, MAXOBJECTS.")


 
  @VsoMethod  
  public String getObjectType() {
    return objectType;
  }
    
  @VsoMethod
  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  
  /**
   * recommendation of AlertConfig.
   * @return recommendation
  **/
  @ApiModelProperty(value = "recommendation of AlertConfig.")


 
  @VsoMethod  
  public String getRecommendation() {
    return recommendation;
  }
    
  @VsoMethod
  public void setRecommendation(String recommendation) {
    this.recommendation = recommendation;
  }

  
  /**
   * Only if the Number of Events is reached or exceeded within the Time Window will an alert be generated. Allowed values are 1-31536000.
   * @return rollingWindow
  **/
  @ApiModelProperty(value = "Only if the Number of Events is reached or exceeded within the Time Window will an alert be generated. Allowed values are 1-31536000.")


 
  @VsoMethod  
  public Integer getRollingWindow() {
    return rollingWindow;
  }
    
  @VsoMethod
  public void setRollingWindow(Integer rollingWindow) {
    this.rollingWindow = rollingWindow;
  }

  
  /**
   * Signifies system events or the type of client logsused in this alert configuration. Enum options - CONN_LOGS, APP_LOGS, EVENT_LOGS, METRICS.
   * @return source
  **/
  @ApiModelProperty(required = true, value = "Signifies system events or the type of client logsused in this alert configuration. Enum options - CONN_LOGS, APP_LOGS, EVENT_LOGS, METRICS.")
  @NotNull


 
  @VsoMethod  
  public String getSource() {
    return source;
  }
    
  @VsoMethod
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * Summary of reason why alert is generated.
   * @return summary
  **/
  @ApiModelProperty(value = "Summary of reason why alert is generated.")


 
  @VsoMethod  
  public String getSummary() {
    return summary;
  }
    
  @VsoMethod
  public void setSummary(String summary) {
    this.summary = summary;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * An alert is created only when the number of events meets or exceeds this number within the chosen time frame. Allowed values are 1-65536.
   * @return threshold
  **/
  @ApiModelProperty(value = "An alert is created only when the number of events meets or exceeds this number within the chosen time frame. Allowed values are 1-65536.")


 
  @VsoMethod  
  public Integer getThreshold() {
    return threshold;
  }
    
  @VsoMethod
  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }

  
  /**
   * Alerts are suppressed (throttled) for this duration of time since the last alert was raised for this alert config. Allowed values are 0-31536000.
   * @return throttle
  **/
  @ApiModelProperty(value = "Alerts are suppressed (throttled) for this duration of time since the last alert was raised for this alert config. Allowed values are 0-31536000.")


 
  @VsoMethod  
  public Integer getThrottle() {
    return throttle;
  }
    
  @VsoMethod
  public void setThrottle(Integer throttle) {
    this.throttle = throttle;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "AlertConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertConfig alertConfig = (AlertConfig) o;
    return Objects.equals(this.lastModified, alertConfig.lastModified) &&
        Objects.equals(this.actionGroupRef, alertConfig.actionGroupRef) &&
        Objects.equals(this.alertRule, alertConfig.alertRule) &&
        Objects.equals(this.autoscaleAlert, alertConfig.autoscaleAlert) &&
        Objects.equals(this.category, alertConfig.category) &&
        Objects.equals(this.description, alertConfig.description) &&
        Objects.equals(this.enabled, alertConfig.enabled) &&
        Objects.equals(this.expiryTime, alertConfig.expiryTime) &&
        Objects.equals(this.name, alertConfig.name) &&
        Objects.equals(this.objUuid, alertConfig.objUuid) &&
        Objects.equals(this.objectType, alertConfig.objectType) &&
        Objects.equals(this.recommendation, alertConfig.recommendation) &&
        Objects.equals(this.rollingWindow, alertConfig.rollingWindow) &&
        Objects.equals(this.source, alertConfig.source) &&
        Objects.equals(this.summary, alertConfig.summary) &&
        Objects.equals(this.tenantRef, alertConfig.tenantRef) &&
        Objects.equals(this.threshold, alertConfig.threshold) &&
        Objects.equals(this.throttle, alertConfig.throttle) &&
        Objects.equals(this.url, alertConfig.url) &&
        Objects.equals(this.uuid, alertConfig.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, actionGroupRef, alertRule, autoscaleAlert, category, description, enabled, expiryTime, name, objUuid, objectType, recommendation, rollingWindow, source, summary, tenantRef, threshold, throttle, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertConfig {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    actionGroupRef: ").append(toIndentedString(actionGroupRef)).append("\n");
    sb.append("    alertRule: ").append(toIndentedString(alertRule)).append("\n");
    sb.append("    autoscaleAlert: ").append(toIndentedString(autoscaleAlert)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objUuid: ").append(toIndentedString(objUuid)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    rollingWindow: ").append(toIndentedString(rollingWindow)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    throttle: ").append(toIndentedString(throttle)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

