package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.VIAdminCredentials;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VISetvNicNwReq is a POJO class extends AviRestResource that used for creating
 * VISetvNicNwReq.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VISetvNicNwReq")
@VsoFinder(name = Constants.FINDER_VRO_VISETVNICNWREQ)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VISetvNicNwReq extends AviRestResource {
  @JsonProperty("cloud_uuid")
  @JsonInclude(Include.NON_NULL)
  private String cloudUuid = null;

  @JsonProperty("dc_uuid")
  @JsonInclude(Include.NON_NULL)
  private String dcUuid = null;

  @JsonProperty("rm_cookie")
  @JsonInclude(Include.NON_NULL)
  private String rmCookie = null;

  @JsonProperty("sevm_uuid")
  @JsonInclude(Include.NON_NULL)
  private String sevmUuid = null;

  @JsonProperty("vcenter_admin")
  @JsonInclude(Include.NON_NULL)
  private VIAdminCredentials vcenterAdmin = null;

  @JsonProperty("vcenter_sevm_mor")
  @JsonInclude(Include.NON_NULL)
  private String vcenterSevmMor = null;

  @JsonProperty("vcenter_vnic_info")
  @JsonInclude(Include.NON_NULL)
  private List<VIVmVnicInfo> vcenterVnicInfo = null;



  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of cloud.
   * @return cloudUuid
   */
  @VsoMethod
  public String getCloudUuid() {
    return cloudUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of cloud.
   * @param cloudUuid set the cloudUuid.
   */
  @VsoMethod
  public void setCloudUuid(String  cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of dc.
   * @return dcUuid
   */
  @VsoMethod
  public String getDcUuid() {
    return dcUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of dc.
   * @param dcUuid set the dcUuid.
   */
  @VsoMethod
  public void setDcUuid(String  dcUuid) {
    this.dcUuid = dcUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property rm_cookie of obj type visetvnicnwreq field type str  type string.
   * @return rmCookie
   */
  @VsoMethod
  public String getRmCookie() {
    return rmCookie;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property rm_cookie of obj type visetvnicnwreq field type str  type string.
   * @param rmCookie set the rmCookie.
   */
  @VsoMethod
  public void setRmCookie(String  rmCookie) {
    this.rmCookie = rmCookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of sevm.
   * @return sevmUuid
   */
  @VsoMethod
  public String getSevmUuid() {
    return sevmUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of sevm.
   * @param sevmUuid set the sevmUuid.
   */
  @VsoMethod
  public void setSevmUuid(String  sevmUuid) {
    this.sevmUuid = sevmUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_admin of obj type visetvnicnwreq field type str  type ref.
   * @return vcenterAdmin
   */
  @VsoMethod
  public VIAdminCredentials getVcenterAdmin() {
    return vcenterAdmin;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_admin of obj type visetvnicnwreq field type str  type ref.
   * @param vcenterAdmin set the vcenterAdmin.
   */
  @VsoMethod
  public void setVcenterAdmin(VIAdminCredentials vcenterAdmin) {
    this.vcenterAdmin = vcenterAdmin;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_sevm_mor of obj type visetvnicnwreq field type str  type string.
   * @return vcenterSevmMor
   */
  @VsoMethod
  public String getVcenterSevmMor() {
    return vcenterSevmMor;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_sevm_mor of obj type visetvnicnwreq field type str  type string.
   * @param vcenterSevmMor set the vcenterSevmMor.
   */
  @VsoMethod
  public void setVcenterSevmMor(String  vcenterSevmMor) {
    this.vcenterSevmMor = vcenterSevmMor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_vnic_info of obj type visetvnicnwreq field type str  type array.
   * @return vcenterVnicInfo
   */
  @VsoMethod
  public List<VIVmVnicInfo> getVcenterVnicInfo() {
    return vcenterVnicInfo;
  }

  /**
   * This is the setter method. this will set the vcenterVnicInfo
   * Placeholder for description of property vcenter_vnic_info of obj type visetvnicnwreq field type str  type array.
   * @return vcenterVnicInfo
   */
  @VsoMethod
  public void setVcenterVnicInfo(List<VIVmVnicInfo>  vcenterVnicInfo) {
    this.vcenterVnicInfo = vcenterVnicInfo;
  }

  /**
   * This is the setter method this will set the vcenterVnicInfo
   * Placeholder for description of property vcenter_vnic_info of obj type visetvnicnwreq field type str  type array.
   * @return vcenterVnicInfo
   */
  @VsoMethod
  public VISetvNicNwReq addVcenterVnicInfoItem(VIVmVnicInfo vcenterVnicInfoItem) {
    if (this.vcenterVnicInfo == null) {
      this.vcenterVnicInfo = new ArrayList<VIVmVnicInfo>();
    }
    this.vcenterVnicInfo.add(vcenterVnicInfoItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VISetvNicNwReq objVISetvNicNwReq = (VISetvNicNwReq) o;
  return   Objects.equals(this.vcenterVnicInfo, objVISetvNicNwReq.vcenterVnicInfo)&&
  Objects.equals(this.vcenterSevmMor, objVISetvNicNwReq.vcenterSevmMor)&&
  Objects.equals(this.sevmUuid, objVISetvNicNwReq.sevmUuid)&&
  Objects.equals(this.rmCookie, objVISetvNicNwReq.rmCookie)&&
  Objects.equals(this.dcUuid, objVISetvNicNwReq.dcUuid)&&
  Objects.equals(this.vcenterAdmin, objVISetvNicNwReq.vcenterAdmin)&&
  Objects.equals(this.cloudUuid, objVISetvNicNwReq.cloudUuid);
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
