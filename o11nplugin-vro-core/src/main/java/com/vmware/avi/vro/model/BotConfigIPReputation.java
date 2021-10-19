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
 * The BotConfigIPReputation is a POJO class extends AviRestResource that used for creating
 * BotConfigIPReputation.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BotConfigIPReputation")
@VsoFinder(name = Constants.FINDER_VRO_BOTCONFIGIPREPUTATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BotConfigIPReputation extends AviRestResource {
    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = true;

    @JsonProperty("ip_reputation_db_ref")
    @JsonInclude(Include.NON_NULL)
    private String ipReputationDbRef = null;

    @JsonProperty("system_ip_reputation_mapping_ref")
    @JsonInclude(Include.NON_NULL)
    private String systemIpReputationMappingRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Whether ip reputation-based bot detection is enabled.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Whether ip reputation-based bot detection is enabled.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The uuid of the ip reputation db to use.
   * It is a reference to an object of type ipreputationdb.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipReputationDbRef
   */
  @VsoMethod
  public String getIpReputationDbRef() {
    return ipReputationDbRef;
  }

  /**
   * This is the setter method to the attribute.
   * The uuid of the ip reputation db to use.
   * It is a reference to an object of type ipreputationdb.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipReputationDbRef set the ipReputationDbRef.
   */
  @VsoMethod
  public void setIpReputationDbRef(String  ipReputationDbRef) {
    this.ipReputationDbRef = ipReputationDbRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The system-provided mapping from ip reputation types to bot types.
   * It is a reference to an object of type botipreputationtypemapping.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return systemIpReputationMappingRef
   */
  @VsoMethod
  public String getSystemIpReputationMappingRef() {
    return systemIpReputationMappingRef;
  }

  /**
   * This is the setter method to the attribute.
   * The system-provided mapping from ip reputation types to bot types.
   * It is a reference to an object of type botipreputationtypemapping.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param systemIpReputationMappingRef set the systemIpReputationMappingRef.
   */
  @VsoMethod
  public void setSystemIpReputationMappingRef(String  systemIpReputationMappingRef) {
    this.systemIpReputationMappingRef = systemIpReputationMappingRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BotConfigIPReputation objBotConfigIPReputation = (BotConfigIPReputation) o;
  return   Objects.equals(this.enabled, objBotConfigIPReputation.enabled)&&
  Objects.equals(this.ipReputationDbRef, objBotConfigIPReputation.ipReputationDbRef)&&
  Objects.equals(this.systemIpReputationMappingRef, objBotConfigIPReputation.systemIpReputationMappingRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BotConfigIPReputation {\n");
      sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    ipReputationDbRef: ").append(toIndentedString(ipReputationDbRef)).append("\n");
        sb.append("    systemIpReputationMappingRef: ").append(toIndentedString(systemIpReputationMappingRef)).append("\n");
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

