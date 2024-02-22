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
 * The MetricsDbDiskEventDetails is a POJO class extends AviRestResource that used for creating
 * MetricsDbDiskEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MetricsDbDiskEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_METRICSDBDISKEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MetricsDbDiskEventDetails extends AviRestResource {
    @JsonProperty("metrics_deleted_tables")
    @JsonInclude(Include.NON_NULL)
    private List<String> metricsDeletedTables;

    @JsonProperty("metrics_free_sz")
    @JsonInclude(Include.NON_NULL)
    private Float metricsFreeSz;

    @JsonProperty("metrics_quota")
    @JsonInclude(Include.NON_NULL)
    private Float metricsQuota;



  /**
   * This is the getter method this will return the attribute value.
   * List of dropped metrics tables.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricsDeletedTables
   */
  @VsoMethod
  public List<String> getMetricsDeletedTables() {
    return metricsDeletedTables;
  }

  /**
   * This is the setter method. this will set the metricsDeletedTables
   * List of dropped metrics tables.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricsDeletedTables
   */
  @VsoMethod
  public void setMetricsDeletedTables(List<String>  metricsDeletedTables) {
    this.metricsDeletedTables = metricsDeletedTables;
  }

  /**
   * This is the setter method this will set the metricsDeletedTables
   * List of dropped metrics tables.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricsDeletedTables
   */
  @VsoMethod
  public MetricsDbDiskEventDetails addMetricsDeletedTablesItem(String metricsDeletedTablesItem) {
    if (this.metricsDeletedTables == null) {
      this.metricsDeletedTables = new ArrayList<String>();
    }
    this.metricsDeletedTables.add(metricsDeletedTablesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Total size of freed metrics tables.
   * In kbs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricsFreeSz
   */
  @VsoMethod
  public Float getMetricsFreeSz() {
    return metricsFreeSz;
  }

  /**
   * This is the setter method to the attribute.
   * Total size of freed metrics tables.
   * In kbs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricsFreeSz set the metricsFreeSz.
   */
  @VsoMethod
  public void setMetricsFreeSz(Float  metricsFreeSz) {
    this.metricsFreeSz = metricsFreeSz;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disk quota allocated for metrics db.
   * In gbs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricsQuota
   */
  @VsoMethod
  public Float getMetricsQuota() {
    return metricsQuota;
  }

  /**
   * This is the setter method to the attribute.
   * Disk quota allocated for metrics db.
   * In gbs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricsQuota set the metricsQuota.
   */
  @VsoMethod
  public void setMetricsQuota(Float  metricsQuota) {
    this.metricsQuota = metricsQuota;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MetricsDbDiskEventDetails objMetricsDbDiskEventDetails = (MetricsDbDiskEventDetails) o;
  return   Objects.equals(this.metricsQuota, objMetricsDbDiskEventDetails.metricsQuota)&&
  Objects.equals(this.metricsFreeSz, objMetricsDbDiskEventDetails.metricsFreeSz)&&
  Objects.equals(this.metricsDeletedTables, objMetricsDbDiskEventDetails.metricsDeletedTables);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MetricsDbDiskEventDetails {\n");
      sb.append("    metricsDeletedTables: ").append(toIndentedString(metricsDeletedTables)).append("\n");
        sb.append("    metricsFreeSz: ").append(toIndentedString(metricsFreeSz)).append("\n");
        sb.append("    metricsQuota: ").append(toIndentedString(metricsQuota)).append("\n");
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

