package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.FTPProfile;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The TCPApplicationProfile is a POJO class extends AviRestResource that used for creating
 * TCPApplicationProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TCPApplicationProfile")
@VsoFinder(name = Constants.FINDER_VRO_TCPAPPLICATIONPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TCPApplicationProfile extends AviRestResource {
    @JsonProperty("ftp_profile")
    @JsonInclude(Include.NON_NULL)
    private FTPProfile ftpProfile;

    @JsonProperty("pki_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String pkiProfileRef;

    @JsonProperty("proxy_protocol_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean proxyProtocolEnabled = false;

    @JsonProperty("proxy_protocol_version")
    @JsonInclude(Include.NON_NULL)
    private String proxyProtocolVersion = "PROXY_PROTOCOL_VERSION_1";

    @JsonProperty("ssl_client_certificate_mode")
    @JsonInclude(Include.NON_NULL)
    private String sslClientCertificateMode = "SSL_CLIENT_CERTIFICATE_NONE";



  /**
   * This is the getter method this will return the attribute value.
   * Ftp profile configuration.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ftpProfile
   */
  @VsoMethod
  public FTPProfile getFtpProfile() {
    return ftpProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Ftp profile configuration.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ftpProfile set the ftpProfile.
   */
  @VsoMethod
  public void setFtpProfile(FTPProfile ftpProfile) {
    this.ftpProfile = ftpProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select the pki profile to be associated with the virtual service.
   * This profile defines the certificate authority and revocation list.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pkiProfileRef
   */
  @VsoMethod
  public String getPkiProfileRef() {
    return pkiProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Select the pki profile to be associated with the virtual service.
   * This profile defines the certificate authority and revocation list.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pkiProfileRef set the pkiProfileRef.
   */
  @VsoMethod
  public void setPkiProfileRef(String  pkiProfileRef) {
    this.pkiProfileRef = pkiProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable/disable the usage of proxy protocol to convey client connection information to the back-end servers.
   * Valid only for l4 application profiles and tcp proxy.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return proxyProtocolEnabled
   */
  @VsoMethod
  public Boolean getProxyProtocolEnabled() {
    return proxyProtocolEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable/disable the usage of proxy protocol to convey client connection information to the back-end servers.
   * Valid only for l4 application profiles and tcp proxy.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param proxyProtocolEnabled set the proxyProtocolEnabled.
   */
  @VsoMethod
  public void setProxyProtocolEnabled(Boolean  proxyProtocolEnabled) {
    this.proxyProtocolEnabled = proxyProtocolEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Version of proxy protocol to be used to convey client connection information to the back-end servers.
   * Enum options - PROXY_PROTOCOL_VERSION_1, PROXY_PROTOCOL_VERSION_2.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- proxy_protocol_version_1), basic edition(allowed values-
   * proxy_protocol_version_1), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "PROXY_PROTOCOL_VERSION_1".
   * @return proxyProtocolVersion
   */
  @VsoMethod
  public String getProxyProtocolVersion() {
    return proxyProtocolVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Version of proxy protocol to be used to convey client connection information to the back-end servers.
   * Enum options - PROXY_PROTOCOL_VERSION_1, PROXY_PROTOCOL_VERSION_2.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- proxy_protocol_version_1), basic edition(allowed values-
   * proxy_protocol_version_1), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "PROXY_PROTOCOL_VERSION_1".
   * @param proxyProtocolVersion set the proxyProtocolVersion.
   */
  @VsoMethod
  public void setProxyProtocolVersion(String  proxyProtocolVersion) {
    this.proxyProtocolVersion = proxyProtocolVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies whether the client side verification is set to none, request or require.
   * Enum options - SSL_CLIENT_CERTIFICATE_NONE, SSL_CLIENT_CERTIFICATE_REQUEST, SSL_CLIENT_CERTIFICATE_REQUIRE.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- ssl_client_certificate_none), basic edition(allowed values-
   * ssl_client_certificate_none), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_CLIENT_CERTIFICATE_NONE".
   * @return sslClientCertificateMode
   */
  @VsoMethod
  public String getSslClientCertificateMode() {
    return sslClientCertificateMode;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies whether the client side verification is set to none, request or require.
   * Enum options - SSL_CLIENT_CERTIFICATE_NONE, SSL_CLIENT_CERTIFICATE_REQUEST, SSL_CLIENT_CERTIFICATE_REQUIRE.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- ssl_client_certificate_none), basic edition(allowed values-
   * ssl_client_certificate_none), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_CLIENT_CERTIFICATE_NONE".
   * @param sslClientCertificateMode set the sslClientCertificateMode.
   */
  @VsoMethod
  public void setSslClientCertificateMode(String  sslClientCertificateMode) {
    this.sslClientCertificateMode = sslClientCertificateMode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TCPApplicationProfile objTCPApplicationProfile = (TCPApplicationProfile) o;
  return   Objects.equals(this.proxyProtocolEnabled, objTCPApplicationProfile.proxyProtocolEnabled)&&
  Objects.equals(this.proxyProtocolVersion, objTCPApplicationProfile.proxyProtocolVersion)&&
  Objects.equals(this.sslClientCertificateMode, objTCPApplicationProfile.sslClientCertificateMode)&&
  Objects.equals(this.pkiProfileRef, objTCPApplicationProfile.pkiProfileRef)&&
  Objects.equals(this.ftpProfile, objTCPApplicationProfile.ftpProfile);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TCPApplicationProfile {\n");
      sb.append("    ftpProfile: ").append(toIndentedString(ftpProfile)).append("\n");
        sb.append("    pkiProfileRef: ").append(toIndentedString(pkiProfileRef)).append("\n");
        sb.append("    proxyProtocolEnabled: ").append(toIndentedString(proxyProtocolEnabled)).append("\n");
        sb.append("    proxyProtocolVersion: ").append(toIndentedString(proxyProtocolVersion)).append("\n");
        sb.append("    sslClientCertificateMode: ").append(toIndentedString(sslClientCertificateMode)).append("\n");
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

