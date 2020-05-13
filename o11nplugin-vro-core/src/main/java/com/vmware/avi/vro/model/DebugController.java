package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DebugFilterUnion;
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
 * DebugController
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugController")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGCONTROLLER, idAccessor = "getObjectID()")
@Service
public class DebugController extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("filters")
  private DebugFilterUnion filters = null;

  @JsonProperty("log_level")
  private String logLevel = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("sub_module")
  private String subModule = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("trace_level")
  private String traceLevel = null;

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
   * Placeholder for description of property filters of obj type DebugController field type str  type object
   * @return filters
  **/
  @ApiModelProperty(value = "Placeholder for description of property filters of obj type DebugController field type str  type object")

  @Valid

 
  @VsoMethod  
  public DebugFilterUnion getFilters() {
    return filters;
  }
    
  @VsoMethod
  public void setFilters(DebugFilterUnion filters) {
    this.filters = filters;
  }

  
  /**
   *  Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR.
   * @return logLevel
  **/
  @ApiModelProperty(required = true, value = " Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR.")
  @NotNull


 
  @VsoMethod  
  public String getLogLevel() {
    return logLevel;
  }
    
  @VsoMethod
  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
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
   *  Enum options - TASK_QUEUE_DEBUG, RPC_INFRA_DEBUG, JOB_MGR_DEBUG, TRANSACTION_DEBUG, SE_AGENT_DEBUG, SE_AGENT_METRICS_DEBUG, VIRTUALSERVICE_DEBUG, RES_MGR_DEBUG, SE_MGR_DEBUG, VI_MGR_DEBUG, METRICS_MANAGER_DEBUG, METRICS_MGR_DEBUG, EVENT_API_DEBUG, HS_MGR_DEBUG, ALERT_MGR_DEBUG, AUTOSCALE_MGR_DEBUG, APIC_AGENT_DEBUG, REDIS_INFRA_DEBUG, CLOUD_CONNECTOR_DEBUG, MESOS_METRICS_DEBUG, STATECACHE_MGR_DEBUG, NSX_AGENT_DEBUG, SE_AGENT_CPU_UTIL_DEBUG, SE_AGENT_MEM_UTIL_DEBUG, SE_RPC_PROXY_DEBUG, SE_AGENT_GSLB_DEBUG, METRICSAPI_SRV_DEBUG, SECURITYMGR_DEBUG, RES_MGR_READ_DEBUG, LICENSE_VMWSRVR_DEBUG.
   * @return subModule
  **/
  @ApiModelProperty(required = true, value = " Enum options - TASK_QUEUE_DEBUG, RPC_INFRA_DEBUG, JOB_MGR_DEBUG, TRANSACTION_DEBUG, SE_AGENT_DEBUG, SE_AGENT_METRICS_DEBUG, VIRTUALSERVICE_DEBUG, RES_MGR_DEBUG, SE_MGR_DEBUG, VI_MGR_DEBUG, METRICS_MANAGER_DEBUG, METRICS_MGR_DEBUG, EVENT_API_DEBUG, HS_MGR_DEBUG, ALERT_MGR_DEBUG, AUTOSCALE_MGR_DEBUG, APIC_AGENT_DEBUG, REDIS_INFRA_DEBUG, CLOUD_CONNECTOR_DEBUG, MESOS_METRICS_DEBUG, STATECACHE_MGR_DEBUG, NSX_AGENT_DEBUG, SE_AGENT_CPU_UTIL_DEBUG, SE_AGENT_MEM_UTIL_DEBUG, SE_RPC_PROXY_DEBUG, SE_AGENT_GSLB_DEBUG, METRICSAPI_SRV_DEBUG, SECURITYMGR_DEBUG, RES_MGR_READ_DEBUG, LICENSE_VMWSRVR_DEBUG.")
  @NotNull


 
  @VsoMethod  
  public String getSubModule() {
    return subModule;
  }
    
  @VsoMethod
  public void setSubModule(String subModule) {
    this.subModule = subModule;
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
   *  Enum options - TRACE_LEVEL_DISABLED, TRACE_LEVEL_ERROR, TRACE_LEVEL_DEBUG, TRACE_LEVEL_DEBUG_DETAIL.
   * @return traceLevel
  **/
  @ApiModelProperty(required = true, value = " Enum options - TRACE_LEVEL_DISABLED, TRACE_LEVEL_ERROR, TRACE_LEVEL_DEBUG, TRACE_LEVEL_DEBUG_DETAIL.")
  @NotNull


 
  @VsoMethod  
  public String getTraceLevel() {
    return traceLevel;
  }
    
  @VsoMethod
  public void setTraceLevel(String traceLevel) {
    this.traceLevel = traceLevel;
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
		return "DebugController";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugController debugController = (DebugController) o;
    return Objects.equals(this.lastModified, debugController.lastModified) &&
        Objects.equals(this.filters, debugController.filters) &&
        Objects.equals(this.logLevel, debugController.logLevel) &&
        Objects.equals(this.name, debugController.name) &&
        Objects.equals(this.subModule, debugController.subModule) &&
        Objects.equals(this.tenantRef, debugController.tenantRef) &&
        Objects.equals(this.traceLevel, debugController.traceLevel) &&
        Objects.equals(this.url, debugController.url) &&
        Objects.equals(this.uuid, debugController.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, filters, logLevel, name, subModule, tenantRef, traceLevel, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugController {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subModule: ").append(toIndentedString(subModule)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    traceLevel: ").append(toIndentedString(traceLevel)).append("\n");
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

