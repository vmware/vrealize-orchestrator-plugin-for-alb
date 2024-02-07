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
 * The ConfigUserLogout is a POJO class extends AviRestResource that used for creating
 * ConfigUserLogout.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConfigUserLogout")
@VsoFinder(name = Constants.FINDER_VRO_CONFIGUSERLOGOUT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConfigUserLogout extends AviRestResource {
    @JsonProperty("client_ip")
    @JsonInclude(Include.NON_NULL)
    private String clientIp;

    @JsonProperty("error_message")
    @JsonInclude(Include.NON_NULL)
    private String errorMessage;

    @JsonProperty("local")
    @JsonInclude(Include.NON_NULL)
    private Boolean local;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status;

    @JsonProperty("user")
    @JsonInclude(Include.NON_NULL)
    private String user;



  /**
   * This is the getter method this will return the attribute value.
   * Client ip.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIp
   */
  @VsoMethod
  public String getClientIp() {
    return clientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Client ip.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIp set the clientIp.
   */
  @VsoMethod
  public void setClientIp(String  clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error message if logging out failed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorMessage
   */
  @VsoMethod
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * This is the setter method to the attribute.
   * Error message if logging out failed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorMessage set the errorMessage.
   */
  @VsoMethod
  public void setErrorMessage(String  errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Local user.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return local
   */
  @VsoMethod
  public Boolean getLocal() {
    return local;
  }

  /**
   * This is the setter method to the attribute.
   * Local user.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param local set the local.
   */
  @VsoMethod
  public void setLocal(Boolean  local) {
    this.local = local;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Status.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request user.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return user
   */
  @VsoMethod
  public String getUser() {
    return user;
  }

  /**
   * This is the setter method to the attribute.
   * Request user.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param user set the user.
   */
  @VsoMethod
  public void setUser(String  user) {
    this.user = user;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConfigUserLogout objConfigUserLogout = (ConfigUserLogout) o;
  return   Objects.equals(this.user, objConfigUserLogout.user)&&
  Objects.equals(this.status, objConfigUserLogout.status)&&
  Objects.equals(this.clientIp, objConfigUserLogout.clientIp)&&
  Objects.equals(this.errorMessage, objConfigUserLogout.errorMessage)&&
  Objects.equals(this.local, objConfigUserLogout.local);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConfigUserLogout {\n");
      sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    local: ").append(toIndentedString(local)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

