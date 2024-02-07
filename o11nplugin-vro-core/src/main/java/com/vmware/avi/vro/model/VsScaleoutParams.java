package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VsScaleoutParams is a POJO class extends AviRestResource that used for creating
 * VsScaleoutParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VsScaleoutParams")
@VsoFinder(name = Constants.FINDER_VRO_VSSCALEOUTPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VsScaleoutParams extends AviRestResource {
    @JsonIgnore
    private Boolean adminUp = false;

    @JsonProperty("new_vcpus")
    @JsonInclude(Include.NON_NULL)
    private Integer newVcpus;

    @JsonProperty("to_host_ref")
    @JsonInclude(Include.NON_NULL)
    private String toHostRef;

    @JsonProperty("to_new_se")
    @JsonInclude(Include.NON_NULL)
    private Boolean toNewSe = false;

    @JsonProperty("to_se_ref")
    @JsonInclude(Include.NON_NULL)
    private String toSeRef;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("vip_id")
    @JsonInclude(Include.NON_NULL)
    private String vipId;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return adminUp
   */
  @VsoMethod
  public Boolean getAdminUp() {
    return adminUp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param adminUp set the adminUp.
   */
  @VsoMethod
  public void setAdminUp(Boolean  adminUp) {
    this.adminUp = adminUp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newVcpus
   */
  @VsoMethod
  public Integer getNewVcpus() {
    return newVcpus;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param newVcpus set the newVcpus.
   */
  @VsoMethod
  public void setNewVcpus(Integer  newVcpus) {
    this.newVcpus = newVcpus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type vimgrhostruntime.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return toHostRef
   */
  @VsoMethod
  public String getToHostRef() {
    return toHostRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type vimgrhostruntime.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param toHostRef set the toHostRef.
   */
  @VsoMethod
  public void setToHostRef(String  toHostRef) {
    this.toHostRef = toHostRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return toNewSe
   */
  @VsoMethod
  public Boolean getToNewSe() {
    return toNewSe;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param toNewSe set the toNewSe.
   */
  @VsoMethod
  public void setToNewSe(Boolean  toNewSe) {
    this.toNewSe = toNewSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return toSeRef
   */
  @VsoMethod
  public String getToSeRef() {
    return toSeRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param toSeRef set the toSeRef.
   */
  @VsoMethod
  public void setToSeRef(String  toSeRef) {
    this.toSeRef = toSeRef;
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

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipId
   */
  @VsoMethod
  public String getVipId() {
    return vipId;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipId set the vipId.
   */
  @VsoMethod
  public void setVipId(String  vipId) {
    this.vipId = vipId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VsScaleoutParams objVsScaleoutParams = (VsScaleoutParams) o;
  return   Objects.equals(this.uuid, objVsScaleoutParams.uuid)&&
  Objects.equals(this.toSeRef, objVsScaleoutParams.toSeRef)&&
  Objects.equals(this.toNewSe, objVsScaleoutParams.toNewSe)&&
  Objects.equals(this.toHostRef, objVsScaleoutParams.toHostRef)&&
  Objects.equals(this.adminUp, objVsScaleoutParams.adminUp)&&
  Objects.equals(this.newVcpus, objVsScaleoutParams.newVcpus)&&
  Objects.equals(this.vipId, objVsScaleoutParams.vipId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VsScaleoutParams {\n");
      sb.append("    adminUp: ").append(toIndentedString(adminUp)).append("\n");
        sb.append("    newVcpus: ").append(toIndentedString(newVcpus)).append("\n");
        sb.append("    toHostRef: ").append(toIndentedString(toHostRef)).append("\n");
        sb.append("    toNewSe: ").append(toIndentedString(toNewSe)).append("\n");
        sb.append("    toSeRef: ").append(toIndentedString(toSeRef)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
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

