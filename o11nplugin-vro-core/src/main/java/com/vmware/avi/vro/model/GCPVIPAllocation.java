package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.GCPVIPILB;
import com.vmware.avi.vro.model.GCPVIPRoutes;
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
 * GCPVIPAllocation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GCPVIPAllocation")
@VsoFinder(name = Constants.FINDER_VRO_GCPVIPALLOCATION, idAccessor = "getObjectID()")
@Service
public class GCPVIPAllocation extends AviRestResource  {
  @JsonProperty("ilb")
  private GCPVIPILB ilb = null;

  @JsonProperty("mode")
  private String mode = "ROUTES";

  @JsonProperty("routes")
  private GCPVIPRoutes routes = null;

  
  /**
   * Configure Google Cloud Internal LoadBalancer for VIP. The VIP will be auto allocated from a Google Cloud VPC Subnet. Field introduced in 20.1.1.
   * @return ilb
  **/
  @ApiModelProperty(value = "Configure Google Cloud Internal LoadBalancer for VIP. The VIP will be auto allocated from a Google Cloud VPC Subnet. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public GCPVIPILB getIlb() {
    return ilb;
  }
    
  @VsoMethod
  public void setIlb(GCPVIPILB ilb) {
    this.ilb = ilb;
  }

  
  /**
   * VIP Allocation Mode. Enum options - ROUTES, ILB. Field introduced in 20.1.1.
   * @return mode
  **/
  @ApiModelProperty(required = true, value = "VIP Allocation Mode. Enum options - ROUTES, ILB. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getMode() {
    return mode;
  }
    
  @VsoMethod
  public void setMode(String mode) {
    this.mode = mode;
  }

  
  /**
   * Configure Google Cloud VPC Routes for VIP. The VIP can either be a static IP or auto allocted from AVI Internal Network. The VIP should not overlap with any of the subnet ranges in Google Cloud VPC. Field introduced in 20.1.1.
   * @return routes
  **/
  @ApiModelProperty(value = "Configure Google Cloud VPC Routes for VIP. The VIP can either be a static IP or auto allocted from AVI Internal Network. The VIP should not overlap with any of the subnet ranges in Google Cloud VPC. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public GCPVIPRoutes getRoutes() {
    return routes;
  }
    
  @VsoMethod
  public void setRoutes(GCPVIPRoutes routes) {
    this.routes = routes;
  }

  
  public String getObjectID() {
		return "GCPVIPAllocation";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPVIPAllocation gcPVIPAllocation = (GCPVIPAllocation) o;
    return Objects.equals(this.ilb, gcPVIPAllocation.ilb) &&
        Objects.equals(this.mode, gcPVIPAllocation.mode) &&
        Objects.equals(this.routes, gcPVIPAllocation.routes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ilb, mode, routes);
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

