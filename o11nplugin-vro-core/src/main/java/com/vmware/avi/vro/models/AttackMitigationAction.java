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
 * The AttackMitigationAction is a POJO class extends AviRestResource that used for creating
 * AttackMitigationAction.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AttackMitigationAction")
@VsoFinder(name = Constants.FINDER_VRO_ATTACKMITIGATIONACTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AttackMitigationAction extends AviRestResource {
    @JsonProperty("deny")
    @JsonInclude(Include.NON_NULL)
    private Boolean deny = true;



  /**
   * This is the getter method this will return the attribute value.
   * Deny the attack packets further processing and drop them.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return deny
   */
  @VsoMethod
  public Boolean getDeny() {
    return deny;
  }

  /**
   * This is the setter method to the attribute.
   * Deny the attack packets further processing and drop them.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param deny set the deny.
   */
  @VsoMethod
  public void setDeny(Boolean  deny) {
    this.deny = deny;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AttackMitigationAction objAttackMitigationAction = (AttackMitigationAction) o;
  return   Objects.equals(this.deny, objAttackMitigationAction.deny);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AttackMitigationAction {\n");
      sb.append("    deny: ").append(toIndentedString(deny)).append("\n");
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

