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
 * AuthorizationAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "AuthorizationAction")
@VsoFinder(name = Constants.FINDER_VRO_AUTHORIZATIONACTION, idAccessor = "getObjectID()")
@Service
public class AuthorizationAction extends AviRestResource  {
  @JsonProperty("status_code")
  private String statusCode = "HTTP_RESPONSE_STATUS_CODE_403";

  @JsonProperty("type")
  private String type = "ALLOW_ACCESS";

  
  /**
   * HTTP status code to use for local response when an policy rule is matched. Enum options - HTTP_RESPONSE_STATUS_CODE_403. Field introduced in 18.2.5.
   * @return statusCode
  **/
  @ApiModelProperty(value = "HTTP status code to use for local response when an policy rule is matched. Enum options - HTTP_RESPONSE_STATUS_CODE_403. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getStatusCode() {
    return statusCode;
  }
    
  @VsoMethod
  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  
  /**
   * Defines the action taken when an authorization policy rule is matched.By default, access is allowed to the requested resource. Enum options - ALLOW_ACCESS, CLOSE_CONNECTION, HTTP_LOCAL_RESPONSE. Field introduced in 18.2.5.
   * @return type
  **/
  @ApiModelProperty(value = "Defines the action taken when an authorization policy rule is matched.By default, access is allowed to the requested resource. Enum options - ALLOW_ACCESS, CLOSE_CONNECTION, HTTP_LOCAL_RESPONSE. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "AuthorizationAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationAction authorizationAction = (AuthorizationAction) o;
    return Objects.equals(this.statusCode, authorizationAction.statusCode) &&
        Objects.equals(this.type, authorizationAction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationAction {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

