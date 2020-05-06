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
 * VsScaleinParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "VsScaleinParams")
@VsoFinder(name = Constants.FINDER_VRO_VSSCALEINPARAMS, idAccessor = "getObjectID()")
@Service
public class VsScaleinParams extends AviRestResource  {
  @JsonProperty("admin_down")
  private Boolean adminDown = null;

  @JsonProperty("from_se_ref")
  private String fromSeRef = null;

  @JsonProperty("scalein_primary")
  private Boolean scaleinPrimary = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vip_id")
  private String vipId = null;

  
  /**
   * Placeholder for description of property admin_down of obj type VsScaleinParams field type str  type boolean
   * @return adminDown
  **/
  @ApiModelProperty(value = "Placeholder for description of property admin_down of obj type VsScaleinParams field type str  type boolean")


 
  @VsoMethod  
  public Boolean isAdminDown() {
    return adminDown;
  }
    
  @VsoMethod
  public void setAdminDown(Boolean adminDown) {
    this.adminDown = adminDown;
  }

  
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
   * Placeholder for description of property scalein_primary of obj type VsScaleinParams field type str  type boolean
   * @return scaleinPrimary
  **/
  @ApiModelProperty(value = "Placeholder for description of property scalein_primary of obj type VsScaleinParams field type str  type boolean")


 
  @VsoMethod  
  public Boolean isScaleinPrimary() {
    return scaleinPrimary;
  }
    
  @VsoMethod
  public void setScaleinPrimary(Boolean scaleinPrimary) {
    this.scaleinPrimary = scaleinPrimary;
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
		return "VsScaleinParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsScaleinParams vsScaleinParams = (VsScaleinParams) o;
    return Objects.equals(this.adminDown, vsScaleinParams.adminDown) &&
        Objects.equals(this.fromSeRef, vsScaleinParams.fromSeRef) &&
        Objects.equals(this.scaleinPrimary, vsScaleinParams.scaleinPrimary) &&
        Objects.equals(this.uuid, vsScaleinParams.uuid) &&
        Objects.equals(this.vipId, vsScaleinParams.vipId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminDown, fromSeRef, scaleinPrimary, uuid, vipId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsScaleinParams {\n");
    
    sb.append("    adminDown: ").append(toIndentedString(adminDown)).append("\n");
    sb.append("    fromSeRef: ").append(toIndentedString(fromSeRef)).append("\n");
    sb.append("    scaleinPrimary: ").append(toIndentedString(scaleinPrimary)).append("\n");
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

