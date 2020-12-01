package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The Cluster is a POJO class extends AviRestResource that used for creating
 * Cluster.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Cluster")
@VsoFinder(name = Constants.FINDER_VRO_CLUSTER, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Cluster extends AviRestResource {
    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("nodes")
    @JsonInclude(Include.NON_NULL)
    private List<ClusterNode> nodes = null;

    @JsonProperty("rejoin_nodes_automatically")
    @JsonInclude(Include.NON_NULL)
    private Boolean rejoinNodesAutomatically = true;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("virtual_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr virtualIp = null;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum of 1 items required.
   * Maximum of 7 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodes
   */
  @VsoMethod
  public List<ClusterNode> getNodes() {
    return nodes;
  }

  /**
   * This is the setter method. this will set the nodes
   * Minimum of 1 items required.
   * Maximum of 7 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodes
   */
  @VsoMethod
  public void setNodes(List<ClusterNode>  nodes) {
    this.nodes = nodes;
  }

  /**
   * This is the setter method this will set the nodes
   * Minimum of 1 items required.
   * Maximum of 7 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodes
   */
  @VsoMethod
  public Cluster addNodesItem(ClusterNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<ClusterNode>();
    }
    this.nodes.add(nodesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Re-join cluster nodes automatically in the event one of the node is reset to factory.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return rejoinNodesAutomatically
   */
  @VsoMethod
  public Boolean getRejoinNodesAutomatically() {
    return rejoinNodesAutomatically;
  }

  /**
   * This is the setter method to the attribute.
   * Re-join cluster nodes automatically in the event one of the node is reset to factory.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param rejoinNodesAutomatically set the rejoinNodesAutomatically.
   */
  @VsoMethod
  public void setRejoinNodesAutomatically(Boolean  rejoinNodesAutomatically) {
    this.rejoinNodesAutomatically = rejoinNodesAutomatically;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A virtual ip address.
   * This ip address will be dynamically reconfigured so that it always is the ip of the cluster leader.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return virtualIp
   */
  @VsoMethod
  public IpAddr getVirtualIp() {
    return virtualIp;
  }

  /**
   * This is the setter method to the attribute.
   * A virtual ip address.
   * This ip address will be dynamically reconfigured so that it always is the ip of the cluster leader.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param virtualIp set the virtualIp.
   */
  @VsoMethod
  public void setVirtualIp(IpAddr virtualIp) {
    this.virtualIp = virtualIp;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Cluster objCluster = (Cluster) o;
  return   Objects.equals(this.uuid, objCluster.uuid)&&
  Objects.equals(this.name, objCluster.name)&&
  Objects.equals(this.virtualIp, objCluster.virtualIp)&&
  Objects.equals(this.nodes, objCluster.nodes)&&
  Objects.equals(this.rejoinNodesAutomatically, objCluster.rejoinNodesAutomatically)&&
  Objects.equals(this.tenantRef, objCluster.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Cluster {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    rejoinNodesAutomatically: ").append(toIndentedString(rejoinNodesAutomatically)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    virtualIp: ").append(toIndentedString(virtualIp)).append("\n");
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

