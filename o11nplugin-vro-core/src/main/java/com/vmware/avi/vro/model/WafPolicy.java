package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.WafApplicationSignatures;
import com.vmware.avi.vro.model.WafLearning;
import com.vmware.avi.vro.model.WafPolicyWhitelist;
import com.vmware.avi.vro.model.WafPositiveSecurityModel;
import com.vmware.avi.vro.model.WafRuleGroup;
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
 * WafPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafPolicy")
@VsoFinder(name = Constants.FINDER_VRO_WAFPOLICY, idAccessor = "getObjectID()")
@Service
public class WafPolicy extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("allow_mode_delegation")
  private Boolean allowModeDelegation = true;

  @JsonProperty("application_signatures")
  private WafApplicationSignatures applicationSignatures = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("crs_groups")
  @Valid
  private List<WafRuleGroup> crsGroups = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("enable_app_learning")
  private Boolean enableAppLearning = null;

  @JsonProperty("failure_mode")
  private String failureMode = "WAF_FAILURE_MODE_OPEN";

  @JsonProperty("learning")
  private WafLearning learning = null;

  @JsonProperty("mode")
  private String mode = "WAF_MODE_DETECTION_ONLY";

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("paranoia_level")
  private String paranoiaLevel = "WAF_PARANOIA_LEVEL_LOW";

  @JsonProperty("positive_security_model")
  private WafPositiveSecurityModel positiveSecurityModel = null;

  @JsonProperty("post_crs_groups")
  @Valid
  private List<WafRuleGroup> postCrsGroups = null;

  @JsonProperty("pre_crs_groups")
  @Valid
  private List<WafRuleGroup> preCrsGroups = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("waf_crs_ref")
  private String wafCrsRef = null;

  @JsonProperty("waf_profile_ref")
  private String wafProfileRef = null;

  @JsonProperty("whitelist")
  private WafPolicyWhitelist whitelist = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * Allow Rules to overwrite the policy mode. This must be set if the policy mode is set to enforcement. Field introduced in 18.1.5, 18.2.1.
   * @return allowModeDelegation
  **/
  @ApiModelProperty(value = "Allow Rules to overwrite the policy mode. This must be set if the policy mode is set to enforcement. Field introduced in 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Boolean isAllowModeDelegation() {
    return allowModeDelegation;
  }
    
  @VsoMethod
  public void setAllowModeDelegation(Boolean allowModeDelegation) {
    this.allowModeDelegation = allowModeDelegation;
  }

  
  /**
   * Application Specific Signatures. Field introduced in 20.1.1.
   * @return applicationSignatures
  **/
  @ApiModelProperty(value = "Application Specific Signatures. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public WafApplicationSignatures getApplicationSignatures() {
    return applicationSignatures;
  }
    
  @VsoMethod
  public void setApplicationSignatures(WafApplicationSignatures applicationSignatures) {
    this.applicationSignatures = applicationSignatures;
  }

  
  /**
   * Creator name. Field introduced in 17.2.4.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator name. Field introduced in 17.2.4.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  public WafPolicy addCrsGroupsItem(WafRuleGroup crsGroupsItem) {
    if (this.crsGroups == null) {
      this.crsGroups = new ArrayList<WafRuleGroup>();
    }
    this.crsGroups.add(crsGroupsItem);
    return this;
  }
  
  /**
   * WAF Rules are categorized in to groups based on their characterization. These groups are system created with CRS groups. Field introduced in 17.2.1.
   * @return crsGroups
  **/
  @ApiModelProperty(value = "WAF Rules are categorized in to groups based on their characterization. These groups are system created with CRS groups. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public List<WafRuleGroup> getCrsGroups() {
    return crsGroups;
  }
    
  @VsoMethod
  public void setCrsGroups(List<WafRuleGroup> crsGroups) {
    this.crsGroups = crsGroups;
  }

  
  /**
   *  Field introduced in 17.2.1.
   * @return description
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Enable Application Learning for this WAF policy. Field introduced in 18.2.3.
   * @return enableAppLearning
  **/
  @ApiModelProperty(value = "Enable Application Learning for this WAF policy. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isEnableAppLearning() {
    return enableAppLearning;
  }
    
  @VsoMethod
  public void setEnableAppLearning(Boolean enableAppLearning) {
    this.enableAppLearning = enableAppLearning;
  }

  
  /**
   * WAF Policy failure mode. This can be 'Open' or 'Closed'. Enum options - WAF_FAILURE_MODE_OPEN, WAF_FAILURE_MODE_CLOSED. Field introduced in 18.1.2.
   * @return failureMode
  **/
  @ApiModelProperty(value = "WAF Policy failure mode. This can be 'Open' or 'Closed'. Enum options - WAF_FAILURE_MODE_OPEN, WAF_FAILURE_MODE_CLOSED. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public String getFailureMode() {
    return failureMode;
  }
    
  @VsoMethod
  public void setFailureMode(String failureMode) {
    this.failureMode = failureMode;
  }

  
  /**
   * Configure parameters for WAF learning. Field deprecated in 18.2.3. Field introduced in 18.1.2.
   * @return learning
  **/
  @ApiModelProperty(value = "Configure parameters for WAF learning. Field deprecated in 18.2.3. Field introduced in 18.1.2.")

  @Valid

 
  @VsoMethod  
  public WafLearning getLearning() {
    return learning;
  }
    
  @VsoMethod
  public void setLearning(WafLearning learning) {
    this.learning = learning;
  }

  
  /**
   * WAF Policy mode. This can be detection or enforcement. It can be overwritten by rules if allow_mode_delegation is set. Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT. Field introduced in 17.2.1.
   * @return mode
  **/
  @ApiModelProperty(required = true, value = "WAF Policy mode. This can be detection or enforcement. It can be overwritten by rules if allow_mode_delegation is set. Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT. Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getMode() {
    return mode;
  }
    
  @VsoMethod
  public void setMode(String mode) {
    this.mode = mode;
  }

  
  /**
   *  Field introduced in 17.2.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * WAF Ruleset paranoia  mode. This is used to select Rules based on the paranoia-level tag. Enum options - WAF_PARANOIA_LEVEL_LOW, WAF_PARANOIA_LEVEL_MEDIUM, WAF_PARANOIA_LEVEL_HIGH, WAF_PARANOIA_LEVEL_EXTREME. Field introduced in 17.2.1.
   * @return paranoiaLevel
  **/
  @ApiModelProperty(value = "WAF Ruleset paranoia  mode. This is used to select Rules based on the paranoia-level tag. Enum options - WAF_PARANOIA_LEVEL_LOW, WAF_PARANOIA_LEVEL_MEDIUM, WAF_PARANOIA_LEVEL_HIGH, WAF_PARANOIA_LEVEL_EXTREME. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getParanoiaLevel() {
    return paranoiaLevel;
  }
    
  @VsoMethod
  public void setParanoiaLevel(String paranoiaLevel) {
    this.paranoiaLevel = paranoiaLevel;
  }

  
  /**
   * The Positive Security Model. This is used to describe how the request or parts of the request should look like. It is executed in the Request Body Phase of Avi WAF. Field introduced in 18.2.3.
   * @return positiveSecurityModel
  **/
  @ApiModelProperty(value = "The Positive Security Model. This is used to describe how the request or parts of the request should look like. It is executed in the Request Body Phase of Avi WAF. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public WafPositiveSecurityModel getPositiveSecurityModel() {
    return positiveSecurityModel;
  }
    
  @VsoMethod
  public void setPositiveSecurityModel(WafPositiveSecurityModel positiveSecurityModel) {
    this.positiveSecurityModel = positiveSecurityModel;
  }

  
  public WafPolicy addPostCrsGroupsItem(WafRuleGroup postCrsGroupsItem) {
    if (this.postCrsGroups == null) {
      this.postCrsGroups = new ArrayList<WafRuleGroup>();
    }
    this.postCrsGroups.add(postCrsGroupsItem);
    return this;
  }
  
  /**
   * WAF Rules are categorized in to groups based on their characterization. These groups are created by the user and will be enforced after the CRS groups. Field introduced in 17.2.1.
   * @return postCrsGroups
  **/
  @ApiModelProperty(value = "WAF Rules are categorized in to groups based on their characterization. These groups are created by the user and will be enforced after the CRS groups. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public List<WafRuleGroup> getPostCrsGroups() {
    return postCrsGroups;
  }
    
  @VsoMethod
  public void setPostCrsGroups(List<WafRuleGroup> postCrsGroups) {
    this.postCrsGroups = postCrsGroups;
  }

  
  public WafPolicy addPreCrsGroupsItem(WafRuleGroup preCrsGroupsItem) {
    if (this.preCrsGroups == null) {
      this.preCrsGroups = new ArrayList<WafRuleGroup>();
    }
    this.preCrsGroups.add(preCrsGroupsItem);
    return this;
  }
  
  /**
   * WAF Rules are categorized in to groups based on their characterization. These groups are created by the user and will be  enforced before the CRS groups. Field introduced in 17.2.1.
   * @return preCrsGroups
  **/
  @ApiModelProperty(value = "WAF Rules are categorized in to groups based on their characterization. These groups are created by the user and will be  enforced before the CRS groups. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public List<WafRuleGroup> getPreCrsGroups() {
    return preCrsGroups;
  }
    
  @VsoMethod
  public void setPreCrsGroups(List<WafRuleGroup> preCrsGroups) {
    this.preCrsGroups = preCrsGroups;
  }

  
  /**
   *  It is a reference to an object of type Tenant. Field introduced in 17.2.1.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   *  Field introduced in 17.2.1.
   * @return uuid
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * WAF core ruleset used for the CRS part of this Policy. It is a reference to an object of type WafCRS. Field introduced in 18.1.1.
   * @return wafCrsRef
  **/
  @ApiModelProperty(value = "WAF core ruleset used for the CRS part of this Policy. It is a reference to an object of type WafCRS. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public String getWafCrsRef() {
    return wafCrsRef;
  }
    
  @VsoMethod
  public void setWafCrsRef(String wafCrsRef) {
    this.wafCrsRef = wafCrsRef;
  }

  
  /**
   * WAF Profile for WAF policy. It is a reference to an object of type WafProfile. Field introduced in 17.2.1.
   * @return wafProfileRef
  **/
  @ApiModelProperty(required = true, value = "WAF Profile for WAF policy. It is a reference to an object of type WafProfile. Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getWafProfileRef() {
    return wafProfileRef;
  }
    
  @VsoMethod
  public void setWafProfileRef(String wafProfileRef) {
    this.wafProfileRef = wafProfileRef;
  }

  
  /**
   * A set of rules which describe conditions under which the request will bypass the WAF. This will be executed in the request header phase before any other WAF related code. Field introduced in 18.2.3.
   * @return whitelist
  **/
  @ApiModelProperty(value = "A set of rules which describe conditions under which the request will bypass the WAF. This will be executed in the request header phase before any other WAF related code. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public WafPolicyWhitelist getWhitelist() {
    return whitelist;
  }
    
  @VsoMethod
  public void setWhitelist(WafPolicyWhitelist whitelist) {
    this.whitelist = whitelist;
  }

  
  public String getObjectID() {
		return "WafPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafPolicy wafPolicy = (WafPolicy) o;
    return Objects.equals(this.lastModified, wafPolicy.lastModified) &&
        Objects.equals(this.allowModeDelegation, wafPolicy.allowModeDelegation) &&
        Objects.equals(this.applicationSignatures, wafPolicy.applicationSignatures) &&
        Objects.equals(this.createdBy, wafPolicy.createdBy) &&
        Objects.equals(this.crsGroups, wafPolicy.crsGroups) &&
        Objects.equals(this.description, wafPolicy.description) &&
        Objects.equals(this.enableAppLearning, wafPolicy.enableAppLearning) &&
        Objects.equals(this.failureMode, wafPolicy.failureMode) &&
        Objects.equals(this.learning, wafPolicy.learning) &&
        Objects.equals(this.mode, wafPolicy.mode) &&
        Objects.equals(this.name, wafPolicy.name) &&
        Objects.equals(this.paranoiaLevel, wafPolicy.paranoiaLevel) &&
        Objects.equals(this.positiveSecurityModel, wafPolicy.positiveSecurityModel) &&
        Objects.equals(this.postCrsGroups, wafPolicy.postCrsGroups) &&
        Objects.equals(this.preCrsGroups, wafPolicy.preCrsGroups) &&
        Objects.equals(this.tenantRef, wafPolicy.tenantRef) &&
        Objects.equals(this.url, wafPolicy.url) &&
        Objects.equals(this.uuid, wafPolicy.uuid) &&
        Objects.equals(this.wafCrsRef, wafPolicy.wafCrsRef) &&
        Objects.equals(this.wafProfileRef, wafPolicy.wafProfileRef) &&
        Objects.equals(this.whitelist, wafPolicy.whitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, allowModeDelegation, applicationSignatures, createdBy, crsGroups, description, enableAppLearning, failureMode, learning, mode, name, paranoiaLevel, positiveSecurityModel, postCrsGroups, preCrsGroups, tenantRef, url, uuid, wafCrsRef, wafProfileRef, whitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafPolicy {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    allowModeDelegation: ").append(toIndentedString(allowModeDelegation)).append("\n");
    sb.append("    applicationSignatures: ").append(toIndentedString(applicationSignatures)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    crsGroups: ").append(toIndentedString(crsGroups)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableAppLearning: ").append(toIndentedString(enableAppLearning)).append("\n");
    sb.append("    failureMode: ").append(toIndentedString(failureMode)).append("\n");
    sb.append("    learning: ").append(toIndentedString(learning)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paranoiaLevel: ").append(toIndentedString(paranoiaLevel)).append("\n");
    sb.append("    positiveSecurityModel: ").append(toIndentedString(positiveSecurityModel)).append("\n");
    sb.append("    postCrsGroups: ").append(toIndentedString(postCrsGroups)).append("\n");
    sb.append("    preCrsGroups: ").append(toIndentedString(preCrsGroups)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    wafCrsRef: ").append(toIndentedString(wafCrsRef)).append("\n");
    sb.append("    wafProfileRef: ").append(toIndentedString(wafProfileRef)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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

