package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * AuthMatchAttribute
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AuthMatchAttribute")
@VsoFinder(name = Constants.FINDER_VRO_AUTHMATCHATTRIBUTE, idAccessor = "getObjectID()")
@Service
public class AuthMatchAttribute extends AviRestResource  {
  @JsonProperty("criteria")
  private String criteria = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("values")
  @Valid
  private List<String> values = null;

  
  /**
   * rule match criteria. Enum options - AUTH_MATCH_CONTAINS, AUTH_MATCH_DOES_NOT_CONTAIN, AUTH_MATCH_REGEX.
   * @return criteria
  **/
  @ApiModelProperty(value = "rule match criteria. Enum options - AUTH_MATCH_CONTAINS, AUTH_MATCH_DOES_NOT_CONTAIN, AUTH_MATCH_REGEX.")


 
  @VsoMethod  
  public String getCriteria() {
    return criteria;
  }
    
  @VsoMethod
  public void setCriteria(String criteria) {
    this.criteria = criteria;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the object.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public AuthMatchAttribute addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }
  
  /**
   * values of AuthMatchAttribute.
   * @return values
  **/
  @ApiModelProperty(value = "values of AuthMatchAttribute.")


 
  @VsoMethod  
  public List<String> getValues() {
    return values;
  }
    
  @VsoMethod
  public void setValues(List<String> values) {
    this.values = values;
  }

  
  public String getObjectID() {
		return "AuthMatchAttribute";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthMatchAttribute authMatchAttribute = (AuthMatchAttribute) o;
    return Objects.equals(this.criteria, authMatchAttribute.criteria) &&
        Objects.equals(this.name, authMatchAttribute.name) &&
        Objects.equals(this.values, authMatchAttribute.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria, name, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMatchAttribute {\n");
    
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

