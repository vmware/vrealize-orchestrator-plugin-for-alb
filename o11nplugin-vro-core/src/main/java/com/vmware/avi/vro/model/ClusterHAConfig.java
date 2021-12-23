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
 * The ClusterHAConfig is a POJO class extends AviRestResource that used for creating
 * ClusterHAConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ClusterHAConfig")
@VsoFinder(name = Constants.FINDER_VRO_CLUSTERHACONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ClusterHAConfig extends AviRestResource {
    @JsonProperty("cluster_id")
    @JsonInclude(Include.NON_NULL)
    private String clusterId = null;

    @JsonProperty("override_vsphere_ha")
    @JsonInclude(Include.NON_NULL)
    private Boolean overrideVsphereHa = false;

    @JsonProperty("vmg_name")
    @JsonInclude(Include.NON_NULL)
    private String vmgName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Transport node cluster.
   * Avi derives vsphere ha property from vcenter cluster.if vsphere ha enabled on vcenter cluster, vsphere will handle ha of serviceengine vms in
   * case of underlying esx failure.ex mob  domain-c23.
   * Field introduced in 20.1.7, 21.1.3.
   * Allowed in basic edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterId
   */
  @VsoMethod
  public String getClusterId() {
    return clusterId;
  }

  /**
   * This is the setter method to the attribute.
   * Transport node cluster.
   * Avi derives vsphere ha property from vcenter cluster.if vsphere ha enabled on vcenter cluster, vsphere will handle ha of serviceengine vms in
   * case of underlying esx failure.ex mob  domain-c23.
   * Field introduced in 20.1.7, 21.1.3.
   * Allowed in basic edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clusterId set the clusterId.
   */
  @VsoMethod
  public void setClusterId(String  clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If this flag set to true, avi handles serviceengine failure irrespective of vsphere ha enabled on vcenter cluster or not.
   * Field introduced in 20.1.7, 21.1.3.
   * Allowed in basic edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return overrideVsphereHa
   */
  @VsoMethod
  public Boolean getOverrideVsphereHa() {
    return overrideVsphereHa;
  }

  /**
   * This is the setter method to the attribute.
   * If this flag set to true, avi handles serviceengine failure irrespective of vsphere ha enabled on vcenter cluster or not.
   * Field introduced in 20.1.7, 21.1.3.
   * Allowed in basic edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param overrideVsphereHa set the overrideVsphereHa.
   */
  @VsoMethod
  public void setOverrideVsphereHa(Boolean  overrideVsphereHa) {
    this.overrideVsphereHa = overrideVsphereHa;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cluster vm group name.vm group name is unique inside cluster.
   * Field introduced in 20.1.7, 21.1.3.
   * Allowed in basic edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vmgName
   */
  @VsoMethod
  public String getVmgName() {
    return vmgName;
  }

  /**
   * This is the setter method to the attribute.
   * Cluster vm group name.vm group name is unique inside cluster.
   * Field introduced in 20.1.7, 21.1.3.
   * Allowed in basic edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vmgName set the vmgName.
   */
  @VsoMethod
  public void setVmgName(String  vmgName) {
    this.vmgName = vmgName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ClusterHAConfig objClusterHAConfig = (ClusterHAConfig) o;
  return   Objects.equals(this.clusterId, objClusterHAConfig.clusterId)&&
  Objects.equals(this.vmgName, objClusterHAConfig.vmgName)&&
  Objects.equals(this.overrideVsphereHa, objClusterHAConfig.overrideVsphereHa);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ClusterHAConfig {\n");
      sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    overrideVsphereHa: ").append(toIndentedString(overrideVsphereHa)).append("\n");
        sb.append("    vmgName: ").append(toIndentedString(vmgName)).append("\n");
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

