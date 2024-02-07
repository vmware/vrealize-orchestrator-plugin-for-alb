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
 * The IpAddrMatch is a POJO class extends AviRestResource that used for creating
 * IpAddrMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IpAddrMatch")
@VsoFinder(name = Constants.FINDER_VRO_IPADDRMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IpAddrMatch extends AviRestResource {
    @JsonProperty("addrs")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> addrs;

    @JsonProperty("group_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> groupRefs;

    @JsonProperty("match_criteria")
    @JsonInclude(Include.NON_NULL)
    private String matchCriteria;

    @JsonProperty("prefixes")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddrPrefix> prefixes;

    @JsonProperty("ranges")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddrRange> ranges;



  /**
   * This is the getter method this will return the attribute value.
   * Ip address(es).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return addrs
   */
  @VsoMethod
  public List<IpAddr> getAddrs() {
    return addrs;
  }

  /**
   * This is the setter method. this will set the addrs
   * Ip address(es).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return addrs
   */
  @VsoMethod
  public void setAddrs(List<IpAddr>  addrs) {
    this.addrs = addrs;
  }

  /**
   * This is the setter method this will set the addrs
   * Ip address(es).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return addrs
   */
  @VsoMethod
  public IpAddrMatch addAddrsItem(IpAddr addrsItem) {
    if (this.addrs == null) {
      this.addrs = new ArrayList<IpAddr>();
    }
    this.addrs.add(addrsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Uuid of ip address group(s).
   * It is a reference to an object of type ipaddrgroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return groupRefs
   */
  @VsoMethod
  public List<String> getGroupRefs() {
    return groupRefs;
  }

  /**
   * This is the setter method. this will set the groupRefs
   * Uuid of ip address group(s).
   * It is a reference to an object of type ipaddrgroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return groupRefs
   */
  @VsoMethod
  public void setGroupRefs(List<String>  groupRefs) {
    this.groupRefs = groupRefs;
  }

  /**
   * This is the setter method this will set the groupRefs
   * Uuid of ip address group(s).
   * It is a reference to an object of type ipaddrgroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return groupRefs
   */
  @VsoMethod
  public IpAddrMatch addGroupRefsItem(String groupRefsItem) {
    if (this.groupRefs == null) {
      this.groupRefs = new ArrayList<String>();
    }
    this.groupRefs.add(groupRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for ip address matching the http request.
   * Enum options - IS_IN, IS_NOT_IN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchCriteria
   */
  @VsoMethod
  public String getMatchCriteria() {
    return matchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for ip address matching the http request.
   * Enum options - IS_IN, IS_NOT_IN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchCriteria set the matchCriteria.
   */
  @VsoMethod
  public void setMatchCriteria(String  matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address prefix(es).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prefixes
   */
  @VsoMethod
  public List<IpAddrPrefix> getPrefixes() {
    return prefixes;
  }

  /**
   * This is the setter method. this will set the prefixes
   * Ip address prefix(es).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prefixes
   */
  @VsoMethod
  public void setPrefixes(List<IpAddrPrefix>  prefixes) {
    this.prefixes = prefixes;
  }

  /**
   * This is the setter method this will set the prefixes
   * Ip address prefix(es).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prefixes
   */
  @VsoMethod
  public IpAddrMatch addPrefixesItem(IpAddrPrefix prefixesItem) {
    if (this.prefixes == null) {
      this.prefixes = new ArrayList<IpAddrPrefix>();
    }
    this.prefixes.add(prefixesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Ip address range(s).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ranges
   */
  @VsoMethod
  public List<IpAddrRange> getRanges() {
    return ranges;
  }

  /**
   * This is the setter method. this will set the ranges
   * Ip address range(s).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ranges
   */
  @VsoMethod
  public void setRanges(List<IpAddrRange>  ranges) {
    this.ranges = ranges;
  }

  /**
   * This is the setter method this will set the ranges
   * Ip address range(s).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ranges
   */
  @VsoMethod
  public IpAddrMatch addRangesItem(IpAddrRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<IpAddrRange>();
    }
    this.ranges.add(rangesItem);
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
  IpAddrMatch objIpAddrMatch = (IpAddrMatch) o;
  return   Objects.equals(this.matchCriteria, objIpAddrMatch.matchCriteria)&&
  Objects.equals(this.addrs, objIpAddrMatch.addrs)&&
  Objects.equals(this.ranges, objIpAddrMatch.ranges)&&
  Objects.equals(this.prefixes, objIpAddrMatch.prefixes)&&
  Objects.equals(this.groupRefs, objIpAddrMatch.groupRefs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IpAddrMatch {\n");
      sb.append("    addrs: ").append(toIndentedString(addrs)).append("\n");
        sb.append("    groupRefs: ").append(toIndentedString(groupRefs)).append("\n");
        sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
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

