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
 * The VinfraVcenterNetworkLimit is a POJO class extends AviRestResource that used for creating
 * VinfraVcenterNetworkLimit.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VinfraVcenterNetworkLimit")
@VsoFinder(name = Constants.FINDER_VRO_VINFRAVCENTERNETWORKLIMIT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VinfraVcenterNetworkLimit extends AviRestResource {
  @JsonProperty("additional_reason")
  @JsonInclude(Include.NON_NULL)
  private String additionalReason = null;

  @JsonProperty("current")
  @JsonInclude(Include.NON_NULL)
  private Integer current = null;

  @JsonProperty("limit")
  @JsonInclude(Include.NON_NULL)
  private Integer limit = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property additional_reason of obj type vinfravcenternetworklimit field type str  type string.
   * @return additionalReason
   */
  @VsoMethod
  public String getAdditionalReason() {
    return additionalReason;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property additional_reason of obj type vinfravcenternetworklimit field type str  type string.
   * @param additionalReason set the additionalReason.
   */
  @VsoMethod
  public void setAdditionalReason(String  additionalReason) {
    this.additionalReason = additionalReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property current of obj type vinfravcenternetworklimit field type str  type integer.
   * @return current
   */
  @VsoMethod
  public Integer getCurrent() {
    return current;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property current of obj type vinfravcenternetworklimit field type str  type integer.
   * @param current set the current.
   */
  @VsoMethod
  public void setCurrent(Integer  current) {
    this.current = current;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property limit of obj type vinfravcenternetworklimit field type str  type integer.
   * @return limit
   */
  @VsoMethod
  public Integer getLimit() {
    return limit;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property limit of obj type vinfravcenternetworklimit field type str  type integer.
   * @param limit set the limit.
   */
  @VsoMethod
  public void setLimit(Integer  limit) {
    this.limit = limit;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VinfraVcenterNetworkLimit objVinfraVcenterNetworkLimit = (VinfraVcenterNetworkLimit) o;
  return   Objects.equals(this.current, objVinfraVcenterNetworkLimit.current)&&
  Objects.equals(this.limit, objVinfraVcenterNetworkLimit.limit)&&
  Objects.equals(this.additionalReason, objVinfraVcenterNetworkLimit.additionalReason);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VinfraVcenterNetworkLimit {\n");
      sb.append("    additionalReason: ").append(toIndentedString(additionalReason)).append("\n");
        sb.append("    current: ").append(toIndentedString(current)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

