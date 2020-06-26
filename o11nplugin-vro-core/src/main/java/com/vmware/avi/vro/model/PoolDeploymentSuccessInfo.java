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
 * The PoolDeploymentSuccessInfo is a POJO class extends AviRestResource that used for creating
 * PoolDeploymentSuccessInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PoolDeploymentSuccessInfo")
@VsoFinder(name = Constants.FINDER_VRO_POOLDEPLOYMENTSUCCESSINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PoolDeploymentSuccessInfo extends AviRestResource {
  @JsonProperty("prev_in_service_pool_name")
  @JsonInclude(Include.NON_NULL)
  private String prevInServicePoolName = null;

  @JsonProperty("prev_in_service_pool_ref")
  @JsonInclude(Include.NON_NULL)
  private String prevInServicePoolRef = null;

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
   * Previous pool in service.
   * Field introduced in 18.1.1.
   * @return prevInServicePoolName
   */
  @VsoMethod
  public String getPrevInServicePoolName() {
    return prevInServicePoolName;
  }

  /**
   * This is the setter method to the attribute.
   * Previous pool in service.
   * Field introduced in 18.1.1.
   * @param prevInServicePoolName set the prevInServicePoolName.
   */
  @VsoMethod
  public void setPrevInServicePoolName(String  prevInServicePoolName) {
    this.prevInServicePoolName = prevInServicePoolName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Previous pool in service.
   * It is a reference to an object of type pool.
   * @return prevInServicePoolRef
   */
  @VsoMethod
  public String getPrevInServicePoolRef() {
    return prevInServicePoolRef;
  }

  /**
   * This is the setter method to the attribute.
   * Previous pool in service.
   * It is a reference to an object of type pool.
   * @param prevInServicePoolRef set the prevInServicePoolRef.
   */
  @VsoMethod
  public void setPrevInServicePoolRef(String  prevInServicePoolRef) {
    this.prevInServicePoolRef = prevInServicePoolRef;
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
  public PoolDeploymentSuccessInfo addResultsItem(PGDeploymentRuleResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<PGDeploymentRuleResult>();
    }
    this.results.add(resultsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Pool's id.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Pool's id.
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
  PoolDeploymentSuccessInfo objPoolDeploymentSuccessInfo = (PoolDeploymentSuccessInfo) o;
  return   Objects.equals(this.prevInServicePoolName, objPoolDeploymentSuccessInfo.prevInServicePoolName)&&
  Objects.equals(this.ratio, objPoolDeploymentSuccessInfo.ratio)&&
  Objects.equals(this.uuid, objPoolDeploymentSuccessInfo.uuid)&&
  Objects.equals(this.prevInServicePoolRef, objPoolDeploymentSuccessInfo.prevInServicePoolRef)&&
  Objects.equals(this.results, objPoolDeploymentSuccessInfo.results)&&
  Objects.equals(this.webhookResult, objPoolDeploymentSuccessInfo.webhookResult)&&
  Objects.equals(this.webhookReason, objPoolDeploymentSuccessInfo.webhookReason);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PoolDeploymentSuccessInfo {\n");
      sb.append("    prevInServicePoolName: ").append(toIndentedString(prevInServicePoolName)).append("\n");
        sb.append("    prevInServicePoolRef: ").append(toIndentedString(prevInServicePoolRef)).append("\n");
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
