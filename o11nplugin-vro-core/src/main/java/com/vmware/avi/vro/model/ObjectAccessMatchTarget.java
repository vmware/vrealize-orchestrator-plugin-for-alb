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
 * The ObjectAccessMatchTarget is a POJO class extends AviRestResource that used for creating
 * ObjectAccessMatchTarget.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ObjectAccessMatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_OBJECTACCESSMATCHTARGET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ObjectAccessMatchTarget extends AviRestResource {
  @JsonProperty("label_key")
  @JsonInclude(Include.NON_NULL)
  private String labelKey = null;

  @JsonProperty("label_values")
  @JsonInclude(Include.NON_NULL)
  private List<String> labelValues = null;



  /**
   * This is the getter method this will return the attribute value.
   * Key of the label to be matched.
   * Field introduced in 18.2.7, 20.1.1.
   * @return labelKey
   */
  @VsoMethod
  public String getLabelKey() {
    return labelKey;
  }

  /**
   * This is the setter method to the attribute.
   * Key of the label to be matched.
   * Field introduced in 18.2.7, 20.1.1.
   * @param labelKey set the labelKey.
   */
  @VsoMethod
  public void setLabelKey(String  labelKey) {
    this.labelKey = labelKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Label values that result in a successful match.
   * Field introduced in 18.2.7, 20.1.1.
   * @return labelValues
   */
  @VsoMethod
  public List<String> getLabelValues() {
    return labelValues;
  }

  /**
   * This is the setter method. this will set the labelValues
   * Label values that result in a successful match.
   * Field introduced in 18.2.7, 20.1.1.
   * @return labelValues
   */
  @VsoMethod
  public void setLabelValues(List<String>  labelValues) {
    this.labelValues = labelValues;
  }

  /**
   * This is the setter method this will set the labelValues
   * Label values that result in a successful match.
   * Field introduced in 18.2.7, 20.1.1.
   * @return labelValues
   */
  @VsoMethod
  public ObjectAccessMatchTarget addLabelValuesItem(String labelValuesItem) {
    if (this.labelValues == null) {
      this.labelValues = new ArrayList<String>();
    }
    this.labelValues.add(labelValuesItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ObjectAccessMatchTarget objObjectAccessMatchTarget = (ObjectAccessMatchTarget) o;
  return   Objects.equals(this.labelValues, objObjectAccessMatchTarget.labelValues)&&
  Objects.equals(this.labelKey, objObjectAccessMatchTarget.labelKey);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ObjectAccessMatchTarget {\n");
      sb.append("    labelKey: ").append(toIndentedString(labelKey)).append("\n");
        sb.append("    labelValues: ").append(toIndentedString(labelValues)).append("\n");
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

