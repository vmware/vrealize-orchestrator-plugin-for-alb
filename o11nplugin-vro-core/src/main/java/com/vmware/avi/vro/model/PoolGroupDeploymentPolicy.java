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
 * The PoolGroupDeploymentPolicy is a POJO class extends AviRestResource that used for creating
 * PoolGroupDeploymentPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PoolGroupDeploymentPolicy")
@VsoFinder(name = Constants.FINDER_VRO_POOLGROUPDEPLOYMENTPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PoolGroupDeploymentPolicy extends AviRestResource {
  @JsonProperty("auto_disable_old_prod_pools")
  @JsonInclude(Include.NON_NULL)
  private Boolean autoDisableOldProdPools = true;

  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("evaluation_duration")
  @JsonInclude(Include.NON_NULL)
  private Integer evaluationDuration = 300;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("rules")
  @JsonInclude(Include.NON_NULL)
  private List<PGDeploymentRule> rules = null;

  @JsonProperty("scheme")
  @JsonInclude(Include.NON_NULL)
  private String scheme = "BLUE_GREEN";

  @JsonProperty("target_test_traffic_ratio")
  @JsonInclude(Include.NON_NULL)
  private Integer targetTestTrafficRatio = 100;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("test_traffic_ratio_rampup")
  @JsonInclude(Include.NON_NULL)
  private Integer testTrafficRatioRampup = 100;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;

  @JsonProperty("webhook_ref")
  @JsonInclude(Include.NON_NULL)
  private String webhookRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * It will automatically disable old production pools once there is a new production candidate.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return autoDisableOldProdPools
   */
  @VsoMethod
  public Boolean getAutoDisableOldProdPools() {
    return autoDisableOldProdPools;
  }

  /**
   * This is the setter method to the attribute.
   * It will automatically disable old production pools once there is a new production candidate.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param autoDisableOldProdPools set the autoDisableOldProdPools.
   */
  @VsoMethod
  public void setAutoDisableOldProdPools(Boolean  autoDisableOldProdPools) {
    this.autoDisableOldProdPools = autoDisableOldProdPools;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User defined description for the object.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User defined description for the object.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Duration of evaluation period for automatic deployment.
   * Allowed values are 60-86400.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return evaluationDuration
   */
  @VsoMethod
  public Integer getEvaluationDuration() {
    return evaluationDuration;
  }

  /**
   * This is the setter method to the attribute.
   * Duration of evaluation period for automatic deployment.
   * Allowed values are 60-86400.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param evaluationDuration set the evaluationDuration.
   */
  @VsoMethod
  public void setEvaluationDuration(Integer  evaluationDuration) {
    this.evaluationDuration = evaluationDuration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the pool group deployment policy.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the pool group deployment policy.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property rules of obj type poolgroupdeploymentpolicy field type str  type array.
   * @return rules
   */
  @VsoMethod
  public List<PGDeploymentRule> getRules() {
    return rules;
  }

  /**
   * This is the setter method. this will set the rules
   * Placeholder for description of property rules of obj type poolgroupdeploymentpolicy field type str  type array.
   * @return rules
   */
  @VsoMethod
  public void setRules(List<PGDeploymentRule>  rules) {
    this.rules = rules;
  }

  /**
   * This is the setter method this will set the rules
   * Placeholder for description of property rules of obj type poolgroupdeploymentpolicy field type str  type array.
   * @return rules
   */
  @VsoMethod
  public PoolGroupDeploymentPolicy addRulesItem(PGDeploymentRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<PGDeploymentRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Deployment scheme.
   * Enum options - BLUE_GREEN, CANARY.
   * Default value when not specified in API or module is interpreted by Avi Controller as BLUE_GREEN.
   * @return scheme
   */
  @VsoMethod
  public String getScheme() {
    return scheme;
  }

  /**
   * This is the setter method to the attribute.
   * Deployment scheme.
   * Enum options - BLUE_GREEN, CANARY.
   * Default value when not specified in API or module is interpreted by Avi Controller as BLUE_GREEN.
   * @param scheme set the scheme.
   */
  @VsoMethod
  public void setScheme(String  scheme) {
    this.scheme = scheme;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Target traffic ratio before pool is made production.
   * Allowed values are 1-100.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return targetTestTrafficRatio
   */
  @VsoMethod
  public Integer getTargetTestTrafficRatio() {
    return targetTestTrafficRatio;
  }

  /**
   * This is the setter method to the attribute.
   * Target traffic ratio before pool is made production.
   * Allowed values are 1-100.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param targetTestTrafficRatio set the targetTestTrafficRatio.
   */
  @VsoMethod
  public void setTargetTestTrafficRatio(Integer  targetTestTrafficRatio) {
    this.targetTestTrafficRatio = targetTestTrafficRatio;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ratio of the traffic that is sent to the pool under test.
   * Test ratio of 100 means blue green.
   * Allowed values are 1-100.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return testTrafficRatioRampup
   */
  @VsoMethod
  public Integer getTestTrafficRatioRampup() {
    return testTrafficRatioRampup;
  }

  /**
   * This is the setter method to the attribute.
   * Ratio of the traffic that is sent to the pool under test.
   * Test ratio of 100 means blue green.
   * Allowed values are 1-100.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param testTrafficRatioRampup set the testTrafficRatioRampup.
   */
  @VsoMethod
  public void setTestTrafficRatioRampup(Integer  testTrafficRatioRampup) {
    this.testTrafficRatioRampup = testTrafficRatioRampup;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the pool group deployment policy.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the pool group deployment policy.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Webhook configured with url that avi controller will pass back information about pool group, old and new pool information and current deployment
   * rule results.
   * It is a reference to an object of type webhook.
   * Field introduced in 17.1.1.
   * @return webhookRef
   */
  @VsoMethod
  public String getWebhookRef() {
    return webhookRef;
  }

  /**
   * This is the setter method to the attribute.
   * Webhook configured with url that avi controller will pass back information about pool group, old and new pool information and current deployment
   * rule results.
   * It is a reference to an object of type webhook.
   * Field introduced in 17.1.1.
   * @param webhookRef set the webhookRef.
   */
  @VsoMethod
  public void setWebhookRef(String  webhookRef) {
    this.webhookRef = webhookRef;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PoolGroupDeploymentPolicy objPoolGroupDeploymentPolicy = (PoolGroupDeploymentPolicy) o;
  return   Objects.equals(this.uuid, objPoolGroupDeploymentPolicy.uuid)&&
  Objects.equals(this.name, objPoolGroupDeploymentPolicy.name)&&
  Objects.equals(this.scheme, objPoolGroupDeploymentPolicy.scheme)&&
  Objects.equals(this.testTrafficRatioRampup, objPoolGroupDeploymentPolicy.testTrafficRatioRampup)&&
  Objects.equals(this.rules, objPoolGroupDeploymentPolicy.rules)&&
  Objects.equals(this.webhookRef, objPoolGroupDeploymentPolicy.webhookRef)&&
  Objects.equals(this.evaluationDuration, objPoolGroupDeploymentPolicy.evaluationDuration)&&
  Objects.equals(this.targetTestTrafficRatio, objPoolGroupDeploymentPolicy.targetTestTrafficRatio)&&
  Objects.equals(this.autoDisableOldProdPools, objPoolGroupDeploymentPolicy.autoDisableOldProdPools)&&
  Objects.equals(this.description, objPoolGroupDeploymentPolicy.description)&&
  Objects.equals(this.tenantRef, objPoolGroupDeploymentPolicy.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PoolGroupDeploymentPolicy {\n");
      sb.append("    autoDisableOldProdPools: ").append(toIndentedString(autoDisableOldProdPools)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    evaluationDuration: ").append(toIndentedString(evaluationDuration)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
        sb.append("    targetTestTrafficRatio: ").append(toIndentedString(targetTestTrafficRatio)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    testTrafficRatioRampup: ").append(toIndentedString(testTrafficRatioRampup)).append("\n");
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

