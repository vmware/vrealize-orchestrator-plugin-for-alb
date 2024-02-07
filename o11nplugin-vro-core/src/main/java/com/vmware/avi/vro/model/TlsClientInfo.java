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
 * The TlsClientInfo is a POJO class extends AviRestResource that used for creating
 * TlsClientInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TlsClientInfo")
@VsoFinder(name = Constants.FINDER_VRO_TLSCLIENTINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TlsClientInfo extends AviRestResource {
    @JsonProperty("cipher_suites")
    @JsonInclude(Include.NON_NULL)
    private List<Integer> cipherSuites;

    @JsonProperty("client_hello_tls_version")
    @JsonInclude(Include.NON_NULL)
    private Integer clientHelloTlsVersion;

    @JsonProperty("point_formats")
    @JsonInclude(Include.NON_NULL)
    private List<Integer> pointFormats;

    @JsonProperty("supported_groups")
    @JsonInclude(Include.NON_NULL)
    private List<Integer> supportedGroups;

    @JsonProperty("tls_extensions")
    @JsonInclude(Include.NON_NULL)
    private List<Integer> tlsExtensions;

    @JsonProperty("uses_grease")
    @JsonInclude(Include.NON_NULL)
    private Boolean usesGrease;



  /**
   * This is the getter method this will return the attribute value.
   * The list of cipher suites in the clienthello as integers.
   * For example, tls_ecdhe_ecdsa_with_aes_128_cbc_sha (0xc009) will be shown as 49161.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cipherSuites
   */
  @VsoMethod
  public List<Integer> getCipherSuites() {
    return cipherSuites;
  }

  /**
   * This is the setter method. this will set the cipherSuites
   * The list of cipher suites in the clienthello as integers.
   * For example, tls_ecdhe_ecdsa_with_aes_128_cbc_sha (0xc009) will be shown as 49161.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cipherSuites
   */
  @VsoMethod
  public void setCipherSuites(List<Integer>  cipherSuites) {
    this.cipherSuites = cipherSuites;
  }

  /**
   * This is the setter method this will set the cipherSuites
   * The list of cipher suites in the clienthello as integers.
   * For example, tls_ecdhe_ecdsa_with_aes_128_cbc_sha (0xc009) will be shown as 49161.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cipherSuites
   */
  @VsoMethod
  public TlsClientInfo addCipherSuitesItem(Integer cipherSuitesItem) {
    if (this.cipherSuites == null) {
      this.cipherSuites = new ArrayList<Integer>();
    }
    this.cipherSuites.add(cipherSuitesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The tls version in the clienthello as integer.
   * For example, tlsv1.2 (0x0303) will be shown as 771.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientHelloTlsVersion
   */
  @VsoMethod
  public Integer getClientHelloTlsVersion() {
    return clientHelloTlsVersion;
  }

  /**
   * This is the setter method to the attribute.
   * The tls version in the clienthello as integer.
   * For example, tlsv1.2 (0x0303) will be shown as 771.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientHelloTlsVersion set the clientHelloTlsVersion.
   */
  @VsoMethod
  public void setClientHelloTlsVersion(Integer  clientHelloTlsVersion) {
    this.clientHelloTlsVersion = clientHelloTlsVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The list of supported ec point formats in the clienthello as integers.
   * For example, uncompressed will be shown as 0 (zero).
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pointFormats
   */
  @VsoMethod
  public List<Integer> getPointFormats() {
    return pointFormats;
  }

  /**
   * This is the setter method. this will set the pointFormats
   * The list of supported ec point formats in the clienthello as integers.
   * For example, uncompressed will be shown as 0 (zero).
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pointFormats
   */
  @VsoMethod
  public void setPointFormats(List<Integer>  pointFormats) {
    this.pointFormats = pointFormats;
  }

  /**
   * This is the setter method this will set the pointFormats
   * The list of supported ec point formats in the clienthello as integers.
   * For example, uncompressed will be shown as 0 (zero).
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pointFormats
   */
  @VsoMethod
  public TlsClientInfo addPointFormatsItem(Integer pointFormatsItem) {
    if (this.pointFormats == null) {
      this.pointFormats = new ArrayList<Integer>();
    }
    this.pointFormats.add(pointFormatsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The list of tls supported groups in the clienthello as integers.
   * For example, secp256r1 will be shown as 23.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return supportedGroups
   */
  @VsoMethod
  public List<Integer> getSupportedGroups() {
    return supportedGroups;
  }

  /**
   * This is the setter method. this will set the supportedGroups
   * The list of tls supported groups in the clienthello as integers.
   * For example, secp256r1 will be shown as 23.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return supportedGroups
   */
  @VsoMethod
  public void setSupportedGroups(List<Integer>  supportedGroups) {
    this.supportedGroups = supportedGroups;
  }

  /**
   * This is the setter method this will set the supportedGroups
   * The list of tls supported groups in the clienthello as integers.
   * For example, secp256r1 will be shown as 23.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return supportedGroups
   */
  @VsoMethod
  public TlsClientInfo addSupportedGroupsItem(Integer supportedGroupsItem) {
    if (this.supportedGroups == null) {
      this.supportedGroups = new ArrayList<Integer>();
    }
    this.supportedGroups.add(supportedGroupsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The list of tls extensions in the clienthello as integers.
   * For example, signature_algorithms will be shown as 13.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tlsExtensions
   */
  @VsoMethod
  public List<Integer> getTlsExtensions() {
    return tlsExtensions;
  }

  /**
   * This is the setter method. this will set the tlsExtensions
   * The list of tls extensions in the clienthello as integers.
   * For example, signature_algorithms will be shown as 13.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tlsExtensions
   */
  @VsoMethod
  public void setTlsExtensions(List<Integer>  tlsExtensions) {
    this.tlsExtensions = tlsExtensions;
  }

  /**
   * This is the setter method this will set the tlsExtensions
   * The list of tls extensions in the clienthello as integers.
   * For example, signature_algorithms will be shown as 13.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tlsExtensions
   */
  @VsoMethod
  public TlsClientInfo addTlsExtensionsItem(Integer tlsExtensionsItem) {
    if (this.tlsExtensions == null) {
      this.tlsExtensions = new ArrayList<Integer>();
    }
    this.tlsExtensions.add(tlsExtensionsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Indicates whether the clienthello contained grease ciphers, extensions or groups.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usesGrease
   */
  @VsoMethod
  public Boolean getUsesGrease() {
    return usesGrease;
  }

  /**
   * This is the setter method to the attribute.
   * Indicates whether the clienthello contained grease ciphers, extensions or groups.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param usesGrease set the usesGrease.
   */
  @VsoMethod
  public void setUsesGrease(Boolean  usesGrease) {
    this.usesGrease = usesGrease;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TlsClientInfo objTlsClientInfo = (TlsClientInfo) o;
  return   Objects.equals(this.clientHelloTlsVersion, objTlsClientInfo.clientHelloTlsVersion)&&
  Objects.equals(this.cipherSuites, objTlsClientInfo.cipherSuites)&&
  Objects.equals(this.tlsExtensions, objTlsClientInfo.tlsExtensions)&&
  Objects.equals(this.supportedGroups, objTlsClientInfo.supportedGroups)&&
  Objects.equals(this.pointFormats, objTlsClientInfo.pointFormats)&&
  Objects.equals(this.usesGrease, objTlsClientInfo.usesGrease);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TlsClientInfo {\n");
      sb.append("    cipherSuites: ").append(toIndentedString(cipherSuites)).append("\n");
        sb.append("    clientHelloTlsVersion: ").append(toIndentedString(clientHelloTlsVersion)).append("\n");
        sb.append("    pointFormats: ").append(toIndentedString(pointFormats)).append("\n");
        sb.append("    supportedGroups: ").append(toIndentedString(supportedGroups)).append("\n");
        sb.append("    tlsExtensions: ").append(toIndentedString(tlsExtensions)).append("\n");
        sb.append("    usesGrease: ").append(toIndentedString(usesGrease)).append("\n");
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

