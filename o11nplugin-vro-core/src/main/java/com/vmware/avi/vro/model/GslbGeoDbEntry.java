package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.GslbGeoDbFile;
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
 * GslbGeoDbEntry
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GslbGeoDbEntry")
@VsoFinder(name = Constants.FINDER_VRO_GSLBGEODBENTRY, idAccessor = "getObjectID()")
@Service
public class GslbGeoDbEntry extends AviRestResource  {
  @JsonProperty("file")
  private GslbGeoDbFile file = null;

  @JsonProperty("priority")
  private Integer priority = 10;

  
  /**
   * This field describes the GeoDb file. Field introduced in 17.1.1.
   * @return file
  **/
  @ApiModelProperty(required = true, value = "This field describes the GeoDb file. Field introduced in 17.1.1.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public GslbGeoDbFile getFile() {
    return file;
  }
    
  @VsoMethod
  public void setFile(GslbGeoDbFile file) {
    this.file = file;
  }

  
  /**
   * Priority of this geodb entry. This value should be unique in a repeated list of geodb entries.  Higher the value, then greater is the priority.  . Allowed values are 1-100. Field introduced in 17.1.1.
   * @return priority
  **/
  @ApiModelProperty(value = "Priority of this geodb entry. This value should be unique in a repeated list of geodb entries.  Higher the value, then greater is the priority.  . Allowed values are 1-100. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getPriority() {
    return priority;
  }
    
  @VsoMethod
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  public String getObjectID() {
		return "GslbGeoDbEntry";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbGeoDbEntry gslbGeoDbEntry = (GslbGeoDbEntry) o;
    return Objects.equals(this.file, gslbGeoDbEntry.file) &&
        Objects.equals(this.priority, gslbGeoDbEntry.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbGeoDbEntry {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

