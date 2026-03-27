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
 * The JWTValidationVsConfig is a POJO class extends AviRestResource that used for creating
 * JWTValidationVsConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "JWTValidationVsConfig")
@VsoFinder(name = Constants.FINDER_VRO_JWTVALIDATIONVSCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class JWTValidationVsConfig extends AviRestResource {
    @JsonProperty("audience")
    @JsonInclude(Include.NON_NULL)
    private String audience;

    @JsonProperty("jwt_location")
    @JsonInclude(Include.NON_NULL)
    private String jwtLocation = "JWT_LOCATION_AUTHORIZATION_HEADER";

    @JsonProperty("jwt_name")
    @JsonInclude(Include.NON_NULL)
    private String jwtName;

    @JsonProperty("protected_resource")
    @JsonInclude(Include.NON_NULL)
    private String protectedResource;

    @JsonProperty("protected_resource_name")
    @JsonInclude(Include.NON_NULL)
    private String protectedResourceName;



  /**
   * This is the getter method this will return the attribute value.
   * Uniquely identifies a resource server.
   * This is used to validate against the aud claim.
   * Field introduced in 20.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return audience
   */
  @VsoMethod
  public String getAudience() {
    return audience;
  }

  /**
   * This is the setter method to the attribute.
   * Uniquely identifies a resource server.
   * This is used to validate against the aud claim.
   * Field introduced in 20.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param audience set the audience.
   */
  @VsoMethod
  public void setAudience(String  audience) {
    this.audience = audience;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Defines where to look for jwt in the request.
   * Enum options - JWT_LOCATION_AUTHORIZATION_HEADER, JWT_LOCATION_QUERY_PARAM.
   * Field introduced in 20.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "JWT_LOCATION_AUTHORIZATION_HEADER".
   * @return jwtLocation
   */
  @VsoMethod
  public String getJwtLocation() {
    return jwtLocation;
  }

  /**
   * This is the setter method to the attribute.
   * Defines where to look for jwt in the request.
   * Enum options - JWT_LOCATION_AUTHORIZATION_HEADER, JWT_LOCATION_QUERY_PARAM.
   * Field introduced in 20.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "JWT_LOCATION_AUTHORIZATION_HEADER".
   * @param jwtLocation set the jwtLocation.
   */
  @VsoMethod
  public void setJwtLocation(String  jwtLocation) {
    this.jwtLocation = jwtLocation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name by which the jwt can be identified if the token is sent as a query param in the request url.
   * Field introduced in 20.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwtName
   */
  @VsoMethod
  public String getJwtName() {
    return jwtName;
  }

  /**
   * This is the setter method to the attribute.
   * Name by which the jwt can be identified if the token is sent as a query param in the request url.
   * Field introduced in 20.1.3.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param jwtName set the jwtName.
   */
  @VsoMethod
  public void setJwtName(String  jwtName) {
    this.jwtName = jwtName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The protected resource identifier.
   * This is a url that uniquely identifies the protected resource.
   * Typically the base url of the api/service.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protectedResource
   */
  @VsoMethod
  public String getProtectedResource() {
    return protectedResource;
  }

  /**
   * This is the setter method to the attribute.
   * The protected resource identifier.
   * This is a url that uniquely identifies the protected resource.
   * Typically the base url of the api/service.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param protectedResource set the protectedResource.
   */
  @VsoMethod
  public void setProtectedResource(String  protectedResource) {
    this.protectedResource = protectedResource;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Human-readable name of the protected resource.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protectedResourceName
   */
  @VsoMethod
  public String getProtectedResourceName() {
    return protectedResourceName;
  }

  /**
   * This is the setter method to the attribute.
   * Human-readable name of the protected resource.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param protectedResourceName set the protectedResourceName.
   */
  @VsoMethod
  public void setProtectedResourceName(String  protectedResourceName) {
    this.protectedResourceName = protectedResourceName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  JWTValidationVsConfig objJWTValidationVsConfig = (JWTValidationVsConfig) o;
  return   Objects.equals(this.jwtLocation, objJWTValidationVsConfig.jwtLocation)&&
  Objects.equals(this.jwtName, objJWTValidationVsConfig.jwtName)&&
  Objects.equals(this.audience, objJWTValidationVsConfig.audience)&&
  Objects.equals(this.protectedResource, objJWTValidationVsConfig.protectedResource)&&
  Objects.equals(this.protectedResourceName, objJWTValidationVsConfig.protectedResourceName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class JWTValidationVsConfig {\n");
      sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
        sb.append("    jwtLocation: ").append(toIndentedString(jwtLocation)).append("\n");
        sb.append("    jwtName: ").append(toIndentedString(jwtName)).append("\n");
        sb.append("    protectedResource: ").append(toIndentedString(protectedResource)).append("\n");
        sb.append("    protectedResourceName: ").append(toIndentedString(protectedResourceName)).append("\n");
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

