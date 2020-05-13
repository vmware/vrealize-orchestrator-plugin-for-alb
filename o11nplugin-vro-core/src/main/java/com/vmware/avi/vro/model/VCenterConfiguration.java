package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrPrefix;
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
 * VCenterConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VCenterConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class VCenterConfiguration extends AviRestResource  {
  @JsonProperty("datacenter")
  private String datacenter = null;

  @JsonProperty("management_ip_subnet")
  private IpAddrPrefix managementIpSubnet = null;

  @JsonProperty("management_network")
  private String managementNetwork = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("privilege")
  private String privilege = "WRITE_ACCESS";

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("vcenter_template_se_location")
  private String vcenterTemplateSeLocation = null;

  @JsonProperty("vcenter_url")
  private String vcenterUrl = null;

  
  /**
   * Datacenter for virtual infrastructure discovery.
   * @return datacenter
  **/
  @ApiModelProperty(value = "Datacenter for virtual infrastructure discovery.")


 
  @VsoMethod  
  public String getDatacenter() {
    return datacenter;
  }
    
  @VsoMethod
  public void setDatacenter(String datacenter) {
    this.datacenter = datacenter;
  }

  
  /**
   * Management subnet to use for Avi Service Engines.
   * @return managementIpSubnet
  **/
  @ApiModelProperty(value = "Management subnet to use for Avi Service Engines.")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getManagementIpSubnet() {
    return managementIpSubnet;
  }
    
  @VsoMethod
  public void setManagementIpSubnet(IpAddrPrefix managementIpSubnet) {
    this.managementIpSubnet = managementIpSubnet;
  }

  
  /**
   * Management network to use for Avi Service Engines. It is a reference to an object of type VIMgrNWRuntime.
   * @return managementNetwork
  **/
  @ApiModelProperty(value = "Management network to use for Avi Service Engines. It is a reference to an object of type VIMgrNWRuntime.")


 
  @VsoMethod  
  public String getManagementNetwork() {
    return managementNetwork;
  }
    
  @VsoMethod
  public void setManagementNetwork(String managementNetwork) {
    this.managementNetwork = managementNetwork;
  }

  
  /**
   * The password Avi Vantage will use when authenticating with vCenter.
   * @return password
  **/
  @ApiModelProperty(value = "The password Avi Vantage will use when authenticating with vCenter.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * Set the access mode to vCenter as either Read, which allows Avi to discover networks and servers, or Write, which also allows Avi to create Service Engines and configure their network properties. Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * @return privilege
  **/
  @ApiModelProperty(required = true, value = "Set the access mode to vCenter as either Read, which allows Avi to discover networks and servers, or Write, which also allows Avi to create Service Engines and configure their network properties. Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.")
  @NotNull


 
  @VsoMethod  
  public String getPrivilege() {
    return privilege;
  }
    
  @VsoMethod
  public void setPrivilege(String privilege) {
    this.privilege = privilege;
  }

  
  /**
   * The username Avi Vantage will use when authenticating with vCenter.
   * @return username
  **/
  @ApiModelProperty(value = "The username Avi Vantage will use when authenticating with vCenter.")


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   * Avi Service Engine Template in vCenter to be used for creating Service Engines.
   * @return vcenterTemplateSeLocation
  **/
  @ApiModelProperty(value = "Avi Service Engine Template in vCenter to be used for creating Service Engines.")


 
  @VsoMethod  
  public String getVcenterTemplateSeLocation() {
    return vcenterTemplateSeLocation;
  }
    
  @VsoMethod
  public void setVcenterTemplateSeLocation(String vcenterTemplateSeLocation) {
    this.vcenterTemplateSeLocation = vcenterTemplateSeLocation;
  }

  
  /**
   * vCenter hostname or IP address.
   * @return vcenterUrl
  **/
  @ApiModelProperty(value = "vCenter hostname or IP address.")


 
  @VsoMethod  
  public String getVcenterUrl() {
    return vcenterUrl;
  }
    
  @VsoMethod
  public void setVcenterUrl(String vcenterUrl) {
    this.vcenterUrl = vcenterUrl;
  }

  
  public String getObjectID() {
		return "VCenterConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VCenterConfiguration vCenterConfiguration = (VCenterConfiguration) o;
    return Objects.equals(this.datacenter, vCenterConfiguration.datacenter) &&
        Objects.equals(this.managementIpSubnet, vCenterConfiguration.managementIpSubnet) &&
        Objects.equals(this.managementNetwork, vCenterConfiguration.managementNetwork) &&
        Objects.equals(this.password, vCenterConfiguration.password) &&
        Objects.equals(this.privilege, vCenterConfiguration.privilege) &&
        Objects.equals(this.username, vCenterConfiguration.username) &&
        Objects.equals(this.vcenterTemplateSeLocation, vCenterConfiguration.vcenterTemplateSeLocation) &&
        Objects.equals(this.vcenterUrl, vCenterConfiguration.vcenterUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datacenter, managementIpSubnet, managementNetwork, password, privilege, username, vcenterTemplateSeLocation, vcenterUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VCenterConfiguration {\n");
    
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
    sb.append("    managementIpSubnet: ").append(toIndentedString(managementIpSubnet)).append("\n");
    sb.append("    managementNetwork: ").append(toIndentedString(managementNetwork)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    vcenterTemplateSeLocation: ").append(toIndentedString(vcenterTemplateSeLocation)).append("\n");
    sb.append("    vcenterUrl: ").append(toIndentedString(vcenterUrl)).append("\n");
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

