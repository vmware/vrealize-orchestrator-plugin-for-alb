package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AttackMitigationAction;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsAttack is a POJO class extends AviRestResource that used for creating
 * DnsAttack.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsAttack")
@VsoFinder(name = Constants.FINDER_VRO_DNSATTACK)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsAttack extends AviRestResource {
  @JsonProperty("attack_vector")
  @JsonInclude(Include.NON_NULL)
  private String attackVector = null;

  @JsonProperty("enabled")
  @JsonInclude(Include.NON_NULL)
  private Boolean enabled = true;

  @JsonProperty("max_mitigation_age")
  @JsonInclude(Include.NON_NULL)
  private Integer maxMitigationAge = 60;

  @JsonProperty("mitigation_action")
  @JsonInclude(Include.NON_NULL)
  private AttackMitigationAction mitigationAction = null;

  @JsonProperty("threshold")
  @JsonInclude(Include.NON_NULL)
  private Integer threshold = null;



  /**
   * This is the getter method this will return the attribute value.
   * The dns attack vector.
   * Enum options - DNS_REFLECTION, DNS_NXDOMAIN, DNS_AMPLIFICATION_EGRESS.
   * Field introduced in 18.2.1.
   * @return attackVector
   */
  @VsoMethod
  public String getAttackVector() {
    return attackVector;
  }

  /**
   * This is the setter method to the attribute.
   * The dns attack vector.
   * Enum options - DNS_REFLECTION, DNS_NXDOMAIN, DNS_AMPLIFICATION_EGRESS.
   * Field introduced in 18.2.1.
   * @param attackVector set the attackVector.
   */
  @VsoMethod
  public void setAttackVector(String  attackVector) {
    this.attackVector = attackVector;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable the mitigation of the attack vector.
   * Field introduced in 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or disable the mitigation of the attack vector.
   * Field introduced in 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time in minutes after which mitigation will be deactivated.
   * Allowed values are 1-4294967295.
   * Special values are 0- 'blocked for ever'.
   * Field introduced in 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return maxMitigationAge
   */
  @VsoMethod
  public Integer getMaxMitigationAge() {
    return maxMitigationAge;
  }

  /**
   * This is the setter method to the attribute.
   * Time in minutes after which mitigation will be deactivated.
   * Allowed values are 1-4294967295.
   * Special values are 0- 'blocked for ever'.
   * Field introduced in 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param maxMitigationAge set the maxMitigationAge.
   */
  @VsoMethod
  public void setMaxMitigationAge(Integer  maxMitigationAge) {
    this.maxMitigationAge = maxMitigationAge;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mitigation action to perform for this dns attack vector.
   * Field introduced in 18.2.1.
   * @return mitigationAction
   */
  @VsoMethod
  public AttackMitigationAction getMitigationAction() {
    return mitigationAction;
  }

  /**
   * This is the setter method to the attribute.
   * Mitigation action to perform for this dns attack vector.
   * Field introduced in 18.2.1.
   * @param mitigationAction set the mitigationAction.
   */
  @VsoMethod
  public void setMitigationAction(AttackMitigationAction mitigationAction) {
    this.mitigationAction = mitigationAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Threshold, in terms of dns packet per second, for the dns attack vector.
   * Field introduced in 18.2.3.
   * @return threshold
   */
  @VsoMethod
  public Integer getThreshold() {
    return threshold;
  }

  /**
   * This is the setter method to the attribute.
   * Threshold, in terms of dns packet per second, for the dns attack vector.
   * Field introduced in 18.2.3.
   * @param threshold set the threshold.
   */
  @VsoMethod
  public void setThreshold(Integer  threshold) {
    this.threshold = threshold;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsAttack objDnsAttack = (DnsAttack) o;
  return   Objects.equals(this.threshold, objDnsAttack.threshold)&&
  Objects.equals(this.maxMitigationAge, objDnsAttack.maxMitigationAge)&&
  Objects.equals(this.mitigationAction, objDnsAttack.mitigationAction)&&
  Objects.equals(this.enabled, objDnsAttack.enabled)&&
  Objects.equals(this.attackVector, objDnsAttack.attackVector);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsAttack {\n");
      sb.append("    attackVector: ").append(toIndentedString(attackVector)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    maxMitigationAge: ").append(toIndentedString(maxMitigationAge)).append("\n");
        sb.append("    mitigationAction: ").append(toIndentedString(mitigationAction)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
