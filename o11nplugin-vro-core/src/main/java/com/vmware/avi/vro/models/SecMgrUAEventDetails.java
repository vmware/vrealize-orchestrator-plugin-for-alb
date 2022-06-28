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
 * The SecMgrUAEventDetails is a POJO class extends AviRestResource that used for creating
 * SecMgrUAEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SecMgrUAEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SECMGRUAEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SecMgrUAEventDetails extends AviRestResource {
    @JsonProperty("error")
    @JsonInclude(Include.NON_NULL)
    private String error = null;



  /**
   * This is the getter method this will return the attribute value.
   * Error descibing ua cache status in controller.
   * Field introduced in 21.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return error
   */
  @VsoMethod
  public String getError() {
    return error;
  }

  /**
   * This is the setter method to the attribute.
   * Error descibing ua cache status in controller.
   * Field introduced in 21.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param error set the error.
   */
  @VsoMethod
  public void setError(String  error) {
    this.error = error;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SecMgrUAEventDetails objSecMgrUAEventDetails = (SecMgrUAEventDetails) o;
  return   Objects.equals(this.error, objSecMgrUAEventDetails.error);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SecMgrUAEventDetails {\n");
      sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

