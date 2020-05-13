package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SnmpTrapServer;
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
 * SnmpTrapProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SnmpTrapProfile")
@VsoFinder(name = Constants.FINDER_VRO_SNMPTRAPPROFILE, idAccessor = "getObjectID()")
@Service
public class SnmpTrapProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("trap_servers")
  @Valid
  private List<SnmpTrapServer> trapServers = null;

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
   * A user-friendly name of the SNMP trap configuration.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A user-friendly name of the SNMP trap configuration.")
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

  
  public SnmpTrapProfile addTrapServersItem(SnmpTrapServer trapServersItem) {
    if (this.trapServers == null) {
      this.trapServers = new ArrayList<SnmpTrapServer>();
    }
    this.trapServers.add(trapServersItem);
    return this;
  }
  
  /**
   * The IP address or hostname of the SNMP trap destination server.
   * @return trapServers
  **/
  @ApiModelProperty(value = "The IP address or hostname of the SNMP trap destination server.")

  @Valid

 
  @VsoMethod  
  public List<SnmpTrapServer> getTrapServers() {
    return trapServers;
  }
    
  @VsoMethod
  public void setTrapServers(List<SnmpTrapServer> trapServers) {
    this.trapServers = trapServers;
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
   * UUID of the SNMP trap profile object.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the SNMP trap profile object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "SnmpTrapProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnmpTrapProfile snmpTrapProfile = (SnmpTrapProfile) o;
    return Objects.equals(this.lastModified, snmpTrapProfile.lastModified) &&
        Objects.equals(this.name, snmpTrapProfile.name) &&
        Objects.equals(this.tenantRef, snmpTrapProfile.tenantRef) &&
        Objects.equals(this.trapServers, snmpTrapProfile.trapServers) &&
        Objects.equals(this.url, snmpTrapProfile.url) &&
        Objects.equals(this.uuid, snmpTrapProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, name, tenantRef, trapServers, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnmpTrapProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    trapServers: ").append(toIndentedString(trapServers)).append("\n");
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

