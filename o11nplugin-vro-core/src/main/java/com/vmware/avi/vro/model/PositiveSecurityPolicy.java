package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.PositiveSecurityParams;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The PositiveSecurityPolicy is a POJO class extends AviRestResource that used for creating
 * PositiveSecurityPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PositiveSecurityPolicy")
@VsoFinder(name = Constants.FINDER_VRO_POSITIVESECURITYPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PositiveSecurityPolicy extends AviRestResource {
    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("enable_positive_security_rule_updates")
    @JsonInclude(Include.NON_NULL)
    private Boolean enablePositiveSecurityRuleUpdates = false;

    @JsonIgnore
    private Boolean enableRegexProgramming = false;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("positive_security_params")
    @JsonInclude(Include.NON_NULL)
    private PositiveSecurityParams positiveSecurityParams;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Details of the positive security configuration.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Details of the positive security configuration.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable positive security rule generation using the application learning data rules will be programmed in a dedicated learning group.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enablePositiveSecurityRuleUpdates
   */
  @VsoMethod
  public Boolean getEnablePositiveSecurityRuleUpdates() {
    return enablePositiveSecurityRuleUpdates;
  }

  /**
   * This is the setter method to the attribute.
   * Enable positive security rule generation using the application learning data rules will be programmed in a dedicated learning group.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enablePositiveSecurityRuleUpdates set the enablePositiveSecurityRuleUpdates.
   */
  @VsoMethod
  public void setEnablePositiveSecurityRuleUpdates(Boolean  enablePositiveSecurityRuleUpdates) {
    this.enablePositiveSecurityRuleUpdates = enablePositiveSecurityRuleUpdates;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable dynamic regex generation for positive security rules.
   * This is an experimental feature and shouldn't be used in production.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableRegexProgramming
   */
  @VsoMethod
  public Boolean getEnableRegexProgramming() {
    return enableRegexProgramming;
  }

  /**
   * This is the setter method to the attribute.
   * Enable dynamic regex generation for positive security rules.
   * This is an experimental feature and shouldn't be used in production.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableRegexProgramming set the enableRegexProgramming.
   */
  @VsoMethod
  public void setEnableRegexProgramming(Boolean  enableRegexProgramming) {
    this.enableRegexProgramming = enableRegexProgramming;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the positivesecurity configuration.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the positivesecurity configuration.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Parameters for generating positive security rules.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return positiveSecurityParams
   */
  @VsoMethod
  public PositiveSecurityParams getPositiveSecurityParams() {
    return positiveSecurityParams;
  }

  /**
   * This is the setter method to the attribute.
   * Parameters for generating positive security rules.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param positiveSecurityParams set the positiveSecurityParams.
   */
  @VsoMethod
  public void setPositiveSecurityParams(PositiveSecurityParams positiveSecurityParams) {
    this.positiveSecurityParams = positiveSecurityParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Details of the tenant for positive security policy.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Details of the tenant for positive security policy.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Uuid of the positive security configuration.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the positive security configuration.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  PositiveSecurityPolicy objPositiveSecurityPolicy = (PositiveSecurityPolicy) o;
  return   Objects.equals(this.uuid, objPositiveSecurityPolicy.uuid)&&
  Objects.equals(this.name, objPositiveSecurityPolicy.name)&&
  Objects.equals(this.description, objPositiveSecurityPolicy.description)&&
  Objects.equals(this.tenantRef, objPositiveSecurityPolicy.tenantRef)&&
  Objects.equals(this.enablePositiveSecurityRuleUpdates, objPositiveSecurityPolicy.enablePositiveSecurityRuleUpdates)&&
  Objects.equals(this.positiveSecurityParams, objPositiveSecurityPolicy.positiveSecurityParams)&&
  Objects.equals(this.enableRegexProgramming, objPositiveSecurityPolicy.enableRegexProgramming);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PositiveSecurityPolicy {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enablePositiveSecurityRuleUpdates: ").append(toIndentedString(enablePositiveSecurityRuleUpdates)).append("\n");
        sb.append("    enableRegexProgramming: ").append(toIndentedString(enableRegexProgramming)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    positiveSecurityParams: ").append(toIndentedString(positiveSecurityParams)).append("\n");
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

