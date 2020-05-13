package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.VcenterDatastore;
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
 * VISeVmOvaParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VISeVmOvaParams")
@VsoFinder(name = Constants.FINDER_VRO_VISEVMOVAPARAMS, idAccessor = "getObjectID()")
@Service
public class VISeVmOvaParams extends AviRestResource  {
  @JsonProperty("controller_cluster_uuid")
  private String controllerClusterUuid = null;

  @JsonProperty("controller_ip_addr")
  private String controllerIpAddr = null;

  @JsonProperty("mode")
  private String mode = null;

  @JsonProperty("rm_cookie")
  private String rmCookie = null;

  @JsonProperty("se_auth_token")
  private String seAuthToken = null;

  @JsonProperty("sevm_name")
  private String sevmName = null;

  @JsonProperty("single_socket_affinity")
  private Boolean singleSocketAffinity = null;

  @JsonProperty("vcenter_cpu_reserv")
  private Boolean vcenterCpuReserv = null;

  @JsonProperty("vcenter_ds_include")
  private Boolean vcenterDsInclude = null;

  @JsonProperty("vcenter_ds_info")
  @Valid
  private List<VcenterDatastore> vcenterDsInfo = null;

  @JsonProperty("vcenter_ds_mode")
  private String vcenterDsMode = null;

  @JsonProperty("vcenter_host")
  private String vcenterHost = null;

  @JsonProperty("vcenter_internal")
  private String vcenterInternal = "UNIFIED ADMIN";

  @JsonProperty("vcenter_mem_reserv")
  private Boolean vcenterMemReserv = null;

  @JsonProperty("vcenter_num_mem")
  private Long vcenterNumMem = 2048l;

  @JsonProperty("vcenter_num_se_cores")
  private Integer vcenterNumSeCores = 2;

  @JsonProperty("vcenter_ovf_path")
  private String vcenterOvfPath = null;

  @JsonProperty("vcenter_se_disk_size_KB")
  private Integer vcenterSeDiskSizeKB = 10485760;

  @JsonProperty("vcenter_se_mgmt_nw")
  private String vcenterSeMgmtNw = null;

  @JsonProperty("vcenter_vm_folder")
  private String vcenterVmFolder = null;

  
  /**
   * Unique object identifier of controller_cluster.
   * @return controllerClusterUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of controller_cluster.")


 
  @VsoMethod  
  public String getControllerClusterUuid() {
    return controllerClusterUuid;
  }
    
  @VsoMethod
  public void setControllerClusterUuid(String controllerClusterUuid) {
    this.controllerClusterUuid = controllerClusterUuid;
  }

  
  /**
   * controller_ip_addr of VISeVmOvaParams.
   * @return controllerIpAddr
  **/
  @ApiModelProperty(required = true, value = "controller_ip_addr of VISeVmOvaParams.")
  @NotNull


 
  @VsoMethod  
  public String getControllerIpAddr() {
    return controllerIpAddr;
  }
    
  @VsoMethod
  public void setControllerIpAddr(String controllerIpAddr) {
    this.controllerIpAddr = controllerIpAddr;
  }

  
  /**
   *  Enum options - APIC_MODE, NON_APIC_MODE.
   * @return mode
  **/
  @ApiModelProperty(value = " Enum options - APIC_MODE, NON_APIC_MODE.")


 
  @VsoMethod  
  public String getMode() {
    return mode;
  }
    
  @VsoMethod
  public void setMode(String mode) {
    this.mode = mode;
  }

  
  /**
   * rm_cookie of VISeVmOvaParams.
   * @return rmCookie
  **/
  @ApiModelProperty(value = "rm_cookie of VISeVmOvaParams.")


 
  @VsoMethod  
  public String getRmCookie() {
    return rmCookie;
  }
    
  @VsoMethod
  public void setRmCookie(String rmCookie) {
    this.rmCookie = rmCookie;
  }

  
  /**
   * se_auth_token of VISeVmOvaParams.
   * @return seAuthToken
  **/
  @ApiModelProperty(value = "se_auth_token of VISeVmOvaParams.")


 
  @VsoMethod  
  public String getSeAuthToken() {
    return seAuthToken;
  }
    
