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
 * HealthMonitorSSLAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HealthMonitorSSLAttributes")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORSSLATTRIBUTES, idAccessor = "getObjectID()")
@Service
public class HealthMonitorSSLAttributes extends AviRestResource  {
  @JsonProperty("pki_profile_ref")
  private String pkiProfileRef = null;

  @JsonProperty("server_name")
  private String serverName = null;

  @JsonProperty("ssl_key_and_certificate_ref")
  private String sslKeyAndCertificateRef = null;

  @JsonProperty("ssl_profile_ref")
  private String sslProfileRef = null;

  
  /**
   * PKI profile used to validate the SSL certificate presented by a server. It is a reference to an object of type PKIProfile. Field introduced in 17.1.1.
   * @return pkiProfileRef
  **/
  @ApiModelProperty(value = "PKI profile used to validate the SSL certificate presented by a server. It is a reference to an object of type PKIProfile. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getPkiProfileRef() {
    return pkiProfileRef;
  }
    
  @VsoMethod
  public void setPkiProfileRef(String pkiProfileRef) {
    this.pkiProfileRef = pkiProfileRef;
  }

  
  /**
   * Fully qualified DNS hostname which will be used in the TLS SNI extension in server connections indicating SNI is enabled. Field introduced in 18.2.3.
   * @return serverName
  **/
  @ApiModelProperty(value = "Fully qualified DNS hostname which will be used in the TLS SNI extension in server connections indicating SNI is enabled. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getServerName() {
    return serverName;
  }
    
  @VsoMethod
  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  
  /**
   * Service engines will present this SSL certificate to the server. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 17.1.1.
   * @return sslKeyAndCertificateRef
  **/
  @ApiModelProperty(value = "Service engines will present this SSL certificate to the server. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getSslKeyAndCertificateRef() {
    return sslKeyAndCertificateRef;
  }
    
  @VsoMethod
  public void setSslKeyAndCertificateRef(String sslKeyAndCertificateRef) {
    this.sslKeyAndCertificateRef = sslKeyAndCertificateRef;
  }

  
  /**
   * SSL profile defines ciphers and SSL versions to be used for healthmonitor traffic to the back-end servers. It is a reference to an object of type SSLProfile. Field introduced in 17.1.1.
   * @return sslProfileRef
  **/
  @ApiModelProperty(required = true, value = "SSL profile defines ciphers and SSL versions to be used for healthmonitor traffic to the back-end servers. It is a reference to an object of type SSLProfile. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getSslProfileRef() {
    return sslProfileRef;
  }
    
  @VsoMethod
  public void setSslProfileRef(String sslProfileRef) {
    this.sslProfileRef = sslProfileRef;
  }

  
  public String getObjectID() {
		return "HealthMonitorSSLAttributes";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthMonitorSSLAttributes healthMonitorSSLAttributes = (HealthMonitorSSLAttributes) o;
    return Objects.equals(this.pkiProfileRef, healthMonitorSSLAttributes.pkiProfileRef) &&
        Objects.equals(this.serverName, healthMonitorSSLAttributes.serverName) &&
        Objects.equals(this.sslKeyAndCertificateRef, healthMonitorSSLAttributes.sslKeyAndCertificateRef) &&
        Objects.equals(this.sslProfileRef, healthMonitorSSLAttributes.sslProfileRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiProfileRef, serverName, sslKeyAndCertificateRef, sslProfileRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthMonitorSSLAttributes {\n");
    
    sb.append("    pkiProfileRef: ").append(toIndentedString(pkiProfileRef)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    sslKeyAndCertificateRef: ").append(toIndentedString(sslKeyAndCertificateRef)).append("\n");
    sb.append("    sslProfileRef: ").append(toIndentedString(sslProfileRef)).append("\n");
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

