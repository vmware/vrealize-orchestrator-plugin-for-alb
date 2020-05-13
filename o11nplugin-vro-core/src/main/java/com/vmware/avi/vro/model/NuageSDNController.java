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
 * NuageSDNController
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NuageSDNController")
@VsoFinder(name = Constants.FINDER_VRO_NUAGESDNCONTROLLER, idAccessor = "getObjectID()")
@Service
public class NuageSDNController extends AviRestResource  {
  @JsonProperty("nuage_organization")
  private String nuageOrganization = null;

  @JsonProperty("nuage_password")
  private String nuagePassword = null;

  @JsonProperty("nuage_port")
  private Integer nuagePort = 8443;

  @JsonProperty("nuage_username")
  private String nuageUsername = null;

  @JsonProperty("nuage_vsd_host")
  private String nuageVsdHost = null;

  @JsonProperty("se_domain")
  private String seDomain = null;

  @JsonProperty("se_enterprise")
  private String seEnterprise = null;

  @JsonProperty("se_network")
  private String seNetwork = null;

  @JsonProperty("se_policy_group")
  private String sePolicyGroup = null;

  @JsonProperty("se_user")
  private String seUser = null;

  @JsonProperty("se_zone")
  private String seZone = null;

  
  /**
   * nuage_organization of NuageSDNController.
   * @return nuageOrganization
  **/
  @ApiModelProperty(value = "nuage_organization of NuageSDNController.")


 
  @VsoMethod  
  public String getNuageOrganization() {
    return nuageOrganization;
  }
    
  @VsoMethod
  public void setNuageOrganization(String nuageOrganization) {
    this.nuageOrganization = nuageOrganization;
  }

  
  /**
   * nuage_password of NuageSDNController.
   * @return nuagePassword
  **/
  @ApiModelProperty(value = "nuage_password of NuageSDNController.")


 
  @VsoMethod  
  public String getNuagePassword() {
    return nuagePassword;
  }
    
  @VsoMethod
  public void setNuagePassword(String nuagePassword) {
    this.nuagePassword = nuagePassword;
  }

  
  /**
   * Number of nuage_port.
   * @return nuagePort
  **/
  @ApiModelProperty(value = "Number of nuage_port.")


 
  @VsoMethod  
  public Integer getNuagePort() {
    return nuagePort;
  }
    
  @VsoMethod
  public void setNuagePort(Integer nuagePort) {
    this.nuagePort = nuagePort;
  }

  
  /**
   * nuage_username of NuageSDNController.
   * @return nuageUsername
  **/
  @ApiModelProperty(value = "nuage_username of NuageSDNController.")


 
  @VsoMethod  
  public String getNuageUsername() {
    return nuageUsername;
  }
    
  @VsoMethod
  public void setNuageUsername(String nuageUsername) {
    this.nuageUsername = nuageUsername;
  }

  
  /**
   * Nuage VSD host name or IP address.
   * @return nuageVsdHost
  **/
  @ApiModelProperty(value = "Nuage VSD host name or IP address.")


 
  @VsoMethod  
  public String getNuageVsdHost() {
    return nuageVsdHost;
  }
    
  @VsoMethod
  public void setNuageVsdHost(String nuageVsdHost) {
    this.nuageVsdHost = nuageVsdHost;
  }

  
  /**
   * Domain to be used for SE creation.
   * @return seDomain
  **/
  @ApiModelProperty(value = "Domain to be used for SE creation.")


 
  @VsoMethod  
  public String getSeDomain() {
    return seDomain;
  }
    
  @VsoMethod
  public void setSeDomain(String seDomain) {
    this.seDomain = seDomain;
  }

  
  /**
   * Enterprise to be used for SE creation.
   * @return seEnterprise
  **/
  @ApiModelProperty(value = "Enterprise to be used for SE creation.")


 
  @VsoMethod  
  public String getSeEnterprise() {
    return seEnterprise;
  }
    
