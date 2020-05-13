package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SnmpV3Configuration;
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
 * SnmpConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SnmpConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_SNMPCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class SnmpConfiguration extends AviRestResource  {
  @JsonProperty("community")
  private String community = null;

  @JsonProperty("large_trap_payload")
  private Boolean largeTrapPayload = null;

  @JsonProperty("snmp_v3_config")
  private SnmpV3Configuration snmpV3Config = null;

  @JsonProperty("sys_contact")
  private String sysContact = "support@avinetworks.com";

  @JsonProperty("sys_location")
  private String sysLocation = null;

  @JsonProperty("version")
  private String version = "SNMP_VER2";

  
  /**
   * Community string for SNMP v2c.
   * @return community
  **/
  @ApiModelProperty(value = "Community string for SNMP v2c.")


 
  @VsoMethod  
  public String getCommunity() {
    return community;
  }
    
  @VsoMethod
  public void setCommunity(String community) {
    this.community = community;
  }

  
  /**
   * Support for 4096 bytes trap payload. Field introduced in 17.2.13,18.1.4,18.2.1.
   * @return largeTrapPayload
  **/
  @ApiModelProperty(value = "Support for 4096 bytes trap payload. Field introduced in 17.2.13,18.1.4,18.2.1.")


 
  @VsoMethod  
  public Boolean isLargeTrapPayload() {
    return largeTrapPayload;
  }
    
  @VsoMethod
  public void setLargeTrapPayload(Boolean largeTrapPayload) {
    this.largeTrapPayload = largeTrapPayload;
  }

  
  /**
   * SNMP version 3 configuration. Field introduced in 17.2.3.
   * @return snmpV3Config
  **/
  @ApiModelProperty(value = "SNMP version 3 configuration. Field introduced in 17.2.3.")

  @Valid

 
  @VsoMethod  
  public SnmpV3Configuration getSnmpV3Config() {
    return snmpV3Config;
  }
    
  @VsoMethod
  public void setSnmpV3Config(SnmpV3Configuration snmpV3Config) {
    this.snmpV3Config = snmpV3Config;
  }

  
  /**
   * Sets the sysContact in system MIB.
   * @return sysContact
  **/
  @ApiModelProperty(value = "Sets the sysContact in system MIB.")


 
  @VsoMethod  
  public String getSysContact() {
    return sysContact;
  }
    
  @VsoMethod
  public void setSysContact(String sysContact) {
    this.sysContact = sysContact;
  }

  
  /**
   * Sets the sysLocation in system MIB.
   * @return sysLocation
  **/
  @ApiModelProperty(value = "Sets the sysLocation in system MIB.")


 
  @VsoMethod  
  public String getSysLocation() {
    return sysLocation;
  }
    
  @VsoMethod
  public void setSysLocation(String sysLocation) {
    this.sysLocation = sysLocation;
  }

  
  /**
   * SNMP version support. V2 or V3. Enum options - SNMP_VER2, SNMP_VER3. Field introduced in 17.2.3.
   * @return version
  **/
  @ApiModelProperty(value = "SNMP version support. V2 or V3. Enum options - SNMP_VER2, SNMP_VER3. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getVersion() {
    return version;
  }
    
  @VsoMethod
  public void setVersion(String version) {
    this.version = version;
  }

  
  public String getObjectID() {
		return "SnmpConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnmpConfiguration snmpConfiguration = (SnmpConfiguration) o;
    return Objects.equals(this.community, snmpConfiguration.community) &&
        Objects.equals(this.largeTrapPayload, snmpConfiguration.largeTrapPayload) &&
        Objects.equals(this.snmpV3Config, snmpConfiguration.snmpV3Config) &&
        Objects.equals(this.sysContact, snmpConfiguration.sysContact) &&
        Objects.equals(this.sysLocation, snmpConfiguration.sysLocation) &&
        Objects.equals(this.version, snmpConfiguration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(community, largeTrapPayload, snmpV3Config, sysContact, sysLocation, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnmpConfiguration {\n");
    
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    largeTrapPayload: ").append(toIndentedString(largeTrapPayload)).append("\n");
    sb.append("    snmpV3Config: ").append(toIndentedString(snmpV3Config)).append("\n");
    sb.append("    sysContact: ").append(toIndentedString(sysContact)).append("\n");
    sb.append("    sysLocation: ").append(toIndentedString(sysLocation)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

