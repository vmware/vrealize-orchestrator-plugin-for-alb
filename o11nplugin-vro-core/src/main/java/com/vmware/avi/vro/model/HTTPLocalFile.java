package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * HTTPLocalFile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPLocalFile")
@VsoFinder(name = Constants.FINDER_VRO_HTTPLOCALFILE, idAccessor = "getObjectID()")
@Service
public class HTTPLocalFile extends AviRestResource  {
  @JsonProperty("content_type")
  private String contentType = null;

  @JsonProperty("file_content")
  private String fileContent = null;

  
  /**
   * Mime-type of the content in the file.
   * @return contentType
  **/
  @ApiModelProperty(required = true, value = "Mime-type of the content in the file.")
  @NotNull


 
  @VsoMethod  
  public String getContentType() {
    return contentType;
  }
    
  @VsoMethod
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  
  /**
   * File content to used in the local HTTP response body.
   * @return fileContent
  **/
  @ApiModelProperty(required = true, value = "File content to used in the local HTTP response body.")
  @NotNull


 
  @VsoMethod  
  public String getFileContent() {
    return fileContent;
  }
    
  @VsoMethod
  public void setFileContent(String fileContent) {
    this.fileContent = fileContent;
  }

  
  public String getObjectID() {
		return "HTTPLocalFile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPLocalFile htTPLocalFile = (HTTPLocalFile) o;
    return Objects.equals(this.contentType, htTPLocalFile.contentType) &&
        Objects.equals(this.fileContent, htTPLocalFile.fileContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, fileContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPLocalFile {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
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

