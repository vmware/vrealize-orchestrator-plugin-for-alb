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
 * TCPApplicationProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "TCPApplicationProfile")
@VsoFinder(name = Constants.FINDER_VRO_TCPAPPLICATIONPROFILE, idAccessor = "getObjectID()")
@Service
public class TCPApplicationProfile extends AviRestResource  {
  @JsonProperty("pki_profile_ref")
  private String pkiProfileRef = null;

  @JsonProperty("proxy_protocol_enabled")
  private Boolean proxyProtocolEnabled = null;

  @JsonProperty("proxy_protocol_version")
  private String proxyProtocolVersion = "PROXY_PROTOCOL_VERSION_1";

  @JsonProperty("ssl_client_certificate_mode")
  private String sslClientCertificateMode = "SSL_CLIENT_CERTIFICATE_NONE";

  
  /**
   * Select the PKI profile to be associated with the Virtual Service. This profile defines the Certificate Authority and Revocation List. It is a reference to an object of type PKIProfile. Field introduced in 18.2.3.
   * @return pkiProfileRef
  **/
  @ApiModelProperty(value = "Select the PKI profile to be associated with the Virtual Service. This profile defines the Certificate Authority and Revocation List. It is a reference to an object of type PKIProfile. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getPkiProfileRef() {
    return pkiProfileRef;
  }
    
  @VsoMethod
  public void setPkiProfileRef(String pkiProfileRef) {
    this.pkiProfileRef = pkiProfileRef;
  }

  
  /**
   * Enable/Disable the usage of proxy protocol to convey client connection information to the back-end servers.  Valid only for L4 application profiles and TCP proxy.
   * @return proxyProtocolEnabled
  **/
  @ApiModelProperty(value = "Enable/Disable the usage of proxy protocol to convey client connection information to the back-end servers.  Valid only for L4 application profiles and TCP proxy.")


 
  @VsoMethod  
  public Boolean isProxyProtocolEnabled() {
    return proxyProtocolEnabled;
  }
    
  @VsoMethod
  public void setProxyProtocolEnabled(Boolean proxyProtocolEnabled) {
    this.proxyProtocolEnabled = proxyProtocolEnabled;
  }

  
  /**
   * Version of proxy protocol to be used to convey client connection information to the back-end servers. Enum options - PROXY_PROTOCOL_VERSION_1, PROXY_PROTOCOL_VERSION_2.
   * @return proxyProtocolVersion
  **/
  @ApiModelProperty(value = "Version of proxy protocol to be used to convey client connection information to the back-end servers. Enum options - PROXY_PROTOCOL_VERSION_1, PROXY_PROTOCOL_VERSION_2.")


 
  @VsoMethod  
  public String getProxyProtocolVersion() {
    return proxyProtocolVersion;
  }
    
  @VsoMethod
  public void setProxyProtocolVersion(String proxyProtocolVersion) {
    this.proxyProtocolVersion = proxyProtocolVersion;
  }

  
  /**
   * Specifies whether the client side verification is set to none, request or require. Enum options - SSL_CLIENT_CERTIFICATE_NONE, SSL_CLIENT_CERTIFICATE_REQUEST, SSL_CLIENT_CERTIFICATE_REQUIRE. Field introduced in 18.2.3.
   * @return sslClientCertificateMode
  **/
  @ApiModelProperty(value = "Specifies whether the client side verification is set to none, request or require. Enum options - SSL_CLIENT_CERTIFICATE_NONE, SSL_CLIENT_CERTIFICATE_REQUEST, SSL_CLIENT_CERTIFICATE_REQUIRE. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getSslClientCertificateMode() {
    return sslClientCertificateMode;
  }
    
  @VsoMethod
  public void setSslClientCertificateMode(String sslClientCertificateMode) {
    this.sslClientCertificateMode = sslClientCertificateMode;
  }

  
  public String getObjectID() {
		return "TCPApplicationProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TCPApplicationProfile tcPApplicationProfile = (TCPApplicationProfile) o;
    return Objects.equals(this.pkiProfileRef, tcPApplicationProfile.pkiProfileRef) &&
        Objects.equals(this.proxyProtocolEnabled, tcPApplicationProfile.proxyProtocolEnabled) &&
        Objects.equals(this.proxyProtocolVersion, tcPApplicationProfile.proxyProtocolVersion) &&
        Objects.equals(this.sslClientCertificateMode, tcPApplicationProfile.sslClientCertificateMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiProfileRef, proxyProtocolEnabled, proxyProtocolVersion, sslClientCertificateMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TCPApplicationProfile {\n");
    
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

