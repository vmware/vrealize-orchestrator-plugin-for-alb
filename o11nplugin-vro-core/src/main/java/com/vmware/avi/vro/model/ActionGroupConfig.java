package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * ActionGroupConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ActionGroupConfig")
@VsoFinder(name = Constants.FINDER_VRO_ACTIONGROUPCONFIG, idAccessor = "getObjectID()")
@Service
public class ActionGroupConfig extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("action_script_config_ref")
  private String actionScriptConfigRef = null;

  @JsonProperty("autoscale_trigger_notification")
  private Boolean autoscaleTriggerNotification = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("email_config_ref")
  private String emailConfigRef = null;

  @JsonProperty("external_only")
  private Boolean externalOnly = null;

  @JsonProperty("level")
  private String level = "ALERT_LOW";

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("snmp_trap_profile_ref")
  private String snmpTrapProfileRef = null;

  @JsonProperty("syslog_config_ref")
  private String syslogConfigRef = null;

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
   * reference of the action script configuration to be used. It is a reference to an object of type AlertScriptConfig.
   * @return actionScriptConfigRef
  **/
  @ApiModelProperty(value = "reference of the action script configuration to be used. It is a reference to an object of type AlertScriptConfig.")


 
  @VsoMethod  
  public String getActionScriptConfigRef() {
    return actionScriptConfigRef;
  }
    
  @VsoMethod
  public void setActionScriptConfigRef(String actionScriptConfigRef) {
    this.actionScriptConfigRef = actionScriptConfigRef;
  }

  
  /**
   * Trigger Notification to AutoScale Manager.
   * @return autoscaleTriggerNotification
  **/
  @ApiModelProperty(value = "Trigger Notification to AutoScale Manager.")


 
  @VsoMethod  
  public Boolean isAutoscaleTriggerNotification() {
    return autoscaleTriggerNotification;
  }
    
  @VsoMethod
  public void setAutoscaleTriggerNotification(Boolean autoscaleTriggerNotification) {
    this.autoscaleTriggerNotification = autoscaleTriggerNotification;
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
   * Select the Email Notification configuration to use when sending alerts via email. It is a reference to an object of type AlertEmailConfig.
   * @return emailConfigRef
  **/
  @ApiModelProperty(value = "Select the Email Notification configuration to use when sending alerts via email. It is a reference to an object of type AlertEmailConfig.")


 
  @VsoMethod  
  public String getEmailConfigRef() {
    return emailConfigRef;
  }
    
  @VsoMethod
  public void setEmailConfigRef(String emailConfigRef) {
    this.emailConfigRef = emailConfigRef;
  }

  
  /**
   * Generate Alert only to external destinations.
   * @return externalOnly
  **/
  @ApiModelProperty(required = true, value = "Generate Alert only to external destinations.")
  @NotNull


 
  @VsoMethod  
  public Boolean isExternalOnly() {
    return externalOnly;
  }
    
  @VsoMethod
  public void setExternalOnly(Boolean externalOnly) {
    this.externalOnly = externalOnly;
  }

  
  /**
   * When an alert is generated, mark its priority via the Alert Level. Enum options - ALERT_LOW, ALERT_MEDIUM, ALERT_HIGH.
   * @return level
  **/
  @ApiModelProperty(required = true, value = "When an alert is generated, mark its priority via the Alert Level. Enum options - ALERT_LOW, ALERT_MEDIUM, ALERT_HIGH.")
  @NotNull


 
  @VsoMethod  
  public String getLevel() {
    return level;
  }
    
  @VsoMethod
  public void setLevel(String level) {
    this.level = level;
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
   * Select the SNMP Trap Notification to use when sending alerts via SNMP Trap. It is a reference to an object of type SnmpTrapProfile.
   * @return snmpTrapProfileRef
  **/
  @ApiModelProperty(value = "Select the SNMP Trap Notification to use when sending alerts via SNMP Trap. It is a reference to an object of type SnmpTrapProfile.")


 
  @VsoMethod  
  public String getSnmpTrapProfileRef() {
    return snmpTrapProfileRef;
  }
    
  @VsoMethod
  public void setSnmpTrapProfileRef(String snmpTrapProfileRef) {
    this.snmpTrapProfileRef = snmpTrapProfileRef;
  }

  
  /**
   * Select the Syslog Notification configuration to use when sending alerts via Syslog. It is a reference to an object of type AlertSyslogConfig.
   * @return syslogConfigRef
  **/
  @ApiModelProperty(value = "Select the Syslog Notification configuration to use when sending alerts via Syslog. It is a reference to an object of type AlertSyslogConfig.")


 
  @VsoMethod  
  public String getSyslogConfigRef() {
    return syslogConfigRef;
  }
    
  @VsoMethod
  public void setSyslogConfigRef(String syslogConfigRef) {
    this.syslogConfigRef = syslogConfigRef;
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
		return "ActionGroupConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionGroupConfig actionGroupConfig = (ActionGroupConfig) o;
    return Objects.equals(this.lastModified, actionGroupConfig.lastModified) &&
        Objects.equals(this.actionScriptConfigRef, actionGroupConfig.actionScriptConfigRef) &&
        Objects.equals(this.autoscaleTriggerNotification, actionGroupConfig.autoscaleTriggerNotification) &&
        Objects.equals(this.description, actionGroupConfig.description) &&
        Objects.equals(this.emailConfigRef, actionGroupConfig.emailConfigRef) &&
        Objects.equals(this.externalOnly, actionGroupConfig.externalOnly) &&
        Objects.equals(this.level, actionGroupConfig.level) &&
        Objects.equals(this.name, actionGroupConfig.name) &&
        Objects.equals(this.snmpTrapProfileRef, actionGroupConfig.snmpTrapProfileRef) &&
        Objects.equals(this.syslogConfigRef, actionGroupConfig.syslogConfigRef) &&
        Objects.equals(this.tenantRef, actionGroupConfig.tenantRef) &&
        Objects.equals(this.url, actionGroupConfig.url) &&
        Objects.equals(this.uuid, actionGroupConfig.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, actionScriptConfigRef, autoscaleTriggerNotification, description, emailConfigRef, externalOnly, level, name, snmpTrapProfileRef, syslogConfigRef, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionGroupConfig {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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

