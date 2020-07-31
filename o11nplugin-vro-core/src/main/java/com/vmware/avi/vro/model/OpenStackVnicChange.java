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
 * The OpenStackVnicChange is a POJO class extends AviRestResource that used for creating
 * OpenStackVnicChange.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OpenStackVnicChange")
@VsoFinder(name = Constants.FINDER_VRO_OPENSTACKVNICCHANGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OpenStackVnicChange extends AviRestResource {
  @JsonProperty("error_string")
  @JsonInclude(Include.NON_NULL)
  private String errorString = null;

  @JsonProperty("mac_addrs")
  @JsonInclude(Include.NON_NULL)
  private List<String> macAddrs = null;

  @JsonProperty("networks")
  @JsonInclude(Include.NON_NULL)
  private List<String> networks = null;

  @JsonProperty("se_vm_uuid")
  @JsonInclude(Include.NON_NULL)
  private String seVmUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property error_string of obj type openstackvnicchange field type str  type string.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property error_string of obj type openstackvnicchange field type str  type string.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property mac_addrs of obj type openstackvnicchange field type str  type array.
   * @return macAddrs
   */
  @VsoMethod
  public List<String> getMacAddrs() {
    return macAddrs;
  }

  /**
   * This is the setter method. this will set the macAddrs
   * Placeholder for description of property mac_addrs of obj type openstackvnicchange field type str  type array.
   * @return macAddrs
   */
  @VsoMethod
  public void setMacAddrs(List<String>  macAddrs) {
    this.macAddrs = macAddrs;
  }

  /**
   * This is the setter method this will set the macAddrs
   * Placeholder for description of property mac_addrs of obj type openstackvnicchange field type str  type array.
   * @return macAddrs
   */
  @VsoMethod
  public OpenStackVnicChange addMacAddrsItem(String macAddrsItem) {
    if (this.macAddrs == null) {
      this.macAddrs = new ArrayList<String>();
    }
    this.macAddrs.add(macAddrsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property networks of obj type openstackvnicchange field type str  type array.
   * @return networks
   */
  @VsoMethod
  public List<String> getNetworks() {
    return networks;
  }

  /**
   * This is the setter method. this will set the networks
   * Placeholder for description of property networks of obj type openstackvnicchange field type str  type array.
   * @return networks
   */
  @VsoMethod
  public void setNetworks(List<String>  networks) {
    this.networks = networks;
  }

  /**
   * This is the setter method this will set the networks
   * Placeholder for description of property networks of obj type openstackvnicchange field type str  type array.
   * @return networks
   */
  @VsoMethod
  public OpenStackVnicChange addNetworksItem(String networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<String>();
    }
    this.networks.add(networksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se_vm.
   * @return seVmUuid
   */
  @VsoMethod
  public String getSeVmUuid() {
    return seVmUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se_vm.
   * @param seVmUuid set the seVmUuid.
   */
  @VsoMethod
  public void setSeVmUuid(String  seVmUuid) {
    this.seVmUuid = seVmUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OpenStackVnicChange objOpenStackVnicChange = (OpenStackVnicChange) o;
  return   Objects.equals(this.seVmUuid, objOpenStackVnicChange.seVmUuid)&&
  Objects.equals(this.networks, objOpenStackVnicChange.networks)&&
  Objects.equals(this.macAddrs, objOpenStackVnicChange.macAddrs)&&
  Objects.equals(this.errorString, objOpenStackVnicChange.errorString);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OpenStackVnicChange {\n");
      sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    macAddrs: ").append(toIndentedString(macAddrs)).append("\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    seVmUuid: ").append(toIndentedString(seVmUuid)).append("\n");
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

