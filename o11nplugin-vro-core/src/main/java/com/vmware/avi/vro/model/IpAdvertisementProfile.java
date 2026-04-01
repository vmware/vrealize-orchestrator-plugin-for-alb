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
 * The IpAdvertisementProfile is a POJO class extends AviRestResource that used for creating
 * IpAdvertisementProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IpAdvertisementProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPADVERTISEMENTPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IpAdvertisementProfile extends AviRestResource {
    @JsonProperty("default_periodicity")
    @JsonInclude(Include.NON_NULL)
    private Integer defaultPeriodicity = 10;

    @JsonProperty("ip_types")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddrTypeConfig> ipTypes;



  /**
   * This is the getter method this will return the attribute value.
   * Default periodicity for periodic ip advertisement (gratarp/na) in minutes.
   * Used when a per-type periodicity is not specified.
   * Allowed values are 5-30.
   * Field introduced in 32.2.1.
   * Unit is min.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return defaultPeriodicity
   */
  @VsoMethod
  public Integer getDefaultPeriodicity() {
    return defaultPeriodicity;
  }

  /**
   * This is the setter method to the attribute.
   * Default periodicity for periodic ip advertisement (gratarp/na) in minutes.
   * Used when a per-type periodicity is not specified.
   * Allowed values are 5-30.
   * Field introduced in 32.2.1.
   * Unit is min.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param defaultPeriodicity set the defaultPeriodicity.
   */
  @VsoMethod
  public void setDefaultPeriodicity(Integer  defaultPeriodicity) {
    this.defaultPeriodicity = defaultPeriodicity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of ip address types for which periodic ip advertisement (gratarp/na) is enabled.
   * Supported ip_type values are vip_ip, snat_ip, floating_intf_ip, and primary_intf_ip.
   * Applied uniformly to all vrfs in this serviceenginegroup.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipTypes
   */
  @VsoMethod
  public List<IpAddrTypeConfig> getIpTypes() {
    return ipTypes;
  }

  /**
   * This is the setter method. this will set the ipTypes
   * List of ip address types for which periodic ip advertisement (gratarp/na) is enabled.
   * Supported ip_type values are vip_ip, snat_ip, floating_intf_ip, and primary_intf_ip.
   * Applied uniformly to all vrfs in this serviceenginegroup.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipTypes
   */
  @VsoMethod
  public void setIpTypes(List<IpAddrTypeConfig>  ipTypes) {
    this.ipTypes = ipTypes;
  }

  /**
   * This is the setter method this will set the ipTypes
   * List of ip address types for which periodic ip advertisement (gratarp/na) is enabled.
   * Supported ip_type values are vip_ip, snat_ip, floating_intf_ip, and primary_intf_ip.
   * Applied uniformly to all vrfs in this serviceenginegroup.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipTypes
   */
  @VsoMethod
  public IpAdvertisementProfile addIpTypesItem(IpAddrTypeConfig ipTypesItem) {
    if (this.ipTypes == null) {
      this.ipTypes = new ArrayList<IpAddrTypeConfig>();
    }
    this.ipTypes.add(ipTypesItem);
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
  IpAdvertisementProfile objIpAdvertisementProfile = (IpAdvertisementProfile) o;
  return   Objects.equals(this.defaultPeriodicity, objIpAdvertisementProfile.defaultPeriodicity)&&
  Objects.equals(this.ipTypes, objIpAdvertisementProfile.ipTypes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IpAdvertisementProfile {\n");
      sb.append("    defaultPeriodicity: ").append(toIndentedString(defaultPeriodicity)).append("\n");
        sb.append("    ipTypes: ").append(toIndentedString(ipTypes)).append("\n");
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

