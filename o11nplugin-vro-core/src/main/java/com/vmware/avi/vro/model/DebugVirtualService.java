package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.CaptureFilters;
import com.vmware.avi.vro.model.DebugVirtualServiceCapture;
import com.vmware.avi.vro.model.CapturePacketFilter;
import com.vmware.avi.vro.model.DebugIpAddr;
import com.vmware.avi.vro.model.DebugDnsOptions;
import com.vmware.avi.vro.model.CaptureFilters;
import com.vmware.avi.vro.model.DebugVirtualServiceObjSync;
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

    @JsonProperty("capture_pkt_filter")
    @JsonInclude(Include.NON_NULL)
    private CapturePacketFilter capturePktFilter = null;

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

    @JsonProperty("latency_audit_filters")
    @JsonInclude(Include.NON_NULL)
    private CaptureFilters latencyAuditFilters = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("objsync")
    @JsonInclude(Include.NON_NULL)
    private DebugVirtualServiceObjSync objsync = null;

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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return capture
   */
  @VsoMethod
  public Boolean getCapture() {
    return capture;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param captureFilters set the captureFilters.
   */
  @VsoMethod
  public void setCaptureFilters(CaptureFilters captureFilters) {
    this.captureFilters = captureFilters;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return captureParams
   */
  @VsoMethod
  public DebugVirtualServiceCapture getCaptureParams() {
    return captureParams;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param captureParams set the captureParams.
   */
  @VsoMethod
  public void setCaptureParams(DebugVirtualServiceCapture captureParams) {
    this.captureParams = captureParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Per packet capture filters for debug virtual service.
   * Applies to both frontend and backend packets.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return capturePktFilter
   */
  @VsoMethod
  public CapturePacketFilter getCapturePktFilter() {
    return capturePktFilter;
  }

  /**
   * This is the setter method to the attribute.
   * Per packet capture filters for debug virtual service.
   * Applies to both frontend and backend packets.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param capturePktFilter set the capturePktFilter.
   */
  @VsoMethod
  public void setCapturePktFilter(CapturePacketFilter capturePktFilter) {
    this.capturePktFilter = capturePktFilter;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type cloud.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type cloud.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "DEBUG_VS_HM_NONE".
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "DEBUG_VS_HM_NONE".
   * @param debugHm set the debugHm.
   */
  @VsoMethod
  public void setDebugHm(String  debugHm) {
    this.debugHm = debugHm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Filters all packets of a complete transaction (client and server side), based on client ip.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return debugIp
   */
  @VsoMethod
  public DebugIpAddr getDebugIp() {
    return debugIp;
  }

  /**
   * This is the setter method to the attribute.
   * Filters all packets of a complete transaction (client and server side), based on client ip.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dnsOptions set the dnsOptions.
   */
  @VsoMethod
  public void setDnsOptions(DebugDnsOptions dnsOptions) {
    this.dnsOptions = dnsOptions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flags
   */
  @VsoMethod
  public List<DebugVsDataplane> getFlags() {
    return flags;
  }

  /**
   * This is the setter method. this will set the flags
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flags
   */
  @VsoMethod
  public void setFlags(List<DebugVsDataplane>  flags) {
    this.flags = flags;
  }

  /**
   * This is the setter method this will set the flags
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Deprecated in 22.1.1.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return latencyAuditFilters
   */
  @VsoMethod
  public CaptureFilters getLatencyAuditFilters() {
    return latencyAuditFilters;
  }

  /**
   * This is the setter method to the attribute.
   * Deprecated in 22.1.1.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param latencyAuditFilters set the latencyAuditFilters.
   */
  @VsoMethod
  public void setLatencyAuditFilters(CaptureFilters latencyAuditFilters) {
    this.latencyAuditFilters = latencyAuditFilters;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Object sync debug options.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objsync
   */
  @VsoMethod
  public DebugVirtualServiceObjSync getObjsync() {
    return objsync;
  }

  /**
   * This is the setter method to the attribute.
   * Object sync debug options.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objsync set the objsync.
   */
  @VsoMethod
  public void setObjsync(DebugVirtualServiceObjSync objsync) {
    this.objsync = objsync;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This option re-synchronizes flows between active-standby service engines for all the virtual services placed on them.
   * It should be used with caution because as it can cause a flood between active-standby.
   * Field introduced in 18.1.3,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param resyncFlows set the resyncFlows.
   */
  @VsoMethod
  public void setResyncFlows(Boolean  resyncFlows) {
    this.resyncFlows = resyncFlows;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seParams
   */
  @VsoMethod
  public DebugVirtualServiceSeParams getSeParams() {
    return seParams;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seParams set the seParams.
   */
  @VsoMethod
  public void setSeParams(DebugVirtualServiceSeParams seParams) {
    this.seParams = seParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  return   Objects.equals(this.uuid, objDebugVirtualService.uuid)&&
  Objects.equals(this.name, objDebugVirtualService.name)&&
  Objects.equals(this.flags, objDebugVirtualService.flags)&&
  Objects.equals(this.debugIp, objDebugVirtualService.debugIp)&&
  Objects.equals(this.capture, objDebugVirtualService.capture)&&
  Objects.equals(this.captureParams, objDebugVirtualService.captureParams)&&
  Objects.equals(this.seParams, objDebugVirtualService.seParams)&&
  Objects.equals(this.debugHm, objDebugVirtualService.debugHm)&&
  Objects.equals(this.dnsOptions, objDebugVirtualService.dnsOptions)&&
  Objects.equals(this.captureFilters, objDebugVirtualService.captureFilters)&&
  Objects.equals(this.objsync, objDebugVirtualService.objsync)&&
  Objects.equals(this.capturePktFilter, objDebugVirtualService.capturePktFilter)&&
  Objects.equals(this.tenantRef, objDebugVirtualService.tenantRef)&&
  Objects.equals(this.cloudRef, objDebugVirtualService.cloudRef)&&
  Objects.equals(this.resyncFlows, objDebugVirtualService.resyncFlows)&&
  Objects.equals(this.latencyAuditFilters, objDebugVirtualService.latencyAuditFilters);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DebugVirtualService {\n");
      sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
        sb.append("    captureFilters: ").append(toIndentedString(captureFilters)).append("\n");
        sb.append("    captureParams: ").append(toIndentedString(captureParams)).append("\n");
        sb.append("    capturePktFilter: ").append(toIndentedString(capturePktFilter)).append("\n");
        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    debugHm: ").append(toIndentedString(debugHm)).append("\n");
        sb.append("    debugIp: ").append(toIndentedString(debugIp)).append("\n");
        sb.append("    dnsOptions: ").append(toIndentedString(dnsOptions)).append("\n");
        sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
        sb.append("    latencyAuditFilters: ").append(toIndentedString(latencyAuditFilters)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objsync: ").append(toIndentedString(objsync)).append("\n");
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

