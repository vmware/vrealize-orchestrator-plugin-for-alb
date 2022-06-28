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
 * The SamlServiceProviderSettings is a POJO class extends AviRestResource that used for creating
 * SamlServiceProviderSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SamlServiceProviderSettings")
@VsoFinder(name = Constants.FINDER_VRO_SAMLSERVICEPROVIDERSETTINGS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SamlServiceProviderSettings extends AviRestResource {
    @JsonProperty("fqdn")
    @JsonInclude(Include.NON_NULL)
    private String fqdn = null;

    @JsonProperty("org_display_name")
    @JsonInclude(Include.NON_NULL)
    private String orgDisplayName = null;

    @JsonProperty("org_name")
    @JsonInclude(Include.NON_NULL)
    private String orgName = null;

    @JsonProperty("org_url")
    @JsonInclude(Include.NON_NULL)
    private String orgUrl = null;

    @JsonProperty("saml_entity_type")
    @JsonInclude(Include.NON_NULL)
    private String samlEntityType = null;

    @JsonProperty("sp_nodes")
    @JsonInclude(Include.NON_NULL)
    private List<SamlServiceProviderNode> spNodes = null;

    @JsonProperty("tech_contact_email")
    @JsonInclude(Include.NON_NULL)
    private String techContactEmail = null;

    @JsonProperty("tech_contact_name")
    @JsonInclude(Include.NON_NULL)
    private String techContactName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Fqdn if entity type is dns_fqdn.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fqdn
   */
  @VsoMethod
  public String getFqdn() {
    return fqdn;
  }

  /**
   * This is the setter method to the attribute.
   * Fqdn if entity type is dns_fqdn.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fqdn set the fqdn.
   */
  @VsoMethod
  public void setFqdn(String  fqdn) {
    this.fqdn = fqdn;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service provider organization display name.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return orgDisplayName
   */
  @VsoMethod
  public String getOrgDisplayName() {
    return orgDisplayName;
  }

  /**
   * This is the setter method to the attribute.
   * Service provider organization display name.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param orgDisplayName set the orgDisplayName.
   */
  @VsoMethod
  public void setOrgDisplayName(String  orgDisplayName) {
    this.orgDisplayName = orgDisplayName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service provider organization name.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return orgName
   */
  @VsoMethod
  public String getOrgName() {
    return orgName;
  }

  /**
   * This is the setter method to the attribute.
   * Service provider organization name.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param orgName set the orgName.
   */
  @VsoMethod
  public void setOrgName(String  orgName) {
    this.orgName = orgName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service provider organization url.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return orgUrl
   */
  @VsoMethod
  public String getOrgUrl() {
    return orgUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Service provider organization url.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param orgUrl set the orgUrl.
   */
  @VsoMethod
  public void setOrgUrl(String  orgUrl) {
    this.orgUrl = orgUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of saml endpoint.
   * Enum options - AUTH_SAML_CLUSTER_VIP, AUTH_SAML_DNS_FQDN, AUTH_SAML_APP_VS.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlEntityType
   */
  @VsoMethod
  public String getSamlEntityType() {
    return samlEntityType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of saml endpoint.
   * Enum options - AUTH_SAML_CLUSTER_VIP, AUTH_SAML_DNS_FQDN, AUTH_SAML_APP_VS.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param samlEntityType set the samlEntityType.
   */
  @VsoMethod
  public void setSamlEntityType(String  samlEntityType) {
    this.samlEntityType = samlEntityType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service provider node information.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return spNodes
   */
  @VsoMethod
  public List<SamlServiceProviderNode> getSpNodes() {
    return spNodes;
  }

  /**
   * This is the setter method. this will set the spNodes
   * Service provider node information.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return spNodes
   */
  @VsoMethod
  public void setSpNodes(List<SamlServiceProviderNode>  spNodes) {
    this.spNodes = spNodes;
  }

  /**
   * This is the setter method this will set the spNodes
   * Service provider node information.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return spNodes
   */
  @VsoMethod
  public SamlServiceProviderSettings addSpNodesItem(SamlServiceProviderNode spNodesItem) {
    if (this.spNodes == null) {
      this.spNodes = new ArrayList<SamlServiceProviderNode>();
    }
    this.spNodes.add(spNodesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Service provider technical contact email.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return techContactEmail
   */
  @VsoMethod
  public String getTechContactEmail() {
    return techContactEmail;
  }

  /**
   * This is the setter method to the attribute.
   * Service provider technical contact email.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param techContactEmail set the techContactEmail.
   */
  @VsoMethod
  public void setTechContactEmail(String  techContactEmail) {
    this.techContactEmail = techContactEmail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service provider technical contact name.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return techContactName
   */
  @VsoMethod
  public String getTechContactName() {
    return techContactName;
  }

  /**
   * This is the setter method to the attribute.
   * Service provider technical contact name.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param techContactName set the techContactName.
   */
  @VsoMethod
  public void setTechContactName(String  techContactName) {
    this.techContactName = techContactName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SamlServiceProviderSettings objSamlServiceProviderSettings = (SamlServiceProviderSettings) o;
  return   Objects.equals(this.samlEntityType, objSamlServiceProviderSettings.samlEntityType)&&
  Objects.equals(this.fqdn, objSamlServiceProviderSettings.fqdn)&&
  Objects.equals(this.spNodes, objSamlServiceProviderSettings.spNodes)&&
  Objects.equals(this.orgName, objSamlServiceProviderSettings.orgName)&&
  Objects.equals(this.orgDisplayName, objSamlServiceProviderSettings.orgDisplayName)&&
  Objects.equals(this.orgUrl, objSamlServiceProviderSettings.orgUrl)&&
  Objects.equals(this.techContactName, objSamlServiceProviderSettings.techContactName)&&
  Objects.equals(this.techContactEmail, objSamlServiceProviderSettings.techContactEmail);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SamlServiceProviderSettings {\n");
      sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
        sb.append("    orgDisplayName: ").append(toIndentedString(orgDisplayName)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
        sb.append("    orgUrl: ").append(toIndentedString(orgUrl)).append("\n");
        sb.append("    samlEntityType: ").append(toIndentedString(samlEntityType)).append("\n");
        sb.append("    spNodes: ").append(toIndentedString(spNodes)).append("\n");
        sb.append("    techContactEmail: ").append(toIndentedString(techContactEmail)).append("\n");
        sb.append("    techContactName: ").append(toIndentedString(techContactName)).append("\n");
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

