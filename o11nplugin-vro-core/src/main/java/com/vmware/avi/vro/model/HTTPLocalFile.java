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
 * The HTTPLocalFile is a POJO class extends AviRestResource that used for creating
 * HTTPLocalFile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPLocalFile")
@VsoFinder(name = Constants.FINDER_VRO_HTTPLOCALFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPLocalFile extends AviRestResource {
    @JsonProperty("content_type")
    @JsonInclude(Include.NON_NULL)
    private String contentType;

    @JsonProperty("file_content")
    @JsonInclude(Include.NON_NULL)
    private String fileContent;



  /**
   * This is the getter method this will return the attribute value.
   * Mime-type of the content in the file.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return contentType
   */
  @VsoMethod
  public String getContentType() {
    return contentType;
  }

  /**
   * This is the setter method to the attribute.
   * Mime-type of the content in the file.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param contentType set the contentType.
   */
  @VsoMethod
  public void setContentType(String  contentType) {
    this.contentType = contentType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * File content to used in the local http response body.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fileContent
   */
  @VsoMethod
  public String getFileContent() {
    return fileContent;
  }

  /**
   * This is the setter method to the attribute.
   * File content to used in the local http response body.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fileContent set the fileContent.
   */
  @VsoMethod
  public void setFileContent(String  fileContent) {
    this.fileContent = fileContent;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPLocalFile objHTTPLocalFile = (HTTPLocalFile) o;
  return   Objects.equals(this.contentType, objHTTPLocalFile.contentType)&&
  Objects.equals(this.fileContent, objHTTPLocalFile.fileContent);
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

