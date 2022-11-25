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
 * The SingleOptionalStringField is a POJO class extends AviRestResource that used for creating
 * SingleOptionalStringField.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SingleOptionalStringField")
@VsoFinder(name = Constants.FINDER_VRO_SINGLEOPTIONALSTRINGFIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SingleOptionalStringField extends AviRestResource {
    @JsonProperty("test_string")
    @JsonInclude(Include.NON_NULL)
    private String testString = null;



  /**
   * This is the getter method this will return the attribute value.
   * Optional string field.
   * Field introduced in 21.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return testString
   */
  @VsoMethod
  public String getTestString() {
    return testString;
  }

  /**
   * This is the setter method to the attribute.
   * Optional string field.
   * Field introduced in 21.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param testString set the testString.
   */
  @VsoMethod
  public void setTestString(String  testString) {
    this.testString = testString;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SingleOptionalStringField objSingleOptionalStringField = (SingleOptionalStringField) o;
  return   Objects.equals(this.testString, objSingleOptionalStringField.testString);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SingleOptionalStringField {\n");
      sb.append("    testString: ").append(toIndentedString(testString)).append("\n");
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

