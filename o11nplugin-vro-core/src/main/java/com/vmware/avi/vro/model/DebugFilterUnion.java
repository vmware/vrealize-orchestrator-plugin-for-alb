package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AlertMgrDebugFilter;
import com.vmware.avi.vro.model.AutoScaleMgrDebugFilter;
import com.vmware.avi.vro.model.CloudConnectorDebugFilter;
import com.vmware.avi.vro.model.HSMgrDebugFilter;
import com.vmware.avi.vro.model.MesosMetricsDebugFilter;
import com.vmware.avi.vro.model.MetricsApiSrvDebugFilter;
import com.vmware.avi.vro.model.MetricsMgrDebugFilter;
import com.vmware.avi.vro.model.SeMgrDebugFilter;
import com.vmware.avi.vro.model.SeRpcProxyDebugFilter;
import com.vmware.avi.vro.model.SecurityMgrDebugFilter;
import com.vmware.avi.vro.model.StateCacheMgrDebugFilter;
import com.vmware.avi.vro.model.VsDebugFilter;
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
 * DebugFilterUnion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugFilterUnion")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGFILTERUNION, idAccessor = "getObjectID()")
@Service
public class DebugFilterUnion extends AviRestResource  {
  @JsonProperty("alert_debug_filter")
  private AlertMgrDebugFilter alertDebugFilter = null;

  @JsonProperty("autoscale_mgr_debug_filter")
  private AutoScaleMgrDebugFilter autoscaleMgrDebugFilter = null;

  @JsonProperty("cloud_connector_debug_filter")
  private CloudConnectorDebugFilter cloudConnectorDebugFilter = null;

  @JsonProperty("hs_debug_filter")
  private HSMgrDebugFilter hsDebugFilter = null;

  @JsonProperty("mesos_metrics_debug_filter")
  private MesosMetricsDebugFilter mesosMetricsDebugFilter = null;

  @JsonProperty("metrics_debug_filter")
  private MetricsMgrDebugFilter metricsDebugFilter = null;

  @JsonProperty("metricsapi_srv_debug_filter")
  private MetricsApiSrvDebugFilter metricsapiSrvDebugFilter = null;

  @JsonProperty("se_mgr_debug_filter")
  private SeMgrDebugFilter seMgrDebugFilter = null;

  @JsonProperty("se_rpc_proxy_filter")
  private SeRpcProxyDebugFilter seRpcProxyFilter = null;

  @JsonProperty("securitymgr_debug_filter")
  private SecurityMgrDebugFilter securitymgrDebugFilter = null;

  @JsonProperty("state_cache_mgr_debug_filter")
  private StateCacheMgrDebugFilter stateCacheMgrDebugFilter = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("vs_debug_filter")
  private VsDebugFilter vsDebugFilter = null;

  
  /**
   * Placeholder for description of property alert_debug_filter of obj type DebugFilterUnion field type str  type object
   * @return alertDebugFilter
  **/
  @ApiModelProperty(value = "Placeholder for description of property alert_debug_filter of obj type DebugFilterUnion field type str  type object")

  @Valid

 
  @VsoMethod  
  public AlertMgrDebugFilter getAlertDebugFilter() {
    return alertDebugFilter;
  }
    
  @VsoMethod
  public void setAlertDebugFilter(AlertMgrDebugFilter alertDebugFilter) {
    this.alertDebugFilter = alertDebugFilter;
  }

  
  /**
   * Placeholder for description of property autoscale_mgr_debug_filter of obj type DebugFilterUnion field type str  type object
   * @return autoscaleMgrDebugFilter
  **/
  @ApiModelProperty(value = "Placeholder for description of property autoscale_mgr_debug_filter of obj type DebugFilterUnion field type str  type object")

  @Valid

 
  @VsoMethod  
  public AutoScaleMgrDebugFilter getAutoscaleMgrDebugFilter() {
    return autoscaleMgrDebugFilter;
  }
    
