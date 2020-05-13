package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DsrProfile;
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
 * UDPFastPathProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "UDPFastPathProfile")
@VsoFinder(name = Constants.FINDER_VRO_UDPFASTPATHPROFILE, idAccessor = "getObjectID()")
@Service
public class UDPFastPathProfile extends AviRestResource  {
  @JsonProperty("dsr_profile")
  private DsrProfile dsrProfile = null;

  @JsonProperty("per_pkt_loadbalance")
  private Boolean perPktLoadbalance = null;

  @JsonProperty("session_idle_timeout")
  private Integer sessionIdleTimeout = 10;

  @JsonProperty("snat")
  private Boolean snat = true;

  
  /**
   * DSR profile information. Field introduced in 18.2.3.
   * @return dsrProfile
  **/
  @ApiModelProperty(value = "DSR profile information. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public DsrProfile getDsrProfile() {
    return dsrProfile;
  }
    
  @VsoMethod
  public void setDsrProfile(DsrProfile dsrProfile) {
    this.dsrProfile = dsrProfile;
  }

  
  /**
   * When enabled, every UDP packet is considered a new transaction and may be load balanced to a different server.  When disabled, packets from the same client source IP and port are sent to the same server.
   * @return perPktLoadbalance
  **/
  @ApiModelProperty(value = "When enabled, every UDP packet is considered a new transaction and may be load balanced to a different server.  When disabled, packets from the same client source IP and port are sent to the same server.")


 
  @VsoMethod  
  public Boolean isPerPktLoadbalance() {
    return perPktLoadbalance;
  }
    
  @VsoMethod
  public void setPerPktLoadbalance(Boolean perPktLoadbalance) {
    this.perPktLoadbalance = perPktLoadbalance;
  }

  
  /**
   * The amount of time (in sec) for which a flow needs to be idle before it is deleted. Allowed values are 2-3600.
   * @return sessionIdleTimeout
  **/
  @ApiModelProperty(value = "The amount of time (in sec) for which a flow needs to be idle before it is deleted. Allowed values are 2-3600.")


 
  @VsoMethod  
  public Integer getSessionIdleTimeout() {
    return sessionIdleTimeout;
  }
    
  @VsoMethod
  public void setSessionIdleTimeout(Integer sessionIdleTimeout) {
    this.sessionIdleTimeout = sessionIdleTimeout;
  }

  
  /**
   * When disabled, Source NAT will not be performed for all client UDP packets.
   * @return snat
  **/
  @ApiModelProperty(value = "When disabled, Source NAT will not be performed for all client UDP packets.")


 
  @VsoMethod  
  public Boolean isSnat() {
    return snat;
  }
    
  @VsoMethod
  public void setSnat(Boolean snat) {
    this.snat = snat;
  }

  
  public String getObjectID() {
		return "UDPFastPathProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UDPFastPathProfile udPFastPathProfile = (UDPFastPathProfile) o;
    return Objects.equals(this.dsrProfile, udPFastPathProfile.dsrProfile) &&
        Objects.equals(this.perPktLoadbalance, udPFastPathProfile.perPktLoadbalance) &&
        Objects.equals(this.sessionIdleTimeout, udPFastPathProfile.sessionIdleTimeout) &&
        Objects.equals(this.snat, udPFastPathProfile.snat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dsrProfile, perPktLoadbalance, sessionIdleTimeout, snat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UDPFastPathProfile {\n");
    
    sb.append("    dsrProfile: ").append(toIndentedString(dsrProfile)).append("\n");
    sb.append("    perPktLoadbalance: ").append(toIndentedString(perPktLoadbalance)).append("\n");
    sb.append("    sessionIdleTimeout: ").append(toIndentedString(sessionIdleTimeout)).append("\n");
    sb.append("    snat: ").append(toIndentedString(snat)).append("\n");
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

