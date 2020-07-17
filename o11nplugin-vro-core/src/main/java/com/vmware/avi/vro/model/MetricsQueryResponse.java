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
 * The MetricsQueryResponse is a POJO class extends AviRestResource that used for creating
 * MetricsQueryResponse.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsQueryResponse")
@VsoFinder(name = Constants.FINDER_VRO_METRICSQUERYRESPONSE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsQueryResponse extends AviRestResource {
  @JsonProperty("entity_uuid")
  @JsonInclude(Include.NON_NULL)
  private String entityUuid = null;

  @JsonProperty("id")
  @JsonInclude(Include.NON_NULL)
  private String id = null;

  @JsonProperty("limit")
  @JsonInclude(Include.NON_NULL)
  private Integer limit = null;

  @JsonProperty("metric_entity")
  @JsonInclude(Include.NON_NULL)
  private String metricEntity = null;

  @JsonProperty("metric_id")
  @JsonInclude(Include.NON_NULL)
  private String metricId = null;

  @JsonProperty("series")
  @JsonInclude(Include.NON_NULL)
  private List<MetricsDataSeries> series = null;

  @JsonProperty("start")
  @JsonInclude(Include.NON_NULL)
  private String start = null;

  @JsonProperty("step")
  @JsonInclude(Include.NON_NULL)
  private Integer step = null;

  @JsonProperty("stop")
  @JsonInclude(Include.NON_NULL)
  private String stop = null;



  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of entity.
   * @return entityUuid
   */
  @VsoMethod
  public String getEntityUuid() {
    return entityUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of entity.
   * @param entityUuid set the entityUuid.
   */
  @VsoMethod
  public void setEntityUuid(String  entityUuid) {
    this.entityUuid = entityUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Returns the id specified in the query.
   * @return id
   */
  @VsoMethod
  public String getId() {
    return id;
  }

  /**
   * This is the setter method to the attribute.
   * Returns the id specified in the query.
   * @param id set the id.
   */
  @VsoMethod
  public void setId(String  id) {
    this.id = id;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property limit of obj type metricsqueryresponse field type str  type integer.
   * @return limit
   */
  @VsoMethod
  public Integer getLimit() {
    return limit;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property limit of obj type metricsqueryresponse field type str  type integer.
   * @param limit set the limit.
   */
  @VsoMethod
  public void setLimit(Integer  limit) {
    this.limit = limit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - VSERVER_METRICS_ENTITY, VM_METRICS_ENTITY, SE_METRICS_ENTITY, CONTROLLER_METRICS_ENTITY, APPLICATION_METRICS_ENTITY,
   * TENANT_METRICS_ENTITY, POOL_METRICS_ENTITY.
   * @return metricEntity
   */
  @VsoMethod
  public String getMetricEntity() {
    return metricEntity;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - VSERVER_METRICS_ENTITY, VM_METRICS_ENTITY, SE_METRICS_ENTITY, CONTROLLER_METRICS_ENTITY, APPLICATION_METRICS_ENTITY,
   * TENANT_METRICS_ENTITY, POOL_METRICS_ENTITY.
   * @param metricEntity set the metricEntity.
   */
  @VsoMethod
  public void setMetricEntity(String  metricEntity) {
    this.metricEntity = metricEntity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property metric_id of obj type metricsqueryresponse field type str  type string.
   * @return metricId
   */
  @VsoMethod
  public String getMetricId() {
    return metricId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property metric_id of obj type metricsqueryresponse field type str  type string.
   * @param metricId set the metricId.
   */
  @VsoMethod
  public void setMetricId(String  metricId) {
    this.metricId = metricId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property series of obj type metricsqueryresponse field type str  type array.
   * @return series
   */
  @VsoMethod
  public List<MetricsDataSeries> getSeries() {
    return series;
  }

  /**
   * This is the setter method. this will set the series
   * Placeholder for description of property series of obj type metricsqueryresponse field type str  type array.
   * @return series
   */
  @VsoMethod
  public void setSeries(List<MetricsDataSeries>  series) {
    this.series = series;
  }

  /**
   * This is the setter method this will set the series
   * Placeholder for description of property series of obj type metricsqueryresponse field type str  type array.
   * @return series
   */
  @VsoMethod
  public MetricsQueryResponse addSeriesItem(MetricsDataSeries seriesItem) {
    if (this.series == null) {
      this.series = new ArrayList<MetricsDataSeries>();
    }
    this.series.add(seriesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property start of obj type metricsqueryresponse field type str  type string.
   * @return start
   */
  @VsoMethod
  public String getStart() {
    return start;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property start of obj type metricsqueryresponse field type str  type string.
   * @param start set the start.
   */
  @VsoMethod
  public void setStart(String  start) {
    this.start = start;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property step of obj type metricsqueryresponse field type str  type integer.
   * @return step
   */
  @VsoMethod
  public Integer getStep() {
    return step;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property step of obj type metricsqueryresponse field type str  type integer.
   * @param step set the step.
   */
  @VsoMethod
  public void setStep(Integer  step) {
    this.step = step;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property stop of obj type metricsqueryresponse field type str  type string.
   * @return stop
   */
  @VsoMethod
  public String getStop() {
    return stop;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property stop of obj type metricsqueryresponse field type str  type string.
   * @param stop set the stop.
   */
  @VsoMethod
  public void setStop(String  stop) {
    this.stop = stop;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricsQueryResponse objMetricsQueryResponse = (MetricsQueryResponse) o;
  return   Objects.equals(this.metricId, objMetricsQueryResponse.metricId)&&
  Objects.equals(this.series, objMetricsQueryResponse.series)&&
  Objects.equals(this.stop, objMetricsQueryResponse.stop)&&
  Objects.equals(this.start, objMetricsQueryResponse.start)&&
  Objects.equals(this.step, objMetricsQueryResponse.step)&&
  Objects.equals(this.limit, objMetricsQueryResponse.limit)&&
  Objects.equals(this.entityUuid, objMetricsQueryResponse.entityUuid)&&
  Objects.equals(this.id, objMetricsQueryResponse.id)&&
  Objects.equals(this.metricEntity, objMetricsQueryResponse.metricEntity);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsQueryResponse {\n");
      sb.append("    entityUuid: ").append(toIndentedString(entityUuid)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    metricEntity: ").append(toIndentedString(metricEntity)).append("\n");
        sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
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

