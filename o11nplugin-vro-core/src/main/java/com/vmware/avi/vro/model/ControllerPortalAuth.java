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
 * ControllerPortalAuth
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ControllerPortalAuth")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERPORTALAUTH, idAccessor = "getObjectID()")
@Service
public class ControllerPortalAuth extends AviRestResource  {
  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("instance_url")
  private String instanceUrl = null;

  @JsonProperty("jwt_token")
  private String jwtToken = null;

  
  /**
   * Access Token to authenticate Customer Portal REST calls. Field introduced in 18.2.6.
   * @return accessToken
  **/
  @ApiModelProperty(value = "Access Token to authenticate Customer Portal REST calls. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getAccessToken() {
    return accessToken;
  }
    
  @VsoMethod
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  
  /**
   * Salesforce instance URL. Field introduced in 18.2.6.
   * @return instanceUrl
  **/
  @ApiModelProperty(value = "Salesforce instance URL. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getInstanceUrl() {
    return instanceUrl;
  }
    
  @VsoMethod
  public void setInstanceUrl(String instanceUrl) {
    this.instanceUrl = instanceUrl;
  }

  
  /**
   * Signed JWT to refresh the access token. Field introduced in 18.2.6.
   * @return jwtToken
  **/
  @ApiModelProperty(value = "Signed JWT to refresh the access token. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getJwtToken() {
    return jwtToken;
  }
    
  @VsoMethod
  public void setJwtToken(String jwtToken) {
    this.jwtToken = jwtToken;
  }

  
  public String getObjectID() {
		return "ControllerPortalAuth";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerPortalAuth controllerPortalAuth = (ControllerPortalAuth) o;
    return Objects.equals(this.accessToken, controllerPortalAuth.accessToken) &&
        Objects.equals(this.instanceUrl, controllerPortalAuth.instanceUrl) &&
        Objects.equals(this.jwtToken, controllerPortalAuth.jwtToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, instanceUrl, jwtToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerPortalAuth {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    instanceUrl: ").append(toIndentedString(instanceUrl)).append("\n");
    sb.append("    jwtToken: ").append(toIndentedString(jwtToken)).append("\n");
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

