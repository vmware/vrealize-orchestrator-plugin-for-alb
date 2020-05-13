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
 * IngAttribute
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IngAttribute")
@VsoFinder(name = Constants.FINDER_VRO_INGATTRIBUTE, idAccessor = "getObjectID()")
@Service
public class IngAttribute extends AviRestResource  {
  @JsonProperty("attribute")
  private String attribute = null;

  @JsonProperty("value")
  private String value = null;

  
  /**
   * Attribute to match. Field introduced in 17.2.15, 18.1.5, 18.2.1.
   * @return attribute
  **/
  @ApiModelProperty(value = "Attribute to match. Field introduced in 17.2.15, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getAttribute() {
    return attribute;
  }
    
  @VsoMethod
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  
  /**
   * Attribute value. If not set, match any value. Field introduced in 17.2.15, 18.1.5, 18.2.1.
   * @return value
  **/
  @ApiModelProperty(value = "Attribute value. If not set, match any value. Field introduced in 17.2.15, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getValue() {
    return value;
  }
    
  @VsoMethod
  public void setValue(String value) {
    this.value = value;
  }

  
  public String getObjectID() {
		return "IngAttribute";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngAttribute ingAttribute = (IngAttribute) o;
    return Objects.equals(this.attribute, ingAttribute.attribute) &&
        Objects.equals(this.value, ingAttribute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngAttribute {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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

