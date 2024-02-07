package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
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
    private List<DnsInfo> dnsInfo;

    @JsonProperty("error")
    @JsonInclude(Include.NON_NULL)
    private String error;

    @JsonProperty("fip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr fip;

    @JsonProperty("fip6")
    @JsonInclude(Include.NON_NULL)
    private IpAddr fip6;

    @JsonProperty("total_records")
    @JsonInclude(Include.NON_NULL)
    private Integer totalRecords;

    @JsonProperty("vip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr vip;

    @JsonProperty("vip6")
    @JsonInclude(Include.NON_NULL)
    private IpAddr vip6;

    @JsonProperty("vip_id")
    @JsonInclude(Include.NON_NULL)
    private String vipId;

    @JsonProperty("vs_names")
    @JsonInclude(Include.NON_NULL)
    private List<String> vsNames;

    @JsonProperty("vs_uuids")
    @JsonInclude(Include.NON_NULL)
    private List<String> vsUuids;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsInfo
   */
  @VsoMethod
  public List<DnsInfo> getDnsInfo() {
    return dnsInfo;
  }

  /**
   * This is the setter method. this will set the dnsInfo
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsInfo
   */
  @VsoMethod
  public void setDnsInfo(List<DnsInfo>  dnsInfo) {
    this.dnsInfo = dnsInfo;
  }

  /**
   * This is the setter method this will set the dnsInfo
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return error
   */
  @VsoMethod
  public String getError() {
    return error;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param error set the error.
   */
  @VsoMethod
  public void setError(String  error) {
    this.error = error;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fip
   */
  @VsoMethod
  public IpAddr getFip() {
    return fip;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fip set the fip.
   */
  @VsoMethod
  public void setFip(IpAddr fip) {
    this.fip = fip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fip6
   */
  @VsoMethod
  public IpAddr getFip6() {
    return fip6;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fip6 set the fip6.
   */
  @VsoMethod
  public void setFip6(IpAddr fip6) {
    this.fip6 = fip6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalRecords
   */
  @VsoMethod
  public Integer getTotalRecords() {
    return totalRecords;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalRecords set the totalRecords.
   */
  @VsoMethod
  public void setTotalRecords(Integer  totalRecords) {
    this.totalRecords = totalRecords;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vip
   */
  @VsoMethod
  public IpAddr getVip() {
    return vip;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vip set the vip.
   */
  @VsoMethod
  public void setVip(IpAddr vip) {
    this.vip = vip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vip6
   */
  @VsoMethod
  public IpAddr getVip6() {
    return vip6;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vip6 set the vip6.
   */
  @VsoMethod
  public void setVip6(IpAddr vip6) {
    this.vip6 = vip6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipId
   */
  @VsoMethod
  public String getVipId() {
    return vipId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipId set the vipId.
   */
  @VsoMethod
  public void setVipId(String  vipId) {
    this.vipId = vipId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsNames
   */
  @VsoMethod
  public List<String> getVsNames() {
    return vsNames;
  }

  /**
   * This is the setter method. this will set the vsNames
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsNames
   */
  @VsoMethod
  public void setVsNames(List<String>  vsNames) {
    this.vsNames = vsNames;
  }

  /**
   * This is the setter method this will set the vsNames
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuids
   */
  @VsoMethod
  public List<String> getVsUuids() {
    return vsUuids;
  }

  /**
   * This is the setter method. this will set the vsUuids
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuids
   */
  @VsoMethod
  public void setVsUuids(List<String>  vsUuids) {
    this.vsUuids = vsUuids;
  }

  /**
   * This is the setter method this will set the vsUuids
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  return   Objects.equals(this.vipId, objDNSRegisterInfo.vipId)&&
  Objects.equals(this.vsUuids, objDNSRegisterInfo.vsUuids)&&
  Objects.equals(this.vip, objDNSRegisterInfo.vip)&&
  Objects.equals(this.fip, objDNSRegisterInfo.fip)&&
  Objects.equals(this.dnsInfo, objDNSRegisterInfo.dnsInfo)&&
  Objects.equals(this.vsNames, objDNSRegisterInfo.vsNames)&&
  Objects.equals(this.error, objDNSRegisterInfo.error)&&
  Objects.equals(this.totalRecords, objDNSRegisterInfo.totalRecords)&&
  Objects.equals(this.vip6, objDNSRegisterInfo.vip6)&&
  Objects.equals(this.fip6, objDNSRegisterInfo.fip6);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DNSRegisterInfo {\n");
      sb.append("    dnsInfo: ").append(toIndentedString(dnsInfo)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    fip: ").append(toIndentedString(fip)).append("\n");
        sb.append("    fip6: ").append(toIndentedString(fip6)).append("\n");
        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
        sb.append("    vip6: ").append(toIndentedString(vip6)).append("\n");
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

