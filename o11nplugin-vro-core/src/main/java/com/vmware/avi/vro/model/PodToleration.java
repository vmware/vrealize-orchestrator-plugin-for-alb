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
 * The PodToleration is a POJO class extends AviRestResource that used for creating
 * PodToleration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PodToleration")
@VsoFinder(name = Constants.FINDER_VRO_PODTOLERATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PodToleration extends AviRestResource {
  @JsonProperty("effect")
  @JsonInclude(Include.NON_NULL)
  private String effect = null;

  @JsonProperty("key")
  @JsonInclude(Include.NON_NULL)
  private String key = null;

  @JsonProperty("operator")
  @JsonInclude(Include.NON_NULL)
  private String operator = "EQUAL";

  @JsonProperty("toleration_seconds")
  @JsonInclude(Include.NON_NULL)
  private Integer tolerationSeconds = null;

  @JsonProperty("value")
  @JsonInclude(Include.NON_NULL)
  private String value = null;



  /**
   * This is the getter method this will return the attribute value.
   * Effect to match.
   * Enum options - NO_SCHEDULE, PREFER_NO_SCHEDULE, NO_EXECUTE.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return effect
   */
  @VsoMethod
  public String getEffect() {
    return effect;
  }

  /**
   * This is the setter method to the attribute.
   * Effect to match.
   * Enum options - NO_SCHEDULE, PREFER_NO_SCHEDULE, NO_EXECUTE.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @param effect set the effect.
   */
  @VsoMethod
  public void setEffect(String  effect) {
    this.effect = effect;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Key to match.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return key
   */
  @VsoMethod
  public String getKey() {
    return key;
  }

  /**
   * This is the setter method to the attribute.
   * Key to match.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @param key set the key.
   */
  @VsoMethod
  public void setKey(String  key) {
    this.key = key;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Operator to match.
   * Enum options - EQUAL, EXISTS.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as EQUAL.
   * @return operator
   */
  @VsoMethod
  public String getOperator() {
    return operator;
  }

  /**
   * This is the setter method to the attribute.
   * Operator to match.
   * Enum options - EQUAL, EXISTS.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as EQUAL.
   * @param operator set the operator.
   */
  @VsoMethod
  public void setOperator(String  operator) {
    this.operator = operator;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pods that tolerate the taint with a specified toleration_seconds remain bound for the specified amount of time.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return tolerationSeconds
   */
  @VsoMethod
  public Integer getTolerationSeconds() {
    return tolerationSeconds;
  }

  /**
   * This is the setter method to the attribute.
   * Pods that tolerate the taint with a specified toleration_seconds remain bound for the specified amount of time.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @param tolerationSeconds set the tolerationSeconds.
   */
  @VsoMethod
  public void setTolerationSeconds(Integer  tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Value to match.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return value
   */
  @VsoMethod
  public String getValue() {
    return value;
  }

  /**
   * This is the setter method to the attribute.
   * Value to match.
   * Field introduced in 17.2.14, 18.1.5, 18.2.1.
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
  PodToleration objPodToleration = (PodToleration) o;
  return   Objects.equals(this.key, objPodToleration.key)&&
  Objects.equals(this.value, objPodToleration.value)&&
  Objects.equals(this.effect, objPodToleration.effect)&&
  Objects.equals(this.operator, objPodToleration.operator)&&
  Objects.equals(this.tolerationSeconds, objPodToleration.tolerationSeconds);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PodToleration {\n");
      sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    tolerationSeconds: ").append(toIndentedString(tolerationSeconds)).append("\n");
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

