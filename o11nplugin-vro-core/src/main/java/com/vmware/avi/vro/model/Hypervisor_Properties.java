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
 * The Hypervisor_Properties is a POJO class extends AviRestResource that used for creating
 * Hypervisor_Properties.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Hypervisor_Properties")
@VsoFinder(name = Constants.FINDER_VRO_HYPERVISOR_PROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Hypervisor_Properties extends AviRestResource {
    @JsonProperty("htype")
    @JsonInclude(Include.NON_NULL)
    private String htype;

    @JsonProperty("max_ips_per_nic")
    @JsonInclude(Include.NON_NULL)
    private Integer maxIpsPerNic;

    @JsonProperty("max_nics")
    @JsonInclude(Include.NON_NULL)
    private Integer maxNics;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return htype
   */
  @VsoMethod
  public String getHtype() {
    return htype;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param htype set the htype.
   */
  @VsoMethod
  public void setHtype(String  htype) {
    this.htype = htype;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxIpsPerNic
   */
  @VsoMethod
  public Integer getMaxIpsPerNic() {
    return maxIpsPerNic;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxIpsPerNic set the maxIpsPerNic.
   */
  @VsoMethod
  public void setMaxIpsPerNic(Integer  maxIpsPerNic) {
    this.maxIpsPerNic = maxIpsPerNic;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxNics
   */
  @VsoMethod
  public Integer getMaxNics() {
    return maxNics;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxNics set the maxNics.
   */
  @VsoMethod
  public void setMaxNics(Integer  maxNics) {
    this.maxNics = maxNics;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Hypervisor_Properties objHypervisor_Properties = (Hypervisor_Properties) o;
  return   Objects.equals(this.htype, objHypervisor_Properties.htype)&&
  Objects.equals(this.maxNics, objHypervisor_Properties.maxNics)&&
  Objects.equals(this.maxIpsPerNic, objHypervisor_Properties.maxIpsPerNic);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Hypervisor_Properties {\n");
      sb.append("    htype: ").append(toIndentedString(htype)).append("\n");
        sb.append("    maxIpsPerNic: ").append(toIndentedString(maxIpsPerNic)).append("\n");
        sb.append("    maxNics: ").append(toIndentedString(maxNics)).append("\n");
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

