package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * ObjectAccessMatchTarget
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ObjectAccessMatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_OBJECTACCESSMATCHTARGET, idAccessor = "getObjectID()")
@Service
public class ObjectAccessMatchTarget extends AviRestResource  {
  @JsonProperty("label_key")
  private String labelKey = null;

  @JsonProperty("label_values")
  @Valid
  private List<String> labelValues = new ArrayList<String>();

  
  /**
   * Key of the label to be matched. Field introduced in 18.2.7, 20.1.1.
   * @return labelKey
  **/
  @ApiModelProperty(required = true, value = "Key of the label to be matched. Field introduced in 18.2.7, 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getLabelKey() {
    return labelKey;
  }
    
  @VsoMethod
  public void setLabelKey(String labelKey) {
    this.labelKey = labelKey;
  }

  
  public ObjectAccessMatchTarget addLabelValuesItem(String labelValuesItem) {
    this.labelValues.add(labelValuesItem);
    return this;
  }
  
  /**
   * Label values that result in a successful match. Field introduced in 18.2.7, 20.1.1.
   * @return labelValues
  **/
  @ApiModelProperty(required = true, value = "Label values that result in a successful match. Field introduced in 18.2.7, 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public List<String> getLabelValues() {
    return labelValues;
  }
    
  @VsoMethod
  public void setLabelValues(List<String> labelValues) {
    this.labelValues = labelValues;
  }

  
  public String getObjectID() {
		return "ObjectAccessMatchTarget";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectAccessMatchTarget objectAccessMatchTarget = (ObjectAccessMatchTarget) o;
    return Objects.equals(this.labelKey, objectAccessMatchTarget.labelKey) &&
        Objects.equals(this.labelValues, objectAccessMatchTarget.labelValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelKey, labelValues);
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

