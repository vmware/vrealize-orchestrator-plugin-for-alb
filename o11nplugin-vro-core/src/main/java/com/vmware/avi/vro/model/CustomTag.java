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
 * CustomTag
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CustomTag")
@VsoFinder(name = Constants.FINDER_VRO_CUSTOMTAG, idAccessor = "getObjectID()")
@Service
public class CustomTag extends AviRestResource  {
  @JsonProperty("tag_key")
  private String tagKey = null;

  @JsonProperty("tag_val")
  private String tagVal = null;

  
  /**
   * tag_key of CustomTag.
   * @return tagKey
  **/
  @ApiModelProperty(required = true, value = "tag_key of CustomTag.")
  @NotNull


 
  @VsoMethod  
  public String getTagKey() {
    return tagKey;
  }
    
  @VsoMethod
  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  
  /**
   * tag_val of CustomTag.
   * @return tagVal
  **/
  @ApiModelProperty(value = "tag_val of CustomTag.")


 
  @VsoMethod  
  public String getTagVal() {
    return tagVal;
  }
    
  @VsoMethod
  public void setTagVal(String tagVal) {
    this.tagVal = tagVal;
  }

  
  public String getObjectID() {
		return "CustomTag";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTag customTag = (CustomTag) o;
    return Objects.equals(this.tagKey, customTag.tagKey) &&
        Objects.equals(this.tagVal, customTag.tagVal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey, tagVal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTag {\n");
    
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagVal: ").append(toIndentedString(tagVal)).append("\n");
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

