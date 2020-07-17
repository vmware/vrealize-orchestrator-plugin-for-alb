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
 * The Property is a POJO class extends AviRestResource that used for creating
 * Property.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Property")
@VsoFinder(name = Constants.FINDER_VRO_PROPERTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Property extends AviRestResource {
  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("value")
  @JsonInclude(Include.NON_NULL)
  private String value = null;



  /**
   * This is the getter method this will return the attribute value.
   * Property name.
   * Field introduced in 17.2.1.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Property name.
   * Field introduced in 17.2.1.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Property value.
   * Field introduced in 17.2.1.
   * @return value
   */
  @VsoMethod
  public String getValue() {
    return value;
  }

  /**
   * This is the setter method to the attribute.
   * Property value.
   * Field introduced in 17.2.1.
   * @param value set the value.
   */
  @VsoMethod
  public void setValue(String  value) {
    this.value = value;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Property objProperty = (Property) o;
  return   Objects.equals(this.name, objProperty.name)&&
  Objects.equals(this.value, objProperty.value);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Property {\n");
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

