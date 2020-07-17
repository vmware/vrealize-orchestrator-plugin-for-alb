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
 * The RediscoverVcenterParam is a POJO class extends AviRestResource that used for creating
 * RediscoverVcenterParam.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RediscoverVcenterParam")
@VsoFinder(name = Constants.FINDER_VRO_REDISCOVERVCENTERPARAM)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RediscoverVcenterParam extends AviRestResource {
  @JsonProperty("cloud")
  @JsonInclude(Include.NON_NULL)
  private String cloud = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cloud of obj type rediscovervcenterparam field type str  type string.
   * @return cloud
   */
  @VsoMethod
  public String getCloud() {
    return cloud;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cloud of obj type rediscovervcenterparam field type str  type string.
   * @param cloud set the cloud.
   */
  @VsoMethod
  public void setCloud(String  cloud) {
    this.cloud = cloud;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RediscoverVcenterParam objRediscoverVcenterParam = (RediscoverVcenterParam) o;
  return   Objects.equals(this.cloud, objRediscoverVcenterParam.cloud);
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

