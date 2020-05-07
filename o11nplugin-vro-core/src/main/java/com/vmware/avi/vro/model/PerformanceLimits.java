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
 * PerformanceLimits
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "PerformanceLimits")
@VsoFinder(name = Constants.FINDER_VRO_PERFORMANCELIMITS, idAccessor = "getObjectID()")
@Service
public class PerformanceLimits extends AviRestResource  {
  @JsonProperty("max_concurrent_connections")
  private Integer maxConcurrentConnections = null;

  @JsonProperty("max_throughput")
  private Integer maxThroughput = null;

  
  /**
   * The maximum number of concurrent client conections allowed to the Virtual Service.
   * @return maxConcurrentConnections
  **/
  @ApiModelProperty(value = "The maximum number of concurrent client conections allowed to the Virtual Service.")


 
  @VsoMethod  
  public Integer getMaxConcurrentConnections() {
    return maxConcurrentConnections;
  }
    
  @VsoMethod
  public void setMaxConcurrentConnections(Integer maxConcurrentConnections) {
    this.maxConcurrentConnections = maxConcurrentConnections;
  }

  
  /**
   * The maximum throughput per second for all clients allowed through the client side of the Virtual Service.
   * @return maxThroughput
  **/
  @ApiModelProperty(value = "The maximum throughput per second for all clients allowed through the client side of the Virtual Service.")


 
  @VsoMethod  
  public Integer getMaxThroughput() {
    return maxThroughput;
  }
    
  @VsoMethod
  public void setMaxThroughput(Integer maxThroughput) {
    this.maxThroughput = maxThroughput;
  }

  
  public String getObjectID() {
		return "PerformanceLimits";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceLimits performanceLimits = (PerformanceLimits) o;
    return Objects.equals(this.maxConcurrentConnections, performanceLimits.maxConcurrentConnections) &&
        Objects.equals(this.maxThroughput, performanceLimits.maxThroughput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxConcurrentConnections, maxThroughput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceLimits {\n");
    
    sb.append("    maxConcurrentConnections: ").append(toIndentedString(maxConcurrentConnections)).append("\n");
    sb.append("    maxThroughput: ").append(toIndentedString(maxThroughput)).append("\n");
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

