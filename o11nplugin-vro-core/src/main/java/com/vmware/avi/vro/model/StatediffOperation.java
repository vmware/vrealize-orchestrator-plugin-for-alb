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
 * The StatediffOperation is a POJO class extends AviRestResource that used for creating
 * StatediffOperation.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "StatediffOperation")
@VsoFinder(name = Constants.FINDER_VRO_STATEDIFFOPERATION, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class StatediffOperation extends AviRestResource {
    @JsonProperty("events")
    @JsonInclude(Include.NON_NULL)
    private List<StatediffEvent> events = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("node_uuid")
    @JsonInclude(Include.NON_NULL)
    private String nodeUuid = null;

    @JsonProperty("operation")
    @JsonInclude(Include.NON_NULL)
    private String operation = null;

    @JsonProperty("phase")
    @JsonInclude(Include.NON_NULL)
    private String phase = null;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Info for each statediff event.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public List<StatediffEvent> getEvents() {
    return events;
  }

  /**
   * This is the setter method. this will set the events
   * Info for each statediff event.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public void setEvents(List<StatediffEvent>  events) {
    this.events = events;
  }

  /**
   * This is the setter method this will set the events
   * Info for each statediff event.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public StatediffOperation addEventsItem(StatediffEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<StatediffEvent>();
    }
    this.events.add(eventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of statediff operation.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of statediff operation.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of node for statediff operation entry.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeUuid
   */
  @VsoMethod
  public String getNodeUuid() {
    return nodeUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of node for statediff operation entry.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nodeUuid set the nodeUuid.
   */
  @VsoMethod
  public void setNodeUuid(String  nodeUuid) {
    this.nodeUuid = nodeUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of statediff operation.
   * Enum options - FB_UPGRADE, FB_ROLLBACK, FB_PATCH, FB_ROLLBACK_PATCH.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return operation
   */
  @VsoMethod
  public String getOperation() {
    return operation;
  }

  /**
   * This is the setter method to the attribute.
   * Type of statediff operation.
   * Enum options - FB_UPGRADE, FB_ROLLBACK, FB_PATCH, FB_ROLLBACK_PATCH.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param operation set the operation.
   */
  @VsoMethod
  public void setOperation(String  operation) {
    this.operation = operation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Phase of statediff operation.
   * Enum options - FB_PRE_SNAPSHOT, FB_POST_SNAPSHOT.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return phase
   */
  @VsoMethod
  public String getPhase() {
    return phase;
  }

  /**
   * This is the setter method to the attribute.
   * Phase of statediff operation.
   * Enum options - FB_PRE_SNAPSHOT, FB_POST_SNAPSHOT.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param phase set the phase.
   */
  @VsoMethod
  public void setPhase(String  phase) {
    this.phase = phase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status of statediff operation.
   * Enum options - FB_INIT, FB_IN_PROGRESS, FB_COMPLETED, FB_FAILED, FB_COMPLETED_WITH_ERRORS.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Status of statediff operation.
   * Enum options - FB_INIT, FB_IN_PROGRESS, FB_COMPLETED, FB_FAILED, FB_COMPLETED_WITH_ERRORS.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Unique identifier for statediff entry.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique identifier for statediff entry.
   * Field introduced in 21.1.3.
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
  StatediffOperation objStatediffOperation = (StatediffOperation) o;
  return   Objects.equals(this.uuid, objStatediffOperation.uuid)&&
  Objects.equals(this.name, objStatediffOperation.name)&&
  Objects.equals(this.operation, objStatediffOperation.operation)&&
  Objects.equals(this.phase, objStatediffOperation.phase)&&
  Objects.equals(this.nodeUuid, objStatediffOperation.nodeUuid)&&
  Objects.equals(this.status, objStatediffOperation.status)&&
  Objects.equals(this.tenantRef, objStatediffOperation.tenantRef)&&
  Objects.equals(this.events, objStatediffOperation.events);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class StatediffOperation {\n");
      sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

