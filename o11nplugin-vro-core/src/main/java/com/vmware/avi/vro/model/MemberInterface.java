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
 * The MemberInterface is a POJO class extends AviRestResource that used for creating
 * MemberInterface.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MemberInterface")
@VsoFinder(name = Constants.FINDER_VRO_MEMBERINTERFACE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MemberInterface extends AviRestResource {
  @JsonProperty("active")
  @JsonInclude(Include.NON_NULL)
  private Boolean active = false;

  @JsonProperty("if_name")
  @JsonInclude(Include.NON_NULL)
  private String ifName = null;

  @JsonProperty("mac_address")
  @JsonInclude(Include.NON_NULL)
  private String macAddress = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property active of obj type memberinterface field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return active
   */
  @VsoMethod
  public Boolean getActive() {
    return active;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property active of obj type memberinterface field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param active set the active.
   */
  @VsoMethod
  public void setActive(Boolean  active) {
    this.active = active;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property if_name of obj type memberinterface field type str  type string.
   * @return ifName
   */
  @VsoMethod
  public String getIfName() {
    return ifName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property if_name of obj type memberinterface field type str  type string.
   * @param ifName set the ifName.
   */
  @VsoMethod
  public void setIfName(String  ifName) {
    this.ifName = ifName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.5.
   * @return macAddress
   */
  @VsoMethod
  public String getMacAddress() {
    return macAddress;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.5.
   * @param macAddress set the macAddress.
   */
  @VsoMethod
  public void setMacAddress(String  macAddress) {
    this.macAddress = macAddress;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MemberInterface objMemberInterface = (MemberInterface) o;
  return   Objects.equals(this.ifName, objMemberInterface.ifName)&&
  Objects.equals(this.active, objMemberInterface.active)&&
  Objects.equals(this.macAddress, objMemberInterface.macAddress);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MemberInterface {\n");
      sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
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

