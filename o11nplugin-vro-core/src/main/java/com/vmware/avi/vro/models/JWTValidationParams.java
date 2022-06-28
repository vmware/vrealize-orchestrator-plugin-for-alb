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
 * The JWTValidationParams is a POJO class extends AviRestResource that used for creating
 * JWTValidationParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "JWTValidationParams")
@VsoFinder(name = Constants.FINDER_VRO_JWTVALIDATIONPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class JWTValidationParams extends AviRestResource {
    @JsonProperty("audience")
    @JsonInclude(Include.NON_NULL)
    private String audience = null;



  /**
   * This is the getter method this will return the attribute value.
   * Audience parameter used for validation using jwt token.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return audience
   */
  @VsoMethod
  public String getAudience() {
    return audience;
  }

  /**
   * This is the setter method to the attribute.
   * Audience parameter used for validation using jwt token.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param audience set the audience.
   */
  @VsoMethod
  public void setAudience(String  audience) {
    this.audience = audience;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  JWTValidationParams objJWTValidationParams = (JWTValidationParams) o;
  return   Objects.equals(this.audience, objJWTValidationParams.audience);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class JWTValidationParams {\n");
      sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
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

