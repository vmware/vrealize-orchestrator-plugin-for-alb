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
 * AwsZoneConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AwsZoneConfig")
@VsoFinder(name = Constants.FINDER_VRO_AWSZONECONFIG, idAccessor = "getObjectID()")
@Service
public class AwsZoneConfig extends AviRestResource  {
  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("mgmt_network_name")
  private String mgmtNetworkName = null;

  @JsonProperty("mgmt_network_uuid")
  private String mgmtNetworkUuid = null;

  
  /**
   * Availability zone.
   * @return availabilityZone
  **/
  @ApiModelProperty(required = true, value = "Availability zone.")
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
   * Name or CIDR of the network in the Availability Zone that will be used as management network.
   * @return mgmtNetworkName
  **/
  @ApiModelProperty(required = true, value = "Name or CIDR of the network in the Availability Zone that will be used as management network.")
  @NotNull


 
  @VsoMethod  
  public String getMgmtNetworkName() {
    return mgmtNetworkName;
  }
    
  @VsoMethod
  public void setMgmtNetworkName(String mgmtNetworkName) {
    this.mgmtNetworkName = mgmtNetworkName;
  }

  
  /**
   * UUID of the network in the Availability Zone that will be used as management network.
   * @return mgmtNetworkUuid
  **/
  @ApiModelProperty(value = "UUID of the network in the Availability Zone that will be used as management network.")


 
  @VsoMethod  
  public String getMgmtNetworkUuid() {
    return mgmtNetworkUuid;
  }
    
  @VsoMethod
  public void setMgmtNetworkUuid(String mgmtNetworkUuid) {
    this.mgmtNetworkUuid = mgmtNetworkUuid;
  }

  
  public String getObjectID() {
		return "AwsZoneConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsZoneConfig awsZoneConfig = (AwsZoneConfig) o;
    return Objects.equals(this.availabilityZone, awsZoneConfig.availabilityZone) &&
        Objects.equals(this.mgmtNetworkName, awsZoneConfig.mgmtNetworkName) &&
        Objects.equals(this.mgmtNetworkUuid, awsZoneConfig.mgmtNetworkUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZone, mgmtNetworkName, mgmtNetworkUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsZoneConfig {\n");
    
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    mgmtNetworkName: ").append(toIndentedString(mgmtNetworkName)).append("\n");
    sb.append("    mgmtNetworkUuid: ").append(toIndentedString(mgmtNetworkUuid)).append("\n");
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

