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
 * The CustomParams is a POJO class extends AviRestResource that used for creating
 * CustomParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CustomParams")
@VsoFinder(name = Constants.FINDER_VRO_CUSTOMPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CustomParams extends AviRestResource {
    @JsonProperty("is_dynamic")
    @JsonInclude(Include.NON_NULL)
    private Boolean isDynamic = false;

    @JsonProperty("is_sensitive")
    @JsonInclude(Include.NON_NULL)
    private Boolean isSensitive = false;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("value")
    @JsonInclude(Include.NON_NULL)
    private String value = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isDynamic
   */
  @VsoMethod
  public Boolean getIsDynamic() {
    return isDynamic;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isDynamic set the isDynamic.
   */
  @VsoMethod
  public void setIsDynamic(Boolean  isDynamic) {
    this.isDynamic = isDynamic;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isSensitive
   */
  @VsoMethod
  public Boolean getIsSensitive() {
    return isSensitive;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isSensitive set the isSensitive.
   */
  @VsoMethod
  public void setIsSensitive(Boolean  isSensitive) {
    this.isSensitive = isSensitive;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
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
  CustomParams objCustomParams = (CustomParams) o;
  return   Objects.equals(this.name, objCustomParams.name)&&
  Objects.equals(this.value, objCustomParams.value)&&
  Objects.equals(this.isSensitive, objCustomParams.isSensitive)&&
  Objects.equals(this.isDynamic, objCustomParams.isDynamic);
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

