package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * AzureNetworkInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AzureNetworkInfo")
@VsoFinder(name = Constants.FINDER_VRO_AZURENETWORKINFO, idAccessor = "getObjectID()")
@Service
public class AzureNetworkInfo extends AviRestResource  {
  @JsonProperty("management_network_id")
  private String managementNetworkId = null;

  @JsonProperty("se_network_id")
  private String seNetworkId = null;

  @JsonProperty("virtual_network_id")
  private String virtualNetworkId = null;

  
  /**
   * Id of the Azure subnet used as management network for the Service Engines. If set, Service Engines will have a dedicated management NIC, otherwise, they operate in inband mode. Field introduced in 18.2.3.
   * @return managementNetworkId
  **/
  @ApiModelProperty(value = "Id of the Azure subnet used as management network for the Service Engines. If set, Service Engines will have a dedicated management NIC, otherwise, they operate in inband mode. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getManagementNetworkId() {
    return managementNetworkId;
  }
    
  @VsoMethod
  public void setManagementNetworkId(String managementNetworkId) {
    this.managementNetworkId = managementNetworkId;
  }

  
  /**
   * Id of the Azure subnet where Avi Controller will create the Service Engines. . Field introduced in 17.2.1.
   * @return seNetworkId
  **/
  @ApiModelProperty(value = "Id of the Azure subnet where Avi Controller will create the Service Engines. . Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getSeNetworkId() {
    return seNetworkId;
  }
    
  @VsoMethod
  public void setSeNetworkId(String seNetworkId) {
    this.seNetworkId = seNetworkId;
  }

  
  /**
   * Virtual network where Virtual IPs will belong. Field introduced in 17.2.1.
   * @return virtualNetworkId
  **/
  @ApiModelProperty(value = "Virtual network where Virtual IPs will belong. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getVirtualNetworkId() {
    return virtualNetworkId;
  }
    
  @VsoMethod
  public void setVirtualNetworkId(String virtualNetworkId) {
    this.virtualNetworkId = virtualNetworkId;
  }

  
  public String getObjectID() {
		return "AzureNetworkInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureNetworkInfo azureNetworkInfo = (AzureNetworkInfo) o;
    return Objects.equals(this.managementNetworkId, azureNetworkInfo.managementNetworkId) &&
        Objects.equals(this.seNetworkId, azureNetworkInfo.seNetworkId) &&
        Objects.equals(this.virtualNetworkId, azureNetworkInfo.virtualNetworkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementNetworkId, seNetworkId, virtualNetworkId);
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

