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
 * StateCacheMgrDebugFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "StateCacheMgrDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_STATECACHEMGRDEBUGFILTER, idAccessor = "getObjectID()")
@Service
public class StateCacheMgrDebugFilter extends AviRestResource  {
  @JsonProperty("pool_ref")
  private String poolRef = null;

  @JsonProperty("vs_ref")
  private String vsRef = null;

  
  /**
   * Pool UUID. It is a reference to an object of type Pool.
   * @return poolRef
  **/
  @ApiModelProperty(value = "Pool UUID. It is a reference to an object of type Pool.")


 
  @VsoMethod  
  public String getPoolRef() {
    return poolRef;
  }
    
  @VsoMethod
  public void setPoolRef(String poolRef) {
    this.poolRef = poolRef;
  }

  
  /**
   * VirtualService UUID. It is a reference to an object of type VirtualService.
   * @return vsRef
  **/
  @ApiModelProperty(value = "VirtualService UUID. It is a reference to an object of type VirtualService.")


 
  @VsoMethod  
  public String getVsRef() {
    return vsRef;
  }
    
  @VsoMethod
  public void setVsRef(String vsRef) {
    this.vsRef = vsRef;
  }

  
  public String getObjectID() {
		return "StateCacheMgrDebugFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateCacheMgrDebugFilter stateCacheMgrDebugFilter = (StateCacheMgrDebugFilter) o;
    return Objects.equals(this.poolRef, stateCacheMgrDebugFilter.poolRef) &&
        Objects.equals(this.vsRef, stateCacheMgrDebugFilter.vsRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolRef, vsRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateCacheMgrDebugFilter {\n");
    
    sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
    sb.append("    vsRef: ").append(toIndentedString(vsRef)).append("\n");
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

