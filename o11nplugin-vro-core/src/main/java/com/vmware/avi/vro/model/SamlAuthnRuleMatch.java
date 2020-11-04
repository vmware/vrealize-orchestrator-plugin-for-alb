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
 * The SamlAuthnRuleMatch is a POJO class extends AviRestResource that used for creating
 * SamlAuthnRuleMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SamlAuthnRuleMatch")
@VsoFinder(name = Constants.FINDER_VRO_SAMLAUTHNRULEMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SamlAuthnRuleMatch extends AviRestResource {
    @JsonProperty("saml_authn_matched_rule_action")
    @JsonInclude(Include.NON_NULL)
    private String samlAuthnMatchedRuleAction = null;

    @JsonProperty("saml_authn_matched_rule_name")
    @JsonInclude(Include.NON_NULL)
    private String samlAuthnMatchedRuleName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the executed saml authentication rule action.
   * Enum options - SKIP_AUTHENTICATION, USE_DEFAULT_AUTHENTICATION.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlAuthnMatchedRuleAction
   */
  @VsoMethod
  public String getSamlAuthnMatchedRuleAction() {
    return samlAuthnMatchedRuleAction;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the executed saml authentication rule action.
   * Enum options - SKIP_AUTHENTICATION, USE_DEFAULT_AUTHENTICATION.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param samlAuthnMatchedRuleAction set the samlAuthnMatchedRuleAction.
   */
  @VsoMethod
  public void setSamlAuthnMatchedRuleAction(String  samlAuthnMatchedRuleAction) {
    this.samlAuthnMatchedRuleAction = samlAuthnMatchedRuleAction;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the matched saml authentication rule.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlAuthnMatchedRuleName
   */
  @VsoMethod
  public String getSamlAuthnMatchedRuleName() {
    return samlAuthnMatchedRuleName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the matched saml authentication rule.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param samlAuthnMatchedRuleName set the samlAuthnMatchedRuleName.
   */
  @VsoMethod
  public void setSamlAuthnMatchedRuleName(String  samlAuthnMatchedRuleName) {
    this.samlAuthnMatchedRuleName = samlAuthnMatchedRuleName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SamlAuthnRuleMatch objSamlAuthnRuleMatch = (SamlAuthnRuleMatch) o;
  return   Objects.equals(this.samlAuthnMatchedRuleName, objSamlAuthnRuleMatch.samlAuthnMatchedRuleName)&&
  Objects.equals(this.samlAuthnMatchedRuleAction, objSamlAuthnRuleMatch.samlAuthnMatchedRuleAction);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SamlAuthnRuleMatch {\n");
      sb.append("    samlAuthnMatchedRuleAction: ").append(toIndentedString(samlAuthnMatchedRuleAction)).append("\n");
        sb.append("    samlAuthnMatchedRuleName: ").append(toIndentedString(samlAuthnMatchedRuleName)).append("\n");
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

