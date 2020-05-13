package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.VIAdminCredentials;
import com.vmware.avi.vro.model.VIVmVnicInfo;
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
 * VISetvNicNwReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VISetvNicNwReq")
@VsoFinder(name = Constants.FINDER_VRO_VISETVNICNWREQ, idAccessor = "getObjectID()")
@Service
public class VISetvNicNwReq extends AviRestResource  {
  @JsonProperty("cloud_uuid")
  private String cloudUuid = null;

  @JsonProperty("dc_uuid")
  private String dcUuid = null;

  @JsonProperty("rm_cookie")
  private String rmCookie = null;

  @JsonProperty("sevm_uuid")
  private String sevmUuid = null;

  @JsonProperty("vcenter_admin")
  private VIAdminCredentials vcenterAdmin = null;

  @JsonProperty("vcenter_sevm_mor")
  private String vcenterSevmMor = null;

  @JsonProperty("vcenter_vnic_info")
  @Valid
  private List<VIVmVnicInfo> vcenterVnicInfo = null;

  
  /**
   * Unique object identifier of cloud.
   * @return cloudUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of cloud.")


 
  @VsoMethod  
  public String getCloudUuid() {
    return cloudUuid;
  }
    
  @VsoMethod
  public void setCloudUuid(String cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  
  /**
   * Unique object identifier of dc.
   * @return dcUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of dc.")


 
  @VsoMethod  
  public String getDcUuid() {
    return dcUuid;
  }
    
  @VsoMethod
  public void setDcUuid(String dcUuid) {
    this.dcUuid = dcUuid;
  }

  
  /**
   * rm_cookie of VISetvNicNwReq.
   * @return rmCookie
  **/
  @ApiModelProperty(value = "rm_cookie of VISetvNicNwReq.")


 
  @VsoMethod  
  public String getRmCookie() {
    return rmCookie;
  }
    
  @VsoMethod
  public void setRmCookie(String rmCookie) {
    this.rmCookie = rmCookie;
  }

  
  /**
   * Unique object identifier of sevm.
   * @return sevmUuid
  **/
  @ApiModelProperty(required = true, value = "Unique object identifier of sevm.")
  @NotNull


 
  @VsoMethod  
  public String getSevmUuid() {
    return sevmUuid;
  }
    
  @VsoMethod
  public void setSevmUuid(String sevmUuid) {
    this.sevmUuid = sevmUuid;
  }

  
  /**
   * Placeholder for description of property vcenter_admin of obj type VISetvNicNwReq field type str  type object
   * @return vcenterAdmin
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_admin of obj type VISetvNicNwReq field type str  type object")

  @Valid

 
  @VsoMethod  
  public VIAdminCredentials getVcenterAdmin() {
    return vcenterAdmin;
  }
    
  @VsoMethod
  public void setVcenterAdmin(VIAdminCredentials vcenterAdmin) {
    this.vcenterAdmin = vcenterAdmin;
  }

  
  /**
   * vcenter_sevm_mor of VISetvNicNwReq.
   * @return vcenterSevmMor
  **/
  @ApiModelProperty(value = "vcenter_sevm_mor of VISetvNicNwReq.")


 
  @VsoMethod  
  public String getVcenterSevmMor() {
    return vcenterSevmMor;
  }
    
  @VsoMethod
  public void setVcenterSevmMor(String vcenterSevmMor) {
    this.vcenterSevmMor = vcenterSevmMor;
  }

  
  public VISetvNicNwReq addVcenterVnicInfoItem(VIVmVnicInfo vcenterVnicInfoItem) {
    if (this.vcenterVnicInfo == null) {
      this.vcenterVnicInfo = new ArrayList<VIVmVnicInfo>();
    }
    this.vcenterVnicInfo.add(vcenterVnicInfoItem);
    return this;
  }
  
  /**
   * Placeholder for description of property vcenter_vnic_info of obj type VISetvNicNwReq field type str  type object
   * @return vcenterVnicInfo
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_vnic_info of obj type VISetvNicNwReq field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VIVmVnicInfo> getVcenterVnicInfo() {
    return vcenterVnicInfo;
  }
    
  @VsoMethod
  public void setVcenterVnicInfo(List<VIVmVnicInfo> vcenterVnicInfo) {
    this.vcenterVnicInfo = vcenterVnicInfo;
  }

  
  public String getObjectID() {
		return "VISetvNicNwReq";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VISetvNicNwReq viSetvNicNwReq = (VISetvNicNwReq) o;
    return Objects.equals(this.cloudUuid, viSetvNicNwReq.cloudUuid) &&
        Objects.equals(this.dcUuid, viSetvNicNwReq.dcUuid) &&
        Objects.equals(this.rmCookie, viSetvNicNwReq.rmCookie) &&
        Objects.equals(this.sevmUuid, viSetvNicNwReq.sevmUuid) &&
        Objects.equals(this.vcenterAdmin, viSetvNicNwReq.vcenterAdmin) &&
        Objects.equals(this.vcenterSevmMor, viSetvNicNwReq.vcenterSevmMor) &&
        Objects.equals(this.vcenterVnicInfo, viSetvNicNwReq.vcenterVnicInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudUuid, dcUuid, rmCookie, sevmUuid, vcenterAdmin, vcenterSevmMor, vcenterVnicInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VISetvNicNwReq {\n");
    
    sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
    sb.append("    dcUuid: ").append(toIndentedString(dcUuid)).append("\n");
    sb.append("    rmCookie: ").append(toIndentedString(rmCookie)).append("\n");
    sb.append("    sevmUuid: ").append(toIndentedString(sevmUuid)).append("\n");
    sb.append("    vcenterAdmin: ").append(toIndentedString(vcenterAdmin)).append("\n");
    sb.append("    vcenterSevmMor: ").append(toIndentedString(vcenterSevmMor)).append("\n");
    sb.append("    vcenterVnicInfo: ").append(toIndentedString(vcenterVnicInfo)).append("\n");
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

