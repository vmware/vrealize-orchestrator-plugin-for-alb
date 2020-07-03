package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GslbDnsInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbSiteHealthStatus is a POJO class extends AviRestResource that used for creating
 * GslbSiteHealthStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbSiteHealthStatus")
@VsoFinder(name = Constants.FINDER_VRO_GSLBSITEHEALTHSTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbSiteHealthStatus extends AviRestResource {
  @JsonProperty("controller_gsinfo")
  @JsonInclude(Include.NON_NULL)
  private List<GslbPoolMemberRuntimeInfo> controllerGsinfo = null;

  @JsonProperty("datapath_gsinfo")
  @JsonInclude(Include.NON_NULL)
  private List<GslbPoolMemberRuntimeInfo> datapathGsinfo = null;

  @JsonProperty("dns_info")
  @JsonInclude(Include.NON_NULL)
  private GslbDnsInfo dnsInfo = null;

  @JsonProperty("gap_table")
  @JsonInclude(Include.NON_NULL)
  private List<CfgState> gapTable = null;

  @JsonProperty("geo_table")
  @JsonInclude(Include.NON_NULL)
  private List<CfgState> geoTable = null;

  @JsonProperty("ghm_table")
  @JsonInclude(Include.NON_NULL)
  private List<CfgState> ghmTable = null;

  @JsonProperty("glb_table")
  @JsonInclude(Include.NON_NULL)
  private List<CfgState> glbTable = null;

  @JsonProperty("gs_table")
  @JsonInclude(Include.NON_NULL)
  private List<CfgState> gsTable = null;

  @JsonProperty("sw_version")
  @JsonInclude(Include.NON_NULL)
  private String swVersion = null;

  @JsonProperty("timestamp")
  @JsonInclude(Include.NON_NULL)
  private Float timestamp = null;



  /**
   * This is the getter method this will return the attribute value.
   * Controller retrieved gslb service operational info based of virtual service state.
   * @return controllerGsinfo
   */
  @VsoMethod
  public List<GslbPoolMemberRuntimeInfo> getControllerGsinfo() {
    return controllerGsinfo;
  }

  /**
   * This is the setter method. this will set the controllerGsinfo
   * Controller retrieved gslb service operational info based of virtual service state.
   * @return controllerGsinfo
   */
  @VsoMethod
  public void setControllerGsinfo(List<GslbPoolMemberRuntimeInfo>  controllerGsinfo) {
    this.controllerGsinfo = controllerGsinfo;
  }

  /**
   * This is the setter method this will set the controllerGsinfo
   * Controller retrieved gslb service operational info based of virtual service state.
   * @return controllerGsinfo
   */
  @VsoMethod
  public GslbSiteHealthStatus addControllerGsinfoItem(GslbPoolMemberRuntimeInfo controllerGsinfoItem) {
    if (this.controllerGsinfo == null) {
      this.controllerGsinfo = new ArrayList<GslbPoolMemberRuntimeInfo>();
    }
    this.controllerGsinfo.add(controllerGsinfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Controller retrieved gslb service operational info based of dns datapath resolution.
   * This information is generated only on those sites that have dns-vs participating in gslb.
   * @return datapathGsinfo
   */
  @VsoMethod
  public List<GslbPoolMemberRuntimeInfo> getDatapathGsinfo() {
    return datapathGsinfo;
  }

  /**
   * This is the setter method. this will set the datapathGsinfo
   * Controller retrieved gslb service operational info based of dns datapath resolution.
   * This information is generated only on those sites that have dns-vs participating in gslb.
   * @return datapathGsinfo
   */
  @VsoMethod
  public void setDatapathGsinfo(List<GslbPoolMemberRuntimeInfo>  datapathGsinfo) {
    this.datapathGsinfo = datapathGsinfo;
  }

  /**
   * This is the setter method this will set the datapathGsinfo
   * Controller retrieved gslb service operational info based of dns datapath resolution.
   * This information is generated only on those sites that have dns-vs participating in gslb.
   * @return datapathGsinfo
   */
  @VsoMethod
  public GslbSiteHealthStatus addDatapathGsinfoItem(GslbPoolMemberRuntimeInfo datapathGsinfoItem) {
    if (this.datapathGsinfo == null) {
      this.datapathGsinfo = new ArrayList<GslbPoolMemberRuntimeInfo>();
    }
    this.datapathGsinfo.add(datapathGsinfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Dns info at the site.
   * @return dnsInfo
   */
  @VsoMethod
  public GslbDnsInfo getDnsInfo() {
    return dnsInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Dns info at the site.
   * @param dnsInfo set the dnsInfo.
   */
  @VsoMethod
  public void setDnsInfo(GslbDnsInfo dnsInfo) {
    this.dnsInfo = dnsInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gslb application persistence profile state at member.
   * Field introduced in 17.1.1.
   * @return gapTable
   */
  @VsoMethod
  public List<CfgState> getGapTable() {
    return gapTable;
  }

  /**
   * This is the setter method. this will set the gapTable
   * Gslb application persistence profile state at member.
   * Field introduced in 17.1.1.
   * @return gapTable
   */
  @VsoMethod
  public void setGapTable(List<CfgState>  gapTable) {
    this.gapTable = gapTable;
  }

  /**
   * This is the setter method this will set the gapTable
   * Gslb application persistence profile state at member.
   * Field introduced in 17.1.1.
   * @return gapTable
   */
  @VsoMethod
  public GslbSiteHealthStatus addGapTableItem(CfgState gapTableItem) {
    if (this.gapTable == null) {
      this.gapTable = new ArrayList<CfgState>();
    }
    this.gapTable.add(gapTableItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Gslb geo db profile state at member.
   * Field introduced in 17.1.1.
   * @return geoTable
   */
  @VsoMethod
  public List<CfgState> getGeoTable() {
    return geoTable;
  }

  /**
   * This is the setter method. this will set the geoTable
   * Gslb geo db profile state at member.
   * Field introduced in 17.1.1.
   * @return geoTable
   */
  @VsoMethod
  public void setGeoTable(List<CfgState>  geoTable) {
    this.geoTable = geoTable;
  }

  /**
   * This is the setter method this will set the geoTable
   * Gslb geo db profile state at member.
   * Field introduced in 17.1.1.
   * @return geoTable
   */
  @VsoMethod
  public GslbSiteHealthStatus addGeoTableItem(CfgState geoTableItem) {
    if (this.geoTable == null) {
      this.geoTable = new ArrayList<CfgState>();
    }
    this.geoTable.add(geoTableItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Gslb health monitor state at member.
   * @return ghmTable
   */
  @VsoMethod
  public List<CfgState> getGhmTable() {
    return ghmTable;
  }

  /**
   * This is the setter method. this will set the ghmTable
   * Gslb health monitor state at member.
   * @return ghmTable
   */
  @VsoMethod
  public void setGhmTable(List<CfgState>  ghmTable) {
    this.ghmTable = ghmTable;
  }

  /**
   * This is the setter method this will set the ghmTable
   * Gslb health monitor state at member.
   * @return ghmTable
   */
  @VsoMethod
  public GslbSiteHealthStatus addGhmTableItem(CfgState ghmTableItem) {
    if (this.ghmTable == null) {
      this.ghmTable = new ArrayList<CfgState>();
    }
    this.ghmTable.add(ghmTableItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Gslb state at member.
   * @return glbTable
   */
  @VsoMethod
  public List<CfgState> getGlbTable() {
    return glbTable;
  }

  /**
   * This is the setter method. this will set the glbTable
   * Gslb state at member.
   * @return glbTable
   */
  @VsoMethod
  public void setGlbTable(List<CfgState>  glbTable) {
    this.glbTable = glbTable;
  }

  /**
   * This is the setter method this will set the glbTable
   * Gslb state at member.
   * @return glbTable
   */
  @VsoMethod
  public GslbSiteHealthStatus addGlbTableItem(CfgState glbTableItem) {
    if (this.glbTable == null) {
      this.glbTable = new ArrayList<CfgState>();
    }
    this.glbTable.add(glbTableItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Gslb service state at member.
   * @return gsTable
   */
  @VsoMethod
  public List<CfgState> getGsTable() {
    return gsTable;
  }

  /**
   * This is the setter method. this will set the gsTable
   * Gslb service state at member.
   * @return gsTable
   */
  @VsoMethod
  public void setGsTable(List<CfgState>  gsTable) {
    this.gsTable = gsTable;
  }

  /**
   * This is the setter method this will set the gsTable
   * Gslb service state at member.
   * @return gsTable
   */
  @VsoMethod
  public GslbSiteHealthStatus addGsTableItem(CfgState gsTableItem) {
    if (this.gsTable == null) {
      this.gsTable = new ArrayList<CfgState>();
    }
    this.gsTable.add(gsTableItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Current software version of the site.
   * @return swVersion
   */
  @VsoMethod
  public String getSwVersion() {
    return swVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Current software version of the site.
   * @param swVersion set the swVersion.
   */
  @VsoMethod
  public void setSwVersion(String  swVersion) {
    this.swVersion = swVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp of health-status generation.
   * @return timestamp
   */
  @VsoMethod
  public Float getTimestamp() {
    return timestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp of health-status generation.
   * @param timestamp set the timestamp.
   */
  @VsoMethod
  public void setTimestamp(Float  timestamp) {
    this.timestamp = timestamp;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbSiteHealthStatus objGslbSiteHealthStatus = (GslbSiteHealthStatus) o;
  return   Objects.equals(this.datapathGsinfo, objGslbSiteHealthStatus.datapathGsinfo)&&
  Objects.equals(this.swVersion, objGslbSiteHealthStatus.swVersion)&&
  Objects.equals(this.timestamp, objGslbSiteHealthStatus.timestamp)&&
  Objects.equals(this.geoTable, objGslbSiteHealthStatus.geoTable)&&
  Objects.equals(this.dnsInfo, objGslbSiteHealthStatus.dnsInfo)&&
  Objects.equals(this.ghmTable, objGslbSiteHealthStatus.ghmTable)&&
  Objects.equals(this.gapTable, objGslbSiteHealthStatus.gapTable)&&
  Objects.equals(this.controllerGsinfo, objGslbSiteHealthStatus.controllerGsinfo)&&
  Objects.equals(this.glbTable, objGslbSiteHealthStatus.glbTable)&&
  Objects.equals(this.gsTable, objGslbSiteHealthStatus.gsTable);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbSiteHealthStatus {\n");
      sb.append("    controllerGsinfo: ").append(toIndentedString(controllerGsinfo)).append("\n");
        sb.append("    datapathGsinfo: ").append(toIndentedString(datapathGsinfo)).append("\n");
        sb.append("    dnsInfo: ").append(toIndentedString(dnsInfo)).append("\n");
        sb.append("    gapTable: ").append(toIndentedString(gapTable)).append("\n");
        sb.append("    geoTable: ").append(toIndentedString(geoTable)).append("\n");
        sb.append("    ghmTable: ").append(toIndentedString(ghmTable)).append("\n");
        sb.append("    glbTable: ").append(toIndentedString(glbTable)).append("\n");
        sb.append("    gsTable: ").append(toIndentedString(gsTable)).append("\n");
        sb.append("    swVersion: ").append(toIndentedString(swVersion)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
