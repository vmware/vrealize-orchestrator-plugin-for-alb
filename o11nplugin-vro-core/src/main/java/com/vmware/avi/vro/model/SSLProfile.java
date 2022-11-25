package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SSLRating;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SSLProfile is a POJO class extends AviRestResource that used for creating
 * SSLProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSLProfile")
@VsoFinder(name = Constants.FINDER_VRO_SSLPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSLProfile extends AviRestResource {
    @JsonProperty("accepted_ciphers")
    @JsonInclude(Include.NON_NULL)
    private String acceptedCiphers = "AES:3DES:RC4";

    @JsonProperty("accepted_versions")
    @JsonInclude(Include.NON_NULL)
    private List<SSLVersion> acceptedVersions = null;

    @JsonProperty("cipher_enums")
    @JsonInclude(Include.NON_NULL)
    private List<String> cipherEnums = null;

    @JsonProperty("ciphersuites")
    @JsonInclude(Include.NON_NULL)
    private String ciphersuites;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("ec_named_curve")
    @JsonInclude(Include.NON_NULL)
    private String ecNamedCurve = "auto";

    @JsonProperty("enable_early_data")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableEarlyData = false;

    @JsonProperty("enable_ssl_session_reuse")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableSslSessionReuse = true;

    @JsonProperty("labels")
    @JsonInclude(Include.NON_NULL)
    private List<KeyValue> labels;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("prefer_client_cipher_ordering")
    @JsonInclude(Include.NON_NULL)
    private Boolean preferClientCipherOrdering = false;

    @JsonProperty("send_close_notify")
    @JsonInclude(Include.NON_NULL)
    private Boolean sendCloseNotify = true;

    @JsonProperty("signature_algorithm")
    @JsonInclude(Include.NON_NULL)
    private String signatureAlgorithm = "auto";

    @JsonProperty("ssl_rating")
    @JsonInclude(Include.NON_NULL)
    private SSLRating sslRating = null;

    @JsonProperty("ssl_session_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer sslSessionTimeout = 86400;

    @JsonProperty("tags")
    @JsonInclude(Include.NON_NULL)
    private List<Tag> tags = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = "SSL_PROFILE_TYPE_APPLICATION";

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ciphers suites represented as defined by https //www.openssl.org/docs/apps/ciphers.html.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "AES:3DES:RC4".
   * @return acceptedCiphers
   */
  @VsoMethod
  public String getAcceptedCiphers() {
    return acceptedCiphers;
  }

  /**
   * This is the setter method to the attribute.
   * Ciphers suites represented as defined by https //www.openssl.org/docs/apps/ciphers.html.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "AES:3DES:RC4".
   * @param acceptedCiphers set the acceptedCiphers.
   */
  @VsoMethod
  public void setAcceptedCiphers(String  acceptedCiphers) {
    this.acceptedCiphers = acceptedCiphers;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set of versions accepted by the server.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return acceptedVersions
   */
  @VsoMethod
  public List<SSLVersion> getAcceptedVersions() {
    return acceptedVersions;
  }

  /**
   * This is the setter method. this will set the acceptedVersions
   * Set of versions accepted by the server.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return acceptedVersions
   */
  @VsoMethod
  public void setAcceptedVersions(List<SSLVersion>  acceptedVersions) {
    this.acceptedVersions = acceptedVersions;
  }

  /**
   * This is the setter method this will set the acceptedVersions
   * Set of versions accepted by the server.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return acceptedVersions
   */
  @VsoMethod
  public SSLProfile addAcceptedVersionsItem(SSLVersion acceptedVersionsItem) {
    if (this.acceptedVersions == null) {
      this.acceptedVersions = new ArrayList<SSLVersion>();
    }
    this.acceptedVersions.add(acceptedVersionsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enum options - TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,
   * TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384,
   * TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_GCM_SHA384,
   * TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA,
   * TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_CBC_SHA,
   * TLS_RSA_WITH_3DES_EDE_CBC_SHA, TLS_AES_256_GCM_SHA384...
   * Allowed in enterprise edition with any value, essentials edition(allowed values-
   * tls_ecdhe_ecdsa_with_aes_128_gcm_sha256,tls_ecdhe_ecdsa_with_aes_256_gcm_sha384,tls_ecdhe_rsa_with_aes_128_gcm_sha256,tls_ecdhe_rsa_with_aes_256_gcm_sha384,tls_ecdhe_ecdsa_with_aes_128_cbc_sha256,tls_ecdhe_ecdsa_with_aes_256_cbc_sha384,tls_ecdhe_rsa_with_aes_128_cbc_sha256,tls_ecdhe_rsa_with_aes_256_cbc_sha384,tls_rsa_with_aes_128_gcm_sha256,tls_rsa_with_aes_256_gcm_sha384,tls_rsa_with_aes_128_cbc_sha256,tls_rsa_with_aes_256_cbc_sha256,tls_ecdhe_ecdsa_with_aes_128_cbc_sha,tls_ecdhe_ecdsa_with_aes_256_cbc_sha,tls_ecdhe_rsa_with_aes_128_cbc_sha,tls_ecdhe_rsa_with_aes_256_cbc_sha,tls_rsa_with_aes_128_cbc_sha,tls_rsa_with_aes_256_cbc_sha,tls_rsa_with_3des_ede_cbc_sha),
   * basic edition(allowed values-
   * tls_ecdhe_ecdsa_with_aes_128_gcm_sha256,tls_ecdhe_ecdsa_with_aes_256_gcm_sha384,tls_ecdhe_rsa_with_aes_128_gcm_sha256,tls_ecdhe_rsa_with_aes_256_gcm_sha384,tls_ecdhe_ecdsa_with_aes_128_cbc_sha256,tls_ecdhe_ecdsa_with_aes_256_cbc_sha384,tls_ecdhe_rsa_with_aes_128_cbc_sha256,tls_ecdhe_rsa_with_aes_256_cbc_sha384,tls_rsa_with_aes_128_gcm_sha256,tls_rsa_with_aes_256_gcm_sha384,tls_rsa_with_aes_128_cbc_sha256,tls_rsa_with_aes_256_cbc_sha256,tls_ecdhe_ecdsa_with_aes_128_cbc_sha,tls_ecdhe_ecdsa_with_aes_256_cbc_sha,tls_ecdhe_rsa_with_aes_128_cbc_sha,tls_ecdhe_rsa_with_aes_256_cbc_sha,tls_rsa_with_aes_128_cbc_sha,tls_rsa_with_aes_256_cbc_sha,tls_rsa_with_3des_ede_cbc_sha),
   * enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cipherEnums
   */
  @VsoMethod
  public List<String> getCipherEnums() {
    return cipherEnums;
  }

  /**
   * This is the setter method. this will set the cipherEnums
   * Enum options - TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,
   * TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384,
   * TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_GCM_SHA384,
   * TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA,
   * TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_CBC_SHA,
   * TLS_RSA_WITH_3DES_EDE_CBC_SHA, TLS_AES_256_GCM_SHA384...
   * Allowed in enterprise edition with any value, essentials edition(allowed values-
   * tls_ecdhe_ecdsa_with_aes_128_gcm_sha256,tls_ecdhe_ecdsa_with_aes_256_gcm_sha384,tls_ecdhe_rsa_with_aes_128_gcm_sha256,tls_ecdhe_rsa_with_aes_256_gcm_sha384,tls_ecdhe_ecdsa_with_aes_128_cbc_sha256,tls_ecdhe_ecdsa_with_aes_256_cbc_sha384,tls_ecdhe_rsa_with_aes_128_cbc_sha256,tls_ecdhe_rsa_with_aes_256_cbc_sha384,tls_rsa_with_aes_128_gcm_sha256,tls_rsa_with_aes_256_gcm_sha384,tls_rsa_with_aes_128_cbc_sha256,tls_rsa_with_aes_256_cbc_sha256,tls_ecdhe_ecdsa_with_aes_128_cbc_sha,tls_ecdhe_ecdsa_with_aes_256_cbc_sha,tls_ecdhe_rsa_with_aes_128_cbc_sha,tls_ecdhe_rsa_with_aes_256_cbc_sha,tls_rsa_with_aes_128_cbc_sha,tls_rsa_with_aes_256_cbc_sha,tls_rsa_with_3des_ede_cbc_sha),
   * basic edition(allowed values-
   * tls_ecdhe_ecdsa_with_aes_128_gcm_sha256,tls_ecdhe_ecdsa_with_aes_256_gcm_sha384,tls_ecdhe_rsa_with_aes_128_gcm_sha256,tls_ecdhe_rsa_with_aes_256_gcm_sha384,tls_ecdhe_ecdsa_with_aes_128_cbc_sha256,tls_ecdhe_ecdsa_with_aes_256_cbc_sha384,tls_ecdhe_rsa_with_aes_128_cbc_sha256,tls_ecdhe_rsa_with_aes_256_cbc_sha384,tls_rsa_with_aes_128_gcm_sha256,tls_rsa_with_aes_256_gcm_sha384,tls_rsa_with_aes_128_cbc_sha256,tls_rsa_with_aes_256_cbc_sha256,tls_ecdhe_ecdsa_with_aes_128_cbc_sha,tls_ecdhe_ecdsa_with_aes_256_cbc_sha,tls_ecdhe_rsa_with_aes_128_cbc_sha,tls_ecdhe_rsa_with_aes_256_cbc_sha,tls_rsa_with_aes_128_cbc_sha,tls_rsa_with_aes_256_cbc_sha,tls_rsa_with_3des_ede_cbc_sha),
   * enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cipherEnums
   */
  @VsoMethod
  public void setCipherEnums(List<String>  cipherEnums) {
    this.cipherEnums = cipherEnums;
  }

  /**
   * This is the setter method this will set the cipherEnums
   * Enum options - TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,
   * TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384,
   * TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_GCM_SHA384,
   * TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA,
   * TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_CBC_SHA,
   * TLS_RSA_WITH_3DES_EDE_CBC_SHA, TLS_AES_256_GCM_SHA384...
   * Allowed in enterprise edition with any value, essentials edition(allowed values-
   * tls_ecdhe_ecdsa_with_aes_128_gcm_sha256,tls_ecdhe_ecdsa_with_aes_256_gcm_sha384,tls_ecdhe_rsa_with_aes_128_gcm_sha256,tls_ecdhe_rsa_with_aes_256_gcm_sha384,tls_ecdhe_ecdsa_with_aes_128_cbc_sha256,tls_ecdhe_ecdsa_with_aes_256_cbc_sha384,tls_ecdhe_rsa_with_aes_128_cbc_sha256,tls_ecdhe_rsa_with_aes_256_cbc_sha384,tls_rsa_with_aes_128_gcm_sha256,tls_rsa_with_aes_256_gcm_sha384,tls_rsa_with_aes_128_cbc_sha256,tls_rsa_with_aes_256_cbc_sha256,tls_ecdhe_ecdsa_with_aes_128_cbc_sha,tls_ecdhe_ecdsa_with_aes_256_cbc_sha,tls_ecdhe_rsa_with_aes_128_cbc_sha,tls_ecdhe_rsa_with_aes_256_cbc_sha,tls_rsa_with_aes_128_cbc_sha,tls_rsa_with_aes_256_cbc_sha,tls_rsa_with_3des_ede_cbc_sha),
   * basic edition(allowed values-
   * tls_ecdhe_ecdsa_with_aes_128_gcm_sha256,tls_ecdhe_ecdsa_with_aes_256_gcm_sha384,tls_ecdhe_rsa_with_aes_128_gcm_sha256,tls_ecdhe_rsa_with_aes_256_gcm_sha384,tls_ecdhe_ecdsa_with_aes_128_cbc_sha256,tls_ecdhe_ecdsa_with_aes_256_cbc_sha384,tls_ecdhe_rsa_with_aes_128_cbc_sha256,tls_ecdhe_rsa_with_aes_256_cbc_sha384,tls_rsa_with_aes_128_gcm_sha256,tls_rsa_with_aes_256_gcm_sha384,tls_rsa_with_aes_128_cbc_sha256,tls_rsa_with_aes_256_cbc_sha256,tls_ecdhe_ecdsa_with_aes_128_cbc_sha,tls_ecdhe_ecdsa_with_aes_256_cbc_sha,tls_ecdhe_rsa_with_aes_128_cbc_sha,tls_ecdhe_rsa_with_aes_256_cbc_sha,tls_rsa_with_aes_128_cbc_sha,tls_rsa_with_aes_256_cbc_sha,tls_rsa_with_3des_ede_cbc_sha),
   * enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cipherEnums
   */
  @VsoMethod
  public SSLProfile addCipherEnumsItem(String cipherEnumsItem) {
    if (this.cipherEnums == null) {
      this.cipherEnums = new ArrayList<String>();
    }
    this.cipherEnums.add(cipherEnumsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Tls 1.3 ciphers suites represented as defined by u(https //www.openssl.org/docs/manmaster/man1/ciphers.html).
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Special default for essentials edition is tls_aes_256_gcm_sha384-tls_aes_128_gcm_sha256, basic edition is
   * tls_aes_256_gcm_sha384-tls_aes_128_gcm_sha256, enterprise is tls_aes_256_gcm_sha384-tls_chacha20_poly1305_sha256-tls_aes_128_gcm_sha256.
   * @return ciphersuites
   */
  @VsoMethod
  public String getCiphersuites() {
    return ciphersuites;
  }

  /**
   * This is the setter method to the attribute.
   * Tls 1.3 ciphers suites represented as defined by u(https //www.openssl.org/docs/manmaster/man1/ciphers.html).
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Special default for essentials edition is tls_aes_256_gcm_sha384-tls_aes_128_gcm_sha256, basic edition is
   * tls_aes_256_gcm_sha384-tls_aes_128_gcm_sha256, enterprise is tls_aes_256_gcm_sha384-tls_chacha20_poly1305_sha256-tls_aes_128_gcm_sha256.
   * @param ciphersuites set the ciphersuites.
   */
  @VsoMethod
  public void setCiphersuites(String  ciphersuites) {
    this.ciphersuites = ciphersuites;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Elliptic curve cryptography namedcurves (tls supported groups)represented as defined by rfc 8422-section 5.1.1 andhttps
   * //www.openssl.org/docs/man1.1.0/man3/ssl_ctx_set1_curves.html.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "auto".
   * @return ecNamedCurve
   */
  @VsoMethod
  public String getEcNamedCurve() {
    return ecNamedCurve;
  }

  /**
   * This is the setter method to the attribute.
   * Elliptic curve cryptography namedcurves (tls supported groups)represented as defined by rfc 8422-section 5.1.1 andhttps
   * //www.openssl.org/docs/man1.1.0/man3/ssl_ctx_set1_curves.html.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "auto".
   * @param ecNamedCurve set the ecNamedCurve.
   */
  @VsoMethod
  public void setEcNamedCurve(String  ecNamedCurve) {
    this.ecNamedCurve = ecNamedCurve;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable early data processing for tls1.3 connections.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableEarlyData
   */
  @VsoMethod
  public Boolean getEnableEarlyData() {
    return enableEarlyData;
  }

  /**
   * This is the setter method to the attribute.
   * Enable early data processing for tls1.3 connections.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableEarlyData set the enableEarlyData.
   */
  @VsoMethod
  public void setEnableEarlyData(Boolean  enableEarlyData) {
    this.enableEarlyData = enableEarlyData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable ssl session re-use.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enableSslSessionReuse
   */
  @VsoMethod
  public Boolean getEnableSslSessionReuse() {
    return enableSslSessionReuse;
  }

  /**
   * This is the setter method to the attribute.
   * Enable ssl session re-use.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enableSslSessionReuse set the enableSslSessionReuse.
   */
  @VsoMethod
  public void setEnableSslSessionReuse(Boolean  enableSslSessionReuse) {
    this.enableSslSessionReuse = enableSslSessionReuse;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Key value pairs for granular object access control.
   * Also allows for classification and tagging of similar objects.
   * Field deprecated in 20.1.5.
   * Field introduced in 20.1.2.
   * Maximum of 4 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * @return labels
   */
  @VsoMethod
  public List<KeyValue> getLabels() {
    return labels;
  }

  /**
   * This is the setter method. this will set the labels
   * Key value pairs for granular object access control.
   * Also allows for classification and tagging of similar objects.
   * Field deprecated in 20.1.5.
   * Field introduced in 20.1.2.
   * Maximum of 4 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * @return labels
   */
  @VsoMethod
  public void setLabels(List<KeyValue>  labels) {
    this.labels = labels;
  }

  /**
   * This is the setter method this will set the labels
   * Key value pairs for granular object access control.
   * Also allows for classification and tagging of similar objects.
   * Field deprecated in 20.1.5.
   * Field introduced in 20.1.2.
   * Maximum of 4 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * @return labels
   */
  @VsoMethod
  public SSLProfile addLabelsItem(KeyValue labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<KeyValue>();
    }
    this.labels.add(labelsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public List<RoleFilterMatchLabel> getMarkers() {
    return markers;
  }

  /**
   * This is the setter method. this will set the markers
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public void setMarkers(List<RoleFilterMatchLabel>  markers) {
    this.markers = markers;
  }

  /**
   * This is the setter method this will set the markers
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public SSLProfile addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Prefer the ssl cipher ordering presented by the client during the ssl handshake over the one specified in the ssl profile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return preferClientCipherOrdering
   */
  @VsoMethod
  public Boolean getPreferClientCipherOrdering() {
    return preferClientCipherOrdering;
  }

  /**
   * This is the setter method to the attribute.
   * Prefer the ssl cipher ordering presented by the client during the ssl handshake over the one specified in the ssl profile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param preferClientCipherOrdering set the preferClientCipherOrdering.
   */
  @VsoMethod
  public void setPreferClientCipherOrdering(Boolean  preferClientCipherOrdering) {
    this.preferClientCipherOrdering = preferClientCipherOrdering;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Send 'close notify' alert message for a clean shutdown of the ssl connection.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return sendCloseNotify
   */
  @VsoMethod
  public Boolean getSendCloseNotify() {
    return sendCloseNotify;
  }

  /**
   * This is the setter method to the attribute.
   * Send 'close notify' alert message for a clean shutdown of the ssl connection.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param sendCloseNotify set the sendCloseNotify.
   */
  @VsoMethod
  public void setSendCloseNotify(Boolean  sendCloseNotify) {
    this.sendCloseNotify = sendCloseNotify;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Signature algorithms represented as defined by rfc5246-section 7.4.1.4.1 andhttps
   * //www.openssl.org/docs/man1.1.0/man3/ssl_ctx_set1_client_sigalgs_list.html.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "auto".
   * @return signatureAlgorithm
   */
  @VsoMethod
  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }

  /**
   * This is the setter method to the attribute.
   * Signature algorithms represented as defined by rfc5246-section 7.4.1.4.1 andhttps
   * //www.openssl.org/docs/man1.1.0/man3/ssl_ctx_set1_client_sigalgs_list.html.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "auto".
   * @param signatureAlgorithm set the signatureAlgorithm.
   */
  @VsoMethod
  public void setSignatureAlgorithm(String  signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslRating
   */
  @VsoMethod
  public SSLRating getSslRating() {
    return sslRating;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sslRating set the sslRating.
   */
  @VsoMethod
  public void setSslRating(SSLRating sslRating) {
    this.sslRating = sslRating;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The amount of time in seconds before an ssl session expires.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 86400.
   * @return sslSessionTimeout
   */
  @VsoMethod
  public Integer getSslSessionTimeout() {
    return sslSessionTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * The amount of time in seconds before an ssl session expires.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 86400.
   * @param sslSessionTimeout set the sslSessionTimeout.
   */
  @VsoMethod
  public void setSslSessionTimeout(Integer  sslSessionTimeout) {
    this.sslSessionTimeout = sslSessionTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tags
   */
  @VsoMethod
  public List<Tag> getTags() {
    return tags;
  }

  /**
   * This is the setter method. this will set the tags
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tags
   */
  @VsoMethod
  public void setTags(List<Tag>  tags) {
    this.tags = tags;
  }

  /**
   * This is the setter method this will set the tags
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tags
   */
  @VsoMethod
  public SSLProfile addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ssl profile type.
   * Enum options - SSL_PROFILE_TYPE_APPLICATION, SSL_PROFILE_TYPE_SYSTEM.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_PROFILE_TYPE_APPLICATION".
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Ssl profile type.
   * Enum options - SSL_PROFILE_TYPE_APPLICATION, SSL_PROFILE_TYPE_SYSTEM.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_PROFILE_TYPE_APPLICATION".
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SSLProfile objSSLProfile = (SSLProfile) o;
  return   Objects.equals(this.uuid, objSSLProfile.uuid)&&
  Objects.equals(this.name, objSSLProfile.name)&&
  Objects.equals(this.acceptedVersions, objSSLProfile.acceptedVersions)&&
  Objects.equals(this.acceptedCiphers, objSSLProfile.acceptedCiphers)&&
  Objects.equals(this.cipherEnums, objSSLProfile.cipherEnums)&&
  Objects.equals(this.tags, objSSLProfile.tags)&&
  Objects.equals(this.sslRating, objSSLProfile.sslRating)&&
  Objects.equals(this.sendCloseNotify, objSSLProfile.sendCloseNotify)&&
  Objects.equals(this.preferClientCipherOrdering, objSSLProfile.preferClientCipherOrdering)&&
  Objects.equals(this.enableSslSessionReuse, objSSLProfile.enableSslSessionReuse)&&
  Objects.equals(this.sslSessionTimeout, objSSLProfile.sslSessionTimeout)&&
  Objects.equals(this.type, objSSLProfile.type)&&
  Objects.equals(this.ciphersuites, objSSLProfile.ciphersuites)&&
  Objects.equals(this.enableEarlyData, objSSLProfile.enableEarlyData)&&
  Objects.equals(this.labels, objSSLProfile.labels)&&
  Objects.equals(this.ecNamedCurve, objSSLProfile.ecNamedCurve)&&
  Objects.equals(this.signatureAlgorithm, objSSLProfile.signatureAlgorithm)&&
  Objects.equals(this.markers, objSSLProfile.markers)&&
  Objects.equals(this.description, objSSLProfile.description)&&
  Objects.equals(this.tenantRef, objSSLProfile.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SSLProfile {\n");
      sb.append("    acceptedCiphers: ").append(toIndentedString(acceptedCiphers)).append("\n");
        sb.append("    acceptedVersions: ").append(toIndentedString(acceptedVersions)).append("\n");
        sb.append("    cipherEnums: ").append(toIndentedString(cipherEnums)).append("\n");
        sb.append("    ciphersuites: ").append(toIndentedString(ciphersuites)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ecNamedCurve: ").append(toIndentedString(ecNamedCurve)).append("\n");
        sb.append("    enableEarlyData: ").append(toIndentedString(enableEarlyData)).append("\n");
        sb.append("    enableSslSessionReuse: ").append(toIndentedString(enableSslSessionReuse)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    preferClientCipherOrdering: ").append(toIndentedString(preferClientCipherOrdering)).append("\n");
        sb.append("    sendCloseNotify: ").append(toIndentedString(sendCloseNotify)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    sslRating: ").append(toIndentedString(sslRating)).append("\n");
        sb.append("    sslSessionTimeout: ").append(toIndentedString(sslSessionTimeout)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

