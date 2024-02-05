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
 * The NsxtSIServiceDetails is a POJO class extends AviRestResource that used for creating
 * NsxtSIServiceDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtSIServiceDetails")
@VsoFinder(name = Constants.FINDER_VRO_NSXTSISERVICEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtSIServiceDetails extends AviRestResource {
    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString;

    @JsonProperty("service")
    @JsonInclude(Include.NON_NULL)
    private String service;



  /**
   * This is the getter method this will return the attribute value.
   * Error message.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Error message.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Nsx-t serviceinsertion service name.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return service
   */
  @VsoMethod
  public String getService() {
    return service;
  }

  /**
   * This is the setter method to the attribute.
   * Nsx-t serviceinsertion service name.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param service set the service.
   */
  @VsoMethod
  public void setService(String  service) {
    this.service = service;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NsxtSIServiceDetails objNsxtSIServiceDetails = (NsxtSIServiceDetails) o;
  return   Objects.equals(this.service, objNsxtSIServiceDetails.service)&&
  Objects.equals(this.errorString, objNsxtSIServiceDetails.errorString);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtSIServiceDetails {\n");
      sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

