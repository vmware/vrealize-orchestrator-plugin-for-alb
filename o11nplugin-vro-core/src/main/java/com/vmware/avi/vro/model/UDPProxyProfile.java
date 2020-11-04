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
 * The UDPProxyProfile is a POJO class extends AviRestResource that used for creating
 * UDPProxyProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UDPProxyProfile")
@VsoFinder(name = Constants.FINDER_VRO_UDPPROXYPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UDPProxyProfile extends AviRestResource {
    @JsonProperty("session_idle_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer sessionIdleTimeout = 10;



  /**
   * This is the getter method this will return the attribute value.
   * The amount of time (in sec) for which a flow needs to be idle before it is deleted.
   * Allowed values are 2-3600.
   * Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return sessionIdleTimeout
   */
  @VsoMethod
  public Integer getSessionIdleTimeout() {
    return sessionIdleTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * The amount of time (in sec) for which a flow needs to be idle before it is deleted.
   * Allowed values are 2-3600.
   * Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * Unit is sec.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param sessionIdleTimeout set the sessionIdleTimeout.
   */
  @VsoMethod
  public void setSessionIdleTimeout(Integer  sessionIdleTimeout) {
    this.sessionIdleTimeout = sessionIdleTimeout;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  UDPProxyProfile objUDPProxyProfile = (UDPProxyProfile) o;
  return   Objects.equals(this.sessionIdleTimeout, objUDPProxyProfile.sessionIdleTimeout);
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

