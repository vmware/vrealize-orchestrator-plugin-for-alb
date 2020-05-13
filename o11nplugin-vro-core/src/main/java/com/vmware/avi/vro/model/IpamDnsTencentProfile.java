package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.TencentZoneNetwork;
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
 * IpamDnsTencentProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpamDnsTencentProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSTENCENTPROFILE, idAccessor = "getObjectID()")
@Service
public class IpamDnsTencentProfile extends AviRestResource  {
  @JsonProperty("cloud_credentials_ref")
  private String cloudCredentialsRef = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("usable_subnet_ids")
  @Valid
  private List<String> usableSubnetIds = null;

  @JsonProperty("vpc_id")
  private String vpcId = null;

  @JsonProperty("zones")
  @Valid
  private List<TencentZoneNetwork> zones = null;

  
  /**
   * Credentials to access Tencent cloud. It is a reference to an object of type CloudConnectorUser. Field introduced in 18.2.3.
   * @return cloudCredentialsRef
  **/
  @ApiModelProperty(value = "Credentials to access Tencent cloud. It is a reference to an object of type CloudConnectorUser. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getCloudCredentialsRef() {
    return cloudCredentialsRef;
  }
    
  @VsoMethod
  public void setCloudCredentialsRef(String cloudCredentialsRef) {
    this.cloudCredentialsRef = cloudCredentialsRef;
  }

  
  /**
   * VPC region. Field introduced in 18.2.3.
   * @return region
  **/
  @ApiModelProperty(required = true, value = "VPC region. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getRegion() {
    return region;
  }
    
  @VsoMethod
  public void setRegion(String region) {
    this.region = region;
  }

  
  public IpamDnsTencentProfile addUsableSubnetIdsItem(String usableSubnetIdsItem) {
    if (this.usableSubnetIds == null) {
      this.usableSubnetIds = new ArrayList<String>();
    }
    this.usableSubnetIds.add(usableSubnetIdsItem);
    return this;
  }
  
  /**
   * Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. Field introduced in 18.2.3.
   * @return usableSubnetIds
  **/
  @ApiModelProperty(value = "Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public List<String> getUsableSubnetIds() {
    return usableSubnetIds;
  }
    
  @VsoMethod
  public void setUsableSubnetIds(List<String> usableSubnetIds) {
    this.usableSubnetIds = usableSubnetIds;
  }

  
  /**
   * VPC ID. Field introduced in 18.2.3.
   * @return vpcId
  **/
  @ApiModelProperty(required = true, value = "VPC ID. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getVpcId() {
    return vpcId;
  }
    
  @VsoMethod
  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  
  public IpamDnsTencentProfile addZonesItem(TencentZoneNetwork zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<TencentZoneNetwork>();
    }
    this.zones.add(zonesItem);
    return this;
  }
  
  /**
   * Network configuration for Virtual IP per AZ. Field introduced in 18.2.3.
   * @return zones
  **/
  @ApiModelProperty(value = "Network configuration for Virtual IP per AZ. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public List<TencentZoneNetwork> getZones() {
    return zones;
  }
    
  @VsoMethod
  public void setZones(List<TencentZoneNetwork> zones) {
    this.zones = zones;
  }

  
  public String getObjectID() {
		return "IpamDnsTencentProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpamDnsTencentProfile ipamDnsTencentProfile = (IpamDnsTencentProfile) o;
    return Objects.equals(this.cloudCredentialsRef, ipamDnsTencentProfile.cloudCredentialsRef) &&
        Objects.equals(this.region, ipamDnsTencentProfile.region) &&
        Objects.equals(this.usableSubnetIds, ipamDnsTencentProfile.usableSubnetIds) &&
        Objects.equals(this.vpcId, ipamDnsTencentProfile.vpcId) &&
        Objects.equals(this.zones, ipamDnsTencentProfile.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudCredentialsRef, region, usableSubnetIds, vpcId, zones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpamDnsTencentProfile {\n");
    
    sb.append("    cloudCredentialsRef: ").append(toIndentedString(cloudCredentialsRef)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    usableSubnetIds: ").append(toIndentedString(usableSubnetIds)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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

