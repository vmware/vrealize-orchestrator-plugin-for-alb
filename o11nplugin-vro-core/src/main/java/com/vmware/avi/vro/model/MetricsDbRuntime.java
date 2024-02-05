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
    @JsonProperty("db_client_name")
    @JsonInclude(Include.NON_NULL)
    private String dbClientName;

    @JsonProperty("db_num_client_queries")
    @JsonInclude(Include.NON_NULL)
    private Integer dbNumClientQueries;

    @JsonProperty("db_num_client_resp")
    @JsonInclude(Include.NON_NULL)
    private Integer dbNumClientResp;

    @JsonProperty("db_num_db_queries")
    @JsonInclude(Include.NON_NULL)
    private Integer dbNumDbQueries;

    @JsonProperty("db_num_db_resp")
    @JsonInclude(Include.NON_NULL)
    private Integer dbNumDbResp;

    @JsonProperty("db_num_oom")
    @JsonInclude(Include.NON_NULL)
    private Integer dbNumOom;

    @JsonProperty("db_queue_size")
    @JsonInclude(Include.NON_NULL)
    private Integer dbQueueSize;

    @JsonProperty("db_rum_queries")
    @JsonInclude(Include.NON_NULL)
    private Integer dbRumQueries;

    @JsonProperty("db_rum_rows")
    @JsonInclude(Include.NON_NULL)
    private Integer dbRumRows;



  /**
   * This is the getter method this will return the attribute value.
   * Db client name.
   * Can be of db_client_rt/db_client_batch/db_client_rt_arr.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dbClientName
   */
  @VsoMethod
  public String getDbClientName() {
    return dbClientName;
  }

  /**
   * This is the setter method to the attribute.
   * Db client name.
   * Can be of db_client_rt/db_client_batch/db_client_rt_arr.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dbClientName set the dbClientName.
   */
  @VsoMethod
  public void setDbClientName(String  dbClientName) {
    this.dbClientName = dbClientName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dbNumClientQueries
   */
  @VsoMethod
  public Integer getDbNumClientQueries() {
    return dbNumClientQueries;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dbNumClientQueries set the dbNumClientQueries.
   */
  @VsoMethod
  public void setDbNumClientQueries(Integer  dbNumClientQueries) {
    this.dbNumClientQueries = dbNumClientQueries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dbNumClientResp
   */
  @VsoMethod
  public Integer getDbNumClientResp() {
    return dbNumClientResp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dbNumClientResp set the dbNumClientResp.
   */
  @VsoMethod
  public void setDbNumClientResp(Integer  dbNumClientResp) {
    this.dbNumClientResp = dbNumClientResp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dbNumDbQueries
   */
  @VsoMethod
  public Integer getDbNumDbQueries() {
    return dbNumDbQueries;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dbNumDbQueries set the dbNumDbQueries.
   */
  @VsoMethod
  public void setDbNumDbQueries(Integer  dbNumDbQueries) {
    this.dbNumDbQueries = dbNumDbQueries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dbNumDbResp
   */
  @VsoMethod
  public Integer getDbNumDbResp() {
    return dbNumDbResp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dbNumDbResp set the dbNumDbResp.
   */
  @VsoMethod
  public void setDbNumDbResp(Integer  dbNumDbResp) {
    this.dbNumDbResp = dbNumDbResp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dbNumOom
   */
  @VsoMethod
  public Integer getDbNumOom() {
    return dbNumOom;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dbNumOom set the dbNumOom.
   */
  @VsoMethod
  public void setDbNumOom(Integer  dbNumOom) {
    this.dbNumOom = dbNumOom;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dbQueueSize
   */
  @VsoMethod
  public Integer getDbQueueSize() {
    return dbQueueSize;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dbQueueSize set the dbQueueSize.
   */
  @VsoMethod
  public void setDbQueueSize(Integer  dbQueueSize) {
    this.dbQueueSize = dbQueueSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dbRumQueries
   */
  @VsoMethod
  public Integer getDbRumQueries() {
    return dbRumQueries;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dbRumQueries set the dbRumQueries.
   */
  @VsoMethod
  public void setDbRumQueries(Integer  dbRumQueries) {
    this.dbRumQueries = dbRumQueries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dbRumRows
   */
  @VsoMethod
  public Integer getDbRumRows() {
    return dbRumRows;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  return   Objects.equals(this.dbNumClientQueries, objMetricsDbRuntime.dbNumClientQueries)&&
  Objects.equals(this.dbNumDbQueries, objMetricsDbRuntime.dbNumDbQueries)&&
  Objects.equals(this.dbNumOom, objMetricsDbRuntime.dbNumOom)&&
  Objects.equals(this.dbNumDbResp, objMetricsDbRuntime.dbNumDbResp)&&
  Objects.equals(this.dbNumClientResp, objMetricsDbRuntime.dbNumClientResp)&&
  Objects.equals(this.dbQueueSize, objMetricsDbRuntime.dbQueueSize)&&
  Objects.equals(this.dbRumQueries, objMetricsDbRuntime.dbRumQueries)&&
  Objects.equals(this.dbRumRows, objMetricsDbRuntime.dbRumRows)&&
  Objects.equals(this.dbClientName, objMetricsDbRuntime.dbClientName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsDbRuntime {\n");
      sb.append("    dbClientName: ").append(toIndentedString(dbClientName)).append("\n");
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

