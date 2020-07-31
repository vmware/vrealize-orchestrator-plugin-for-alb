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
 * The PoolDeploymentUpdateInfo is a POJO class extends AviRestResource that used for creating
 * PoolDeploymentUpdateInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PoolDeploymentUpdateInfo")
@VsoFinder(name = Constants.FINDER_VRO_POOLDEPLOYMENTUPDATEINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PoolDeploymentUpdateInfo extends AviRestResource {
  @JsonProperty("deployment_state")
  @JsonInclude(Include.NON_NULL)
  private String deploymentState = null;

  @JsonProperty("evaluation_duration")
  @JsonInclude(Include.NON_NULL)
  private Integer evaluationDuration = null;

  @JsonProperty("ratio")
  @JsonInclude(Include.NON_NULL)
  private Integer ratio = null;

  @JsonProperty("results")
  @JsonInclude(Include.NON_NULL)
  private List<PGDeploymentRuleResult> results = null;

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;

  @JsonProperty("webhook_reason")
  @JsonInclude(Include.NON_NULL)
  private String webhookReason = null;

  @JsonProperty("webhook_result")
  @JsonInclude(Include.NON_NULL)
  private Boolean webhookResult = null;



  /**
   * This is the getter method this will return the attribute value.
   * Pool deployment state used with the pg deployment policy.
   * Enum options - EVALUATION_IN_PROGRESS, IN_SERVICE, OUT_OF_SERVICE, EVALUATION_FAILED.
   * @return deploymentState
   */
  @VsoMethod
  public String getDeploymentState() {
    return deploymentState;
  }

  /**
   * This is the setter method to the attribute.
   * Pool deployment state used with the pg deployment policy.
   * Enum options - EVALUATION_IN_PROGRESS, IN_SERVICE, OUT_OF_SERVICE, EVALUATION_FAILED.
   * @param deploymentState set the deploymentState.
   */
  @VsoMethod
  public void setDeploymentState(String  deploymentState) {
    this.deploymentState = deploymentState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Evaluation period for deployment update.
   * @return evaluationDuration
   */
  @VsoMethod
  public Integer getEvaluationDuration() {
    return evaluationDuration;
  }

  /**
   * This is the setter method to the attribute.
   * Evaluation period for deployment update.
   * @param evaluationDuration set the evaluationDuration.
   */
  @VsoMethod
  public void setEvaluationDuration(Integer  evaluationDuration) {
    this.evaluationDuration = evaluationDuration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Operational traffic ratio for the pool.
   * @return ratio
   */
  @VsoMethod
  public Integer getRatio() {
    return ratio;
  }

  /**
   * This is the setter method to the attribute.
   * Operational traffic ratio for the pool.
   * @param ratio set the ratio.
   */
  @VsoMethod
  public void setRatio(Integer  ratio) {
    this.ratio = ratio;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of results for each deployment rule.
   * @return results
   */
  @VsoMethod
  public List<PGDeploymentRuleResult> getResults() {
    return results;
  }

  /**
   * This is the setter method. this will set the results
   * List of results for each deployment rule.
   * @return results
   */
  @VsoMethod
  public void setResults(List<PGDeploymentRuleResult>  results) {
    this.results = results;
  }

  /**
   * This is the setter method this will set the results
   * List of results for each deployment rule.
   * @return results
   */
  @VsoMethod
  public PoolDeploymentUpdateInfo addResultsItem(PGDeploymentRuleResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<PGDeploymentRuleResult>();
    }
    this.results.add(resultsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Member pool's id.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Member pool's id.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason returned in webhook callback when configured.
   * @return webhookReason
   */
  @VsoMethod
  public String getWebhookReason() {
    return webhookReason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason returned in webhook callback when configured.
   * @param webhookReason set the webhookReason.
   */
  @VsoMethod
  public void setWebhookReason(String  webhookReason) {
    this.webhookReason = webhookReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Result of webhook callback when configured.
   * @return webhookResult
   */
  @VsoMethod
  public Boolean getWebhookResult() {
    return webhookResult;
  }

  /**
   * This is the setter method to the attribute.
   * Result of webhook callback when configured.
   * @param webhookResult set the webhookResult.
   */
  @VsoMethod
  public void setWebhookResult(Boolean  webhookResult) {
    this.webhookResult = webhookResult;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PoolDeploymentUpdateInfo objPoolDeploymentUpdateInfo = (PoolDeploymentUpdateInfo) o;
  return   Objects.equals(this.uuid, objPoolDeploymentUpdateInfo.uuid)&&
  Objects.equals(this.ratio, objPoolDeploymentUpdateInfo.ratio)&&
  Objects.equals(this.results, objPoolDeploymentUpdateInfo.results)&&
  Objects.equals(this.webhookResult, objPoolDeploymentUpdateInfo.webhookResult)&&
  Objects.equals(this.webhookReason, objPoolDeploymentUpdateInfo.webhookReason)&&
  Objects.equals(this.deploymentState, objPoolDeploymentUpdateInfo.deploymentState)&&
  Objects.equals(this.evaluationDuration, objPoolDeploymentUpdateInfo.evaluationDuration);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PoolDeploymentUpdateInfo {\n");
      sb.append("    deploymentState: ").append(toIndentedString(deploymentState)).append("\n");
        sb.append("    evaluationDuration: ").append(toIndentedString(evaluationDuration)).append("\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    webhookReason: ").append(toIndentedString(webhookReason)).append("\n");
        sb.append("    webhookResult: ").append(toIndentedString(webhookResult)).append("\n");
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

