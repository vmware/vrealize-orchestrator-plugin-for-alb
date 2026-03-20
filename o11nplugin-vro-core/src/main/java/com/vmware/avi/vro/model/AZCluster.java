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
 * The AZCluster is a POJO class extends AviRestResource that used for creating
 * AZCluster.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AZCluster")
@VsoFinder(name = Constants.FINDER_VRO_AZCLUSTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AZCluster extends AviRestResource {
    @JsonProperty("cluster_ids")
    @JsonInclude(Include.NON_NULL)
    private List<String> clusterIds;

    @JsonProperty("vcenter_ref")
    @JsonInclude(Include.NON_NULL)
    private String vcenterRef;



  /**
   * This is the getter method this will return the attribute value.
   * A list of managed object ids (moids) of vcenter clusters that are part of this availability zone.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterIds
   */
  @VsoMethod
  public List<String> getClusterIds() {
    return clusterIds;
  }

  /**
   * This is the setter method. this will set the clusterIds
   * A list of managed object ids (moids) of vcenter clusters that are part of this availability zone.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterIds
   */
  @VsoMethod
  public void setClusterIds(List<String>  clusterIds) {
    this.clusterIds = clusterIds;
  }

  /**
   * This is the setter method this will set the clusterIds
   * A list of managed object ids (moids) of vcenter clusters that are part of this availability zone.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterIds
   */
  @VsoMethod
  public AZCluster addClusterIdsItem(String clusterIdsItem) {
    if (this.clusterIds == null) {
      this.clusterIds = new ArrayList<String>();
    }
    this.clusterIds.add(clusterIdsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The uuid of the vcenter server that manages the clusters associated with this availabilityzone.
   * It is a reference to an object of type vcenterserver.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterRef
   */
  @VsoMethod
  public String getVcenterRef() {
    return vcenterRef;
  }

  /**
   * This is the setter method to the attribute.
   * The uuid of the vcenter server that manages the clusters associated with this availabilityzone.
   * It is a reference to an object of type vcenterserver.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterRef set the vcenterRef.
   */
  @VsoMethod
  public void setVcenterRef(String  vcenterRef) {
    this.vcenterRef = vcenterRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AZCluster objAZCluster = (AZCluster) o;
  return   Objects.equals(this.vcenterRef, objAZCluster.vcenterRef)&&
  Objects.equals(this.clusterIds, objAZCluster.clusterIds);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AZCluster {\n");
      sb.append("    clusterIds: ").append(toIndentedString(clusterIds)).append("\n");
        sb.append("    vcenterRef: ").append(toIndentedString(vcenterRef)).append("\n");
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

