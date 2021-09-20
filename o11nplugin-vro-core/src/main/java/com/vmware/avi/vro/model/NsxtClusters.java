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
 * The NsxtClusters is a POJO class extends AviRestResource that used for creating
 * NsxtClusters.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtClusters")
@VsoFinder(name = Constants.FINDER_VRO_NSXTCLUSTERS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtClusters extends AviRestResource {
    @JsonProperty("cluster_ids")
    @JsonInclude(Include.NON_NULL)
    private List<String> clusterIds = null;

    @JsonProperty("include")
    @JsonInclude(Include.NON_NULL)
    private Boolean include = false;



  /**
   * This is the getter method this will return the attribute value.
   * List of transport node clusters.
   * Field introduced in 20.1.6.
   * Allowed in basic edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterIds
   */
  @VsoMethod
  public List<String> getClusterIds() {
    return clusterIds;
  }

  /**
   * This is the setter method. this will set the clusterIds
   * List of transport node clusters.
   * Field introduced in 20.1.6.
   * Allowed in basic edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterIds
   */
  @VsoMethod
  public void setClusterIds(List<String>  clusterIds) {
    this.clusterIds = clusterIds;
  }

  /**
   * This is the setter method this will set the clusterIds
   * List of transport node clusters.
   * Field introduced in 20.1.6.
   * Allowed in basic edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterIds
   */
  @VsoMethod
  public NsxtClusters addClusterIdsItem(String clusterIdsItem) {
    if (this.clusterIds == null) {
      this.clusterIds = new ArrayList<String>();
    }
    this.clusterIds.add(clusterIdsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Include or exclude.
   * Field introduced in 20.1.6.
   * Allowed in basic edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return include
   */
  @VsoMethod
  public Boolean getInclude() {
    return include;
  }

  /**
   * This is the setter method to the attribute.
   * Include or exclude.
   * Field introduced in 20.1.6.
   * Allowed in basic edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param include set the include.
   */
  @VsoMethod
  public void setInclude(Boolean  include) {
    this.include = include;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NsxtClusters objNsxtClusters = (NsxtClusters) o;
  return   Objects.equals(this.clusterIds, objNsxtClusters.clusterIds)&&
  Objects.equals(this.include, objNsxtClusters.include);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtClusters {\n");
      sb.append("    clusterIds: ").append(toIndentedString(clusterIds)).append("\n");
        sb.append("    include: ").append(toIndentedString(include)).append("\n");
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

