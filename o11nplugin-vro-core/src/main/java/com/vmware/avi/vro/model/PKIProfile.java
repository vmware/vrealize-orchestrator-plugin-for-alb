package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CRL;
import com.vmware.avi.vro.model.SSLCertificate;
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
 * PKIProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PKIProfile")
@VsoFinder(name = Constants.FINDER_VRO_PKIPROFILE, idAccessor = "getObjectID()")
@Service
public class PKIProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("ca_certs")
  @Valid
  private List<SSLCertificate> caCerts = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("crl_check")
  private Boolean crlCheck = true;

  @JsonProperty("crls")
  @Valid
  private List<CRL> crls = null;

  @JsonProperty("ignore_peer_chain")
  private Boolean ignorePeerChain = null;

  @JsonProperty("is_federated")
  private Boolean isFederated = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("validate_only_leaf_crl")
  private Boolean validateOnlyLeafCrl = true;

  
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

  
  public PKIProfile addCaCertsItem(SSLCertificate caCertsItem) {
    if (this.caCerts == null) {
      this.caCerts = new ArrayList<SSLCertificate>();
    }
    this.caCerts.add(caCertsItem);
    return this;
  }
  
  /**
   * List of Certificate Authorities (Root and Intermediate) trusted that is used for certificate validation.
   * @return caCerts
  **/
  @ApiModelProperty(value = "List of Certificate Authorities (Root and Intermediate) trusted that is used for certificate validation.")

  @Valid

 
  @VsoMethod  
  public List<SSLCertificate> getCaCerts() {
    return caCerts;
  }
    
  @VsoMethod
  public void setCaCerts(List<SSLCertificate> caCerts) {
    this.caCerts = caCerts;
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

  
  /**
   * When enabled, Avi will verify via CRL checks that certificates in the trust chain have not been revoked.
   * @return crlCheck
  **/
  @ApiModelProperty(value = "When enabled, Avi will verify via CRL checks that certificates in the trust chain have not been revoked.")


 
  @VsoMethod  
  public Boolean isCrlCheck() {
    return crlCheck;
  }
    
  @VsoMethod
  public void setCrlCheck(Boolean crlCheck) {
    this.crlCheck = crlCheck;
  }

  
  public PKIProfile addCrlsItem(CRL crlsItem) {
    if (this.crls == null) {
      this.crls = new ArrayList<CRL>();
    }
    this.crls.add(crlsItem);
    return this;
  }
  
  /**
   * Certificate Revocation Lists.
   * @return crls
  **/
  @ApiModelProperty(value = "Certificate Revocation Lists.")

  @Valid

 
  @VsoMethod  
  public List<CRL> getCrls() {
    return crls;
  }
    
  @VsoMethod
  public void setCrls(List<CRL> crls) {
    this.crls = crls;
  }

  
  /**
   * When enabled, Avi will not trust Intermediate and Root certs presented by a client.  Instead, only the chain certs configured in the Certificate Authority section will be used to verify trust of the client's cert.
   * @return ignorePeerChain
  **/
  @ApiModelProperty(value = "When enabled, Avi will not trust Intermediate and Root certs presented by a client.  Instead, only the chain certs configured in the Certificate Authority section will be used to verify trust of the client's cert.")


 
  @VsoMethod  
  public Boolean isIgnorePeerChain() {
    return ignorePeerChain;
  }
    
  @VsoMethod
  public void setIgnorePeerChain(Boolean ignorePeerChain) {
    this.ignorePeerChain = ignorePeerChain;
  }

  
  /**
   * This field describes the object's replication scope. If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.  If the field is set to true, then the object is replicated across the federation.  . Field introduced in 17.1.3.
   * @return isFederated
  **/
  @ApiModelProperty(value = "This field describes the object's replication scope. If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.  If the field is set to true, then the object is replicated across the federation.  . Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Boolean isIsFederated() {
    return isFederated;
  }
    
  @VsoMethod
  public void setIsFederated(Boolean isFederated) {
    this.isFederated = isFederated;
  }

  
  /**
   * Name of the PKI Profile.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the PKI Profile.")
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

  
  /**
   * When enabled, Avi will only validate the revocation status of the leaf certificate using CRL. To enable validation for the entire chain, disable this option and provide all the relevant CRLs.
   * @return validateOnlyLeafCrl
  **/
  @ApiModelProperty(value = "When enabled, Avi will only validate the revocation status of the leaf certificate using CRL. To enable validation for the entire chain, disable this option and provide all the relevant CRLs.")


 
  @VsoMethod  
  public Boolean isValidateOnlyLeafCrl() {
    return validateOnlyLeafCrl;
  }
    
  @VsoMethod
  public void setValidateOnlyLeafCrl(Boolean validateOnlyLeafCrl) {
    this.validateOnlyLeafCrl = validateOnlyLeafCrl;
  }

  
  public String getObjectID() {
		return "PKIProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PKIProfile pkIProfile = (PKIProfile) o;
    return Objects.equals(this.lastModified, pkIProfile.lastModified) &&
        Objects.equals(this.caCerts, pkIProfile.caCerts) &&
        Objects.equals(this.createdBy, pkIProfile.createdBy) &&
        Objects.equals(this.crlCheck, pkIProfile.crlCheck) &&
        Objects.equals(this.crls, pkIProfile.crls) &&
        Objects.equals(this.ignorePeerChain, pkIProfile.ignorePeerChain) &&
        Objects.equals(this.isFederated, pkIProfile.isFederated) &&
        Objects.equals(this.name, pkIProfile.name) &&
        Objects.equals(this.tenantRef, pkIProfile.tenantRef) &&
        Objects.equals(this.url, pkIProfile.url) &&
        Objects.equals(this.uuid, pkIProfile.uuid) &&
        Objects.equals(this.validateOnlyLeafCrl, pkIProfile.validateOnlyLeafCrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, caCerts, createdBy, crlCheck, crls, ignorePeerChain, isFederated, name, tenantRef, url, uuid, validateOnlyLeafCrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PKIProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    caCerts: ").append(toIndentedString(caCerts)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    crlCheck: ").append(toIndentedString(crlCheck)).append("\n");
    sb.append("    crls: ").append(toIndentedString(crls)).append("\n");
    sb.append("    ignorePeerChain: ").append(toIndentedString(ignorePeerChain)).append("\n");
    sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    validateOnlyLeafCrl: ").append(toIndentedString(validateOnlyLeafCrl)).append("\n");
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

