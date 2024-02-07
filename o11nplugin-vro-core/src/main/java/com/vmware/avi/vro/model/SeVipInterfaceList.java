package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SeVipInterfaceList is a POJO class extends AviRestResource that used for creating
 * SeVipInterfaceList.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeVipInterfaceList")
@VsoFinder(name = Constants.FINDER_VRO_SEVIPINTERFACELIST)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeVipInterfaceList extends AviRestResource {
    @JsonProperty("is_portchannel")
    @JsonInclude(Include.NON_NULL)
    private Boolean isPortchannel = false;

    @JsonProperty("networks")
    @JsonInclude(Include.NON_NULL)
    private List<DiscoveredNetwork> networks;

    @JsonProperty("vip_intf_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr vipIntfIp;

    @JsonProperty("vip_intf_ip6")
    @JsonInclude(Include.NON_NULL)
    private IpAddr vipIntfIp6;

    @JsonProperty("vip_intf_mac")
    @JsonInclude(Include.NON_NULL)
    private String vipIntfMac;

    @JsonProperty("vlan_id")
    @JsonInclude(Include.NON_NULL)
    private Integer vlanId = 0;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isPortchannel
   */
  @VsoMethod
  public Boolean getIsPortchannel() {
    return isPortchannel;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isPortchannel set the isPortchannel.
   */
  @VsoMethod
  public void setIsPortchannel(Boolean  isPortchannel) {
    this.isPortchannel = isPortchannel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of placement_networks reachable from this interface.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networks
   */
  @VsoMethod
  public List<DiscoveredNetwork> getNetworks() {
    return networks;
  }

  /**
   * This is the setter method. this will set the networks
   * List of placement_networks reachable from this interface.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networks
   */
  @VsoMethod
  public void setNetworks(List<DiscoveredNetwork>  networks) {
    this.networks = networks;
  }

  /**
   * This is the setter method this will set the networks
   * List of placement_networks reachable from this interface.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networks
   */
  @VsoMethod
  public SeVipInterfaceList addNetworksItem(DiscoveredNetwork networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<DiscoveredNetwork>();
    }
    this.networks.add(networksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipIntfIp
   */
  @VsoMethod
  public IpAddr getVipIntfIp() {
    return vipIntfIp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipIntfIp set the vipIntfIp.
   */
  @VsoMethod
  public void setVipIntfIp(IpAddr vipIntfIp) {
    this.vipIntfIp = vipIntfIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipIntfIp6
   */
  @VsoMethod
  public IpAddr getVipIntfIp6() {
    return vipIntfIp6;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipIntfIp6 set the vipIntfIp6.
   */
  @VsoMethod
  public void setVipIntfIp6(IpAddr vipIntfIp6) {
    this.vipIntfIp6 = vipIntfIp6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipIntfMac
   */
  @VsoMethod
  public String getVipIntfMac() {
    return vipIntfMac;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipIntfMac set the vipIntfMac.
   */
  @VsoMethod
  public void setVipIntfMac(String  vipIntfMac) {
    this.vipIntfMac = vipIntfMac;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return vlanId
   */
  @VsoMethod
  public Integer getVlanId() {
    return vlanId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param vlanId set the vlanId.
   */
  @VsoMethod
  public void setVlanId(Integer  vlanId) {
    this.vlanId = vlanId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeVipInterfaceList objSeVipInterfaceList = (SeVipInterfaceList) o;
  return   Objects.equals(this.vipIntfMac, objSeVipInterfaceList.vipIntfMac)&&
  Objects.equals(this.vlanId, objSeVipInterfaceList.vlanId)&&
  Objects.equals(this.vipIntfIp, objSeVipInterfaceList.vipIntfIp)&&
  Objects.equals(this.isPortchannel, objSeVipInterfaceList.isPortchannel)&&
  Objects.equals(this.vipIntfIp6, objSeVipInterfaceList.vipIntfIp6)&&
  Objects.equals(this.networks, objSeVipInterfaceList.networks);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeVipInterfaceList {\n");
      sb.append("    isPortchannel: ").append(toIndentedString(isPortchannel)).append("\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    vipIntfIp: ").append(toIndentedString(vipIntfIp)).append("\n");
        sb.append("    vipIntfIp6: ").append(toIndentedString(vipIntfIp6)).append("\n");
        sb.append("    vipIntfMac: ").append(toIndentedString(vipIntfMac)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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

