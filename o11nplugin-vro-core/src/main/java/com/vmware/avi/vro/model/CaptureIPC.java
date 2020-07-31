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
 * The CaptureIPC is a POJO class extends AviRestResource that used for creating
 * CaptureIPC.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CaptureIPC")
@VsoFinder(name = Constants.FINDER_VRO_CAPTUREIPC)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CaptureIPC extends AviRestResource {
  @JsonProperty("flow_del_probe")
  @JsonInclude(Include.NON_NULL)
  private Boolean flowDelProbe = null;

  @JsonProperty("flow_mirror_add")
  @JsonInclude(Include.NON_NULL)
  private Boolean flowMirrorAdd = null;

  @JsonProperty("flow_mirror_all")
  @JsonInclude(Include.NON_NULL)
  private Boolean flowMirrorAll = null;

  @JsonProperty("flow_mirror_del")
  @JsonInclude(Include.NON_NULL)
  private Boolean flowMirrorDel = null;

  @JsonProperty("flow_probe")
  @JsonInclude(Include.NON_NULL)
  private Boolean flowProbe = null;

  @JsonProperty("flow_probe_all")
  @JsonInclude(Include.NON_NULL)
  private Boolean flowProbeAll = null;

  @JsonProperty("ipc_batched")
  @JsonInclude(Include.NON_NULL)
  private Boolean ipcBatched = null;

  @JsonProperty("ipc_rx_req")
  @JsonInclude(Include.NON_NULL)
  private Boolean ipcRxReq = null;

  @JsonProperty("ipc_rx_res")
  @JsonInclude(Include.NON_NULL)
  private Boolean ipcRxRes = null;

  @JsonProperty("ipc_tx_req")
  @JsonInclude(Include.NON_NULL)
  private Boolean ipcTxReq = null;

  @JsonProperty("ipc_tx_res")
  @JsonInclude(Include.NON_NULL)
  private Boolean ipcTxRes = null;

  @JsonProperty("vs_hb")
  @JsonInclude(Include.NON_NULL)
  private Boolean vsHb = null;



  /**
   * This is the getter method this will return the attribute value.
   * Flow del probe filter for se ipc.
   * Field introduced in 18.2.5.
   * @return flowDelProbe
   */
  @VsoMethod
  public Boolean getFlowDelProbe() {
    return flowDelProbe;
  }

  /**
   * This is the setter method to the attribute.
   * Flow del probe filter for se ipc.
   * Field introduced in 18.2.5.
   * @param flowDelProbe set the flowDelProbe.
   */
  @VsoMethod
  public void setFlowDelProbe(Boolean  flowDelProbe) {
    this.flowDelProbe = flowDelProbe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flow mirror add filter for se ipc.
   * Field introduced in 18.2.5.
   * @return flowMirrorAdd
   */
  @VsoMethod
  public Boolean getFlowMirrorAdd() {
    return flowMirrorAdd;
  }

  /**
   * This is the setter method to the attribute.
   * Flow mirror add filter for se ipc.
   * Field introduced in 18.2.5.
   * @param flowMirrorAdd set the flowMirrorAdd.
   */
  @VsoMethod
  public void setFlowMirrorAdd(Boolean  flowMirrorAdd) {
    this.flowMirrorAdd = flowMirrorAdd;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Filter for all flow mirror se ipc.
   * Field introduced in 18.2.5.
   * @return flowMirrorAll
   */
  @VsoMethod
  public Boolean getFlowMirrorAll() {
    return flowMirrorAll;
  }

  /**
   * This is the setter method to the attribute.
   * Filter for all flow mirror se ipc.
   * Field introduced in 18.2.5.
   * @param flowMirrorAll set the flowMirrorAll.
   */
  @VsoMethod
  public void setFlowMirrorAll(Boolean  flowMirrorAll) {
    this.flowMirrorAll = flowMirrorAll;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flow mirror del filter for se ipc.
   * Field introduced in 18.2.5.
   * @return flowMirrorDel
   */
  @VsoMethod
  public Boolean getFlowMirrorDel() {
    return flowMirrorDel;
  }

  /**
   * This is the setter method to the attribute.
   * Flow mirror del filter for se ipc.
   * Field introduced in 18.2.5.
   * @param flowMirrorDel set the flowMirrorDel.
   */
  @VsoMethod
  public void setFlowMirrorDel(Boolean  flowMirrorDel) {
    this.flowMirrorDel = flowMirrorDel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flow probe filter for se ipc.
   * Field introduced in 18.2.5.
   * @return flowProbe
   */
  @VsoMethod
  public Boolean getFlowProbe() {
    return flowProbe;
  }

  /**
   * This is the setter method to the attribute.
   * Flow probe filter for se ipc.
   * Field introduced in 18.2.5.
   * @param flowProbe set the flowProbe.
   */
  @VsoMethod
  public void setFlowProbe(Boolean  flowProbe) {
    this.flowProbe = flowProbe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Filter for all flow probe se ipc.
   * Field introduced in 18.2.5.
   * @return flowProbeAll
   */
  @VsoMethod
  public Boolean getFlowProbeAll() {
    return flowProbeAll;
  }

  /**
   * This is the setter method to the attribute.
   * Filter for all flow probe se ipc.
   * Field introduced in 18.2.5.
   * @param flowProbeAll set the flowProbeAll.
   */
  @VsoMethod
  public void setFlowProbeAll(Boolean  flowProbeAll) {
    this.flowProbeAll = flowProbeAll;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipc batched filter for se ipc.
   * Field introduced in 18.2.5.
   * @return ipcBatched
   */
  @VsoMethod
  public Boolean getIpcBatched() {
    return ipcBatched;
  }

  /**
   * This is the setter method to the attribute.
   * Ipc batched filter for se ipc.
   * Field introduced in 18.2.5.
   * @param ipcBatched set the ipcBatched.
   */
  @VsoMethod
  public void setIpcBatched(Boolean  ipcBatched) {
    this.ipcBatched = ipcBatched;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Filter for incoming ipc request.
   * Field introduced in 18.2.5.
   * @return ipcRxReq
   */
  @VsoMethod
  public Boolean getIpcRxReq() {
    return ipcRxReq;
  }

  /**
   * This is the setter method to the attribute.
   * Filter for incoming ipc request.
   * Field introduced in 18.2.5.
   * @param ipcRxReq set the ipcRxReq.
   */
  @VsoMethod
  public void setIpcRxReq(Boolean  ipcRxReq) {
    this.ipcRxReq = ipcRxReq;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Filter for incoming ipc response.
   * Field introduced in 18.2.5.
   * @return ipcRxRes
   */
  @VsoMethod
  public Boolean getIpcRxRes() {
    return ipcRxRes;
  }

  /**
   * This is the setter method to the attribute.
   * Filter for incoming ipc response.
   * Field introduced in 18.2.5.
   * @param ipcRxRes set the ipcRxRes.
   */
  @VsoMethod
  public void setIpcRxRes(Boolean  ipcRxRes) {
    this.ipcRxRes = ipcRxRes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Filter for outgoing ipc request.
   * Field introduced in 18.2.5.
   * @return ipcTxReq
   */
  @VsoMethod
  public Boolean getIpcTxReq() {
    return ipcTxReq;
  }

  /**
   * This is the setter method to the attribute.
   * Filter for outgoing ipc request.
   * Field introduced in 18.2.5.
   * @param ipcTxReq set the ipcTxReq.
   */
  @VsoMethod
  public void setIpcTxReq(Boolean  ipcTxReq) {
    this.ipcTxReq = ipcTxReq;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Filter for outgoing ipc response.
   * Field introduced in 18.2.5.
   * @return ipcTxRes
   */
  @VsoMethod
  public Boolean getIpcTxRes() {
    return ipcTxRes;
  }

  /**
   * This is the setter method to the attribute.
   * Filter for outgoing ipc response.
   * Field introduced in 18.2.5.
   * @param ipcTxRes set the ipcTxRes.
   */
  @VsoMethod
  public void setIpcTxRes(Boolean  ipcTxRes) {
    this.ipcTxRes = ipcTxRes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vs heart beat filter for se ipc.
   * Field introduced in 18.2.5.
   * @return vsHb
   */
  @VsoMethod
  public Boolean getVsHb() {
    return vsHb;
  }

  /**
   * This is the setter method to the attribute.
   * Vs heart beat filter for se ipc.
   * Field introduced in 18.2.5.
   * @param vsHb set the vsHb.
   */
  @VsoMethod
  public void setVsHb(Boolean  vsHb) {
    this.vsHb = vsHb;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CaptureIPC objCaptureIPC = (CaptureIPC) o;
  return   Objects.equals(this.flowProbe, objCaptureIPC.flowProbe)&&
  Objects.equals(this.flowDelProbe, objCaptureIPC.flowDelProbe)&&
  Objects.equals(this.flowProbeAll, objCaptureIPC.flowProbeAll)&&
  Objects.equals(this.vsHb, objCaptureIPC.vsHb)&&
  Objects.equals(this.flowMirrorAdd, objCaptureIPC.flowMirrorAdd)&&
  Objects.equals(this.flowMirrorDel, objCaptureIPC.flowMirrorDel)&&
  Objects.equals(this.flowMirrorAll, objCaptureIPC.flowMirrorAll)&&
  Objects.equals(this.ipcRxReq, objCaptureIPC.ipcRxReq)&&
  Objects.equals(this.ipcRxRes, objCaptureIPC.ipcRxRes)&&
  Objects.equals(this.ipcTxReq, objCaptureIPC.ipcTxReq)&&
  Objects.equals(this.ipcTxRes, objCaptureIPC.ipcTxRes)&&
  Objects.equals(this.ipcBatched, objCaptureIPC.ipcBatched);
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

