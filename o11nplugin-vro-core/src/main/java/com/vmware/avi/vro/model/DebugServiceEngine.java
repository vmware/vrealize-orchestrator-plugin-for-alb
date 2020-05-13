package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CaptureFilters;
import com.vmware.avi.vro.model.DebugIpAddr;
import com.vmware.avi.vro.model.DebugSeAgent;
import com.vmware.avi.vro.model.DebugSeCpuShares;
import com.vmware.avi.vro.model.DebugSeDataplane;
import com.vmware.avi.vro.model.DebugSeFault;
import com.vmware.avi.vro.model.DebugVirtualServiceCapture;
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
 * DebugServiceEngine
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugServiceEngine")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGSERVICEENGINE, idAccessor = "getObjectID()")
@Service
public class DebugServiceEngine extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("capture")
  private Boolean capture = null;

  @JsonProperty("capture_filters")
  private CaptureFilters captureFilters = null;

  @JsonProperty("capture_params")
  private DebugVirtualServiceCapture captureParams = null;

  @JsonProperty("cpu_shares")
  @Valid
  private List<DebugSeCpuShares> cpuShares = null;

  @JsonProperty("debug_ip")
  private DebugIpAddr debugIp = null;

  @JsonProperty("fault")
  private DebugSeFault fault = null;

  @JsonProperty("flags")
  @Valid
  private List<DebugSeDataplane> flags = null;

  @JsonProperty("name")
  private String name = "VM name unknown";

  @JsonProperty("seagent_debug")
  @Valid
  private List<DebugSeAgent> seagentDebug = null;

  @JsonProperty("selogagent_debug")
  private DebugSeAgent selogagentDebug = null;

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
   * Enable/disable packet capture. Field introduced in 18.2.2.
   * @return capture
  **/
  @ApiModelProperty(value = "Enable/disable packet capture. Field introduced in 18.2.2.")


 
  @VsoMethod  
  public Boolean isCapture() {
    return capture;
  }
    
  @VsoMethod
  public void setCapture(Boolean capture) {
    this.capture = capture;
  }

  
  /**
   * Per packet capture filters for Debug Service Engine. Not applicable for DOS pcap capture. . Field introduced in 18.2.5.
   * @return captureFilters
  **/
  @ApiModelProperty(value = "Per packet capture filters for Debug Service Engine. Not applicable for DOS pcap capture. . Field introduced in 18.2.5.")

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
   * Params for SE pcap. Field introduced in 17.2.14,18.1.5,18.2.1.
   * @return captureParams
  **/
  @ApiModelProperty(value = "Params for SE pcap. Field introduced in 17.2.14,18.1.5,18.2.1.")

  @Valid

 
  @VsoMethod  
  public DebugVirtualServiceCapture getCaptureParams() {
    return captureParams;
  }
    
  @VsoMethod
  public void setCaptureParams(DebugVirtualServiceCapture captureParams) {
    this.captureParams = captureParams;
  }

  
  public DebugServiceEngine addCpuSharesItem(DebugSeCpuShares cpuSharesItem) {
    if (this.cpuShares == null) {
      this.cpuShares = new ArrayList<DebugSeCpuShares>();
    }
    this.cpuShares.add(cpuSharesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property cpu_shares of obj type DebugServiceEngine field type str  type object
   * @return cpuShares
  **/
  @ApiModelProperty(value = "Placeholder for description of property cpu_shares of obj type DebugServiceEngine field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<DebugSeCpuShares> getCpuShares() {
    return cpuShares;
  }
    
  @VsoMethod
  public void setCpuShares(List<DebugSeCpuShares> cpuShares) {
    this.cpuShares = cpuShares;
  }

  
  /**
   * Per packet IP filter for Service Engine PCAP. Matches with source and destination address. Field introduced in 17.2.14,18.1.5,18.2.1.
   * @return debugIp
  **/
  @ApiModelProperty(value = "Per packet IP filter for Service Engine PCAP. Matches with source and destination address. Field introduced in 17.2.14,18.1.5,18.2.1.")

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
   * Params for SE fault injection. Field introduced in 18.1.2.
   * @return fault
  **/
  @ApiModelProperty(value = "Params for SE fault injection. Field introduced in 18.1.2.")

  @Valid

 
  @VsoMethod  
  public DebugSeFault getFault() {
    return fault;
  }
    
  @VsoMethod
  public void setFault(DebugSeFault fault) {
    this.fault = fault;
  }

  
  public DebugServiceEngine addFlagsItem(DebugSeDataplane flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<DebugSeDataplane>();
    }
    this.flags.add(flagsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property flags of obj type DebugServiceEngine field type str  type object
   * @return flags
  **/
  @ApiModelProperty(value = "Placeholder for description of property flags of obj type DebugServiceEngine field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<DebugSeDataplane> getFlags() {
    return flags;
  }
    
  @VsoMethod
  public void setFlags(List<DebugSeDataplane> flags) {
    this.flags = flags;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the object.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public DebugServiceEngine addSeagentDebugItem(DebugSeAgent seagentDebugItem) {
    if (this.seagentDebug == null) {
      this.seagentDebug = new ArrayList<DebugSeAgent>();
    }
    this.seagentDebug.add(seagentDebugItem);
    return this;
  }
  
  /**
   * Placeholder for description of property seagent_debug of obj type DebugServiceEngine field type str  type object
   * @return seagentDebug
  **/
  @ApiModelProperty(value = "Placeholder for description of property seagent_debug of obj type DebugServiceEngine field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<DebugSeAgent> getSeagentDebug() {
    return seagentDebug;
  }
    
  @VsoMethod
  public void setSeagentDebug(List<DebugSeAgent> seagentDebug) {
    this.seagentDebug = seagentDebug;
  }

  
  /**
   * Debug knob for se_log_agent process. Field introduced in 20.1.1.
   * @return selogagentDebug
  **/
  @ApiModelProperty(value = "Debug knob for se_log_agent process. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public DebugSeAgent getSelogagentDebug() {
    return selogagentDebug;
  }
    
  @VsoMethod
  public void setSelogagentDebug(DebugSeAgent selogagentDebug) {
    this.selogagentDebug = selogagentDebug;
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
		return "DebugServiceEngine";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugServiceEngine debugServiceEngine = (DebugServiceEngine) o;
    return Objects.equals(this.lastModified, debugServiceEngine.lastModified) &&
        Objects.equals(this.capture, debugServiceEngine.capture) &&
        Objects.equals(this.captureFilters, debugServiceEngine.captureFilters) &&
        Objects.equals(this.captureParams, debugServiceEngine.captureParams) &&
        Objects.equals(this.cpuShares, debugServiceEngine.cpuShares) &&
        Objects.equals(this.debugIp, debugServiceEngine.debugIp) &&
        Objects.equals(this.fault, debugServiceEngine.fault) &&
        Objects.equals(this.flags, debugServiceEngine.flags) &&
        Objects.equals(this.name, debugServiceEngine.name) &&
        Objects.equals(this.seagentDebug, debugServiceEngine.seagentDebug) &&
        Objects.equals(this.selogagentDebug, debugServiceEngine.selogagentDebug) &&
        Objects.equals(this.tenantRef, debugServiceEngine.tenantRef) &&
        Objects.equals(this.url, debugServiceEngine.url) &&
        Objects.equals(this.uuid, debugServiceEngine.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, capture, captureFilters, captureParams, cpuShares, debugIp, fault, flags, name, seagentDebug, selogagentDebug, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugServiceEngine {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
    sb.append("    captureFilters: ").append(toIndentedString(captureFilters)).append("\n");
    sb.append("    captureParams: ").append(toIndentedString(captureParams)).append("\n");
    sb.append("    cpuShares: ").append(toIndentedString(cpuShares)).append("\n");
    sb.append("    debugIp: ").append(toIndentedString(debugIp)).append("\n");
    sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seagentDebug: ").append(toIndentedString(seagentDebug)).append("\n");
    sb.append("    selogagentDebug: ").append(toIndentedString(selogagentDebug)).append("\n");
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

