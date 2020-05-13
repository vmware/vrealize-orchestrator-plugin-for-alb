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
 * SeAgentStateCacheProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeAgentStateCacheProperties")
@VsoFinder(name = Constants.FINDER_VRO_SEAGENTSTATECACHEPROPERTIES, idAccessor = "getObjectID()")
@Service
public class SeAgentStateCacheProperties extends AviRestResource  {
  @JsonProperty("sc_batch_buffer_flush_limit")
  private Integer scBatchBufferFlushLimit = 300;

  @JsonProperty("sc_shard_cleanup_max_time")
  private Integer scShardCleanupMaxTime = 900;

  @JsonProperty("sc_state_ring_batch_dequeue_limit")
  private Integer scStateRingBatchDequeueLimit = 300;

  @JsonProperty("sc_states_flush_interval")
  private Integer scStatesFlushInterval = 100;

  @JsonProperty("sc_stream_check_interval")
  private Integer scStreamCheckInterval = 5000;

  @JsonProperty("sc_thread_q_batch_dequeue_limit")
  private Integer scThreadQBatchDequeueLimit = 100;

  @JsonProperty("sc_thread_q_max_size")
  private Integer scThreadQMaxSize = 4096;

  @JsonProperty("sc_thread_sleep_interval")
  private Integer scThreadSleepInterval = 10;

  
  /**
   * Max elements to flush in one shot from the internal buffer by the statecache thread. Allowed values are 1-10000. Field introduced in 18.2.5.
   * @return scBatchBufferFlushLimit
  **/
  @ApiModelProperty(value = "Max elements to flush in one shot from the internal buffer by the statecache thread. Allowed values are 1-10000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getScBatchBufferFlushLimit() {
    return scBatchBufferFlushLimit;
  }
    
  @VsoMethod
  public void setScBatchBufferFlushLimit(Integer scBatchBufferFlushLimit) {
    this.scBatchBufferFlushLimit = scBatchBufferFlushLimit;
  }

  
  /**
   * Max time to wait by the statecache thread before cleaning up connection to the controller shard. Allowed values are 1-1000000. Field introduced in 18.2.5.
   * @return scShardCleanupMaxTime
  **/
  @ApiModelProperty(value = "Max time to wait by the statecache thread before cleaning up connection to the controller shard. Allowed values are 1-1000000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getScShardCleanupMaxTime() {
    return scShardCleanupMaxTime;
  }
    
  @VsoMethod
  public void setScShardCleanupMaxTime(Integer scShardCleanupMaxTime) {
    this.scShardCleanupMaxTime = scShardCleanupMaxTime;
  }

  
  /**
   * Max elements to dequeue in one shot from the state_ring by the statecache thread. Allowed values are 1-10000. Field introduced in 18.2.5.
   * @return scStateRingBatchDequeueLimit
  **/
  @ApiModelProperty(value = "Max elements to dequeue in one shot from the state_ring by the statecache thread. Allowed values are 1-10000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getScStateRingBatchDequeueLimit() {
    return scStateRingBatchDequeueLimit;
  }
    
  @VsoMethod
  public void setScStateRingBatchDequeueLimit(Integer scStateRingBatchDequeueLimit) {
    this.scStateRingBatchDequeueLimit = scStateRingBatchDequeueLimit;
  }

  
  /**
   * Interval for update of operational states to controller. Allowed values are 1-10000. Field introduced in 18.2.5.
   * @return scStatesFlushInterval
  **/
  @ApiModelProperty(value = "Interval for update of operational states to controller. Allowed values are 1-10000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getScStatesFlushInterval() {
    return scStatesFlushInterval;
  }
    
  @VsoMethod
  public void setScStatesFlushInterval(Integer scStatesFlushInterval) {
    this.scStatesFlushInterval = scStatesFlushInterval;
  }

  
  /**
   * Interval for checking health of grpc streams to statecache_mgr. Allowed values are 1-90000. Field introduced in 18.2.5.
   * @return scStreamCheckInterval
  **/
  @ApiModelProperty(value = "Interval for checking health of grpc streams to statecache_mgr. Allowed values are 1-90000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getScStreamCheckInterval() {
    return scStreamCheckInterval;
  }
    
