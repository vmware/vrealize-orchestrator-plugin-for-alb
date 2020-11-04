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
 * The VIGuestvNicIPAddr is a POJO class extends AviRestResource that used for creating
 * VIGuestvNicIPAddr.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VIGuestvNicIPAddr")
@VsoFinder(name = Constants.FINDER_VRO_VIGUESTVNICIPADDR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VIGuestvNicIPAddr extends AviRestResource {
    @JsonProperty("ip_addr")
    @JsonInclude(Include.NON_NULL)
    private String ipAddr = null;

    @JsonProperty("mask")
    @JsonInclude(Include.NON_NULL)
    private Integer mask = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property ip_addr of obj type viguestvnicipaddr field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddr
   */
  @VsoMethod
  public String getIpAddr() {
    return ipAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property ip_addr of obj type viguestvnicipaddr field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipAddr set the ipAddr.
   */
  @VsoMethod
  public void setIpAddr(String  ipAddr) {
    this.ipAddr = ipAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property mask of obj type viguestvnicipaddr field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mask
   */
  @VsoMethod
  public Integer getMask() {
    return mask;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property mask of obj type viguestvnicipaddr field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mask set the mask.
   */
  @VsoMethod
  public void setMask(Integer  mask) {
    this.mask = mask;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VIGuestvNicIPAddr objVIGuestvNicIPAddr = (VIGuestvNicIPAddr) o;
  return   Objects.equals(this.ipAddr, objVIGuestvNicIPAddr.ipAddr)&&
  Objects.equals(this.mask, objVIGuestvNicIPAddr.mask);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VIGuestvNicIPAddr {\n");
      sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
        sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
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

