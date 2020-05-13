package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.GslbPoolMember;
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
 * GslbPool
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GslbPool")
@VsoFinder(name = Constants.FINDER_VRO_GSLBPOOL, idAccessor = "getObjectID()")
@Service
public class GslbPool extends AviRestResource  {
  @JsonProperty("algorithm")
  private String algorithm = "GSLB_ALGORITHM_ROUND_ROBIN";

  @JsonProperty("consistent_hash_mask")
  private Integer consistentHashMask = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("fallback_algorithm")
  private String fallbackAlgorithm = null;

  @JsonProperty("members")
  @Valid
  private List<GslbPoolMember> members = null;

  @JsonProperty("min_health_monitors_up")
  private Integer minHealthMonitorsUp = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("priority")
  private Integer priority = 10;

  
  /**
   * The load balancing algorithm will pick a local member within the GSLB service list of available Members. Enum options - GSLB_ALGORITHM_ROUND_ROBIN, GSLB_ALGORITHM_CONSISTENT_HASH, GSLB_ALGORITHM_GEO, GSLB_ALGORITHM_TOPOLOGY.
   * @return algorithm
  **/
  @ApiModelProperty(required = true, value = "The load balancing algorithm will pick a local member within the GSLB service list of available Members. Enum options - GSLB_ALGORITHM_ROUND_ROBIN, GSLB_ALGORITHM_CONSISTENT_HASH, GSLB_ALGORITHM_GEO, GSLB_ALGORITHM_TOPOLOGY.")
  @NotNull


 
  @VsoMethod  
  public String getAlgorithm() {
    return algorithm;
  }
    
  @VsoMethod
  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  
  /**
   * Mask to be applied on client IP for consistent hash algorithm. Allowed values are 1-31.
   * @return consistentHashMask
  **/
  @ApiModelProperty(value = "Mask to be applied on client IP for consistent hash algorithm. Allowed values are 1-31.")


 
  @VsoMethod  
  public Integer getConsistentHashMask() {
    return consistentHashMask;
  }
    
  @VsoMethod
  public void setConsistentHashMask(Integer consistentHashMask) {
    this.consistentHashMask = consistentHashMask;
  }

  
  /**
   * User provided information that records member details such as application owner name, contact, etc. Field introduced in 17.1.3.
   * @return description
  **/
  @ApiModelProperty(value = "User provided information that records member details such as application owner name, contact, etc. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Enable or disable a GSLB service pool. Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable or disable a GSLB service pool. Field introduced in 17.2.14, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * The fallback load balancing algorithm used to pick a member when the pool algorithm fails to find a valid member. For instance when algorithm is Geo and client/server do not have valid geo location. Enum options - GSLB_ALGORITHM_ROUND_ROBIN, GSLB_ALGORITHM_CONSISTENT_HASH, GSLB_ALGORITHM_GEO, GSLB_ALGORITHM_TOPOLOGY. Field introduced in 18.2.3.
   * @return fallbackAlgorithm
  **/
  @ApiModelProperty(value = "The fallback load balancing algorithm used to pick a member when the pool algorithm fails to find a valid member. For instance when algorithm is Geo and client/server do not have valid geo location. Enum options - GSLB_ALGORITHM_ROUND_ROBIN, GSLB_ALGORITHM_CONSISTENT_HASH, GSLB_ALGORITHM_GEO, GSLB_ALGORITHM_TOPOLOGY. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getFallbackAlgorithm() {
    return fallbackAlgorithm;
  }
    
  @VsoMethod
  public void setFallbackAlgorithm(String fallbackAlgorithm) {
    this.fallbackAlgorithm = fallbackAlgorithm;
  }

  
  public GslbPool addMembersItem(GslbPoolMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<GslbPoolMember>();
    }
    this.members.add(membersItem);
    return this;
  }
  
  /**
   * Select list of VIPs belonging to this GSLB service.
   * @return members
  **/
  @ApiModelProperty(value = "Select list of VIPs belonging to this GSLB service.")

  @Valid

 
  @VsoMethod  
  public List<GslbPoolMember> getMembers() {
    return members;
  }
    
  @VsoMethod
  public void setMembers(List<GslbPoolMember> members) {
    this.members = members;
  }

  
  /**
   * Minimum number of health monitors in UP state to mark the member UP. Field introduced in 20.1.1.
   * @return minHealthMonitorsUp
  **/
  @ApiModelProperty(value = "Minimum number of health monitors in UP state to mark the member UP. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMinHealthMonitorsUp() {
    return minHealthMonitorsUp;
  }
    
  @VsoMethod
  public void setMinHealthMonitorsUp(Integer minHealthMonitorsUp) {
    this.minHealthMonitorsUp = minHealthMonitorsUp;
  }

  
  /**
   * Name of the GSLB service pool.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the GSLB service pool.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Priority of this pool of Members. The higher the number, the higher is the priority of the pool. The DNS Service chooses the pool with the highest priority that is operationally up. Allowed values are 0-100. Special values are 0 - 'Do not choose members from this pool.A priority of 0 is equivalent to disabling the pool.'.
   * @return priority
  **/
  @ApiModelProperty(value = "Priority of this pool of Members. The higher the number, the higher is the priority of the pool. The DNS Service chooses the pool with the highest priority that is operationally up. Allowed values are 0-100. Special values are 0 - 'Do not choose members from this pool.A priority of 0 is equivalent to disabling the pool.'.")


 
  @VsoMethod  
  public Integer getPriority() {
    return priority;
  }
    
  @VsoMethod
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  public String getObjectID() {
		return "GslbPool";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbPool gslbPool = (GslbPool) o;
    return Objects.equals(this.algorithm, gslbPool.algorithm) &&
        Objects.equals(this.consistentHashMask, gslbPool.consistentHashMask) &&
        Objects.equals(this.description, gslbPool.description) &&
        Objects.equals(this.enabled, gslbPool.enabled) &&
        Objects.equals(this.fallbackAlgorithm, gslbPool.fallbackAlgorithm) &&
        Objects.equals(this.members, gslbPool.members) &&
        Objects.equals(this.minHealthMonitorsUp, gslbPool.minHealthMonitorsUp) &&
        Objects.equals(this.name, gslbPool.name) &&
        Objects.equals(this.priority, gslbPool.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, consistentHashMask, description, enabled, fallbackAlgorithm, members, minHealthMonitorsUp, name, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbPool {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    consistentHashMask: ").append(toIndentedString(consistentHashMask)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fallbackAlgorithm: ").append(toIndentedString(fallbackAlgorithm)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    minHealthMonitorsUp: ").append(toIndentedString(minHealthMonitorsUp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

