package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AppCookiePersistenceProfile;
import com.vmware.avi.vro.model.HdrPersistenceProfile;
import com.vmware.avi.vro.model.HttpCookiePersistenceProfile;
import com.vmware.avi.vro.model.IPPersistenceProfile;
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
 * ApplicationPersistenceProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ApplicationPersistenceProfile")
@VsoFinder(name = Constants.FINDER_VRO_APPLICATIONPERSISTENCEPROFILE, idAccessor = "getObjectID()")
@Service
public class ApplicationPersistenceProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("app_cookie_persistence_profile")
  private AppCookiePersistenceProfile appCookiePersistenceProfile = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("hdr_persistence_profile")
  private HdrPersistenceProfile hdrPersistenceProfile = null;

  @JsonProperty("http_cookie_persistence_profile")
  private HttpCookiePersistenceProfile httpCookiePersistenceProfile = null;

  @JsonProperty("ip_persistence_profile")
  private IPPersistenceProfile ipPersistenceProfile = null;

  @JsonProperty("is_federated")
  private Boolean isFederated = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("persistence_type")
  private String persistenceType = "PERSISTENCE_TYPE_CLIENT_IP_ADDRESS";

  @JsonProperty("server_hm_down_recovery")
  private String serverHmDownRecovery = "HM_DOWN_PICK_NEW_SERVER";

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

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
   * Specifies the Application Cookie Persistence profile parameters.
   * @return appCookiePersistenceProfile
  **/
  @ApiModelProperty(value = "Specifies the Application Cookie Persistence profile parameters.")

  @Valid

 
  @VsoMethod  
  public AppCookiePersistenceProfile getAppCookiePersistenceProfile() {
    return appCookiePersistenceProfile;
  }
    
  @VsoMethod
  public void setAppCookiePersistenceProfile(AppCookiePersistenceProfile appCookiePersistenceProfile) {
    this.appCookiePersistenceProfile = appCookiePersistenceProfile;
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
   * Specifies the custom HTTP Header Persistence profile parameters.
   * @return hdrPersistenceProfile
  **/
  @ApiModelProperty(value = "Specifies the custom HTTP Header Persistence profile parameters.")

  @Valid

 
  @VsoMethod  
  public HdrPersistenceProfile getHdrPersistenceProfile() {
    return hdrPersistenceProfile;
  }
    
  @VsoMethod
  public void setHdrPersistenceProfile(HdrPersistenceProfile hdrPersistenceProfile) {
    this.hdrPersistenceProfile = hdrPersistenceProfile;
  }

  
  /**
   * Specifies the HTTP Cookie Persistence profile parameters.
   * @return httpCookiePersistenceProfile
  **/
  @ApiModelProperty(value = "Specifies the HTTP Cookie Persistence profile parameters.")

  @Valid

 
  @VsoMethod  
  public HttpCookiePersistenceProfile getHttpCookiePersistenceProfile() {
    return httpCookiePersistenceProfile;
  }
    
  @VsoMethod
  public void setHttpCookiePersistenceProfile(HttpCookiePersistenceProfile httpCookiePersistenceProfile) {
    this.httpCookiePersistenceProfile = httpCookiePersistenceProfile;
  }

  
  /**
   * Specifies the Client IP Persistence profile parameters.
   * @return ipPersistenceProfile
  **/
  @ApiModelProperty(value = "Specifies the Client IP Persistence profile parameters.")

  @Valid

 
  @VsoMethod  
  public IPPersistenceProfile getIpPersistenceProfile() {
    return ipPersistenceProfile;
  }
    
  @VsoMethod
  public void setIpPersistenceProfile(IPPersistenceProfile ipPersistenceProfile) {
    this.ipPersistenceProfile = ipPersistenceProfile;
  }

  
  /**
   * This field describes the object's replication scope. If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.  If the field is set to true, then the object is replicated across the federation.  . Field introduced in 17.1.3.
   * @return isFederated
  **/
  @ApiModelProperty(value = "This field describes the object's replication scope. If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.  If the field is set to true, then the object is replicated across the federation.  . Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Boolean isIsFederated() {
    return isFederated;
  }
    
  @VsoMethod
  public void setIsFederated(Boolean isFederated) {
    this.isFederated = isFederated;
  }

  
  /**
   * A user-friendly name for the persistence profile.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A user-friendly name for the persistence profile.")
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
   * Method used to persist clients to the same server for a duration of time or a session. Enum options - PERSISTENCE_TYPE_CLIENT_IP_ADDRESS, PERSISTENCE_TYPE_HTTP_COOKIE, PERSISTENCE_TYPE_TLS, PERSISTENCE_TYPE_CLIENT_IPV6_ADDRESS, PERSISTENCE_TYPE_CUSTOM_HTTP_HEADER, PERSISTENCE_TYPE_APP_COOKIE, PERSISTENCE_TYPE_GSLB_SITE.
   * @return persistenceType
  **/
  @ApiModelProperty(required = true, value = "Method used to persist clients to the same server for a duration of time or a session. Enum options - PERSISTENCE_TYPE_CLIENT_IP_ADDRESS, PERSISTENCE_TYPE_HTTP_COOKIE, PERSISTENCE_TYPE_TLS, PERSISTENCE_TYPE_CLIENT_IPV6_ADDRESS, PERSISTENCE_TYPE_CUSTOM_HTTP_HEADER, PERSISTENCE_TYPE_APP_COOKIE, PERSISTENCE_TYPE_GSLB_SITE.")
  @NotNull


 
  @VsoMethod  
  public String getPersistenceType() {
    return persistenceType;
  }
    
  @VsoMethod
  public void setPersistenceType(String persistenceType) {
    this.persistenceType = persistenceType;
  }

  
  /**
   * Specifies behavior when a persistent server has been marked down by a health monitor. Enum options - HM_DOWN_PICK_NEW_SERVER, HM_DOWN_ABORT_CONNECTION, HM_DOWN_CONTINUE_PERSISTENT_SERVER.
   * @return serverHmDownRecovery
  **/
  @ApiModelProperty(value = "Specifies behavior when a persistent server has been marked down by a health monitor. Enum options - HM_DOWN_PICK_NEW_SERVER, HM_DOWN_ABORT_CONNECTION, HM_DOWN_CONTINUE_PERSISTENT_SERVER.")


 
  @VsoMethod  
  public String getServerHmDownRecovery() {
    return serverHmDownRecovery;
  }
    
  @VsoMethod
  public void setServerHmDownRecovery(String serverHmDownRecovery) {
    this.serverHmDownRecovery = serverHmDownRecovery;
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
   * UUID of the persistence profile.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the persistence profile.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "ApplicationPersistenceProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationPersistenceProfile applicationPersistenceProfile = (ApplicationPersistenceProfile) o;
    return Objects.equals(this.lastModified, applicationPersistenceProfile.lastModified) &&
        Objects.equals(this.appCookiePersistenceProfile, applicationPersistenceProfile.appCookiePersistenceProfile) &&
        Objects.equals(this.description, applicationPersistenceProfile.description) &&
        Objects.equals(this.hdrPersistenceProfile, applicationPersistenceProfile.hdrPersistenceProfile) &&
        Objects.equals(this.httpCookiePersistenceProfile, applicationPersistenceProfile.httpCookiePersistenceProfile) &&
        Objects.equals(this.ipPersistenceProfile, applicationPersistenceProfile.ipPersistenceProfile) &&
        Objects.equals(this.isFederated, applicationPersistenceProfile.isFederated) &&
        Objects.equals(this.name, applicationPersistenceProfile.name) &&
        Objects.equals(this.persistenceType, applicationPersistenceProfile.persistenceType) &&
        Objects.equals(this.serverHmDownRecovery, applicationPersistenceProfile.serverHmDownRecovery) &&
        Objects.equals(this.tenantRef, applicationPersistenceProfile.tenantRef) &&
        Objects.equals(this.url, applicationPersistenceProfile.url) &&
        Objects.equals(this.uuid, applicationPersistenceProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, appCookiePersistenceProfile, description, hdrPersistenceProfile, httpCookiePersistenceProfile, ipPersistenceProfile, isFederated, name, persistenceType, serverHmDownRecovery, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationPersistenceProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    appCookiePersistenceProfile: ").append(toIndentedString(appCookiePersistenceProfile)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hdrPersistenceProfile: ").append(toIndentedString(hdrPersistenceProfile)).append("\n");
    sb.append("    httpCookiePersistenceProfile: ").append(toIndentedString(httpCookiePersistenceProfile)).append("\n");
    sb.append("    ipPersistenceProfile: ").append(toIndentedString(ipPersistenceProfile)).append("\n");
    sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    persistenceType: ").append(toIndentedString(persistenceType)).append("\n");
    sb.append("    serverHmDownRecovery: ").append(toIndentedString(serverHmDownRecovery)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

