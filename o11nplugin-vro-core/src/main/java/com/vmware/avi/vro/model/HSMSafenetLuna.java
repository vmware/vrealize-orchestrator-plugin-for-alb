package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HSMSafenetClientInfo;
import com.vmware.avi.vro.model.HSMSafenetLunaServer;
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
 * HSMSafenetLuna
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HSMSafenetLuna")
@VsoFinder(name = Constants.FINDER_VRO_HSMSAFENETLUNA, idAccessor = "getObjectID()")
@Service
public class HSMSafenetLuna extends AviRestResource  {
  @JsonProperty("ha_group_num")
  private Long haGroupNum = null;

  @JsonProperty("is_ha")
  private Boolean isHa = null;

  @JsonProperty("node_info")
  @Valid
  private List<HSMSafenetClientInfo> nodeInfo = null;

  @JsonProperty("server")
  @Valid
  private List<HSMSafenetLunaServer> server = null;

  @JsonProperty("server_pem")
  private String serverPem = null;

  @JsonProperty("use_dedicated_network")
  private Boolean useDedicatedNetwork = null;

  
  /**
   * Group Number of generated HA Group.
   * @return haGroupNum
  **/
  @ApiModelProperty(value = "Group Number of generated HA Group.")


 
  @VsoMethod  
  public Long getHaGroupNum() {
    return haGroupNum;
  }
    
  @VsoMethod
  public void setHaGroupNum(Long haGroupNum) {
    this.haGroupNum = haGroupNum;
  }

  
  /**
   * Set to indicate HA across more than one servers.
   * @return isHa
  **/
  @ApiModelProperty(required = true, value = "Set to indicate HA across more than one servers.")
  @NotNull


 
  @VsoMethod  
  public Boolean isIsHa() {
    return isHa;
  }
    
  @VsoMethod
  public void setIsHa(Boolean isHa) {
    this.isHa = isHa;
  }

  
  public HSMSafenetLuna addNodeInfoItem(HSMSafenetClientInfo nodeInfoItem) {
    if (this.nodeInfo == null) {
      this.nodeInfo = new ArrayList<HSMSafenetClientInfo>();
    }
    this.nodeInfo.add(nodeInfoItem);
    return this;
  }
  
  /**
   * Node specific information.
   * @return nodeInfo
  **/
  @ApiModelProperty(value = "Node specific information.")

  @Valid

 
  @VsoMethod  
  public List<HSMSafenetClientInfo> getNodeInfo() {
    return nodeInfo;
  }
    
  @VsoMethod
  public void setNodeInfo(List<HSMSafenetClientInfo> nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  
  public HSMSafenetLuna addServerItem(HSMSafenetLunaServer serverItem) {
    if (this.server == null) {
      this.server = new ArrayList<HSMSafenetLunaServer>();
    }
    this.server.add(serverItem);
    return this;
  }
  
  /**
   * SafeNet/Gemalto HSM Servers used for crypto operations.
   * @return server
  **/
  @ApiModelProperty(value = "SafeNet/Gemalto HSM Servers used for crypto operations.")

  @Valid

 
  @VsoMethod  
  public List<HSMSafenetLunaServer> getServer() {
    return server;
  }
    
  @VsoMethod
  public void setServer(List<HSMSafenetLunaServer> server) {
    this.server = server;
  }

  
  /**
   * Generated File - server.pem.
   * @return serverPem
  **/
  @ApiModelProperty(value = "Generated File - server.pem.")


 
  @VsoMethod  
  public String getServerPem() {
    return serverPem;
  }
    
  @VsoMethod
  public void setServerPem(String serverPem) {
    this.serverPem = serverPem;
  }

  
  /**
   * If enabled, dedicated network is used to communicate with HSM,else, the management network is used.
   * @return useDedicatedNetwork
  **/
  @ApiModelProperty(value = "If enabled, dedicated network is used to communicate with HSM,else, the management network is used.")


 
  @VsoMethod  
  public Boolean isUseDedicatedNetwork() {
    return useDedicatedNetwork;
  }
    
  @VsoMethod
  public void setUseDedicatedNetwork(Boolean useDedicatedNetwork) {
    this.useDedicatedNetwork = useDedicatedNetwork;
  }

  
  public String getObjectID() {
		return "HSMSafenetLuna";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HSMSafenetLuna hsMSafenetLuna = (HSMSafenetLuna) o;
    return Objects.equals(this.haGroupNum, hsMSafenetLuna.haGroupNum) &&
        Objects.equals(this.isHa, hsMSafenetLuna.isHa) &&
        Objects.equals(this.nodeInfo, hsMSafenetLuna.nodeInfo) &&
        Objects.equals(this.server, hsMSafenetLuna.server) &&
        Objects.equals(this.serverPem, hsMSafenetLuna.serverPem) &&
        Objects.equals(this.useDedicatedNetwork, hsMSafenetLuna.useDedicatedNetwork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(haGroupNum, isHa, nodeInfo, server, serverPem, useDedicatedNetwork);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HSMSafenetLuna {\n");
    
    sb.append("    haGroupNum: ").append(toIndentedString(haGroupNum)).append("\n");
    sb.append("    isHa: ").append(toIndentedString(isHa)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    serverPem: ").append(toIndentedString(serverPem)).append("\n");
    sb.append("    useDedicatedNetwork: ").append(toIndentedString(useDedicatedNetwork)).append("\n");
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

