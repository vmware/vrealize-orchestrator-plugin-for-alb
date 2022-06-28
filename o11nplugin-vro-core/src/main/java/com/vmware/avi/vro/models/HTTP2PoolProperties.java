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
 * The HTTP2PoolProperties is a POJO class extends AviRestResource that used for creating
 * HTTP2PoolProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTP2PoolProperties")
@VsoFinder(name = Constants.FINDER_VRO_HTTP2POOLPROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTP2PoolProperties extends AviRestResource {
    @JsonProperty("max_http2_control_frames_per_connection")
    @JsonInclude(Include.NON_NULL)
    private Integer maxHttp2ControlFramesPerConnection = 0;

    @JsonProperty("max_http2_header_field_size")
    @JsonInclude(Include.NON_NULL)
    private Integer maxHttp2HeaderFieldSize = 4096;



  /**
   * This is the getter method this will return the attribute value.
   * The max number of control frames that server can send over an http/2 connection.
   * '0' means unlimited.
   * Allowed values are 0-10000.
   * Special values are 0- unlimited control frames on a server side http/2 connection.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxHttp2ControlFramesPerConnection
   */
  @VsoMethod
  public Integer getMaxHttp2ControlFramesPerConnection() {
    return maxHttp2ControlFramesPerConnection;
  }

  /**
   * This is the setter method to the attribute.
   * The max number of control frames that server can send over an http/2 connection.
   * '0' means unlimited.
   * Allowed values are 0-10000.
   * Special values are 0- unlimited control frames on a server side http/2 connection.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxHttp2ControlFramesPerConnection set the maxHttp2ControlFramesPerConnection.
   */
  @VsoMethod
  public void setMaxHttp2ControlFramesPerConnection(Integer  maxHttp2ControlFramesPerConnection) {
    this.maxHttp2ControlFramesPerConnection = maxHttp2ControlFramesPerConnection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The maximum size in bytes of the compressed request header field.
   * The limit applies equally to both name and value.
   * Allowed values are 1-8192.
   * Field introduced in 21.1.1.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
   * @return maxHttp2HeaderFieldSize
   */
  @VsoMethod
  public Integer getMaxHttp2HeaderFieldSize() {
    return maxHttp2HeaderFieldSize;
  }

  /**
   * This is the setter method to the attribute.
   * The maximum size in bytes of the compressed request header field.
   * The limit applies equally to both name and value.
   * Allowed values are 1-8192.
   * Field introduced in 21.1.1.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
   * @param maxHttp2HeaderFieldSize set the maxHttp2HeaderFieldSize.
   */
  @VsoMethod
  public void setMaxHttp2HeaderFieldSize(Integer  maxHttp2HeaderFieldSize) {
    this.maxHttp2HeaderFieldSize = maxHttp2HeaderFieldSize;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTP2PoolProperties objHTTP2PoolProperties = (HTTP2PoolProperties) o;
  return   Objects.equals(this.maxHttp2ControlFramesPerConnection, objHTTP2PoolProperties.maxHttp2ControlFramesPerConnection)&&
  Objects.equals(this.maxHttp2HeaderFieldSize, objHTTP2PoolProperties.maxHttp2HeaderFieldSize);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTP2PoolProperties {\n");
      sb.append("    maxHttp2ControlFramesPerConnection: ").append(toIndentedString(maxHttp2ControlFramesPerConnection)).append("\n");
        sb.append("    maxHttp2HeaderFieldSize: ").append(toIndentedString(maxHttp2HeaderFieldSize)).append("\n");
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

