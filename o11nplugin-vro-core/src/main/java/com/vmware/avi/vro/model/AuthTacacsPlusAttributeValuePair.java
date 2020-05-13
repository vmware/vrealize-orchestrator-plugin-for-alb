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
 * AuthTacacsPlusAttributeValuePair
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AuthTacacsPlusAttributeValuePair")
@VsoFinder(name = Constants.FINDER_VRO_AUTHTACACSPLUSATTRIBUTEVALUEPAIR, idAccessor = "getObjectID()")
@Service
public class AuthTacacsPlusAttributeValuePair extends AviRestResource  {
  @JsonProperty("mandatory")
  private Boolean mandatory = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  
  /**
   * mandatory.
   * @return mandatory
  **/
  @ApiModelProperty(value = "mandatory.")


 
  @VsoMethod  
  public Boolean isMandatory() {
    return mandatory;
  }
    
  @VsoMethod
  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  
  /**
   * attribute name.
   * @return name
  **/
  @ApiModelProperty(value = "attribute name.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * attribute value.
   * @return value
  **/
  @ApiModelProperty(value = "attribute value.")


 
  @VsoMethod  
  public String getValue() {
    return value;
  }
    
  @VsoMethod
  public void setValue(String value) {
    this.value = value;
  }

  
  public String getObjectID() {
		return "AuthTacacsPlusAttributeValuePair";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthTacacsPlusAttributeValuePair authTacacsPlusAttributeValuePair = (AuthTacacsPlusAttributeValuePair) o;
    return Objects.equals(this.mandatory, authTacacsPlusAttributeValuePair.mandatory) &&
        Objects.equals(this.name, authTacacsPlusAttributeValuePair.name) &&
        Objects.equals(this.value, authTacacsPlusAttributeValuePair.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandatory, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthTacacsPlusAttributeValuePair {\n");
    
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
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

