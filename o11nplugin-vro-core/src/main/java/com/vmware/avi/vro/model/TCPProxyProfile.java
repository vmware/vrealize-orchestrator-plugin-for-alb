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
 * TCPProxyProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "TCPProxyProfile")
@VsoFinder(name = Constants.FINDER_VRO_TCPPROXYPROFILE, idAccessor = "getObjectID()")
@Service
public class TCPProxyProfile extends AviRestResource  {
  @JsonProperty("aggressive_congestion_avoidance")
  private Boolean aggressiveCongestionAvoidance = null;

  @JsonProperty("auto_window_growth")
  private Boolean autoWindowGrowth = true;

  @JsonProperty("automatic")
  private Boolean automatic = true;

  @JsonProperty("cc_algo")
  private String ccAlgo = "CC_ALGO_NEW_RENO";

  @JsonProperty("congestion_recovery_scaling_factor")
  private Integer congestionRecoveryScalingFactor = 2;

  @JsonProperty("idle_connection_timeout")
  private Integer idleConnectionTimeout = 600;

  @JsonProperty("idle_connection_type")
  private String idleConnectionType = "KEEP_ALIVE";

  @JsonProperty("ignore_time_wait")
  private Boolean ignoreTimeWait = null;

  @JsonProperty("ip_dscp")
  private Integer ipDscp = null;

  @JsonProperty("keepalive_in_halfclose_state")
  private Boolean keepaliveInHalfcloseState = true;

  @JsonProperty("max_retransmissions")
  private Integer maxRetransmissions = 8;

  @JsonProperty("max_segment_size")
  private Integer maxSegmentSize = null;

  @JsonProperty("max_syn_retransmissions")
  private Integer maxSynRetransmissions = 8;

  @JsonProperty("min_rexmt_timeout")
  private Integer minRexmtTimeout = null;

  @JsonProperty("nagles_algorithm")
  private Boolean naglesAlgorithm = null;

  @JsonProperty("reassembly_queue_size")
  private Integer reassemblyQueueSize = null;

  @JsonProperty("receive_window")
  private Integer receiveWindow = 64;

  @JsonProperty("reorder_threshold")
  private Integer reorderThreshold = null;

  @JsonProperty("slow_start_scaling_factor")
  private Integer slowStartScalingFactor = 1;

  @JsonProperty("time_wait_delay")
  private Integer timeWaitDelay = 2000;

  @JsonProperty("use_interface_mtu")
  private Boolean useInterfaceMtu = true;

  
  /**
   * Controls the our congestion window to send, normally it's 1 mss, If this option is turned on, we use 10 msses.
   * @return aggressiveCongestionAvoidance
  **/
  @ApiModelProperty(value = "Controls the our congestion window to send, normally it's 1 mss, If this option is turned on, we use 10 msses.")


 
  @VsoMethod  
  public Boolean isAggressiveCongestionAvoidance() {
    return aggressiveCongestionAvoidance;
  }
    
  @VsoMethod
  public void setAggressiveCongestionAvoidance(Boolean aggressiveCongestionAvoidance) {
    this.aggressiveCongestionAvoidance = aggressiveCongestionAvoidance;
  }

  
  /**
   * Controls whether the windows are static or supports autogrowth. Maximum that it can grow to is limited to 4MB. Field introduced in 20.1.1.
   * @return autoWindowGrowth
  **/
  @ApiModelProperty(value = "Controls whether the windows are static or supports autogrowth. Maximum that it can grow to is limited to 4MB. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isAutoWindowGrowth() {
    return autoWindowGrowth;
  }
    
  @VsoMethod
  public void setAutoWindowGrowth(Boolean autoWindowGrowth) {
    this.autoWindowGrowth = autoWindowGrowth;
  }

  
  /**
   * Dynamically pick the relevant parameters for connections.
   * @return automatic
  **/
  @ApiModelProperty(value = "Dynamically pick the relevant parameters for connections.")


 
  @VsoMethod  
  public Boolean isAutomatic() {
    return automatic;
  }
    
