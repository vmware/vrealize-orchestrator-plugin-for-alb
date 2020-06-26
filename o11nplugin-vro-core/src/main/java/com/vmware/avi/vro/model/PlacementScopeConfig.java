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
 * The PlacementScopeConfig is a POJO class extends AviRestResource that used for creating
 * PlacementScopeConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PlacementScopeConfig")
@VsoFinder(name = Constants.FINDER_VRO_PLACEMENTSCOPECONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PlacementScopeConfig extends AviRestResource {
  @JsonProperty("vcenter_folder")
  @JsonInclude(Include.NON_NULL)
  private String vcenterFolder = null;

  @JsonProperty("vcenter_ref")
  @JsonInclude(Include.NON_NULL)
  private String vcenterRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Folder to place all the service engine virtual machines in vcenter.
   * Field introduced in 20.1.1.
   * @return vcenterFolder
   */
  @VsoMethod
  public String getVcenterFolder() {
    return vcenterFolder;
  }

  /**
   * This is the setter method to the attribute.
   * Folder to place all the service engine virtual machines in vcenter.
   * Field introduced in 20.1.1.
   * @param vcenterFolder set the vcenterFolder.
   */
  @VsoMethod
  public void setVcenterFolder(String  vcenterFolder) {
    this.vcenterFolder = vcenterFolder;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vcenter server configuration.
   * It is a reference to an object of type vcenterserver.
   * Field introduced in 20.1.1.
   * @return vcenterRef
   */
  @VsoMethod
  public String getVcenterRef() {
    return vcenterRef;
  }

  /**
   * This is the setter method to the attribute.
   * Vcenter server configuration.
   * It is a reference to an object of type vcenterserver.
   * Field introduced in 20.1.1.
   * @param vcenterRef set the vcenterRef.
   */
  @VsoMethod
  public void setVcenterRef(String  vcenterRef) {
    this.vcenterRef = vcenterRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PlacementScopeConfig objPlacementScopeConfig = (PlacementScopeConfig) o;
  return   Objects.equals(this.vcenterFolder, objPlacementScopeConfig.vcenterFolder)&&
  Objects.equals(this.vcenterRef, objPlacementScopeConfig.vcenterRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PlacementScopeConfig {\n");
      sb.append("    vcenterFolder: ").append(toIndentedString(vcenterFolder)).append("\n");
        sb.append("    vcenterRef: ").append(toIndentedString(vcenterRef)).append("\n");
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