  @VsoMethod
  public void setAutoscaleMgrDebugFilter(AutoScaleMgrDebugFilter autoscaleMgrDebugFilter) {
    this.autoscaleMgrDebugFilter = autoscaleMgrDebugFilter;
  }

  
  /**
   * Placeholder for description of property cloud_connector_debug_filter of obj type DebugFilterUnion field type str  type object
   * @return cloudConnectorDebugFilter
  **/
  @ApiModelProperty(value = "Placeholder for description of property cloud_connector_debug_filter of obj type DebugFilterUnion field type str  type object")

  @Valid

 
  @VsoMethod  
  public CloudConnectorDebugFilter getCloudConnectorDebugFilter() {
    return cloudConnectorDebugFilter;
  }
    
  @VsoMethod
  public void setCloudConnectorDebugFilter(CloudConnectorDebugFilter cloudConnectorDebugFilter) {
    this.cloudConnectorDebugFilter = cloudConnectorDebugFilter;
  }

  
  /**
   * Placeholder for description of property hs_debug_filter of obj type DebugFilterUnion field type str  type object
   * @return hsDebugFilter
  **/
  @ApiModelProperty(value = "Placeholder for description of property hs_debug_filter of obj type DebugFilterUnion field type str  type object")

  @Valid

 
  @VsoMethod  
  public HSMgrDebugFilter getHsDebugFilter() {
    return hsDebugFilter;
  }
    
  @VsoMethod
  public void setHsDebugFilter(HSMgrDebugFilter hsDebugFilter) {
    this.hsDebugFilter = hsDebugFilter;
  }

  
  /**
   * Placeholder for description of property mesos_metrics_debug_filter of obj type DebugFilterUnion field type str  type object
   * @return mesosMetricsDebugFilter
  **/
  @ApiModelProperty(value = "Placeholder for description of property mesos_metrics_debug_filter of obj type DebugFilterUnion field type str  type object")

  @Valid

 
  @VsoMethod  
  public MesosMetricsDebugFilter getMesosMetricsDebugFilter() {
    return mesosMetricsDebugFilter;
  }
    
  @VsoMethod
  public void setMesosMetricsDebugFilter(MesosMetricsDebugFilter mesosMetricsDebugFilter) {
    this.mesosMetricsDebugFilter = mesosMetricsDebugFilter;
  }

  
  /**
   * Placeholder for description of property metrics_debug_filter of obj type DebugFilterUnion field type str  type object
   * @return metricsDebugFilter
  **/
  @ApiModelProperty(value = "Placeholder for description of property metrics_debug_filter of obj type DebugFilterUnion field type str  type object")

  @Valid

 
  @VsoMethod  
  public MetricsMgrDebugFilter getMetricsDebugFilter() {
    return metricsDebugFilter;
  }
    
  @VsoMethod
  public void setMetricsDebugFilter(MetricsMgrDebugFilter metricsDebugFilter) {
    this.metricsDebugFilter = metricsDebugFilter;
  }

  
  /**
   * Add Metricsapi Server filter. Field introduced in 18.2.3.
   * @return metricsapiSrvDebugFilter
  **/
  @ApiModelProperty(value = "Add Metricsapi Server filter. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public MetricsApiSrvDebugFilter getMetricsapiSrvDebugFilter() {
    return metricsapiSrvDebugFilter;
  }
    
  @VsoMethod
  public void setMetricsapiSrvDebugFilter(MetricsApiSrvDebugFilter metricsapiSrvDebugFilter) {
    this.metricsapiSrvDebugFilter = metricsapiSrvDebugFilter;
  }

  
  /**
   * Placeholder for description of property se_mgr_debug_filter of obj type DebugFilterUnion field type str  type object
   * @return seMgrDebugFilter
  **/
  @ApiModelProperty(value = "Placeholder for description of property se_mgr_debug_filter of obj type DebugFilterUnion field type str  type object")

  @Valid

 
  @VsoMethod  
  public SeMgrDebugFilter getSeMgrDebugFilter() {
    return seMgrDebugFilter;
  }
    
  @VsoMethod
  public void setSeMgrDebugFilter(SeMgrDebugFilter seMgrDebugFilter) {
    this.seMgrDebugFilter = seMgrDebugFilter;
  }

  
  /**
   * Add SE RPC Proxy Filter. Field introduced in 18.1.5, 18.2.1.
   * @return seRpcProxyFilter
  **/
  @ApiModelProperty(value = "Add SE RPC Proxy Filter. Field introduced in 18.1.5, 18.2.1.")

