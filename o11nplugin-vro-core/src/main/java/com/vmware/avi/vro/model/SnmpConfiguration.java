package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SnmpV3Configuration;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SnmpConfiguration is a POJO class extends AviRestResource that used for creating
 * SnmpConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SnmpConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_SNMPCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SnmpConfiguration extends AviRestResource {
    @JsonProperty("community")
    @JsonInclude(Include.NON_NULL)
    private String community = null;

    @JsonProperty("large_trap_payload")
    @JsonInclude(Include.NON_NULL)
    private Boolean largeTrapPayload = false;

    @JsonProperty("snmp_v3_config")
    @JsonInclude(Include.NON_NULL)
    private SnmpV3Configuration snmpV3Config = null;

    @JsonProperty("sys_contact")
    @JsonInclude(Include.NON_NULL)
    private String sysContact = "support@avinetworks.com";

    @JsonProperty("sys_location")
    @JsonInclude(Include.NON_NULL)
    private String sysLocation = null;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version = "SNMP_VER2";



  /**
   * This is the getter method this will return the attribute value.
   * Community string for snmp v2c.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return community
   */
  @VsoMethod
  public String getCommunity() {
    return community;
  }

  /**
   * This is the setter method to the attribute.
   * Community string for snmp v2c.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param community set the community.
   */
  @VsoMethod
  public void setCommunity(String  community) {
    this.community = community;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Support for 4096 bytes trap payload.
   * Field introduced in 17.2.13,18.1.4,18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return largeTrapPayload
   */
  @VsoMethod
  public Boolean getLargeTrapPayload() {
    return largeTrapPayload;
  }

  /**
   * This is the setter method to the attribute.
   * Support for 4096 bytes trap payload.
   * Field introduced in 17.2.13,18.1.4,18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param largeTrapPayload set the largeTrapPayload.
   */
  @VsoMethod
  public void setLargeTrapPayload(Boolean  largeTrapPayload) {
    this.largeTrapPayload = largeTrapPayload;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Snmp version 3 configuration.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return snmpV3Config
   */
  @VsoMethod
  public SnmpV3Configuration getSnmpV3Config() {
    return snmpV3Config;
  }

  /**
   * This is the setter method to the attribute.
   * Snmp version 3 configuration.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param snmpV3Config set the snmpV3Config.
   */
  @VsoMethod
  public void setSnmpV3Config(SnmpV3Configuration snmpV3Config) {
    this.snmpV3Config = snmpV3Config;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sets the syscontact in system mib.
   * Default value when not specified in API or module is interpreted by Avi Controller as "support@avinetworks.com".
   * @return sysContact
   */
  @VsoMethod
  public String getSysContact() {
    return sysContact;
  }

  /**
   * This is the setter method to the attribute.
   * Sets the syscontact in system mib.
   * Default value when not specified in API or module is interpreted by Avi Controller as "support@avinetworks.com".
   * @param sysContact set the sysContact.
   */
  @VsoMethod
  public void setSysContact(String  sysContact) {
    this.sysContact = sysContact;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sets the syslocation in system mib.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sysLocation
   */
  @VsoMethod
  public String getSysLocation() {
    return sysLocation;
  }

  /**
   * This is the setter method to the attribute.
   * Sets the syslocation in system mib.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sysLocation set the sysLocation.
   */
  @VsoMethod
  public void setSysLocation(String  sysLocation) {
    this.sysLocation = sysLocation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Snmp version support.
   * V2 or v3.
   * Enum options - SNMP_VER2, SNMP_VER3.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SNMP_VER2".
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Snmp version support.
   * V2 or v3.
   * Enum options - SNMP_VER2, SNMP_VER3.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SNMP_VER2".
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SnmpConfiguration objSnmpConfiguration = (SnmpConfiguration) o;
  return   Objects.equals(this.community, objSnmpConfiguration.community)&&
  Objects.equals(this.sysLocation, objSnmpConfiguration.sysLocation)&&
  Objects.equals(this.sysContact, objSnmpConfiguration.sysContact)&&
  Objects.equals(this.version, objSnmpConfiguration.version)&&
  Objects.equals(this.snmpV3Config, objSnmpConfiguration.snmpV3Config)&&
  Objects.equals(this.largeTrapPayload, objSnmpConfiguration.largeTrapPayload);
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

