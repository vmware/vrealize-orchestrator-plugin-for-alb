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
 * The AuthenticationPolicy is a POJO class extends AviRestResource that used for creating
 * AuthenticationPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AuthenticationPolicy")
@VsoFinder(name = Constants.FINDER_VRO_AUTHENTICATIONPOLICY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AuthenticationPolicy extends AviRestResource {
    @JsonProperty("authn_rules")
    @JsonInclude(Include.NON_NULL)
    private List<AuthenticationRule> authnRules = null;

    @JsonProperty("default_auth_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String defaultAuthProfileRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Add rules to apply auth profile to specific targets.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authnRules
   */
  @VsoMethod
  public List<AuthenticationRule> getAuthnRules() {
    return authnRules;
  }

  /**
   * This is the setter method. this will set the authnRules
   * Add rules to apply auth profile to specific targets.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authnRules
   */
  @VsoMethod
  public void setAuthnRules(List<AuthenticationRule>  authnRules) {
    this.authnRules = authnRules;
  }

  /**
   * This is the setter method this will set the authnRules
   * Add rules to apply auth profile to specific targets.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authnRules
   */
  @VsoMethod
  public AuthenticationPolicy addAuthnRulesItem(AuthenticationRule authnRulesItem) {
    if (this.authnRules == null) {
      this.authnRules = new ArrayList<AuthenticationRule>();
    }
    this.authnRules.add(authnRulesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Auth profile to use for validating users.
   * It is a reference to an object of type authprofile.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return defaultAuthProfileRef
   */
  @VsoMethod
  public String getDefaultAuthProfileRef() {
    return defaultAuthProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Auth profile to use for validating users.
   * It is a reference to an object of type authprofile.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param defaultAuthProfileRef set the defaultAuthProfileRef.
   */
  @VsoMethod
  public void setDefaultAuthProfileRef(String  defaultAuthProfileRef) {
    this.defaultAuthProfileRef = defaultAuthProfileRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AuthenticationPolicy objAuthenticationPolicy = (AuthenticationPolicy) o;
  return   Objects.equals(this.defaultAuthProfileRef, objAuthenticationPolicy.defaultAuthProfileRef)&&
  Objects.equals(this.authnRules, objAuthenticationPolicy.authnRules);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AuthenticationPolicy {\n");
      sb.append("    authnRules: ").append(toIndentedString(authnRules)).append("\n");
        sb.append("    defaultAuthProfileRef: ").append(toIndentedString(defaultAuthProfileRef)).append("\n");
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

