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
 * The ActionGroupConfig is a POJO class extends AviRestResource that used for creating
 * ActionGroupConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ActionGroupConfig")
@VsoFinder(name = Constants.FINDER_VRO_ACTIONGROUPCONFIG, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ActionGroupConfig extends AviRestResource {
  @JsonProperty("action_script_config_ref")
  @JsonInclude(Include.NON_NULL)
  private String actionScriptConfigRef = null;

  @JsonProperty("autoscale_trigger_notification")
  @JsonInclude(Include.NON_NULL)
  private Boolean autoscaleTriggerNotification = false;

  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("email_config_ref")
  @JsonInclude(Include.NON_NULL)
  private String emailConfigRef = null;

  @JsonProperty("external_only")
  @JsonInclude(Include.NON_NULL)
  private Boolean externalOnly = false;

  @JsonProperty("level")
  @JsonInclude(Include.NON_NULL)
  private String level = "ALERT_LOW";

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("snmp_trap_profile_ref")
  @JsonInclude(Include.NON_NULL)
  private String snmpTrapProfileRef = null;

  @JsonProperty("syslog_config_ref")
  @JsonInclude(Include.NON_NULL)
  private String syslogConfigRef = null;

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
   * Reference of the action script configuration to be used.
   * It is a reference to an object of type alertscriptconfig.
   * @return actionScriptConfigRef
   */
  @VsoMethod
  public String getActionScriptConfigRef() {
    return actionScriptConfigRef;
  }

  /**
   * This is the setter method to the attribute.
   * Reference of the action script configuration to be used.
   * It is a reference to an object of type alertscriptconfig.
   * @param actionScriptConfigRef set the actionScriptConfigRef.
   */
  @VsoMethod
  public void setActionScriptConfigRef(String  actionScriptConfigRef) {
    this.actionScriptConfigRef = actionScriptConfigRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Trigger notification to autoscale manager.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return autoscaleTriggerNotification
   */
  @VsoMethod
  public Boolean getAutoscaleTriggerNotification() {
    return autoscaleTriggerNotification;
  }

  /**
   * This is the setter method to the attribute.
   * Trigger notification to autoscale manager.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param autoscaleTriggerNotification set the autoscaleTriggerNotification.
   */
  @VsoMethod
  public void setAutoscaleTriggerNotification(Boolean  autoscaleTriggerNotification) {
    this.autoscaleTriggerNotification = autoscaleTriggerNotification;
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
   * Select the email notification configuration to use when sending alerts via email.
   * It is a reference to an object of type alertemailconfig.
   * @return emailConfigRef
   */
  @VsoMethod
  public String getEmailConfigRef() {
    return emailConfigRef;
  }

  /**
   * This is the setter method to the attribute.
   * Select the email notification configuration to use when sending alerts via email.
   * It is a reference to an object of type alertemailconfig.
   * @param emailConfigRef set the emailConfigRef.
   */
  @VsoMethod
  public void setEmailConfigRef(String  emailConfigRef) {
    this.emailConfigRef = emailConfigRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Generate alert only to external destinations.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return externalOnly
   */
  @VsoMethod
  public Boolean getExternalOnly() {
    return externalOnly;
  }

  /**
   * This is the setter method to the attribute.
   * Generate alert only to external destinations.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param externalOnly set the externalOnly.
   */
  @VsoMethod
  public void setExternalOnly(Boolean  externalOnly) {
    this.externalOnly = externalOnly;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When an alert is generated, mark its priority via the alert level.
   * Enum options - ALERT_LOW, ALERT_MEDIUM, ALERT_HIGH.
   * Default value when not specified in API or module is interpreted by Avi Controller as ALERT_LOW.
   * @return level
   */
  @VsoMethod
  public String getLevel() {
    return level;
  }

  /**
   * This is the setter method to the attribute.
   * When an alert is generated, mark its priority via the alert level.
   * Enum options - ALERT_LOW, ALERT_MEDIUM, ALERT_HIGH.
   * Default value when not specified in API or module is interpreted by Avi Controller as ALERT_LOW.
   * @param level set the level.
   */
  @VsoMethod
  public void setLevel(String  level) {
    this.level = level;
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
   * Select the snmp trap notification to use when sending alerts via snmp trap.
   * It is a reference to an object of type snmptrapprofile.
   * @return snmpTrapProfileRef
   */
  @VsoMethod
  public String getSnmpTrapProfileRef() {
    return snmpTrapProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Select the snmp trap notification to use when sending alerts via snmp trap.
   * It is a reference to an object of type snmptrapprofile.
   * @param snmpTrapProfileRef set the snmpTrapProfileRef.
   */
  @VsoMethod
  public void setSnmpTrapProfileRef(String  snmpTrapProfileRef) {
    this.snmpTrapProfileRef = snmpTrapProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select the syslog notification configuration to use when sending alerts via syslog.
   * It is a reference to an object of type alertsyslogconfig.
   * @return syslogConfigRef
   */
  @VsoMethod
  public String getSyslogConfigRef() {
    return syslogConfigRef;
  }

  /**
   * This is the setter method to the attribute.
   * Select the syslog notification configuration to use when sending alerts via syslog.
   * It is a reference to an object of type alertsyslogconfig.
   * @param syslogConfigRef set the syslogConfigRef.
   */
  @VsoMethod
  public void setSyslogConfigRef(String  syslogConfigRef) {
    this.syslogConfigRef = syslogConfigRef;
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
  ActionGroupConfig objActionGroupConfig = (ActionGroupConfig) o;
  return   Objects.equals(this.actionScriptConfigRef, objActionGroupConfig.actionScriptConfigRef)&&
  Objects.equals(this.autoscaleTriggerNotification, objActionGroupConfig.autoscaleTriggerNotification)&&
  Objects.equals(this.uuid, objActionGroupConfig.uuid)&&
  Objects.equals(this.level, objActionGroupConfig.level)&&
  Objects.equals(this.description, objActionGroupConfig.description)&&
  Objects.equals(this.snmpTrapProfileRef, objActionGroupConfig.snmpTrapProfileRef)&&
  Objects.equals(this.externalOnly, objActionGroupConfig.externalOnly)&&
  Objects.equals(this.syslogConfigRef, objActionGroupConfig.syslogConfigRef)&&
  Objects.equals(this.emailConfigRef, objActionGroupConfig.emailConfigRef)&&
  Objects.equals(this.tenantRef, objActionGroupConfig.tenantRef)&&
  Objects.equals(this.name, objActionGroupConfig.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ActionGroupConfig {\n");
      sb.append("    actionScriptConfigRef: ").append(toIndentedString(actionScriptConfigRef)).append("\n");
        sb.append("    autoscaleTriggerNotification: ").append(toIndentedString(autoscaleTriggerNotification)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    emailConfigRef: ").append(toIndentedString(emailConfigRef)).append("\n");
        sb.append("    externalOnly: ").append(toIndentedString(externalOnly)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    snmpTrapProfileRef: ").append(toIndentedString(snmpTrapProfileRef)).append("\n");
        sb.append("    syslogConfigRef: ").append(toIndentedString(syslogConfigRef)).append("\n");
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
