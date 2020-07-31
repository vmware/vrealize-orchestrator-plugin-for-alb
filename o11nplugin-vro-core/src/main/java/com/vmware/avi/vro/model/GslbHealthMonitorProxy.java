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
 * The GslbHealthMonitorProxy is a POJO class extends AviRestResource that used for creating
 * GslbHealthMonitorProxy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbHealthMonitorProxy")
@VsoFinder(name = Constants.FINDER_VRO_GSLBHEALTHMONITORPROXY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbHealthMonitorProxy extends AviRestResource {
  @JsonProperty("proxy_type")
  @JsonInclude(Include.NON_NULL)
  private String proxyType = "GSLB_HEALTH_MONITOR_PROXY_PRIVATE_MEMBERS";

  @JsonProperty("site_uuid")
  @JsonInclude(Include.NON_NULL)
  private String siteUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * This field identifies the health monitor proxy behavior.
   * The designated site for health monitor proxy can monitor public or private or all the members of a given site.
   * Enum options - GSLB_HEALTH_MONITOR_PROXY_ALL_MEMBERS, GSLB_HEALTH_MONITOR_PROXY_PRIVATE_MEMBERS.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as GSLB_HEALTH_MONITOR_PROXY_PRIVATE_MEMBERS.
   * @return proxyType
   */
  @VsoMethod
  public String getProxyType() {
    return proxyType;
  }

  /**
   * This is the setter method to the attribute.
   * This field identifies the health monitor proxy behavior.
   * The designated site for health monitor proxy can monitor public or private or all the members of a given site.
   * Enum options - GSLB_HEALTH_MONITOR_PROXY_ALL_MEMBERS, GSLB_HEALTH_MONITOR_PROXY_PRIVATE_MEMBERS.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as GSLB_HEALTH_MONITOR_PROXY_PRIVATE_MEMBERS.
   * @param proxyType set the proxyType.
   */
  @VsoMethod
  public void setProxyType(String  proxyType) {
    this.proxyType = proxyType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field identifies the site that will health monitor on behalf of the current site.
   * I.e.
   * It will be a health monitor proxy and monitor members of the current site.
   * Field introduced in 17.1.1.
   * @return siteUuid
   */
  @VsoMethod
  public String getSiteUuid() {
    return siteUuid;
  }

  /**
   * This is the setter method to the attribute.
   * This field identifies the site that will health monitor on behalf of the current site.
   * I.e.
   * It will be a health monitor proxy and monitor members of the current site.
   * Field introduced in 17.1.1.
   * @param siteUuid set the siteUuid.
   */
  @VsoMethod
  public void setSiteUuid(String  siteUuid) {
    this.siteUuid = siteUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbHealthMonitorProxy objGslbHealthMonitorProxy = (GslbHealthMonitorProxy) o;
  return   Objects.equals(this.proxyType, objGslbHealthMonitorProxy.proxyType)&&
  Objects.equals(this.siteUuid, objGslbHealthMonitorProxy.siteUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbHealthMonitorProxy {\n");
      sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
        sb.append("    siteUuid: ").append(toIndentedString(siteUuid)).append("\n");
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

