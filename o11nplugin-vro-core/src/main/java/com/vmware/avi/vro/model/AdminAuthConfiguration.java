package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AuthMappingRule;
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
 * AdminAuthConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AdminAuthConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_ADMINAUTHCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class AdminAuthConfiguration extends AviRestResource  {
  @JsonProperty("allow_local_user_login")
  private Boolean allowLocalUserLogin = true;

  @JsonProperty("auth_profile_ref")
  private String authProfileRef = null;

  @JsonProperty("mapping_rules")
  @Valid
  private List<AuthMappingRule> mappingRules = null;

  
  /**
   * Allow any user created locally to login with local credentials. Field introduced in 17.1.1.
   * @return allowLocalUserLogin
  **/
  @ApiModelProperty(value = "Allow any user created locally to login with local credentials. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAllowLocalUserLogin() {
    return allowLocalUserLogin;
  }
    
  @VsoMethod
  public void setAllowLocalUserLogin(Boolean allowLocalUserLogin) {
    this.allowLocalUserLogin = allowLocalUserLogin;
  }

  
  /**
   *  It is a reference to an object of type AuthProfile.
   * @return authProfileRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type AuthProfile.")


 
  @VsoMethod  
  public String getAuthProfileRef() {
    return authProfileRef;
  }
    
  @VsoMethod
  public void setAuthProfileRef(String authProfileRef) {
    this.authProfileRef = authProfileRef;
  }

  
  public AdminAuthConfiguration addMappingRulesItem(AuthMappingRule mappingRulesItem) {
    if (this.mappingRules == null) {
      this.mappingRules = new ArrayList<AuthMappingRule>();
    }
    this.mappingRules.add(mappingRulesItem);
    return this;
  }
  
  /**
   * Rules list for tenant or role mapping.
   * @return mappingRules
  **/
  @ApiModelProperty(value = "Rules list for tenant or role mapping.")

  @Valid

 
  @VsoMethod  
  public List<AuthMappingRule> getMappingRules() {
    return mappingRules;
  }
    
  @VsoMethod
  public void setMappingRules(List<AuthMappingRule> mappingRules) {
    this.mappingRules = mappingRules;
  }

  
  public String getObjectID() {
		return "AdminAuthConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminAuthConfiguration adminAuthConfiguration = (AdminAuthConfiguration) o;
    return Objects.equals(this.allowLocalUserLogin, adminAuthConfiguration.allowLocalUserLogin) &&
        Objects.equals(this.authProfileRef, adminAuthConfiguration.authProfileRef) &&
        Objects.equals(this.mappingRules, adminAuthConfiguration.mappingRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowLocalUserLogin, authProfileRef, mappingRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminAuthConfiguration {\n");
    
    sb.append("    allowLocalUserLogin: ").append(toIndentedString(allowLocalUserLogin)).append("\n");
    sb.append("    authProfileRef: ").append(toIndentedString(authProfileRef)).append("\n");
    sb.append("    mappingRules: ").append(toIndentedString(mappingRules)).append("\n");
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

