package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.MetricsDerivationData;
import com.vmware.avi.vro.model.MetricStatistics;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The MetricsDataHeader is a POJO class extends AviRestResource that used for creating
 * MetricsDataHeader.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsDataHeader")
@VsoFinder(name = Constants.FINDER_VRO_METRICSDATAHEADER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsDataHeader extends AviRestResource {
    @JsonProperty("derivation_data")
    @JsonInclude(Include.NON_NULL)
    private MetricsDerivationData derivationData = null;

    @JsonProperty("dimension_data")
    @JsonInclude(Include.NON_NULL)
    private List<MetricsDimensionData> dimensionData = null;

    @JsonProperty("entity_uuid")
    @JsonInclude(Include.NON_NULL)
    private String entityUuid = null;

    @JsonProperty("metric_description")
    @JsonInclude(Include.NON_NULL)
    private String metricDescription = null;

    @JsonProperty("metrics_min_scale")
    @JsonInclude(Include.NON_NULL)
    private Float metricsMinScale = null;

    @JsonProperty("metrics_sum_agg_invalid")
    @JsonInclude(Include.NON_NULL)
    private Boolean metricsSumAggInvalid = false;

    @JsonProperty("missing_intervals")
    @JsonInclude(Include.NON_NULL)
    private List<MetricsMissingDataInterval> missingIntervals = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("obj_id")
    @JsonInclude(Include.NON_NULL)
    private String objId = null;

    @JsonProperty("obj_id_type")
    @JsonInclude(Include.NON_NULL)
    private String objIdType = null;

    @JsonProperty("pool_uuid")
    @JsonInclude(Include.NON_NULL)
    private String poolUuid = null;

    @JsonProperty("priority")
    @JsonInclude(Include.NON_NULL)
    private Boolean priority = true;

    @JsonProperty("server")
    @JsonInclude(Include.NON_NULL)
    private String server = null;

    @JsonProperty("serviceengine_uuid")
    @JsonInclude(Include.NON_NULL)
    private String serviceengineUuid = null;

    @JsonProperty("statistics")
    @JsonInclude(Include.NON_NULL)
    private MetricStatistics statistics = null;

    @JsonProperty("tenant_uuid")
    @JsonInclude(Include.NON_NULL)
    private String tenantUuid = null;

    @JsonProperty("units")
    @JsonInclude(Include.NON_NULL)
    private String units = "METRIC_COUNT";



  /**
   * This is the getter method this will return the attribute value.
   * Metrics derivation info.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return derivationData
   */
  @VsoMethod
  public MetricsDerivationData getDerivationData() {
    return derivationData;
  }

  /**
   * This is the setter method to the attribute.
   * Metrics derivation info.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param derivationData set the derivationData.
   */
  @VsoMethod
  public void setDerivationData(MetricsDerivationData derivationData) {
    this.derivationData = derivationData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property dimension_data of obj type metricsdataheader field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dimensionData
   */
  @VsoMethod
  public List<MetricsDimensionData> getDimensionData() {
    return dimensionData;
  }

  /**
   * This is the setter method. this will set the dimensionData
   * Placeholder for description of property dimension_data of obj type metricsdataheader field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dimensionData
   */
  @VsoMethod
  public void setDimensionData(List<MetricsDimensionData>  dimensionData) {
    this.dimensionData = dimensionData;
  }

  /**
   * This is the setter method this will set the dimensionData
   * Placeholder for description of property dimension_data of obj type metricsdataheader field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dimensionData
   */
  @VsoMethod
  public MetricsDataHeader addDimensionDataItem(MetricsDimensionData dimensionDataItem) {
    if (this.dimensionData == null) {
      this.dimensionData = new ArrayList<MetricsDimensionData>();
    }
    this.dimensionData.add(dimensionDataItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Entity uuid.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return entityUuid
   */
  @VsoMethod
  public String getEntityUuid() {
    return entityUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Entity uuid.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param entityUuid set the entityUuid.
   */
  @VsoMethod
  public void setEntityUuid(String  entityUuid) {
    this.entityUuid = entityUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property metric_description of obj type metricsdataheader field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricDescription
   */
  @VsoMethod
  public String getMetricDescription() {
    return metricDescription;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property metric_description of obj type metricsdataheader field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricDescription set the metricDescription.
   */
  @VsoMethod
  public void setMetricDescription(String  metricDescription) {
    this.metricDescription = metricDescription;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property metrics_min_scale of obj type metricsdataheader field type str  type float.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricsMinScale
   */
  @VsoMethod
  public Float getMetricsMinScale() {
    return metricsMinScale;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property metrics_min_scale of obj type metricsdataheader field type str  type float.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricsMinScale set the metricsMinScale.
   */
  @VsoMethod
  public void setMetricsMinScale(Float  metricsMinScale) {
    this.metricsMinScale = metricsMinScale;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property metrics_sum_agg_invalid of obj type metricsdataheader field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return metricsSumAggInvalid
   */
  @VsoMethod
  public Boolean getMetricsSumAggInvalid() {
    return metricsSumAggInvalid;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property metrics_sum_agg_invalid of obj type metricsdataheader field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param metricsSumAggInvalid set the metricsSumAggInvalid.
   */
  @VsoMethod
  public void setMetricsSumAggInvalid(Boolean  metricsSumAggInvalid) {
    this.metricsSumAggInvalid = metricsSumAggInvalid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Missing data intervals.
   * Data in these intervals are not used for stats calculation.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return missingIntervals
   */
  @VsoMethod
  public List<MetricsMissingDataInterval> getMissingIntervals() {
    return missingIntervals;
  }

  /**
   * This is the setter method. this will set the missingIntervals
   * Missing data intervals.
   * Data in these intervals are not used for stats calculation.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return missingIntervals
   */
  @VsoMethod
  public void setMissingIntervals(List<MetricsMissingDataInterval>  missingIntervals) {
    this.missingIntervals = missingIntervals;
  }

  /**
   * This is the setter method this will set the missingIntervals
   * Missing data intervals.
   * Data in these intervals are not used for stats calculation.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return missingIntervals
   */
  @VsoMethod
  public MetricsDataHeader addMissingIntervalsItem(MetricsMissingDataInterval missingIntervalsItem) {
    if (this.missingIntervals == null) {
      this.missingIntervals = new ArrayList<MetricsMissingDataInterval>();
    }
    this.missingIntervals.add(missingIntervalsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the column.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the column.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Object id of the series when object id was specified in the metric.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objId
   */
  @VsoMethod
  public String getObjId() {
    return objId;
  }

  /**
   * This is the setter method to the attribute.
   * Object id of the series when object id was specified in the metric.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objId set the objId.
   */
  @VsoMethod
  public void setObjId(String  objId) {
    this.objId = objId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Obj_id_type.
   * Enum options - METRICS_OBJ_ID_TYPE_VIRTUALSERVICE, METRICS_OBJ_ID_TYPE_SERVER, METRICS_OBJ_ID_TYPE_POOL, METRICS_OBJ_ID_TYPE_SERVICEENGINE,
   * METRICS_OBJ_ID_TYPE_VIRTUALMACHINE, METRICS_OBJ_ID_TYPE_CONTROLLER, METRICS_OBJ_ID_TYPE_TENANT, METRICS_OBJ_ID_TYPE_CLUSTER,
   * METRICS_OBJ_ID_TYPE_SE_INTERFACE.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objIdType
   */
  @VsoMethod
  public String getObjIdType() {
    return objIdType;
  }

  /**
   * This is the setter method to the attribute.
   * Obj_id_type.
   * Enum options - METRICS_OBJ_ID_TYPE_VIRTUALSERVICE, METRICS_OBJ_ID_TYPE_SERVER, METRICS_OBJ_ID_TYPE_POOL, METRICS_OBJ_ID_TYPE_SERVICEENGINE,
   * METRICS_OBJ_ID_TYPE_VIRTUALMACHINE, METRICS_OBJ_ID_TYPE_CONTROLLER, METRICS_OBJ_ID_TYPE_TENANT, METRICS_OBJ_ID_TYPE_CLUSTER,
   * METRICS_OBJ_ID_TYPE_SE_INTERFACE.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objIdType set the objIdType.
   */
  @VsoMethod
  public void setObjIdType(String  objIdType) {
    this.objIdType = objIdType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pool_id for the metric.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolUuid
   */
  @VsoMethod
  public String getPoolUuid() {
    return poolUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Pool_id for the metric.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolUuid set the poolUuid.
   */
  @VsoMethod
  public void setPoolUuid(String  poolUuid) {
    this.poolUuid = poolUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property priority of obj type metricsdataheader field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return priority
   */
  @VsoMethod
  public Boolean getPriority() {
    return priority;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property priority of obj type metricsdataheader field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param priority set the priority.
   */
  @VsoMethod
  public void setPriority(Boolean  priority) {
    this.priority = priority;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Server ip port.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return server
   */
  @VsoMethod
  public String getServer() {
    return server;
  }

  /**
   * This is the setter method to the attribute.
   * Server ip port.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param server set the server.
   */
  @VsoMethod
  public void setServer(String  server) {
    this.server = server;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine ref or uuid.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceengineUuid
   */
  @VsoMethod
  public String getServiceengineUuid() {
    return serviceengineUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine ref or uuid.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceengineUuid set the serviceengineUuid.
   */
  @VsoMethod
  public void setServiceengineUuid(String  serviceengineUuid) {
    this.serviceengineUuid = serviceengineUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Statistics of the metric.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return statistics
   */
  @VsoMethod
  public MetricStatistics getStatistics() {
    return statistics;
  }

  /**
   * This is the setter method to the attribute.
   * Statistics of the metric.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param statistics set the statistics.
   */
  @VsoMethod
  public void setStatistics(MetricStatistics statistics) {
    this.statistics = statistics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant ref or uuid.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantUuid
   */
  @VsoMethod
  public String getTenantUuid() {
    return tenantUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant ref or uuid.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantUuid set the tenantUuid.
   */
  @VsoMethod
  public void setTenantUuid(String  tenantUuid) {
    this.tenantUuid = tenantUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Units of the column data.
   * Enum options - METRIC_COUNT, BITS_PER_SECOND, MILLISECONDS, SECONDS, PER_SECOND, BYTES, PERCENT, KILO_BYTES, KILO_BYTES_PER_SECOND,
   * BYTES_PER_SECOND, KILO_BITS_PER_SECOND, GIGA_BYTES, MEGA_BYTES, NORMALIZED, STRING, SEC, MIN, DAYS, KB, MB...
   * Default value when not specified in API or module is interpreted by Avi Controller as "METRIC_COUNT".
   * @return units
   */
  @VsoMethod
  public String getUnits() {
    return units;
  }

  /**
   * This is the setter method to the attribute.
   * Units of the column data.
   * Enum options - METRIC_COUNT, BITS_PER_SECOND, MILLISECONDS, SECONDS, PER_SECOND, BYTES, PERCENT, KILO_BYTES, KILO_BYTES_PER_SECOND,
   * BYTES_PER_SECOND, KILO_BITS_PER_SECOND, GIGA_BYTES, MEGA_BYTES, NORMALIZED, STRING, SEC, MIN, DAYS, KB, MB...
   * Default value when not specified in API or module is interpreted by Avi Controller as "METRIC_COUNT".
   * @param units set the units.
   */
  @VsoMethod
  public void setUnits(String  units) {
    this.units = units;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricsDataHeader objMetricsDataHeader = (MetricsDataHeader) o;
  return   Objects.equals(this.name, objMetricsDataHeader.name)&&
  Objects.equals(this.units, objMetricsDataHeader.units)&&
  Objects.equals(this.objId, objMetricsDataHeader.objId)&&
  Objects.equals(this.statistics, objMetricsDataHeader.statistics)&&
  Objects.equals(this.poolUuid, objMetricsDataHeader.poolUuid)&&
  Objects.equals(this.missingIntervals, objMetricsDataHeader.missingIntervals)&&
  Objects.equals(this.derivationData, objMetricsDataHeader.derivationData)&&
  Objects.equals(this.metricDescription, objMetricsDataHeader.metricDescription)&&
  Objects.equals(this.dimensionData, objMetricsDataHeader.dimensionData)&&
  Objects.equals(this.metricsMinScale, objMetricsDataHeader.metricsMinScale)&&
  Objects.equals(this.server, objMetricsDataHeader.server)&&
  Objects.equals(this.entityUuid, objMetricsDataHeader.entityUuid)&&
  Objects.equals(this.objIdType, objMetricsDataHeader.objIdType)&&
  Objects.equals(this.priority, objMetricsDataHeader.priority)&&
  Objects.equals(this.metricsSumAggInvalid, objMetricsDataHeader.metricsSumAggInvalid)&&
  Objects.equals(this.tenantUuid, objMetricsDataHeader.tenantUuid)&&
  Objects.equals(this.serviceengineUuid, objMetricsDataHeader.serviceengineUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsDataHeader {\n");
      sb.append("    derivationData: ").append(toIndentedString(derivationData)).append("\n");
        sb.append("    dimensionData: ").append(toIndentedString(dimensionData)).append("\n");
        sb.append("    entityUuid: ").append(toIndentedString(entityUuid)).append("\n");
        sb.append("    metricDescription: ").append(toIndentedString(metricDescription)).append("\n");
        sb.append("    metricsMinScale: ").append(toIndentedString(metricsMinScale)).append("\n");
        sb.append("    metricsSumAggInvalid: ").append(toIndentedString(metricsSumAggInvalid)).append("\n");
        sb.append("    missingIntervals: ").append(toIndentedString(missingIntervals)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objId: ").append(toIndentedString(objId)).append("\n");
        sb.append("    objIdType: ").append(toIndentedString(objIdType)).append("\n");
        sb.append("    poolUuid: ").append(toIndentedString(poolUuid)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    serviceengineUuid: ").append(toIndentedString(serviceengineUuid)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
        sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
        sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

