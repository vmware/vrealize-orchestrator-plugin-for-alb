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
 * SEFaultInjectExhaustParam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SEFaultInjectExhaustParam")
@VsoFinder(name = Constants.FINDER_VRO_SEFAULTINJECTEXHAUSTPARAM, idAccessor = "getObjectID()")
@Service
public class SEFaultInjectExhaustParam extends AviRestResource  {
  @JsonProperty("leak")
  private Boolean leak = null;

  @JsonProperty("num")
  private Long num = null;

  
  /**
   * Placeholder for description of property leak of obj type SEFaultInjectExhaustParam field type str  type boolean
   * @return leak
  **/
  @ApiModelProperty(value = "Placeholder for description of property leak of obj type SEFaultInjectExhaustParam field type str  type boolean")


 
  @VsoMethod  
  public Boolean isLeak() {
    return leak;
  }
    
  @VsoMethod
  public void setLeak(Boolean leak) {
    this.leak = leak;
  }

  
  /**
   * Number of num.
   * @return num
  **/
  @ApiModelProperty(required = true, value = "Number of num.")
  @NotNull


 
  @VsoMethod  
  public Long getNum() {
    return num;
  }
    
  @VsoMethod
  public void setNum(Long num) {
    this.num = num;
  }

  
  public String getObjectID() {
		return "SEFaultInjectExhaustParam";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEFaultInjectExhaustParam seFaultInjectExhaustParam = (SEFaultInjectExhaustParam) o;
    return Objects.equals(this.leak, seFaultInjectExhaustParam.leak) &&
        Objects.equals(this.num, seFaultInjectExhaustParam.num);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leak, num);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEFaultInjectExhaustParam {\n");
    
    sb.append("    leak: ").append(toIndentedString(leak)).append("\n");
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
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

