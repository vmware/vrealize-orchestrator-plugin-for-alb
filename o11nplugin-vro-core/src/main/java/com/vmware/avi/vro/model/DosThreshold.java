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
 * DosThreshold
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DosThreshold")
@VsoFinder(name = Constants.FINDER_VRO_DOSTHRESHOLD, idAccessor = "getObjectID()")
@Service
public class DosThreshold extends AviRestResource  {
  @JsonProperty("attack")
  private String attack = null;

  @JsonProperty("max_value")
  private Integer maxValue = null;

  @JsonProperty("min_value")
  private Integer minValue = null;

  
  /**
   * Attack type. Enum options - LAND, SMURF, ICMP_PING_FLOOD, UNKOWN_PROTOCOL, TEARDROP, IP_FRAG_OVERRUN, IP_FRAG_TOOSMALL, IP_FRAG_FULL, IP_FRAG_INCOMPLETE, PORT_SCAN, TCP_NON_SYN_FLOOD_OLD, SYN_FLOOD, BAD_RST_FLOOD, MALFORMED_FLOOD, FAKE_SESSION, ZERO_WINDOW_STRESS, SMALL_WINDOW_STRESS, DOS_HTTP_TIMEOUT, DOS_HTTP_ERROR, DOS_HTTP_ABORT, DOS_SSL_ERROR, DOS_APP_ERROR, DOS_REQ_IP_RL_DROP, DOS_REQ_URI_RL_DROP, DOS_REQ_URI_SCAN_BAD_RL_DROP, DOS_REQ_URI_SCAN_UNKNOWN_RL_DROP, DOS_REQ_IP_URI_RL_DROP, DOS_CONN_IP_RL_DROP, DOS_SLOW_URL, TCP_NON_SYN_FLOOD, DOS_REQ_CIP_SCAN_BAD_RL_DROP, DOS_REQ_CIP_SCAN_UNKNOWN_RL_DROP, DOS_REQ_IP_RL_DROP_BAD, DOS_REQ_URI_RL_DROP_BAD, DOS_REQ_IP_URI_RL_DROP_BAD, POLICY_DROPS, DOS_CONN_RL_DROP, DOS_REQ_RL_DROP, DOS_REQ_HDR_RL_DROP, DOS_REQ_CUSTOM_RL_DROP, DNS_ATTACK_REFLECTION.
   * @return attack
  **/
  @ApiModelProperty(required = true, value = "Attack type. Enum options - LAND, SMURF, ICMP_PING_FLOOD, UNKOWN_PROTOCOL, TEARDROP, IP_FRAG_OVERRUN, IP_FRAG_TOOSMALL, IP_FRAG_FULL, IP_FRAG_INCOMPLETE, PORT_SCAN, TCP_NON_SYN_FLOOD_OLD, SYN_FLOOD, BAD_RST_FLOOD, MALFORMED_FLOOD, FAKE_SESSION, ZERO_WINDOW_STRESS, SMALL_WINDOW_STRESS, DOS_HTTP_TIMEOUT, DOS_HTTP_ERROR, DOS_HTTP_ABORT, DOS_SSL_ERROR, DOS_APP_ERROR, DOS_REQ_IP_RL_DROP, DOS_REQ_URI_RL_DROP, DOS_REQ_URI_SCAN_BAD_RL_DROP, DOS_REQ_URI_SCAN_UNKNOWN_RL_DROP, DOS_REQ_IP_URI_RL_DROP, DOS_CONN_IP_RL_DROP, DOS_SLOW_URL, TCP_NON_SYN_FLOOD, DOS_REQ_CIP_SCAN_BAD_RL_DROP, DOS_REQ_CIP_SCAN_UNKNOWN_RL_DROP, DOS_REQ_IP_RL_DROP_BAD, DOS_REQ_URI_RL_DROP_BAD, DOS_REQ_IP_URI_RL_DROP_BAD, POLICY_DROPS, DOS_CONN_RL_DROP, DOS_REQ_RL_DROP, DOS_REQ_HDR_RL_DROP, DOS_REQ_CUSTOM_RL_DROP, DNS_ATTACK_REFLECTION.")
  @NotNull


 
  @VsoMethod  
  public String getAttack() {
    return attack;
  }
    
  @VsoMethod
  public void setAttack(String attack) {
    this.attack = attack;
  }

  
  /**
   * Maximum number of packets or connections or requests in a given interval of time to be deemed as attack.
   * @return maxValue
  **/
  @ApiModelProperty(required = true, value = "Maximum number of packets or connections or requests in a given interval of time to be deemed as attack.")
  @NotNull


 
  @VsoMethod  
  public Integer getMaxValue() {
    return maxValue;
  }
    
  @VsoMethod
  public void setMaxValue(Integer maxValue) {
    this.maxValue = maxValue;
  }

  
  /**
   * Minimum number of packets or connections or requests in a given interval of time to be deemed as attack.
   * @return minValue
  **/
  @ApiModelProperty(required = true, value = "Minimum number of packets or connections or requests in a given interval of time to be deemed as attack.")
  @NotNull


 
  @VsoMethod  
  public Integer getMinValue() {
    return minValue;
  }
    
  @VsoMethod
  public void setMinValue(Integer minValue) {
    this.minValue = minValue;
  }

  
  public String getObjectID() {
		return "DosThreshold";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DosThreshold dosThreshold = (DosThreshold) o;
    return Objects.equals(this.attack, dosThreshold.attack) &&
        Objects.equals(this.maxValue, dosThreshold.maxValue) &&
        Objects.equals(this.minValue, dosThreshold.minValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attack, maxValue, minValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DosThreshold {\n");
    
    sb.append("    attack: ").append(toIndentedString(attack)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
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

