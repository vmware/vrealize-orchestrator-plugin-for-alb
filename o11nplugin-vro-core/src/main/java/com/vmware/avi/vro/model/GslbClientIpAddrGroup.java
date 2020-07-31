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
 * The GslbClientIpAddrGroup is a POJO class extends AviRestResource that used for creating
 * GslbClientIpAddrGroup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbClientIpAddrGroup")
@VsoFinder(name = Constants.FINDER_VRO_GSLBCLIENTIPADDRGROUP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbClientIpAddrGroup extends AviRestResource {
  @JsonProperty("addrs")
  @JsonInclude(Include.NON_NULL)
  private List<IpAddr> addrs = null;

  @JsonProperty("prefixes")
  @JsonInclude(Include.NON_NULL)
  private List<IpAddrPrefix> prefixes = null;

  @JsonProperty("ranges")
  @JsonInclude(Include.NON_NULL)
  private List<IpAddrRange> ranges = null;

  @JsonProperty("type")
  @JsonInclude(Include.NON_NULL)
  private String type = "GSLB_IP_PUBLIC";



  /**
   * This is the getter method this will return the attribute value.
   * Configure ip address(es).
   * Field introduced in 17.1.2.
   * @return addrs
   */
  @VsoMethod
  public List<IpAddr> getAddrs() {
    return addrs;
  }

  /**
   * This is the setter method. this will set the addrs
   * Configure ip address(es).
   * Field introduced in 17.1.2.
   * @return addrs
   */
  @VsoMethod
  public void setAddrs(List<IpAddr>  addrs) {
    this.addrs = addrs;
  }

  /**
   * This is the setter method this will set the addrs
   * Configure ip address(es).
   * Field introduced in 17.1.2.
   * @return addrs
   */
  @VsoMethod
  public GslbClientIpAddrGroup addAddrsItem(IpAddr addrsItem) {
    if (this.addrs == null) {
      this.addrs = new ArrayList<IpAddr>();
    }
    this.addrs.add(addrsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Configure ip address prefix(es).
   * Field introduced in 17.1.2.
   * @return prefixes
   */
  @VsoMethod
  public List<IpAddrPrefix> getPrefixes() {
    return prefixes;
  }

  /**
   * This is the setter method. this will set the prefixes
   * Configure ip address prefix(es).
   * Field introduced in 17.1.2.
   * @return prefixes
   */
  @VsoMethod
  public void setPrefixes(List<IpAddrPrefix>  prefixes) {
    this.prefixes = prefixes;
  }

  /**
   * This is the setter method this will set the prefixes
   * Configure ip address prefix(es).
   * Field introduced in 17.1.2.
   * @return prefixes
   */
  @VsoMethod
  public GslbClientIpAddrGroup addPrefixesItem(IpAddrPrefix prefixesItem) {
    if (this.prefixes == null) {
      this.prefixes = new ArrayList<IpAddrPrefix>();
    }
    this.prefixes.add(prefixesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Configure ip address range(s).
   * Field introduced in 17.1.2.
   * @return ranges
   */
  @VsoMethod
  public List<IpAddrRange> getRanges() {
    return ranges;
  }

  /**
   * This is the setter method. this will set the ranges
   * Configure ip address range(s).
   * Field introduced in 17.1.2.
   * @return ranges
   */
  @VsoMethod
  public void setRanges(List<IpAddrRange>  ranges) {
    this.ranges = ranges;
  }

  /**
   * This is the setter method this will set the ranges
   * Configure ip address range(s).
   * Field introduced in 17.1.2.
   * @return ranges
   */
  @VsoMethod
  public GslbClientIpAddrGroup addRangesItem(IpAddrRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<IpAddrRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Specify whether this client ip address range is public or private.
   * Enum options - GSLB_IP_PUBLIC, GSLB_IP_PRIVATE.
   * Field introduced in 17.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as GSLB_IP_PUBLIC.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Specify whether this client ip address range is public or private.
   * Enum options - GSLB_IP_PUBLIC, GSLB_IP_PRIVATE.
   * Field introduced in 17.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as GSLB_IP_PUBLIC.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbClientIpAddrGroup objGslbClientIpAddrGroup = (GslbClientIpAddrGroup) o;
  return   Objects.equals(this.type, objGslbClientIpAddrGroup.type)&&
  Objects.equals(this.addrs, objGslbClientIpAddrGroup.addrs)&&
  Objects.equals(this.ranges, objGslbClientIpAddrGroup.ranges)&&
  Objects.equals(this.prefixes, objGslbClientIpAddrGroup.prefixes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbClientIpAddrGroup {\n");
      sb.append("    addrs: ").append(toIndentedString(addrs)).append("\n");
        sb.append("    prefixes: ").append(toIndentedString(prefixes)).append("\n");
        sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

