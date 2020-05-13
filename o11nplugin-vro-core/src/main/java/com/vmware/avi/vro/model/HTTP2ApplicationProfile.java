package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * HTTP2ApplicationProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTP2ApplicationProfile")
@VsoFinder(name = Constants.FINDER_VRO_HTTP2APPLICATIONPROFILE, idAccessor = "getObjectID()")
@Service
public class HTTP2ApplicationProfile extends AviRestResource  {
  @JsonProperty("http2_initial_window_size")
  private Integer http2InitialWindowSize = 64;

  @JsonProperty("max_http2_concurrent_streams_per_connection")
  private Integer maxHttp2ConcurrentStreamsPerConnection = 128;

  @JsonProperty("max_http2_control_frames_per_connection")
  private Integer maxHttp2ControlFramesPerConnection = 1000;

  @JsonProperty("max_http2_empty_data_frames_per_connection")
  private Integer maxHttp2EmptyDataFramesPerConnection = 1000;

  @JsonProperty("max_http2_header_field_size")
  private Integer maxHttp2HeaderFieldSize = 4096;

  @JsonProperty("max_http2_queued_frames_to_client_per_connection")
  private Integer maxHttp2QueuedFramesToClientPerConnection = 1000;

  @JsonProperty("max_http2_requests_per_connection")
  private Integer maxHttp2RequestsPerConnection = 1000;

  
  /**
   * The initial flow control window size in KB for HTTP/2 streams. Allowed values are 64-32768. Field introduced in 20.1.1.
   * @return http2InitialWindowSize
  **/
  @ApiModelProperty(value = "The initial flow control window size in KB for HTTP/2 streams. Allowed values are 64-32768. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getHttp2InitialWindowSize() {
    return http2InitialWindowSize;
  }
    
  @VsoMethod
  public void setHttp2InitialWindowSize(Integer http2InitialWindowSize) {
    this.http2InitialWindowSize = http2InitialWindowSize;
  }

  
  /**
   * The max number of concurrent streams over a client side HTTP/2 connection. Allowed values are 1-256. Field introduced in 20.1.1.
   * @return maxHttp2ConcurrentStreamsPerConnection
  **/
  @ApiModelProperty(value = "The max number of concurrent streams over a client side HTTP/2 connection. Allowed values are 1-256. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMaxHttp2ConcurrentStreamsPerConnection() {
    return maxHttp2ConcurrentStreamsPerConnection;
  }
    
  @VsoMethod
  public void setMaxHttp2ConcurrentStreamsPerConnection(Integer maxHttp2ConcurrentStreamsPerConnection) {
    this.maxHttp2ConcurrentStreamsPerConnection = maxHttp2ConcurrentStreamsPerConnection;
  }

  
  /**
   * The max number of control frames that client can send over an HTTP/2 connection. '0' means unlimited. Allowed values are 0-10000. Special values are 0- 'Unlimited control frames on a client side HTTP/2 connection'. Field introduced in 20.1.1.
   * @return maxHttp2ControlFramesPerConnection
  **/
  @ApiModelProperty(value = "The max number of control frames that client can send over an HTTP/2 connection. '0' means unlimited. Allowed values are 0-10000. Special values are 0- 'Unlimited control frames on a client side HTTP/2 connection'. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMaxHttp2ControlFramesPerConnection() {
    return maxHttp2ControlFramesPerConnection;
  }
    
  @VsoMethod
  public void setMaxHttp2ControlFramesPerConnection(Integer maxHttp2ControlFramesPerConnection) {
    this.maxHttp2ControlFramesPerConnection = maxHttp2ControlFramesPerConnection;
  }

  
  /**
   * The max number of empty data frames that client can send over an HTTP/2 connection. '0' means unlimited. Allowed values are 0-10000. Special values are 0- 'Unlimited empty data frames over a client side HTTP/2 connection'. Field introduced in 20.1.1.
   * @return maxHttp2EmptyDataFramesPerConnection
  **/
  @ApiModelProperty(value = "The max number of empty data frames that client can send over an HTTP/2 connection. '0' means unlimited. Allowed values are 0-10000. Special values are 0- 'Unlimited empty data frames over a client side HTTP/2 connection'. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMaxHttp2EmptyDataFramesPerConnection() {
    return maxHttp2EmptyDataFramesPerConnection;
  }
    
  @VsoMethod
  public void setMaxHttp2EmptyDataFramesPerConnection(Integer maxHttp2EmptyDataFramesPerConnection) {
    this.maxHttp2EmptyDataFramesPerConnection = maxHttp2EmptyDataFramesPerConnection;
  }

  
  /**
   * The maximum size in bytes of the compressed request header field. The limit applies equally to both name and value. Allowed values are 1-8192. Field introduced in 20.1.1.
   * @return maxHttp2HeaderFieldSize
  **/
  @ApiModelProperty(value = "The maximum size in bytes of the compressed request header field. The limit applies equally to both name and value. Allowed values are 1-8192. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMaxHttp2HeaderFieldSize() {
    return maxHttp2HeaderFieldSize;
  }
    
