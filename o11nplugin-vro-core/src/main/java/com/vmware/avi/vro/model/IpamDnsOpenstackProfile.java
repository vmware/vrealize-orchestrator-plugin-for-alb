package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * IpamDnsOpenstackProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpamDnsOpenstackProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSOPENSTACKPROFILE, idAccessor = "getObjectID()")
@Service
public class IpamDnsOpenstackProfile extends AviRestResource  {
  @JsonProperty("keystone_host")
  private String keystoneHost = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("tenant")
  private String tenant = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("vip_network_name")
  private String vipNetworkName = null;

  
  /**
   * Keystone's hostname or IP address.
   * @return keystoneHost
  **/
  @ApiModelProperty(value = "Keystone's hostname or IP address.")


 
  @VsoMethod  
  public String getKeystoneHost() {
    return keystoneHost;
  }
    
  @VsoMethod
  public void setKeystoneHost(String keystoneHost) {
    this.keystoneHost = keystoneHost;
  }

  
  /**
   * The password Avi Vantage will use when authenticating to Keystone.
   * @return password
  **/
  @ApiModelProperty(value = "The password Avi Vantage will use when authenticating to Keystone.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * Region name.
   * @return region
  **/
  @ApiModelProperty(value = "Region name.")


 
  @VsoMethod  
  public String getRegion() {
    return region;
  }
    
  @VsoMethod
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   * OpenStack tenant name.
   * @return tenant
  **/
  @ApiModelProperty(value = "OpenStack tenant name.")


 
  @VsoMethod  
  public String getTenant() {
    return tenant;
  }
    
  @VsoMethod
  public void setTenant(String tenant) {
    this.tenant = tenant;
  }

  
  /**
   * The username Avi Vantage will use when authenticating to Keystone.
   * @return username
  **/
  @ApiModelProperty(value = "The username Avi Vantage will use when authenticating to Keystone.")


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   * Network to be used for VIP allocation.
   * @return vipNetworkName
  **/
  @ApiModelProperty(value = "Network to be used for VIP allocation.")


 
  @VsoMethod  
  public String getVipNetworkName() {
    return vipNetworkName;
  }
    
  @VsoMethod
  public void setVipNetworkName(String vipNetworkName) {
    this.vipNetworkName = vipNetworkName;
  }

  
  public String getObjectID() {
		return "IpamDnsOpenstackProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpamDnsOpenstackProfile ipamDnsOpenstackProfile = (IpamDnsOpenstackProfile) o;
    return Objects.equals(this.keystoneHost, ipamDnsOpenstackProfile.keystoneHost) &&
        Objects.equals(this.password, ipamDnsOpenstackProfile.password) &&
        Objects.equals(this.region, ipamDnsOpenstackProfile.region) &&
        Objects.equals(this.tenant, ipamDnsOpenstackProfile.tenant) &&
        Objects.equals(this.username, ipamDnsOpenstackProfile.username) &&
        Objects.equals(this.vipNetworkName, ipamDnsOpenstackProfile.vipNetworkName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keystoneHost, password, region, tenant, username, vipNetworkName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpamDnsOpenstackProfile {\n");
    
    sb.append("    keystoneHost: ").append(toIndentedString(keystoneHost)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    vipNetworkName: ").append(toIndentedString(vipNetworkName)).append("\n");
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

