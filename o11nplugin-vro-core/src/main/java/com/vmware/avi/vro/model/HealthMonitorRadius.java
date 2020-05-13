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
 * HealthMonitorRadius
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HealthMonitorRadius")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORRADIUS, idAccessor = "getObjectID()")
@Service
public class HealthMonitorRadius extends AviRestResource  {
  @JsonProperty("password")
  private String password = null;

  @JsonProperty("shared_secret")
  private String sharedSecret = null;

  @JsonProperty("username")
  private String username = null;

  
  /**
   * Radius monitor will query Radius server with this password. Field introduced in 18.2.3.
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Radius monitor will query Radius server with this password. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * Radius monitor will query Radius server with this shared secret. Field introduced in 18.2.3.
   * @return sharedSecret
  **/
  @ApiModelProperty(required = true, value = "Radius monitor will query Radius server with this shared secret. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getSharedSecret() {
    return sharedSecret;
  }
    
  @VsoMethod
  public void setSharedSecret(String sharedSecret) {
    this.sharedSecret = sharedSecret;
  }

  
  /**
   * Radius monitor will query Radius server with this username. Field introduced in 18.2.3.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "Radius monitor will query Radius server with this username. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  public String getObjectID() {
		return "HealthMonitorRadius";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthMonitorRadius healthMonitorRadius = (HealthMonitorRadius) o;
    return Objects.equals(this.password, healthMonitorRadius.password) &&
        Objects.equals(this.sharedSecret, healthMonitorRadius.sharedSecret) &&
        Objects.equals(this.username, healthMonitorRadius.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, sharedSecret, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthMonitorRadius {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sharedSecret: ").append(toIndentedString(sharedSecret)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

