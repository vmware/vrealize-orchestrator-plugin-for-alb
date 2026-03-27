package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TokenRefillRate;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The RateLimitConfiguration is a POJO class extends AviRestResource that used for creating
 * RateLimitConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RateLimitConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_RATELIMITCONFIGURATION, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RateLimitConfiguration extends AviRestResource {
    @JsonProperty("burst")
    @JsonInclude(Include.NON_NULL)
    private Integer burst = 1;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("http_methods")
    @JsonInclude(Include.NON_NULL)
    private List<String> httpMethods;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("resource")
    @JsonInclude(Include.NON_NULL)
    private String resource;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("token_refill_rate")
    @JsonInclude(Include.NON_NULL)
    private TokenRefillRate tokenRefillRate;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = "RATE_LIMITER_API_CATEGORY";

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * The maximum request per second(rps) user intends to support for this category.this is not guaranteed as this will be the minimum of the rps
   * supported by the resources in the category and this value.if user doesn't provide then it will be minimum value of the resources in this category.
   * Allowed values are 1-1000.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return burst
   */
  @VsoMethod
  public Integer getBurst() {
    return burst;
  }

  /**
   * This is the setter method to the attribute.
   * The maximum request per second(rps) user intends to support for this category.this is not guaranteed as this will be the minimum of the rps
   * supported by the resources in the category and this value.if user doesn't provide then it will be minimum value of the resources in this category.
   * Allowed values are 1-1000.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param burst set the burst.
   */
  @VsoMethod
  public void setBurst(Integer  burst) {
    this.burst = burst;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Description for the rate limit configuration.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Description for the rate limit configuration.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of http method(s) of the resources that need to be rate limited.
   * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
   * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
   * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
   * Field introduced in 31.2.1.
   * Minimum of 1 items required.
   * Maximum of 5 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpMethods
   */
  @VsoMethod
  public List<String> getHttpMethods() {
    return httpMethods;
  }

  /**
   * This is the setter method. this will set the httpMethods
   * List of http method(s) of the resources that need to be rate limited.
   * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
   * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
   * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
   * Field introduced in 31.2.1.
   * Minimum of 1 items required.
   * Maximum of 5 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpMethods
   */
  @VsoMethod
  public void setHttpMethods(List<String>  httpMethods) {
    this.httpMethods = httpMethods;
  }

  /**
   * This is the setter method this will set the httpMethods
   * List of http method(s) of the resources that need to be rate limited.
   * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
   * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
   * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
   * Field introduced in 31.2.1.
   * Minimum of 1 items required.
   * Maximum of 5 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpMethods
   */
  @VsoMethod
  public RateLimitConfiguration addHttpMethodsItem(String httpMethodsItem) {
    if (this.httpMethods == null) {
      this.httpMethods = new ArrayList<String>();
    }
    this.httpMethods.add(httpMethodsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the rate limit configuration(unique).
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the rate limit configuration(unique).
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ratelimitresource which needs to be rate limited.
   * Enum options - RATE_LIMIT_VIRTUALSERVICE, RATE_LIMIT_POOL, RATE_LIMIT_LOGIN, RATE_LIMIT_AUTHTOKEN, RATE_LIMIT_HEALTHMONITOR.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resource
   */
  @VsoMethod
  public String getResource() {
    return resource;
  }

  /**
   * This is the setter method to the attribute.
   * Ratelimitresource which needs to be rate limited.
   * Enum options - RATE_LIMIT_VIRTUALSERVICE, RATE_LIMIT_POOL, RATE_LIMIT_LOGIN, RATE_LIMIT_AUTHTOKEN, RATE_LIMIT_HEALTHMONITOR.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resource set the resource.
   */
  @VsoMethod
  public void setResource(String  resource) {
    this.resource = resource;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant ref for the auth rate limit configuration.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant ref for the auth rate limit configuration.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Token refill rate.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tokenRefillRate
   */
  @VsoMethod
  public TokenRefillRate getTokenRefillRate() {
    return tokenRefillRate;
  }

  /**
   * This is the setter method to the attribute.
   * Token refill rate.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tokenRefillRate set the tokenRefillRate.
   */
  @VsoMethod
  public void setTokenRefillRate(TokenRefillRate tokenRefillRate) {
    this.tokenRefillRate = tokenRefillRate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of the rate limiter, for now we only support api categorization based.
   * Enum options - RATE_LIMITER_API_CATEGORY.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "RATE_LIMITER_API_CATEGORY".
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the rate limiter, for now we only support api categorization based.
   * Enum options - RATE_LIMITER_API_CATEGORY.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "RATE_LIMITER_API_CATEGORY".
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
   * Uuid of the rate limit configuration.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the rate limit configuration.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
  RateLimitConfiguration objRateLimitConfiguration = (RateLimitConfiguration) o;
  return   Objects.equals(this.uuid, objRateLimitConfiguration.uuid)&&
  Objects.equals(this.name, objRateLimitConfiguration.name)&&
  Objects.equals(this.description, objRateLimitConfiguration.description)&&
  Objects.equals(this.type, objRateLimitConfiguration.type)&&
  Objects.equals(this.httpMethods, objRateLimitConfiguration.httpMethods)&&
  Objects.equals(this.resource, objRateLimitConfiguration.resource)&&
  Objects.equals(this.burst, objRateLimitConfiguration.burst)&&
  Objects.equals(this.tokenRefillRate, objRateLimitConfiguration.tokenRefillRate)&&
  Objects.equals(this.tenantRef, objRateLimitConfiguration.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RateLimitConfiguration {\n");
      sb.append("    burst: ").append(toIndentedString(burst)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    httpMethods: ").append(toIndentedString(httpMethods)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    tokenRefillRate: ").append(toIndentedString(tokenRefillRate)).append("\n");
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

