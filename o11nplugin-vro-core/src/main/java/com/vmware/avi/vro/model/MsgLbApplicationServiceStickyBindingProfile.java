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
 * The MsgLbApplicationServiceStickyBindingProfile is a POJO class extends AviRestResource that used for creating
 * MsgLbApplicationServiceStickyBindingProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MsgLbApplicationServiceStickyBindingProfile")
@VsoFinder(name = Constants.FINDER_VRO_MSGLBAPPLICATIONSERVICESTICKYBINDINGPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MsgLbApplicationServiceStickyBindingProfile extends AviRestResource {
    @JsonProperty("session_unbind_on_response")
    @JsonInclude(Include.NON_NULL)
    private Boolean sessionUnbindOnResponse = true;

    @JsonProperty("session_unbind_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer sessionUnbindTimeout = 30000;

    @JsonProperty("sticky_unbind_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer stickyUnbindTimeout = 0;



  /**
   * This is the getter method this will return the attribute value.
   * When true (default), a sticky-mode per-request/session binding is freed as soon as its matching response is received.
   * When false, the binding persists as a route-cache entry and is cleaned up after session_unbind_timeout milliseconds of inactivity.
   * Anchor bindings are unaffected regardless of this flag.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return sessionUnbindOnResponse
   */
  @VsoMethod
  public Boolean getSessionUnbindOnResponse() {
    return sessionUnbindOnResponse;
  }

  /**
   * This is the setter method to the attribute.
   * When true (default), a sticky-mode per-request/session binding is freed as soon as its matching response is received.
   * When false, the binding persists as a route-cache entry and is cleaned up after session_unbind_timeout milliseconds of inactivity.
   * Anchor bindings are unaffected regardless of this flag.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param sessionUnbindOnResponse set the sessionUnbindOnResponse.
   */
  @VsoMethod
  public void setSessionUnbindOnResponse(Boolean  sessionUnbindOnResponse) {
    this.sessionUnbindOnResponse = sessionUnbindOnResponse;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Idle timeout in milliseconds for per-request/session bindings in sticky mode.
   * When session_unbind_on_response is true (default), this acts as a hard deadline  the session binding is force-torn-down if no matching response
   * arrives within this window.
   * When session_unbind_on_response is false, this is the sliding idle timeout  the session binding persists after response and is freed after this
   * many milliseconds of inactivity.
   * Default 30000 ms.
   * Allowed values are 1-3600000.
   * Field introduced in 32.1.5.
   * Unit is milliseconds.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30000.
   * @return sessionUnbindTimeout
   */
  @VsoMethod
  public Integer getSessionUnbindTimeout() {
    return sessionUnbindTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Idle timeout in milliseconds for per-request/session bindings in sticky mode.
   * When session_unbind_on_response is true (default), this acts as a hard deadline  the session binding is force-torn-down if no matching response
   * arrives within this window.
   * When session_unbind_on_response is false, this is the sliding idle timeout  the session binding persists after response and is freed after this
   * many milliseconds of inactivity.
   * Default 30000 ms.
   * Allowed values are 1-3600000.
   * Field introduced in 32.1.5.
   * Unit is milliseconds.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30000.
   * @param sessionUnbindTimeout set the sessionUnbindTimeout.
   */
  @VsoMethod
  public void setSessionUnbindTimeout(Integer  sessionUnbindTimeout) {
    this.sessionUnbindTimeout = sessionUnbindTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Idle timeout in milliseconds for the sticky-mode anchor binding.
   * 0 (default)  anchor lives until the client connection closes.
   * Non-zero  anchor is torn down after this many milliseconds with no message forwarded in either direction; the idle timer resets on every request
   * or response.
   * Allowed values are 0-3600000.
   * Field introduced in 32.1.5.
   * Unit is milliseconds.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return stickyUnbindTimeout
   */
  @VsoMethod
  public Integer getStickyUnbindTimeout() {
    return stickyUnbindTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Idle timeout in milliseconds for the sticky-mode anchor binding.
   * 0 (default)  anchor lives until the client connection closes.
   * Non-zero  anchor is torn down after this many milliseconds with no message forwarded in either direction; the idle timer resets on every request
   * or response.
   * Allowed values are 0-3600000.
   * Field introduced in 32.1.5.
   * Unit is milliseconds.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param stickyUnbindTimeout set the stickyUnbindTimeout.
   */
  @VsoMethod
  public void setStickyUnbindTimeout(Integer  stickyUnbindTimeout) {
    this.stickyUnbindTimeout = stickyUnbindTimeout;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MsgLbApplicationServiceStickyBindingProfile objMsgLbApplicationServiceStickyBindingProfile = (MsgLbApplicationServiceStickyBindingProfile) o;
  return   Objects.equals(this.sessionUnbindTimeout, objMsgLbApplicationServiceStickyBindingProfile.sessionUnbindTimeout)&&
  Objects.equals(this.stickyUnbindTimeout, objMsgLbApplicationServiceStickyBindingProfile.stickyUnbindTimeout)&&
  Objects.equals(this.sessionUnbindOnResponse, objMsgLbApplicationServiceStickyBindingProfile.sessionUnbindOnResponse);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MsgLbApplicationServiceStickyBindingProfile {\n");
      sb.append("    sessionUnbindOnResponse: ").append(toIndentedString(sessionUnbindOnResponse)).append("\n");
        sb.append("    sessionUnbindTimeout: ").append(toIndentedString(sessionUnbindTimeout)).append("\n");
        sb.append("    stickyUnbindTimeout: ").append(toIndentedString(stickyUnbindTimeout)).append("\n");
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

