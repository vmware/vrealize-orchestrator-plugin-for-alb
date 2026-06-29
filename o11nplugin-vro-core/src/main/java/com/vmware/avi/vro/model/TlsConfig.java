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

    @JsonProperty("tls_mode")
    @JsonInclude(Include.NON_NULL)
    private String tlsMode;



  /**
   * This is the getter method this will return the attribute value.
   * Client certificate for mutual tls authentication.
   * Required when tls_mode is tls_mode_mtls.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 32.2.1.
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
   * Client certificate for mutual tls authentication.
   * Required when tls_mode is tls_mode_mtls.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 32.2.1.
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
   * Tls authentication mode for outbound connections.
   * Tls_mode_disabled  no tls.
   * Tls_mode_tls  server certificate verification.
   * Tls_mode_mtls  mutual tls; client_cert_uuid must be provided.
   * Tls_mode_verify_only  certificate chain verification without a full tls session.
   * Enum options - TLS_MODE_DISABLED, TLS_MODE_TLS, TLS_MODE_MTLS, TLS_MODE_VERIFY_ONLY.
   * Field introduced in 32.2.1.
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
   * Tls authentication mode for outbound connections.
   * Tls_mode_disabled  no tls.
   * Tls_mode_tls  server certificate verification.
   * Tls_mode_mtls  mutual tls; client_cert_uuid must be provided.
   * Tls_mode_verify_only  certificate chain verification without a full tls session.
   * Enum options - TLS_MODE_DISABLED, TLS_MODE_TLS, TLS_MODE_MTLS, TLS_MODE_VERIFY_ONLY.
   * Field introduced in 32.2.1.
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
  Objects.equals(this.clientCertRef, objTlsConfig.clientCertRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TlsConfig {\n");
      sb.append("    clientCertRef: ").append(toIndentedString(clientCertRef)).append("\n");
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

