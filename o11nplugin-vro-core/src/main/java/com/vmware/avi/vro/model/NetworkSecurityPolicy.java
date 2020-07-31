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
 * The NetworkSecurityPolicy is a POJO class extends AviRestResource that used for creating
 * NetworkSecurityPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NetworkSecurityPolicy")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKSECURITYPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NetworkSecurityPolicy extends AviRestResource {
  @JsonProperty("cloud_config_cksum")
  @JsonInclude(Include.NON_NULL)
  private String cloudConfigCksum = null;

  @JsonProperty("created_by")
  @JsonInclude(Include.NON_NULL)
  private String createdBy = null;

  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("ip_reputation_db_ref")
  @JsonInclude(Include.NON_NULL)
  private String ipReputationDbRef = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("rules")
  @JsonInclude(Include.NON_NULL)
  private List<NetworkSecurityRule> rules = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Checksum of cloud configuration for network sec policy.
   * Internally set by cloud connector.
   * @return cloudConfigCksum
   */
  @VsoMethod
  public String getCloudConfigCksum() {
    return cloudConfigCksum;
  }

  /**
   * This is the setter method to the attribute.
   * Checksum of cloud configuration for network sec policy.
   * Internally set by cloud connector.
   * @param cloudConfigCksum set the cloudConfigCksum.
   */
  @VsoMethod
  public void setCloudConfigCksum(String  cloudConfigCksum) {
    this.cloudConfigCksum = cloudConfigCksum;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Creator name.
   * @return createdBy
   */
  @VsoMethod
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * This is the setter method to the attribute.
   * Creator name.
   * @param createdBy set the createdBy.
   */
  @VsoMethod
  public void setCreatedBy(String  createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User defined description for the object.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User defined description for the object.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip reputation database.
   * It is a reference to an object of type ipreputationdb.
   * Field introduced in 20.1.1.
   * @return ipReputationDbRef
   */
  @VsoMethod
  public String getIpReputationDbRef() {
    return ipReputationDbRef;
  }

  /**
   * This is the setter method to the attribute.
   * Ip reputation database.
   * It is a reference to an object of type ipreputationdb.
   * Field introduced in 20.1.1.
   * @param ipReputationDbRef set the ipReputationDbRef.
   */
  @VsoMethod
  public void setIpReputationDbRef(String  ipReputationDbRef) {
    this.ipReputationDbRef = ipReputationDbRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property rules of obj type networksecuritypolicy field type str  type array.
   * @return rules
   */
  @VsoMethod
  public List<NetworkSecurityRule> getRules() {
    return rules;
  }

  /**
   * This is the setter method. this will set the rules
   * Placeholder for description of property rules of obj type networksecuritypolicy field type str  type array.
   * @return rules
   */
  @VsoMethod
  public void setRules(List<NetworkSecurityRule>  rules) {
    this.rules = rules;
  }

  /**
   * This is the setter method this will set the rules
   * Placeholder for description of property rules of obj type networksecuritypolicy field type str  type array.
   * @return rules
   */
  @VsoMethod
  public NetworkSecurityPolicy addRulesItem(NetworkSecurityRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<NetworkSecurityRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NetworkSecurityPolicy objNetworkSecurityPolicy = (NetworkSecurityPolicy) o;
  return   Objects.equals(this.uuid, objNetworkSecurityPolicy.uuid)&&
  Objects.equals(this.name, objNetworkSecurityPolicy.name)&&
  Objects.equals(this.rules, objNetworkSecurityPolicy.rules)&&
  Objects.equals(this.createdBy, objNetworkSecurityPolicy.createdBy)&&
  Objects.equals(this.cloudConfigCksum, objNetworkSecurityPolicy.cloudConfigCksum)&&
  Objects.equals(this.ipReputationDbRef, objNetworkSecurityPolicy.ipReputationDbRef)&&
  Objects.equals(this.description, objNetworkSecurityPolicy.description)&&
  Objects.equals(this.tenantRef, objNetworkSecurityPolicy.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NetworkSecurityPolicy {\n");
      sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipReputationDbRef: ").append(toIndentedString(ipReputationDbRef)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

