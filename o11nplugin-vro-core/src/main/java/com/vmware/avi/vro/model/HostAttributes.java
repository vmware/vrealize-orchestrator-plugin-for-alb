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
 * The HostAttributes is a POJO class extends AviRestResource that used for creating
 * HostAttributes.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HostAttributes")
@VsoFinder(name = Constants.FINDER_VRO_HOSTATTRIBUTES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HostAttributes extends AviRestResource {
  @JsonProperty("attr_key")
  @JsonInclude(Include.NON_NULL)
  private String attrKey = null;

  @JsonProperty("attr_val")
  @JsonInclude(Include.NON_NULL)
  private String attrVal = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property attr_key of obj type hostattributes field type str  type string.
   * @return attrKey
   */
  @VsoMethod
  public String getAttrKey() {
    return attrKey;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property attr_key of obj type hostattributes field type str  type string.
   * @param attrKey set the attrKey.
   */
  @VsoMethod
  public void setAttrKey(String  attrKey) {
    this.attrKey = attrKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property attr_val of obj type hostattributes field type str  type string.
   * @return attrVal
   */
  @VsoMethod
  public String getAttrVal() {
    return attrVal;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property attr_val of obj type hostattributes field type str  type string.
   * @param attrVal set the attrVal.
   */
  @VsoMethod
  public void setAttrVal(String  attrVal) {
    this.attrVal = attrVal;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HostAttributes objHostAttributes = (HostAttributes) o;
  return   Objects.equals(this.attrKey, objHostAttributes.attrKey)&&
  Objects.equals(this.attrVal, objHostAttributes.attrVal);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HostAttributes {\n");
      sb.append("    attrKey: ").append(toIndentedString(attrKey)).append("\n");
        sb.append("    attrVal: ").append(toIndentedString(attrVal)).append("\n");
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
