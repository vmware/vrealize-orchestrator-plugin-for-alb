package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPStatusMatch;
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
 * ErrorPage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ErrorPage")
@VsoFinder(name = Constants.FINDER_VRO_ERRORPAGE, idAccessor = "getObjectID()")
@Service
public class ErrorPage extends AviRestResource  {
  @JsonProperty("enable")
  private Boolean enable = true;

  @JsonProperty("error_page_body_ref")
  private String errorPageBodyRef = null;

  @JsonProperty("error_redirect")
  private String errorRedirect = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("match")
  private HTTPStatusMatch match = null;

  
  /**
   * Enable or disable the error page. Field introduced in 17.2.4.
   * @return enable
  **/
  @ApiModelProperty(value = "Enable or disable the error page. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Boolean isEnable() {
    return enable;
  }
    
  @VsoMethod
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  
  /**
   * Custom error page body used to sent to the client. It is a reference to an object of type ErrorPageBody. Field introduced in 17.2.4.
   * @return errorPageBodyRef
  **/
  @ApiModelProperty(value = "Custom error page body used to sent to the client. It is a reference to an object of type ErrorPageBody. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public String getErrorPageBodyRef() {
    return errorPageBodyRef;
  }
    
  @VsoMethod
  public void setErrorPageBodyRef(String errorPageBodyRef) {
    this.errorPageBodyRef = errorPageBodyRef;
  }

  
  /**
   * Redirect sent to client when match. Field introduced in 17.2.4.
   * @return errorRedirect
  **/
  @ApiModelProperty(value = "Redirect sent to client when match. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public String getErrorRedirect() {
    return errorRedirect;
  }
    
  @VsoMethod
  public void setErrorRedirect(String errorRedirect) {
    this.errorRedirect = errorRedirect;
  }

  
  /**
   * Index of the error page. Field introduced in 17.2.4.
   * @return index
  **/
  @ApiModelProperty(value = "Index of the error page. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public Integer getIndex() {
    return index;
  }
    
  @VsoMethod
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  /**
   * Add match criteria for http status codes to the error page. Field introduced in 17.2.4.
   * @return match
  **/
  @ApiModelProperty(value = "Add match criteria for http status codes to the error page. Field introduced in 17.2.4.")

  @Valid

 
  @VsoMethod  
  public HTTPStatusMatch getMatch() {
    return match;
  }
    
  @VsoMethod
  public void setMatch(HTTPStatusMatch match) {
    this.match = match;
  }

  
  public String getObjectID() {
		return "ErrorPage";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorPage errorPage = (ErrorPage) o;
    return Objects.equals(this.enable, errorPage.enable) &&
        Objects.equals(this.errorPageBodyRef, errorPage.errorPageBodyRef) &&
        Objects.equals(this.errorRedirect, errorPage.errorRedirect) &&
        Objects.equals(this.index, errorPage.index) &&
        Objects.equals(this.match, errorPage.match);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, errorPageBodyRef, errorRedirect, index, match);
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

