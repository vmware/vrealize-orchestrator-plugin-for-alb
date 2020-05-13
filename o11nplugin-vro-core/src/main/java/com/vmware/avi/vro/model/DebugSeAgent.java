package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * DebugSeAgent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugSeAgent")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGSEAGENT, idAccessor = "getObjectID()")
@Service
public class DebugSeAgent extends AviRestResource  {
  @JsonProperty("log_every_n")
  private Integer logEveryN = null;

  @JsonProperty("log_level")
  private String logLevel = null;

  @JsonProperty("sub_module")
  private String subModule = null;

  @JsonProperty("trace_level")
  private String traceLevel = null;

  
  /**
   * Log every nth message. Field introduced in 17.2.7.
   * @return logEveryN
  **/
  @ApiModelProperty(value = "Log every nth message. Field introduced in 17.2.7.")


 
  @VsoMethod  
  public Integer getLogEveryN() {
    return logEveryN;
  }
    
  @VsoMethod
  public void setLogEveryN(Integer logEveryN) {
    this.logEveryN = logEveryN;
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

  
  public String getObjectID() {
		return "DebugSeAgent";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugSeAgent debugSeAgent = (DebugSeAgent) o;
    return Objects.equals(this.logEveryN, debugSeAgent.logEveryN) &&
        Objects.equals(this.logLevel, debugSeAgent.logLevel) &&
        Objects.equals(this.subModule, debugSeAgent.subModule) &&
        Objects.equals(this.traceLevel, debugSeAgent.traceLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logEveryN, logLevel, subModule, traceLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugSeAgent {\n");
    
    sb.append("    logEveryN: ").append(toIndentedString(logEveryN)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    subModule: ").append(toIndentedString(subModule)).append("\n");
    sb.append("    traceLevel: ").append(toIndentedString(traceLevel)).append("\n");
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

