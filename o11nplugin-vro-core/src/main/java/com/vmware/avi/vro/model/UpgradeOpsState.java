package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.TimeStamp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * UpgradeOpsState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "UpgradeOpsState")
@VsoFinder(name = Constants.FINDER_VRO_UPGRADEOPSSTATE, idAccessor = "getObjectID()")
@Service
public class UpgradeOpsState extends AviRestResource  {
  @JsonProperty("last_changed_time")
  private TimeStamp lastChangedTime = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("state")
  private String state = null;

  
  /**
   * The last time the state changed. Field introduced in 18.2.6.
   * @return lastChangedTime
  **/
  @ApiModelProperty(value = "The last time the state changed. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public TimeStamp getLastChangedTime() {
    return lastChangedTime;
  }
    
  @VsoMethod
  public void setLastChangedTime(TimeStamp lastChangedTime) {
    this.lastChangedTime = lastChangedTime;
  }

  
  /**
   * Descriptive reason for the state-change. Field introduced in 18.2.6.
   * @return reason
  **/
  @ApiModelProperty(value = "Descriptive reason for the state-change. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getReason() {
    return reason;
  }
    
  @VsoMethod
  public void setReason(String reason) {
    this.reason = reason;
  }

  
  /**
   * The upgrade operations current fsm-state. Enum options - UPGRADE_FSM_INIT, UPGRADE_FSM_STARTED, UPGRADE_FSM_WAITING, UPGRADE_FSM_IN_PROGRESS, UPGRADE_FSM_ENQUEUED, UPGRADE_FSM_ERROR, UPGRADE_FSM_SUSPENDED, UPGRADE_FSM_ENQUEUE_FAILED, UPGRADE_FSM_PAUSED, UPGRADE_FSM_COMPLETED, UPGRADE_FSM_ABORT_IN_PROGRESS, UPGRADE_FSM_ABORTED, UPGRADE_FSM_DUMMY_1, UPGRADE_FSM_DUMMY_2, UPGRADE_FSM_DUMMY_3, UPGRADE_FSM_DUMMY_4, UPGRADE_FSM_DUMMY_5. Field introduced in 18.2.6.
   * @return state
  **/
  @ApiModelProperty(value = "The upgrade operations current fsm-state. Enum options - UPGRADE_FSM_INIT, UPGRADE_FSM_STARTED, UPGRADE_FSM_WAITING, UPGRADE_FSM_IN_PROGRESS, UPGRADE_FSM_ENQUEUED, UPGRADE_FSM_ERROR, UPGRADE_FSM_SUSPENDED, UPGRADE_FSM_ENQUEUE_FAILED, UPGRADE_FSM_PAUSED, UPGRADE_FSM_COMPLETED, UPGRADE_FSM_ABORT_IN_PROGRESS, UPGRADE_FSM_ABORTED, UPGRADE_FSM_DUMMY_1, UPGRADE_FSM_DUMMY_2, UPGRADE_FSM_DUMMY_3, UPGRADE_FSM_DUMMY_4, UPGRADE_FSM_DUMMY_5. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getState() {
    return state;
  }
    
  @VsoMethod
  public void setState(String state) {
    this.state = state;
  }

  
  public String getObjectID() {
		return "UpgradeOpsState";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeOpsState upgradeOpsState = (UpgradeOpsState) o;
    return Objects.equals(this.lastChangedTime, upgradeOpsState.lastChangedTime) &&
        Objects.equals(this.reason, upgradeOpsState.reason) &&
        Objects.equals(this.state, upgradeOpsState.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastChangedTime, reason, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeOpsState {\n");
    
    sb.append("    lastChangedTime: ").append(toIndentedString(lastChangedTime)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

