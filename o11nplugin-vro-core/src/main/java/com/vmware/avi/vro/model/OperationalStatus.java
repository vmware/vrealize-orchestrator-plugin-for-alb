package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.TimeStamp;
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
 * OperationalStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "OperationalStatus")
@VsoFinder(name = Constants.FINDER_VRO_OPERATIONALSTATUS, idAccessor = "getObjectID()")
@Service
public class OperationalStatus extends AviRestResource  {
  @JsonProperty("last_changed_time")
  private TimeStamp lastChangedTime = null;

  @JsonProperty("reason")
  @Valid
  private List<String> reason = null;

  @JsonProperty("reason_code")
  private Long reasonCode = null;

  @JsonProperty("reason_code_string")
  private String reasonCodeString = null;

  @JsonProperty("state")
  private String state = "OPER_UNAVAIL";

  
  /**
   * Placeholder for description of property last_changed_time of obj type OperationalStatus field type str  type object
   * @return lastChangedTime
  **/
  @ApiModelProperty(value = "Placeholder for description of property last_changed_time of obj type OperationalStatus field type str  type object")

  @Valid

 
  @VsoMethod  
  public TimeStamp getLastChangedTime() {
    return lastChangedTime;
  }
    
  @VsoMethod
  public void setLastChangedTime(TimeStamp lastChangedTime) {
    this.lastChangedTime = lastChangedTime;
  }

  
  public OperationalStatus addReasonItem(String reasonItem) {
    if (this.reason == null) {
      this.reason = new ArrayList<String>();
    }
    this.reason.add(reasonItem);
    return this;
  }
  
  /**
   * reason of OperationalStatus.
   * @return reason
  **/
  @ApiModelProperty(value = "reason of OperationalStatus.")


 
  @VsoMethod  
  public List<String> getReason() {
    return reason;
  }
    
  @VsoMethod
  public void setReason(List<String> reason) {
    this.reason = reason;
  }

  
  /**
   * Number of reason_code.
   * @return reasonCode
  **/
  @ApiModelProperty(value = "Number of reason_code.")


 
  @VsoMethod  
  public Long getReasonCode() {
    return reasonCode;
  }
    
  @VsoMethod
  public void setReasonCode(Long reasonCode) {
    this.reasonCode = reasonCode;
  }

  
  /**
   * reason_code_string of OperationalStatus.
   * @return reasonCodeString
  **/
  @ApiModelProperty(value = "reason_code_string of OperationalStatus.")


 
  @VsoMethod  
  public String getReasonCodeString() {
    return reasonCodeString;
  }
    
  @VsoMethod
  public void setReasonCodeString(String reasonCodeString) {
    this.reasonCodeString = reasonCodeString;
  }

  
  /**
   *  Enum options - OPER_UP, OPER_DOWN, OPER_CREATING, OPER_RESOURCES, OPER_INACTIVE, OPER_DISABLED, OPER_UNUSED, OPER_UNKNOWN, OPER_PROCESSING, OPER_INITIALIZING, OPER_ERROR_DISABLED, OPER_AWAIT_MANUAL_PLACEMENT, OPER_UPGRADING, OPER_SE_PROCESSING, OPER_PARTITIONED, OPER_DISABLING, OPER_FAILED, OPER_UNAVAIL.
   * @return state
  **/
  @ApiModelProperty(value = " Enum options - OPER_UP, OPER_DOWN, OPER_CREATING, OPER_RESOURCES, OPER_INACTIVE, OPER_DISABLED, OPER_UNUSED, OPER_UNKNOWN, OPER_PROCESSING, OPER_INITIALIZING, OPER_ERROR_DISABLED, OPER_AWAIT_MANUAL_PLACEMENT, OPER_UPGRADING, OPER_SE_PROCESSING, OPER_PARTITIONED, OPER_DISABLING, OPER_FAILED, OPER_UNAVAIL.")


 
  @VsoMethod  
  public String getState() {
    return state;
  }
    
  @VsoMethod
  public void setState(String state) {
    this.state = state;
  }

  
  public String getObjectID() {
		return "OperationalStatus";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalStatus operationalStatus = (OperationalStatus) o;
    return Objects.equals(this.lastChangedTime, operationalStatus.lastChangedTime) &&
        Objects.equals(this.reason, operationalStatus.reason) &&
        Objects.equals(this.reasonCode, operationalStatus.reasonCode) &&
        Objects.equals(this.reasonCodeString, operationalStatus.reasonCodeString) &&
        Objects.equals(this.state, operationalStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastChangedTime, reason, reasonCode, reasonCodeString, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalStatus {\n");
    
    sb.append("    lastChangedTime: ").append(toIndentedString(lastChangedTime)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonCodeString: ").append(toIndentedString(reasonCodeString)).append("\n");
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

