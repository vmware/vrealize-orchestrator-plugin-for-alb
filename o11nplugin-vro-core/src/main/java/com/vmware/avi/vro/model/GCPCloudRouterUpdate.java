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
 * The GCPCloudRouterUpdate is a POJO class extends AviRestResource that used for creating
 * GCPCloudRouterUpdate.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GCPCloudRouterUpdate")
@VsoFinder(name = Constants.FINDER_VRO_GCPCLOUDROUTERUPDATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GCPCloudRouterUpdate extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private String action;

    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId;

    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString;

    @JsonProperty("fip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr fip;

    @JsonProperty("router_url")
    @JsonInclude(Include.NON_NULL)
    private String routerUrl;

    @JsonProperty("vip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr vip;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsUuid;



  /**
   * This is the getter method this will return the attribute value.
   * Action performed  action can be either route added or route removed from router.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Action performed  action can be either route added or route removed from router.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud uuid.
   * Field introduced in 18.2.5.
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
   * Cloud uuid.
   * Field introduced in 18.2.5.
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
   * Reason for the failure.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for the failure.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtual service floating ip.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fip
   */
  @VsoMethod
  public IpAddr getFip() {
    return fip;
  }

  /**
   * This is the setter method to the attribute.
   * Virtual service floating ip.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fip set the fip.
   */
  @VsoMethod
  public void setFip(IpAddr fip) {
    this.fip = fip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gcp cloud router url.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return routerUrl
   */
  @VsoMethod
  public String getRouterUrl() {
    return routerUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Gcp cloud router url.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param routerUrl set the routerUrl.
   */
  @VsoMethod
  public void setRouterUrl(String  routerUrl) {
    this.routerUrl = routerUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtual service ip.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vip
   */
  @VsoMethod
  public IpAddr getVip() {
    return vip;
  }

  /**
   * This is the setter method to the attribute.
   * Virtual service ip.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vip set the vip.
   */
  @VsoMethod
  public void setVip(IpAddr vip) {
    this.vip = vip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtual service uuid.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Virtual service uuid.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GCPCloudRouterUpdate objGCPCloudRouterUpdate = (GCPCloudRouterUpdate) o;
  return   Objects.equals(this.ccId, objGCPCloudRouterUpdate.ccId)&&
  Objects.equals(this.vsUuid, objGCPCloudRouterUpdate.vsUuid)&&
  Objects.equals(this.errorString, objGCPCloudRouterUpdate.errorString)&&
  Objects.equals(this.vip, objGCPCloudRouterUpdate.vip)&&
  Objects.equals(this.fip, objGCPCloudRouterUpdate.fip)&&
  Objects.equals(this.routerUrl, objGCPCloudRouterUpdate.routerUrl)&&
  Objects.equals(this.action, objGCPCloudRouterUpdate.action);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GCPCloudRouterUpdate {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    fip: ").append(toIndentedString(fip)).append("\n");
        sb.append("    routerUrl: ").append(toIndentedString(routerUrl)).append("\n");
        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

