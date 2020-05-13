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
 * DebugIpAddr
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugIpAddr")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGIPADDR, idAccessor = "getObjectID()")
@Service
public class DebugIpAddr extends AviRestResource  {
  @JsonProperty("addrs")
  @Valid
  private List<IpAddr> addrs = null;

  @JsonProperty("prefixes")
  @Valid
  private List<IpAddrPrefix> prefixes = null;

  @JsonProperty("ranges")
  @Valid
  private List<IpAddrRange> ranges = null;

  
  public DebugIpAddr addAddrsItem(IpAddr addrsItem) {
    if (this.addrs == null) {
      this.addrs = new ArrayList<IpAddr>();
    }
    this.addrs.add(addrsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property addrs of obj type DebugIpAddr field type str  type object
   * @return addrs
  **/
  @ApiModelProperty(value = "Placeholder for description of property addrs of obj type DebugIpAddr field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getAddrs() {
    return addrs;
  }
    
  @VsoMethod
  public void setAddrs(List<IpAddr> addrs) {
    this.addrs = addrs;
  }

  
  public DebugIpAddr addPrefixesItem(IpAddrPrefix prefixesItem) {
    if (this.prefixes == null) {
      this.prefixes = new ArrayList<IpAddrPrefix>();
    }
    this.prefixes.add(prefixesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property prefixes of obj type DebugIpAddr field type str  type object
   * @return prefixes
  **/
  @ApiModelProperty(value = "Placeholder for description of property prefixes of obj type DebugIpAddr field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getPrefixes() {
    return prefixes;
  }
    
  @VsoMethod
  public void setPrefixes(List<IpAddrPrefix> prefixes) {
    this.prefixes = prefixes;
  }

  
  public DebugIpAddr addRangesItem(IpAddrRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<IpAddrRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property ranges of obj type DebugIpAddr field type str  type object
   * @return ranges
  **/
  @ApiModelProperty(value = "Placeholder for description of property ranges of obj type DebugIpAddr field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<IpAddrRange> getRanges() {
    return ranges;
  }
    
  @VsoMethod
  public void setRanges(List<IpAddrRange> ranges) {
    this.ranges = ranges;
  }

  
  public String getObjectID() {
		return "DebugIpAddr";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugIpAddr debugIpAddr = (DebugIpAddr) o;
    return Objects.equals(this.addrs, debugIpAddr.addrs) &&
        Objects.equals(this.prefixes, debugIpAddr.prefixes) &&
        Objects.equals(this.ranges, debugIpAddr.ranges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addrs, prefixes, ranges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugIpAddr {\n");
    
    sb.append("    addrs: ").append(toIndentedString(addrs)).append("\n");
    sb.append("    prefixes: ").append(toIndentedString(prefixes)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
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

