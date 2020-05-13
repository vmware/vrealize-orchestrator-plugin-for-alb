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
 * VsScaleoutParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VsScaleoutParams")
@VsoFinder(name = Constants.FINDER_VRO_VSSCALEOUTPARAMS, idAccessor = "getObjectID()")
@Service
public class VsScaleoutParams extends AviRestResource  {
  @JsonProperty("admin_up")
  private Boolean adminUp = null;

  @JsonProperty("new_vcpus")
  private Integer newVcpus = null;

  @JsonProperty("to_host_ref")
  private String toHostRef = null;

  @JsonProperty("to_new_se")
  private Boolean toNewSe = null;

  @JsonProperty("to_se_ref")
  private String toSeRef = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vip_id")
  private String vipId = null;

  
  /**
   * Placeholder for description of property admin_up of obj type VsScaleoutParams field type str  type boolean
   * @return adminUp
  **/
  @ApiModelProperty(value = "Placeholder for description of property admin_up of obj type VsScaleoutParams field type str  type boolean")


 
  @VsoMethod  
  public Boolean isAdminUp() {
    return adminUp;
  }
    
  @VsoMethod
  public void setAdminUp(Boolean adminUp) {
    this.adminUp = adminUp;
  }

  
  /**
   * Number of new_vcpus.
   * @return newVcpus
  **/
  @ApiModelProperty(value = "Number of new_vcpus.")


 
  @VsoMethod  
  public Integer getNewVcpus() {
    return newVcpus;
  }
    
  @VsoMethod
  public void setNewVcpus(Integer newVcpus) {
    this.newVcpus = newVcpus;
  }

  
  /**
   *  It is a reference to an object of type VIMgrHostRuntime.
   * @return toHostRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VIMgrHostRuntime.")


 
  @VsoMethod  
  public String getToHostRef() {
    return toHostRef;
  }
    
  @VsoMethod
  public void setToHostRef(String toHostRef) {
    this.toHostRef = toHostRef;
  }

  
  /**
   * Placeholder for description of property to_new_se of obj type VsScaleoutParams field type str  type boolean
   * @return toNewSe
  **/
  @ApiModelProperty(value = "Placeholder for description of property to_new_se of obj type VsScaleoutParams field type str  type boolean")


 
  @VsoMethod  
  public Boolean isToNewSe() {
    return toNewSe;
  }
    
  @VsoMethod
  public void setToNewSe(Boolean toNewSe) {
    this.toNewSe = toNewSe;
  }

  
  /**
   *  It is a reference to an object of type ServiceEngine.
   * @return toSeRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public String getToSeRef() {
    return toSeRef;
  }
    
  @VsoMethod
  public void setToSeRef(String toSeRef) {
    this.toSeRef = toSeRef;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   *  Field introduced in 17.1.1.
   * @return vipId
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getVipId() {
    return vipId;
  }
    
  @VsoMethod
  public void setVipId(String vipId) {
    this.vipId = vipId;
  }

  
  public String getObjectID() {
		return "VsScaleoutParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsScaleoutParams vsScaleoutParams = (VsScaleoutParams) o;
    return Objects.equals(this.adminUp, vsScaleoutParams.adminUp) &&
        Objects.equals(this.newVcpus, vsScaleoutParams.newVcpus) &&
        Objects.equals(this.toHostRef, vsScaleoutParams.toHostRef) &&
        Objects.equals(this.toNewSe, vsScaleoutParams.toNewSe) &&
        Objects.equals(this.toSeRef, vsScaleoutParams.toSeRef) &&
        Objects.equals(this.uuid, vsScaleoutParams.uuid) &&
        Objects.equals(this.vipId, vsScaleoutParams.vipId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminUp, newVcpus, toHostRef, toNewSe, toSeRef, uuid, vipId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsScaleoutParams {\n");
    
    sb.append("    adminUp: ").append(toIndentedString(adminUp)).append("\n");
    sb.append("    newVcpus: ").append(toIndentedString(newVcpus)).append("\n");
    sb.append("    toHostRef: ").append(toIndentedString(toHostRef)).append("\n");
    sb.append("    toNewSe: ").append(toIndentedString(toNewSe)).append("\n");
    sb.append("    toSeRef: ").append(toIndentedString(toSeRef)).append("\n");
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

