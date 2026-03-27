package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GslbObjInfo;
import com.vmware.avi.vro.model.OpsInfo;
import com.vmware.avi.vro.model.GslbSiteCfgSyncInfo;
import com.vmware.avi.vro.model.GslbReplicationStats;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The RemoteInfo is a POJO class extends AviRestResource that used for creating
 * RemoteInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RemoteInfo")
@VsoFinder(name = Constants.FINDER_VRO_REMOTEINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RemoteInfo extends AviRestResource {
    @JsonProperty("gslb_info")
    @JsonInclude(Include.NON_NULL)
    private GslbObjInfo gslbInfo;

    @JsonProperty("ops_info")
    @JsonInclude(Include.NON_NULL)
    private OpsInfo opsInfo;

    @JsonProperty("sync_info")
    @JsonInclude(Include.NON_NULL)
    private GslbSiteCfgSyncInfo syncInfo;

    @JsonProperty("sync_stats")
    @JsonInclude(Include.NON_NULL)
    private GslbReplicationStats syncStats;



  /**
   * This is the getter method this will return the attribute value.
   * Gslb object related information in the site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gslbInfo
   */
  @VsoMethod
  public GslbObjInfo getGslbInfo() {
    return gslbInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Gslb object related information in the site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gslbInfo set the gslbInfo.
   */
  @VsoMethod
  public void setGslbInfo(GslbObjInfo gslbInfo) {
    this.gslbInfo = gslbInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Operational information of the site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return opsInfo
   */
  @VsoMethod
  public OpsInfo getOpsInfo() {
    return opsInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Operational information of the site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param opsInfo set the opsInfo.
   */
  @VsoMethod
  public void setOpsInfo(OpsInfo opsInfo) {
    this.opsInfo = opsInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configuration sync-info of the site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return syncInfo
   */
  @VsoMethod
  public GslbSiteCfgSyncInfo getSyncInfo() {
    return syncInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Configuration sync-info of the site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param syncInfo set the syncInfo.
   */
  @VsoMethod
  public void setSyncInfo(GslbSiteCfgSyncInfo syncInfo) {
    this.syncInfo = syncInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Site replication specific statistic.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return syncStats
   */
  @VsoMethod
  public GslbReplicationStats getSyncStats() {
    return syncStats;
  }

  /**
   * This is the setter method to the attribute.
   * Site replication specific statistic.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param syncStats set the syncStats.
   */
  @VsoMethod
  public void setSyncStats(GslbReplicationStats syncStats) {
    this.syncStats = syncStats;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RemoteInfo objRemoteInfo = (RemoteInfo) o;
  return   Objects.equals(this.opsInfo, objRemoteInfo.opsInfo)&&
  Objects.equals(this.gslbInfo, objRemoteInfo.gslbInfo)&&
  Objects.equals(this.syncInfo, objRemoteInfo.syncInfo)&&
  Objects.equals(this.syncStats, objRemoteInfo.syncStats);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RemoteInfo {\n");
      sb.append("    gslbInfo: ").append(toIndentedString(gslbInfo)).append("\n");
        sb.append("    opsInfo: ").append(toIndentedString(opsInfo)).append("\n");
        sb.append("    syncInfo: ").append(toIndentedString(syncInfo)).append("\n");
        sb.append("    syncStats: ").append(toIndentedString(syncStats)).append("\n");
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

