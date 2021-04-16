package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DnsServiceApplicationProfile;
import com.vmware.avi.vro.model.DosRateLimitProfile;
import com.vmware.avi.vro.model.HTTPApplicationProfile;
import com.vmware.avi.vro.model.SipServiceApplicationProfile;
import com.vmware.avi.vro.model.TCPApplicationProfile;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ApplicationProfile is a POJO class extends AviRestResource that used for creating
 * ApplicationProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApplicationProfile")
@VsoFinder(name = Constants.FINDER_VRO_APPLICATIONPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApplicationProfile extends AviRestResource {
    @JsonProperty("cloud_config_cksum")
    @JsonInclude(Include.NON_NULL)
    private String cloudConfigCksum = null;

    @JsonProperty("created_by")
    @JsonInclude(Include.NON_NULL)
    private String createdBy = null;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("dns_service_profile")
    @JsonInclude(Include.NON_NULL)
    private DnsServiceApplicationProfile dnsServiceProfile = null;

    @JsonProperty("dos_rl_profile")
    @JsonInclude(Include.NON_NULL)
    private DosRateLimitProfile dosRlProfile = null;

    @JsonProperty("http_profile")
    @JsonInclude(Include.NON_NULL)
    private HTTPApplicationProfile httpProfile = null;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("preserve_client_ip")
    @JsonInclude(Include.NON_NULL)
    private Boolean preserveClientIp = false;

    @JsonProperty("preserve_client_port")
    @JsonInclude(Include.NON_NULL)
    private Boolean preserveClientPort = false;

    @JsonProperty("preserve_dest_ip_port")
    @JsonInclude(Include.NON_NULL)
    private Boolean preserveDestIpPort = false;

    @JsonProperty("sip_service_profile")
    @JsonInclude(Include.NON_NULL)
    private SipServiceApplicationProfile sipServiceProfile = null;

    @JsonProperty("tcp_app_profile")
    @JsonInclude(Include.NON_NULL)
    private TCPApplicationProfile tcpAppProfile = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Checksum of application profiles.
   * Internally set by cloud connector.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudConfigCksum
   */
  @VsoMethod
  public String getCloudConfigCksum() {
    return cloudConfigCksum;
  }

  /**
   * This is the setter method to the attribute.
   * Checksum of application profiles.
   * Internally set by cloud connector.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudConfigCksum set the cloudConfigCksum.
   */
  @VsoMethod
  public void setCloudConfigCksum(String  cloudConfigCksum) {
    this.cloudConfigCksum = cloudConfigCksum;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the application profile creator.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return createdBy
   */
  @VsoMethod
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the application profile creator.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param createdBy set the createdBy.
   */
  @VsoMethod
  public void setCreatedBy(String  createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User defined description for the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User defined description for the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies various dns service related controls for virtual service.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsServiceProfile
   */
  @VsoMethod
  public DnsServiceApplicationProfile getDnsServiceProfile() {
    return dnsServiceProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies various dns service related controls for virtual service.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dnsServiceProfile set the dnsServiceProfile.
   */
  @VsoMethod
  public void setDnsServiceProfile(DnsServiceApplicationProfile dnsServiceProfile) {
    this.dnsServiceProfile = dnsServiceProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies various security related controls for virtual service.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dosRlProfile
   */
  @VsoMethod
  public DosRateLimitProfile getDosRlProfile() {
    return dosRlProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies various security related controls for virtual service.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dosRlProfile set the dosRlProfile.
   */
  @VsoMethod
  public void setDosRlProfile(DosRateLimitProfile dosRlProfile) {
    this.dosRlProfile = dosRlProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the http application proxy profile parameters.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpProfile
   */
  @VsoMethod
  public HTTPApplicationProfile getHttpProfile() {
    return httpProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the http application proxy profile parameters.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param httpProfile set the httpProfile.
   */
  @VsoMethod
  public void setHttpProfile(HTTPApplicationProfile httpProfile) {
    this.httpProfile = httpProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public List<RoleFilterMatchLabel> getMarkers() {
    return markers;
  }

  /**
   * This is the setter method. this will set the markers
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public void setMarkers(List<RoleFilterMatchLabel>  markers) {
    this.markers = markers;
  }

  /**
   * This is the setter method this will set the markers
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public ApplicationProfile addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The name of the application profile.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the application profile.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies if client ip needs to be preserved for backend connection.
   * Not compatible with connection multiplexing.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return preserveClientIp
   */
  @VsoMethod
  public Boolean getPreserveClientIp() {
    return preserveClientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies if client ip needs to be preserved for backend connection.
   * Not compatible with connection multiplexing.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param preserveClientIp set the preserveClientIp.
   */
  @VsoMethod
  public void setPreserveClientIp(Boolean  preserveClientIp) {
    this.preserveClientIp = preserveClientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies if we need to preserve client port while preserving client ip for backend connections.
   * Field introduced in 17.2.7.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return preserveClientPort
   */
  @VsoMethod
  public Boolean getPreserveClientPort() {
    return preserveClientPort;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies if we need to preserve client port while preserving client ip for backend connections.
   * Field introduced in 17.2.7.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param preserveClientPort set the preserveClientPort.
   */
  @VsoMethod
  public void setPreserveClientPort(Boolean  preserveClientPort) {
    this.preserveClientPort = preserveClientPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies if destination ip and port needs to be preserved for backend connection.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return preserveDestIpPort
   */
  @VsoMethod
  public Boolean getPreserveDestIpPort() {
    return preserveDestIpPort;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies if destination ip and port needs to be preserved for backend connection.
   * Field introduced in 20.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param preserveDestIpPort set the preserveDestIpPort.
   */
  @VsoMethod
  public void setPreserveDestIpPort(Boolean  preserveDestIpPort) {
    this.preserveDestIpPort = preserveDestIpPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies various sip service related controls for virtual service.
   * Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sipServiceProfile
   */
  @VsoMethod
  public SipServiceApplicationProfile getSipServiceProfile() {
    return sipServiceProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies various sip service related controls for virtual service.
   * Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sipServiceProfile set the sipServiceProfile.
   */
  @VsoMethod
  public void setSipServiceProfile(SipServiceApplicationProfile sipServiceProfile) {
    this.sipServiceProfile = sipServiceProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the tcp application proxy profile parameters.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tcpAppProfile
   */
  @VsoMethod
  public TCPApplicationProfile getTcpAppProfile() {
    return tcpAppProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the tcp application proxy profile parameters.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tcpAppProfile set the tcpAppProfile.
   */
  @VsoMethod
  public void setTcpAppProfile(TCPApplicationProfile tcpAppProfile) {
    this.tcpAppProfile = tcpAppProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies which application layer proxy is enabled for the virtual service.
   * Enum options - APPLICATION_PROFILE_TYPE_L4, APPLICATION_PROFILE_TYPE_HTTP, APPLICATION_PROFILE_TYPE_SYSLOG, APPLICATION_PROFILE_TYPE_DNS,
   * APPLICATION_PROFILE_TYPE_SSL, APPLICATION_PROFILE_TYPE_SIP.
   * Allowed in basic(allowed values- application_profile_type_l4,application_profile_type_http) edition, essentials(allowed values-
   * application_profile_type_l4) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies which application layer proxy is enabled for the virtual service.
   * Enum options - APPLICATION_PROFILE_TYPE_L4, APPLICATION_PROFILE_TYPE_HTTP, APPLICATION_PROFILE_TYPE_SYSLOG, APPLICATION_PROFILE_TYPE_DNS,
   * APPLICATION_PROFILE_TYPE_SSL, APPLICATION_PROFILE_TYPE_SIP.
   * Allowed in basic(allowed values- application_profile_type_l4,application_profile_type_http) edition, essentials(allowed values-
   * application_profile_type_l4) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
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
   * Uuid of the application profile.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the application profile.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApplicationProfile objApplicationProfile = (ApplicationProfile) o;
  return   Objects.equals(this.uuid, objApplicationProfile.uuid)&&
  Objects.equals(this.name, objApplicationProfile.name)&&
  Objects.equals(this.type, objApplicationProfile.type)&&
  Objects.equals(this.httpProfile, objApplicationProfile.httpProfile)&&
  Objects.equals(this.dosRlProfile, objApplicationProfile.dosRlProfile)&&
  Objects.equals(this.tcpAppProfile, objApplicationProfile.tcpAppProfile)&&
  Objects.equals(this.dnsServiceProfile, objApplicationProfile.dnsServiceProfile)&&
  Objects.equals(this.preserveClientIp, objApplicationProfile.preserveClientIp)&&
  Objects.equals(this.preserveClientPort, objApplicationProfile.preserveClientPort)&&
  Objects.equals(this.sipServiceProfile, objApplicationProfile.sipServiceProfile)&&
  Objects.equals(this.cloudConfigCksum, objApplicationProfile.cloudConfigCksum)&&
  Objects.equals(this.createdBy, objApplicationProfile.createdBy)&&
  Objects.equals(this.preserveDestIpPort, objApplicationProfile.preserveDestIpPort)&&
  Objects.equals(this.markers, objApplicationProfile.markers)&&
  Objects.equals(this.description, objApplicationProfile.description)&&
  Objects.equals(this.tenantRef, objApplicationProfile.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApplicationProfile {\n");
      sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dnsServiceProfile: ").append(toIndentedString(dnsServiceProfile)).append("\n");
        sb.append("    dosRlProfile: ").append(toIndentedString(dosRlProfile)).append("\n");
        sb.append("    httpProfile: ").append(toIndentedString(httpProfile)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    preserveClientIp: ").append(toIndentedString(preserveClientIp)).append("\n");
        sb.append("    preserveClientPort: ").append(toIndentedString(preserveClientPort)).append("\n");
        sb.append("    preserveDestIpPort: ").append(toIndentedString(preserveDestIpPort)).append("\n");
        sb.append("    sipServiceProfile: ").append(toIndentedString(sipServiceProfile)).append("\n");
        sb.append("    tcpAppProfile: ").append(toIndentedString(tcpAppProfile)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

