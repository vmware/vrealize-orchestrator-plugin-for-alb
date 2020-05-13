package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.RebootData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * PatchInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PatchInfo")
@VsoFinder(name = Constants.FINDER_VRO_PATCHINFO, idAccessor = "getObjectID()")
@Service
public class PatchInfo extends AviRestResource  {
  @JsonProperty("patch_type")
  private String patchType = null;

  @JsonProperty("reboot")
  private Boolean reboot = null;

  @JsonProperty("reboot_list")
  @Valid
  private List<RebootData> rebootList = null;

  
  /**
   * Patch type describes the controller or se patch type. Field introduced in 18.2.6.
   * @return patchType
  **/
  @ApiModelProperty(value = "Patch type describes the controller or se patch type. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getPatchType() {
    return patchType;
  }
    
  @VsoMethod
  public void setPatchType(String patchType) {
    this.patchType = patchType;
  }

  
  /**
   * This variable tells whether reboot has to be performed. Field introduced in 18.2.6.
   * @return reboot
  **/
  @ApiModelProperty(value = "This variable tells whether reboot has to be performed. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isReboot() {
    return reboot;
  }
    
  @VsoMethod
  public void setReboot(Boolean reboot) {
    this.reboot = reboot;
  }

  
  public PatchInfo addRebootListItem(RebootData rebootListItem) {
    if (this.rebootList == null) {
      this.rebootList = new ArrayList<RebootData>();
    }
    this.rebootList.add(rebootListItem);
    return this;
  }
  
  /**
   * This variable is for full list of patch reboot details. Field introduced in 18.2.8, 20.1.1.
   * @return rebootList
  **/
  @ApiModelProperty(value = "This variable is for full list of patch reboot details. Field introduced in 18.2.8, 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<RebootData> getRebootList() {
    return rebootList;
  }
    
  @VsoMethod
  public void setRebootList(List<RebootData> rebootList) {
    this.rebootList = rebootList;
  }

  
  public String getObjectID() {
		return "PatchInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchInfo patchInfo = (PatchInfo) o;
    return Objects.equals(this.patchType, patchInfo.patchType) &&
        Objects.equals(this.reboot, patchInfo.reboot) &&
        Objects.equals(this.rebootList, patchInfo.rebootList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patchType, reboot, rebootList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchInfo {\n");
    
    sb.append("    patchType: ").append(toIndentedString(patchType)).append("\n");
    sb.append("    reboot: ").append(toIndentedString(reboot)).append("\n");
    sb.append("    rebootList: ").append(toIndentedString(rebootList)).append("\n");
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

