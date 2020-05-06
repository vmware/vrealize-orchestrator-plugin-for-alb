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
 * RetryPlacementParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "RetryPlacementParams")
@VsoFinder(name = Constants.FINDER_VRO_RETRYPLACEMENTPARAMS, idAccessor = "getObjectID()")
@Service
public class RetryPlacementParams extends AviRestResource  {
  @JsonProperty("all_east_west")
  private Boolean allEastWest = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vip_id")
  private String vipId = null;

  
  /**
   * Retry placement operations for all East-West services. Field introduced in 17.1.6,17.2.2.
   * @return allEastWest
  **/
  @ApiModelProperty(value = "Retry placement operations for all East-West services. Field introduced in 17.1.6,17.2.2.")


 
  @VsoMethod  
  public Boolean isAllEastWest() {
    return allEastWest;
  }
    
  @VsoMethod
  public void setAllEastWest(Boolean allEastWest) {
    this.allEastWest = allEastWest;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * Indicates the vip_id that needs placement retrial. Field introduced in 17.1.2.
   * @return vipId
  **/
  @ApiModelProperty(required = true, value = "Indicates the vip_id that needs placement retrial. Field introduced in 17.1.2.")
  @NotNull


 
  @VsoMethod  
  public String getVipId() {
    return vipId;
  }
    
  @VsoMethod
  public void setVipId(String vipId) {
    this.vipId = vipId;
  }

  
  public String getObjectID() {
		return "RetryPlacementParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetryPlacementParams retryPlacementParams = (RetryPlacementParams) o;
    return Objects.equals(this.allEastWest, retryPlacementParams.allEastWest) &&
        Objects.equals(this.uuid, retryPlacementParams.uuid) &&
        Objects.equals(this.vipId, retryPlacementParams.vipId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allEastWest, uuid, vipId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetryPlacementParams {\n");
    
    sb.append("    allEastWest: ").append(toIndentedString(allEastWest)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
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

