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
 * The BgpRoutingOptions is a POJO class extends AviRestResource that used for creating
 * BgpRoutingOptions.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BgpRoutingOptions")
@VsoFinder(name = Constants.FINDER_VRO_BGPROUTINGOPTIONS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BgpRoutingOptions extends AviRestResource {
    @JsonProperty("advertise_default_route")
    @JsonInclude(Include.NON_NULL)
    private Boolean advertiseDefaultRoute;

    @JsonProperty("advertise_learned_routes")
    @JsonInclude(Include.NON_NULL)
    private Boolean advertiseLearnedRoutes;

    @JsonProperty("label")
    @JsonInclude(Include.NON_NULL)
    private String label;

    @JsonProperty("learn_only_default_route")
    @JsonInclude(Include.NON_NULL)
    private Boolean learnOnlyDefaultRoute;

    @JsonProperty("learn_routes")
    @JsonInclude(Include.NON_NULL)
    private Boolean learnRoutes;

    @JsonProperty("max_learn_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer maxLearnLimit = 50;



  /**
   * This is the getter method this will return the attribute value.
   * Advertise self as default router to the bgp peer.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return advertiseDefaultRoute
   */
  @VsoMethod
  public Boolean getAdvertiseDefaultRoute() {
    return advertiseDefaultRoute;
  }

  /**
   * This is the setter method to the attribute.
   * Advertise self as default router to the bgp peer.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param advertiseDefaultRoute set the advertiseDefaultRoute.
   */
  @VsoMethod
  public void setAdvertiseDefaultRoute(Boolean  advertiseDefaultRoute) {
    this.advertiseDefaultRoute = advertiseDefaultRoute;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Advertise the learned routes to the bgp peer.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return advertiseLearnedRoutes
   */
  @VsoMethod
  public Boolean getAdvertiseLearnedRoutes() {
    return advertiseLearnedRoutes;
  }

  /**
   * This is the setter method to the attribute.
   * Advertise the learned routes to the bgp peer.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param advertiseLearnedRoutes set the advertiseLearnedRoutes.
   */
  @VsoMethod
  public void setAdvertiseLearnedRoutes(Boolean  advertiseLearnedRoutes) {
    this.advertiseLearnedRoutes = advertiseLearnedRoutes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Features are applied to peers matching this label.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return label
   */
  @VsoMethod
  public String getLabel() {
    return label;
  }

  /**
   * This is the setter method to the attribute.
   * Features are applied to peers matching this label.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param label set the label.
   */
  @VsoMethod
  public void setLabel(String  label) {
    this.label = label;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Learn only default route from the bgp peer.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return learnOnlyDefaultRoute
   */
  @VsoMethod
  public Boolean getLearnOnlyDefaultRoute() {
    return learnOnlyDefaultRoute;
  }

  /**
   * This is the setter method to the attribute.
   * Learn only default route from the bgp peer.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param learnOnlyDefaultRoute set the learnOnlyDefaultRoute.
   */
  @VsoMethod
  public void setLearnOnlyDefaultRoute(Boolean  learnOnlyDefaultRoute) {
    this.learnOnlyDefaultRoute = learnOnlyDefaultRoute;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Learn routes from the bgp peer.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return learnRoutes
   */
  @VsoMethod
  public Boolean getLearnRoutes() {
    return learnRoutes;
  }

  /**
   * This is the setter method to the attribute.
   * Learn routes from the bgp peer.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param learnRoutes set the learnRoutes.
   */
  @VsoMethod
  public void setLearnRoutes(Boolean  learnRoutes) {
    this.learnRoutes = learnRoutes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of routes that can be learned from a bgp peer.
   * Allowed values are 50-250.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 50.
   * @return maxLearnLimit
   */
  @VsoMethod
  public Integer getMaxLearnLimit() {
    return maxLearnLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of routes that can be learned from a bgp peer.
   * Allowed values are 50-250.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 50.
   * @param maxLearnLimit set the maxLearnLimit.
   */
  @VsoMethod
  public void setMaxLearnLimit(Integer  maxLearnLimit) {
    this.maxLearnLimit = maxLearnLimit;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BgpRoutingOptions objBgpRoutingOptions = (BgpRoutingOptions) o;
  return   Objects.equals(this.label, objBgpRoutingOptions.label)&&
  Objects.equals(this.learnOnlyDefaultRoute, objBgpRoutingOptions.learnOnlyDefaultRoute)&&
  Objects.equals(this.learnRoutes, objBgpRoutingOptions.learnRoutes)&&
  Objects.equals(this.advertiseDefaultRoute, objBgpRoutingOptions.advertiseDefaultRoute)&&
  Objects.equals(this.advertiseLearnedRoutes, objBgpRoutingOptions.advertiseLearnedRoutes)&&
  Objects.equals(this.maxLearnLimit, objBgpRoutingOptions.maxLearnLimit);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BgpRoutingOptions {\n");
      sb.append("    advertiseDefaultRoute: ").append(toIndentedString(advertiseDefaultRoute)).append("\n");
        sb.append("    advertiseLearnedRoutes: ").append(toIndentedString(advertiseLearnedRoutes)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    learnOnlyDefaultRoute: ").append(toIndentedString(learnOnlyDefaultRoute)).append("\n");
        sb.append("    learnRoutes: ").append(toIndentedString(learnRoutes)).append("\n");
        sb.append("    maxLearnLimit: ").append(toIndentedString(maxLearnLimit)).append("\n");
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

