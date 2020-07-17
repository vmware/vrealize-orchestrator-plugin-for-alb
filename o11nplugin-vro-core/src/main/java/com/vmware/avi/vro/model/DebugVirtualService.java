package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.CaptureFilters;
import com.vmware.avi.vro.model.DebugVirtualServiceCapture;
import com.vmware.avi.vro.model.DebugIpAddr;
import com.vmware.avi.vro.model.DebugDnsOptions;
import com.vmware.avi.vro.model.DebugVirtualServiceSeParams;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DebugVirtualService is a POJO class extends AviRestResource that used for creating
 * DebugVirtualService.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DebugVirtualService")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGVIRTUALSERVICE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DebugVirtualService extends AviRestResource {
  @JsonProperty("capture")
  @JsonInclude(Include.NON_NULL)
  private Boolean capture = null;

  @JsonProperty("capture_filters")
  @JsonInclude(Include.NON_NULL)
  private CaptureFilters captureFilters = null;

  @JsonProperty("capture_params")
  @JsonInclude(Include.NON_NULL)
  private DebugVirtualServiceCapture captureParams = null;

  @JsonProperty("cloud_ref")
  @JsonInclude(Include.NON_NULL)
  private String cloudRef = null;

  @JsonProperty("debug_hm")
  @JsonInclude(Include.NON_NULL)
  private String debugHm = "DEBUG_VS_HM_NONE";

  @JsonProperty("debug_ip")
  @JsonInclude(Include.NON_NULL)
  private DebugIpAddr debugIp = null;

  @JsonProperty("dns_options")
  @JsonInclude(Include.NON_NULL)
  private DebugDnsOptions dnsOptions = null;

  @JsonProperty("flags")
  @JsonInclude(Include.NON_NULL)
  private List<DebugVsDataplane> flags = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("resync_flows")
  @JsonInclude(Include.NON_NULL)
  private Boolean resyncFlows = false;

  @JsonProperty("se_params")
  @JsonInclude(Include.NON_NULL)
  private DebugVirtualServiceSeParams seParams = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property capture of obj type debugvirtualservice field type str  type boolean.
   * @return capture
   */
  @VsoMethod
  public Boolean getCapture() {
    return capture;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property capture of obj type debugvirtualservice field type str  type boolean.
   * @param capture set the capture.
   */
  @VsoMethod
  public void setCapture(Boolean  capture) {
    this.capture = capture;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Per packet capture filters for debug virtual service.
   * Applies to both frontend and backend packets.
   * Field introduced in 18.2.7.
   * @return captureFilters
   */
  @VsoMethod
  public CaptureFilters getCaptureFilters() {
    return captureFilters;
  }

  /**
   * This is the setter method to the attribute.
   * Per packet capture filters for debug virtual service.
   * Applies to both frontend and backend packets.
   * Field introduced in 18.2.7.
   * @param captureFilters set the captureFilters.
   */
  @VsoMethod
  public void setCaptureFilters(CaptureFilters captureFilters) {
    this.captureFilters = captureFilters;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property capture_params of obj type debugvirtualservice field type str  type ref.
   * @return captureParams
   */
  @VsoMethod
  public DebugVirtualServiceCapture getCaptureParams() {
    return captureParams;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property capture_params of obj type debugvirtualservice field type str  type ref.
   * @param captureParams set the captureParams.
   */
  @VsoMethod
  public void setCaptureParams(DebugVirtualServiceCapture captureParams) {
    this.captureParams = captureParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type cloud.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type cloud.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This option controls the capture of health monitor flows.
   * Enum options - DEBUG_VS_HM_NONE, DEBUG_VS_HM_ONLY, DEBUG_VS_HM_INCLUDE.
   * Default value when not specified in API or module is interpreted by Avi Controller as DEBUG_VS_HM_NONE.
   * @return debugHm
   */
  @VsoMethod
  public String getDebugHm() {
    return debugHm;
  }

  /**
   * This is the setter method to the attribute.
   * This option controls the capture of health monitor flows.
   * Enum options - DEBUG_VS_HM_NONE, DEBUG_VS_HM_ONLY, DEBUG_VS_HM_INCLUDE.
   * Default value when not specified in API or module is interpreted by Avi Controller as DEBUG_VS_HM_NONE.
   * @param debugHm set the debugHm.
   */
  @VsoMethod
  public void setDebugHm(String  debugHm) {
    this.debugHm = debugHm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Filters all packets of a complete transaction (client and server side), based on client ip.
   * @return debugIp
   */
  @VsoMethod
  public DebugIpAddr getDebugIp() {
    return debugIp;
  }

  /**
   * This is the setter method to the attribute.
   * Filters all packets of a complete transaction (client and server side), based on client ip.
   * @param debugIp set the debugIp.
   */
  @VsoMethod
  public void setDebugIp(DebugIpAddr debugIp) {
    this.debugIp = debugIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dns debug options.
   * Field introduced in 18.2.1.
   * @return dnsOptions
   */
  @VsoMethod
  public DebugDnsOptions getDnsOptions() {
    return dnsOptions;
  }

  /**
   * This is the setter method to the attribute.
   * Dns debug options.
   * Field introduced in 18.2.1.
   * @param dnsOptions set the dnsOptions.
   */
  @VsoMethod
  public void setDnsOptions(DebugDnsOptions dnsOptions) {
    this.dnsOptions = dnsOptions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property flags of obj type debugvirtualservice field type str  type array.
   * @return flags
   */
  @VsoMethod
  public List<DebugVsDataplane> getFlags() {
    return flags;
  }

  /**
   * This is the setter method. this will set the flags
   * Placeholder for description of property flags of obj type debugvirtualservice field type str  type array.
   * @return flags
   */
  @VsoMethod
  public void setFlags(List<DebugVsDataplane>  flags) {
    this.flags = flags;
  }

  /**
   * This is the setter method this will set the flags
   * Placeholder for description of property flags of obj type debugvirtualservice field type str  type array.
   * @return flags
   */
  @VsoMethod
  public DebugVirtualService addFlagsItem(DebugVsDataplane flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<DebugVsDataplane>();
    }
    this.flags.add(flagsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This option re-synchronizes flows between active-standby service engines for all the virtual services placed on them.
   * It should be used with caution because as it can cause a flood between active-standby.
   * Field introduced in 18.1.3,18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return resyncFlows
   */
  @VsoMethod
  public Boolean getResyncFlows() {
    return resyncFlows;
  }

  /**
   * This is the setter method to the attribute.
   * This option re-synchronizes flows between active-standby service engines for all the virtual services placed on them.
   * It should be used with caution because as it can cause a flood between active-standby.
   * Field introduced in 18.1.3,18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param resyncFlows set the resyncFlows.
   */
  @VsoMethod
  public void setResyncFlows(Boolean  resyncFlows) {
    this.resyncFlows = resyncFlows;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_params of obj type debugvirtualservice field type str  type ref.
   * @return seParams
   */
  @VsoMethod
  public DebugVirtualServiceSeParams getSeParams() {
    return seParams;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_params of obj type debugvirtualservice field type str  type ref.
   * @param seParams set the seParams.
   */
  @VsoMethod
  public void setSeParams(DebugVirtualServiceSeParams seParams) {
    this.seParams = seParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DebugVirtualService objDebugVirtualService = (DebugVirtualService) o;
  return   Objects.equals(this.capture, objDebugVirtualService.capture)&&
  Objects.equals(this.seParams, objDebugVirtualService.seParams)&&
  Objects.equals(this.uuid, objDebugVirtualService.uuid)&&
  Objects.equals(this.captureParams, objDebugVirtualService.captureParams)&&
  Objects.equals(this.debugIp, objDebugVirtualService.debugIp)&&
  Objects.equals(this.captureFilters, objDebugVirtualService.captureFilters)&&
  Objects.equals(this.cloudRef, objDebugVirtualService.cloudRef)&&
  Objects.equals(this.dnsOptions, objDebugVirtualService.dnsOptions)&&
  Objects.equals(this.flags, objDebugVirtualService.flags)&&
  Objects.equals(this.debugHm, objDebugVirtualService.debugHm)&&
  Objects.equals(this.resyncFlows, objDebugVirtualService.resyncFlows)&&
  Objects.equals(this.tenantRef, objDebugVirtualService.tenantRef)&&
  Objects.equals(this.name, objDebugVirtualService.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DebugVirtualService {\n");
      sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
        sb.append("    captureFilters: ").append(toIndentedString(captureFilters)).append("\n");
        sb.append("    captureParams: ").append(toIndentedString(captureParams)).append("\n");
        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    debugHm: ").append(toIndentedString(debugHm)).append("\n");
        sb.append("    debugIp: ").append(toIndentedString(debugIp)).append("\n");
        sb.append("    dnsOptions: ").append(toIndentedString(dnsOptions)).append("\n");
        sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    resyncFlows: ").append(toIndentedString(resyncFlows)).append("\n");
        sb.append("    seParams: ").append(toIndentedString(seParams)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

