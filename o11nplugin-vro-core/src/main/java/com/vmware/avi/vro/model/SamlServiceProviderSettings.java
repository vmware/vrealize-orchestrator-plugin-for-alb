package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SamlServiceProviderNode;
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
 * SamlServiceProviderSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SamlServiceProviderSettings")
@VsoFinder(name = Constants.FINDER_VRO_SAMLSERVICEPROVIDERSETTINGS, idAccessor = "getObjectID()")
@Service
public class SamlServiceProviderSettings extends AviRestResource  {
  @JsonProperty("fqdn")
  private String fqdn = null;

  @JsonProperty("org_display_name")
  private String orgDisplayName = null;

  @JsonProperty("org_name")
  private String orgName = null;

  @JsonProperty("org_url")
  private String orgUrl = null;

  @JsonProperty("saml_entity_type")
  private String samlEntityType = null;

  @JsonProperty("sp_nodes")
  @Valid
  private List<SamlServiceProviderNode> spNodes = null;

  @JsonProperty("tech_contact_email")
  private String techContactEmail = null;

  @JsonProperty("tech_contact_name")
  private String techContactName = null;

  
  /**
   * FQDN if entity type is DNS_FQDN . Field introduced in 17.2.3.
   * @return fqdn
  **/
  @ApiModelProperty(value = "FQDN if entity type is DNS_FQDN . Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getFqdn() {
    return fqdn;
  }
    
  @VsoMethod
  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

  
  /**
   * Service Provider Organization Display Name. Field introduced in 17.2.3.
   * @return orgDisplayName
  **/
  @ApiModelProperty(value = "Service Provider Organization Display Name. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getOrgDisplayName() {
    return orgDisplayName;
  }
    
  @VsoMethod
  public void setOrgDisplayName(String orgDisplayName) {
    this.orgDisplayName = orgDisplayName;
  }

  
  /**
   * Service Provider Organization Name. Field introduced in 17.2.3.
   * @return orgName
  **/
  @ApiModelProperty(value = "Service Provider Organization Name. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getOrgName() {
    return orgName;
  }
    
  @VsoMethod
  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  
  /**
   * Service Provider Organization URL. Field introduced in 17.2.3.
   * @return orgUrl
  **/
  @ApiModelProperty(value = "Service Provider Organization URL. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getOrgUrl() {
    return orgUrl;
  }
    
  @VsoMethod
  public void setOrgUrl(String orgUrl) {
    this.orgUrl = orgUrl;
  }

  
  /**
   * Type of SAML endpoint. Enum options - AUTH_SAML_CLUSTER_VIP, AUTH_SAML_DNS_FQDN, AUTH_SAML_APP_VS. Field introduced in 17.2.3.
   * @return samlEntityType
  **/
  @ApiModelProperty(value = "Type of SAML endpoint. Enum options - AUTH_SAML_CLUSTER_VIP, AUTH_SAML_DNS_FQDN, AUTH_SAML_APP_VS. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getSamlEntityType() {
    return samlEntityType;
  }
    
  @VsoMethod
  public void setSamlEntityType(String samlEntityType) {
    this.samlEntityType = samlEntityType;
  }

  
  public SamlServiceProviderSettings addSpNodesItem(SamlServiceProviderNode spNodesItem) {
    if (this.spNodes == null) {
      this.spNodes = new ArrayList<SamlServiceProviderNode>();
    }
    this.spNodes.add(spNodesItem);
    return this;
  }
  
  /**
   * Service Provider node information. Field introduced in 17.2.3.
   * @return spNodes
  **/
  @ApiModelProperty(value = "Service Provider node information. Field introduced in 17.2.3.")

  @Valid

 
  @VsoMethod  
  public List<SamlServiceProviderNode> getSpNodes() {
    return spNodes;
  }
    
  @VsoMethod
  public void setSpNodes(List<SamlServiceProviderNode> spNodes) {
    this.spNodes = spNodes;
  }

  
  /**
   * Service Provider technical contact email. Field introduced in 17.2.3.
   * @return techContactEmail
  **/
  @ApiModelProperty(value = "Service Provider technical contact email. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getTechContactEmail() {
    return techContactEmail;
  }
    
  @VsoMethod
  public void setTechContactEmail(String techContactEmail) {
    this.techContactEmail = techContactEmail;
  }

  
  /**
   * Service Provider technical contact name. Field introduced in 17.2.3.
   * @return techContactName
  **/
  @ApiModelProperty(value = "Service Provider technical contact name. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getTechContactName() {
    return techContactName;
  }
    
  @VsoMethod
  public void setTechContactName(String techContactName) {
    this.techContactName = techContactName;
  }

  
  public String getObjectID() {
		return "SamlServiceProviderSettings";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlServiceProviderSettings samlServiceProviderSettings = (SamlServiceProviderSettings) o;
    return Objects.equals(this.fqdn, samlServiceProviderSettings.fqdn) &&
        Objects.equals(this.orgDisplayName, samlServiceProviderSettings.orgDisplayName) &&
        Objects.equals(this.orgName, samlServiceProviderSettings.orgName) &&
        Objects.equals(this.orgUrl, samlServiceProviderSettings.orgUrl) &&
        Objects.equals(this.samlEntityType, samlServiceProviderSettings.samlEntityType) &&
        Objects.equals(this.spNodes, samlServiceProviderSettings.spNodes) &&
        Objects.equals(this.techContactEmail, samlServiceProviderSettings.techContactEmail) &&
        Objects.equals(this.techContactName, samlServiceProviderSettings.techContactName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fqdn, orgDisplayName, orgName, orgUrl, samlEntityType, spNodes, techContactEmail, techContactName);
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

