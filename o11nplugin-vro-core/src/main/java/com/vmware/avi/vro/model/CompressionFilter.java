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
 * CompressionFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CompressionFilter")
@VsoFinder(name = Constants.FINDER_VRO_COMPRESSIONFILTER, idAccessor = "getObjectID()")
@Service
public class CompressionFilter extends AviRestResource  {
  @JsonProperty("devices_ref")
  private String devicesRef = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("ip_addr_prefixes")
  @Valid
  private List<IpAddrPrefix> ipAddrPrefixes = null;

  @JsonProperty("ip_addr_ranges")
  @Valid
  private List<IpAddrRange> ipAddrRanges = null;

  @JsonProperty("ip_addrs")
  @Valid
  private List<IpAddr> ipAddrs = null;

  @JsonProperty("ip_addrs_ref")
  private String ipAddrsRef = null;

  @JsonProperty("level")
  private String level = "NORMAL_COMPRESSION";

  @JsonProperty("match")
  private String match = "IS_IN";

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("user_agent")
  @Valid
  private List<String> userAgent = null;

  
  /**
   *  It is a reference to an object of type StringGroup.
   * @return devicesRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type StringGroup.")


 
  @VsoMethod  
  public String getDevicesRef() {
    return devicesRef;
  }
    
  @VsoMethod
  public void setDevicesRef(String devicesRef) {
    this.devicesRef = devicesRef;
  }

  
  /**
   * Number of index.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Number of index.")
  @NotNull


 
  @VsoMethod  
  public Integer getIndex() {
    return index;
  }
    
  @VsoMethod
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  public CompressionFilter addIpAddrPrefixesItem(IpAddrPrefix ipAddrPrefixesItem) {
    if (this.ipAddrPrefixes == null) {
      this.ipAddrPrefixes = new ArrayList<IpAddrPrefix>();
    }
    this.ipAddrPrefixes.add(ipAddrPrefixesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property ip_addr_prefixes of obj type CompressionFilter field type str  type object
   * @return ipAddrPrefixes
  **/
  @ApiModelProperty(value = "Placeholder for description of property ip_addr_prefixes of obj type CompressionFilter field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getIpAddrPrefixes() {
    return ipAddrPrefixes;
  }
    
  @VsoMethod
  public void setIpAddrPrefixes(List<IpAddrPrefix> ipAddrPrefixes) {
    this.ipAddrPrefixes = ipAddrPrefixes;
  }

  
  public CompressionFilter addIpAddrRangesItem(IpAddrRange ipAddrRangesItem) {
    if (this.ipAddrRanges == null) {
      this.ipAddrRanges = new ArrayList<IpAddrRange>();
    }
    this.ipAddrRanges.add(ipAddrRangesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property ip_addr_ranges of obj type CompressionFilter field type str  type object
   * @return ipAddrRanges
  **/
  @ApiModelProperty(value = "Placeholder for description of property ip_addr_ranges of obj type CompressionFilter field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<IpAddrRange> getIpAddrRanges() {
    return ipAddrRanges;
  }
    
  @VsoMethod
  public void setIpAddrRanges(List<IpAddrRange> ipAddrRanges) {
    this.ipAddrRanges = ipAddrRanges;
  }

  
  public CompressionFilter addIpAddrsItem(IpAddr ipAddrsItem) {
    if (this.ipAddrs == null) {
      this.ipAddrs = new ArrayList<IpAddr>();
    }
    this.ipAddrs.add(ipAddrsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property ip_addrs of obj type CompressionFilter field type str  type object
   * @return ipAddrs
  **/
  @ApiModelProperty(value = "Placeholder for description of property ip_addrs of obj type CompressionFilter field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getIpAddrs() {
    return ipAddrs;
  }
    
  @VsoMethod
  public void setIpAddrs(List<IpAddr> ipAddrs) {
    this.ipAddrs = ipAddrs;
  }

  
  /**
   *  It is a reference to an object of type IpAddrGroup.
   * @return ipAddrsRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type IpAddrGroup.")


 
  @VsoMethod  
  public String getIpAddrsRef() {
    return ipAddrsRef;
  }
    
  @VsoMethod
  public void setIpAddrsRef(String ipAddrsRef) {
    this.ipAddrsRef = ipAddrsRef;
  }

  
  /**
   *  Enum options - AGGRESSIVE_COMPRESSION, NORMAL_COMPRESSION, NO_COMPRESSION.
   * @return level
  **/
  @ApiModelProperty(required = true, value = " Enum options - AGGRESSIVE_COMPRESSION, NORMAL_COMPRESSION, NO_COMPRESSION.")
  @NotNull


 
  @VsoMethod  
  public String getLevel() {
    return level;
  }
    
  @VsoMethod
  public void setLevel(String level) {
    this.level = level;
  }

  
  /**
   * Whether to apply Filter when group criteria is matched or not. Enum options - IS_IN, IS_NOT_IN.
   * @return match
  **/
  @ApiModelProperty(value = "Whether to apply Filter when group criteria is matched or not. Enum options - IS_IN, IS_NOT_IN.")


 
  @VsoMethod  
  public String getMatch() {
    return match;
  }
    
  @VsoMethod
  public void setMatch(String match) {
    this.match = match;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public CompressionFilter addUserAgentItem(String userAgentItem) {
    if (this.userAgent == null) {
      this.userAgent = new ArrayList<String>();
    }
    this.userAgent.add(userAgentItem);
    return this;
  }
  
  /**
   * user_agent of CompressionFilter.
   * @return userAgent
  **/
  @ApiModelProperty(value = "user_agent of CompressionFilter.")


 
  @VsoMethod  
  public List<String> getUserAgent() {
    return userAgent;
  }
    
  @VsoMethod
  public void setUserAgent(List<String> userAgent) {
    this.userAgent = userAgent;
  }

  
  public String getObjectID() {
		return "CompressionFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompressionFilter compressionFilter = (CompressionFilter) o;
    return Objects.equals(this.devicesRef, compressionFilter.devicesRef) &&
        Objects.equals(this.index, compressionFilter.index) &&
        Objects.equals(this.ipAddrPrefixes, compressionFilter.ipAddrPrefixes) &&
        Objects.equals(this.ipAddrRanges, compressionFilter.ipAddrRanges) &&
        Objects.equals(this.ipAddrs, compressionFilter.ipAddrs) &&
        Objects.equals(this.ipAddrsRef, compressionFilter.ipAddrsRef) &&
        Objects.equals(this.level, compressionFilter.level) &&
        Objects.equals(this.match, compressionFilter.match) &&
        Objects.equals(this.name, compressionFilter.name) &&
        Objects.equals(this.userAgent, compressionFilter.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devicesRef, index, ipAddrPrefixes, ipAddrRanges, ipAddrs, ipAddrsRef, level, match, name, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompressionFilter {\n");
    
    sb.append("    devicesRef: ").append(toIndentedString(devicesRef)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    ipAddrPrefixes: ").append(toIndentedString(ipAddrPrefixes)).append("\n");
    sb.append("    ipAddrRanges: ").append(toIndentedString(ipAddrRanges)).append("\n");
    sb.append("    ipAddrs: ").append(toIndentedString(ipAddrs)).append("\n");
    sb.append("    ipAddrsRef: ").append(toIndentedString(ipAddrsRef)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

