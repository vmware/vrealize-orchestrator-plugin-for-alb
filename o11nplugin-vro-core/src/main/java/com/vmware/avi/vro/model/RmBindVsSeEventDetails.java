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
 * The RmBindVsSeEventDetails is a POJO class extends AviRestResource that used for creating
 * RmBindVsSeEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RmBindVsSeEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_RMBINDVSSEEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RmBindVsSeEventDetails extends AviRestResource {
  @JsonProperty("ip")
  @JsonInclude(Include.NON_NULL)
  private String ip = null;

  @JsonProperty("ip6")
  @JsonInclude(Include.NON_NULL)
  private String ip6 = null;

  @JsonProperty("primary")
  @JsonInclude(Include.NON_NULL)
  private Boolean primary = null;

  @JsonProperty("se_name")
  @JsonInclude(Include.NON_NULL)
  private String seName = null;

  @JsonProperty("standby")
  @JsonInclude(Include.NON_NULL)
  private Boolean standby = null;

  @JsonProperty("type")
  @JsonInclude(Include.NON_NULL)
  private String type = null;

  @JsonProperty("vip_vnics")
  @JsonInclude(Include.NON_NULL)
  private List<String> vipVnics = null;

  @JsonProperty("vs_name")
  @JsonInclude(Include.NON_NULL)
  private String vsName = null;

  @JsonProperty("vs_uuid")
  @JsonInclude(Include.NON_NULL)
  private String vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property ip of obj type rmbindvsseeventdetails field type str  type string.
   * @return ip
   */
  @VsoMethod
  public String getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property ip of obj type rmbindvsseeventdetails field type str  type string.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(String  ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property ip6 of obj type rmbindvsseeventdetails field type str  type string.
   * @return ip6
   */
  @VsoMethod
  public String getIp6() {
    return ip6;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property ip6 of obj type rmbindvsseeventdetails field type str  type string.
   * @param ip6 set the ip6.
   */
  @VsoMethod
  public void setIp6(String  ip6) {
    this.ip6 = ip6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property primary of obj type rmbindvsseeventdetails field type str  type boolean.
   * @return primary
   */
  @VsoMethod
  public Boolean getPrimary() {
    return primary;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property primary of obj type rmbindvsseeventdetails field type str  type boolean.
   * @param primary set the primary.
   */
  @VsoMethod
  public void setPrimary(Boolean  primary) {
    this.primary = primary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_name of obj type rmbindvsseeventdetails field type str  type string.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_name of obj type rmbindvsseeventdetails field type str  type string.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property standby of obj type rmbindvsseeventdetails field type str  type boolean.
   * @return standby
   */
  @VsoMethod
  public Boolean getStandby() {
    return standby;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property standby of obj type rmbindvsseeventdetails field type str  type boolean.
   * @param standby set the standby.
   */
  @VsoMethod
  public void setStandby(Boolean  standby) {
    this.standby = standby;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property type of obj type rmbindvsseeventdetails field type str  type string.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property type of obj type rmbindvsseeventdetails field type str  type string.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vip_vnics of obj type rmbindvsseeventdetails field type str  type array.
   * @return vipVnics
   */
  @VsoMethod
  public List<String> getVipVnics() {
    return vipVnics;
  }

  /**
   * This is the setter method. this will set the vipVnics
   * Placeholder for description of property vip_vnics of obj type rmbindvsseeventdetails field type str  type array.
   * @return vipVnics
   */
  @VsoMethod
  public void setVipVnics(List<String>  vipVnics) {
    this.vipVnics = vipVnics;
  }

  /**
   * This is the setter method this will set the vipVnics
   * Placeholder for description of property vip_vnics of obj type rmbindvsseeventdetails field type str  type array.
   * @return vipVnics
   */
  @VsoMethod
  public RmBindVsSeEventDetails addVipVnicsItem(String vipVnicsItem) {
    if (this.vipVnics == null) {
      this.vipVnics = new ArrayList<String>();
    }
    this.vipVnics.add(vipVnicsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vs_name of obj type rmbindvsseeventdetails field type str  type string.
   * @return vsName
   */
  @VsoMethod
  public String getVsName() {
    return vsName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vs_name of obj type rmbindvsseeventdetails field type str  type string.
   * @param vsName set the vsName.
   */
  @VsoMethod
  public void setVsName(String  vsName) {
    this.vsName = vsName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of vs.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of vs.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RmBindVsSeEventDetails objRmBindVsSeEventDetails = (RmBindVsSeEventDetails) o;
  return   Objects.equals(this.standby, objRmBindVsSeEventDetails.standby)&&
  Objects.equals(this.ip, objRmBindVsSeEventDetails.ip)&&
  Objects.equals(this.vsName, objRmBindVsSeEventDetails.vsName)&&
  Objects.equals(this.primary, objRmBindVsSeEventDetails.primary)&&
  Objects.equals(this.vsUuid, objRmBindVsSeEventDetails.vsUuid)&&
  Objects.equals(this.ip6, objRmBindVsSeEventDetails.ip6)&&
  Objects.equals(this.seName, objRmBindVsSeEventDetails.seName)&&
  Objects.equals(this.vipVnics, objRmBindVsSeEventDetails.vipVnics)&&
  Objects.equals(this.type, objRmBindVsSeEventDetails.type);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RmBindVsSeEventDetails {\n");
      sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    ip6: ").append(toIndentedString(ip6)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    standby: ").append(toIndentedString(standby)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vipVnics: ").append(toIndentedString(vipVnics)).append("\n");
        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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
