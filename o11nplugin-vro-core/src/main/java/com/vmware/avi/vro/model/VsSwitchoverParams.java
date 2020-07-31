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
 * The VsSwitchoverParams is a POJO class extends AviRestResource that used for creating
 * VsSwitchoverParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VsSwitchoverParams")
@VsoFinder(name = Constants.FINDER_VRO_VSSWITCHOVERPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VsSwitchoverParams extends AviRestResource {
  @JsonProperty("se_uuid")
  @JsonInclude(Include.NON_NULL)
  private String seUuid = null;

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;

  @JsonProperty("vip_id")
  @JsonInclude(Include.NON_NULL)
  private String vipId = null;



  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * @return vipId
   */
  @VsoMethod
  public String getVipId() {
    return vipId;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * @param vipId set the vipId.
   */
  @VsoMethod
  public void setVipId(String  vipId) {
    this.vipId = vipId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VsSwitchoverParams objVsSwitchoverParams = (VsSwitchoverParams) o;
  return   Objects.equals(this.uuid, objVsSwitchoverParams.uuid)&&
  Objects.equals(this.seUuid, objVsSwitchoverParams.seUuid)&&
  Objects.equals(this.vipId, objVsSwitchoverParams.vipId);
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

