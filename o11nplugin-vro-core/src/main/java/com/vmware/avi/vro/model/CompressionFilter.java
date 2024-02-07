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
 * The CompressionFilter is a POJO class extends AviRestResource that used for creating
 * CompressionFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CompressionFilter")
@VsoFinder(name = Constants.FINDER_VRO_COMPRESSIONFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CompressionFilter extends AviRestResource {
    @JsonProperty("devices_ref")
    @JsonInclude(Include.NON_NULL)
    private String devicesRef;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index;

    @JsonProperty("ip_addr_prefixes")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddrPrefix> ipAddrPrefixes;

    @JsonProperty("ip_addr_ranges")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddrRange> ipAddrRanges;

    @JsonProperty("ip_addrs")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> ipAddrs;

    @JsonProperty("ip_addrs_ref")
    @JsonInclude(Include.NON_NULL)
    private String ipAddrsRef;

    @JsonProperty("level")
    @JsonInclude(Include.NON_NULL)
    private String level = "NORMAL_COMPRESSION";

    @JsonProperty("match")
    @JsonInclude(Include.NON_NULL)
    private String match = "IS_IN";

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("user_agent")
    @JsonInclude(Include.NON_NULL)
    private List<String> userAgent;



  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type stringgroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return devicesRef
   */
  @VsoMethod
  public String getDevicesRef() {
    return devicesRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type stringgroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param devicesRef set the devicesRef.
   */
  @VsoMethod
  public void setDevicesRef(String  devicesRef) {
    this.devicesRef = devicesRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddrPrefixes
   */
  @VsoMethod
  public List<IpAddrPrefix> getIpAddrPrefixes() {
    return ipAddrPrefixes;
  }

  /**
   * This is the setter method. this will set the ipAddrPrefixes
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddrPrefixes
   */
  @VsoMethod
  public void setIpAddrPrefixes(List<IpAddrPrefix>  ipAddrPrefixes) {
    this.ipAddrPrefixes = ipAddrPrefixes;
  }

  /**
   * This is the setter method this will set the ipAddrPrefixes
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddrPrefixes
   */
  @VsoMethod
  public CompressionFilter addIpAddrPrefixesItem(IpAddrPrefix ipAddrPrefixesItem) {
    if (this.ipAddrPrefixes == null) {
      this.ipAddrPrefixes = new ArrayList<IpAddrPrefix>();
    }
    this.ipAddrPrefixes.add(ipAddrPrefixesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddrRanges
   */
  @VsoMethod
  public List<IpAddrRange> getIpAddrRanges() {
    return ipAddrRanges;
  }

  /**
   * This is the setter method. this will set the ipAddrRanges
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddrRanges
   */
  @VsoMethod
  public void setIpAddrRanges(List<IpAddrRange>  ipAddrRanges) {
    this.ipAddrRanges = ipAddrRanges;
  }

  /**
   * This is the setter method this will set the ipAddrRanges
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddrRanges
   */
  @VsoMethod
  public CompressionFilter addIpAddrRangesItem(IpAddrRange ipAddrRangesItem) {
    if (this.ipAddrRanges == null) {
      this.ipAddrRanges = new ArrayList<IpAddrRange>();
    }
    this.ipAddrRanges.add(ipAddrRangesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddrs
   */
  @VsoMethod
  public List<IpAddr> getIpAddrs() {
    return ipAddrs;
  }

  /**
   * This is the setter method. this will set the ipAddrs
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddrs
   */
  @VsoMethod
  public void setIpAddrs(List<IpAddr>  ipAddrs) {
    this.ipAddrs = ipAddrs;
  }

  /**
   * This is the setter method this will set the ipAddrs
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddrs
   */
  @VsoMethod
  public CompressionFilter addIpAddrsItem(IpAddr ipAddrsItem) {
    if (this.ipAddrs == null) {
      this.ipAddrs = new ArrayList<IpAddr>();
    }
    this.ipAddrs.add(ipAddrsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type ipaddrgroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddrsRef
   */
  @VsoMethod
  public String getIpAddrsRef() {
    return ipAddrsRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type ipaddrgroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipAddrsRef set the ipAddrsRef.
   */
  @VsoMethod
  public void setIpAddrsRef(String  ipAddrsRef) {
    this.ipAddrsRef = ipAddrsRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - AGGRESSIVE_COMPRESSION, NORMAL_COMPRESSION, NO_COMPRESSION.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "NORMAL_COMPRESSION".
   * @return level
   */
  @VsoMethod
  public String getLevel() {
    return level;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - AGGRESSIVE_COMPRESSION, NORMAL_COMPRESSION, NO_COMPRESSION.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "NORMAL_COMPRESSION".
   * @param level set the level.
   */
  @VsoMethod
  public void setLevel(String  level) {
    this.level = level;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Whether to apply filter when group criteria is matched or not.
   * Enum options - IS_IN, IS_NOT_IN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "IS_IN".
   * @return match
   */
  @VsoMethod
  public String getMatch() {
    return match;
  }

  /**
   * This is the setter method to the attribute.
   * Whether to apply filter when group criteria is matched or not.
   * Enum options - IS_IN, IS_NOT_IN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "IS_IN".
   * @param match set the match.
   */
  @VsoMethod
  public void setMatch(String  match) {
    this.match = match;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userAgent
   */
  @VsoMethod
  public List<String> getUserAgent() {
    return userAgent;
  }

  /**
   * This is the setter method. this will set the userAgent
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userAgent
   */
  @VsoMethod
  public void setUserAgent(List<String>  userAgent) {
    this.userAgent = userAgent;
  }

  /**
   * This is the setter method this will set the userAgent
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userAgent
   */
  @VsoMethod
  public CompressionFilter addUserAgentItem(String userAgentItem) {
    if (this.userAgent == null) {
      this.userAgent = new ArrayList<String>();
    }
    this.userAgent.add(userAgentItem);
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
  CompressionFilter objCompressionFilter = (CompressionFilter) o;
  return   Objects.equals(this.name, objCompressionFilter.name)&&
  Objects.equals(this.index, objCompressionFilter.index)&&
  Objects.equals(this.match, objCompressionFilter.match)&&
  Objects.equals(this.ipAddrsRef, objCompressionFilter.ipAddrsRef)&&
  Objects.equals(this.ipAddrs, objCompressionFilter.ipAddrs)&&
  Objects.equals(this.ipAddrRanges, objCompressionFilter.ipAddrRanges)&&
  Objects.equals(this.ipAddrPrefixes, objCompressionFilter.ipAddrPrefixes)&&
  Objects.equals(this.devicesRef, objCompressionFilter.devicesRef)&&
  Objects.equals(this.userAgent, objCompressionFilter.userAgent)&&
  Objects.equals(this.level, objCompressionFilter.level);
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

