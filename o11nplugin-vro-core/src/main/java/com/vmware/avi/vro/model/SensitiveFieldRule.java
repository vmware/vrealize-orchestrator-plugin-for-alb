package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.StringMatch;
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
 * SensitiveFieldRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SensitiveFieldRule")
@VsoFinder(name = Constants.FINDER_VRO_SENSITIVEFIELDRULE, idAccessor = "getObjectID()")
@Service
public class SensitiveFieldRule extends AviRestResource  {
  @JsonProperty("action")
  private String action = "LOG_FIELD_REMOVE";

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("match")
  private StringMatch match = null;

  @JsonProperty("name")
  private String name = null;

  
  /**
   * Action for the matched log field, for instance the matched field can be removed or masked off. Enum options - LOG_FIELD_REMOVE, LOG_FIELD_MASKOFF. Field introduced in 17.2.10, 18.1.2.
   * @return action
  **/
  @ApiModelProperty(value = "Action for the matched log field, for instance the matched field can be removed or masked off. Enum options - LOG_FIELD_REMOVE, LOG_FIELD_MASKOFF. Field introduced in 17.2.10, 18.1.2.")


 
  @VsoMethod  
  public String getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   * Enable rule to match the sensitive fields. Field introduced in 17.2.10, 18.1.2.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable rule to match the sensitive fields. Field introduced in 17.2.10, 18.1.2.")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Index of the rule. Field introduced in 17.2.10, 18.1.2.
   * @return index
  **/
  @ApiModelProperty(value = "Index of the rule. Field introduced in 17.2.10, 18.1.2.")


 
  @VsoMethod  
  public Integer getIndex() {
    return index;
  }
    
  @VsoMethod
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  /**
   * Criterion to use for matching in the Log. Field introduced in 17.2.10, 18.1.2.
   * @return match
  **/
  @ApiModelProperty(value = "Criterion to use for matching in the Log. Field introduced in 17.2.10, 18.1.2.")

  @Valid

 
  @VsoMethod  
  public StringMatch getMatch() {
    return match;
  }
    
  @VsoMethod
  public void setMatch(StringMatch match) {
    this.match = match;
  }

  
  /**
   * Name of the rule. Field introduced in 17.2.10, 18.1.2.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the rule. Field introduced in 17.2.10, 18.1.2.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public String getObjectID() {
		return "SensitiveFieldRule";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveFieldRule sensitiveFieldRule = (SensitiveFieldRule) o;
    return Objects.equals(this.action, sensitiveFieldRule.action) &&
        Objects.equals(this.enabled, sensitiveFieldRule.enabled) &&
        Objects.equals(this.index, sensitiveFieldRule.index) &&
        Objects.equals(this.match, sensitiveFieldRule.match) &&
        Objects.equals(this.name, sensitiveFieldRule.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, enabled, index, match, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveFieldRule {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