  @VsoMethod
  public void setAutomatic(Boolean automatic) {
    this.automatic = automatic;
  }

  
  /**
   * Controls the congestion control algorithm we use. Enum options - CC_ALGO_NEW_RENO, CC_ALGO_CUBIC, CC_ALGO_HTCP.
   * @return ccAlgo
  **/
  @ApiModelProperty(value = "Controls the congestion control algorithm we use. Enum options - CC_ALGO_NEW_RENO, CC_ALGO_CUBIC, CC_ALGO_HTCP.")


 
  @VsoMethod  
  public String getCcAlgo() {
    return ccAlgo;
  }
    
  @VsoMethod
  public void setCcAlgo(String ccAlgo) {
    this.ccAlgo = ccAlgo;
  }

  
  /**
   * Congestion window scaling factor after recovery. Allowed values are 0-8. Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * @return congestionRecoveryScalingFactor
  **/
  @ApiModelProperty(value = "Congestion window scaling factor after recovery. Allowed values are 0-8. Field introduced in 17.2.12, 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public Integer getCongestionRecoveryScalingFactor() {
    return congestionRecoveryScalingFactor;
  }
    
  @VsoMethod
  public void setCongestionRecoveryScalingFactor(Integer congestionRecoveryScalingFactor) {
    this.congestionRecoveryScalingFactor = congestionRecoveryScalingFactor;
  }

  
  /**
   * The duration for keepalive probes or session idle timeout. Max value is 3600 seconds, min is 5.  Set to 0 to allow infinite idle time. Allowed values are 5-14400. Special values are 0 - 'infinite'.
   * @return idleConnectionTimeout
  **/
  @ApiModelProperty(value = "The duration for keepalive probes or session idle timeout. Max value is 3600 seconds, min is 5.  Set to 0 to allow infinite idle time. Allowed values are 5-14400. Special values are 0 - 'infinite'.")


 
  @VsoMethod  
  public Integer getIdleConnectionTimeout() {
    return idleConnectionTimeout;
  }
    
  @VsoMethod
  public void setIdleConnectionTimeout(Integer idleConnectionTimeout) {
    this.idleConnectionTimeout = idleConnectionTimeout;
  }

  
  /**
   * Controls the behavior of idle connections. Enum options - KEEP_ALIVE, CLOSE_IDLE.
   * @return idleConnectionType
  **/
  @ApiModelProperty(value = "Controls the behavior of idle connections. Enum options - KEEP_ALIVE, CLOSE_IDLE.")


 
  @VsoMethod  
  public String getIdleConnectionType() {
    return idleConnectionType;
  }
    
  @VsoMethod
  public void setIdleConnectionType(String idleConnectionType) {
    this.idleConnectionType = idleConnectionType;
  }

  
  /**
   * A new SYN is accepted from the same 4-tuple even if there is already a connection in TIME_WAIT state.  This is equivalent of setting Time Wait Delay to 0.
   * @return ignoreTimeWait
  **/
  @ApiModelProperty(value = "A new SYN is accepted from the same 4-tuple even if there is already a connection in TIME_WAIT state.  This is equivalent of setting Time Wait Delay to 0.")


 
  @VsoMethod  
  public Boolean isIgnoreTimeWait() {
    return ignoreTimeWait;
  }
    
  @VsoMethod
  public void setIgnoreTimeWait(Boolean ignoreTimeWait) {
    this.ignoreTimeWait = ignoreTimeWait;
  }

  
  /**
   * Controls the value of the Differentiated Services Code Point field inserted in the IP header.  This has two options   Set to a specific value, or Pass Through, which uses the incoming DSCP value. Allowed values are 0-63. Special values are MAX - 'Passthrough'.
   * @return ipDscp
  **/
  @ApiModelProperty(value = "Controls the value of the Differentiated Services Code Point field inserted in the IP header.  This has two options   Set to a specific value, or Pass Through, which uses the incoming DSCP value. Allowed values are 0-63. Special values are MAX - 'Passthrough'.")


 
  @VsoMethod  
  public Integer getIpDscp() {
    return ipDscp;
  }
    
  @VsoMethod
  public void setIpDscp(Integer ipDscp) {
    this.ipDscp = ipDscp;
  }

  
  /**
   * Controls whether to keep the connection alive with keepalive messages in the TCP half close state. The interval for sending keepalive messages is 30s. If a timeout is already configured in the network profile, this will not override it. Field introduced in 18.2.6.
   * @return keepaliveInHalfcloseState
  **/
  @ApiModelProperty(value = "Controls whether to keep the connection alive with keepalive messages in the TCP half close state. The interval for sending keepalive messages is 30s. If a timeout is already configured in the network profile, this will not override it. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isKeepaliveInHalfcloseState() {
    return keepaliveInHalfcloseState;
  }
    
