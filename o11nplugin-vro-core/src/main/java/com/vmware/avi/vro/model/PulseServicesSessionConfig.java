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
 * The PulseServicesSessionConfig is a POJO class extends AviRestResource that used for creating
 * PulseServicesSessionConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PulseServicesSessionConfig")
@VsoFinder(name = Constants.FINDER_VRO_PULSESERVICESSESSIONCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PulseServicesSessionConfig extends AviRestResource {
    @JsonProperty("session_headers")
    @JsonInclude(Include.NON_NULL)
    private List<SessionHeaders> sessionHeaders = null;



  /**
   * This is the getter method this will return the attribute value.
   * Session headers.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sessionHeaders
   */
  @VsoMethod
  public List<SessionHeaders> getSessionHeaders() {
    return sessionHeaders;
  }

  /**
   * This is the setter method. this will set the sessionHeaders
   * Session headers.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sessionHeaders
   */
  @VsoMethod
  public void setSessionHeaders(List<SessionHeaders>  sessionHeaders) {
    this.sessionHeaders = sessionHeaders;
  }

  /**
   * This is the setter method this will set the sessionHeaders
   * Session headers.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sessionHeaders
   */
  @VsoMethod
  public PulseServicesSessionConfig addSessionHeadersItem(SessionHeaders sessionHeadersItem) {
    if (this.sessionHeaders == null) {
      this.sessionHeaders = new ArrayList<SessionHeaders>();
    }
    this.sessionHeaders.add(sessionHeadersItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PulseServicesSessionConfig objPulseServicesSessionConfig = (PulseServicesSessionConfig) o;
  return   Objects.equals(this.sessionHeaders, objPulseServicesSessionConfig.sessionHeaders);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PulseServicesSessionConfig {\n");
      sb.append("    sessionHeaders: ").append(toIndentedString(sessionHeaders)).append("\n");
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

