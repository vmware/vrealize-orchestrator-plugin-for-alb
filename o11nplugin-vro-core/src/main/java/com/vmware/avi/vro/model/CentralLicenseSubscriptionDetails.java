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
 * The CentralLicenseSubscriptionDetails is a POJO class extends AviRestResource that used for creating
 * CentralLicenseSubscriptionDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CentralLicenseSubscriptionDetails")
@VsoFinder(name = Constants.FINDER_VRO_CENTRALLICENSESUBSCRIPTIONDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CentralLicenseSubscriptionDetails extends AviRestResource {
    @JsonProperty("message")
    @JsonInclude(Include.NON_NULL)
    private String message = null;



  /**
   * This is the getter method this will return the attribute value.
   * Message.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return message
   */
  @VsoMethod
  public String getMessage() {
    return message;
  }

  /**
   * This is the setter method to the attribute.
   * Message.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param message set the message.
   */
  @VsoMethod
  public void setMessage(String  message) {
    this.message = message;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CentralLicenseSubscriptionDetails objCentralLicenseSubscriptionDetails = (CentralLicenseSubscriptionDetails) o;
  return   Objects.equals(this.message, objCentralLicenseSubscriptionDetails.message);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CentralLicenseSubscriptionDetails {\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

