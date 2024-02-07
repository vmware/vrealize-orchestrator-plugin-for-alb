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
import com.vmware.avi.vro.model.DebugSeFault;
import com.vmware.avi.vro.model.DebugSeAgent;
import com.vmware.avi.vro.model.DebugTraceMemory;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DebugServiceEngine is a POJO class extends AviRestResource that used for creating
 * DebugServiceEngine.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DebugServiceEngine")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGSERVICEENGINE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DebugServiceEngine extends AviRestResource {
    @JsonProperty("benchmark_action")
    @JsonInclude(Include.NON_NULL)
    private String benchmarkAction = "SE_BENCHMARK_MODE_DROP";

    @JsonProperty("benchmark_layer")
    @JsonInclude(Include.NON_NULL)
    private String benchmarkLayer = "SE_BENCHMARK_LAYER_NONE";

    @JsonProperty("benchmark_option")
    @JsonInclude(Include.NON_NULL)
    private String benchmarkOption = "SE_BENCHMARK_REFLECT_SWAP_L4";

    @JsonProperty("benchmark_rss_hash")
    @JsonInclude(Include.NON_NULL)
    private String benchmarkRssHash = "SE_BENCHMARK_DISABLE_HASH";

    @JsonProperty("capture")
    @JsonInclude(Include.NON_NULL)
    private Boolean capture;

    @JsonProperty("capture_filters")
    @JsonInclude(Include.NON_NULL)
    private CaptureFilters captureFilters;

    @JsonProperty("capture_params")
    @JsonInclude(Include.NON_NULL)
    private DebugVirtualServiceCapture captureParams;

    @JsonProperty("capture_pkt_filter")
    @JsonInclude(Include.NON_NULL)
    private CapturePacketFilter capturePktFilter;

    @JsonProperty("cpu_shares")
    @JsonInclude(Include.NON_NULL)
    private List<DebugSeCpuShares> cpuShares;

    @JsonProperty("debug_ip")
    @JsonInclude(Include.NON_NULL)
    private DebugIpAddr debugIp;

    @JsonProperty("enable_kdump")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableKdump = false;

    @JsonProperty("enable_rpc_timing_profiler")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableRpcTimingProfiler = false;

    @JsonProperty("fault")
    @JsonInclude(Include.NON_NULL)
    private DebugSeFault fault;

    @JsonProperty("flags")
    @JsonInclude(Include.NON_NULL)
    private List<DebugSeDataplane> flags;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = "VM name unknown";

    @JsonProperty("seagent_debug")
    @JsonInclude(Include.NON_NULL)
    private List<DebugSeAgent> seagentDebug;

    @JsonProperty("selogagent_debug")
    @JsonInclude(Include.NON_NULL)
    private DebugSeAgent selogagentDebug;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("trace_memory")
    @JsonInclude(Include.NON_NULL)
    private DebugTraceMemory traceMemory;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Action to be invoked at configured layer.
   * Enum options - SE_BENCHMARK_MODE_DROP, SE_BENCHMARK_MODE_REFLECT.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_BENCHMARK_MODE_DROP".
   * @return benchmarkAction
   */
  @VsoMethod
  public String getBenchmarkAction() {
    return benchmarkAction;
  }

  /**
   * This is the setter method to the attribute.
   * Action to be invoked at configured layer.
   * Enum options - SE_BENCHMARK_MODE_DROP, SE_BENCHMARK_MODE_REFLECT.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_BENCHMARK_MODE_DROP".
   * @param benchmarkAction set the benchmarkAction.
   */
  @VsoMethod
  public void setBenchmarkAction(String  benchmarkAction) {
    this.benchmarkAction = benchmarkAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Toggle and configure the layer to benchmark performance.
   * This can be done at a specific point in the se packet processing pipeline.
   * Enum options - SE_BENCHMARK_LAYER_NONE, SE_BENCHMARK_LAYER_POST_VNIC_RX, SE_BENCHMARK_LAYER_POST_FT_LOOKUP, SE_BENCHMARK_LAYER_NSP_LOOKUP,
   * SE_BENCHMARK_LAYER_PRE_PROXY_PUNT, SE_BENCHMARK_LAYER_POST_PROXY_PUNT, SE_BENCHMARK_LAYER_ETHER_INPUT, SE_BENCHMARK_LAYER_IP_INPUT,
   * SE_BENCHMARK_LAYER_UDP_INPUT, SE_BENCHMARK_LAYER_POST_L2_PROCESSING, SE_BENCHMARK_LAYER_POST_BUILD_KEY_LITE.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_BENCHMARK_LAYER_NONE".
   * @return benchmarkLayer
   */
  @VsoMethod
  public String getBenchmarkLayer() {
    return benchmarkLayer;
  }

  /**
   * This is the setter method to the attribute.
   * Toggle and configure the layer to benchmark performance.
   * This can be done at a specific point in the se packet processing pipeline.
   * Enum options - SE_BENCHMARK_LAYER_NONE, SE_BENCHMARK_LAYER_POST_VNIC_RX, SE_BENCHMARK_LAYER_POST_FT_LOOKUP, SE_BENCHMARK_LAYER_NSP_LOOKUP,
   * SE_BENCHMARK_LAYER_PRE_PROXY_PUNT, SE_BENCHMARK_LAYER_POST_PROXY_PUNT, SE_BENCHMARK_LAYER_ETHER_INPUT, SE_BENCHMARK_LAYER_IP_INPUT,
   * SE_BENCHMARK_LAYER_UDP_INPUT, SE_BENCHMARK_LAYER_POST_L2_PROCESSING, SE_BENCHMARK_LAYER_POST_BUILD_KEY_LITE.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_BENCHMARK_LAYER_NONE".
   * @param benchmarkLayer set the benchmarkLayer.
   */
  @VsoMethod
  public void setBenchmarkLayer(String  benchmarkLayer) {
    this.benchmarkLayer = benchmarkLayer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure different reflect modes.
   * Enum options - SE_BENCHMARK_REFLECT_SWAP_L4, SE_BENCHMARK_REFLECT_SWAP_L2, SE_BENCHMARK_REFLECT_SWAP_L3.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_BENCHMARK_REFLECT_SWAP_L4".
   * @return benchmarkOption
   */
  @VsoMethod
  public String getBenchmarkOption() {
    return benchmarkOption;
  }

  /**
   * This is the setter method to the attribute.
   * Configure different reflect modes.
   * Enum options - SE_BENCHMARK_REFLECT_SWAP_L4, SE_BENCHMARK_REFLECT_SWAP_L2, SE_BENCHMARK_REFLECT_SWAP_L3.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_BENCHMARK_REFLECT_SWAP_L4".
   * @param benchmarkOption set the benchmarkOption.
   */
  @VsoMethod
  public void setBenchmarkOption(String  benchmarkOption) {
    this.benchmarkOption = benchmarkOption;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rss hash function to be used for packet reflect in tx path.
   * Enum options - SE_BENCHMARK_DISABLE_HASH, SE_BENCHMARK_RTE_SOFT_HASH.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_BENCHMARK_DISABLE_HASH".
   * @return benchmarkRssHash
   */
  @VsoMethod
  public String getBenchmarkRssHash() {
    return benchmarkRssHash;
  }

  /**
   * This is the setter method to the attribute.
   * Rss hash function to be used for packet reflect in tx path.
   * Enum options - SE_BENCHMARK_DISABLE_HASH, SE_BENCHMARK_RTE_SOFT_HASH.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_BENCHMARK_DISABLE_HASH".
   * @param benchmarkRssHash set the benchmarkRssHash.
   */
  @VsoMethod
  public void setBenchmarkRssHash(String  benchmarkRssHash) {
    this.benchmarkRssHash = benchmarkRssHash;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable/disable packet capture.
   * Field introduced in 18.2.2.
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
   * Enable/disable packet capture.
   * Field introduced in 18.2.2.
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
   * Per packet capture filters for debug service engine.
   * Not applicable for dos pcap capture.
   * Field introduced in 18.2.5.
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
   * Per packet capture filters for debug service engine.
   * Not applicable for dos pcap capture.
   * Field introduced in 18.2.5.
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
   * Params for se pcap.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
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
   * Params for se pcap.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
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
   * Per packet capture filters for debug service engine.
   * Not applicable for dos pcap capture.
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
   * Per packet capture filters for debug service engine.
   * Not applicable for dos pcap capture.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cpuShares
   */
  @VsoMethod
  public List<DebugSeCpuShares> getCpuShares() {
    return cpuShares;
  }

  /**
   * This is the setter method. this will set the cpuShares
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cpuShares
   */
  @VsoMethod
  public void setCpuShares(List<DebugSeCpuShares>  cpuShares) {
    this.cpuShares = cpuShares;
  }

  /**
   * This is the setter method this will set the cpuShares
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cpuShares
   */
  @VsoMethod
  public DebugServiceEngine addCpuSharesItem(DebugSeCpuShares cpuSharesItem) {
    if (this.cpuShares == null) {
      this.cpuShares = new ArrayList<DebugSeCpuShares>();
    }
    this.cpuShares.add(cpuSharesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Per packet ip filter for service engine pcap.
   * Matches with source and destination address.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
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
   * Per packet ip filter for service engine pcap.
   * Matches with source and destination address.
   * Field introduced in 17.2.14,18.1.5,18.2.1.
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
   * Enables the use of kdump on se.
   * Requires se reboot.
   * Applicable only in case of vm based deployments.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableKdump
   */
  @VsoMethod
  public Boolean getEnableKdump() {
    return enableKdump;
  }

  /**
   * This is the setter method to the attribute.
   * Enables the use of kdump on se.
   * Requires se reboot.
   * Applicable only in case of vm based deployments.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableKdump set the enableKdump.
   */
  @VsoMethod
  public void setEnableKdump(Boolean  enableKdump) {
    this.enableKdump = enableKdump;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable profiling time for certain rpc calls.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableRpcTimingProfiler
   */
  @VsoMethod
  public Boolean getEnableRpcTimingProfiler() {
    return enableRpcTimingProfiler;
  }

  /**
   * This is the setter method to the attribute.
   * Enable profiling time for certain rpc calls.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableRpcTimingProfiler set the enableRpcTimingProfiler.
   */
  @VsoMethod
  public void setEnableRpcTimingProfiler(Boolean  enableRpcTimingProfiler) {
    this.enableRpcTimingProfiler = enableRpcTimingProfiler;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Params for se fault injection.
   * Field introduced in 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fault
   */
  @VsoMethod
  public DebugSeFault getFault() {
    return fault;
  }

  /**
   * This is the setter method to the attribute.
   * Params for se fault injection.
   * Field introduced in 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fault set the fault.
   */
  @VsoMethod
  public void setFault(DebugSeFault fault) {
    this.fault = fault;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flags
   */
  @VsoMethod
  public List<DebugSeDataplane> getFlags() {
    return flags;
  }

  /**
   * This is the setter method. this will set the flags
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flags
   */
  @VsoMethod
  public void setFlags(List<DebugSeDataplane>  flags) {
    this.flags = flags;
  }

  /**
   * This is the setter method this will set the flags
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flags
   */
  @VsoMethod
  public DebugServiceEngine addFlagsItem(DebugSeDataplane flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<DebugSeDataplane>();
    }
    this.flags.add(flagsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "VM name unknown".
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "VM name unknown".
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seagentDebug
   */
  @VsoMethod
  public List<DebugSeAgent> getSeagentDebug() {
    return seagentDebug;
  }

  /**
   * This is the setter method. this will set the seagentDebug
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seagentDebug
   */
  @VsoMethod
  public void setSeagentDebug(List<DebugSeAgent>  seagentDebug) {
    this.seagentDebug = seagentDebug;
  }

  /**
   * This is the setter method this will set the seagentDebug
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seagentDebug
   */
  @VsoMethod
  public DebugServiceEngine addSeagentDebugItem(DebugSeAgent seagentDebugItem) {
    if (this.seagentDebug == null) {
      this.seagentDebug = new ArrayList<DebugSeAgent>();
    }
    this.seagentDebug.add(seagentDebugItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Debug knob for se_log_agent process.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return selogagentDebug
   */
  @VsoMethod
  public DebugSeAgent getSelogagentDebug() {
    return selogagentDebug;
  }

  /**
   * This is the setter method to the attribute.
   * Debug knob for se_log_agent process.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param selogagentDebug set the selogagentDebug.
   */
  @VsoMethod
  public void setSelogagentDebug(DebugSeAgent selogagentDebug) {
    this.selogagentDebug = selogagentDebug;
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
   * Trace the functions calling memory allocation and free apis.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return traceMemory
   */
  @VsoMethod
  public DebugTraceMemory getTraceMemory() {
    return traceMemory;
  }

  /**
   * This is the setter method to the attribute.
   * Trace the functions calling memory allocation and free apis.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param traceMemory set the traceMemory.
   */
  @VsoMethod
  public void setTraceMemory(DebugTraceMemory traceMemory) {
    this.traceMemory = traceMemory;
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
  DebugServiceEngine objDebugServiceEngine = (DebugServiceEngine) o;
  return   Objects.equals(this.uuid, objDebugServiceEngine.uuid)&&
  Objects.equals(this.name, objDebugServiceEngine.name)&&
  Objects.equals(this.seagentDebug, objDebugServiceEngine.seagentDebug)&&
  Objects.equals(this.flags, objDebugServiceEngine.flags)&&
  Objects.equals(this.cpuShares, objDebugServiceEngine.cpuShares)&&
  Objects.equals(this.fault, objDebugServiceEngine.fault)&&
  Objects.equals(this.debugIp, objDebugServiceEngine.debugIp)&&
  Objects.equals(this.captureParams, objDebugServiceEngine.captureParams)&&
  Objects.equals(this.capture, objDebugServiceEngine.capture)&&
  Objects.equals(this.captureFilters, objDebugServiceEngine.captureFilters)&&
  Objects.equals(this.selogagentDebug, objDebugServiceEngine.selogagentDebug)&&
  Objects.equals(this.enableKdump, objDebugServiceEngine.enableKdump)&&
  Objects.equals(this.benchmarkLayer, objDebugServiceEngine.benchmarkLayer)&&
  Objects.equals(this.benchmarkAction, objDebugServiceEngine.benchmarkAction)&&
  Objects.equals(this.benchmarkOption, objDebugServiceEngine.benchmarkOption)&&
  Objects.equals(this.benchmarkRssHash, objDebugServiceEngine.benchmarkRssHash)&&
  Objects.equals(this.traceMemory, objDebugServiceEngine.traceMemory)&&
  Objects.equals(this.enableRpcTimingProfiler, objDebugServiceEngine.enableRpcTimingProfiler)&&
  Objects.equals(this.capturePktFilter, objDebugServiceEngine.capturePktFilter)&&
  Objects.equals(this.tenantRef, objDebugServiceEngine.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DebugServiceEngine {\n");
      sb.append("    benchmarkAction: ").append(toIndentedString(benchmarkAction)).append("\n");
        sb.append("    benchmarkLayer: ").append(toIndentedString(benchmarkLayer)).append("\n");
        sb.append("    benchmarkOption: ").append(toIndentedString(benchmarkOption)).append("\n");
        sb.append("    benchmarkRssHash: ").append(toIndentedString(benchmarkRssHash)).append("\n");
        sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
        sb.append("    captureFilters: ").append(toIndentedString(captureFilters)).append("\n");
        sb.append("    captureParams: ").append(toIndentedString(captureParams)).append("\n");
        sb.append("    capturePktFilter: ").append(toIndentedString(capturePktFilter)).append("\n");
        sb.append("    cpuShares: ").append(toIndentedString(cpuShares)).append("\n");
        sb.append("    debugIp: ").append(toIndentedString(debugIp)).append("\n");
        sb.append("    enableKdump: ").append(toIndentedString(enableKdump)).append("\n");
        sb.append("    enableRpcTimingProfiler: ").append(toIndentedString(enableRpcTimingProfiler)).append("\n");
        sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
        sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    seagentDebug: ").append(toIndentedString(seagentDebug)).append("\n");
        sb.append("    selogagentDebug: ").append(toIndentedString(selogagentDebug)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    traceMemory: ").append(toIndentedString(traceMemory)).append("\n");
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

