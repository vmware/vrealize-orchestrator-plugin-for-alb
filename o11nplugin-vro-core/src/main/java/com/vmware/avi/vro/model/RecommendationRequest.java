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
 * The RecommendationRequest is a POJO class extends AviRestResource that used for creating
 * RecommendationRequest.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RecommendationRequest")
@VsoFinder(name = Constants.FINDER_VRO_RECOMMENDATIONREQUEST)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RecommendationRequest extends AviRestResource {
    @JsonProperty("match_element")
    @JsonInclude(Include.NON_NULL)
    private String matchElement;

    @JsonProperty("report_timestamp")
    @JsonInclude(Include.NON_NULL)
    private String reportTimestamp;

    @JsonProperty("request_id")
    @JsonInclude(Include.NON_NULL)
    private String requestId;

    @JsonProperty("rule_id")
    @JsonInclude(Include.NON_NULL)
    private String ruleId;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type;



  /**
   * This is the getter method this will return the attribute value.
   * The match element for this a false positive should be mitigated.
   * If this is not gives, all match elements will be considered.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchElement
   */
  @VsoMethod
  public String getMatchElement() {
    return matchElement;
  }

  /**
   * This is the setter method to the attribute.
   * The match element for this a false positive should be mitigated.
   * If this is not gives, all match elements will be considered.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchElement set the matchElement.
   */
  @VsoMethod
  public void setMatchElement(String  matchElement) {
    this.matchElement = matchElement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The report_timestamp field of the log entry.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reportTimestamp
   */
  @VsoMethod
  public String getReportTimestamp() {
    return reportTimestamp;
  }

  /**
   * This is the setter method to the attribute.
   * The report_timestamp field of the log entry.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reportTimestamp set the reportTimestamp.
   */
  @VsoMethod
  public void setReportTimestamp(String  reportTimestamp) {
    this.reportTimestamp = reportTimestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The request_id field of the log entry.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestId
   */
  @VsoMethod
  public String getRequestId() {
    return requestId;
  }

  /**
   * This is the setter method to the attribute.
   * The request_id field of the log entry.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param requestId set the requestId.
   */
  @VsoMethod
  public void setRequestId(String  requestId) {
    this.requestId = requestId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The rule id for which a false positive should be mitigated.
   * If this is not given, all rules will be considered.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleId
   */
  @VsoMethod
  public String getRuleId() {
    return ruleId;
  }

  /**
   * This is the setter method to the attribute.
   * The rule id for which a false positive should be mitigated.
   * If this is not given, all rules will be considered.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ruleId set the ruleId.
   */
  @VsoMethod
  public void setRuleId(String  ruleId) {
    this.ruleId = ruleId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The type of the request, e.g.
   * Recommendation_request_false_positive.
   * Enum options - RECOMMENDATION_REQUEST_FALSE_POSITIVE.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * The type of the request, e.g.
   * Recommendation_request_false_positive.
   * Enum options - RECOMMENDATION_REQUEST_FALSE_POSITIVE.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RecommendationRequest objRecommendationRequest = (RecommendationRequest) o;
  return   Objects.equals(this.type, objRecommendationRequest.type)&&
  Objects.equals(this.reportTimestamp, objRecommendationRequest.reportTimestamp)&&
  Objects.equals(this.requestId, objRecommendationRequest.requestId)&&
  Objects.equals(this.ruleId, objRecommendationRequest.ruleId)&&
  Objects.equals(this.matchElement, objRecommendationRequest.matchElement);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RecommendationRequest {\n");
      sb.append("    matchElement: ").append(toIndentedString(matchElement)).append("\n");
        sb.append("    reportTimestamp: ").append(toIndentedString(reportTimestamp)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

