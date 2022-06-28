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
 * The DSRequestLog is a POJO class extends AviRestResource that used for creating
 * DSRequestLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DSRequestLog")
@VsoFinder(name = Constants.FINDER_VRO_DSREQUESTLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DSRequestLog extends AviRestResource {
    @JsonProperty("ds_name")
    @JsonInclude(Include.NON_NULL)
    private String dsName = null;

    @JsonProperty("event")
    @JsonInclude(Include.NON_NULL)
    private String event = null;

    @JsonProperty("headers_received_from_server")
    @JsonInclude(Include.NON_NULL)
    private String headersReceivedFromServer = null;

    @JsonProperty("headers_sent_to_server")
    @JsonInclude(Include.NON_NULL)
    private String headersSentToServer = null;

    @JsonProperty("http_response_code")
    @JsonInclude(Include.NON_NULL)
    private Integer httpResponseCode = null;

    @JsonProperty("http_version")
    @JsonInclude(Include.NON_NULL)
    private String httpVersion = null;

    @JsonProperty("method")
    @JsonInclude(Include.NON_NULL)
    private String method = null;

    @JsonProperty("pool_name")
    @JsonInclude(Include.NON_NULL)
    private String poolName = null;

    @JsonProperty("pool_uuid")
    @JsonInclude(Include.NON_NULL)
    private String poolUuid = null;

    @JsonProperty("request_length")
    @JsonInclude(Include.NON_NULL)
    private Integer requestLength = null;

    @JsonProperty("response_length")
    @JsonInclude(Include.NON_NULL)
    private Integer responseLength = null;

    @JsonProperty("server_ip")
    @JsonInclude(Include.NON_NULL)
    private Integer serverIp = null;

    @JsonProperty("server_name")
    @JsonInclude(Include.NON_NULL)
    private String serverName = null;

    @JsonProperty("server_port")
    @JsonInclude(Include.NON_NULL)
    private Integer serverPort = null;

    @JsonProperty("servers_tried")
    @JsonInclude(Include.NON_NULL)
    private Integer serversTried = 0;

    @JsonProperty("source_port")
    @JsonInclude(Include.NON_NULL)
    private Integer sourcePort = null;

    @JsonProperty("total_time")
    @JsonInclude(Include.NON_NULL)
    private Integer totalTime = null;

    @JsonProperty("uri_path")
    @JsonInclude(Include.NON_NULL)
    private String uriPath = null;

    @JsonProperty("uri_query")
    @JsonInclude(Include.NON_NULL)
    private String uriQuery = null;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the datascript where this request was called.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dsName
   */
  @VsoMethod
  public String getDsName() {
    return dsName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the datascript where this request was called.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dsName set the dsName.
   */
  @VsoMethod
  public void setDsName(String  dsName) {
    this.dsName = dsName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Datascript event where out-of-band request was sent.
   * Enum options - VS_DATASCRIPT_EVT_HTTP_REQ, VS_DATASCRIPT_EVT_HTTP_RESP, VS_DATASCRIPT_EVT_HTTP_RESP_DATA, VS_DATASCRIPT_EVT_HTTP_LB_FAILED,
   * VS_DATASCRIPT_EVT_HTTP_REQ_DATA, VS_DATASCRIPT_EVT_HTTP_RESP_FAILED, VS_DATASCRIPT_EVT_HTTP_LB_DONE, VS_DATASCRIPT_EVT_HTTP_AUTH,
   * VS_DATASCRIPT_EVT_HTTP_POST_AUTH, VS_DATASCRIPT_EVT_TCP_CLIENT_ACCEPT, VS_DATASCRIPT_EVT_SSL_HANDSHAKE_DONE,
   * VS_DATASCRIPT_EVT_CLIENT_SSL_PRE_CONNECT, VS_DATASCRIPT_EVT_CLIENT_SSL_CLIENT_HELLO, VS_DATASCRIPT_EVT_DNS_REQ, VS_DATASCRIPT_EVT_DNS_RESP,
   * VS_DATASCRIPT_EVT_L4_REQUEST, VS_DATASCRIPT_EVT_L4_RESPONSE, VS_DATASCRIPT_EVT_MAX.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return event
   */
  @VsoMethod
  public String getEvent() {
    return event;
  }

  /**
   * This is the setter method to the attribute.
   * Datascript event where out-of-band request was sent.
   * Enum options - VS_DATASCRIPT_EVT_HTTP_REQ, VS_DATASCRIPT_EVT_HTTP_RESP, VS_DATASCRIPT_EVT_HTTP_RESP_DATA, VS_DATASCRIPT_EVT_HTTP_LB_FAILED,
   * VS_DATASCRIPT_EVT_HTTP_REQ_DATA, VS_DATASCRIPT_EVT_HTTP_RESP_FAILED, VS_DATASCRIPT_EVT_HTTP_LB_DONE, VS_DATASCRIPT_EVT_HTTP_AUTH,
   * VS_DATASCRIPT_EVT_HTTP_POST_AUTH, VS_DATASCRIPT_EVT_TCP_CLIENT_ACCEPT, VS_DATASCRIPT_EVT_SSL_HANDSHAKE_DONE,
   * VS_DATASCRIPT_EVT_CLIENT_SSL_PRE_CONNECT, VS_DATASCRIPT_EVT_CLIENT_SSL_CLIENT_HELLO, VS_DATASCRIPT_EVT_DNS_REQ, VS_DATASCRIPT_EVT_DNS_RESP,
   * VS_DATASCRIPT_EVT_L4_REQUEST, VS_DATASCRIPT_EVT_L4_RESPONSE, VS_DATASCRIPT_EVT_MAX.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param event set the event.
   */
  @VsoMethod
  public void setEvent(String  event) {
    this.event = event;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Response headers received from the server.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return headersReceivedFromServer
   */
  @VsoMethod
  public String getHeadersReceivedFromServer() {
    return headersReceivedFromServer;
  }

  /**
   * This is the setter method to the attribute.
   * Response headers received from the server.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param headersReceivedFromServer set the headersReceivedFromServer.
   */
  @VsoMethod
  public void setHeadersReceivedFromServer(String  headersReceivedFromServer) {
    this.headersReceivedFromServer = headersReceivedFromServer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request headers sent to the server.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return headersSentToServer
   */
  @VsoMethod
  public String getHeadersSentToServer() {
    return headersSentToServer;
  }

  /**
   * This is the setter method to the attribute.
   * Request headers sent to the server.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param headersSentToServer set the headersSentToServer.
   */
  @VsoMethod
  public void setHeadersSentToServer(String  headersSentToServer) {
    this.headersSentToServer = headersSentToServer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The http response code received from the external server.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpResponseCode
   */
  @VsoMethod
  public Integer getHttpResponseCode() {
    return httpResponseCode;
  }

  /**
   * This is the setter method to the attribute.
   * The http response code received from the external server.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param httpResponseCode set the httpResponseCode.
   */
  @VsoMethod
  public void setHttpResponseCode(Integer  httpResponseCode) {
    this.httpResponseCode = httpResponseCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The http version of the out-of-band request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpVersion
   */
  @VsoMethod
  public String getHttpVersion() {
    return httpVersion;
  }

  /**
   * This is the setter method to the attribute.
   * The http version of the out-of-band request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param httpVersion set the httpVersion.
   */
  @VsoMethod
  public void setHttpVersion(String  httpVersion) {
    this.httpVersion = httpVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The http method of the out-of-band request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return method
   */
  @VsoMethod
  public String getMethod() {
    return method;
  }

  /**
   * This is the setter method to the attribute.
   * The http method of the out-of-band request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param method set the method.
   */
  @VsoMethod
  public void setMethod(String  method) {
    this.method = method;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the pool that was used for the request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolName
   */
  @VsoMethod
  public String getPoolName() {
    return poolName;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the pool that was used for the request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolName set the poolName.
   */
  @VsoMethod
  public void setPoolName(String  poolName) {
    this.poolName = poolName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The uuid of the pool that was used for the request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolUuid
   */
  @VsoMethod
  public String getPoolUuid() {
    return poolUuid;
  }

  /**
   * This is the setter method to the attribute.
   * The uuid of the pool that was used for the request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolUuid set the poolUuid.
   */
  @VsoMethod
  public void setPoolUuid(String  poolUuid) {
    this.poolUuid = poolUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Length of the request sent in bytes.
   * Field introduced in 20.1.3.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestLength
   */
  @VsoMethod
  public Integer getRequestLength() {
    return requestLength;
  }

  /**
   * This is the setter method to the attribute.
   * Length of the request sent in bytes.
   * Field introduced in 20.1.3.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param requestLength set the requestLength.
   */
  @VsoMethod
  public void setRequestLength(Integer  requestLength) {
    this.requestLength = requestLength;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Length of the response received in bytes.
   * Field introduced in 20.1.3.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return responseLength
   */
  @VsoMethod
  public Integer getResponseLength() {
    return responseLength;
  }

  /**
   * This is the setter method to the attribute.
   * Length of the response received in bytes.
   * Field introduced in 20.1.3.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param responseLength set the responseLength.
   */
  @VsoMethod
  public void setResponseLength(Integer  responseLength) {
    this.responseLength = responseLength;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The ip of the server that was used for the request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverIp
   */
  @VsoMethod
  public Integer getServerIp() {
    return serverIp;
  }

  /**
   * This is the setter method to the attribute.
   * The ip of the server that was used for the request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverIp set the serverIp.
   */
  @VsoMethod
  public void setServerIp(Integer  serverIp) {
    this.serverIp = serverIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the server that was used for the request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverName
   */
  @VsoMethod
  public String getServerName() {
    return serverName;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the server that was used for the request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverName set the serverName.
   */
  @VsoMethod
  public void setServerName(String  serverName) {
    this.serverName = serverName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The port of the server that was used for the request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverPort
   */
  @VsoMethod
  public Integer getServerPort() {
    return serverPort;
  }

  /**
   * This is the setter method to the attribute.
   * The port of the server that was used for the request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverPort set the serverPort.
   */
  @VsoMethod
  public void setServerPort(Integer  serverPort) {
    this.serverPort = serverPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of servers tried during server reselect before the response is sent back.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return serversTried
   */
  @VsoMethod
  public Integer getServersTried() {
    return serversTried;
  }

  /**
   * This is the setter method to the attribute.
   * Number of servers tried during server reselect before the response is sent back.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param serversTried set the serversTried.
   */
  @VsoMethod
  public void setServersTried(Integer  serversTried) {
    this.serversTried = serversTried;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The source port for this request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sourcePort
   */
  @VsoMethod
  public Integer getSourcePort() {
    return sourcePort;
  }

  /**
   * This is the setter method to the attribute.
   * The source port for this request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sourcePort set the sourcePort.
   */
  @VsoMethod
  public void setSourcePort(Integer  sourcePort) {
    this.sourcePort = sourcePort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total time taken to process the out-of-band request.
   * This is the time taken from the 1st byte of the request sent to the last byte of the response received.
   * Field introduced in 20.1.3.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalTime
   */
  @VsoMethod
  public Integer getTotalTime() {
    return totalTime;
  }

  /**
   * This is the setter method to the attribute.
   * Total time taken to process the out-of-band request.
   * This is the time taken from the 1st byte of the request sent to the last byte of the response received.
   * Field introduced in 20.1.3.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalTime set the totalTime.
   */
  @VsoMethod
  public void setTotalTime(Integer  totalTime) {
    this.totalTime = totalTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The uri path of the out-of-band request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uriPath
   */
  @VsoMethod
  public String getUriPath() {
    return uriPath;
  }

  /**
   * This is the setter method to the attribute.
   * The uri path of the out-of-band request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uriPath set the uriPath.
   */
  @VsoMethod
  public void setUriPath(String  uriPath) {
    this.uriPath = uriPath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The uri query of the out-of-band request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uriQuery
   */
  @VsoMethod
  public String getUriQuery() {
    return uriQuery;
  }

  /**
   * This is the setter method to the attribute.
   * The uri query of the out-of-band request.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uriQuery set the uriQuery.
   */
  @VsoMethod
  public void setUriQuery(String  uriQuery) {
    this.uriQuery = uriQuery;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DSRequestLog objDSRequestLog = (DSRequestLog) o;
  return   Objects.equals(this.dsName, objDSRequestLog.dsName)&&
  Objects.equals(this.event, objDSRequestLog.event)&&
  Objects.equals(this.httpResponseCode, objDSRequestLog.httpResponseCode)&&
  Objects.equals(this.httpVersion, objDSRequestLog.httpVersion)&&
  Objects.equals(this.method, objDSRequestLog.method)&&
  Objects.equals(this.uriPath, objDSRequestLog.uriPath)&&
  Objects.equals(this.uriQuery, objDSRequestLog.uriQuery)&&
  Objects.equals(this.poolName, objDSRequestLog.poolName)&&
  Objects.equals(this.poolUuid, objDSRequestLog.poolUuid)&&
  Objects.equals(this.serverName, objDSRequestLog.serverName)&&
  Objects.equals(this.serverIp, objDSRequestLog.serverIp)&&
  Objects.equals(this.serverPort, objDSRequestLog.serverPort)&&
  Objects.equals(this.sourcePort, objDSRequestLog.sourcePort)&&
  Objects.equals(this.serversTried, objDSRequestLog.serversTried)&&
  Objects.equals(this.headersSentToServer, objDSRequestLog.headersSentToServer)&&
  Objects.equals(this.headersReceivedFromServer, objDSRequestLog.headersReceivedFromServer)&&
  Objects.equals(this.requestLength, objDSRequestLog.requestLength)&&
  Objects.equals(this.responseLength, objDSRequestLog.responseLength)&&
  Objects.equals(this.totalTime, objDSRequestLog.totalTime);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DSRequestLog {\n");
      sb.append("    dsName: ").append(toIndentedString(dsName)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    headersReceivedFromServer: ").append(toIndentedString(headersReceivedFromServer)).append("\n");
        sb.append("    headersSentToServer: ").append(toIndentedString(headersSentToServer)).append("\n");
        sb.append("    httpResponseCode: ").append(toIndentedString(httpResponseCode)).append("\n");
        sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    poolUuid: ").append(toIndentedString(poolUuid)).append("\n");
        sb.append("    requestLength: ").append(toIndentedString(requestLength)).append("\n");
        sb.append("    responseLength: ").append(toIndentedString(responseLength)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
        sb.append("    serversTried: ").append(toIndentedString(serversTried)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
        sb.append("    uriPath: ").append(toIndentedString(uriPath)).append("\n");
        sb.append("    uriQuery: ").append(toIndentedString(uriQuery)).append("\n");
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

