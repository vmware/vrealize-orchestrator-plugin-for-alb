package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrPrefix;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * DiscoveredNetwork
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DiscoveredNetwork")
@VsoFinder(name = Constants.FINDER_VRO_DISCOVEREDNETWORK, idAccessor = "getObjectID()")
@Service
public class DiscoveredNetwork extends AviRestResource  {
  @JsonProperty("network_ref")
  private String networkRef = null;

  @JsonProperty("subnet")
  @Valid
  private List<IpAddrPrefix> subnet = null;

  @JsonProperty("subnet6")
  @Valid
  private List<IpAddrPrefix> subnet6 = null;

  
  /**
   * Discovered network for this IP. It is a reference to an object of type Network.
   * @return networkRef
  **/
  @ApiModelProperty(required = true, value = "Discovered network for this IP. It is a reference to an object of type Network.")
  @NotNull


 
  @VsoMethod  
  public String getNetworkRef() {
    return networkRef;
  }
    
  @VsoMethod
  public void setNetworkRef(String networkRef) {
    this.networkRef = networkRef;
  }

  
  public DiscoveredNetwork addSubnetItem(IpAddrPrefix subnetItem) {
    if (this.subnet == null) {
      this.subnet = new ArrayList<IpAddrPrefix>();
    }
    this.subnet.add(subnetItem);
    return this;
  }
  
  /**
   * Discovered subnet for this IP.
   * @return subnet
  **/
  @ApiModelProperty(value = "Discovered subnet for this IP.")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getSubnet() {
    return subnet;
  }
    
  @VsoMethod
  public void setSubnet(List<IpAddrPrefix> subnet) {
    this.subnet = subnet;
  }

  
  public DiscoveredNetwork addSubnet6Item(IpAddrPrefix subnet6Item) {
    if (this.subnet6 == null) {
      this.subnet6 = new ArrayList<IpAddrPrefix>();
    }
    this.subnet6.add(subnet6Item);
    return this;
  }
  
  /**
   * Discovered IPv6 subnet for this IP. Field introduced in 18.1.1.
   * @return subnet6
  **/
  @ApiModelProperty(value = "Discovered IPv6 subnet for this IP. Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getSubnet6() {
    return subnet6;
  }
    
  @VsoMethod
  public void setSubnet6(List<IpAddrPrefix> subnet6) {
    this.subnet6 = subnet6;
  }

  
  public String getObjectID() {
		return "DiscoveredNetwork";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveredNetwork discoveredNetwork = (DiscoveredNetwork) o;
    return Objects.equals(this.networkRef, discoveredNetwork.networkRef) &&
        Objects.equals(this.subnet, discoveredNetwork.subnet) &&
        Objects.equals(this.subnet6, discoveredNetwork.subnet6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkRef, subnet, subnet6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveredNetwork {\n");
    
    sb.append("    networkRef: ").append(toIndentedString(networkRef)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    subnet6: ").append(toIndentedString(subnet6)).append("\n");
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

