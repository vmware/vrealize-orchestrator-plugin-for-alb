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
 * AlertSyslogServer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AlertSyslogServer")
@VsoFinder(name = Constants.FINDER_VRO_ALERTSYSLOGSERVER, idAccessor = "getObjectID()")
@Service
public class AlertSyslogServer extends AviRestResource  {
  @JsonProperty("anon_auth")
  private Boolean anonAuth = null;

  @JsonProperty("format")
  private String format = "SYSLOG_LEGACY";

  @JsonProperty("pkiprofile_ref")
  private String pkiprofileRef = null;

  @JsonProperty("ssl_key_and_certificate_ref")
  private String sslKeyAndCertificateRef = null;

  @JsonProperty("syslog_server")
  private String syslogServer = null;

  @JsonProperty("syslog_server_port")
  private Integer syslogServerPort = 514;

  @JsonProperty("tls_enable")
  private Boolean tlsEnable = null;

  @JsonProperty("udp")
  private Boolean udp = true;

  
  /**
   * Enable anonymous authentication of Syslog Serverwhich will disable server certificate authentication. Field introduced in 17.2.17, 18.2.5.
   * @return anonAuth
  **/
  @ApiModelProperty(value = "Enable anonymous authentication of Syslog Serverwhich will disable server certificate authentication. Field introduced in 17.2.17, 18.2.5.")


 
  @VsoMethod  
  public Boolean isAnonAuth() {
    return anonAuth;
  }
    
  @VsoMethod
  public void setAnonAuth(Boolean anonAuth) {
    this.anonAuth = anonAuth;
  }

  
  /**
   * Syslog output format - legacy, RFC 5424, JSON. Enum options - SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON. Field introduced in 17.2.8.
   * @return format
  **/
  @ApiModelProperty(value = "Syslog output format - legacy, RFC 5424, JSON. Enum options - SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON. Field introduced in 17.2.8.")


 
  @VsoMethod  
  public String getFormat() {
    return format;
  }
    
  @VsoMethod
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   * Select the PKIProfile containing a CA or list of CA chainswhich will validate the certificate of the syslog server. It is a reference to an object of type PKIProfile. Field introduced in 17.2.17, 18.2.5.
   * @return pkiprofileRef
  **/
  @ApiModelProperty(value = "Select the PKIProfile containing a CA or list of CA chainswhich will validate the certificate of the syslog server. It is a reference to an object of type PKIProfile. Field introduced in 17.2.17, 18.2.5.")


 
  @VsoMethod  
  public String getPkiprofileRef() {
    return pkiprofileRef;
  }
    
  @VsoMethod
  public void setPkiprofileRef(String pkiprofileRef) {
    this.pkiprofileRef = pkiprofileRef;
  }

  
  /**
   * Select a certificate and key which will be used to authenticate to the syslog server. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 17.2.17, 18.2.5.
   * @return sslKeyAndCertificateRef
  **/
  @ApiModelProperty(value = "Select a certificate and key which will be used to authenticate to the syslog server. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 17.2.17, 18.2.5.")


 
  @VsoMethod  
  public String getSslKeyAndCertificateRef() {
    return sslKeyAndCertificateRef;
  }
    
  @VsoMethod
  public void setSslKeyAndCertificateRef(String sslKeyAndCertificateRef) {
    this.sslKeyAndCertificateRef = sslKeyAndCertificateRef;
  }

  
  /**
   * The destination Syslog server IP address or hostname.
   * @return syslogServer
  **/
  @ApiModelProperty(required = true, value = "The destination Syslog server IP address or hostname.")
  @NotNull


 
  @VsoMethod  
  public String getSyslogServer() {
    return syslogServer;
  }
    
  @VsoMethod
  public void setSyslogServer(String syslogServer) {
    this.syslogServer = syslogServer;
  }

  
  /**
   * The destination Syslog server's service port.
   * @return syslogServerPort
  **/
  @ApiModelProperty(value = "The destination Syslog server's service port.")


 
  @VsoMethod  
  public Integer getSyslogServerPort() {
    return syslogServerPort;
  }
    
  @VsoMethod
  public void setSyslogServerPort(Integer syslogServerPort) {
    this.syslogServerPort = syslogServerPort;
  }

  
  /**
   * Enable TLS to the syslog server. Field introduced in 17.2.16, 18.2.3.
   * @return tlsEnable
  **/
  @ApiModelProperty(value = "Enable TLS to the syslog server. Field introduced in 17.2.16, 18.2.3.")


 
  @VsoMethod  
  public Boolean isTlsEnable() {
    return tlsEnable;
  }
    
  @VsoMethod
  public void setTlsEnable(Boolean tlsEnable) {
    this.tlsEnable = tlsEnable;
  }

  
  /**
   * Network protocol to establish syslog session.
   * @return udp
  **/
  @ApiModelProperty(required = true, value = "Network protocol to establish syslog session.")
  @NotNull


 
  @VsoMethod  
  public Boolean isUdp() {
    return udp;
  }
    
  @VsoMethod
  public void setUdp(Boolean udp) {
    this.udp = udp;
  }

  
  public String getObjectID() {
		return "AlertSyslogServer";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertSyslogServer alertSyslogServer = (AlertSyslogServer) o;
    return Objects.equals(this.anonAuth, alertSyslogServer.anonAuth) &&
        Objects.equals(this.format, alertSyslogServer.format) &&
        Objects.equals(this.pkiprofileRef, alertSyslogServer.pkiprofileRef) &&
        Objects.equals(this.sslKeyAndCertificateRef, alertSyslogServer.sslKeyAndCertificateRef) &&
        Objects.equals(this.syslogServer, alertSyslogServer.syslogServer) &&
        Objects.equals(this.syslogServerPort, alertSyslogServer.syslogServerPort) &&
        Objects.equals(this.tlsEnable, alertSyslogServer.tlsEnable) &&
        Objects.equals(this.udp, alertSyslogServer.udp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonAuth, format, pkiprofileRef, sslKeyAndCertificateRef, syslogServer, syslogServerPort, tlsEnable, udp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertSyslogServer {\n");
    
    sb.append("    anonAuth: ").append(toIndentedString(anonAuth)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    pkiprofileRef: ").append(toIndentedString(pkiprofileRef)).append("\n");
    sb.append("    sslKeyAndCertificateRef: ").append(toIndentedString(sslKeyAndCertificateRef)).append("\n");
    sb.append("    syslogServer: ").append(toIndentedString(syslogServer)).append("\n");
    sb.append("    syslogServerPort: ").append(toIndentedString(syslogServerPort)).append("\n");
    sb.append("    tlsEnable: ").append(toIndentedString(tlsEnable)).append("\n");
    sb.append("    udp: ").append(toIndentedString(udp)).append("\n");
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

