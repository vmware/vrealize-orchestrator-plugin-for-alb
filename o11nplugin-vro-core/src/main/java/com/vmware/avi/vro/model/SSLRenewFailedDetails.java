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
 * The SSLRenewFailedDetails is a POJO class extends AviRestResource that used for creating
 * SSLRenewFailedDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSLRenewFailedDetails")
@VsoFinder(name = Constants.FINDER_VRO_SSLRENEWFAILEDDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSLRenewFailedDetails extends AviRestResource {
  @JsonProperty("error")
  @JsonInclude(Include.NON_NULL)
  private String error = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;



  /**
   * This is the getter method this will return the attribute value.
   * Error when renewing certificate.
   * @return error
   */
  @VsoMethod
  public String getError() {
    return error;
  }

  /**
   * This is the setter method to the attribute.
   * Error when renewing certificate.
   * @param error set the error.
   */
  @VsoMethod
  public void setError(String  error) {
    this.error = error;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of ssl certificate.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of ssl certificate.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SSLRenewFailedDetails objSSLRenewFailedDetails = (SSLRenewFailedDetails) o;
  return   Objects.equals(this.name, objSSLRenewFailedDetails.name)&&
  Objects.equals(this.error, objSSLRenewFailedDetails.error);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SSLRenewFailedDetails {\n");
      sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
