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
 * VcenterDatastore
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VcenterDatastore")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERDATASTORE, idAccessor = "getObjectID()")
@Service
public class VcenterDatastore extends AviRestResource  {
  @JsonProperty("datastore_name")
  private String datastoreName = null;

  
  /**
   * datastore_name of VcenterDatastore.
   * @return datastoreName
  **/
  @ApiModelProperty(required = true, value = "datastore_name of VcenterDatastore.")
  @NotNull


 
  @VsoMethod  
  public String getDatastoreName() {
    return datastoreName;
  }
    
  @VsoMethod
  public void setDatastoreName(String datastoreName) {
    this.datastoreName = datastoreName;
  }

  
  public String getObjectID() {
		return "VcenterDatastore";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcenterDatastore vcenterDatastore = (VcenterDatastore) o;
    return Objects.equals(this.datastoreName, vcenterDatastore.datastoreName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datastoreName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcenterDatastore {\n");
    
    sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
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

