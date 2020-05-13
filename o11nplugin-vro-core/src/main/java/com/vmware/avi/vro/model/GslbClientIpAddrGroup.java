package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.IpAddrRange;
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
 * GslbClientIpAddrGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GslbClientIpAddrGroup")
@VsoFinder(name = Constants.FINDER_VRO_GSLBCLIENTIPADDRGROUP, idAccessor = "getObjectID()")
@Service
public class GslbClientIpAddrGroup extends AviRestResource  {
  @JsonProperty("addrs")
  @Valid
  private List<IpAddr> addrs = null;

  @JsonProperty("prefixes")
  @Valid
  private List<IpAddrPrefix> prefixes = null;

  @JsonProperty("ranges")
  @Valid
  private List<IpAddrRange> ranges = null;

  @JsonProperty("type")
  private String type = "GSLB_IP_PUBLIC";

  
  public GslbClientIpAddrGroup addAddrsItem(IpAddr addrsItem) {
    if (this.addrs == null) {
      this.addrs = new ArrayList<IpAddr>();
    }
    this.addrs.add(addrsItem);
    return this;
  }
  
  /**
   * Configure IP address(es). Field introduced in 17.1.2.
   * @return addrs
  **/
  @ApiModelProperty(value = "Configure IP address(es). Field introduced in 17.1.2.")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getAddrs() {
    return addrs;
  }
    
  @VsoMethod
  public void setAddrs(List<IpAddr> addrs) {
    this.addrs = addrs;
  }

  
  public GslbClientIpAddrGroup addPrefixesItem(IpAddrPrefix prefixesItem) {
    if (this.prefixes == null) {
      this.prefixes = new ArrayList<IpAddrPrefix>();
    }
    this.prefixes.add(prefixesItem);
    return this;
  }
  
  /**
   * Configure IP address prefix(es). Field introduced in 17.1.2.
   * @return prefixes
  **/
  @ApiModelProperty(value = "Configure IP address prefix(es). Field introduced in 17.1.2.")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getPrefixes() {
    return prefixes;
  }
    
  @VsoMethod
  public void setPrefixes(List<IpAddrPrefix> prefixes) {
    this.prefixes = prefixes;
  }

  
  public GslbClientIpAddrGroup addRangesItem(IpAddrRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<IpAddrRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }
  
  /**
   * Configure IP address range(s). Field introduced in 17.1.2.
   * @return ranges
  **/
  @ApiModelProperty(value = "Configure IP address range(s). Field introduced in 17.1.2.")

  @Valid

 
  @VsoMethod  
  public List<IpAddrRange> getRanges() {
    return ranges;
  }
    
  @VsoMethod
  public void setRanges(List<IpAddrRange> ranges) {
    this.ranges = ranges;
  }

  
  /**
   * Specify whether this client IP address range is public or private. Enum options - GSLB_IP_PUBLIC, GSLB_IP_PRIVATE. Field introduced in 17.1.2.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Specify whether this client IP address range is public or private. Enum options - GSLB_IP_PUBLIC, GSLB_IP_PRIVATE. Field introduced in 17.1.2.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "GslbClientIpAddrGroup";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbClientIpAddrGroup gslbClientIpAddrGroup = (GslbClientIpAddrGroup) o;
    return Objects.equals(this.addrs, gslbClientIpAddrGroup.addrs) &&
        Objects.equals(this.prefixes, gslbClientIpAddrGroup.prefixes) &&
        Objects.equals(this.ranges, gslbClientIpAddrGroup.ranges) &&
        Objects.equals(this.type, gslbClientIpAddrGroup.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addrs, prefixes, ranges, type);
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

