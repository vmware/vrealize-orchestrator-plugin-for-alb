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
 * GCPVIPRoutes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GCPVIPRoutes")
@VsoFinder(name = Constants.FINDER_VRO_GCPVIPROUTES, idAccessor = "getObjectID()")
@Service
public class GCPVIPRoutes extends AviRestResource  {
  @JsonProperty("match_se_group_subnet")
  private Boolean matchSeGroupSubnet = null;

  
  /**
   * Match SE group subnets for VIP placement. Default is to not match SE group subnets. Field introduced in 20.1.1.
   * @return matchSeGroupSubnet
  **/
  @ApiModelProperty(value = "Match SE group subnets for VIP placement. Default is to not match SE group subnets. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isMatchSeGroupSubnet() {
    return matchSeGroupSubnet;
  }
    
  @VsoMethod
  public void setMatchSeGroupSubnet(Boolean matchSeGroupSubnet) {
    this.matchSeGroupSubnet = matchSeGroupSubnet;
  }

  
  public String getObjectID() {
		return "GCPVIPRoutes";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPVIPRoutes gcPVIPRoutes = (GCPVIPRoutes) o;
    return Objects.equals(this.matchSeGroupSubnet, gcPVIPRoutes.matchSeGroupSubnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchSeGroupSubnet);
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

