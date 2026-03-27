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
 * The IpAddrGroupSyncParams is a POJO class extends AviRestResource that used for creating
 * IpAddrGroupSyncParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IpAddrGroupSyncParams")
@VsoFinder(name = Constants.FINDER_VRO_IPADDRGROUPSYNCPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IpAddrGroupSyncParams extends AviRestResource {
    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the ipaddrgroup to sync nsx group ips for.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the ipaddrgroup to sync nsx group ips for.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the ipaddrgroup to sync nsx group ips for.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the ipaddrgroup to sync nsx group ips for.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
  IpAddrGroupSyncParams objIpAddrGroupSyncParams = (IpAddrGroupSyncParams) o;
  return   Objects.equals(this.uuid, objIpAddrGroupSyncParams.uuid)&&
  Objects.equals(this.name, objIpAddrGroupSyncParams.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IpAddrGroupSyncParams {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

