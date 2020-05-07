package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * PlacementNetwork
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:16:36.466+05:30")

@VsoObject(create = false, name = "PlacementNetwork")
@VsoFinder(name = Constants.FINDER_VRO_PLACEMENTNETWORK, idAccessor = "getObjectID()")
@Service
public class PlacementNetwork extends AviRestResource  {
  @JsonProperty("network_ref")
  private String networkRef = null;

  @JsonProperty("subnet")
  private IpAddrPrefix subnet = null;

  
  /**
   *  It is a reference to an object of type Network.
   * @return networkRef
  **/
  @ApiModelProperty(required = true, value = " It is a reference to an object of type Network.")
  @NotNull


 
  @VsoMethod  
  public String getNetworkRef() {
    return networkRef;
  }
    
  @VsoMethod
  public void setNetworkRef(String networkRef) {
    this.networkRef = networkRef;
  }

  
  /**
   * Placeholder for description of property subnet of obj type PlacementNetwork field type str  type object
   * @return subnet
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property subnet of obj type PlacementNetwork field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getSubnet() {
    return subnet;
  }
    
  @VsoMethod
  public void setSubnet(IpAddrPrefix subnet) {
    this.subnet = subnet;
  }

  
  public String getObjectID() {
		return "PlacementNetwork";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementNetwork placementNetwork = (PlacementNetwork) o;
    return Objects.equals(this.networkRef, placementNetwork.networkRef) &&
        Objects.equals(this.subnet, placementNetwork.subnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkRef, subnet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementNetwork {\n");
    
    sb.append("    networkRef: ").append(toIndentedString(networkRef)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
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

