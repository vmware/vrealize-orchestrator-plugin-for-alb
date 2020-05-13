package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AlertSyslogServer;
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
 * AlertSyslogConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AlertSyslogConfig")
@VsoFinder(name = Constants.FINDER_VRO_ALERTSYSLOGCONFIG, idAccessor = "getObjectID()")
@Service
public class AlertSyslogConfig extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("syslog_servers")
  @Valid
  private List<AlertSyslogServer> syslogServers = null;

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
   * User defined description for alert syslog config.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for alert syslog config.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * A user-friendly name of the syslog notification.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A user-friendly name of the syslog notification.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public AlertSyslogConfig addSyslogServersItem(AlertSyslogServer syslogServersItem) {
    if (this.syslogServers == null) {
      this.syslogServers = new ArrayList<AlertSyslogServer>();
    }
    this.syslogServers.add(syslogServersItem);
    return this;
  }
  
  /**
   * The list of syslog servers.
   * @return syslogServers
  **/
  @ApiModelProperty(value = "The list of syslog servers.")

  @Valid

 
  @VsoMethod  
  public List<AlertSyslogServer> getSyslogServers() {
    return syslogServers;
  }
    
  @VsoMethod
  public void setSyslogServers(List<AlertSyslogServer> syslogServers) {
    this.syslogServers = syslogServers;
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
		return "AlertSyslogConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertSyslogConfig alertSyslogConfig = (AlertSyslogConfig) o;
    return Objects.equals(this.lastModified, alertSyslogConfig.lastModified) &&
        Objects.equals(this.description, alertSyslogConfig.description) &&
        Objects.equals(this.name, alertSyslogConfig.name) &&
        Objects.equals(this.syslogServers, alertSyslogConfig.syslogServers) &&
        Objects.equals(this.tenantRef, alertSyslogConfig.tenantRef) &&
        Objects.equals(this.url, alertSyslogConfig.url) &&
        Objects.equals(this.uuid, alertSyslogConfig.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, description, name, syslogServers, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertSyslogConfig {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    syslogServers: ").append(toIndentedString(syslogServers)).append("\n");
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

