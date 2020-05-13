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
 * DebugVsDataplane
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugVsDataplane")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGVSDATAPLANE, idAccessor = "getObjectID()")
@Service
public class DebugVsDataplane extends AviRestResource  {
  @JsonProperty("flag")
  private String flag = null;

  
  /**
   *  Enum options - DEBUG_VS_TCP_CONNECTION, DEBUG_VS_TCP_PKT, DEBUG_VS_TCP_APP, DEBUG_VS_TCP_APP_PKT, DEBUG_VS_TCP_RETRANSMIT, DEBUG_VS_TCP_TIMER, DEBUG_VS_TCP_CONN_ERROR, DEBUG_VS_TCP_PKT_ERROR, DEBUG_VS_TCP_REXMT, DEBUG_VS_TCP_ALL, DEBUG_VS_CREDIT, DEBUG_VS_PROXY_CONNECTION, DEBUG_VS_PROXY_PKT, DEBUG_VS_PROXY_ERR, DEBUG_VS_UDP, DEBUG_VS_UDP_PKT, DEBUG_VS_HM, DEBUG_VS_HM_ERR, DEBUG_VS_HM_PKT, DEBUG_VS_HTTP_CORE, DEBUG_VS_HTTP_ALL, DEBUG_VS_CONFIG, DEBUG_VS_EVENTS, DEBUG_VS_HTTP_RULES, DEBUG_VS_HM_EXT, DEBUG_VS_SSL, DEBUG_VS_WAF, DEBUG_VS_DNS, DEBUG_VS_PAA, DEBUG_VS_ALL, DEBUG_VS_ERROR, DEBUG_VS_NONE.
   * @return flag
  **/
  @ApiModelProperty(required = true, value = " Enum options - DEBUG_VS_TCP_CONNECTION, DEBUG_VS_TCP_PKT, DEBUG_VS_TCP_APP, DEBUG_VS_TCP_APP_PKT, DEBUG_VS_TCP_RETRANSMIT, DEBUG_VS_TCP_TIMER, DEBUG_VS_TCP_CONN_ERROR, DEBUG_VS_TCP_PKT_ERROR, DEBUG_VS_TCP_REXMT, DEBUG_VS_TCP_ALL, DEBUG_VS_CREDIT, DEBUG_VS_PROXY_CONNECTION, DEBUG_VS_PROXY_PKT, DEBUG_VS_PROXY_ERR, DEBUG_VS_UDP, DEBUG_VS_UDP_PKT, DEBUG_VS_HM, DEBUG_VS_HM_ERR, DEBUG_VS_HM_PKT, DEBUG_VS_HTTP_CORE, DEBUG_VS_HTTP_ALL, DEBUG_VS_CONFIG, DEBUG_VS_EVENTS, DEBUG_VS_HTTP_RULES, DEBUG_VS_HM_EXT, DEBUG_VS_SSL, DEBUG_VS_WAF, DEBUG_VS_DNS, DEBUG_VS_PAA, DEBUG_VS_ALL, DEBUG_VS_ERROR, DEBUG_VS_NONE.")
  @NotNull


 
  @VsoMethod  
  public String getFlag() {
    return flag;
  }
    
  @VsoMethod
  public void setFlag(String flag) {
    this.flag = flag;
  }

  
  public String getObjectID() {
		return "DebugVsDataplane";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugVsDataplane debugVsDataplane = (DebugVsDataplane) o;
    return Objects.equals(this.flag, debugVsDataplane.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag);
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

