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
 * The ApicAgentGenericEventDetails is a POJO class extends AviRestResource that used for creating
 * ApicAgentGenericEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApicAgentGenericEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_APICAGENTGENERICEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApicAgentGenericEventDetails extends AviRestResource {
    @JsonProperty("contract_graphs")
    @JsonInclude(Include.NON_NULL)
    private List<String> contractGraphs;

    @JsonProperty("lif_cif_attachment")
    @JsonInclude(Include.NON_NULL)
    private List<String> lifCifAttachment;

    @JsonProperty("lifs")
    @JsonInclude(Include.NON_NULL)
    private List<String> lifs;

    @JsonProperty("networks")
    @JsonInclude(Include.NON_NULL)
    private List<String> networks;

    @JsonProperty("se_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seUuid;

    @JsonProperty("service_engine_vnics")
    @JsonInclude(Include.NON_NULL)
    private List<String> serviceEngineVnics;

    @JsonProperty("tenant_name")
    @JsonInclude(Include.NON_NULL)
    private String tenantName;

    @JsonProperty("tenant_uuid")
    @JsonInclude(Include.NON_NULL)
    private String tenantUuid;

    @JsonProperty("vnic_network_attachment")
    @JsonInclude(Include.NON_NULL)
    private List<String> vnicNetworkAttachment;

    @JsonProperty("vs_name")
    @JsonInclude(Include.NON_NULL)
    private String vsName;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsUuid;



  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return contractGraphs
   */
  @VsoMethod
  public List<String> getContractGraphs() {
    return contractGraphs;
  }

  /**
   * This is the setter method. this will set the contractGraphs
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return contractGraphs
   */
  @VsoMethod
  public void setContractGraphs(List<String>  contractGraphs) {
    this.contractGraphs = contractGraphs;
  }

  /**
   * This is the setter method this will set the contractGraphs
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return contractGraphs
   */
  @VsoMethod
  public ApicAgentGenericEventDetails addContractGraphsItem(String contractGraphsItem) {
    if (this.contractGraphs == null) {
      this.contractGraphs = new ArrayList<String>();
    }
    this.contractGraphs.add(contractGraphsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return lifCifAttachment
   */
  @VsoMethod
  public List<String> getLifCifAttachment() {
    return lifCifAttachment;
  }

  /**
   * This is the setter method. this will set the lifCifAttachment
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return lifCifAttachment
   */
  @VsoMethod
  public void setLifCifAttachment(List<String>  lifCifAttachment) {
    this.lifCifAttachment = lifCifAttachment;
  }

  /**
   * This is the setter method this will set the lifCifAttachment
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return lifCifAttachment
   */
  @VsoMethod
  public ApicAgentGenericEventDetails addLifCifAttachmentItem(String lifCifAttachmentItem) {
    if (this.lifCifAttachment == null) {
      this.lifCifAttachment = new ArrayList<String>();
    }
    this.lifCifAttachment.add(lifCifAttachmentItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return lifs
   */
  @VsoMethod
  public List<String> getLifs() {
    return lifs;
  }

  /**
   * This is the setter method. this will set the lifs
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return lifs
   */
  @VsoMethod
  public void setLifs(List<String>  lifs) {
    this.lifs = lifs;
  }

  /**
   * This is the setter method this will set the lifs
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return lifs
   */
  @VsoMethod
  public ApicAgentGenericEventDetails addLifsItem(String lifsItem) {
    if (this.lifs == null) {
      this.lifs = new ArrayList<String>();
    }
    this.lifs.add(lifsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return networks
   */
  @VsoMethod
  public List<String> getNetworks() {
    return networks;
  }

  /**
   * This is the setter method. this will set the networks
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return networks
   */
  @VsoMethod
  public void setNetworks(List<String>  networks) {
    this.networks = networks;
  }

  /**
   * This is the setter method this will set the networks
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return networks
   */
  @VsoMethod
  public ApicAgentGenericEventDetails addNetworksItem(String networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<String>();
    }
    this.networks.add(networksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return serviceEngineVnics
   */
  @VsoMethod
  public List<String> getServiceEngineVnics() {
    return serviceEngineVnics;
  }

  /**
   * This is the setter method. this will set the serviceEngineVnics
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return serviceEngineVnics
   */
  @VsoMethod
  public void setServiceEngineVnics(List<String>  serviceEngineVnics) {
    this.serviceEngineVnics = serviceEngineVnics;
  }

  /**
   * This is the setter method this will set the serviceEngineVnics
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return serviceEngineVnics
   */
  @VsoMethod
  public ApicAgentGenericEventDetails addServiceEngineVnicsItem(String serviceEngineVnicsItem) {
    if (this.serviceEngineVnics == null) {
      this.serviceEngineVnics = new ArrayList<String>();
    }
    this.serviceEngineVnics.add(serviceEngineVnicsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return tenantName
   */
  @VsoMethod
  public String getTenantName() {
    return tenantName;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param tenantName set the tenantName.
   */
  @VsoMethod
  public void setTenantName(String  tenantName) {
    this.tenantName = tenantName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return tenantUuid
   */
  @VsoMethod
  public String getTenantUuid() {
    return tenantUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param tenantUuid set the tenantUuid.
   */
  @VsoMethod
  public void setTenantUuid(String  tenantUuid) {
    this.tenantUuid = tenantUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return vnicNetworkAttachment
   */
  @VsoMethod
  public List<String> getVnicNetworkAttachment() {
    return vnicNetworkAttachment;
  }

  /**
   * This is the setter method. this will set the vnicNetworkAttachment
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return vnicNetworkAttachment
   */
  @VsoMethod
  public void setVnicNetworkAttachment(List<String>  vnicNetworkAttachment) {
    this.vnicNetworkAttachment = vnicNetworkAttachment;
  }

  /**
   * This is the setter method this will set the vnicNetworkAttachment
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return vnicNetworkAttachment
   */
  @VsoMethod
  public ApicAgentGenericEventDetails addVnicNetworkAttachmentItem(String vnicNetworkAttachmentItem) {
    if (this.vnicNetworkAttachment == null) {
      this.vnicNetworkAttachment = new ArrayList<String>();
    }
    this.vnicNetworkAttachment.add(vnicNetworkAttachmentItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return vsName
   */
  @VsoMethod
  public String getVsName() {
    return vsName;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param vsName set the vsName.
   */
  @VsoMethod
  public void setVsName(String  vsName) {
    this.vsName = vsName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 21.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApicAgentGenericEventDetails objApicAgentGenericEventDetails = (ApicAgentGenericEventDetails) o;
  return   Objects.equals(this.vsUuid, objApicAgentGenericEventDetails.vsUuid)&&
  Objects.equals(this.vsName, objApicAgentGenericEventDetails.vsName)&&
  Objects.equals(this.lifs, objApicAgentGenericEventDetails.lifs)&&
  Objects.equals(this.serviceEngineVnics, objApicAgentGenericEventDetails.serviceEngineVnics)&&
  Objects.equals(this.networks, objApicAgentGenericEventDetails.networks)&&
  Objects.equals(this.contractGraphs, objApicAgentGenericEventDetails.contractGraphs)&&
  Objects.equals(this.seUuid, objApicAgentGenericEventDetails.seUuid)&&
  Objects.equals(this.tenantUuid, objApicAgentGenericEventDetails.tenantUuid)&&
  Objects.equals(this.tenantName, objApicAgentGenericEventDetails.tenantName)&&
  Objects.equals(this.lifCifAttachment, objApicAgentGenericEventDetails.lifCifAttachment)&&
  Objects.equals(this.vnicNetworkAttachment, objApicAgentGenericEventDetails.vnicNetworkAttachment);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApicAgentGenericEventDetails {\n");
      sb.append("    contractGraphs: ").append(toIndentedString(contractGraphs)).append("\n");
        sb.append("    lifCifAttachment: ").append(toIndentedString(lifCifAttachment)).append("\n");
        sb.append("    lifs: ").append(toIndentedString(lifs)).append("\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
        sb.append("    serviceEngineVnics: ").append(toIndentedString(serviceEngineVnics)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
        sb.append("    vnicNetworkAttachment: ").append(toIndentedString(vnicNetworkAttachment)).append("\n");
        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

