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
 * Subnet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "Subnet")
@VsoFinder(name = Constants.FINDER_VRO_SUBNET, idAccessor = "getObjectID()")
@Service
public class Subnet extends AviRestResource  {
  @JsonProperty("prefix")
  private IpAddrPrefix prefix = null;

  @JsonProperty("static_ips")
  @Valid
  private List<IpAddr> staticIps = null;

  @JsonProperty("static_ranges")
  @Valid
  private List<IpAddrRange> staticRanges = null;

  
  /**
   * Specify an IP subnet prefix for this Network.
   * @return prefix
  **/
  @ApiModelProperty(required = true, value = "Specify an IP subnet prefix for this Network.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getPrefix() {
    return prefix;
  }
    
  @VsoMethod
  public void setPrefix(IpAddrPrefix prefix) {
    this.prefix = prefix;
  }

  
  public Subnet addStaticIpsItem(IpAddr staticIpsItem) {
    if (this.staticIps == null) {
      this.staticIps = new ArrayList<IpAddr>();
    }
    this.staticIps.add(staticIpsItem);
    return this;
  }
  
  /**
   * Specify a pool of IP addresses for use in Service Engines.
   * @return staticIps
  **/
  @ApiModelProperty(value = "Specify a pool of IP addresses for use in Service Engines.")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getStaticIps() {
    return staticIps;
  }
    
  @VsoMethod
  public void setStaticIps(List<IpAddr> staticIps) {
    this.staticIps = staticIps;
  }

  
  public Subnet addStaticRangesItem(IpAddrRange staticRangesItem) {
    if (this.staticRanges == null) {
      this.staticRanges = new ArrayList<IpAddrRange>();
    }
    this.staticRanges.add(staticRangesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property static_ranges of obj type Subnet field type str  type object
   * @return staticRanges
  **/
  @ApiModelProperty(value = "Placeholder for description of property static_ranges of obj type Subnet field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<IpAddrRange> getStaticRanges() {
    return staticRanges;
  }
    
  @VsoMethod
  public void setStaticRanges(List<IpAddrRange> staticRanges) {
    this.staticRanges = staticRanges;
  }

  
  public String getObjectID() {
		return "Subnet";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subnet subnet = (Subnet) o;
    return Objects.equals(this.prefix, subnet.prefix) &&
        Objects.equals(this.staticIps, subnet.staticIps) &&
        Objects.equals(this.staticRanges, subnet.staticRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, staticIps, staticRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subnet {\n");
    
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    staticIps: ").append(toIndentedString(staticIps)).append("\n");
    sb.append("    staticRanges: ").append(toIndentedString(staticRanges)).append("\n");
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

