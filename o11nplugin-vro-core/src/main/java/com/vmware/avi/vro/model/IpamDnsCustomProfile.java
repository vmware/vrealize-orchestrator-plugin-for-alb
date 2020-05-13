package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CustomParams;
import com.vmware.avi.vro.model.IpAddrPrefix;
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
 * IpamDnsCustomProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpamDnsCustomProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSCUSTOMPROFILE, idAccessor = "getObjectID()")
@Service
public class IpamDnsCustomProfile extends AviRestResource  {
  @JsonProperty("custom_ipam_dns_profile_ref")
  private String customIpamDnsProfileRef = null;

  @JsonProperty("dynamic_params")
  @Valid
  private List<CustomParams> dynamicParams = null;

  @JsonProperty("usable_domains")
  @Valid
  private List<String> usableDomains = null;

  @JsonProperty("usable_subnets")
  @Valid
  private List<IpAddrPrefix> usableSubnets = null;

  
  /**
   *  It is a reference to an object of type CustomIpamDnsProfile. Field introduced in 17.1.1.
   * @return customIpamDnsProfileRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type CustomIpamDnsProfile. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getCustomIpamDnsProfileRef() {
    return customIpamDnsProfileRef;
  }
    
  @VsoMethod
  public void setCustomIpamDnsProfileRef(String customIpamDnsProfileRef) {
    this.customIpamDnsProfileRef = customIpamDnsProfileRef;
  }

  
  public IpamDnsCustomProfile addDynamicParamsItem(CustomParams dynamicParamsItem) {
    if (this.dynamicParams == null) {
      this.dynamicParams = new ArrayList<CustomParams>();
    }
    this.dynamicParams.add(dynamicParamsItem);
    return this;
  }
  
  /**
   * Custom parameters that will passed to the IPAM/DNS provider including but not limited to provider credentials and API version. Field introduced in 17.1.1.
   * @return dynamicParams
  **/
  @ApiModelProperty(value = "Custom parameters that will passed to the IPAM/DNS provider including but not limited to provider credentials and API version. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<CustomParams> getDynamicParams() {
    return dynamicParams;
  }
    
  @VsoMethod
  public void setDynamicParams(List<CustomParams> dynamicParams) {
    this.dynamicParams = dynamicParams;
  }

  
  public IpamDnsCustomProfile addUsableDomainsItem(String usableDomainsItem) {
    if (this.usableDomains == null) {
      this.usableDomains = new ArrayList<String>();
    }
    this.usableDomains.add(usableDomainsItem);
    return this;
  }
  
  /**
   * Usable domains. Field introduced in 17.2.2.
   * @return usableDomains
  **/
  @ApiModelProperty(value = "Usable domains. Field introduced in 17.2.2.")


 
  @VsoMethod  
  public List<String> getUsableDomains() {
    return usableDomains;
  }
    
  @VsoMethod
  public void setUsableDomains(List<String> usableDomains) {
    this.usableDomains = usableDomains;
  }

  
  public IpamDnsCustomProfile addUsableSubnetsItem(IpAddrPrefix usableSubnetsItem) {
    if (this.usableSubnets == null) {
      this.usableSubnets = new ArrayList<IpAddrPrefix>();
    }
    this.usableSubnets.add(usableSubnetsItem);
    return this;
  }
  
  /**
   * Usable subnets. Field introduced in 17.2.2.
   * @return usableSubnets
  **/
  @ApiModelProperty(value = "Usable subnets. Field introduced in 17.2.2.")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getUsableSubnets() {
    return usableSubnets;
  }
    
  @VsoMethod
  public void setUsableSubnets(List<IpAddrPrefix> usableSubnets) {
    this.usableSubnets = usableSubnets;
  }

  
  public String getObjectID() {
		return "IpamDnsCustomProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpamDnsCustomProfile ipamDnsCustomProfile = (IpamDnsCustomProfile) o;
    return Objects.equals(this.customIpamDnsProfileRef, ipamDnsCustomProfile.customIpamDnsProfileRef) &&
        Objects.equals(this.dynamicParams, ipamDnsCustomProfile.dynamicParams) &&
        Objects.equals(this.usableDomains, ipamDnsCustomProfile.usableDomains) &&
        Objects.equals(this.usableSubnets, ipamDnsCustomProfile.usableSubnets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customIpamDnsProfileRef, dynamicParams, usableDomains, usableSubnets);
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

