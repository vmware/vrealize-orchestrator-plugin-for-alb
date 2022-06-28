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
 * The WafContentTypeMapping is a POJO class extends AviRestResource that used for creating
 * WafContentTypeMapping.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafContentTypeMapping")
@VsoFinder(name = Constants.FINDER_VRO_WAFCONTENTTYPEMAPPING)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafContentTypeMapping extends AviRestResource {
    @JsonProperty("content_type")
    @JsonInclude(Include.NON_NULL)
    private String contentType = null;

    @JsonProperty("request_body_parser")
    @JsonInclude(Include.NON_NULL)
    private String requestBodyParser = null;



  /**
   * This is the getter method this will return the attribute value.
   * Request content-type.
   * When it is equal to request content-type header value, the specified request_body_parser is used.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return contentType
   */
  @VsoMethod
  public String getContentType() {
    return contentType;
  }

  /**
   * This is the setter method to the attribute.
   * Request content-type.
   * When it is equal to request content-type header value, the specified request_body_parser is used.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param contentType set the contentType.
   */
  @VsoMethod
  public void setContentType(String  contentType) {
    this.contentType = contentType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request body parser.
   * Enum options - WAF_REQUEST_PARSER_URLENCODED, WAF_REQUEST_PARSER_MULTIPART, WAF_REQUEST_PARSER_JSON, WAF_REQUEST_PARSER_XML,
   * WAF_REQUEST_PARSER_HANDLE_AS_STRING, WAF_REQUEST_PARSER_DO_NOT_PARSE.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestBodyParser
   */
  @VsoMethod
  public String getRequestBodyParser() {
    return requestBodyParser;
  }

  /**
   * This is the setter method to the attribute.
   * Request body parser.
   * Enum options - WAF_REQUEST_PARSER_URLENCODED, WAF_REQUEST_PARSER_MULTIPART, WAF_REQUEST_PARSER_JSON, WAF_REQUEST_PARSER_XML,
   * WAF_REQUEST_PARSER_HANDLE_AS_STRING, WAF_REQUEST_PARSER_DO_NOT_PARSE.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param requestBodyParser set the requestBodyParser.
   */
  @VsoMethod
  public void setRequestBodyParser(String  requestBodyParser) {
    this.requestBodyParser = requestBodyParser;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafContentTypeMapping objWafContentTypeMapping = (WafContentTypeMapping) o;
  return   Objects.equals(this.contentType, objWafContentTypeMapping.contentType)&&
  Objects.equals(this.requestBodyParser, objWafContentTypeMapping.requestBodyParser);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafContentTypeMapping {\n");
      sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    requestBodyParser: ").append(toIndentedString(requestBodyParser)).append("\n");
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

