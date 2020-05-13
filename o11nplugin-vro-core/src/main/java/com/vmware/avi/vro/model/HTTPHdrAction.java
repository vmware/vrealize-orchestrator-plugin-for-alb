package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPCookieData;
import com.vmware.avi.vro.model.HTTPHdrData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * HTTPHdrAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPHdrAction")
@VsoFinder(name = Constants.FINDER_VRO_HTTPHDRACTION, idAccessor = "getObjectID()")
@Service
public class HTTPHdrAction extends AviRestResource  {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("cookie")
  private HTTPCookieData cookie = null;

  @JsonProperty("hdr")
  private HTTPHdrData hdr = null;

  
  /**
   * ADD  A new header with the new value is added irrespective of the existence of an HTTP header of the given name. REPLACE  A new header with the new value is added if no header of the given name exists, else existing headers with the given name are removed and a new header with the new value is added. REMOVE  All the headers of the given name are removed. Enum options - HTTP_ADD_HDR, HTTP_REMOVE_HDR, HTTP_REPLACE_HDR.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "ADD  A new header with the new value is added irrespective of the existence of an HTTP header of the given name. REPLACE  A new header with the new value is added if no header of the given name exists, else existing headers with the given name are removed and a new header with the new value is added. REMOVE  All the headers of the given name are removed. Enum options - HTTP_ADD_HDR, HTTP_REMOVE_HDR, HTTP_REPLACE_HDR.")
  @NotNull


 
  @VsoMethod  
  public String getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   * Cookie information.
   * @return cookie
  **/
  @ApiModelProperty(value = "Cookie information.")

  @Valid

 
  @VsoMethod  
  public HTTPCookieData getCookie() {
    return cookie;
  }
    
  @VsoMethod
  public void setCookie(HTTPCookieData cookie) {
    this.cookie = cookie;
  }

  
  /**
   * HTTP header information.
   * @return hdr
  **/
  @ApiModelProperty(value = "HTTP header information.")

  @Valid

 
  @VsoMethod  
  public HTTPHdrData getHdr() {
    return hdr;
  }
    
  @VsoMethod
  public void setHdr(HTTPHdrData hdr) {
    this.hdr = hdr;
  }

  
  public String getObjectID() {
		return "HTTPHdrAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPHdrAction htTPHdrAction = (HTTPHdrAction) o;
    return Objects.equals(this.action, htTPHdrAction.action) &&
        Objects.equals(this.cookie, htTPHdrAction.cookie) &&
        Objects.equals(this.hdr, htTPHdrAction.hdr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, cookie, hdr);
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

