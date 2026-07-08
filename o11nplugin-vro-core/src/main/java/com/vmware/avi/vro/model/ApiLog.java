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
 * The ApiLog is a POJO class extends AviRestResource that used for creating
 * ApiLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiLog")
@VsoFinder(name = Constants.FINDER_VRO_APILOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiLog extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private String action;

    @JsonProperty("effective_labels")
    @JsonInclude(Include.NON_NULL)
    private String effectiveLabels;

    @JsonProperty("enabled_api_checks")
    @JsonInclude(Include.NON_NULL)
    private List<String> enabledApiChecks;

    @JsonProperty("executed_api_labels_str")
    @JsonInclude(Include.NON_NULL)
    private String executedApiLabelsStr;

    @JsonProperty("omitted_api_violations")
    @JsonInclude(Include.NON_NULL)
    private Integer omittedApiViolations;

    @JsonProperty("request_type")
    @JsonInclude(Include.NON_NULL)
    private String requestType = "API_LOG_TYPE_OTHER";

    @JsonProperty("violations")
    @JsonInclude(Include.NON_NULL)
    private List<ApiViolation> violations;



  /**
   * This is the getter method this will return the attribute value.
   * Overall action taken based on the api violations.
   * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT.
   * Field introduced in 32.2.1.
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
   * Overall action taken based on the api violations.
   * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT.
   * Field introduced in 32.2.1.
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
   * Comma-separated waap label names effective for this request set only when avi.waap.enable_label_logging() datascript runs.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return effectiveLabels
   */
  @VsoMethod
  public String getEffectiveLabels() {
    return effectiveLabels;
  }

  /**
   * This is the setter method to the attribute.
   * Comma-separated waap label names effective for this request set only when avi.waap.enable_label_logging() datascript runs.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param effectiveLabels set the effectiveLabels.
   */
  @VsoMethod
  public void setEffectiveLabels(String  effectiveLabels) {
    this.effectiveLabels = effectiveLabels;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of api validation checks that were performed on this request.
   * Enum options - API_LOG_CHECK_UNSPECIFIED, API_LOG_CHECK_PATH_PARAMETER, API_LOG_CHECK_QUERY_PARAMETER, API_LOG_CHECK_REQUEST_CONTENT_TYPE,
   * API_LOG_CHECK_REQUEST_BODY, API_LOG_CHECK_RESPONSE_STATUS_CODE, API_LOG_CHECK_RESPONSE_CONTENT_TYPE, API_LOG_CHECK_REQUEST_HEADER.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enabledApiChecks
   */
  @VsoMethod
  public List<String> getEnabledApiChecks() {
    return enabledApiChecks;
  }

  /**
   * This is the setter method. this will set the enabledApiChecks
   * List of api validation checks that were performed on this request.
   * Enum options - API_LOG_CHECK_UNSPECIFIED, API_LOG_CHECK_PATH_PARAMETER, API_LOG_CHECK_QUERY_PARAMETER, API_LOG_CHECK_REQUEST_CONTENT_TYPE,
   * API_LOG_CHECK_REQUEST_BODY, API_LOG_CHECK_RESPONSE_STATUS_CODE, API_LOG_CHECK_RESPONSE_CONTENT_TYPE, API_LOG_CHECK_REQUEST_HEADER.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enabledApiChecks
   */
  @VsoMethod
  public void setEnabledApiChecks(List<String>  enabledApiChecks) {
    this.enabledApiChecks = enabledApiChecks;
  }

  /**
   * This is the setter method this will set the enabledApiChecks
   * List of api validation checks that were performed on this request.
   * Enum options - API_LOG_CHECK_UNSPECIFIED, API_LOG_CHECK_PATH_PARAMETER, API_LOG_CHECK_QUERY_PARAMETER, API_LOG_CHECK_REQUEST_CONTENT_TYPE,
   * API_LOG_CHECK_REQUEST_BODY, API_LOG_CHECK_RESPONSE_STATUS_CODE, API_LOG_CHECK_RESPONSE_CONTENT_TYPE, API_LOG_CHECK_REQUEST_HEADER.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enabledApiChecks
   */
  @VsoMethod
  public ApiLog addEnabledApiChecksItem(String enabledApiChecksItem) {
    if (this.enabledApiChecks == null) {
      this.enabledApiChecks = new ArrayList<String>();
    }
    this.enabledApiChecks.add(enabledApiChecksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Comma-separated list of api policy labels that were executed for this request.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return executedApiLabelsStr
   */
  @VsoMethod
  public String getExecutedApiLabelsStr() {
    return executedApiLabelsStr;
  }

  /**
   * This is the setter method to the attribute.
   * Comma-separated list of api policy labels that were executed for this request.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param executedApiLabelsStr set the executedApiLabelsStr.
   */
  @VsoMethod
  public void setExecutedApiLabelsStr(String  executedApiLabelsStr) {
    this.executedApiLabelsStr = executedApiLabelsStr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of api violations that were not logged due to space constraints.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return omittedApiViolations
   */
  @VsoMethod
  public Integer getOmittedApiViolations() {
    return omittedApiViolations;
  }

  /**
   * This is the setter method to the attribute.
   * Number of api violations that were not logged due to space constraints.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param omittedApiViolations set the omittedApiViolations.
   */
  @VsoMethod
  public void setOmittedApiViolations(Integer  omittedApiViolations) {
    this.omittedApiViolations = omittedApiViolations;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The type of the api request.
   * Enum options - API_LOG_TYPE_OTHER, API_LOG_TYPE_ACTIVE, API_LOG_TYPE_SHADOW, API_LOG_TYPE_ZOMBIE, API_LOG_TYPE_ORPHAN.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "API_LOG_TYPE_OTHER".
   * @return requestType
   */
  @VsoMethod
  public String getRequestType() {
    return requestType;
  }

  /**
   * This is the setter method to the attribute.
   * The type of the api request.
   * Enum options - API_LOG_TYPE_OTHER, API_LOG_TYPE_ACTIVE, API_LOG_TYPE_SHADOW, API_LOG_TYPE_ZOMBIE, API_LOG_TYPE_ORPHAN.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "API_LOG_TYPE_OTHER".
   * @param requestType set the requestType.
   */
  @VsoMethod
  public void setRequestType(String  requestType) {
    this.requestType = requestType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of api violations detected during validation.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return violations
   */
  @VsoMethod
  public List<ApiViolation> getViolations() {
    return violations;
  }

  /**
   * This is the setter method. this will set the violations
   * List of api violations detected during validation.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return violations
   */
  @VsoMethod
  public void setViolations(List<ApiViolation>  violations) {
    this.violations = violations;
  }

  /**
   * This is the setter method this will set the violations
   * List of api violations detected during validation.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return violations
   */
  @VsoMethod
  public ApiLog addViolationsItem(ApiViolation violationsItem) {
    if (this.violations == null) {
      this.violations = new ArrayList<ApiViolation>();
    }
    this.violations.add(violationsItem);
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
  ApiLog objApiLog = (ApiLog) o;
  return   Objects.equals(this.requestType, objApiLog.requestType)&&
  Objects.equals(this.enabledApiChecks, objApiLog.enabledApiChecks)&&
  Objects.equals(this.violations, objApiLog.violations)&&
  Objects.equals(this.omittedApiViolations, objApiLog.omittedApiViolations)&&
  Objects.equals(this.action, objApiLog.action)&&
  Objects.equals(this.effectiveLabels, objApiLog.effectiveLabels)&&
  Objects.equals(this.executedApiLabelsStr, objApiLog.executedApiLabelsStr);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiLog {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    effectiveLabels: ").append(toIndentedString(effectiveLabels)).append("\n");
        sb.append("    enabledApiChecks: ").append(toIndentedString(enabledApiChecks)).append("\n");
        sb.append("    executedApiLabelsStr: ").append(toIndentedString(executedApiLabelsStr)).append("\n");
        sb.append("    omittedApiViolations: ").append(toIndentedString(omittedApiViolations)).append("\n");
        sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
        sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
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

