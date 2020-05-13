package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.L4RuleActionSelectPool;
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
 * L4RuleAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "L4RuleAction")
@VsoFinder(name = Constants.FINDER_VRO_L4RULEACTION, idAccessor = "getObjectID()")
@Service
public class L4RuleAction extends AviRestResource  {
  @JsonProperty("select_pool")
  private L4RuleActionSelectPool selectPool = null;

  
  /**
   * Indicates pool or pool-group selection on rule match. Field introduced in 17.2.7.
   * @return selectPool
  **/
  @ApiModelProperty(value = "Indicates pool or pool-group selection on rule match. Field introduced in 17.2.7.")

  @Valid

 
  @VsoMethod  
  public L4RuleActionSelectPool getSelectPool() {
    return selectPool;
  }
    
  @VsoMethod
  public void setSelectPool(L4RuleActionSelectPool selectPool) {
    this.selectPool = selectPool;
  }

  
  public String getObjectID() {
		return "L4RuleAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L4RuleAction l4RuleAction = (L4RuleAction) o;
    return Objects.equals(this.selectPool, l4RuleAction.selectPool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectPool);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L4RuleAction {\n");
    
    sb.append("    selectPool: ").append(toIndentedString(selectPool)).append("\n");
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

