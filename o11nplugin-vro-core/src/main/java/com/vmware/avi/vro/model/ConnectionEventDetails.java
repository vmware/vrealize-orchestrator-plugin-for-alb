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
 * The ConnectionEventDetails is a POJO class extends AviRestResource that used for creating
 * ConnectionEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConnectionEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_CONNECTIONEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConnectionEventDetails extends AviRestResource {
    @JsonProperty("host")
    @JsonInclude(Include.NON_NULL)
    private String host = null;

    @JsonProperty("info")
    @JsonInclude(Include.NON_NULL)
    private String info = null;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port = null;



  /**
   * This is the getter method this will return the attribute value.
   * Destinaton host name to be connected.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return host
   */
  @VsoMethod
  public String getHost() {
    return host;
  }

  /**
   * This is the setter method to the attribute.
   * Destinaton host name to be connected.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param host set the host.
   */
  @VsoMethod
  public void setHost(String  host) {
    this.host = host;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Connection status information.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return info
   */
  @VsoMethod
  public String getInfo() {
    return info;
  }

  /**
   * This is the setter method to the attribute.
   * Connection status information.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param info set the info.
   */
  @VsoMethod
  public void setInfo(String  info) {
    this.info = info;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Destinaton port to be connected.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Destinaton port to be connected.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConnectionEventDetails objConnectionEventDetails = (ConnectionEventDetails) o;
  return   Objects.equals(this.host, objConnectionEventDetails.host)&&
  Objects.equals(this.port, objConnectionEventDetails.port)&&
  Objects.equals(this.info, objConnectionEventDetails.info);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConnectionEventDetails {\n");
      sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

