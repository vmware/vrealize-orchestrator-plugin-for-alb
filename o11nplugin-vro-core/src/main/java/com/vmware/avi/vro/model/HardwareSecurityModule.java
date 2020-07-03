package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HSMAwsCloudHsm;
import com.vmware.avi.vro.model.HSMThalesRFS;
import com.vmware.avi.vro.model.HSMSafenetLuna;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HardwareSecurityModule is a POJO class extends AviRestResource that used for creating
 * HardwareSecurityModule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HardwareSecurityModule")
@VsoFinder(name = Constants.FINDER_VRO_HARDWARESECURITYMODULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HardwareSecurityModule extends AviRestResource {
  @JsonProperty("cloudhsm")
  @JsonInclude(Include.NON_NULL)
  private HSMAwsCloudHsm cloudhsm = null;

  @JsonProperty("nethsm")
  @JsonInclude(Include.NON_NULL)
  private List<HSMThalesNetHsm> nethsm = null;

  @JsonProperty("rfs")
  @JsonInclude(Include.NON_NULL)
  private HSMThalesRFS rfs = null;

  @JsonProperty("sluna")
  @JsonInclude(Include.NON_NULL)
  private HSMSafenetLuna sluna = null;

  @JsonProperty("type")
  @JsonInclude(Include.NON_NULL)
  private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Aws cloudhsm specific configuration.
   * Field introduced in 17.2.7.
   * @return cloudhsm
   */
  @VsoMethod
  public HSMAwsCloudHsm getCloudhsm() {
    return cloudhsm;
  }

  /**
   * This is the setter method to the attribute.
   * Aws cloudhsm specific configuration.
   * Field introduced in 17.2.7.
   * @param cloudhsm set the cloudhsm.
   */
  @VsoMethod
  public void setCloudhsm(HSMAwsCloudHsm cloudhsm) {
    this.cloudhsm = cloudhsm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Thales nethsm specific configuration.
   * @return nethsm
   */
  @VsoMethod
  public List<HSMThalesNetHsm> getNethsm() {
    return nethsm;
  }

  /**
   * This is the setter method. this will set the nethsm
   * Thales nethsm specific configuration.
   * @return nethsm
   */
  @VsoMethod
  public void setNethsm(List<HSMThalesNetHsm>  nethsm) {
    this.nethsm = nethsm;
  }

  /**
   * This is the setter method this will set the nethsm
   * Thales nethsm specific configuration.
   * @return nethsm
   */
  @VsoMethod
  public HardwareSecurityModule addNethsmItem(HSMThalesNetHsm nethsmItem) {
    if (this.nethsm == null) {
      this.nethsm = new ArrayList<HSMThalesNetHsm>();
    }
    this.nethsm.add(nethsmItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Thales remote file server (rfs), used for the nethsms, configuration.
   * @return rfs
   */
  @VsoMethod
  public HSMThalesRFS getRfs() {
    return rfs;
  }

  /**
   * This is the setter method to the attribute.
   * Thales remote file server (rfs), used for the nethsms, configuration.
   * @param rfs set the rfs.
   */
  @VsoMethod
  public void setRfs(HSMThalesRFS rfs) {
    this.rfs = rfs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Safenet/gemalto luna/gem specific configuration.
   * @return sluna
   */
  @VsoMethod
  public HSMSafenetLuna getSluna() {
    return sluna;
  }

  /**
   * This is the setter method to the attribute.
   * Safenet/gemalto luna/gem specific configuration.
   * @param sluna set the sluna.
   */
  @VsoMethod
  public void setSluna(HSMSafenetLuna sluna) {
    this.sluna = sluna;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Hsm type to use.
   * Enum options - HSM_TYPE_THALES_NETHSM, HSM_TYPE_SAFENET_LUNA, HSM_TYPE_AWS_CLOUDHSM.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Hsm type to use.
   * Enum options - HSM_TYPE_THALES_NETHSM, HSM_TYPE_SAFENET_LUNA, HSM_TYPE_AWS_CLOUDHSM.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HardwareSecurityModule objHardwareSecurityModule = (HardwareSecurityModule) o;
  return   Objects.equals(this.rfs, objHardwareSecurityModule.rfs)&&
  Objects.equals(this.sluna, objHardwareSecurityModule.sluna)&&
  Objects.equals(this.type, objHardwareSecurityModule.type)&&
  Objects.equals(this.nethsm, objHardwareSecurityModule.nethsm)&&
  Objects.equals(this.cloudhsm, objHardwareSecurityModule.cloudhsm);
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