  @VsoMethod
  public void setKeepaliveInHalfcloseState(Boolean keepaliveInHalfcloseState) {
    this.keepaliveInHalfcloseState = keepaliveInHalfcloseState;
  }

  
  /**
   * The number of attempts at retransmit before closing the connection. Allowed values are 3-8.
   * @return maxRetransmissions
  **/
  @ApiModelProperty(value = "The number of attempts at retransmit before closing the connection. Allowed values are 3-8.")


 
  @VsoMethod  
  public Integer getMaxRetransmissions() {
    return maxRetransmissions;
  }
    
  @VsoMethod
  public void setMaxRetransmissions(Integer maxRetransmissions) {
    this.maxRetransmissions = maxRetransmissions;
  }

  
  /**
   * Maximum TCP segment size. Allowed values are 512-9000. Special values are 0 - 'Use Interface MTU'.
   * @return maxSegmentSize
  **/
  @ApiModelProperty(value = "Maximum TCP segment size. Allowed values are 512-9000. Special values are 0 - 'Use Interface MTU'.")


 
  @VsoMethod  
  public Integer getMaxSegmentSize() {
    return maxSegmentSize;
  }
    
  @VsoMethod
  public void setMaxSegmentSize(Integer maxSegmentSize) {
    this.maxSegmentSize = maxSegmentSize;
  }

  
  /**
   * The maximum number of attempts at retransmitting a SYN packet before giving up. Allowed values are 3-8.
   * @return maxSynRetransmissions
  **/
  @ApiModelProperty(value = "The maximum number of attempts at retransmitting a SYN packet before giving up. Allowed values are 3-8.")


 
  @VsoMethod  
  public Integer getMaxSynRetransmissions() {
    return maxSynRetransmissions;
  }
    
  @VsoMethod
  public void setMaxSynRetransmissions(Integer maxSynRetransmissions) {
    this.maxSynRetransmissions = maxSynRetransmissions;
  }

  
  /**
   * The minimum wait time (in millisec) to retransmit packet. Allowed values are 50-5000. Field introduced in 17.2.8.
   * @return minRexmtTimeout
  **/
  @ApiModelProperty(value = "The minimum wait time (in millisec) to retransmit packet. Allowed values are 50-5000. Field introduced in 17.2.8.")


 
  @VsoMethod  
  public Integer getMinRexmtTimeout() {
    return minRexmtTimeout;
  }
    
  @VsoMethod
  public void setMinRexmtTimeout(Integer minRexmtTimeout) {
    this.minRexmtTimeout = minRexmtTimeout;
  }

  
  /**
   * Consolidates small data packets to send clients fewer but larger packets.  Adversely affects real time protocols such as telnet or SSH.
   * @return naglesAlgorithm
  **/
  @ApiModelProperty(value = "Consolidates small data packets to send clients fewer but larger packets.  Adversely affects real time protocols such as telnet or SSH.")


 
  @VsoMethod  
  public Boolean isNaglesAlgorithm() {
    return naglesAlgorithm;
  }
    
  @VsoMethod
  public void setNaglesAlgorithm(Boolean naglesAlgorithm) {
    this.naglesAlgorithm = naglesAlgorithm;
  }

  
  /**
   * Maximum number of TCP segments that can be queued for reassembly. Configuring this to 0 disables the feature and provides unlimited queuing. Field introduced in 17.2.13, 18.1.4, 18.2.1.
   * @return reassemblyQueueSize
  **/
  @ApiModelProperty(value = "Maximum number of TCP segments that can be queued for reassembly. Configuring this to 0 disables the feature and provides unlimited queuing. Field introduced in 17.2.13, 18.1.4, 18.2.1.")


 
  @VsoMethod  
  public Integer getReassemblyQueueSize() {
    return reassemblyQueueSize;
  }
    
