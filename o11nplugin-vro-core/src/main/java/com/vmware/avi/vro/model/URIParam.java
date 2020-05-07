package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.URIParamToken;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * URIParam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "URIParam")
@VsoFinder(name = Constants.FINDER_VRO_URIPARAM, idAccessor = "getObjectID()")
@Service
public class URIParam extends AviRestResource  {
  @JsonProperty("tokens")
  @Valid
  private List<URIParamToken> tokens = null;

  @JsonProperty("type")
  private String type = null;

  
  public URIParam addTokensItem(URIParamToken tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<URIParamToken>();
    }
    this.tokens.add(tokensItem);
    return this;
  }
  
  /**
   * Token config either for the URI components or a constant string.
   * @return tokens
  **/
  @ApiModelProperty(value = "Token config either for the URI components or a constant string.")

  @Valid

 
  @VsoMethod  
  public List<URIParamToken> getTokens() {
    return tokens;
  }
    
  @VsoMethod
  public void setTokens(List<URIParamToken> tokens) {
    this.tokens = tokens;
  }

  
  /**
   * URI param type. Enum options - URI_PARAM_TYPE_TOKENIZED.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "URI param type. Enum options - URI_PARAM_TYPE_TOKENIZED.")
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
		return "URIParam";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    URIParam urIParam = (URIParam) o;
    return Objects.equals(this.tokens, urIParam.tokens) &&
        Objects.equals(this.type, urIParam.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokens, type);
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

