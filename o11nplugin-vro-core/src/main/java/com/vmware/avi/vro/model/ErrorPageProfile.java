package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ErrorPageProfile is a POJO class extends AviRestResource that used for creating
 * ErrorPageProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ErrorPageProfile")
@VsoFinder(name = Constants.FINDER_VRO_ERRORPAGEPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ErrorPageProfile extends AviRestResource {
  @JsonProperty("app_name")
  @JsonInclude(Include.NON_NULL)
  private String appName = null;

  @JsonProperty("company_name")
  @JsonInclude(Include.NON_NULL)
  private String companyName = null;

  @JsonProperty("error_pages")
  @JsonInclude(Include.NON_NULL)
  private List<ErrorPage> errorPages = null;

  @JsonProperty("host_name")
  @JsonInclude(Include.NON_NULL)
  private String hostName = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the virtual service which generated the error page.
   * Field deprecated in 18.1.1.
   * Field introduced in 17.2.4.
   * @return appName
   */
  @VsoMethod
  public String getAppName() {
    return appName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the virtual service which generated the error page.
   * Field deprecated in 18.1.1.
   * Field introduced in 17.2.4.
   * @param appName set the appName.
   */
  @VsoMethod
  public void setAppName(String  appName) {
    this.appName = appName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the company to show in error page.
   * Field deprecated in 18.1.1.
   * Field introduced in 17.2.4.
   * @return companyName
   */
  @VsoMethod
  public String getCompanyName() {
    return companyName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the company to show in error page.
   * Field deprecated in 18.1.1.
   * Field introduced in 17.2.4.
   * @param companyName set the companyName.
   */
  @VsoMethod
  public void setCompanyName(String  companyName) {
    this.companyName = companyName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Defined error pages for http status codes.
   * Field introduced in 17.2.4.
   * @return errorPages
   */
  @VsoMethod
  public List<ErrorPage> getErrorPages() {
    return errorPages;
  }

  /**
   * This is the setter method. this will set the errorPages
   * Defined error pages for http status codes.
   * Field introduced in 17.2.4.
   * @return errorPages
   */
  @VsoMethod
  public void setErrorPages(List<ErrorPage>  errorPages) {
    this.errorPages = errorPages;
  }

  /**
   * This is the setter method this will set the errorPages
   * Defined error pages for http status codes.
   * Field introduced in 17.2.4.
   * @return errorPages
   */
  @VsoMethod
  public ErrorPageProfile addErrorPagesItem(ErrorPage errorPagesItem) {
    if (this.errorPages == null) {
      this.errorPages = new ArrayList<ErrorPage>();
    }
    this.errorPages.add(errorPagesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Fully qualified domain name for which the error page is generated.
   * Field deprecated in 18.1.1.
   * Field introduced in 17.2.4.
   * @return hostName
   */
  @VsoMethod
  public String getHostName() {
    return hostName;
  }

  /**
   * This is the setter method to the attribute.
   * Fully qualified domain name for which the error page is generated.
   * Field deprecated in 18.1.1.
   * Field introduced in 17.2.4.
   * @param hostName set the hostName.
   */
  @VsoMethod
  public void setHostName(String  hostName) {
    this.hostName = hostName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.4.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.4.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Field introduced in 17.2.4.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Field introduced in 17.2.4.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
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
   * Field introduced in 17.2.4.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.4.
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
  ErrorPageProfile objErrorPageProfile = (ErrorPageProfile) o;
  return   Objects.equals(this.appName, objErrorPageProfile.appName)&&
  Objects.equals(this.name, objErrorPageProfile.name)&&
  Objects.equals(this.errorPages, objErrorPageProfile.errorPages)&&
  Objects.equals(this.companyName, objErrorPageProfile.companyName)&&
  Objects.equals(this.hostName, objErrorPageProfile.hostName)&&
  Objects.equals(this.tenantRef, objErrorPageProfile.tenantRef)&&
  Objects.equals(this.uuid, objErrorPageProfile.uuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ErrorPageProfile {\n");
      sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    errorPages: ").append(toIndentedString(errorPages)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

