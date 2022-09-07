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
 * The DebugVsDataplane is a POJO class extends AviRestResource that used for creating
 * DebugVsDataplane.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DebugVsDataplane")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGVSDATAPLANE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DebugVsDataplane extends AviRestResource {
    @JsonProperty("flag")
    @JsonInclude(Include.NON_NULL)
    private String flag = null;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - DEBUG_VS_TCP_CONNECTION, DEBUG_VS_TCP_PKT, DEBUG_VS_TCP_APP, DEBUG_VS_TCP_APP_PKT, DEBUG_VS_TCP_RETRANSMIT, DEBUG_VS_TCP_TIMER,
   * DEBUG_VS_TCP_CONN_ERROR, DEBUG_VS_TCP_PKT_ERROR, DEBUG_VS_TCP_REXMT, DEBUG_VS_TCP_ALL, DEBUG_VS_CREDIT, DEBUG_VS_PROXY_CONNECTION,
   * DEBUG_VS_PROXY_PKT, DEBUG_VS_PROXY_ERR, DEBUG_VS_UDP, DEBUG_VS_UDP_PKT, DEBUG_VS_HM, DEBUG_VS_HM_ERR, DEBUG_VS_HM_PKT, DEBUG_VS_HTTP_CORE...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flag
   */
  @VsoMethod
  public String getFlag() {
    return flag;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - DEBUG_VS_TCP_CONNECTION, DEBUG_VS_TCP_PKT, DEBUG_VS_TCP_APP, DEBUG_VS_TCP_APP_PKT, DEBUG_VS_TCP_RETRANSMIT, DEBUG_VS_TCP_TIMER,
   * DEBUG_VS_TCP_CONN_ERROR, DEBUG_VS_TCP_PKT_ERROR, DEBUG_VS_TCP_REXMT, DEBUG_VS_TCP_ALL, DEBUG_VS_CREDIT, DEBUG_VS_PROXY_CONNECTION,
   * DEBUG_VS_PROXY_PKT, DEBUG_VS_PROXY_ERR, DEBUG_VS_UDP, DEBUG_VS_UDP_PKT, DEBUG_VS_HM, DEBUG_VS_HM_ERR, DEBUG_VS_HM_PKT, DEBUG_VS_HTTP_CORE...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param flag set the flag.
   */
  @VsoMethod
  public void setFlag(String  flag) {
    this.flag = flag;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DebugVsDataplane objDebugVsDataplane = (DebugVsDataplane) o;
  return   Objects.equals(this.flag, objDebugVsDataplane.flag);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DebugVsDataplane {\n");
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

