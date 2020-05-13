package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * APICConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "APICConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_APICCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class APICConfiguration extends AviRestResource  {
  @JsonProperty("apic_admin_tenant")
  private String apicAdminTenant = "common";

  @JsonProperty("apic_domain")
  private String apicDomain = null;

  @JsonProperty("apic_name")
  @Valid
  private List<String> apicName = null;

  @JsonProperty("apic_password")
  private String apicPassword = null;

  @JsonProperty("apic_product")
  private String apicProduct = "ASP";

  @JsonProperty("apic_username")
  private String apicUsername = null;

  @JsonProperty("apic_vendor")
  private String apicVendor = "Avi";

  @JsonProperty("avi_controller_password")
  private String aviControllerPassword = null;

  @JsonProperty("avi_controller_username")
  private String aviControllerUsername = "admin";

  @JsonProperty("context_aware")
  private String contextAware = "SINGLE_CONTEXT";

  @JsonProperty("deployment")
  private String deployment = null;

  @JsonProperty("managed_mode")
  private Boolean managedMode = true;

  @JsonProperty("minor")
  private String minor = "2";

  @JsonProperty("se_tunnel_mode")
  private Boolean seTunnelMode = true;

  @JsonProperty("version")
  private String version = "1.0";

  
  /**
   * Name of the Avi specific tenant created within APIC.
   * @return apicAdminTenant
  **/
  @ApiModelProperty(value = "Name of the Avi specific tenant created within APIC.")


 
  @VsoMethod  
  public String getApicAdminTenant() {
    return apicAdminTenant;
  }
    
  @VsoMethod
  public void setApicAdminTenant(String apicAdminTenant) {
    this.apicAdminTenant = apicAdminTenant;
  }

  
  /**
   * vCenter's virtual machine manager domain within APIC.
   * @return apicDomain
  **/
  @ApiModelProperty(value = "vCenter's virtual machine manager domain within APIC.")


 
  @VsoMethod  
  public String getApicDomain() {
    return apicDomain;
  }
    
  @VsoMethod
  public void setApicDomain(String apicDomain) {
    this.apicDomain = apicDomain;
  }

  
  public APICConfiguration addApicNameItem(String apicNameItem) {
    if (this.apicName == null) {
      this.apicName = new ArrayList<String>();
    }
    this.apicName.add(apicNameItem);
    return this;
  }
  
  /**
   * The hostname or IP address of the APIC controller.
   * @return apicName
  **/
  @ApiModelProperty(value = "The hostname or IP address of the APIC controller.")


 
  @VsoMethod  
  public List<String> getApicName() {
    return apicName;
  }
    
  @VsoMethod
  public void setApicName(List<String> apicName) {
    this.apicName = apicName;
  }

  
  /**
   * The password Avi Vantage will use when authenticating with APIC.
   * @return apicPassword
  **/
  @ApiModelProperty(value = "The password Avi Vantage will use when authenticating with APIC.")


 
  @VsoMethod  
  public String getApicPassword() {
    return apicPassword;
  }
    
  @VsoMethod
  public void setApicPassword(String apicPassword) {
    this.apicPassword = apicPassword;
  }

  
  /**
   *  Field deprecated in 17.2.10,18.1.2.
   * @return apicProduct
  **/
  @ApiModelProperty(value = " Field deprecated in 17.2.10,18.1.2.")


 
  @VsoMethod  
  public String getApicProduct() {
    return apicProduct;
  }
    
  @VsoMethod
  public void setApicProduct(String apicProduct) {
    this.apicProduct = apicProduct;
  }

  
  /**
   * The username Avi Vantage will use when authenticating with APIC.
   * @return apicUsername
  **/
  @ApiModelProperty(value = "The username Avi Vantage will use when authenticating with APIC.")


 
  @VsoMethod  
  public String getApicUsername() {
    return apicUsername;
  }
    
  @VsoMethod
  public void setApicUsername(String apicUsername) {
    this.apicUsername = apicUsername;
  }

  
  /**
   *  Field deprecated in 17.2.10,18.1.2.
   * @return apicVendor
  **/
  @ApiModelProperty(value = " Field deprecated in 17.2.10,18.1.2.")


 
  @VsoMethod  
  public String getApicVendor() {
    return apicVendor;
  }
    
  @VsoMethod
  public void setApicVendor(String apicVendor) {
    this.apicVendor = apicVendor;
  }

  
  /**
   * The password APIC will use when authenticating with Avi Vantage. Field deprecated in 17.2.10,18.1.2.
   * @return aviControllerPassword
  **/
  @ApiModelProperty(value = "The password APIC will use when authenticating with Avi Vantage. Field deprecated in 17.2.10,18.1.2.")


 
  @VsoMethod  
  public String getAviControllerPassword() {
    return aviControllerPassword;
  }
    
  @VsoMethod
  public void setAviControllerPassword(String aviControllerPassword) {
    this.aviControllerPassword = aviControllerPassword;
  }

  
  /**
   * The username APIC will use when authenticating with Avi Vantage. Field deprecated in 17.2.10,18.1.2.
   * @return aviControllerUsername
  **/
  @ApiModelProperty(value = "The username APIC will use when authenticating with Avi Vantage. Field deprecated in 17.2.10,18.1.2.")


 
  @VsoMethod  
  public String getAviControllerUsername() {
    return aviControllerUsername;
  }
    
  @VsoMethod
  public void setAviControllerUsername(String aviControllerUsername) {
    this.aviControllerUsername = aviControllerUsername;
  }

  
  /**
   * Context aware for supporting Service Graphs across VRFs. Enum options - SINGLE_CONTEXT, MULTI_CONTEXT.
   * @return contextAware
  **/
  @ApiModelProperty(value = "Context aware for supporting Service Graphs across VRFs. Enum options - SINGLE_CONTEXT, MULTI_CONTEXT.")


 
  @VsoMethod  
  public String getContextAware() {
    return contextAware;
  }
    
  @VsoMethod
  public void setContextAware(String contextAware) {
    this.contextAware = contextAware;
  }

  
  /**
   *  Field deprecated in 17.2.10,18.1.2.
   * @return deployment
  **/
  @ApiModelProperty(value = " Field deprecated in 17.2.10,18.1.2.")


 
  @VsoMethod  
  public String getDeployment() {
    return deployment;
  }
    
  @VsoMethod
  public void setDeployment(String deployment) {
    this.deployment = deployment;
  }

  
  /**
   * Use Managed Mode for APIC Service Insertion. Field deprecated in 17.2.10,18.1.2. Field introduced in 17.1.1.
   * @return managedMode
  **/
  @ApiModelProperty(value = "Use Managed Mode for APIC Service Insertion. Field deprecated in 17.2.10,18.1.2. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isManagedMode() {
    return managedMode;
  }
    
  @VsoMethod
  public void setManagedMode(Boolean managedMode) {
    this.managedMode = managedMode;
  }

  
  /**
   * AVI Device Package Minor Version. Field deprecated in 17.2.10,18.1.2.
   * @return minor
  **/
  @ApiModelProperty(value = "AVI Device Package Minor Version. Field deprecated in 17.2.10,18.1.2.")


 
  @VsoMethod  
  public String getMinor() {
    return minor;
  }
    
  @VsoMethod
  public void setMinor(String minor) {
    this.minor = minor;
  }

  
  /**
   * Determines if DSR from secondary SE is active or not  False   DSR active. Please ensure that APIC BD's Endpoint Dataplane Learning is disabled True    Disable DSR unconditionally. . Field introduced in 17.2.10,18.1.2.
   * @return seTunnelMode
  **/
  @ApiModelProperty(value = "Determines if DSR from secondary SE is active or not  False   DSR active. Please ensure that APIC BD's Endpoint Dataplane Learning is disabled True    Disable DSR unconditionally. . Field introduced in 17.2.10,18.1.2.")


 
  @VsoMethod  
  public Boolean isSeTunnelMode() {
    return seTunnelMode;
  }
    
  @VsoMethod
  public void setSeTunnelMode(Boolean seTunnelMode) {
    this.seTunnelMode = seTunnelMode;
  }

  
  /**
   * AVI Device Package Version. Field deprecated in 17.2.10,18.1.2.
   * @return version
  **/
  @ApiModelProperty(value = "AVI Device Package Version. Field deprecated in 17.2.10,18.1.2.")


 
  @VsoMethod  
  public String getVersion() {
    return version;
  }
    
  @VsoMethod
  public void setVersion(String version) {
    this.version = version;
  }

  
  public String getObjectID() {
		return "APICConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICConfiguration apICConfiguration = (APICConfiguration) o;
    return Objects.equals(this.apicAdminTenant, apICConfiguration.apicAdminTenant) &&
        Objects.equals(this.apicDomain, apICConfiguration.apicDomain) &&
        Objects.equals(this.apicName, apICConfiguration.apicName) &&
        Objects.equals(this.apicPassword, apICConfiguration.apicPassword) &&
        Objects.equals(this.apicProduct, apICConfiguration.apicProduct) &&
        Objects.equals(this.apicUsername, apICConfiguration.apicUsername) &&
        Objects.equals(this.apicVendor, apICConfiguration.apicVendor) &&
        Objects.equals(this.aviControllerPassword, apICConfiguration.aviControllerPassword) &&
        Objects.equals(this.aviControllerUsername, apICConfiguration.aviControllerUsername) &&
        Objects.equals(this.contextAware, apICConfiguration.contextAware) &&
        Objects.equals(this.deployment, apICConfiguration.deployment) &&
        Objects.equals(this.managedMode, apICConfiguration.managedMode) &&
        Objects.equals(this.minor, apICConfiguration.minor) &&
        Objects.equals(this.seTunnelMode, apICConfiguration.seTunnelMode) &&
        Objects.equals(this.version, apICConfiguration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apicAdminTenant, apicDomain, apicName, apicPassword, apicProduct, apicUsername, apicVendor, aviControllerPassword, aviControllerUsername, contextAware, deployment, managedMode, minor, seTunnelMode, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICConfiguration {\n");
    
    sb.append("    apicAdminTenant: ").append(toIndentedString(apicAdminTenant)).append("\n");
    sb.append("    apicDomain: ").append(toIndentedString(apicDomain)).append("\n");
    sb.append("    apicName: ").append(toIndentedString(apicName)).append("\n");
    sb.append("    apicPassword: ").append(toIndentedString(apicPassword)).append("\n");
    sb.append("    apicProduct: ").append(toIndentedString(apicProduct)).append("\n");
    sb.append("    apicUsername: ").append(toIndentedString(apicUsername)).append("\n");
    sb.append("    apicVendor: ").append(toIndentedString(apicVendor)).append("\n");
    sb.append("    aviControllerPassword: ").append(toIndentedString(aviControllerPassword)).append("\n");
    sb.append("    aviControllerUsername: ").append(toIndentedString(aviControllerUsername)).append("\n");
    sb.append("    contextAware: ").append(toIndentedString(contextAware)).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
    sb.append("    managedMode: ").append(toIndentedString(managedMode)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    seTunnelMode: ").append(toIndentedString(seTunnelMode)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

