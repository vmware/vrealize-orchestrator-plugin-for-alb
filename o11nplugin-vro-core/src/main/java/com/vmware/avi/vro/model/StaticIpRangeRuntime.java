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
 * The StaticIpRangeRuntime is a POJO class extends AviRestResource that used for creating
 * StaticIpRangeRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "StaticIpRangeRuntime")
@VsoFinder(name = Constants.FINDER_VRO_STATICIPRANGERUNTIME)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class StaticIpRangeRuntime extends AviRestResource {
    @JsonProperty("allocated_ips")
    @JsonInclude(Include.NON_NULL)
    private List<StaticIpAllocInfo> allocatedIps;

    @JsonProperty("free_ip_count")
    @JsonInclude(Include.NON_NULL)
    private Integer freeIpCount;

    @JsonProperty("total_ip_count")
    @JsonInclude(Include.NON_NULL)
    private Integer totalIpCount;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = "STATIC_IPS_FOR_VIP_AND_SE";



  /**
   * This is the getter method this will return the attribute value.
   * Allocated ips.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allocatedIps
   */
  @VsoMethod
  public List<StaticIpAllocInfo> getAllocatedIps() {
    return allocatedIps;
  }

  /**
   * This is the setter method. this will set the allocatedIps
   * Allocated ips.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allocatedIps
   */
  @VsoMethod
  public void setAllocatedIps(List<StaticIpAllocInfo>  allocatedIps) {
    this.allocatedIps = allocatedIps;
  }

  /**
   * This is the setter method this will set the allocatedIps
   * Allocated ips.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allocatedIps
   */
  @VsoMethod
  public StaticIpRangeRuntime addAllocatedIpsItem(StaticIpAllocInfo allocatedIpsItem) {
    if (this.allocatedIps == null) {
      this.allocatedIps = new ArrayList<StaticIpAllocInfo>();
    }
    this.allocatedIps.add(allocatedIpsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Free ip count.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return freeIpCount
   */
  @VsoMethod
  public Integer getFreeIpCount() {
    return freeIpCount;
  }

  /**
   * This is the setter method to the attribute.
   * Free ip count.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param freeIpCount set the freeIpCount.
   */
  @VsoMethod
  public void setFreeIpCount(Integer  freeIpCount) {
    this.freeIpCount = freeIpCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total ip count.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalIpCount
   */
  @VsoMethod
  public Integer getTotalIpCount() {
    return totalIpCount;
  }

  /**
   * This is the setter method to the attribute.
   * Total ip count.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalIpCount set the totalIpCount.
   */
  @VsoMethod
  public void setTotalIpCount(Integer  totalIpCount) {
    this.totalIpCount = totalIpCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Object type (vip only, service engine only, or both) which is using this ip group.
   * Enum options - STATIC_IPS_FOR_SE, STATIC_IPS_FOR_VIP, STATIC_IPS_FOR_VIP_AND_SE.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "STATIC_IPS_FOR_VIP_AND_SE".
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Object type (vip only, service engine only, or both) which is using this ip group.
   * Enum options - STATIC_IPS_FOR_SE, STATIC_IPS_FOR_VIP, STATIC_IPS_FOR_VIP_AND_SE.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "STATIC_IPS_FOR_VIP_AND_SE".
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
  StaticIpRangeRuntime objStaticIpRangeRuntime = (StaticIpRangeRuntime) o;
  return   Objects.equals(this.type, objStaticIpRangeRuntime.type)&&
  Objects.equals(this.allocatedIps, objStaticIpRangeRuntime.allocatedIps)&&
  Objects.equals(this.totalIpCount, objStaticIpRangeRuntime.totalIpCount)&&
  Objects.equals(this.freeIpCount, objStaticIpRangeRuntime.freeIpCount);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class StaticIpRangeRuntime {\n");
      sb.append("    allocatedIps: ").append(toIndentedString(allocatedIps)).append("\n");
        sb.append("    freeIpCount: ").append(toIndentedString(freeIpCount)).append("\n");
        sb.append("    totalIpCount: ").append(toIndentedString(totalIpCount)).append("\n");
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

