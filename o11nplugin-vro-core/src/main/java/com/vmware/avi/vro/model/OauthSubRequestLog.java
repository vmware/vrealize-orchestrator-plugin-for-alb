package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SubRequestLog;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The OauthSubRequestLog is a POJO class extends AviRestResource that used for creating
 * OauthSubRequestLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OauthSubRequestLog")
@VsoFinder(name = Constants.FINDER_VRO_OAUTHSUBREQUESTLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OauthSubRequestLog extends AviRestResource {
    @JsonProperty("error_code")
    @JsonInclude(Include.NON_NULL)
    private String errorCode;

    @JsonProperty("error_description")
    @JsonInclude(Include.NON_NULL)
    private String errorDescription;

    @JsonProperty("sub_request_log")
    @JsonInclude(Include.NON_NULL)
    private SubRequestLog subRequestLog;



  /**
   * This is the getter method this will return the attribute value.
   * Error code.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorCode
   */
  @VsoMethod
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * This is the setter method to the attribute.
   * Error code.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorCode set the errorCode.
   */
  @VsoMethod
  public void setErrorCode(String  errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error description.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorDescription
   */
  @VsoMethod
  public String getErrorDescription() {
    return errorDescription;
  }

  /**
   * This is the setter method to the attribute.
   * Error description.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorDescription set the errorDescription.
   */
  @VsoMethod
  public void setErrorDescription(String  errorDescription) {
    this.errorDescription = errorDescription;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subrequest info related to the oauth flow.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subRequestLog
   */
  @VsoMethod
  public SubRequestLog getSubRequestLog() {
    return subRequestLog;
  }

  /**
   * This is the setter method to the attribute.
   * Subrequest info related to the oauth flow.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subRequestLog set the subRequestLog.
   */
  @VsoMethod
  public void setSubRequestLog(SubRequestLog subRequestLog) {
    this.subRequestLog = subRequestLog;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OauthSubRequestLog objOauthSubRequestLog = (OauthSubRequestLog) o;
  return   Objects.equals(this.subRequestLog, objOauthSubRequestLog.subRequestLog)&&
  Objects.equals(this.errorCode, objOauthSubRequestLog.errorCode)&&
  Objects.equals(this.errorDescription, objOauthSubRequestLog.errorDescription);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OauthSubRequestLog {\n");
      sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
        sb.append("    subRequestLog: ").append(toIndentedString(subRequestLog)).append("\n");
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

