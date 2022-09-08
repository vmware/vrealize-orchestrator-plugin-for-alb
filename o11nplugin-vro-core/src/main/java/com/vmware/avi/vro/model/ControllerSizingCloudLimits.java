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
 * The ControllerSizingCloudLimits is a POJO class extends AviRestResource that used for creating
 * ControllerSizingCloudLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerSizingCloudLimits")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERSIZINGCLOUDLIMITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerSizingCloudLimits extends AviRestResource {
    @JsonProperty("num_clouds")
    @JsonInclude(Include.NON_NULL)
    private Integer numClouds = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of clouds of a given type.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numClouds
   */
  @VsoMethod
  public Integer getNumClouds() {
    return numClouds;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of clouds of a given type.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numClouds set the numClouds.
   */
  @VsoMethod
  public void setNumClouds(Integer  numClouds) {
    this.numClouds = numClouds;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud type for the limit.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud type for the limit.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerSizingCloudLimits objControllerSizingCloudLimits = (ControllerSizingCloudLimits) o;
  return   Objects.equals(this.type, objControllerSizingCloudLimits.type)&&
  Objects.equals(this.numClouds, objControllerSizingCloudLimits.numClouds);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerSizingCloudLimits {\n");
      sb.append("    numClouds: ").append(toIndentedString(numClouds)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

