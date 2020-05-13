package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AdminAuthConfiguration;
import com.vmware.avi.vro.model.DNSConfiguration;
import com.vmware.avi.vro.model.EmailConfiguration;
import com.vmware.avi.vro.model.LinuxConfiguration;
import com.vmware.avi.vro.model.MgmtIpAccessControl;
import com.vmware.avi.vro.model.NTPConfiguration;
import com.vmware.avi.vro.model.PortalConfiguration;
import com.vmware.avi.vro.model.ProxyConfiguration;
import com.vmware.avi.vro.model.SecureChannelConfiguration;
import com.vmware.avi.vro.model.SnmpConfiguration;
import com.vmware.avi.vro.model.TenantConfiguration;
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
 * SystemConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SystemConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_SYSTEMCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class SystemConfiguration extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("admin_auth_configuration")
  private AdminAuthConfiguration adminAuthConfiguration = null;

  @JsonProperty("default_license_tier")
  private String defaultLicenseTier = "ENTERPRISE_18";

  @JsonProperty("dns_configuration")
  private DNSConfiguration dnsConfiguration = null;

  @JsonProperty("dns_virtualservice_refs")
  @Valid
  private List<String> dnsVirtualserviceRefs = null;

  @JsonProperty("docker_mode")
  private Boolean dockerMode = null;

  @JsonProperty("email_configuration")
  private EmailConfiguration emailConfiguration = null;

  @JsonProperty("global_tenant_config")
  private TenantConfiguration globalTenantConfig = null;

  @JsonProperty("linux_configuration")
  private LinuxConfiguration linuxConfiguration = null;

  @JsonProperty("mgmt_ip_access_control")
  private MgmtIpAccessControl mgmtIpAccessControl = null;

  @JsonProperty("ntp_configuration")
  private NTPConfiguration ntpConfiguration = null;

  @JsonProperty("portal_configuration")
  private PortalConfiguration portalConfiguration = null;

  @JsonProperty("proxy_configuration")
  private ProxyConfiguration proxyConfiguration = null;

  @JsonProperty("secure_channel_configuration")
  private SecureChannelConfiguration secureChannelConfiguration = null;

  @JsonProperty("snmp_configuration")
  private SnmpConfiguration snmpConfiguration = null;

  @JsonProperty("ssh_ciphers")
  @Valid
  private List<String> sshCiphers = null;

  @JsonProperty("ssh_hmacs")
  @Valid
  private List<String> sshHmacs = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("welcome_workflow_complete")
  private Boolean welcomeWorkflowComplete = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * Placeholder for description of property admin_auth_configuration of obj type SystemConfiguration field type str  type object
   * @return adminAuthConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property admin_auth_configuration of obj type SystemConfiguration field type str  type object")

  @Valid

 
  @VsoMethod  
  public AdminAuthConfiguration getAdminAuthConfiguration() {
    return adminAuthConfiguration;
  }
    
  @VsoMethod
  public void setAdminAuthConfiguration(AdminAuthConfiguration adminAuthConfiguration) {
    this.adminAuthConfiguration = adminAuthConfiguration;
  }

  
  /**
   * Specifies the default license tier which would be used by new Clouds. Enum options - ENTERPRISE_16, ENTERPRISE_18. Field introduced in 17.2.5.
   * @return defaultLicenseTier
  **/
  @ApiModelProperty(value = "Specifies the default license tier which would be used by new Clouds. Enum options - ENTERPRISE_16, ENTERPRISE_18. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getDefaultLicenseTier() {
    return defaultLicenseTier;
  }
    
  @VsoMethod
  public void setDefaultLicenseTier(String defaultLicenseTier) {
    this.defaultLicenseTier = defaultLicenseTier;
  }

  
  /**
   * Placeholder for description of property dns_configuration of obj type SystemConfiguration field type str  type object
   * @return dnsConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property dns_configuration of obj type SystemConfiguration field type str  type object")

  @Valid

 
  @VsoMethod  
  public DNSConfiguration getDnsConfiguration() {
    return dnsConfiguration;
  }
    
  @VsoMethod
  public void setDnsConfiguration(DNSConfiguration dnsConfiguration) {
    this.dnsConfiguration = dnsConfiguration;
  }

  
  public SystemConfiguration addDnsVirtualserviceRefsItem(String dnsVirtualserviceRefsItem) {
    if (this.dnsVirtualserviceRefs == null) {
      this.dnsVirtualserviceRefs = new ArrayList<String>();
    }
    this.dnsVirtualserviceRefs.add(dnsVirtualserviceRefsItem);
    return this;
  }
  
  /**
   * DNS virtualservices hosting FQDN records for applications across Avi Vantage. If no virtualservices are provided, Avi Vantage will provide DNS services for configured applications. Switching back to Avi Vantage from DNS virtualservices is not allowed. It is a reference to an object of type VirtualService.
   * @return dnsVirtualserviceRefs
  **/
  @ApiModelProperty(value = "DNS virtualservices hosting FQDN records for applications across Avi Vantage. If no virtualservices are provided, Avi Vantage will provide DNS services for configured applications. Switching back to Avi Vantage from DNS virtualservices is not allowed. It is a reference to an object of type VirtualService.")


 
  @VsoMethod  
  public List<String> getDnsVirtualserviceRefs() {
    return dnsVirtualserviceRefs;
  }
    
  @VsoMethod
  public void setDnsVirtualserviceRefs(List<String> dnsVirtualserviceRefs) {
    this.dnsVirtualserviceRefs = dnsVirtualserviceRefs;
  }

  
  /**
   * Placeholder for description of property docker_mode of obj type SystemConfiguration field type str  type boolean
   * @return dockerMode
  **/
  @ApiModelProperty(value = "Placeholder for description of property docker_mode of obj type SystemConfiguration field type str  type boolean")


 
  @VsoMethod  
  public Boolean isDockerMode() {
    return dockerMode;
  }
    
  @VsoMethod
  public void setDockerMode(Boolean dockerMode) {
    this.dockerMode = dockerMode;
  }

  
  /**
   * Placeholder for description of property email_configuration of obj type SystemConfiguration field type str  type object
   * @return emailConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property email_configuration of obj type SystemConfiguration field type str  type object")

  @Valid

 
  @VsoMethod  
  public EmailConfiguration getEmailConfiguration() {
    return emailConfiguration;
  }
    
  @VsoMethod
  public void setEmailConfiguration(EmailConfiguration emailConfiguration) {
    this.emailConfiguration = emailConfiguration;
  }

  
  /**
   * Placeholder for description of property global_tenant_config of obj type SystemConfiguration field type str  type object
   * @return globalTenantConfig
  **/
  @ApiModelProperty(value = "Placeholder for description of property global_tenant_config of obj type SystemConfiguration field type str  type object")

  @Valid

 
  @VsoMethod  
  public TenantConfiguration getGlobalTenantConfig() {
    return globalTenantConfig;
  }
    
  @VsoMethod
  public void setGlobalTenantConfig(TenantConfiguration globalTenantConfig) {
    this.globalTenantConfig = globalTenantConfig;
  }

  
  /**
   * Placeholder for description of property linux_configuration of obj type SystemConfiguration field type str  type object
   * @return linuxConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property linux_configuration of obj type SystemConfiguration field type str  type object")

  @Valid

 
  @VsoMethod  
  public LinuxConfiguration getLinuxConfiguration() {
    return linuxConfiguration;
  }
    
  @VsoMethod
  public void setLinuxConfiguration(LinuxConfiguration linuxConfiguration) {
    this.linuxConfiguration = linuxConfiguration;
  }

  
  /**
   * Configure Ip Access control for controller to restrict open access.
   * @return mgmtIpAccessControl
  **/
  @ApiModelProperty(value = "Configure Ip Access control for controller to restrict open access.")

  @Valid

 
  @VsoMethod  
  public MgmtIpAccessControl getMgmtIpAccessControl() {
    return mgmtIpAccessControl;
  }
    
  @VsoMethod
  public void setMgmtIpAccessControl(MgmtIpAccessControl mgmtIpAccessControl) {
    this.mgmtIpAccessControl = mgmtIpAccessControl;
  }

  
  /**
   * Placeholder for description of property ntp_configuration of obj type SystemConfiguration field type str  type object
   * @return ntpConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property ntp_configuration of obj type SystemConfiguration field type str  type object")

  @Valid

 
  @VsoMethod  
  public NTPConfiguration getNtpConfiguration() {
    return ntpConfiguration;
  }
    
  @VsoMethod
  public void setNtpConfiguration(NTPConfiguration ntpConfiguration) {
    this.ntpConfiguration = ntpConfiguration;
  }

  
  /**
   * Placeholder for description of property portal_configuration of obj type SystemConfiguration field type str  type object
   * @return portalConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property portal_configuration of obj type SystemConfiguration field type str  type object")

  @Valid

 
  @VsoMethod  
  public PortalConfiguration getPortalConfiguration() {
    return portalConfiguration;
  }
    
  @VsoMethod
  public void setPortalConfiguration(PortalConfiguration portalConfiguration) {
    this.portalConfiguration = portalConfiguration;
  }

  
  /**
   * Placeholder for description of property proxy_configuration of obj type SystemConfiguration field type str  type object
   * @return proxyConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property proxy_configuration of obj type SystemConfiguration field type str  type object")

  @Valid

 
  @VsoMethod  
  public ProxyConfiguration getProxyConfiguration() {
    return proxyConfiguration;
  }
    
  @VsoMethod
  public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
    this.proxyConfiguration = proxyConfiguration;
  }

  
  /**
   * Configure Secure Channel properties. Field introduced in 18.1.4, 18.2.1.
   * @return secureChannelConfiguration
  **/
  @ApiModelProperty(value = "Configure Secure Channel properties. Field introduced in 18.1.4, 18.2.1.")

  @Valid

 
  @VsoMethod  
  public SecureChannelConfiguration getSecureChannelConfiguration() {
    return secureChannelConfiguration;
  }
    
  @VsoMethod
  public void setSecureChannelConfiguration(SecureChannelConfiguration secureChannelConfiguration) {
    this.secureChannelConfiguration = secureChannelConfiguration;
  }

  
  /**
   * Placeholder for description of property snmp_configuration of obj type SystemConfiguration field type str  type object
   * @return snmpConfiguration
  **/
  @ApiModelProperty(value = "Placeholder for description of property snmp_configuration of obj type SystemConfiguration field type str  type object")

  @Valid

 
  @VsoMethod  
  public SnmpConfiguration getSnmpConfiguration() {
    return snmpConfiguration;
  }
    
  @VsoMethod
  public void setSnmpConfiguration(SnmpConfiguration snmpConfiguration) {
    this.snmpConfiguration = snmpConfiguration;
  }

  
  public SystemConfiguration addSshCiphersItem(String sshCiphersItem) {
    if (this.sshCiphers == null) {
      this.sshCiphers = new ArrayList<String>();
    }
    this.sshCiphers.add(sshCiphersItem);
    return this;
  }
  
  /**
   * Allowed Ciphers list for SSH to the management interface on the Controller and Service Engines. If this is not specified, all the default ciphers are allowed.
   * @return sshCiphers
  **/
  @ApiModelProperty(value = "Allowed Ciphers list for SSH to the management interface on the Controller and Service Engines. If this is not specified, all the default ciphers are allowed.")


 
  @VsoMethod  
  public List<String> getSshCiphers() {
    return sshCiphers;
  }
    
  @VsoMethod
  public void setSshCiphers(List<String> sshCiphers) {
    this.sshCiphers = sshCiphers;
  }

  
  public SystemConfiguration addSshHmacsItem(String sshHmacsItem) {
    if (this.sshHmacs == null) {
      this.sshHmacs = new ArrayList<String>();
    }
    this.sshHmacs.add(sshHmacsItem);
    return this;
  }
  
  /**
   * Allowed HMAC list for SSH to the management interface on the Controller and Service Engines. If this is not specified, all the default HMACs are allowed.
   * @return sshHmacs
  **/
  @ApiModelProperty(value = "Allowed HMAC list for SSH to the management interface on the Controller and Service Engines. If this is not specified, all the default HMACs are allowed.")


 
  @VsoMethod  
  public List<String> getSshHmacs() {
    return sshHmacs;
  }
    
  @VsoMethod
  public void setSshHmacs(List<String> sshHmacs) {
    this.sshHmacs = sshHmacs;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * This flag is set once the Initial Controller Setup workflow is complete. Field introduced in 18.2.3.
   * @return welcomeWorkflowComplete
  **/
  @ApiModelProperty(value = "This flag is set once the Initial Controller Setup workflow is complete. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isWelcomeWorkflowComplete() {
    return welcomeWorkflowComplete;
  }
    
  @VsoMethod
  public void setWelcomeWorkflowComplete(Boolean welcomeWorkflowComplete) {
    this.welcomeWorkflowComplete = welcomeWorkflowComplete;
  }

  
  public String getObjectID() {
		return "SystemConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemConfiguration systemConfiguration = (SystemConfiguration) o;
    return Objects.equals(this.lastModified, systemConfiguration.lastModified) &&
        Objects.equals(this.adminAuthConfiguration, systemConfiguration.adminAuthConfiguration) &&
        Objects.equals(this.defaultLicenseTier, systemConfiguration.defaultLicenseTier) &&
        Objects.equals(this.dnsConfiguration, systemConfiguration.dnsConfiguration) &&
        Objects.equals(this.dnsVirtualserviceRefs, systemConfiguration.dnsVirtualserviceRefs) &&
        Objects.equals(this.dockerMode, systemConfiguration.dockerMode) &&
        Objects.equals(this.emailConfiguration, systemConfiguration.emailConfiguration) &&
        Objects.equals(this.globalTenantConfig, systemConfiguration.globalTenantConfig) &&
        Objects.equals(this.linuxConfiguration, systemConfiguration.linuxConfiguration) &&
        Objects.equals(this.mgmtIpAccessControl, systemConfiguration.mgmtIpAccessControl) &&
        Objects.equals(this.ntpConfiguration, systemConfiguration.ntpConfiguration) &&
        Objects.equals(this.portalConfiguration, systemConfiguration.portalConfiguration) &&
        Objects.equals(this.proxyConfiguration, systemConfiguration.proxyConfiguration) &&
        Objects.equals(this.secureChannelConfiguration, systemConfiguration.secureChannelConfiguration) &&
        Objects.equals(this.snmpConfiguration, systemConfiguration.snmpConfiguration) &&
        Objects.equals(this.sshCiphers, systemConfiguration.sshCiphers) &&
        Objects.equals(this.sshHmacs, systemConfiguration.sshHmacs) &&
        Objects.equals(this.url, systemConfiguration.url) &&
        Objects.equals(this.uuid, systemConfiguration.uuid) &&
        Objects.equals(this.welcomeWorkflowComplete, systemConfiguration.welcomeWorkflowComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, adminAuthConfiguration, defaultLicenseTier, dnsConfiguration, dnsVirtualserviceRefs, dockerMode, emailConfiguration, globalTenantConfig, linuxConfiguration, mgmtIpAccessControl, ntpConfiguration, portalConfiguration, proxyConfiguration, secureChannelConfiguration, snmpConfiguration, sshCiphers, sshHmacs, url, uuid, welcomeWorkflowComplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemConfiguration {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    adminAuthConfiguration: ").append(toIndentedString(adminAuthConfiguration)).append("\n");
    sb.append("    defaultLicenseTier: ").append(toIndentedString(defaultLicenseTier)).append("\n");
    sb.append("    dnsConfiguration: ").append(toIndentedString(dnsConfiguration)).append("\n");
    sb.append("    dnsVirtualserviceRefs: ").append(toIndentedString(dnsVirtualserviceRefs)).append("\n");
    sb.append("    dockerMode: ").append(toIndentedString(dockerMode)).append("\n");
    sb.append("    emailConfiguration: ").append(toIndentedString(emailConfiguration)).append("\n");
    sb.append("    globalTenantConfig: ").append(toIndentedString(globalTenantConfig)).append("\n");
    sb.append("    linuxConfiguration: ").append(toIndentedString(linuxConfiguration)).append("\n");
    sb.append("    mgmtIpAccessControl: ").append(toIndentedString(mgmtIpAccessControl)).append("\n");
    sb.append("    ntpConfiguration: ").append(toIndentedString(ntpConfiguration)).append("\n");
    sb.append("    portalConfiguration: ").append(toIndentedString(portalConfiguration)).append("\n");
    sb.append("    proxyConfiguration: ").append(toIndentedString(proxyConfiguration)).append("\n");
    sb.append("    secureChannelConfiguration: ").append(toIndentedString(secureChannelConfiguration)).append("\n");
    sb.append("    snmpConfiguration: ").append(toIndentedString(snmpConfiguration)).append("\n");
    sb.append("    sshCiphers: ").append(toIndentedString(sshCiphers)).append("\n");
    sb.append("    sshHmacs: ").append(toIndentedString(sshHmacs)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    welcomeWorkflowComplete: ").append(toIndentedString(welcomeWorkflowComplete)).append("\n");
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

