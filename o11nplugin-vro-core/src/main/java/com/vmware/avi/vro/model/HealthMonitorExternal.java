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
 * HealthMonitorExternal
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:14:41.363+05:30")

@VsoObject(create = false, name = "HealthMonitorExternal")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITOREXTERNAL, idAccessor = "getObjectID()")
@Service
public class HealthMonitorExternal extends AviRestResource  {
  @JsonProperty("command_code")
  private String commandCode = null;

  @JsonProperty("command_parameters")
  private String commandParameters = null;

  @JsonProperty("command_path")
  private String commandPath = null;

  @JsonProperty("command_variables")
  private String commandVariables = null;

  
  /**
   * Command script provided inline.
   * @return commandCode
  **/
  @ApiModelProperty(required = true, value = "Command script provided inline.")
  @NotNull


 
  @VsoMethod  
  public String getCommandCode() {
    return commandCode;
  }
    
  @VsoMethod
  public void setCommandCode(String commandCode) {
    this.commandCode = commandCode;
  }

  
  /**
   * Optional arguments to feed into the script.
   * @return commandParameters
  **/
  @ApiModelProperty(value = "Optional arguments to feed into the script.")


 
  @VsoMethod  
  public String getCommandParameters() {
    return commandParameters;
  }
    
  @VsoMethod
  public void setCommandParameters(String commandParameters) {
    this.commandParameters = commandParameters;
  }

  
  /**
   * Path of external health monitor script.
   * @return commandPath
  **/
  @ApiModelProperty(value = "Path of external health monitor script.")


 
  @VsoMethod  
  public String getCommandPath() {
    return commandPath;
  }
    
  @VsoMethod
  public void setCommandPath(String commandPath) {
    this.commandPath = commandPath;
  }

  
  /**
   * Environment variables to be fed into the script.
   * @return commandVariables
  **/
  @ApiModelProperty(value = "Environment variables to be fed into the script.")


 
  @VsoMethod  
  public String getCommandVariables() {
    return commandVariables;
  }
    
  @VsoMethod
  public void setCommandVariables(String commandVariables) {
    this.commandVariables = commandVariables;
  }

  
  public String getObjectID() {
		return "HealthMonitorExternal";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthMonitorExternal healthMonitorExternal = (HealthMonitorExternal) o;
    return Objects.equals(this.commandCode, healthMonitorExternal.commandCode) &&
        Objects.equals(this.commandParameters, healthMonitorExternal.commandParameters) &&
        Objects.equals(this.commandPath, healthMonitorExternal.commandPath) &&
        Objects.equals(this.commandVariables, healthMonitorExternal.commandVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandCode, commandParameters, commandPath, commandVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthMonitorExternal {\n");
    
    sb.append("    commandCode: ").append(toIndentedString(commandCode)).append("\n");
    sb.append("    commandParameters: ").append(toIndentedString(commandParameters)).append("\n");
    sb.append("    commandPath: ").append(toIndentedString(commandPath)).append("\n");
    sb.append("    commandVariables: ").append(toIndentedString(commandVariables)).append("\n");
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

