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
 * NetworkSecurityPolicyActionRLParam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NetworkSecurityPolicyActionRLParam")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKSECURITYPOLICYACTIONRLPARAM, idAccessor = "getObjectID()")
@Service
public class NetworkSecurityPolicyActionRLParam extends AviRestResource  {
  @JsonProperty("burst_size")
  private Integer burstSize = null;

  @JsonProperty("max_rate")
  private Integer maxRate = null;

  
  /**
   * Maximum number of connections or requests or packets to be rate limited instantaneously.
   * @return burstSize
  **/
  @ApiModelProperty(required = true, value = "Maximum number of connections or requests or packets to be rate limited instantaneously.")
  @NotNull


 
  @VsoMethod  
  public Integer getBurstSize() {
    return burstSize;
  }
    
  @VsoMethod
  public void setBurstSize(Integer burstSize) {
    this.burstSize = burstSize;
  }

  
  /**
   * Maximum number of connections or requests or packets per second. Allowed values are 1-4294967295.
   * @return maxRate
  **/
  @ApiModelProperty(required = true, value = "Maximum number of connections or requests or packets per second. Allowed values are 1-4294967295.")
  @NotNull


 
  @VsoMethod  
  public Integer getMaxRate() {
    return maxRate;
  }
    
  @VsoMethod
  public void setMaxRate(Integer maxRate) {
    this.maxRate = maxRate;
  }

  
  public String getObjectID() {
		return "NetworkSecurityPolicyActionRLParam";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkSecurityPolicyActionRLParam networkSecurityPolicyActionRLParam = (NetworkSecurityPolicyActionRLParam) o;
    return Objects.equals(this.burstSize, networkSecurityPolicyActionRLParam.burstSize) &&
        Objects.equals(this.maxRate, networkSecurityPolicyActionRLParam.maxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burstSize, maxRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkSecurityPolicyActionRLParam {\n");
    
    sb.append("    burstSize: ").append(toIndentedString(burstSize)).append("\n");
    sb.append("    maxRate: ").append(toIndentedString(maxRate)).append("\n");
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

