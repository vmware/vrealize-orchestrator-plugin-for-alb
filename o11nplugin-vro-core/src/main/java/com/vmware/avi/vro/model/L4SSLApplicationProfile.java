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
 * The L4SSLApplicationProfile is a POJO class extends AviRestResource that used for creating
 * L4SSLApplicationProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "L4SSLApplicationProfile")
@VsoFinder(name = Constants.FINDER_VRO_L4SSLAPPLICATIONPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class L4SSLApplicationProfile extends AviRestResource {
    @JsonProperty("ssl_stream_idle_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer sslStreamIdleTimeout = 3600;



  /**
   * This is the getter method this will return the attribute value.
   * L4 stream idle connection timeout in seconds.
   * Allowed values are 60-86400.
   * Field introduced in 22.1.2.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3600.
   * @return sslStreamIdleTimeout
   */
  @VsoMethod
  public Integer getSslStreamIdleTimeout() {
    return sslStreamIdleTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * L4 stream idle connection timeout in seconds.
   * Allowed values are 60-86400.
   * Field introduced in 22.1.2.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3600.
   * @param sslStreamIdleTimeout set the sslStreamIdleTimeout.
   */
  @VsoMethod
  public void setSslStreamIdleTimeout(Integer  sslStreamIdleTimeout) {
    this.sslStreamIdleTimeout = sslStreamIdleTimeout;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  L4SSLApplicationProfile objL4SSLApplicationProfile = (L4SSLApplicationProfile) o;
  return   Objects.equals(this.sslStreamIdleTimeout, objL4SSLApplicationProfile.sslStreamIdleTimeout);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class L4SSLApplicationProfile {\n");
      sb.append("    sslStreamIdleTimeout: ").append(toIndentedString(sslStreamIdleTimeout)).append("\n");
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

