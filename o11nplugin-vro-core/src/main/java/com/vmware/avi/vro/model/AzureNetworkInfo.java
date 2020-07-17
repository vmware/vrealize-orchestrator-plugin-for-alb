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
 * The AzureNetworkInfo is a POJO class extends AviRestResource that used for creating
 * AzureNetworkInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AzureNetworkInfo")
@VsoFinder(name = Constants.FINDER_VRO_AZURENETWORKINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AzureNetworkInfo extends AviRestResource {
  @JsonProperty("management_network_id")
  @JsonInclude(Include.NON_NULL)
  private String managementNetworkId = null;

  @JsonProperty("se_network_id")
  @JsonInclude(Include.NON_NULL)
  private String seNetworkId = null;

  @JsonProperty("virtual_network_id")
  @JsonInclude(Include.NON_NULL)
  private String virtualNetworkId = null;



  /**
   * This is the getter method this will return the attribute value.
   * Id of the azure subnet used as management network for the service engines.
   * If set, service engines will have a dedicated management nic, otherwise, they operate in inband mode.
   * Field introduced in 18.2.3.
   * @return managementNetworkId
   */
  @VsoMethod
  public String getManagementNetworkId() {
    return managementNetworkId;
  }

  /**
   * This is the setter method to the attribute.
   * Id of the azure subnet used as management network for the service engines.
   * If set, service engines will have a dedicated management nic, otherwise, they operate in inband mode.
   * Field introduced in 18.2.3.
   * @param managementNetworkId set the managementNetworkId.
   */
  @VsoMethod
  public void setManagementNetworkId(String  managementNetworkId) {
    this.managementNetworkId = managementNetworkId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Id of the azure subnet where avi controller will create the service engines.
   * Field introduced in 17.2.1.
   * @return seNetworkId
   */
  @VsoMethod
  public String getSeNetworkId() {
    return seNetworkId;
  }

  /**
   * This is the setter method to the attribute.
   * Id of the azure subnet where avi controller will create the service engines.
   * Field introduced in 17.2.1.
   * @param seNetworkId set the seNetworkId.
   */
  @VsoMethod
  public void setSeNetworkId(String  seNetworkId) {
    this.seNetworkId = seNetworkId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtual network where virtual ips will belong.
   * Field introduced in 17.2.1.
   * @return virtualNetworkId
   */
  @VsoMethod
  public String getVirtualNetworkId() {
    return virtualNetworkId;
  }

  /**
   * This is the setter method to the attribute.
   * Virtual network where virtual ips will belong.
   * Field introduced in 17.2.1.
   * @param virtualNetworkId set the virtualNetworkId.
   */
  @VsoMethod
  public void setVirtualNetworkId(String  virtualNetworkId) {
    this.virtualNetworkId = virtualNetworkId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AzureNetworkInfo objAzureNetworkInfo = (AzureNetworkInfo) o;
  return   Objects.equals(this.seNetworkId, objAzureNetworkInfo.seNetworkId)&&
  Objects.equals(this.managementNetworkId, objAzureNetworkInfo.managementNetworkId)&&
  Objects.equals(this.virtualNetworkId, objAzureNetworkInfo.virtualNetworkId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AzureNetworkInfo {\n");
      sb.append("    managementNetworkId: ").append(toIndentedString(managementNetworkId)).append("\n");
        sb.append("    seNetworkId: ").append(toIndentedString(seNetworkId)).append("\n");
        sb.append("    virtualNetworkId: ").append(toIndentedString(virtualNetworkId)).append("\n");
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

