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
 * CaptureIPC
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CaptureIPC")
@VsoFinder(name = Constants.FINDER_VRO_CAPTUREIPC, idAccessor = "getObjectID()")
@Service
public class CaptureIPC extends AviRestResource  {
  @JsonProperty("flow_del_probe")
  private Boolean flowDelProbe = null;

  @JsonProperty("flow_mirror_add")
  private Boolean flowMirrorAdd = null;

  @JsonProperty("flow_mirror_all")
  private Boolean flowMirrorAll = null;

  @JsonProperty("flow_mirror_del")
  private Boolean flowMirrorDel = null;

  @JsonProperty("flow_probe")
  private Boolean flowProbe = null;

  @JsonProperty("flow_probe_all")
  private Boolean flowProbeAll = null;

  @JsonProperty("ipc_batched")
  private Boolean ipcBatched = null;

  @JsonProperty("ipc_rx_req")
  private Boolean ipcRxReq = null;

  @JsonProperty("ipc_rx_res")
  private Boolean ipcRxRes = null;

  @JsonProperty("ipc_tx_req")
  private Boolean ipcTxReq = null;

  @JsonProperty("ipc_tx_res")
  private Boolean ipcTxRes = null;

  @JsonProperty("vs_hb")
  private Boolean vsHb = null;

  
  /**
   * Flow del probe filter for SE IPC. Field introduced in 18.2.5.
   * @return flowDelProbe
  **/
  @ApiModelProperty(value = "Flow del probe filter for SE IPC. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isFlowDelProbe() {
    return flowDelProbe;
  }
    
  @VsoMethod
  public void setFlowDelProbe(Boolean flowDelProbe) {
    this.flowDelProbe = flowDelProbe;
  }

  
  /**
   * Flow mirror add filter for SE IPC. Field introduced in 18.2.5.
   * @return flowMirrorAdd
  **/
  @ApiModelProperty(value = "Flow mirror add filter for SE IPC. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isFlowMirrorAdd() {
    return flowMirrorAdd;
  }
    
  @VsoMethod
  public void setFlowMirrorAdd(Boolean flowMirrorAdd) {
    this.flowMirrorAdd = flowMirrorAdd;
  }

  
  /**
   * Filter for all flow mirror SE IPC. Field introduced in 18.2.5.
   * @return flowMirrorAll
  **/
  @ApiModelProperty(value = "Filter for all flow mirror SE IPC. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isFlowMirrorAll() {
    return flowMirrorAll;
  }
    
  @VsoMethod
  public void setFlowMirrorAll(Boolean flowMirrorAll) {
    this.flowMirrorAll = flowMirrorAll;
  }

  
  /**
   * Flow mirror del filter for SE IPC. Field introduced in 18.2.5.
   * @return flowMirrorDel
  **/
  @ApiModelProperty(value = "Flow mirror del filter for SE IPC. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isFlowMirrorDel() {
    return flowMirrorDel;
  }
    
  @VsoMethod
  public void setFlowMirrorDel(Boolean flowMirrorDel) {
    this.flowMirrorDel = flowMirrorDel;
  }

  
  /**
   * Flow probe filter for SE IPC. Field introduced in 18.2.5.
   * @return flowProbe
  **/
  @ApiModelProperty(value = "Flow probe filter for SE IPC. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isFlowProbe() {
    return flowProbe;
  }
    
  @VsoMethod
  public void setFlowProbe(Boolean flowProbe) {
    this.flowProbe = flowProbe;
  }

  
  /**
   * Filter for all flow probe SE IPC. Field introduced in 18.2.5.
   * @return flowProbeAll
  **/
  @ApiModelProperty(value = "Filter for all flow probe SE IPC. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isFlowProbeAll() {
    return flowProbeAll;
  }
    
  @VsoMethod
  public void setFlowProbeAll(Boolean flowProbeAll) {
    this.flowProbeAll = flowProbeAll;
  }

  
  /**
   * IPC batched filter for SE IPC. Field introduced in 18.2.5.
   * @return ipcBatched
  **/
  @ApiModelProperty(value = "IPC batched filter for SE IPC. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isIpcBatched() {
    return ipcBatched;
  }
    
  @VsoMethod
  public void setIpcBatched(Boolean ipcBatched) {
    this.ipcBatched = ipcBatched;
  }

  
  /**
   * Filter for incoming IPC request. Field introduced in 18.2.5.
   * @return ipcRxReq
  **/
  @ApiModelProperty(value = "Filter for incoming IPC request. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isIpcRxReq() {
    return ipcRxReq;
  }
    
