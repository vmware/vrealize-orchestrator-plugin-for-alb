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
 * PatchData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PatchData")
@VsoFinder(name = Constants.FINDER_VRO_PATCHDATA, idAccessor = "getObjectID()")
@Service
public class PatchData extends AviRestResource  {
  @JsonProperty("patch_image_ref")
  private String patchImageRef = null;

  @JsonProperty("patch_version")
  private String patchVersion = null;

  
  /**
   * Image uuid for identifying the patch. It is a reference to an object of type Image. Field introduced in 18.2.8, 20.1.1.
   * @return patchImageRef
  **/
  @ApiModelProperty(value = "Image uuid for identifying the patch. It is a reference to an object of type Image. Field introduced in 18.2.8, 20.1.1.")


 
  @VsoMethod  
  public String getPatchImageRef() {
    return patchImageRef;
  }
    
  @VsoMethod
  public void setPatchImageRef(String patchImageRef) {
    this.patchImageRef = patchImageRef;
  }

  
  /**
   * Patch version. Field introduced in 18.2.8, 20.1.1.
   * @return patchVersion
  **/
  @ApiModelProperty(value = "Patch version. Field introduced in 18.2.8, 20.1.1.")


 
  @VsoMethod  
  public String getPatchVersion() {
    return patchVersion;
  }
    
  @VsoMethod
  public void setPatchVersion(String patchVersion) {
    this.patchVersion = patchVersion;
  }

  
  public String getObjectID() {
		return "PatchData";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchData patchData = (PatchData) o;
    return Objects.equals(this.patchImageRef, patchData.patchImageRef) &&
        Objects.equals(this.patchVersion, patchData.patchVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patchImageRef, patchVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchData {\n");
    
    sb.append("    patchImageRef: ").append(toIndentedString(patchImageRef)).append("\n");
    sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
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

