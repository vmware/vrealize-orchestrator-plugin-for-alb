package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.VISeVmOvaParams;
import com.vmware.avi.vro.model.VIAdminCredentials;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VICreateSEReq is a POJO class extends AviRestResource that used for creating
 * VICreateSEReq.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VICreateSEReq")
@VsoFinder(name = Constants.FINDER_VRO_VICREATESEREQ)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VICreateSEReq extends AviRestResource {
    @JsonProperty("cloud_uuid")
    @JsonInclude(Include.NON_NULL)
    private String cloudUuid = null;

    @JsonProperty("cookie")
    @JsonInclude(Include.NON_NULL)
    private String cookie = null;

    @JsonProperty("se_grp_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seGrpUuid = null;

    @JsonProperty("se_params")
    @JsonInclude(Include.NON_NULL)
    private VISeVmOvaParams seParams = null;

    @JsonProperty("tenant_uuid")
    @JsonInclude(Include.NON_NULL)
    private String tenantUuid = null;

    @JsonProperty("vcenter_admin")
    @JsonInclude(Include.NON_NULL)
    private VIAdminCredentials vcenterAdmin = null;

    @JsonProperty("vcenter_vnic_portgroups")
    @JsonInclude(Include.NON_NULL)
    private List<String> vcenterVnicPortgroups = null;



  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of cloud.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudUuid
   */
  @VsoMethod
  public String getCloudUuid() {
    return cloudUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of cloud.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudUuid set the cloudUuid.
   */
  @VsoMethod
  public void setCloudUuid(String  cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cookie of obj type vicreatesereq field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cookie
   */
  @VsoMethod
  public String getCookie() {
    return cookie;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cookie of obj type vicreatesereq field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cookie set the cookie.
   */
  @VsoMethod
  public void setCookie(String  cookie) {
    this.cookie = cookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se_grp.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGrpUuid
   */
  @VsoMethod
  public String getSeGrpUuid() {
    return seGrpUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se_grp.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGrpUuid set the seGrpUuid.
   */
  @VsoMethod
  public void setSeGrpUuid(String  seGrpUuid) {
    this.seGrpUuid = seGrpUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_params of obj type vicreatesereq field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seParams
   */
  @VsoMethod
  public VISeVmOvaParams getSeParams() {
    return seParams;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_params of obj type vicreatesereq field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seParams set the seParams.
   */
  @VsoMethod
  public void setSeParams(VISeVmOvaParams seParams) {
    this.seParams = seParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantUuid
   */
  @VsoMethod
  public String getTenantUuid() {
    return tenantUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantUuid set the tenantUuid.
   */
  @VsoMethod
  public void setTenantUuid(String  tenantUuid) {
    this.tenantUuid = tenantUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_admin of obj type vicreatesereq field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterAdmin
   */
  @VsoMethod
  public VIAdminCredentials getVcenterAdmin() {
    return vcenterAdmin;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_admin of obj type vicreatesereq field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterAdmin set the vcenterAdmin.
   */
  @VsoMethod
  public void setVcenterAdmin(VIAdminCredentials vcenterAdmin) {
    this.vcenterAdmin = vcenterAdmin;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_vnic_portgroups of obj type vicreatesereq field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterVnicPortgroups
   */
  @VsoMethod
  public List<String> getVcenterVnicPortgroups() {
    return vcenterVnicPortgroups;
  }

  /**
   * This is the setter method. this will set the vcenterVnicPortgroups
   * Placeholder for description of property vcenter_vnic_portgroups of obj type vicreatesereq field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterVnicPortgroups
   */
  @VsoMethod
  public void setVcenterVnicPortgroups(List<String>  vcenterVnicPortgroups) {
    this.vcenterVnicPortgroups = vcenterVnicPortgroups;
  }

  /**
   * This is the setter method this will set the vcenterVnicPortgroups
   * Placeholder for description of property vcenter_vnic_portgroups of obj type vicreatesereq field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterVnicPortgroups
   */
  @VsoMethod
  public VICreateSEReq addVcenterVnicPortgroupsItem(String vcenterVnicPortgroupsItem) {
    if (this.vcenterVnicPortgroups == null) {
      this.vcenterVnicPortgroups = new ArrayList<String>();
    }
    this.vcenterVnicPortgroups.add(vcenterVnicPortgroupsItem);
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
  VICreateSEReq objVICreateSEReq = (VICreateSEReq) o;
  return   Objects.equals(this.seParams, objVICreateSEReq.seParams)&&
  Objects.equals(this.cookie, objVICreateSEReq.cookie)&&
  Objects.equals(this.vcenterAdmin, objVICreateSEReq.vcenterAdmin)&&
  Objects.equals(this.vcenterVnicPortgroups, objVICreateSEReq.vcenterVnicPortgroups)&&
  Objects.equals(this.seGrpUuid, objVICreateSEReq.seGrpUuid)&&
  Objects.equals(this.tenantUuid, objVICreateSEReq.tenantUuid)&&
  Objects.equals(this.cloudUuid, objVICreateSEReq.cloudUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VICreateSEReq {\n");
      sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
        sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
        sb.append("    seGrpUuid: ").append(toIndentedString(seGrpUuid)).append("\n");
        sb.append("    seParams: ").append(toIndentedString(seParams)).append("\n");
        sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
        sb.append("    vcenterAdmin: ").append(toIndentedString(vcenterAdmin)).append("\n");
        sb.append("    vcenterVnicPortgroups: ").append(toIndentedString(vcenterVnicPortgroups)).append("\n");
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

