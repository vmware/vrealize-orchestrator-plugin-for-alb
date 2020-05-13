package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SSLCertificateDescription;
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
 * SSLCertificate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SSLCertificate")
@VsoFinder(name = Constants.FINDER_VRO_SSLCERTIFICATE, idAccessor = "getObjectID()")
@Service
public class SSLCertificate extends AviRestResource  {
  @JsonProperty("certificate")
  private String certificate = null;

  @JsonProperty("certificate_signing_request")
  private String certificateSigningRequest = null;

  @JsonProperty("chain_verified")
  private Boolean chainVerified = null;

  @JsonProperty("days_until_expire")
  private Integer daysUntilExpire = 365;

  @JsonProperty("expiry_status")
  private String expiryStatus = "SSL_CERTIFICATE_GOOD";

  @JsonProperty("fingerprint")
  private String fingerprint = null;

  @JsonProperty("issuer")
  private SSLCertificateDescription issuer = null;

  @JsonProperty("key_params")
  private SSLKeyParams keyParams = null;

  @JsonProperty("not_after")
  private String notAfter = null;

  @JsonProperty("not_before")
  private String notBefore = null;

  @JsonProperty("public_key")
  private String publicKey = null;

  @JsonProperty("self_signed")
  private Boolean selfSigned = null;

  @JsonProperty("serial_number")
  private String serialNumber = null;

  @JsonProperty("signature")
  private String signature = null;

  @JsonProperty("signature_algorithm")
  private String signatureAlgorithm = null;

  @JsonProperty("subject")
  private SSLCertificateDescription subject = null;

  @JsonProperty("subject_alt_names")
  @Valid
  private List<String> subjectAltNames = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("version")
  private String version = null;

  
  /**
   * certificate of SSLCertificate.
   * @return certificate
  **/
  @ApiModelProperty(value = "certificate of SSLCertificate.")


 
  @VsoMethod  
  public String getCertificate() {
    return certificate;
  }
    
  @VsoMethod
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  
  /**
   * certificate_signing_request of SSLCertificate.
   * @return certificateSigningRequest
  **/
  @ApiModelProperty(value = "certificate_signing_request of SSLCertificate.")


 
  @VsoMethod  
  public String getCertificateSigningRequest() {
    return certificateSigningRequest;
  }
    
  @VsoMethod
  public void setCertificateSigningRequest(String certificateSigningRequest) {
    this.certificateSigningRequest = certificateSigningRequest;
  }

  
  /**
   * Placeholder for description of property chain_verified of obj type SSLCertificate field type str  type boolean
   * @return chainVerified
  **/
  @ApiModelProperty(value = "Placeholder for description of property chain_verified of obj type SSLCertificate field type str  type boolean")


 
  @VsoMethod  
  public Boolean isChainVerified() {
    return chainVerified;
  }
    
  @VsoMethod
  public void setChainVerified(Boolean chainVerified) {
    this.chainVerified = chainVerified;
  }

  
  /**
   * Number of days_until_expire.
   * @return daysUntilExpire
  **/
  @ApiModelProperty(value = "Number of days_until_expire.")


 
  @VsoMethod  
  public Integer getDaysUntilExpire() {
    return daysUntilExpire;
  }
    
  @VsoMethod
  public void setDaysUntilExpire(Integer daysUntilExpire) {
    this.daysUntilExpire = daysUntilExpire;
  }

  
  /**
   *  Enum options - SSL_CERTIFICATE_GOOD, SSL_CERTIFICATE_EXPIRY_WARNING, SSL_CERTIFICATE_EXPIRED.
   * @return expiryStatus
  **/
  @ApiModelProperty(value = " Enum options - SSL_CERTIFICATE_GOOD, SSL_CERTIFICATE_EXPIRY_WARNING, SSL_CERTIFICATE_EXPIRED.")


 
  @VsoMethod  
  public String getExpiryStatus() {
    return expiryStatus;
  }
    
  @VsoMethod
  public void setExpiryStatus(String expiryStatus) {
    this.expiryStatus = expiryStatus;
  }

  
  /**
   * fingerprint of SSLCertificate.
   * @return fingerprint
  **/
  @ApiModelProperty(value = "fingerprint of SSLCertificate.")


 
  @VsoMethod  
  public String getFingerprint() {
    return fingerprint;
  }
    
  @VsoMethod
  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  
  /**
   * Placeholder for description of property issuer of obj type SSLCertificate field type str  type object
   * @return issuer
  **/
  @ApiModelProperty(value = "Placeholder for description of property issuer of obj type SSLCertificate field type str  type object")

  @Valid

 
  @VsoMethod  
  public SSLCertificateDescription getIssuer() {
    return issuer;
  }
    
  @VsoMethod
  public void setIssuer(SSLCertificateDescription issuer) {
    this.issuer = issuer;
  }

  
  /**
   * Placeholder for description of property key_params of obj type SSLCertificate field type str  type object
   * @return keyParams
  **/
  @ApiModelProperty(value = "Placeholder for description of property key_params of obj type SSLCertificate field type str  type object")

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
   * not_after of SSLCertificate.
   * @return notAfter
  **/
  @ApiModelProperty(value = "not_after of SSLCertificate.")


 
  @VsoMethod  
  public String getNotAfter() {
    return notAfter;
  }
    
