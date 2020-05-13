package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AttackMitigationAction;
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
 * DnsAttack
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsAttack")
@VsoFinder(name = Constants.FINDER_VRO_DNSATTACK, idAccessor = "getObjectID()")
@Service
public class DnsAttack extends AviRestResource  {
  @JsonProperty("attack_vector")
  private String attackVector = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("max_mitigation_age")
  private Integer maxMitigationAge = 60;

  @JsonProperty("mitigation_action")
  private AttackMitigationAction mitigationAction = null;

  @JsonProperty("threshold")
  private Long threshold = null;

  
  /**
   * The DNS attack vector. Enum options - DNS_REFLECTION, DNS_NXDOMAIN, DNS_AMPLIFICATION_EGRESS. Field introduced in 18.2.1.
   * @return attackVector
  **/
  @ApiModelProperty(required = true, value = "The DNS attack vector. Enum options - DNS_REFLECTION, DNS_NXDOMAIN, DNS_AMPLIFICATION_EGRESS. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getAttackVector() {
    return attackVector;
  }
    
  @VsoMethod
  public void setAttackVector(String attackVector) {
    this.attackVector = attackVector;
  }

  
  /**
   * Enable or disable the mitigation of the attack vector. Field introduced in 18.2.1.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable or disable the mitigation of the attack vector. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Time in minutes after which mitigation will be deactivated. Allowed values are 1-4294967295. Special values are 0- 'blocked for ever'. Field introduced in 18.2.1.
   * @return maxMitigationAge
  **/
  @ApiModelProperty(value = "Time in minutes after which mitigation will be deactivated. Allowed values are 1-4294967295. Special values are 0- 'blocked for ever'. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public Integer getMaxMitigationAge() {
    return maxMitigationAge;
  }
    
  @VsoMethod
  public void setMaxMitigationAge(Integer maxMitigationAge) {
    this.maxMitigationAge = maxMitigationAge;
  }

  
  /**
   * Mitigation action to perform for this DNS attack vector. Field introduced in 18.2.1.
   * @return mitigationAction
  **/
  @ApiModelProperty(value = "Mitigation action to perform for this DNS attack vector. Field introduced in 18.2.1.")

  @Valid

 
  @VsoMethod  
  public AttackMitigationAction getMitigationAction() {
    return mitigationAction;
  }
    
  @VsoMethod
  public void setMitigationAction(AttackMitigationAction mitigationAction) {
    this.mitigationAction = mitigationAction;
  }

  
  /**
   * Threshold, in terms of DNS packet per second, for the DNS attack vector. Field introduced in 18.2.3.
   * @return threshold
  **/
  @ApiModelProperty(value = "Threshold, in terms of DNS packet per second, for the DNS attack vector. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Long getThreshold() {
    return threshold;
  }
    
  @VsoMethod
  public void setThreshold(Long threshold) {
    this.threshold = threshold;
  }

  
  public String getObjectID() {
		return "DnsAttack";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsAttack dnsAttack = (DnsAttack) o;
    return Objects.equals(this.attackVector, dnsAttack.attackVector) &&
        Objects.equals(this.enabled, dnsAttack.enabled) &&
        Objects.equals(this.maxMitigationAge, dnsAttack.maxMitigationAge) &&
        Objects.equals(this.mitigationAction, dnsAttack.mitigationAction) &&
        Objects.equals(this.threshold, dnsAttack.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attackVector, enabled, maxMitigationAge, mitigationAction, threshold);
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

