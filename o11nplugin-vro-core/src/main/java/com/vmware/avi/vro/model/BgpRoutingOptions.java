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
 * BgpRoutingOptions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "BgpRoutingOptions")
@VsoFinder(name = Constants.FINDER_VRO_BGPROUTINGOPTIONS, idAccessor = "getObjectID()")
@Service
public class BgpRoutingOptions extends AviRestResource  {
  @JsonProperty("advertise_default_route")
  private Boolean advertiseDefaultRoute = null;

  @JsonProperty("advertise_learned_routes")
  private Boolean advertiseLearnedRoutes = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("learn_only_default_route")
  private Boolean learnOnlyDefaultRoute = null;

  @JsonProperty("learn_routes")
  private Boolean learnRoutes = null;

  
  /**
   * Advertise self as default router to the BGP peer. Field introduced in 20.1.1.
   * @return advertiseDefaultRoute
  **/
  @ApiModelProperty(value = "Advertise self as default router to the BGP peer. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isAdvertiseDefaultRoute() {
    return advertiseDefaultRoute;
  }
    
  @VsoMethod
  public void setAdvertiseDefaultRoute(Boolean advertiseDefaultRoute) {
    this.advertiseDefaultRoute = advertiseDefaultRoute;
  }

  
  /**
   * Advertise the learned routes to the BGP peer. Field introduced in 20.1.1.
   * @return advertiseLearnedRoutes
  **/
  @ApiModelProperty(value = "Advertise the learned routes to the BGP peer. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isAdvertiseLearnedRoutes() {
    return advertiseLearnedRoutes;
  }
    
  @VsoMethod
  public void setAdvertiseLearnedRoutes(Boolean advertiseLearnedRoutes) {
    this.advertiseLearnedRoutes = advertiseLearnedRoutes;
  }

  
  /**
   * Features are applied to peers matching this label. Field introduced in 20.1.1.
   * @return label
  **/
  @ApiModelProperty(required = true, value = "Features are applied to peers matching this label. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getLabel() {
    return label;
  }
    
  @VsoMethod
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * Learn only default route from the BGP peer. Field introduced in 20.1.1.
   * @return learnOnlyDefaultRoute
  **/
  @ApiModelProperty(value = "Learn only default route from the BGP peer. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isLearnOnlyDefaultRoute() {
    return learnOnlyDefaultRoute;
  }
    
  @VsoMethod
  public void setLearnOnlyDefaultRoute(Boolean learnOnlyDefaultRoute) {
    this.learnOnlyDefaultRoute = learnOnlyDefaultRoute;
  }

  
  /**
   * Learn routes from the BGP peer. Field introduced in 20.1.1.
   * @return learnRoutes
  **/
  @ApiModelProperty(value = "Learn routes from the BGP peer. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isLearnRoutes() {
    return learnRoutes;
  }
    
  @VsoMethod
  public void setLearnRoutes(Boolean learnRoutes) {
    this.learnRoutes = learnRoutes;
  }

  
  public String getObjectID() {
		return "BgpRoutingOptions";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpRoutingOptions bgpRoutingOptions = (BgpRoutingOptions) o;
    return Objects.equals(this.advertiseDefaultRoute, bgpRoutingOptions.advertiseDefaultRoute) &&
        Objects.equals(this.advertiseLearnedRoutes, bgpRoutingOptions.advertiseLearnedRoutes) &&
        Objects.equals(this.label, bgpRoutingOptions.label) &&
        Objects.equals(this.learnOnlyDefaultRoute, bgpRoutingOptions.learnOnlyDefaultRoute) &&
        Objects.equals(this.learnRoutes, bgpRoutingOptions.learnRoutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiseDefaultRoute, advertiseLearnedRoutes, label, learnOnlyDefaultRoute, learnRoutes);
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

