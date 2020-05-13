package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.Cif;
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
 * APICLifsRuntime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "APICLifsRuntime")
@VsoFinder(name = Constants.FINDER_VRO_APICLIFSRUNTIME, idAccessor = "getObjectID()")
@Service
public class APICLifsRuntime extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("auto_allocated")
  private Boolean autoAllocated = null;

  @JsonProperty("cifs")
  @Valid
  private List<Cif> cifs = null;

  @JsonProperty("contract_graphs")
  @Valid
  private List<String> contractGraphs = null;

  @JsonProperty("lif_label")
  private String lifLabel = null;

  @JsonProperty("multi_vrf")
  private Boolean multiVrf = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("network")
  private String network = null;

  @JsonProperty("se_uuid")
  @Valid
  private List<String> seUuid = null;

  @JsonProperty("subnet")
  private String subnet = null;

  @JsonProperty("tenant_name")
  private String tenantName = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("transaction_uuid")
  @Valid
  private List<String> transactionUuid = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vs_uuid")
  @Valid
  private List<String> vsUuid = null;

  
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

  
  /**
   * Placeholder for description of property auto_allocated of obj type APICLifsRuntime field type str  type boolean
   * @return autoAllocated
  **/
  @ApiModelProperty(value = "Placeholder for description of property auto_allocated of obj type APICLifsRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isAutoAllocated() {
    return autoAllocated;
  }
    
  @VsoMethod
  public void setAutoAllocated(Boolean autoAllocated) {
    this.autoAllocated = autoAllocated;
  }

  
  public APICLifsRuntime addCifsItem(Cif cifsItem) {
    if (this.cifs == null) {
      this.cifs = new ArrayList<Cif>();
    }
    this.cifs.add(cifsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property cifs of obj type APICLifsRuntime field type str  type object
   * @return cifs
  **/
  @ApiModelProperty(value = "Placeholder for description of property cifs of obj type APICLifsRuntime field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<Cif> getCifs() {
    return cifs;
  }
    
  @VsoMethod
  public void setCifs(List<Cif> cifs) {
    this.cifs = cifs;
  }

  
  public APICLifsRuntime addContractGraphsItem(String contractGraphsItem) {
    if (this.contractGraphs == null) {
      this.contractGraphs = new ArrayList<String>();
    }
    this.contractGraphs.add(contractGraphsItem);
    return this;
  }
  
  /**
   * Contract Graph associated with the VirtualService. Field introduced in 17.2.14,18.1.5,18.2.1.
   * @return contractGraphs
  **/
  @ApiModelProperty(value = "Contract Graph associated with the VirtualService. Field introduced in 17.2.14,18.1.5,18.2.1.")


 
  @VsoMethod  
  public List<String> getContractGraphs() {
    return contractGraphs;
  }
    
  @VsoMethod
  public void setContractGraphs(List<String> contractGraphs) {
    this.contractGraphs = contractGraphs;
  }

  
  /**
   * lif_label of APICLifsRuntime.
   * @return lifLabel
  **/
  @ApiModelProperty(required = true, value = "lif_label of APICLifsRuntime.")
  @NotNull


 
  @VsoMethod  
  public String getLifLabel() {
    return lifLabel;
  }
    
  @VsoMethod
  public void setLifLabel(String lifLabel) {
    this.lifLabel = lifLabel;
  }

  
  /**
   * Placeholder for description of property multi_vrf of obj type APICLifsRuntime field type str  type boolean
   * @return multiVrf
  **/
  @ApiModelProperty(value = "Placeholder for description of property multi_vrf of obj type APICLifsRuntime field type str  type boolean")


 
  @VsoMethod  
  public Boolean isMultiVrf() {
    return multiVrf;
  }
    
  @VsoMethod
  public void setMultiVrf(Boolean multiVrf) {
    this.multiVrf = multiVrf;
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
   * network of APICLifsRuntime.
   * @return network
  **/
  @ApiModelProperty(value = "network of APICLifsRuntime.")


 
  @VsoMethod  
  public String getNetwork() {
    return network;
  }
    
  @VsoMethod
  public void setNetwork(String network) {
    this.network = network;
  }

  
  public APICLifsRuntime addSeUuidItem(String seUuidItem) {
    if (this.seUuid == null) {
      this.seUuid = new ArrayList<String>();
    }
    this.seUuid.add(seUuidItem);
    return this;
  }
  
  /**
   * Unique object identifier of se.
   * @return seUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of se.")


 
  @VsoMethod  
  public List<String> getSeUuid() {
    return seUuid;
  }
    
  @VsoMethod
  public void setSeUuid(List<String> seUuid) {
    this.seUuid = seUuid;
  }

  
  /**
   * subnet of APICLifsRuntime.
   * @return subnet
  **/
  @ApiModelProperty(value = "subnet of APICLifsRuntime.")


 
  @VsoMethod  
  public String getSubnet() {
    return subnet;
  }
    
  @VsoMethod
  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }

  
  /**
   * tenant_name of APICLifsRuntime.
   * @return tenantName
  **/
  @ApiModelProperty(required = true, value = "tenant_name of APICLifsRuntime.")
  @NotNull


 
  @VsoMethod  
  public String getTenantName() {
    return tenantName;
  }
    
  @VsoMethod
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
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

  
  public APICLifsRuntime addTransactionUuidItem(String transactionUuidItem) {
    if (this.transactionUuid == null) {
      this.transactionUuid = new ArrayList<String>();
    }
    this.transactionUuid.add(transactionUuidItem);
    return this;
  }
  
  /**
   * Unique object identifier of transaction.
   * @return transactionUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of transaction.")


 
  @VsoMethod  
  public List<String> getTransactionUuid() {
    return transactionUuid;
  }
    
  @VsoMethod
  public void setTransactionUuid(List<String> transactionUuid) {
    this.transactionUuid = transactionUuid;
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

  
  public APICLifsRuntime addVsUuidItem(String vsUuidItem) {
    if (this.vsUuid == null) {
      this.vsUuid = new ArrayList<String>();
    }
    this.vsUuid.add(vsUuidItem);
    return this;
  }
  
  /**
   * Unique object identifier of vs.
   * @return vsUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of vs.")


 
  @VsoMethod  
  public List<String> getVsUuid() {
    return vsUuid;
  }
    
  @VsoMethod
  public void setVsUuid(List<String> vsUuid) {
    this.vsUuid = vsUuid;
  }

  
  public String getObjectID() {
		return "APICLifsRuntime";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICLifsRuntime apICLifsRuntime = (APICLifsRuntime) o;
    return Objects.equals(this.lastModified, apICLifsRuntime.lastModified) &&
        Objects.equals(this.autoAllocated, apICLifsRuntime.autoAllocated) &&
        Objects.equals(this.cifs, apICLifsRuntime.cifs) &&
        Objects.equals(this.contractGraphs, apICLifsRuntime.contractGraphs) &&
        Objects.equals(this.lifLabel, apICLifsRuntime.lifLabel) &&
        Objects.equals(this.multiVrf, apICLifsRuntime.multiVrf) &&
        Objects.equals(this.name, apICLifsRuntime.name) &&
        Objects.equals(this.network, apICLifsRuntime.network) &&
        Objects.equals(this.seUuid, apICLifsRuntime.seUuid) &&
        Objects.equals(this.subnet, apICLifsRuntime.subnet) &&
        Objects.equals(this.tenantName, apICLifsRuntime.tenantName) &&
        Objects.equals(this.tenantRef, apICLifsRuntime.tenantRef) &&
        Objects.equals(this.transactionUuid, apICLifsRuntime.transactionUuid) &&
        Objects.equals(this.url, apICLifsRuntime.url) &&
        Objects.equals(this.uuid, apICLifsRuntime.uuid) &&
        Objects.equals(this.vsUuid, apICLifsRuntime.vsUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, autoAllocated, cifs, contractGraphs, lifLabel, multiVrf, name, network, seUuid, subnet, tenantName, tenantRef, transactionUuid, url, uuid, vsUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICLifsRuntime {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    autoAllocated: ").append(toIndentedString(autoAllocated)).append("\n");
    sb.append("    cifs: ").append(toIndentedString(cifs)).append("\n");
    sb.append("    contractGraphs: ").append(toIndentedString(contractGraphs)).append("\n");
    sb.append("    lifLabel: ").append(toIndentedString(lifLabel)).append("\n");
    sb.append("    multiVrf: ").append(toIndentedString(multiVrf)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    transactionUuid: ").append(toIndentedString(transactionUuid)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

