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
 * SeRateLimiters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeRateLimiters")
@VsoFinder(name = Constants.FINDER_VRO_SERATELIMITERS, idAccessor = "getObjectID()")
@Service
public class SeRateLimiters extends AviRestResource  {
  @JsonProperty("arp_rl")
  private Integer arpRl = 100;

  @JsonProperty("default_rl")
  private Integer defaultRl = 100;

  @JsonProperty("flow_probe_rl")
  private Integer flowProbeRl = 250;

  @JsonProperty("icmp_rl")
  private Integer icmpRl = 100;

  @JsonProperty("icmp_rsp_rl")
  private Integer icmpRspRl = 500;

  @JsonProperty("rst_rl")
  private Integer rstRl = 100;

  
  /**
   * Rate limiter for ARP packets in pps.
   * @return arpRl
  **/
  @ApiModelProperty(value = "Rate limiter for ARP packets in pps.")


 
  @VsoMethod  
  public Integer getArpRl() {
    return arpRl;
  }
    
  @VsoMethod
  public void setArpRl(Integer arpRl) {
    this.arpRl = arpRl;
  }

  
  /**
   * Default Rate limiter in pps.
   * @return defaultRl
  **/
  @ApiModelProperty(value = "Default Rate limiter in pps.")


 
  @VsoMethod  
  public Integer getDefaultRl() {
    return defaultRl;
  }
    
  @VsoMethod
  public void setDefaultRl(Integer defaultRl) {
    this.defaultRl = defaultRl;
  }

  
  /**
   * Rate limiter for number of flow probes in pps.
   * @return flowProbeRl
  **/
  @ApiModelProperty(value = "Rate limiter for number of flow probes in pps.")


 
  @VsoMethod  
  public Integer getFlowProbeRl() {
    return flowProbeRl;
  }
    
  @VsoMethod
  public void setFlowProbeRl(Integer flowProbeRl) {
    this.flowProbeRl = flowProbeRl;
  }

  
  /**
   * Rate limiter for ICMP requests in pps.
   * @return icmpRl
  **/
  @ApiModelProperty(value = "Rate limiter for ICMP requests in pps.")


 
  @VsoMethod  
  public Integer getIcmpRl() {
    return icmpRl;
  }
    
  @VsoMethod
  public void setIcmpRl(Integer icmpRl) {
    this.icmpRl = icmpRl;
  }

  
  /**
   * Rate limiter for ICMP response in pps.
   * @return icmpRspRl
  **/
  @ApiModelProperty(value = "Rate limiter for ICMP response in pps.")


 
  @VsoMethod  
  public Integer getIcmpRspRl() {
    return icmpRspRl;
  }
    
  @VsoMethod
  public void setIcmpRspRl(Integer icmpRspRl) {
    this.icmpRspRl = icmpRspRl;
  }

  
  /**
   * Rate limiter for number RST pkts sent in pps.
   * @return rstRl
  **/
  @ApiModelProperty(value = "Rate limiter for number RST pkts sent in pps.")


 
  @VsoMethod  
  public Integer getRstRl() {
    return rstRl;
  }
    
  @VsoMethod
  public void setRstRl(Integer rstRl) {
    this.rstRl = rstRl;
  }

  
  public String getObjectID() {
		return "SeRateLimiters";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeRateLimiters seRateLimiters = (SeRateLimiters) o;
    return Objects.equals(this.arpRl, seRateLimiters.arpRl) &&
        Objects.equals(this.defaultRl, seRateLimiters.defaultRl) &&
        Objects.equals(this.flowProbeRl, seRateLimiters.flowProbeRl) &&
        Objects.equals(this.icmpRl, seRateLimiters.icmpRl) &&
        Objects.equals(this.icmpRspRl, seRateLimiters.icmpRspRl) &&
        Objects.equals(this.rstRl, seRateLimiters.rstRl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arpRl, defaultRl, flowProbeRl, icmpRl, icmpRspRl, rstRl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeRateLimiters {\n");
    
    sb.append("    arpRl: ").append(toIndentedString(arpRl)).append("\n");
    sb.append("    defaultRl: ").append(toIndentedString(defaultRl)).append("\n");
    sb.append("    flowProbeRl: ").append(toIndentedString(flowProbeRl)).append("\n");
    sb.append("    icmpRl: ").append(toIndentedString(icmpRl)).append("\n");
    sb.append("    icmpRspRl: ").append(toIndentedString(icmpRspRl)).append("\n");
    sb.append("    rstRl: ").append(toIndentedString(rstRl)).append("\n");
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

