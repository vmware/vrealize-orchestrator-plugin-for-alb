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
 * SSLCertificateDescription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SSLCertificateDescription")
@VsoFinder(name = Constants.FINDER_VRO_SSLCERTIFICATEDESCRIPTION, idAccessor = "getObjectID()")
@Service
public class SSLCertificateDescription extends AviRestResource  {
  @JsonProperty("common_name")
  private String commonName = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("distinguished_name")
  private String distinguishedName = null;

  @JsonProperty("email_address")
  private String emailAddress = null;

  @JsonProperty("locality")
  private String locality = null;

  @JsonProperty("organization")
  private String organization = null;

  @JsonProperty("organization_unit")
  private String organizationUnit = null;

  @JsonProperty("state")
  private String state = null;

  
  /**
   * common_name of SSLCertificateDescription.
   * @return commonName
  **/
  @ApiModelProperty(value = "common_name of SSLCertificateDescription.")


 
  @VsoMethod  
  public String getCommonName() {
    return commonName;
  }
    
  @VsoMethod
  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  
  /**
   * country of SSLCertificateDescription.
   * @return country
  **/
  @ApiModelProperty(value = "country of SSLCertificateDescription.")


 
  @VsoMethod  
  public String getCountry() {
    return country;
  }
    
  @VsoMethod
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * distinguished_name of SSLCertificateDescription.
   * @return distinguishedName
  **/
  @ApiModelProperty(value = "distinguished_name of SSLCertificateDescription.")


 
  @VsoMethod  
  public String getDistinguishedName() {
    return distinguishedName;
  }
    
  @VsoMethod
  public void setDistinguishedName(String distinguishedName) {
    this.distinguishedName = distinguishedName;
  }

  
  /**
   * email_address of SSLCertificateDescription.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "email_address of SSLCertificateDescription.")


 
  @VsoMethod  
  public String getEmailAddress() {
    return emailAddress;
  }
    
  @VsoMethod
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  /**
   * locality of SSLCertificateDescription.
   * @return locality
  **/
  @ApiModelProperty(value = "locality of SSLCertificateDescription.")


 
  @VsoMethod  
  public String getLocality() {
    return locality;
  }
    
  @VsoMethod
  public void setLocality(String locality) {
    this.locality = locality;
  }

  
  /**
   * organization of SSLCertificateDescription.
   * @return organization
  **/
  @ApiModelProperty(value = "organization of SSLCertificateDescription.")


 
  @VsoMethod  
  public String getOrganization() {
    return organization;
  }
    
  @VsoMethod
  public void setOrganization(String organization) {
    this.organization = organization;
  }

  
  /**
   * organization_unit of SSLCertificateDescription.
   * @return organizationUnit
  **/
  @ApiModelProperty(value = "organization_unit of SSLCertificateDescription.")


 
  @VsoMethod  
  public String getOrganizationUnit() {
    return organizationUnit;
  }
    
  @VsoMethod
  public void setOrganizationUnit(String organizationUnit) {
    this.organizationUnit = organizationUnit;
  }

  
  /**
   * state of SSLCertificateDescription.
   * @return state
  **/
  @ApiModelProperty(value = "state of SSLCertificateDescription.")


 
  @VsoMethod  
  public String getState() {
    return state;
  }
    
  @VsoMethod
  public void setState(String state) {
    this.state = state;
  }

  
  public String getObjectID() {
		return "SSLCertificateDescription";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLCertificateDescription ssLCertificateDescription = (SSLCertificateDescription) o;
    return Objects.equals(this.commonName, ssLCertificateDescription.commonName) &&
        Objects.equals(this.country, ssLCertificateDescription.country) &&
        Objects.equals(this.distinguishedName, ssLCertificateDescription.distinguishedName) &&
        Objects.equals(this.emailAddress, ssLCertificateDescription.emailAddress) &&
        Objects.equals(this.locality, ssLCertificateDescription.locality) &&
        Objects.equals(this.organization, ssLCertificateDescription.organization) &&
        Objects.equals(this.organizationUnit, ssLCertificateDescription.organizationUnit) &&
        Objects.equals(this.state, ssLCertificateDescription.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonName, country, distinguishedName, emailAddress, locality, organization, organizationUnit, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLCertificateDescription {\n");
    
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationUnit: ").append(toIndentedString(organizationUnit)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

