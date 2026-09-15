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
 * The MsgLbTransactionLog is a POJO class extends AviRestResource that used for creating
 * MsgLbTransactionLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MsgLbTransactionLog")
@VsoFinder(name = Constants.FINDER_VRO_MSGLBTRANSACTIONLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MsgLbTransactionLog extends AviRestResource {
    @JsonProperty("connpool_disposition")
    @JsonInclude(Include.NON_NULL)
    private Integer connpoolDisposition;

    @JsonProperty("latency_us")
    @JsonInclude(Include.NON_NULL)
    private Integer latencyUs;

    @JsonProperty("req_msg_len")
    @JsonInclude(Include.NON_NULL)
    private Integer reqMsgLen;

    @JsonProperty("resp_msg_len")
    @JsonInclude(Include.NON_NULL)
    private Integer respMsgLen;

    @JsonProperty("server_ip")
    @JsonInclude(Include.NON_NULL)
    private String serverIp;

    @JsonProperty("transaction_disposition")
    @JsonInclude(Include.NON_NULL)
    private Integer transactionDisposition;

    @JsonProperty("transaction_key")
    @JsonInclude(Include.NON_NULL)
    private String transactionKey;



  /**
   * This is the getter method this will return the attribute value.
   * Server-connection pool acquisition outcome for this request  0=new, 1=idle-reuse, 2=busy-round-robin.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connpoolDisposition
   */
  @VsoMethod
  public Integer getConnpoolDisposition() {
    return connpoolDisposition;
  }

  /**
   * This is the setter method to the attribute.
   * Server-connection pool acquisition outcome for this request  0=new, 1=idle-reuse, 2=busy-round-robin.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param connpoolDisposition set the connpoolDisposition.
   */
  @VsoMethod
  public void setConnpoolDisposition(Integer  connpoolDisposition) {
    this.connpoolDisposition = connpoolDisposition;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request-to-response latency in microseconds.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return latencyUs
   */
  @VsoMethod
  public Integer getLatencyUs() {
    return latencyUs;
  }

  /**
   * This is the setter method to the attribute.
   * Request-to-response latency in microseconds.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param latencyUs set the latencyUs.
   */
  @VsoMethod
  public void setLatencyUs(Integer  latencyUs) {
    this.latencyUs = latencyUs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Byte length of the request forwarded to the server.
   * Field introduced in 32.1.5.
   * Unit is bytes.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reqMsgLen
   */
  @VsoMethod
  public Integer getReqMsgLen() {
    return reqMsgLen;
  }

  /**
   * This is the setter method to the attribute.
   * Byte length of the request forwarded to the server.
   * Field introduced in 32.1.5.
   * Unit is bytes.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reqMsgLen set the reqMsgLen.
   */
  @VsoMethod
  public void setReqMsgLen(Integer  reqMsgLen) {
    this.reqMsgLen = reqMsgLen;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Byte length of the response received from the server.
   * Field introduced in 32.1.5.
   * Unit is bytes.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return respMsgLen
   */
  @VsoMethod
  public Integer getRespMsgLen() {
    return respMsgLen;
  }

  /**
   * This is the setter method to the attribute.
   * Byte length of the response received from the server.
   * Field introduced in 32.1.5.
   * Unit is bytes.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param respMsgLen set the respMsgLen.
   */
  @VsoMethod
  public void setRespMsgLen(Integer  respMsgLen) {
    this.respMsgLen = respMsgLen;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Backend server address in 'a.b.c.d port' format.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverIp
   */
  @VsoMethod
  public String getServerIp() {
    return serverIp;
  }

  /**
   * This is the setter method to the attribute.
   * Backend server address in 'a.b.c.d port' format.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverIp set the serverIp.
   */
  @VsoMethod
  public void setServerIp(String  serverIp) {
    this.serverIp = serverIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Transaction hash lookup outcome for this request  0=none, 1=hit, 2=miss.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return transactionDisposition
   */
  @VsoMethod
  public Integer getTransactionDisposition() {
    return transactionDisposition;
  }

  /**
   * This is the setter method to the attribute.
   * Transaction hash lookup outcome for this request  0=none, 1=hit, 2=miss.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param transactionDisposition set the transactionDisposition.
   */
  @VsoMethod
  public void setTransactionDisposition(Integer  transactionDisposition) {
    this.transactionDisposition = transactionDisposition;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Hex-encoded transaction/session key for this message, or 'none' if no key was supplied.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return transactionKey
   */
  @VsoMethod
  public String getTransactionKey() {
    return transactionKey;
  }

  /**
   * This is the setter method to the attribute.
   * Hex-encoded transaction/session key for this message, or 'none' if no key was supplied.
   * Field introduced in 32.1.5.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param transactionKey set the transactionKey.
   */
  @VsoMethod
  public void setTransactionKey(String  transactionKey) {
    this.transactionKey = transactionKey;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MsgLbTransactionLog objMsgLbTransactionLog = (MsgLbTransactionLog) o;
  return   Objects.equals(this.serverIp, objMsgLbTransactionLog.serverIp)&&
  Objects.equals(this.transactionKey, objMsgLbTransactionLog.transactionKey)&&
  Objects.equals(this.reqMsgLen, objMsgLbTransactionLog.reqMsgLen)&&
  Objects.equals(this.respMsgLen, objMsgLbTransactionLog.respMsgLen)&&
  Objects.equals(this.latencyUs, objMsgLbTransactionLog.latencyUs)&&
  Objects.equals(this.transactionDisposition, objMsgLbTransactionLog.transactionDisposition)&&
  Objects.equals(this.connpoolDisposition, objMsgLbTransactionLog.connpoolDisposition);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MsgLbTransactionLog {\n");
      sb.append("    connpoolDisposition: ").append(toIndentedString(connpoolDisposition)).append("\n");
        sb.append("    latencyUs: ").append(toIndentedString(latencyUs)).append("\n");
        sb.append("    reqMsgLen: ").append(toIndentedString(reqMsgLen)).append("\n");
        sb.append("    respMsgLen: ").append(toIndentedString(respMsgLen)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    transactionDisposition: ").append(toIndentedString(transactionDisposition)).append("\n");
        sb.append("    transactionKey: ").append(toIndentedString(transactionKey)).append("\n");
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

