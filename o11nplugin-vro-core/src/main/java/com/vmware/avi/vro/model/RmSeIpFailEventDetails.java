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
 * The RmSeIpFailEventDetails is a POJO class extends AviRestResource that used for creating
 * RmSeIpFailEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RmSeIpFailEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_RMSEIPFAILEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RmSeIpFailEventDetails extends AviRestResource {
    @JsonProperty("host_name")
    @JsonInclude(Include.NON_NULL)
    private String hostName = null;

    @JsonProperty("networks")
    @JsonInclude(Include.NON_NULL)
    private List<RmAddVnic> networks = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("se_name")
    @JsonInclude(Include.NON_NULL)
    private String seName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property host_name of obj type rmseipfaileventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostName
   */
  @VsoMethod
  public String getHostName() {
    return hostName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property host_name of obj type rmseipfaileventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostName set the hostName.
   */
  @VsoMethod
  public void setHostName(String  hostName) {
    this.hostName = hostName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property networks of obj type rmseipfaileventdetails field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networks
   */
  @VsoMethod
  public List<RmAddVnic> getNetworks() {
    return networks;
  }

  /**
   * This is the setter method. this will set the networks
   * Placeholder for description of property networks of obj type rmseipfaileventdetails field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networks
   */
  @VsoMethod
  public void setNetworks(List<RmAddVnic>  networks) {
    this.networks = networks;
  }

  /**
   * This is the setter method this will set the networks
   * Placeholder for description of property networks of obj type rmseipfaileventdetails field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networks
   */
  @VsoMethod
  public RmSeIpFailEventDetails addNetworksItem(RmAddVnic networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<RmAddVnic>();
    }
    this.networks.add(networksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type rmseipfaileventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property reason of obj type rmseipfaileventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_name of obj type rmseipfaileventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_name of obj type rmseipfaileventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RmSeIpFailEventDetails objRmSeIpFailEventDetails = (RmSeIpFailEventDetails) o;
  return   Objects.equals(this.reason, objRmSeIpFailEventDetails.reason)&&
  Objects.equals(this.seName, objRmSeIpFailEventDetails.seName)&&
  Objects.equals(this.hostName, objRmSeIpFailEventDetails.hostName)&&
  Objects.equals(this.networks, objRmSeIpFailEventDetails.networks);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RmSeIpFailEventDetails {\n");
      sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
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

