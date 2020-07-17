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
 * The GslbServiceSitePersistencePool is a POJO class extends AviRestResource that used for creating
 * GslbServiceSitePersistencePool.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbServiceSitePersistencePool")
@VsoFinder(name = Constants.FINDER_VRO_GSLBSERVICESITEPERSISTENCEPOOL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbServiceSitePersistencePool extends AviRestResource {
  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("num_servers")
  @JsonInclude(Include.NON_NULL)
  private Integer numServers = null;

  @JsonProperty("num_servers_up")
  @JsonInclude(Include.NON_NULL)
  private Integer numServersUp = null;

  @JsonProperty("servers")
  @JsonInclude(Include.NON_NULL)
  private List<ServerConfig> servers = null;

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Site persistence pool's name.
   * Field introduced in 17.2.2.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Site persistence pool's name.
   * Field introduced in 17.2.2.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of servers configured in the pool.
   * Field introduced in 17.2.2.
   * @return numServers
   */
  @VsoMethod
  public Integer getNumServers() {
    return numServers;
  }

  /**
   * This is the setter method to the attribute.
   * Number of servers configured in the pool.
   * Field introduced in 17.2.2.
   * @param numServers set the numServers.
   */
  @VsoMethod
  public void setNumServers(Integer  numServers) {
    this.numServers = numServers;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of servers operationally up in the pool.
   * Field introduced in 17.2.2.
   * @return numServersUp
   */
  @VsoMethod
  public Integer getNumServersUp() {
    return numServersUp;
  }

  /**
   * This is the setter method to the attribute.
   * Number of servers operationally up in the pool.
   * Field introduced in 17.2.2.
   * @param numServersUp set the numServersUp.
   */
  @VsoMethod
  public void setNumServersUp(Integer  numServersUp) {
    this.numServersUp = numServersUp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Detailed information of the servers in the pool.
   * Field introduced in 17.2.8.
   * @return servers
   */
  @VsoMethod
  public List<ServerConfig> getServers() {
    return servers;
  }

  /**
   * This is the setter method. this will set the servers
   * Detailed information of the servers in the pool.
   * Field introduced in 17.2.8.
   * @return servers
   */
  @VsoMethod
  public void setServers(List<ServerConfig>  servers) {
    this.servers = servers;
  }

  /**
   * This is the setter method this will set the servers
   * Detailed information of the servers in the pool.
   * Field introduced in 17.2.8.
   * @return servers
   */
  @VsoMethod
  public GslbServiceSitePersistencePool addServersItem(ServerConfig serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<ServerConfig>();
    }
    this.servers.add(serversItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Site persistence pool's uuid.
   * Field introduced in 17.2.2.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Site persistence pool's uuid.
   * Field introduced in 17.2.2.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbServiceSitePersistencePool objGslbServiceSitePersistencePool = (GslbServiceSitePersistencePool) o;
  return   Objects.equals(this.numServersUp, objGslbServiceSitePersistencePool.numServersUp)&&
  Objects.equals(this.numServers, objGslbServiceSitePersistencePool.numServers)&&
  Objects.equals(this.servers, objGslbServiceSitePersistencePool.servers)&&
  Objects.equals(this.uuid, objGslbServiceSitePersistencePool.uuid)&&
  Objects.equals(this.name, objGslbServiceSitePersistencePool.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbServiceSitePersistencePool {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    numServers: ").append(toIndentedString(numServers)).append("\n");
        sb.append("    numServersUp: ").append(toIndentedString(numServersUp)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

