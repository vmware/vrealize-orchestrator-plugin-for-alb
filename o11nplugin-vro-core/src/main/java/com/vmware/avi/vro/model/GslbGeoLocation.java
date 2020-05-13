package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.GeoLocation;
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
 * GslbGeoLocation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GslbGeoLocation")
@VsoFinder(name = Constants.FINDER_VRO_GSLBGEOLOCATION, idAccessor = "getObjectID()")
@Service
public class GslbGeoLocation extends AviRestResource  {
  @JsonProperty("location")
  private GeoLocation location = null;

  @JsonProperty("source")
  private String source = null;

  
  /**
   * Geographic location of the site. Field introduced in 17.1.1.
   * @return location
  **/
  @ApiModelProperty(value = "Geographic location of the site. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public GeoLocation getLocation() {
    return location;
  }
    
  @VsoMethod
  public void setLocation(GeoLocation location) {
    this.location = location;
  }

  
  /**
   * This field describes the source of the GeoLocation. . Enum options - GSLB_LOCATION_SRC_USER_CONFIGURED, GSLB_LOCATION_SRC_INHERIT_FROM_SITE, GSLB_LOCATION_SRC_FROM_GEODB. Field introduced in 17.1.1.
   * @return source
  **/
  @ApiModelProperty(required = true, value = "This field describes the source of the GeoLocation. . Enum options - GSLB_LOCATION_SRC_USER_CONFIGURED, GSLB_LOCATION_SRC_INHERIT_FROM_SITE, GSLB_LOCATION_SRC_FROM_GEODB. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getSource() {
    return source;
  }
    
  @VsoMethod
  public void setSource(String source) {
    this.source = source;
  }

  
  public String getObjectID() {
		return "GslbGeoLocation";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbGeoLocation gslbGeoLocation = (GslbGeoLocation) o;
    return Objects.equals(this.location, gslbGeoLocation.location) &&
        Objects.equals(this.source, gslbGeoLocation.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbGeoLocation {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

