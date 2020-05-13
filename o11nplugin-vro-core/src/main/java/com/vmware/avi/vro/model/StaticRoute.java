package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
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
 * StaticRoute
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "StaticRoute")
@VsoFinder(name = Constants.FINDER_VRO_STATICROUTE, idAccessor = "getObjectID()")
@Service
public class StaticRoute extends AviRestResource  {
  @JsonProperty("disable_gateway_monitor")
  private Boolean disableGatewayMonitor = null;

  @JsonProperty("if_name")
  private String ifName = null;

  @JsonProperty("next_hop")
  private IpAddr nextHop = null;

  @JsonProperty("prefix")
  private IpAddrPrefix prefix = null;

  @JsonProperty("route_id")
  private String routeId = null;

  
  /**
   * Disable the gateway monitor for default gateway. They are monitored by default. Field introduced in 17.1.1.
   * @return disableGatewayMonitor
  **/
  @ApiModelProperty(value = "Disable the gateway monitor for default gateway. They are monitored by default. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isDisableGatewayMonitor() {
    return disableGatewayMonitor;
  }
    
  @VsoMethod
  public void setDisableGatewayMonitor(Boolean disableGatewayMonitor) {
    this.disableGatewayMonitor = disableGatewayMonitor;
  }

  
  /**
   * if_name of StaticRoute.
   * @return ifName
  **/
  @ApiModelProperty(value = "if_name of StaticRoute.")


 
  @VsoMethod  
  public String getIfName() {
    return ifName;
  }
    
  @VsoMethod
  public void setIfName(String ifName) {
    this.ifName = ifName;
  }

  
  /**
   * Placeholder for description of property next_hop of obj type StaticRoute field type str  type object
   * @return nextHop
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property next_hop of obj type StaticRoute field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getNextHop() {
    return nextHop;
  }
    
  @VsoMethod
  public void setNextHop(IpAddr nextHop) {
    this.nextHop = nextHop;
  }

  
  /**
   * Placeholder for description of property prefix of obj type StaticRoute field type str  type object
   * @return prefix
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property prefix of obj type StaticRoute field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getPrefix() {
    return prefix;
  }
    
  @VsoMethod
  public void setPrefix(IpAddrPrefix prefix) {
    this.prefix = prefix;
  }

  
  /**
   * route_id of StaticRoute.
   * @return routeId
  **/
  @ApiModelProperty(required = true, value = "route_id of StaticRoute.")
  @NotNull


 
  @VsoMethod  
  public String getRouteId() {
    return routeId;
  }
    
  @VsoMethod
  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }

  
  public String getObjectID() {
		return "StaticRoute";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticRoute staticRoute = (StaticRoute) o;
    return Objects.equals(this.disableGatewayMonitor, staticRoute.disableGatewayMonitor) &&
        Objects.equals(this.ifName, staticRoute.ifName) &&
        Objects.equals(this.nextHop, staticRoute.nextHop) &&
        Objects.equals(this.prefix, staticRoute.prefix) &&
        Objects.equals(this.routeId, staticRoute.routeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableGatewayMonitor, ifName, nextHop, prefix, routeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticRoute {\n");
    
    sb.append("    disableGatewayMonitor: ").append(toIndentedString(disableGatewayMonitor)).append("\n");
    sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
    sb.append("    nextHop: ").append(toIndentedString(nextHop)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
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

