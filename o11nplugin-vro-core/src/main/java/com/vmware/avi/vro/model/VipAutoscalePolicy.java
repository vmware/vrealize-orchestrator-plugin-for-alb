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
 * VipAutoscalePolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VipAutoscalePolicy")
@VsoFinder(name = Constants.FINDER_VRO_VIPAUTOSCALEPOLICY, idAccessor = "getObjectID()")
@Service
public class VipAutoscalePolicy extends AviRestResource  {
  @JsonProperty("dns_cooldown")
  private Integer dnsCooldown = 60;

  @JsonProperty("max_size")
  private Integer maxSize = 5;

  @JsonProperty("min_size")
  private Integer minSize = 1;

  @JsonProperty("suspend")
  private Boolean suspend = null;

  
  /**
   * The amount of time, in seconds, when a Vip is withdrawn before a scaling activity starts. Field introduced in 17.2.12, 18.1.2.
   * @return dnsCooldown
  **/
  @ApiModelProperty(value = "The amount of time, in seconds, when a Vip is withdrawn before a scaling activity starts. Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public Integer getDnsCooldown() {
    return dnsCooldown;
  }
    
  @VsoMethod
  public void setDnsCooldown(Integer dnsCooldown) {
    this.dnsCooldown = dnsCooldown;
  }

  
  /**
   * The maximum size of the group. Field introduced in 17.2.12, 18.1.2.
   * @return maxSize
  **/
  @ApiModelProperty(value = "The maximum size of the group. Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public Integer getMaxSize() {
    return maxSize;
  }
    
  @VsoMethod
  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }

  
  /**
   * The minimum size of the group. Field introduced in 17.2.12, 18.1.2.
   * @return minSize
  **/
  @ApiModelProperty(value = "The minimum size of the group. Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public Integer getMinSize() {
    return minSize;
  }
    
  @VsoMethod
  public void setMinSize(Integer minSize) {
    this.minSize = minSize;
  }

  
  /**
   * When set, scaling is suspended. Field introduced in 17.2.12, 18.1.2.
   * @return suspend
  **/
  @ApiModelProperty(value = "When set, scaling is suspended. Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public Boolean isSuspend() {
    return suspend;
  }
    
  @VsoMethod
  public void setSuspend(Boolean suspend) {
    this.suspend = suspend;
  }

  
  public String getObjectID() {
		return "VipAutoscalePolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VipAutoscalePolicy vipAutoscalePolicy = (VipAutoscalePolicy) o;
    return Objects.equals(this.dnsCooldown, vipAutoscalePolicy.dnsCooldown) &&
        Objects.equals(this.maxSize, vipAutoscalePolicy.maxSize) &&
        Objects.equals(this.minSize, vipAutoscalePolicy.minSize) &&
        Objects.equals(this.suspend, vipAutoscalePolicy.suspend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsCooldown, maxSize, minSize, suspend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VipAutoscalePolicy {\n");
    
    sb.append("    dnsCooldown: ").append(toIndentedString(dnsCooldown)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
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

