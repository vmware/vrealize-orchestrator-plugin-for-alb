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
 * The SeVnicTxQueueStallEventDetails is a POJO class extends AviRestResource that used for creating
 * SeVnicTxQueueStallEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeVnicTxQueueStallEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEVNICTXQUEUESTALLEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeVnicTxQueueStallEventDetails extends AviRestResource {
  @JsonProperty("if_name")
  @JsonInclude(Include.NON_NULL)
  private String ifName = null;

  @JsonProperty("linux_name")
  @JsonInclude(Include.NON_NULL)
  private String linuxName = null;

  @JsonProperty("queue")
  @JsonInclude(Include.NON_NULL)
  private Integer queue = null;

  @JsonProperty("se_ref")
  @JsonInclude(Include.NON_NULL)
  private String seRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Vnic name.
   * @return ifName
   */
  @VsoMethod
  public String getIfName() {
    return ifName;
  }

  /**
   * This is the setter method to the attribute.
   * Vnic name.
   * @param ifName set the ifName.
   */
  @VsoMethod
  public void setIfName(String  ifName) {
    this.ifName = ifName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vnic linux name.
   * @return linuxName
   */
  @VsoMethod
  public String getLinuxName() {
    return linuxName;
  }

  /**
   * This is the setter method to the attribute.
   * Vnic linux name.
   * @param linuxName set the linuxName.
   */
  @VsoMethod
  public void setLinuxName(String  linuxName) {
    this.linuxName = linuxName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Queue number.
   * @return queue
   */
  @VsoMethod
  public Integer getQueue() {
    return queue;
  }

  /**
   * This is the setter method to the attribute.
   * Queue number.
   * @param queue set the queue.
   */
  @VsoMethod
  public void setQueue(Integer  queue) {
    this.queue = queue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * @return seRef
   */
  @VsoMethod
  public String getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * @param seRef set the seRef.
   */
  @VsoMethod
  public void setSeRef(String  seRef) {
    this.seRef = seRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeVnicTxQueueStallEventDetails objSeVnicTxQueueStallEventDetails = (SeVnicTxQueueStallEventDetails) o;
  return   Objects.equals(this.queue, objSeVnicTxQueueStallEventDetails.queue)&&
  Objects.equals(this.linuxName, objSeVnicTxQueueStallEventDetails.linuxName)&&
  Objects.equals(this.seRef, objSeVnicTxQueueStallEventDetails.seRef)&&
  Objects.equals(this.ifName, objSeVnicTxQueueStallEventDetails.ifName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeVnicTxQueueStallEventDetails {\n");
      sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
        sb.append("    linuxName: ").append(toIndentedString(linuxName)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
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
