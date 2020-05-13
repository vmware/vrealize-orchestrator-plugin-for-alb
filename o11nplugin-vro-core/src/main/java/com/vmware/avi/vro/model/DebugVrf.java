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
 * DebugVrf
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugVrf")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGVRF, idAccessor = "getObjectID()")
@Service
public class DebugVrf extends AviRestResource  {
  @JsonProperty("flag")
  private String flag = null;

  
  /**
   *  Enum options - DEBUG_VRF_BGP, DEBUG_VRF_QUAGGA, DEBUG_VRF_ALL, DEBUG_VRF_NONE. Field introduced in 17.1.1.
   * @return flag
  **/
  @ApiModelProperty(required = true, value = " Enum options - DEBUG_VRF_BGP, DEBUG_VRF_QUAGGA, DEBUG_VRF_ALL, DEBUG_VRF_NONE. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getFlag() {
    return flag;
  }
    
  @VsoMethod
  public void setFlag(String flag) {
    this.flag = flag;
  }

  
  public String getObjectID() {
		return "DebugVrf";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugVrf debugVrf = (DebugVrf) o;
    return Objects.equals(this.flag, debugVrf.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugVrf {\n");
    
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
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

