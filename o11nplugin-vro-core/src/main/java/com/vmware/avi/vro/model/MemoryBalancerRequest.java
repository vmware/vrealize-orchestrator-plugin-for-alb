package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ControllerInfo;
import com.vmware.avi.vro.model.ProcessInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The MemoryBalancerRequest is a POJO class extends AviRestResource that used for creating
 * MemoryBalancerRequest.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MemoryBalancerRequest")
@VsoFinder(name = Constants.FINDER_VRO_MEMORYBALANCERREQUEST, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MemoryBalancerRequest extends AviRestResource {
    @JsonProperty("controller_info")
    @JsonInclude(Include.NON_NULL)
    private ControllerInfo controllerInfo = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("node_uuid")
    @JsonInclude(Include.NON_NULL)
    private String nodeUuid = null;

    @JsonProperty("process_info")
    @JsonInclude(Include.NON_NULL)
    private ProcessInfo processInfo = null;

    @JsonProperty("process_instance")
    @JsonInclude(Include.NON_NULL)
    private String processInstance = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("timestamp")
    @JsonInclude(Include.NON_NULL)
    private String timestamp = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Current details regarding controller.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerInfo
   */
  @VsoMethod
  public ControllerInfo getControllerInfo() {
    return controllerInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Current details regarding controller.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerInfo set the controllerInfo.
   */
  @VsoMethod
  public void setControllerInfo(ControllerInfo controllerInfo) {
    this.controllerInfo = controllerInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of controller process.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of controller process.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of node.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeUuid
   */
  @VsoMethod
  public String getNodeUuid() {
    return nodeUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of node.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nodeUuid set the nodeUuid.
   */
  @VsoMethod
  public void setNodeUuid(String  nodeUuid) {
    this.nodeUuid = nodeUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current process information of the controller process.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return processInfo
   */
  @VsoMethod
  public ProcessInfo getProcessInfo() {
    return processInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Current process information of the controller process.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param processInfo set the processInfo.
   */
  @VsoMethod
  public void setProcessInfo(ProcessInfo processInfo) {
    this.processInfo = processInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Instance of the controller process.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return processInstance
   */
  @VsoMethod
  public String getProcessInstance() {
    return processInstance;
  }

  /**
   * This is the setter method to the attribute.
   * Instance of the controller process.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param processInstance set the processInstance.
   */
  @VsoMethod
  public void setProcessInstance(String  processInstance) {
    this.processInstance = processInstance;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of tenant object.
   * It is a reference to an object of type tenant.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of tenant object.
   * It is a reference to an object of type tenant.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time at which memory balancer request was created/updated.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timestamp
   */
  @VsoMethod
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Time at which memory balancer request was created/updated.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timestamp set the timestamp.
   */
  @VsoMethod
  public void setTimestamp(String  timestamp) {
    this.timestamp = timestamp;
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
   * Uuid of memory balancer request object.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of memory balancer request object.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MemoryBalancerRequest objMemoryBalancerRequest = (MemoryBalancerRequest) o;
  return   Objects.equals(this.uuid, objMemoryBalancerRequest.uuid)&&
  Objects.equals(this.name, objMemoryBalancerRequest.name)&&
  Objects.equals(this.timestamp, objMemoryBalancerRequest.timestamp)&&
  Objects.equals(this.processInfo, objMemoryBalancerRequest.processInfo)&&
  Objects.equals(this.processInstance, objMemoryBalancerRequest.processInstance)&&
  Objects.equals(this.controllerInfo, objMemoryBalancerRequest.controllerInfo)&&
  Objects.equals(this.nodeUuid, objMemoryBalancerRequest.nodeUuid)&&
  Objects.equals(this.tenantRef, objMemoryBalancerRequest.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MemoryBalancerRequest {\n");
      sb.append("    controllerInfo: ").append(toIndentedString(controllerInfo)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
        sb.append("    processInfo: ").append(toIndentedString(processInfo)).append("\n");
        sb.append("    processInstance: ").append(toIndentedString(processInstance)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

