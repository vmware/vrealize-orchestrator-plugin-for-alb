package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CaptureFileSize;
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
 * DebugVirtualServiceCapture
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugVirtualServiceCapture")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGVIRTUALSERVICECAPTURE, idAccessor = "getObjectID()")
@Service
public class DebugVirtualServiceCapture extends AviRestResource  {
  @JsonProperty("capture_file_size")
  private CaptureFileSize captureFileSize = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("enable_ssl_session_key_capture")
  private Boolean enableSslSessionKeyCapture = null;

  @JsonProperty("num_pkts")
  private Integer numPkts = null;

  @JsonProperty("pcap_ng")
  private Boolean pcapNg = true;

  @JsonProperty("pkt_size")
  private Integer pktSize = 128;

  
  /**
   * Maximum allowed size of PCAP Capture File per SE. Max(absolute_size, percentage_size) will be final value. Set both to 0 for avi default size. DOS, IPC and DROP pcaps not applicaple. Field introduced in 18.2.7.
   * @return captureFileSize
  **/
  @ApiModelProperty(value = "Maximum allowed size of PCAP Capture File per SE. Max(absolute_size, percentage_size) will be final value. Set both to 0 for avi default size. DOS, IPC and DROP pcaps not applicaple. Field introduced in 18.2.7.")

  @Valid

 
  @VsoMethod  
  public CaptureFileSize getCaptureFileSize() {
    return captureFileSize;
  }
    
  @VsoMethod
  public void setCaptureFileSize(CaptureFileSize captureFileSize) {
    this.captureFileSize = captureFileSize;
  }

  
  /**
   * Number of minutes to capture packets. Use 0 to capture until manually stopped. Special values are 0 - 'infinite'.
   * @return duration
  **/
  @ApiModelProperty(value = "Number of minutes to capture packets. Use 0 to capture until manually stopped. Special values are 0 - 'infinite'.")


 
  @VsoMethod  
  public Integer getDuration() {
    return duration;
  }
    
  @VsoMethod
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * Enable SSL session key capture. Field introduced in 18.2.3.
   * @return enableSslSessionKeyCapture
  **/
  @ApiModelProperty(value = "Enable SSL session key capture. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isEnableSslSessionKeyCapture() {
    return enableSslSessionKeyCapture;
  }
    
  @VsoMethod
  public void setEnableSslSessionKeyCapture(Boolean enableSslSessionKeyCapture) {
    this.enableSslSessionKeyCapture = enableSslSessionKeyCapture;
  }

  
  /**
   * Total number of packets to capture.
   * @return numPkts
  **/
  @ApiModelProperty(value = "Total number of packets to capture.")


 
  @VsoMethod  
  public Integer getNumPkts() {
    return numPkts;
  }
    
  @VsoMethod
  public void setNumPkts(Integer numPkts) {
    this.numPkts = numPkts;
  }

  
  /**
   * Enable PcapNg for packet capture. Field introduced in 18.2.5.
   * @return pcapNg
  **/
  @ApiModelProperty(value = "Enable PcapNg for packet capture. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isPcapNg() {
    return pcapNg;
  }
    
  @VsoMethod
  public void setPcapNg(Boolean pcapNg) {
    this.pcapNg = pcapNg;
  }

  
  /**
   * Number of bytes of each packet to capture. Use 0 to capture the entire packet. Allowed values are 64-1514. Special values are 0 - 'full capture'.
   * @return pktSize
  **/
  @ApiModelProperty(value = "Number of bytes of each packet to capture. Use 0 to capture the entire packet. Allowed values are 64-1514. Special values are 0 - 'full capture'.")


 
  @VsoMethod  
  public Integer getPktSize() {
    return pktSize;
  }
    
  @VsoMethod
  public void setPktSize(Integer pktSize) {
    this.pktSize = pktSize;
  }

  
  public String getObjectID() {
		return "DebugVirtualServiceCapture";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugVirtualServiceCapture debugVirtualServiceCapture = (DebugVirtualServiceCapture) o;
    return Objects.equals(this.captureFileSize, debugVirtualServiceCapture.captureFileSize) &&
        Objects.equals(this.duration, debugVirtualServiceCapture.duration) &&
        Objects.equals(this.enableSslSessionKeyCapture, debugVirtualServiceCapture.enableSslSessionKeyCapture) &&
        Objects.equals(this.numPkts, debugVirtualServiceCapture.numPkts) &&
        Objects.equals(this.pcapNg, debugVirtualServiceCapture.pcapNg) &&
        Objects.equals(this.pktSize, debugVirtualServiceCapture.pktSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captureFileSize, duration, enableSslSessionKeyCapture, numPkts, pcapNg, pktSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugVirtualServiceCapture {\n");
    
    sb.append("    captureFileSize: ").append(toIndentedString(captureFileSize)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    enableSslSessionKeyCapture: ").append(toIndentedString(enableSslSessionKeyCapture)).append("\n");
    sb.append("    numPkts: ").append(toIndentedString(numPkts)).append("\n");
    sb.append("    pcapNg: ").append(toIndentedString(pcapNg)).append("\n");
    sb.append("    pktSize: ").append(toIndentedString(pktSize)).append("\n");
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

