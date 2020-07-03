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
 * The GCPVIPRoutes is a POJO class extends AviRestResource that used for creating
 * GCPVIPRoutes.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GCPVIPRoutes")
@VsoFinder(name = Constants.FINDER_VRO_GCPVIPROUTES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GCPVIPRoutes extends AviRestResource {
  @JsonProperty("match_se_group_subnet")
  @JsonInclude(Include.NON_NULL)
  private Boolean matchSeGroupSubnet = false;



  /**
   * This is the getter method this will return the attribute value.
   * Match se group subnets for vip placement.
   * Default is to not match se group subnets.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return matchSeGroupSubnet
   */
  @VsoMethod
  public Boolean getMatchSeGroupSubnet() {
    return matchSeGroupSubnet;
  }

  /**
   * This is the setter method to the attribute.
   * Match se group subnets for vip placement.
   * Default is to not match se group subnets.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param matchSeGroupSubnet set the matchSeGroupSubnet.
   */
  @VsoMethod
  public void setMatchSeGroupSubnet(Boolean  matchSeGroupSubnet) {
    this.matchSeGroupSubnet = matchSeGroupSubnet;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GCPVIPRoutes objGCPVIPRoutes = (GCPVIPRoutes) o;
  return   Objects.equals(this.matchSeGroupSubnet, objGCPVIPRoutes.matchSeGroupSubnet);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GCPVIPRoutes {\n");
      sb.append("    matchSeGroupSubnet: ").append(toIndentedString(matchSeGroupSubnet)).append("\n");
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