  @Valid

 
  @VsoMethod  
  public SeRpcProxyDebugFilter getSeRpcProxyFilter() {
    return seRpcProxyFilter;
  }
    
  @VsoMethod
  public void setSeRpcProxyFilter(SeRpcProxyDebugFilter seRpcProxyFilter) {
    this.seRpcProxyFilter = seRpcProxyFilter;
  }

  
  /**
   * Add Metricsapi Server filter. Field introduced in 18.2.6.
   * @return securitymgrDebugFilter
  **/
  @ApiModelProperty(value = "Add Metricsapi Server filter. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public SecurityMgrDebugFilter getSecuritymgrDebugFilter() {
    return securitymgrDebugFilter;
  }
    
  @VsoMethod
  public void setSecuritymgrDebugFilter(SecurityMgrDebugFilter securitymgrDebugFilter) {
    this.securitymgrDebugFilter = securitymgrDebugFilter;
  }

  
  /**
   * Placeholder for description of property state_cache_mgr_debug_filter of obj type DebugFilterUnion field type str  type object
   * @return stateCacheMgrDebugFilter
  **/
  @ApiModelProperty(value = "Placeholder for description of property state_cache_mgr_debug_filter of obj type DebugFilterUnion field type str  type object")

  @Valid

 
  @VsoMethod  
  public StateCacheMgrDebugFilter getStateCacheMgrDebugFilter() {
    return stateCacheMgrDebugFilter;
  }
    
