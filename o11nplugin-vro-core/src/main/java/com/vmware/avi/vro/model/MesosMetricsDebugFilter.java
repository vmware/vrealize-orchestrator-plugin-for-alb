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
 * MesosMetricsDebugFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MesosMetricsDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_MESOSMETRICSDEBUGFILTER, idAccessor = "getObjectID()")
@Service
public class MesosMetricsDebugFilter extends AviRestResource  {
  @JsonProperty("mesos_master")
  private String mesosMaster = null;

  @JsonProperty("mesos_slave")
  private String mesosSlave = null;

  @JsonProperty("metric_entity")
  private String metricEntity = null;

  @JsonProperty("metrics_collection_frq")
  private Integer metricsCollectionFrq = 60;

  
  /**
   * mesos_master of MesosMetricsDebugFilter.
   * @return mesosMaster
  **/
  @ApiModelProperty(value = "mesos_master of MesosMetricsDebugFilter.")


 
  @VsoMethod  
  public String getMesosMaster() {
    return mesosMaster;
  }
    
  @VsoMethod
  public void setMesosMaster(String mesosMaster) {
    this.mesosMaster = mesosMaster;
  }

  
  /**
   * mesos_slave of MesosMetricsDebugFilter.
   * @return mesosSlave
  **/
  @ApiModelProperty(value = "mesos_slave of MesosMetricsDebugFilter.")


 
  @VsoMethod  
  public String getMesosSlave() {
    return mesosSlave;
  }
    
  @VsoMethod
  public void setMesosSlave(String mesosSlave) {
    this.mesosSlave = mesosSlave;
  }

  
  /**
   *  Enum options - VSERVER_METRICS_ENTITY, VM_METRICS_ENTITY, SE_METRICS_ENTITY, CONTROLLER_METRICS_ENTITY, APPLICATION_METRICS_ENTITY, TENANT_METRICS_ENTITY, POOL_METRICS_ENTITY.
   * @return metricEntity
  **/
  @ApiModelProperty(value = " Enum options - VSERVER_METRICS_ENTITY, VM_METRICS_ENTITY, SE_METRICS_ENTITY, CONTROLLER_METRICS_ENTITY, APPLICATION_METRICS_ENTITY, TENANT_METRICS_ENTITY, POOL_METRICS_ENTITY.")


 
  @VsoMethod  
  public String getMetricEntity() {
    return metricEntity;
  }
    
  @VsoMethod
  public void setMetricEntity(String metricEntity) {
    this.metricEntity = metricEntity;
  }

  
  /**
   * Number of metrics_collection_frq.
   * @return metricsCollectionFrq
  **/
  @ApiModelProperty(value = "Number of metrics_collection_frq.")


 
  @VsoMethod  
  public Integer getMetricsCollectionFrq() {
    return metricsCollectionFrq;
  }
    
  @VsoMethod
  public void setMetricsCollectionFrq(Integer metricsCollectionFrq) {
    this.metricsCollectionFrq = metricsCollectionFrq;
  }

  
  public String getObjectID() {
		return "MesosMetricsDebugFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MesosMetricsDebugFilter mesosMetricsDebugFilter = (MesosMetricsDebugFilter) o;
    return Objects.equals(this.mesosMaster, mesosMetricsDebugFilter.mesosMaster) &&
        Objects.equals(this.mesosSlave, mesosMetricsDebugFilter.mesosSlave) &&
        Objects.equals(this.metricEntity, mesosMetricsDebugFilter.metricEntity) &&
        Objects.equals(this.metricsCollectionFrq, mesosMetricsDebugFilter.metricsCollectionFrq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mesosMaster, mesosSlave, metricEntity, metricsCollectionFrq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MesosMetricsDebugFilter {\n");
    
    sb.append("    mesosMaster: ").append(toIndentedString(mesosMaster)).append("\n");
    sb.append("    mesosSlave: ").append(toIndentedString(mesosSlave)).append("\n");
    sb.append("    metricEntity: ").append(toIndentedString(metricEntity)).append("\n");
    sb.append("    metricsCollectionFrq: ").append(toIndentedString(metricsCollectionFrq)).append("\n");
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

