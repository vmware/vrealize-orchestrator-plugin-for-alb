package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsAttack;
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
 * DnsAttacks
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsAttacks")
@VsoFinder(name = Constants.FINDER_VRO_DNSATTACKS, idAccessor = "getObjectID()")
@Service
public class DnsAttacks extends AviRestResource  {
  @JsonProperty("attacks")
  @Valid
  private List<DnsAttack> attacks = null;

  @JsonProperty("oper_mode")
  private String operMode = null;

  
  public DnsAttacks addAttacksItem(DnsAttack attacksItem) {
    if (this.attacks == null) {
      this.attacks = new ArrayList<DnsAttack>();
    }
    this.attacks.add(attacksItem);
    return this;
  }
  
  /**
   * Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks. Field introduced in 18.2.1.
   * @return attacks
  **/
  @ApiModelProperty(value = "Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks. Field introduced in 18.2.1.")

  @Valid

 
  @VsoMethod  
  public List<DnsAttack> getAttacks() {
    return attacks;
  }
    
  @VsoMethod
  public void setAttacks(List<DnsAttack> attacks) {
    this.attacks = attacks;
  }

  
  /**
   * Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks. Enum options - DETECTION, MITIGATION. Field introduced in 18.2.1.
   * @return operMode
  **/
  @ApiModelProperty(value = "Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks. Enum options - DETECTION, MITIGATION. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getOperMode() {
    return operMode;
  }
    
  @VsoMethod
  public void setOperMode(String operMode) {
    this.operMode = operMode;
  }

  
  public String getObjectID() {
		return "DnsAttacks";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsAttacks dnsAttacks = (DnsAttacks) o;
    return Objects.equals(this.attacks, dnsAttacks.attacks) &&
        Objects.equals(this.operMode, dnsAttacks.operMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attacks, operMode);
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

