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
 * The ApiPolicyLabelActionMapping is a POJO class extends AviRestResource that used for creating
 * ApiPolicyLabelActionMapping.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiPolicyLabelActionMapping")
@VsoFinder(name = Constants.FINDER_VRO_APIPOLICYLABELACTIONMAPPING)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiPolicyLabelActionMapping extends AviRestResource {
    @JsonProperty("api_policy_actions")
    @JsonInclude(Include.NON_NULL)
    private List<String> apiPolicyActions;

    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = true;

    @JsonProperty("label")
    @JsonInclude(Include.NON_NULL)
    private String label;



  /**
   * This is the getter method this will return the attribute value.
   * List of api policy actions to run on this label.
   * Enum options - API_POLICY_DEACTIVATE_PATH_PARAM_CHECK, API_POLICY_DEACTIVATE_QUERY_PARAM_CHECK, API_POLICY_ACTION_DEACTIVATE_HEADER_CHECK,
   * API_POLICY_ACTION_DEACTIVATE_REQUEST_BODY_CHECK, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_PASS, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_LEARN,
   * API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_FLAG, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_REJECT, API_POLICY_ACTION_UNKNOWN_REQUEST_CONTENT_TYPE_PASS,
   * API_POLICY_ACTION_UNKNOWN_REQUEST_CONTENT_TYPE_FLAG, API_POLICY_ACTION_UNKNOWN_REQUEST_CONTENT_TYPE_REJECT.
   * Field introduced in 32.2.1.
   * Maximum of 16 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return apiPolicyActions
   */
  @VsoMethod
  public List<String> getApiPolicyActions() {
    return apiPolicyActions;
  }

  /**
   * This is the setter method. this will set the apiPolicyActions
   * List of api policy actions to run on this label.
   * Enum options - API_POLICY_DEACTIVATE_PATH_PARAM_CHECK, API_POLICY_DEACTIVATE_QUERY_PARAM_CHECK, API_POLICY_ACTION_DEACTIVATE_HEADER_CHECK,
   * API_POLICY_ACTION_DEACTIVATE_REQUEST_BODY_CHECK, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_PASS, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_LEARN,
   * API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_FLAG, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_REJECT, API_POLICY_ACTION_UNKNOWN_REQUEST_CONTENT_TYPE_PASS,
   * API_POLICY_ACTION_UNKNOWN_REQUEST_CONTENT_TYPE_FLAG, API_POLICY_ACTION_UNKNOWN_REQUEST_CONTENT_TYPE_REJECT.
   * Field introduced in 32.2.1.
   * Maximum of 16 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return apiPolicyActions
   */
  @VsoMethod
  public void setApiPolicyActions(List<String>  apiPolicyActions) {
    this.apiPolicyActions = apiPolicyActions;
  }

  /**
   * This is the setter method this will set the apiPolicyActions
   * List of api policy actions to run on this label.
   * Enum options - API_POLICY_DEACTIVATE_PATH_PARAM_CHECK, API_POLICY_DEACTIVATE_QUERY_PARAM_CHECK, API_POLICY_ACTION_DEACTIVATE_HEADER_CHECK,
   * API_POLICY_ACTION_DEACTIVATE_REQUEST_BODY_CHECK, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_PASS, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_LEARN,
   * API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_FLAG, API_POLICY_ACTION_UNKNOWN_QUERY_PARAM_REJECT, API_POLICY_ACTION_UNKNOWN_REQUEST_CONTENT_TYPE_PASS,
   * API_POLICY_ACTION_UNKNOWN_REQUEST_CONTENT_TYPE_FLAG, API_POLICY_ACTION_UNKNOWN_REQUEST_CONTENT_TYPE_REJECT.
   * Field introduced in 32.2.1.
   * Maximum of 16 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return apiPolicyActions
   */
  @VsoMethod
  public ApiPolicyLabelActionMapping addApiPolicyActionsItem(String apiPolicyActionsItem) {
    if (this.apiPolicyActions == null) {
      this.apiPolicyActions = new ArrayList<String>();
    }
    this.apiPolicyActions.add(apiPolicyActionsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enables this label-to-action mapping.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enables this label-to-action mapping.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the label.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return label
   */
  @VsoMethod
  public String getLabel() {
    return label;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the label.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param label set the label.
   */
  @VsoMethod
  public void setLabel(String  label) {
    this.label = label;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApiPolicyLabelActionMapping objApiPolicyLabelActionMapping = (ApiPolicyLabelActionMapping) o;
  return   Objects.equals(this.enabled, objApiPolicyLabelActionMapping.enabled)&&
  Objects.equals(this.label, objApiPolicyLabelActionMapping.label)&&
  Objects.equals(this.apiPolicyActions, objApiPolicyLabelActionMapping.apiPolicyActions);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiPolicyLabelActionMapping {\n");
      sb.append("    apiPolicyActions: ").append(toIndentedString(apiPolicyActions)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

