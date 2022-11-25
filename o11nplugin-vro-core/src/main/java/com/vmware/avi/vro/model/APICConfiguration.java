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
 * The APICConfiguration is a POJO class extends AviRestResource that used for creating
 * APICConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "APICConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_APICCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class APICConfiguration extends AviRestResource {
    @JsonProperty("apic_admin_tenant")
    @JsonInclude(Include.NON_NULL)
    private String apicAdminTenant;

    @JsonProperty("apic_domain")
    @JsonInclude(Include.NON_NULL)
    private String apicDomain;

    @JsonProperty("apic_name")
    @JsonInclude(Include.NON_NULL)
    private List<String> apicName;

    @JsonProperty("apic_password")
    @JsonInclude(Include.NON_NULL)
    private String apicPassword;

    @JsonProperty("apic_product")
    @JsonInclude(Include.NON_NULL)
    private String apicProduct;

    @JsonProperty("apic_username")
    @JsonInclude(Include.NON_NULL)
    private String apicUsername;

    @JsonProperty("apic_vendor")
    @JsonInclude(Include.NON_NULL)
    private String apicVendor;

    @JsonProperty("avi_controller_password")
    @JsonInclude(Include.NON_NULL)
    private String aviControllerPassword;

    @JsonProperty("avi_controller_username")
    @JsonInclude(Include.NON_NULL)
    private String aviControllerUsername;

    @JsonProperty("context_aware")
    @JsonInclude(Include.NON_NULL)
    private String contextAware;

    @JsonProperty("deployment")
    @JsonInclude(Include.NON_NULL)
    private String deployment;

    @JsonProperty("managed_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean managedMode;

    @JsonProperty("minor")
    @JsonInclude(Include.NON_NULL)
    private String minor;

    @JsonProperty("se_tunnel_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean seTunnelMode;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the avi specific tenant created within apic.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return apicAdminTenant
   */
  @VsoMethod
  public String getApicAdminTenant() {
    return apicAdminTenant;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the avi specific tenant created within apic.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param apicAdminTenant set the apicAdminTenant.
   */
  @VsoMethod
  public void setApicAdminTenant(String  apicAdminTenant) {
    this.apicAdminTenant = apicAdminTenant;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vcenter's virtual machine manager domain within apic.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return apicDomain
   */
  @VsoMethod
  public String getApicDomain() {
    return apicDomain;
  }

  /**
   * This is the setter method to the attribute.
   * Vcenter's virtual machine manager domain within apic.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param apicDomain set the apicDomain.
   */
  @VsoMethod
  public void setApicDomain(String  apicDomain) {
    this.apicDomain = apicDomain;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The hostname or ip address of the apic controller.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return apicName
   */
  @VsoMethod
  public List<String> getApicName() {
    return apicName;
  }

  /**
   * This is the setter method. this will set the apicName
   * The hostname or ip address of the apic controller.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return apicName
   */
  @VsoMethod
  public void setApicName(List<String>  apicName) {
    this.apicName = apicName;
  }

  /**
   * This is the setter method this will set the apicName
   * The hostname or ip address of the apic controller.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return apicName
   */
  @VsoMethod
  public APICConfiguration addApicNameItem(String apicNameItem) {
    if (this.apicName == null) {
      this.apicName = new ArrayList<String>();
    }
    this.apicName.add(apicNameItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The password avi vantage will use when authenticating with apic.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return apicPassword
   */
  @VsoMethod
  public String getApicPassword() {
    return apicPassword;
  }

  /**
   * This is the setter method to the attribute.
   * The password avi vantage will use when authenticating with apic.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param apicPassword set the apicPassword.
   */
  @VsoMethod
  public void setApicPassword(String  apicPassword) {
    this.apicPassword = apicPassword;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return apicProduct
   */
  @VsoMethod
  public String getApicProduct() {
    return apicProduct;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param apicProduct set the apicProduct.
   */
  @VsoMethod
  public void setApicProduct(String  apicProduct) {
    this.apicProduct = apicProduct;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The username avi vantage will use when authenticating with apic.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return apicUsername
   */
  @VsoMethod
  public String getApicUsername() {
    return apicUsername;
  }

  /**
   * This is the setter method to the attribute.
   * The username avi vantage will use when authenticating with apic.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param apicUsername set the apicUsername.
   */
  @VsoMethod
  public void setApicUsername(String  apicUsername) {
    this.apicUsername = apicUsername;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return apicVendor
   */
  @VsoMethod
  public String getApicVendor() {
    return apicVendor;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param apicVendor set the apicVendor.
   */
  @VsoMethod
  public void setApicVendor(String  apicVendor) {
    this.apicVendor = apicVendor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The password apic will use when authenticating with avi vantage.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return aviControllerPassword
   */
  @VsoMethod
  public String getAviControllerPassword() {
    return aviControllerPassword;
  }

  /**
   * This is the setter method to the attribute.
   * The password apic will use when authenticating with avi vantage.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param aviControllerPassword set the aviControllerPassword.
   */
  @VsoMethod
  public void setAviControllerPassword(String  aviControllerPassword) {
    this.aviControllerPassword = aviControllerPassword;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The username apic will use when authenticating with avi vantage.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return aviControllerUsername
   */
  @VsoMethod
  public String getAviControllerUsername() {
    return aviControllerUsername;
  }

  /**
   * This is the setter method to the attribute.
   * The username apic will use when authenticating with avi vantage.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param aviControllerUsername set the aviControllerUsername.
   */
  @VsoMethod
  public void setAviControllerUsername(String  aviControllerUsername) {
    this.aviControllerUsername = aviControllerUsername;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Context aware for supporting service graphs across vrfs.
   * Enum options - SINGLE_CONTEXT, MULTI_CONTEXT.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return contextAware
   */
  @VsoMethod
  public String getContextAware() {
    return contextAware;
  }

  /**
   * This is the setter method to the attribute.
   * Context aware for supporting service graphs across vrfs.
   * Enum options - SINGLE_CONTEXT, MULTI_CONTEXT.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param contextAware set the contextAware.
   */
  @VsoMethod
  public void setContextAware(String  contextAware) {
    this.contextAware = contextAware;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return deployment
   */
  @VsoMethod
  public String getDeployment() {
    return deployment;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param deployment set the deployment.
   */
  @VsoMethod
  public void setDeployment(String  deployment) {
    this.deployment = deployment;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use managed mode for apic service insertion.
   * Field deprecated in 17.2.10,18.1.2.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return managedMode
   */
  @VsoMethod
  public Boolean getManagedMode() {
    return managedMode;
  }

  /**
   * This is the setter method to the attribute.
   * Use managed mode for apic service insertion.
   * Field deprecated in 17.2.10,18.1.2.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param managedMode set the managedMode.
   */
  @VsoMethod
  public void setManagedMode(Boolean  managedMode) {
    this.managedMode = managedMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Avi device package minor version.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return minor
   */
  @VsoMethod
  public String getMinor() {
    return minor;
  }

  /**
   * This is the setter method to the attribute.
   * Avi device package minor version.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param minor set the minor.
   */
  @VsoMethod
  public void setMinor(String  minor) {
    this.minor = minor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Determines if dsr from secondary se is active or not  false   dsr active.
   * Please ensure that apic bd's endpoint dataplane learning is disabled true    disable dsr unconditionally.
   * Field deprecated in 21.1.1.
   * Field introduced in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return seTunnelMode
   */
  @VsoMethod
  public Boolean getSeTunnelMode() {
    return seTunnelMode;
  }

  /**
   * This is the setter method to the attribute.
   * Determines if dsr from secondary se is active or not  false   dsr active.
   * Please ensure that apic bd's endpoint dataplane learning is disabled true    disable dsr unconditionally.
   * Field deprecated in 21.1.1.
   * Field introduced in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param seTunnelMode set the seTunnelMode.
   */
  @VsoMethod
  public void setSeTunnelMode(Boolean  seTunnelMode) {
    this.seTunnelMode = seTunnelMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Avi device package version.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Avi device package version.
   * Field deprecated in 17.2.10,18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  APICConfiguration objAPICConfiguration = (APICConfiguration) o;
  return   Objects.equals(this.apicName, objAPICConfiguration.apicName)&&
  Objects.equals(this.apicUsername, objAPICConfiguration.apicUsername)&&
  Objects.equals(this.apicPassword, objAPICConfiguration.apicPassword)&&
  Objects.equals(this.apicAdminTenant, objAPICConfiguration.apicAdminTenant)&&
  Objects.equals(this.apicVendor, objAPICConfiguration.apicVendor)&&
  Objects.equals(this.apicProduct, objAPICConfiguration.apicProduct)&&
  Objects.equals(this.deployment, objAPICConfiguration.deployment)&&
  Objects.equals(this.apicDomain, objAPICConfiguration.apicDomain)&&
  Objects.equals(this.aviControllerUsername, objAPICConfiguration.aviControllerUsername)&&
  Objects.equals(this.aviControllerPassword, objAPICConfiguration.aviControllerPassword)&&
  Objects.equals(this.version, objAPICConfiguration.version)&&
  Objects.equals(this.minor, objAPICConfiguration.minor)&&
  Objects.equals(this.contextAware, objAPICConfiguration.contextAware)&&
  Objects.equals(this.managedMode, objAPICConfiguration.managedMode)&&
  Objects.equals(this.seTunnelMode, objAPICConfiguration.seTunnelMode);
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

