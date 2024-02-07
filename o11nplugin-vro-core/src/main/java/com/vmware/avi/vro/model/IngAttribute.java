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
 * The IngAttribute is a POJO class extends AviRestResource that used for creating
 * IngAttribute.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IngAttribute")
@VsoFinder(name = Constants.FINDER_VRO_INGATTRIBUTE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IngAttribute extends AviRestResource {
    @JsonProperty("attribute")
    @JsonInclude(Include.NON_NULL)
    private String attribute;

    @JsonProperty("value")
    @JsonInclude(Include.NON_NULL)
    private String value;



  /**
   * This is the getter method this will return the attribute value.
   * Attribute to match.
   * Field introduced in 17.2.15, 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attribute
   */
  @VsoMethod
  public String getAttribute() {
    return attribute;
  }

  /**
   * This is the setter method to the attribute.
   * Attribute to match.
   * Field introduced in 17.2.15, 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param attribute set the attribute.
   */
  @VsoMethod
  public void setAttribute(String  attribute) {
    this.attribute = attribute;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Attribute value.
   * If not set, match any value.
   * Field introduced in 17.2.15, 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return value
   */
  @VsoMethod
  public String getValue() {
    return value;
  }

  /**
   * This is the setter method to the attribute.
   * Attribute value.
   * If not set, match any value.
   * Field introduced in 17.2.15, 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  IngAttribute objIngAttribute = (IngAttribute) o;
  return   Objects.equals(this.attribute, objIngAttribute.attribute)&&
  Objects.equals(this.value, objIngAttribute.value);
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

