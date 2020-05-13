package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ErrorPage;
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
 * ErrorPageProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ErrorPageProfile")
@VsoFinder(name = Constants.FINDER_VRO_ERRORPAGEPROFILE, idAccessor = "getObjectID()")
@Service
public class ErrorPageProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("app_name")
  private String appName = null;

  @JsonProperty("company_name")
  private String companyName = null;

  @JsonProperty("error_pages")
  @Valid
  private List<ErrorPage> errorPages = null;

  @JsonProperty("host_name")
  private String hostName = null;

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
   * Name of the Virtual Service which generated the error page. Field deprecated in 18.1.1. Field introduced in 17.2.4.
   * @return appName
  **/
  @ApiModelProperty(value = "Name of the Virtual Service which generated the error page. Field deprecated in 18.1.1. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public String getAppName() {
    return appName;
  }
    
  @VsoMethod
  public void setAppName(String appName) {
    this.appName = appName;
  }

  
  /**
   * Name of the company to show in error page. Field deprecated in 18.1.1. Field introduced in 17.2.4.
   * @return companyName
  **/
  @ApiModelProperty(value = "Name of the company to show in error page. Field deprecated in 18.1.1. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public String getCompanyName() {
    return companyName;
  }
    
  @VsoMethod
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  
  public ErrorPageProfile addErrorPagesItem(ErrorPage errorPagesItem) {
    if (this.errorPages == null) {
      this.errorPages = new ArrayList<ErrorPage>();
    }
    this.errorPages.add(errorPagesItem);
    return this;
  }
  
  /**
   * Defined Error Pages for HTTP status codes. Field introduced in 17.2.4.
   * @return errorPages
  **/
  @ApiModelProperty(value = "Defined Error Pages for HTTP status codes. Field introduced in 17.2.4.")

  @Valid

 
  @VsoMethod  
  public List<ErrorPage> getErrorPages() {
    return errorPages;
  }
    
  @VsoMethod
  public void setErrorPages(List<ErrorPage> errorPages) {
    this.errorPages = errorPages;
  }

  
  /**
   * Fully qualified domain name for which the error page is generated. Field deprecated in 18.1.1. Field introduced in 17.2.4.
   * @return hostName
  **/
  @ApiModelProperty(value = "Fully qualified domain name for which the error page is generated. Field deprecated in 18.1.1. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public String getHostName() {
    return hostName;
  }
    
  @VsoMethod
  public void setHostName(String hostName) {
    this.hostName = hostName;
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
		return "ErrorPageProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorPageProfile errorPageProfile = (ErrorPageProfile) o;
    return Objects.equals(this.lastModified, errorPageProfile.lastModified) &&
        Objects.equals(this.appName, errorPageProfile.appName) &&
        Objects.equals(this.companyName, errorPageProfile.companyName) &&
        Objects.equals(this.errorPages, errorPageProfile.errorPages) &&
        Objects.equals(this.hostName, errorPageProfile.hostName) &&
        Objects.equals(this.name, errorPageProfile.name) &&
        Objects.equals(this.tenantRef, errorPageProfile.tenantRef) &&
        Objects.equals(this.url, errorPageProfile.url) &&
        Objects.equals(this.uuid, errorPageProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, appName, companyName, errorPages, hostName, name, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorPageProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    errorPages: ").append(toIndentedString(errorPages)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
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

