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
 * The ServerScaleInParams is a POJO class extends AviRestResource that used for creating
 * ServerScaleInParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServerScaleInParams")
@VsoFinder(name = Constants.FINDER_VRO_SERVERSCALEINPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServerScaleInParams extends AviRestResource {
    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason;

    @JsonProperty("servers")
    @JsonInclude(Include.NON_NULL)
    private List<ServerId> servers;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Reason for the manual scale-in.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for the manual scale-in.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of server ids that should be scaled in.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return servers
   */
  @VsoMethod
  public List<ServerId> getServers() {
    return servers;
  }

  /**
   * This is the setter method. this will set the servers
   * List of server ids that should be scaled in.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return servers
   */
  @VsoMethod
  public void setServers(List<ServerId>  servers) {
    this.servers = servers;
  }

  /**
   * This is the setter method this will set the servers
   * List of server ids that should be scaled in.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return servers
   */
  @VsoMethod
  public ServerScaleInParams addServersItem(ServerId serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<ServerId>();
    }
    this.servers.add(serversItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  ServerScaleInParams objServerScaleInParams = (ServerScaleInParams) o;
  return   Objects.equals(this.uuid, objServerScaleInParams.uuid)&&
  Objects.equals(this.reason, objServerScaleInParams.reason)&&
  Objects.equals(this.servers, objServerScaleInParams.servers);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServerScaleInParams {\n");
      sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

