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
 * The CC_AgentProperties is a POJO class extends AviRestResource that used for creating
 * CC_AgentProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CC_AgentProperties")
@VsoFinder(name = Constants.FINDER_VRO_CC_AGENTPROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CC_AgentProperties extends AviRestResource {
  @JsonProperty("async_retries")
  @JsonInclude(Include.NON_NULL)
  private Integer asyncRetries = 5;

  @JsonProperty("async_retries_delay")
  @JsonInclude(Include.NON_NULL)
  private Integer asyncRetriesDelay = 10;

  @JsonProperty("poll_duration_target")
  @JsonInclude(Include.NON_NULL)
  private Integer pollDurationTarget = 10;

  @JsonProperty("poll_fast_target")
  @JsonInclude(Include.NON_NULL)
  private Integer pollFastTarget = 60;

  @JsonProperty("poll_slow_target")
  @JsonInclude(Include.NON_NULL)
  private Integer pollSlowTarget = 240;

  @JsonProperty("vnic_retries")
  @JsonInclude(Include.NON_NULL)
  private Integer vnicRetries = 60;

  @JsonProperty("vnic_retries_delay")
  @JsonInclude(Include.NON_NULL)
  private Integer vnicRetriesDelay = 5;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum polls to check for async jobs to finish.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return asyncRetries
   */
  @VsoMethod
  public Integer getAsyncRetries() {
    return asyncRetries;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum polls to check for async jobs to finish.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param asyncRetries set the asyncRetries.
   */
  @VsoMethod
  public void setAsyncRetries(Integer  asyncRetries) {
    this.asyncRetries = asyncRetries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Delay between each async job status poll check.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return asyncRetriesDelay
   */
  @VsoMethod
  public Integer getAsyncRetriesDelay() {
    return asyncRetriesDelay;
  }

  /**
   * This is the setter method to the attribute.
   * Delay between each async job status poll check.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param asyncRetriesDelay set the asyncRetriesDelay.
   */
  @VsoMethod
  public void setAsyncRetriesDelay(Integer  asyncRetriesDelay) {
    this.asyncRetriesDelay = asyncRetriesDelay;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Discovery poll target duration; a scale factor of 1+ is computed with the actual discovery (actual/target) and used to tweak slow and fast poll
   * intervals.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return pollDurationTarget
   */
  @VsoMethod
  public Integer getPollDurationTarget() {
    return pollDurationTarget;
  }

  /**
   * This is the setter method to the attribute.
   * Discovery poll target duration; a scale factor of 1+ is computed with the actual discovery (actual/target) and used to tweak slow and fast poll
   * intervals.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param pollDurationTarget set the pollDurationTarget.
   */
  @VsoMethod
  public void setPollDurationTarget(Integer  pollDurationTarget) {
    this.pollDurationTarget = pollDurationTarget;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Fast poll interval.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return pollFastTarget
   */
  @VsoMethod
  public Integer getPollFastTarget() {
    return pollFastTarget;
  }

  /**
   * This is the setter method to the attribute.
   * Fast poll interval.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param pollFastTarget set the pollFastTarget.
   */
  @VsoMethod
  public void setPollFastTarget(Integer  pollFastTarget) {
    this.pollFastTarget = pollFastTarget;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Slow poll interval.
   * Default value when not specified in API or module is interpreted by Avi Controller as 240.
   * @return pollSlowTarget
   */
  @VsoMethod
  public Integer getPollSlowTarget() {
    return pollSlowTarget;
  }

  /**
   * This is the setter method to the attribute.
   * Slow poll interval.
   * Default value when not specified in API or module is interpreted by Avi Controller as 240.
   * @param pollSlowTarget set the pollSlowTarget.
   */
  @VsoMethod
  public void setPollSlowTarget(Integer  pollSlowTarget) {
    this.pollSlowTarget = pollSlowTarget;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum polls to check for vnics to be attached to vm.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return vnicRetries
   */
  @VsoMethod
  public Integer getVnicRetries() {
    return vnicRetries;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum polls to check for vnics to be attached to vm.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param vnicRetries set the vnicRetries.
   */
  @VsoMethod
  public void setVnicRetries(Integer  vnicRetries) {
    this.vnicRetries = vnicRetries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Delay between each vnic status poll check.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return vnicRetriesDelay
   */
  @VsoMethod
  public Integer getVnicRetriesDelay() {
    return vnicRetriesDelay;
  }

  /**
   * This is the setter method to the attribute.
   * Delay between each vnic status poll check.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param vnicRetriesDelay set the vnicRetriesDelay.
   */
  @VsoMethod
  public void setVnicRetriesDelay(Integer  vnicRetriesDelay) {
    this.vnicRetriesDelay = vnicRetriesDelay;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CC_AgentProperties objCC_AgentProperties = (CC_AgentProperties) o;
  return   Objects.equals(this.vnicRetriesDelay, objCC_AgentProperties.vnicRetriesDelay)&&
  Objects.equals(this.asyncRetriesDelay, objCC_AgentProperties.asyncRetriesDelay)&&
  Objects.equals(this.vnicRetries, objCC_AgentProperties.vnicRetries)&&
  Objects.equals(this.pollDurationTarget, objCC_AgentProperties.pollDurationTarget)&&
  Objects.equals(this.pollSlowTarget, objCC_AgentProperties.pollSlowTarget)&&
  Objects.equals(this.pollFastTarget, objCC_AgentProperties.pollFastTarget)&&
  Objects.equals(this.asyncRetries, objCC_AgentProperties.asyncRetries);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CC_AgentProperties {\n");
      sb.append("    asyncRetries: ").append(toIndentedString(asyncRetries)).append("\n");
        sb.append("    asyncRetriesDelay: ").append(toIndentedString(asyncRetriesDelay)).append("\n");
        sb.append("    pollDurationTarget: ").append(toIndentedString(pollDurationTarget)).append("\n");
        sb.append("    pollFastTarget: ").append(toIndentedString(pollFastTarget)).append("\n");
        sb.append("    pollSlowTarget: ").append(toIndentedString(pollSlowTarget)).append("\n");
        sb.append("    vnicRetries: ").append(toIndentedString(vnicRetries)).append("\n");
        sb.append("    vnicRetriesDelay: ").append(toIndentedString(vnicRetriesDelay)).append("\n");
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

