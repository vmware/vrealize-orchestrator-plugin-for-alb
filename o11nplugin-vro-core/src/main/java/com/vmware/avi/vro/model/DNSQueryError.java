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
 * The DNSQueryError is a POJO class extends AviRestResource that used for creating
 * DNSQueryError.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DNSQueryError")
@VsoFinder(name = Constants.FINDER_VRO_DNSQUERYERROR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DNSQueryError extends AviRestResource {
    @JsonProperty("error")
    @JsonInclude(Include.NON_NULL)
    private String error = null;

    @JsonProperty("error_message")
    @JsonInclude(Include.NON_NULL)
    private String errorMessage = null;

    @JsonProperty("fqdn")
    @JsonInclude(Include.NON_NULL)
    private String fqdn = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property error of obj type dnsqueryerror field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return error
   */
  @VsoMethod
  public String getError() {
    return error;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property error of obj type dnsqueryerror field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param error set the error.
   */
  @VsoMethod
  public void setError(String  error) {
    this.error = error;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property error_message of obj type dnsqueryerror field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorMessage
   */
  @VsoMethod
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property error_message of obj type dnsqueryerror field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorMessage set the errorMessage.
   */
  @VsoMethod
  public void setErrorMessage(String  errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property fqdn of obj type dnsqueryerror field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fqdn
   */
  @VsoMethod
  public String getFqdn() {
    return fqdn;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property fqdn of obj type dnsqueryerror field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fqdn set the fqdn.
   */
  @VsoMethod
  public void setFqdn(String  fqdn) {
    this.fqdn = fqdn;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DNSQueryError objDNSQueryError = (DNSQueryError) o;
  return   Objects.equals(this.fqdn, objDNSQueryError.fqdn)&&
  Objects.equals(this.error, objDNSQueryError.error)&&
  Objects.equals(this.errorMessage, objDNSQueryError.errorMessage);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DNSQueryError {\n");
      sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
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

