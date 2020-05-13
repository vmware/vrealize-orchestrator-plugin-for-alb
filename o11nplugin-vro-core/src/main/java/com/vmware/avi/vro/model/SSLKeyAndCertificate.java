package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CertificateAuthority;
import com.vmware.avi.vro.model.CustomParams;
import com.vmware.avi.vro.model.SSLCertificate;
import com.vmware.avi.vro.model.SSLKeyParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * SSLKeyAndCertificate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SSLKeyAndCertificate")
@VsoFinder(name = Constants.FINDER_VRO_SSLKEYANDCERTIFICATE, idAccessor = "getObjectID()")
@Service
public class SSLKeyAndCertificate extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("ca_certs")
  @Valid
  private List<CertificateAuthority> caCerts = null;

  @JsonProperty("certificate")
  private SSLCertificate certificate = null;

  @JsonProperty("certificate_base64")
  private Boolean certificateBase64 = null;

  @JsonProperty("certificate_management_profile_ref")
  private String certificateManagementProfileRef = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("dynamic_params")
  @Valid
  private List<CustomParams> dynamicParams = null;

  @JsonProperty("enckey_base64")
  private String enckeyBase64 = null;

  @JsonProperty("enckey_name")
  private String enckeyName = null;

  @JsonProperty("format")
  private String format = "SSL_PEM";

  @JsonProperty("hardwaresecuritymodulegroup_ref")
  private String hardwaresecuritymodulegroupRef = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("key_base64")
  private Boolean keyBase64 = null;

  @JsonProperty("key_params")
  private SSLKeyParams keyParams = null;

  @JsonProperty("key_passphrase")
  private String keyPassphrase = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private String status = "SSL_CERTIFICATE_FINISHED";

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  public SSLKeyAndCertificate addCaCertsItem(CertificateAuthority caCertsItem) {
    if (this.caCerts == null) {
      this.caCerts = new ArrayList<CertificateAuthority>();
    }
    this.caCerts.add(caCertsItem);
    return this;
  }
  
  /**
   * CA certificates in certificate chain.
   * @return caCerts
  **/
  @ApiModelProperty(value = "CA certificates in certificate chain.")

  @Valid

 
  @VsoMethod  
  public List<CertificateAuthority> getCaCerts() {
    return caCerts;
  }
    
  @VsoMethod
  public void setCaCerts(List<CertificateAuthority> caCerts) {
    this.caCerts = caCerts;
  }

  
  /**
   * Placeholder for description of property certificate of obj type SSLKeyAndCertificate field type str  type object
   * @return certificate
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property certificate of obj type SSLKeyAndCertificate field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public SSLCertificate getCertificate() {
    return certificate;
  }
    
  @VsoMethod
  public void setCertificate(SSLCertificate certificate) {
    this.certificate = certificate;
  }

  
  /**
   * States if the certificate is base64 encoded.
   * @return certificateBase64
  **/
  @ApiModelProperty(value = "States if the certificate is base64 encoded.")


 
  @VsoMethod  
  public Boolean isCertificateBase64() {
    return certificateBase64;
  }
    
  @VsoMethod
  public void setCertificateBase64(Boolean certificateBase64) {
    this.certificateBase64 = certificateBase64;
  }

  
  /**
   *  It is a reference to an object of type CertificateManagementProfile.
   * @return certificateManagementProfileRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type CertificateManagementProfile.")


 
  @VsoMethod  
  public String getCertificateManagementProfileRef() {
    return certificateManagementProfileRef;
  }
    
  @VsoMethod
  public void setCertificateManagementProfileRef(String certificateManagementProfileRef) {
    this.certificateManagementProfileRef = certificateManagementProfileRef;
  }

  
  /**
   * Creator name.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator name.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  public SSLKeyAndCertificate addDynamicParamsItem(CustomParams dynamicParamsItem) {
    if (this.dynamicParams == null) {
      this.dynamicParams = new ArrayList<CustomParams>();
    }
    this.dynamicParams.add(dynamicParamsItem);
    return this;
  }
  
  /**
   * Dynamic parameters needed for certificate management profile.
   * @return dynamicParams
  **/
  @ApiModelProperty(value = "Dynamic parameters needed for certificate management profile.")

  @Valid

 
  @VsoMethod  
  public List<CustomParams> getDynamicParams() {
    return dynamicParams;
  }
    
  @VsoMethod
  public void setDynamicParams(List<CustomParams> dynamicParams) {
    this.dynamicParams = dynamicParams;
  }

  
  /**
   * Encrypted private key corresponding to the private key (e.g. those generated by an HSM such as Thales nShield).
   * @return enckeyBase64
  **/
  @ApiModelProperty(value = "Encrypted private key corresponding to the private key (e.g. those generated by an HSM such as Thales nShield).")


 
  @VsoMethod  
  public String getEnckeyBase64() {
    return enckeyBase64;
  }
    
  @VsoMethod
  public void setEnckeyBase64(String enckeyBase64) {
    this.enckeyBase64 = enckeyBase64;
  }

  
  /**
   * Name of the encrypted private key (e.g. those generated by an HSM such as Thales nShield).
   * @return enckeyName
  **/
  @ApiModelProperty(value = "Name of the encrypted private key (e.g. those generated by an HSM such as Thales nShield).")


 
  @VsoMethod  
  public String getEnckeyName() {
    return enckeyName;
  }
    
  @VsoMethod
  public void setEnckeyName(String enckeyName) {
    this.enckeyName = enckeyName;
  }

  
  /**
   * Format of the Key/Certificate file. Enum options - SSL_PEM, SSL_PKCS12.
   * @return format
  **/
  @ApiModelProperty(value = "Format of the Key/Certificate file. Enum options - SSL_PEM, SSL_PKCS12.")


 
  @VsoMethod  
  public String getFormat() {
    return format;
  }
    
  @VsoMethod
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   *  It is a reference to an object of type HardwareSecurityModuleGroup.
   * @return hardwaresecuritymodulegroupRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type HardwareSecurityModuleGroup.")


 
  @VsoMethod  
  public String getHardwaresecuritymodulegroupRef() {
    return hardwaresecuritymodulegroupRef;
  }
    
  @VsoMethod
  public void setHardwaresecuritymodulegroupRef(String hardwaresecuritymodulegroupRef) {
    this.hardwaresecuritymodulegroupRef = hardwaresecuritymodulegroupRef;
  }

  
  /**
   * Private key.
   * @return key
  **/
  @ApiModelProperty(value = "Private key.")


 
  @VsoMethod  
  public String getKey() {
    return key;
  }
    
  @VsoMethod
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * States if the private key is base64 encoded.
   * @return keyBase64
  **/
  @ApiModelProperty(value = "States if the private key is base64 encoded.")


 
  @VsoMethod  
  public Boolean isKeyBase64() {
    return keyBase64;
  }
    
  @VsoMethod
  public void setKeyBase64(Boolean keyBase64) {
    this.keyBase64 = keyBase64;
  }

  
  /**
   * Placeholder for description of property key_params of obj type SSLKeyAndCertificate field type str  type object
   * @return keyParams
  **/
  @ApiModelProperty(value = "Placeholder for description of property key_params of obj type SSLKeyAndCertificate field type str  type object")

  @Valid

 
  @VsoMethod  
  public SSLKeyParams getKeyParams() {
    return keyParams;
  }
    
  @VsoMethod
  public void setKeyParams(SSLKeyParams keyParams) {
    this.keyParams = keyParams;
  }

  
  /**
   * Passphrase used to encrypt the private key.
   * @return keyPassphrase
  **/
  @ApiModelProperty(value = "Passphrase used to encrypt the private key.")


 
  @VsoMethod  
  public String getKeyPassphrase() {
    return keyPassphrase;
  }
    
  @VsoMethod
  public void setKeyPassphrase(String keyPassphrase) {
    this.keyPassphrase = keyPassphrase;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   *  Enum options - SSL_CERTIFICATE_FINISHED, SSL_CERTIFICATE_PENDING.
   * @return status
  **/
  @ApiModelProperty(value = " Enum options - SSL_CERTIFICATE_FINISHED, SSL_CERTIFICATE_PENDING.")


 
  @VsoMethod  
  public String getStatus() {
    return status;
  }
    
  @VsoMethod
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   *  Enum options - SSL_CERTIFICATE_TYPE_VIRTUALSERVICE, SSL_CERTIFICATE_TYPE_SYSTEM, SSL_CERTIFICATE_TYPE_CA.
   * @return type
  **/
  @ApiModelProperty(value = " Enum options - SSL_CERTIFICATE_TYPE_VIRTUALSERVICE, SSL_CERTIFICATE_TYPE_SYSTEM, SSL_CERTIFICATE_TYPE_CA.")


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "SSLKeyAndCertificate";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLKeyAndCertificate ssLKeyAndCertificate = (SSLKeyAndCertificate) o;
    return Objects.equals(this.lastModified, ssLKeyAndCertificate.lastModified) &&
        Objects.equals(this.caCerts, ssLKeyAndCertificate.caCerts) &&
        Objects.equals(this.certificate, ssLKeyAndCertificate.certificate) &&
        Objects.equals(this.certificateBase64, ssLKeyAndCertificate.certificateBase64) &&
        Objects.equals(this.certificateManagementProfileRef, ssLKeyAndCertificate.certificateManagementProfileRef) &&
        Objects.equals(this.createdBy, ssLKeyAndCertificate.createdBy) &&
        Objects.equals(this.dynamicParams, ssLKeyAndCertificate.dynamicParams) &&
        Objects.equals(this.enckeyBase64, ssLKeyAndCertificate.enckeyBase64) &&
        Objects.equals(this.enckeyName, ssLKeyAndCertificate.enckeyName) &&
        Objects.equals(this.format, ssLKeyAndCertificate.format) &&
        Objects.equals(this.hardwaresecuritymodulegroupRef, ssLKeyAndCertificate.hardwaresecuritymodulegroupRef) &&
        Objects.equals(this.key, ssLKeyAndCertificate.key) &&
        Objects.equals(this.keyBase64, ssLKeyAndCertificate.keyBase64) &&
        Objects.equals(this.keyParams, ssLKeyAndCertificate.keyParams) &&
        Objects.equals(this.keyPassphrase, ssLKeyAndCertificate.keyPassphrase) &&
        Objects.equals(this.name, ssLKeyAndCertificate.name) &&
        Objects.equals(this.status, ssLKeyAndCertificate.status) &&
        Objects.equals(this.tenantRef, ssLKeyAndCertificate.tenantRef) &&
        Objects.equals(this.type, ssLKeyAndCertificate.type) &&
        Objects.equals(this.url, ssLKeyAndCertificate.url) &&
        Objects.equals(this.uuid, ssLKeyAndCertificate.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, caCerts, certificate, certificateBase64, certificateManagementProfileRef, createdBy, dynamicParams, enckeyBase64, enckeyName, format, hardwaresecuritymodulegroupRef, key, keyBase64, keyParams, keyPassphrase, name, status, tenantRef, type, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLKeyAndCertificate {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    caCerts: ").append(toIndentedString(caCerts)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    certificateBase64: ").append(toIndentedString(certificateBase64)).append("\n");
    sb.append("    certificateManagementProfileRef: ").append(toIndentedString(certificateManagementProfileRef)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dynamicParams: ").append(toIndentedString(dynamicParams)).append("\n");
    sb.append("    enckeyBase64: ").append(toIndentedString(enckeyBase64)).append("\n");
    sb.append("    enckeyName: ").append(toIndentedString(enckeyName)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    hardwaresecuritymodulegroupRef: ").append(toIndentedString(hardwaresecuritymodulegroupRef)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyBase64: ").append(toIndentedString(keyBase64)).append("\n");
    sb.append("    keyParams: ").append(toIndentedString(keyParams)).append("\n");
    sb.append("    keyPassphrase: ").append(toIndentedString(keyPassphrase)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

