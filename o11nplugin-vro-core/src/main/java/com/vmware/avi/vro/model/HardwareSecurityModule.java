package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HSMAwsCloudHsm;
import com.vmware.avi.vro.model.HSMSafenetLuna;
import com.vmware.avi.vro.model.HSMThalesNetHsm;
import com.vmware.avi.vro.model.HSMThalesRFS;
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
 * HardwareSecurityModule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HardwareSecurityModule")
@VsoFinder(name = Constants.FINDER_VRO_HARDWARESECURITYMODULE, idAccessor = "getObjectID()")
@Service
public class HardwareSecurityModule extends AviRestResource  {
  @JsonProperty("cloudhsm")
  private HSMAwsCloudHsm cloudhsm = null;

  @JsonProperty("nethsm")
  @Valid
  private List<HSMThalesNetHsm> nethsm = null;

  @JsonProperty("rfs")
  private HSMThalesRFS rfs = null;

  @JsonProperty("sluna")
  private HSMSafenetLuna sluna = null;

  @JsonProperty("type")
  private String type = null;

  
  /**
   * AWS CloudHSM specific configuration. Field introduced in 17.2.7.
   * @return cloudhsm
  **/
  @ApiModelProperty(value = "AWS CloudHSM specific configuration. Field introduced in 17.2.7.")

  @Valid

 
  @VsoMethod  
  public HSMAwsCloudHsm getCloudhsm() {
    return cloudhsm;
  }
    
  @VsoMethod
  public void setCloudhsm(HSMAwsCloudHsm cloudhsm) {
    this.cloudhsm = cloudhsm;
  }

  
  public HardwareSecurityModule addNethsmItem(HSMThalesNetHsm nethsmItem) {
    if (this.nethsm == null) {
      this.nethsm = new ArrayList<HSMThalesNetHsm>();
    }
    this.nethsm.add(nethsmItem);
    return this;
  }
  
  /**
   * Thales netHSM specific configuration.
   * @return nethsm
  **/
  @ApiModelProperty(value = "Thales netHSM specific configuration.")

  @Valid

 
  @VsoMethod  
  public List<HSMThalesNetHsm> getNethsm() {
    return nethsm;
  }
    
  @VsoMethod
  public void setNethsm(List<HSMThalesNetHsm> nethsm) {
    this.nethsm = nethsm;
  }

  
  /**
   * Thales Remote File Server (RFS), used for the netHSMs, configuration.
   * @return rfs
  **/
  @ApiModelProperty(value = "Thales Remote File Server (RFS), used for the netHSMs, configuration.")

  @Valid

 
  @VsoMethod  
  public HSMThalesRFS getRfs() {
    return rfs;
  }
    
  @VsoMethod
  public void setRfs(HSMThalesRFS rfs) {
    this.rfs = rfs;
  }

  
  /**
   * Safenet/Gemalto Luna/Gem specific configuration.
   * @return sluna
  **/
  @ApiModelProperty(value = "Safenet/Gemalto Luna/Gem specific configuration.")

  @Valid

 
  @VsoMethod  
  public HSMSafenetLuna getSluna() {
    return sluna;
  }
    
  @VsoMethod
  public void setSluna(HSMSafenetLuna sluna) {
    this.sluna = sluna;
  }

  
  /**
   * HSM type to use. Enum options - HSM_TYPE_THALES_NETHSM, HSM_TYPE_SAFENET_LUNA, HSM_TYPE_AWS_CLOUDHSM.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "HSM type to use. Enum options - HSM_TYPE_THALES_NETHSM, HSM_TYPE_SAFENET_LUNA, HSM_TYPE_AWS_CLOUDHSM.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "HardwareSecurityModule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HardwareSecurityModule hardwareSecurityModule = (HardwareSecurityModule) o;
    return Objects.equals(this.cloudhsm, hardwareSecurityModule.cloudhsm) &&
        Objects.equals(this.nethsm, hardwareSecurityModule.nethsm) &&
        Objects.equals(this.rfs, hardwareSecurityModule.rfs) &&
        Objects.equals(this.sluna, hardwareSecurityModule.sluna) &&
        Objects.equals(this.type, hardwareSecurityModule.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudhsm, nethsm, rfs, sluna, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HardwareSecurityModule {\n");
    
    sb.append("    cloudhsm: ").append(toIndentedString(cloudhsm)).append("\n");
    sb.append("    nethsm: ").append(toIndentedString(nethsm)).append("\n");
    sb.append("    rfs: ").append(toIndentedString(rfs)).append("\n");
    sb.append("    sluna: ").append(toIndentedString(sluna)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

