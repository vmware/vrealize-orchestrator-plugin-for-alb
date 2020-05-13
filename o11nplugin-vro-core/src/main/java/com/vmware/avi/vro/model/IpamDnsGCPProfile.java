package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * IpamDnsGCPProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpamDnsGCPProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSGCPPROFILE, idAccessor = "getObjectID()")
@Service
public class IpamDnsGCPProfile extends AviRestResource  {
  @JsonProperty("match_se_group_subnet")
  private Boolean matchSeGroupSubnet = null;

  @JsonProperty("network_host_project_id")
  private String networkHostProjectId = null;

  @JsonProperty("region_name")
  private String regionName = null;

  @JsonProperty("se_project_id")
  private String seProjectId = null;

  @JsonProperty("usable_network_refs")
  @Valid
  private List<String> usableNetworkRefs = null;

  @JsonProperty("use_gcp_network")
  private Boolean useGcpNetwork = null;

  @JsonProperty("vpc_network_name")
  private String vpcNetworkName = null;

  
  /**
   * Match SE group subnets for VIP placement. Default is to not match SE group subnets. Field introduced in 17.1.1.
   * @return matchSeGroupSubnet
  **/
  @ApiModelProperty(value = "Match SE group subnets for VIP placement. Default is to not match SE group subnets. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isMatchSeGroupSubnet() {
    return matchSeGroupSubnet;
  }
    
  @VsoMethod
  public void setMatchSeGroupSubnet(Boolean matchSeGroupSubnet) {
    this.matchSeGroupSubnet = matchSeGroupSubnet;
  }

  
  /**
   * Google Cloud Platform Network Host Project ID. This is the host project in which Google Cloud Platform Network resides. Field introduced in 18.1.2.
   * @return networkHostProjectId
  **/
  @ApiModelProperty(value = "Google Cloud Platform Network Host Project ID. This is the host project in which Google Cloud Platform Network resides. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public String getNetworkHostProjectId() {
    return networkHostProjectId;
  }
    
  @VsoMethod
  public void setNetworkHostProjectId(String networkHostProjectId) {
    this.networkHostProjectId = networkHostProjectId;
  }

  
  /**
   * Google Cloud Platform Region Name. Field introduced in 18.1.2.
   * @return regionName
  **/
  @ApiModelProperty(value = "Google Cloud Platform Region Name. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public String getRegionName() {
    return regionName;
  }
    
  @VsoMethod
  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  
  /**
   * Google Cloud Platform Project ID. This is the project where service engines are hosted. This field is optional. By default it will use the value of the field network_host_project_id. Field introduced in 18.1.2.
   * @return seProjectId
  **/
  @ApiModelProperty(value = "Google Cloud Platform Project ID. This is the project where service engines are hosted. This field is optional. By default it will use the value of the field network_host_project_id. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public String getSeProjectId() {
    return seProjectId;
  }
    
  @VsoMethod
  public void setSeProjectId(String seProjectId) {
    this.seProjectId = seProjectId;
  }

  
  public IpamDnsGCPProfile addUsableNetworkRefsItem(String usableNetworkRefsItem) {
    if (this.usableNetworkRefs == null) {
      this.usableNetworkRefs = new ArrayList<String>();
    }
    this.usableNetworkRefs.add(usableNetworkRefsItem);
    return this;
  }
  
  /**
   * Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. It is a reference to an object of type Network.
   * @return usableNetworkRefs
  **/
  @ApiModelProperty(value = "Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. It is a reference to an object of type Network.")


 
  @VsoMethod  
  public List<String> getUsableNetworkRefs() {
    return usableNetworkRefs;
  }
    
  @VsoMethod
  public void setUsableNetworkRefs(List<String> usableNetworkRefs) {
    this.usableNetworkRefs = usableNetworkRefs;
  }

  
  /**
   * Use Google Cloud Platform Network for Private VIP allocation. By default Avi Vantage Network is used for Private VIP allocation. Field introduced in 18.1.2.
   * @return useGcpNetwork
  **/
  @ApiModelProperty(value = "Use Google Cloud Platform Network for Private VIP allocation. By default Avi Vantage Network is used for Private VIP allocation. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Boolean isUseGcpNetwork() {
    return useGcpNetwork;
  }
    
  @VsoMethod
  public void setUseGcpNetwork(Boolean useGcpNetwork) {
    this.useGcpNetwork = useGcpNetwork;
  }

  
  /**
   * Google Cloud Platform VPC Network Name. Field introduced in 18.1.2.
   * @return vpcNetworkName
  **/
  @ApiModelProperty(value = "Google Cloud Platform VPC Network Name. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public String getVpcNetworkName() {
    return vpcNetworkName;
  }
    
  @VsoMethod
  public void setVpcNetworkName(String vpcNetworkName) {
    this.vpcNetworkName = vpcNetworkName;
  }

  
  public String getObjectID() {
		return "IpamDnsGCPProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpamDnsGCPProfile ipamDnsGCPProfile = (IpamDnsGCPProfile) o;
    return Objects.equals(this.matchSeGroupSubnet, ipamDnsGCPProfile.matchSeGroupSubnet) &&
        Objects.equals(this.networkHostProjectId, ipamDnsGCPProfile.networkHostProjectId) &&
        Objects.equals(this.regionName, ipamDnsGCPProfile.regionName) &&
        Objects.equals(this.seProjectId, ipamDnsGCPProfile.seProjectId) &&
        Objects.equals(this.usableNetworkRefs, ipamDnsGCPProfile.usableNetworkRefs) &&
        Objects.equals(this.useGcpNetwork, ipamDnsGCPProfile.useGcpNetwork) &&
        Objects.equals(this.vpcNetworkName, ipamDnsGCPProfile.vpcNetworkName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchSeGroupSubnet, networkHostProjectId, regionName, seProjectId, usableNetworkRefs, useGcpNetwork, vpcNetworkName);
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

