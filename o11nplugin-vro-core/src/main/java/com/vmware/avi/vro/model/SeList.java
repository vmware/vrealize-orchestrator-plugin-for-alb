package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SeList is a POJO class extends AviRestResource that used for creating
 * SeList.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeList")
@VsoFinder(name = Constants.FINDER_VRO_SELIST)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeList extends AviRestResource {
  @JsonProperty("admin_down_requested")
  @JsonInclude(Include.NON_NULL)
  private Boolean adminDownRequested = false;

  @JsonProperty("at_curr_ver")
  @JsonInclude(Include.NON_NULL)
  private Boolean atCurrVer = null;

  @JsonProperty("attach_ip_status")
  @JsonInclude(Include.NON_NULL)
  private String attachIpStatus = "programming network reachability to the virtual service ip in the cloud";

  @JsonProperty("attach_ip_success")
  @JsonInclude(Include.NON_NULL)
  private Boolean attachIpSuccess = false;

  @JsonProperty("delete_in_progress")
  @JsonInclude(Include.NON_NULL)
  private Boolean deleteInProgress = false;

  @JsonProperty("download_selist_only")
  @JsonInclude(Include.NON_NULL)
  private Boolean downloadSelistOnly = null;

  @JsonProperty("floating_intf_ip")
  @JsonInclude(Include.NON_NULL)
  private List<IpAddr> floatingIntfIp = null;

  @JsonProperty("geo_download")
  @JsonInclude(Include.NON_NULL)
  private Boolean geoDownload = null;

  @JsonProperty("geodb_download")
  @JsonInclude(Include.NON_NULL)
  private Boolean geodbDownload = null;

  @JsonProperty("gslb_download")
  @JsonInclude(Include.NON_NULL)
  private Boolean gslbDownload = null;

  @JsonProperty("incarnation")
  @JsonInclude(Include.NON_NULL)
  private String incarnation = null;

  @JsonProperty("is_connected")
  @JsonInclude(Include.NON_NULL)
  private Boolean isConnected = null;

  @JsonProperty("is_portchannel")
  @JsonInclude(Include.NON_NULL)
  private Boolean isPortchannel = false;

  @JsonProperty("is_primary")
  @JsonInclude(Include.NON_NULL)
  private Boolean isPrimary = true;

  @JsonProperty("is_standby")
  @JsonInclude(Include.NON_NULL)
  private Boolean isStandby = false;

  @JsonProperty("memory")
  @JsonInclude(Include.NON_NULL)
  private Integer memory = 2001;

  @JsonProperty("pending_download")
  @JsonInclude(Include.NON_NULL)
  private Boolean pendingDownload = null;

  @JsonProperty("scalein_in_progress")
  @JsonInclude(Include.NON_NULL)
  private Boolean scaleinInProgress = null;

  @JsonProperty("scaleout_in_progress")
  @JsonInclude(Include.NON_NULL)
  private Boolean scaleoutInProgress = false;

  @JsonProperty("se_ref")
  @JsonInclude(Include.NON_NULL)
  private String seRef = null;

  @JsonProperty("sec_idx")
  @JsonInclude(Include.NON_NULL)
  private Integer secIdx = 1;

  @JsonProperty("snat_ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr snatIp = null;

  @JsonProperty("vcpus")
  @JsonInclude(Include.NON_NULL)
  private Integer vcpus = 2;

  @JsonProperty("version")
  @JsonInclude(Include.NON_NULL)
  private String version = null;

  @JsonProperty("vip6_subnet_mask")
  @JsonInclude(Include.NON_NULL)
  private Integer vip6SubnetMask = 128;

  @JsonProperty("vip_intf_ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr vipIntfIp = null;

  @JsonProperty("vip_intf_list")
  @JsonInclude(Include.NON_NULL)
  private List<SeVipInterfaceList> vipIntfList = null;

  @JsonProperty("vip_intf_mac")
  @JsonInclude(Include.NON_NULL)
  private String vipIntfMac = null;

  @JsonProperty("vip_subnet_mask")
  @JsonInclude(Include.NON_NULL)
  private Integer vipSubnetMask = 32;

  @JsonProperty("vlan_id")
  @JsonInclude(Include.NON_NULL)
  private Integer vlanId = 0;

  @JsonProperty("vnic")
  @JsonInclude(Include.NON_NULL)
  private List<VsSeVnic> vnic = null;



  /**
   * This is the getter method this will return the attribute value.
   * This flag is set when scaling in an se in admin down mode.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return adminDownRequested
   */
  @VsoMethod
  public Boolean getAdminDownRequested() {
    return adminDownRequested;
  }

  /**
   * This is the setter method to the attribute.
   * This flag is set when scaling in an se in admin down mode.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param adminDownRequested set the adminDownRequested.
   */
  @VsoMethod
  public void setAdminDownRequested(Boolean  adminDownRequested) {
    this.adminDownRequested = adminDownRequested;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Indicates if an se is at the current version.
   * This state will now be derived from se group runtime.
   * Field deprecated in 18.1.5, 18.2.1.
   * @return atCurrVer
   */
  @VsoMethod
  public Boolean getAtCurrVer() {
    return atCurrVer;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates if an se is at the current version.
   * This state will now be derived from se group runtime.
   * Field deprecated in 18.1.5, 18.2.1.
   * @param atCurrVer set the atCurrVer.
   */
  @VsoMethod
  public void setAtCurrVer(Boolean  atCurrVer) {
    this.atCurrVer = atCurrVer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field indicates the status of programming network reachability to the virtual service ip in the cloud.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as programming network reachability to the virtual service ip
   * in the cloud.
   * @return attachIpStatus
   */
  @VsoMethod
  public String getAttachIpStatus() {
    return attachIpStatus;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates the status of programming network reachability to the virtual service ip in the cloud.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as programming network reachability to the virtual service ip
   * in the cloud.
   * @param attachIpStatus set the attachIpStatus.
   */
  @VsoMethod
  public void setAttachIpStatus(String  attachIpStatus) {
    this.attachIpStatus = attachIpStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag indicates if network reachability to the virtual service ip in the cloud has been successfully programmed.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return attachIpSuccess
   */
  @VsoMethod
  public Boolean getAttachIpSuccess() {
    return attachIpSuccess;
  }

  /**
   * This is the setter method to the attribute.
   * This flag indicates if network reachability to the virtual service ip in the cloud has been successfully programmed.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param attachIpSuccess set the attachIpSuccess.
   */
  @VsoMethod
  public void setAttachIpSuccess(Boolean  attachIpSuccess) {
    this.attachIpSuccess = attachIpSuccess;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag is set when an se is admin down or scaling in.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return deleteInProgress
   */
  @VsoMethod
  public Boolean getDeleteInProgress() {
    return deleteInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * This flag is set when an se is admin down or scaling in.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param deleteInProgress set the deleteInProgress.
   */
  @VsoMethod
  public void setDeleteInProgress(Boolean  deleteInProgress) {
    this.deleteInProgress = deleteInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field is not needed with the current implementation of update rpcs to ses.
   * Field deprecated in 18.1.5, 18.2.1.
   * @return downloadSelistOnly
   */
  @VsoMethod
  public Boolean getDownloadSelistOnly() {
    return downloadSelistOnly;
  }

  /**
   * This is the setter method to the attribute.
   * This field is not needed with the current implementation of update rpcs to ses.
   * Field deprecated in 18.1.5, 18.2.1.
   * @param downloadSelistOnly set the downloadSelistOnly.
   */
  @VsoMethod
  public void setDownloadSelistOnly(Boolean  downloadSelistOnly) {
    this.downloadSelistOnly = downloadSelistOnly;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property floating_intf_ip of obj type selist field type str  type array.
   * @return floatingIntfIp
   */
  @VsoMethod
  public List<IpAddr> getFloatingIntfIp() {
    return floatingIntfIp;
  }

  /**
   * This is the setter method. this will set the floatingIntfIp
   * Placeholder for description of property floating_intf_ip of obj type selist field type str  type array.
   * @return floatingIntfIp
   */
  @VsoMethod
  public void setFloatingIntfIp(List<IpAddr>  floatingIntfIp) {
    this.floatingIntfIp = floatingIntfIp;
  }

  /**
   * This is the setter method this will set the floatingIntfIp
   * Placeholder for description of property floating_intf_ip of obj type selist field type str  type array.
   * @return floatingIntfIp
   */
  @VsoMethod
  public SeList addFloatingIntfIpItem(IpAddr floatingIntfIpItem) {
    if (this.floatingIntfIp == null) {
      this.floatingIntfIp = new ArrayList<IpAddr>();
    }
    this.floatingIntfIp.add(floatingIntfIpItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * This flag indicates whether the geo-files have been pushed to the dns-vs's se.
   * No longer used, replaced by se datastore.
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.1.
   * @return geoDownload
   */
  @VsoMethod
  public Boolean getGeoDownload() {
    return geoDownload;
  }

  /**
   * This is the setter method to the attribute.
   * This flag indicates whether the geo-files have been pushed to the dns-vs's se.
   * No longer used, replaced by se datastore.
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.1.
   * @param geoDownload set the geoDownload.
   */
  @VsoMethod
  public void setGeoDownload(Boolean  geoDownload) {
    this.geoDownload = geoDownload;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag indicates whether the geodb object has been pushed to the dns-vs's se.
   * No longer used, replaced by se datastore.
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.2.
   * @return geodbDownload
   */
  @VsoMethod
  public Boolean getGeodbDownload() {
    return geodbDownload;
  }

  /**
   * This is the setter method to the attribute.
   * This flag indicates whether the geodb object has been pushed to the dns-vs's se.
   * No longer used, replaced by se datastore.
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.2.
   * @param geodbDownload set the geodbDownload.
   */
  @VsoMethod
  public void setGeodbDownload(Boolean  geodbDownload) {
    this.geodbDownload = geodbDownload;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag indicates whether the gslb, ghm, gs objects have been pushed to the dns-vs's se.
   * No longer used, replaced by se datastore.
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.1.
   * @return gslbDownload
   */
  @VsoMethod
  public Boolean getGslbDownload() {
    return gslbDownload;
  }

  /**
   * This is the setter method to the attribute.
   * This flag indicates whether the gslb, ghm, gs objects have been pushed to the dns-vs's se.
   * No longer used, replaced by se datastore.
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.1.
   * @param gslbDownload set the gslbDownload.
   */
  @VsoMethod
  public void setGslbDownload(Boolean  gslbDownload) {
    this.gslbDownload = gslbDownload;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Updated whenever this entry is created.
   * When the sees this has changed, it means that the se should disrupt, since there was a delete then create, not an update.
   * Field introduced in 18.1.5,18.2.1.
   * @return incarnation
   */
  @VsoMethod
  public String getIncarnation() {
    return incarnation;
  }

  /**
   * This is the setter method to the attribute.
   * Updated whenever this entry is created.
   * When the sees this has changed, it means that the se should disrupt, since there was a delete then create, not an update.
   * Field introduced in 18.1.5,18.2.1.
   * @param incarnation set the incarnation.
   */
  @VsoMethod
  public void setIncarnation(String  incarnation) {
    this.incarnation = incarnation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag was used to display the se connected state.
   * This state will now be derived from se group runtime.
   * Field deprecated in 18.1.5, 18.2.1.
   * @return isConnected
   */
  @VsoMethod
  public Boolean getIsConnected() {
    return isConnected;
  }

  /**
   * This is the setter method to the attribute.
   * This flag was used to display the se connected state.
   * This state will now be derived from se group runtime.
   * Field deprecated in 18.1.5, 18.2.1.
   * @param isConnected set the isConnected.
   */
  @VsoMethod
  public void setIsConnected(Boolean  isConnected) {
    this.isConnected = isConnected;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property is_portchannel of obj type selist field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isPortchannel
   */
  @VsoMethod
  public Boolean getIsPortchannel() {
    return isPortchannel;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property is_portchannel of obj type selist field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isPortchannel set the isPortchannel.
   */
  @VsoMethod
  public void setIsPortchannel(Boolean  isPortchannel) {
    this.isPortchannel = isPortchannel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property is_primary of obj type selist field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return isPrimary
   */
  @VsoMethod
  public Boolean getIsPrimary() {
    return isPrimary;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property is_primary of obj type selist field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param isPrimary set the isPrimary.
   */
  @VsoMethod
  public void setIsPrimary(Boolean  isPrimary) {
    this.isPrimary = isPrimary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property is_standby of obj type selist field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isStandby
   */
  @VsoMethod
  public Boolean getIsStandby() {
    return isStandby;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property is_standby of obj type selist field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isStandby set the isStandby.
   */
  @VsoMethod
  public void setIsStandby(Boolean  isStandby) {
    this.isStandby = isStandby;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property memory of obj type selist field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2001.
   * @return memory
   */
  @VsoMethod
  public Integer getMemory() {
    return memory;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property memory of obj type selist field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2001.
   * @param memory set the memory.
   */
  @VsoMethod
  public void setMemory(Integer  memory) {
    this.memory = memory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field is not needed with the current implementation of update rpcs to ses.
   * Field deprecated in 18.1.5, 18.2.1.
   * @return pendingDownload
   */
  @VsoMethod
  public Boolean getPendingDownload() {
    return pendingDownload;
  }

  /**
   * This is the setter method to the attribute.
   * This field is not needed with the current implementation of update rpcs to ses.
   * Field deprecated in 18.1.5, 18.2.1.
   * @param pendingDownload set the pendingDownload.
   */
  @VsoMethod
  public void setPendingDownload(Boolean  pendingDownload) {
    this.pendingDownload = pendingDownload;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Se scaling in status is determined by delete_in_progress.
   * Field deprecated in 18.1.5, 18.2.1.
   * @return scaleinInProgress
   */
  @VsoMethod
  public Boolean getScaleinInProgress() {
    return scaleinInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Se scaling in status is determined by delete_in_progress.
   * Field deprecated in 18.1.5, 18.2.1.
   * @param scaleinInProgress set the scaleinInProgress.
   */
  @VsoMethod
  public void setScaleinInProgress(Boolean  scaleinInProgress) {
    this.scaleinInProgress = scaleinInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag is set when a vs is actively scaling out to this se.
   * Field introduced in 18.1.5, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return scaleoutInProgress
   */
  @VsoMethod
  public Boolean getScaleoutInProgress() {
    return scaleoutInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * This flag is set when a vs is actively scaling out to this se.
   * Field introduced in 18.1.5, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param scaleoutInProgress set the scaleoutInProgress.
   */
  @VsoMethod
  public void setScaleoutInProgress(Boolean  scaleoutInProgress) {
    this.scaleoutInProgress = scaleoutInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * @return seRef
   */
  @VsoMethod
  public String getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type serviceengine.
   * @param seRef set the seRef.
   */
  @VsoMethod
  public void setSeRef(String  seRef) {
    this.seRef = seRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property sec_idx of obj type selist field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return secIdx
   */
  @VsoMethod
  public Integer getSecIdx() {
    return secIdx;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property sec_idx of obj type selist field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param secIdx set the secIdx.
   */
  @VsoMethod
  public void setSecIdx(Integer  secIdx) {
    this.secIdx = secIdx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property snat_ip of obj type selist field type str  type ref.
   * @return snatIp
   */
  @VsoMethod
  public IpAddr getSnatIp() {
    return snatIp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property snat_ip of obj type selist field type str  type ref.
   * @param snatIp set the snatIp.
   */
  @VsoMethod
  public void setSnatIp(IpAddr snatIp) {
    this.snatIp = snatIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcpus of obj type selist field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return vcpus
   */
  @VsoMethod
  public Integer getVcpus() {
    return vcpus;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcpus of obj type selist field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param vcpus set the vcpus.
   */
  @VsoMethod
  public void setVcpus(Integer  vcpus) {
    this.vcpus = vcpus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Version of the se.
   * This state will now be derived from se group runtime.
   * Field deprecated in 18.1.5, 18.2.1.
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Version of the se.
   * This state will now be derived from se group runtime.
   * Field deprecated in 18.1.5, 18.2.1.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @return vip6SubnetMask
   */
  @VsoMethod
  public Integer getVip6SubnetMask() {
    return vip6SubnetMask;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @param vip6SubnetMask set the vip6SubnetMask.
   */
  @VsoMethod
  public void setVip6SubnetMask(Integer  vip6SubnetMask) {
    this.vip6SubnetMask = vip6SubnetMask;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vip_intf_ip of obj type selist field type str  type ref.
   * @return vipIntfIp
   */
  @VsoMethod
  public IpAddr getVipIntfIp() {
    return vipIntfIp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vip_intf_ip of obj type selist field type str  type ref.
   * @param vipIntfIp set the vipIntfIp.
   */
  @VsoMethod
  public void setVipIntfIp(IpAddr vipIntfIp) {
    this.vipIntfIp = vipIntfIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vip_intf_list of obj type selist field type str  type array.
   * @return vipIntfList
   */
  @VsoMethod
  public List<SeVipInterfaceList> getVipIntfList() {
    return vipIntfList;
  }

  /**
   * This is the setter method. this will set the vipIntfList
   * Placeholder for description of property vip_intf_list of obj type selist field type str  type array.
   * @return vipIntfList
   */
  @VsoMethod
  public void setVipIntfList(List<SeVipInterfaceList>  vipIntfList) {
    this.vipIntfList = vipIntfList;
  }

  /**
   * This is the setter method this will set the vipIntfList
   * Placeholder for description of property vip_intf_list of obj type selist field type str  type array.
   * @return vipIntfList
   */
  @VsoMethod
  public SeList addVipIntfListItem(SeVipInterfaceList vipIntfListItem) {
    if (this.vipIntfList == null) {
      this.vipIntfList = new ArrayList<SeVipInterfaceList>();
    }
    this.vipIntfList.add(vipIntfListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vip_intf_mac of obj type selist field type str  type string.
   * @return vipIntfMac
   */
  @VsoMethod
  public String getVipIntfMac() {
    return vipIntfMac;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vip_intf_mac of obj type selist field type str  type string.
   * @param vipIntfMac set the vipIntfMac.
   */
  @VsoMethod
  public void setVipIntfMac(String  vipIntfMac) {
    this.vipIntfMac = vipIntfMac;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vip_subnet_mask of obj type selist field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 32.
   * @return vipSubnetMask
   */
  @VsoMethod
  public Integer getVipSubnetMask() {
    return vipSubnetMask;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vip_subnet_mask of obj type selist field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 32.
   * @param vipSubnetMask set the vipSubnetMask.
   */
  @VsoMethod
  public void setVipSubnetMask(Integer  vipSubnetMask) {
    this.vipSubnetMask = vipSubnetMask;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vlan_id of obj type selist field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return vlanId
   */
  @VsoMethod
  public Integer getVlanId() {
    return vlanId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vlan_id of obj type selist field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param vlanId set the vlanId.
   */
  @VsoMethod
  public void setVlanId(Integer  vlanId) {
    this.vlanId = vlanId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vnic of obj type selist field type str  type array.
   * @return vnic
   */
  @VsoMethod
  public List<VsSeVnic> getVnic() {
    return vnic;
  }

  /**
   * This is the setter method. this will set the vnic
   * Placeholder for description of property vnic of obj type selist field type str  type array.
   * @return vnic
   */
  @VsoMethod
  public void setVnic(List<VsSeVnic>  vnic) {
    this.vnic = vnic;
  }

  /**
   * This is the setter method this will set the vnic
   * Placeholder for description of property vnic of obj type selist field type str  type array.
   * @return vnic
   */
  @VsoMethod
  public SeList addVnicItem(VsSeVnic vnicItem) {
    if (this.vnic == null) {
      this.vnic = new ArrayList<VsSeVnic>();
    }
    this.vnic.add(vnicItem);
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
  SeList objSeList = (SeList) o;
  return   Objects.equals(this.vipIntfMac, objSeList.vipIntfMac)&&
  Objects.equals(this.attachIpStatus, objSeList.attachIpStatus)&&
  Objects.equals(this.secIdx, objSeList.secIdx)&&
  Objects.equals(this.snatIp, objSeList.snatIp)&&
  Objects.equals(this.geoDownload, objSeList.geoDownload)&&
  Objects.equals(this.vlanId, objSeList.vlanId)&&
  Objects.equals(this.scaleoutInProgress, objSeList.scaleoutInProgress)&&
  Objects.equals(this.scaleinInProgress, objSeList.scaleinInProgress)&&
  Objects.equals(this.geodbDownload, objSeList.geodbDownload)&&
  Objects.equals(this.vipIntfList, objSeList.vipIntfList)&&
  Objects.equals(this.version, objSeList.version)&&
  Objects.equals(this.memory, objSeList.memory)&&
  Objects.equals(this.vip6SubnetMask, objSeList.vip6SubnetMask)&&
  Objects.equals(this.vnic, objSeList.vnic)&&
  Objects.equals(this.vipIntfIp, objSeList.vipIntfIp)&&
  Objects.equals(this.downloadSelistOnly, objSeList.downloadSelistOnly)&&
  Objects.equals(this.adminDownRequested, objSeList.adminDownRequested)&&
  Objects.equals(this.incarnation, objSeList.incarnation)&&
  Objects.equals(this.isStandby, objSeList.isStandby)&&
  Objects.equals(this.vipSubnetMask, objSeList.vipSubnetMask)&&
  Objects.equals(this.atCurrVer, objSeList.atCurrVer)&&
  Objects.equals(this.seRef, objSeList.seRef)&&
  Objects.equals(this.floatingIntfIp, objSeList.floatingIntfIp)&&
  Objects.equals(this.pendingDownload, objSeList.pendingDownload)&&
  Objects.equals(this.attachIpSuccess, objSeList.attachIpSuccess)&&
  Objects.equals(this.isPortchannel, objSeList.isPortchannel)&&
  Objects.equals(this.deleteInProgress, objSeList.deleteInProgress)&&
  Objects.equals(this.isPrimary, objSeList.isPrimary)&&
  Objects.equals(this.vcpus, objSeList.vcpus)&&
  Objects.equals(this.isConnected, objSeList.isConnected)&&
  Objects.equals(this.gslbDownload, objSeList.gslbDownload);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeList {\n");
      sb.append("    adminDownRequested: ").append(toIndentedString(adminDownRequested)).append("\n");
        sb.append("    atCurrVer: ").append(toIndentedString(atCurrVer)).append("\n");
        sb.append("    attachIpStatus: ").append(toIndentedString(attachIpStatus)).append("\n");
        sb.append("    attachIpSuccess: ").append(toIndentedString(attachIpSuccess)).append("\n");
        sb.append("    deleteInProgress: ").append(toIndentedString(deleteInProgress)).append("\n");
        sb.append("    downloadSelistOnly: ").append(toIndentedString(downloadSelistOnly)).append("\n");
        sb.append("    floatingIntfIp: ").append(toIndentedString(floatingIntfIp)).append("\n");
        sb.append("    geoDownload: ").append(toIndentedString(geoDownload)).append("\n");
        sb.append("    geodbDownload: ").append(toIndentedString(geodbDownload)).append("\n");
        sb.append("    gslbDownload: ").append(toIndentedString(gslbDownload)).append("\n");
        sb.append("    incarnation: ").append(toIndentedString(incarnation)).append("\n");
        sb.append("    isConnected: ").append(toIndentedString(isConnected)).append("\n");
        sb.append("    isPortchannel: ").append(toIndentedString(isPortchannel)).append("\n");
        sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
        sb.append("    isStandby: ").append(toIndentedString(isStandby)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    pendingDownload: ").append(toIndentedString(pendingDownload)).append("\n");
        sb.append("    scaleinInProgress: ").append(toIndentedString(scaleinInProgress)).append("\n");
        sb.append("    scaleoutInProgress: ").append(toIndentedString(scaleoutInProgress)).append("\n");
        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
        sb.append("    secIdx: ").append(toIndentedString(secIdx)).append("\n");
        sb.append("    snatIp: ").append(toIndentedString(snatIp)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    vip6SubnetMask: ").append(toIndentedString(vip6SubnetMask)).append("\n");
        sb.append("    vipIntfIp: ").append(toIndentedString(vipIntfIp)).append("\n");
        sb.append("    vipIntfList: ").append(toIndentedString(vipIntfList)).append("\n");
        sb.append("    vipIntfMac: ").append(toIndentedString(vipIntfMac)).append("\n");
        sb.append("    vipSubnetMask: ").append(toIndentedString(vipSubnetMask)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
        sb.append("    vnic: ").append(toIndentedString(vnic)).append("\n");
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

