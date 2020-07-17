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
 * The VIMgrInterestedEntity is a POJO class extends AviRestResource that used for creating
 * VIMgrInterestedEntity.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VIMgrInterestedEntity")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRINTERESTEDENTITY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VIMgrInterestedEntity extends AviRestResource {
  @JsonProperty("interested_uuid")
  @JsonInclude(Include.NON_NULL)
  private String interestedUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of interested.
   * @return interestedUuid
   */
  @VsoMethod
  public String getInterestedUuid() {
    return interestedUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of interested.
   * @param interestedUuid set the interestedUuid.
   */
  @VsoMethod
  public void setInterestedUuid(String  interestedUuid) {
    this.interestedUuid = interestedUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VIMgrInterestedEntity objVIMgrInterestedEntity = (VIMgrInterestedEntity) o;
  return   Objects.equals(this.interestedUuid, objVIMgrInterestedEntity.interestedUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VIMgrInterestedEntity {\n");
      sb.append("    interestedUuid: ").append(toIndentedString(interestedUuid)).append("\n");
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

