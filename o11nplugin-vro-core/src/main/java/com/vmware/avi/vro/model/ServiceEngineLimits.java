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
 * The ServiceEngineLimits is a POJO class extends AviRestResource that used for creating
 * ServiceEngineLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServiceEngineLimits")
@VsoFinder(name = Constants.FINDER_VRO_SERVICEENGINELIMITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServiceEngineLimits extends AviRestResource {
  @JsonProperty("all_virtualservices_per_serviceengine")
  @JsonInclude(Include.NON_NULL)
  private Integer allVirtualservicesPerServiceengine = null;

  @JsonProperty("ew_virtualservices_per_serviceengine")
  @JsonInclude(Include.NON_NULL)
  private Integer ewVirtualservicesPerServiceengine = null;

  @JsonProperty("ns_virtualservices_per_serviceengine")
  @JsonInclude(Include.NON_NULL)
  private Integer nsVirtualservicesPerServiceengine = null;

  @JsonProperty("num_logical_intf_per_se")
  @JsonInclude(Include.NON_NULL)
  private Integer numLogicalIntfPerSe = null;

  @JsonProperty("num_phy_intf_per_se")
  @JsonInclude(Include.NON_NULL)
  private Integer numPhyIntfPerSe = null;

  @JsonProperty("num_virtualservices_rt_metrics")
  @JsonInclude(Include.NON_NULL)
  private Integer numVirtualservicesRtMetrics = null;

  @JsonProperty("num_vlan_intf_per_phy_intf")
  @JsonInclude(Include.NON_NULL)
  private Integer numVlanIntfPerPhyIntf = null;

  @JsonProperty("num_vlan_intf_per_se")
  @JsonInclude(Include.NON_NULL)
  private Integer numVlanIntfPerSe = null;

  @JsonProperty("serviceengine_cloud_limits")
  @JsonInclude(Include.NON_NULL)
  private List<ServiceEngineCloudLimits> serviceengineCloudLimits = null;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of virtualservices per serviceengine, including east-west virtualservices.
   * Field introduced in 20.1.1.
   * @return allVirtualservicesPerServiceengine
   */
  @VsoMethod
  public Integer getAllVirtualservicesPerServiceengine() {
    return allVirtualservicesPerServiceengine;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of virtualservices per serviceengine, including east-west virtualservices.
   * Field introduced in 20.1.1.
   * @param allVirtualservicesPerServiceengine set the allVirtualservicesPerServiceengine.
   */
  @VsoMethod
  public void setAllVirtualservicesPerServiceengine(Integer  allVirtualservicesPerServiceengine) {
    this.allVirtualservicesPerServiceengine = allVirtualservicesPerServiceengine;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of east-west virtualservices per serviceengine, excluding north-south virtualservices.
   * Field introduced in 20.1.1.
   * @return ewVirtualservicesPerServiceengine
   */
  @VsoMethod
  public Integer getEwVirtualservicesPerServiceengine() {
    return ewVirtualservicesPerServiceengine;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of east-west virtualservices per serviceengine, excluding north-south virtualservices.
   * Field introduced in 20.1.1.
   * @param ewVirtualservicesPerServiceengine set the ewVirtualservicesPerServiceengine.
   */
  @VsoMethod
  public void setEwVirtualservicesPerServiceengine(Integer  ewVirtualservicesPerServiceengine) {
    this.ewVirtualservicesPerServiceengine = ewVirtualservicesPerServiceengine;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of north-south virtualservices per serviceengine, excluding east-west virtualservices.
   * Field introduced in 20.1.1.
   * @return nsVirtualservicesPerServiceengine
   */
  @VsoMethod
  public Integer getNsVirtualservicesPerServiceengine() {
    return nsVirtualservicesPerServiceengine;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of north-south virtualservices per serviceengine, excluding east-west virtualservices.
   * Field introduced in 20.1.1.
   * @param nsVirtualservicesPerServiceengine set the nsVirtualservicesPerServiceengine.
   */
  @VsoMethod
  public void setNsVirtualservicesPerServiceengine(Integer  nsVirtualservicesPerServiceengine) {
    this.nsVirtualservicesPerServiceengine = nsVirtualservicesPerServiceengine;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of logical interfaces (vlan, bond) per serviceengine.
   * Field introduced in 20.1.1.
   * @return numLogicalIntfPerSe
   */
  @VsoMethod
  public Integer getNumLogicalIntfPerSe() {
    return numLogicalIntfPerSe;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of logical interfaces (vlan, bond) per serviceengine.
   * Field introduced in 20.1.1.
   * @param numLogicalIntfPerSe set the numLogicalIntfPerSe.
   */
  @VsoMethod
  public void setNumLogicalIntfPerSe(Integer  numLogicalIntfPerSe) {
    this.numLogicalIntfPerSe = numLogicalIntfPerSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of physical interfaces per serviceengine.
   * Field introduced in 20.1.1.
   * @return numPhyIntfPerSe
   */
  @VsoMethod
  public Integer getNumPhyIntfPerSe() {
    return numPhyIntfPerSe;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of physical interfaces per serviceengine.
   * Field introduced in 20.1.1.
   * @param numPhyIntfPerSe set the numPhyIntfPerSe.
   */
  @VsoMethod
  public void setNumPhyIntfPerSe(Integer  numPhyIntfPerSe) {
    this.numPhyIntfPerSe = numPhyIntfPerSe;
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
   * Maximum number of vlan interfaces per physical interface.
   * Field introduced in 20.1.1.
   * @return numVlanIntfPerPhyIntf
   */
  @VsoMethod
  public Integer getNumVlanIntfPerPhyIntf() {
    return numVlanIntfPerPhyIntf;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of vlan interfaces per physical interface.
   * Field introduced in 20.1.1.
   * @param numVlanIntfPerPhyIntf set the numVlanIntfPerPhyIntf.
   */
  @VsoMethod
  public void setNumVlanIntfPerPhyIntf(Integer  numVlanIntfPerPhyIntf) {
    this.numVlanIntfPerPhyIntf = numVlanIntfPerPhyIntf;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of vlan interfaces per serviceengine.
   * Field introduced in 20.1.1.
   * @return numVlanIntfPerSe
   */
  @VsoMethod
  public Integer getNumVlanIntfPerSe() {
    return numVlanIntfPerSe;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of vlan interfaces per serviceengine.
   * Field introduced in 20.1.1.
   * @param numVlanIntfPerSe set the numVlanIntfPerSe.
   */
  @VsoMethod
  public void setNumVlanIntfPerSe(Integer  numVlanIntfPerSe) {
    this.numVlanIntfPerSe = numVlanIntfPerSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceengine system limits specific to cloud type.
   * Field introduced in 20.1.1.
   * @return serviceengineCloudLimits
   */
  @VsoMethod
  public List<ServiceEngineCloudLimits> getServiceengineCloudLimits() {
    return serviceengineCloudLimits;
  }

  /**
   * This is the setter method. this will set the serviceengineCloudLimits
   * Serviceengine system limits specific to cloud type.
   * Field introduced in 20.1.1.
   * @return serviceengineCloudLimits
   */
  @VsoMethod
  public void setServiceengineCloudLimits(List<ServiceEngineCloudLimits>  serviceengineCloudLimits) {
    this.serviceengineCloudLimits = serviceengineCloudLimits;
  }

  /**
   * This is the setter method this will set the serviceengineCloudLimits
   * Serviceengine system limits specific to cloud type.
   * Field introduced in 20.1.1.
   * @return serviceengineCloudLimits
   */
  @VsoMethod
  public ServiceEngineLimits addServiceengineCloudLimitsItem(ServiceEngineCloudLimits serviceengineCloudLimitsItem) {
    if (this.serviceengineCloudLimits == null) {
      this.serviceengineCloudLimits = new ArrayList<ServiceEngineCloudLimits>();
    }
    this.serviceengineCloudLimits.add(serviceengineCloudLimitsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ServiceEngineLimits objServiceEngineLimits = (ServiceEngineLimits) o;
  return   Objects.equals(this.nsVirtualservicesPerServiceengine, objServiceEngineLimits.nsVirtualservicesPerServiceengine)&&
  Objects.equals(this.ewVirtualservicesPerServiceengine, objServiceEngineLimits.ewVirtualservicesPerServiceengine)&&
  Objects.equals(this.allVirtualservicesPerServiceengine, objServiceEngineLimits.allVirtualservicesPerServiceengine)&&
  Objects.equals(this.numVirtualservicesRtMetrics, objServiceEngineLimits.numVirtualservicesRtMetrics)&&
  Objects.equals(this.numVlanIntfPerPhyIntf, objServiceEngineLimits.numVlanIntfPerPhyIntf)&&
  Objects.equals(this.numVlanIntfPerSe, objServiceEngineLimits.numVlanIntfPerSe)&&
  Objects.equals(this.numPhyIntfPerSe, objServiceEngineLimits.numPhyIntfPerSe)&&
  Objects.equals(this.numLogicalIntfPerSe, objServiceEngineLimits.numLogicalIntfPerSe)&&
  Objects.equals(this.serviceengineCloudLimits, objServiceEngineLimits.serviceengineCloudLimits);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServiceEngineLimits {\n");
      sb.append("    allVirtualservicesPerServiceengine: ").append(toIndentedString(allVirtualservicesPerServiceengine)).append("\n");
        sb.append("    ewVirtualservicesPerServiceengine: ").append(toIndentedString(ewVirtualservicesPerServiceengine)).append("\n");
        sb.append("    nsVirtualservicesPerServiceengine: ").append(toIndentedString(nsVirtualservicesPerServiceengine)).append("\n");
        sb.append("    numLogicalIntfPerSe: ").append(toIndentedString(numLogicalIntfPerSe)).append("\n");
        sb.append("    numPhyIntfPerSe: ").append(toIndentedString(numPhyIntfPerSe)).append("\n");
        sb.append("    numVirtualservicesRtMetrics: ").append(toIndentedString(numVirtualservicesRtMetrics)).append("\n");
        sb.append("    numVlanIntfPerPhyIntf: ").append(toIndentedString(numVlanIntfPerPhyIntf)).append("\n");
        sb.append("    numVlanIntfPerSe: ").append(toIndentedString(numVlanIntfPerSe)).append("\n");
        sb.append("    serviceengineCloudLimits: ").append(toIndentedString(serviceengineCloudLimits)).append("\n");
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

