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
 * The MetricsData is a POJO class extends AviRestResource that used for creating
 * MetricsData.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsData")
@VsoFinder(name = Constants.FINDER_VRO_METRICSDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsData extends AviRestResource {
    @JsonProperty("application_response_time")
    @JsonInclude(Include.NON_NULL)
    private Float applicationResponseTime = null;

    @JsonProperty("blocking_time")
    @JsonInclude(Include.NON_NULL)
    private Float blockingTime = null;

    @JsonProperty("browser_rendering_time")
    @JsonInclude(Include.NON_NULL)
    private Float browserRenderingTime = null;

    @JsonProperty("client_rtt")
    @JsonInclude(Include.NON_NULL)
    private Float clientRtt = null;

    @JsonProperty("connection_time")
    @JsonInclude(Include.NON_NULL)
    private Float connectionTime = null;

    @JsonProperty("dns_lookup_time")
    @JsonInclude(Include.NON_NULL)
    private Float dnsLookupTime = null;

    @JsonProperty("dom_content_load_time")
    @JsonInclude(Include.NON_NULL)
    private Float domContentLoadTime = null;

    @JsonProperty("is_null")
    @JsonInclude(Include.NON_NULL)
    private Boolean isNull = null;

    @JsonProperty("num_samples")
    @JsonInclude(Include.NON_NULL)
    private Integer numSamples = null;

    @JsonProperty("page_download_time")
    @JsonInclude(Include.NON_NULL)
    private Float pageDownloadTime = null;

    @JsonProperty("page_load_time")
    @JsonInclude(Include.NON_NULL)
    private Float pageLoadTime = null;

    @JsonProperty("prediction_interval_high")
    @JsonInclude(Include.NON_NULL)
    private Float predictionIntervalHigh = null;

    @JsonProperty("prediction_interval_low")
    @JsonInclude(Include.NON_NULL)
    private Float predictionIntervalLow = null;

    @JsonProperty("redirection_time")
    @JsonInclude(Include.NON_NULL)
    private Float redirectionTime = null;

    @JsonProperty("rum_client_data_transfer_time")
    @JsonInclude(Include.NON_NULL)
    private Float rumClientDataTransferTime = null;

    @JsonProperty("server_rtt")
    @JsonInclude(Include.NON_NULL)
    private Float serverRtt = null;

    @JsonProperty("service_time")
    @JsonInclude(Include.NON_NULL)
    private Float serviceTime = null;

    @JsonProperty("timestamp")
    @JsonInclude(Include.NON_NULL)
    private String timestamp = null;

    @JsonProperty("value")
    @JsonInclude(Include.NON_NULL)
    private Float value = null;

    @JsonProperty("value_str")
    @JsonInclude(Include.NON_NULL)
    private String valueStr = null;

    @JsonProperty("value_str_desc")
    @JsonInclude(Include.NON_NULL)
    private String valueStrDesc = null;

    @JsonProperty("waiting_time")
    @JsonInclude(Include.NON_NULL)
    private Float waitingTime = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return applicationResponseTime
   */
  @VsoMethod
  public Float getApplicationResponseTime() {
    return applicationResponseTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param applicationResponseTime set the applicationResponseTime.
   */
  @VsoMethod
  public void setApplicationResponseTime(Float  applicationResponseTime) {
    this.applicationResponseTime = applicationResponseTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return blockingTime
   */
  @VsoMethod
  public Float getBlockingTime() {
    return blockingTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param blockingTime set the blockingTime.
   */
  @VsoMethod
  public void setBlockingTime(Float  blockingTime) {
    this.blockingTime = blockingTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return browserRenderingTime
   */
  @VsoMethod
  public Float getBrowserRenderingTime() {
    return browserRenderingTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param browserRenderingTime set the browserRenderingTime.
   */
  @VsoMethod
  public void setBrowserRenderingTime(Float  browserRenderingTime) {
    this.browserRenderingTime = browserRenderingTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientRtt
   */
  @VsoMethod
  public Float getClientRtt() {
    return clientRtt;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientRtt set the clientRtt.
   */
  @VsoMethod
  public void setClientRtt(Float  clientRtt) {
    this.clientRtt = clientRtt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connectionTime
   */
  @VsoMethod
  public Float getConnectionTime() {
    return connectionTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param connectionTime set the connectionTime.
   */
  @VsoMethod
  public void setConnectionTime(Float  connectionTime) {
    this.connectionTime = connectionTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsLookupTime
   */
  @VsoMethod
  public Float getDnsLookupTime() {
    return dnsLookupTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dnsLookupTime set the dnsLookupTime.
   */
  @VsoMethod
  public void setDnsLookupTime(Float  dnsLookupTime) {
    this.dnsLookupTime = dnsLookupTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return domContentLoadTime
   */
  @VsoMethod
  public Float getDomContentLoadTime() {
    return domContentLoadTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param domContentLoadTime set the domContentLoadTime.
   */
  @VsoMethod
  public void setDomContentLoadTime(Float  domContentLoadTime) {
    this.domContentLoadTime = domContentLoadTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return isNull
   */
  @VsoMethod
  public Boolean getIsNull() {
    return isNull;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param isNull set the isNull.
   */
  @VsoMethod
  public void setIsNull(Boolean  isNull) {
    this.isNull = isNull;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numSamples
   */
  @VsoMethod
  public Integer getNumSamples() {
    return numSamples;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numSamples set the numSamples.
   */
  @VsoMethod
  public void setNumSamples(Integer  numSamples) {
    this.numSamples = numSamples;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pageDownloadTime
   */
  @VsoMethod
  public Float getPageDownloadTime() {
    return pageDownloadTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pageDownloadTime set the pageDownloadTime.
   */
  @VsoMethod
  public void setPageDownloadTime(Float  pageDownloadTime) {
    this.pageDownloadTime = pageDownloadTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pageLoadTime
   */
  @VsoMethod
  public Float getPageLoadTime() {
    return pageLoadTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pageLoadTime set the pageLoadTime.
   */
  @VsoMethod
  public void setPageLoadTime(Float  pageLoadTime) {
    this.pageLoadTime = pageLoadTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return predictionIntervalHigh
   */
  @VsoMethod
  public Float getPredictionIntervalHigh() {
    return predictionIntervalHigh;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param predictionIntervalHigh set the predictionIntervalHigh.
   */
  @VsoMethod
  public void setPredictionIntervalHigh(Float  predictionIntervalHigh) {
    this.predictionIntervalHigh = predictionIntervalHigh;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return predictionIntervalLow
   */
  @VsoMethod
  public Float getPredictionIntervalLow() {
    return predictionIntervalLow;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param predictionIntervalLow set the predictionIntervalLow.
   */
  @VsoMethod
  public void setPredictionIntervalLow(Float  predictionIntervalLow) {
    this.predictionIntervalLow = predictionIntervalLow;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return redirectionTime
   */
  @VsoMethod
  public Float getRedirectionTime() {
    return redirectionTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param redirectionTime set the redirectionTime.
   */
  @VsoMethod
  public void setRedirectionTime(Float  redirectionTime) {
    this.redirectionTime = redirectionTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rumClientDataTransferTime
   */
  @VsoMethod
  public Float getRumClientDataTransferTime() {
    return rumClientDataTransferTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rumClientDataTransferTime set the rumClientDataTransferTime.
   */
  @VsoMethod
  public void setRumClientDataTransferTime(Float  rumClientDataTransferTime) {
    this.rumClientDataTransferTime = rumClientDataTransferTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverRtt
   */
  @VsoMethod
  public Float getServerRtt() {
    return serverRtt;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverRtt set the serverRtt.
   */
  @VsoMethod
  public void setServerRtt(Float  serverRtt) {
    this.serverRtt = serverRtt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceTime
   */
  @VsoMethod
  public Float getServiceTime() {
    return serviceTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceTime set the serviceTime.
   */
  @VsoMethod
  public void setServiceTime(Float  serviceTime) {
    this.serviceTime = serviceTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timestamp
   */
  @VsoMethod
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timestamp set the timestamp.
   */
  @VsoMethod
  public void setTimestamp(String  timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return value
   */
  @VsoMethod
  public Float getValue() {
    return value;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param value set the value.
   */
  @VsoMethod
  public void setValue(Float  value) {
    this.value = value;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return valueStr
   */
  @VsoMethod
  public String getValueStr() {
    return valueStr;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param valueStr set the valueStr.
   */
  @VsoMethod
  public void setValueStr(String  valueStr) {
    this.valueStr = valueStr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return valueStrDesc
   */
  @VsoMethod
  public String getValueStrDesc() {
    return valueStrDesc;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param valueStrDesc set the valueStrDesc.
   */
  @VsoMethod
  public void setValueStrDesc(String  valueStrDesc) {
    this.valueStrDesc = valueStrDesc;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return waitingTime
   */
  @VsoMethod
  public Float getWaitingTime() {
    return waitingTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param waitingTime set the waitingTime.
   */
  @VsoMethod
  public void setWaitingTime(Float  waitingTime) {
    this.waitingTime = waitingTime;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricsData objMetricsData = (MetricsData) o;
  return   Objects.equals(this.timestamp, objMetricsData.timestamp)&&
  Objects.equals(this.value, objMetricsData.value)&&
  Objects.equals(this.numSamples, objMetricsData.numSamples)&&
  Objects.equals(this.blockingTime, objMetricsData.blockingTime)&&
  Objects.equals(this.dnsLookupTime, objMetricsData.dnsLookupTime)&&
  Objects.equals(this.connectionTime, objMetricsData.connectionTime)&&
  Objects.equals(this.redirectionTime, objMetricsData.redirectionTime)&&
  Objects.equals(this.applicationResponseTime, objMetricsData.applicationResponseTime)&&
  Objects.equals(this.serverRtt, objMetricsData.serverRtt)&&
  Objects.equals(this.clientRtt, objMetricsData.clientRtt)&&
  Objects.equals(this.serviceTime, objMetricsData.serviceTime)&&
  Objects.equals(this.pageDownloadTime, objMetricsData.pageDownloadTime)&&
  Objects.equals(this.browserRenderingTime, objMetricsData.browserRenderingTime)&&
  Objects.equals(this.pageLoadTime, objMetricsData.pageLoadTime)&&
  Objects.equals(this.domContentLoadTime, objMetricsData.domContentLoadTime)&&
  Objects.equals(this.waitingTime, objMetricsData.waitingTime)&&
  Objects.equals(this.rumClientDataTransferTime, objMetricsData.rumClientDataTransferTime)&&
  Objects.equals(this.isNull, objMetricsData.isNull)&&
  Objects.equals(this.predictionIntervalHigh, objMetricsData.predictionIntervalHigh)&&
  Objects.equals(this.predictionIntervalLow, objMetricsData.predictionIntervalLow)&&
  Objects.equals(this.valueStr, objMetricsData.valueStr)&&
  Objects.equals(this.valueStrDesc, objMetricsData.valueStrDesc);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsData {\n");
      sb.append("    applicationResponseTime: ").append(toIndentedString(applicationResponseTime)).append("\n");
        sb.append("    blockingTime: ").append(toIndentedString(blockingTime)).append("\n");
        sb.append("    browserRenderingTime: ").append(toIndentedString(browserRenderingTime)).append("\n");
        sb.append("    clientRtt: ").append(toIndentedString(clientRtt)).append("\n");
        sb.append("    connectionTime: ").append(toIndentedString(connectionTime)).append("\n");
        sb.append("    dnsLookupTime: ").append(toIndentedString(dnsLookupTime)).append("\n");
        sb.append("    domContentLoadTime: ").append(toIndentedString(domContentLoadTime)).append("\n");
        sb.append("    isNull: ").append(toIndentedString(isNull)).append("\n");
        sb.append("    numSamples: ").append(toIndentedString(numSamples)).append("\n");
        sb.append("    pageDownloadTime: ").append(toIndentedString(pageDownloadTime)).append("\n");
        sb.append("    pageLoadTime: ").append(toIndentedString(pageLoadTime)).append("\n");
        sb.append("    predictionIntervalHigh: ").append(toIndentedString(predictionIntervalHigh)).append("\n");
        sb.append("    predictionIntervalLow: ").append(toIndentedString(predictionIntervalLow)).append("\n");
        sb.append("    redirectionTime: ").append(toIndentedString(redirectionTime)).append("\n");
        sb.append("    rumClientDataTransferTime: ").append(toIndentedString(rumClientDataTransferTime)).append("\n");
        sb.append("    serverRtt: ").append(toIndentedString(serverRtt)).append("\n");
        sb.append("    serviceTime: ").append(toIndentedString(serviceTime)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueStr: ").append(toIndentedString(valueStr)).append("\n");
        sb.append("    valueStrDesc: ").append(toIndentedString(valueStrDesc)).append("\n");
        sb.append("    waitingTime: ").append(toIndentedString(waitingTime)).append("\n");
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

