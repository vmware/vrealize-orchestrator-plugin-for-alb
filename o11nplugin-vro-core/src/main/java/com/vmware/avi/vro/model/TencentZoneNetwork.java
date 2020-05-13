package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * TencentZoneNetwork
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "TencentZoneNetwork")
@VsoFinder(name = Constants.FINDER_VRO_TENCENTZONENETWORK, idAccessor = "getObjectID()")
@Service
public class TencentZoneNetwork extends AviRestResource  {
  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("usable_subnet_id")
  private String usableSubnetId = null;

  
  /**
   * Availability zone. Field introduced in 18.2.3.
   * @return availabilityZone
  **/
  @ApiModelProperty(required = true, value = "Availability zone. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getAvailabilityZone() {
    return availabilityZone;
  }
    
  @VsoMethod
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  
  /**
   * Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. Field introduced in 18.2.3.
   * @return usableSubnetId
  **/
  @ApiModelProperty(required = true, value = "Usable networks for Virtual IP. If VirtualService does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for IP allocation. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getUsableSubnetId() {
    return usableSubnetId;
  }
    
  @VsoMethod
  public void setUsableSubnetId(String usableSubnetId) {
    this.usableSubnetId = usableSubnetId;
  }

  
  public String getObjectID() {
		return "TencentZoneNetwork";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TencentZoneNetwork tencentZoneNetwork = (TencentZoneNetwork) o;
    return Objects.equals(this.availabilityZone, tencentZoneNetwork.availabilityZone) &&
        Objects.equals(this.usableSubnetId, tencentZoneNetwork.usableSubnetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZone, usableSubnetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TencentZoneNetwork {\n");
    
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    usableSubnetId: ").append(toIndentedString(usableSubnetId)).append("\n");
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

