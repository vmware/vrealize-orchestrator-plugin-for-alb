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
 * AlertEmailConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AlertEmailConfig")
@VsoFinder(name = Constants.FINDER_VRO_ALERTEMAILCONFIG, idAccessor = "getObjectID()")
@Service
public class AlertEmailConfig extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cc_emails")
  private String ccEmails = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("to_emails")
  private String toEmails = null;

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
   * Alerts are copied to the comma separated list of  email recipients.
   * @return ccEmails
  **/
  @ApiModelProperty(value = "Alerts are copied to the comma separated list of  email recipients.")


 
  @VsoMethod  
  public String getCcEmails() {
    return ccEmails;
  }
    
  @VsoMethod
  public void setCcEmails(String ccEmails) {
    this.ccEmails = ccEmails;
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
   * A user-friendly name of the email notification service.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A user-friendly name of the email notification service.")
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
   * Alerts are sent to the comma separated list of  email recipients.
   * @return toEmails
  **/
  @ApiModelProperty(required = true, value = "Alerts are sent to the comma separated list of  email recipients.")
  @NotNull


 
  @VsoMethod  
  public String getToEmails() {
    return toEmails;
  }
    
  @VsoMethod
  public void setToEmails(String toEmails) {
    this.toEmails = toEmails;
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
		return "AlertEmailConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertEmailConfig alertEmailConfig = (AlertEmailConfig) o;
    return Objects.equals(this.lastModified, alertEmailConfig.lastModified) &&
        Objects.equals(this.ccEmails, alertEmailConfig.ccEmails) &&
        Objects.equals(this.description, alertEmailConfig.description) &&
        Objects.equals(this.name, alertEmailConfig.name) &&
        Objects.equals(this.tenantRef, alertEmailConfig.tenantRef) &&
        Objects.equals(this.toEmails, alertEmailConfig.toEmails) &&
        Objects.equals(this.url, alertEmailConfig.url) &&
        Objects.equals(this.uuid, alertEmailConfig.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, ccEmails, description, name, tenantRef, toEmails, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertEmailConfig {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    ccEmails: ").append(toIndentedString(ccEmails)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    toEmails: ").append(toIndentedString(toEmails)).append("\n");
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