  @VsoMethod
  public void setSeEnterprise(String seEnterprise) {
    this.seEnterprise = seEnterprise;
  }

  
  /**
   * Network to be used for SE creation.
   * @return seNetwork
  **/
  @ApiModelProperty(value = "Network to be used for SE creation.")


 
  @VsoMethod  
  public String getSeNetwork() {
    return seNetwork;
  }
    
  @VsoMethod
  public void setSeNetwork(String seNetwork) {
    this.seNetwork = seNetwork;
  }

  
  /**
   * Policy Group to be used for SE creation.
   * @return sePolicyGroup
  **/
  @ApiModelProperty(value = "Policy Group to be used for SE creation.")


 
  @VsoMethod  
  public String getSePolicyGroup() {
    return sePolicyGroup;
  }
    
  @VsoMethod
  public void setSePolicyGroup(String sePolicyGroup) {
    this.sePolicyGroup = sePolicyGroup;
  }

  
  /**
   * User to be used for SE creation.
   * @return seUser
  **/
  @ApiModelProperty(value = "User to be used for SE creation.")


 
  @VsoMethod  
  public String getSeUser() {
    return seUser;
  }
    
  @VsoMethod
  public void setSeUser(String seUser) {
    this.seUser = seUser;
  }

  
  /**
   * Zone to be used for SE creation.
   * @return seZone
  **/
  @ApiModelProperty(value = "Zone to be used for SE creation.")


 
  @VsoMethod  
  public String getSeZone() {
    return seZone;
  }
    
  @VsoMethod
  public void setSeZone(String seZone) {
    this.seZone = seZone;
  }

  
  public String getObjectID() {
		return "NuageSDNController";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NuageSDNController nuageSDNController = (NuageSDNController) o;
    return Objects.equals(this.nuageOrganization, nuageSDNController.nuageOrganization) &&
        Objects.equals(this.nuagePassword, nuageSDNController.nuagePassword) &&
        Objects.equals(this.nuagePort, nuageSDNController.nuagePort) &&
        Objects.equals(this.nuageUsername, nuageSDNController.nuageUsername) &&
        Objects.equals(this.nuageVsdHost, nuageSDNController.nuageVsdHost) &&
        Objects.equals(this.seDomain, nuageSDNController.seDomain) &&
        Objects.equals(this.seEnterprise, nuageSDNController.seEnterprise) &&
        Objects.equals(this.seNetwork, nuageSDNController.seNetwork) &&
        Objects.equals(this.sePolicyGroup, nuageSDNController.sePolicyGroup) &&
        Objects.equals(this.seUser, nuageSDNController.seUser) &&
        Objects.equals(this.seZone, nuageSDNController.seZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nuageOrganization, nuagePassword, nuagePort, nuageUsername, nuageVsdHost, seDomain, seEnterprise, seNetwork, sePolicyGroup, seUser, seZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NuageSDNController {\n");
    
    sb.append("    nuageOrganization: ").append(toIndentedString(nuageOrganization)).append("\n");
    sb.append("    nuagePassword: ").append(toIndentedString(nuagePassword)).append("\n");
    sb.append("    nuagePort: ").append(toIndentedString(nuagePort)).append("\n");
    sb.append("    nuageUsername: ").append(toIndentedString(nuageUsername)).append("\n");
    sb.append("    nuageVsdHost: ").append(toIndentedString(nuageVsdHost)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    seEnterprise: ").append(toIndentedString(seEnterprise)).append("\n");
    sb.append("    seNetwork: ").append(toIndentedString(seNetwork)).append("\n");
    sb.append("    sePolicyGroup: ").append(toIndentedString(sePolicyGroup)).append("\n");
    sb.append("    seUser: ").append(toIndentedString(seUser)).append("\n");
    sb.append("    seZone: ").append(toIndentedString(seZone)).append("\n");
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

