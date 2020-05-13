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
 * Webhook
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "Webhook")
@VsoFinder(name = Constants.FINDER_VRO_WEBHOOK, idAccessor = "getObjectID()")
@Service
public class Webhook extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("callback_url")
  private String callbackUrl = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("verification_token")
  private String verificationToken = null;

  
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
   * Callback URL for the Webhook. Field introduced in 17.1.1.
   * @return callbackUrl
  **/
  @ApiModelProperty(value = "Callback URL for the Webhook. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getCallbackUrl() {
    return callbackUrl;
  }
    
  @VsoMethod
  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  
  /**
   *  Field introduced in 17.1.1.
   * @return description
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The name of the webhook profile. Field introduced in 17.1.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the webhook profile. Field introduced in 17.1.1.")
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
   *  It is a reference to an object of type Tenant. Field introduced in 17.1.1.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 17.1.1.")


 
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
   * UUID of the webhook profile. Field introduced in 17.1.1.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the webhook profile. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * Verification token sent back with the callback asquery parameters. Field introduced in 17.1.1.
   * @return verificationToken
  **/
  @ApiModelProperty(value = "Verification token sent back with the callback asquery parameters. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getVerificationToken() {
    return verificationToken;
  }
    
  @VsoMethod
  public void setVerificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
  }

  
  public String getObjectID() {
		return "Webhook";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.lastModified, webhook.lastModified) &&
        Objects.equals(this.callbackUrl, webhook.callbackUrl) &&
        Objects.equals(this.description, webhook.description) &&
        Objects.equals(this.name, webhook.name) &&
        Objects.equals(this.tenantRef, webhook.tenantRef) &&
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.uuid, webhook.uuid) &&
        Objects.equals(this.verificationToken, webhook.verificationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, callbackUrl, description, name, tenantRef, url, uuid, verificationToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    verificationToken: ").append(toIndentedString(verificationToken)).append("\n");
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

