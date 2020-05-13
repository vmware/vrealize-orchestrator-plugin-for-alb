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
 * PortalConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PortalConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_PORTALCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class PortalConfiguration extends AviRestResource  {
  @JsonProperty("allow_basic_authentication")
  private Boolean allowBasicAuthentication = null;

  @JsonProperty("api_force_timeout")
  private Integer apiForceTimeout = 24;

  @JsonProperty("disable_remote_cli_shell")
  private Boolean disableRemoteCliShell = null;

  @JsonProperty("disable_swagger")
  private Boolean disableSwagger = null;

  @JsonProperty("enable_clickjacking_protection")
  private Boolean enableClickjackingProtection = true;

  @JsonProperty("enable_http")
  private Boolean enableHttp = true;

  @JsonProperty("enable_https")
  private Boolean enableHttps = true;

  @JsonProperty("http_port")
  private Integer httpPort = null;

  @JsonProperty("https_port")
  private Integer httpsPort = null;

  @JsonProperty("password_strength_check")
  private Boolean passwordStrengthCheck = null;

  @JsonProperty("redirect_to_https")
  private Boolean redirectToHttps = true;

  @JsonProperty("sslkeyandcertificate_refs")
  @Valid
  private List<String> sslkeyandcertificateRefs = null;

  @JsonProperty("sslprofile_ref")
  private String sslprofileRef = null;

  @JsonProperty("use_uuid_from_input")
  private Boolean useUuidFromInput = null;

  
  /**
   * Enable/Disable HTTP basic authentication.
   * @return allowBasicAuthentication
  **/
  @ApiModelProperty(value = "Enable/Disable HTTP basic authentication.")


 
  @VsoMethod  
  public Boolean isAllowBasicAuthentication() {
    return allowBasicAuthentication;
  }
    
  @VsoMethod
  public void setAllowBasicAuthentication(Boolean allowBasicAuthentication) {
    this.allowBasicAuthentication = allowBasicAuthentication;
  }

  
  /**
   * Force API session timeout after the specified time (in hours). Allowed values are 1-24. Field introduced in 18.2.3.
   * @return apiForceTimeout
  **/
  @ApiModelProperty(value = "Force API session timeout after the specified time (in hours). Allowed values are 1-24. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Integer getApiForceTimeout() {
    return apiForceTimeout;
  }
    
  @VsoMethod
  public void setApiForceTimeout(Integer apiForceTimeout) {
    this.apiForceTimeout = apiForceTimeout;
  }

  
  /**
   * Disable Remote CLI Shell Client access.
   * @return disableRemoteCliShell
  **/
  @ApiModelProperty(value = "Disable Remote CLI Shell Client access.")


 
  @VsoMethod  
  public Boolean isDisableRemoteCliShell() {
    return disableRemoteCliShell;
  }
    
  @VsoMethod
  public void setDisableRemoteCliShell(Boolean disableRemoteCliShell) {
    this.disableRemoteCliShell = disableRemoteCliShell;
  }

  
  /**
   * Disable Swagger access. Field introduced in 18.2.3.
   * @return disableSwagger
  **/
  @ApiModelProperty(value = "Disable Swagger access. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isDisableSwagger() {
    return disableSwagger;
  }
    
  @VsoMethod
  public void setDisableSwagger(Boolean disableSwagger) {
    this.disableSwagger = disableSwagger;
  }

  
  /**
   * Enable/Disable Clickjacking protection.
   * @return enableClickjackingProtection
  **/
  @ApiModelProperty(value = "Enable/Disable Clickjacking protection.")


 
  @VsoMethod  
  public Boolean isEnableClickjackingProtection() {
    return enableClickjackingProtection;
  }
    
  @VsoMethod
  public void setEnableClickjackingProtection(Boolean enableClickjackingProtection) {
    this.enableClickjackingProtection = enableClickjackingProtection;
  }

  
  /**
   * Placeholder for description of property enable_http of obj type PortalConfiguration field type str  type boolean
   * @return enableHttp
  **/
  @ApiModelProperty(value = "Placeholder for description of property enable_http of obj type PortalConfiguration field type str  type boolean")


 
  @VsoMethod  
  public Boolean isEnableHttp() {
    return enableHttp;
  }
    
  @VsoMethod
  public void setEnableHttp(Boolean enableHttp) {
    this.enableHttp = enableHttp;
  }

  
  /**
   * Placeholder for description of property enable_https of obj type PortalConfiguration field type str  type boolean
   * @return enableHttps
  **/
  @ApiModelProperty(value = "Placeholder for description of property enable_https of obj type PortalConfiguration field type str  type boolean")


 
  @VsoMethod  
  public Boolean isEnableHttps() {
    return enableHttps;
  }
    
  @VsoMethod
  public void setEnableHttps(Boolean enableHttps) {
    this.enableHttps = enableHttps;
  }

  
  /**
   * HTTP port.
   * @return httpPort
  **/
  @ApiModelProperty(value = "HTTP port.")


 
  @VsoMethod  
  public Integer getHttpPort() {
    return httpPort;
  }
    
  @VsoMethod
  public void setHttpPort(Integer httpPort) {
    this.httpPort = httpPort;
  }

  
  /**
   * HTTPS port.
   * @return httpsPort
  **/
  @ApiModelProperty(value = "HTTPS port.")


 
  @VsoMethod  
  public Integer getHttpsPort() {
    return httpsPort;
  }
    
  @VsoMethod
  public void setHttpsPort(Integer httpsPort) {
    this.httpsPort = httpsPort;
  }

  
  /**
   * Strict checking of password strength for user accounts.
   * @return passwordStrengthCheck
  **/
  @ApiModelProperty(value = "Strict checking of password strength for user accounts.")


 
  @VsoMethod  
  public Boolean isPasswordStrengthCheck() {
    return passwordStrengthCheck;
  }
    
  @VsoMethod
  public void setPasswordStrengthCheck(Boolean passwordStrengthCheck) {
    this.passwordStrengthCheck = passwordStrengthCheck;
  }

  
  /**
   * Placeholder for description of property redirect_to_https of obj type PortalConfiguration field type str  type boolean
   * @return redirectToHttps
  **/
  @ApiModelProperty(value = "Placeholder for description of property redirect_to_https of obj type PortalConfiguration field type str  type boolean")


 
  @VsoMethod  
  public Boolean isRedirectToHttps() {
    return redirectToHttps;
  }
    
  @VsoMethod
  public void setRedirectToHttps(Boolean redirectToHttps) {
    this.redirectToHttps = redirectToHttps;
  }

  
  public PortalConfiguration addSslkeyandcertificateRefsItem(String sslkeyandcertificateRefsItem) {
    if (this.sslkeyandcertificateRefs == null) {
      this.sslkeyandcertificateRefs = new ArrayList<String>();
    }
    this.sslkeyandcertificateRefs.add(sslkeyandcertificateRefsItem);
    return this;
  }
  
  /**
   * Certificates for system portal. Maximum 2 allowed. Leave list empty to use system default certs. It is a reference to an object of type SSLKeyAndCertificate.
   * @return sslkeyandcertificateRefs
  **/
  @ApiModelProperty(value = "Certificates for system portal. Maximum 2 allowed. Leave list empty to use system default certs. It is a reference to an object of type SSLKeyAndCertificate.")


 
  @VsoMethod  
  public List<String> getSslkeyandcertificateRefs() {
    return sslkeyandcertificateRefs;
  }
    
  @VsoMethod
  public void setSslkeyandcertificateRefs(List<String> sslkeyandcertificateRefs) {
    this.sslkeyandcertificateRefs = sslkeyandcertificateRefs;
  }

  
  /**
   *  It is a reference to an object of type SSLProfile.
   * @return sslprofileRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type SSLProfile.")


 
  @VsoMethod  
  public String getSslprofileRef() {
    return sslprofileRef;
  }
    
  @VsoMethod
  public void setSslprofileRef(String sslprofileRef) {
    this.sslprofileRef = sslprofileRef;
  }

  
  /**
   * Use UUID in POST object data as UUID of the new object, instead of a generated UUID.
   * @return useUuidFromInput
  **/
  @ApiModelProperty(value = "Use UUID in POST object data as UUID of the new object, instead of a generated UUID.")


 
  @VsoMethod  
  public Boolean isUseUuidFromInput() {
    return useUuidFromInput;
  }
    
  @VsoMethod
  public void setUseUuidFromInput(Boolean useUuidFromInput) {
    this.useUuidFromInput = useUuidFromInput;
  }

  
  public String getObjectID() {
		return "PortalConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortalConfiguration portalConfiguration = (PortalConfiguration) o;
    return Objects.equals(this.allowBasicAuthentication, portalConfiguration.allowBasicAuthentication) &&
        Objects.equals(this.apiForceTimeout, portalConfiguration.apiForceTimeout) &&
        Objects.equals(this.disableRemoteCliShell, portalConfiguration.disableRemoteCliShell) &&
        Objects.equals(this.disableSwagger, portalConfiguration.disableSwagger) &&
        Objects.equals(this.enableClickjackingProtection, portalConfiguration.enableClickjackingProtection) &&
        Objects.equals(this.enableHttp, portalConfiguration.enableHttp) &&
        Objects.equals(this.enableHttps, portalConfiguration.enableHttps) &&
        Objects.equals(this.httpPort, portalConfiguration.httpPort) &&
        Objects.equals(this.httpsPort, portalConfiguration.httpsPort) &&
        Objects.equals(this.passwordStrengthCheck, portalConfiguration.passwordStrengthCheck) &&
        Objects.equals(this.redirectToHttps, portalConfiguration.redirectToHttps) &&
        Objects.equals(this.sslkeyandcertificateRefs, portalConfiguration.sslkeyandcertificateRefs) &&
        Objects.equals(this.sslprofileRef, portalConfiguration.sslprofileRef) &&
        Objects.equals(this.useUuidFromInput, portalConfiguration.useUuidFromInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowBasicAuthentication, apiForceTimeout, disableRemoteCliShell, disableSwagger, enableClickjackingProtection, enableHttp, enableHttps, httpPort, httpsPort, passwordStrengthCheck, redirectToHttps, sslkeyandcertificateRefs, sslprofileRef, useUuidFromInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortalConfiguration {\n");
    
    sb.append("    allowBasicAuthentication: ").append(toIndentedString(allowBasicAuthentication)).append("\n");
    sb.append("    apiForceTimeout: ").append(toIndentedString(apiForceTimeout)).append("\n");
    sb.append("    disableRemoteCliShell: ").append(toIndentedString(disableRemoteCliShell)).append("\n");
    sb.append("    disableSwagger: ").append(toIndentedString(disableSwagger)).append("\n");
    sb.append("    enableClickjackingProtection: ").append(toIndentedString(enableClickjackingProtection)).append("\n");
    sb.append("    enableHttp: ").append(toIndentedString(enableHttp)).append("\n");
    sb.append("    enableHttps: ").append(toIndentedString(enableHttps)).append("\n");
    sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
    sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
    sb.append("    passwordStrengthCheck: ").append(toIndentedString(passwordStrengthCheck)).append("\n");
    sb.append("    redirectToHttps: ").append(toIndentedString(redirectToHttps)).append("\n");
    sb.append("    sslkeyandcertificateRefs: ").append(toIndentedString(sslkeyandcertificateRefs)).append("\n");
    sb.append("    sslprofileRef: ").append(toIndentedString(sslprofileRef)).append("\n");
    sb.append("    useUuidFromInput: ").append(toIndentedString(useUuidFromInput)).append("\n");
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

