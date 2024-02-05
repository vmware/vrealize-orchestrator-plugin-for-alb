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
 * The OCSPConfig is a POJO class extends AviRestResource that used for creating
 * OCSPConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OCSPConfig")
@VsoFinder(name = Constants.FINDER_VRO_OCSPCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OCSPConfig extends AviRestResource {
    @JsonProperty("failed_ocsp_jobs_retry_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer failedOcspJobsRetryInterval = 3600;

    @JsonProperty("max_tries")
    @JsonInclude(Include.NON_NULL)
    private Integer maxTries = 10;

    @JsonProperty("ocsp_req_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer ocspReqInterval = 86400;

    @JsonProperty("ocsp_resp_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer ocspRespTimeout;

    @JsonProperty("responder_url_lists")
    @JsonInclude(Include.NON_NULL)
    private List<String> responderUrlLists;

    @JsonProperty("url_action")
    @JsonInclude(Include.NON_NULL)
    private String urlAction = "OCSP_RESPONDER_URL_FAILOVER";



  /**
   * This is the getter method this will return the attribute value.
   * Describes the time interval after which the next ocsp job needs to be scheduled in case of the ocsp job failures.
   * Allowed values are 60-86400.
   * Field introduced in 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3600.
   * @return failedOcspJobsRetryInterval
   */
  @VsoMethod
  public Integer getFailedOcspJobsRetryInterval() {
    return failedOcspJobsRetryInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Describes the time interval after which the next ocsp job needs to be scheduled in case of the ocsp job failures.
   * Allowed values are 60-86400.
   * Field introduced in 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3600.
   * @param failedOcspJobsRetryInterval set the failedOcspJobsRetryInterval.
   */
  @VsoMethod
  public void setFailedOcspJobsRetryInterval(Integer  failedOcspJobsRetryInterval) {
    this.failedOcspJobsRetryInterval = failedOcspJobsRetryInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of times the failed ocsp jobs can be scheduled.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return maxTries
   */
  @VsoMethod
  public Integer getMaxTries() {
    return maxTries;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of times the failed ocsp jobs can be scheduled.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param maxTries set the maxTries.
   */
  @VsoMethod
  public void setMaxTries(Integer  maxTries) {
    this.maxTries = maxTries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Interval between the ocsp queries.
   * Allowed values are 60-31536000.
   * Field introduced in 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 86400.
   * @return ocspReqInterval
   */
  @VsoMethod
  public Integer getOcspReqInterval() {
    return ocspReqInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Interval between the ocsp queries.
   * Allowed values are 60-31536000.
   * Field introduced in 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 86400.
   * @param ocspReqInterval set the ocspReqInterval.
   */
  @VsoMethod
  public void setOcspReqInterval(Integer  ocspReqInterval) {
    this.ocspReqInterval = ocspReqInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time in seconds that the system waits for a reply from the ocsp responder before dropping the connection.
   * Field introduced in 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ocspRespTimeout
   */
  @VsoMethod
  public Integer getOcspRespTimeout() {
    return ocspRespTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Time in seconds that the system waits for a reply from the ocsp responder before dropping the connection.
   * Field introduced in 20.1.1.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ocspRespTimeout set the ocspRespTimeout.
   */
  @VsoMethod
  public void setOcspRespTimeout(Integer  ocspRespTimeout) {
    this.ocspRespTimeout = ocspRespTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of responder urls configured by user to do failover/override the aia extension contained in the ocsp responder's ssl/tls certificate.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return responderUrlLists
   */
  @VsoMethod
  public List<String> getResponderUrlLists() {
    return responderUrlLists;
  }

  /**
   * This is the setter method. this will set the responderUrlLists
   * List of responder urls configured by user to do failover/override the aia extension contained in the ocsp responder's ssl/tls certificate.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return responderUrlLists
   */
  @VsoMethod
  public void setResponderUrlLists(List<String>  responderUrlLists) {
    this.responderUrlLists = responderUrlLists;
  }

  /**
   * This is the setter method this will set the responderUrlLists
   * List of responder urls configured by user to do failover/override the aia extension contained in the ocsp responder's ssl/tls certificate.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return responderUrlLists
   */
  @VsoMethod
  public OCSPConfig addResponderUrlListsItem(String responderUrlListsItem) {
    if (this.responderUrlLists == null) {
      this.responderUrlLists = new ArrayList<String>();
    }
    this.responderUrlLists.add(responderUrlListsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Describes the type of action to take with the responder urls.
   * Enum options - OCSP_RESPONDER_URL_FAILOVER, OCSP_RESPONDER_URL_OVERRIDE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "OCSP_RESPONDER_URL_FAILOVER".
   * @return urlAction
   */
  @VsoMethod
  public String getUrlAction() {
    return urlAction;
  }

  /**
   * This is the setter method to the attribute.
   * Describes the type of action to take with the responder urls.
   * Enum options - OCSP_RESPONDER_URL_FAILOVER, OCSP_RESPONDER_URL_OVERRIDE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "OCSP_RESPONDER_URL_FAILOVER".
   * @param urlAction set the urlAction.
   */
  @VsoMethod
  public void setUrlAction(String  urlAction) {
    this.urlAction = urlAction;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OCSPConfig objOCSPConfig = (OCSPConfig) o;
  return   Objects.equals(this.ocspReqInterval, objOCSPConfig.ocspReqInterval)&&
  Objects.equals(this.ocspRespTimeout, objOCSPConfig.ocspRespTimeout)&&
  Objects.equals(this.responderUrlLists, objOCSPConfig.responderUrlLists)&&
  Objects.equals(this.urlAction, objOCSPConfig.urlAction)&&
  Objects.equals(this.failedOcspJobsRetryInterval, objOCSPConfig.failedOcspJobsRetryInterval)&&
  Objects.equals(this.maxTries, objOCSPConfig.maxTries);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OCSPConfig {\n");
      sb.append("    failedOcspJobsRetryInterval: ").append(toIndentedString(failedOcspJobsRetryInterval)).append("\n");
        sb.append("    maxTries: ").append(toIndentedString(maxTries)).append("\n");
        sb.append("    ocspReqInterval: ").append(toIndentedString(ocspReqInterval)).append("\n");
        sb.append("    ocspRespTimeout: ").append(toIndentedString(ocspRespTimeout)).append("\n");
        sb.append("    responderUrlLists: ").append(toIndentedString(responderUrlLists)).append("\n");
        sb.append("    urlAction: ").append(toIndentedString(urlAction)).append("\n");
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

