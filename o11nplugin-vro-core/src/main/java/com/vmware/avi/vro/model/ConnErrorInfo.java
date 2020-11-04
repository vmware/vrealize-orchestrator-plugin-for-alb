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
 * The ConnErrorInfo is a POJO class extends AviRestResource that used for creating
 * ConnErrorInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConnErrorInfo")
@VsoFinder(name = Constants.FINDER_VRO_CONNERRORINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConnErrorInfo extends AviRestResource {
    @JsonProperty("num_syn_retransmit")
    @JsonInclude(Include.NON_NULL)
    private Integer numSynRetransmit = null;

    @JsonProperty("num_window_shrink")
    @JsonInclude(Include.NON_NULL)
    private Integer numWindowShrink = null;

    @JsonProperty("out_of_orders")
    @JsonInclude(Include.NON_NULL)
    private Integer outOfOrders = null;

    @JsonProperty("retransmits")
    @JsonInclude(Include.NON_NULL)
    private Integer retransmits = null;

    @JsonProperty("rx_pkts")
    @JsonInclude(Include.NON_NULL)
    private Integer rxPkts = null;

    @JsonProperty("server_num_window_shrink")
    @JsonInclude(Include.NON_NULL)
    private Integer serverNumWindowShrink = null;

    @JsonProperty("server_out_of_orders")
    @JsonInclude(Include.NON_NULL)
    private Integer serverOutOfOrders = null;

    @JsonProperty("server_retransmits")
    @JsonInclude(Include.NON_NULL)
    private Integer serverRetransmits = null;

    @JsonProperty("server_rx_pkts")
    @JsonInclude(Include.NON_NULL)
    private Integer serverRxPkts = null;

    @JsonProperty("server_timeouts")
    @JsonInclude(Include.NON_NULL)
    private Integer serverTimeouts = null;

    @JsonProperty("server_tx_pkts")
    @JsonInclude(Include.NON_NULL)
    private Integer serverTxPkts = null;

    @JsonProperty("server_zero_window_size_events")
    @JsonInclude(Include.NON_NULL)
    private Integer serverZeroWindowSizeEvents = null;

    @JsonProperty("timeouts")
    @JsonInclude(Include.NON_NULL)
    private Integer timeouts = null;

    @JsonProperty("tx_pkts")
    @JsonInclude(Include.NON_NULL)
    private Integer txPkts = null;

    @JsonProperty("zero_window_size_events")
    @JsonInclude(Include.NON_NULL)
    private Integer zeroWindowSizeEvents = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_syn_retransmit of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numSynRetransmit
   */
  @VsoMethod
  public Integer getNumSynRetransmit() {
    return numSynRetransmit;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_syn_retransmit of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numSynRetransmit set the numSynRetransmit.
   */
  @VsoMethod
  public void setNumSynRetransmit(Integer  numSynRetransmit) {
    this.numSynRetransmit = numSynRetransmit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_window_shrink of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numWindowShrink
   */
  @VsoMethod
  public Integer getNumWindowShrink() {
    return numWindowShrink;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_window_shrink of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numWindowShrink set the numWindowShrink.
   */
  @VsoMethod
  public void setNumWindowShrink(Integer  numWindowShrink) {
    this.numWindowShrink = numWindowShrink;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property out_of_orders of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return outOfOrders
   */
  @VsoMethod
  public Integer getOutOfOrders() {
    return outOfOrders;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property out_of_orders of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param outOfOrders set the outOfOrders.
   */
  @VsoMethod
  public void setOutOfOrders(Integer  outOfOrders) {
    this.outOfOrders = outOfOrders;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property retransmits of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return retransmits
   */
  @VsoMethod
  public Integer getRetransmits() {
    return retransmits;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property retransmits of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param retransmits set the retransmits.
   */
  @VsoMethod
  public void setRetransmits(Integer  retransmits) {
    this.retransmits = retransmits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property rx_pkts of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rxPkts
   */
  @VsoMethod
  public Integer getRxPkts() {
    return rxPkts;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property rx_pkts of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rxPkts set the rxPkts.
   */
  @VsoMethod
  public void setRxPkts(Integer  rxPkts) {
    this.rxPkts = rxPkts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property server_num_window_shrink of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverNumWindowShrink
   */
  @VsoMethod
  public Integer getServerNumWindowShrink() {
    return serverNumWindowShrink;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property server_num_window_shrink of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverNumWindowShrink set the serverNumWindowShrink.
   */
  @VsoMethod
  public void setServerNumWindowShrink(Integer  serverNumWindowShrink) {
    this.serverNumWindowShrink = serverNumWindowShrink;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property server_out_of_orders of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverOutOfOrders
   */
  @VsoMethod
  public Integer getServerOutOfOrders() {
    return serverOutOfOrders;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property server_out_of_orders of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverOutOfOrders set the serverOutOfOrders.
   */
  @VsoMethod
  public void setServerOutOfOrders(Integer  serverOutOfOrders) {
    this.serverOutOfOrders = serverOutOfOrders;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property server_retransmits of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverRetransmits
   */
  @VsoMethod
  public Integer getServerRetransmits() {
    return serverRetransmits;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property server_retransmits of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverRetransmits set the serverRetransmits.
   */
  @VsoMethod
  public void setServerRetransmits(Integer  serverRetransmits) {
    this.serverRetransmits = serverRetransmits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property server_rx_pkts of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverRxPkts
   */
  @VsoMethod
  public Integer getServerRxPkts() {
    return serverRxPkts;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property server_rx_pkts of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverRxPkts set the serverRxPkts.
   */
  @VsoMethod
  public void setServerRxPkts(Integer  serverRxPkts) {
    this.serverRxPkts = serverRxPkts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property server_timeouts of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverTimeouts
   */
  @VsoMethod
  public Integer getServerTimeouts() {
    return serverTimeouts;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property server_timeouts of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverTimeouts set the serverTimeouts.
   */
  @VsoMethod
  public void setServerTimeouts(Integer  serverTimeouts) {
    this.serverTimeouts = serverTimeouts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property server_tx_pkts of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverTxPkts
   */
  @VsoMethod
  public Integer getServerTxPkts() {
    return serverTxPkts;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property server_tx_pkts of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverTxPkts set the serverTxPkts.
   */
  @VsoMethod
  public void setServerTxPkts(Integer  serverTxPkts) {
    this.serverTxPkts = serverTxPkts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property server_zero_window_size_events of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverZeroWindowSizeEvents
   */
  @VsoMethod
  public Integer getServerZeroWindowSizeEvents() {
    return serverZeroWindowSizeEvents;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property server_zero_window_size_events of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverZeroWindowSizeEvents set the serverZeroWindowSizeEvents.
   */
  @VsoMethod
  public void setServerZeroWindowSizeEvents(Integer  serverZeroWindowSizeEvents) {
    this.serverZeroWindowSizeEvents = serverZeroWindowSizeEvents;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property timeouts of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timeouts
   */
  @VsoMethod
  public Integer getTimeouts() {
    return timeouts;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property timeouts of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timeouts set the timeouts.
   */
  @VsoMethod
  public void setTimeouts(Integer  timeouts) {
    this.timeouts = timeouts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tx_pkts of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return txPkts
   */
  @VsoMethod
  public Integer getTxPkts() {
    return txPkts;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property tx_pkts of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param txPkts set the txPkts.
   */
  @VsoMethod
  public void setTxPkts(Integer  txPkts) {
    this.txPkts = txPkts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property zero_window_size_events of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return zeroWindowSizeEvents
   */
  @VsoMethod
  public Integer getZeroWindowSizeEvents() {
    return zeroWindowSizeEvents;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property zero_window_size_events of obj type connerrorinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param zeroWindowSizeEvents set the zeroWindowSizeEvents.
   */
  @VsoMethod
  public void setZeroWindowSizeEvents(Integer  zeroWindowSizeEvents) {
    this.zeroWindowSizeEvents = zeroWindowSizeEvents;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConnErrorInfo objConnErrorInfo = (ConnErrorInfo) o;
  return   Objects.equals(this.outOfOrders, objConnErrorInfo.outOfOrders)&&
  Objects.equals(this.retransmits, objConnErrorInfo.retransmits)&&
  Objects.equals(this.timeouts, objConnErrorInfo.timeouts)&&
  Objects.equals(this.rxPkts, objConnErrorInfo.rxPkts)&&
  Objects.equals(this.txPkts, objConnErrorInfo.txPkts)&&
  Objects.equals(this.zeroWindowSizeEvents, objConnErrorInfo.zeroWindowSizeEvents)&&
  Objects.equals(this.serverOutOfOrders, objConnErrorInfo.serverOutOfOrders)&&
  Objects.equals(this.serverRetransmits, objConnErrorInfo.serverRetransmits)&&
  Objects.equals(this.serverTimeouts, objConnErrorInfo.serverTimeouts)&&
  Objects.equals(this.serverRxPkts, objConnErrorInfo.serverRxPkts)&&
  Objects.equals(this.serverTxPkts, objConnErrorInfo.serverTxPkts)&&
  Objects.equals(this.serverZeroWindowSizeEvents, objConnErrorInfo.serverZeroWindowSizeEvents)&&
  Objects.equals(this.numWindowShrink, objConnErrorInfo.numWindowShrink)&&
  Objects.equals(this.serverNumWindowShrink, objConnErrorInfo.serverNumWindowShrink)&&
  Objects.equals(this.numSynRetransmit, objConnErrorInfo.numSynRetransmit);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConnErrorInfo {\n");
      sb.append("    numSynRetransmit: ").append(toIndentedString(numSynRetransmit)).append("\n");
        sb.append("    numWindowShrink: ").append(toIndentedString(numWindowShrink)).append("\n");
        sb.append("    outOfOrders: ").append(toIndentedString(outOfOrders)).append("\n");
        sb.append("    retransmits: ").append(toIndentedString(retransmits)).append("\n");
        sb.append("    rxPkts: ").append(toIndentedString(rxPkts)).append("\n");
        sb.append("    serverNumWindowShrink: ").append(toIndentedString(serverNumWindowShrink)).append("\n");
        sb.append("    serverOutOfOrders: ").append(toIndentedString(serverOutOfOrders)).append("\n");
        sb.append("    serverRetransmits: ").append(toIndentedString(serverRetransmits)).append("\n");
        sb.append("    serverRxPkts: ").append(toIndentedString(serverRxPkts)).append("\n");
        sb.append("    serverTimeouts: ").append(toIndentedString(serverTimeouts)).append("\n");
        sb.append("    serverTxPkts: ").append(toIndentedString(serverTxPkts)).append("\n");
        sb.append("    serverZeroWindowSizeEvents: ").append(toIndentedString(serverZeroWindowSizeEvents)).append("\n");
        sb.append("    timeouts: ").append(toIndentedString(timeouts)).append("\n");
        sb.append("    txPkts: ").append(toIndentedString(txPkts)).append("\n");
        sb.append("    zeroWindowSizeEvents: ").append(toIndentedString(zeroWindowSizeEvents)).append("\n");
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

