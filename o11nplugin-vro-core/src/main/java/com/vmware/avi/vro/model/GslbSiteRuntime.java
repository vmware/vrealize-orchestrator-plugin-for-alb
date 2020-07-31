package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GslbReplicationStats;
import com.vmware.avi.vro.model.GslbSiteHealthStatus;
import com.vmware.avi.vro.model.GslbSiteRuntimeCfg;
import com.vmware.avi.vro.model.GslbSiteRuntimeInfo;
import com.vmware.avi.vro.model.GslbSiteRuntimeStats;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbSiteRuntime is a POJO class extends AviRestResource that used for creating
 * GslbSiteRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbSiteRuntime")
@VsoFinder(name = Constants.FINDER_VRO_GSLBSITERUNTIME)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbSiteRuntime extends AviRestResource {
  @JsonProperty("clear_on_max_retries")
  @JsonInclude(Include.NON_NULL)
  private Integer clearOnMaxRetries = null;

  @JsonProperty("glb_uuid")
  @JsonInclude(Include.NON_NULL)
  private String glbUuid = null;

  @JsonProperty("replication_stats")
  @JsonInclude(Include.NON_NULL)
  private GslbReplicationStats replicationStats = null;

  @JsonProperty("rxed_site_hs")
  @JsonInclude(Include.NON_NULL)
  private GslbSiteHealthStatus rxedSiteHs = null;

  @JsonProperty("send_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer sendInterval = null;

  @JsonProperty("site_cfg")
  @JsonInclude(Include.NON_NULL)
  private GslbSiteRuntimeCfg siteCfg = null;

  @JsonProperty("site_info")
  @JsonInclude(Include.NON_NULL)
  private GslbSiteRuntimeInfo siteInfo = null;

  @JsonProperty("site_stats")
  @JsonInclude(Include.NON_NULL)
  private GslbSiteRuntimeStats siteStats = null;

  @JsonProperty("tenant_name")
  @JsonInclude(Include.NON_NULL)
  private String tenantName = null;

  @JsonProperty("view_id")
  @JsonInclude(Include.NON_NULL)
  private Integer viewId = null;



  /**
   * This is the getter method this will return the attribute value.
   * This field shadows glb_cfg.clear_on_max_retries.
   * Field introduced in 17.2.5.
   * @return clearOnMaxRetries
   */
  @VsoMethod
  public Integer getClearOnMaxRetries() {
    return clearOnMaxRetries;
  }

  /**
   * This is the setter method to the attribute.
   * This field shadows glb_cfg.clear_on_max_retries.
   * Field introduced in 17.2.5.
   * @param clearOnMaxRetries set the clearOnMaxRetries.
   */
  @VsoMethod
  public void setClearOnMaxRetries(Integer  clearOnMaxRetries) {
    this.clearOnMaxRetries = clearOnMaxRetries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field tracks the glb-uuid.
   * Field introduced in 17.2.5.
   * @return glbUuid
   */
  @VsoMethod
  public String getGlbUuid() {
    return glbUuid;
  }

  /**
   * This is the setter method to the attribute.
   * This field tracks the glb-uuid.
   * Field introduced in 17.2.5.
   * @param glbUuid set the glbUuid.
   */
  @VsoMethod
  public void setGlbUuid(String  glbUuid) {
    this.glbUuid = glbUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Carries replication stats for a given site.
   * Field introduced in 20.1.1.
   * @return replicationStats
   */
  @VsoMethod
  public GslbReplicationStats getReplicationStats() {
    return replicationStats;
  }

  /**
   * This is the setter method to the attribute.
   * Carries replication stats for a given site.
   * Field introduced in 20.1.1.
   * @param replicationStats set the replicationStats.
   */
  @VsoMethod
  public void setReplicationStats(GslbReplicationStats replicationStats) {
    this.replicationStats = replicationStats;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property rxed_site_hs of obj type gslbsiteruntime field type str  type ref.
   * @return rxedSiteHs
   */
  @VsoMethod
  public GslbSiteHealthStatus getRxedSiteHs() {
    return rxedSiteHs;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property rxed_site_hs of obj type gslbsiteruntime field type str  type ref.
   * @param rxedSiteHs set the rxedSiteHs.
   */
  @VsoMethod
  public void setRxedSiteHs(GslbSiteHealthStatus rxedSiteHs) {
    this.rxedSiteHs = rxedSiteHs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Frequency with which group members communicate.
   * This field shadows glb_cfg.send_interval.
   * Field introduced in 17.2.5.
   * @return sendInterval
   */
  @VsoMethod
  public Integer getSendInterval() {
    return sendInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Frequency with which group members communicate.
   * This field shadows glb_cfg.send_interval.
   * Field introduced in 17.2.5.
   * @param sendInterval set the sendInterval.
   */
  @VsoMethod
  public void setSendInterval(Integer  sendInterval) {
    this.sendInterval = sendInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property site_cfg of obj type gslbsiteruntime field type str  type ref.
   * @return siteCfg
   */
  @VsoMethod
  public GslbSiteRuntimeCfg getSiteCfg() {
    return siteCfg;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property site_cfg of obj type gslbsiteruntime field type str  type ref.
   * @param siteCfg set the siteCfg.
   */
  @VsoMethod
  public void setSiteCfg(GslbSiteRuntimeCfg siteCfg) {
    this.siteCfg = siteCfg;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property site_info of obj type gslbsiteruntime field type str  type ref.
   * @return siteInfo
   */
  @VsoMethod
  public GslbSiteRuntimeInfo getSiteInfo() {
    return siteInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property site_info of obj type gslbsiteruntime field type str  type ref.
   * @param siteInfo set the siteInfo.
   */
  @VsoMethod
  public void setSiteInfo(GslbSiteRuntimeInfo siteInfo) {
    this.siteInfo = siteInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property site_stats of obj type gslbsiteruntime field type str  type ref.
   * @return siteStats
   */
  @VsoMethod
  public GslbSiteRuntimeStats getSiteStats() {
    return siteStats;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property site_stats of obj type gslbsiteruntime field type str  type ref.
   * @param siteStats set the siteStats.
   */
  @VsoMethod
  public void setSiteStats(GslbSiteRuntimeStats siteStats) {
    this.siteStats = siteStats;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Remap the tenant_uuid to its tenant-name so that we can use the tenant_name directly in remote-site ops.
   * Field introduced in 17.2.5.
   * @return tenantName
   */
  @VsoMethod
  public String getTenantName() {
    return tenantName;
  }

  /**
   * This is the setter method to the attribute.
   * Remap the tenant_uuid to its tenant-name so that we can use the tenant_name directly in remote-site ops.
   * Field introduced in 17.2.5.
   * @param tenantName set the tenantName.
   */
  @VsoMethod
  public void setTenantName(String  tenantName) {
    this.tenantName = tenantName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field shadows the glb_cfg.view_id.
   * Field introduced in 17.2.5.
   * @return viewId
   */
  @VsoMethod
  public Integer getViewId() {
    return viewId;
  }

  /**
   * This is the setter method to the attribute.
   * This field shadows the glb_cfg.view_id.
   * Field introduced in 17.2.5.
   * @param viewId set the viewId.
   */
  @VsoMethod
  public void setViewId(Integer  viewId) {
    this.viewId = viewId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbSiteRuntime objGslbSiteRuntime = (GslbSiteRuntime) o;
  return   Objects.equals(this.siteInfo, objGslbSiteRuntime.siteInfo)&&
  Objects.equals(this.siteCfg, objGslbSiteRuntime.siteCfg)&&
  Objects.equals(this.siteStats, objGslbSiteRuntime.siteStats)&&
  Objects.equals(this.rxedSiteHs, objGslbSiteRuntime.rxedSiteHs)&&
  Objects.equals(this.replicationStats, objGslbSiteRuntime.replicationStats)&&
  Objects.equals(this.glbUuid, objGslbSiteRuntime.glbUuid)&&
  Objects.equals(this.viewId, objGslbSiteRuntime.viewId)&&
  Objects.equals(this.sendInterval, objGslbSiteRuntime.sendInterval)&&
  Objects.equals(this.clearOnMaxRetries, objGslbSiteRuntime.clearOnMaxRetries)&&
  Objects.equals(this.tenantName, objGslbSiteRuntime.tenantName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbSiteRuntime {\n");
      sb.append("    clearOnMaxRetries: ").append(toIndentedString(clearOnMaxRetries)).append("\n");
        sb.append("    glbUuid: ").append(toIndentedString(glbUuid)).append("\n");
        sb.append("    replicationStats: ").append(toIndentedString(replicationStats)).append("\n");
        sb.append("    rxedSiteHs: ").append(toIndentedString(rxedSiteHs)).append("\n");
        sb.append("    sendInterval: ").append(toIndentedString(sendInterval)).append("\n");
        sb.append("    siteCfg: ").append(toIndentedString(siteCfg)).append("\n");
        sb.append("    siteInfo: ").append(toIndentedString(siteInfo)).append("\n");
        sb.append("    siteStats: ").append(toIndentedString(siteStats)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
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

