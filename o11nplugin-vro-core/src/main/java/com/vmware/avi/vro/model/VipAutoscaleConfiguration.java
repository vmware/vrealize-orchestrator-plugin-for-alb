package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.VipAutoscaleZones;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * VipAutoscaleConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VipAutoscaleConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_VIPAUTOSCALECONFIGURATION, idAccessor = "getObjectID()")
@Service
public class VipAutoscaleConfiguration extends AviRestResource  {
  @JsonProperty("zones")
  @Valid
  private List<VipAutoscaleZones> zones = null;

  
  public VipAutoscaleConfiguration addZonesItem(VipAutoscaleZones zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<VipAutoscaleZones>();
    }
    this.zones.add(zonesItem);
    return this;
  }
  
  /**
   * This is the list of AZ+Subnet in which Vips will be spawned. Field introduced in 17.2.12, 18.1.2.
   * @return zones
  **/
  @ApiModelProperty(value = "This is the list of AZ+Subnet in which Vips will be spawned. Field introduced in 17.2.12, 18.1.2.")

  @Valid

 
  @VsoMethod  
  public List<VipAutoscaleZones> getZones() {
    return zones;
  }
    
  @VsoMethod
  public void setZones(List<VipAutoscaleZones> zones) {
    this.zones = zones;
  }

  
  public String getObjectID() {
		return "VipAutoscaleConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VipAutoscaleConfiguration vipAutoscaleConfiguration = (VipAutoscaleConfiguration) o;
    return Objects.equals(this.zones, vipAutoscaleConfiguration.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VipAutoscaleConfiguration {\n");
    
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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

