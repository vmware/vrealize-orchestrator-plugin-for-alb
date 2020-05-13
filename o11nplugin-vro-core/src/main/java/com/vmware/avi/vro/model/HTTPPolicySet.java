package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPRequestPolicy;
import com.vmware.avi.vro.model.HTTPResponsePolicy;
import com.vmware.avi.vro.model.HTTPSecurityPolicy;
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
 * HTTPPolicySet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPPolicySet")
@VsoFinder(name = Constants.FINDER_VRO_HTTPPOLICYSET, idAccessor = "getObjectID()")
@Service
public class HTTPPolicySet extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cloud_config_cksum")
  private String cloudConfigCksum = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("http_request_policy")
  private HTTPRequestPolicy httpRequestPolicy = null;

  @JsonProperty("http_response_policy")
  private HTTPResponsePolicy httpResponsePolicy = null;

  @JsonProperty("http_security_policy")
  private HTTPSecurityPolicy httpSecurityPolicy = null;

  @JsonProperty("is_internal_policy")
  private Boolean isInternalPolicy = null;

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
   * Checksum of cloud configuration for Pool. Internally set by cloud connector.
   * @return cloudConfigCksum
  **/
  @ApiModelProperty(value = "Checksum of cloud configuration for Pool. Internally set by cloud connector.")


 
  @VsoMethod  
  public String getCloudConfigCksum() {
    return cloudConfigCksum;
  }
    
  @VsoMethod
  public void setCloudConfigCksum(String cloudConfigCksum) {
    this.cloudConfigCksum = cloudConfigCksum;
  }

  
  /**
   * Creator name.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator name.")


 
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
   * HTTP request policy for the virtual service.
   * @return httpRequestPolicy
  **/
  @ApiModelProperty(value = "HTTP request policy for the virtual service.")

  @Valid

 
  @VsoMethod  
  public HTTPRequestPolicy getHttpRequestPolicy() {
    return httpRequestPolicy;
  }
    
  @VsoMethod
  public void setHttpRequestPolicy(HTTPRequestPolicy httpRequestPolicy) {
    this.httpRequestPolicy = httpRequestPolicy;
  }

  
  /**
   * HTTP response policy for the virtual service.
   * @return httpResponsePolicy
  **/
  @ApiModelProperty(value = "HTTP response policy for the virtual service.")

  @Valid

 
  @VsoMethod  
  public HTTPResponsePolicy getHttpResponsePolicy() {
    return httpResponsePolicy;
  }
    
  @VsoMethod
  public void setHttpResponsePolicy(HTTPResponsePolicy httpResponsePolicy) {
    this.httpResponsePolicy = httpResponsePolicy;
  }

  
  /**
   * HTTP security policy for the virtual service.
   * @return httpSecurityPolicy
  **/
  @ApiModelProperty(value = "HTTP security policy for the virtual service.")

  @Valid

 
  @VsoMethod  
  public HTTPSecurityPolicy getHttpSecurityPolicy() {
    return httpSecurityPolicy;
  }
    
  @VsoMethod
  public void setHttpSecurityPolicy(HTTPSecurityPolicy httpSecurityPolicy) {
    this.httpSecurityPolicy = httpSecurityPolicy;
  }

  
  /**
   * Placeholder for description of property is_internal_policy of obj type HTTPPolicySet field type str  type boolean
   * @return isInternalPolicy
  **/
  @ApiModelProperty(value = "Placeholder for description of property is_internal_policy of obj type HTTPPolicySet field type str  type boolean")


 
  @VsoMethod  
  public Boolean isIsInternalPolicy() {
    return isInternalPolicy;
  }
    
  @VsoMethod
  public void setIsInternalPolicy(Boolean isInternalPolicy) {
    this.isInternalPolicy = isInternalPolicy;
  }

  
  /**
   * Name of the HTTP Policy Set.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the HTTP Policy Set.")
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
   * UUID of the HTTP Policy Set.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the HTTP Policy Set.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "HTTPPolicySet";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPPolicySet htTPPolicySet = (HTTPPolicySet) o;
    return Objects.equals(this.lastModified, htTPPolicySet.lastModified) &&
        Objects.equals(this.cloudConfigCksum, htTPPolicySet.cloudConfigCksum) &&
        Objects.equals(this.createdBy, htTPPolicySet.createdBy) &&
        Objects.equals(this.description, htTPPolicySet.description) &&
        Objects.equals(this.httpRequestPolicy, htTPPolicySet.httpRequestPolicy) &&
        Objects.equals(this.httpResponsePolicy, htTPPolicySet.httpResponsePolicy) &&
        Objects.equals(this.httpSecurityPolicy, htTPPolicySet.httpSecurityPolicy) &&
        Objects.equals(this.isInternalPolicy, htTPPolicySet.isInternalPolicy) &&
        Objects.equals(this.name, htTPPolicySet.name) &&
        Objects.equals(this.tenantRef, htTPPolicySet.tenantRef) &&
        Objects.equals(this.url, htTPPolicySet.url) &&
        Objects.equals(this.uuid, htTPPolicySet.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, cloudConfigCksum, createdBy, description, httpRequestPolicy, httpResponsePolicy, httpSecurityPolicy, isInternalPolicy, name, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPPolicySet {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    httpRequestPolicy: ").append(toIndentedString(httpRequestPolicy)).append("\n");
    sb.append("    httpResponsePolicy: ").append(toIndentedString(httpResponsePolicy)).append("\n");
    sb.append("    httpSecurityPolicy: ").append(toIndentedString(httpSecurityPolicy)).append("\n");
    sb.append("    isInternalPolicy: ").append(toIndentedString(isInternalPolicy)).append("\n");
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

