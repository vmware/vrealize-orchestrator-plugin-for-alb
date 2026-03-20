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
 * The SeAutoScalerEventDetails is a POJO class extends AviRestResource that used for creating
 * SeAutoScalerEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeAutoScalerEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEAUTOSCALEREVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeAutoScalerEventDetails extends AviRestResource {
    @JsonProperty("actions")
    @JsonInclude(Include.NON_NULL)
    private List<VipAction> actions;

    @JsonProperty("request_source")
    @JsonInclude(Include.NON_NULL)
    private String requestSource;

    @JsonProperty("se_group_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seGroupUuid;



  /**
   * This is the getter method this will return the attribute value.
   * Actions generated for the request.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public List<VipAction> getActions() {
    return actions;
  }

  /**
   * This is the setter method. this will set the actions
   * Actions generated for the request.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public void setActions(List<VipAction>  actions) {
    this.actions = actions;
  }

  /**
   * This is the setter method this will set the actions
   * Actions generated for the request.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public SeAutoScalerEventDetails addActionsItem(VipAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<VipAction>();
    }
    this.actions.add(actionsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Source of the rebalance request i.e se autoscaler auto rebalance, se autoscaler user manual rebalance etc.
   * Enum options - SE_AUTOSCALER_AUTO_REBALANCE, SE_AUTOSCALER_USER_MANUAL_REBALANCE.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestSource
   */
  @VsoMethod
  public String getRequestSource() {
    return requestSource;
  }

  /**
   * This is the setter method to the attribute.
   * Source of the rebalance request i.e se autoscaler auto rebalance, se autoscaler user manual rebalance etc.
   * Enum options - SE_AUTOSCALER_AUTO_REBALANCE, SE_AUTOSCALER_USER_MANUAL_REBALANCE.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param requestSource set the requestSource.
   */
  @VsoMethod
  public void setRequestSource(String  requestSource) {
    this.requestSource = requestSource;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Segroup uuid.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupUuid
   */
  @VsoMethod
  public String getSeGroupUuid() {
    return seGroupUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Segroup uuid.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupUuid set the seGroupUuid.
   */
  @VsoMethod
  public void setSeGroupUuid(String  seGroupUuid) {
    this.seGroupUuid = seGroupUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeAutoScalerEventDetails objSeAutoScalerEventDetails = (SeAutoScalerEventDetails) o;
  return   Objects.equals(this.seGroupUuid, objSeAutoScalerEventDetails.seGroupUuid)&&
  Objects.equals(this.requestSource, objSeAutoScalerEventDetails.requestSource)&&
  Objects.equals(this.actions, objSeAutoScalerEventDetails.actions);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeAutoScalerEventDetails {\n");
      sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    requestSource: ").append(toIndentedString(requestSource)).append("\n");
        sb.append("    seGroupUuid: ").append(toIndentedString(seGroupUuid)).append("\n");
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

