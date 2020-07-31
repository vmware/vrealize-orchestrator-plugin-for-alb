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
 * The HealthMonitorSSLAttributes is a POJO class extends AviRestResource that used for creating
 * HealthMonitorSSLAttributes.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HealthMonitorSSLAttributes")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORSSLATTRIBUTES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HealthMonitorSSLAttributes extends AviRestResource {
  @JsonProperty("pki_profile_ref")
  @JsonInclude(Include.NON_NULL)
  private String pkiProfileRef = null;

  @JsonProperty("server_name")
  @JsonInclude(Include.NON_NULL)
  private String serverName = null;

  @JsonProperty("ssl_key_and_certificate_ref")
  @JsonInclude(Include.NON_NULL)
  private String sslKeyAndCertificateRef = null;

  @JsonProperty("ssl_profile_ref")
  @JsonInclude(Include.NON_NULL)
  private String sslProfileRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Pki profile used to validate the ssl certificate presented by a server.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 17.1.1.
   * @return pkiProfileRef
   */
  @VsoMethod
  public String getPkiProfileRef() {
    return pkiProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Pki profile used to validate the ssl certificate presented by a server.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 17.1.1.
   * @param pkiProfileRef set the pkiProfileRef.
   */
  @VsoMethod
  public void setPkiProfileRef(String  pkiProfileRef) {
    this.pkiProfileRef = pkiProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Fully qualified dns hostname which will be used in the tls sni extension in server connections indicating sni is enabled.
   * Field introduced in 18.2.3.
   * @return serverName
   */
  @VsoMethod
  public String getServerName() {
    return serverName;
  }

  /**
   * This is the setter method to the attribute.
   * Fully qualified dns hostname which will be used in the tls sni extension in server connections indicating sni is enabled.
   * Field introduced in 18.2.3.
   * @param serverName set the serverName.
   */
  @VsoMethod
  public void setServerName(String  serverName) {
    this.serverName = serverName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engines will present this ssl certificate to the server.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 17.1.1.
   * @return sslKeyAndCertificateRef
   */
  @VsoMethod
  public String getSslKeyAndCertificateRef() {
    return sslKeyAndCertificateRef;
  }

  /**
   * This is the setter method to the attribute.
   * Service engines will present this ssl certificate to the server.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 17.1.1.
   * @param sslKeyAndCertificateRef set the sslKeyAndCertificateRef.
   */
  @VsoMethod
  public void setSslKeyAndCertificateRef(String  sslKeyAndCertificateRef) {
    this.sslKeyAndCertificateRef = sslKeyAndCertificateRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ssl profile defines ciphers and ssl versions to be used for healthmonitor traffic to the back-end servers.
   * It is a reference to an object of type sslprofile.
   * Field introduced in 17.1.1.
   * @return sslProfileRef
   */
  @VsoMethod
  public String getSslProfileRef() {
    return sslProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Ssl profile defines ciphers and ssl versions to be used for healthmonitor traffic to the back-end servers.
   * It is a reference to an object of type sslprofile.
   * Field introduced in 17.1.1.
   * @param sslProfileRef set the sslProfileRef.
   */
  @VsoMethod
  public void setSslProfileRef(String  sslProfileRef) {
    this.sslProfileRef = sslProfileRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HealthMonitorSSLAttributes objHealthMonitorSSLAttributes = (HealthMonitorSSLAttributes) o;
  return   Objects.equals(this.sslProfileRef, objHealthMonitorSSLAttributes.sslProfileRef)&&
  Objects.equals(this.pkiProfileRef, objHealthMonitorSSLAttributes.pkiProfileRef)&&
  Objects.equals(this.sslKeyAndCertificateRef, objHealthMonitorSSLAttributes.sslKeyAndCertificateRef)&&
  Objects.equals(this.serverName, objHealthMonitorSSLAttributes.serverName);
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

