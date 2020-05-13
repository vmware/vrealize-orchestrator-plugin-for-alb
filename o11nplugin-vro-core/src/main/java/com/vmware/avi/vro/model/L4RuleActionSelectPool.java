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
 * L4RuleActionSelectPool
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "L4RuleActionSelectPool")
@VsoFinder(name = Constants.FINDER_VRO_L4RULEACTIONSELECTPOOL, idAccessor = "getObjectID()")
@Service
public class L4RuleActionSelectPool extends AviRestResource  {
  @JsonProperty("action_type")
  private String actionType = null;

  @JsonProperty("pool_group_ref")
  private String poolGroupRef = null;

  @JsonProperty("pool_ref")
  private String poolRef = null;

  
  /**
   * Indicates action to take on rule match. Enum options - L4_RULE_ACTION_SELECT_POOL, L4_RULE_ACTION_SELECT_POOLGROUP. Field introduced in 17.2.7.
   * @return actionType
  **/
  @ApiModelProperty(required = true, value = "Indicates action to take on rule match. Enum options - L4_RULE_ACTION_SELECT_POOL, L4_RULE_ACTION_SELECT_POOLGROUP. Field introduced in 17.2.7.")
  @NotNull


 
  @VsoMethod  
  public String getActionType() {
    return actionType;
  }
    
  @VsoMethod
  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  
  /**
   * ID of the pool group to serve the request. It is a reference to an object of type PoolGroup. Field introduced in 17.2.7.
   * @return poolGroupRef
  **/
  @ApiModelProperty(value = "ID of the pool group to serve the request. It is a reference to an object of type PoolGroup. Field introduced in 17.2.7.")


 
  @VsoMethod  
  public String getPoolGroupRef() {
    return poolGroupRef;
  }
    
  @VsoMethod
  public void setPoolGroupRef(String poolGroupRef) {
    this.poolGroupRef = poolGroupRef;
  }

  
  /**
   * ID of the pool of servers to serve the request. It is a reference to an object of type Pool. Field introduced in 17.2.7.
   * @return poolRef
  **/
  @ApiModelProperty(value = "ID of the pool of servers to serve the request. It is a reference to an object of type Pool. Field introduced in 17.2.7.")


 
  @VsoMethod  
  public String getPoolRef() {
    return poolRef;
  }
    
  @VsoMethod
  public void setPoolRef(String poolRef) {
    this.poolRef = poolRef;
  }

  
  public String getObjectID() {
		return "L4RuleActionSelectPool";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L4RuleActionSelectPool l4RuleActionSelectPool = (L4RuleActionSelectPool) o;
    return Objects.equals(this.actionType, l4RuleActionSelectPool.actionType) &&
        Objects.equals(this.poolGroupRef, l4RuleActionSelectPool.poolGroupRef) &&
        Objects.equals(this.poolRef, l4RuleActionSelectPool.poolRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, poolGroupRef, poolRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L4RuleActionSelectPool {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    poolGroupRef: ").append(toIndentedString(poolGroupRef)).append("\n");
    sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
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

