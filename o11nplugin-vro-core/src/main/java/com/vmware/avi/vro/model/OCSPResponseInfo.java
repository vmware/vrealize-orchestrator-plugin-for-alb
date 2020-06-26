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
 * The OCSPResponseInfo is a POJO class extends AviRestResource that used for creating
 * OCSPResponseInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OCSPResponseInfo")
@VsoFinder(name = Constants.FINDER_VRO_OCSPRESPONSEINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OCSPResponseInfo extends AviRestResource {
  @JsonProperty("cert_status")
  @JsonInclude(Include.NON_NULL)
  private String certStatus = null;

  @JsonProperty("next_update")
  @JsonInclude(Include.NON_NULL)
  private String nextUpdate = null;

  @JsonProperty("ocsp_resp_from_responder_url")
  @JsonInclude(Include.NON_NULL)
  private String ocspRespFromResponderUrl = null;

  @JsonProperty("ocsp_response")
  @JsonInclude(Include.NON_NULL)
  private String ocspResponse = null;

  @JsonProperty("revocation_reason")
  @JsonInclude(Include.NON_NULL)
  private String revocationReason = null;

  @JsonProperty("revocation_time")
  @JsonInclude(Include.NON_NULL)
  private String revocationTime = null;

  @JsonProperty("this_update")
  @JsonInclude(Include.NON_NULL)
  private String thisUpdate = null;



  /**
   * This is the getter method this will return the attribute value.
   * Revocation status of the certificate.
   * Enum options - OCSP_CERTSTATUS_GOOD, OCSP_CERTSTATUS_REVOKED, OCSP_CERTSTATUS_UNKNOWN.
   * Field introduced in 20.1.1.
   * @return certStatus
   */
  @VsoMethod
  public String getCertStatus() {
    return certStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Revocation status of the certificate.
   * Enum options - OCSP_CERTSTATUS_GOOD, OCSP_CERTSTATUS_REVOKED, OCSP_CERTSTATUS_UNKNOWN.
   * Field introduced in 20.1.1.
   * @param certStatus set the certStatus.
   */
  @VsoMethod
  public void setCertStatus(String  certStatus) {
    this.certStatus = certStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The time at or before which newer information will be available about the status of the certificate.
   * Field introduced in 20.1.1.
   * @return nextUpdate
   */
  @VsoMethod
  public String getNextUpdate() {
    return nextUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * The time at or before which newer information will be available about the status of the certificate.
   * Field introduced in 20.1.1.
   * @param nextUpdate set the nextUpdate.
   */
  @VsoMethod
  public void setNextUpdate(String  nextUpdate) {
    this.nextUpdate = nextUpdate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The ocsp responder url from which the response is received.
   * Field introduced in 20.1.1.
   * @return ocspRespFromResponderUrl
   */
  @VsoMethod
  public String getOcspRespFromResponderUrl() {
    return ocspRespFromResponderUrl;
  }

  /**
   * This is the setter method to the attribute.
   * The ocsp responder url from which the response is received.
   * Field introduced in 20.1.1.
   * @param ocspRespFromResponderUrl set the ocspRespFromResponderUrl.
   */
  @VsoMethod
  public void setOcspRespFromResponderUrl(String  ocspRespFromResponderUrl) {
    this.ocspRespFromResponderUrl = ocspRespFromResponderUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Signed ocsp response received from the ca's ocsp responder.
   * Field introduced in 20.1.1.
   * @return ocspResponse
   */
  @VsoMethod
  public String getOcspResponse() {
    return ocspResponse;
  }

  /**
   * This is the setter method to the attribute.
   * Signed ocsp response received from the ca's ocsp responder.
   * Field introduced in 20.1.1.
   * @param ocspResponse set the ocspResponse.
   */
  @VsoMethod
  public void setOcspResponse(String  ocspResponse) {
    this.ocspResponse = ocspResponse;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The reason for the revocation of the certificate.
   * Enum options - OCSP_REVOCATION_REASON_UNSPECIFIED, OCSP_REVOCATION_REASON_KEY_COMPROMISE, OCSP_REVOCATION_REASON_CA_COMPROMISE,
   * OCSP_REVOCATION_REASON_AFFILIATION_CHANGED, OCSP_REVOCATION_REASON_SUPERSEDED, OCSP_REVOCATION_REASON_CESSATION_OF_OPERATION,
   * OCSP_REVOCATION_REASON_CERTIFICATE_HOLD, OCSP_REVOCATION_REASON_REMOVE_FROM_CRL, OCSP_REVOCATION_REASON_PRIVILEGE_WITHDRAWN,
   * OCSP_REVOCATION_REASON_AA_COMPROMISE.
   * Field introduced in 20.1.1.
   * @return revocationReason
   */
  @VsoMethod
  public String getRevocationReason() {
    return revocationReason;
  }

  /**
   * This is the setter method to the attribute.
   * The reason for the revocation of the certificate.
   * Enum options - OCSP_REVOCATION_REASON_UNSPECIFIED, OCSP_REVOCATION_REASON_KEY_COMPROMISE, OCSP_REVOCATION_REASON_CA_COMPROMISE,
   * OCSP_REVOCATION_REASON_AFFILIATION_CHANGED, OCSP_REVOCATION_REASON_SUPERSEDED, OCSP_REVOCATION_REASON_CESSATION_OF_OPERATION,
   * OCSP_REVOCATION_REASON_CERTIFICATE_HOLD, OCSP_REVOCATION_REASON_REMOVE_FROM_CRL, OCSP_REVOCATION_REASON_PRIVILEGE_WITHDRAWN,
   * OCSP_REVOCATION_REASON_AA_COMPROMISE.
   * Field introduced in 20.1.1.
   * @param revocationReason set the revocationReason.
   */
  @VsoMethod
  public void setRevocationReason(String  revocationReason) {
    this.revocationReason = revocationReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Iso 8601 compatible timestamp at which the certificate was revoked or placed on hold.
   * Field introduced in 20.1.1.
   * @return revocationTime
   */
  @VsoMethod
  public String getRevocationTime() {
    return revocationTime;
  }

  /**
   * This is the setter method to the attribute.
   * Iso 8601 compatible timestamp at which the certificate was revoked or placed on hold.
   * Field introduced in 20.1.1.
   * @param revocationTime set the revocationTime.
   */
  @VsoMethod
  public void setRevocationTime(String  revocationTime) {
    this.revocationTime = revocationTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The most recent time at which the status being indicated is known by the ocsp responder to have been correct.
   * Field introduced in 20.1.1.
   * @return thisUpdate
   */
  @VsoMethod
  public String getThisUpdate() {
    return thisUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * The most recent time at which the status being indicated is known by the ocsp responder to have been correct.
   * Field introduced in 20.1.1.
   * @param thisUpdate set the thisUpdate.
   */
  @VsoMethod
  public void setThisUpdate(String  thisUpdate) {
    this.thisUpdate = thisUpdate;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OCSPResponseInfo objOCSPResponseInfo = (OCSPResponseInfo) o;
  return   Objects.equals(this.revocationReason, objOCSPResponseInfo.revocationReason)&&
  Objects.equals(this.certStatus, objOCSPResponseInfo.certStatus)&&
  Objects.equals(this.ocspResponse, objOCSPResponseInfo.ocspResponse)&&
  Objects.equals(this.revocationTime, objOCSPResponseInfo.revocationTime)&&
  Objects.equals(this.nextUpdate, objOCSPResponseInfo.nextUpdate)&&
  Objects.equals(this.thisUpdate, objOCSPResponseInfo.thisUpdate)&&
  Objects.equals(this.ocspRespFromResponderUrl, objOCSPResponseInfo.ocspRespFromResponderUrl);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OCSPResponseInfo {\n");
      sb.append("    certStatus: ").append(toIndentedString(certStatus)).append("\n");
        sb.append("    nextUpdate: ").append(toIndentedString(nextUpdate)).append("\n");
        sb.append("    ocspRespFromResponderUrl: ").append(toIndentedString(ocspRespFromResponderUrl)).append("\n");
        sb.append("    ocspResponse: ").append(toIndentedString(ocspResponse)).append("\n");
        sb.append("    revocationReason: ").append(toIndentedString(revocationReason)).append("\n");
        sb.append("    revocationTime: ").append(toIndentedString(revocationTime)).append("\n");
        sb.append("    thisUpdate: ").append(toIndentedString(thisUpdate)).append("\n");
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
