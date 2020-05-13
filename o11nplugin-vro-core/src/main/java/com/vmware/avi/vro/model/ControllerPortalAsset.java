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
 * ControllerPortalAsset
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ControllerPortalAsset")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERPORTALASSET, idAccessor = "getObjectID()")
@Service
public class ControllerPortalAsset extends AviRestResource  {
  @JsonProperty("asset_id")
  private String assetId = null;

  
  /**
   * Asset ID corresponding to this Controller Cluster, returned on a successful registration. Field introduced in 18.2.6.
   * @return assetId
  **/
  @ApiModelProperty(value = "Asset ID corresponding to this Controller Cluster, returned on a successful registration. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getAssetId() {
    return assetId;
  }
    
  @VsoMethod
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  
  public String getObjectID() {
		return "ControllerPortalAsset";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerPortalAsset controllerPortalAsset = (ControllerPortalAsset) o;
    return Objects.equals(this.assetId, controllerPortalAsset.assetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId);
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

