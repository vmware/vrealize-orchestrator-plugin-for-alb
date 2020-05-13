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
 * AttackMitigationAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AttackMitigationAction")
@VsoFinder(name = Constants.FINDER_VRO_ATTACKMITIGATIONACTION, idAccessor = "getObjectID()")
@Service
public class AttackMitigationAction extends AviRestResource  {
  @JsonProperty("deny")
  private Boolean deny = true;

  
  /**
   * Deny the attack packets further processing and drop them. Field introduced in 18.2.1.
   * @return deny
  **/
  @ApiModelProperty(value = "Deny the attack packets further processing and drop them. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public Boolean isDeny() {
    return deny;
  }
    
  @VsoMethod
  public void setDeny(Boolean deny) {
    this.deny = deny;
  }

  
  public String getObjectID() {
		return "AttackMitigationAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttackMitigationAction attackMitigationAction = (AttackMitigationAction) o;
    return Objects.equals(this.deny, attackMitigationAction.deny);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deny);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttackMitigationAction {\n");
    
    sb.append("    deny: ").append(toIndentedString(deny)).append("\n");
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

