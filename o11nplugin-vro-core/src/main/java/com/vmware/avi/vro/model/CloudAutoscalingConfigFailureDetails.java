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
 * The CloudAutoscalingConfigFailureDetails is a POJO class extends AviRestResource that used for creating
 * CloudAutoscalingConfigFailureDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudAutoscalingConfigFailureDetails")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDAUTOSCALINGCONFIGFAILUREDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudAutoscalingConfigFailureDetails extends AviRestResource {
  @JsonProperty("cc_id")
  @JsonInclude(Include.NON_NULL)
  private String ccId = null;

  @JsonProperty("error_string")
  @JsonInclude(Include.NON_NULL)
  private String errorString = null;



  /**
   * This is the getter method this will return the attribute value.
   * Cloud uuid.
   * Field introduced in 20.1.1.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud uuid.
   * Field introduced in 20.1.1.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Failure reason if autoscaling configuration fails.
   * Field introduced in 20.1.1.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Failure reason if autoscaling configuration fails.
   * Field introduced in 20.1.1.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CloudAutoscalingConfigFailureDetails objCloudAutoscalingConfigFailureDetails = (CloudAutoscalingConfigFailureDetails) o;
  return   Objects.equals(this.errorString, objCloudAutoscalingConfigFailureDetails.errorString)&&
  Objects.equals(this.ccId, objCloudAutoscalingConfigFailureDetails.ccId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CloudAutoscalingConfigFailureDetails {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
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

