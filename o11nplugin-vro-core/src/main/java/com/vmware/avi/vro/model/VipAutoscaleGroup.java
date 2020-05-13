package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.VipAutoscaleConfiguration;
import com.vmware.avi.vro.model.VipAutoscalePolicy;
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
 * VipAutoscaleGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VipAutoscaleGroup")
@VsoFinder(name = Constants.FINDER_VRO_VIPAUTOSCALEGROUP, idAccessor = "getObjectID()")
@Service
public class VipAutoscaleGroup extends AviRestResource  {
  @JsonProperty("configuration")
  private VipAutoscaleConfiguration _configuration = null;

  @JsonProperty("policy")
  private VipAutoscalePolicy policy = null;

  
  /**
   *  Field introduced in 17.2.12, 18.1.2.
   * @return _configuration
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.12, 18.1.2.")

  @Valid

 
  @VsoMethod  
  public VipAutoscaleConfiguration getConfiguration() {
    return _configuration;
  }
    
  @VsoMethod
  public void setConfiguration(VipAutoscaleConfiguration _configuration) {
    this._configuration = _configuration;
  }

  
  /**
   *  Field introduced in 17.2.12, 18.1.2.
   * @return policy
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.12, 18.1.2.")

  @Valid

 
  @VsoMethod  
  public VipAutoscalePolicy getPolicy() {
    return policy;
  }
    
  @VsoMethod
  public void setPolicy(VipAutoscalePolicy policy) {
    this.policy = policy;
  }

  
  public String getObjectID() {
		return "VipAutoscaleGroup";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VipAutoscaleGroup vipAutoscaleGroup = (VipAutoscaleGroup) o;
    return Objects.equals(this._configuration, vipAutoscaleGroup._configuration) &&
        Objects.equals(this.policy, vipAutoscaleGroup.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, policy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VipAutoscaleGroup {\n");
    
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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

