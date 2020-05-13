package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AuthorizationRule;
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
 * AuthorizationPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AuthorizationPolicy")
@VsoFinder(name = Constants.FINDER_VRO_AUTHORIZATIONPOLICY, idAccessor = "getObjectID()")
@Service
public class AuthorizationPolicy extends AviRestResource  {
  @JsonProperty("authz_rules")
  @Valid
  private List<AuthorizationRule> authzRules = null;

  
  public AuthorizationPolicy addAuthzRulesItem(AuthorizationRule authzRulesItem) {
    if (this.authzRules == null) {
      this.authzRules = new ArrayList<AuthorizationRule>();
    }
    this.authzRules.add(authzRulesItem);
    return this;
  }
  
  /**
   * Authorization Policy Rules. Field introduced in 18.2.5.
   * @return authzRules
  **/
  @ApiModelProperty(value = "Authorization Policy Rules. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public List<AuthorizationRule> getAuthzRules() {
    return authzRules;
  }
    
  @VsoMethod
  public void setAuthzRules(List<AuthorizationRule> authzRules) {
    this.authzRules = authzRules;
  }

  
  public String getObjectID() {
		return "AuthorizationPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationPolicy authorizationPolicy = (AuthorizationPolicy) o;
    return Objects.equals(this.authzRules, authorizationPolicy.authzRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authzRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationPolicy {\n");
    
    sb.append("    authzRules: ").append(toIndentedString(authzRules)).append("\n");
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

