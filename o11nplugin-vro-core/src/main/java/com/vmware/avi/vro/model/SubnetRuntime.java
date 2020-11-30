package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SubnetRuntime is a POJO class extends AviRestResource that used for creating
 * SubnetRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SubnetRuntime")
@VsoFinder(name = Constants.FINDER_VRO_SUBNETRUNTIME)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SubnetRuntime extends AviRestResource {
    @JsonProperty("free_ip_count")
    @JsonInclude(Include.NON_NULL)
    private Integer freeIpCount;

    @JsonProperty("ip_alloced")
    @JsonInclude(Include.NON_NULL)
    private List<IpAllocInfo> ipAlloced;

    @JsonProperty("ip_range_runtimes")
    @JsonInclude(Include.NON_NULL)
    private List<StaticIpRangeRuntime> ipRangeRuntimes = null;

    @JsonProperty("prefix")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix prefix = null;

    @JsonProperty("total_ip_count")
    @JsonInclude(Include.NON_NULL)
    private Integer totalIpCount;

    @JsonProperty("used_ip_count")
    @JsonInclude(Include.NON_NULL)
    private Integer usedIpCount;



  /**
   * This is the getter method this will return the attribute value.
   * Moved to staticiprangeruntime.
   * Field deprecated in 20.1.3.
   * @return freeIpCount
   */
  @VsoMethod
  public Integer getFreeIpCount() {
    return freeIpCount;
  }

  /**
   * This is the setter method to the attribute.
   * Moved to staticiprangeruntime.
   * Field deprecated in 20.1.3.
   * @param freeIpCount set the freeIpCount.
   */
  @VsoMethod
  public void setFreeIpCount(Integer  freeIpCount) {
    this.freeIpCount = freeIpCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use allocated_ips in staticiprangeruntime.
   * Field deprecated in 20.1.3.
   * @return ipAlloced
   */
  @VsoMethod
  public List<IpAllocInfo> getIpAlloced() {
    return ipAlloced;
  }

  /**
   * This is the setter method. this will set the ipAlloced
   * Use allocated_ips in staticiprangeruntime.
   * Field deprecated in 20.1.3.
   * @return ipAlloced
   */
  @VsoMethod
  public void setIpAlloced(List<IpAllocInfo>  ipAlloced) {
    this.ipAlloced = ipAlloced;
  }

  /**
   * This is the setter method this will set the ipAlloced
   * Use allocated_ips in staticiprangeruntime.
   * Field deprecated in 20.1.3.
   * @return ipAlloced
   */
  @VsoMethod
  public SubnetRuntime addIpAllocedItem(IpAllocInfo ipAllocedItem) {
    if (this.ipAlloced == null) {
      this.ipAlloced = new ArrayList<IpAllocInfo>();
    }
    this.ipAlloced.add(ipAllocedItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Static ip range runtime.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipRangeRuntimes
   */
  @VsoMethod
  public List<StaticIpRangeRuntime> getIpRangeRuntimes() {
    return ipRangeRuntimes;
  }

  /**
   * This is the setter method. this will set the ipRangeRuntimes
   * Static ip range runtime.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipRangeRuntimes
   */
  @VsoMethod
  public void setIpRangeRuntimes(List<StaticIpRangeRuntime>  ipRangeRuntimes) {
    this.ipRangeRuntimes = ipRangeRuntimes;
  }

  /**
   * This is the setter method this will set the ipRangeRuntimes
   * Static ip range runtime.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipRangeRuntimes
   */
  @VsoMethod
  public SubnetRuntime addIpRangeRuntimesItem(StaticIpRangeRuntime ipRangeRuntimesItem) {
    if (this.ipRangeRuntimes == null) {
      this.ipRangeRuntimes = new ArrayList<StaticIpRangeRuntime>();
    }
    this.ipRangeRuntimes.add(ipRangeRuntimesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property prefix of obj type subnetruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prefix
   */
  @VsoMethod
  public IpAddrPrefix getPrefix() {
    return prefix;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property prefix of obj type subnetruntime field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prefix set the prefix.
   */
  @VsoMethod
  public void setPrefix(IpAddrPrefix prefix) {
    this.prefix = prefix;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Moved to staticiprangeruntime.
   * Field deprecated in 20.1.3.
   * @return totalIpCount
   */
  @VsoMethod
  public Integer getTotalIpCount() {
    return totalIpCount;
  }

  /**
   * This is the setter method to the attribute.
   * Moved to staticiprangeruntime.
   * Field deprecated in 20.1.3.
   * @param totalIpCount set the totalIpCount.
   */
  @VsoMethod
  public void setTotalIpCount(Integer  totalIpCount) {
    this.totalIpCount = totalIpCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Can be derived from total - free in staticiprangeruntime.
   * Field deprecated in 20.1.3.
   * @return usedIpCount
   */
  @VsoMethod
  public Integer getUsedIpCount() {
    return usedIpCount;
  }

  /**
   * This is the setter method to the attribute.
   * Can be derived from total - free in staticiprangeruntime.
   * Field deprecated in 20.1.3.
   * @param usedIpCount set the usedIpCount.
   */
  @VsoMethod
  public void setUsedIpCount(Integer  usedIpCount) {
    this.usedIpCount = usedIpCount;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SubnetRuntime objSubnetRuntime = (SubnetRuntime) o;
  return   Objects.equals(this.prefix, objSubnetRuntime.prefix)&&
  Objects.equals(this.ipAlloced, objSubnetRuntime.ipAlloced)&&
  Objects.equals(this.totalIpCount, objSubnetRuntime.totalIpCount)&&
  Objects.equals(this.usedIpCount, objSubnetRuntime.usedIpCount)&&
  Objects.equals(this.freeIpCount, objSubnetRuntime.freeIpCount)&&
  Objects.equals(this.ipRangeRuntimes, objSubnetRuntime.ipRangeRuntimes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SubnetRuntime {\n");
      sb.append("    freeIpCount: ").append(toIndentedString(freeIpCount)).append("\n");
        sb.append("    ipAlloced: ").append(toIndentedString(ipAlloced)).append("\n");
        sb.append("    ipRangeRuntimes: ").append(toIndentedString(ipRangeRuntimes)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    totalIpCount: ").append(toIndentedString(totalIpCount)).append("\n");
        sb.append("    usedIpCount: ").append(toIndentedString(usedIpCount)).append("\n");
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

