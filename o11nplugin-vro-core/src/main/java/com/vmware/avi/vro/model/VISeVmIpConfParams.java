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
 * VISeVmIpConfParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VISeVmIpConfParams")
@VsoFinder(name = Constants.FINDER_VRO_VISEVMIPCONFPARAMS, idAccessor = "getObjectID()")
@Service
public class VISeVmIpConfParams extends AviRestResource  {
  @JsonProperty("default_gw")
  private String defaultGw = null;

  @JsonProperty("mgmt_ip_addr")
  private String mgmtIpAddr = null;

  @JsonProperty("mgmt_ip_type")
  private String mgmtIpType = null;

  @JsonProperty("mgmt_net_mask")
  private String mgmtNetMask = null;

  
  /**
   * default_gw of VISeVmIpConfParams.
   * @return defaultGw
  **/
  @ApiModelProperty(value = "default_gw of VISeVmIpConfParams.")


 
  @VsoMethod  
  public String getDefaultGw() {
    return defaultGw;
  }
    
  @VsoMethod
  public void setDefaultGw(String defaultGw) {
    this.defaultGw = defaultGw;
  }

  
  /**
   * mgmt_ip_addr of VISeVmIpConfParams.
   * @return mgmtIpAddr
  **/
  @ApiModelProperty(value = "mgmt_ip_addr of VISeVmIpConfParams.")


 
  @VsoMethod  
  public String getMgmtIpAddr() {
    return mgmtIpAddr;
  }
    
  @VsoMethod
  public void setMgmtIpAddr(String mgmtIpAddr) {
    this.mgmtIpAddr = mgmtIpAddr;
  }

  
  /**
   *  Enum options - VNIC_IP_TYPE_DHCP, VNIC_IP_TYPE_STATIC.
   * @return mgmtIpType
  **/
  @ApiModelProperty(required = true, value = " Enum options - VNIC_IP_TYPE_DHCP, VNIC_IP_TYPE_STATIC.")
  @NotNull


 
  @VsoMethod  
  public String getMgmtIpType() {
    return mgmtIpType;
  }
    
  @VsoMethod
  public void setMgmtIpType(String mgmtIpType) {
    this.mgmtIpType = mgmtIpType;
  }

  
  /**
   * mgmt_net_mask of VISeVmIpConfParams.
   * @return mgmtNetMask
  **/
  @ApiModelProperty(value = "mgmt_net_mask of VISeVmIpConfParams.")


 
  @VsoMethod  
  public String getMgmtNetMask() {
    return mgmtNetMask;
  }
    
  @VsoMethod
  public void setMgmtNetMask(String mgmtNetMask) {
    this.mgmtNetMask = mgmtNetMask;
  }

  
  public String getObjectID() {
		return "VISeVmIpConfParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VISeVmIpConfParams viSeVmIpConfParams = (VISeVmIpConfParams) o;
    return Objects.equals(this.defaultGw, viSeVmIpConfParams.defaultGw) &&
        Objects.equals(this.mgmtIpAddr, viSeVmIpConfParams.mgmtIpAddr) &&
        Objects.equals(this.mgmtIpType, viSeVmIpConfParams.mgmtIpType) &&
        Objects.equals(this.mgmtNetMask, viSeVmIpConfParams.mgmtNetMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultGw, mgmtIpAddr, mgmtIpType, mgmtNetMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VISeVmIpConfParams {\n");
    
    sb.append("    defaultGw: ").append(toIndentedString(defaultGw)).append("\n");
    sb.append("    mgmtIpAddr: ").append(toIndentedString(mgmtIpAddr)).append("\n");
    sb.append("    mgmtIpType: ").append(toIndentedString(mgmtIpType)).append("\n");
    sb.append("    mgmtNetMask: ").append(toIndentedString(mgmtNetMask)).append("\n");
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

