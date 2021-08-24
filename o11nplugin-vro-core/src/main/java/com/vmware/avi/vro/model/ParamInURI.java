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
 * The ParamInURI is a POJO class extends AviRestResource that used for creating
 * ParamInURI.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ParamInURI")
@VsoFinder(name = Constants.FINDER_VRO_PARAMINURI)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ParamInURI extends AviRestResource {
    @JsonProperty("param_name")
    @JsonInclude(Include.NON_NULL)
    private String paramName = null;

    @JsonProperty("value")
    @JsonInclude(Include.NON_NULL)
    private String value = null;



  /**
   * This is the getter method this will return the attribute value.
   * Param name in hitted signature rule match_element.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramName
   */
  @VsoMethod
  public String getParamName() {
    return paramName;
  }

  /**
   * This is the setter method to the attribute.
   * Param name in hitted signature rule match_element.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param paramName set the paramName.
   */
  @VsoMethod
  public void setParamName(String  paramName) {
    this.paramName = paramName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Param value in hitted signature rule match_element.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return value
   */
  @VsoMethod
  public String getValue() {
    return value;
  }

  /**
   * This is the setter method to the attribute.
   * Param value in hitted signature rule match_element.
   * Field introduced in 21.1.1.
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
  ParamInURI objParamInURI = (ParamInURI) o;
  return   Objects.equals(this.paramName, objParamInURI.paramName)&&
  Objects.equals(this.value, objParamInURI.value);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ParamInURI {\n");
      sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
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

