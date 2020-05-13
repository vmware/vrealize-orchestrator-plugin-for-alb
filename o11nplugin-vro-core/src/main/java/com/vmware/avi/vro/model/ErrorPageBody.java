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
 * ErrorPageBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ErrorPageBody")
@VsoFinder(name = Constants.FINDER_VRO_ERRORPAGEBODY, idAccessor = "getObjectID()")
@Service
public class ErrorPageBody extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("error_page_body")
  private String errorPageBody = null;

  @JsonProperty("format")
  private String format = "ERROR_PAGE_FORMAT_HTML";

  @JsonProperty("name")
  private String name = null;

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
   * Error page body sent to client when match. Field introduced in 17.2.4.
   * @return errorPageBody
  **/
  @ApiModelProperty(value = "Error page body sent to client when match. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public String getErrorPageBody() {
    return errorPageBody;
  }
    
  @VsoMethod
  public void setErrorPageBody(String errorPageBody) {
    this.errorPageBody = errorPageBody;
  }

  
  /**
   * Format of an error page body HTML or JSON. Enum options - ERROR_PAGE_FORMAT_HTML, ERROR_PAGE_FORMAT_JSON. Field introduced in 18.2.3.
   * @return format
  **/
  @ApiModelProperty(value = "Format of an error page body HTML or JSON. Enum options - ERROR_PAGE_FORMAT_HTML, ERROR_PAGE_FORMAT_JSON. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getFormat() {
    return format;
  }
    
  @VsoMethod
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   *  Field introduced in 17.2.4.
   * @return name
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 17.2.4.")
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
   *  It is a reference to an object of type Tenant. Field introduced in 17.2.4.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 17.2.4.")


 
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
   *  Field introduced in 17.2.4.
   * @return uuid
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.4.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "ErrorPageBody";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorPageBody errorPageBody = (ErrorPageBody) o;
    return Objects.equals(this.lastModified, errorPageBody.lastModified) &&
        Objects.equals(this.errorPageBody, errorPageBody.errorPageBody) &&
        Objects.equals(this.format, errorPageBody.format) &&
        Objects.equals(this.name, errorPageBody.name) &&
        Objects.equals(this.tenantRef, errorPageBody.tenantRef) &&
        Objects.equals(this.url, errorPageBody.url) &&
        Objects.equals(this.uuid, errorPageBody.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, errorPageBody, format, name, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorPageBody {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    errorPageBody: ").append(toIndentedString(errorPageBody)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

