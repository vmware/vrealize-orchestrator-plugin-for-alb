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
 * RebootData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "RebootData")
@VsoFinder(name = Constants.FINDER_VRO_REBOOTDATA, idAccessor = "getObjectID()")
@Service
public class RebootData extends AviRestResource  {
  @JsonProperty("patch_version")
  private String patchVersion = null;

  @JsonProperty("reboot")
  private Boolean reboot = null;

  
  /**
   * Patch version for which reboot flag need to be computed. Field introduced in 18.2.8, 20.1.1.
   * @return patchVersion
  **/
  @ApiModelProperty(value = "Patch version for which reboot flag need to be computed. Field introduced in 18.2.8, 20.1.1.")


 
  @VsoMethod  
  public String getPatchVersion() {
    return patchVersion;
  }
    
  @VsoMethod
  public void setPatchVersion(String patchVersion) {
    this.patchVersion = patchVersion;
  }

  
  /**
   * This variable tells whether reboot has to be performed. Field introduced in 18.2.8, 20.1.1.
   * @return reboot
  **/
  @ApiModelProperty(value = "This variable tells whether reboot has to be performed. Field introduced in 18.2.8, 20.1.1.")


 
  @VsoMethod  
  public Boolean isReboot() {
    return reboot;
  }
    
  @VsoMethod
  public void setReboot(Boolean reboot) {
    this.reboot = reboot;
  }

  
  public String getObjectID() {
		return "RebootData";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebootData rebootData = (RebootData) o;
    return Objects.equals(this.patchVersion, rebootData.patchVersion) &&
        Objects.equals(this.reboot, rebootData.reboot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patchVersion, reboot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebootData {\n");
    
    sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
    sb.append("    reboot: ").append(toIndentedString(reboot)).append("\n");
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

