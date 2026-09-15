package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.MsgLbApplicationServiceStickyBindingProfile;
import com.vmware.avi.vro.model.MsgLbApplicationServiceTransactionBindingProfile;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The MsgLbApplicationServiceProfile is a POJO class extends AviRestResource that used for creating
 * MsgLbApplicationServiceProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MsgLbApplicationServiceProfile")
@VsoFinder(name = Constants.FINDER_VRO_MSGLBAPPLICATIONSERVICEPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MsgLbApplicationServiceProfile extends AviRestResource {
    @JsonProperty("max_tcp_conn_per_client_per_server")
    @JsonInclude(Include.NON_NULL)
    private Integer maxTcpConnPerClientPerServer = 1;

    @JsonProperty("session_binding_mode")
    @JsonInclude(Include.NON_NULL)
    private String sessionBindingMode = "MSG_LB_SESSION_BINDING_MODE_STICKY";

    @JsonProperty("sticky_binding_profile")
    @JsonInclude(Include.NON_NULL)
    private MsgLbApplicationServiceStickyBindingProfile stickyBindingProfile;

    @JsonProperty("transaction_binding_profile")
    @JsonInclude(Include.NON_NULL)
    private MsgLbApplicationServiceTransactionBindingProfile transactionBindingProfile;



  /**
   * This is the getter method this will return the attribute value.
   * Cap on distinct server tcp connections a single client connection may open per backend member for l4 message-level lb.
   * 0 = unlimited; valid limit range is 1-65535.
   * Allowed values are 0-65535.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return maxTcpConnPerClientPerServer
   */
  @VsoMethod
  public Integer getMaxTcpConnPerClientPerServer() {
    return maxTcpConnPerClientPerServer;
  }

  /**
   * This is the setter method to the attribute.
   * Cap on distinct server tcp connections a single client connection may open per backend member for l4 message-level lb.
   * 0 = unlimited; valid limit range is 1-65535.
   * Allowed values are 0-65535.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param maxTcpConnPerClientPerServer set the maxTcpConnPerClientPerServer.
   */
  @VsoMethod
  public void setMaxTcpConnPerClientPerServer(Integer  maxTcpConnPerClientPerServer) {
    this.maxTcpConnPerClientPerServer = maxTcpConnPerClientPerServer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Controls how client connections are bound to backend server tcp connections.
   * Sticky (default).
   * Enum options - MSG_LB_SESSION_BINDING_MODE_STICKY, MSG_LB_SESSION_BINDING_MODE_TRANSACTIONAL.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "MSG_LB_SESSION_BINDING_MODE_STICKY".
   * @return sessionBindingMode
   */
  @VsoMethod
  public String getSessionBindingMode() {
    return sessionBindingMode;
  }

  /**
   * This is the setter method to the attribute.
   * Controls how client connections are bound to backend server tcp connections.
   * Sticky (default).
   * Enum options - MSG_LB_SESSION_BINDING_MODE_STICKY, MSG_LB_SESSION_BINDING_MODE_TRANSACTIONAL.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "MSG_LB_SESSION_BINDING_MODE_STICKY".
   * @param sessionBindingMode set the sessionBindingMode.
   */
  @VsoMethod
  public void setSessionBindingMode(String  sessionBindingMode) {
    this.sessionBindingMode = sessionBindingMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Parameters for sticky-mode anchor and per-request bindings.
   * Ignored when session_binding_mode is transactional.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stickyBindingProfile
   */
  @VsoMethod
  public MsgLbApplicationServiceStickyBindingProfile getStickyBindingProfile() {
    return stickyBindingProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Parameters for sticky-mode anchor and per-request bindings.
   * Ignored when session_binding_mode is transactional.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param stickyBindingProfile set the stickyBindingProfile.
   */
  @VsoMethod
  public void setStickyBindingProfile(MsgLbApplicationServiceStickyBindingProfile stickyBindingProfile) {
    this.stickyBindingProfile = stickyBindingProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Parameters for transactional-mode session bindings.
   * Ignored when session_binding_mode is sticky.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return transactionBindingProfile
   */
  @VsoMethod
  public MsgLbApplicationServiceTransactionBindingProfile getTransactionBindingProfile() {
    return transactionBindingProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Parameters for transactional-mode session bindings.
   * Ignored when session_binding_mode is sticky.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param transactionBindingProfile set the transactionBindingProfile.
   */
  @VsoMethod
  public void setTransactionBindingProfile(MsgLbApplicationServiceTransactionBindingProfile transactionBindingProfile) {
    this.transactionBindingProfile = transactionBindingProfile;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MsgLbApplicationServiceProfile objMsgLbApplicationServiceProfile = (MsgLbApplicationServiceProfile) o;
  return   Objects.equals(this.maxTcpConnPerClientPerServer, objMsgLbApplicationServiceProfile.maxTcpConnPerClientPerServer)&&
  Objects.equals(this.sessionBindingMode, objMsgLbApplicationServiceProfile.sessionBindingMode)&&
  Objects.equals(this.stickyBindingProfile, objMsgLbApplicationServiceProfile.stickyBindingProfile)&&
  Objects.equals(this.transactionBindingProfile, objMsgLbApplicationServiceProfile.transactionBindingProfile);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MsgLbApplicationServiceProfile {\n");
      sb.append("    maxTcpConnPerClientPerServer: ").append(toIndentedString(maxTcpConnPerClientPerServer)).append("\n");
        sb.append("    sessionBindingMode: ").append(toIndentedString(sessionBindingMode)).append("\n");
        sb.append("    stickyBindingProfile: ").append(toIndentedString(stickyBindingProfile)).append("\n");
        sb.append("    transactionBindingProfile: ").append(toIndentedString(transactionBindingProfile)).append("\n");
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

