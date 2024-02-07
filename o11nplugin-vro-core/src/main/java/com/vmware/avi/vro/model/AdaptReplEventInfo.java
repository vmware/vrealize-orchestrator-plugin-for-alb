package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ConfigVersionStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AdaptReplEventInfo is a POJO class extends AviRestResource that used for creating
 * AdaptReplEventInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AdaptReplEventInfo")
@VsoFinder(name = Constants.FINDER_VRO_ADAPTREPLEVENTINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AdaptReplEventInfo extends AviRestResource {
    @JsonProperty("obj_info")
    @JsonInclude(Include.NON_NULL)
    private ConfigVersionStatus objInfo;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason;

    @JsonProperty("recommendation")
    @JsonInclude(Include.NON_NULL)
    private String recommendation;



  /**
   * This is the getter method this will return the attribute value.
   * Object config version info.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objInfo
   */
  @VsoMethod
  public ConfigVersionStatus getObjInfo() {
    return objInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Object config version info.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objInfo set the objInfo.
   */
  @VsoMethod
  public void setObjInfo(ConfigVersionStatus objInfo) {
    this.objInfo = objInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for the replication issues.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for the replication issues.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Recommended way to resolve replication issue.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return recommendation
   */
  @VsoMethod
  public String getRecommendation() {
    return recommendation;
  }

  /**
   * This is the setter method to the attribute.
   * Recommended way to resolve replication issue.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param recommendation set the recommendation.
   */
  @VsoMethod
  public void setRecommendation(String  recommendation) {
    this.recommendation = recommendation;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AdaptReplEventInfo objAdaptReplEventInfo = (AdaptReplEventInfo) o;
  return   Objects.equals(this.objInfo, objAdaptReplEventInfo.objInfo)&&
  Objects.equals(this.reason, objAdaptReplEventInfo.reason)&&
  Objects.equals(this.recommendation, objAdaptReplEventInfo.recommendation);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AdaptReplEventInfo {\n");
      sb.append("    objInfo: ").append(toIndentedString(objInfo)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
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

