package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.NetworkSecurityRule;
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
 * NetworkSecurityPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NetworkSecurityPolicy")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKSECURITYPOLICY, idAccessor = "getObjectID()")
@Service
public class NetworkSecurityPolicy extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cloud_config_cksum")
  private String cloudConfigCksum = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("ip_reputation_db_ref")
  private String ipReputationDbRef = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rules")
  @Valid
  private List<NetworkSecurityRule> rules = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
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
   * Checksum of cloud configuration for Network Sec Policy. Internally set by cloud connector.
   * @return cloudConfigCksum
  **/
  @ApiModelProperty(value = "Checksum of cloud configuration for Network Sec Policy. Internally set by cloud connector.")


 
  @VsoMethod  
  public String getCloudConfigCksum() {
    return cloudConfigCksum;
  }
    
  @VsoMethod
  public void setCloudConfigCksum(String cloudConfigCksum) {
    this.cloudConfigCksum = cloudConfigCksum;
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
   * User defined description for the object.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for the object.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * IP reputation database. It is a reference to an object of type IPReputationDB. Field introduced in 20.1.1.
   * @return ipReputationDbRef
  **/
  @ApiModelProperty(value = "IP reputation database. It is a reference to an object of type IPReputationDB. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getIpReputationDbRef() {
    return ipReputationDbRef;
  }
    
  @VsoMethod
  public void setIpReputationDbRef(String ipReputationDbRef) {
    this.ipReputationDbRef = ipReputationDbRef;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the object.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public NetworkSecurityPolicy addRulesItem(NetworkSecurityRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<NetworkSecurityRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property rules of obj type NetworkSecurityPolicy field type str  type object
   * @return rules
  **/
  @ApiModelProperty(value = "Placeholder for description of property rules of obj type NetworkSecurityPolicy field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<NetworkSecurityRule> getRules() {
    return rules;
  }
    
  @VsoMethod
  public void setRules(List<NetworkSecurityRule> rules) {
    this.rules = rules;
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

  
  public String getObjectID() {
		return "NetworkSecurityPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkSecurityPolicy networkSecurityPolicy = (NetworkSecurityPolicy) o;
    return Objects.equals(this.lastModified, networkSecurityPolicy.lastModified) &&
        Objects.equals(this.cloudConfigCksum, networkSecurityPolicy.cloudConfigCksum) &&
        Objects.equals(this.createdBy, networkSecurityPolicy.createdBy) &&
        Objects.equals(this.description, networkSecurityPolicy.description) &&
        Objects.equals(this.ipReputationDbRef, networkSecurityPolicy.ipReputationDbRef) &&
        Objects.equals(this.name, networkSecurityPolicy.name) &&
        Objects.equals(this.rules, networkSecurityPolicy.rules) &&
        Objects.equals(this.tenantRef, networkSecurityPolicy.tenantRef) &&
        Objects.equals(this.url, networkSecurityPolicy.url) &&
        Objects.equals(this.uuid, networkSecurityPolicy.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, cloudConfigCksum, createdBy, description, ipReputationDbRef, name, rules, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkSecurityPolicy {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipReputationDbRef: ").append(toIndentedString(ipReputationDbRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

