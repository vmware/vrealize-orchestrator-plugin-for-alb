package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.IpAllocInfo;
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
 * SubnetRuntime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SubnetRuntime")
@VsoFinder(name = Constants.FINDER_VRO_SUBNETRUNTIME, idAccessor = "getObjectID()")
@Service
public class SubnetRuntime extends AviRestResource  {
  @JsonProperty("free_ip_count")
  private Integer freeIpCount = null;

  @JsonProperty("ip_alloced")
  @Valid
  private List<IpAllocInfo> ipAlloced = null;

  @JsonProperty("prefix")
  private IpAddrPrefix prefix = null;

  @JsonProperty("total_ip_count")
  private Integer totalIpCount = null;

  @JsonProperty("used_ip_count")
  private Integer usedIpCount = null;

  
  /**
   * Number of free_ip_count.
   * @return freeIpCount
  **/
  @ApiModelProperty(value = "Number of free_ip_count.")


 
  @VsoMethod  
  public Integer getFreeIpCount() {
    return freeIpCount;
  }
    
  @VsoMethod
  public void setFreeIpCount(Integer freeIpCount) {
    this.freeIpCount = freeIpCount;
  }

  
  public SubnetRuntime addIpAllocedItem(IpAllocInfo ipAllocedItem) {
    if (this.ipAlloced == null) {
      this.ipAlloced = new ArrayList<IpAllocInfo>();
    }
    this.ipAlloced.add(ipAllocedItem);
    return this;
  }
  
  /**
   * Placeholder for description of property ip_alloced of obj type SubnetRuntime field type str  type object
   * @return ipAlloced
  **/
  @ApiModelProperty(value = "Placeholder for description of property ip_alloced of obj type SubnetRuntime field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<IpAllocInfo> getIpAlloced() {
    return ipAlloced;
  }
    
  @VsoMethod
  public void setIpAlloced(List<IpAllocInfo> ipAlloced) {
    this.ipAlloced = ipAlloced;
  }

  
  /**
   * Placeholder for description of property prefix of obj type SubnetRuntime field type str  type object
   * @return prefix
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property prefix of obj type SubnetRuntime field type str  type object")
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

  
  /**
   * Number of total_ip_count.
   * @return totalIpCount
  **/
  @ApiModelProperty(value = "Number of total_ip_count.")


 
  @VsoMethod  
  public Integer getTotalIpCount() {
    return totalIpCount;
  }
    
  @VsoMethod
  public void setTotalIpCount(Integer totalIpCount) {
    this.totalIpCount = totalIpCount;
  }

  
  /**
   * Number of used_ip_count.
   * @return usedIpCount
  **/
  @ApiModelProperty(value = "Number of used_ip_count.")


 
  @VsoMethod  
  public Integer getUsedIpCount() {
    return usedIpCount;
  }
    
  @VsoMethod
  public void setUsedIpCount(Integer usedIpCount) {
    this.usedIpCount = usedIpCount;
  }

  
  public String getObjectID() {
		return "SubnetRuntime";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubnetRuntime subnetRuntime = (SubnetRuntime) o;
    return Objects.equals(this.freeIpCount, subnetRuntime.freeIpCount) &&
        Objects.equals(this.ipAlloced, subnetRuntime.ipAlloced) &&
        Objects.equals(this.prefix, subnetRuntime.prefix) &&
        Objects.equals(this.totalIpCount, subnetRuntime.totalIpCount) &&
        Objects.equals(this.usedIpCount, subnetRuntime.usedIpCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeIpCount, ipAlloced, prefix, totalIpCount, usedIpCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetRuntime {\n");
    
    sb.append("    freeIpCount: ").append(toIndentedString(freeIpCount)).append("\n");
    sb.append("    ipAlloced: ").append(toIndentedString(ipAlloced)).append("\n");
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

