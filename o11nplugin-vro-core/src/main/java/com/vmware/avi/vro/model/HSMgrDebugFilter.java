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
 * HSMgrDebugFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HSMgrDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_HSMGRDEBUGFILTER, idAccessor = "getObjectID()")
@Service
public class HSMgrDebugFilter extends AviRestResource  {
  @JsonProperty("entity")
  private String entity = null;

  @JsonProperty("metric_entity")
  private String metricEntity = null;

  @JsonProperty("period")
  private Integer period = null;

  @JsonProperty("pool")
  private String pool = null;

  @JsonProperty("server")
  private String server = null;

  @JsonProperty("skip_hs_db_writes")
  private Boolean skipHsDbWrites = null;

  
  /**
   * entity of HSMgrDebugFilter.
   * @return entity
  **/
  @ApiModelProperty(value = "entity of HSMgrDebugFilter.")


 
  @VsoMethod  
  public String getEntity() {
    return entity;
  }
    
  @VsoMethod
  public void setEntity(String entity) {
    this.entity = entity;
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
   * Number of period.
   * @return period
  **/
  @ApiModelProperty(value = "Number of period.")


 
  @VsoMethod  
  public Integer getPeriod() {
    return period;
  }
    
  @VsoMethod
  public void setPeriod(Integer period) {
    this.period = period;
  }

  
  /**
   * pool of HSMgrDebugFilter.
   * @return pool
  **/
  @ApiModelProperty(value = "pool of HSMgrDebugFilter.")


 
  @VsoMethod  
  public String getPool() {
    return pool;
  }
    
  @VsoMethod
  public void setPool(String pool) {
    this.pool = pool;
  }

  
  /**
   * server of HSMgrDebugFilter.
   * @return server
  **/
  @ApiModelProperty(value = "server of HSMgrDebugFilter.")


 
  @VsoMethod  
  public String getServer() {
    return server;
  }
    
  @VsoMethod
  public void setServer(String server) {
    this.server = server;
  }

  
  /**
   * Placeholder for description of property skip_hs_db_writes of obj type HSMgrDebugFilter field type str  type boolean
   * @return skipHsDbWrites
  **/
  @ApiModelProperty(value = "Placeholder for description of property skip_hs_db_writes of obj type HSMgrDebugFilter field type str  type boolean")


 
  @VsoMethod  
  public Boolean isSkipHsDbWrites() {
    return skipHsDbWrites;
  }
    
  @VsoMethod
  public void setSkipHsDbWrites(Boolean skipHsDbWrites) {
    this.skipHsDbWrites = skipHsDbWrites;
  }

  
  public String getObjectID() {
		return "HSMgrDebugFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HSMgrDebugFilter hsMgrDebugFilter = (HSMgrDebugFilter) o;
    return Objects.equals(this.entity, hsMgrDebugFilter.entity) &&
        Objects.equals(this.metricEntity, hsMgrDebugFilter.metricEntity) &&
        Objects.equals(this.period, hsMgrDebugFilter.period) &&
        Objects.equals(this.pool, hsMgrDebugFilter.pool) &&
        Objects.equals(this.server, hsMgrDebugFilter.server) &&
        Objects.equals(this.skipHsDbWrites, hsMgrDebugFilter.skipHsDbWrites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, metricEntity, period, pool, server, skipHsDbWrites);
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

