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
 * MemberInterface
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MemberInterface")
@VsoFinder(name = Constants.FINDER_VRO_MEMBERINTERFACE, idAccessor = "getObjectID()")
@Service
public class MemberInterface extends AviRestResource  {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("if_name")
  private String ifName = null;

  @JsonProperty("mac_address")
  private String macAddress = null;

  
  /**
   * Placeholder for description of property active of obj type MemberInterface field type str  type boolean
   * @return active
  **/
  @ApiModelProperty(value = "Placeholder for description of property active of obj type MemberInterface field type str  type boolean")


 
  @VsoMethod  
  public Boolean isActive() {
    return active;
  }
    
  @VsoMethod
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   * if_name of MemberInterface.
   * @return ifName
  **/
  @ApiModelProperty(required = true, value = "if_name of MemberInterface.")
  @NotNull


 
  @VsoMethod  
  public String getIfName() {
    return ifName;
  }
    
  @VsoMethod
  public void setIfName(String ifName) {
    this.ifName = ifName;
  }

  
  /**
   *  Field introduced in 17.1.5.
   * @return macAddress
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.5.")


 
  @VsoMethod  
  public String getMacAddress() {
    return macAddress;
  }
    
  @VsoMethod
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  
  public String getObjectID() {
		return "MemberInterface";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberInterface memberInterface = (MemberInterface) o;
    return Objects.equals(this.active, memberInterface.active) &&
        Objects.equals(this.ifName, memberInterface.ifName) &&
        Objects.equals(this.macAddress, memberInterface.macAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, ifName, macAddress);
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

