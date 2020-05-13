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
 * SeFault
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeFault")
@VsoFinder(name = Constants.FINDER_VRO_SEFAULT, idAccessor = "getObjectID()")
@Service
public class SeFault extends AviRestResource  {
  @JsonProperty("arg")
  private Long arg = null;

  @JsonProperty("fault_name")
  private String faultName = null;

  @JsonProperty("function_name")
  private String functionName = null;

  @JsonProperty("num_executions")
  private Integer numExecutions = 1;

  
  /**
   * Optional 64 bit unsigned integer that can be used within the enabled fault. Field introduced in 20.1.1.
   * @return arg
  **/
  @ApiModelProperty(value = "Optional 64 bit unsigned integer that can be used within the enabled fault. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Long getArg() {
    return arg;
  }
    
  @VsoMethod
  public void setArg(Long arg) {
    this.arg = arg;
  }

  
  /**
   * The name of the target fault. Field introduced in 20.1.1.
   * @return faultName
  **/
  @ApiModelProperty(required = true, value = "The name of the target fault. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getFaultName() {
    return faultName;
  }
    
  @VsoMethod
  public void setFaultName(String faultName) {
    this.faultName = faultName;
  }

  
  /**
   * The name of the function that contains the target fault. Field introduced in 20.1.1.
   * @return functionName
  **/
  @ApiModelProperty(value = "The name of the function that contains the target fault. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getFunctionName() {
    return functionName;
  }
    
  @VsoMethod
  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }

  
  /**
   * Number of times the fault should be executed. Allowed values are 1-4294967295. Field introduced in 20.1.1.
   * @return numExecutions
  **/
  @ApiModelProperty(value = "Number of times the fault should be executed. Allowed values are 1-4294967295. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getNumExecutions() {
    return numExecutions;
  }
    
  @VsoMethod
  public void setNumExecutions(Integer numExecutions) {
    this.numExecutions = numExecutions;
  }

  
  public String getObjectID() {
		return "SeFault";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeFault seFault = (SeFault) o;
    return Objects.equals(this.arg, seFault.arg) &&
        Objects.equals(this.faultName, seFault.faultName) &&
        Objects.equals(this.functionName, seFault.functionName) &&
        Objects.equals(this.numExecutions, seFault.numExecutions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arg, faultName, functionName, numExecutions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeFault {\n");
    
    sb.append("    arg: ").append(toIndentedString(arg)).append("\n");
    sb.append("    faultName: ").append(toIndentedString(faultName)).append("\n");
    sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
    sb.append("    numExecutions: ").append(toIndentedString(numExecutions)).append("\n");
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

