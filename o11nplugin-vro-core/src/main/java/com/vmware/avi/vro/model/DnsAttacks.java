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
 * The DnsAttacks is a POJO class extends AviRestResource that used for creating
 * DnsAttacks.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsAttacks")
@VsoFinder(name = Constants.FINDER_VRO_DNSATTACKS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsAttacks extends AviRestResource {
  @JsonProperty("attacks")
  @JsonInclude(Include.NON_NULL)
  private List<DnsAttack> attacks = null;

  @JsonProperty("oper_mode")
  @JsonInclude(Include.NON_NULL)
  private String operMode = null;



  /**
   * This is the getter method this will return the attribute value.
   * Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks.
   * Field introduced in 18.2.1.
   * @return attacks
   */
  @VsoMethod
  public List<DnsAttack> getAttacks() {
    return attacks;
  }

  /**
   * This is the setter method. this will set the attacks
   * Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks.
   * Field introduced in 18.2.1.
   * @return attacks
   */
  @VsoMethod
  public void setAttacks(List<DnsAttack>  attacks) {
    this.attacks = attacks;
  }

  /**
   * This is the setter method this will set the attacks
   * Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks.
   * Field introduced in 18.2.1.
   * @return attacks
   */
  @VsoMethod
  public DnsAttacks addAttacksItem(DnsAttack attacksItem) {
    if (this.attacks == null) {
      this.attacks = new ArrayList<DnsAttack>();
    }
    this.attacks.add(attacksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks.
   * Enum options - DETECTION, MITIGATION.
   * Field introduced in 18.2.1.
   * @return operMode
   */
  @VsoMethod
  public String getOperMode() {
    return operMode;
  }

  /**
   * This is the setter method to the attribute.
   * Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks.
   * Enum options - DETECTION, MITIGATION.
   * Field introduced in 18.2.1.
   * @param operMode set the operMode.
   */
  @VsoMethod
  public void setOperMode(String  operMode) {
    this.operMode = operMode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsAttacks objDnsAttacks = (DnsAttacks) o;
  return   Objects.equals(this.attacks, objDnsAttacks.attacks)&&
  Objects.equals(this.operMode, objDnsAttacks.operMode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsAttacks {\n");
      sb.append("    attacks: ").append(toIndentedString(attacks)).append("\n");
        sb.append("    operMode: ").append(toIndentedString(operMode)).append("\n");
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

