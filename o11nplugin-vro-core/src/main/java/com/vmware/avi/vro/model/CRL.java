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
 * CRL
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CRL")
@VsoFinder(name = Constants.FINDER_VRO_CRL, idAccessor = "getObjectID()")
@Service
public class CRL extends AviRestResource  {
  @JsonProperty("body")
  private String body = null;

  @JsonProperty("common_name")
  private String commonName = null;

  @JsonProperty("distinguished_name")
  private String distinguishedName = null;

  @JsonProperty("etag")
  private String etag = null;

  @JsonProperty("fingerprint")
  private String fingerprint = null;

  @JsonProperty("last_refreshed")
  private String lastRefreshed = null;

  @JsonProperty("last_update")
  private String lastUpdate = null;

  @JsonProperty("next_update")
  private String nextUpdate = null;

  @JsonProperty("server_url")
  private String serverUrl = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("update_interval")
  private Integer updateInterval = null;

  
  /**
   * Certificate Revocation list from a given issuer in PEM format. This can either be configured directly or via the server_url. .
   * @return body
  **/
  @ApiModelProperty(value = "Certificate Revocation list from a given issuer in PEM format. This can either be configured directly or via the server_url. .")


 
  @VsoMethod  
  public String getBody() {
    return body;
  }
    
  @VsoMethod
  public void setBody(String body) {
    this.body = body;
  }

  
  /**
   * Common name of the issuer in the Certificate Revocation list.
   * @return commonName
  **/
  @ApiModelProperty(value = "Common name of the issuer in the Certificate Revocation list.")


 
  @VsoMethod  
  public String getCommonName() {
    return commonName;
  }
    
  @VsoMethod
  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  
  /**
   * Distinguished name of the issuer in the Certificate Revocation list.
   * @return distinguishedName
  **/
  @ApiModelProperty(value = "Distinguished name of the issuer in the Certificate Revocation list.")


 
  @VsoMethod  
  public String getDistinguishedName() {
    return distinguishedName;
  }
    
  @VsoMethod
  public void setDistinguishedName(String distinguishedName) {
    this.distinguishedName = distinguishedName;
  }

  
  /**
   * Cached etag to optimize the download of the CRL.
   * @return etag
  **/
  @ApiModelProperty(value = "Cached etag to optimize the download of the CRL.")


 
  @VsoMethod  
  public String getEtag() {
    return etag;
  }
    
  @VsoMethod
  public void setEtag(String etag) {
    this.etag = etag;
  }

  
  /**
   * Fingerprint of the CRL. Used to avoid configuring duplicates.
   * @return fingerprint
  **/
  @ApiModelProperty(value = "Fingerprint of the CRL. Used to avoid configuring duplicates.")


 
  @VsoMethod  
  public String getFingerprint() {
    return fingerprint;
  }
    
  @VsoMethod
  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  
  /**
   * Last time CRL was refreshed by the system. This is an internal field used by the system.
   * @return lastRefreshed
  **/
  @ApiModelProperty(value = "Last time CRL was refreshed by the system. This is an internal field used by the system.")


 
  @VsoMethod  
  public String getLastRefreshed() {
    return lastRefreshed;
  }
    
  @VsoMethod
  public void setLastRefreshed(String lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
  }

  
  /**
   * The date when this CRL was last issued.
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "The date when this CRL was last issued.")


 
  @VsoMethod  
  public String getLastUpdate() {
    return lastUpdate;
  }
    
  @VsoMethod
  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  
  /**
   * The date when a newer CRL will be available. Also conveys the date after which the CRL should be considered obsolete.
   * @return nextUpdate
  **/
  @ApiModelProperty(value = "The date when a newer CRL will be available. Also conveys the date after which the CRL should be considered obsolete.")


 
  @VsoMethod  
  public String getNextUpdate() {
    return nextUpdate;
  }
    
  @VsoMethod
  public void setNextUpdate(String nextUpdate) {
    this.nextUpdate = nextUpdate;
  }

  
  /**
   * URL of a server that issues the Certificate Revocation list. If this is configured, CRL will be periodically downloaded either based on the configured update interval or the next update interval in the CRL. CRL itself is stored in the body.
   * @return serverUrl
  **/
  @ApiModelProperty(value = "URL of a server that issues the Certificate Revocation list. If this is configured, CRL will be periodically downloaded either based on the configured update interval or the next update interval in the CRL. CRL itself is stored in the body.")


 
  @VsoMethod  
  public String getServerUrl() {
    return serverUrl;
  }
    
  @VsoMethod
  public void setServerUrl(String serverUrl) {
    this.serverUrl = serverUrl;
  }

  
  /**
   * Certificate Revocation list in plain text for readability.
   * @return text
  **/
  @ApiModelProperty(value = "Certificate Revocation list in plain text for readability.")


 
  @VsoMethod  
  public String getText() {
    return text;
  }
    
  @VsoMethod
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Interval in minutes to check for CRL update. If not specified, interval will be 1 day. Allowed values are 30-MAX.
   * @return updateInterval
  **/
  @ApiModelProperty(value = "Interval in minutes to check for CRL update. If not specified, interval will be 1 day. Allowed values are 30-MAX.")


 
  @VsoMethod  
  public Integer getUpdateInterval() {
    return updateInterval;
  }
    
  @VsoMethod
  public void setUpdateInterval(Integer updateInterval) {
    this.updateInterval = updateInterval;
  }

  
  public String getObjectID() {
		return "CRL";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRL CRL = (CRL) o;
    return Objects.equals(this.body, CRL.body) &&
        Objects.equals(this.commonName, CRL.commonName) &&
        Objects.equals(this.distinguishedName, CRL.distinguishedName) &&
        Objects.equals(this.etag, CRL.etag) &&
        Objects.equals(this.fingerprint, CRL.fingerprint) &&
        Objects.equals(this.lastRefreshed, CRL.lastRefreshed) &&
        Objects.equals(this.lastUpdate, CRL.lastUpdate) &&
        Objects.equals(this.nextUpdate, CRL.nextUpdate) &&
        Objects.equals(this.serverUrl, CRL.serverUrl) &&
        Objects.equals(this.text, CRL.text) &&
        Objects.equals(this.updateInterval, CRL.updateInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, commonName, distinguishedName, etag, fingerprint, lastRefreshed, lastUpdate, nextUpdate, serverUrl, text, updateInterval);
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

