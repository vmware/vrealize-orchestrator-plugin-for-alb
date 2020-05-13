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
 * IpAddrMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpAddrMatch")
@VsoFinder(name = Constants.FINDER_VRO_IPADDRMATCH, idAccessor = "getObjectID()")
@Service
public class IpAddrMatch extends AviRestResource  {
  @JsonProperty("addrs")
  @Valid
  private List<IpAddr> addrs = null;

  @JsonProperty("group_refs")
  @Valid
  private List<String> groupRefs = null;

  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("prefixes")
  @Valid
  private List<IpAddrPrefix> prefixes = null;

  @JsonProperty("ranges")
  @Valid
  private List<IpAddrRange> ranges = null;

  
  public IpAddrMatch addAddrsItem(IpAddr addrsItem) {
    if (this.addrs == null) {
      this.addrs = new ArrayList<IpAddr>();
    }
    this.addrs.add(addrsItem);
    return this;
  }
  
  /**
   * IP address(es).
   * @return addrs
  **/
  @ApiModelProperty(value = "IP address(es).")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getAddrs() {
    return addrs;
  }
    
  @VsoMethod
  public void setAddrs(List<IpAddr> addrs) {
    this.addrs = addrs;
  }

  
  public IpAddrMatch addGroupRefsItem(String groupRefsItem) {
    if (this.groupRefs == null) {
      this.groupRefs = new ArrayList<String>();
    }
    this.groupRefs.add(groupRefsItem);
    return this;
  }
  
  /**
   * UUID of IP address group(s). It is a reference to an object of type IpAddrGroup.
   * @return groupRefs
  **/
  @ApiModelProperty(value = "UUID of IP address group(s). It is a reference to an object of type IpAddrGroup.")


 
  @VsoMethod  
  public List<String> getGroupRefs() {
    return groupRefs;
  }
    
  @VsoMethod
  public void setGroupRefs(List<String> groupRefs) {
    this.groupRefs = groupRefs;
  }

  
  /**
   * Criterion to use for IP address matching the HTTP request. Enum options - IS_IN, IS_NOT_IN.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for IP address matching the HTTP request. Enum options - IS_IN, IS_NOT_IN.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  public IpAddrMatch addPrefixesItem(IpAddrPrefix prefixesItem) {
    if (this.prefixes == null) {
      this.prefixes = new ArrayList<IpAddrPrefix>();
    }
    this.prefixes.add(prefixesItem);
    return this;
  }
  
  /**
   * IP address prefix(es).
   * @return prefixes
  **/
  @ApiModelProperty(value = "IP address prefix(es).")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getPrefixes() {
    return prefixes;
  }
    
  @VsoMethod
  public void setPrefixes(List<IpAddrPrefix> prefixes) {
    this.prefixes = prefixes;
  }

  
  public IpAddrMatch addRangesItem(IpAddrRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<IpAddrRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }
  
  /**
   * IP address range(s).
   * @return ranges
  **/
  @ApiModelProperty(value = "IP address range(s).")

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
		return "IpAddrMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddrMatch ipAddrMatch = (IpAddrMatch) o;
    return Objects.equals(this.addrs, ipAddrMatch.addrs) &&
        Objects.equals(this.groupRefs, ipAddrMatch.groupRefs) &&
        Objects.equals(this.matchCriteria, ipAddrMatch.matchCriteria) &&
        Objects.equals(this.prefixes, ipAddrMatch.prefixes) &&
        Objects.equals(this.ranges, ipAddrMatch.ranges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addrs, groupRefs, matchCriteria, prefixes, ranges);
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

