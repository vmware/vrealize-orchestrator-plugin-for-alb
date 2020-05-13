package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * GslbHealthMonitorProxy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GslbHealthMonitorProxy")
@VsoFinder(name = Constants.FINDER_VRO_GSLBHEALTHMONITORPROXY, idAccessor = "getObjectID()")
@Service
public class GslbHealthMonitorProxy extends AviRestResource  {
  @JsonProperty("proxy_type")
  private String proxyType = "GSLB_HEALTH_MONITOR_PROXY_PRIVATE_MEMBERS";

  @JsonProperty("site_uuid")
  private String siteUuid = null;

  
  /**
   * This field identifies the health monitor proxy behavior. The designated site for health monitor proxy can monitor public or private or all the members of a given site. . Enum options - GSLB_HEALTH_MONITOR_PROXY_ALL_MEMBERS, GSLB_HEALTH_MONITOR_PROXY_PRIVATE_MEMBERS. Field introduced in 17.1.1.
   * @return proxyType
  **/
  @ApiModelProperty(value = "This field identifies the health monitor proxy behavior. The designated site for health monitor proxy can monitor public or private or all the members of a given site. . Enum options - GSLB_HEALTH_MONITOR_PROXY_ALL_MEMBERS, GSLB_HEALTH_MONITOR_PROXY_PRIVATE_MEMBERS. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getProxyType() {
    return proxyType;
  }
    
  @VsoMethod
  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }

  
  /**
   * This field identifies the site that will health monitor on behalf of the current site. i.e. it will be a health monitor proxy and monitor members of the current site. . Field introduced in 17.1.1.
   * @return siteUuid
  **/
  @ApiModelProperty(value = "This field identifies the site that will health monitor on behalf of the current site. i.e. it will be a health monitor proxy and monitor members of the current site. . Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getSiteUuid() {
    return siteUuid;
  }
    
  @VsoMethod
  public void setSiteUuid(String siteUuid) {
    this.siteUuid = siteUuid;
  }

  
  public String getObjectID() {
		return "GslbHealthMonitorProxy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbHealthMonitorProxy gslbHealthMonitorProxy = (GslbHealthMonitorProxy) o;
    return Objects.equals(this.proxyType, gslbHealthMonitorProxy.proxyType) &&
        Objects.equals(this.siteUuid, gslbHealthMonitorProxy.siteUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyType, siteUuid);
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

