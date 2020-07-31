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
 * The RetryPlacementParams is a POJO class extends AviRestResource that used for creating
 * RetryPlacementParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RetryPlacementParams")
@VsoFinder(name = Constants.FINDER_VRO_RETRYPLACEMENTPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RetryPlacementParams extends AviRestResource {
  @JsonProperty("all_east_west")
  @JsonInclude(Include.NON_NULL)
  private Boolean allEastWest = false;

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;

  @JsonProperty("vip_id")
  @JsonInclude(Include.NON_NULL)
  private String vipId = null;



  /**
   * This is the getter method this will return the attribute value.
   * Retry placement operations for all east-west services.
   * Field introduced in 17.1.6,17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return allEastWest
   */
  @VsoMethod
  public Boolean getAllEastWest() {
    return allEastWest;
  }

  /**
   * This is the setter method to the attribute.
   * Retry placement operations for all east-west services.
   * Field introduced in 17.1.6,17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param allEastWest set the allEastWest.
   */
  @VsoMethod
  public void setAllEastWest(Boolean  allEastWest) {
    this.allEastWest = allEastWest;
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
   * Indicates the vip_id that needs placement retrial.
   * Field introduced in 17.1.2.
   * @return vipId
   */
  @VsoMethod
  public String getVipId() {
    return vipId;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates the vip_id that needs placement retrial.
   * Field introduced in 17.1.2.
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
  RetryPlacementParams objRetryPlacementParams = (RetryPlacementParams) o;
  return   Objects.equals(this.uuid, objRetryPlacementParams.uuid)&&
  Objects.equals(this.vipId, objRetryPlacementParams.vipId)&&
  Objects.equals(this.allEastWest, objRetryPlacementParams.allEastWest);
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

