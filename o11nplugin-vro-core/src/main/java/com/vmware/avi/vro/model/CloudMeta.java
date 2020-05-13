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
 * CloudMeta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CloudMeta")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDMETA, idAccessor = "getObjectID()")
@Service
public class CloudMeta extends AviRestResource  {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  
  /**
   * key of CloudMeta.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "key of CloudMeta.")
  @NotNull


 
  @VsoMethod  
  public String getKey() {
    return key;
  }
    
  @VsoMethod
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * value of CloudMeta.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "value of CloudMeta.")
  @NotNull


 
  @VsoMethod  
  public String getValue() {
    return value;
  }
    
  @VsoMethod
  public void setValue(String value) {
    this.value = value;
  }

  
  public String getObjectID() {
		return "CloudMeta";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudMeta cloudMeta = (CloudMeta) o;
    return Objects.equals(this.key, cloudMeta.key) &&
        Objects.equals(this.value, cloudMeta.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudMeta {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