  @VsoMethod
  public void setReassemblyQueueSize(Integer reassemblyQueueSize) {
    this.reassemblyQueueSize = reassemblyQueueSize;
  }

  
  /**
   * Size of the receive window. Allowed values are 2-65536.
   * @return receiveWindow
  **/
  @ApiModelProperty(value = "Size of the receive window. Allowed values are 2-65536.")


 
  @VsoMethod  
  public Integer getReceiveWindow() {
    return receiveWindow;
  }
    
  @VsoMethod
  public void setReceiveWindow(Integer receiveWindow) {
    this.receiveWindow = receiveWindow;
  }

  
  /**
   * Controls the number of duplicate acks required to trigger retransmission. Setting a higher value reduces retransmission caused by packet reordering. A larger value is recommended in public cloud environments where packet reordering is quite common. The default value is 8 in public cloud platforms (AWS, Azure, GCP), and 3 in other environments. Allowed values are 1-100. Field introduced in 17.2.7.
   * @return reorderThreshold
  **/
  @ApiModelProperty(value = "Controls the number of duplicate acks required to trigger retransmission. Setting a higher value reduces retransmission caused by packet reordering. A larger value is recommended in public cloud environments where packet reordering is quite common. The default value is 8 in public cloud platforms (AWS, Azure, GCP), and 3 in other environments. Allowed values are 1-100. Field introduced in 17.2.7.")


 
  @VsoMethod  
  public Integer getReorderThreshold() {
    return reorderThreshold;
  }
    
  @VsoMethod
  public void setReorderThreshold(Integer reorderThreshold) {
    this.reorderThreshold = reorderThreshold;
  }

  
  /**
   * Congestion window scaling factor during slow start. Allowed values are 0-8. Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * @return slowStartScalingFactor
  **/
  @ApiModelProperty(value = "Congestion window scaling factor during slow start. Allowed values are 0-8. Field introduced in 17.2.12, 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public Integer getSlowStartScalingFactor() {
    return slowStartScalingFactor;
  }
    
  @VsoMethod
  public void setSlowStartScalingFactor(Integer slowStartScalingFactor) {
    this.slowStartScalingFactor = slowStartScalingFactor;
  }

  
  /**
   * The time (in millisec) to wait before closing a connection in the TIME_WAIT state. Allowed values are 500-2000. Special values are 0 - 'immediate'.
   * @return timeWaitDelay
  **/
  @ApiModelProperty(value = "The time (in millisec) to wait before closing a connection in the TIME_WAIT state. Allowed values are 500-2000. Special values are 0 - 'immediate'.")


 
  @VsoMethod  
  public Integer getTimeWaitDelay() {
    return timeWaitDelay;
  }
    
  @VsoMethod
  public void setTimeWaitDelay(Integer timeWaitDelay) {
    this.timeWaitDelay = timeWaitDelay;
  }

  
  /**
   * Use the interface MTU to calculate the TCP max segment size.
   * @return useInterfaceMtu
  **/
  @ApiModelProperty(value = "Use the interface MTU to calculate the TCP max segment size.")


 
  @VsoMethod  
  public Boolean isUseInterfaceMtu() {
    return useInterfaceMtu;
  }
    
