package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.VIGuestvNicIPAddr;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * VIControllerVnicInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIControllerVnicInfo")
@VsoFinder(name = Constants.FINDER_VRO_VICONTROLLERVNICINFO, idAccessor = "getObjectID()")
@Service
public class VIControllerVnicInfo extends AviRestResource  {
  @JsonProperty("portgroup")
  private String portgroup = null;

  @JsonProperty("vnic_ip")
  @Valid
  private List<VIGuestvNicIPAddr> vnicIp = null;

  
  /**
   * portgroup of VIControllerVnicInfo.
   * @return portgroup
  **/
  @ApiModelProperty(required = true, value = "portgroup of VIControllerVnicInfo.")
  @NotNull


 
  @VsoMethod  
  public String getPortgroup() {
    return portgroup;
  }
    
  @VsoMethod
  public void setPortgroup(String portgroup) {
    this.portgroup = portgroup;
  }

  
  public VIControllerVnicInfo addVnicIpItem(VIGuestvNicIPAddr vnicIpItem) {
    if (this.vnicIp == null) {
      this.vnicIp = new ArrayList<VIGuestvNicIPAddr>();
    }
    this.vnicIp.add(vnicIpItem);
    return this;
  }
  
  /**
   * Placeholder for description of property vnic_ip of obj type VIControllerVnicInfo field type str  type object
   * @return vnicIp
  **/
  @ApiModelProperty(value = "Placeholder for description of property vnic_ip of obj type VIControllerVnicInfo field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VIGuestvNicIPAddr> getVnicIp() {
    return vnicIp;
  }
    
  @VsoMethod
  public void setVnicIp(List<VIGuestvNicIPAddr> vnicIp) {
    this.vnicIp = vnicIp;
  }

  
  public String getObjectID() {
		return "VIControllerVnicInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIControllerVnicInfo viControllerVnicInfo = (VIControllerVnicInfo) o;
    return Objects.equals(this.portgroup, viControllerVnicInfo.portgroup) &&
        Objects.equals(this.vnicIp, viControllerVnicInfo.vnicIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portgroup, vnicIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIControllerVnicInfo {\n");
    
    sb.append("    portgroup: ").append(toIndentedString(portgroup)).append("\n");
    sb.append("    vnicIp: ").append(toIndentedString(vnicIp)).append("\n");
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

