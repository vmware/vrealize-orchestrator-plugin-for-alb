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
 * CloneServer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CloneServer")
@VsoFinder(name = Constants.FINDER_VRO_CLONESERVER, idAccessor = "getObjectID()")
@Service
public class CloneServer extends AviRestResource  {
  @JsonProperty("ip_address")
  private IpAddr ipAddress = null;

  @JsonProperty("mac")
  private String mac = null;

  @JsonProperty("network_ref")
  private String networkRef = null;

  @JsonProperty("subnet")
  private IpAddrPrefix subnet = null;

  
  /**
   * IP Address of the Clone Server. Field introduced in 17.1.1.
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP Address of the Clone Server. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public IpAddr getIpAddress() {
    return ipAddress;
  }
    
  @VsoMethod
  public void setIpAddress(IpAddr ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   * MAC Address of the Clone Server. Field introduced in 17.1.1.
   * @return mac
  **/
  @ApiModelProperty(value = "MAC Address of the Clone Server. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getMac() {
    return mac;
  }
    
  @VsoMethod
  public void setMac(String mac) {
    this.mac = mac;
  }

  
  /**
   * Network to clone the traffic to. It is a reference to an object of type Network. Field introduced in 17.1.1.
   * @return networkRef
  **/
  @ApiModelProperty(value = "Network to clone the traffic to. It is a reference to an object of type Network. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getNetworkRef() {
    return networkRef;
  }
    
  @VsoMethod
  public void setNetworkRef(String networkRef) {
    this.networkRef = networkRef;
  }

  
  /**
   * Subnet of the network to clone the traffic to. Field introduced in 17.1.1.
   * @return subnet
  **/
  @ApiModelProperty(value = "Subnet of the network to clone the traffic to. Field introduced in 17.1.1.")

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
		return "CloneServer";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloneServer cloneServer = (CloneServer) o;
    return Objects.equals(this.ipAddress, cloneServer.ipAddress) &&
        Objects.equals(this.mac, cloneServer.mac) &&
        Objects.equals(this.networkRef, cloneServer.networkRef) &&
        Objects.equals(this.subnet, cloneServer.subnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, mac, networkRef, subnet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloneServer {\n");
    
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
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

