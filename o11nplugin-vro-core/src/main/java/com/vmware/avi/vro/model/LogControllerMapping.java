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
 * LogControllerMapping
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "LogControllerMapping")
@VsoFinder(name = Constants.FINDER_VRO_LOGCONTROLLERMAPPING, idAccessor = "getObjectID()")
@Service
public class LogControllerMapping extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("controller_ip")
  private String controllerIp = null;

  @JsonProperty("metrics_mgr_port")
  private String metricsMgrPort = "METRICS_MGR_PORT_0";

  @JsonProperty("node_uuid")
  private String nodeUuid = null;

  @JsonProperty("prev_controller_ip")
  private String prevControllerIp = null;

  @JsonProperty("prev_metrics_mgr_port")
  private String prevMetricsMgrPort = "METRICS_MGR_PORT_0";

  @JsonProperty("static_mapping")
  private Boolean staticMapping = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vs_uuid")
  private String vsUuid = null;

  
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
   * controller_ip of LogControllerMapping.
   * @return controllerIp
  **/
  @ApiModelProperty(value = "controller_ip of LogControllerMapping.")


 
  @VsoMethod  
  public String getControllerIp() {
    return controllerIp;
  }
    
  @VsoMethod
  public void setControllerIp(String controllerIp) {
    this.controllerIp = controllerIp;
  }

  
  /**
   *  Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * @return metricsMgrPort
  **/
  @ApiModelProperty(value = " Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.")


 
  @VsoMethod  
  public String getMetricsMgrPort() {
    return metricsMgrPort;
  }
    
  @VsoMethod
  public void setMetricsMgrPort(String metricsMgrPort) {
    this.metricsMgrPort = metricsMgrPort;
  }

  
  /**
   * Unique object identifier of node.
   * @return nodeUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of node.")


 
  @VsoMethod  
  public String getNodeUuid() {
    return nodeUuid;
  }
    
  @VsoMethod
  public void setNodeUuid(String nodeUuid) {
    this.nodeUuid = nodeUuid;
  }

  
  /**
   * prev_controller_ip of LogControllerMapping.
   * @return prevControllerIp
  **/
  @ApiModelProperty(value = "prev_controller_ip of LogControllerMapping.")


 
  @VsoMethod  
  public String getPrevControllerIp() {
    return prevControllerIp;
  }
    
  @VsoMethod
  public void setPrevControllerIp(String prevControllerIp) {
    this.prevControllerIp = prevControllerIp;
  }

  
  /**
   *  Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * @return prevMetricsMgrPort
  **/
  @ApiModelProperty(value = " Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.")


 
  @VsoMethod  
  public String getPrevMetricsMgrPort() {
    return prevMetricsMgrPort;
  }
    
  @VsoMethod
  public void setPrevMetricsMgrPort(String prevMetricsMgrPort) {
    this.prevMetricsMgrPort = prevMetricsMgrPort;
  }

  
  /**
   * Placeholder for description of property static_mapping of obj type LogControllerMapping field type str  type boolean
   * @return staticMapping
  **/
  @ApiModelProperty(value = "Placeholder for description of property static_mapping of obj type LogControllerMapping field type str  type boolean")


 
  @VsoMethod  
  public Boolean isStaticMapping() {
    return staticMapping;
  }
    
  @VsoMethod
  public void setStaticMapping(Boolean staticMapping) {
    this.staticMapping = staticMapping;
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

  
  /**
   * Unique object identifier of vs.
   * @return vsUuid
  **/
  @ApiModelProperty(required = true, value = "Unique object identifier of vs.")
  @NotNull


 
  @VsoMethod  
  public String getVsUuid() {
    return vsUuid;
  }
    
  @VsoMethod
  public void setVsUuid(String vsUuid) {
    this.vsUuid = vsUuid;
  }

  
  public String getObjectID() {
		return "LogControllerMapping";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogControllerMapping logControllerMapping = (LogControllerMapping) o;
    return Objects.equals(this.lastModified, logControllerMapping.lastModified) &&
        Objects.equals(this.controllerIp, logControllerMapping.controllerIp) &&
        Objects.equals(this.metricsMgrPort, logControllerMapping.metricsMgrPort) &&
        Objects.equals(this.nodeUuid, logControllerMapping.nodeUuid) &&
        Objects.equals(this.prevControllerIp, logControllerMapping.prevControllerIp) &&
        Objects.equals(this.prevMetricsMgrPort, logControllerMapping.prevMetricsMgrPort) &&
        Objects.equals(this.staticMapping, logControllerMapping.staticMapping) &&
        Objects.equals(this.tenantRef, logControllerMapping.tenantRef) &&
        Objects.equals(this.url, logControllerMapping.url) &&
        Objects.equals(this.uuid, logControllerMapping.uuid) &&
        Objects.equals(this.vsUuid, logControllerMapping.vsUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, controllerIp, metricsMgrPort, nodeUuid, prevControllerIp, prevMetricsMgrPort, staticMapping, tenantRef, url, uuid, vsUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogControllerMapping {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    controllerIp: ").append(toIndentedString(controllerIp)).append("\n");
    sb.append("    metricsMgrPort: ").append(toIndentedString(metricsMgrPort)).append("\n");
    sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
    sb.append("    prevControllerIp: ").append(toIndentedString(prevControllerIp)).append("\n");
    sb.append("    prevMetricsMgrPort: ").append(toIndentedString(prevMetricsMgrPort)).append("\n");
    sb.append("    staticMapping: ").append(toIndentedString(staticMapping)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

