package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SSLRating;
import com.vmware.avi.vro.model.SSLVersion;
import com.vmware.avi.vro.model.Tag;
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
 * SSLProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SSLProfile")
@VsoFinder(name = Constants.FINDER_VRO_SSLPROFILE, idAccessor = "getObjectID()")
@Service
public class SSLProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("accepted_ciphers")
  private String acceptedCiphers = "AES:3DES:RC4";

  @JsonProperty("accepted_versions")
  @Valid
  private List<SSLVersion> acceptedVersions = null;

  @JsonProperty("cipher_enums")
  @Valid
  private List<String> cipherEnums = null;

  @JsonProperty("ciphersuites")
  private String ciphersuites = "TLS_AES_256_GCM_SHA384:TLS_CHACHA20_POLY1305_SHA256:TLS_AES_128_GCM_SHA256";

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dhparam")
  private String dhparam = null;

  @JsonProperty("enable_early_data")
  private Boolean enableEarlyData = null;

  @JsonProperty("enable_ssl_session_reuse")
  private Boolean enableSslSessionReuse = true;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("prefer_client_cipher_ordering")
  private Boolean preferClientCipherOrdering = null;

  @JsonProperty("send_close_notify")
  private Boolean sendCloseNotify = true;

  @JsonProperty("ssl_rating")
  private SSLRating sslRating = null;

  @JsonProperty("ssl_session_timeout")
  private Integer sslSessionTimeout = 86400;

  @JsonProperty("tags")
  @Valid
  private List<Tag> tags = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = "SSL_PROFILE_TYPE_APPLICATION";

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
   * Ciphers suites represented as defined by U(http //www.openssl.org/docs/apps/ciphers.html).
   * @return acceptedCiphers
  **/
  @ApiModelProperty(value = "Ciphers suites represented as defined by U(http //www.openssl.org/docs/apps/ciphers.html).")


 
  @VsoMethod  
  public String getAcceptedCiphers() {
    return acceptedCiphers;
  }
    
  @VsoMethod
  public void setAcceptedCiphers(String acceptedCiphers) {
    this.acceptedCiphers = acceptedCiphers;
  }

  
  public SSLProfile addAcceptedVersionsItem(SSLVersion acceptedVersionsItem) {
    if (this.acceptedVersions == null) {
      this.acceptedVersions = new ArrayList<SSLVersion>();
    }
    this.acceptedVersions.add(acceptedVersionsItem);
    return this;
  }
  
  /**
   * Set of versions accepted by the server.
   * @return acceptedVersions
  **/
  @ApiModelProperty(value = "Set of versions accepted by the server.")

  @Valid

 
  @VsoMethod  
  public List<SSLVersion> getAcceptedVersions() {
    return acceptedVersions;
  }
    
  @VsoMethod
  public void setAcceptedVersions(List<SSLVersion> acceptedVersions) {
    this.acceptedVersions = acceptedVersions;
  }

  
  public SSLProfile addCipherEnumsItem(String cipherEnumsItem) {
    if (this.cipherEnums == null) {
      this.cipherEnums = new ArrayList<String>();
    }
    this.cipherEnums.add(cipherEnumsItem);
    return this;
  }
  
  /**
   *  Enum options - TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_GCM_SHA384, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_3DES_EDE_CBC_SHA, TLS_AES_256_GCM_SHA384, TLS_CHACHA20_POLY1305_SHA256, TLS_AES_128_GCM_SHA256.
   * @return cipherEnums
  **/
  @ApiModelProperty(value = " Enum options - TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_GCM_SHA384, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_3DES_EDE_CBC_SHA, TLS_AES_256_GCM_SHA384, TLS_CHACHA20_POLY1305_SHA256, TLS_AES_128_GCM_SHA256.")


 
  @VsoMethod  
  public List<String> getCipherEnums() {
    return cipherEnums;
  }
    
  @VsoMethod
  public void setCipherEnums(List<String> cipherEnums) {
    this.cipherEnums = cipherEnums;
  }

  
  /**
   * TLS 1.3 Ciphers suites represented as defined by U(https //www.openssl.org/docs/manmaster/man1/ciphers.html). Field introduced in 18.2.6.
   * @return ciphersuites
  **/
  @ApiModelProperty(value = "TLS 1.3 Ciphers suites represented as defined by U(https //www.openssl.org/docs/manmaster/man1/ciphers.html). Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getCiphersuites() {
    return ciphersuites;
  }
    
  @VsoMethod
  public void setCiphersuites(String ciphersuites) {
    this.ciphersuites = ciphersuites;
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
   * DH Parameters used in SSL. At this time, it is not configurable and is set to 2048 bits.
   * @return dhparam
  **/
  @ApiModelProperty(value = "DH Parameters used in SSL. At this time, it is not configurable and is set to 2048 bits.")


 
  @VsoMethod  
  public String getDhparam() {
    return dhparam;
  }
    
  @VsoMethod
  public void setDhparam(String dhparam) {
    this.dhparam = dhparam;
  }

  
  /**
   * Enable early data processing for TLS1.3 connections. Field introduced in 18.2.6.
   * @return enableEarlyData
  **/
  @ApiModelProperty(value = "Enable early data processing for TLS1.3 connections. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isEnableEarlyData() {
    return enableEarlyData;
  }
    
  @VsoMethod
  public void setEnableEarlyData(Boolean enableEarlyData) {
    this.enableEarlyData = enableEarlyData;
  }

  
  /**
   * Enable SSL session re-use.
   * @return enableSslSessionReuse
  **/
  @ApiModelProperty(value = "Enable SSL session re-use.")


 
  @VsoMethod  
  public Boolean isEnableSslSessionReuse() {
    return enableSslSessionReuse;
  }
    
  @VsoMethod
  public void setEnableSslSessionReuse(Boolean enableSslSessionReuse) {
    this.enableSslSessionReuse = enableSslSessionReuse;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
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
   * Prefer the SSL cipher ordering presented by the client during the SSL handshake over the one specified in the SSL Profile.
   * @return preferClientCipherOrdering
  **/
  @ApiModelProperty(value = "Prefer the SSL cipher ordering presented by the client during the SSL handshake over the one specified in the SSL Profile.")


 
  @VsoMethod  
  public Boolean isPreferClientCipherOrdering() {
    return preferClientCipherOrdering;
  }
    
  @VsoMethod
  public void setPreferClientCipherOrdering(Boolean preferClientCipherOrdering) {
    this.preferClientCipherOrdering = preferClientCipherOrdering;
  }

  
  /**
   * Send 'close notify' alert message for a clean shutdown of the SSL connection.
   * @return sendCloseNotify
  **/
  @ApiModelProperty(value = "Send 'close notify' alert message for a clean shutdown of the SSL connection.")


 
  @VsoMethod  
  public Boolean isSendCloseNotify() {
    return sendCloseNotify;
  }
    
  @VsoMethod
  public void setSendCloseNotify(Boolean sendCloseNotify) {
    this.sendCloseNotify = sendCloseNotify;
  }

  
  /**
   * Placeholder for description of property ssl_rating of obj type SSLProfile field type str  type object
   * @return sslRating
  **/
  @ApiModelProperty(value = "Placeholder for description of property ssl_rating of obj type SSLProfile field type str  type object")

  @Valid

 
  @VsoMethod  
  public SSLRating getSslRating() {
    return sslRating;
  }
    
  @VsoMethod
  public void setSslRating(SSLRating sslRating) {
    this.sslRating = sslRating;
  }

  
  /**
   * The amount of time in seconds before an SSL session expires.
   * @return sslSessionTimeout
  **/
  @ApiModelProperty(value = "The amount of time in seconds before an SSL session expires.")


 
  @VsoMethod  
  public Integer getSslSessionTimeout() {
    return sslSessionTimeout;
  }
    
  @VsoMethod
  public void setSslSessionTimeout(Integer sslSessionTimeout) {
    this.sslSessionTimeout = sslSessionTimeout;
  }

  
  public SSLProfile addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property tags of obj type SSLProfile field type str  type object
   * @return tags
  **/
  @ApiModelProperty(value = "Placeholder for description of property tags of obj type SSLProfile field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<Tag> getTags() {
    return tags;
  }
    
  @VsoMethod
  public void setTags(List<Tag> tags) {
    this.tags = tags;
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
   * SSL Profile Type. Enum options - SSL_PROFILE_TYPE_APPLICATION, SSL_PROFILE_TYPE_SYSTEM. Field introduced in 17.2.8.
   * @return type
  **/
  @ApiModelProperty(value = "SSL Profile Type. Enum options - SSL_PROFILE_TYPE_APPLICATION, SSL_PROFILE_TYPE_SYSTEM. Field introduced in 17.2.8.")


 
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

  
  public String getObjectID() {
		return "SSLProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLProfile ssLProfile = (SSLProfile) o;
    return Objects.equals(this.lastModified, ssLProfile.lastModified) &&
        Objects.equals(this.acceptedCiphers, ssLProfile.acceptedCiphers) &&
        Objects.equals(this.acceptedVersions, ssLProfile.acceptedVersions) &&
        Objects.equals(this.cipherEnums, ssLProfile.cipherEnums) &&
        Objects.equals(this.ciphersuites, ssLProfile.ciphersuites) &&
        Objects.equals(this.description, ssLProfile.description) &&
        Objects.equals(this.dhparam, ssLProfile.dhparam) &&
        Objects.equals(this.enableEarlyData, ssLProfile.enableEarlyData) &&
        Objects.equals(this.enableSslSessionReuse, ssLProfile.enableSslSessionReuse) &&
        Objects.equals(this.name, ssLProfile.name) &&
        Objects.equals(this.preferClientCipherOrdering, ssLProfile.preferClientCipherOrdering) &&
        Objects.equals(this.sendCloseNotify, ssLProfile.sendCloseNotify) &&
        Objects.equals(this.sslRating, ssLProfile.sslRating) &&
        Objects.equals(this.sslSessionTimeout, ssLProfile.sslSessionTimeout) &&
        Objects.equals(this.tags, ssLProfile.tags) &&
        Objects.equals(this.tenantRef, ssLProfile.tenantRef) &&
        Objects.equals(this.type, ssLProfile.type) &&
        Objects.equals(this.url, ssLProfile.url) &&
        Objects.equals(this.uuid, ssLProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, acceptedCiphers, acceptedVersions, cipherEnums, ciphersuites, description, dhparam, enableEarlyData, enableSslSessionReuse, name, preferClientCipherOrdering, sendCloseNotify, sslRating, sslSessionTimeout, tags, tenantRef, type, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    acceptedCiphers: ").append(toIndentedString(acceptedCiphers)).append("\n");
    sb.append("    acceptedVersions: ").append(toIndentedString(acceptedVersions)).append("\n");
    sb.append("    cipherEnums: ").append(toIndentedString(cipherEnums)).append("\n");
    sb.append("    ciphersuites: ").append(toIndentedString(ciphersuites)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dhparam: ").append(toIndentedString(dhparam)).append("\n");
    sb.append("    enableEarlyData: ").append(toIndentedString(enableEarlyData)).append("\n");
    sb.append("    enableSslSessionReuse: ").append(toIndentedString(enableSslSessionReuse)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preferClientCipherOrdering: ").append(toIndentedString(preferClientCipherOrdering)).append("\n");
    sb.append("    sendCloseNotify: ").append(toIndentedString(sendCloseNotify)).append("\n");
    sb.append("    sslRating: ").append(toIndentedString(sslRating)).append("\n");
    sb.append("    sslSessionTimeout: ").append(toIndentedString(sslSessionTimeout)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

