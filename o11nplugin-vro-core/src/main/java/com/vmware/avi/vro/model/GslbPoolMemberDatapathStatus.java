package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GeoLocation;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbPoolMemberDatapathStatus is a POJO class extends AviRestResource that used for creating
 * GslbPoolMemberDatapathStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbPoolMemberDatapathStatus")
@VsoFinder(name = Constants.FINDER_VRO_GSLBPOOLMEMBERDATAPATHSTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbPoolMemberDatapathStatus extends AviRestResource {
  @JsonProperty("location")
  @JsonInclude(Include.NON_NULL)
  private GeoLocation location = null;

  @JsonProperty("oper_status")
  @JsonInclude(Include.NON_NULL)
  private OperationalStatus operStatus = null;

  @JsonProperty("site_uuid")
  @JsonInclude(Include.NON_NULL)
  private String siteUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * @return location
   */
  @VsoMethod
  public GeoLocation getLocation() {
    return location;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * @param location set the location.
   */
  @VsoMethod
  public void setLocation(GeoLocation location) {
    this.location = location;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property oper_status of obj type gslbpoolmemberdatapathstatus field type str  type ref.
   * @return operStatus
   */
  @VsoMethod
  public OperationalStatus getOperStatus() {
    return operStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property oper_status of obj type gslbpoolmemberdatapathstatus field type str  type ref.
   * @param operStatus set the operStatus.
   */
  @VsoMethod
  public void setOperStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of site.
   * @return siteUuid
   */
  @VsoMethod
  public String getSiteUuid() {
    return siteUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of site.
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
  GslbPoolMemberDatapathStatus objGslbPoolMemberDatapathStatus = (GslbPoolMemberDatapathStatus) o;
  return   Objects.equals(this.siteUuid, objGslbPoolMemberDatapathStatus.siteUuid)&&
  Objects.equals(this.operStatus, objGslbPoolMemberDatapathStatus.operStatus)&&
  Objects.equals(this.location, objGslbPoolMemberDatapathStatus.location);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbPoolMemberDatapathStatus {\n");
      sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
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

