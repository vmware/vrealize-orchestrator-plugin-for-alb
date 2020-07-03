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
 * The ControllerSizingLimits is a POJO class extends AviRestResource that used for creating
 * ControllerSizingLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerSizingLimits")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERSIZINGLIMITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerSizingLimits extends AviRestResource {
  @JsonProperty("controller_sizing_cloud_limits")
  @JsonInclude(Include.NON_NULL)
  private List<ControllerSizingCloudLimits> controllerSizingCloudLimits = null;

  @JsonProperty("flavor")
  @JsonInclude(Include.NON_NULL)
  private String flavor = null;

  @JsonProperty("num_clouds")
  @JsonInclude(Include.NON_NULL)
  private Integer numClouds = null;

  @JsonProperty("num_east_west_virtualservices")
  @JsonInclude(Include.NON_NULL)
  private Integer numEastWestVirtualservices = null;

  @JsonProperty("num_servers")
  @JsonInclude(Include.NON_NULL)
  private Integer numServers = null;

  @JsonProperty("num_serviceengines")
  @JsonInclude(Include.NON_NULL)
  private Integer numServiceengines = null;

  @JsonProperty("num_tenants")
  @JsonInclude(Include.NON_NULL)
  private Integer numTenants = null;

  @JsonProperty("num_virtualservices")
  @JsonInclude(Include.NON_NULL)
  private Integer numVirtualservices = null;

  @JsonProperty("num_virtualservices_rt_metrics")
  @JsonInclude(Include.NON_NULL)
  private Integer numVirtualservicesRtMetrics = null;

  @JsonProperty("num_vrfs")
  @JsonInclude(Include.NON_NULL)
  private Integer numVrfs = null;



  /**
   * This is the getter method this will return the attribute value.
   * Controller system limits specific to cloud type for this controller sizing.
   * Field introduced in 20.1.1.
   * @return controllerSizingCloudLimits
   */
  @VsoMethod
  public List<ControllerSizingCloudLimits> getControllerSizingCloudLimits() {
    return controllerSizingCloudLimits;
  }

  /**
   * This is the setter method. this will set the controllerSizingCloudLimits
   * Controller system limits specific to cloud type for this controller sizing.
   * Field introduced in 20.1.1.
   * @return controllerSizingCloudLimits
   */
  @VsoMethod
  public void setControllerSizingCloudLimits(List<ControllerSizingCloudLimits>  controllerSizingCloudLimits) {
    this.controllerSizingCloudLimits = controllerSizingCloudLimits;
  }

  /**
   * This is the setter method this will set the controllerSizingCloudLimits
   * Controller system limits specific to cloud type for this controller sizing.
   * Field introduced in 20.1.1.
   * @return controllerSizingCloudLimits
   */
  @VsoMethod
  public ControllerSizingLimits addControllerSizingCloudLimitsItem(ControllerSizingCloudLimits controllerSizingCloudLimitsItem) {
    if (this.controllerSizingCloudLimits == null) {
      this.controllerSizingCloudLimits = new ArrayList<ControllerSizingCloudLimits>();
    }
    this.controllerSizingCloudLimits.add(controllerSizingCloudLimitsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Controller flavor (s/m/l) for this sizing limit.
   * Enum options - CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE.
   * Field introduced in 20.1.1.
   * @return flavor
   */
  @VsoMethod
  public String getFlavor() {
    return flavor;
  }

  /**
   * This is the setter method to the attribute.
   * Controller flavor (s/m/l) for this sizing limit.
   * Enum options - CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE.
   * Field introduced in 20.1.1.
   * @param flavor set the flavor.
   */
  @VsoMethod
  public void setFlavor(String  flavor) {
    this.flavor = flavor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of clouds.
   * Field introduced in 20.1.1.
   * @return numClouds
   */
  @VsoMethod
  public Integer getNumClouds() {
    return numClouds;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of clouds.
   * Field introduced in 20.1.1.
   * @param numClouds set the numClouds.
   */
  @VsoMethod
  public void setNumClouds(Integer  numClouds) {
    this.numClouds = numClouds;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of east-west virtualservices.
   * Field introduced in 20.1.1.
   * @return numEastWestVirtualservices
   */
  @VsoMethod
  public Integer getNumEastWestVirtualservices() {
    return numEastWestVirtualservices;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of east-west virtualservices.
   * Field introduced in 20.1.1.
   * @param numEastWestVirtualservices set the numEastWestVirtualservices.
   */
  @VsoMethod
  public void setNumEastWestVirtualservices(Integer  numEastWestVirtualservices) {
    this.numEastWestVirtualservices = numEastWestVirtualservices;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of servers.
   * Field introduced in 20.1.1.
   * @return numServers
   */
  @VsoMethod
  public Integer getNumServers() {
    return numServers;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of servers.
   * Field introduced in 20.1.1.
   * @param numServers set the numServers.
   */
  @VsoMethod
  public void setNumServers(Integer  numServers) {
    this.numServers = numServers;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of serviceengines.
   * Field introduced in 20.1.1.
   * @return numServiceengines
   */
  @VsoMethod
  public Integer getNumServiceengines() {
    return numServiceengines;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of serviceengines.
   * Field introduced in 20.1.1.
   * @param numServiceengines set the numServiceengines.
   */
  @VsoMethod
  public void setNumServiceengines(Integer  numServiceengines) {
    this.numServiceengines = numServiceengines;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of tenants.
   * Field introduced in 20.1.1.
   * @return numTenants
   */
  @VsoMethod
  public Integer getNumTenants() {
    return numTenants;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of tenants.
   * Field introduced in 20.1.1.
   * @param numTenants set the numTenants.
   */
  @VsoMethod
  public void setNumTenants(Integer  numTenants) {
    this.numTenants = numTenants;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of virtualservices.
   * Field introduced in 20.1.1.
   * @return numVirtualservices
   */
  @VsoMethod
  public Integer getNumVirtualservices() {
    return numVirtualservices;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of virtualservices.
   * Field introduced in 20.1.1.
   * @param numVirtualservices set the numVirtualservices.
   */
  @VsoMethod
  public void setNumVirtualservices(Integer  numVirtualservices) {
    this.numVirtualservices = numVirtualservices;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of virtualservices with realtime metrics enabled.
   * Field introduced in 20.1.1.
   * @return numVirtualservicesRtMetrics
   */
  @VsoMethod
  public Integer getNumVirtualservicesRtMetrics() {
    return numVirtualservicesRtMetrics;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of virtualservices with realtime metrics enabled.
   * Field introduced in 20.1.1.
   * @param numVirtualservicesRtMetrics set the numVirtualservicesRtMetrics.
   */
  @VsoMethod
  public void setNumVirtualservicesRtMetrics(Integer  numVirtualservicesRtMetrics) {
    this.numVirtualservicesRtMetrics = numVirtualservicesRtMetrics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of vrfcontexts.
   * Field introduced in 20.1.1.
   * @return numVrfs
   */
  @VsoMethod
  public Integer getNumVrfs() {
    return numVrfs;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of vrfcontexts.
   * Field introduced in 20.1.1.
   * @param numVrfs set the numVrfs.
   */
  @VsoMethod
  public void setNumVrfs(Integer  numVrfs) {
    this.numVrfs = numVrfs;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerSizingLimits objControllerSizingLimits = (ControllerSizingLimits) o;
  return   Objects.equals(this.controllerSizingCloudLimits, objControllerSizingLimits.controllerSizingCloudLimits)&&
  Objects.equals(this.numServiceengines, objControllerSizingLimits.numServiceengines)&&
  Objects.equals(this.numVirtualservicesRtMetrics, objControllerSizingLimits.numVirtualservicesRtMetrics)&&
  Objects.equals(this.numVirtualservices, objControllerSizingLimits.numVirtualservices)&&
  Objects.equals(this.numServers, objControllerSizingLimits.numServers)&&
  Objects.equals(this.numTenants, objControllerSizingLimits.numTenants)&&
  Objects.equals(this.numVrfs, objControllerSizingLimits.numVrfs)&&
  Objects.equals(this.numEastWestVirtualservices, objControllerSizingLimits.numEastWestVirtualservices)&&
  Objects.equals(this.flavor, objControllerSizingLimits.flavor)&&
  Objects.equals(this.numClouds, objControllerSizingLimits.numClouds);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerSizingLimits {\n");
      sb.append("    controllerSizingCloudLimits: ").append(toIndentedString(controllerSizingCloudLimits)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    numClouds: ").append(toIndentedString(numClouds)).append("\n");
        sb.append("    numEastWestVirtualservices: ").append(toIndentedString(numEastWestVirtualservices)).append("\n");
        sb.append("    numServers: ").append(toIndentedString(numServers)).append("\n");
        sb.append("    numServiceengines: ").append(toIndentedString(numServiceengines)).append("\n");
        sb.append("    numTenants: ").append(toIndentedString(numTenants)).append("\n");
        sb.append("    numVirtualservices: ").append(toIndentedString(numVirtualservices)).append("\n");
        sb.append("    numVirtualservicesRtMetrics: ").append(toIndentedString(numVirtualservicesRtMetrics)).append("\n");
        sb.append("    numVrfs: ").append(toIndentedString(numVrfs)).append("\n");
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
