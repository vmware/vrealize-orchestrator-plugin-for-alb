package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SeGroupOptions;
import com.vmware.avi.vro.model.SeGroupResumeOptions;
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
 * UpgradeOpsParam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "UpgradeOpsParam")
@VsoFinder(name = Constants.FINDER_VRO_UPGRADEOPSPARAM, idAccessor = "getObjectID()")
@Service
public class UpgradeOpsParam extends AviRestResource  {
  @JsonProperty("image_ref")
  private String imageRef = null;

  @JsonProperty("patch_ref")
  private String patchRef = null;

  @JsonProperty("se_group_options")
  private SeGroupOptions seGroupOptions = null;

  @JsonProperty("se_group_resume_options")
  private SeGroupResumeOptions seGroupResumeOptions = null;

  
  /**
   * Image uuid for identifying base image. It is a reference to an object of type Image. Field introduced in 18.2.6.
   * @return imageRef
  **/
  @ApiModelProperty(value = "Image uuid for identifying base image. It is a reference to an object of type Image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getImageRef() {
    return imageRef;
  }
    
  @VsoMethod
  public void setImageRef(String imageRef) {
    this.imageRef = imageRef;
  }

  
  /**
   * Image uuid for identifying patch. It is a reference to an object of type Image. Field introduced in 18.2.6.
   * @return patchRef
  **/
  @ApiModelProperty(value = "Image uuid for identifying patch. It is a reference to an object of type Image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getPatchRef() {
    return patchRef;
  }
    
  @VsoMethod
  public void setPatchRef(String patchRef) {
    this.patchRef = patchRef;
  }

  
  /**
   * This field identifies SE group options that need to be applied during the upgrade operations. Field introduced in 18.2.6.
   * @return seGroupOptions
  **/
  @ApiModelProperty(value = "This field identifies SE group options that need to be applied during the upgrade operations. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public SeGroupOptions getSeGroupOptions() {
    return seGroupOptions;
  }
    
  @VsoMethod
  public void setSeGroupOptions(SeGroupOptions seGroupOptions) {
    this.seGroupOptions = seGroupOptions;
  }

  
  /**
   * Apply options while resuming SE group upgrade operations. Field introduced in 18.2.6.
   * @return seGroupResumeOptions
  **/
  @ApiModelProperty(value = "Apply options while resuming SE group upgrade operations. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public SeGroupResumeOptions getSeGroupResumeOptions() {
    return seGroupResumeOptions;
  }
    
  @VsoMethod
  public void setSeGroupResumeOptions(SeGroupResumeOptions seGroupResumeOptions) {
    this.seGroupResumeOptions = seGroupResumeOptions;
  }

  
  public String getObjectID() {
		return "UpgradeOpsParam";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeOpsParam upgradeOpsParam = (UpgradeOpsParam) o;
    return Objects.equals(this.imageRef, upgradeOpsParam.imageRef) &&
        Objects.equals(this.patchRef, upgradeOpsParam.patchRef) &&
        Objects.equals(this.seGroupOptions, upgradeOpsParam.seGroupOptions) &&
        Objects.equals(this.seGroupResumeOptions, upgradeOpsParam.seGroupResumeOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageRef, patchRef, seGroupOptions, seGroupResumeOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeOpsParam {\n");
    
    sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
    sb.append("    patchRef: ").append(toIndentedString(patchRef)).append("\n");
    sb.append("    seGroupOptions: ").append(toIndentedString(seGroupOptions)).append("\n");
    sb.append("    seGroupResumeOptions: ").append(toIndentedString(seGroupResumeOptions)).append("\n");
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

