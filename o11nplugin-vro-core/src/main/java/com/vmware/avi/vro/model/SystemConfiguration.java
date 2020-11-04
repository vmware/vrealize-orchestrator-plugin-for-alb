package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AdminAuthConfiguration;
import com.vmware.avi.vro.model.DNSConfiguration;
import com.vmware.avi.vro.model.EmailConfiguration;
import com.vmware.avi.vro.model.TenantConfiguration;
import com.vmware.avi.vro.model.LinuxConfiguration;
import com.vmware.avi.vro.model.MgmtIpAccessControl;
import com.vmware.avi.vro.model.NTPConfiguration;
import com.vmware.avi.vro.model.PortalConfiguration;
import com.vmware.avi.vro.model.ProxyConfiguration;
import com.vmware.avi.vro.model.SecureChannelConfiguration;
import com.vmware.avi.vro.model.SnmpConfiguration;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SystemConfiguration is a POJO class extends AviRestResource that used for creating
 * SystemConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SystemConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_SYSTEMCONFIGURATION, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SystemConfiguration extends AviRestResource {
    @JsonProperty("admin_auth_configuration")
    @JsonInclude(Include.NON_NULL)
    private AdminAuthConfiguration adminAuthConfiguration = null;

    @JsonProperty("default_license_tier")
    @JsonInclude(Include.NON_NULL)
    private String defaultLicenseTier = "ENTERPRISE";

    @JsonProperty("dns_configuration")
    @JsonInclude(Include.NON_NULL)
    private DNSConfiguration dnsConfiguration = null;

    @JsonProperty("dns_virtualservice_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> dnsVirtualserviceRefs = null;

    @JsonProperty("docker_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean dockerMode = false;

    @JsonProperty("email_configuration")
    @JsonInclude(Include.NON_NULL)
    private EmailConfiguration emailConfiguration = null;

    @JsonProperty("fips_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean fipsMode = false;

    @JsonProperty("global_tenant_config")
    @JsonInclude(Include.NON_NULL)
    private TenantConfiguration globalTenantConfig = null;

    @JsonProperty("linux_configuration")
    @JsonInclude(Include.NON_NULL)
    private LinuxConfiguration linuxConfiguration = null;

    @JsonProperty("mgmt_ip_access_control")
    @JsonInclude(Include.NON_NULL)
    private MgmtIpAccessControl mgmtIpAccessControl = null;

    @JsonProperty("ntp_configuration")
    @JsonInclude(Include.NON_NULL)
    private NTPConfiguration ntpConfiguration = null;

    @JsonProperty("portal_configuration")
    @JsonInclude(Include.NON_NULL)
    private PortalConfiguration portalConfiguration = null;

    @JsonProperty("proxy_configuration")
    @JsonInclude(Include.NON_NULL)
    private ProxyConfiguration proxyConfiguration = null;

    @JsonProperty("secure_channel_configuration")
    @JsonInclude(Include.NON_NULL)
    private SecureChannelConfiguration secureChannelConfiguration = null;

    @JsonProperty("snmp_configuration")
    @JsonInclude(Include.NON_NULL)
    private SnmpConfiguration snmpConfiguration = null;

    @JsonProperty("ssh_ciphers")
    @JsonInclude(Include.NON_NULL)
    private List<String> sshCiphers = null;

    @JsonProperty("ssh_hmacs")
    @JsonInclude(Include.NON_NULL)
    private List<String> sshHmacs = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("welcome_workflow_complete")
    @JsonInclude(Include.NON_NULL)
    private Boolean welcomeWorkflowComplete = false;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property admin_auth_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return adminAuthConfiguration
   */
  @VsoMethod
  public AdminAuthConfiguration getAdminAuthConfiguration() {
    return adminAuthConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property admin_auth_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param adminAuthConfiguration set the adminAuthConfiguration.
   */
  @VsoMethod
  public void setAdminAuthConfiguration(AdminAuthConfiguration adminAuthConfiguration) {
    this.adminAuthConfiguration = adminAuthConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the default license tier which would be used by new clouds.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ENTERPRISE".
   * @return defaultLicenseTier
   */
  @VsoMethod
  public String getDefaultLicenseTier() {
    return defaultLicenseTier;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the default license tier which would be used by new clouds.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ENTERPRISE".
   * @param defaultLicenseTier set the defaultLicenseTier.
   */
  @VsoMethod
  public void setDefaultLicenseTier(String  defaultLicenseTier) {
    this.defaultLicenseTier = defaultLicenseTier;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property dns_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsConfiguration
   */
  @VsoMethod
  public DNSConfiguration getDnsConfiguration() {
    return dnsConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property dns_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dnsConfiguration set the dnsConfiguration.
   */
  @VsoMethod
  public void setDnsConfiguration(DNSConfiguration dnsConfiguration) {
    this.dnsConfiguration = dnsConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dns virtualservices hosting fqdn records for applications across avi vantage.
   * If no virtualservices are provided, avi vantage will provide dns services for configured applications.
   * Switching back to avi vantage from dns virtualservices is not allowed.
   * It is a reference to an object of type virtualservice.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsVirtualserviceRefs
   */
  @VsoMethod
  public List<String> getDnsVirtualserviceRefs() {
    return dnsVirtualserviceRefs;
  }

  /**
   * This is the setter method. this will set the dnsVirtualserviceRefs
   * Dns virtualservices hosting fqdn records for applications across avi vantage.
   * If no virtualservices are provided, avi vantage will provide dns services for configured applications.
   * Switching back to avi vantage from dns virtualservices is not allowed.
   * It is a reference to an object of type virtualservice.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsVirtualserviceRefs
   */
  @VsoMethod
  public void setDnsVirtualserviceRefs(List<String>  dnsVirtualserviceRefs) {
    this.dnsVirtualserviceRefs = dnsVirtualserviceRefs;
  }

  /**
   * This is the setter method this will set the dnsVirtualserviceRefs
   * Dns virtualservices hosting fqdn records for applications across avi vantage.
   * If no virtualservices are provided, avi vantage will provide dns services for configured applications.
   * Switching back to avi vantage from dns virtualservices is not allowed.
   * It is a reference to an object of type virtualservice.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsVirtualserviceRefs
   */
  @VsoMethod
  public SystemConfiguration addDnsVirtualserviceRefsItem(String dnsVirtualserviceRefsItem) {
    if (this.dnsVirtualserviceRefs == null) {
      this.dnsVirtualserviceRefs = new ArrayList<String>();
    }
    this.dnsVirtualserviceRefs.add(dnsVirtualserviceRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property docker_mode of obj type systemconfiguration field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return dockerMode
   */
  @VsoMethod
  public Boolean getDockerMode() {
    return dockerMode;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property docker_mode of obj type systemconfiguration field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param dockerMode set the dockerMode.
   */
  @VsoMethod
  public void setDockerMode(Boolean  dockerMode) {
    this.dockerMode = dockerMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property email_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return emailConfiguration
   */
  @VsoMethod
  public EmailConfiguration getEmailConfiguration() {
    return emailConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property email_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param emailConfiguration set the emailConfiguration.
   */
  @VsoMethod
  public void setEmailConfiguration(EmailConfiguration emailConfiguration) {
    this.emailConfiguration = emailConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable fips mode.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return fipsMode
   */
  @VsoMethod
  public Boolean getFipsMode() {
    return fipsMode;
  }

  /**
   * This is the setter method to the attribute.
   * Enable fips mode.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param fipsMode set the fipsMode.
   */
  @VsoMethod
  public void setFipsMode(Boolean  fipsMode) {
    this.fipsMode = fipsMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property global_tenant_config of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return globalTenantConfig
   */
  @VsoMethod
  public TenantConfiguration getGlobalTenantConfig() {
    return globalTenantConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property global_tenant_config of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param globalTenantConfig set the globalTenantConfig.
   */
  @VsoMethod
  public void setGlobalTenantConfig(TenantConfiguration globalTenantConfig) {
    this.globalTenantConfig = globalTenantConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property linux_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return linuxConfiguration
   */
  @VsoMethod
  public LinuxConfiguration getLinuxConfiguration() {
    return linuxConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property linux_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param linuxConfiguration set the linuxConfiguration.
   */
  @VsoMethod
  public void setLinuxConfiguration(LinuxConfiguration linuxConfiguration) {
    this.linuxConfiguration = linuxConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure ip access control for controller to restrict open access.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mgmtIpAccessControl
   */
  @VsoMethod
  public MgmtIpAccessControl getMgmtIpAccessControl() {
    return mgmtIpAccessControl;
  }

  /**
   * This is the setter method to the attribute.
   * Configure ip access control for controller to restrict open access.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mgmtIpAccessControl set the mgmtIpAccessControl.
   */
  @VsoMethod
  public void setMgmtIpAccessControl(MgmtIpAccessControl mgmtIpAccessControl) {
    this.mgmtIpAccessControl = mgmtIpAccessControl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property ntp_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ntpConfiguration
   */
  @VsoMethod
  public NTPConfiguration getNtpConfiguration() {
    return ntpConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property ntp_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ntpConfiguration set the ntpConfiguration.
   */
  @VsoMethod
  public void setNtpConfiguration(NTPConfiguration ntpConfiguration) {
    this.ntpConfiguration = ntpConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property portal_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return portalConfiguration
   */
  @VsoMethod
  public PortalConfiguration getPortalConfiguration() {
    return portalConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property portal_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param portalConfiguration set the portalConfiguration.
   */
  @VsoMethod
  public void setPortalConfiguration(PortalConfiguration portalConfiguration) {
    this.portalConfiguration = portalConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property proxy_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return proxyConfiguration
   */
  @VsoMethod
  public ProxyConfiguration getProxyConfiguration() {
    return proxyConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property proxy_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param proxyConfiguration set the proxyConfiguration.
   */
  @VsoMethod
  public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
    this.proxyConfiguration = proxyConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure secure channel properties.
   * Field introduced in 18.1.4, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return secureChannelConfiguration
   */
  @VsoMethod
  public SecureChannelConfiguration getSecureChannelConfiguration() {
    return secureChannelConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Configure secure channel properties.
   * Field introduced in 18.1.4, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param secureChannelConfiguration set the secureChannelConfiguration.
   */
  @VsoMethod
  public void setSecureChannelConfiguration(SecureChannelConfiguration secureChannelConfiguration) {
    this.secureChannelConfiguration = secureChannelConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property snmp_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return snmpConfiguration
   */
  @VsoMethod
  public SnmpConfiguration getSnmpConfiguration() {
    return snmpConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property snmp_configuration of obj type systemconfiguration field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param snmpConfiguration set the snmpConfiguration.
   */
  @VsoMethod
  public void setSnmpConfiguration(SnmpConfiguration snmpConfiguration) {
    this.snmpConfiguration = snmpConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed ciphers list for ssh to the management interface on the controller and service engines.
   * If this is not specified, all the default ciphers are allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshCiphers
   */
  @VsoMethod
  public List<String> getSshCiphers() {
    return sshCiphers;
  }

  /**
   * This is the setter method. this will set the sshCiphers
   * Allowed ciphers list for ssh to the management interface on the controller and service engines.
   * If this is not specified, all the default ciphers are allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshCiphers
   */
  @VsoMethod
  public void setSshCiphers(List<String>  sshCiphers) {
    this.sshCiphers = sshCiphers;
  }

  /**
   * This is the setter method this will set the sshCiphers
   * Allowed ciphers list for ssh to the management interface on the controller and service engines.
   * If this is not specified, all the default ciphers are allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshCiphers
   */
  @VsoMethod
  public SystemConfiguration addSshCiphersItem(String sshCiphersItem) {
    if (this.sshCiphers == null) {
      this.sshCiphers = new ArrayList<String>();
    }
    this.sshCiphers.add(sshCiphersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed hmac list for ssh to the management interface on the controller and service engines.
   * If this is not specified, all the default hmacs are allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshHmacs
   */
  @VsoMethod
  public List<String> getSshHmacs() {
    return sshHmacs;
  }

  /**
   * This is the setter method. this will set the sshHmacs
   * Allowed hmac list for ssh to the management interface on the controller and service engines.
   * If this is not specified, all the default hmacs are allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshHmacs
   */
  @VsoMethod
  public void setSshHmacs(List<String>  sshHmacs) {
    this.sshHmacs = sshHmacs;
  }

  /**
   * This is the setter method this will set the sshHmacs
   * Allowed hmac list for ssh to the management interface on the controller and service engines.
   * If this is not specified, all the default hmacs are allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshHmacs
   */
  @VsoMethod
  public SystemConfiguration addSshHmacsItem(String sshHmacsItem) {
    if (this.sshHmacs == null) {
      this.sshHmacs = new ArrayList<String>();
    }
    this.sshHmacs.add(sshHmacsItem);
    return this;
  }

/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag is set once the initial controller setup workflow is complete.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return welcomeWorkflowComplete
   */
  @VsoMethod
  public Boolean getWelcomeWorkflowComplete() {
    return welcomeWorkflowComplete;
  }

  /**
   * This is the setter method to the attribute.
   * This flag is set once the initial controller setup workflow is complete.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param welcomeWorkflowComplete set the welcomeWorkflowComplete.
   */
  @VsoMethod
  public void setWelcomeWorkflowComplete(Boolean  welcomeWorkflowComplete) {
    this.welcomeWorkflowComplete = welcomeWorkflowComplete;
  }


  public String getObjectID() {
    return "SystemConfiguration" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SystemConfiguration objSystemConfiguration = (SystemConfiguration) o;
  return   Objects.equals(this.uuid, objSystemConfiguration.uuid)&&
  Objects.equals(this.dnsConfiguration, objSystemConfiguration.dnsConfiguration)&&
  Objects.equals(this.ntpConfiguration, objSystemConfiguration.ntpConfiguration)&&
  Objects.equals(this.portalConfiguration, objSystemConfiguration.portalConfiguration)&&
  Objects.equals(this.globalTenantConfig, objSystemConfiguration.globalTenantConfig)&&
  Objects.equals(this.emailConfiguration, objSystemConfiguration.emailConfiguration)&&
  Objects.equals(this.adminAuthConfiguration, objSystemConfiguration.adminAuthConfiguration)&&
  Objects.equals(this.dockerMode, objSystemConfiguration.dockerMode)&&
  Objects.equals(this.snmpConfiguration, objSystemConfiguration.snmpConfiguration)&&
  Objects.equals(this.linuxConfiguration, objSystemConfiguration.linuxConfiguration)&&
  Objects.equals(this.proxyConfiguration, objSystemConfiguration.proxyConfiguration)&&
  Objects.equals(this.mgmtIpAccessControl, objSystemConfiguration.mgmtIpAccessControl)&&
  Objects.equals(this.sshCiphers, objSystemConfiguration.sshCiphers)&&
  Objects.equals(this.sshHmacs, objSystemConfiguration.sshHmacs)&&
  Objects.equals(this.dnsVirtualserviceRefs, objSystemConfiguration.dnsVirtualserviceRefs)&&
  Objects.equals(this.defaultLicenseTier, objSystemConfiguration.defaultLicenseTier)&&
  Objects.equals(this.secureChannelConfiguration, objSystemConfiguration.secureChannelConfiguration)&&
  Objects.equals(this.welcomeWorkflowComplete, objSystemConfiguration.welcomeWorkflowComplete)&&
  Objects.equals(this.fipsMode, objSystemConfiguration.fipsMode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SystemConfiguration {\n");
      sb.append("    adminAuthConfiguration: ").append(toIndentedString(adminAuthConfiguration)).append("\n");
        sb.append("    defaultLicenseTier: ").append(toIndentedString(defaultLicenseTier)).append("\n");
        sb.append("    dnsConfiguration: ").append(toIndentedString(dnsConfiguration)).append("\n");
        sb.append("    dnsVirtualserviceRefs: ").append(toIndentedString(dnsVirtualserviceRefs)).append("\n");
        sb.append("    dockerMode: ").append(toIndentedString(dockerMode)).append("\n");
        sb.append("    emailConfiguration: ").append(toIndentedString(emailConfiguration)).append("\n");
        sb.append("    fipsMode: ").append(toIndentedString(fipsMode)).append("\n");
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

