package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HTTPStatusMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ApiResponse is a POJO class extends AviRestResource that used for creating
 * ApiResponse.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiResponse")
@VsoFinder(name = Constants.FINDER_VRO_APIRESPONSE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiResponse extends AviRestResource {
    @JsonProperty("content_type_mappings")
    @JsonInclude(Include.NON_NULL)
    private List<ApiContentTypeMapping> contentTypeMappings;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("response_header_parameters")
    @JsonInclude(Include.NON_NULL)
    private List<ParameterDescription> responseHeaderParameters;

    @JsonProperty("status_code")
    @JsonInclude(Include.NON_NULL)
    private HTTPStatusMatch statusCode;

    @JsonProperty("unknown_content_type_action")
    @JsonInclude(Include.NON_NULL)
    private String unknownContentTypeAction = "API_ACTION_INHERIT_FROM_API_POLICY";



  /**
   * This is the getter method this will return the attribute value.
   * Content type mappings for response body.
   * Field introduced in 32.2.1.
   * Maximum of 128 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return contentTypeMappings
   */
  @VsoMethod
  public List<ApiContentTypeMapping> getContentTypeMappings() {
    return contentTypeMappings;
  }

  /**
   * This is the setter method. this will set the contentTypeMappings
   * Content type mappings for response body.
   * Field introduced in 32.2.1.
   * Maximum of 128 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return contentTypeMappings
   */
  @VsoMethod
  public void setContentTypeMappings(List<ApiContentTypeMapping>  contentTypeMappings) {
    this.contentTypeMappings = contentTypeMappings;
  }

  /**
   * This is the setter method this will set the contentTypeMappings
   * Content type mappings for response body.
   * Field introduced in 32.2.1.
   * Maximum of 128 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return contentTypeMappings
   */
  @VsoMethod
  public ApiResponse addContentTypeMappingsItem(ApiContentTypeMapping contentTypeMappingsItem) {
    if (this.contentTypeMappings == null) {
      this.contentTypeMappings = new ArrayList<ApiContentTypeMapping>();
    }
    this.contentTypeMappings.add(contentTypeMappingsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Description of the response from the openapi specification.
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
   * Description of the response from the openapi specification.
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
   * Description of response header parameters.
   * Field introduced in 32.2.1.
   * Maximum of 64 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return responseHeaderParameters
   */
  @VsoMethod
  public List<ParameterDescription> getResponseHeaderParameters() {
    return responseHeaderParameters;
  }

  /**
   * This is the setter method. this will set the responseHeaderParameters
   * Description of response header parameters.
   * Field introduced in 32.2.1.
   * Maximum of 64 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return responseHeaderParameters
   */
  @VsoMethod
  public void setResponseHeaderParameters(List<ParameterDescription>  responseHeaderParameters) {
    this.responseHeaderParameters = responseHeaderParameters;
  }

  /**
   * This is the setter method this will set the responseHeaderParameters
   * Description of response header parameters.
   * Field introduced in 32.2.1.
   * Maximum of 64 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return responseHeaderParameters
   */
  @VsoMethod
  public ApiResponse addResponseHeaderParametersItem(ParameterDescription responseHeaderParametersItem) {
    if (this.responseHeaderParameters == null) {
      this.responseHeaderParameters = new ArrayList<ParameterDescription>();
    }
    this.responseHeaderParameters.add(responseHeaderParametersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Http status code or status code range.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return statusCode
   */
  @VsoMethod
  public HTTPStatusMatch getStatusCode() {
    return statusCode;
  }

  /**
   * This is the setter method to the attribute.
   * Http status code or status code range.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param statusCode set the statusCode.
   */
  @VsoMethod
  public void setStatusCode(HTTPStatusMatch statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Action to take when the response body's content type is not defined for this status code.
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
   * Action to take when the response body's content type is not defined for this status code.
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
  ApiResponse objApiResponse = (ApiResponse) o;
  return   Objects.equals(this.statusCode, objApiResponse.statusCode)&&
  Objects.equals(this.contentTypeMappings, objApiResponse.contentTypeMappings)&&
  Objects.equals(this.responseHeaderParameters, objApiResponse.responseHeaderParameters)&&
  Objects.equals(this.description, objApiResponse.description)&&
  Objects.equals(this.unknownContentTypeAction, objApiResponse.unknownContentTypeAction);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiResponse {\n");
      sb.append("    contentTypeMappings: ").append(toIndentedString(contentTypeMappings)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    responseHeaderParameters: ").append(toIndentedString(responseHeaderParameters)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

