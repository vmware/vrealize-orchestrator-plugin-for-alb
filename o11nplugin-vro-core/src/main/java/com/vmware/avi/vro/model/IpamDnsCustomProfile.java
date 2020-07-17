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
 * The IpamDnsCustomProfile is a POJO class extends AviRestResource that used for creating
 * IpamDnsCustomProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IpamDnsCustomProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSCUSTOMPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IpamDnsCustomProfile extends AviRestResource {
  @JsonProperty("custom_ipam_dns_profile_ref")
  @JsonInclude(Include.NON_NULL)
  private String customIpamDnsProfileRef = null;

  @JsonProperty("dynamic_params")
  @JsonInclude(Include.NON_NULL)
  private List<CustomParams> dynamicParams = null;

  @JsonProperty("usable_domains")
  @JsonInclude(Include.NON_NULL)
  private List<String> usableDomains = null;

  @JsonProperty("usable_subnets")
  @JsonInclude(Include.NON_NULL)
  private List<IpAddrPrefix> usableSubnets = null;



  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type customipamdnsprofile.
   * Field introduced in 17.1.1.
   * @return customIpamDnsProfileRef
   */
  @VsoMethod
  public String getCustomIpamDnsProfileRef() {
    return customIpamDnsProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type customipamdnsprofile.
   * Field introduced in 17.1.1.
   * @param customIpamDnsProfileRef set the customIpamDnsProfileRef.
   */
  @VsoMethod
  public void setCustomIpamDnsProfileRef(String  customIpamDnsProfileRef) {
    this.customIpamDnsProfileRef = customIpamDnsProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Custom parameters that will passed to the ipam/dns provider including but not limited to provider credentials and api version.
   * Field introduced in 17.1.1.
   * @return dynamicParams
   */
  @VsoMethod
  public List<CustomParams> getDynamicParams() {
    return dynamicParams;
  }

  /**
   * This is the setter method. this will set the dynamicParams
   * Custom parameters that will passed to the ipam/dns provider including but not limited to provider credentials and api version.
   * Field introduced in 17.1.1.
   * @return dynamicParams
   */
  @VsoMethod
  public void setDynamicParams(List<CustomParams>  dynamicParams) {
    this.dynamicParams = dynamicParams;
  }

  /**
   * This is the setter method this will set the dynamicParams
   * Custom parameters that will passed to the ipam/dns provider including but not limited to provider credentials and api version.
   * Field introduced in 17.1.1.
   * @return dynamicParams
   */
  @VsoMethod
  public IpamDnsCustomProfile addDynamicParamsItem(CustomParams dynamicParamsItem) {
    if (this.dynamicParams == null) {
      this.dynamicParams = new ArrayList<CustomParams>();
    }
    this.dynamicParams.add(dynamicParamsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Usable domains.
   * Field introduced in 17.2.2.
   * @return usableDomains
   */
  @VsoMethod
  public List<String> getUsableDomains() {
    return usableDomains;
  }

  /**
   * This is the setter method. this will set the usableDomains
   * Usable domains.
   * Field introduced in 17.2.2.
   * @return usableDomains
   */
  @VsoMethod
  public void setUsableDomains(List<String>  usableDomains) {
    this.usableDomains = usableDomains;
  }

  /**
   * This is the setter method this will set the usableDomains
   * Usable domains.
   * Field introduced in 17.2.2.
   * @return usableDomains
   */
  @VsoMethod
  public IpamDnsCustomProfile addUsableDomainsItem(String usableDomainsItem) {
    if (this.usableDomains == null) {
      this.usableDomains = new ArrayList<String>();
    }
    this.usableDomains.add(usableDomainsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Usable subnets.
   * Field introduced in 17.2.2.
   * @return usableSubnets
   */
  @VsoMethod
  public List<IpAddrPrefix> getUsableSubnets() {
    return usableSubnets;
  }

  /**
   * This is the setter method. this will set the usableSubnets
   * Usable subnets.
   * Field introduced in 17.2.2.
   * @return usableSubnets
   */
  @VsoMethod
  public void setUsableSubnets(List<IpAddrPrefix>  usableSubnets) {
    this.usableSubnets = usableSubnets;
  }

  /**
   * This is the setter method this will set the usableSubnets
   * Usable subnets.
   * Field introduced in 17.2.2.
   * @return usableSubnets
   */
  @VsoMethod
  public IpamDnsCustomProfile addUsableSubnetsItem(IpAddrPrefix usableSubnetsItem) {
    if (this.usableSubnets == null) {
      this.usableSubnets = new ArrayList<IpAddrPrefix>();
    }
    this.usableSubnets.add(usableSubnetsItem);
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
  IpamDnsCustomProfile objIpamDnsCustomProfile = (IpamDnsCustomProfile) o;
  return   Objects.equals(this.usableDomains, objIpamDnsCustomProfile.usableDomains)&&
  Objects.equals(this.usableSubnets, objIpamDnsCustomProfile.usableSubnets)&&
  Objects.equals(this.customIpamDnsProfileRef, objIpamDnsCustomProfile.customIpamDnsProfileRef)&&
  Objects.equals(this.dynamicParams, objIpamDnsCustomProfile.dynamicParams);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IpamDnsCustomProfile {\n");
      sb.append("    customIpamDnsProfileRef: ").append(toIndentedString(customIpamDnsProfileRef)).append("\n");
        sb.append("    dynamicParams: ").append(toIndentedString(dynamicParams)).append("\n");
        sb.append("    usableDomains: ").append(toIndentedString(usableDomains)).append("\n");
        sb.append("    usableSubnets: ").append(toIndentedString(usableSubnets)).append("\n");
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

