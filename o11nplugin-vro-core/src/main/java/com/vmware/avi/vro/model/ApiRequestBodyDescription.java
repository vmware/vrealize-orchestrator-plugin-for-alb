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
 * The ApiRequestBodyDescription is a POJO class extends AviRestResource that used for creating
 * ApiRequestBodyDescription.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiRequestBodyDescription")
@VsoFinder(name = Constants.FINDER_VRO_APIREQUESTBODYDESCRIPTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiRequestBodyDescription extends AviRestResource {
    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("failed_validation_request_body_action")
    @JsonInclude(Include.NON_NULL)
    private String failedValidationRequestBodyAction = "API_ACTION_INHERIT_FROM_API_POLICY";

    @JsonProperty("mappings")
    @JsonInclude(Include.NON_NULL)
    private List<ApiContentTypeMapping> mappings;

    @JsonProperty("required")
    @JsonInclude(Include.NON_NULL)
    private Boolean required = false;

    @JsonProperty("unknown_content_type_action")
    @JsonInclude(Include.NON_NULL)
    private String unknownContentTypeAction = "API_ACTION_INHERIT_FROM_API_POLICY";



  /**
   * This is the getter method this will return the attribute value.
   * Description of the request body from the openapi specification.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Description of the request body from the openapi specification.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Action on request body schema validation failures.
   * Overrides the policy-level failed_validation_request_body_parameter_action when not inherit.
   * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
   * @return failedValidationRequestBodyAction
   */
  @VsoMethod
  public String getFailedValidationRequestBodyAction() {
    return failedValidationRequestBodyAction;
  }

  /**
   * This is the setter method to the attribute.
   * Action on request body schema validation failures.
   * Overrides the policy-level failed_validation_request_body_parameter_action when not inherit.
   * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
   * @param failedValidationRequestBodyAction set the failedValidationRequestBodyAction.
   */
  @VsoMethod
  public void setFailedValidationRequestBodyAction(String  failedValidationRequestBodyAction) {
    this.failedValidationRequestBodyAction = failedValidationRequestBodyAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mapping of the content type to the request body schema.
   * Field introduced in 32.2.1.
   * Maximum of 128 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mappings
   */
  @VsoMethod
  public List<ApiContentTypeMapping> getMappings() {
    return mappings;
  }

  /**
   * This is the setter method. this will set the mappings
   * Mapping of the content type to the request body schema.
   * Field introduced in 32.2.1.
   * Maximum of 128 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mappings
   */
  @VsoMethod
  public void setMappings(List<ApiContentTypeMapping>  mappings) {
    this.mappings = mappings;
  }

  /**
   * This is the setter method this will set the mappings
   * Mapping of the content type to the request body schema.
   * Field introduced in 32.2.1.
   * Maximum of 128 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mappings
   */
  @VsoMethod
  public ApiRequestBodyDescription addMappingsItem(ApiContentTypeMapping mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new ArrayList<ApiContentTypeMapping>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Marks the request body as required.
   * A missing body is treated as a violation; enforcement depends on the configured body validation actions.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return required
   */
  @VsoMethod
  public Boolean getRequired() {
    return required;
  }

  /**
   * This is the setter method to the attribute.
   * Marks the request body as required.
   * A missing body is treated as a violation; enforcement depends on the configured body validation actions.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param required set the required.
   */
  @VsoMethod
  public void setRequired(Boolean  required) {
    this.required = required;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Action to take when the request body's content type is not defined for this endpoint.
   * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
   * @return unknownContentTypeAction
   */
  @VsoMethod
  public String getUnknownContentTypeAction() {
    return unknownContentTypeAction;
  }

  /**
   * This is the setter method to the attribute.
   * Action to take when the request body's content type is not defined for this endpoint.
   * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
   * @param unknownContentTypeAction set the unknownContentTypeAction.
   */
  @VsoMethod
  public void setUnknownContentTypeAction(String  unknownContentTypeAction) {
    this.unknownContentTypeAction = unknownContentTypeAction;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApiRequestBodyDescription objApiRequestBodyDescription = (ApiRequestBodyDescription) o;
  return   Objects.equals(this.mappings, objApiRequestBodyDescription.mappings)&&
  Objects.equals(this.unknownContentTypeAction, objApiRequestBodyDescription.unknownContentTypeAction)&&
  Objects.equals(this.required, objApiRequestBodyDescription.required)&&
  Objects.equals(this.failedValidationRequestBodyAction, objApiRequestBodyDescription.failedValidationRequestBodyAction)&&
  Objects.equals(this.description, objApiRequestBodyDescription.description);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiRequestBodyDescription {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    failedValidationRequestBodyAction: ").append(toIndentedString(failedValidationRequestBodyAction)).append("\n");
        sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    unknownContentTypeAction: ").append(toIndentedString(unknownContentTypeAction)).append("\n");
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

