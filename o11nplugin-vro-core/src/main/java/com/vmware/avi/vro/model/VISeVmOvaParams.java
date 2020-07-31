package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VISeVmOvaParams is a POJO class extends AviRestResource that used for creating
 * VISeVmOvaParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VISeVmOvaParams")
@VsoFinder(name = Constants.FINDER_VRO_VISEVMOVAPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VISeVmOvaParams extends AviRestResource {
  @JsonProperty("controller_cluster_uuid")
  @JsonInclude(Include.NON_NULL)
  private String controllerClusterUuid = null;

  @JsonProperty("controller_ip_addr")
  @JsonInclude(Include.NON_NULL)
  private String controllerIpAddr = null;

  @JsonProperty("mode")
  @JsonInclude(Include.NON_NULL)
  private String mode = null;

  @JsonProperty("rm_cookie")
  @JsonInclude(Include.NON_NULL)
  private String rmCookie = null;

  @JsonProperty("se_auth_token")
  @JsonInclude(Include.NON_NULL)
  private String seAuthToken = null;

  @JsonProperty("sevm_name")
  @JsonInclude(Include.NON_NULL)
  private String sevmName = null;

  @JsonProperty("single_socket_affinity")
  @JsonInclude(Include.NON_NULL)
  private Boolean singleSocketAffinity = null;

  @JsonProperty("vcenter_cpu_reserv")
  @JsonInclude(Include.NON_NULL)
  private Boolean vcenterCpuReserv = false;

  @JsonProperty("vcenter_ds_include")
  @JsonInclude(Include.NON_NULL)
  private Boolean vcenterDsInclude = null;

  @JsonProperty("vcenter_ds_info")
  @JsonInclude(Include.NON_NULL)
  private List<VcenterDatastore> vcenterDsInfo = null;

  @JsonProperty("vcenter_ds_mode")
  @JsonInclude(Include.NON_NULL)
  private String vcenterDsMode = null;

  @JsonProperty("vcenter_host")
  @JsonInclude(Include.NON_NULL)
  private String vcenterHost = null;

  @JsonProperty("vcenter_internal")
  @JsonInclude(Include.NON_NULL)
  private String vcenterInternal = "UNIFIED ADMIN";

  @JsonProperty("vcenter_mem_reserv")
  @JsonInclude(Include.NON_NULL)
  private Boolean vcenterMemReserv = false;

  @JsonProperty("vcenter_num_mem")
  @JsonInclude(Include.NON_NULL)
  private Integer vcenterNumMem = 2048;

  @JsonProperty("vcenter_num_se_cores")
  @JsonInclude(Include.NON_NULL)
  private Integer vcenterNumSeCores = 2;

  @JsonProperty("vcenter_opaque_nwid")
  @JsonInclude(Include.NON_NULL)
  private String vcenterOpaqueNwid = null;

  @JsonProperty("vcenter_ovf_path")
  @JsonInclude(Include.NON_NULL)
  private String vcenterOvfPath = null;

  @JsonProperty("vcenter_se_disk_size_KB")
  @JsonInclude(Include.NON_NULL)
  private Integer vcenterSeDiskSizeKb = 10485760;

  @JsonProperty("vcenter_se_mgmt_nw")
  @JsonInclude(Include.NON_NULL)
  private String vcenterSeMgmtNw = null;

  @JsonProperty("vcenter_vm_folder")
  @JsonInclude(Include.NON_NULL)
  private String vcenterVmFolder = null;



  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of controller_cluster.
   * @return controllerClusterUuid
   */
  @VsoMethod
  public String getControllerClusterUuid() {
    return controllerClusterUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of controller_cluster.
   * @param controllerClusterUuid set the controllerClusterUuid.
   */
  @VsoMethod
  public void setControllerClusterUuid(String  controllerClusterUuid) {
    this.controllerClusterUuid = controllerClusterUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property controller_ip_addr of obj type visevmovaparams field type str  type string.
   * @return controllerIpAddr
   */
  @VsoMethod
  public String getControllerIpAddr() {
    return controllerIpAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property controller_ip_addr of obj type visevmovaparams field type str  type string.
   * @param controllerIpAddr set the controllerIpAddr.
   */
  @VsoMethod
  public void setControllerIpAddr(String  controllerIpAddr) {
    this.controllerIpAddr = controllerIpAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - APIC_MODE, NON_APIC_MODE.
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - APIC_MODE, NON_APIC_MODE.
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property rm_cookie of obj type visevmovaparams field type str  type string.
   * @return rmCookie
   */
  @VsoMethod
  public String getRmCookie() {
    return rmCookie;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property rm_cookie of obj type visevmovaparams field type str  type string.
   * @param rmCookie set the rmCookie.
   */
  @VsoMethod
  public void setRmCookie(String  rmCookie) {
    this.rmCookie = rmCookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_auth_token of obj type visevmovaparams field type str  type string.
   * @return seAuthToken
   */
  @VsoMethod
  public String getSeAuthToken() {
    return seAuthToken;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_auth_token of obj type visevmovaparams field type str  type string.
   * @param seAuthToken set the seAuthToken.
   */
  @VsoMethod
  public void setSeAuthToken(String  seAuthToken) {
    this.seAuthToken = seAuthToken;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property sevm_name of obj type visevmovaparams field type str  type string.
   * @return sevmName
   */
  @VsoMethod
  public String getSevmName() {
    return sevmName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property sevm_name of obj type visevmovaparams field type str  type string.
   * @param sevmName set the sevmName.
   */
  @VsoMethod
  public void setSevmName(String  sevmName) {
    this.sevmName = sevmName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property single_socket_affinity of obj type visevmovaparams field type str  type boolean.
   * @return singleSocketAffinity
   */
  @VsoMethod
  public Boolean getSingleSocketAffinity() {
    return singleSocketAffinity;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property single_socket_affinity of obj type visevmovaparams field type str  type boolean.
   * @param singleSocketAffinity set the singleSocketAffinity.
   */
  @VsoMethod
  public void setSingleSocketAffinity(Boolean  singleSocketAffinity) {
    this.singleSocketAffinity = singleSocketAffinity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_cpu_reserv of obj type visevmovaparams field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return vcenterCpuReserv
   */
  @VsoMethod
  public Boolean getVcenterCpuReserv() {
    return vcenterCpuReserv;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_cpu_reserv of obj type visevmovaparams field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param vcenterCpuReserv set the vcenterCpuReserv.
   */
  @VsoMethod
  public void setVcenterCpuReserv(Boolean  vcenterCpuReserv) {
    this.vcenterCpuReserv = vcenterCpuReserv;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_ds_include of obj type visevmovaparams field type str  type boolean.
   * @return vcenterDsInclude
   */
  @VsoMethod
  public Boolean getVcenterDsInclude() {
    return vcenterDsInclude;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_ds_include of obj type visevmovaparams field type str  type boolean.
   * @param vcenterDsInclude set the vcenterDsInclude.
   */
  @VsoMethod
  public void setVcenterDsInclude(Boolean  vcenterDsInclude) {
    this.vcenterDsInclude = vcenterDsInclude;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_ds_info of obj type visevmovaparams field type str  type array.
   * @return vcenterDsInfo
   */
  @VsoMethod
  public List<VcenterDatastore> getVcenterDsInfo() {
    return vcenterDsInfo;
  }

  /**
   * This is the setter method. this will set the vcenterDsInfo
   * Placeholder for description of property vcenter_ds_info of obj type visevmovaparams field type str  type array.
   * @return vcenterDsInfo
   */
  @VsoMethod
  public void setVcenterDsInfo(List<VcenterDatastore>  vcenterDsInfo) {
    this.vcenterDsInfo = vcenterDsInfo;
  }

  /**
   * This is the setter method this will set the vcenterDsInfo
   * Placeholder for description of property vcenter_ds_info of obj type visevmovaparams field type str  type array.
   * @return vcenterDsInfo
   */
  @VsoMethod
  public VISeVmOvaParams addVcenterDsInfoItem(VcenterDatastore vcenterDsInfoItem) {
    if (this.vcenterDsInfo == null) {
      this.vcenterDsInfo = new ArrayList<VcenterDatastore>();
    }
    this.vcenterDsInfo.add(vcenterDsInfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enum options - VCENTER_DATASTORE_ANY, VCENTER_DATASTORE_LOCAL, VCENTER_DATASTORE_SHARED.
   * @return vcenterDsMode
   */
  @VsoMethod
  public String getVcenterDsMode() {
    return vcenterDsMode;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - VCENTER_DATASTORE_ANY, VCENTER_DATASTORE_LOCAL, VCENTER_DATASTORE_SHARED.
   * @param vcenterDsMode set the vcenterDsMode.
   */
  @VsoMethod
  public void setVcenterDsMode(String  vcenterDsMode) {
    this.vcenterDsMode = vcenterDsMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_host of obj type visevmovaparams field type str  type string.
   * @return vcenterHost
   */
  @VsoMethod
  public String getVcenterHost() {
    return vcenterHost;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_host of obj type visevmovaparams field type str  type string.
   * @param vcenterHost set the vcenterHost.
   */
  @VsoMethod
  public void setVcenterHost(String  vcenterHost) {
    this.vcenterHost = vcenterHost;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_internal of obj type visevmovaparams field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as UNIFIED ADMIN.
   * @return vcenterInternal
   */
  @VsoMethod
  public String getVcenterInternal() {
    return vcenterInternal;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_internal of obj type visevmovaparams field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as UNIFIED ADMIN.
   * @param vcenterInternal set the vcenterInternal.
   */
  @VsoMethod
  public void setVcenterInternal(String  vcenterInternal) {
    this.vcenterInternal = vcenterInternal;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_mem_reserv of obj type visevmovaparams field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return vcenterMemReserv
   */
  @VsoMethod
  public Boolean getVcenterMemReserv() {
    return vcenterMemReserv;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_mem_reserv of obj type visevmovaparams field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param vcenterMemReserv set the vcenterMemReserv.
   */
  @VsoMethod
  public void setVcenterMemReserv(Boolean  vcenterMemReserv) {
    this.vcenterMemReserv = vcenterMemReserv;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_num_mem of obj type visevmovaparams field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
   * @return vcenterNumMem
   */
  @VsoMethod
  public Integer getVcenterNumMem() {
    return vcenterNumMem;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_num_mem of obj type visevmovaparams field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
   * @param vcenterNumMem set the vcenterNumMem.
   */
  @VsoMethod
  public void setVcenterNumMem(Integer  vcenterNumMem) {
    this.vcenterNumMem = vcenterNumMem;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_num_se_cores of obj type visevmovaparams field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return vcenterNumSeCores
   */
  @VsoMethod
  public Integer getVcenterNumSeCores() {
    return vcenterNumSeCores;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_num_se_cores of obj type visevmovaparams field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param vcenterNumSeCores set the vcenterNumSeCores.
   */
  @VsoMethod
  public void setVcenterNumSeCores(Integer  vcenterNumSeCores) {
    this.vcenterNumSeCores = vcenterNumSeCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_opaque_nwid of obj type visevmovaparams field type str  type string.
   * @return vcenterOpaqueNwid
   */
  @VsoMethod
  public String getVcenterOpaqueNwid() {
    return vcenterOpaqueNwid;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_opaque_nwid of obj type visevmovaparams field type str  type string.
   * @param vcenterOpaqueNwid set the vcenterOpaqueNwid.
   */
  @VsoMethod
  public void setVcenterOpaqueNwid(String  vcenterOpaqueNwid) {
    this.vcenterOpaqueNwid = vcenterOpaqueNwid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_ovf_path of obj type visevmovaparams field type str  type string.
   * @return vcenterOvfPath
   */
  @VsoMethod
  public String getVcenterOvfPath() {
    return vcenterOvfPath;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_ovf_path of obj type visevmovaparams field type str  type string.
   * @param vcenterOvfPath set the vcenterOvfPath.
   */
  @VsoMethod
  public void setVcenterOvfPath(String  vcenterOvfPath) {
    this.vcenterOvfPath = vcenterOvfPath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_se_disk_size_kb of obj type visevmovaparams field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10485760.
   * @return vcenterSeDiskSizeKb
   */
  @VsoMethod
  public Integer getVcenterSeDiskSizeKb() {
    return vcenterSeDiskSizeKb;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_se_disk_size_kb of obj type visevmovaparams field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10485760.
   * @param vcenterSeDiskSizeKb set the vcenterSeDiskSizeKb.
   */
  @VsoMethod
  public void setVcenterSeDiskSizeKb(Integer  vcenterSeDiskSizeKb) {
    this.vcenterSeDiskSizeKb = vcenterSeDiskSizeKb;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_se_mgmt_nw of obj type visevmovaparams field type str  type string.
   * @return vcenterSeMgmtNw
   */
  @VsoMethod
  public String getVcenterSeMgmtNw() {
    return vcenterSeMgmtNw;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_se_mgmt_nw of obj type visevmovaparams field type str  type string.
   * @param vcenterSeMgmtNw set the vcenterSeMgmtNw.
   */
  @VsoMethod
  public void setVcenterSeMgmtNw(String  vcenterSeMgmtNw) {
    this.vcenterSeMgmtNw = vcenterSeMgmtNw;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcenter_vm_folder of obj type visevmovaparams field type str  type string.
   * @return vcenterVmFolder
   */
  @VsoMethod
  public String getVcenterVmFolder() {
    return vcenterVmFolder;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcenter_vm_folder of obj type visevmovaparams field type str  type string.
   * @param vcenterVmFolder set the vcenterVmFolder.
   */
  @VsoMethod
  public void setVcenterVmFolder(String  vcenterVmFolder) {
    this.vcenterVmFolder = vcenterVmFolder;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VISeVmOvaParams objVISeVmOvaParams = (VISeVmOvaParams) o;
  return   Objects.equals(this.sevmName, objVISeVmOvaParams.sevmName)&&
  Objects.equals(this.controllerIpAddr, objVISeVmOvaParams.controllerIpAddr)&&
  Objects.equals(this.rmCookie, objVISeVmOvaParams.rmCookie)&&
  Objects.equals(this.vcenterHost, objVISeVmOvaParams.vcenterHost)&&
  Objects.equals(this.vcenterOvfPath, objVISeVmOvaParams.vcenterOvfPath)&&
  Objects.equals(this.vcenterNumSeCores, objVISeVmOvaParams.vcenterNumSeCores)&&
  Objects.equals(this.vcenterCpuReserv, objVISeVmOvaParams.vcenterCpuReserv)&&
  Objects.equals(this.vcenterNumMem, objVISeVmOvaParams.vcenterNumMem)&&
  Objects.equals(this.vcenterMemReserv, objVISeVmOvaParams.vcenterMemReserv)&&
  Objects.equals(this.vcenterVmFolder, objVISeVmOvaParams.vcenterVmFolder)&&
  Objects.equals(this.vcenterSeMgmtNw, objVISeVmOvaParams.vcenterSeMgmtNw)&&
  Objects.equals(this.vcenterDsInfo, objVISeVmOvaParams.vcenterDsInfo)&&
  Objects.equals(this.vcenterDsInclude, objVISeVmOvaParams.vcenterDsInclude)&&
  Objects.equals(this.vcenterDsMode, objVISeVmOvaParams.vcenterDsMode)&&
  Objects.equals(this.vcenterInternal, objVISeVmOvaParams.vcenterInternal)&&
  Objects.equals(this.mode, objVISeVmOvaParams.mode)&&
  Objects.equals(this.seAuthToken, objVISeVmOvaParams.seAuthToken)&&
  Objects.equals(this.vcenterSeDiskSizeKb, objVISeVmOvaParams.vcenterSeDiskSizeKb)&&
  Objects.equals(this.controllerClusterUuid, objVISeVmOvaParams.controllerClusterUuid)&&
  Objects.equals(this.singleSocketAffinity, objVISeVmOvaParams.singleSocketAffinity)&&
  Objects.equals(this.vcenterOpaqueNwid, objVISeVmOvaParams.vcenterOpaqueNwid);
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
        sb.append("    vcenterOpaqueNwid: ").append(toIndentedString(vcenterOpaqueNwid)).append("\n");
        sb.append("    vcenterOvfPath: ").append(toIndentedString(vcenterOvfPath)).append("\n");
        sb.append("    vcenterSeDiskSizeKb: ").append(toIndentedString(vcenterSeDiskSizeKb)).append("\n");
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

