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
 * The VcenterClusterDetails is a POJO class extends AviRestResource that used for creating
 * VcenterClusterDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VcenterClusterDetails")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERCLUSTERDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VcenterClusterDetails extends AviRestResource {
    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId = null;

    @JsonProperty("cluster")
    @JsonInclude(Include.NON_NULL)
    private String cluster = null;

    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString = null;

    @JsonProperty("hosts")
    @JsonInclude(Include.NON_NULL)
    private List<String> hosts = null;

    @JsonProperty("vc_url")
    @JsonInclude(Include.NON_NULL)
    private String vcUrl = null;



  /**
   * This is the getter method this will return the attribute value.
   * Cloud id.
   * Field introduced in 20.1.7, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud id.
   * Field introduced in 20.1.7, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cluster name in vcenter.
   * Field introduced in 20.1.7, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cluster
   */
  @VsoMethod
  public String getCluster() {
    return cluster;
  }

  /**
   * This is the setter method to the attribute.
   * Cluster name in vcenter.
   * Field introduced in 20.1.7, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cluster set the cluster.
   */
  @VsoMethod
  public void setCluster(String  cluster) {
    this.cluster = cluster;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error message.
   * Field introduced in 20.1.7, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Error message.
   * Field introduced in 20.1.7, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Hosts in vcenter cluster.
   * Field introduced in 20.1.7, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hosts
   */
  @VsoMethod
  public List<String> getHosts() {
    return hosts;
  }

  /**
   * This is the setter method. this will set the hosts
   * Hosts in vcenter cluster.
   * Field introduced in 20.1.7, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hosts
   */
  @VsoMethod
  public void setHosts(List<String>  hosts) {
    this.hosts = hosts;
  }

  /**
   * This is the setter method this will set the hosts
   * Hosts in vcenter cluster.
   * Field introduced in 20.1.7, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hosts
   */
  @VsoMethod
  public VcenterClusterDetails addHostsItem(String hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<String>();
    }
    this.hosts.add(hostsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Vc url.
   * Field introduced in 20.1.7, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcUrl
   */
  @VsoMethod
  public String getVcUrl() {
    return vcUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Vc url.
   * Field introduced in 20.1.7, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcUrl set the vcUrl.
   */
  @VsoMethod
  public void setVcUrl(String  vcUrl) {
    this.vcUrl = vcUrl;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VcenterClusterDetails objVcenterClusterDetails = (VcenterClusterDetails) o;
  return   Objects.equals(this.vcUrl, objVcenterClusterDetails.vcUrl)&&
  Objects.equals(this.cluster, objVcenterClusterDetails.cluster)&&
  Objects.equals(this.ccId, objVcenterClusterDetails.ccId)&&
  Objects.equals(this.hosts, objVcenterClusterDetails.hosts)&&
  Objects.equals(this.errorString, objVcenterClusterDetails.errorString);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VcenterClusterDetails {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    vcUrl: ").append(toIndentedString(vcUrl)).append("\n");
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

