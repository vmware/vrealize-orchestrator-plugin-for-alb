package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsServiceApplicationProfile;
import com.vmware.avi.vro.model.DosRateLimitProfile;
import com.vmware.avi.vro.model.HTTPApplicationProfile;
import com.vmware.avi.vro.model.SipServiceApplicationProfile;
import com.vmware.avi.vro.model.TCPApplicationProfile;
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
 * ApplicationProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ApplicationProfile")
@VsoFinder(name = Constants.FINDER_VRO_APPLICATIONPROFILE, idAccessor = "getObjectID()")
@Service
public class ApplicationProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cloud_config_cksum")
  private String cloudConfigCksum = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dns_service_profile")
  private DnsServiceApplicationProfile dnsServiceProfile = null;

  @JsonProperty("dos_rl_profile")
  private DosRateLimitProfile dosRlProfile = null;

  @JsonProperty("http_profile")
  private HTTPApplicationProfile httpProfile = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("preserve_client_ip")
  private Boolean preserveClientIp = null;

  @JsonProperty("preserve_client_port")
  private Boolean preserveClientPort = null;

  @JsonProperty("sip_service_profile")
  private SipServiceApplicationProfile sipServiceProfile = null;

  @JsonProperty("tcp_app_profile")
  private TCPApplicationProfile tcpAppProfile = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
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
   * Checksum of application profiles. Internally set by cloud connector. Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return cloudConfigCksum
  **/
  @ApiModelProperty(value = "Checksum of application profiles. Internally set by cloud connector. Field introduced in 17.2.14, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getCloudConfigCksum() {
    return cloudConfigCksum;
  }
    
  @VsoMethod
  public void setCloudConfigCksum(String cloudConfigCksum) {
    this.cloudConfigCksum = cloudConfigCksum;
  }

  
  /**
   * Name of the application profile creator. Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Name of the application profile creator. Field introduced in 17.2.14, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * User defined description for the object.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for the object.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Specifies various DNS service related controls for virtual service.
   * @return dnsServiceProfile
  **/
  @ApiModelProperty(value = "Specifies various DNS service related controls for virtual service.")

  @Valid

 
  @VsoMethod  
  public DnsServiceApplicationProfile getDnsServiceProfile() {
    return dnsServiceProfile;
  }
    
  @VsoMethod
  public void setDnsServiceProfile(DnsServiceApplicationProfile dnsServiceProfile) {
    this.dnsServiceProfile = dnsServiceProfile;
  }

  
  /**
   * Specifies various security related controls for virtual service.
   * @return dosRlProfile
  **/
  @ApiModelProperty(value = "Specifies various security related controls for virtual service.")

  @Valid

 
  @VsoMethod  
  public DosRateLimitProfile getDosRlProfile() {
    return dosRlProfile;
  }
    
  @VsoMethod
  public void setDosRlProfile(DosRateLimitProfile dosRlProfile) {
    this.dosRlProfile = dosRlProfile;
  }

  
  /**
   * Specifies the HTTP application proxy profile parameters.
   * @return httpProfile
  **/
  @ApiModelProperty(value = "Specifies the HTTP application proxy profile parameters.")

  @Valid

 
  @VsoMethod  
  public HTTPApplicationProfile getHttpProfile() {
    return httpProfile;
  }
    
  @VsoMethod
  public void setHttpProfile(HTTPApplicationProfile httpProfile) {
    this.httpProfile = httpProfile;
  }

  
  /**
   * The name of the application profile.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the application profile.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Specifies if client IP needs to be preserved for backend connection. Not compatible with Connection Multiplexing.
   * @return preserveClientIp
  **/
  @ApiModelProperty(value = "Specifies if client IP needs to be preserved for backend connection. Not compatible with Connection Multiplexing.")


 
  @VsoMethod  
  public Boolean isPreserveClientIp() {
    return preserveClientIp;
  }
    
  @VsoMethod
  public void setPreserveClientIp(Boolean preserveClientIp) {
    this.preserveClientIp = preserveClientIp;
  }

  
  /**
   * Specifies if we need to preserve client port while preserving client IP for backend connections. Field introduced in 17.2.7.
   * @return preserveClientPort
  **/
  @ApiModelProperty(value = "Specifies if we need to preserve client port while preserving client IP for backend connections. Field introduced in 17.2.7.")


 
  @VsoMethod  
  public Boolean isPreserveClientPort() {
    return preserveClientPort;
  }
    
  @VsoMethod
  public void setPreserveClientPort(Boolean preserveClientPort) {
    this.preserveClientPort = preserveClientPort;
  }

  
  /**
   * Specifies various SIP service related controls for virtual service. Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * @return sipServiceProfile
  **/
  @ApiModelProperty(value = "Specifies various SIP service related controls for virtual service. Field introduced in 17.2.8, 18.1.3, 18.2.1.")

  @Valid

 
  @VsoMethod  
  public SipServiceApplicationProfile getSipServiceProfile() {
    return sipServiceProfile;
  }
    
  @VsoMethod
  public void setSipServiceProfile(SipServiceApplicationProfile sipServiceProfile) {
    this.sipServiceProfile = sipServiceProfile;
  }

  
  /**
   * Specifies the TCP application proxy profile parameters.
   * @return tcpAppProfile
  **/
  @ApiModelProperty(value = "Specifies the TCP application proxy profile parameters.")

  @Valid

 
  @VsoMethod  
  public TCPApplicationProfile getTcpAppProfile() {
    return tcpAppProfile;
  }
    
  @VsoMethod
  public void setTcpAppProfile(TCPApplicationProfile tcpAppProfile) {
    this.tcpAppProfile = tcpAppProfile;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * Specifies which application layer proxy is enabled for the virtual service. Enum options - APPLICATION_PROFILE_TYPE_L4, APPLICATION_PROFILE_TYPE_HTTP, APPLICATION_PROFILE_TYPE_SYSLOG, APPLICATION_PROFILE_TYPE_DNS, APPLICATION_PROFILE_TYPE_SSL, APPLICATION_PROFILE_TYPE_SIP.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Specifies which application layer proxy is enabled for the virtual service. Enum options - APPLICATION_PROFILE_TYPE_L4, APPLICATION_PROFILE_TYPE_HTTP, APPLICATION_PROFILE_TYPE_SYSLOG, APPLICATION_PROFILE_TYPE_DNS, APPLICATION_PROFILE_TYPE_SSL, APPLICATION_PROFILE_TYPE_SIP.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
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
   * UUID of the application profile.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the application profile.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "ApplicationProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationProfile applicationProfile = (ApplicationProfile) o;
    return Objects.equals(this.lastModified, applicationProfile.lastModified) &&
        Objects.equals(this.cloudConfigCksum, applicationProfile.cloudConfigCksum) &&
        Objects.equals(this.createdBy, applicationProfile.createdBy) &&
        Objects.equals(this.description, applicationProfile.description) &&
        Objects.equals(this.dnsServiceProfile, applicationProfile.dnsServiceProfile) &&
        Objects.equals(this.dosRlProfile, applicationProfile.dosRlProfile) &&
        Objects.equals(this.httpProfile, applicationProfile.httpProfile) &&
        Objects.equals(this.name, applicationProfile.name) &&
        Objects.equals(this.preserveClientIp, applicationProfile.preserveClientIp) &&
        Objects.equals(this.preserveClientPort, applicationProfile.preserveClientPort) &&
        Objects.equals(this.sipServiceProfile, applicationProfile.sipServiceProfile) &&
        Objects.equals(this.tcpAppProfile, applicationProfile.tcpAppProfile) &&
        Objects.equals(this.tenantRef, applicationProfile.tenantRef) &&
        Objects.equals(this.type, applicationProfile.type) &&
        Objects.equals(this.url, applicationProfile.url) &&
        Objects.equals(this.uuid, applicationProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, cloudConfigCksum, createdBy, description, dnsServiceProfile, dosRlProfile, httpProfile, name, preserveClientIp, preserveClientPort, sipServiceProfile, tcpAppProfile, tenantRef, type, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dnsServiceProfile: ").append(toIndentedString(dnsServiceProfile)).append("\n");
    sb.append("    dosRlProfile: ").append(toIndentedString(dosRlProfile)).append("\n");
    sb.append("    httpProfile: ").append(toIndentedString(httpProfile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preserveClientIp: ").append(toIndentedString(preserveClientIp)).append("\n");
    sb.append("    preserveClientPort: ").append(toIndentedString(preserveClientPort)).append("\n");
    sb.append("    sipServiceProfile: ").append(toIndentedString(sipServiceProfile)).append("\n");
    sb.append("    tcpAppProfile: ").append(toIndentedString(tcpAppProfile)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

