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
 * The URIParam is a POJO class extends AviRestResource that used for creating
 * URIParam.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "URIParam")
@VsoFinder(name = Constants.FINDER_VRO_URIPARAM)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class URIParam extends AviRestResource {
  @JsonProperty("tokens")
  @JsonInclude(Include.NON_NULL)
  private List<URIParamToken> tokens = null;

  @JsonProperty("type")
  @JsonInclude(Include.NON_NULL)
  private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Token config either for the uri components or a constant string.
   * @return tokens
   */
  @VsoMethod
  public List<URIParamToken> getTokens() {
    return tokens;
  }

  /**
   * This is the setter method. this will set the tokens
   * Token config either for the uri components or a constant string.
   * @return tokens
   */
  @VsoMethod
  public void setTokens(List<URIParamToken>  tokens) {
    this.tokens = tokens;
  }

  /**
   * This is the setter method this will set the tokens
   * Token config either for the uri components or a constant string.
   * @return tokens
   */
  @VsoMethod
  public URIParam addTokensItem(URIParamToken tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<URIParamToken>();
    }
    this.tokens.add(tokensItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Uri param type.
   * Enum options - URI_PARAM_TYPE_TOKENIZED.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Uri param type.
   * Enum options - URI_PARAM_TYPE_TOKENIZED.
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
  URIParam objURIParam = (URIParam) o;
  return   Objects.equals(this.type, objURIParam.type)&&
  Objects.equals(this.tokens, objURIParam.tokens);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class URIParam {\n");
      sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
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

