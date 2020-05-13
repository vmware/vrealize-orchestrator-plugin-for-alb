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
 * HypervisorProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HypervisorProperties")
@VsoFinder(name = Constants.FINDER_VRO_HYPERVISORPROPERTIES, idAccessor = "getObjectID()")
@Service
public class HypervisorProperties extends AviRestResource  {
  @JsonProperty("htype")
  private String htype = null;

  @JsonProperty("max_ips_per_nic")
  private Integer maxIpsPerNic = null;

  @JsonProperty("max_nics")
  private Integer maxNics = null;

  
  /**
   *  Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * @return htype
  **/
  @ApiModelProperty(required = true, value = " Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.")
  @NotNull


 
  @VsoMethod  
  public String getHtype() {
    return htype;
  }
    
  @VsoMethod
  public void setHtype(String htype) {
    this.htype = htype;
  }

  
  /**
   * Number of max_ips_per_nic.
   * @return maxIpsPerNic
  **/
  @ApiModelProperty(value = "Number of max_ips_per_nic.")


 
  @VsoMethod  
  public Integer getMaxIpsPerNic() {
    return maxIpsPerNic;
  }
    
  @VsoMethod
  public void setMaxIpsPerNic(Integer maxIpsPerNic) {
    this.maxIpsPerNic = maxIpsPerNic;
  }

  
  /**
   * Number of max_nics.
   * @return maxNics
  **/
  @ApiModelProperty(value = "Number of max_nics.")


 
  @VsoMethod  
  public Integer getMaxNics() {
    return maxNics;
  }
    
  @VsoMethod
  public void setMaxNics(Integer maxNics) {
    this.maxNics = maxNics;
  }

  
  public String getObjectID() {
		return "HypervisorProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HypervisorProperties hypervisorProperties = (HypervisorProperties) o;
    return Objects.equals(this.htype, hypervisorProperties.htype) &&
        Objects.equals(this.maxIpsPerNic, hypervisorProperties.maxIpsPerNic) &&
        Objects.equals(this.maxNics, hypervisorProperties.maxNics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htype, maxIpsPerNic, maxNics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HypervisorProperties {\n");
    
    sb.append("    htype: ").append(toIndentedString(htype)).append("\n");
    sb.append("    maxIpsPerNic: ").append(toIndentedString(maxIpsPerNic)).append("\n");
    sb.append("    maxNics: ").append(toIndentedString(maxNics)).append("\n");
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

