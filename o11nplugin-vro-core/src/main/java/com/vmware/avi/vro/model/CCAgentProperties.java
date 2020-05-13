package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * CCAgentProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CCAgentProperties")
@VsoFinder(name = Constants.FINDER_VRO_CCAGENTPROPERTIES, idAccessor = "getObjectID()")
@Service
public class CCAgentProperties extends AviRestResource  {
  @JsonProperty("async_retries")
  private Integer asyncRetries = 5;

  @JsonProperty("async_retries_delay")
  private Integer asyncRetriesDelay = 10;

  @JsonProperty("poll_duration_target")
  private Integer pollDurationTarget = 10;

  @JsonProperty("poll_fast_target")
  private Integer pollFastTarget = 60;

  @JsonProperty("poll_slow_target")
  private Integer pollSlowTarget = 240;

  @JsonProperty("vnic_retries")
  private Integer vnicRetries = 60;

  @JsonProperty("vnic_retries_delay")
  private Integer vnicRetriesDelay = 5;

  
  /**
   * Maximum polls to check for async jobs to finish.
   * @return asyncRetries
  **/
  @ApiModelProperty(value = "Maximum polls to check for async jobs to finish.")


 
  @VsoMethod  
  public Integer getAsyncRetries() {
    return asyncRetries;
  }
    
  @VsoMethod
  public void setAsyncRetries(Integer asyncRetries) {
    this.asyncRetries = asyncRetries;
  }

  
  /**
   * Delay between each async job status poll check.
   * @return asyncRetriesDelay
  **/
  @ApiModelProperty(value = "Delay between each async job status poll check.")


 
  @VsoMethod  
  public Integer getAsyncRetriesDelay() {
    return asyncRetriesDelay;
  }
    
  @VsoMethod
  public void setAsyncRetriesDelay(Integer asyncRetriesDelay) {
    this.asyncRetriesDelay = asyncRetriesDelay;
  }

  
  /**
   * Discovery poll target duration; a scale factor of 1+ is computed with the actual discovery (actual/target) and used to tweak slow and fast poll intervals.
   * @return pollDurationTarget
  **/
  @ApiModelProperty(value = "Discovery poll target duration; a scale factor of 1+ is computed with the actual discovery (actual/target) and used to tweak slow and fast poll intervals.")


 
  @VsoMethod  
  public Integer getPollDurationTarget() {
    return pollDurationTarget;
  }
    
  @VsoMethod
  public void setPollDurationTarget(Integer pollDurationTarget) {
    this.pollDurationTarget = pollDurationTarget;
  }

  
  /**
   * Fast poll interval.
   * @return pollFastTarget
  **/
  @ApiModelProperty(value = "Fast poll interval.")


 
  @VsoMethod  
  public Integer getPollFastTarget() {
    return pollFastTarget;
  }
    
  @VsoMethod
  public void setPollFastTarget(Integer pollFastTarget) {
    this.pollFastTarget = pollFastTarget;
  }

  
  /**
   * Slow poll interval.
   * @return pollSlowTarget
  **/
  @ApiModelProperty(value = "Slow poll interval.")


 
  @VsoMethod  
  public Integer getPollSlowTarget() {
    return pollSlowTarget;
  }
    
  @VsoMethod
  public void setPollSlowTarget(Integer pollSlowTarget) {
    this.pollSlowTarget = pollSlowTarget;
  }

  
  /**
   * Maximum polls to check for vnics to be attached to VM.
   * @return vnicRetries
  **/
  @ApiModelProperty(value = "Maximum polls to check for vnics to be attached to VM.")


 
  @VsoMethod  
  public Integer getVnicRetries() {
    return vnicRetries;
  }
    
  @VsoMethod
  public void setVnicRetries(Integer vnicRetries) {
    this.vnicRetries = vnicRetries;
  }

  
  /**
   * Delay between each vnic status poll check.
   * @return vnicRetriesDelay
  **/
  @ApiModelProperty(value = "Delay between each vnic status poll check.")


 
  @VsoMethod  
  public Integer getVnicRetriesDelay() {
    return vnicRetriesDelay;
  }
    
  @VsoMethod
  public void setVnicRetriesDelay(Integer vnicRetriesDelay) {
    this.vnicRetriesDelay = vnicRetriesDelay;
  }

  
  public String getObjectID() {
		return "CCAgentProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CCAgentProperties ccAgentProperties = (CCAgentProperties) o;
    return Objects.equals(this.asyncRetries, ccAgentProperties.asyncRetries) &&
        Objects.equals(this.asyncRetriesDelay, ccAgentProperties.asyncRetriesDelay) &&
        Objects.equals(this.pollDurationTarget, ccAgentProperties.pollDurationTarget) &&
        Objects.equals(this.pollFastTarget, ccAgentProperties.pollFastTarget) &&
        Objects.equals(this.pollSlowTarget, ccAgentProperties.pollSlowTarget) &&
        Objects.equals(this.vnicRetries, ccAgentProperties.vnicRetries) &&
        Objects.equals(this.vnicRetriesDelay, ccAgentProperties.vnicRetriesDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asyncRetries, asyncRetriesDelay, pollDurationTarget, pollFastTarget, pollSlowTarget, vnicRetries, vnicRetriesDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CCAgentProperties {\n");
    
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

