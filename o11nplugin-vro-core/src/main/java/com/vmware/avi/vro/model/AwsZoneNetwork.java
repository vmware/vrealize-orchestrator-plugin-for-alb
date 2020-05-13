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
 * AwsZoneNetwork
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AwsZoneNetwork")
@VsoFinder(name = Constants.FINDER_VRO_AWSZONENETWORK, idAccessor = "getObjectID()")
@Service
public class AwsZoneNetwork extends AviRestResource  {
  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("usable_network_uuids")
  @Valid
  private List<String> usableNetworkUuids = null;

  
  /**
   * Availability zone. Field introduced in 17.1.3.
   * @return availabilityZone
  **/
  @ApiModelProperty(required = true, value = "Availability zone. Field introduced in 17.1.3.")
  @NotNull


 
  @VsoMethod  
  public String getAvailabilityZone() {
    return availabilityZone;
  }
    
  @VsoMethod
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  
  public AwsZoneNetwork addUsableNetworkUuidsItem(String usableNetworkUuidsItem) {
    if (this.usableNetworkUuids == null) {
      this.usableNetworkUuids = new ArrayList<String>();
    }
    this.usableNetworkUuids.add(usableNetworkUuidsItem);
    return this;
  }
  
  /**
   * Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. Field introduced in 17.1.3.
   * @return usableNetworkUuids
  **/
  @ApiModelProperty(value = "Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public List<String> getUsableNetworkUuids() {
    return usableNetworkUuids;
  }
    
  @VsoMethod
  public void setUsableNetworkUuids(List<String> usableNetworkUuids) {
    this.usableNetworkUuids = usableNetworkUuids;
  }

  
  public String getObjectID() {
		return "AwsZoneNetwork";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsZoneNetwork awsZoneNetwork = (AwsZoneNetwork) o;
    return Objects.equals(this.availabilityZone, awsZoneNetwork.availabilityZone) &&
        Objects.equals(this.usableNetworkUuids, awsZoneNetwork.usableNetworkUuids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZone, usableNetworkUuids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsZoneNetwork {\n");
    
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    usableNetworkUuids: ").append(toIndentedString(usableNetworkUuids)).append("\n");
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

