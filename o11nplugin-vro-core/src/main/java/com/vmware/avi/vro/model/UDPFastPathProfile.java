package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DsrProfile;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The UDPFastPathProfile is a POJO class extends AviRestResource that used for creating
 * UDPFastPathProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UDPFastPathProfile")
@VsoFinder(name = Constants.FINDER_VRO_UDPFASTPATHPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UDPFastPathProfile extends AviRestResource {
  @JsonProperty("dsr_profile")
  @JsonInclude(Include.NON_NULL)
  private DsrProfile dsrProfile = null;

  @JsonProperty("per_pkt_loadbalance")
  @JsonInclude(Include.NON_NULL)
  private Boolean perPktLoadbalance = false;

  @JsonProperty("session_idle_timeout")
  @JsonInclude(Include.NON_NULL)
  private Integer sessionIdleTimeout = 10;

  @JsonProperty("snat")
  @JsonInclude(Include.NON_NULL)
  private Boolean snat = true;



  /**
   * This is the getter method this will return the attribute value.
   * Dsr profile information.
   * Field introduced in 18.2.3.
   * @return dsrProfile
   */
  @VsoMethod
  public DsrProfile getDsrProfile() {
    return dsrProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Dsr profile information.
   * Field introduced in 18.2.3.
   * @param dsrProfile set the dsrProfile.
   */
  @VsoMethod
  public void setDsrProfile(DsrProfile dsrProfile) {
    this.dsrProfile = dsrProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When enabled, every udp packet is considered a new transaction and may be load balanced to a different server.
   * When disabled, packets from the same client source ip and port are sent to the same server.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return perPktLoadbalance
   */
  @VsoMethod
  public Boolean getPerPktLoadbalance() {
    return perPktLoadbalance;
  }

  /**
   * This is the setter method to the attribute.
   * When enabled, every udp packet is considered a new transaction and may be load balanced to a different server.
   * When disabled, packets from the same client source ip and port are sent to the same server.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param perPktLoadbalance set the perPktLoadbalance.
   */
  @VsoMethod
  public void setPerPktLoadbalance(Boolean  perPktLoadbalance) {
    this.perPktLoadbalance = perPktLoadbalance;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The amount of time (in sec) for which a flow needs to be idle before it is deleted.
   * Allowed values are 2-3600.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return sessionIdleTimeout
   */
  @VsoMethod
  public Integer getSessionIdleTimeout() {
    return sessionIdleTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * The amount of time (in sec) for which a flow needs to be idle before it is deleted.
   * Allowed values are 2-3600.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param sessionIdleTimeout set the sessionIdleTimeout.
   */
  @VsoMethod
  public void setSessionIdleTimeout(Integer  sessionIdleTimeout) {
    this.sessionIdleTimeout = sessionIdleTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When disabled, source nat will not be performed for all client udp packets.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return snat
   */
  @VsoMethod
  public Boolean getSnat() {
    return snat;
  }

  /**
   * This is the setter method to the attribute.
   * When disabled, source nat will not be performed for all client udp packets.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param snat set the snat.
   */
  @VsoMethod
  public void setSnat(Boolean  snat) {
    this.snat = snat;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  UDPFastPathProfile objUDPFastPathProfile = (UDPFastPathProfile) o;
  return   Objects.equals(this.dsrProfile, objUDPFastPathProfile.dsrProfile)&&
  Objects.equals(this.perPktLoadbalance, objUDPFastPathProfile.perPktLoadbalance)&&
  Objects.equals(this.snat, objUDPFastPathProfile.snat)&&
  Objects.equals(this.sessionIdleTimeout, objUDPFastPathProfile.sessionIdleTimeout);
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
