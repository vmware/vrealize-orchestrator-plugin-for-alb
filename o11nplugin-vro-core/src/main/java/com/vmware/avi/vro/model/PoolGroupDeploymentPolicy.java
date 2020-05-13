package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.PGDeploymentRule;
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
 * PoolGroupDeploymentPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PoolGroupDeploymentPolicy")
@VsoFinder(name = Constants.FINDER_VRO_POOLGROUPDEPLOYMENTPOLICY, idAccessor = "getObjectID()")
@Service
public class PoolGroupDeploymentPolicy extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("auto_disable_old_prod_pools")
  private Boolean autoDisableOldProdPools = true;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("evaluation_duration")
  private Integer evaluationDuration = 300;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rules")
  @Valid
  private List<PGDeploymentRule> rules = null;

  @JsonProperty("scheme")
  private String scheme = "BLUE_GREEN";

  @JsonProperty("target_test_traffic_ratio")
  private Integer targetTestTrafficRatio = 100;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("test_traffic_ratio_rampup")
  private Integer testTrafficRatioRampup = 100;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("webhook_ref")
  private String webhookRef = null;

  
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
   * It will automatically disable old production pools once there is a new production candidate.
   * @return autoDisableOldProdPools
  **/
  @ApiModelProperty(value = "It will automatically disable old production pools once there is a new production candidate.")


 
  @VsoMethod  
  public Boolean isAutoDisableOldProdPools() {
    return autoDisableOldProdPools;
  }
    
  @VsoMethod
  public void setAutoDisableOldProdPools(Boolean autoDisableOldProdPools) {
    this.autoDisableOldProdPools = autoDisableOldProdPools;
  }

  
  /**
   * User defined description for the object.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for the object.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Duration of evaluation period for automatic deployment. Allowed values are 60-86400.
   * @return evaluationDuration
  **/
  @ApiModelProperty(value = "Duration of evaluation period for automatic deployment. Allowed values are 60-86400.")


 
  @VsoMethod  
  public Integer getEvaluationDuration() {
    return evaluationDuration;
  }
    
  @VsoMethod
  public void setEvaluationDuration(Integer evaluationDuration) {
    this.evaluationDuration = evaluationDuration;
  }

  
  /**
   * The name of the pool group deployment policy.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the pool group deployment policy.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public PoolGroupDeploymentPolicy addRulesItem(PGDeploymentRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<PGDeploymentRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property rules of obj type PoolGroupDeploymentPolicy field type str  type object
   * @return rules
  **/
  @ApiModelProperty(value = "Placeholder for description of property rules of obj type PoolGroupDeploymentPolicy field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<PGDeploymentRule> getRules() {
    return rules;
  }
    
  @VsoMethod
  public void setRules(List<PGDeploymentRule> rules) {
    this.rules = rules;
  }

  
  /**
   * deployment scheme. Enum options - BLUE_GREEN, CANARY.
   * @return scheme
  **/
  @ApiModelProperty(value = "deployment scheme. Enum options - BLUE_GREEN, CANARY.")


 
  @VsoMethod  
  public String getScheme() {
    return scheme;
  }
    
  @VsoMethod
  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  
  /**
   * Target traffic ratio before pool is made production. Allowed values are 1-100.
   * @return targetTestTrafficRatio
  **/
  @ApiModelProperty(value = "Target traffic ratio before pool is made production. Allowed values are 1-100.")


 
  @VsoMethod  
  public Integer getTargetTestTrafficRatio() {
    return targetTestTrafficRatio;
  }
    
  @VsoMethod
  public void setTargetTestTrafficRatio(Integer targetTestTrafficRatio) {
    this.targetTestTrafficRatio = targetTestTrafficRatio;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * Ratio of the traffic that is sent to the pool under test. test ratio of 100 means blue green. Allowed values are 1-100.
   * @return testTrafficRatioRampup
  **/
  @ApiModelProperty(value = "Ratio of the traffic that is sent to the pool under test. test ratio of 100 means blue green. Allowed values are 1-100.")


 
  @VsoMethod  
  public Integer getTestTrafficRatioRampup() {
    return testTrafficRatioRampup;
  }
    
  @VsoMethod
  public void setTestTrafficRatioRampup(Integer testTrafficRatioRampup) {
    this.testTrafficRatioRampup = testTrafficRatioRampup;
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
   * UUID of the pool group deployment policy.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the pool group deployment policy.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * Webhook configured with URL that Avi controller will pass back information about pool group, old and new pool information and current deployment rule results. It is a reference to an object of type Webhook. Field introduced in 17.1.1.
   * @return webhookRef
  **/
  @ApiModelProperty(value = "Webhook configured with URL that Avi controller will pass back information about pool group, old and new pool information and current deployment rule results. It is a reference to an object of type Webhook. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getWebhookRef() {
    return webhookRef;
  }
    
  @VsoMethod
  public void setWebhookRef(String webhookRef) {
    this.webhookRef = webhookRef;
  }

  
  public String getObjectID() {
		return "PoolGroupDeploymentPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolGroupDeploymentPolicy poolGroupDeploymentPolicy = (PoolGroupDeploymentPolicy) o;
    return Objects.equals(this.lastModified, poolGroupDeploymentPolicy.lastModified) &&
        Objects.equals(this.autoDisableOldProdPools, poolGroupDeploymentPolicy.autoDisableOldProdPools) &&
        Objects.equals(this.description, poolGroupDeploymentPolicy.description) &&
        Objects.equals(this.evaluationDuration, poolGroupDeploymentPolicy.evaluationDuration) &&
        Objects.equals(this.name, poolGroupDeploymentPolicy.name) &&
        Objects.equals(this.rules, poolGroupDeploymentPolicy.rules) &&
        Objects.equals(this.scheme, poolGroupDeploymentPolicy.scheme) &&
        Objects.equals(this.targetTestTrafficRatio, poolGroupDeploymentPolicy.targetTestTrafficRatio) &&
        Objects.equals(this.tenantRef, poolGroupDeploymentPolicy.tenantRef) &&
        Objects.equals(this.testTrafficRatioRampup, poolGroupDeploymentPolicy.testTrafficRatioRampup) &&
        Objects.equals(this.url, poolGroupDeploymentPolicy.url) &&
        Objects.equals(this.uuid, poolGroupDeploymentPolicy.uuid) &&
        Objects.equals(this.webhookRef, poolGroupDeploymentPolicy.webhookRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, autoDisableOldProdPools, description, evaluationDuration, name, rules, scheme, targetTestTrafficRatio, tenantRef, testTrafficRatioRampup, url, uuid, webhookRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolGroupDeploymentPolicy {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    autoDisableOldProdPools: ").append(toIndentedString(autoDisableOldProdPools)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    evaluationDuration: ").append(toIndentedString(evaluationDuration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    targetTestTrafficRatio: ").append(toIndentedString(targetTestTrafficRatio)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    testTrafficRatioRampup: ").append(toIndentedString(testTrafficRatioRampup)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    webhookRef: ").append(toIndentedString(webhookRef)).append("\n");
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

