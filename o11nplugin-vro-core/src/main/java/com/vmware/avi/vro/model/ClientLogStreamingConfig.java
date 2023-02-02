package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ClientLogStreamingFormat;
import com.vmware.avi.vro.model.StreamingSyslogConfig;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ClientLogStreamingConfig is a POJO class extends AviRestResource that used for creating
 * ClientLogStreamingConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ClientLogStreamingConfig")
@VsoFinder(name = Constants.FINDER_VRO_CLIENTLOGSTREAMINGCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ClientLogStreamingConfig extends AviRestResource {
    @JsonProperty("external_server")
    @JsonInclude(Include.NON_NULL)
    private String externalServer = null;

    @JsonProperty("external_server_port")
    @JsonInclude(Include.NON_NULL)
    private Integer externalServerPort = 514;

    @JsonProperty("format_config")
    @JsonInclude(Include.NON_NULL)
    private ClientLogStreamingFormat formatConfig = null;

    @JsonProperty("log_types_to_send")
    @JsonInclude(Include.NON_NULL)
    private String logTypesToSend = "LOGS_ALL";

    @JsonProperty("marker_keys")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markerKeys = null;

    @JsonProperty("max_logs_per_second")
    @JsonInclude(Include.NON_NULL)
    private Integer maxLogsPerSecond = 100;

    @JsonProperty("protocol")
    @JsonInclude(Include.NON_NULL)
    private String protocol = "LOG_STREAMING_PROTOCOL_UDP";

    @JsonProperty("syslog_config")
    @JsonInclude(Include.NON_NULL)
    private StreamingSyslogConfig syslogConfig = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ip address or hostnames (fqdns) of destination servers.
   * If an fqdn is provided, this should be resolvable on avi service engines.
   * Multiple servers are supported by furnishing a comma-separated list of ip addresses or host names, for example, 11.11.11.11,23.12.12.4,2001 123
   * 1.
   * Optionally, a separate port can be specified for each external server in the list, for example,11.11.11.11 234,12.12.12.12 343,[2001 123  1] 234.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return externalServer
   */
  @VsoMethod
  public String getExternalServer() {
    return externalServer;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address or hostnames (fqdns) of destination servers.
   * If an fqdn is provided, this should be resolvable on avi service engines.
   * Multiple servers are supported by furnishing a comma-separated list of ip addresses or host names, for example, 11.11.11.11,23.12.12.4,2001 123
   * 1.
   * Optionally, a separate port can be specified for each external server in the list, for example,11.11.11.11 234,12.12.12.12 343,[2001 123  1] 234.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param externalServer set the externalServer.
   */
  @VsoMethod
  public void setExternalServer(String  externalServer) {
    this.externalServer = externalServer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The service port to use for the external servers.
   * If multiple external servers have been specified, the single port number specified here will apply to all those servers for which an explicit
   * port number has not been specified in the external server list.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 514.
   * @return externalServerPort
   */
  @VsoMethod
  public Integer getExternalServerPort() {
    return externalServerPort;
  }

  /**
   * This is the setter method to the attribute.
   * The service port to use for the external servers.
   * If multiple external servers have been specified, the single port number specified here will apply to all those servers for which an explicit
   * port number has not been specified in the external server list.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 514.
   * @param externalServerPort set the externalServerPort.
   */
  @VsoMethod
  public void setExternalServerPort(Integer  externalServerPort) {
    this.externalServerPort = externalServerPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configuration to specify the format of streamed logs.
   * By default, each log is encoded in json format.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return formatConfig
   */
  @VsoMethod
  public ClientLogStreamingFormat getFormatConfig() {
    return formatConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Configuration to specify the format of streamed logs.
   * By default, each log is encoded in json format.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param formatConfig set the formatConfig.
   */
  @VsoMethod
  public void setFormatConfig(ClientLogStreamingFormat formatConfig) {
    this.formatConfig = formatConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of logs to stream to the external server.
   * Default is logs_all, i.e., send all logs.
   * Enum options - LOGS_SIGNIFICANT_ONLY, LOGS_UDF_ONLY, LOGS_UDF_SIGNIFICANT, LOGS_ALL.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOGS_ALL".
   * @return logTypesToSend
   */
  @VsoMethod
  public String getLogTypesToSend() {
    return logTypesToSend;
  }

  /**
   * This is the setter method to the attribute.
   * Type of logs to stream to the external server.
   * Default is logs_all, i.e., send all logs.
   * Enum options - LOGS_SIGNIFICANT_ONLY, LOGS_UDF_ONLY, LOGS_UDF_SIGNIFICANT, LOGS_ALL.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOGS_ALL".
   * @param logTypesToSend set the logTypesToSend.
   */
  @VsoMethod
  public void setLogTypesToSend(String  logTypesToSend) {
    this.logTypesToSend = logTypesToSend;
  }

  /**
   * This is the getter method this will return the attribute value.
   * One or more keys which should exist in virtualservice rbac markers.
   * Key along with values will be streamed out in log.
   * If key is not found in rbac markers, it will not be streamed.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markerKeys
   */
  @VsoMethod
  public List<RoleFilterMatchLabel> getMarkerKeys() {
    return markerKeys;
  }

  /**
   * This is the setter method. this will set the markerKeys
   * One or more keys which should exist in virtualservice rbac markers.
   * Key along with values will be streamed out in log.
   * If key is not found in rbac markers, it will not be streamed.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markerKeys
   */
  @VsoMethod
  public void setMarkerKeys(List<RoleFilterMatchLabel>  markerKeys) {
    this.markerKeys = markerKeys;
  }

  /**
   * This is the setter method this will set the markerKeys
   * One or more keys which should exist in virtualservice rbac markers.
   * Key along with values will be streamed out in log.
   * If key is not found in rbac markers, it will not be streamed.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markerKeys
   */
  @VsoMethod
  public ClientLogStreamingConfig addMarkerKeysItem(RoleFilterMatchLabel markerKeysItem) {
    if (this.markerKeys == null) {
      this.markerKeys = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markerKeys.add(markerKeysItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of logs per second streamed to the remote server.
   * By default, 100 logs per second are streamed.
   * Set this to zero(0) to not enforce any limit.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return maxLogsPerSecond
   */
  @VsoMethod
  public Integer getMaxLogsPerSecond() {
    return maxLogsPerSecond;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of logs per second streamed to the remote server.
   * By default, 100 logs per second are streamed.
   * Set this to zero(0) to not enforce any limit.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param maxLogsPerSecond set the maxLogsPerSecond.
   */
  @VsoMethod
  public void setMaxLogsPerSecond(Integer  maxLogsPerSecond) {
    this.maxLogsPerSecond = maxLogsPerSecond;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Protocol to use for streaming logs.
   * Enum options - LOG_STREAMING_PROTOCOL_UDP, LOG_STREAMING_PROTOCOL_SYSLOG_OVER_UDP, LOG_STREAMING_PROTOCOL_TCP,
   * LOG_STREAMING_PROTOCOL_SYSLOG_OVER_TCP, LOG_STREAMING_PROTOCOL_RAW_OVER_UDP, LOG_STREAMING_PROTOCOL_TLS, LOG_STREAMING_PROTOCOL_SYSLOG_OVER_TLS.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOG_STREAMING_PROTOCOL_UDP".
   * @return protocol
   */
  @VsoMethod
  public String getProtocol() {
    return protocol;
  }

  /**
   * This is the setter method to the attribute.
   * Protocol to use for streaming logs.
   * Enum options - LOG_STREAMING_PROTOCOL_UDP, LOG_STREAMING_PROTOCOL_SYSLOG_OVER_UDP, LOG_STREAMING_PROTOCOL_TCP,
   * LOG_STREAMING_PROTOCOL_SYSLOG_OVER_TCP, LOG_STREAMING_PROTOCOL_RAW_OVER_UDP, LOG_STREAMING_PROTOCOL_TLS, LOG_STREAMING_PROTOCOL_SYSLOG_OVER_TLS.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOG_STREAMING_PROTOCOL_UDP".
   * @param protocol set the protocol.
   */
  @VsoMethod
  public void setProtocol(String  protocol) {
    this.protocol = protocol;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Syslog configuration if a syslog-based protocol is specified for streaming.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return syslogConfig
   */
  @VsoMethod
  public StreamingSyslogConfig getSyslogConfig() {
    return syslogConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Syslog configuration if a syslog-based protocol is specified for streaming.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param syslogConfig set the syslogConfig.
   */
  @VsoMethod
  public void setSyslogConfig(StreamingSyslogConfig syslogConfig) {
    this.syslogConfig = syslogConfig;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ClientLogStreamingConfig objClientLogStreamingConfig = (ClientLogStreamingConfig) o;
  return   Objects.equals(this.externalServer, objClientLogStreamingConfig.externalServer)&&
  Objects.equals(this.externalServerPort, objClientLogStreamingConfig.externalServerPort)&&
  Objects.equals(this.protocol, objClientLogStreamingConfig.protocol)&&
  Objects.equals(this.logTypesToSend, objClientLogStreamingConfig.logTypesToSend)&&
  Objects.equals(this.maxLogsPerSecond, objClientLogStreamingConfig.maxLogsPerSecond)&&
  Objects.equals(this.syslogConfig, objClientLogStreamingConfig.syslogConfig)&&
  Objects.equals(this.formatConfig, objClientLogStreamingConfig.formatConfig)&&
  Objects.equals(this.markerKeys, objClientLogStreamingConfig.markerKeys);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ClientLogStreamingConfig {\n");
      sb.append("    externalServer: ").append(toIndentedString(externalServer)).append("\n");
        sb.append("    externalServerPort: ").append(toIndentedString(externalServerPort)).append("\n");
        sb.append("    formatConfig: ").append(toIndentedString(formatConfig)).append("\n");
        sb.append("    logTypesToSend: ").append(toIndentedString(logTypesToSend)).append("\n");
        sb.append("    markerKeys: ").append(toIndentedString(markerKeys)).append("\n");
        sb.append("    maxLogsPerSecond: ").append(toIndentedString(maxLogsPerSecond)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    syslogConfig: ").append(toIndentedString(syslogConfig)).append("\n");
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

