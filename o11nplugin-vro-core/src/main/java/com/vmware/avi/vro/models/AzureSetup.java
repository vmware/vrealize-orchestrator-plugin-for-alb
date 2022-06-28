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
 * The AzureSetup is a POJO class extends AviRestResource that used for creating
 * AzureSetup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AzureSetup")
@VsoFinder(name = Constants.FINDER_VRO_AZURESETUP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AzureSetup extends AviRestResource {
    @JsonProperty("alb_id")
    @JsonInclude(Include.NON_NULL)
    private String albId = null;

    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId = null;

    @JsonProperty("nic_id")
    @JsonInclude(Include.NON_NULL)
    private String nicId = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("resource_group")
    @JsonInclude(Include.NON_NULL)
    private String resourceGroup = null;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status = null;

    @JsonProperty("subscription_id")
    @JsonInclude(Include.NON_NULL)
    private String subscriptionId = null;

    @JsonProperty("vips")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> vips = null;

    @JsonProperty("vnet_id")
    @JsonInclude(Include.NON_NULL)
    private String vnetId = null;

    @JsonProperty("vs_uuids")
    @JsonInclude(Include.NON_NULL)
    private List<String> vsUuids = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return albId
   */
  @VsoMethod
  public String getAlbId() {
    return albId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param albId set the albId.
   */
  @VsoMethod
  public void setAlbId(String  albId) {
    this.albId = albId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nicId
   */
  @VsoMethod
  public String getNicId() {
    return nicId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nicId set the nicId.
   */
  @VsoMethod
  public void setNicId(String  nicId) {
    this.nicId = nicId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resourceGroup
   */
  @VsoMethod
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resourceGroup set the resourceGroup.
   */
  @VsoMethod
  public void setResourceGroup(String  resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subscriptionId
   */
  @VsoMethod
  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subscriptionId set the subscriptionId.
   */
  @VsoMethod
  public void setSubscriptionId(String  subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vips
   */
  @VsoMethod
  public List<IpAddr> getVips() {
    return vips;
  }

  /**
   * This is the setter method. this will set the vips
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vips
   */
  @VsoMethod
  public void setVips(List<IpAddr>  vips) {
    this.vips = vips;
  }

  /**
   * This is the setter method this will set the vips
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vips
   */
  @VsoMethod
  public AzureSetup addVipsItem(IpAddr vipsItem) {
    if (this.vips == null) {
      this.vips = new ArrayList<IpAddr>();
    }
    this.vips.add(vipsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnetId
   */
  @VsoMethod
  public String getVnetId() {
    return vnetId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vnetId set the vnetId.
   */
  @VsoMethod
  public void setVnetId(String  vnetId) {
    this.vnetId = vnetId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuids
   */
  @VsoMethod
  public List<String> getVsUuids() {
    return vsUuids;
  }

  /**
   * This is the setter method. this will set the vsUuids
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuids
   */
  @VsoMethod
  public void setVsUuids(List<String>  vsUuids) {
    this.vsUuids = vsUuids;
  }

  /**
   * This is the setter method this will set the vsUuids
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuids
   */
  @VsoMethod
  public AzureSetup addVsUuidsItem(String vsUuidsItem) {
    if (this.vsUuids == null) {
      this.vsUuids = new ArrayList<String>();
    }
    this.vsUuids.add(vsUuidsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AzureSetup objAzureSetup = (AzureSetup) o;
  return   Objects.equals(this.ccId, objAzureSetup.ccId)&&
  Objects.equals(this.subscriptionId, objAzureSetup.subscriptionId)&&
  Objects.equals(this.vnetId, objAzureSetup.vnetId)&&
  Objects.equals(this.resourceGroup, objAzureSetup.resourceGroup)&&
  Objects.equals(this.albId, objAzureSetup.albId)&&
  Objects.equals(this.nicId, objAzureSetup.nicId)&&
  Objects.equals(this.status, objAzureSetup.status)&&
  Objects.equals(this.reason, objAzureSetup.reason)&&
  Objects.equals(this.vips, objAzureSetup.vips)&&
  Objects.equals(this.vsUuids, objAzureSetup.vsUuids);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AzureSetup {\n");
      sb.append("    albId: ").append(toIndentedString(albId)).append("\n");
        sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    vips: ").append(toIndentedString(vips)).append("\n");
        sb.append("    vnetId: ").append(toIndentedString(vnetId)).append("\n");
        sb.append("    vsUuids: ").append(toIndentedString(vsUuids)).append("\n");
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

