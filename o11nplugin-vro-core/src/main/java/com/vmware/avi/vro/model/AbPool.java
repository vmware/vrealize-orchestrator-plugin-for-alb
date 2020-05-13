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
 * AbPool
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AbPool")
@VsoFinder(name = Constants.FINDER_VRO_ABPOOL, idAccessor = "getObjectID()")
@Service
public class AbPool extends AviRestResource  {
  @JsonProperty("pool_ref")
  private String poolRef = null;

  @JsonProperty("ratio")
  private Integer ratio = null;

  
  /**
   * Pool configured as B pool for A/B testing. It is a reference to an object of type Pool.
   * @return poolRef
  **/
  @ApiModelProperty(required = true, value = "Pool configured as B pool for A/B testing. It is a reference to an object of type Pool.")
  @NotNull


 
  @VsoMethod  
  public String getPoolRef() {
    return poolRef;
  }
    
  @VsoMethod
  public void setPoolRef(String poolRef) {
    this.poolRef = poolRef;
  }

  
  /**
   * Ratio of traffic diverted to the B pool, for A/B testing. Allowed values are 0-100.
   * @return ratio
  **/
  @ApiModelProperty(value = "Ratio of traffic diverted to the B pool, for A/B testing. Allowed values are 0-100.")


 
  @VsoMethod  
  public Integer getRatio() {
    return ratio;
  }
    
  @VsoMethod
  public void setRatio(Integer ratio) {
    this.ratio = ratio;
  }

  
  public String getObjectID() {
		return "AbPool";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbPool abPool = (AbPool) o;
    return Objects.equals(this.poolRef, abPool.poolRef) &&
        Objects.equals(this.ratio, abPool.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolRef, ratio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbPool {\n");
    
    sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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

