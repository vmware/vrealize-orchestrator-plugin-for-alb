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
 * The ApiViolation is a POJO class extends AviRestResource that used for creating
 * ApiViolation.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiViolation")
@VsoFinder(name = Constants.FINDER_VRO_APIVIOLATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiViolation extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private String action;

    @JsonProperty("match_element_location")
    @JsonInclude(Include.NON_NULL)
    private String matchElementLocation;

    @JsonProperty("match_element_name")
    @JsonInclude(Include.NON_NULL)
    private String matchElementName;

    @JsonProperty("match_element_value")
    @JsonInclude(Include.NON_NULL)
    private String matchElementValue;

    @JsonProperty("message_parameters")
    @JsonInclude(Include.NON_NULL)
    private List<String> messageParameters;

    @JsonProperty("violation_type")
    @JsonInclude(Include.NON_NULL)
    private String violationType;



  /**
   * This is the getter method this will return the attribute value.
   * Action performed based on this violation, such as flag or reject.
   * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Action performed based on this violation, such as flag or reject.
   * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Location where the api violation was detected, such as path, query args, or request body.
   * Enum options - API_LOG_VIOLATION_LOCATION_UNSPECIFIED, API_LOG_VIOLATION_LOCATION_PATH, API_LOG_VIOLATION_LOCATION_METHOD,
   * API_LOG_VIOLATION_LOCATION_QUERY_ARGS, API_LOG_VIOLATION_LOCATION_REQUEST_HEADER, API_LOG_VIOLATION_LOCATION_REQUEST_CONTENT_TYPE,
   * API_LOG_VIOLATION_LOCATION_REQUEST_BODY, API_LOG_VIOLATION_LOCATION_RESPONSE_STATUS_CODE, API_LOG_VIOLATION_LOCATION_REPONSE_HEADER,
   * API_LOG_VIOLATION_LOCATION_RESPONSE_CONTENT_TYPE, API_LOG_VIOLATION_LOCATION_RESPONSE_BODY.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchElementLocation
   */
  @VsoMethod
  public String getMatchElementLocation() {
    return matchElementLocation;
  }

  /**
   * This is the setter method to the attribute.
   * Location where the api violation was detected, such as path, query args, or request body.
   * Enum options - API_LOG_VIOLATION_LOCATION_UNSPECIFIED, API_LOG_VIOLATION_LOCATION_PATH, API_LOG_VIOLATION_LOCATION_METHOD,
   * API_LOG_VIOLATION_LOCATION_QUERY_ARGS, API_LOG_VIOLATION_LOCATION_REQUEST_HEADER, API_LOG_VIOLATION_LOCATION_REQUEST_CONTENT_TYPE,
   * API_LOG_VIOLATION_LOCATION_REQUEST_BODY, API_LOG_VIOLATION_LOCATION_RESPONSE_STATUS_CODE, API_LOG_VIOLATION_LOCATION_REPONSE_HEADER,
   * API_LOG_VIOLATION_LOCATION_RESPONSE_CONTENT_TYPE, API_LOG_VIOLATION_LOCATION_RESPONSE_BODY.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchElementLocation set the matchElementLocation.
   */
  @VsoMethod
  public void setMatchElementLocation(String  matchElementLocation) {
    this.matchElementLocation = matchElementLocation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the element that caused the violation, for example 'id'.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchElementName
   */
  @VsoMethod
  public String getMatchElementName() {
    return matchElementName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the element that caused the violation, for example 'id'.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchElementName set the matchElementName.
   */
  @VsoMethod
  public void setMatchElementName(String  matchElementName) {
    this.matchElementName = matchElementName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Value of the element that caused the violation, for example '42'.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchElementValue
   */
  @VsoMethod
  public String getMatchElementValue() {
    return matchElementValue;
  }

  /**
   * This is the setter method to the attribute.
   * Value of the element that caused the violation, for example '42'.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchElementValue set the matchElementValue.
   */
  @VsoMethod
  public void setMatchElementValue(String  matchElementValue) {
    this.matchElementValue = matchElementValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of parameters to be substituted into the message format string.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return messageParameters
   */
  @VsoMethod
  public List<String> getMessageParameters() {
    return messageParameters;
  }

  /**
   * This is the setter method. this will set the messageParameters
   * List of parameters to be substituted into the message format string.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return messageParameters
   */
  @VsoMethod
  public void setMessageParameters(List<String>  messageParameters) {
    this.messageParameters = messageParameters;
  }

  /**
   * This is the setter method this will set the messageParameters
   * List of parameters to be substituted into the message format string.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return messageParameters
   */
  @VsoMethod
  public ApiViolation addMessageParametersItem(String messageParametersItem) {
    if (this.messageParameters == null) {
      this.messageParameters = new ArrayList<String>();
    }
    this.messageParameters.add(messageParametersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The type of violation (e.g.
   * Invalid type, missing required property).
   * Enum options - API_VIOLATION_TYPE_NONE, API_VIOLATION_TYPE_INVALID_TYPE, API_VIOLATION_TYPE_VALUE_OUT_OF_RANGE,
   * API_VIOLATION_TYPE_FORMAT_MISMATCH, API_VIOLATION_TYPE_UNEXPECTED_ADDITIONAL_PROPERTY, API_VIOLATION_TYPE_MISSING_REQUIRED_PROPERTY,
   * API_VIOLATION_TYPE_NON_API_REQUEST, API_VIOLATION_TYPE_SHADOW_ENDPOINT.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return violationType
   */
  @VsoMethod
  public String getViolationType() {
    return violationType;
  }

  /**
   * This is the setter method to the attribute.
   * The type of violation (e.g.
   * Invalid type, missing required property).
   * Enum options - API_VIOLATION_TYPE_NONE, API_VIOLATION_TYPE_INVALID_TYPE, API_VIOLATION_TYPE_VALUE_OUT_OF_RANGE,
   * API_VIOLATION_TYPE_FORMAT_MISMATCH, API_VIOLATION_TYPE_UNEXPECTED_ADDITIONAL_PROPERTY, API_VIOLATION_TYPE_MISSING_REQUIRED_PROPERTY,
   * API_VIOLATION_TYPE_NON_API_REQUEST, API_VIOLATION_TYPE_SHADOW_ENDPOINT.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param violationType set the violationType.
   */
  @VsoMethod
  public void setViolationType(String  violationType) {
    this.violationType = violationType;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApiViolation objApiViolation = (ApiViolation) o;
  return   Objects.equals(this.matchElementLocation, objApiViolation.matchElementLocation)&&
  Objects.equals(this.matchElementName, objApiViolation.matchElementName)&&
  Objects.equals(this.matchElementValue, objApiViolation.matchElementValue)&&
  Objects.equals(this.violationType, objApiViolation.violationType)&&
  Objects.equals(this.messageParameters, objApiViolation.messageParameters)&&
  Objects.equals(this.action, objApiViolation.action);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiViolation {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    matchElementLocation: ").append(toIndentedString(matchElementLocation)).append("\n");
        sb.append("    matchElementName: ").append(toIndentedString(matchElementName)).append("\n");
        sb.append("    matchElementValue: ").append(toIndentedString(matchElementValue)).append("\n");
        sb.append("    messageParameters: ").append(toIndentedString(messageParameters)).append("\n");
        sb.append("    violationType: ").append(toIndentedString(violationType)).append("\n");
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

