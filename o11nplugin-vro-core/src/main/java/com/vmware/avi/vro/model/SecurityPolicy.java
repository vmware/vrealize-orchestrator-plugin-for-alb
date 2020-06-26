package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DnsAttacks;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SecurityPolicy is a POJO class extends AviRestResource that used for creating
 * SecurityPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SecurityPolicy")
@VsoFinder(name = Constants.FINDER_VRO_SECURITYPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SecurityPolicy extends AviRestResource {
  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("dns_attacks")
  @JsonInclude(Include.NON_NULL)
  private DnsAttacks dnsAttacks = null;

  @JsonProperty("dns_policy_index")
  @JsonInclude(Include.NON_NULL)
  private Integer dnsPolicyIndex = 0;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("network_security_policy_index")
  @JsonInclude(Include.NON_NULL)
  private Integer networkSecurityPolicyIndex = 0;

  @JsonProperty("oper_mode")
  @JsonInclude(Include.NON_NULL)
  private String operMode = "DETECTION";

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
   * Security policy is used to specify various configuration information used to perform distributed denial of service (ddos) attacks detection and
   * mitigation.
   * Field introduced in 18.2.1.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Security policy is used to specify various configuration information used to perform distributed denial of service (ddos) attacks detection and
   * mitigation.
   * Field introduced in 18.2.1.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Attacks utilizing the dns protocol operations.
   * Field introduced in 18.2.1.
   * @return dnsAttacks
   */
  @VsoMethod
  public DnsAttacks getDnsAttacks() {
    return dnsAttacks;
  }

  /**
   * This is the setter method to the attribute.
   * Attacks utilizing the dns protocol operations.
   * Field introduced in 18.2.1.
   * @param dnsAttacks set the dnsAttacks.
   */
  @VsoMethod
  public void setDnsAttacks(DnsAttacks dnsAttacks) {
    this.dnsAttacks = dnsAttacks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Index of the dns policy to use for the mitigation rules applied to the dns attacks.
   * Field introduced in 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return dnsPolicyIndex
   */
  @VsoMethod
  public Integer getDnsPolicyIndex() {
    return dnsPolicyIndex;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the dns policy to use for the mitigation rules applied to the dns attacks.
   * Field introduced in 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param dnsPolicyIndex set the dnsPolicyIndex.
   */
  @VsoMethod
  public void setDnsPolicyIndex(Integer  dnsPolicyIndex) {
    this.dnsPolicyIndex = dnsPolicyIndex;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the security policy.
   * Field introduced in 18.2.1.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the security policy.
   * Field introduced in 18.2.1.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Index of the network security policy to use for the mitigation rules applied to the attacks.
   * Field introduced in 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return networkSecurityPolicyIndex
   */
  @VsoMethod
  public Integer getNetworkSecurityPolicyIndex() {
    return networkSecurityPolicyIndex;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the network security policy to use for the mitigation rules applied to the attacks.
   * Field introduced in 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param networkSecurityPolicyIndex set the networkSecurityPolicyIndex.
   */
  @VsoMethod
  public void setNetworkSecurityPolicyIndex(Integer  networkSecurityPolicyIndex) {
    this.networkSecurityPolicyIndex = networkSecurityPolicyIndex;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks.
   * Enum options - DETECTION, MITIGATION.
   * Field introduced in 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as DETECTION.
   * @return operMode
   */
  @VsoMethod
  public String getOperMode() {
    return operMode;
  }

  /**
   * This is the setter method to the attribute.
   * Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks.
   * Enum options - DETECTION, MITIGATION.
   * Field introduced in 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as DETECTION.
   * @param operMode set the operMode.
   */
  @VsoMethod
  public void setOperMode(String  operMode) {
    this.operMode = operMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenancy of the security policy.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.1.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenancy of the security policy.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.1.
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
   * The uuid of the security policy.
   * Field introduced in 18.2.1.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * The uuid of the security policy.
   * Field introduced in 18.2.1.
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
  SecurityPolicy objSecurityPolicy = (SecurityPolicy) o;
  return   Objects.equals(this.dnsAttacks, objSecurityPolicy.dnsAttacks)&&
  Objects.equals(this.uuid, objSecurityPolicy.uuid)&&
  Objects.equals(this.description, objSecurityPolicy.description)&&
  Objects.equals(this.dnsPolicyIndex, objSecurityPolicy.dnsPolicyIndex)&&
  Objects.equals(this.networkSecurityPolicyIndex, objSecurityPolicy.networkSecurityPolicyIndex)&&
  Objects.equals(this.operMode, objSecurityPolicy.operMode)&&
  Objects.equals(this.tenantRef, objSecurityPolicy.tenantRef)&&
  Objects.equals(this.name, objSecurityPolicy.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SecurityPolicy {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dnsAttacks: ").append(toIndentedString(dnsAttacks)).append("\n");
        sb.append("    dnsPolicyIndex: ").append(toIndentedString(dnsPolicyIndex)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    networkSecurityPolicyIndex: ").append(toIndentedString(networkSecurityPolicyIndex)).append("\n");
        sb.append("    operMode: ").append(toIndentedString(operMode)).append("\n");
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
