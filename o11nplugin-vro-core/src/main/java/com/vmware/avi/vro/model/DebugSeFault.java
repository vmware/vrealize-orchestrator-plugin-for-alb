package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SeFault;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * DebugSeFault
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugSeFault")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGSEFAULT, idAccessor = "getObjectID()")
@Service
public class DebugSeFault extends AviRestResource  {
  @JsonProperty("faults")
  @Valid
  private List<SeFault> faults = null;

  @JsonProperty("se_malloc_fail_frequency")
  private Integer seMallocFailFrequency = null;

  @JsonProperty("se_malloc_fail_type")
  private Integer seMallocFailType = null;

  @JsonProperty("se_mbuf_cl_sanity")
  private Boolean seMbufClSanity = null;

  @JsonProperty("se_shm_malloc_fail_frequency")
  private Integer seShmMallocFailFrequency = null;

  @JsonProperty("se_shm_malloc_fail_type")
  private Integer seShmMallocFailType = null;

  @JsonProperty("se_waf_alloc_fail_frequency")
  private Integer seWafAllocFailFrequency = null;

  @JsonProperty("se_waf_learning_alloc_fail_frequency")
  private Integer seWafLearningAllocFailFrequency = null;

  
  public DebugSeFault addFaultsItem(SeFault faultsItem) {
    if (this.faults == null) {
      this.faults = new ArrayList<SeFault>();
    }
    this.faults.add(faultsItem);
    return this;
  }
  
  /**
   * Set of faults to enable/disable. Field introduced in 20.1.1.
   * @return faults
  **/
  @ApiModelProperty(value = "Set of faults to enable/disable. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<SeFault> getFaults() {
    return faults;
  }
    
  @VsoMethod
  public void setFaults(List<SeFault> faults) {
    this.faults = faults;
  }

  
  /**
   * Fail SE malloc type at this frequency. Field introduced in 18.1.2.
   * @return seMallocFailFrequency
  **/
  @ApiModelProperty(value = "Fail SE malloc type at this frequency. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getSeMallocFailFrequency() {
    return seMallocFailFrequency;
  }
    
  @VsoMethod
  public void setSeMallocFailFrequency(Integer seMallocFailFrequency) {
    this.seMallocFailFrequency = seMallocFailFrequency;
  }

  
  /**
   * Fail this SE malloc type. Field introduced in 18.1.2.
   * @return seMallocFailType
  **/
  @ApiModelProperty(value = "Fail this SE malloc type. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getSeMallocFailType() {
    return seMallocFailType;
  }
    
  @VsoMethod
  public void setSeMallocFailType(Integer seMallocFailType) {
    this.seMallocFailType = seMallocFailType;
  }

  
  /**
   * Toggle assert on mbuf cluster sanity check fail. Field introduced in 17.2.13,18.1.3,18.2.1.
   * @return seMbufClSanity
  **/
  @ApiModelProperty(value = "Toggle assert on mbuf cluster sanity check fail. Field introduced in 17.2.13,18.1.3,18.2.1.")


 
  @VsoMethod  
  public Boolean isSeMbufClSanity() {
    return seMbufClSanity;
  }
    
  @VsoMethod
  public void setSeMbufClSanity(Boolean seMbufClSanity) {
    this.seMbufClSanity = seMbufClSanity;
  }

  
  /**
   * Fail SE SHM malloc type at this frequency. Field introduced in 18.1.2.
   * @return seShmMallocFailFrequency
  **/
  @ApiModelProperty(value = "Fail SE SHM malloc type at this frequency. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getSeShmMallocFailFrequency() {
    return seShmMallocFailFrequency;
  }
    
  @VsoMethod
  public void setSeShmMallocFailFrequency(Integer seShmMallocFailFrequency) {
    this.seShmMallocFailFrequency = seShmMallocFailFrequency;
  }

  
  /**
   * Fail this SE SHM malloc type. Field introduced in 18.1.2.
   * @return seShmMallocFailType
  **/
  @ApiModelProperty(value = "Fail this SE SHM malloc type. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getSeShmMallocFailType() {
    return seShmMallocFailType;
  }
    
  @VsoMethod
  public void setSeShmMallocFailType(Integer seShmMallocFailType) {
    this.seShmMallocFailType = seShmMallocFailType;
  }

  
  /**
   * Fail SE WAF allocation at this frequency. Field introduced in 18.1.2.
   * @return seWafAllocFailFrequency
  **/
  @ApiModelProperty(value = "Fail SE WAF allocation at this frequency. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getSeWafAllocFailFrequency() {
    return seWafAllocFailFrequency;
  }
    
  @VsoMethod
  public void setSeWafAllocFailFrequency(Integer seWafAllocFailFrequency) {
    this.seWafAllocFailFrequency = seWafAllocFailFrequency;
  }

  
  /**
   * Fail SE WAF learning allocation at this frequency. Field introduced in 18.1.2.
   * @return seWafLearningAllocFailFrequency
  **/
  @ApiModelProperty(value = "Fail SE WAF learning allocation at this frequency. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Integer getSeWafLearningAllocFailFrequency() {
    return seWafLearningAllocFailFrequency;
  }
    
  @VsoMethod
  public void setSeWafLearningAllocFailFrequency(Integer seWafLearningAllocFailFrequency) {
    this.seWafLearningAllocFailFrequency = seWafLearningAllocFailFrequency;
  }

  
  public String getObjectID() {
		return "DebugSeFault";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugSeFault debugSeFault = (DebugSeFault) o;
    return Objects.equals(this.faults, debugSeFault.faults) &&
        Objects.equals(this.seMallocFailFrequency, debugSeFault.seMallocFailFrequency) &&
        Objects.equals(this.seMallocFailType, debugSeFault.seMallocFailType) &&
        Objects.equals(this.seMbufClSanity, debugSeFault.seMbufClSanity) &&
        Objects.equals(this.seShmMallocFailFrequency, debugSeFault.seShmMallocFailFrequency) &&
        Objects.equals(this.seShmMallocFailType, debugSeFault.seShmMallocFailType) &&
        Objects.equals(this.seWafAllocFailFrequency, debugSeFault.seWafAllocFailFrequency) &&
        Objects.equals(this.seWafLearningAllocFailFrequency, debugSeFault.seWafLearningAllocFailFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faults, seMallocFailFrequency, seMallocFailType, seMbufClSanity, seShmMallocFailFrequency, seShmMallocFailType, seWafAllocFailFrequency, seWafLearningAllocFailFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugSeFault {\n");
    
    sb.append("    faults: ").append(toIndentedString(faults)).append("\n");
    sb.append("    seMallocFailFrequency: ").append(toIndentedString(seMallocFailFrequency)).append("\n");
    sb.append("    seMallocFailType: ").append(toIndentedString(seMallocFailType)).append("\n");
    sb.append("    seMbufClSanity: ").append(toIndentedString(seMbufClSanity)).append("\n");
    sb.append("    seShmMallocFailFrequency: ").append(toIndentedString(seShmMallocFailFrequency)).append("\n");
    sb.append("    seShmMallocFailType: ").append(toIndentedString(seShmMallocFailType)).append("\n");
    sb.append("    seWafAllocFailFrequency: ").append(toIndentedString(seWafAllocFailFrequency)).append("\n");
    sb.append("    seWafLearningAllocFailFrequency: ").append(toIndentedString(seWafLearningAllocFailFrequency)).append("\n");
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

