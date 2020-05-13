package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.VIAdminCredentials;
import com.vmware.avi.vro.model.VISeVmOvaParams;
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
 * VICreateSEReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VICreateSEReq")
@VsoFinder(name = Constants.FINDER_VRO_VICREATESEREQ, idAccessor = "getObjectID()")
@Service
public class VICreateSEReq extends AviRestResource  {
  @JsonProperty("cloud_uuid")
  private String cloudUuid = null;

  @JsonProperty("cookie")
  private String cookie = null;

  @JsonProperty("se_grp_uuid")
  private String seGrpUuid = null;

  @JsonProperty("se_params")
  private VISeVmOvaParams seParams = null;

  @JsonProperty("tenant_uuid")
  private String tenantUuid = null;

  @JsonProperty("vcenter_admin")
  private VIAdminCredentials vcenterAdmin = null;

  @JsonProperty("vcenter_vnic_portgroups")
  @Valid
  private List<String> vcenterVnicPortgroups = null;

  
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
   * cookie of VICreateSEReq.
   * @return cookie
  **/
  @ApiModelProperty(value = "cookie of VICreateSEReq.")


 
  @VsoMethod  
  public String getCookie() {
    return cookie;
  }
    
  @VsoMethod
  public void setCookie(String cookie) {
    this.cookie = cookie;
  }

  
  /**
   * Unique object identifier of se_grp.
   * @return seGrpUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of se_grp.")


 
  @VsoMethod  
  public String getSeGrpUuid() {
    return seGrpUuid;
  }
    
  @VsoMethod
  public void setSeGrpUuid(String seGrpUuid) {
    this.seGrpUuid = seGrpUuid;
  }

  
  /**
   * Placeholder for description of property se_params of obj type VICreateSEReq field type str  type object
   * @return seParams
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property se_params of obj type VICreateSEReq field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public VISeVmOvaParams getSeParams() {
    return seParams;
  }
    
  @VsoMethod
  public void setSeParams(VISeVmOvaParams seParams) {
    this.seParams = seParams;
  }

  
  /**
   * Unique object identifier of tenant.
   * @return tenantUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of tenant.")


 
  @VsoMethod  
  public String getTenantUuid() {
    return tenantUuid;
  }
    
  @VsoMethod
  public void setTenantUuid(String tenantUuid) {
    this.tenantUuid = tenantUuid;
  }

  
  /**
   * Placeholder for description of property vcenter_admin of obj type VICreateSEReq field type str  type object
   * @return vcenterAdmin
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_admin of obj type VICreateSEReq field type str  type object")

  @Valid

 
  @VsoMethod  
  public VIAdminCredentials getVcenterAdmin() {
    return vcenterAdmin;
  }
    
  @VsoMethod
  public void setVcenterAdmin(VIAdminCredentials vcenterAdmin) {
    this.vcenterAdmin = vcenterAdmin;
  }

  
  public VICreateSEReq addVcenterVnicPortgroupsItem(String vcenterVnicPortgroupsItem) {
    if (this.vcenterVnicPortgroups == null) {
      this.vcenterVnicPortgroups = new ArrayList<String>();
    }
    this.vcenterVnicPortgroups.add(vcenterVnicPortgroupsItem);
    return this;
  }
  
  /**
   * vcenter_vnic_portgroups of VICreateSEReq.
   * @return vcenterVnicPortgroups
  **/
  @ApiModelProperty(value = "vcenter_vnic_portgroups of VICreateSEReq.")


 
  @VsoMethod  
  public List<String> getVcenterVnicPortgroups() {
    return vcenterVnicPortgroups;
  }
    
  @VsoMethod
  public void setVcenterVnicPortgroups(List<String> vcenterVnicPortgroups) {
    this.vcenterVnicPortgroups = vcenterVnicPortgroups;
  }

  
  public String getObjectID() {
		return "VICreateSEReq";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VICreateSEReq viCreateSEReq = (VICreateSEReq) o;
    return Objects.equals(this.cloudUuid, viCreateSEReq.cloudUuid) &&
        Objects.equals(this.cookie, viCreateSEReq.cookie) &&
        Objects.equals(this.seGrpUuid, viCreateSEReq.seGrpUuid) &&
        Objects.equals(this.seParams, viCreateSEReq.seParams) &&
        Objects.equals(this.tenantUuid, viCreateSEReq.tenantUuid) &&
        Objects.equals(this.vcenterAdmin, viCreateSEReq.vcenterAdmin) &&
        Objects.equals(this.vcenterVnicPortgroups, viCreateSEReq.vcenterVnicPortgroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudUuid, cookie, seGrpUuid, seParams, tenantUuid, vcenterAdmin, vcenterVnicPortgroups);
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

