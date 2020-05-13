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
 * DnsRuleRLAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsRuleRLAction")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULERLACTION, idAccessor = "getObjectID()")
@Service
public class DnsRuleRLAction extends AviRestResource  {
  @JsonProperty("type")
  private String type = "DNS_RL_ACTION_NONE";

  
  /**
   * Type of action to be enforced upon hitting the rate limit. Enum options - DNS_RL_ACTION_NONE, DNS_RL_ACTION_DROP_REQ. Field introduced in 18.2.5.
   * @return type
  **/
  @ApiModelProperty(value = "Type of action to be enforced upon hitting the rate limit. Enum options - DNS_RL_ACTION_NONE, DNS_RL_ACTION_DROP_REQ. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "DnsRuleRLAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRuleRLAction dnsRuleRLAction = (DnsRuleRLAction) o;
    return Objects.equals(this.type, dnsRuleRLAction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRuleRLAction {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

