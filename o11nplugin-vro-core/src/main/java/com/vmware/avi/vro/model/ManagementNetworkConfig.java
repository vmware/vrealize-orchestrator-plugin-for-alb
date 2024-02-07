package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.Tier1LogicalRouterInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ManagementNetworkConfig is a POJO class extends AviRestResource that used for creating
 * ManagementNetworkConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ManagementNetworkConfig")
@VsoFinder(name = Constants.FINDER_VRO_MANAGEMENTNETWORKCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ManagementNetworkConfig extends AviRestResource {
    @JsonProperty("overlay_segment")
    @JsonInclude(Include.NON_NULL)
    private Tier1LogicalRouterInfo overlaySegment;

    @JsonProperty("transport_zone")
    @JsonInclude(Include.NON_NULL)
    private String transportZone;

    @JsonProperty("tz_type")
    @JsonInclude(Include.NON_NULL)
    private String tzType;

    @JsonProperty("vlan_segment")
    @JsonInclude(Include.NON_NULL)
    private String vlanSegment;



  /**
   * This is the getter method this will return the attribute value.
   * Management overlay segment to use for avi service engines.
   * This should be set only when transport zone is of type overlay.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return overlaySegment
   */
  @VsoMethod
  public Tier1LogicalRouterInfo getOverlaySegment() {
    return overlaySegment;
  }

  /**
   * This is the setter method to the attribute.
   * Management overlay segment to use for avi service engines.
   * This should be set only when transport zone is of type overlay.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param overlaySegment set the overlaySegment.
   */
  @VsoMethod
  public void setOverlaySegment(Tier1LogicalRouterInfo overlaySegment) {
    this.overlaySegment = overlaySegment;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Management transport zone path for avi service engines.
   * Example- /infra/sites/default/enforcement-points/default/transport-zones/xxx-xxx-xxxx.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return transportZone
   */
  @VsoMethod
  public String getTransportZone() {
    return transportZone;
  }

  /**
   * This is the setter method to the attribute.
   * Management transport zone path for avi service engines.
   * Example- /infra/sites/default/enforcement-points/default/transport-zones/xxx-xxx-xxxx.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param transportZone set the transportZone.
   */
  @VsoMethod
  public void setTransportZone(String  transportZone) {
    this.transportZone = transportZone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Management transport zone type overlay or vlan.
   * Enum options - OVERLAY, VLAN.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tzType
   */
  @VsoMethod
  public String getTzType() {
    return tzType;
  }

  /**
   * This is the setter method to the attribute.
   * Management transport zone type overlay or vlan.
   * Enum options - OVERLAY, VLAN.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tzType set the tzType.
   */
  @VsoMethod
  public void setTzType(String  tzType) {
    this.tzType = tzType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Management vlan segment path to use for avi service engines.
   * Example- /infra/segments/vlanls.
   * This should be set only when transport zone is of type vlan.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vlanSegment
   */
  @VsoMethod
  public String getVlanSegment() {
    return vlanSegment;
  }

  /**
   * This is the setter method to the attribute.
   * Management vlan segment path to use for avi service engines.
   * Example- /infra/segments/vlanls.
   * This should be set only when transport zone is of type vlan.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vlanSegment set the vlanSegment.
   */
  @VsoMethod
  public void setVlanSegment(String  vlanSegment) {
    this.vlanSegment = vlanSegment;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ManagementNetworkConfig objManagementNetworkConfig = (ManagementNetworkConfig) o;
  return   Objects.equals(this.tzType, objManagementNetworkConfig.tzType)&&
  Objects.equals(this.transportZone, objManagementNetworkConfig.transportZone)&&
  Objects.equals(this.vlanSegment, objManagementNetworkConfig.vlanSegment)&&
  Objects.equals(this.overlaySegment, objManagementNetworkConfig.overlaySegment);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ManagementNetworkConfig {\n");
      sb.append("    overlaySegment: ").append(toIndentedString(overlaySegment)).append("\n");
        sb.append("    transportZone: ").append(toIndentedString(transportZone)).append("\n");
        sb.append("    tzType: ").append(toIndentedString(tzType)).append("\n");
        sb.append("    vlanSegment: ").append(toIndentedString(vlanSegment)).append("\n");
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