  @VsoMethod
  public void setSeAuthToken(String seAuthToken) {
    this.seAuthToken = seAuthToken;
  }

  
  /**
   * sevm_name of VISeVmOvaParams.
   * @return sevmName
  **/
  @ApiModelProperty(required = true, value = "sevm_name of VISeVmOvaParams.")
  @NotNull


 
  @VsoMethod  
  public String getSevmName() {
    return sevmName;
  }
    
  @VsoMethod
  public void setSevmName(String sevmName) {
    this.sevmName = sevmName;
  }

  
  /**
   * Placeholder for description of property single_socket_affinity of obj type VISeVmOvaParams field type str  type boolean
   * @return singleSocketAffinity
  **/
  @ApiModelProperty(value = "Placeholder for description of property single_socket_affinity of obj type VISeVmOvaParams field type str  type boolean")


 
  @VsoMethod  
  public Boolean isSingleSocketAffinity() {
    return singleSocketAffinity;
  }
    
  @VsoMethod
  public void setSingleSocketAffinity(Boolean singleSocketAffinity) {
    this.singleSocketAffinity = singleSocketAffinity;
  }

  
  /**
   * Placeholder for description of property vcenter_cpu_reserv of obj type VISeVmOvaParams field type str  type boolean
   * @return vcenterCpuReserv
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_cpu_reserv of obj type VISeVmOvaParams field type str  type boolean")


 
  @VsoMethod  
  public Boolean isVcenterCpuReserv() {
    return vcenterCpuReserv;
  }
    
  @VsoMethod
  public void setVcenterCpuReserv(Boolean vcenterCpuReserv) {
    this.vcenterCpuReserv = vcenterCpuReserv;
  }

  
  /**
   * Placeholder for description of property vcenter_ds_include of obj type VISeVmOvaParams field type str  type boolean
   * @return vcenterDsInclude
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_ds_include of obj type VISeVmOvaParams field type str  type boolean")


 
  @VsoMethod  
  public Boolean isVcenterDsInclude() {
    return vcenterDsInclude;
  }
    
  @VsoMethod
  public void setVcenterDsInclude(Boolean vcenterDsInclude) {
    this.vcenterDsInclude = vcenterDsInclude;
  }

  
  public VISeVmOvaParams addVcenterDsInfoItem(VcenterDatastore vcenterDsInfoItem) {
    if (this.vcenterDsInfo == null) {
      this.vcenterDsInfo = new ArrayList<VcenterDatastore>();
    }
    this.vcenterDsInfo.add(vcenterDsInfoItem);
    return this;
  }
  
  /**
   * Placeholder for description of property vcenter_ds_info of obj type VISeVmOvaParams field type str  type object
   * @return vcenterDsInfo
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_ds_info of obj type VISeVmOvaParams field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<VcenterDatastore> getVcenterDsInfo() {
    return vcenterDsInfo;
  }
    
  @VsoMethod
  public void setVcenterDsInfo(List<VcenterDatastore> vcenterDsInfo) {
    this.vcenterDsInfo = vcenterDsInfo;
  }

  
  /**
   *  Enum options - VCENTER_DATASTORE_ANY, VCENTER_DATASTORE_LOCAL, VCENTER_DATASTORE_SHARED.
   * @return vcenterDsMode
  **/
  @ApiModelProperty(value = " Enum options - VCENTER_DATASTORE_ANY, VCENTER_DATASTORE_LOCAL, VCENTER_DATASTORE_SHARED.")


 
  @VsoMethod  
  public String getVcenterDsMode() {
    return vcenterDsMode;
  }
    
  @VsoMethod
  public void setVcenterDsMode(String vcenterDsMode) {
    this.vcenterDsMode = vcenterDsMode;
  }

  
  /**
   * vcenter_host of VISeVmOvaParams.
   * @return vcenterHost
  **/
  @ApiModelProperty(value = "vcenter_host of VISeVmOvaParams.")


 
  @VsoMethod  
  public String getVcenterHost() {
    return vcenterHost;
  }
    
  @VsoMethod
  public void setVcenterHost(String vcenterHost) {
    this.vcenterHost = vcenterHost;
  }

  
  /**
   * vcenter_internal of VISeVmOvaParams.
   * @return vcenterInternal
  **/
  @ApiModelProperty(value = "vcenter_internal of VISeVmOvaParams.")


 
  @VsoMethod  
  public String getVcenterInternal() {
    return vcenterInternal;
  }
    
