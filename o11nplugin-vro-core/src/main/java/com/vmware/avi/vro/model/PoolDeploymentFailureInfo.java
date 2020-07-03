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
 * The PoolDeploymentFailureInfo is a POJO class extends AviRestResource that used for creating
 * PoolDeploymentFailureInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PoolDeploymentFailureInfo")
@VsoFinder(name = Constants.FINDER_VRO_POOLDEPLOYMENTFAILUREINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PoolDeploymentFailureInfo extends AviRestResource {
  @JsonProperty("curr_in_service_pool_name")
  @JsonInclude(Include.NON_NULL)
  private String currInServicePoolName = null;

  @JsonProperty("curr_in_service_pool_ref")
  @JsonInclude(Include.NON_NULL)
  private String currInServicePoolRef = null;

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
   * Curent in-service pool.
   * It is a reference to an object of type pool.
   * @return currInServicePoolName
   */
  @VsoMethod
  public String getCurrInServicePoolName() {
    return currInServicePoolName;
  }

  /**
   * This is the setter method to the attribute.
   * Curent in-service pool.
   * It is a reference to an object of type pool.
   * @param currInServicePoolName set the currInServicePoolName.
   */
  @VsoMethod
  public void setCurrInServicePoolName(String  currInServicePoolName) {
    this.currInServicePoolName = currInServicePoolName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Curent in service pool.
   * It is a reference to an object of type pool.
   * @return currInServicePoolRef
   */
  @VsoMethod
  public String getCurrInServicePoolRef() {
    return currInServicePoolRef;
  }

  /**
   * This is the setter method to the attribute.
   * Curent in service pool.
   * It is a reference to an object of type pool.
   * @param currInServicePoolRef set the currInServicePoolRef.
   */
  @VsoMethod
  public void setCurrInServicePoolRef(String  currInServicePoolRef) {
    this.currInServicePoolRef = currInServicePoolRef;
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
   * Placeholder for description of property results of obj type pooldeploymentfailureinfo field type str  type array.
   * @return results
   */
  @VsoMethod
  public List<PGDeploymentRuleResult> getResults() {
    return results;
  }

  /**
   * This is the setter method. this will set the results
   * Placeholder for description of property results of obj type pooldeploymentfailureinfo field type str  type array.
   * @return results
   */
  @VsoMethod
  public void setResults(List<PGDeploymentRuleResult>  results) {
    this.results = results;
  }

  /**
   * This is the setter method this will set the results
   * Placeholder for description of property results of obj type pooldeploymentfailureinfo field type str  type array.
   * @return results
   */
  @VsoMethod
  public PoolDeploymentFailureInfo addResultsItem(PGDeploymentRuleResult resultsItem) {
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
  PoolDeploymentFailureInfo objPoolDeploymentFailureInfo = (PoolDeploymentFailureInfo) o;
  return   Objects.equals(this.ratio, objPoolDeploymentFailureInfo.ratio)&&
  Objects.equals(this.uuid, objPoolDeploymentFailureInfo.uuid)&&
  Objects.equals(this.results, objPoolDeploymentFailureInfo.results)&&
  Objects.equals(this.webhookResult, objPoolDeploymentFailureInfo.webhookResult)&&
  Objects.equals(this.currInServicePoolName, objPoolDeploymentFailureInfo.currInServicePoolName)&&
  Objects.equals(this.webhookReason, objPoolDeploymentFailureInfo.webhookReason)&&
  Objects.equals(this.currInServicePoolRef, objPoolDeploymentFailureInfo.currInServicePoolRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PoolDeploymentFailureInfo {\n");
      sb.append("    currInServicePoolName: ").append(toIndentedString(currInServicePoolName)).append("\n");
        sb.append("    currInServicePoolRef: ").append(toIndentedString(currInServicePoolRef)).append("\n");
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
