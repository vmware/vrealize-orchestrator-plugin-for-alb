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
 * VipAutoscaleZones
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VipAutoscaleZones")
@VsoFinder(name = Constants.FINDER_VRO_VIPAUTOSCALEZONES, idAccessor = "getObjectID()")
@Service
public class VipAutoscaleZones extends AviRestResource  {
  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("fip_capable")
  private Boolean fipCapable = null;

  @JsonProperty("subnet_uuid")
  private String subnetUuid = null;

  
  /**
   * Availability zone associated with the subnet. Field introduced in 17.2.12, 18.1.2.
   * @return availabilityZone
  **/
  @ApiModelProperty(readOnly = true, value = "Availability zone associated with the subnet. Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public String getAvailabilityZone() {
    return availabilityZone;
  }
    
  @VsoMethod
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  
  /**
   * Determines if the subnet is capable of hosting publicly accessible IP. Field introduced in 17.2.12, 18.1.2.
   * @return fipCapable
  **/
  @ApiModelProperty(readOnly = true, value = "Determines if the subnet is capable of hosting publicly accessible IP. Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public Boolean isFipCapable() {
    return fipCapable;
  }
    
  @VsoMethod
  public void setFipCapable(Boolean fipCapable) {
    this.fipCapable = fipCapable;
  }

  
  /**
   * UUID of the subnet for new IP address allocation. Field introduced in 17.2.12, 18.1.2.
   * @return subnetUuid
  **/
  @ApiModelProperty(value = "UUID of the subnet for new IP address allocation. Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public String getSubnetUuid() {
    return subnetUuid;
  }
    
  @VsoMethod
  public void setSubnetUuid(String subnetUuid) {
    this.subnetUuid = subnetUuid;
  }

  
  public String getObjectID() {
		return "VipAutoscaleZones";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VipAutoscaleZones vipAutoscaleZones = (VipAutoscaleZones) o;
    return Objects.equals(this.availabilityZone, vipAutoscaleZones.availabilityZone) &&
        Objects.equals(this.fipCapable, vipAutoscaleZones.fipCapable) &&
        Objects.equals(this.subnetUuid, vipAutoscaleZones.subnetUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZone, fipCapable, subnetUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VipAutoscaleZones {\n");
    
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    fipCapable: ").append(toIndentedString(fipCapable)).append("\n");
    sb.append("    subnetUuid: ").append(toIndentedString(subnetUuid)).append("\n");
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

