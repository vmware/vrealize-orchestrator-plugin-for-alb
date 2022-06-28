package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TlsClientInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ClientFingerprints is a POJO class extends AviRestResource that used for creating
 * ClientFingerprints.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ClientFingerprints")
@VsoFinder(name = Constants.FINDER_VRO_CLIENTFINGERPRINTS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ClientFingerprints extends AviRestResource {
    @JsonProperty("filtered_tls_fingerprint")
    @JsonInclude(Include.NON_NULL)
    private String filteredTlsFingerprint = null;

    @JsonProperty("full_tls_fingerprint")
    @JsonInclude(Include.NON_NULL)
    private String fullTlsFingerprint = null;

    @JsonProperty("tls_client_info")
    @JsonInclude(Include.NON_NULL)
    private TlsClientInfo tlsClientInfo = null;



  /**
   * This is the getter method this will return the attribute value.
   * Message digest (md5) of filtered ja3 from clienthello.
   * This can deviate from 'tls_fingerprint' because not all extensions are considered.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return filteredTlsFingerprint
   */
  @VsoMethod
  public String getFilteredTlsFingerprint() {
    return filteredTlsFingerprint;
  }

  /**
   * This is the setter method to the attribute.
   * Message digest (md5) of filtered ja3 from clienthello.
   * This can deviate from 'tls_fingerprint' because not all extensions are considered.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param filteredTlsFingerprint set the filteredTlsFingerprint.
   */
  @VsoMethod
  public void setFilteredTlsFingerprint(String  filteredTlsFingerprint) {
    this.filteredTlsFingerprint = filteredTlsFingerprint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Message digest (md5) of ja3 from clienthello.
   * Only present if the full tls fingerprint is different from the filtered fingerprint.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fullTlsFingerprint
   */
  @VsoMethod
  public String getFullTlsFingerprint() {
    return fullTlsFingerprint;
  }

  /**
   * This is the setter method to the attribute.
   * Message digest (md5) of ja3 from clienthello.
   * Only present if the full tls fingerprint is different from the filtered fingerprint.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fullTlsFingerprint set the fullTlsFingerprint.
   */
  @VsoMethod
  public void setFullTlsFingerprint(String  fullTlsFingerprint) {
    this.fullTlsFingerprint = fullTlsFingerprint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Values of selected fields from the clienthello.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tlsClientInfo
   */
  @VsoMethod
  public TlsClientInfo getTlsClientInfo() {
    return tlsClientInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Values of selected fields from the clienthello.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tlsClientInfo set the tlsClientInfo.
   */
  @VsoMethod
  public void setTlsClientInfo(TlsClientInfo tlsClientInfo) {
    this.tlsClientInfo = tlsClientInfo;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ClientFingerprints objClientFingerprints = (ClientFingerprints) o;
  return   Objects.equals(this.tlsClientInfo, objClientFingerprints.tlsClientInfo)&&
  Objects.equals(this.fullTlsFingerprint, objClientFingerprints.fullTlsFingerprint)&&
  Objects.equals(this.filteredTlsFingerprint, objClientFingerprints.filteredTlsFingerprint);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ClientFingerprints {\n");
      sb.append("    filteredTlsFingerprint: ").append(toIndentedString(filteredTlsFingerprint)).append("\n");
        sb.append("    fullTlsFingerprint: ").append(toIndentedString(fullTlsFingerprint)).append("\n");
        sb.append("    tlsClientInfo: ").append(toIndentedString(tlsClientInfo)).append("\n");
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

