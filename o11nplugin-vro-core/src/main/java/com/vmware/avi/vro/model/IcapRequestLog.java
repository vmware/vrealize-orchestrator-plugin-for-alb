package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The IcapRequestLog is a POJO class extends AviRestResource that used for creating
 * IcapRequestLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IcapRequestLog")
@VsoFinder(name = Constants.FINDER_VRO_ICAPREQUESTLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IcapRequestLog extends AviRestResource {
  @JsonProperty("action")
  @JsonInclude(Include.NON_NULL)
  private String action = null;

  @JsonProperty("complete_body_sent")
  @JsonInclude(Include.NON_NULL)
  private Boolean completeBodySent = null;

  @JsonProperty("http_method")
  @JsonInclude(Include.NON_NULL)
  private String httpMethod = null;

  @JsonProperty("http_response_code")
  @JsonInclude(Include.NON_NULL)
  private Integer httpResponseCode = null;

  @JsonProperty("icap_absolute_uri")
  @JsonInclude(Include.NON_NULL)
  private String icapAbsoluteUri = null;

  @JsonProperty("icap_headers_received_from_server")
  @JsonInclude(Include.NON_NULL)
  private String icapHeadersReceivedFromServer = null;

  @JsonProperty("icap_headers_sent_to_server")
  @JsonInclude(Include.NON_NULL)
  private String icapHeadersSentToServer = null;

  @JsonProperty("icap_method")
  @JsonInclude(Include.NON_NULL)
  private String icapMethod = null;

  @JsonProperty("icap_response_code")
  @JsonInclude(Include.NON_NULL)
  private Integer icapResponseCode = null;

  @JsonProperty("latency")
  @JsonInclude(Include.NON_NULL)
  private Integer latency = null;

  @JsonProperty("modified_content_length")
  @JsonInclude(Include.NON_NULL)
  private Integer modifiedContentLength = null;

  @JsonProperty("pool_name")
  @JsonInclude(Include.NON_NULL)
  private String poolName = null;

  @JsonProperty("pool_uuid")
  @JsonInclude(Include.NON_NULL)
  private String poolUuid = null;

  @JsonProperty("reason")
  @JsonInclude(Include.NON_NULL)
  private String reason = null;

  @JsonProperty("server_ip")
  @JsonInclude(Include.NON_NULL)
  private IpAddr serverIp = null;

  @JsonProperty("source_port")
  @JsonInclude(Include.NON_NULL)
  private Integer sourcePort = null;

  @JsonProperty("threat_description")
  @JsonInclude(Include.NON_NULL)
  private String threatDescription = null;

  @JsonProperty("threat_id")
  @JsonInclude(Include.NON_NULL)
  private String threatId = null;



  /**
   * This is the getter method this will return the attribute value.
   * Denotes whether the content was processed by icap server and an action was taken.
   * Enum options - ICAP_DISABLED, ICAP_PASSED, ICAP_MODIFIED, ICAP_BLOCKED, ICAP_FAILED.
   * Field introduced in 20.1.1.
   * @return action
   */
  @VsoMethod
  public String getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Denotes whether the content was processed by icap server and an action was taken.
   * Enum options - ICAP_DISABLED, ICAP_PASSED, ICAP_MODIFIED, ICAP_BLOCKED, ICAP_FAILED.
   * Field introduced in 20.1.1.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(String  action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Complete request body from client was sent to the icap server.
   * Field introduced in 20.1.1.
   * @return completeBodySent
   */
  @VsoMethod
  public Boolean getCompleteBodySent() {
    return completeBodySent;
  }

  /**
   * This is the setter method to the attribute.
   * Complete request body from client was sent to the icap server.
   * Field introduced in 20.1.1.
   * @param completeBodySent set the completeBodySent.
   */
  @VsoMethod
  public void setCompleteBodySent(Boolean  completeBodySent) {
    this.completeBodySent = completeBodySent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The http method of the request.
   * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
   * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
   * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
   * Field introduced in 20.1.1.
   * @return httpMethod
   */
  @VsoMethod
  public String getHttpMethod() {
    return httpMethod;
  }

  /**
   * This is the setter method to the attribute.
   * The http method of the request.
   * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
   * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
   * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
   * Field introduced in 20.1.1.
   * @param httpMethod set the httpMethod.
   */
  @VsoMethod
  public void setHttpMethod(String  httpMethod) {
    this.httpMethod = httpMethod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The http response code received from the icap server.
   * Http response code is only available if content is blocked.
   * Field introduced in 20.1.1.
   * @return httpResponseCode
   */
  @VsoMethod
  public Integer getHttpResponseCode() {
    return httpResponseCode;
  }

  /**
   * This is the setter method to the attribute.
   * The http response code received from the icap server.
   * Http response code is only available if content is blocked.
   * Field introduced in 20.1.1.
   * @param httpResponseCode set the httpResponseCode.
   */
  @VsoMethod
  public void setHttpResponseCode(Integer  httpResponseCode) {
    this.httpResponseCode = httpResponseCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The absolute icap uri of the request.
   * Field introduced in 20.1.1.
   * @return icapAbsoluteUri
   */
  @VsoMethod
  public String getIcapAbsoluteUri() {
    return icapAbsoluteUri;
  }

  /**
   * This is the setter method to the attribute.
   * The absolute icap uri of the request.
   * Field introduced in 20.1.1.
   * @param icapAbsoluteUri set the icapAbsoluteUri.
   */
  @VsoMethod
  public void setIcapAbsoluteUri(String  icapAbsoluteUri) {
    this.icapAbsoluteUri = icapAbsoluteUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Icap response headers received from icap server.
   * Field introduced in 20.1.1.
   * @return icapHeadersReceivedFromServer
   */
  @VsoMethod
  public String getIcapHeadersReceivedFromServer() {
    return icapHeadersReceivedFromServer;
  }

  /**
   * This is the setter method to the attribute.
   * Icap response headers received from icap server.
   * Field introduced in 20.1.1.
   * @param icapHeadersReceivedFromServer set the icapHeadersReceivedFromServer.
   */
  @VsoMethod
  public void setIcapHeadersReceivedFromServer(String  icapHeadersReceivedFromServer) {
    this.icapHeadersReceivedFromServer = icapHeadersReceivedFromServer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Icap request headers sent to icap server.
   * Field introduced in 20.1.1.
   * @return icapHeadersSentToServer
   */
  @VsoMethod
  public String getIcapHeadersSentToServer() {
    return icapHeadersSentToServer;
  }

  /**
   * This is the setter method to the attribute.
   * Icap request headers sent to icap server.
   * Field introduced in 20.1.1.
   * @param icapHeadersSentToServer set the icapHeadersSentToServer.
   */
  @VsoMethod
  public void setIcapHeadersSentToServer(String  icapHeadersSentToServer) {
    this.icapHeadersSentToServer = icapHeadersSentToServer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The icap method of the request.
   * Enum options - ICAP_METHOD_REQMOD, ICAP_METHOD_RESPMOD.
   * Field introduced in 20.1.1.
   * @return icapMethod
   */
  @VsoMethod
  public String getIcapMethod() {
    return icapMethod;
  }

  /**
   * This is the setter method to the attribute.
   * The icap method of the request.
   * Enum options - ICAP_METHOD_REQMOD, ICAP_METHOD_RESPMOD.
   * Field introduced in 20.1.1.
   * @param icapMethod set the icapMethod.
   */
  @VsoMethod
  public void setIcapMethod(String  icapMethod) {
    this.icapMethod = icapMethod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The response code received from the icap server.
   * Field introduced in 20.1.1.
   * @return icapResponseCode
   */
  @VsoMethod
  public Integer getIcapResponseCode() {
    return icapResponseCode;
  }

  /**
   * This is the setter method to the attribute.
   * The response code received from the icap server.
   * Field introduced in 20.1.1.
   * @param icapResponseCode set the icapResponseCode.
   */
  @VsoMethod
  public void setIcapResponseCode(Integer  icapResponseCode) {
    this.icapResponseCode = icapResponseCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Latency added due to icap processing.
   * This is the time taken from 1st byte of icap request sent to last byte of icap response received.
   * Field introduced in 20.1.1.
   * @return latency
   */
  @VsoMethod
  public Integer getLatency() {
    return latency;
  }

  /**
   * This is the setter method to the attribute.
   * Latency added due to icap processing.
   * This is the time taken from 1st byte of icap request sent to last byte of icap response received.
   * Field introduced in 20.1.1.
   * @param latency set the latency.
   */
  @VsoMethod
  public void setLatency(Integer  latency) {
    this.latency = latency;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Content-length of the modified content from icap server.
   * Field introduced in 20.1.1.
   * @return modifiedContentLength
   */
  @VsoMethod
  public Integer getModifiedContentLength() {
    return modifiedContentLength;
  }

  /**
   * This is the setter method to the attribute.
   * Content-length of the modified content from icap server.
   * Field introduced in 20.1.1.
   * @param modifiedContentLength set the modifiedContentLength.
   */
  @VsoMethod
  public void setModifiedContentLength(Integer  modifiedContentLength) {
    this.modifiedContentLength = modifiedContentLength;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the pool that was used for the request.
   * Field introduced in 20.1.1.
   * @return poolName
   */
  @VsoMethod
  public String getPoolName() {
    return poolName;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the pool that was used for the request.
   * Field introduced in 20.1.1.
   * @param poolName set the poolName.
   */
  @VsoMethod
  public void setPoolName(String  poolName) {
    this.poolName = poolName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The uuis of the pool that was used for the request.
   * Field introduced in 20.1.1.
   * @return poolUuid
   */
  @VsoMethod
  public String getPoolUuid() {
    return poolUuid;
  }

  /**
   * This is the setter method to the attribute.
   * The uuis of the pool that was used for the request.
   * Field introduced in 20.1.1.
   * @param poolUuid set the poolUuid.
   */
  @VsoMethod
  public void setPoolUuid(String  poolUuid) {
    this.poolUuid = poolUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Blocking reason for the content.
   * It is available only if content was scanned by icap server and some violations were found.
   * Field introduced in 20.1.1.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Blocking reason for the content.
   * It is available only if content was scanned by icap server and some violations were found.
   * Field introduced in 20.1.1.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Icap server ip for this connection.
   * Field introduced in 20.1.1.
   * @return serverIp
   */
  @VsoMethod
  public IpAddr getServerIp() {
    return serverIp;
  }

  /**
   * This is the setter method to the attribute.
   * Icap server ip for this connection.
   * Field introduced in 20.1.1.
   * @param serverIp set the serverIp.
   */
  @VsoMethod
  public void setServerIp(IpAddr serverIp) {
    this.serverIp = serverIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Source port for this connection.
   * Field introduced in 20.1.1.
   * @return sourcePort
   */
  @VsoMethod
  public Integer getSourcePort() {
    return sourcePort;
  }

  /**
   * This is the setter method to the attribute.
   * Source port for this connection.
   * Field introduced in 20.1.1.
   * @param sourcePort set the sourcePort.
   */
  @VsoMethod
  public void setSourcePort(Integer  sourcePort) {
    this.sourcePort = sourcePort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Detailed description of the threat found in the content.
   * Available only if request was scanned by icap server and some violations were found.
   * Field introduced in 20.1.1.
   * @return threatDescription
   */
  @VsoMethod
  public String getThreatDescription() {
    return threatDescription;
  }

  /**
   * This is the setter method to the attribute.
   * Detailed description of the threat found in the content.
   * Available only if request was scanned by icap server and some violations were found.
   * Field introduced in 20.1.1.
   * @param threatDescription set the threatDescription.
   */
  @VsoMethod
  public void setThreatDescription(String  threatDescription) {
    this.threatDescription = threatDescription;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Short description of the threat found in the content.
   * Available only if content was scanned by icap server and some violations were found.
   * Field introduced in 20.1.1.
   * @return threatId
   */
  @VsoMethod
  public String getThreatId() {
    return threatId;
  }

  /**
   * This is the setter method to the attribute.
   * Short description of the threat found in the content.
   * Available only if content was scanned by icap server and some violations were found.
   * Field introduced in 20.1.1.
   * @param threatId set the threatId.
   */
  @VsoMethod
  public void setThreatId(String  threatId) {
    this.threatId = threatId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IcapRequestLog objIcapRequestLog = (IcapRequestLog) o;
  return   Objects.equals(this.icapResponseCode, objIcapRequestLog.icapResponseCode)&&
  Objects.equals(this.icapMethod, objIcapRequestLog.icapMethod)&&
  Objects.equals(this.httpResponseCode, objIcapRequestLog.httpResponseCode)&&
  Objects.equals(this.httpMethod, objIcapRequestLog.httpMethod)&&
  Objects.equals(this.icapAbsoluteUri, objIcapRequestLog.icapAbsoluteUri)&&
  Objects.equals(this.completeBodySent, objIcapRequestLog.completeBodySent)&&
  Objects.equals(this.modifiedContentLength, objIcapRequestLog.modifiedContentLength)&&
  Objects.equals(this.poolName, objIcapRequestLog.poolName)&&
  Objects.equals(this.poolUuid, objIcapRequestLog.poolUuid)&&
  Objects.equals(this.serverIp, objIcapRequestLog.serverIp)&&
  Objects.equals(this.sourcePort, objIcapRequestLog.sourcePort)&&
  Objects.equals(this.latency, objIcapRequestLog.latency)&&
  Objects.equals(this.icapHeadersSentToServer, objIcapRequestLog.icapHeadersSentToServer)&&
  Objects.equals(this.icapHeadersReceivedFromServer, objIcapRequestLog.icapHeadersReceivedFromServer)&&
  Objects.equals(this.action, objIcapRequestLog.action)&&
  Objects.equals(this.reason, objIcapRequestLog.reason)&&
  Objects.equals(this.threatId, objIcapRequestLog.threatId)&&
  Objects.equals(this.threatDescription, objIcapRequestLog.threatDescription);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IcapRequestLog {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    completeBodySent: ").append(toIndentedString(completeBodySent)).append("\n");
        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
        sb.append("    httpResponseCode: ").append(toIndentedString(httpResponseCode)).append("\n");
        sb.append("    icapAbsoluteUri: ").append(toIndentedString(icapAbsoluteUri)).append("\n");
        sb.append("    icapHeadersReceivedFromServer: ").append(toIndentedString(icapHeadersReceivedFromServer)).append("\n");
        sb.append("    icapHeadersSentToServer: ").append(toIndentedString(icapHeadersSentToServer)).append("\n");
        sb.append("    icapMethod: ").append(toIndentedString(icapMethod)).append("\n");
        sb.append("    icapResponseCode: ").append(toIndentedString(icapResponseCode)).append("\n");
        sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
        sb.append("    modifiedContentLength: ").append(toIndentedString(modifiedContentLength)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    poolUuid: ").append(toIndentedString(poolUuid)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    threatDescription: ").append(toIndentedString(threatDescription)).append("\n");
        sb.append("    threatId: ").append(toIndentedString(threatId)).append("\n");
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