  @VsoMethod
  public void setVcenterInternal(String vcenterInternal) {
    this.vcenterInternal = vcenterInternal;
  }

  
  /**
   * Placeholder for description of property vcenter_mem_reserv of obj type VISeVmOvaParams field type str  type boolean
   * @return vcenterMemReserv
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_mem_reserv of obj type VISeVmOvaParams field type str  type boolean")


 
  @VsoMethod  
  public Boolean isVcenterMemReserv() {
    return vcenterMemReserv;
  }
    
  @VsoMethod
  public void setVcenterMemReserv(Boolean vcenterMemReserv) {
    this.vcenterMemReserv = vcenterMemReserv;
  }

  
  /**
   * Number of vcenter_num_mem.
   * @return vcenterNumMem
  **/
  @ApiModelProperty(value = "Number of vcenter_num_mem.")


 
  @VsoMethod  
  public Long getVcenterNumMem() {
    return vcenterNumMem;
  }
    
  @VsoMethod
  public void setVcenterNumMem(Long vcenterNumMem) {
    this.vcenterNumMem = vcenterNumMem;
  }

  
  /**
   * Number of vcenter_num_se_cores.
   * @return vcenterNumSeCores
  **/
  @ApiModelProperty(value = "Number of vcenter_num_se_cores.")


 
  @VsoMethod  
  public Integer getVcenterNumSeCores() {
    return vcenterNumSeCores;
  }
    
  @VsoMethod
  public void setVcenterNumSeCores(Integer vcenterNumSeCores) {
    this.vcenterNumSeCores = vcenterNumSeCores;
  }

  
  /**
   * vcenter_ovf_path of VISeVmOvaParams.
   * @return vcenterOvfPath
  **/
  @ApiModelProperty(value = "vcenter_ovf_path of VISeVmOvaParams.")


 
  @VsoMethod  
  public String getVcenterOvfPath() {
    return vcenterOvfPath;
  }
    
  @VsoMethod
  public void setVcenterOvfPath(String vcenterOvfPath) {
    this.vcenterOvfPath = vcenterOvfPath;
  }

  
  /**
   * Number of vcenter_se_disk_size_KB.
   * @return vcenterSeDiskSizeKB
  **/
  @ApiModelProperty(value = "Number of vcenter_se_disk_size_KB.")


 
  @VsoMethod  
  public Integer getVcenterSeDiskSizeKB() {
    return vcenterSeDiskSizeKB;
  }
    
  @VsoMethod
  public void setVcenterSeDiskSizeKB(Integer vcenterSeDiskSizeKB) {
    this.vcenterSeDiskSizeKB = vcenterSeDiskSizeKB;
  }

  
  /**
   * vcenter_se_mgmt_nw of VISeVmOvaParams.
   * @return vcenterSeMgmtNw
  **/
  @ApiModelProperty(value = "vcenter_se_mgmt_nw of VISeVmOvaParams.")


 
  @VsoMethod  
  public String getVcenterSeMgmtNw() {
    return vcenterSeMgmtNw;
  }
    
  @VsoMethod
  public void setVcenterSeMgmtNw(String vcenterSeMgmtNw) {
    this.vcenterSeMgmtNw = vcenterSeMgmtNw;
  }

  
  /**
   * vcenter_vm_folder of VISeVmOvaParams.
   * @return vcenterVmFolder
  **/
  @ApiModelProperty(value = "vcenter_vm_folder of VISeVmOvaParams.")


 
  @VsoMethod  
  public String getVcenterVmFolder() {
    return vcenterVmFolder;
  }
    