  @VsoMethod
  public void setIpcRxReq(Boolean ipcRxReq) {
    this.ipcRxReq = ipcRxReq;
  }

  
  /**
   * Filter for incoming IPC response. Field introduced in 18.2.5.
   * @return ipcRxRes
  **/
  @ApiModelProperty(value = "Filter for incoming IPC response. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isIpcRxRes() {
    return ipcRxRes;
  }
    
  @VsoMethod
  public void setIpcRxRes(Boolean ipcRxRes) {
    this.ipcRxRes = ipcRxRes;
  }

  
  /**
   * Filter for outgoing IPC request. Field introduced in 18.2.5.
   * @return ipcTxReq
  **/
  @ApiModelProperty(value = "Filter for outgoing IPC request. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isIpcTxReq() {
    return ipcTxReq;
  }
    
  @VsoMethod
  public void setIpcTxReq(Boolean ipcTxReq) {
    this.ipcTxReq = ipcTxReq;
  }

  
  /**
   * Filter for outgoing IPC response. Field introduced in 18.2.5.
   * @return ipcTxRes
  **/
  @ApiModelProperty(value = "Filter for outgoing IPC response. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isIpcTxRes() {
    return ipcTxRes;
  }
    
  @VsoMethod
  public void setIpcTxRes(Boolean ipcTxRes) {
    this.ipcTxRes = ipcTxRes;
  }

  
  /**
   * Vs heart beat filter for SE IPC. Field introduced in 18.2.5.
   * @return vsHb
  **/
  @ApiModelProperty(value = "Vs heart beat filter for SE IPC. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isVsHb() {
    return vsHb;
  }
    
  @VsoMethod
  public void setVsHb(Boolean vsHb) {
    this.vsHb = vsHb;
  }

  
  public String getObjectID() {
		return "CaptureIPC";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureIPC captureIPC = (CaptureIPC) o;
    return Objects.equals(this.flowDelProbe, captureIPC.flowDelProbe) &&
        Objects.equals(this.flowMirrorAdd, captureIPC.flowMirrorAdd) &&
        Objects.equals(this.flowMirrorAll, captureIPC.flowMirrorAll) &&
        Objects.equals(this.flowMirrorDel, captureIPC.flowMirrorDel) &&
        Objects.equals(this.flowProbe, captureIPC.flowProbe) &&
        Objects.equals(this.flowProbeAll, captureIPC.flowProbeAll) &&
        Objects.equals(this.ipcBatched, captureIPC.ipcBatched) &&
        Objects.equals(this.ipcRxReq, captureIPC.ipcRxReq) &&
        Objects.equals(this.ipcRxRes, captureIPC.ipcRxRes) &&
        Objects.equals(this.ipcTxReq, captureIPC.ipcTxReq) &&
        Objects.equals(this.ipcTxRes, captureIPC.ipcTxRes) &&
        Objects.equals(this.vsHb, captureIPC.vsHb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowDelProbe, flowMirrorAdd, flowMirrorAll, flowMirrorDel, flowProbe, flowProbeAll, ipcBatched, ipcRxReq, ipcRxRes, ipcTxReq, ipcTxRes, vsHb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureIPC {\n");
    
    sb.append("    flowDelProbe: ").append(toIndentedString(flowDelProbe)).append("\n");
    sb.append("    flowMirrorAdd: ").append(toIndentedString(flowMirrorAdd)).append("\n");
    sb.append("    flowMirrorAll: ").append(toIndentedString(flowMirrorAll)).append("\n");
    sb.append("    flowMirrorDel: ").append(toIndentedString(flowMirrorDel)).append("\n");
    sb.append("    flowProbe: ").append(toIndentedString(flowProbe)).append("\n");
    sb.append("    flowProbeAll: ").append(toIndentedString(flowProbeAll)).append("\n");
    sb.append("    ipcBatched: ").append(toIndentedString(ipcBatched)).append("\n");
    sb.append("    ipcRxReq: ").append(toIndentedString(ipcRxReq)).append("\n");
    sb.append("    ipcRxRes: ").append(toIndentedString(ipcRxRes)).append("\n");
    sb.append("    ipcTxReq: ").append(toIndentedString(ipcTxReq)).append("\n");
    sb.append("    ipcTxRes: ").append(toIndentedString(ipcTxRes)).append("\n");
    sb.append("    vsHb: ").append(toIndentedString(vsHb)).append("\n");
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

