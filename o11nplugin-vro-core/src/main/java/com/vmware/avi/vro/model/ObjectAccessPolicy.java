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
 * The ObjectAccessPolicy is a POJO class extends AviRestResource that used for creating
 * ObjectAccessPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ObjectAccessPolicy")
@VsoFinder(name = Constants.FINDER_VRO_OBJECTACCESSPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ObjectAccessPolicy extends AviRestResource {
  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("rules")
  @JsonInclude(Include.NON_NULL)
  private List<ObjectAccessPolicyRule> rules = null;

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
   * Name of the object access policy.
   * Field introduced in 18.2.7, 20.1.1.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object access policy.
   * Field introduced in 18.2.7, 20.1.1.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rules which grant access to specific objects.
   * Field introduced in 18.2.7, 20.1.1.
   * @return rules
   */
  @VsoMethod
  public List<ObjectAccessPolicyRule> getRules() {
    return rules;
  }

  /**
   * This is the setter method. this will set the rules
   * Rules which grant access to specific objects.
   * Field introduced in 18.2.7, 20.1.1.
   * @return rules
   */
  @VsoMethod
  public void setRules(List<ObjectAccessPolicyRule>  rules) {
    this.rules = rules;
  }

  /**
   * This is the setter method this will set the rules
   * Rules which grant access to specific objects.
   * Field introduced in 18.2.7, 20.1.1.
   * @return rules
   */
  @VsoMethod
  public ObjectAccessPolicy addRulesItem(ObjectAccessPolicyRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<ObjectAccessPolicyRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.7, 20.1.1.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.7, 20.1.1.
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
   * Uuid of the object access policy.
   * Field introduced in 18.2.7, 20.1.1.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the object access policy.
   * Field introduced in 18.2.7, 20.1.1.
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
  ObjectAccessPolicy objObjectAccessPolicy = (ObjectAccessPolicy) o;
  return   Objects.equals(this.uuid, objObjectAccessPolicy.uuid)&&
  Objects.equals(this.name, objObjectAccessPolicy.name)&&
  Objects.equals(this.rules, objObjectAccessPolicy.rules)&&
  Objects.equals(this.tenantRef, objObjectAccessPolicy.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ObjectAccessPolicy {\n");
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

