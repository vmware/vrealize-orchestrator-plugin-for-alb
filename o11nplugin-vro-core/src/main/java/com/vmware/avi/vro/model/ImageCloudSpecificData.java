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
 * The ImageCloudSpecificData is a POJO class extends AviRestResource that used for creating
 * ImageCloudSpecificData.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ImageCloudSpecificData")
@VsoFinder(name = Constants.FINDER_VRO_IMAGECLOUDSPECIFICDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ImageCloudSpecificData extends AviRestResource {
    @JsonProperty("key")
    @JsonInclude(Include.NON_NULL)
    private String key = null;

    @JsonProperty("values")
    @JsonInclude(Include.NON_NULL)
    private List<String> values = null;



  /**
   * This is the getter method this will return the attribute value.
   * Each cloud has specific parameters.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return key
   */
  @VsoMethod
  public String getKey() {
    return key;
  }

  /**
   * This is the setter method to the attribute.
   * Each cloud has specific parameters.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param key set the key.
   */
  @VsoMethod
  public void setKey(String  key) {
    this.key = key;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Each parameter can have multiple values.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return values
   */
  @VsoMethod
  public List<String> getValues() {
    return values;
  }

  /**
   * This is the setter method. this will set the values
   * Each parameter can have multiple values.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return values
   */
  @VsoMethod
  public void setValues(List<String>  values) {
    this.values = values;
  }

  /**
   * This is the setter method this will set the values
   * Each parameter can have multiple values.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return values
   */
  @VsoMethod
  public ImageCloudSpecificData addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
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
  ImageCloudSpecificData objImageCloudSpecificData = (ImageCloudSpecificData) o;
  return   Objects.equals(this.key, objImageCloudSpecificData.key)&&
  Objects.equals(this.values, objImageCloudSpecificData.values);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ImageCloudSpecificData {\n");
      sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

