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
 * The AutoScaleMgrDebugFilter is a POJO class extends AviRestResource that used for creating
 * AutoScaleMgrDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AutoScaleMgrDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_AUTOSCALEMGRDEBUGFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AutoScaleMgrDebugFilter extends AviRestResource {
    @JsonProperty("enable_aws_autoscale_integration")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableAwsAutoscaleIntegration = false;

    @JsonProperty("intelligent_autoscale_period")
    @JsonInclude(Include.NON_NULL)
    private Integer intelligentAutoscalePeriod = null;

    @JsonProperty("pool_ref")
    @JsonInclude(Include.NON_NULL)
    private String poolRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Enable aws autoscale integration.
   * This is an alpha feature.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableAwsAutoscaleIntegration
   */
  @VsoMethod
  public Boolean getEnableAwsAutoscaleIntegration() {
    return enableAwsAutoscaleIntegration;
  }

  /**
   * This is the setter method to the attribute.
   * Enable aws autoscale integration.
   * This is an alpha feature.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableAwsAutoscaleIntegration set the enableAwsAutoscaleIntegration.
   */
  @VsoMethod
  public void setEnableAwsAutoscaleIntegration(Boolean  enableAwsAutoscaleIntegration) {
    this.enableAwsAutoscaleIntegration = enableAwsAutoscaleIntegration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Period of running intelligent autoscale check.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return intelligentAutoscalePeriod
   */
  @VsoMethod
  public Integer getIntelligentAutoscalePeriod() {
    return intelligentAutoscalePeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Period of running intelligent autoscale check.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param intelligentAutoscalePeriod set the intelligentAutoscalePeriod.
   */
  @VsoMethod
  public void setIntelligentAutoscalePeriod(Integer  intelligentAutoscalePeriod) {
    this.intelligentAutoscalePeriod = intelligentAutoscalePeriod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the pool.
   * It is a reference to an object of type pool.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolRef
   */
  @VsoMethod
  public String getPoolRef() {
    return poolRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the pool.
   * It is a reference to an object of type pool.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolRef set the poolRef.
   */
  @VsoMethod
  public void setPoolRef(String  poolRef) {
    this.poolRef = poolRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AutoScaleMgrDebugFilter objAutoScaleMgrDebugFilter = (AutoScaleMgrDebugFilter) o;
  return   Objects.equals(this.poolRef, objAutoScaleMgrDebugFilter.poolRef)&&
  Objects.equals(this.intelligentAutoscalePeriod, objAutoScaleMgrDebugFilter.intelligentAutoscalePeriod)&&
  Objects.equals(this.enableAwsAutoscaleIntegration, objAutoScaleMgrDebugFilter.enableAwsAutoscaleIntegration);
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

