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
 * The AkoAmkoClusterDeploymentInfo is a POJO class extends AviRestResource that used for creating
 * AkoAmkoClusterDeploymentInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AkoAmkoClusterDeploymentInfo")
@VsoFinder(name = Constants.FINDER_VRO_AKOAMKOCLUSTERDEPLOYMENTINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AkoAmkoClusterDeploymentInfo extends AviRestResource {
    @JsonProperty("namespace")
    @JsonInclude(Include.NON_NULL)
    private String namespace;

    @JsonProperty("pod_name")
    @JsonInclude(Include.NON_NULL)
    private String podName;

    @JsonProperty("replica_count")
    @JsonInclude(Include.NON_NULL)
    private Integer replicaCount;



  /**
   * This is the getter method this will return the attribute value.
   * Kubernetes namespace where ako/amko is deployed.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return namespace
   */
  @VsoMethod
  public String getNamespace() {
    return namespace;
  }

  /**
   * This is the setter method to the attribute.
   * Kubernetes namespace where ako/amko is deployed.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param namespace set the namespace.
   */
  @VsoMethod
  public void setNamespace(String  namespace) {
    this.namespace = namespace;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pod name for identification.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return podName
   */
  @VsoMethod
  public String getPodName() {
    return podName;
  }

  /**
   * This is the setter method to the attribute.
   * Pod name for identification.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param podName set the podName.
   */
  @VsoMethod
  public void setPodName(String  podName) {
    this.podName = podName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of replicas in the deployment.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return replicaCount
   */
  @VsoMethod
  public Integer getReplicaCount() {
    return replicaCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of replicas in the deployment.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param replicaCount set the replicaCount.
   */
  @VsoMethod
  public void setReplicaCount(Integer  replicaCount) {
    this.replicaCount = replicaCount;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AkoAmkoClusterDeploymentInfo objAkoAmkoClusterDeploymentInfo = (AkoAmkoClusterDeploymentInfo) o;
  return   Objects.equals(this.namespace, objAkoAmkoClusterDeploymentInfo.namespace)&&
  Objects.equals(this.podName, objAkoAmkoClusterDeploymentInfo.podName)&&
  Objects.equals(this.replicaCount, objAkoAmkoClusterDeploymentInfo.replicaCount);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AkoAmkoClusterDeploymentInfo {\n");
      sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    replicaCount: ").append(toIndentedString(replicaCount)).append("\n");
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

