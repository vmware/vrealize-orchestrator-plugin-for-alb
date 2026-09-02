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
 * The TlsConfig is a POJO class extends AviRestResource that used for creating
 * TlsConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TlsConfig")
@VsoFinder(name = Constants.FINDER_VRO_TLSCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TlsConfig extends AviRestResource {
    @JsonProperty("client_cert_ref")
    @JsonInclude(Include.NON_NULL)
    private String clientCertRef;

    @JsonProperty("pki_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String pkiProfileRef;

    @JsonProperty("skip_hostname_verification")
    @JsonInclude(Include.NON_NULL)
    private Boolean skipHostnameVerification = false;

    @JsonProperty("tls_mode")
    @JsonInclude(Include.NON_NULL)
    private String tlsMode;



  /**
   * This is the getter method this will return the attribute value.
   * Client certificate for mutual tls connection.
   * Required when tls mode is mutual tls.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientCertRef
   */
  @VsoMethod
  public String getClientCertRef() {
    return clientCertRef;
  }

  /**
   * This is the setter method to the attribute.
   * Client certificate for mutual tls connection.
   * Required when tls mode is mutual tls.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientCertRef set the clientCertRef.
   */
  @VsoMethod
  public void setClientCertRef(String  clientCertRef) {
    this.clientCertRef = clientCertRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pki profile used to validate the server certificate validation in one-way tls and mutual tls.
   * If this field is not set, the pki profile from system configuration will be used.
   * Effective when tls mode is one-way tls or mutual tls.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pkiProfileRef
   */
  @VsoMethod
  public String getPkiProfileRef() {
    return pkiProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Pki profile used to validate the server certificate validation in one-way tls and mutual tls.
   * If this field is not set, the pki profile from system configuration will be used.
   * Effective when tls mode is one-way tls or mutual tls.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pkiProfileRef set the pkiProfileRef.
   */
  @VsoMethod
  public void setPkiProfileRef(String  pkiProfileRef) {
    this.pkiProfileRef = pkiProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Skip hostname verification on the server certificate, chain validation still applies.
   * Effective when tls mode is one-way tls or mutual tls.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return skipHostnameVerification
   */
  @VsoMethod
  public Boolean getSkipHostnameVerification() {
    return skipHostnameVerification;
  }

  /**
   * This is the setter method to the attribute.
   * Skip hostname verification on the server certificate, chain validation still applies.
   * Effective when tls mode is one-way tls or mutual tls.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param skipHostnameVerification set the skipHostnameVerification.
   */
  @VsoMethod
  public void setSkipHostnameVerification(Boolean  skipHostnameVerification) {
    this.skipHostnameVerification = skipHostnameVerification;
  }

  /**
   * This is the getter method this will return the attribute value.
   * How tls is used for this outbound connection.
   * Certificate validation uses the truststore pki profile (default  truststore pki profile from system configuration).
   * Enum options - TLS_MODE_NO_VERIFY, TLS_MODE_TLS, TLS_MODE_MTLS.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tlsMode
   */
  @VsoMethod
  public String getTlsMode() {
    return tlsMode;
  }

  /**
   * This is the setter method to the attribute.
   * How tls is used for this outbound connection.
   * Certificate validation uses the truststore pki profile (default  truststore pki profile from system configuration).
   * Enum options - TLS_MODE_NO_VERIFY, TLS_MODE_TLS, TLS_MODE_MTLS.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tlsMode set the tlsMode.
   */
  @VsoMethod
  public void setTlsMode(String  tlsMode) {
    this.tlsMode = tlsMode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TlsConfig objTlsConfig = (TlsConfig) o;
  return   Objects.equals(this.tlsMode, objTlsConfig.tlsMode)&&
  Objects.equals(this.clientCertRef, objTlsConfig.clientCertRef)&&
  Objects.equals(this.skipHostnameVerification, objTlsConfig.skipHostnameVerification)&&
  Objects.equals(this.pkiProfileRef, objTlsConfig.pkiProfileRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TlsConfig {\n");
      sb.append("    clientCertRef: ").append(toIndentedString(clientCertRef)).append("\n");
        sb.append("    pkiProfileRef: ").append(toIndentedString(pkiProfileRef)).append("\n");
        sb.append("    skipHostnameVerification: ").append(toIndentedString(skipHostnameVerification)).append("\n");
        sb.append("    tlsMode: ").append(toIndentedString(tlsMode)).append("\n");
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

