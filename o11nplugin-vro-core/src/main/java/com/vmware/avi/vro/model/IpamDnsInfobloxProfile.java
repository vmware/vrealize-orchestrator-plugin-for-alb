package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CustomParams;
import com.vmware.avi.vro.model.IpAddr;
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
 * IpamDnsInfobloxProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpamDnsInfobloxProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSINFOBLOXPROFILE, idAccessor = "getObjectID()")
@Service
public class IpamDnsInfobloxProfile extends AviRestResource  {
  @JsonProperty("dns_view")
  private String dnsView = "default";

  @JsonProperty("extensible_attributes")
  @Valid
  private List<CustomParams> extensibleAttributes = null;

  @JsonProperty("ip_address")
  private IpAddr ipAddress = null;

  @JsonProperty("network_view")
  private String networkView = "default";

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("usable_domains")
  @Valid
  private List<String> usableDomains = null;

  @JsonProperty("usable_subnets")
  @Valid
  private List<IpAddrPrefix> usableSubnets = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("wapi_version")
  private String wapiVersion = "2.0";

  
  /**
   * DNS view.
   * @return dnsView
  **/
  @ApiModelProperty(value = "DNS view.")


 
  @VsoMethod  
  public String getDnsView() {
    return dnsView;
  }
    
  @VsoMethod
  public void setDnsView(String dnsView) {
    this.dnsView = dnsView;
  }

  
  public IpamDnsInfobloxProfile addExtensibleAttributesItem(CustomParams extensibleAttributesItem) {
    if (this.extensibleAttributes == null) {
      this.extensibleAttributes = new ArrayList<CustomParams>();
    }
    this.extensibleAttributes.add(extensibleAttributesItem);
    return this;
  }
  
  /**
   * Custom parameters that will passed to the Infoblox provider as extensible attributes. Field introduced in 18.2.7, 20.1.1.
   * @return extensibleAttributes
  **/
  @ApiModelProperty(value = "Custom parameters that will passed to the Infoblox provider as extensible attributes. Field introduced in 18.2.7, 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<CustomParams> getExtensibleAttributes() {
    return extensibleAttributes;
  }
    
  @VsoMethod
  public void setExtensibleAttributes(List<CustomParams> extensibleAttributes) {
    this.extensibleAttributes = extensibleAttributes;
  }

  
  /**
   * Address of Infoblox appliance.
   * @return ipAddress
  **/
  @ApiModelProperty(required = true, value = "Address of Infoblox appliance.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getIpAddress() {
    return ipAddress;
  }
    
  @VsoMethod
  public void setIpAddress(IpAddr ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   * Network view.
   * @return networkView
  **/
  @ApiModelProperty(value = "Network view.")


 
  @VsoMethod  
  public String getNetworkView() {
    return networkView;
  }
    
  @VsoMethod
  public void setNetworkView(String networkView) {
    this.networkView = networkView;
  }

  
  /**
   * Password for API access for Infoblox appliance.
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password for API access for Infoblox appliance.")
  @NotNull


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  public IpamDnsInfobloxProfile addUsableDomainsItem(String usableDomainsItem) {
    if (this.usableDomains == null) {
      this.usableDomains = new ArrayList<String>();
    }
    this.usableDomains.add(usableDomainsItem);
    return this;
  }
  
  /**
   * Usable domains to pick from Infoblox.
   * @return usableDomains
  **/
  @ApiModelProperty(value = "Usable domains to pick from Infoblox.")


 
  @VsoMethod  
  public List<String> getUsableDomains() {
    return usableDomains;
  }
    
  @VsoMethod
  public void setUsableDomains(List<String> usableDomains) {
    this.usableDomains = usableDomains;
  }

  
  public IpamDnsInfobloxProfile addUsableSubnetsItem(IpAddrPrefix usableSubnetsItem) {
    if (this.usableSubnets == null) {
      this.usableSubnets = new ArrayList<IpAddrPrefix>();
    }
    this.usableSubnets.add(usableSubnetsItem);
    return this;
  }
  
  /**
   * Usable subnets to pick from Infoblox.
   * @return usableSubnets
  **/
  @ApiModelProperty(value = "Usable subnets to pick from Infoblox.")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getUsableSubnets() {
    return usableSubnets;
  }
    
  @VsoMethod
  public void setUsableSubnets(List<IpAddrPrefix> usableSubnets) {
    this.usableSubnets = usableSubnets;
  }

  
  /**
   * Username for API access for Infoblox appliance.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "Username for API access for Infoblox appliance.")
  @NotNull


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   * WAPI version.
   * @return wapiVersion
  **/
  @ApiModelProperty(value = "WAPI version.")


 
  @VsoMethod  
  public String getWapiVersion() {
    return wapiVersion;
  }
    
  @VsoMethod
  public void setWapiVersion(String wapiVersion) {
    this.wapiVersion = wapiVersion;
  }

  
  public String getObjectID() {
		return "IpamDnsInfobloxProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpamDnsInfobloxProfile ipamDnsInfobloxProfile = (IpamDnsInfobloxProfile) o;
    return Objects.equals(this.dnsView, ipamDnsInfobloxProfile.dnsView) &&
        Objects.equals(this.extensibleAttributes, ipamDnsInfobloxProfile.extensibleAttributes) &&
        Objects.equals(this.ipAddress, ipamDnsInfobloxProfile.ipAddress) &&
        Objects.equals(this.networkView, ipamDnsInfobloxProfile.networkView) &&
        Objects.equals(this.password, ipamDnsInfobloxProfile.password) &&
        Objects.equals(this.usableDomains, ipamDnsInfobloxProfile.usableDomains) &&
        Objects.equals(this.usableSubnets, ipamDnsInfobloxProfile.usableSubnets) &&
        Objects.equals(this.username, ipamDnsInfobloxProfile.username) &&
        Objects.equals(this.wapiVersion, ipamDnsInfobloxProfile.wapiVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsView, extensibleAttributes, ipAddress, networkView, password, usableDomains, usableSubnets, username, wapiVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpamDnsInfobloxProfile {\n");
    
    sb.append("    dnsView: ").append(toIndentedString(dnsView)).append("\n");
    sb.append("    extensibleAttributes: ").append(toIndentedString(extensibleAttributes)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    networkView: ").append(toIndentedString(networkView)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    usableDomains: ").append(toIndentedString(usableDomains)).append("\n");
    sb.append("    usableSubnets: ").append(toIndentedString(usableSubnets)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    wapiVersion: ").append(toIndentedString(wapiVersion)).append("\n");
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

