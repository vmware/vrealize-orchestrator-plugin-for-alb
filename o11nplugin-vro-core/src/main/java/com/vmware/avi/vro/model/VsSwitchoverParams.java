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
 * VsSwitchoverParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VsSwitchoverParams")
@VsoFinder(name = Constants.FINDER_VRO_VSSWITCHOVERPARAMS, idAccessor = "getObjectID()")
@Service
public class VsSwitchoverParams extends AviRestResource  {
  @JsonProperty("se_uuid")
  private String seUuid = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vip_id")
  private String vipId = null;

  
  /**
   * Unique object identifier of se.
   * @return seUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of se.")


 
  @VsoMethod  
  public String getSeUuid() {
    return seUuid;
  }
    
  @VsoMethod
  public void setSeUuid(String seUuid) {
    this.seUuid = seUuid;
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
   *  Field introduced in 17.1.1.
   * @return vipId
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 17.1.1.")
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
		return "VsSwitchoverParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsSwitchoverParams vsSwitchoverParams = (VsSwitchoverParams) o;
    return Objects.equals(this.seUuid, vsSwitchoverParams.seUuid) &&
        Objects.equals(this.uuid, vsSwitchoverParams.uuid) &&
        Objects.equals(this.vipId, vsSwitchoverParams.vipId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seUuid, uuid, vipId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsSwitchoverParams {\n");
    
    sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
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

