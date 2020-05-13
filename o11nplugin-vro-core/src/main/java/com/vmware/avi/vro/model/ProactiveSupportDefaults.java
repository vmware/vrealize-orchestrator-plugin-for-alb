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
 * ProactiveSupportDefaults
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ProactiveSupportDefaults")
@VsoFinder(name = Constants.FINDER_VRO_PROACTIVESUPPORTDEFAULTS, idAccessor = "getObjectID()")
@Service
public class ProactiveSupportDefaults extends AviRestResource  {
  @JsonProperty("attach_core_dump")
  private Boolean attachCoreDump = null;

  @JsonProperty("attach_tech_support")
  private Boolean attachTechSupport = true;

  @JsonProperty("case_severity")
  private String caseSeverity = "Severity 5";

  
  /**
   * Opt-in to attach core dump with support case. Field introduced in 20.1.1.
   * @return attachCoreDump
  **/
  @ApiModelProperty(value = "Opt-in to attach core dump with support case. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isAttachCoreDump() {
    return attachCoreDump;
  }
    
  @VsoMethod
  public void setAttachCoreDump(Boolean attachCoreDump) {
    this.attachCoreDump = attachCoreDump;
  }

  
  /**
   * Opt-in to attach tech support with support case. Field introduced in 20.1.1.
   * @return attachTechSupport
  **/
  @ApiModelProperty(value = "Opt-in to attach tech support with support case. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isAttachTechSupport() {
    return attachTechSupport;
  }
    
  @VsoMethod
  public void setAttachTechSupport(Boolean attachTechSupport) {
    this.attachTechSupport = attachTechSupport;
  }

  
  /**
   * Case severity to be used for proactive support case creation. Field introduced in 20.1.1.
   * @return caseSeverity
  **/
  @ApiModelProperty(value = "Case severity to be used for proactive support case creation. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getCaseSeverity() {
    return caseSeverity;
  }
    
  @VsoMethod
  public void setCaseSeverity(String caseSeverity) {
    this.caseSeverity = caseSeverity;
  }

  
  public String getObjectID() {
		return "ProactiveSupportDefaults";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProactiveSupportDefaults proactiveSupportDefaults = (ProactiveSupportDefaults) o;
    return Objects.equals(this.attachCoreDump, proactiveSupportDefaults.attachCoreDump) &&
        Objects.equals(this.attachTechSupport, proactiveSupportDefaults.attachTechSupport) &&
        Objects.equals(this.caseSeverity, proactiveSupportDefaults.caseSeverity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachCoreDump, attachTechSupport, caseSeverity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProactiveSupportDefaults {\n");
    
    sb.append("    attachCoreDump: ").append(toIndentedString(attachCoreDump)).append("\n");
    sb.append("    attachTechSupport: ").append(toIndentedString(attachTechSupport)).append("\n");
    sb.append("    caseSeverity: ").append(toIndentedString(caseSeverity)).append("\n");
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

