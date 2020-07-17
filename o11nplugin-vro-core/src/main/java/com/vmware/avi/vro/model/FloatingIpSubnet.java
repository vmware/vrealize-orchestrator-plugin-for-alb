package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The FloatingIpSubnet is a POJO class extends AviRestResource that used for creating
 * FloatingIpSubnet.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FloatingIpSubnet")
@VsoFinder(name = Constants.FINDER_VRO_FLOATINGIPSUBNET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FloatingIpSubnet extends AviRestResource {
  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("prefix")
  @JsonInclude(Include.NON_NULL)
  private IpAddrPrefix prefix = null;

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Floatingip subnet name if available, else uuid.
   * Field introduced in 17.2.1.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Floatingip subnet name if available, else uuid.
   * Field introduced in 17.2.1.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Floatingip subnet prefix.
   * Field introduced in 17.2.1.
   * @return prefix
   */
  @VsoMethod
  public IpAddrPrefix getPrefix() {
    return prefix;
  }

  /**
   * This is the setter method to the attribute.
   * Floatingip subnet prefix.
   * Field introduced in 17.2.1.
   * @param prefix set the prefix.
   */
  @VsoMethod
  public void setPrefix(IpAddrPrefix prefix) {
    this.prefix = prefix;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Floatingip subnet uuid.
   * Field introduced in 17.2.1.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Floatingip subnet uuid.
   * Field introduced in 17.2.1.
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
  FloatingIpSubnet objFloatingIpSubnet = (FloatingIpSubnet) o;
  return   Objects.equals(this.prefix, objFloatingIpSubnet.prefix)&&
  Objects.equals(this.name, objFloatingIpSubnet.name)&&
  Objects.equals(this.uuid, objFloatingIpSubnet.uuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class FloatingIpSubnet {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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

