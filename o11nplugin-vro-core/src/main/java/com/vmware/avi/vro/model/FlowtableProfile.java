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
 * FlowtableProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "FlowtableProfile")
@VsoFinder(name = Constants.FINDER_VRO_FLOWTABLEPROFILE, idAccessor = "getObjectID()")
@Service
public class FlowtableProfile extends AviRestResource  {
  @JsonProperty("tcp_closed_timeout")
  private Integer tcpClosedTimeout = 5;

  @JsonProperty("tcp_connection_setup_timeout")
  private Integer tcpConnectionSetupTimeout = 10;

  @JsonProperty("tcp_half_closed_timeout")
  private Integer tcpHalfClosedTimeout = 30;

  @JsonProperty("tcp_idle_timeout")
  private Integer tcpIdleTimeout = 300;

  @JsonProperty("tcp_reset_timeout")
  private Integer tcpResetTimeout = 1;

  @JsonProperty("udp_idle_timeout")
  private Integer udpIdleTimeout = 10;

  
  /**
   * Idle timeout in seconds for TCP flows in closed state. Allowed values are 1-36000. Field introduced in 18.2.5.
   * @return tcpClosedTimeout
  **/
  @ApiModelProperty(value = "Idle timeout in seconds for TCP flows in closed state. Allowed values are 1-36000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getTcpClosedTimeout() {
    return tcpClosedTimeout;
  }
    
  @VsoMethod
  public void setTcpClosedTimeout(Integer tcpClosedTimeout) {
    this.tcpClosedTimeout = tcpClosedTimeout;
  }

  
  /**
   * Idle timeout in seconds for nat TCP flows in connection setup state. Allowed values are 1-36000. Field introduced in 18.2.5.
   * @return tcpConnectionSetupTimeout
  **/
  @ApiModelProperty(value = "Idle timeout in seconds for nat TCP flows in connection setup state. Allowed values are 1-36000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getTcpConnectionSetupTimeout() {
    return tcpConnectionSetupTimeout;
  }
    
  @VsoMethod
  public void setTcpConnectionSetupTimeout(Integer tcpConnectionSetupTimeout) {
    this.tcpConnectionSetupTimeout = tcpConnectionSetupTimeout;
  }

  
  /**
   * Idle timeout in seconds for TCP flows in half closed state. Allowed values are 1-36000. Field introduced in 18.2.5.
   * @return tcpHalfClosedTimeout
  **/
  @ApiModelProperty(value = "Idle timeout in seconds for TCP flows in half closed state. Allowed values are 1-36000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getTcpHalfClosedTimeout() {
    return tcpHalfClosedTimeout;
  }
    
  @VsoMethod
  public void setTcpHalfClosedTimeout(Integer tcpHalfClosedTimeout) {
    this.tcpHalfClosedTimeout = tcpHalfClosedTimeout;
  }

  
  /**
   * Idle timeout in seconds for TCP flows. Allowed values are 1-36000. Field introduced in 18.2.5.
   * @return tcpIdleTimeout
  **/
  @ApiModelProperty(value = "Idle timeout in seconds for TCP flows. Allowed values are 1-36000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getTcpIdleTimeout() {
    return tcpIdleTimeout;
  }
    
  @VsoMethod
  public void setTcpIdleTimeout(Integer tcpIdleTimeout) {
    this.tcpIdleTimeout = tcpIdleTimeout;
  }

  
  /**
   * Timeout in seconds for TCP flows after RST is seen.Within this timeout, if any non-syn packet is seenfrom the endpoint from which RST is received,nat-flow moves to established state. Otherwise nat-flowis cleaned up. This state helps to mitigate the impactof RST attacks. Allowed values are 1-36000. Field introduced in 18.2.5.
   * @return tcpResetTimeout
  **/
  @ApiModelProperty(value = "Timeout in seconds for TCP flows after RST is seen.Within this timeout, if any non-syn packet is seenfrom the endpoint from which RST is received,nat-flow moves to established state. Otherwise nat-flowis cleaned up. This state helps to mitigate the impactof RST attacks. Allowed values are 1-36000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getTcpResetTimeout() {
    return tcpResetTimeout;
  }
    
  @VsoMethod
  public void setTcpResetTimeout(Integer tcpResetTimeout) {
    this.tcpResetTimeout = tcpResetTimeout;
  }

  
  /**
   * Idle timeout in seconds for UDP flows. Allowed values are 1-36000. Field introduced in 18.2.5.
   * @return udpIdleTimeout
  **/
  @ApiModelProperty(value = "Idle timeout in seconds for UDP flows. Allowed values are 1-36000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getUdpIdleTimeout() {
    return udpIdleTimeout;
  }
    
  @VsoMethod
  public void setUdpIdleTimeout(Integer udpIdleTimeout) {
    this.udpIdleTimeout = udpIdleTimeout;
  }

  
  public String getObjectID() {
		return "FlowtableProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowtableProfile flowtableProfile = (FlowtableProfile) o;
    return Objects.equals(this.tcpClosedTimeout, flowtableProfile.tcpClosedTimeout) &&
        Objects.equals(this.tcpConnectionSetupTimeout, flowtableProfile.tcpConnectionSetupTimeout) &&
        Objects.equals(this.tcpHalfClosedTimeout, flowtableProfile.tcpHalfClosedTimeout) &&
        Objects.equals(this.tcpIdleTimeout, flowtableProfile.tcpIdleTimeout) &&
        Objects.equals(this.tcpResetTimeout, flowtableProfile.tcpResetTimeout) &&
        Objects.equals(this.udpIdleTimeout, flowtableProfile.udpIdleTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tcpClosedTimeout, tcpConnectionSetupTimeout, tcpHalfClosedTimeout, tcpIdleTimeout, tcpResetTimeout, udpIdleTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowtableProfile {\n");
    
    sb.append("    tcpClosedTimeout: ").append(toIndentedString(tcpClosedTimeout)).append("\n");
    sb.append("    tcpConnectionSetupTimeout: ").append(toIndentedString(tcpConnectionSetupTimeout)).append("\n");
    sb.append("    tcpHalfClosedTimeout: ").append(toIndentedString(tcpHalfClosedTimeout)).append("\n");
    sb.append("    tcpIdleTimeout: ").append(toIndentedString(tcpIdleTimeout)).append("\n");
    sb.append("    tcpResetTimeout: ").append(toIndentedString(tcpResetTimeout)).append("\n");
    sb.append("    udpIdleTimeout: ").append(toIndentedString(udpIdleTimeout)).append("\n");
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