  @VsoMethod
  public void setUseInterfaceMtu(Boolean useInterfaceMtu) {
    this.useInterfaceMtu = useInterfaceMtu;
  }

  
  public String getObjectID() {
		return "TCPProxyProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TCPProxyProfile tcPProxyProfile = (TCPProxyProfile) o;
    return Objects.equals(this.aggressiveCongestionAvoidance, tcPProxyProfile.aggressiveCongestionAvoidance) &&
        Objects.equals(this.autoWindowGrowth, tcPProxyProfile.autoWindowGrowth) &&
        Objects.equals(this.automatic, tcPProxyProfile.automatic) &&
        Objects.equals(this.ccAlgo, tcPProxyProfile.ccAlgo) &&
        Objects.equals(this.congestionRecoveryScalingFactor, tcPProxyProfile.congestionRecoveryScalingFactor) &&
        Objects.equals(this.idleConnectionTimeout, tcPProxyProfile.idleConnectionTimeout) &&
        Objects.equals(this.idleConnectionType, tcPProxyProfile.idleConnectionType) &&
        Objects.equals(this.ignoreTimeWait, tcPProxyProfile.ignoreTimeWait) &&
        Objects.equals(this.ipDscp, tcPProxyProfile.ipDscp) &&
        Objects.equals(this.keepaliveInHalfcloseState, tcPProxyProfile.keepaliveInHalfcloseState) &&
        Objects.equals(this.maxRetransmissions, tcPProxyProfile.maxRetransmissions) &&
        Objects.equals(this.maxSegmentSize, tcPProxyProfile.maxSegmentSize) &&
        Objects.equals(this.maxSynRetransmissions, tcPProxyProfile.maxSynRetransmissions) &&
        Objects.equals(this.minRexmtTimeout, tcPProxyProfile.minRexmtTimeout) &&
        Objects.equals(this.naglesAlgorithm, tcPProxyProfile.naglesAlgorithm) &&
        Objects.equals(this.reassemblyQueueSize, tcPProxyProfile.reassemblyQueueSize) &&
        Objects.equals(this.receiveWindow, tcPProxyProfile.receiveWindow) &&
        Objects.equals(this.reorderThreshold, tcPProxyProfile.reorderThreshold) &&
        Objects.equals(this.slowStartScalingFactor, tcPProxyProfile.slowStartScalingFactor) &&
        Objects.equals(this.timeWaitDelay, tcPProxyProfile.timeWaitDelay) &&
        Objects.equals(this.useInterfaceMtu, tcPProxyProfile.useInterfaceMtu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggressiveCongestionAvoidance, autoWindowGrowth, automatic, ccAlgo, congestionRecoveryScalingFactor, idleConnectionTimeout, idleConnectionType, ignoreTimeWait, ipDscp, keepaliveInHalfcloseState, maxRetransmissions, maxSegmentSize, maxSynRetransmissions, minRexmtTimeout, naglesAlgorithm, reassemblyQueueSize, receiveWindow, reorderThreshold, slowStartScalingFactor, timeWaitDelay, useInterfaceMtu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TCPProxyProfile {\n");
    
    sb.append("    aggressiveCongestionAvoidance: ").append(toIndentedString(aggressiveCongestionAvoidance)).append("\n");
    sb.append("    autoWindowGrowth: ").append(toIndentedString(autoWindowGrowth)).append("\n");
    sb.append("    automatic: ").append(toIndentedString(automatic)).append("\n");
    sb.append("    ccAlgo: ").append(toIndentedString(ccAlgo)).append("\n");
    sb.append("    congestionRecoveryScalingFactor: ").append(toIndentedString(congestionRecoveryScalingFactor)).append("\n");
    sb.append("    idleConnectionTimeout: ").append(toIndentedString(idleConnectionTimeout)).append("\n");
    sb.append("    idleConnectionType: ").append(toIndentedString(idleConnectionType)).append("\n");
    sb.append("    ignoreTimeWait: ").append(toIndentedString(ignoreTimeWait)).append("\n");
    sb.append("    ipDscp: ").append(toIndentedString(ipDscp)).append("\n");
    sb.append("    keepaliveInHalfcloseState: ").append(toIndentedString(keepaliveInHalfcloseState)).append("\n");
    sb.append("    maxRetransmissions: ").append(toIndentedString(maxRetransmissions)).append("\n");
    sb.append("    maxSegmentSize: ").append(toIndentedString(maxSegmentSize)).append("\n");
    sb.append("    maxSynRetransmissions: ").append(toIndentedString(maxSynRetransmissions)).append("\n");
    sb.append("    minRexmtTimeout: ").append(toIndentedString(minRexmtTimeout)).append("\n");
    sb.append("    naglesAlgorithm: ").append(toIndentedString(naglesAlgorithm)).append("\n");
    sb.append("    reassemblyQueueSize: ").append(toIndentedString(reassemblyQueueSize)).append("\n");
    sb.append("    receiveWindow: ").append(toIndentedString(receiveWindow)).append("\n");
    sb.append("    reorderThreshold: ").append(toIndentedString(reorderThreshold)).append("\n");
    sb.append("    slowStartScalingFactor: ").append(toIndentedString(slowStartScalingFactor)).append("\n");
    sb.append("    timeWaitDelay: ").append(toIndentedString(timeWaitDelay)).append("\n");
    sb.append("    useInterfaceMtu: ").append(toIndentedString(useInterfaceMtu)).append("\n");
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

