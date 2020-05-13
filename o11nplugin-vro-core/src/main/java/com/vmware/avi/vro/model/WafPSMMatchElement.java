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
 * WafPSMMatchElement
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafPSMMatchElement")
@VsoFinder(name = Constants.FINDER_VRO_WAFPSMMATCHELEMENT, idAccessor = "getObjectID()")
@Service
public class WafPSMMatchElement extends AviRestResource  {
  @JsonProperty("excluded")
  private Boolean excluded = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("sub_element")
  private String subElement = null;

  
  /**
   * Mark this element excluded, like in '!ARGS password'. Field introduced in 18.2.3.
   * @return excluded
  **/
  @ApiModelProperty(value = "Mark this element excluded, like in '!ARGS password'. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isExcluded() {
    return excluded;
  }
    
  @VsoMethod
  public void setExcluded(Boolean excluded) {
    this.excluded = excluded;
  }

  
  /**
   * Match_element index. Field introduced in 18.2.3.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Match_element index. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public Integer getIndex() {
    return index;
  }
    
  @VsoMethod
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  /**
   * The variable specification. For example ARGS or REQUEST_COOKIES. This can be a scalar like PATH_INFO. Enum options - WAF_VARIABLE_ARGS, WAF_VARIABLE_ARGS_GET, WAF_VARIABLE_ARGS_POST, WAF_VARIABLE_ARGS_NAMES, WAF_VARIABLE_REQUEST_COOKIES, WAF_VARIABLE_QUERY_STRING, WAF_VARIABLE_REQUEST_BASENAME, WAF_VARIABLE_REQUEST_URI, WAF_VARIABLE_PATH_INFO. Field introduced in 18.2.3.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The variable specification. For example ARGS or REQUEST_COOKIES. This can be a scalar like PATH_INFO. Enum options - WAF_VARIABLE_ARGS, WAF_VARIABLE_ARGS_GET, WAF_VARIABLE_ARGS_POST, WAF_VARIABLE_ARGS_NAMES, WAF_VARIABLE_REQUEST_COOKIES, WAF_VARIABLE_QUERY_STRING, WAF_VARIABLE_REQUEST_BASENAME, WAF_VARIABLE_REQUEST_URI, WAF_VARIABLE_PATH_INFO. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The name of the request collection element. This can be empty, if we address the whole collection or a scalar element. Field introduced in 18.2.3.
   * @return subElement
  **/
  @ApiModelProperty(value = "The name of the request collection element. This can be empty, if we address the whole collection or a scalar element. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getSubElement() {
    return subElement;
  }
    
  @VsoMethod
  public void setSubElement(String subElement) {
    this.subElement = subElement;
  }

  
  public String getObjectID() {
		return "WafPSMMatchElement";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafPSMMatchElement wafPSMMatchElement = (WafPSMMatchElement) o;
    return Objects.equals(this.excluded, wafPSMMatchElement.excluded) &&
        Objects.equals(this.index, wafPSMMatchElement.index) &&
        Objects.equals(this.name, wafPSMMatchElement.name) &&
        Objects.equals(this.subElement, wafPSMMatchElement.subElement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excluded, index, name, subElement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafPSMMatchElement {\n");
    
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subElement: ").append(toIndentedString(subElement)).append("\n");
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

