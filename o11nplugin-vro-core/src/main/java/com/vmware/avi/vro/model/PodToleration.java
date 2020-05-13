package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * PodToleration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PodToleration")
@VsoFinder(name = Constants.FINDER_VRO_PODTOLERATION, idAccessor = "getObjectID()")
@Service
public class PodToleration extends AviRestResource  {
  @JsonProperty("effect")
  private String effect = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("operator")
  private String operator = "EQUAL";

  @JsonProperty("toleration_seconds")
  private Integer tolerationSeconds = null;

  @JsonProperty("value")
  private String value = null;

  
  /**
   * Effect to match. Enum options - NO_SCHEDULE, PREFER_NO_SCHEDULE, NO_EXECUTE. Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return effect
  **/
  @ApiModelProperty(value = "Effect to match. Enum options - NO_SCHEDULE, PREFER_NO_SCHEDULE, NO_EXECUTE. Field introduced in 17.2.14, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getEffect() {
    return effect;
  }
    
  @VsoMethod
  public void setEffect(String effect) {
    this.effect = effect;
  }

  
  /**
   * Key to match. Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return key
  **/
  @ApiModelProperty(value = "Key to match. Field introduced in 17.2.14, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getKey() {
    return key;
  }
    
  @VsoMethod
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * Operator to match. Enum options - EQUAL, EXISTS. Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return operator
  **/
  @ApiModelProperty(value = "Operator to match. Enum options - EQUAL, EXISTS. Field introduced in 17.2.14, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getOperator() {
    return operator;
  }
    
  @VsoMethod
  public void setOperator(String operator) {
    this.operator = operator;
  }

  
  /**
   * Pods that tolerate the taint with a specified toleration_seconds remain bound for the specified amount of time. Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return tolerationSeconds
  **/
  @ApiModelProperty(value = "Pods that tolerate the taint with a specified toleration_seconds remain bound for the specified amount of time. Field introduced in 17.2.14, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Integer getTolerationSeconds() {
    return tolerationSeconds;
  }
    
  @VsoMethod
  public void setTolerationSeconds(Integer tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
  }

  
  /**
   * Value to match. Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return value
  **/
  @ApiModelProperty(value = "Value to match. Field introduced in 17.2.14, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getValue() {
    return value;
  }
    
  @VsoMethod
  public void setValue(String value) {
    this.value = value;
  }

  
  public String getObjectID() {
		return "PodToleration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodToleration podToleration = (PodToleration) o;
    return Objects.equals(this.effect, podToleration.effect) &&
        Objects.equals(this.key, podToleration.key) &&
        Objects.equals(this.operator, podToleration.operator) &&
        Objects.equals(this.tolerationSeconds, podToleration.tolerationSeconds) &&
        Objects.equals(this.value, podToleration.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, key, operator, tolerationSeconds, value);
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

