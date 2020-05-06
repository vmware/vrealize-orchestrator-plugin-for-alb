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
 * VsMigrateParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "VsMigrateParams")
@VsoFinder(name = Constants.FINDER_VRO_VSMIGRATEPARAMS, idAccessor = "getObjectID()")
@Service
public class VsMigrateParams extends AviRestResource  {
  @JsonProperty("from_se_ref")
  private String fromSeRef = null;

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
   *  It is a reference to an object of type ServiceEngine.
   * @return fromSeRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public String getFromSeRef() {
    return fromSeRef;
  }
    
  @VsoMethod
  public void setFromSeRef(String fromSeRef) {
    this.fromSeRef = fromSeRef;
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
   * Placeholder for description of property to_new_se of obj type VsMigrateParams field type str  type boolean
   * @return toNewSe
  **/
  @ApiModelProperty(value = "Placeholder for description of property to_new_se of obj type VsMigrateParams field type str  type boolean")


 
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
		return "VsMigrateParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsMigrateParams vsMigrateParams = (VsMigrateParams) o;
    return Objects.equals(this.fromSeRef, vsMigrateParams.fromSeRef) &&
        Objects.equals(this.newVcpus, vsMigrateParams.newVcpus) &&
        Objects.equals(this.toHostRef, vsMigrateParams.toHostRef) &&
        Objects.equals(this.toNewSe, vsMigrateParams.toNewSe) &&
        Objects.equals(this.toSeRef, vsMigrateParams.toSeRef) &&
        Objects.equals(this.uuid, vsMigrateParams.uuid) &&
        Objects.equals(this.vipId, vsMigrateParams.vipId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromSeRef, newVcpus, toHostRef, toNewSe, toSeRef, uuid, vipId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsMigrateParams {\n");
    
    sb.append("    fromSeRef: ").append(toIndentedString(fromSeRef)).append("\n");
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

