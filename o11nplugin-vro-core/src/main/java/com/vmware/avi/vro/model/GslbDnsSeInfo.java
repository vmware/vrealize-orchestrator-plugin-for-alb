package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GslbDownloadStatus;
import com.vmware.avi.vro.model.ConfigInfo;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbDnsSeInfo is a POJO class extends AviRestResource that used for creating
 * GslbDnsSeInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbDnsSeInfo")
@VsoFinder(name = Constants.FINDER_VRO_GSLBDNSSEINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbDnsSeInfo extends AviRestResource {
  @JsonProperty("fd_download")
  @JsonInclude(Include.NON_NULL)
  private GslbDownloadStatus fdDownload = null;

  @JsonProperty("fd_info")
  @JsonInclude(Include.NON_NULL)
  private ConfigInfo fdInfo = null;

  @JsonProperty("ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr ip = null;

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * This field describes the fd download status to the se.
   * Field deprecated in 18.2.3.
   * Field introduced in 17.1.1.
   * @return fdDownload
   */
  @VsoMethod
  public GslbDownloadStatus getFdDownload() {
    return fdDownload;
  }

  /**
   * This is the setter method to the attribute.
   * This field describes the fd download status to the se.
   * Field deprecated in 18.2.3.
   * Field introduced in 17.1.1.
   * @param fdDownload set the fdDownload.
   */
  @VsoMethod
  public void setFdDownload(GslbDownloadStatus fdDownload) {
    this.fdDownload = fdDownload;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Geo files queue for sequencing files to se.
   * Field deprecated in 18.2.3.
   * Field introduced in 17.1.1.
   * @return fdInfo
   */
  @VsoMethod
  public ConfigInfo getFdInfo() {
    return fdInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Geo files queue for sequencing files to se.
   * Field deprecated in 18.2.3.
   * Field introduced in 17.1.1.
   * @param fdInfo set the fdInfo.
   */
  @VsoMethod
  public void setFdInfo(ConfigInfo fdInfo) {
    this.fdInfo = fdInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine's fabric ip used to push geo files.
   * Field deprecated in 18.2.3.
   * Field introduced in 17.1.1.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine's fabric ip used to push geo files.
   * Field deprecated in 18.2.3.
   * Field introduced in 17.1.1.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the service engine.
   * Field deprecated in 18.2.3.
   * Field introduced in 17.1.1.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the service engine.
   * Field deprecated in 18.2.3.
   * Field introduced in 17.1.1.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbDnsSeInfo objGslbDnsSeInfo = (GslbDnsSeInfo) o;
  return   Objects.equals(this.ip, objGslbDnsSeInfo.ip)&&
  Objects.equals(this.fdDownload, objGslbDnsSeInfo.fdDownload)&&
  Objects.equals(this.uuid, objGslbDnsSeInfo.uuid)&&
  Objects.equals(this.fdInfo, objGslbDnsSeInfo.fdInfo);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbDnsSeInfo {\n");
      sb.append("    fdDownload: ").append(toIndentedString(fdDownload)).append("\n");
        sb.append("    fdInfo: ").append(toIndentedString(fdInfo)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
