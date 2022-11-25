package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HealthMonitorExternal is a POJO class extends AviRestResource that used for creating
 * HealthMonitorExternal.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HealthMonitorExternal")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITOREXTERNAL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HealthMonitorExternal extends AviRestResource {
    @JsonProperty("command_code")
    @JsonInclude(Include.NON_NULL)
    private String commandCode = null;

    @JsonProperty("command_parameters")
    @JsonInclude(Include.NON_NULL)
    private String commandParameters = null;

    @JsonProperty("command_path")
    @JsonInclude(Include.NON_NULL)
    private String commandPath = null;

    @JsonProperty("command_variables")
    @JsonInclude(Include.NON_NULL)
    private String commandVariables = null;



  /**
   * This is the getter method this will return the attribute value.
   * Command script provided inline.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return commandCode
   */
  @VsoMethod
  public String getCommandCode() {
    return commandCode;
  }

  /**
   * This is the setter method to the attribute.
   * Command script provided inline.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param commandCode set the commandCode.
   */
  @VsoMethod
  public void setCommandCode(String  commandCode) {
    this.commandCode = commandCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Optional arguments to feed into the script.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return commandParameters
   */
  @VsoMethod
  public String getCommandParameters() {
    return commandParameters;
  }

  /**
   * This is the setter method to the attribute.
   * Optional arguments to feed into the script.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param commandParameters set the commandParameters.
   */
  @VsoMethod
  public void setCommandParameters(String  commandParameters) {
    this.commandParameters = commandParameters;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Path of external health monitor script.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return commandPath
   */
  @VsoMethod
  public String getCommandPath() {
    return commandPath;
  }

  /**
   * This is the setter method to the attribute.
   * Path of external health monitor script.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param commandPath set the commandPath.
   */
  @VsoMethod
  public void setCommandPath(String  commandPath) {
    this.commandPath = commandPath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Environment variables to be fed into the script.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return commandVariables
   */
  @VsoMethod
  public String getCommandVariables() {
    return commandVariables;
  }

  /**
   * This is the setter method to the attribute.
   * Environment variables to be fed into the script.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param commandVariables set the commandVariables.
   */
  @VsoMethod
  public void setCommandVariables(String  commandVariables) {
    this.commandVariables = commandVariables;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HealthMonitorExternal objHealthMonitorExternal = (HealthMonitorExternal) o;
  return   Objects.equals(this.commandPath, objHealthMonitorExternal.commandPath)&&
  Objects.equals(this.commandParameters, objHealthMonitorExternal.commandParameters)&&
  Objects.equals(this.commandCode, objHealthMonitorExternal.commandCode)&&
  Objects.equals(this.commandVariables, objHealthMonitorExternal.commandVariables);
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

