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
 * CustomParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CustomParams")
@VsoFinder(name = Constants.FINDER_VRO_CUSTOMPARAMS, idAccessor = "getObjectID()")
@Service
public class CustomParams extends AviRestResource  {
  @JsonProperty("is_dynamic")
  private Boolean isDynamic = null;

  @JsonProperty("is_sensitive")
  private Boolean isSensitive = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  
  /**
   * Placeholder for description of property is_dynamic of obj type CustomParams field type str  type boolean
   * @return isDynamic
  **/
  @ApiModelProperty(value = "Placeholder for description of property is_dynamic of obj type CustomParams field type str  type boolean")


 
  @VsoMethod  
  public Boolean isIsDynamic() {
    return isDynamic;
  }
    
  @VsoMethod
  public void setIsDynamic(Boolean isDynamic) {
    this.isDynamic = isDynamic;
  }

  
  /**
   * Placeholder for description of property is_sensitive of obj type CustomParams field type str  type boolean
   * @return isSensitive
  **/
  @ApiModelProperty(value = "Placeholder for description of property is_sensitive of obj type CustomParams field type str  type boolean")


 
  @VsoMethod  
  public Boolean isIsSensitive() {
    return isSensitive;
  }
    
  @VsoMethod
  public void setIsSensitive(Boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
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
   * value of CustomParams.
   * @return value
  **/
  @ApiModelProperty(value = "value of CustomParams.")


 
  @VsoMethod  
  public String getValue() {
    return value;
  }
    
  @VsoMethod
  public void setValue(String value) {
    this.value = value;
  }

  
  public String getObjectID() {
		return "CustomParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomParams customParams = (CustomParams) o;
    return Objects.equals(this.isDynamic, customParams.isDynamic) &&
        Objects.equals(this.isSensitive, customParams.isSensitive) &&
        Objects.equals(this.name, customParams.name) &&
        Objects.equals(this.value, customParams.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDynamic, isSensitive, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomParams {\n");
    
    sb.append("    isDynamic: ").append(toIndentedString(isDynamic)).append("\n");
    sb.append("    isSensitive: ").append(toIndentedString(isSensitive)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

