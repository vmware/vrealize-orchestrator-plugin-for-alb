package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The CloudDnsUpdate is a POJO class extends AviRestResource that used for creating
 * CloudDnsUpdate.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudDnsUpdate")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDDNSUPDATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudDnsUpdate extends AviRestResource {
    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId = null;

    @JsonProperty("dns_fqdn")
    @JsonInclude(Include.NON_NULL)
    private String dnsFqdn = null;

    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString = null;

    @JsonProperty("fip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr fip = null;

    @JsonProperty("vip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr vip = null;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsUuid = null;

    @JsonProperty("vtype")
    @JsonInclude(Include.NON_NULL)
    private String vtype = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cc_id of obj type clouddnsupdate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cc_id of obj type clouddnsupdate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property dns_fqdn of obj type clouddnsupdate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsFqdn
   */
  @VsoMethod
  public String getDnsFqdn() {
    return dnsFqdn;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property dns_fqdn of obj type clouddnsupdate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dnsFqdn set the dnsFqdn.
   */
  @VsoMethod
  public void setDnsFqdn(String  dnsFqdn) {
    this.dnsFqdn = dnsFqdn;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property error_string of obj type clouddnsupdate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property error_string of obj type clouddnsupdate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property fip of obj type clouddnsupdate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fip
   */
  @VsoMethod
  public IpAddr getFip() {
    return fip;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property fip of obj type clouddnsupdate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fip set the fip.
   */
  @VsoMethod
  public void setFip(IpAddr fip) {
    this.fip = fip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vip of obj type clouddnsupdate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vip
   */
  @VsoMethod
  public IpAddr getVip() {
    return vip;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vip of obj type clouddnsupdate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vip set the vip.
   */
  @VsoMethod
  public void setVip(IpAddr vip) {
    this.vip = vip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of vs.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of vs.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  CloudDnsUpdate objCloudDnsUpdate = (CloudDnsUpdate) o;
  return   Objects.equals(this.ccId, objCloudDnsUpdate.ccId)&&
  Objects.equals(this.vtype, objCloudDnsUpdate.vtype)&&
  Objects.equals(this.vsUuid, objCloudDnsUpdate.vsUuid)&&
  Objects.equals(this.errorString, objCloudDnsUpdate.errorString)&&
  Objects.equals(this.dnsFqdn, objCloudDnsUpdate.dnsFqdn)&&
  Objects.equals(this.vip, objCloudDnsUpdate.vip)&&
  Objects.equals(this.fip, objCloudDnsUpdate.fip);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CloudDnsUpdate {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    dnsFqdn: ").append(toIndentedString(dnsFqdn)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    fip: ").append(toIndentedString(fip)).append("\n");
        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

