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
 * SEFaultInjectSeParam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SEFaultInjectSeParam")
@VsoFinder(name = Constants.FINDER_VRO_SEFAULTINJECTSEPARAM, idAccessor = "getObjectID()")
@Service
public class SEFaultInjectSeParam extends AviRestResource  {
  @JsonProperty("core")
  private Integer core = 1000;

  @JsonProperty("random_core")
  private Boolean randomCore = null;

  @JsonProperty("se_agent_fault")
  private String seAgentFault = "SE_AGENT_FAULT_DISABLED";

  @JsonProperty("se_dp_fault")
  private String seDpFault = "SE_DP_FAULT_DISABLED";

  
  /**
   * Inject fault in specific core. Field introduced in 18.1.5,18.2.1.
   * @return core
  **/
  @ApiModelProperty(value = "Inject fault in specific core. Field introduced in 18.1.5,18.2.1.")


 
  @VsoMethod  
  public Integer getCore() {
    return core;
  }
    
  @VsoMethod
  public void setCore(Integer core) {
    this.core = core;
  }

  
  /**
   * Inject fault in random no of cores. Field introduced in 18.1.5,18.2.1.
   * @return randomCore
  **/
  @ApiModelProperty(value = "Inject fault in random no of cores. Field introduced in 18.1.5,18.2.1.")


 
  @VsoMethod  
  public Boolean isRandomCore() {
    return randomCore;
  }
    
  @VsoMethod
  public void setRandomCore(Boolean randomCore) {
    this.randomCore = randomCore;
  }

  
  /**
   * Set se-agent fault type. Enum options - SE_AGENT_FAULT_DISABLED, SE_AGENT_PRE_PROCESS_FAULT, SE_AGENT_POST_PROCESS_FAULT, SE_AGENT_DP_RESPONSE_FAULT, SE_AGENT_RANDOM_PROCESS_FAULT. Field introduced in 18.1.5,18.2.1.
   * @return seAgentFault
  **/
  @ApiModelProperty(value = "Set se-agent fault type. Enum options - SE_AGENT_FAULT_DISABLED, SE_AGENT_PRE_PROCESS_FAULT, SE_AGENT_POST_PROCESS_FAULT, SE_AGENT_DP_RESPONSE_FAULT, SE_AGENT_RANDOM_PROCESS_FAULT. Field introduced in 18.1.5,18.2.1.")


 
  @VsoMethod  
  public String getSeAgentFault() {
    return seAgentFault;
  }
    
  @VsoMethod
  public void setSeAgentFault(String seAgentFault) {
    this.seAgentFault = seAgentFault;
  }

  
  /**
   * Set se-dp fault type. Enum options - SE_DP_FAULT_DISABLED. Field introduced in 18.1.5,18.2.1.
   * @return seDpFault
  **/
  @ApiModelProperty(value = "Set se-dp fault type. Enum options - SE_DP_FAULT_DISABLED. Field introduced in 18.1.5,18.2.1.")


 
  @VsoMethod  
  public String getSeDpFault() {
    return seDpFault;
  }
    
  @VsoMethod
  public void setSeDpFault(String seDpFault) {
    this.seDpFault = seDpFault;
  }

  
  public String getObjectID() {
		return "SEFaultInjectSeParam";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEFaultInjectSeParam seFaultInjectSeParam = (SEFaultInjectSeParam) o;
    return Objects.equals(this.core, seFaultInjectSeParam.core) &&
        Objects.equals(this.randomCore, seFaultInjectSeParam.randomCore) &&
        Objects.equals(this.seAgentFault, seFaultInjectSeParam.seAgentFault) &&
        Objects.equals(this.seDpFault, seFaultInjectSeParam.seDpFault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(core, randomCore, seAgentFault, seDpFault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEFaultInjectSeParam {\n");
    
    sb.append("    core: ").append(toIndentedString(core)).append("\n");
    sb.append("    randomCore: ").append(toIndentedString(randomCore)).append("\n");
    sb.append("    seAgentFault: ").append(toIndentedString(seAgentFault)).append("\n");
    sb.append("    seDpFault: ").append(toIndentedString(seDpFault)).append("\n");
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

