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
 * The MetricThresoldUpDetails is a POJO class extends AviRestResource that used for creating
 * MetricThresoldUpDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricThresoldUpDetails")
@VsoFinder(name = Constants.FINDER_VRO_METRICTHRESOLDUPDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricThresoldUpDetails extends AviRestResource {
    @JsonProperty("current_value")
    @JsonInclude(Include.NON_NULL)
    private Float currentValue = null;

    @JsonProperty("entity_uuid")
    @JsonInclude(Include.NON_NULL)
    private String entityUuid = null;

    @JsonProperty("metric_id")
    @JsonInclude(Include.NON_NULL)
    private String metricId = null;

    @JsonProperty("metric_name")
    @JsonInclude(Include.NON_NULL)
    private String metricName = null;

    @JsonProperty("pool_uuid")
    @JsonInclude(Include.NON_NULL)
    private String poolUuid = null;

    @JsonProperty("server")
    @JsonInclude(Include.NON_NULL)
    private String server = null;

    @JsonProperty("threshold")
    @JsonInclude(Include.NON_NULL)
    private Float threshold = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return currentValue
   */
  @VsoMethod
  public Float getCurrentValue() {
    return currentValue;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param currentValue set the currentValue.
   */
  @VsoMethod
  public void setCurrentValue(Float  currentValue) {
    this.currentValue = currentValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Id of the object whose metric has hit the threshold.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return entityUuid
   */
  @VsoMethod
  public String getEntityUuid() {
    return entityUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Id of the object whose metric has hit the threshold.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param entityUuid set the entityUuid.
   */
  @VsoMethod
  public void setEntityUuid(String  entityUuid) {
    this.entityUuid = entityUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricId
   */
  @VsoMethod
  public String getMetricId() {
    return metricId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricId set the metricId.
   */
  @VsoMethod
  public void setMetricId(String  metricId) {
    this.metricId = metricId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricName
   */
  @VsoMethod
  public String getMetricName() {
    return metricName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricName set the metricName.
   */
  @VsoMethod
  public void setMetricName(String  metricName) {
    this.metricName = metricName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Identity of the pool.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolUuid
   */
  @VsoMethod
  public String getPoolUuid() {
    return poolUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Identity of the pool.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolUuid set the poolUuid.
   */
  @VsoMethod
  public void setPoolUuid(String  poolUuid) {
    this.poolUuid = poolUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Server ip port on which event was generated.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return server
   */
  @VsoMethod
  public String getServer() {
    return server;
  }

  /**
   * This is the setter method to the attribute.
   * Server ip port on which event was generated.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param server set the server.
   */
  @VsoMethod
  public void setServer(String  server) {
    this.server = server;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return threshold
   */
  @VsoMethod
  public Float getThreshold() {
    return threshold;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param threshold set the threshold.
   */
  @VsoMethod
  public void setThreshold(Float  threshold) {
    this.threshold = threshold;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricThresoldUpDetails objMetricThresoldUpDetails = (MetricThresoldUpDetails) o;
  return   Objects.equals(this.metricName, objMetricThresoldUpDetails.metricName)&&
  Objects.equals(this.metricId, objMetricThresoldUpDetails.metricId)&&
  Objects.equals(this.currentValue, objMetricThresoldUpDetails.currentValue)&&
  Objects.equals(this.threshold, objMetricThresoldUpDetails.threshold)&&
  Objects.equals(this.server, objMetricThresoldUpDetails.server)&&
  Objects.equals(this.poolUuid, objMetricThresoldUpDetails.poolUuid)&&
  Objects.equals(this.entityUuid, objMetricThresoldUpDetails.entityUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricThresoldUpDetails {\n");
      sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
        sb.append("    entityUuid: ").append(toIndentedString(entityUuid)).append("\n");
        sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    poolUuid: ").append(toIndentedString(poolUuid)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

