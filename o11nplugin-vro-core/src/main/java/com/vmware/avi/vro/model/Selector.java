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
 * The Selector is a POJO class extends AviRestResource that used for creating
 * Selector.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Selector")
@VsoFinder(name = Constants.FINDER_VRO_SELECTOR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Selector extends AviRestResource {
    @JsonProperty("labels")
    @JsonInclude(Include.NON_NULL)
    private List<KeyValueTuple> labels = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Labels as key value pairs to select on.
   * Field introduced in 20.1.3.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return labels
   */
  @VsoMethod
  public List<KeyValueTuple> getLabels() {
    return labels;
  }

  /**
   * This is the setter method. this will set the labels
   * Labels as key value pairs to select on.
   * Field introduced in 20.1.3.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return labels
   */
  @VsoMethod
  public void setLabels(List<KeyValueTuple>  labels) {
    this.labels = labels;
  }

  /**
   * This is the setter method this will set the labels
   * Labels as key value pairs to select on.
   * Field introduced in 20.1.3.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return labels
   */
  @VsoMethod
  public Selector addLabelsItem(KeyValueTuple labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<KeyValueTuple>();
    }
    this.labels.add(labelsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Selector type.
   * Enum options - SELECTOR_IPAM.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Selector type.
   * Enum options - SELECTOR_IPAM.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Selector objSelector = (Selector) o;
  return   Objects.equals(this.type, objSelector.type)&&
  Objects.equals(this.labels, objSelector.labels);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Selector {\n");
      sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