  @VsoMethod
  public void setStateCacheMgrDebugFilter(StateCacheMgrDebugFilter stateCacheMgrDebugFilter) {
    this.stateCacheMgrDebugFilter = stateCacheMgrDebugFilter;
  }

  
  /**
   *  Enum options - TASK_QUEUE_DEBUG, RPC_INFRA_DEBUG, JOB_MGR_DEBUG, TRANSACTION_DEBUG, SE_AGENT_DEBUG, SE_AGENT_METRICS_DEBUG, VIRTUALSERVICE_DEBUG, RES_MGR_DEBUG, SE_MGR_DEBUG, VI_MGR_DEBUG, METRICS_MANAGER_DEBUG, METRICS_MGR_DEBUG, EVENT_API_DEBUG, HS_MGR_DEBUG, ALERT_MGR_DEBUG, AUTOSCALE_MGR_DEBUG, APIC_AGENT_DEBUG, REDIS_INFRA_DEBUG, CLOUD_CONNECTOR_DEBUG, MESOS_METRICS_DEBUG, STATECACHE_MGR_DEBUG, NSX_AGENT_DEBUG, SE_AGENT_CPU_UTIL_DEBUG, SE_AGENT_MEM_UTIL_DEBUG, SE_RPC_PROXY_DEBUG, SE_AGENT_GSLB_DEBUG, METRICSAPI_SRV_DEBUG, SECURITYMGR_DEBUG, RES_MGR_READ_DEBUG, LICENSE_VMWSRVR_DEBUG.
   * @return type
  **/
  @ApiModelProperty(required = true, value = " Enum options - TASK_QUEUE_DEBUG, RPC_INFRA_DEBUG, JOB_MGR_DEBUG, TRANSACTION_DEBUG, SE_AGENT_DEBUG, SE_AGENT_METRICS_DEBUG, VIRTUALSERVICE_DEBUG, RES_MGR_DEBUG, SE_MGR_DEBUG, VI_MGR_DEBUG, METRICS_MANAGER_DEBUG, METRICS_MGR_DEBUG, EVENT_API_DEBUG, HS_MGR_DEBUG, ALERT_MGR_DEBUG, AUTOSCALE_MGR_DEBUG, APIC_AGENT_DEBUG, REDIS_INFRA_DEBUG, CLOUD_CONNECTOR_DEBUG, MESOS_METRICS_DEBUG, STATECACHE_MGR_DEBUG, NSX_AGENT_DEBUG, SE_AGENT_CPU_UTIL_DEBUG, SE_AGENT_MEM_UTIL_DEBUG, SE_RPC_PROXY_DEBUG, SE_AGENT_GSLB_DEBUG, METRICSAPI_SRV_DEBUG, SECURITYMGR_DEBUG, RES_MGR_READ_DEBUG, LICENSE_VMWSRVR_DEBUG.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Placeholder for description of property vs_debug_filter of obj type DebugFilterUnion field type str  type object
   * @return vsDebugFilter
  **/
  @ApiModelProperty(value = "Placeholder for description of property vs_debug_filter of obj type DebugFilterUnion field type str  type object")

  @Valid

 
  @VsoMethod  
  public VsDebugFilter getVsDebugFilter() {
    return vsDebugFilter;
  }
    
  @VsoMethod
  public void setVsDebugFilter(VsDebugFilter vsDebugFilter) {
    this.vsDebugFilter = vsDebugFilter;
  }

  
  public String getObjectID() {
		return "DebugFilterUnion";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugFilterUnion debugFilterUnion = (DebugFilterUnion) o;
    return Objects.equals(this.alertDebugFilter, debugFilterUnion.alertDebugFilter) &&
        Objects.equals(this.autoscaleMgrDebugFilter, debugFilterUnion.autoscaleMgrDebugFilter) &&
        Objects.equals(this.cloudConnectorDebugFilter, debugFilterUnion.cloudConnectorDebugFilter) &&
        Objects.equals(this.hsDebugFilter, debugFilterUnion.hsDebugFilter) &&
        Objects.equals(this.mesosMetricsDebugFilter, debugFilterUnion.mesosMetricsDebugFilter) &&
        Objects.equals(this.metricsDebugFilter, debugFilterUnion.metricsDebugFilter) &&
        Objects.equals(this.metricsapiSrvDebugFilter, debugFilterUnion.metricsapiSrvDebugFilter) &&
        Objects.equals(this.seMgrDebugFilter, debugFilterUnion.seMgrDebugFilter) &&
        Objects.equals(this.seRpcProxyFilter, debugFilterUnion.seRpcProxyFilter) &&
        Objects.equals(this.securitymgrDebugFilter, debugFilterUnion.securitymgrDebugFilter) &&
        Objects.equals(this.stateCacheMgrDebugFilter, debugFilterUnion.stateCacheMgrDebugFilter) &&
        Objects.equals(this.type, debugFilterUnion.type) &&
        Objects.equals(this.vsDebugFilter, debugFilterUnion.vsDebugFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertDebugFilter, autoscaleMgrDebugFilter, cloudConnectorDebugFilter, hsDebugFilter, mesosMetricsDebugFilter, metricsDebugFilter, metricsapiSrvDebugFilter, seMgrDebugFilter, seRpcProxyFilter, securitymgrDebugFilter, stateCacheMgrDebugFilter, type, vsDebugFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugFilterUnion {\n");
    
    sb.append("    alertDebugFilter: ").append(toIndentedString(alertDebugFilter)).append("\n");
    sb.append("    autoscaleMgrDebugFilter: ").append(toIndentedString(autoscaleMgrDebugFilter)).append("\n");
    sb.append("    cloudConnectorDebugFilter: ").append(toIndentedString(cloudConnectorDebugFilter)).append("\n");
    sb.append("    hsDebugFilter: ").append(toIndentedString(hsDebugFilter)).append("\n");
    sb.append("    mesosMetricsDebugFilter: ").append(toIndentedString(mesosMetricsDebugFilter)).append("\n");
    sb.append("    metricsDebugFilter: ").append(toIndentedString(metricsDebugFilter)).append("\n");
    sb.append("    metricsapiSrvDebugFilter: ").append(toIndentedString(metricsapiSrvDebugFilter)).append("\n");
    sb.append("    seMgrDebugFilter: ").append(toIndentedString(seMgrDebugFilter)).append("\n");
    sb.append("    seRpcProxyFilter: ").append(toIndentedString(seRpcProxyFilter)).append("\n");
    sb.append("    securitymgrDebugFilter: ").append(toIndentedString(securitymgrDebugFilter)).append("\n");
    sb.append("    stateCacheMgrDebugFilter: ").append(toIndentedString(stateCacheMgrDebugFilter)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vsDebugFilter: ").append(toIndentedString(vsDebugFilter)).append("\n");
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

