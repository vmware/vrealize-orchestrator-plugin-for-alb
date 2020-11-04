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
 * The HSMSafenetLuna is a POJO class extends AviRestResource that used for creating
 * HSMSafenetLuna.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HSMSafenetLuna")
@VsoFinder(name = Constants.FINDER_VRO_HSMSAFENETLUNA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HSMSafenetLuna extends AviRestResource {
    @JsonProperty("ha_group_num")
    @JsonInclude(Include.NON_NULL)
    private Integer haGroupNum = null;

    @JsonProperty("is_ha")
    @JsonInclude(Include.NON_NULL)
    private Boolean isHa = false;

    @JsonProperty("node_info")
    @JsonInclude(Include.NON_NULL)
    private List<HSMSafenetClientInfo> nodeInfo = null;

    @JsonProperty("server")
    @JsonInclude(Include.NON_NULL)
    private List<HSMSafenetLunaServer> server = null;

    @JsonProperty("server_pem")
    @JsonInclude(Include.NON_NULL)
    private String serverPem = null;

    @JsonProperty("use_dedicated_network")
    @JsonInclude(Include.NON_NULL)
    private Boolean useDedicatedNetwork = false;



  /**
   * This is the getter method this will return the attribute value.
   * Group number of generated ha group.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return haGroupNum
   */
  @VsoMethod
  public Integer getHaGroupNum() {
    return haGroupNum;
  }

  /**
   * This is the setter method to the attribute.
   * Group number of generated ha group.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param haGroupNum set the haGroupNum.
   */
  @VsoMethod
  public void setHaGroupNum(Integer  haGroupNum) {
    this.haGroupNum = haGroupNum;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set to indicate ha across more than one servers.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isHa
   */
  @VsoMethod
  public Boolean getIsHa() {
    return isHa;
  }

  /**
   * This is the setter method to the attribute.
   * Set to indicate ha across more than one servers.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isHa set the isHa.
   */
  @VsoMethod
  public void setIsHa(Boolean  isHa) {
    this.isHa = isHa;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Node specific information.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeInfo
   */
  @VsoMethod
  public List<HSMSafenetClientInfo> getNodeInfo() {
    return nodeInfo;
  }

  /**
   * This is the setter method. this will set the nodeInfo
   * Node specific information.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeInfo
   */
  @VsoMethod
  public void setNodeInfo(List<HSMSafenetClientInfo>  nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  /**
   * This is the setter method this will set the nodeInfo
   * Node specific information.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeInfo
   */
  @VsoMethod
  public HSMSafenetLuna addNodeInfoItem(HSMSafenetClientInfo nodeInfoItem) {
    if (this.nodeInfo == null) {
      this.nodeInfo = new ArrayList<HSMSafenetClientInfo>();
    }
    this.nodeInfo.add(nodeInfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Safenet/gemalto hsm servers used for crypto operations.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return server
   */
  @VsoMethod
  public List<HSMSafenetLunaServer> getServer() {
    return server;
  }

  /**
   * This is the setter method. this will set the server
   * Safenet/gemalto hsm servers used for crypto operations.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return server
   */
  @VsoMethod
  public void setServer(List<HSMSafenetLunaServer>  server) {
    this.server = server;
  }

  /**
   * This is the setter method this will set the server
   * Safenet/gemalto hsm servers used for crypto operations.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return server
   */
  @VsoMethod
  public HSMSafenetLuna addServerItem(HSMSafenetLunaServer serverItem) {
    if (this.server == null) {
      this.server = new ArrayList<HSMSafenetLunaServer>();
    }
    this.server.add(serverItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Generated file - server.pem.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverPem
   */
  @VsoMethod
  public String getServerPem() {
    return serverPem;
  }

  /**
   * This is the setter method to the attribute.
   * Generated file - server.pem.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverPem set the serverPem.
   */
  @VsoMethod
  public void setServerPem(String  serverPem) {
    this.serverPem = serverPem;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If enabled, dedicated network is used to communicate with hsm,else, the management network is used.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useDedicatedNetwork
   */
  @VsoMethod
  public Boolean getUseDedicatedNetwork() {
    return useDedicatedNetwork;
  }

  /**
   * This is the setter method to the attribute.
   * If enabled, dedicated network is used to communicate with hsm,else, the management network is used.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useDedicatedNetwork set the useDedicatedNetwork.
   */
  @VsoMethod
  public void setUseDedicatedNetwork(Boolean  useDedicatedNetwork) {
    this.useDedicatedNetwork = useDedicatedNetwork;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HSMSafenetLuna objHSMSafenetLuna = (HSMSafenetLuna) o;
  return   Objects.equals(this.server, objHSMSafenetLuna.server)&&
  Objects.equals(this.isHa, objHSMSafenetLuna.isHa)&&
  Objects.equals(this.haGroupNum, objHSMSafenetLuna.haGroupNum)&&
  Objects.equals(this.nodeInfo, objHSMSafenetLuna.nodeInfo)&&
  Objects.equals(this.serverPem, objHSMSafenetLuna.serverPem)&&
  Objects.equals(this.useDedicatedNetwork, objHSMSafenetLuna.useDedicatedNetwork);
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

