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
 * The IpamDnsGCPProfile is a POJO class extends AviRestResource that used for creating
 * IpamDnsGCPProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IpamDnsGCPProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSGCPPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IpamDnsGCPProfile extends AviRestResource {
    @JsonProperty("match_se_group_subnet")
    @JsonInclude(Include.NON_NULL)
    private Boolean matchSeGroupSubnet = false;

    @JsonProperty("network_host_project_id")
    @JsonInclude(Include.NON_NULL)
    private String networkHostProjectId = null;

    @JsonProperty("region_name")
    @JsonInclude(Include.NON_NULL)
    private String regionName = null;

    @JsonProperty("se_project_id")
    @JsonInclude(Include.NON_NULL)
    private String seProjectId = null;

    @JsonProperty("usable_network_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> usableNetworkRefs = null;

    @JsonProperty("use_gcp_network")
    @JsonInclude(Include.NON_NULL)
    private Boolean useGcpNetwork = false;

    @JsonProperty("vpc_network_name")
    @JsonInclude(Include.NON_NULL)
    private String vpcNetworkName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Match se group subnets for vip placement.
   * Default is to not match se group subnets.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return matchSeGroupSubnet
   */
  @VsoMethod
  public Boolean getMatchSeGroupSubnet() {
    return matchSeGroupSubnet;
  }

  /**
   * This is the setter method to the attribute.
   * Match se group subnets for vip placement.
   * Default is to not match se group subnets.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param matchSeGroupSubnet set the matchSeGroupSubnet.
   */
  @VsoMethod
  public void setMatchSeGroupSubnet(Boolean  matchSeGroupSubnet) {
    this.matchSeGroupSubnet = matchSeGroupSubnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Google cloud platform network host project id.
   * This is the host project in which google cloud platform network resides.
   * Field introduced in 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkHostProjectId
   */
  @VsoMethod
  public String getNetworkHostProjectId() {
    return networkHostProjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Google cloud platform network host project id.
   * This is the host project in which google cloud platform network resides.
   * Field introduced in 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param networkHostProjectId set the networkHostProjectId.
   */
  @VsoMethod
  public void setNetworkHostProjectId(String  networkHostProjectId) {
    this.networkHostProjectId = networkHostProjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Google cloud platform region name.
   * Field introduced in 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return regionName
   */
  @VsoMethod
  public String getRegionName() {
    return regionName;
  }

  /**
   * This is the setter method to the attribute.
   * Google cloud platform region name.
   * Field introduced in 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param regionName set the regionName.
   */
  @VsoMethod
  public void setRegionName(String  regionName) {
    this.regionName = regionName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Google cloud platform project id.
   * This is the project where service engines are hosted.
   * This field is optional.
   * By default it will use the value of the field network_host_project_id.
   * Field introduced in 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seProjectId
   */
  @VsoMethod
  public String getSeProjectId() {
    return seProjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Google cloud platform project id.
   * This is the project where service engines are hosted.
   * This field is optional.
   * By default it will use the value of the field network_host_project_id.
   * Field introduced in 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seProjectId set the seProjectId.
   */
  @VsoMethod
  public void setSeProjectId(String  seProjectId) {
    this.seProjectId = seProjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Usable networks for virtual ip.
   * If virtualservice does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for ip
   * allocation.
   * It is a reference to an object of type network.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usableNetworkRefs
   */
  @VsoMethod
  public List<String> getUsableNetworkRefs() {
    return usableNetworkRefs;
  }

  /**
   * This is the setter method. this will set the usableNetworkRefs
   * Usable networks for virtual ip.
   * If virtualservice does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for ip
   * allocation.
   * It is a reference to an object of type network.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usableNetworkRefs
   */
  @VsoMethod
  public void setUsableNetworkRefs(List<String>  usableNetworkRefs) {
    this.usableNetworkRefs = usableNetworkRefs;
  }

  /**
   * This is the setter method this will set the usableNetworkRefs
   * Usable networks for virtual ip.
   * If virtualservice does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for ip
   * allocation.
   * It is a reference to an object of type network.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usableNetworkRefs
   */
  @VsoMethod
  public IpamDnsGCPProfile addUsableNetworkRefsItem(String usableNetworkRefsItem) {
    if (this.usableNetworkRefs == null) {
      this.usableNetworkRefs = new ArrayList<String>();
    }
    this.usableNetworkRefs.add(usableNetworkRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Use google cloud platform network for private vip allocation.
   * By default avi vantage network is used for private vip allocation.
   * Field introduced in 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useGcpNetwork
   */
  @VsoMethod
  public Boolean getUseGcpNetwork() {
    return useGcpNetwork;
  }

  /**
   * This is the setter method to the attribute.
   * Use google cloud platform network for private vip allocation.
   * By default avi vantage network is used for private vip allocation.
   * Field introduced in 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useGcpNetwork set the useGcpNetwork.
   */
  @VsoMethod
  public void setUseGcpNetwork(Boolean  useGcpNetwork) {
    this.useGcpNetwork = useGcpNetwork;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Google cloud platform vpc network name.
   * Field introduced in 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vpcNetworkName
   */
  @VsoMethod
  public String getVpcNetworkName() {
    return vpcNetworkName;
  }

  /**
   * This is the setter method to the attribute.
   * Google cloud platform vpc network name.
   * Field introduced in 18.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vpcNetworkName set the vpcNetworkName.
   */
  @VsoMethod
  public void setVpcNetworkName(String  vpcNetworkName) {
    this.vpcNetworkName = vpcNetworkName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IpamDnsGCPProfile objIpamDnsGCPProfile = (IpamDnsGCPProfile) o;
  return   Objects.equals(this.usableNetworkRefs, objIpamDnsGCPProfile.usableNetworkRefs)&&
  Objects.equals(this.matchSeGroupSubnet, objIpamDnsGCPProfile.matchSeGroupSubnet)&&
  Objects.equals(this.useGcpNetwork, objIpamDnsGCPProfile.useGcpNetwork)&&
  Objects.equals(this.networkHostProjectId, objIpamDnsGCPProfile.networkHostProjectId)&&
  Objects.equals(this.seProjectId, objIpamDnsGCPProfile.seProjectId)&&
  Objects.equals(this.regionName, objIpamDnsGCPProfile.regionName)&&
  Objects.equals(this.vpcNetworkName, objIpamDnsGCPProfile.vpcNetworkName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IpamDnsGCPProfile {\n");
      sb.append("    matchSeGroupSubnet: ").append(toIndentedString(matchSeGroupSubnet)).append("\n");
        sb.append("    networkHostProjectId: ").append(toIndentedString(networkHostProjectId)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    seProjectId: ").append(toIndentedString(seProjectId)).append("\n");
        sb.append("    usableNetworkRefs: ").append(toIndentedString(usableNetworkRefs)).append("\n");
        sb.append("    useGcpNetwork: ").append(toIndentedString(useGcpNetwork)).append("\n");
        sb.append("    vpcNetworkName: ").append(toIndentedString(vpcNetworkName)).append("\n");
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

