package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HTTPStatusMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ErrorPage is a POJO class extends AviRestResource that used for creating
 * ErrorPage.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ErrorPage")
@VsoFinder(name = Constants.FINDER_VRO_ERRORPAGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ErrorPage extends AviRestResource {
  @JsonProperty("enable")
  @JsonInclude(Include.NON_NULL)
  private Boolean enable = true;

  @JsonProperty("error_page_body_ref")
  @JsonInclude(Include.NON_NULL)
  private String errorPageBodyRef = null;

  @JsonProperty("error_redirect")
  @JsonInclude(Include.NON_NULL)
  private String errorRedirect = null;

  @JsonProperty("index")
  @JsonInclude(Include.NON_NULL)
  private Integer index = null;

  @JsonProperty("match")
  @JsonInclude(Include.NON_NULL)
  private HTTPStatusMatch match = null;



  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable the error page.
   * Field introduced in 17.2.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or disable the error page.
   * Field introduced in 17.2.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Custom error page body used to sent to the client.
   * It is a reference to an object of type errorpagebody.
   * Field introduced in 17.2.4.
   * @return errorPageBodyRef
   */
  @VsoMethod
  public String getErrorPageBodyRef() {
    return errorPageBodyRef;
  }

  /**
   * This is the setter method to the attribute.
   * Custom error page body used to sent to the client.
   * It is a reference to an object of type errorpagebody.
   * Field introduced in 17.2.4.
   * @param errorPageBodyRef set the errorPageBodyRef.
   */
  @VsoMethod
  public void setErrorPageBodyRef(String  errorPageBodyRef) {
    this.errorPageBodyRef = errorPageBodyRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Redirect sent to client when match.
   * Field introduced in 17.2.4.
   * @return errorRedirect
   */
  @VsoMethod
  public String getErrorRedirect() {
    return errorRedirect;
  }

  /**
   * This is the setter method to the attribute.
   * Redirect sent to client when match.
   * Field introduced in 17.2.4.
   * @param errorRedirect set the errorRedirect.
   */
  @VsoMethod
  public void setErrorRedirect(String  errorRedirect) {
    this.errorRedirect = errorRedirect;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Index of the error page.
   * Field introduced in 17.2.4.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the error page.
   * Field introduced in 17.2.4.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Add match criteria for http status codes to the error page.
   * Field introduced in 17.2.4.
   * @return match
   */
  @VsoMethod
  public HTTPStatusMatch getMatch() {
    return match;
  }

  /**
   * This is the setter method to the attribute.
   * Add match criteria for http status codes to the error page.
   * Field introduced in 17.2.4.
   * @param match set the match.
   */
  @VsoMethod
  public void setMatch(HTTPStatusMatch match) {
    this.match = match;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ErrorPage objErrorPage = (ErrorPage) o;
  return   Objects.equals(this.index, objErrorPage.index)&&
  Objects.equals(this.enable, objErrorPage.enable)&&
  Objects.equals(this.errorRedirect, objErrorPage.errorRedirect)&&
  Objects.equals(this.match, objErrorPage.match)&&
  Objects.equals(this.errorPageBodyRef, objErrorPage.errorPageBodyRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ErrorPage {\n");
      sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    errorPageBodyRef: ").append(toIndentedString(errorPageBodyRef)).append("\n");
        sb.append("    errorRedirect: ").append(toIndentedString(errorRedirect)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
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
