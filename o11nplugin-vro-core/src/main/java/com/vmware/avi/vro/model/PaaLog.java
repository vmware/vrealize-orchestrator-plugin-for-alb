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
 * The PaaLog is a POJO class extends AviRestResource that used for creating
 * PaaLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PaaLog")
@VsoFinder(name = Constants.FINDER_VRO_PAALOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PaaLog extends AviRestResource {
    @JsonProperty("cache_hit")
    @JsonInclude(Include.NON_NULL)
    private Boolean cacheHit = null;

    @JsonProperty("client_request_body_sent")
    @JsonInclude(Include.NON_NULL)
    private Boolean clientRequestBodySent = null;

    @JsonProperty("request_logs")
    @JsonInclude(Include.NON_NULL)
    private List<PaaRequestLog> requestLogs = null;



  /**
   * This is the getter method this will return the attribute value.
   * Pingaccess agent cache was used for authentication.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cacheHit
   */
  @VsoMethod
  public Boolean getCacheHit() {
    return cacheHit;
  }

  /**
   * This is the setter method to the attribute.
   * Pingaccess agent cache was used for authentication.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cacheHit set the cacheHit.
   */
  @VsoMethod
  public void setCacheHit(Boolean  cacheHit) {
    this.cacheHit = cacheHit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The pingaccess server required the client request body for authentication.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientRequestBodySent
   */
  @VsoMethod
  public Boolean getClientRequestBodySent() {
    return clientRequestBodySent;
  }

  /**
   * This is the setter method to the attribute.
   * The pingaccess server required the client request body for authentication.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientRequestBodySent set the clientRequestBodySent.
   */
  @VsoMethod
  public void setClientRequestBodySent(Boolean  clientRequestBodySent) {
    this.clientRequestBodySent = clientRequestBodySent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Logs for each request sent to pa server to completeauthentication for the initial request.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestLogs
   */
  @VsoMethod
  public List<PaaRequestLog> getRequestLogs() {
    return requestLogs;
  }

  /**
   * This is the setter method. this will set the requestLogs
   * Logs for each request sent to pa server to completeauthentication for the initial request.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestLogs
   */
  @VsoMethod
  public void setRequestLogs(List<PaaRequestLog>  requestLogs) {
    this.requestLogs = requestLogs;
  }

  /**
   * This is the setter method this will set the requestLogs
   * Logs for each request sent to pa server to completeauthentication for the initial request.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestLogs
   */
  @VsoMethod
  public PaaLog addRequestLogsItem(PaaRequestLog requestLogsItem) {
    if (this.requestLogs == null) {
      this.requestLogs = new ArrayList<PaaRequestLog>();
    }
    this.requestLogs.add(requestLogsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PaaLog objPaaLog = (PaaLog) o;
  return   Objects.equals(this.clientRequestBodySent, objPaaLog.clientRequestBodySent)&&
  Objects.equals(this.cacheHit, objPaaLog.cacheHit)&&
  Objects.equals(this.requestLogs, objPaaLog.requestLogs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PaaLog {\n");
      sb.append("    cacheHit: ").append(toIndentedString(cacheHit)).append("\n");
        sb.append("    clientRequestBodySent: ").append(toIndentedString(clientRequestBodySent)).append("\n");
        sb.append("    requestLogs: ").append(toIndentedString(requestLogs)).append("\n");
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

