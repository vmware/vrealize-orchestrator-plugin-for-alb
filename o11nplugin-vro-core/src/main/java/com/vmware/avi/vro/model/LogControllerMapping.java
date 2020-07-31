package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The LogControllerMapping is a POJO class extends AviRestResource that used for creating
 * LogControllerMapping.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LogControllerMapping")
@VsoFinder(name = Constants.FINDER_VRO_LOGCONTROLLERMAPPING, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LogControllerMapping extends AviRestResource {
  @JsonProperty("controller_ip")
  @JsonInclude(Include.NON_NULL)
  private String controllerIp = null;

  @JsonProperty("metrics_mgr_port")
  @JsonInclude(Include.NON_NULL)
  private String metricsMgrPort = "METRICS_MGR_PORT_0";

  @JsonProperty("node_uuid")
  @JsonInclude(Include.NON_NULL)
  private String nodeUuid = null;

  @JsonProperty("prev_controller_ip")
  @JsonInclude(Include.NON_NULL)
  private String prevControllerIp = null;

  @JsonProperty("prev_metrics_mgr_port")
  @JsonInclude(Include.NON_NULL)
  private String prevMetricsMgrPort = "METRICS_MGR_PORT_0";

  @JsonProperty("static_mapping")
  @JsonInclude(Include.NON_NULL)
  private Boolean staticMapping = false;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;

  @JsonProperty("vs_uuid")
  @JsonInclude(Include.NON_NULL)
  private String vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property controller_ip of obj type logcontrollermapping field type str  type string.
   * @return controllerIp
   */
  @VsoMethod
  public String getControllerIp() {
    return controllerIp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property controller_ip of obj type logcontrollermapping field type str  type string.
   * @param controllerIp set the controllerIp.
   */
  @VsoMethod
  public void setControllerIp(String  controllerIp) {
    this.controllerIp = controllerIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * Default value when not specified in API or module is interpreted by Avi Controller as METRICS_MGR_PORT_0.
   * @return metricsMgrPort
   */
  @VsoMethod
  public String getMetricsMgrPort() {
    return metricsMgrPort;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * Default value when not specified in API or module is interpreted by Avi Controller as METRICS_MGR_PORT_0.
   * @param metricsMgrPort set the metricsMgrPort.
   */
  @VsoMethod
  public void setMetricsMgrPort(String  metricsMgrPort) {
    this.metricsMgrPort = metricsMgrPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of node.
   * @return nodeUuid
   */
  @VsoMethod
  public String getNodeUuid() {
    return nodeUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of node.
   * @param nodeUuid set the nodeUuid.
   */
  @VsoMethod
  public void setNodeUuid(String  nodeUuid) {
    this.nodeUuid = nodeUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property prev_controller_ip of obj type logcontrollermapping field type str  type string.
   * @return prevControllerIp
   */
  @VsoMethod
  public String getPrevControllerIp() {
    return prevControllerIp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property prev_controller_ip of obj type logcontrollermapping field type str  type string.
   * @param prevControllerIp set the prevControllerIp.
   */
  @VsoMethod
  public void setPrevControllerIp(String  prevControllerIp) {
    this.prevControllerIp = prevControllerIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * Default value when not specified in API or module is interpreted by Avi Controller as METRICS_MGR_PORT_0.
   * @return prevMetricsMgrPort
   */
  @VsoMethod
  public String getPrevMetricsMgrPort() {
    return prevMetricsMgrPort;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * Default value when not specified in API or module is interpreted by Avi Controller as METRICS_MGR_PORT_0.
   * @param prevMetricsMgrPort set the prevMetricsMgrPort.
   */
  @VsoMethod
  public void setPrevMetricsMgrPort(String  prevMetricsMgrPort) {
    this.prevMetricsMgrPort = prevMetricsMgrPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property static_mapping of obj type logcontrollermapping field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return staticMapping
   */
  @VsoMethod
  public Boolean getStaticMapping() {
    return staticMapping;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property static_mapping of obj type logcontrollermapping field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param staticMapping set the staticMapping.
   */
  @VsoMethod
  public void setStaticMapping(Boolean  staticMapping) {
    this.staticMapping = staticMapping;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of vs.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of vs.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }


  public String getObjectID() {
    return "LogControllerMapping" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LogControllerMapping objLogControllerMapping = (LogControllerMapping) o;
  return   Objects.equals(this.uuid, objLogControllerMapping.uuid)&&
  Objects.equals(this.vsUuid, objLogControllerMapping.vsUuid)&&
  Objects.equals(this.controllerIp, objLogControllerMapping.controllerIp)&&
  Objects.equals(this.prevControllerIp, objLogControllerMapping.prevControllerIp)&&
  Objects.equals(this.metricsMgrPort, objLogControllerMapping.metricsMgrPort)&&
  Objects.equals(this.prevMetricsMgrPort, objLogControllerMapping.prevMetricsMgrPort)&&
  Objects.equals(this.staticMapping, objLogControllerMapping.staticMapping)&&
  Objects.equals(this.nodeUuid, objLogControllerMapping.nodeUuid)&&
  Objects.equals(this.tenantRef, objLogControllerMapping.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LogControllerMapping {\n");
      sb.append("    controllerIp: ").append(toIndentedString(controllerIp)).append("\n");
        sb.append("    metricsMgrPort: ").append(toIndentedString(metricsMgrPort)).append("\n");
        sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
        sb.append("    prevControllerIp: ").append(toIndentedString(prevControllerIp)).append("\n");
        sb.append("    prevMetricsMgrPort: ").append(toIndentedString(prevMetricsMgrPort)).append("\n");
        sb.append("    staticMapping: ").append(toIndentedString(staticMapping)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

