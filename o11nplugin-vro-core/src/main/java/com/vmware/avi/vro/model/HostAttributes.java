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
 * HostAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HostAttributes")
@VsoFinder(name = Constants.FINDER_VRO_HOSTATTRIBUTES, idAccessor = "getObjectID()")
@Service
public class HostAttributes extends AviRestResource  {
  @JsonProperty("attr_key")
  private String attrKey = null;

  @JsonProperty("attr_val")
  private String attrVal = null;

  
  /**
   * attr_key of HostAttributes.
   * @return attrKey
  **/
  @ApiModelProperty(required = true, value = "attr_key of HostAttributes.")
  @NotNull


 
  @VsoMethod  
  public String getAttrKey() {
    return attrKey;
  }
    
  @VsoMethod
  public void setAttrKey(String attrKey) {
    this.attrKey = attrKey;
  }

  
  /**
   * attr_val of HostAttributes.
   * @return attrVal
  **/
  @ApiModelProperty(value = "attr_val of HostAttributes.")


 
  @VsoMethod  
  public String getAttrVal() {
    return attrVal;
  }
    
  @VsoMethod
  public void setAttrVal(String attrVal) {
    this.attrVal = attrVal;
  }

  
  public String getObjectID() {
		return "HostAttributes";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostAttributes hostAttributes = (HostAttributes) o;
    return Objects.equals(this.attrKey, hostAttributes.attrKey) &&
        Objects.equals(this.attrVal, hostAttributes.attrVal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrKey, attrVal);
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

