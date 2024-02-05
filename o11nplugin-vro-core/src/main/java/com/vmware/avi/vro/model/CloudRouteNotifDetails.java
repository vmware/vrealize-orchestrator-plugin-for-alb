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
 * The CloudRouteNotifDetails is a POJO class extends AviRestResource that used for creating
 * CloudRouteNotifDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudRouteNotifDetails")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDROUTENOTIFDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudRouteNotifDetails extends AviRestResource {
    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason;

    @JsonProperty("route_table")
    @JsonInclude(Include.NON_NULL)
    private String routeTable;

    @JsonProperty("routes")
    @JsonInclude(Include.NON_NULL)
    private List<String> routes;



  /**
   * This is the getter method this will return the attribute value.
   * Cloud id.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud id.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Detailed reason for the route update notification.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Detailed reason for the route update notification.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of route table for which update was performed.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return routeTable
   */
  @VsoMethod
  public String getRouteTable() {
    return routeTable;
  }

  /**
   * This is the setter method to the attribute.
   * Name of route table for which update was performed.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param routeTable set the routeTable.
   */
  @VsoMethod
  public void setRouteTable(String  routeTable) {
    this.routeTable = routeTable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Names of routes for which update was performed.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return routes
   */
  @VsoMethod
  public List<String> getRoutes() {
    return routes;
  }

  /**
   * This is the setter method. this will set the routes
   * Names of routes for which update was performed.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return routes
   */
  @VsoMethod
  public void setRoutes(List<String>  routes) {
    this.routes = routes;
  }

  /**
   * This is the setter method this will set the routes
   * Names of routes for which update was performed.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return routes
   */
  @VsoMethod
  public CloudRouteNotifDetails addRoutesItem(String routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<String>();
    }
    this.routes.add(routesItem);
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
  CloudRouteNotifDetails objCloudRouteNotifDetails = (CloudRouteNotifDetails) o;
  return   Objects.equals(this.ccId, objCloudRouteNotifDetails.ccId)&&
  Objects.equals(this.routeTable, objCloudRouteNotifDetails.routeTable)&&
  Objects.equals(this.routes, objCloudRouteNotifDetails.routes)&&
  Objects.equals(this.reason, objCloudRouteNotifDetails.reason);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CloudRouteNotifDetails {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    routeTable: ").append(toIndentedString(routeTable)).append("\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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

