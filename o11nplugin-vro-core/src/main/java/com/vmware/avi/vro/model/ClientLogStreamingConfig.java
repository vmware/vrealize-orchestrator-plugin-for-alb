package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ClientLogStreamingFormat;
import com.vmware.avi.vro.model.StreamingSyslogConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * ClientLogStreamingConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ClientLogStreamingConfig")
@VsoFinder(name = Constants.FINDER_VRO_CLIENTLOGSTREAMINGCONFIG, idAccessor = "getObjectID()")
@Service
public class ClientLogStreamingConfig extends AviRestResource  {
  @JsonProperty("external_server")
  private String externalServer = null;

  @JsonProperty("external_server_port")
  private Integer externalServerPort = 514;

  @JsonProperty("format_config")
  private ClientLogStreamingFormat formatConfig = null;

  @JsonProperty("log_types_to_send")
  private String logTypesToSend = "LOGS_ALL";

  @JsonProperty("max_logs_per_second")
  private Integer maxLogsPerSecond = 100;

  @JsonProperty("protocol")
  private String protocol = "LOG_STREAMING_PROTOCOL_UDP";

  @JsonProperty("syslog_config")
  private StreamingSyslogConfig syslogConfig = null;

  
  /**
   * IP address or hostnames (FQDNs) of destination servers. If an FQDN is provided, this should be resolvable on Avi Service Engines. Multiple servers are supported by furnishing a comma-separated list of IP addresses or host names, for example, 11.11.11.11,23.12.12.4. Optionally, a separate port can be specified for each external server in the list, for example, 11.11.11.11 234,12.12.12.12 343. Field introduced in 17.1.1.
   * @return externalServer
  **/
  @ApiModelProperty(required = true, value = "IP address or hostnames (FQDNs) of destination servers. If an FQDN is provided, this should be resolvable on Avi Service Engines. Multiple servers are supported by furnishing a comma-separated list of IP addresses or host names, for example, 11.11.11.11,23.12.12.4. Optionally, a separate port can be specified for each external server in the list, for example, 11.11.11.11 234,12.12.12.12 343. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getExternalServer() {
    return externalServer;
  }
    
  @VsoMethod
  public void setExternalServer(String externalServer) {
    this.externalServer = externalServer;
  }

  
  /**
   * The service port to use for the external servers. If multiple external servers have been specified, the single port number specified here will apply to all those servers for which an explicit port number has not been specified in the external server list. Field introduced in 17.1.1.
   * @return externalServerPort
  **/
  @ApiModelProperty(value = "The service port to use for the external servers. If multiple external servers have been specified, the single port number specified here will apply to all those servers for which an explicit port number has not been specified in the external server list. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getExternalServerPort() {
    return externalServerPort;
  }
    
  @VsoMethod
  public void setExternalServerPort(Integer externalServerPort) {
    this.externalServerPort = externalServerPort;
  }

  
  /**
   * Configuration to specify the format of streamed logs. By default, each log is encoded in JSON format. Field introduced in 18.2.5.
   * @return formatConfig
  **/
  @ApiModelProperty(value = "Configuration to specify the format of streamed logs. By default, each log is encoded in JSON format. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public ClientLogStreamingFormat getFormatConfig() {
    return formatConfig;
  }
    
  @VsoMethod
  public void setFormatConfig(ClientLogStreamingFormat formatConfig) {
    this.formatConfig = formatConfig;
  }

  
  /**
   * Type of logs to stream to the external server. Default is LOGS_ALL, i.e., send all logs. Enum options - LOGS_SIGNIFICANT_ONLY, LOGS_UDF_ONLY, LOGS_UDF_SIGNIFICANT, LOGS_ALL. Field introduced in 17.1.1.
   * @return logTypesToSend
  **/
  @ApiModelProperty(value = "Type of logs to stream to the external server. Default is LOGS_ALL, i.e., send all logs. Enum options - LOGS_SIGNIFICANT_ONLY, LOGS_UDF_ONLY, LOGS_UDF_SIGNIFICANT, LOGS_ALL. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getLogTypesToSend() {
    return logTypesToSend;
  }
    
