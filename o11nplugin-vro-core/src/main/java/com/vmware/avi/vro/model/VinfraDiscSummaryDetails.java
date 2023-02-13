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
 * The VinfraDiscSummaryDetails is a POJO class extends AviRestResource that used for creating
 * VinfraDiscSummaryDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VinfraDiscSummaryDetails")
@VsoFinder(name = Constants.FINDER_VRO_VINFRADISCSUMMARYDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VinfraDiscSummaryDetails extends AviRestResource {
    @JsonProperty("num_clusters")
    @JsonInclude(Include.NON_NULL)
    private Integer numClusters = null;

    @JsonProperty("num_dcs")
    @JsonInclude(Include.NON_NULL)
    private Integer numDcs = null;

    @JsonProperty("num_hosts")
    @JsonInclude(Include.NON_NULL)
    private Integer numHosts = null;

    @JsonProperty("num_nws")
    @JsonInclude(Include.NON_NULL)
    private Integer numNws = null;

    @JsonProperty("num_vms")
    @JsonInclude(Include.NON_NULL)
    private Integer numVms = null;

    @JsonProperty("vcenter")
    @JsonInclude(Include.NON_NULL)
    private String vcenter = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numClusters
   */
  @VsoMethod
  public Integer getNumClusters() {
    return numClusters;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numClusters set the numClusters.
   */
  @VsoMethod
  public void setNumClusters(Integer  numClusters) {
    this.numClusters = numClusters;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numDcs
   */
  @VsoMethod
  public Integer getNumDcs() {
    return numDcs;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numDcs set the numDcs.
   */
  @VsoMethod
  public void setNumDcs(Integer  numDcs) {
    this.numDcs = numDcs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numHosts
   */
  @VsoMethod
  public Integer getNumHosts() {
    return numHosts;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numHosts set the numHosts.
   */
  @VsoMethod
  public void setNumHosts(Integer  numHosts) {
    this.numHosts = numHosts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numNws
   */
  @VsoMethod
  public Integer getNumNws() {
    return numNws;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numNws set the numNws.
   */
  @VsoMethod
  public void setNumNws(Integer  numNws) {
    this.numNws = numNws;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numVms
   */
  @VsoMethod
  public Integer getNumVms() {
    return numVms;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numVms set the numVms.
   */
  @VsoMethod
  public void setNumVms(Integer  numVms) {
    this.numVms = numVms;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenter
   */
  @VsoMethod
  public String getVcenter() {
    return vcenter;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenter set the vcenter.
   */
  @VsoMethod
  public void setVcenter(String  vcenter) {
    this.vcenter = vcenter;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VinfraDiscSummaryDetails objVinfraDiscSummaryDetails = (VinfraDiscSummaryDetails) o;
  return   Objects.equals(this.vcenter, objVinfraDiscSummaryDetails.vcenter)&&
  Objects.equals(this.numDcs, objVinfraDiscSummaryDetails.numDcs)&&
  Objects.equals(this.numHosts, objVinfraDiscSummaryDetails.numHosts)&&
  Objects.equals(this.numClusters, objVinfraDiscSummaryDetails.numClusters)&&
  Objects.equals(this.numVms, objVinfraDiscSummaryDetails.numVms)&&
  Objects.equals(this.numNws, objVinfraDiscSummaryDetails.numNws);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VinfraDiscSummaryDetails {\n");
      sb.append("    numClusters: ").append(toIndentedString(numClusters)).append("\n");
        sb.append("    numDcs: ").append(toIndentedString(numDcs)).append("\n");
        sb.append("    numHosts: ").append(toIndentedString(numHosts)).append("\n");
        sb.append("    numNws: ").append(toIndentedString(numNws)).append("\n");
        sb.append("    numVms: ").append(toIndentedString(numVms)).append("\n");
        sb.append("    vcenter: ").append(toIndentedString(vcenter)).append("\n");
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

