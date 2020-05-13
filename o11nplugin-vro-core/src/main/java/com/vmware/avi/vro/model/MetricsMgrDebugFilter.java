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
 * MetricsMgrDebugFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MetricsMgrDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_METRICSMGRDEBUGFILTER, idAccessor = "getObjectID()")
@Service
public class MetricsMgrDebugFilter extends AviRestResource  {
  @JsonProperty("disable_hw_training")
  private String disableHwTraining = null;

  @JsonProperty("entity")
  private String entity = null;

  @JsonProperty("license_grace_period")
  private String licenseGracePeriod = null;

  @JsonProperty("log_first_n")
  private String logFirstN = null;

  @JsonProperty("logging_freq")
  private String loggingFreq = null;

  @JsonProperty("metric_instance_id")
  private String metricInstanceId = null;

  @JsonProperty("obj")
  private String obj = null;

  @JsonProperty("skip_cluster_map_check")
  private String skipClusterMapCheck = null;

  @JsonProperty("skip_metrics_db_writes")
  private String skipMetricsDbWrites = null;

  
  /**
   * disable_hw_training of MetricsMgrDebugFilter.
   * @return disableHwTraining
  **/
  @ApiModelProperty(value = "disable_hw_training of MetricsMgrDebugFilter.")


 
  @VsoMethod  
  public String getDisableHwTraining() {
    return disableHwTraining;
  }
    
  @VsoMethod
  public void setDisableHwTraining(String disableHwTraining) {
    this.disableHwTraining = disableHwTraining;
  }

  
  /**
   * entity of MetricsMgrDebugFilter.
   * @return entity
  **/
  @ApiModelProperty(value = "entity of MetricsMgrDebugFilter.")


 
  @VsoMethod  
  public String getEntity() {
    return entity;
  }
    
  @VsoMethod
  public void setEntity(String entity) {
    this.entity = entity;
  }

  
  /**
   * setting to reduce the grace period for license expiry in hours.
   * @return licenseGracePeriod
  **/
  @ApiModelProperty(value = "setting to reduce the grace period for license expiry in hours.")


 
  @VsoMethod  
  public String getLicenseGracePeriod() {
    return licenseGracePeriod;
  }
    
  @VsoMethod
  public void setLicenseGracePeriod(String licenseGracePeriod) {
    this.licenseGracePeriod = licenseGracePeriod;
  }

  
  /**
   * log_first_n of MetricsMgrDebugFilter.
   * @return logFirstN
  **/
  @ApiModelProperty(value = "log_first_n of MetricsMgrDebugFilter.")


 
  @VsoMethod  
  public String getLogFirstN() {
    return logFirstN;
  }
    
  @VsoMethod
  public void setLogFirstN(String logFirstN) {
    this.logFirstN = logFirstN;
  }

  
  /**
   * logging_freq of MetricsMgrDebugFilter.
   * @return loggingFreq
  **/
  @ApiModelProperty(value = "logging_freq of MetricsMgrDebugFilter.")


 
  @VsoMethod  
  public String getLoggingFreq() {
    return loggingFreq;
  }
    
  @VsoMethod
  public void setLoggingFreq(String loggingFreq) {
    this.loggingFreq = loggingFreq;
  }

  
  /**
   * metric_instance_id of MetricsMgrDebugFilter.
   * @return metricInstanceId
  **/
  @ApiModelProperty(value = "metric_instance_id of MetricsMgrDebugFilter.")


 
  @VsoMethod  
  public String getMetricInstanceId() {
    return metricInstanceId;
  }
    
  @VsoMethod
  public void setMetricInstanceId(String metricInstanceId) {
    this.metricInstanceId = metricInstanceId;
  }

  
  /**
   * obj of MetricsMgrDebugFilter.
   * @return obj
  **/
  @ApiModelProperty(value = "obj of MetricsMgrDebugFilter.")


 
  @VsoMethod  
  public String getObj() {
    return obj;
  }
    
  @VsoMethod
  public void setObj(String obj) {
    this.obj = obj;
  }

  
  /**
   * skip_cluster_map_check of MetricsMgrDebugFilter.
   * @return skipClusterMapCheck
  **/
  @ApiModelProperty(value = "skip_cluster_map_check of MetricsMgrDebugFilter.")


 
  @VsoMethod  
  public String getSkipClusterMapCheck() {
    return skipClusterMapCheck;
  }
    
  @VsoMethod
  public void setSkipClusterMapCheck(String skipClusterMapCheck) {
    this.skipClusterMapCheck = skipClusterMapCheck;
  }

  
  /**
   * skip_metrics_db_writes of MetricsMgrDebugFilter.
   * @return skipMetricsDbWrites
  **/
  @ApiModelProperty(value = "skip_metrics_db_writes of MetricsMgrDebugFilter.")


 
  @VsoMethod  
  public String getSkipMetricsDbWrites() {
    return skipMetricsDbWrites;
  }
    
  @VsoMethod
  public void setSkipMetricsDbWrites(String skipMetricsDbWrites) {
    this.skipMetricsDbWrites = skipMetricsDbWrites;
  }

  
  public String getObjectID() {
		return "MetricsMgrDebugFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsMgrDebugFilter metricsMgrDebugFilter = (MetricsMgrDebugFilter) o;
    return Objects.equals(this.disableHwTraining, metricsMgrDebugFilter.disableHwTraining) &&
        Objects.equals(this.entity, metricsMgrDebugFilter.entity) &&
        Objects.equals(this.licenseGracePeriod, metricsMgrDebugFilter.licenseGracePeriod) &&
        Objects.equals(this.logFirstN, metricsMgrDebugFilter.logFirstN) &&
        Objects.equals(this.loggingFreq, metricsMgrDebugFilter.loggingFreq) &&
        Objects.equals(this.metricInstanceId, metricsMgrDebugFilter.metricInstanceId) &&
        Objects.equals(this.obj, metricsMgrDebugFilter.obj) &&
        Objects.equals(this.skipClusterMapCheck, metricsMgrDebugFilter.skipClusterMapCheck) &&
        Objects.equals(this.skipMetricsDbWrites, metricsMgrDebugFilter.skipMetricsDbWrites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableHwTraining, entity, licenseGracePeriod, logFirstN, loggingFreq, metricInstanceId, obj, skipClusterMapCheck, skipMetricsDbWrites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsMgrDebugFilter {\n");
    
    sb.append("    disableHwTraining: ").append(toIndentedString(disableHwTraining)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    licenseGracePeriod: ").append(toIndentedString(licenseGracePeriod)).append("\n");
    sb.append("    logFirstN: ").append(toIndentedString(logFirstN)).append("\n");
    sb.append("    loggingFreq: ").append(toIndentedString(loggingFreq)).append("\n");
    sb.append("    metricInstanceId: ").append(toIndentedString(metricInstanceId)).append("\n");
    sb.append("    obj: ").append(toIndentedString(obj)).append("\n");
    sb.append("    skipClusterMapCheck: ").append(toIndentedString(skipClusterMapCheck)).append("\n");
    sb.append("    skipMetricsDbWrites: ").append(toIndentedString(skipMetricsDbWrites)).append("\n");
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

