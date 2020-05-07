package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPLocalFile;
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
 * FailActionHTTPLocalResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:16:36.466+05:30")

@VsoObject(create = false, name = "FailActionHTTPLocalResponse")
@VsoFinder(name = Constants.FINDER_VRO_FAILACTIONHTTPLOCALRESPONSE, idAccessor = "getObjectID()")
@Service
public class FailActionHTTPLocalResponse extends AviRestResource  {
  @JsonProperty("file")
  private HTTPLocalFile file = null;

  @JsonProperty("status_code")
  private String statusCode = "FAIL_HTTP_STATUS_CODE_503";

  
  /**
   * Placeholder for description of property file of obj type FailActionHTTPLocalResponse field type str  type object
   * @return file
  **/
  @ApiModelProperty(value = "Placeholder for description of property file of obj type FailActionHTTPLocalResponse field type str  type object")

  @Valid

 
  @VsoMethod  
  public HTTPLocalFile getFile() {
    return file;
  }
    
  @VsoMethod
  public void setFile(HTTPLocalFile file) {
    this.file = file;
  }

  
  /**
   *  Enum options - FAIL_HTTP_STATUS_CODE_200, FAIL_HTTP_STATUS_CODE_503.
   * @return statusCode
  **/
  @ApiModelProperty(value = " Enum options - FAIL_HTTP_STATUS_CODE_200, FAIL_HTTP_STATUS_CODE_503.")


 
  @VsoMethod  
  public String getStatusCode() {
    return statusCode;
  }
    
  @VsoMethod
  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  
  public String getObjectID() {
		return "FailActionHTTPLocalResponse";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailActionHTTPLocalResponse failActionHTTPLocalResponse = (FailActionHTTPLocalResponse) o;
    return Objects.equals(this.file, failActionHTTPLocalResponse.file) &&
        Objects.equals(this.statusCode, failActionHTTPLocalResponse.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailActionHTTPLocalResponse {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

