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
 * TCPFastPathProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "TCPFastPathProfile")
@VsoFinder(name = Constants.FINDER_VRO_TCPFASTPATHPROFILE, idAccessor = "getObjectID()")
@Service
public class TCPFastPathProfile extends AviRestResource  {
  @JsonProperty("dsr_profile")
  private DsrProfile dsrProfile = null;

  @JsonProperty("enable_syn_protection")
  private Boolean enableSynProtection = null;

  @JsonProperty("session_idle_timeout")
  private Integer sessionIdleTimeout = 300;

  
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
   * When enabled, Avi will complete the 3-way handshake with the client before forwarding any packets to the server.  This will protect the server from SYN flood and half open SYN connections.
   * @return enableSynProtection
  **/
  @ApiModelProperty(value = "When enabled, Avi will complete the 3-way handshake with the client before forwarding any packets to the server.  This will protect the server from SYN flood and half open SYN connections.")


 
  @VsoMethod  
  public Boolean isEnableSynProtection() {
    return enableSynProtection;
  }
    
  @VsoMethod
  public void setEnableSynProtection(Boolean enableSynProtection) {
    this.enableSynProtection = enableSynProtection;
  }

  
  /**
   * The amount of time (in sec) for which a connection needs to be idle before it is eligible to be deleted. Allowed values are 5-14400. Special values are 0 - 'infinite'.
   * @return sessionIdleTimeout
  **/
  @ApiModelProperty(value = "The amount of time (in sec) for which a connection needs to be idle before it is eligible to be deleted. Allowed values are 5-14400. Special values are 0 - 'infinite'.")


 
  @VsoMethod  
  public Integer getSessionIdleTimeout() {
    return sessionIdleTimeout;
  }
    
  @VsoMethod
  public void setSessionIdleTimeout(Integer sessionIdleTimeout) {
    this.sessionIdleTimeout = sessionIdleTimeout;
  }

  
  public String getObjectID() {
		return "TCPFastPathProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TCPFastPathProfile tcPFastPathProfile = (TCPFastPathProfile) o;
    return Objects.equals(this.dsrProfile, tcPFastPathProfile.dsrProfile) &&
        Objects.equals(this.enableSynProtection, tcPFastPathProfile.enableSynProtection) &&
        Objects.equals(this.sessionIdleTimeout, tcPFastPathProfile.sessionIdleTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dsrProfile, enableSynProtection, sessionIdleTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TCPFastPathProfile {\n");
    
    sb.append("    dsrProfile: ").append(toIndentedString(dsrProfile)).append("\n");
    sb.append("    enableSynProtection: ").append(toIndentedString(enableSynProtection)).append("\n");
    sb.append("    sessionIdleTimeout: ").append(toIndentedString(sessionIdleTimeout)).append("\n");
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

