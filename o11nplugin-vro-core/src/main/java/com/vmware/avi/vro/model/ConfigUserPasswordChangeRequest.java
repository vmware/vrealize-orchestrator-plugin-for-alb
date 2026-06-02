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
 * The ConfigUserPasswordChangeRequest is a POJO class extends AviRestResource that used for creating
 * ConfigUserPasswordChangeRequest.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConfigUserPasswordChangeRequest")
@VsoFinder(name = Constants.FINDER_VRO_CONFIGUSERPASSWORDCHANGEREQUEST)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConfigUserPasswordChangeRequest extends AviRestResource {
    @JsonProperty("client_ip")
    @JsonInclude(Include.NON_NULL)
    private String clientIp;

    @JsonProperty("client_type")
    @JsonInclude(Include.NON_NULL)
    private String clientType;

    @JsonProperty("error_message")
    @JsonInclude(Include.NON_NULL)
    private String errorMessage;

    @JsonProperty("request_path")
    @JsonInclude(Include.NON_NULL)
    private String requestPath;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status;

    @JsonProperty("user")
    @JsonInclude(Include.NON_NULL)
    private String user;

    @JsonProperty("user_email")
    @JsonInclude(Include.NON_NULL)
    private String userEmail;



  /**
   * This is the getter method this will return the attribute value.
   * Client ip address.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIp
   */
  @VsoMethod
  public String getClientIp() {
    return clientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Client ip address.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIp set the clientIp.
   */
  @VsoMethod
  public void setClientIp(String  clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of client used to initiate the operation, e.g.
   * Ui, cli, api.
   * Field introduced in 32.2.1,32.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientType
   */
  @VsoMethod
  public String getClientType() {
    return clientType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of client used to initiate the operation, e.g.
   * Ui, cli, api.
   * Field introduced in 32.2.1,32.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientType set the clientType.
   */
  @VsoMethod
  public void setClientType(String  clientType) {
    this.clientType = clientType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error message if the operation failed.
   * Field introduced in 32.2.1,32.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorMessage
   */
  @VsoMethod
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * This is the setter method to the attribute.
   * Error message if the operation failed.
   * Field introduced in 32.2.1,32.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorMessage set the errorMessage.
   */
  @VsoMethod
  public void setErrorMessage(String  errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Api request path that triggered the operation.
   * Field introduced in 32.2.1,32.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestPath
   */
  @VsoMethod
  public String getRequestPath() {
    return requestPath;
  }

  /**
   * This is the setter method to the attribute.
   * Api request path that triggered the operation.
   * Field introduced in 32.2.1,32.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param requestPath set the requestPath.
   */
  @VsoMethod
  public void setRequestPath(String  requestPath) {
    this.requestPath = requestPath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Operation status.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Operation status.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Username.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return user
   */
  @VsoMethod
  public String getUser() {
    return user;
  }

  /**
   * This is the setter method to the attribute.
   * Username.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param user set the user.
   */
  @VsoMethod
  public void setUser(String  user) {
    this.user = user;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Email address of user for password reset request flow.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userEmail
   */
  @VsoMethod
  public String getUserEmail() {
    return userEmail;
  }

  /**
   * This is the setter method to the attribute.
   * Email address of user for password reset request flow.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param userEmail set the userEmail.
   */
  @VsoMethod
  public void setUserEmail(String  userEmail) {
    this.userEmail = userEmail;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConfigUserPasswordChangeRequest objConfigUserPasswordChangeRequest = (ConfigUserPasswordChangeRequest) o;
  return   Objects.equals(this.userEmail, objConfigUserPasswordChangeRequest.userEmail)&&
  Objects.equals(this.user, objConfigUserPasswordChangeRequest.user)&&
  Objects.equals(this.clientIp, objConfigUserPasswordChangeRequest.clientIp)&&
  Objects.equals(this.status, objConfigUserPasswordChangeRequest.status)&&
  Objects.equals(this.errorMessage, objConfigUserPasswordChangeRequest.errorMessage)&&
  Objects.equals(this.clientType, objConfigUserPasswordChangeRequest.clientType)&&
  Objects.equals(this.requestPath, objConfigUserPasswordChangeRequest.requestPath);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConfigUserPasswordChangeRequest {\n");
      sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    requestPath: ").append(toIndentedString(requestPath)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
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