  @VsoMethod
  public void setScStreamCheckInterval(Integer scStreamCheckInterval) {
    this.scStreamCheckInterval = scStreamCheckInterval;
  }

  
  /**
   * Max elements to dequeue in one shot from the Q by the statecache thread. Allowed values are 1-10000. Field introduced in 18.2.5.
   * @return scThreadQBatchDequeueLimit
  **/
  @ApiModelProperty(value = "Max elements to dequeue in one shot from the Q by the statecache thread. Allowed values are 1-10000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getScThreadQBatchDequeueLimit() {
    return scThreadQBatchDequeueLimit;
  }
    
  @VsoMethod
  public void setScThreadQBatchDequeueLimit(Integer scThreadQBatchDequeueLimit) {
    this.scThreadQBatchDequeueLimit = scThreadQBatchDequeueLimit;
  }

  
  /**
   * Max elements in the Q between seagent main and the statecache thread. Allowed values are 1-10000. Field introduced in 18.2.5.
   * @return scThreadQMaxSize
  **/
  @ApiModelProperty(value = "Max elements in the Q between seagent main and the statecache thread. Allowed values are 1-10000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getScThreadQMaxSize() {
    return scThreadQMaxSize;
  }
    
  @VsoMethod
  public void setScThreadQMaxSize(Integer scThreadQMaxSize) {
    this.scThreadQMaxSize = scThreadQMaxSize;
  }

  
  /**
   * Interval for grpc thread to sleep between doing work. Allowed values are 1-10000. Field introduced in 18.2.5.
   * @return scThreadSleepInterval
  **/
  @ApiModelProperty(value = "Interval for grpc thread to sleep between doing work. Allowed values are 1-10000. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getScThreadSleepInterval() {
    return scThreadSleepInterval;
  }
    
  @VsoMethod
  public void setScThreadSleepInterval(Integer scThreadSleepInterval) {
    this.scThreadSleepInterval = scThreadSleepInterval;
  }

  
  public String getObjectID() {
		return "SeAgentStateCacheProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeAgentStateCacheProperties seAgentStateCacheProperties = (SeAgentStateCacheProperties) o;
    return Objects.equals(this.scBatchBufferFlushLimit, seAgentStateCacheProperties.scBatchBufferFlushLimit) &&
        Objects.equals(this.scShardCleanupMaxTime, seAgentStateCacheProperties.scShardCleanupMaxTime) &&
        Objects.equals(this.scStateRingBatchDequeueLimit, seAgentStateCacheProperties.scStateRingBatchDequeueLimit) &&
        Objects.equals(this.scStatesFlushInterval, seAgentStateCacheProperties.scStatesFlushInterval) &&
        Objects.equals(this.scStreamCheckInterval, seAgentStateCacheProperties.scStreamCheckInterval) &&
        Objects.equals(this.scThreadQBatchDequeueLimit, seAgentStateCacheProperties.scThreadQBatchDequeueLimit) &&
        Objects.equals(this.scThreadQMaxSize, seAgentStateCacheProperties.scThreadQMaxSize) &&
        Objects.equals(this.scThreadSleepInterval, seAgentStateCacheProperties.scThreadSleepInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scBatchBufferFlushLimit, scShardCleanupMaxTime, scStateRingBatchDequeueLimit, scStatesFlushInterval, scStreamCheckInterval, scThreadQBatchDequeueLimit, scThreadQMaxSize, scThreadSleepInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeAgentStateCacheProperties {\n");
    
    sb.append("    scBatchBufferFlushLimit: ").append(toIndentedString(scBatchBufferFlushLimit)).append("\n");
    sb.append("    scShardCleanupMaxTime: ").append(toIndentedString(scShardCleanupMaxTime)).append("\n");
    sb.append("    scStateRingBatchDequeueLimit: ").append(toIndentedString(scStateRingBatchDequeueLimit)).append("\n");
    sb.append("    scStatesFlushInterval: ").append(toIndentedString(scStatesFlushInterval)).append("\n");
    sb.append("    scStreamCheckInterval: ").append(toIndentedString(scStreamCheckInterval)).append("\n");
    sb.append("    scThreadQBatchDequeueLimit: ").append(toIndentedString(scThreadQBatchDequeueLimit)).append("\n");
    sb.append("    scThreadQMaxSize: ").append(toIndentedString(scThreadQMaxSize)).append("\n");
    sb.append("    scThreadSleepInterval: ").append(toIndentedString(scThreadSleepInterval)).append("\n");
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

