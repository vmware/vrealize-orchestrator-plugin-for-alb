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
 * ReplaceStringVar
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ReplaceStringVar")
@VsoFinder(name = Constants.FINDER_VRO_REPLACESTRINGVAR, idAccessor = "getObjectID()")
@Service
public class ReplaceStringVar extends AviRestResource  {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("val")
  private String val = null;

  
  /**
   * Type of replacement string - can be a variable exposed from datascript, value of an HTTP header or a custom user-input literal string. Enum options - DATASCRIPT_VAR, HTTP_HEADER_VAR, LITERAL_STRING.
   * @return type
  **/
  @ApiModelProperty(value = "Type of replacement string - can be a variable exposed from datascript, value of an HTTP header or a custom user-input literal string. Enum options - DATASCRIPT_VAR, HTTP_HEADER_VAR, LITERAL_STRING.")


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Value of the replacement string - name of variable exposed from datascript, name of the HTTP header or a custom user-input literal string.
   * @return val
  **/
  @ApiModelProperty(value = "Value of the replacement string - name of variable exposed from datascript, name of the HTTP header or a custom user-input literal string.")


 
  @VsoMethod  
  public String getVal() {
    return val;
  }
    
  @VsoMethod
  public void setVal(String val) {
    this.val = val;
  }

  
  public String getObjectID() {
		return "ReplaceStringVar";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceStringVar replaceStringVar = (ReplaceStringVar) o;
    return Objects.equals(this.type, replaceStringVar.type) &&
        Objects.equals(this.val, replaceStringVar.val);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, val);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceStringVar {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    val: ").append(toIndentedString(val)).append("\n");
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

