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
 * The MetricsDimensionData is a POJO class extends AviRestResource that used for creating
 * MetricsDimensionData.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsDimensionData")
@VsoFinder(name = Constants.FINDER_VRO_METRICSDIMENSIONDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsDimensionData extends AviRestResource {
    @JsonProperty("dimension")
    @JsonInclude(Include.NON_NULL)
    private String dimension = null;

    @JsonProperty("dimension_id")
    @JsonInclude(Include.NON_NULL)
    private String dimensionId = null;



  /**
   * This is the getter method this will return the attribute value.
   * Dimension type.
   * Enum options - METRICS_DIMENSION_METRIC_TIMESTAMP, METRICS_DIMENSION_COUNTRY, METRICS_DIMENSION_OS, METRICS_DIMENSION_URL,
   * METRICS_DIMENSION_DEVTYPE, METRICS_DIMENSION_LANG, METRICS_DIMENSION_BROWSER, METRICS_DIMENSION_IPGROUP, METRICS_DIMENSION_ATTACK,
   * METRICS_DIMENSION_ASN.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dimension
   */
  @VsoMethod
  public String getDimension() {
    return dimension;
  }

  /**
   * This is the setter method to the attribute.
   * Dimension type.
   * Enum options - METRICS_DIMENSION_METRIC_TIMESTAMP, METRICS_DIMENSION_COUNTRY, METRICS_DIMENSION_OS, METRICS_DIMENSION_URL,
   * METRICS_DIMENSION_DEVTYPE, METRICS_DIMENSION_LANG, METRICS_DIMENSION_BROWSER, METRICS_DIMENSION_IPGROUP, METRICS_DIMENSION_ATTACK,
   * METRICS_DIMENSION_ASN.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dimension set the dimension.
   */
  @VsoMethod
  public void setDimension(String  dimension) {
    this.dimension = dimension;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dimension id.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dimensionId
   */
  @VsoMethod
  public String getDimensionId() {
    return dimensionId;
  }

  /**
   * This is the setter method to the attribute.
   * Dimension id.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dimensionId set the dimensionId.
   */
  @VsoMethod
  public void setDimensionId(String  dimensionId) {
    this.dimensionId = dimensionId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricsDimensionData objMetricsDimensionData = (MetricsDimensionData) o;
  return   Objects.equals(this.dimension, objMetricsDimensionData.dimension)&&
  Objects.equals(this.dimensionId, objMetricsDimensionData.dimensionId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsDimensionData {\n");
      sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    dimensionId: ").append(toIndentedString(dimensionId)).append("\n");
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

