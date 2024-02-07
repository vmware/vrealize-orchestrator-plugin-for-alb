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
 * The VcenterClusters is a POJO class extends AviRestResource that used for creating
 * VcenterClusters.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VcenterClusters")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERCLUSTERS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VcenterClusters extends AviRestResource {
    @JsonProperty("cluster_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> clusterRefs;

    @JsonProperty("include")
    @JsonInclude(Include.NON_NULL)
    private Boolean include = false;



  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type vimgrclusterruntime.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterRefs
   */
  @VsoMethod
  public List<String> getClusterRefs() {
    return clusterRefs;
  }

  /**
   * This is the setter method. this will set the clusterRefs
   * It is a reference to an object of type vimgrclusterruntime.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterRefs
   */
  @VsoMethod
  public void setClusterRefs(List<String>  clusterRefs) {
    this.clusterRefs = clusterRefs;
  }

  /**
   * This is the setter method this will set the clusterRefs
   * It is a reference to an object of type vimgrclusterruntime.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clusterRefs
   */
  @VsoMethod
  public VcenterClusters addClusterRefsItem(String clusterRefsItem) {
    if (this.clusterRefs == null) {
      this.clusterRefs = new ArrayList<String>();
    }
    this.clusterRefs.add(clusterRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return include
   */
  @VsoMethod
  public Boolean getInclude() {
    return include;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
  VcenterClusters objVcenterClusters = (VcenterClusters) o;
  return   Objects.equals(this.clusterRefs, objVcenterClusters.clusterRefs)&&
  Objects.equals(this.include, objVcenterClusters.include);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VcenterClusters {\n");
      sb.append("    clusterRefs: ").append(toIndentedString(clusterRefs)).append("\n");
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