  @VsoMethod
  public void setMaxHttp2HeaderFieldSize(Integer maxHttp2HeaderFieldSize) {
    this.maxHttp2HeaderFieldSize = maxHttp2HeaderFieldSize;
  }

  
  /**
   * The max number of frames that can be queued waiting to be sent over a client side HTTP/2 connection at any given time. '0' means unlimited. Allowed values are 0-10000. Special values are 0- 'Unlimited frames can be queued on a client side HTTP/2 connection'. Field introduced in 20.1.1.
   * @return maxHttp2QueuedFramesToClientPerConnection
  **/
  @ApiModelProperty(value = "The max number of frames that can be queued waiting to be sent over a client side HTTP/2 connection at any given time. '0' means unlimited. Allowed values are 0-10000. Special values are 0- 'Unlimited frames can be queued on a client side HTTP/2 connection'. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMaxHttp2QueuedFramesToClientPerConnection() {
    return maxHttp2QueuedFramesToClientPerConnection;
  }
    
  @VsoMethod
  public void setMaxHttp2QueuedFramesToClientPerConnection(Integer maxHttp2QueuedFramesToClientPerConnection) {
    this.maxHttp2QueuedFramesToClientPerConnection = maxHttp2QueuedFramesToClientPerConnection;
  }

  
  /**
   * The maximum number of requests over a client side HTTP/2 connection. Allowed values are 0-10000. Special values are 0- 'Unlimited requests on a client side HTTP/2 connection'. Field introduced in 20.1.1.
   * @return maxHttp2RequestsPerConnection
  **/
  @ApiModelProperty(value = "The maximum number of requests over a client side HTTP/2 connection. Allowed values are 0-10000. Special values are 0- 'Unlimited requests on a client side HTTP/2 connection'. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMaxHttp2RequestsPerConnection() {
    return maxHttp2RequestsPerConnection;
  }
    
  @VsoMethod
  public void setMaxHttp2RequestsPerConnection(Integer maxHttp2RequestsPerConnection) {
    this.maxHttp2RequestsPerConnection = maxHttp2RequestsPerConnection;
  }

  
  public String getObjectID() {
		return "HTTP2ApplicationProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTP2ApplicationProfile htTP2ApplicationProfile = (HTTP2ApplicationProfile) o;
    return Objects.equals(this.http2InitialWindowSize, htTP2ApplicationProfile.http2InitialWindowSize) &&
        Objects.equals(this.maxHttp2ConcurrentStreamsPerConnection, htTP2ApplicationProfile.maxHttp2ConcurrentStreamsPerConnection) &&
        Objects.equals(this.maxHttp2ControlFramesPerConnection, htTP2ApplicationProfile.maxHttp2ControlFramesPerConnection) &&
        Objects.equals(this.maxHttp2EmptyDataFramesPerConnection, htTP2ApplicationProfile.maxHttp2EmptyDataFramesPerConnection) &&
        Objects.equals(this.maxHttp2HeaderFieldSize, htTP2ApplicationProfile.maxHttp2HeaderFieldSize) &&
        Objects.equals(this.maxHttp2QueuedFramesToClientPerConnection, htTP2ApplicationProfile.maxHttp2QueuedFramesToClientPerConnection) &&
        Objects.equals(this.maxHttp2RequestsPerConnection, htTP2ApplicationProfile.maxHttp2RequestsPerConnection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(http2InitialWindowSize, maxHttp2ConcurrentStreamsPerConnection, maxHttp2ControlFramesPerConnection, maxHttp2EmptyDataFramesPerConnection, maxHttp2HeaderFieldSize, maxHttp2QueuedFramesToClientPerConnection, maxHttp2RequestsPerConnection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTP2ApplicationProfile {\n");
    
    sb.append("    http2InitialWindowSize: ").append(toIndentedString(http2InitialWindowSize)).append("\n");
    sb.append("    maxHttp2ConcurrentStreamsPerConnection: ").append(toIndentedString(maxHttp2ConcurrentStreamsPerConnection)).append("\n");
    sb.append("    maxHttp2ControlFramesPerConnection: ").append(toIndentedString(maxHttp2ControlFramesPerConnection)).append("\n");
    sb.append("    maxHttp2EmptyDataFramesPerConnection: ").append(toIndentedString(maxHttp2EmptyDataFramesPerConnection)).append("\n");
    sb.append("    maxHttp2HeaderFieldSize: ").append(toIndentedString(maxHttp2HeaderFieldSize)).append("\n");
    sb.append("    maxHttp2QueuedFramesToClientPerConnection: ").append(toIndentedString(maxHttp2QueuedFramesToClientPerConnection)).append("\n");
    sb.append("    maxHttp2RequestsPerConnection: ").append(toIndentedString(maxHttp2RequestsPerConnection)).append("\n");
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

