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
 * The IPAddrLimits is a POJO class extends AviRestResource that used for creating
 * IPAddrLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IPAddrLimits")
@VsoFinder(name = Constants.FINDER_VRO_IPADDRLIMITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IPAddrLimits extends AviRestResource {
    @JsonProperty("ip_address_group_per_match_criteria")
    @JsonInclude(Include.NON_NULL)
    private Integer ipAddressGroupPerMatchCriteria;

    @JsonProperty("ip_address_prefix_per_match_criteria")
    @JsonInclude(Include.NON_NULL)
    private Integer ipAddressPrefixPerMatchCriteria;

    @JsonProperty("ip_address_range_per_match_criteria")
    @JsonInclude(Include.NON_NULL)
    private Integer ipAddressRangePerMatchCriteria;

    @JsonProperty("ip_addresses_per_match_criteria")
    @JsonInclude(Include.NON_NULL)
    private Integer ipAddressesPerMatchCriteria;



  /**
   * This is the getter method this will return the attribute value.
   * Number of ip address groups for match criteria.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddressGroupPerMatchCriteria
   */
  @VsoMethod
  public Integer getIpAddressGroupPerMatchCriteria() {
    return ipAddressGroupPerMatchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Number of ip address groups for match criteria.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipAddressGroupPerMatchCriteria set the ipAddressGroupPerMatchCriteria.
   */
  @VsoMethod
  public void setIpAddressGroupPerMatchCriteria(Integer  ipAddressGroupPerMatchCriteria) {
    this.ipAddressGroupPerMatchCriteria = ipAddressGroupPerMatchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of ip address prefixes for match criteria.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddressPrefixPerMatchCriteria
   */
  @VsoMethod
  public Integer getIpAddressPrefixPerMatchCriteria() {
    return ipAddressPrefixPerMatchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Number of ip address prefixes for match criteria.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipAddressPrefixPerMatchCriteria set the ipAddressPrefixPerMatchCriteria.
   */
  @VsoMethod
  public void setIpAddressPrefixPerMatchCriteria(Integer  ipAddressPrefixPerMatchCriteria) {
    this.ipAddressPrefixPerMatchCriteria = ipAddressPrefixPerMatchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of ip address ranges for match criteria.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddressRangePerMatchCriteria
   */
  @VsoMethod
  public Integer getIpAddressRangePerMatchCriteria() {
    return ipAddressRangePerMatchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Number of ip address ranges for match criteria.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipAddressRangePerMatchCriteria set the ipAddressRangePerMatchCriteria.
   */
  @VsoMethod
  public void setIpAddressRangePerMatchCriteria(Integer  ipAddressRangePerMatchCriteria) {
    this.ipAddressRangePerMatchCriteria = ipAddressRangePerMatchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of ip addresses for match criteria.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddressesPerMatchCriteria
   */
  @VsoMethod
  public Integer getIpAddressesPerMatchCriteria() {
    return ipAddressesPerMatchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Number of ip addresses for match criteria.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipAddressesPerMatchCriteria set the ipAddressesPerMatchCriteria.
   */
  @VsoMethod
  public void setIpAddressesPerMatchCriteria(Integer  ipAddressesPerMatchCriteria) {
    this.ipAddressesPerMatchCriteria = ipAddressesPerMatchCriteria;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IPAddrLimits objIPAddrLimits = (IPAddrLimits) o;
  return   Objects.equals(this.ipAddressesPerMatchCriteria, objIPAddrLimits.ipAddressesPerMatchCriteria)&&
  Objects.equals(this.ipAddressRangePerMatchCriteria, objIPAddrLimits.ipAddressRangePerMatchCriteria)&&
  Objects.equals(this.ipAddressPrefixPerMatchCriteria, objIPAddrLimits.ipAddressPrefixPerMatchCriteria)&&
  Objects.equals(this.ipAddressGroupPerMatchCriteria, objIPAddrLimits.ipAddressGroupPerMatchCriteria);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IPAddrLimits {\n");
      sb.append("    ipAddressGroupPerMatchCriteria: ").append(toIndentedString(ipAddressGroupPerMatchCriteria)).append("\n");
        sb.append("    ipAddressPrefixPerMatchCriteria: ").append(toIndentedString(ipAddressPrefixPerMatchCriteria)).append("\n");
        sb.append("    ipAddressRangePerMatchCriteria: ").append(toIndentedString(ipAddressRangePerMatchCriteria)).append("\n");
        sb.append("    ipAddressesPerMatchCriteria: ").append(toIndentedString(ipAddressesPerMatchCriteria)).append("\n");
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

