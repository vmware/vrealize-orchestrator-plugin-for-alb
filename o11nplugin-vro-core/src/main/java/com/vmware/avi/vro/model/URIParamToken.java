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
 * URIParamToken
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "URIParamToken")
@VsoFinder(name = Constants.FINDER_VRO_URIPARAMTOKEN, idAccessor = "getObjectID()")
@Service
public class URIParamToken extends AviRestResource  {
  @JsonProperty("end_index")
  private Integer endIndex = null;

  @JsonProperty("start_index")
  private Integer startIndex = null;

  @JsonProperty("str_value")
  private String strValue = null;

  @JsonProperty("type")
  private String type = null;

  
  /**
   * Index of the ending token in the incoming URI. Allowed values are 0-65534. Special values are 65535 - 'end of string'.
   * @return endIndex
  **/
  @ApiModelProperty(value = "Index of the ending token in the incoming URI. Allowed values are 0-65534. Special values are 65535 - 'end of string'.")


 
  @VsoMethod  
  public Integer getEndIndex() {
    return endIndex;
  }
    
  @VsoMethod
  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  
  /**
   * Index of the starting token in the incoming URI.
   * @return startIndex
  **/
  @ApiModelProperty(value = "Index of the starting token in the incoming URI.")


 
  @VsoMethod  
  public Integer getStartIndex() {
    return startIndex;
  }
    
  @VsoMethod
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  
  /**
   * Constant string to use as a token.
   * @return strValue
  **/
  @ApiModelProperty(value = "Constant string to use as a token.")


 
  @VsoMethod  
  public String getStrValue() {
    return strValue;
  }
    
  @VsoMethod
  public void setStrValue(String strValue) {
    this.strValue = strValue;
  }

  
  /**
   * Token type for constructing the URI. Enum options - URI_TOKEN_TYPE_HOST, URI_TOKEN_TYPE_PATH, URI_TOKEN_TYPE_STRING, URI_TOKEN_TYPE_STRING_GROUP, URI_TOKEN_TYPE_REGEX.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Token type for constructing the URI. Enum options - URI_TOKEN_TYPE_HOST, URI_TOKEN_TYPE_PATH, URI_TOKEN_TYPE_STRING, URI_TOKEN_TYPE_STRING_GROUP, URI_TOKEN_TYPE_REGEX.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "URIParamToken";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    URIParamToken urIParamToken = (URIParamToken) o;
    return Objects.equals(this.endIndex, urIParamToken.endIndex) &&
        Objects.equals(this.startIndex, urIParamToken.startIndex) &&
        Objects.equals(this.strValue, urIParamToken.strValue) &&
        Objects.equals(this.type, urIParamToken.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endIndex, startIndex, strValue, type);
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

