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
 * The MetricsDbRuntime is a POJO class extends AviRestResource that used for creating
 * MetricsDbRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsDbRuntime")
@VsoFinder(name = Constants.FINDER_VRO_METRICSDBRUNTIME)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsDbRuntime extends AviRestResource {
  @JsonProperty("db_num_client_queries")
  @JsonInclude(Include.NON_NULL)
  private Integer dbNumClientQueries = null;

  @JsonProperty("db_num_client_resp")
  @JsonInclude(Include.NON_NULL)
  private Integer dbNumClientResp = null;

  @JsonProperty("db_num_db_queries")
  @JsonInclude(Include.NON_NULL)
  private Integer dbNumDbQueries = null;

  @JsonProperty("db_num_db_resp")
  @JsonInclude(Include.NON_NULL)
  private Integer dbNumDbResp = null;

  @JsonProperty("db_num_oom")
  @JsonInclude(Include.NON_NULL)
  private Integer dbNumOom = null;

  @JsonProperty("db_queue_size")
  @JsonInclude(Include.NON_NULL)
  private Integer dbQueueSize = null;

  @JsonProperty("db_rum_queries")
  @JsonInclude(Include.NON_NULL)
  private Integer dbRumQueries = null;

  @JsonProperty("db_rum_rows")
  @JsonInclude(Include.NON_NULL)
  private Integer dbRumRows = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property db_num_client_queries of obj type metricsdbruntime field type str  type integer.
   * @return dbNumClientQueries
   */
  @VsoMethod
  public Integer getDbNumClientQueries() {
    return dbNumClientQueries;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property db_num_client_queries of obj type metricsdbruntime field type str  type integer.
   * @param dbNumClientQueries set the dbNumClientQueries.
   */
  @VsoMethod
  public void setDbNumClientQueries(Integer  dbNumClientQueries) {
    this.dbNumClientQueries = dbNumClientQueries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property db_num_client_resp of obj type metricsdbruntime field type str  type integer.
   * @return dbNumClientResp
   */
  @VsoMethod
  public Integer getDbNumClientResp() {
    return dbNumClientResp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property db_num_client_resp of obj type metricsdbruntime field type str  type integer.
   * @param dbNumClientResp set the dbNumClientResp.
   */
  @VsoMethod
  public void setDbNumClientResp(Integer  dbNumClientResp) {
    this.dbNumClientResp = dbNumClientResp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property db_num_db_queries of obj type metricsdbruntime field type str  type integer.
   * @return dbNumDbQueries
   */
  @VsoMethod
  public Integer getDbNumDbQueries() {
    return dbNumDbQueries;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property db_num_db_queries of obj type metricsdbruntime field type str  type integer.
   * @param dbNumDbQueries set the dbNumDbQueries.
   */
  @VsoMethod
  public void setDbNumDbQueries(Integer  dbNumDbQueries) {
    this.dbNumDbQueries = dbNumDbQueries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property db_num_db_resp of obj type metricsdbruntime field type str  type integer.
   * @return dbNumDbResp
   */
  @VsoMethod
  public Integer getDbNumDbResp() {
    return dbNumDbResp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property db_num_db_resp of obj type metricsdbruntime field type str  type integer.
   * @param dbNumDbResp set the dbNumDbResp.
   */
  @VsoMethod
  public void setDbNumDbResp(Integer  dbNumDbResp) {
    this.dbNumDbResp = dbNumDbResp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property db_num_oom of obj type metricsdbruntime field type str  type integer.
   * @return dbNumOom
   */
  @VsoMethod
  public Integer getDbNumOom() {
    return dbNumOom;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property db_num_oom of obj type metricsdbruntime field type str  type integer.
   * @param dbNumOom set the dbNumOom.
   */
  @VsoMethod
  public void setDbNumOom(Integer  dbNumOom) {
    this.dbNumOom = dbNumOom;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property db_queue_size of obj type metricsdbruntime field type str  type integer.
   * @return dbQueueSize
   */
  @VsoMethod
  public Integer getDbQueueSize() {
    return dbQueueSize;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property db_queue_size of obj type metricsdbruntime field type str  type integer.
   * @param dbQueueSize set the dbQueueSize.
   */
  @VsoMethod
  public void setDbQueueSize(Integer  dbQueueSize) {
    this.dbQueueSize = dbQueueSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property db_rum_queries of obj type metricsdbruntime field type str  type integer.
   * @return dbRumQueries
   */
  @VsoMethod
  public Integer getDbRumQueries() {
    return dbRumQueries;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property db_rum_queries of obj type metricsdbruntime field type str  type integer.
   * @param dbRumQueries set the dbRumQueries.
   */
  @VsoMethod
  public void setDbRumQueries(Integer  dbRumQueries) {
    this.dbRumQueries = dbRumQueries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property db_rum_rows of obj type metricsdbruntime field type str  type integer.
   * @return dbRumRows
   */
  @VsoMethod
  public Integer getDbRumRows() {
    return dbRumRows;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property db_rum_rows of obj type metricsdbruntime field type str  type integer.
   * @param dbRumRows set the dbRumRows.
   */
  @VsoMethod
  public void setDbRumRows(Integer  dbRumRows) {
    this.dbRumRows = dbRumRows;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricsDbRuntime objMetricsDbRuntime = (MetricsDbRuntime) o;
  return   Objects.equals(this.dbNumClientResp, objMetricsDbRuntime.dbNumClientResp)&&
  Objects.equals(this.dbNumDbResp, objMetricsDbRuntime.dbNumDbResp)&&
  Objects.equals(this.dbRumQueries, objMetricsDbRuntime.dbRumQueries)&&
  Objects.equals(this.dbNumDbQueries, objMetricsDbRuntime.dbNumDbQueries)&&
  Objects.equals(this.dbNumClientQueries, objMetricsDbRuntime.dbNumClientQueries)&&
  Objects.equals(this.dbQueueSize, objMetricsDbRuntime.dbQueueSize)&&
  Objects.equals(this.dbNumOom, objMetricsDbRuntime.dbNumOom)&&
  Objects.equals(this.dbRumRows, objMetricsDbRuntime.dbRumRows);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsDbRuntime {\n");
      sb.append("    dbNumClientQueries: ").append(toIndentedString(dbNumClientQueries)).append("\n");
        sb.append("    dbNumClientResp: ").append(toIndentedString(dbNumClientResp)).append("\n");
        sb.append("    dbNumDbQueries: ").append(toIndentedString(dbNumDbQueries)).append("\n");
        sb.append("    dbNumDbResp: ").append(toIndentedString(dbNumDbResp)).append("\n");
        sb.append("    dbNumOom: ").append(toIndentedString(dbNumOom)).append("\n");
        sb.append("    dbQueueSize: ").append(toIndentedString(dbQueueSize)).append("\n");
        sb.append("    dbRumQueries: ").append(toIndentedString(dbRumQueries)).append("\n");
        sb.append("    dbRumRows: ").append(toIndentedString(dbRumRows)).append("\n");
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
