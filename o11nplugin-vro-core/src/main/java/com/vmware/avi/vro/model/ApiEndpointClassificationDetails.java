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
 * The ApiEndpointClassificationDetails is a POJO class extends AviRestResource that used for creating
 * ApiEndpointClassificationDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiEndpointClassificationDetails")
@VsoFinder(name = Constants.FINDER_VRO_APIENDPOINTCLASSIFICATIONDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiEndpointClassificationDetails extends AviRestResource {
    @JsonProperty("api_classification_transition_type")
    @JsonInclude(Include.NON_NULL)
    private String apiClassificationTransitionType;

    @JsonProperty("api_endpoint")
    @JsonInclude(Include.NON_NULL)
    private String apiEndpoint;



  /**
   * This is the getter method this will return the attribute value.
   * Api classification transition type for the api endpoint.
   * Enum options - API_CLASSIFICATION_TRANSITION_TYPE_ACTIVE_TO_ORPHAN, API_CLASSIFICATION_TRANSITION_TYPE_ACTIVE_TO_ZOMBIE,
   * API_CLASSIFICATION_TRANSITION_TYPE_ORPHAN_TO_ACTIVE, API_CLASSIFICATION_TRANSITION_TYPE_ORPHAN_TO_ZOMBIE,
   * API_CLASSIFICATION_TRANSITION_TYPE_ZOMBIE_TO_ACTIVE, API_CLASSIFICATION_TRANSITION_TYPE_ZOMBIE_TO_ORPHAN.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return apiClassificationTransitionType
   */
  @VsoMethod
  public String getApiClassificationTransitionType() {
    return apiClassificationTransitionType;
  }

  /**
   * This is the setter method to the attribute.
   * Api classification transition type for the api endpoint.
   * Enum options - API_CLASSIFICATION_TRANSITION_TYPE_ACTIVE_TO_ORPHAN, API_CLASSIFICATION_TRANSITION_TYPE_ACTIVE_TO_ZOMBIE,
   * API_CLASSIFICATION_TRANSITION_TYPE_ORPHAN_TO_ACTIVE, API_CLASSIFICATION_TRANSITION_TYPE_ORPHAN_TO_ZOMBIE,
   * API_CLASSIFICATION_TRANSITION_TYPE_ZOMBIE_TO_ACTIVE, API_CLASSIFICATION_TRANSITION_TYPE_ZOMBIE_TO_ORPHAN.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param apiClassificationTransitionType set the apiClassificationTransitionType.
   */
  @VsoMethod
  public void setApiClassificationTransitionType(String  apiClassificationTransitionType) {
    this.apiClassificationTransitionType = apiClassificationTransitionType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Api endpoint classification details.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return apiEndpoint
   */
  @VsoMethod
  public String getApiEndpoint() {
    return apiEndpoint;
  }

  /**
   * This is the setter method to the attribute.
   * Api endpoint classification details.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param apiEndpoint set the apiEndpoint.
   */
  @VsoMethod
  public void setApiEndpoint(String  apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApiEndpointClassificationDetails objApiEndpointClassificationDetails = (ApiEndpointClassificationDetails) o;
  return   Objects.equals(this.apiEndpoint, objApiEndpointClassificationDetails.apiEndpoint)&&
  Objects.equals(this.apiClassificationTransitionType, objApiEndpointClassificationDetails.apiClassificationTransitionType);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiEndpointClassificationDetails {\n");
      sb.append("    apiClassificationTransitionType: ").append(toIndentedString(apiClassificationTransitionType)).append("\n");
        sb.append("    apiEndpoint: ").append(toIndentedString(apiEndpoint)).append("\n");
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

