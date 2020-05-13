package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ClusterNode;
import com.vmware.avi.vro.model.IpAddr;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * Cluster
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "Cluster")
@VsoFinder(name = Constants.FINDER_VRO_CLUSTER, idAccessor = "getObjectID()")
@Service
public class Cluster extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nodes")
  @Valid
  private List<ClusterNode> nodes = null;

  @JsonProperty("rejoin_nodes_automatically")
  private Boolean rejoinNodesAutomatically = true;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("virtual_ip")
  private IpAddr virtualIp = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public Cluster addNodesItem(ClusterNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<ClusterNode>();
    }
    this.nodes.add(nodesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property nodes of obj type Cluster field type str  type object
   * @return nodes
  **/
  @ApiModelProperty(value = "Placeholder for description of property nodes of obj type Cluster field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<ClusterNode> getNodes() {
    return nodes;
  }
    
  @VsoMethod
  public void setNodes(List<ClusterNode> nodes) {
    this.nodes = nodes;
  }

  
  /**
   * Re-join cluster nodes automatically in the event one of the node is reset to factory.
   * @return rejoinNodesAutomatically
  **/
  @ApiModelProperty(value = "Re-join cluster nodes automatically in the event one of the node is reset to factory.")


 
  @VsoMethod  
  public Boolean isRejoinNodesAutomatically() {
    return rejoinNodesAutomatically;
  }
    
  @VsoMethod
  public void setRejoinNodesAutomatically(Boolean rejoinNodesAutomatically) {
    this.rejoinNodesAutomatically = rejoinNodesAutomatically;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * A virtual IP address. This IP address will be dynamically reconfigured so that it always is the IP of the cluster leader.
   * @return virtualIp
  **/
  @ApiModelProperty(value = "A virtual IP address. This IP address will be dynamically reconfigured so that it always is the IP of the cluster leader.")

  @Valid

 
  @VsoMethod  
  public IpAddr getVirtualIp() {
    return virtualIp;
  }
    
  @VsoMethod
  public void setVirtualIp(IpAddr virtualIp) {
    this.virtualIp = virtualIp;
  }

  
  public String getObjectID() {
		return "Cluster";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cluster cluster = (Cluster) o;
    return Objects.equals(this.lastModified, cluster.lastModified) &&
        Objects.equals(this.name, cluster.name) &&
        Objects.equals(this.nodes, cluster.nodes) &&
        Objects.equals(this.rejoinNodesAutomatically, cluster.rejoinNodesAutomatically) &&
        Objects.equals(this.tenantRef, cluster.tenantRef) &&
        Objects.equals(this.url, cluster.url) &&
        Objects.equals(this.uuid, cluster.uuid) &&
        Objects.equals(this.virtualIp, cluster.virtualIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, name, nodes, rejoinNodesAutomatically, tenantRef, url, uuid, virtualIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cluster {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    rejoinNodesAutomatically: ").append(toIndentedString(rejoinNodesAutomatically)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

