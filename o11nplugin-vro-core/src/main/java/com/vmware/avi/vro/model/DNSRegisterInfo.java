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
 * The DNSRegisterInfo is a POJO class extends AviRestResource that used for creating
 * DNSRegisterInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DNSRegisterInfo")
@VsoFinder(name = Constants.FINDER_VRO_DNSREGISTERINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DNSRegisterInfo extends AviRestResource {
  @JsonProperty("dns_info")
  @JsonInclude(Include.NON_NULL)
  private List<DnsInfo> dnsInfo = null;

  @JsonProperty("error")
  @JsonInclude(Include.NON_NULL)
  private String error = null;

  @JsonProperty("fip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr fip = null;

  @JsonProperty("total_records")
  @JsonInclude(Include.NON_NULL)
  private Integer totalRecords = null;

  @JsonProperty("vip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr vip = null;

  @JsonProperty("vip_id")
  @JsonInclude(Include.NON_NULL)
  private String vipId = null;

  @JsonProperty("vs_names")
  @JsonInclude(Include.NON_NULL)
  private List<String> vsNames = null;

  @JsonProperty("vs_uuids")
  @JsonInclude(Include.NON_NULL)
  private List<String> vsUuids = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property dns_info of obj type dnsregisterinfo field type str  type array.
   * @return dnsInfo
   */
  @VsoMethod
  public List<DnsInfo> getDnsInfo() {
    return dnsInfo;
  }

  /**
   * This is the setter method. this will set the dnsInfo
   * Placeholder for description of property dns_info of obj type dnsregisterinfo field type str  type array.
   * @return dnsInfo
   */
  @VsoMethod
  public void setDnsInfo(List<DnsInfo>  dnsInfo) {
    this.dnsInfo = dnsInfo;
  }

  /**
   * This is the setter method this will set the dnsInfo
   * Placeholder for description of property dns_info of obj type dnsregisterinfo field type str  type array.
   * @return dnsInfo
   */
  @VsoMethod
  public DNSRegisterInfo addDnsInfoItem(DnsInfo dnsInfoItem) {
    if (this.dnsInfo == null) {
      this.dnsInfo = new ArrayList<DnsInfo>();
    }
    this.dnsInfo.add(dnsInfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property error of obj type dnsregisterinfo field type str  type string.
   * @return error
   */
  @VsoMethod
  public String getError() {
    return error;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property error of obj type dnsregisterinfo field type str  type string.
   * @param error set the error.
   */
  @VsoMethod
  public void setError(String  error) {
    this.error = error;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property fip of obj type dnsregisterinfo field type str  type ref.
   * @return fip
   */
  @VsoMethod
  public IpAddr getFip() {
    return fip;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property fip of obj type dnsregisterinfo field type str  type ref.
   * @param fip set the fip.
   */
  @VsoMethod
  public void setFip(IpAddr fip) {
    this.fip = fip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property total_records of obj type dnsregisterinfo field type str  type integer.
   * @return totalRecords
   */
  @VsoMethod
  public Integer getTotalRecords() {
    return totalRecords;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property total_records of obj type dnsregisterinfo field type str  type integer.
   * @param totalRecords set the totalRecords.
   */
  @VsoMethod
  public void setTotalRecords(Integer  totalRecords) {
    this.totalRecords = totalRecords;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vip of obj type dnsregisterinfo field type str  type ref.
   * @return vip
   */
  @VsoMethod
  public IpAddr getVip() {
    return vip;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vip of obj type dnsregisterinfo field type str  type ref.
   * @param vip set the vip.
   */
  @VsoMethod
  public void setVip(IpAddr vip) {
    this.vip = vip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vip_id of obj type dnsregisterinfo field type str  type string.
   * @return vipId
   */
  @VsoMethod
  public String getVipId() {
    return vipId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vip_id of obj type dnsregisterinfo field type str  type string.
   * @param vipId set the vipId.
   */
  @VsoMethod
  public void setVipId(String  vipId) {
    this.vipId = vipId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vs_names of obj type dnsregisterinfo field type str  type array.
   * @return vsNames
   */
  @VsoMethod
  public List<String> getVsNames() {
    return vsNames;
  }

  /**
   * This is the setter method. this will set the vsNames
   * Placeholder for description of property vs_names of obj type dnsregisterinfo field type str  type array.
   * @return vsNames
   */
  @VsoMethod
  public void setVsNames(List<String>  vsNames) {
    this.vsNames = vsNames;
  }

  /**
   * This is the setter method this will set the vsNames
   * Placeholder for description of property vs_names of obj type dnsregisterinfo field type str  type array.
   * @return vsNames
   */
  @VsoMethod
  public DNSRegisterInfo addVsNamesItem(String vsNamesItem) {
    if (this.vsNames == null) {
      this.vsNames = new ArrayList<String>();
    }
    this.vsNames.add(vsNamesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifiers of vss.
   * @return vsUuids
   */
  @VsoMethod
  public List<String> getVsUuids() {
    return vsUuids;
  }

  /**
   * This is the setter method. this will set the vsUuids
   * Unique object identifiers of vss.
   * @return vsUuids
   */
  @VsoMethod
  public void setVsUuids(List<String>  vsUuids) {
    this.vsUuids = vsUuids;
  }

  /**
   * This is the setter method this will set the vsUuids
   * Unique object identifiers of vss.
   * @return vsUuids
   */
  @VsoMethod
  public DNSRegisterInfo addVsUuidsItem(String vsUuidsItem) {
    if (this.vsUuids == null) {
      this.vsUuids = new ArrayList<String>();
    }
    this.vsUuids.add(vsUuidsItem);
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
  DNSRegisterInfo objDNSRegisterInfo = (DNSRegisterInfo) o;
  return   Objects.equals(this.fip, objDNSRegisterInfo.fip)&&
  Objects.equals(this.vsNames, objDNSRegisterInfo.vsNames)&&
  Objects.equals(this.vipId, objDNSRegisterInfo.vipId)&&
  Objects.equals(this.dnsInfo, objDNSRegisterInfo.dnsInfo)&&
  Objects.equals(this.vip, objDNSRegisterInfo.vip)&&
  Objects.equals(this.error, objDNSRegisterInfo.error)&&
  Objects.equals(this.totalRecords, objDNSRegisterInfo.totalRecords)&&
  Objects.equals(this.vsUuids, objDNSRegisterInfo.vsUuids);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DNSRegisterInfo {\n");
      sb.append("    dnsInfo: ").append(toIndentedString(dnsInfo)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    fip: ").append(toIndentedString(fip)).append("\n");
        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
        sb.append("    vsNames: ").append(toIndentedString(vsNames)).append("\n");
        sb.append("    vsUuids: ").append(toIndentedString(vsUuids)).append("\n");
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

