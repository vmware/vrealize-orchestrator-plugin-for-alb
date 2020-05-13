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
 * GeoLocation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GeoLocation")
@VsoFinder(name = Constants.FINDER_VRO_GEOLOCATION, idAccessor = "getObjectID()")
@Service
public class GeoLocation extends AviRestResource  {
  @JsonProperty("latitude")
  private Float latitude = null;

  @JsonProperty("longitude")
  private Float longitude = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tag")
  private String tag = null;

  
  /**
   * Latitude of the location. This is represented as degrees.minutes. The range is from -90.0 (south) to +90.0 (north). Allowed values are -90.0-+90.0. Field introduced in 17.1.1.
   * @return latitude
  **/
  @ApiModelProperty(value = "Latitude of the location. This is represented as degrees.minutes. The range is from -90.0 (south) to +90.0 (north). Allowed values are -90.0-+90.0. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Float getLatitude() {
    return latitude;
  }
    
  @VsoMethod
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitude of the location. This is represented as degrees.minutes. The range is from -180.0 (west) to +180.0 (east). Allowed values are -180.0-+180.0. Field introduced in 17.1.1.
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude of the location. This is represented as degrees.minutes. The range is from -180.0 (west) to +180.0 (east). Allowed values are -180.0-+180.0. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Float getLongitude() {
    return longitude;
  }
    
  @VsoMethod
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  
  /**
   * Location name in the format Country/State/City. Field introduced in 17.1.1.
   * @return name
  **/
  @ApiModelProperty(value = "Location name in the format Country/State/City. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Location tag string - example  USEast. Field introduced in 17.1.1.
   * @return tag
  **/
  @ApiModelProperty(value = "Location tag string - example  USEast. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getTag() {
    return tag;
  }
    
  @VsoMethod
  public void setTag(String tag) {
    this.tag = tag;
  }

  
  public String getObjectID() {
		return "GeoLocation";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocation geoLocation = (GeoLocation) o;
    return Objects.equals(this.latitude, geoLocation.latitude) &&
        Objects.equals(this.longitude, geoLocation.longitude) &&
        Objects.equals(this.name, geoLocation.name) &&
        Objects.equals(this.tag, geoLocation.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, name, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocation {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

