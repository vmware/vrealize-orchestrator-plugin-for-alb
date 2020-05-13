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
 * SamlServiceProviderNode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SamlServiceProviderNode")
@VsoFinder(name = Constants.FINDER_VRO_SAMLSERVICEPROVIDERNODE, idAccessor = "getObjectID()")
@Service
public class SamlServiceProviderNode extends AviRestResource  {
  @JsonProperty("entity_id")
  private String entityId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("signing_cert")
  private String signingCert = null;

  @JsonProperty("signing_key")
  private String signingKey = null;

  @JsonProperty("signing_ssl_key_and_certificate_ref")
  private String signingSslKeyAndCertificateRef = null;

  @JsonProperty("single_signon_url")
  private String singleSignonUrl = null;

  
  /**
   * Globally unique entityID for this node. Entity ID on the IDP should match this. Field introduced in 17.2.3.
   * @return entityId
  **/
  @ApiModelProperty(value = "Globally unique entityID for this node. Entity ID on the IDP should match this. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getEntityId() {
    return entityId;
  }
    
  @VsoMethod
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  
  /**
   * Refers to the Cluster name identifier (Virtual IP or FQDN). Field introduced in 17.2.3.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Refers to the Cluster name identifier (Virtual IP or FQDN). Field introduced in 17.2.3.")
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
   * Service Provider signing certificate for metadata. Field deprecated in 18.2.1. Field introduced in 17.2.3.
   * @return signingCert
  **/
  @ApiModelProperty(value = "Service Provider signing certificate for metadata. Field deprecated in 18.2.1. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getSigningCert() {
    return signingCert;
  }
    
  @VsoMethod
  public void setSigningCert(String signingCert) {
    this.signingCert = signingCert;
  }

  
  /**
   * Service Provider signing key for metadata. Field deprecated in 18.2.1. Field introduced in 17.2.3.
   * @return signingKey
  **/
  @ApiModelProperty(value = "Service Provider signing key for metadata. Field deprecated in 18.2.1. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getSigningKey() {
    return signingKey;
  }
    
  @VsoMethod
  public void setSigningKey(String signingKey) {
    this.signingKey = signingKey;
  }

  
  /**
   * Service Engines will use this SSL certificate to sign assertions going to the IdP. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 18.2.1.
   * @return signingSslKeyAndCertificateRef
  **/
  @ApiModelProperty(value = "Service Engines will use this SSL certificate to sign assertions going to the IdP. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getSigningSslKeyAndCertificateRef() {
    return signingSslKeyAndCertificateRef;
  }
    
  @VsoMethod
  public void setSigningSslKeyAndCertificateRef(String signingSslKeyAndCertificateRef) {
    this.signingSslKeyAndCertificateRef = signingSslKeyAndCertificateRef;
  }

  
  /**
   * Single Signon URL to be programmed on the IDP. Field introduced in 17.2.3.
   * @return singleSignonUrl
  **/
  @ApiModelProperty(value = "Single Signon URL to be programmed on the IDP. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getSingleSignonUrl() {
    return singleSignonUrl;
  }
    
  @VsoMethod
  public void setSingleSignonUrl(String singleSignonUrl) {
    this.singleSignonUrl = singleSignonUrl;
  }

  
  public String getObjectID() {
		return "SamlServiceProviderNode";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlServiceProviderNode samlServiceProviderNode = (SamlServiceProviderNode) o;
    return Objects.equals(this.entityId, samlServiceProviderNode.entityId) &&
        Objects.equals(this.name, samlServiceProviderNode.name) &&
        Objects.equals(this.signingCert, samlServiceProviderNode.signingCert) &&
        Objects.equals(this.signingKey, samlServiceProviderNode.signingKey) &&
        Objects.equals(this.signingSslKeyAndCertificateRef, samlServiceProviderNode.signingSslKeyAndCertificateRef) &&
        Objects.equals(this.singleSignonUrl, samlServiceProviderNode.singleSignonUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, name, signingCert, signingKey, signingSslKeyAndCertificateRef, singleSignonUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlServiceProviderNode {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signingCert: ").append(toIndentedString(signingCert)).append("\n");
    sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
    sb.append("    signingSslKeyAndCertificateRef: ").append(toIndentedString(signingSslKeyAndCertificateRef)).append("\n");
    sb.append("    singleSignonUrl: ").append(toIndentedString(singleSignonUrl)).append("\n");
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

