package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GCPVIPILB;
import com.vmware.avi.vro.model.GCPVIPRoutes;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GCPVIPAllocation is a POJO class extends AviRestResource that used for creating
 * GCPVIPAllocation.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GCPVIPAllocation")
@VsoFinder(name = Constants.FINDER_VRO_GCPVIPALLOCATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GCPVIPAllocation extends AviRestResource {
  @JsonProperty("ilb")
  @JsonInclude(Include.NON_NULL)
  private GCPVIPILB ilb = null;

  @JsonProperty("mode")
  @JsonInclude(Include.NON_NULL)
  private String mode = "ROUTES";

  @JsonProperty("routes")
  @JsonInclude(Include.NON_NULL)
  private GCPVIPRoutes routes = null;



  /**
   * This is the getter method this will return the attribute value.
   * Configure google cloud internal loadbalancer for vip.
   * The vip will be auto allocated from a google cloud vpc subnet.
   * Field introduced in 20.1.1.
   * @return ilb
   */
  @VsoMethod
  public GCPVIPILB getIlb() {
    return ilb;
  }

  /**
   * This is the setter method to the attribute.
   * Configure google cloud internal loadbalancer for vip.
   * The vip will be auto allocated from a google cloud vpc subnet.
   * Field introduced in 20.1.1.
   * @param ilb set the ilb.
   */
  @VsoMethod
  public void setIlb(GCPVIPILB ilb) {
    this.ilb = ilb;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip allocation mode.
   * Enum options - ROUTES, ILB.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as ROUTES.
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Vip allocation mode.
   * Enum options - ROUTES, ILB.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as ROUTES.
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure google cloud vpc routes for vip.
   * The vip can either be a static ip or auto allocted from avi internal network.
   * The vip should not overlap with any of the subnet ranges in google cloud vpc.
   * Field introduced in 20.1.1.
   * @return routes
   */
  @VsoMethod
  public GCPVIPRoutes getRoutes() {
    return routes;
  }

  /**
   * This is the setter method to the attribute.
   * Configure google cloud vpc routes for vip.
   * The vip can either be a static ip or auto allocted from avi internal network.
   * The vip should not overlap with any of the subnet ranges in google cloud vpc.
   * Field introduced in 20.1.1.
   * @param routes set the routes.
   */
  @VsoMethod
  public void setRoutes(GCPVIPRoutes routes) {
    this.routes = routes;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GCPVIPAllocation objGCPVIPAllocation = (GCPVIPAllocation) o;
  return   Objects.equals(this.routes, objGCPVIPAllocation.routes)&&
  Objects.equals(this.ilb, objGCPVIPAllocation.ilb)&&
  Objects.equals(this.mode, objGCPVIPAllocation.mode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GCPVIPAllocation {\n");
      sb.append("    ilb: ").append(toIndentedString(ilb)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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
