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
 * RediscoverVcenterParam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "RediscoverVcenterParam")
@VsoFinder(name = Constants.FINDER_VRO_REDISCOVERVCENTERPARAM, idAccessor = "getObjectID()")
@Service
public class RediscoverVcenterParam extends AviRestResource  {
  @JsonProperty("cloud")
  private String cloud = null;

  
  /**
   * cloud of RediscoverVcenterParam.
   * @return cloud
  **/
  @ApiModelProperty(required = true, value = "cloud of RediscoverVcenterParam.")
  @NotNull


 
  @VsoMethod  
  public String getCloud() {
    return cloud;
  }
    
  @VsoMethod
  public void setCloud(String cloud) {
    this.cloud = cloud;
  }

  
  public String getObjectID() {
		return "RediscoverVcenterParam";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RediscoverVcenterParam rediscoverVcenterParam = (RediscoverVcenterParam) o;
    return Objects.equals(this.cloud, rediscoverVcenterParam.cloud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloud);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RediscoverVcenterParam {\n");
    
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
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

