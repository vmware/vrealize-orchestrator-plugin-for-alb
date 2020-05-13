package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.KeyValue;
import com.vmware.avi.vro.model.Subnet;
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
 * Network
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "Network")
@VsoFinder(name = Constants.FINDER_VRO_NETWORK, idAccessor = "getObjectID()")
@Service
public class Network extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("configured_subnets")
  @Valid
  private List<Subnet> configuredSubnets = null;

  @JsonProperty("dhcp_enabled")
  private Boolean dhcpEnabled = true;

  @JsonProperty("exclude_discovered_subnets")
  private Boolean excludeDiscoveredSubnets = null;

  @JsonProperty("ip6_autocfg_enabled")
  private Boolean ip6AutocfgEnabled = true;

  @JsonProperty("labels")
  @Valid
  private List<KeyValue> labels = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("synced_from_se")
  private Boolean syncedFromSe = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vcenter_dvs")
  private Boolean vcenterDvs = true;

  @JsonProperty("vimgrnw_ref")
  private String vimgrnwRef = null;

  @JsonProperty("vrf_context_ref")
  private String vrfContextRef = null;

  
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
   *  It is a reference to an object of type Cloud.
   * @return cloudRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Cloud.")


 
  @VsoMethod  
  public String getCloudRef() {
    return cloudRef;
  }
    
  @VsoMethod
  public void setCloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
  }

  
  public Network addConfiguredSubnetsItem(Subnet configuredSubnetsItem) {
    if (this.configuredSubnets == null) {
      this.configuredSubnets = new ArrayList<Subnet>();
    }
    this.configuredSubnets.add(configuredSubnetsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property configured_subnets of obj type Network field type str  type object
   * @return configuredSubnets
  **/
  @ApiModelProperty(value = "Placeholder for description of property configured_subnets of obj type Network field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<Subnet> getConfiguredSubnets() {
    return configuredSubnets;
  }
    
  @VsoMethod
  public void setConfiguredSubnets(List<Subnet> configuredSubnets) {
    this.configuredSubnets = configuredSubnets;
  }

  
  /**
   * Select the IP address management scheme for this Network.
   * @return dhcpEnabled
  **/
  @ApiModelProperty(value = "Select the IP address management scheme for this Network.")


 
  @VsoMethod  
  public Boolean isDhcpEnabled() {
    return dhcpEnabled;
  }
    
  @VsoMethod
  public void setDhcpEnabled(Boolean dhcpEnabled) {
    this.dhcpEnabled = dhcpEnabled;
  }

  
  /**
   * When selected, excludes all discovered subnets in this network from consideration for virtual service placement.
   * @return excludeDiscoveredSubnets
  **/
  @ApiModelProperty(value = "When selected, excludes all discovered subnets in this network from consideration for virtual service placement.")


 
  @VsoMethod  
  public Boolean isExcludeDiscoveredSubnets() {
    return excludeDiscoveredSubnets;
  }
    
  @VsoMethod
  public void setExcludeDiscoveredSubnets(Boolean excludeDiscoveredSubnets) {
    this.excludeDiscoveredSubnets = excludeDiscoveredSubnets;
  }

  
  /**
   * Enable IPv6 auto configuration. Field introduced in 18.1.1.
   * @return ip6AutocfgEnabled
  **/
  @ApiModelProperty(value = "Enable IPv6 auto configuration. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Boolean isIp6AutocfgEnabled() {
    return ip6AutocfgEnabled;
  }
    
  @VsoMethod
  public void setIp6AutocfgEnabled(Boolean ip6AutocfgEnabled) {
    this.ip6AutocfgEnabled = ip6AutocfgEnabled;
  }

  
  public Network addLabelsItem(KeyValue labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<KeyValue>();
    }
    this.labels.add(labelsItem);
    return this;
  }
  
  /**
   * Key/value labels which can be used for Object Access Policy permission scoping. Field introduced in 18.2.7, 20.1.1.
   * @return labels
  **/
  @ApiModelProperty(value = "Key/value labels which can be used for Object Access Policy permission scoping. Field introduced in 18.2.7, 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<KeyValue> getLabels() {
    return labels;
  }
    
  @VsoMethod
  public void setLabels(List<KeyValue> labels) {
    this.labels = labels;
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
   * Placeholder for description of property synced_from_se of obj type Network field type str  type boolean
   * @return syncedFromSe
  **/
  @ApiModelProperty(value = "Placeholder for description of property synced_from_se of obj type Network field type str  type boolean")


 
  @VsoMethod  
  public Boolean isSyncedFromSe() {
    return syncedFromSe;
  }
    
  @VsoMethod
  public void setSyncedFromSe(Boolean syncedFromSe) {
    this.syncedFromSe = syncedFromSe;
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
   * Placeholder for description of property vcenter_dvs of obj type Network field type str  type boolean
   * @return vcenterDvs
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_dvs of obj type Network field type str  type boolean")


 
  @VsoMethod  
  public Boolean isVcenterDvs() {
    return vcenterDvs;
  }
    
  @VsoMethod
  public void setVcenterDvs(Boolean vcenterDvs) {
    this.vcenterDvs = vcenterDvs;
  }

  
  /**
   *  It is a reference to an object of type VIMgrNWRuntime.
   * @return vimgrnwRef
  **/
  @ApiModelProperty(readOnly = true, value = " It is a reference to an object of type VIMgrNWRuntime.")


 
  @VsoMethod  
  public String getVimgrnwRef() {
    return vimgrnwRef;
  }
    
  @VsoMethod
  public void setVimgrnwRef(String vimgrnwRef) {
    this.vimgrnwRef = vimgrnwRef;
  }

  
  /**
   *  It is a reference to an object of type VrfContext.
   * @return vrfContextRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VrfContext.")


 
  @VsoMethod  
  public String getVrfContextRef() {
    return vrfContextRef;
  }
    
  @VsoMethod
  public void setVrfContextRef(String vrfContextRef) {
    this.vrfContextRef = vrfContextRef;
  }

  
  public String getObjectID() {
		return "Network";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Network network = (Network) o;
    return Objects.equals(this.lastModified, network.lastModified) &&
        Objects.equals(this.cloudRef, network.cloudRef) &&
        Objects.equals(this.configuredSubnets, network.configuredSubnets) &&
        Objects.equals(this.dhcpEnabled, network.dhcpEnabled) &&
        Objects.equals(this.excludeDiscoveredSubnets, network.excludeDiscoveredSubnets) &&
        Objects.equals(this.ip6AutocfgEnabled, network.ip6AutocfgEnabled) &&
        Objects.equals(this.labels, network.labels) &&
        Objects.equals(this.name, network.name) &&
        Objects.equals(this.syncedFromSe, network.syncedFromSe) &&
        Objects.equals(this.tenantRef, network.tenantRef) &&
        Objects.equals(this.url, network.url) &&
        Objects.equals(this.uuid, network.uuid) &&
        Objects.equals(this.vcenterDvs, network.vcenterDvs) &&
        Objects.equals(this.vimgrnwRef, network.vimgrnwRef) &&
        Objects.equals(this.vrfContextRef, network.vrfContextRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, cloudRef, configuredSubnets, dhcpEnabled, excludeDiscoveredSubnets, ip6AutocfgEnabled, labels, name, syncedFromSe, tenantRef, url, uuid, vcenterDvs, vimgrnwRef, vrfContextRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    configuredSubnets: ").append(toIndentedString(configuredSubnets)).append("\n");
    sb.append("    dhcpEnabled: ").append(toIndentedString(dhcpEnabled)).append("\n");
    sb.append("    excludeDiscoveredSubnets: ").append(toIndentedString(excludeDiscoveredSubnets)).append("\n");
    sb.append("    ip6AutocfgEnabled: ").append(toIndentedString(ip6AutocfgEnabled)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    syncedFromSe: ").append(toIndentedString(syncedFromSe)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vcenterDvs: ").append(toIndentedString(vcenterDvs)).append("\n");
    sb.append("    vimgrnwRef: ").append(toIndentedString(vimgrnwRef)).append("\n");
    sb.append("    vrfContextRef: ").append(toIndentedString(vrfContextRef)).append("\n");
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

