package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.PortRange;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The KniPortRange is a POJO class extends AviRestResource that used for creating
 * KniPortRange.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "KniPortRange")
@VsoFinder(name = Constants.FINDER_VRO_KNIPORTRANGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class KniPortRange extends AviRestResource {
    @JsonProperty("protocol")
    @JsonInclude(Include.NON_NULL)
    private String protocol;

    @JsonProperty("range")
    @JsonInclude(Include.NON_NULL)
    private PortRange range;



  /**
   * This is the getter method this will return the attribute value.
   * Protocol associated with port range.
   * Enum options - KNI_PROTO_TCP, KNI_PROTO_UDP.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protocol
   */
  @VsoMethod
  public String getProtocol() {
    return protocol;
  }

  /**
   * This is the setter method to the attribute.
   * Protocol associated with port range.
   * Enum options - KNI_PROTO_TCP, KNI_PROTO_UDP.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param protocol set the protocol.
   */
  @VsoMethod
  public void setProtocol(String  protocol) {
    this.protocol = protocol;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Port range to be allowed to kni.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return range
   */
  @VsoMethod
  public PortRange getRange() {
    return range;
  }

  /**
   * This is the setter method to the attribute.
   * Port range to be allowed to kni.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param range set the range.
   */
  @VsoMethod
  public void setRange(PortRange range) {
    this.range = range;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  KniPortRange objKniPortRange = (KniPortRange) o;
  return   Objects.equals(this.range, objKniPortRange.range)&&
  Objects.equals(this.protocol, objKniPortRange.protocol);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class KniPortRange {\n");
      sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

