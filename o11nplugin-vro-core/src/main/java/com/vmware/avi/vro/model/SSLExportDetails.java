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
 * The SSLExportDetails is a POJO class extends AviRestResource that used for creating
 * SSLExportDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSLExportDetails")
@VsoFinder(name = Constants.FINDER_VRO_SSLEXPORTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSLExportDetails extends AviRestResource {
    @JsonProperty("user")
    @JsonInclude(Include.NON_NULL)
    private String user = null;



  /**
   * This is the getter method this will return the attribute value.
   * Request user.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return user
   */
  @VsoMethod
  public String getUser() {
    return user;
  }

  /**
   * This is the setter method to the attribute.
   * Request user.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param user set the user.
   */
  @VsoMethod
  public void setUser(String  user) {
    this.user = user;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SSLExportDetails objSSLExportDetails = (SSLExportDetails) o;
  return   Objects.equals(this.user, objSSLExportDetails.user);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SSLExportDetails {\n");
      sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

