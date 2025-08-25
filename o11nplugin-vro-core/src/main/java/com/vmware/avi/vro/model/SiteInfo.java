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
 * The SiteInfo is a POJO class extends AviRestResource that used for creating
 * SiteInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SiteInfo")
@VsoFinder(name = Constants.FINDER_VRO_SITEINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SiteInfo extends AviRestResource {
    @JsonProperty("cluster_id")
    @JsonInclude(Include.NON_NULL)
    private String clusterId;



  /**
   * This is the getter method this will return the attribute value.
   * Cluster_uuid of a member configured in gslb federation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterId
   */
  @VsoMethod
  public String getClusterId() {
    return clusterId;
  }

  /**
   * This is the setter method to the attribute.
   * Cluster_uuid of a member configured in gslb federation.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clusterId set the clusterId.
   */
  @VsoMethod
  public void setClusterId(String  clusterId) {
    this.clusterId = clusterId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SiteInfo objSiteInfo = (SiteInfo) o;
  return   Objects.equals(this.clusterId, objSiteInfo.clusterId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SiteInfo {\n");
      sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

