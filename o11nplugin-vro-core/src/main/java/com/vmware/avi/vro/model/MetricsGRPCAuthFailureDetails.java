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
 * The MetricsGRPCAuthFailureDetails is a POJO class extends AviRestResource that used for creating
 * MetricsGRPCAuthFailureDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsGRPCAuthFailureDetails")
@VsoFinder(name = Constants.FINDER_VRO_METRICSGRPCAUTHFAILUREDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsGRPCAuthFailureDetails extends AviRestResource {
    @JsonProperty("peer")
    @JsonInclude(Include.NON_NULL)
    private String peer;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return peer
   */
  @VsoMethod
  public String getPeer() {
    return peer;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param peer set the peer.
   */
  @VsoMethod
  public void setPeer(String  peer) {
    this.peer = peer;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricsGRPCAuthFailureDetails objMetricsGRPCAuthFailureDetails = (MetricsGRPCAuthFailureDetails) o;
  return   Objects.equals(this.peer, objMetricsGRPCAuthFailureDetails.peer);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsGRPCAuthFailureDetails {\n");
      sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
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

