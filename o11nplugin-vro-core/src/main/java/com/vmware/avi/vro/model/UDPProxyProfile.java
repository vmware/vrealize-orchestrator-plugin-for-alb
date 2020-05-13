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
 * UDPProxyProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "UDPProxyProfile")
@VsoFinder(name = Constants.FINDER_VRO_UDPPROXYPROFILE, idAccessor = "getObjectID()")
@Service
public class UDPProxyProfile extends AviRestResource  {
  @JsonProperty("session_idle_timeout")
  private Integer sessionIdleTimeout = 10;

  
  /**
   * The amount of time (in sec) for which a flow needs to be idle before it is deleted. Allowed values are 2-3600. Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * @return sessionIdleTimeout
  **/
  @ApiModelProperty(value = "The amount of time (in sec) for which a flow needs to be idle before it is deleted. Allowed values are 2-3600. Field introduced in 17.2.8, 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public Integer getSessionIdleTimeout() {
    return sessionIdleTimeout;
  }
    
  @VsoMethod
  public void setSessionIdleTimeout(Integer sessionIdleTimeout) {
    this.sessionIdleTimeout = sessionIdleTimeout;
  }

  
  public String getObjectID() {
		return "UDPProxyProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UDPProxyProfile udPProxyProfile = (UDPProxyProfile) o;
    return Objects.equals(this.sessionIdleTimeout, udPProxyProfile.sessionIdleTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionIdleTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UDPProxyProfile {\n");
    
    sb.append("    sessionIdleTimeout: ").append(toIndentedString(sessionIdleTimeout)).append("\n");
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

