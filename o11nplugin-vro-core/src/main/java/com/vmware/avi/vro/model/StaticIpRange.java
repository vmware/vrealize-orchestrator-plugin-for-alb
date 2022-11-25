package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrRange;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The StaticIpRange is a POJO class extends AviRestResource that used for creating
 * StaticIpRange.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "StaticIpRange")
@VsoFinder(name = Constants.FINDER_VRO_STATICIPRANGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class StaticIpRange extends AviRestResource {
    @JsonProperty("range")
    @JsonInclude(Include.NON_NULL)
    private IpAddrRange range = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = "STATIC_IPS_FOR_VIP_AND_SE";



  /**
   * This is the getter method this will return the attribute value.
   * Ip range.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return range
   */
  @VsoMethod
  public IpAddrRange getRange() {
    return range;
  }

  /**
   * This is the setter method to the attribute.
   * Ip range.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param range set the range.
   */
  @VsoMethod
  public void setRange(IpAddrRange range) {
    this.range = range;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Object type (vip only, service engine only, or both) which can use this ip range.
   * Enum options - STATIC_IPS_FOR_SE, STATIC_IPS_FOR_VIP, STATIC_IPS_FOR_VIP_AND_SE.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "STATIC_IPS_FOR_VIP_AND_SE".
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Object type (vip only, service engine only, or both) which can use this ip range.
   * Enum options - STATIC_IPS_FOR_SE, STATIC_IPS_FOR_VIP, STATIC_IPS_FOR_VIP_AND_SE.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "STATIC_IPS_FOR_VIP_AND_SE".
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  StaticIpRange objStaticIpRange = (StaticIpRange) o;
  return   Objects.equals(this.range, objStaticIpRange.range)&&
  Objects.equals(this.type, objStaticIpRange.type);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class StaticIpRange {\n");
      sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

