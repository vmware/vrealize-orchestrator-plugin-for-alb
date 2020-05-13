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
 * PoolGroupMember
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PoolGroupMember")
@VsoFinder(name = Constants.FINDER_VRO_POOLGROUPMEMBER, idAccessor = "getObjectID()")
@Service
public class PoolGroupMember extends AviRestResource  {
  @JsonProperty("deployment_state")
  private String deploymentState = null;

  @JsonProperty("pool_ref")
  private String poolRef = null;

  @JsonProperty("priority_label")
  private String priorityLabel = null;

  @JsonProperty("ratio")
  private Integer ratio = 1;

  
  /**
   * Pool deployment state used with the PG deployment policy. Enum options - EVALUATION_IN_PROGRESS, IN_SERVICE, OUT_OF_SERVICE, EVALUATION_FAILED.
   * @return deploymentState
  **/
  @ApiModelProperty(value = "Pool deployment state used with the PG deployment policy. Enum options - EVALUATION_IN_PROGRESS, IN_SERVICE, OUT_OF_SERVICE, EVALUATION_FAILED.")


 
  @VsoMethod  
  public String getDeploymentState() {
    return deploymentState;
  }
    
  @VsoMethod
  public void setDeploymentState(String deploymentState) {
    this.deploymentState = deploymentState;
  }

  
  /**
   * UUID of the pool. It is a reference to an object of type Pool.
   * @return poolRef
  **/
  @ApiModelProperty(required = true, value = "UUID of the pool. It is a reference to an object of type Pool.")
  @NotNull


 
  @VsoMethod  
  public String getPoolRef() {
    return poolRef;
  }
    
  @VsoMethod
  public void setPoolRef(String poolRef) {
    this.poolRef = poolRef;
  }

  
  /**
   * All pools with same label are treated similarly in a pool group. A pool with a higher priority is selected, as long as the pool is eligible or an explicit policy chooses a different pool.
   * @return priorityLabel
  **/
  @ApiModelProperty(value = "All pools with same label are treated similarly in a pool group. A pool with a higher priority is selected, as long as the pool is eligible or an explicit policy chooses a different pool.")


 
  @VsoMethod  
  public String getPriorityLabel() {
    return priorityLabel;
  }
    
  @VsoMethod
  public void setPriorityLabel(String priorityLabel) {
    this.priorityLabel = priorityLabel;
  }

  
  /**
   * Ratio of selecting eligible pools in the pool group. . Allowed values are 1-1000. Special values are 0 - 'Do not select this pool for new connections'.
   * @return ratio
  **/
  @ApiModelProperty(value = "Ratio of selecting eligible pools in the pool group. . Allowed values are 1-1000. Special values are 0 - 'Do not select this pool for new connections'.")


 
  @VsoMethod  
  public Integer getRatio() {
    return ratio;
  }
    
  @VsoMethod
  public void setRatio(Integer ratio) {
    this.ratio = ratio;
  }

  
  public String getObjectID() {
		return "PoolGroupMember";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolGroupMember poolGroupMember = (PoolGroupMember) o;
    return Objects.equals(this.deploymentState, poolGroupMember.deploymentState) &&
        Objects.equals(this.poolRef, poolGroupMember.poolRef) &&
        Objects.equals(this.priorityLabel, poolGroupMember.priorityLabel) &&
        Objects.equals(this.ratio, poolGroupMember.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentState, poolRef, priorityLabel, ratio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolGroupMember {\n");
    
    sb.append("    deploymentState: ").append(toIndentedString(deploymentState)).append("\n");
    sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
    sb.append("    priorityLabel: ").append(toIndentedString(priorityLabel)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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

