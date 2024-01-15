package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.BotAllowList;
import com.vmware.avi.vro.model.BotConfigClientBehavior;
import com.vmware.avi.vro.model.BotConfigIPLocation;
import com.vmware.avi.vro.model.BotConfigIPReputation;
import com.vmware.avi.vro.model.BotConfigUserAgent;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The BotDetectionPolicy is a POJO class extends AviRestResource that used for creating
 * BotDetectionPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BotDetectionPolicy")
@VsoFinder(name = Constants.FINDER_VRO_BOTDETECTIONPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BotDetectionPolicy extends AviRestResource {
    @JsonProperty("allow_list")
    @JsonInclude(Include.NON_NULL)
    private BotAllowList allowList = null;

    @JsonProperty("client_behavior_detector")
    @JsonInclude(Include.NON_NULL)
    private BotConfigClientBehavior clientBehaviorDetector = null;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("ip_location_detector")
    @JsonInclude(Include.NON_NULL)
    private BotConfigIPLocation ipLocationDetector = null;

    @JsonProperty("ip_reputation_detector")
    @JsonInclude(Include.NON_NULL)
    private BotConfigIPReputation ipReputationDetector = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("system_bot_mapping_ref")
    @JsonInclude(Include.NON_NULL)
    private String systemBotMappingRef = null;

    @JsonProperty("system_consolidator_ref")
    @JsonInclude(Include.NON_NULL)
    private String systemConsolidatorRef = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("user_agent_detector")
    @JsonInclude(Include.NON_NULL)
    private BotConfigUserAgent userAgentDetector = null;

    @JsonProperty("user_bot_mapping_ref")
    @JsonInclude(Include.NON_NULL)
    private String userBotMappingRef = null;

    @JsonProperty("user_consolidator_ref")
    @JsonInclude(Include.NON_NULL)
    private String userConsolidatorRef = null;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allow the user to skip botmanagement for selected requests.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowList
   */
  @VsoMethod
  public BotAllowList getAllowList() {
    return allowList;
  }

  /**
   * This is the setter method to the attribute.
   * Allow the user to skip botmanagement for selected requests.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param allowList set the allowList.
   */
  @VsoMethod
  public void setAllowList(BotAllowList allowList) {
    this.allowList = allowList;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The client behavior configuration used in this policy.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientBehaviorDetector
   */
  @VsoMethod
  public BotConfigClientBehavior getClientBehaviorDetector() {
    return clientBehaviorDetector;
  }

  /**
   * This is the setter method to the attribute.
   * The client behavior configuration used in this policy.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientBehaviorDetector set the clientBehaviorDetector.
   */
  @VsoMethod
  public void setClientBehaviorDetector(BotConfigClientBehavior clientBehaviorDetector) {
    this.clientBehaviorDetector = clientBehaviorDetector;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Human-readable description of this bot detection policy.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Human-readable description of this bot detection policy.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The ip location configuration used in this policy.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipLocationDetector
   */
  @VsoMethod
  public BotConfigIPLocation getIpLocationDetector() {
    return ipLocationDetector;
  }

  /**
   * This is the setter method to the attribute.
   * The ip location configuration used in this policy.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipLocationDetector set the ipLocationDetector.
   */
  @VsoMethod
  public void setIpLocationDetector(BotConfigIPLocation ipLocationDetector) {
    this.ipLocationDetector = ipLocationDetector;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The ip reputation configuration used in this policy.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipReputationDetector
   */
  @VsoMethod
  public BotConfigIPReputation getIpReputationDetector() {
    return ipReputationDetector;
  }

  /**
   * This is the setter method to the attribute.
   * The ip reputation configuration used in this policy.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipReputationDetector set the ipReputationDetector.
   */
  @VsoMethod
  public void setIpReputationDetector(BotConfigIPReputation ipReputationDetector) {
    this.ipReputationDetector = ipReputationDetector;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of this bot detection policy.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The name of this bot detection policy.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * System-defined rules for classification.
   * It is a reference to an object of type botmapping.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return systemBotMappingRef
   */
  @VsoMethod
  public String getSystemBotMappingRef() {
    return systemBotMappingRef;
  }

  /**
   * This is the setter method to the attribute.
   * System-defined rules for classification.
   * It is a reference to an object of type botmapping.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param systemBotMappingRef set the systemBotMappingRef.
   */
  @VsoMethod
  public void setSystemBotMappingRef(String  systemBotMappingRef) {
    this.systemBotMappingRef = systemBotMappingRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The installation provides an updated ruleset for consolidating the results of different decider phases.
   * It is a reference to an object of type botconfigconsolidator.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return systemConsolidatorRef
   */
  @VsoMethod
  public String getSystemConsolidatorRef() {
    return systemConsolidatorRef;
  }

  /**
   * This is the setter method to the attribute.
   * The installation provides an updated ruleset for consolidating the results of different decider phases.
   * It is a reference to an object of type botconfigconsolidator.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param systemConsolidatorRef set the systemConsolidatorRef.
   */
  @VsoMethod
  public void setSystemConsolidatorRef(String  systemConsolidatorRef) {
    this.systemConsolidatorRef = systemConsolidatorRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The unique identifier of the tenant to which this policy belongs.
   * It is a reference to an object of type tenant.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * The unique identifier of the tenant to which this policy belongs.
   * It is a reference to an object of type tenant.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
   * The user-agent configuration used in this policy.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userAgentDetector
   */
  @VsoMethod
  public BotConfigUserAgent getUserAgentDetector() {
    return userAgentDetector;
  }

  /**
   * This is the setter method to the attribute.
   * The user-agent configuration used in this policy.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param userAgentDetector set the userAgentDetector.
   */
  @VsoMethod
  public void setUserAgentDetector(BotConfigUserAgent userAgentDetector) {
    this.userAgentDetector = userAgentDetector;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User-defined rules for classification.
   * These are applied before the system classification rules.
   * If a rule matches, processing terminates and the system-defined rules will not run.
   * It is a reference to an object of type botmapping.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userBotMappingRef
   */
  @VsoMethod
  public String getUserBotMappingRef() {
    return userBotMappingRef;
  }

  /**
   * This is the setter method to the attribute.
   * User-defined rules for classification.
   * These are applied before the system classification rules.
   * If a rule matches, processing terminates and the system-defined rules will not run.
   * It is a reference to an object of type botmapping.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param userBotMappingRef set the userBotMappingRef.
   */
  @VsoMethod
  public void setUserBotMappingRef(String  userBotMappingRef) {
    this.userBotMappingRef = userBotMappingRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The user-provided ruleset for consolidating the results of different decider phases.
   * This runs before the system consolidator.
   * If it successfully sets a consolidation, the system consolidator will not change it.
   * It is a reference to an object of type botconfigconsolidator.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userConsolidatorRef
   */
  @VsoMethod
  public String getUserConsolidatorRef() {
    return userConsolidatorRef;
  }

  /**
   * This is the setter method to the attribute.
   * The user-provided ruleset for consolidating the results of different decider phases.
   * This runs before the system consolidator.
   * If it successfully sets a consolidation, the system consolidator will not change it.
   * It is a reference to an object of type botconfigconsolidator.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param userConsolidatorRef set the userConsolidatorRef.
   */
  @VsoMethod
  public void setUserConsolidatorRef(String  userConsolidatorRef) {
    this.userConsolidatorRef = userConsolidatorRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A unique identifier to this bot detection policy.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * A unique identifier to this bot detection policy.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
  BotDetectionPolicy objBotDetectionPolicy = (BotDetectionPolicy) o;
  return   Objects.equals(this.uuid, objBotDetectionPolicy.uuid)&&
  Objects.equals(this.tenantRef, objBotDetectionPolicy.tenantRef)&&
  Objects.equals(this.name, objBotDetectionPolicy.name)&&
  Objects.equals(this.description, objBotDetectionPolicy.description)&&
  Objects.equals(this.allowList, objBotDetectionPolicy.allowList)&&
  Objects.equals(this.ipReputationDetector, objBotDetectionPolicy.ipReputationDetector)&&
  Objects.equals(this.ipLocationDetector, objBotDetectionPolicy.ipLocationDetector)&&
  Objects.equals(this.userAgentDetector, objBotDetectionPolicy.userAgentDetector)&&
  Objects.equals(this.clientBehaviorDetector, objBotDetectionPolicy.clientBehaviorDetector)&&
  Objects.equals(this.userConsolidatorRef, objBotDetectionPolicy.userConsolidatorRef)&&
  Objects.equals(this.systemConsolidatorRef, objBotDetectionPolicy.systemConsolidatorRef)&&
  Objects.equals(this.userBotMappingRef, objBotDetectionPolicy.userBotMappingRef)&&
  Objects.equals(this.systemBotMappingRef, objBotDetectionPolicy.systemBotMappingRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BotDetectionPolicy {\n");
      sb.append("    allowList: ").append(toIndentedString(allowList)).append("\n");
        sb.append("    clientBehaviorDetector: ").append(toIndentedString(clientBehaviorDetector)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipLocationDetector: ").append(toIndentedString(ipLocationDetector)).append("\n");
        sb.append("    ipReputationDetector: ").append(toIndentedString(ipReputationDetector)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    systemBotMappingRef: ").append(toIndentedString(systemBotMappingRef)).append("\n");
        sb.append("    systemConsolidatorRef: ").append(toIndentedString(systemConsolidatorRef)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    userAgentDetector: ").append(toIndentedString(userAgentDetector)).append("\n");
        sb.append("    userBotMappingRef: ").append(toIndentedString(userBotMappingRef)).append("\n");
        sb.append("    userConsolidatorRef: ").append(toIndentedString(userConsolidatorRef)).append("\n");
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

