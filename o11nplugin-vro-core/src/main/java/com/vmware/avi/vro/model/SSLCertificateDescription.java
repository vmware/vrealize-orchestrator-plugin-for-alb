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
 * The SSLCertificateDescription is a POJO class extends AviRestResource that used for creating
 * SSLCertificateDescription.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSLCertificateDescription")
@VsoFinder(name = Constants.FINDER_VRO_SSLCERTIFICATEDESCRIPTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSLCertificateDescription extends AviRestResource {
  @JsonProperty("common_name")
  @JsonInclude(Include.NON_NULL)
  private String commonName = null;

  @JsonProperty("country")
  @JsonInclude(Include.NON_NULL)
  private String country = null;

  @JsonProperty("distinguished_name")
  @JsonInclude(Include.NON_NULL)
  private String distinguishedName = null;

  @JsonProperty("email_address")
  @JsonInclude(Include.NON_NULL)
  private String emailAddress = null;

  @JsonProperty("locality")
  @JsonInclude(Include.NON_NULL)
  private String locality = null;

  @JsonProperty("organization")
  @JsonInclude(Include.NON_NULL)
  private String organization = null;

  @JsonProperty("organization_unit")
  @JsonInclude(Include.NON_NULL)
  private String organizationUnit = null;

  @JsonProperty("state")
  @JsonInclude(Include.NON_NULL)
  private String state = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property common_name of obj type sslcertificatedescription field type str  type string.
   * @return commonName
   */
  @VsoMethod
  public String getCommonName() {
    return commonName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property common_name of obj type sslcertificatedescription field type str  type string.
   * @param commonName set the commonName.
   */
  @VsoMethod
  public void setCommonName(String  commonName) {
    this.commonName = commonName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property country of obj type sslcertificatedescription field type str  type string.
   * @return country
   */
  @VsoMethod
  public String getCountry() {
    return country;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property country of obj type sslcertificatedescription field type str  type string.
   * @param country set the country.
   */
  @VsoMethod
  public void setCountry(String  country) {
    this.country = country;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property distinguished_name of obj type sslcertificatedescription field type str  type string.
   * @return distinguishedName
   */
  @VsoMethod
  public String getDistinguishedName() {
    return distinguishedName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property distinguished_name of obj type sslcertificatedescription field type str  type string.
   * @param distinguishedName set the distinguishedName.
   */
  @VsoMethod
  public void setDistinguishedName(String  distinguishedName) {
    this.distinguishedName = distinguishedName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property email_address of obj type sslcertificatedescription field type str  type string.
   * @return emailAddress
   */
  @VsoMethod
  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property email_address of obj type sslcertificatedescription field type str  type string.
   * @param emailAddress set the emailAddress.
   */
  @VsoMethod
  public void setEmailAddress(String  emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property locality of obj type sslcertificatedescription field type str  type string.
   * @return locality
   */
  @VsoMethod
  public String getLocality() {
    return locality;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property locality of obj type sslcertificatedescription field type str  type string.
   * @param locality set the locality.
   */
  @VsoMethod
  public void setLocality(String  locality) {
    this.locality = locality;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property organization of obj type sslcertificatedescription field type str  type string.
   * @return organization
   */
  @VsoMethod
  public String getOrganization() {
    return organization;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property organization of obj type sslcertificatedescription field type str  type string.
   * @param organization set the organization.
   */
  @VsoMethod
  public void setOrganization(String  organization) {
    this.organization = organization;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property organization_unit of obj type sslcertificatedescription field type str  type string.
   * @return organizationUnit
   */
  @VsoMethod
  public String getOrganizationUnit() {
    return organizationUnit;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property organization_unit of obj type sslcertificatedescription field type str  type string.
   * @param organizationUnit set the organizationUnit.
   */
  @VsoMethod
  public void setOrganizationUnit(String  organizationUnit) {
    this.organizationUnit = organizationUnit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property state of obj type sslcertificatedescription field type str  type string.
   * @return state
   */
  @VsoMethod
  public String getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property state of obj type sslcertificatedescription field type str  type string.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(String  state) {
    this.state = state;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SSLCertificateDescription objSSLCertificateDescription = (SSLCertificateDescription) o;
  return   Objects.equals(this.commonName, objSSLCertificateDescription.commonName)&&
  Objects.equals(this.emailAddress, objSSLCertificateDescription.emailAddress)&&
  Objects.equals(this.organizationUnit, objSSLCertificateDescription.organizationUnit)&&
  Objects.equals(this.organization, objSSLCertificateDescription.organization)&&
  Objects.equals(this.locality, objSSLCertificateDescription.locality)&&
  Objects.equals(this.state, objSSLCertificateDescription.state)&&
  Objects.equals(this.country, objSSLCertificateDescription.country)&&
  Objects.equals(this.distinguishedName, objSSLCertificateDescription.distinguishedName);
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

