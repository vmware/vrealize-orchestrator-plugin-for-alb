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
 * AutoScaleMgrDebugFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AutoScaleMgrDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_AUTOSCALEMGRDEBUGFILTER, idAccessor = "getObjectID()")
@Service
public class AutoScaleMgrDebugFilter extends AviRestResource  {
  @JsonProperty("enable_aws_autoscale_integration")
  private Boolean enableAwsAutoscaleIntegration = null;

  @JsonProperty("intelligent_autoscale_period")
  private Integer intelligentAutoscalePeriod = null;

  @JsonProperty("pool_ref")
  private String poolRef = null;

  
  /**
   * Enable aws autoscale integration. This is an alpha feature. Field introduced in 17.1.1.
   * @return enableAwsAutoscaleIntegration
  **/
  @ApiModelProperty(value = "Enable aws autoscale integration. This is an alpha feature. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isEnableAwsAutoscaleIntegration() {
    return enableAwsAutoscaleIntegration;
  }
    
  @VsoMethod
  public void setEnableAwsAutoscaleIntegration(Boolean enableAwsAutoscaleIntegration) {
    this.enableAwsAutoscaleIntegration = enableAwsAutoscaleIntegration;
  }

  
  /**
   * period of running intelligent autoscale check.
   * @return intelligentAutoscalePeriod
  **/
  @ApiModelProperty(value = "period of running intelligent autoscale check.")


 
  @VsoMethod  
  public Integer getIntelligentAutoscalePeriod() {
    return intelligentAutoscalePeriod;
  }
    
  @VsoMethod
  public void setIntelligentAutoscalePeriod(Integer intelligentAutoscalePeriod) {
    this.intelligentAutoscalePeriod = intelligentAutoscalePeriod;
  }

  
  /**
   * uuid of the Pool. It is a reference to an object of type Pool.
   * @return poolRef
  **/
  @ApiModelProperty(value = "uuid of the Pool. It is a reference to an object of type Pool.")


 
  @VsoMethod  
  public String getPoolRef() {
    return poolRef;
  }
    
  @VsoMethod
  public void setPoolRef(String poolRef) {
    this.poolRef = poolRef;
  }

  
  public String getObjectID() {
		return "AutoScaleMgrDebugFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScaleMgrDebugFilter autoScaleMgrDebugFilter = (AutoScaleMgrDebugFilter) o;
    return Objects.equals(this.enableAwsAutoscaleIntegration, autoScaleMgrDebugFilter.enableAwsAutoscaleIntegration) &&
        Objects.equals(this.intelligentAutoscalePeriod, autoScaleMgrDebugFilter.intelligentAutoscalePeriod) &&
        Objects.equals(this.poolRef, autoScaleMgrDebugFilter.poolRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableAwsAutoscaleIntegration, intelligentAutoscalePeriod, poolRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScaleMgrDebugFilter {\n");
    
    sb.append("    enableAwsAutoscaleIntegration: ").append(toIndentedString(enableAwsAutoscaleIntegration)).append("\n");
    sb.append("    intelligentAutoscalePeriod: ").append(toIndentedString(intelligentAutoscalePeriod)).append("\n");
    sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
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

