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
 * The URIParamToken is a POJO class extends AviRestResource that used for creating
 * URIParamToken.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "URIParamToken")
@VsoFinder(name = Constants.FINDER_VRO_URIPARAMTOKEN)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class URIParamToken extends AviRestResource {
    @JsonProperty("end_index")
    @JsonInclude(Include.NON_NULL)
    private Integer endIndex = null;

    @JsonProperty("start_index")
    @JsonInclude(Include.NON_NULL)
    private Integer startIndex = null;

    @JsonProperty("str_value")
    @JsonInclude(Include.NON_NULL)
    private String strValue = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Index of the ending token in the incoming uri.
   * Allowed values are 0-65534.
   * Special values are 65535 - end of string.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endIndex
   */
  @VsoMethod
  public Integer getEndIndex() {
    return endIndex;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the ending token in the incoming uri.
   * Allowed values are 0-65534.
   * Special values are 65535 - end of string.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endIndex set the endIndex.
   */
  @VsoMethod
  public void setEndIndex(Integer  endIndex) {
    this.endIndex = endIndex;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Index of the starting token in the incoming uri.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startIndex
   */
  @VsoMethod
  public Integer getStartIndex() {
    return startIndex;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the starting token in the incoming uri.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startIndex set the startIndex.
   */
  @VsoMethod
  public void setStartIndex(Integer  startIndex) {
    this.startIndex = startIndex;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Constant string to use as a token.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return strValue
   */
  @VsoMethod
  public String getStrValue() {
    return strValue;
  }

  /**
   * This is the setter method to the attribute.
   * Constant string to use as a token.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param strValue set the strValue.
   */
  @VsoMethod
  public void setStrValue(String  strValue) {
    this.strValue = strValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Token type for constructing the uri.
   * Enum options - URI_TOKEN_TYPE_HOST, URI_TOKEN_TYPE_PATH, URI_TOKEN_TYPE_STRING, URI_TOKEN_TYPE_STRING_GROUP, URI_TOKEN_TYPE_REGEX.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Token type for constructing the uri.
   * Enum options - URI_TOKEN_TYPE_HOST, URI_TOKEN_TYPE_PATH, URI_TOKEN_TYPE_STRING, URI_TOKEN_TYPE_STRING_GROUP, URI_TOKEN_TYPE_REGEX.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  URIParamToken objURIParamToken = (URIParamToken) o;
  return   Objects.equals(this.type, objURIParamToken.type)&&
  Objects.equals(this.startIndex, objURIParamToken.startIndex)&&
  Objects.equals(this.endIndex, objURIParamToken.endIndex)&&
  Objects.equals(this.strValue, objURIParamToken.strValue);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class URIParamToken {\n");
      sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    strValue: ").append(toIndentedString(strValue)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

