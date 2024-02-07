package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The NetworkSecurityPolicyActionRLParam is a POJO class extends AviRestResource that used for creating
 * NetworkSecurityPolicyActionRLParam.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NetworkSecurityPolicyActionRLParam")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKSECURITYPOLICYACTIONRLPARAM)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NetworkSecurityPolicyActionRLParam extends AviRestResource {
    @JsonProperty("burst_size")
    @JsonInclude(Include.NON_NULL)
    private Integer burstSize = 0;

    @JsonProperty("max_rate")
    @JsonInclude(Include.NON_NULL)
    private Integer maxRate;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of connections or requests or packets to be rate limited instantaneously.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return burstSize
   */
  @VsoMethod
  public Integer getBurstSize() {
    return burstSize;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of connections or requests or packets to be rate limited instantaneously.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param burstSize set the burstSize.
   */
  @VsoMethod
  public void setBurstSize(Integer  burstSize) {
    this.burstSize = burstSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of connections or requests or packets per second.
   * Allowed values are 1-4294967295.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxRate
   */
  @VsoMethod
  public Integer getMaxRate() {
    return maxRate;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of connections or requests or packets per second.
   * Allowed values are 1-4294967295.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxRate set the maxRate.
   */
  @VsoMethod
  public void setMaxRate(Integer  maxRate) {
    this.maxRate = maxRate;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NetworkSecurityPolicyActionRLParam objNetworkSecurityPolicyActionRLParam = (NetworkSecurityPolicyActionRLParam) o;
  return   Objects.equals(this.maxRate, objNetworkSecurityPolicyActionRLParam.maxRate)&&
  Objects.equals(this.burstSize, objNetworkSecurityPolicyActionRLParam.burstSize);
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

