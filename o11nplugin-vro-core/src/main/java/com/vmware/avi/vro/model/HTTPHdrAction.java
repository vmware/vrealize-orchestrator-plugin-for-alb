package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HTTPCookieData;
import com.vmware.avi.vro.model.HTTPHdrData;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HTTPHdrAction is a POJO class extends AviRestResource that used for creating
 * HTTPHdrAction.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPHdrAction")
@VsoFinder(name = Constants.FINDER_VRO_HTTPHDRACTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPHdrAction extends AviRestResource {
  @JsonProperty("action")
  @JsonInclude(Include.NON_NULL)
  private String action = null;

  @JsonProperty("cookie")
  @JsonInclude(Include.NON_NULL)
  private HTTPCookieData cookie = null;

  @JsonProperty("hdr")
  @JsonInclude(Include.NON_NULL)
  private HTTPHdrData hdr = null;



  /**
   * This is the getter method this will return the attribute value.
   * Add  a new header with the new value is added irrespective of the existence of an http header of the given name.
   * Replace  a new header with the new value is added if no header of the given name exists, else existing headers with the given name are removed
   * and a new header with the new value is added.
   * Remove  all the headers of the given name are removed.
   * Enum options - HTTP_ADD_HDR, HTTP_REMOVE_HDR, HTTP_REPLACE_HDR.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Add  a new header with the new value is added irrespective of the existence of an http header of the given name.
   * Replace  a new header with the new value is added if no header of the given name exists, else existing headers with the given name are removed
   * and a new header with the new value is added.
   * Remove  all the headers of the given name are removed.
   * Enum options - HTTP_ADD_HDR, HTTP_REMOVE_HDR, HTTP_REPLACE_HDR.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cookie information.
   * @return cookie
   */
  @VsoMethod
  public HTTPCookieData getCookie() {
    return cookie;
  }

  /**
   * This is the setter method to the attribute.
   * Cookie information.
   * @param cookie set the cookie.
   */
  @VsoMethod
  public void setCookie(HTTPCookieData cookie) {
    this.cookie = cookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http header information.
   * @return hdr
   */
  @VsoMethod
  public HTTPHdrData getHdr() {
    return hdr;
  }

  /**
   * This is the setter method to the attribute.
   * Http header information.
   * @param hdr set the hdr.
   */
  @VsoMethod
  public void setHdr(HTTPHdrData hdr) {
    this.hdr = hdr;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPHdrAction objHTTPHdrAction = (HTTPHdrAction) o;
  return   Objects.equals(this.action, objHTTPHdrAction.action)&&
  Objects.equals(this.cookie, objHTTPHdrAction.cookie)&&
  Objects.equals(this.hdr, objHTTPHdrAction.hdr);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPHdrAction {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
        sb.append("    hdr: ").append(toIndentedString(hdr)).append("\n");
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
