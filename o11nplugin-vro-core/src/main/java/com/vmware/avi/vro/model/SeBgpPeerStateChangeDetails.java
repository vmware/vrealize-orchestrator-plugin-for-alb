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
 * The SeBgpPeerStateChangeDetails is a POJO class extends AviRestResource that used for creating
 * SeBgpPeerStateChangeDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeBgpPeerStateChangeDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEBGPPEERSTATECHANGEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeBgpPeerStateChangeDetails extends AviRestResource {
    @JsonProperty("peer_ip")
    @JsonInclude(Include.NON_NULL)
    private String peerIp = null;

    @JsonProperty("peer_state")
    @JsonInclude(Include.NON_NULL)
    private String peerState = null;

    @JsonProperty("vrf_name")
    @JsonInclude(Include.NON_NULL)
    private String vrfName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ip address of bgp peer.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return peerIp
   */
  @VsoMethod
  public String getPeerIp() {
    return peerIp;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address of bgp peer.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param peerIp set the peerIp.
   */
  @VsoMethod
  public void setPeerIp(String  peerIp) {
    this.peerIp = peerIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Bgp peer state.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return peerState
   */
  @VsoMethod
  public String getPeerState() {
    return peerState;
  }

  /**
   * This is the setter method to the attribute.
   * Bgp peer state.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param peerState set the peerState.
   */
  @VsoMethod
  public void setPeerState(String  peerState) {
    this.peerState = peerState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of virtual routing context in which bgp is configured.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vrfName
   */
  @VsoMethod
  public String getVrfName() {
    return vrfName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of virtual routing context in which bgp is configured.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vrfName set the vrfName.
   */
  @VsoMethod
  public void setVrfName(String  vrfName) {
    this.vrfName = vrfName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeBgpPeerStateChangeDetails objSeBgpPeerStateChangeDetails = (SeBgpPeerStateChangeDetails) o;
  return   Objects.equals(this.peerIp, objSeBgpPeerStateChangeDetails.peerIp)&&
  Objects.equals(this.peerState, objSeBgpPeerStateChangeDetails.peerState)&&
  Objects.equals(this.vrfName, objSeBgpPeerStateChangeDetails.vrfName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeBgpPeerStateChangeDetails {\n");
      sb.append("    peerIp: ").append(toIndentedString(peerIp)).append("\n");
        sb.append("    peerState: ").append(toIndentedString(peerState)).append("\n");
        sb.append("    vrfName: ").append(toIndentedString(vrfName)).append("\n");
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