  @VsoMethod
  public void setLogTypesToSend(String logTypesToSend) {
    this.logTypesToSend = logTypesToSend;
  }

  
  /**
   * Maximum number of logs per second streamed to the remote server. By default, 100 logs per second are streamed. Set this to zero(0) to not enforce any limit. Field introduced in 17.1.1.
   * @return maxLogsPerSecond
  **/
  @ApiModelProperty(value = "Maximum number of logs per second streamed to the remote server. By default, 100 logs per second are streamed. Set this to zero(0) to not enforce any limit. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getMaxLogsPerSecond() {
    return maxLogsPerSecond;
  }
    
  @VsoMethod
  public void setMaxLogsPerSecond(Integer maxLogsPerSecond) {
    this.maxLogsPerSecond = maxLogsPerSecond;
  }

  
  /**
   * Protocol to use for streaming logs. Enum options - LOG_STREAMING_PROTOCOL_UDP, LOG_STREAMING_PROTOCOL_SYSLOG_OVER_UDP, LOG_STREAMING_PROTOCOL_TCP, LOG_STREAMING_PROTOCOL_SYSLOG_OVER_TCP, LOG_STREAMING_PROTOCOL_RAW_OVER_UDP. Field introduced in 18.1.1.
   * @return protocol
  **/
  @ApiModelProperty(value = "Protocol to use for streaming logs. Enum options - LOG_STREAMING_PROTOCOL_UDP, LOG_STREAMING_PROTOCOL_SYSLOG_OVER_UDP, LOG_STREAMING_PROTOCOL_TCP, LOG_STREAMING_PROTOCOL_SYSLOG_OVER_TCP, LOG_STREAMING_PROTOCOL_RAW_OVER_UDP. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public String getProtocol() {
    return protocol;
  }
    
  @VsoMethod
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  
  /**
   * Syslog configuration if a Syslog-based protocol is specified for streaming. Field introduced in 18.1.1.
   * @return syslogConfig
  **/
  @ApiModelProperty(value = "Syslog configuration if a Syslog-based protocol is specified for streaming. Field introduced in 18.1.1.")

  @Valid

 
  @VsoMethod  
  public StreamingSyslogConfig getSyslogConfig() {
    return syslogConfig;
  }
    
  @VsoMethod
  public void setSyslogConfig(StreamingSyslogConfig syslogConfig) {
    this.syslogConfig = syslogConfig;
  }

  
  public String getObjectID() {
		return "ClientLogStreamingConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientLogStreamingConfig clientLogStreamingConfig = (ClientLogStreamingConfig) o;
    return Objects.equals(this.externalServer, clientLogStreamingConfig.externalServer) &&
        Objects.equals(this.externalServerPort, clientLogStreamingConfig.externalServerPort) &&
        Objects.equals(this.formatConfig, clientLogStreamingConfig.formatConfig) &&
        Objects.equals(this.logTypesToSend, clientLogStreamingConfig.logTypesToSend) &&
        Objects.equals(this.maxLogsPerSecond, clientLogStreamingConfig.maxLogsPerSecond) &&
        Objects.equals(this.protocol, clientLogStreamingConfig.protocol) &&
        Objects.equals(this.syslogConfig, clientLogStreamingConfig.syslogConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalServer, externalServerPort, formatConfig, logTypesToSend, maxLogsPerSecond, protocol, syslogConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientLogStreamingConfig {\n");
    
    sb.append("    externalServer: ").append(toIndentedString(externalServer)).append("\n");
    sb.append("    externalServerPort: ").append(toIndentedString(externalServerPort)).append("\n");
    sb.append("    formatConfig: ").append(toIndentedString(formatConfig)).append("\n");
    sb.append("    logTypesToSend: ").append(toIndentedString(logTypesToSend)).append("\n");
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