  @VsoMethod
  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }

  
  /**
   * not_before of SSLCertificate.
   * @return notBefore
  **/
  @ApiModelProperty(value = "not_before of SSLCertificate.")


 
  @VsoMethod  
  public String getNotBefore() {
    return notBefore;
  }
    
  @VsoMethod
  public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }

  
  /**
   * public_key of SSLCertificate.
   * @return publicKey
  **/
  @ApiModelProperty(value = "public_key of SSLCertificate.")


 
  @VsoMethod  
  public String getPublicKey() {
    return publicKey;
  }
    
  @VsoMethod
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  
  /**
   * Placeholder for description of property self_signed of obj type SSLCertificate field type str  type boolean
   * @return selfSigned
  **/
  @ApiModelProperty(value = "Placeholder for description of property self_signed of obj type SSLCertificate field type str  type boolean")


 
  @VsoMethod  
  public Boolean isSelfSigned() {
    return selfSigned;
  }
    
  @VsoMethod
  public void setSelfSigned(Boolean selfSigned) {
    this.selfSigned = selfSigned;
  }

  
  /**
   * serial_number of SSLCertificate.
   * @return serialNumber
  **/
  @ApiModelProperty(value = "serial_number of SSLCertificate.")


 
  @VsoMethod  
  public String getSerialNumber() {
    return serialNumber;
  }
    
  @VsoMethod
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * signature of SSLCertificate.
   * @return signature
  **/
  @ApiModelProperty(value = "signature of SSLCertificate.")


 
  @VsoMethod  
  public String getSignature() {
    return signature;
  }
    
  @VsoMethod
  public void setSignature(String signature) {
    this.signature = signature;
  }

  
  /**
   * signature_algorithm of SSLCertificate.
   * @return signatureAlgorithm
  **/
  @ApiModelProperty(value = "signature_algorithm of SSLCertificate.")


 
  @VsoMethod  
  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }
    
  @VsoMethod
  public void setSignatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  
  /**
   * Placeholder for description of property subject of obj type SSLCertificate field type str  type object
   * @return subject
  **/
  @ApiModelProperty(value = "Placeholder for description of property subject of obj type SSLCertificate field type str  type object")

  @Valid

 
  @VsoMethod  
  public SSLCertificateDescription getSubject() {
    return subject;
  }
    
  @VsoMethod
  public void setSubject(SSLCertificateDescription subject) {
    this.subject = subject;
  }

  
  public SSLCertificate addSubjectAltNamesItem(String subjectAltNamesItem) {
    if (this.subjectAltNames == null) {
      this.subjectAltNames = new ArrayList<String>();
    }
    this.subjectAltNames.add(subjectAltNamesItem);
    return this;
  }
  
  /**
   * subjectAltName that provides additional subject identities.
   * @return subjectAltNames
  **/
  @ApiModelProperty(value = "subjectAltName that provides additional subject identities.")


 
  @VsoMethod  
  public List<String> getSubjectAltNames() {
    return subjectAltNames;
  }
    
  @VsoMethod
  public void setSubjectAltNames(List<String> subjectAltNames) {
    this.subjectAltNames = subjectAltNames;
  }

  
  /**
   * text of SSLCertificate.
   * @return text
  **/
  @ApiModelProperty(value = "text of SSLCertificate.")


 
  @VsoMethod  
  public String getText() {
    return text;
  }
    
  @VsoMethod
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * version of SSLCertificate.
   * @return version
  **/
  @ApiModelProperty(value = "version of SSLCertificate.")


 
  @VsoMethod  
  public String getVersion() {
    return version;
  }
    
  @VsoMethod
  public void setVersion(String version) {
    this.version = version;
  }

  
  public String getObjectID() {
		return "SSLCertificate";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLCertificate ssLCertificate = (SSLCertificate) o;
    return Objects.equals(this.certificate, ssLCertificate.certificate) &&
        Objects.equals(this.certificateSigningRequest, ssLCertificate.certificateSigningRequest) &&
        Objects.equals(this.chainVerified, ssLCertificate.chainVerified) &&
        Objects.equals(this.daysUntilExpire, ssLCertificate.daysUntilExpire) &&
        Objects.equals(this.expiryStatus, ssLCertificate.expiryStatus) &&
        Objects.equals(this.fingerprint, ssLCertificate.fingerprint) &&
        Objects.equals(this.issuer, ssLCertificate.issuer) &&
        Objects.equals(this.keyParams, ssLCertificate.keyParams) &&
        Objects.equals(this.notAfter, ssLCertificate.notAfter) &&
        Objects.equals(this.notBefore, ssLCertificate.notBefore) &&
        Objects.equals(this.publicKey, ssLCertificate.publicKey) &&
        Objects.equals(this.selfSigned, ssLCertificate.selfSigned) &&
        Objects.equals(this.serialNumber, ssLCertificate.serialNumber) &&
        Objects.equals(this.signature, ssLCertificate.signature) &&
        Objects.equals(this.signatureAlgorithm, ssLCertificate.signatureAlgorithm) &&
        Objects.equals(this.subject, ssLCertificate.subject) &&
        Objects.equals(this.subjectAltNames, ssLCertificate.subjectAltNames) &&
        Objects.equals(this.text, ssLCertificate.text) &&
        Objects.equals(this.version, ssLCertificate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, certificateSigningRequest, chainVerified, daysUntilExpire, expiryStatus, fingerprint, issuer, keyParams, notAfter, notBefore, publicKey, selfSigned, serialNumber, signature, signatureAlgorithm, subject, subjectAltNames, text, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLCertificate {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    certificateSigningRequest: ").append(toIndentedString(certificateSigningRequest)).append("\n");
    sb.append("    chainVerified: ").append(toIndentedString(chainVerified)).append("\n");
    sb.append("    daysUntilExpire: ").append(toIndentedString(daysUntilExpire)).append("\n");
    sb.append("    expiryStatus: ").append(toIndentedString(expiryStatus)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    keyParams: ").append(toIndentedString(keyParams)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    selfSigned: ").append(toIndentedString(selfSigned)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    subjectAltNames: ").append(toIndentedString(subjectAltNames)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

