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
 * The VIControllerVnicInfo is a POJO class extends AviRestResource that used for creating
 * VIControllerVnicInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VIControllerVnicInfo")
@VsoFinder(name = Constants.FINDER_VRO_VICONTROLLERVNICINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VIControllerVnicInfo extends AviRestResource {
    @JsonProperty("portgroup")
    @JsonInclude(Include.NON_NULL)
    private String portgroup = null;

    @JsonProperty("vnic_ip")
    @JsonInclude(Include.NON_NULL)
    private List<VIGuestvNicIPAddr> vnicIp = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property portgroup of obj type vicontrollervnicinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return portgroup
   */
  @VsoMethod
  public String getPortgroup() {
    return portgroup;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property portgroup of obj type vicontrollervnicinfo field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param portgroup set the portgroup.
   */
  @VsoMethod
  public void setPortgroup(String  portgroup) {
    this.portgroup = portgroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vnic_ip of obj type vicontrollervnicinfo field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnicIp
   */
  @VsoMethod
  public List<VIGuestvNicIPAddr> getVnicIp() {
    return vnicIp;
  }

  /**
   * This is the setter method. this will set the vnicIp
   * Placeholder for description of property vnic_ip of obj type vicontrollervnicinfo field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnicIp
   */
  @VsoMethod
  public void setVnicIp(List<VIGuestvNicIPAddr>  vnicIp) {
    this.vnicIp = vnicIp;
  }

  /**
   * This is the setter method this will set the vnicIp
   * Placeholder for description of property vnic_ip of obj type vicontrollervnicinfo field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnicIp
   */
  @VsoMethod
  public VIControllerVnicInfo addVnicIpItem(VIGuestvNicIPAddr vnicIpItem) {
    if (this.vnicIp == null) {
      this.vnicIp = new ArrayList<VIGuestvNicIPAddr>();
    }
    this.vnicIp.add(vnicIpItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VIControllerVnicInfo objVIControllerVnicInfo = (VIControllerVnicInfo) o;
  return   Objects.equals(this.portgroup, objVIControllerVnicInfo.portgroup)&&
  Objects.equals(this.vnicIp, objVIControllerVnicInfo.vnicIp);
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

