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
 * The CloudSyncServices is a POJO class extends AviRestResource that used for creating
 * CloudSyncServices.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudSyncServices")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDSYNCSERVICES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudSyncServices extends AviRestResource {
  @JsonProperty("cc_id")
  @JsonInclude(Include.NON_NULL)
  private String ccId = null;

  @JsonProperty("error_string")
  @JsonInclude(Include.NON_NULL)
  private String errorString = null;

  @JsonProperty("se_vm_uuid")
  @JsonInclude(Include.NON_NULL)
  private String seVmUuid = null;

  @JsonProperty("vips")
  @JsonInclude(Include.NON_NULL)
  private List<IpAddr> vips = null;

  @JsonProperty("vtype")
  @JsonInclude(Include.NON_NULL)
  private String vtype = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cc_id of obj type cloudsyncservices field type str  type string.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cc_id of obj type cloudsyncservices field type str  type string.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property error_string of obj type cloudsyncservices field type str  type string.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property error_string of obj type cloudsyncservices field type str  type string.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
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

  /**
   * This is the getter method this will return the attribute value.
   * List of vips.
   * Field introduced in 18.2.2.
   * @return vips
   */
  @VsoMethod
  public List<IpAddr> getVips() {
    return vips;
  }

  /**
   * This is the setter method. this will set the vips
   * List of vips.
   * Field introduced in 18.2.2.
   * @return vips
   */
  @VsoMethod
  public void setVips(List<IpAddr>  vips) {
    this.vips = vips;
  }

  /**
   * This is the setter method this will set the vips
   * List of vips.
   * Field introduced in 18.2.2.
   * @return vips
   */
  @VsoMethod
  public CloudSyncServices addVipsItem(IpAddr vipsItem) {
    if (this.vips == null) {
      this.vips = new ArrayList<IpAddr>();
    }
    this.vips.add(vipsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * @return vtype
   */
  @VsoMethod
  public String getVtype() {
    return vtype;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * @param vtype set the vtype.
   */
  @VsoMethod
  public void setVtype(String  vtype) {
    this.vtype = vtype;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CloudSyncServices objCloudSyncServices = (CloudSyncServices) o;
  return   Objects.equals(this.vips, objCloudSyncServices.vips)&&
  Objects.equals(this.vtype, objCloudSyncServices.vtype)&&
  Objects.equals(this.seVmUuid, objCloudSyncServices.seVmUuid)&&
  Objects.equals(this.errorString, objCloudSyncServices.errorString)&&
  Objects.equals(this.ccId, objCloudSyncServices.ccId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CloudSyncServices {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    seVmUuid: ").append(toIndentedString(seVmUuid)).append("\n");
        sb.append("    vips: ").append(toIndentedString(vips)).append("\n");
        sb.append("    vtype: ").append(toIndentedString(vtype)).append("\n");
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

