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
 * SEBandwidthLimit
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SEBandwidthLimit")
@VsoFinder(name = Constants.FINDER_VRO_SEBANDWIDTHLIMIT, idAccessor = "getObjectID()")
@Service
public class SEBandwidthLimit extends AviRestResource  {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("type")
  private String type = null;

  
  /**
   * Total number of Service Engines for bandwidth based licenses. Field introduced in 17.2.5.
   * @return count
  **/
  @ApiModelProperty(value = "Total number of Service Engines for bandwidth based licenses. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Integer getCount() {
    return count;
  }
    
  @VsoMethod
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   * Maximum bandwidth allowed by each Service Engine. Enum options - SE_BANDWIDTH_UNLIMITED, SE_BANDWIDTH_25M, SE_BANDWIDTH_200M, SE_BANDWIDTH_1000M, SE_BANDWIDTH_10000M. Field introduced in 17.2.5.
   * @return type
  **/
  @ApiModelProperty(value = "Maximum bandwidth allowed by each Service Engine. Enum options - SE_BANDWIDTH_UNLIMITED, SE_BANDWIDTH_25M, SE_BANDWIDTH_200M, SE_BANDWIDTH_1000M, SE_BANDWIDTH_10000M. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "SEBandwidthLimit";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEBandwidthLimit seBandwidthLimit = (SEBandwidthLimit) o;
    return Objects.equals(this.count, seBandwidthLimit.count) &&
        Objects.equals(this.type, seBandwidthLimit.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEBandwidthLimit {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

