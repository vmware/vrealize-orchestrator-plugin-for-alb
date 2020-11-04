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
 * The ControllerPortalAsset is a POJO class extends AviRestResource that used for creating
 * ControllerPortalAsset.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerPortalAsset")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERPORTALASSET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerPortalAsset extends AviRestResource {
    @JsonProperty("asset_id")
    @JsonInclude(Include.NON_NULL)
    private String assetId = null;



  /**
   * This is the getter method this will return the attribute value.
   * Asset id corresponding to this controller cluster, returned on a successful registration.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return assetId
   */
  @VsoMethod
  public String getAssetId() {
    return assetId;
  }

  /**
   * This is the setter method to the attribute.
   * Asset id corresponding to this controller cluster, returned on a successful registration.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param assetId set the assetId.
   */
  @VsoMethod
  public void setAssetId(String  assetId) {
    this.assetId = assetId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerPortalAsset objControllerPortalAsset = (ControllerPortalAsset) o;
  return   Objects.equals(this.assetId, objControllerPortalAsset.assetId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerPortalAsset {\n");
      sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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