  @VsoMethod
  public void setVcenterVmFolder(String vcenterVmFolder) {
    this.vcenterVmFolder = vcenterVmFolder;
  }

  
  public String getObjectID() {
		return "VISeVmOvaParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VISeVmOvaParams viSeVmOvaParams = (VISeVmOvaParams) o;
    return Objects.equals(this.controllerClusterUuid, viSeVmOvaParams.controllerClusterUuid) &&
        Objects.equals(this.controllerIpAddr, viSeVmOvaParams.controllerIpAddr) &&
        Objects.equals(this.mode, viSeVmOvaParams.mode) &&
        Objects.equals(this.rmCookie, viSeVmOvaParams.rmCookie) &&
        Objects.equals(this.seAuthToken, viSeVmOvaParams.seAuthToken) &&
        Objects.equals(this.sevmName, viSeVmOvaParams.sevmName) &&
        Objects.equals(this.singleSocketAffinity, viSeVmOvaParams.singleSocketAffinity) &&
        Objects.equals(this.vcenterCpuReserv, viSeVmOvaParams.vcenterCpuReserv) &&
        Objects.equals(this.vcenterDsInclude, viSeVmOvaParams.vcenterDsInclude) &&
        Objects.equals(this.vcenterDsInfo, viSeVmOvaParams.vcenterDsInfo) &&
        Objects.equals(this.vcenterDsMode, viSeVmOvaParams.vcenterDsMode) &&
        Objects.equals(this.vcenterHost, viSeVmOvaParams.vcenterHost) &&
        Objects.equals(this.vcenterInternal, viSeVmOvaParams.vcenterInternal) &&
        Objects.equals(this.vcenterMemReserv, viSeVmOvaParams.vcenterMemReserv) &&
        Objects.equals(this.vcenterNumMem, viSeVmOvaParams.vcenterNumMem) &&
        Objects.equals(this.vcenterNumSeCores, viSeVmOvaParams.vcenterNumSeCores) &&
        Objects.equals(this.vcenterOvfPath, viSeVmOvaParams.vcenterOvfPath) &&
        Objects.equals(this.vcenterSeDiskSizeKB, viSeVmOvaParams.vcenterSeDiskSizeKB) &&
        Objects.equals(this.vcenterSeMgmtNw, viSeVmOvaParams.vcenterSeMgmtNw) &&
        Objects.equals(this.vcenterVmFolder, viSeVmOvaParams.vcenterVmFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerClusterUuid, controllerIpAddr, mode, rmCookie, seAuthToken, sevmName, singleSocketAffinity, vcenterCpuReserv, vcenterDsInclude, vcenterDsInfo, vcenterDsMode, vcenterHost, vcenterInternal, vcenterMemReserv, vcenterNumMem, vcenterNumSeCores, vcenterOvfPath, vcenterSeDiskSizeKB, vcenterSeMgmtNw, vcenterVmFolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VISeVmOvaParams {\n");
    
    sb.append("    controllerClusterUuid: ").append(toIndentedString(controllerClusterUuid)).append("\n");
    sb.append("    controllerIpAddr: ").append(toIndentedString(controllerIpAddr)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    rmCookie: ").append(toIndentedString(rmCookie)).append("\n");
    sb.append("    seAuthToken: ").append(toIndentedString(seAuthToken)).append("\n");
    sb.append("    sevmName: ").append(toIndentedString(sevmName)).append("\n");
    sb.append("    singleSocketAffinity: ").append(toIndentedString(singleSocketAffinity)).append("\n");
    sb.append("    vcenterCpuReserv: ").append(toIndentedString(vcenterCpuReserv)).append("\n");
    sb.append("    vcenterDsInclude: ").append(toIndentedString(vcenterDsInclude)).append("\n");
    sb.append("    vcenterDsInfo: ").append(toIndentedString(vcenterDsInfo)).append("\n");
    sb.append("    vcenterDsMode: ").append(toIndentedString(vcenterDsMode)).append("\n");
    sb.append("    vcenterHost: ").append(toIndentedString(vcenterHost)).append("\n");
    sb.append("    vcenterInternal: ").append(toIndentedString(vcenterInternal)).append("\n");
    sb.append("    vcenterMemReserv: ").append(toIndentedString(vcenterMemReserv)).append("\n");
    sb.append("    vcenterNumMem: ").append(toIndentedString(vcenterNumMem)).append("\n");
    sb.append("    vcenterNumSeCores: ").append(toIndentedString(vcenterNumSeCores)).append("\n");
    sb.append("    vcenterOvfPath: ").append(toIndentedString(vcenterOvfPath)).append("\n");
    sb.append("    vcenterSeDiskSizeKB: ").append(toIndentedString(vcenterSeDiskSizeKB)).append("\n");
    sb.append("    vcenterSeMgmtNw: ").append(toIndentedString(vcenterSeMgmtNw)).append("\n");
    sb.append("    vcenterVmFolder: ").append(toIndentedString(vcenterVmFolder)).append("\n");
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

