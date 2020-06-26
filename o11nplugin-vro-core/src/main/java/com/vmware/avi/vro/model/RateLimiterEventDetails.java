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
 * The RateLimiterEventDetails is a POJO class extends AviRestResource that used for creating
 * RateLimiterEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RateLimiterEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_RATELIMITEREVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RateLimiterEventDetails extends AviRestResource {
  @JsonProperty("error_message")
  @JsonInclude(Include.NON_NULL)
  private String errorMessage = null;

  @JsonProperty("rl_resource_name")
  @JsonInclude(Include.NON_NULL)
  private String rlResourceName = null;

  @JsonProperty("rl_resource_type")
  @JsonInclude(Include.NON_NULL)
  private String rlResourceType = null;

  @JsonProperty("status")
  @JsonInclude(Include.NON_NULL)
  private String status = null;



  /**
   * This is the getter method this will return the attribute value.
   * Rate limiter error message.
   * Field introduced in 20.1.1.
   * @return errorMessage
   */
  @VsoMethod
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiter error message.
   * Field introduced in 20.1.1.
   * @param errorMessage set the errorMessage.
   */
  @VsoMethod
  public void setErrorMessage(String  errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the rate limiter.
   * Field introduced in 20.1.1.
   * @return rlResourceName
   */
  @VsoMethod
  public String getRlResourceName() {
    return rlResourceName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the rate limiter.
   * Field introduced in 20.1.1.
   * @param rlResourceName set the rlResourceName.
   */
  @VsoMethod
  public void setRlResourceName(String  rlResourceName) {
    this.rlResourceName = rlResourceName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limiter type.
   * Field introduced in 20.1.1.
   * @return rlResourceType
   */
  @VsoMethod
  public String getRlResourceType() {
    return rlResourceType;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiter type.
   * Field introduced in 20.1.1.
   * @param rlResourceType set the rlResourceType.
   */
  @VsoMethod
  public void setRlResourceType(String  rlResourceType) {
    this.rlResourceType = rlResourceType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status.
   * Field introduced in 20.1.1.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Status.
   * Field introduced in 20.1.1.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RateLimiterEventDetails objRateLimiterEventDetails = (RateLimiterEventDetails) o;
  return   Objects.equals(this.status, objRateLimiterEventDetails.status)&&
  Objects.equals(this.rlResourceType, objRateLimiterEventDetails.rlResourceType)&&
  Objects.equals(this.errorMessage, objRateLimiterEventDetails.errorMessage)&&
  Objects.equals(this.rlResourceName, objRateLimiterEventDetails.rlResourceName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RateLimiterEventDetails {\n");
      sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    rlResourceName: ").append(toIndentedString(rlResourceName)).append("\n");
        sb.append("    rlResourceType: ").append(toIndentedString(rlResourceType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
