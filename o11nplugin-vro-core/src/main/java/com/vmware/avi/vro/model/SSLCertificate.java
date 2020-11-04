package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SSLCertificateDescription;
import com.vmware.avi.vro.model.SSLKeyParams;
import com.vmware.avi.vro.model.SSLCertificateDescription;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SSLCertificate is a POJO class extends AviRestResource that used for creating
 * SSLCertificate.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSLCertificate")
@VsoFinder(name = Constants.FINDER_VRO_SSLCERTIFICATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSLCertificate extends AviRestResource {
    @JsonProperty("certificate")
    @JsonInclude(Include.NON_NULL)
    private String certificate = null;

    @JsonProperty("certificate_signing_request")
    @JsonInclude(Include.NON_NULL)
    private String certificateSigningRequest = null;

    @JsonProperty("chain_verified")
    @JsonInclude(Include.NON_NULL)
    private Boolean chainVerified = null;

    @JsonProperty("days_until_expire")
    @JsonInclude(Include.NON_NULL)
    private Integer daysUntilExpire = 365;

    @JsonProperty("expiry_status")
    @JsonInclude(Include.NON_NULL)
    private String expiryStatus = "SSL_CERTIFICATE_GOOD";

    @JsonProperty("fingerprint")
    @JsonInclude(Include.NON_NULL)
    private String fingerprint = null;

    @JsonProperty("issuer")
    @JsonInclude(Include.NON_NULL)
    private SSLCertificateDescription issuer = null;

    @JsonProperty("key_params")
    @JsonInclude(Include.NON_NULL)
    private SSLKeyParams keyParams = null;

    @JsonProperty("not_after")
    @JsonInclude(Include.NON_NULL)
    private String notAfter = null;

    @JsonProperty("not_before")
    @JsonInclude(Include.NON_NULL)
    private String notBefore = null;

    @JsonProperty("public_key")
    @JsonInclude(Include.NON_NULL)
    private String publicKey = null;

    @JsonProperty("self_signed")
    @JsonInclude(Include.NON_NULL)
    private Boolean selfSigned = null;

    @JsonProperty("serial_number")
    @JsonInclude(Include.NON_NULL)
    private String serialNumber = null;

    @JsonProperty("signature")
    @JsonInclude(Include.NON_NULL)
    private String signature = null;

    @JsonProperty("signature_algorithm")
    @JsonInclude(Include.NON_NULL)
    private String signatureAlgorithm = null;

    @JsonProperty("subject")
    @JsonInclude(Include.NON_NULL)
    private SSLCertificateDescription subject = null;

    @JsonProperty("subject_alt_names")
    @JsonInclude(Include.NON_NULL)
    private List<String> subjectAltNames = null;

    @JsonProperty("text")
    @JsonInclude(Include.NON_NULL)
    private String text = null;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property certificate of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return certificate
   */
  @VsoMethod
  public String getCertificate() {
    return certificate;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property certificate of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param certificate set the certificate.
   */
  @VsoMethod
  public void setCertificate(String  certificate) {
    this.certificate = certificate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property certificate_signing_request of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return certificateSigningRequest
   */
  @VsoMethod
  public String getCertificateSigningRequest() {
    return certificateSigningRequest;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property certificate_signing_request of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param certificateSigningRequest set the certificateSigningRequest.
   */
  @VsoMethod
  public void setCertificateSigningRequest(String  certificateSigningRequest) {
    this.certificateSigningRequest = certificateSigningRequest;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property chain_verified of obj type sslcertificate field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return chainVerified
   */
  @VsoMethod
  public Boolean getChainVerified() {
    return chainVerified;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property chain_verified of obj type sslcertificate field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param chainVerified set the chainVerified.
   */
  @VsoMethod
  public void setChainVerified(Boolean  chainVerified) {
    this.chainVerified = chainVerified;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property days_until_expire of obj type sslcertificate field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 365.
   * @return daysUntilExpire
   */
  @VsoMethod
  public Integer getDaysUntilExpire() {
    return daysUntilExpire;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property days_until_expire of obj type sslcertificate field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as 365.
   * @param daysUntilExpire set the daysUntilExpire.
   */
  @VsoMethod
  public void setDaysUntilExpire(Integer  daysUntilExpire) {
    this.daysUntilExpire = daysUntilExpire;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - SSL_CERTIFICATE_GOOD, SSL_CERTIFICATE_EXPIRY_WARNING, SSL_CERTIFICATE_EXPIRED.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_CERTIFICATE_GOOD".
   * @return expiryStatus
   */
  @VsoMethod
  public String getExpiryStatus() {
    return expiryStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - SSL_CERTIFICATE_GOOD, SSL_CERTIFICATE_EXPIRY_WARNING, SSL_CERTIFICATE_EXPIRED.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_CERTIFICATE_GOOD".
   * @param expiryStatus set the expiryStatus.
   */
  @VsoMethod
  public void setExpiryStatus(String  expiryStatus) {
    this.expiryStatus = expiryStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property fingerprint of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fingerprint
   */
  @VsoMethod
  public String getFingerprint() {
    return fingerprint;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property fingerprint of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fingerprint set the fingerprint.
   */
  @VsoMethod
  public void setFingerprint(String  fingerprint) {
    this.fingerprint = fingerprint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property issuer of obj type sslcertificate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return issuer
   */
  @VsoMethod
  public SSLCertificateDescription getIssuer() {
    return issuer;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property issuer of obj type sslcertificate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param issuer set the issuer.
   */
  @VsoMethod
  public void setIssuer(SSLCertificateDescription issuer) {
    this.issuer = issuer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property key_params of obj type sslcertificate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return keyParams
   */
  @VsoMethod
  public SSLKeyParams getKeyParams() {
    return keyParams;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property key_params of obj type sslcertificate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param keyParams set the keyParams.
   */
  @VsoMethod
  public void setKeyParams(SSLKeyParams keyParams) {
    this.keyParams = keyParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property not_after of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return notAfter
   */
  @VsoMethod
  public String getNotAfter() {
    return notAfter;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property not_after of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param notAfter set the notAfter.
   */
  @VsoMethod
  public void setNotAfter(String  notAfter) {
    this.notAfter = notAfter;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property not_before of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return notBefore
   */
  @VsoMethod
  public String getNotBefore() {
    return notBefore;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property not_before of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param notBefore set the notBefore.
   */
  @VsoMethod
  public void setNotBefore(String  notBefore) {
    this.notBefore = notBefore;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property public_key of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return publicKey
   */
  @VsoMethod
  public String getPublicKey() {
    return publicKey;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property public_key of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param publicKey set the publicKey.
   */
  @VsoMethod
  public void setPublicKey(String  publicKey) {
    this.publicKey = publicKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property self_signed of obj type sslcertificate field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return selfSigned
   */
  @VsoMethod
  public Boolean getSelfSigned() {
    return selfSigned;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property self_signed of obj type sslcertificate field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param selfSigned set the selfSigned.
   */
  @VsoMethod
  public void setSelfSigned(Boolean  selfSigned) {
    this.selfSigned = selfSigned;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property serial_number of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serialNumber
   */
  @VsoMethod
  public String getSerialNumber() {
    return serialNumber;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property serial_number of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serialNumber set the serialNumber.
   */
  @VsoMethod
  public void setSerialNumber(String  serialNumber) {
    this.serialNumber = serialNumber;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property signature of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return signature
   */
  @VsoMethod
  public String getSignature() {
    return signature;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property signature of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param signature set the signature.
   */
  @VsoMethod
  public void setSignature(String  signature) {
    this.signature = signature;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property signature_algorithm of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return signatureAlgorithm
   */
  @VsoMethod
  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property signature_algorithm of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param signatureAlgorithm set the signatureAlgorithm.
   */
  @VsoMethod
  public void setSignatureAlgorithm(String  signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property subject of obj type sslcertificate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subject
   */
  @VsoMethod
  public SSLCertificateDescription getSubject() {
    return subject;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property subject of obj type sslcertificate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subject set the subject.
   */
  @VsoMethod
  public void setSubject(SSLCertificateDescription subject) {
    this.subject = subject;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subjectaltname that provides additional subject identities.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subjectAltNames
   */
  @VsoMethod
  public List<String> getSubjectAltNames() {
    return subjectAltNames;
  }

  /**
   * This is the setter method. this will set the subjectAltNames
   * Subjectaltname that provides additional subject identities.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subjectAltNames
   */
  @VsoMethod
  public void setSubjectAltNames(List<String>  subjectAltNames) {
    this.subjectAltNames = subjectAltNames;
  }

  /**
   * This is the setter method this will set the subjectAltNames
   * Subjectaltname that provides additional subject identities.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subjectAltNames
   */
  @VsoMethod
  public SSLCertificate addSubjectAltNamesItem(String subjectAltNamesItem) {
    if (this.subjectAltNames == null) {
      this.subjectAltNames = new ArrayList<String>();
    }
    this.subjectAltNames.add(subjectAltNamesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property text of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return text
   */
  @VsoMethod
  public String getText() {
    return text;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property text of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param text set the text.
   */
  @VsoMethod
  public void setText(String  text) {
    this.text = text;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property version of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property version of obj type sslcertificate field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SSLCertificate objSSLCertificate = (SSLCertificate) o;
  return   Objects.equals(this.version, objSSLCertificate.version)&&
  Objects.equals(this.serialNumber, objSSLCertificate.serialNumber)&&
  Objects.equals(this.selfSigned, objSSLCertificate.selfSigned)&&
  Objects.equals(this.issuer, objSSLCertificate.issuer)&&
  Objects.equals(this.subject, objSSLCertificate.subject)&&
  Objects.equals(this.keyParams, objSSLCertificate.keyParams)&&
  Objects.equals(this.publicKey, objSSLCertificate.publicKey)&&
  Objects.equals(this.signatureAlgorithm, objSSLCertificate.signatureAlgorithm)&&
  Objects.equals(this.signature, objSSLCertificate.signature)&&
  Objects.equals(this.notBefore, objSSLCertificate.notBefore)&&
  Objects.equals(this.notAfter, objSSLCertificate.notAfter)&&
  Objects.equals(this.certificate, objSSLCertificate.certificate)&&
  Objects.equals(this.certificateSigningRequest, objSSLCertificate.certificateSigningRequest)&&
  Objects.equals(this.text, objSSLCertificate.text)&&
  Objects.equals(this.fingerprint, objSSLCertificate.fingerprint)&&
  Objects.equals(this.expiryStatus, objSSLCertificate.expiryStatus)&&
  Objects.equals(this.chainVerified, objSSLCertificate.chainVerified)&&
  Objects.equals(this.subjectAltNames, objSSLCertificate.subjectAltNames)&&
  Objects.equals(this.daysUntilExpire, objSSLCertificate.daysUntilExpire);
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

