package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CaptureFilters;
import com.vmware.avi.vro.model.DebugDnsOptions;
import com.vmware.avi.vro.model.DebugIpAddr;
import com.vmware.avi.vro.model.DebugVirtualServiceCapture;
import com.vmware.avi.vro.model.DebugVirtualServiceSeParams;
import com.vmware.avi.vro.model.DebugVsDataplane;
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
 * DebugVirtualService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugVirtualService")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGVIRTUALSERVICE, idAccessor = "getObjectID()")
@Service
public class DebugVirtualService extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("capture")
  private Boolean capture = null;

  @JsonProperty("capture_filters")
  private CaptureFilters captureFilters = null;

  @JsonProperty("capture_params")
  private DebugVirtualServiceCapture captureParams = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("debug_hm")
  private String debugHm = "DEBUG_VS_HM_NONE";

  @JsonProperty("debug_ip")
  private DebugIpAddr debugIp = null;

  @JsonProperty("dns_options")
  private DebugDnsOptions dnsOptions = null;

  @JsonProperty("flags")
  @Valid
  private List<DebugVsDataplane> flags = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("resync_flows")
  private Boolean resyncFlows = null;

  @JsonProperty("se_params")
  private DebugVirtualServiceSeParams seParams = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * Placeholder for description of property capture of obj type DebugVirtualService field type str  type boolean
   * @return capture
  **/
  @ApiModelProperty(value = "Placeholder for description of property capture of obj type DebugVirtualService field type str  type boolean")


 
  @VsoMethod  
  public Boolean isCapture() {
    return capture;
  }
    
  @VsoMethod
  public void setCapture(Boolean capture) {
    this.capture = capture;
  }

  
  /**
   * Per packet capture filters for Debug Virtual Service. Applies to both frontend and backend packets. Field introduced in 18.2.7.
   * @return captureFilters
  **/
  @ApiModelProperty(value = "Per packet capture filters for Debug Virtual Service. Applies to both frontend and backend packets. Field introduced in 18.2.7.")

  @Valid

 
  @VsoMethod  
  public CaptureFilters getCaptureFilters() {
    return captureFilters;
  }
    
  @VsoMethod
  public void setCaptureFilters(CaptureFilters captureFilters) {
    this.captureFilters = captureFilters;
  }

  
  /**
   * Placeholder for description of property capture_params of obj type DebugVirtualService field type str  type object
   * @return captureParams
  **/
  @ApiModelProperty(value = "Placeholder for description of property capture_params of obj type DebugVirtualService field type str  type object")

  @Valid

 
  @VsoMethod  
  public DebugVirtualServiceCapture getCaptureParams() {
    return captureParams;
  }
    
  @VsoMethod
  public void setCaptureParams(DebugVirtualServiceCapture captureParams) {
    this.captureParams = captureParams;
  }

  
  /**
   *  It is a reference to an object of type Cloud.
   * @return cloudRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Cloud.")


 
  @VsoMethod  
  public String getCloudRef() {
    return cloudRef;
  }
    
  @VsoMethod
  public void setCloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
  }

  
  /**
   * This option controls the capture of Health Monitor flows. Enum options - DEBUG_VS_HM_NONE, DEBUG_VS_HM_ONLY, DEBUG_VS_HM_INCLUDE.
   * @return debugHm
  **/
  @ApiModelProperty(value = "This option controls the capture of Health Monitor flows. Enum options - DEBUG_VS_HM_NONE, DEBUG_VS_HM_ONLY, DEBUG_VS_HM_INCLUDE.")


 
  @VsoMethod  
  public String getDebugHm() {
    return debugHm;
  }
    
  @VsoMethod
  public void setDebugHm(String debugHm) {
    this.debugHm = debugHm;
  }

  
  /**
   * Filters all packets of a complete transaction (client and server side), based on client ip.
   * @return debugIp
  **/
  @ApiModelProperty(value = "Filters all packets of a complete transaction (client and server side), based on client ip.")

  @Valid

 
  @VsoMethod  
  public DebugIpAddr getDebugIp() {
    return debugIp;
  }
    
  @VsoMethod
  public void setDebugIp(DebugIpAddr debugIp) {
    this.debugIp = debugIp;
  }

  
  /**
   * Dns debug options. Field introduced in 18.2.1.
   * @return dnsOptions
  **/
  @ApiModelProperty(value = "Dns debug options. Field introduced in 18.2.1.")

  @Valid

 
  @VsoMethod  
  public DebugDnsOptions getDnsOptions() {
    return dnsOptions;
  }
    
  @VsoMethod
  public void setDnsOptions(DebugDnsOptions dnsOptions) {
    this.dnsOptions = dnsOptions;
  }

  
  public DebugVirtualService addFlagsItem(DebugVsDataplane flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<DebugVsDataplane>();
    }
    this.flags.add(flagsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property flags of obj type DebugVirtualService field type str  type object
   * @return flags
  **/
  @ApiModelProperty(value = "Placeholder for description of property flags of obj type DebugVirtualService field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<DebugVsDataplane> getFlags() {
    return flags;
  }
    
  @VsoMethod
  public void setFlags(List<DebugVsDataplane> flags) {
    this.flags = flags;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * This option re-synchronizes flows between Active-Standby service engines for all the virtual services placed on them. It should be used with caution because as it can cause a flood between Active-Standby. Field introduced in 18.1.3,18.2.1.
   * @return resyncFlows
  **/
  @ApiModelProperty(value = "This option re-synchronizes flows between Active-Standby service engines for all the virtual services placed on them. It should be used with caution because as it can cause a flood between Active-Standby. Field introduced in 18.1.3,18.2.1.")


 
  @VsoMethod  
  public Boolean isResyncFlows() {
    return resyncFlows;
  }
    
  @VsoMethod
  public void setResyncFlows(Boolean resyncFlows) {
    this.resyncFlows = resyncFlows;
  }

  
  /**
   * Placeholder for description of property se_params of obj type DebugVirtualService field type str  type object
   * @return seParams
  **/
  @ApiModelProperty(value = "Placeholder for description of property se_params of obj type DebugVirtualService field type str  type object")

  @Valid

 
  @VsoMethod  
  public DebugVirtualServiceSeParams getSeParams() {
    return seParams;
  }
    
  @VsoMethod
  public void setSeParams(DebugVirtualServiceSeParams seParams) {
    this.seParams = seParams;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "DebugVirtualService";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugVirtualService debugVirtualService = (DebugVirtualService) o;
    return Objects.equals(this.lastModified, debugVirtualService.lastModified) &&
        Objects.equals(this.capture, debugVirtualService.capture) &&
        Objects.equals(this.captureFilters, debugVirtualService.captureFilters) &&
        Objects.equals(this.captureParams, debugVirtualService.captureParams) &&
        Objects.equals(this.cloudRef, debugVirtualService.cloudRef) &&
        Objects.equals(this.debugHm, debugVirtualService.debugHm) &&
        Objects.equals(this.debugIp, debugVirtualService.debugIp) &&
        Objects.equals(this.dnsOptions, debugVirtualService.dnsOptions) &&
        Objects.equals(this.flags, debugVirtualService.flags) &&
        Objects.equals(this.name, debugVirtualService.name) &&
        Objects.equals(this.resyncFlows, debugVirtualService.resyncFlows) &&
        Objects.equals(this.seParams, debugVirtualService.seParams) &&
        Objects.equals(this.tenantRef, debugVirtualService.tenantRef) &&
        Objects.equals(this.url, debugVirtualService.url) &&
        Objects.equals(this.uuid, debugVirtualService.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, capture, captureFilters, captureParams, cloudRef, debugHm, debugIp, dnsOptions, flags, name, resyncFlows, seParams, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugVirtualService {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

