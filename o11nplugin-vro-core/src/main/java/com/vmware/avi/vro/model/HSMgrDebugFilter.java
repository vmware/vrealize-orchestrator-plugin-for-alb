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
 * The HSMgrDebugFilter is a POJO class extends AviRestResource that used for creating
 * HSMgrDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HSMgrDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_HSMGRDEBUGFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HSMgrDebugFilter extends AviRestResource {
    @JsonProperty("entity")
    @JsonInclude(Include.NON_NULL)
    private String entity = null;

    @JsonProperty("metric_entity")
    @JsonInclude(Include.NON_NULL)
    private String metricEntity = null;

    @JsonProperty("period")
    @JsonInclude(Include.NON_NULL)
    private Integer period = null;

    @JsonProperty("pool")
    @JsonInclude(Include.NON_NULL)
    private String pool = null;

    @JsonProperty("server")
    @JsonInclude(Include.NON_NULL)
    private String server = null;

    @JsonProperty("skip_hs_db_writes")
    @JsonInclude(Include.NON_NULL)
    private Boolean skipHsDbWrites = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return entity
   */
  @VsoMethod
  public String getEntity() {
    return entity;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param entity set the entity.
   */
  @VsoMethod
  public void setEntity(String  entity) {
    this.entity = entity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - VSERVER_METRICS_ENTITY, VM_METRICS_ENTITY, SE_METRICS_ENTITY, CONTROLLER_METRICS_ENTITY, APPLICATION_METRICS_ENTITY,
   * TENANT_METRICS_ENTITY, POOL_METRICS_ENTITY.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricEntity set the metricEntity.
   */
  @VsoMethod
  public void setMetricEntity(String  metricEntity) {
    this.metricEntity = metricEntity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return period
   */
  @VsoMethod
  public Integer getPeriod() {
    return period;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param period set the period.
   */
  @VsoMethod
  public void setPeriod(Integer  period) {
    this.period = period;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pool
   */
  @VsoMethod
  public String getPool() {
    return pool;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pool set the pool.
   */
  @VsoMethod
  public void setPool(String  pool) {
    this.pool = pool;
  }

  /**
   * This is the getter method this will return the attribute value.
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
   * @return skipHsDbWrites
   */
  @VsoMethod
  public Boolean getSkipHsDbWrites() {
    return skipHsDbWrites;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param skipHsDbWrites set the skipHsDbWrites.
   */
  @VsoMethod
  public void setSkipHsDbWrites(Boolean  skipHsDbWrites) {
    this.skipHsDbWrites = skipHsDbWrites;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HSMgrDebugFilter objHSMgrDebugFilter = (HSMgrDebugFilter) o;
  return   Objects.equals(this.metricEntity, objHSMgrDebugFilter.metricEntity)&&
  Objects.equals(this.entity, objHSMgrDebugFilter.entity)&&
  Objects.equals(this.pool, objHSMgrDebugFilter.pool)&&
  Objects.equals(this.server, objHSMgrDebugFilter.server)&&
  Objects.equals(this.period, objHSMgrDebugFilter.period)&&
  Objects.equals(this.skipHsDbWrites, objHSMgrDebugFilter.skipHsDbWrites);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HSMgrDebugFilter {\n");
      sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    metricEntity: ").append(toIndentedString(metricEntity)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    skipHsDbWrites: ").append(toIndentedString(skipHsDbWrites)).append("\n");
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

