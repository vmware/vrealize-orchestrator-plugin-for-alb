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
 * The CRL is a POJO class extends AviRestResource that used for creating
 * CRL.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CRL")
@VsoFinder(name = Constants.FINDER_VRO_CRL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CRL extends AviRestResource {
  @JsonProperty("body")
  @JsonInclude(Include.NON_NULL)
  private String body = null;

  @JsonProperty("common_name")
  @JsonInclude(Include.NON_NULL)
  private String commonName = null;

  @JsonProperty("distinguished_name")
  @JsonInclude(Include.NON_NULL)
  private String distinguishedName = null;

  @JsonProperty("etag")
  @JsonInclude(Include.NON_NULL)
  private String etag = null;

  @JsonProperty("fingerprint")
  @JsonInclude(Include.NON_NULL)
  private String fingerprint = null;

  @JsonProperty("last_refreshed")
  @JsonInclude(Include.NON_NULL)
  private String lastRefreshed = null;

  @JsonProperty("last_update")
  @JsonInclude(Include.NON_NULL)
  private String lastUpdate = null;

  @JsonProperty("next_update")
  @JsonInclude(Include.NON_NULL)
  private String nextUpdate = null;

  @JsonProperty("server_url")
  @JsonInclude(Include.NON_NULL)
  private String serverUrl = null;

  @JsonProperty("text")
  @JsonInclude(Include.NON_NULL)
  private String text = null;

  @JsonProperty("update_interval")
  @JsonInclude(Include.NON_NULL)
  private Integer updateInterval = null;



  /**
   * This is the getter method this will return the attribute value.
   * Certificate revocation list from a given issuer in pem format.
   * This can either be configured directly or via the server_url.
   * @return body
   */
  @VsoMethod
  public String getBody() {
    return body;
  }

  /**
   * This is the setter method to the attribute.
   * Certificate revocation list from a given issuer in pem format.
   * This can either be configured directly or via the server_url.
   * @param body set the body.
   */
  @VsoMethod
  public void setBody(String  body) {
    this.body = body;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Common name of the issuer in the certificate revocation list.
   * @return commonName
   */
  @VsoMethod
  public String getCommonName() {
    return commonName;
  }

  /**
   * This is the setter method to the attribute.
   * Common name of the issuer in the certificate revocation list.
   * @param commonName set the commonName.
   */
  @VsoMethod
  public void setCommonName(String  commonName) {
    this.commonName = commonName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Distinguished name of the issuer in the certificate revocation list.
   * @return distinguishedName
   */
  @VsoMethod
  public String getDistinguishedName() {
    return distinguishedName;
  }

  /**
   * This is the setter method to the attribute.
   * Distinguished name of the issuer in the certificate revocation list.
   * @param distinguishedName set the distinguishedName.
   */
  @VsoMethod
  public void setDistinguishedName(String  distinguishedName) {
    this.distinguishedName = distinguishedName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cached etag to optimize the download of the crl.
   * @return etag
   */
  @VsoMethod
  public String getEtag() {
    return etag;
  }

  /**
   * This is the setter method to the attribute.
   * Cached etag to optimize the download of the crl.
   * @param etag set the etag.
   */
  @VsoMethod
  public void setEtag(String  etag) {
    this.etag = etag;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Fingerprint of the crl.
   * Used to avoid configuring duplicates.
   * @return fingerprint
   */
  @VsoMethod
  public String getFingerprint() {
    return fingerprint;
  }

  /**
   * This is the setter method to the attribute.
   * Fingerprint of the crl.
   * Used to avoid configuring duplicates.
   * @param fingerprint set the fingerprint.
   */
  @VsoMethod
  public void setFingerprint(String  fingerprint) {
    this.fingerprint = fingerprint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Last time crl was refreshed by the system.
   * This is an internal field used by the system.
   * @return lastRefreshed
   */
  @VsoMethod
  public String getLastRefreshed() {
    return lastRefreshed;
  }

  /**
   * This is the setter method to the attribute.
   * Last time crl was refreshed by the system.
   * This is an internal field used by the system.
   * @param lastRefreshed set the lastRefreshed.
   */
  @VsoMethod
  public void setLastRefreshed(String  lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The date when this crl was last issued.
   * @return lastUpdate
   */
  @VsoMethod
  public String getLastUpdate() {
    return lastUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * The date when this crl was last issued.
   * @param lastUpdate set the lastUpdate.
   */
  @VsoMethod
  public void setLastUpdate(String  lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The date when a newer crl will be available.
   * Also conveys the date after which the crl should be considered obsolete.
   * @return nextUpdate
   */
  @VsoMethod
  public String getNextUpdate() {
    return nextUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * The date when a newer crl will be available.
   * Also conveys the date after which the crl should be considered obsolete.
   * @param nextUpdate set the nextUpdate.
   */
  @VsoMethod
  public void setNextUpdate(String  nextUpdate) {
    this.nextUpdate = nextUpdate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Url of a server that issues the certificate revocation list.
   * If this is configured, crl will be periodically downloaded either based on the configured update interval or the next update interval in the crl.
   * Crl itself is stored in the body.
   * @return serverUrl
   */
  @VsoMethod
  public String getServerUrl() {
    return serverUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Url of a server that issues the certificate revocation list.
   * If this is configured, crl will be periodically downloaded either based on the configured update interval or the next update interval in the crl.
   * Crl itself is stored in the body.
   * @param serverUrl set the serverUrl.
   */
  @VsoMethod
  public void setServerUrl(String  serverUrl) {
    this.serverUrl = serverUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Certificate revocation list in plain text for readability.
   * @return text
   */
  @VsoMethod
  public String getText() {
    return text;
  }

  /**
   * This is the setter method to the attribute.
   * Certificate revocation list in plain text for readability.
   * @param text set the text.
   */
  @VsoMethod
  public void setText(String  text) {
    this.text = text;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Interval in minutes to check for crl update.
   * If not specified, interval will be 1 day.
   * Allowed values are 30-max.
   * @return updateInterval
   */
  @VsoMethod
  public Integer getUpdateInterval() {
    return updateInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Interval in minutes to check for crl update.
   * If not specified, interval will be 1 day.
   * Allowed values are 30-max.
   * @param updateInterval set the updateInterval.
   */
  @VsoMethod
  public void setUpdateInterval(Integer  updateInterval) {
    this.updateInterval = updateInterval;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CRL objCRL = (CRL) o;
  return   Objects.equals(this.body, objCRL.body)&&
  Objects.equals(this.distinguishedName, objCRL.distinguishedName)&&
  Objects.equals(this.text, objCRL.text)&&
  Objects.equals(this.serverUrl, objCRL.serverUrl)&&
  Objects.equals(this.lastUpdate, objCRL.lastUpdate)&&
  Objects.equals(this.lastRefreshed, objCRL.lastRefreshed)&&
  Objects.equals(this.etag, objCRL.etag)&&
  Objects.equals(this.fingerprint, objCRL.fingerprint)&&
  Objects.equals(this.commonName, objCRL.commonName)&&
  Objects.equals(this.nextUpdate, objCRL.nextUpdate)&&
  Objects.equals(this.updateInterval, objCRL.updateInterval);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CRL {\n");
      sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    lastRefreshed: ").append(toIndentedString(lastRefreshed)).append("\n");
        sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
        sb.append("    nextUpdate: ").append(toIndentedString(nextUpdate)).append("\n");
        sb.append("    serverUrl: ").append(toIndentedString(serverUrl)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    updateInterval: ").append(toIndentedString(updateInterval)).append("\n");
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
