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
    private String entity;

    @JsonProperty("metric_entity")
    @JsonInclude(Include.NON_NULL)
    private String metricEntity;

    @JsonProperty("period")
    @JsonInclude(Include.NON_NULL)
    private Integer period;

    @JsonProperty("pool")
    @JsonInclude(Include.NON_NULL)
    private String pool;

    @JsonProperty("server")
    @JsonInclude(Include.NON_NULL)
    private String server;

    @JsonProperty("skip_hs_db_writes")
    @JsonInclude(Include.NON_NULL)
    private Boolean skipHsDbWrites;

    @JsonProperty("vs_security_metrics_batch_size")
    @JsonInclude(Include.NON_NULL)
    private Integer vsSecurityMetricsBatchSize;

    @JsonProperty("waap_app_comp_threshold")
    @JsonInclude(Include.NON_NULL)
    private Float waapAppCompThreshold;

    @JsonProperty("waap_app_comp_weight")
    @JsonInclude(Include.NON_NULL)
    private Float waapAppCompWeight;

    @JsonProperty("waap_config_weight")
    @JsonInclude(Include.NON_NULL)
    private Float waapConfigWeight;

    @JsonProperty("waap_orphan_api_weight")
    @JsonInclude(Include.NON_NULL)
    private Float waapOrphanApiWeight;

    @JsonProperty("waap_shadow_api_weight")
    @JsonInclude(Include.NON_NULL)
    private Float waapShadowApiWeight;

    @JsonProperty("waap_violation_ratio_threshold")
    @JsonInclude(Include.NON_NULL)
    private Float waapViolationRatioThreshold;

    @JsonProperty("waap_violation_ratio_weight")
    @JsonInclude(Include.NON_NULL)
    private Float waapViolationRatioWeight;

    @JsonProperty("waap_zombie_api_weight")
    @JsonInclude(Include.NON_NULL)
    private Float waapZombieApiWeight;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return entity
   */
  @VsoMethod
  public String getEntity() {
    return entity;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricEntity set the metricEntity.
   */
  @VsoMethod
  public void setMetricEntity(String  metricEntity) {
    this.metricEntity = metricEntity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return period
   */
  @VsoMethod
  public Integer getPeriod() {
    return period;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param period set the period.
   */
  @VsoMethod
  public void setPeriod(Integer  period) {
    this.period = period;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pool
   */
  @VsoMethod
  public String getPool() {
    return pool;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pool set the pool.
   */
  @VsoMethod
  public void setPool(String  pool) {
    this.pool = pool;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return server
   */
  @VsoMethod
  public String getServer() {
    return server;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param server set the server.
   */
  @VsoMethod
  public void setServer(String  server) {
    this.server = server;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return skipHsDbWrites
   */
  @VsoMethod
  public Boolean getSkipHsDbWrites() {
    return skipHsDbWrites;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param skipHsDbWrites set the skipHsDbWrites.
   */
  @VsoMethod
  public void setSkipHsDbWrites(Boolean  skipHsDbWrites) {
    this.skipHsDbWrites = skipHsDbWrites;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Batch size for vs security metrics query.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsSecurityMetricsBatchSize
   */
  @VsoMethod
  public Integer getVsSecurityMetricsBatchSize() {
    return vsSecurityMetricsBatchSize;
  }

  /**
   * This is the setter method to the attribute.
   * Batch size for vs security metrics query.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsSecurityMetricsBatchSize set the vsSecurityMetricsBatchSize.
   */
  @VsoMethod
  public void setVsSecurityMetricsBatchSize(Integer  vsSecurityMetricsBatchSize) {
    this.vsSecurityMetricsBatchSize = vsSecurityMetricsBatchSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sigmoid midpoint for weighted ungoverned ratio.
   * Allowed values are 0.01-1.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return waapAppCompThreshold
   */
  @VsoMethod
  public Float getWaapAppCompThreshold() {
    return waapAppCompThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * Sigmoid midpoint for weighted ungoverned ratio.
   * Allowed values are 0.01-1.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param waapAppCompThreshold set the waapAppCompThreshold.
   */
  @VsoMethod
  public void setWaapAppCompThreshold(Float  waapAppCompThreshold) {
    this.waapAppCompThreshold = waapAppCompThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Relative weight for app composition sub-score.
   * Allowed values are 0-10.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return waapAppCompWeight
   */
  @VsoMethod
  public Float getWaapAppCompWeight() {
    return waapAppCompWeight;
  }

  /**
   * This is the setter method to the attribute.
   * Relative weight for app composition sub-score.
   * Allowed values are 0-10.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param waapAppCompWeight set the waapAppCompWeight.
   */
  @VsoMethod
  public void setWaapAppCompWeight(Float  waapAppCompWeight) {
    this.waapAppCompWeight = waapAppCompWeight;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Relative weight for waap config sub-score.
   * Allowed values are 0-10.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return waapConfigWeight
   */
  @VsoMethod
  public Float getWaapConfigWeight() {
    return waapConfigWeight;
  }

  /**
   * This is the setter method to the attribute.
   * Relative weight for waap config sub-score.
   * Allowed values are 0-10.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param waapConfigWeight set the waapConfigWeight.
   */
  @VsoMethod
  public void setWaapConfigWeight(Float  waapConfigWeight) {
    this.waapConfigWeight = waapConfigWeight;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Relative risk weight for orphan api traffic in app composition.
   * Allowed values are 0-5.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return waapOrphanApiWeight
   */
  @VsoMethod
  public Float getWaapOrphanApiWeight() {
    return waapOrphanApiWeight;
  }

  /**
   * This is the setter method to the attribute.
   * Relative risk weight for orphan api traffic in app composition.
   * Allowed values are 0-5.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param waapOrphanApiWeight set the waapOrphanApiWeight.
   */
  @VsoMethod
  public void setWaapOrphanApiWeight(Float  waapOrphanApiWeight) {
    this.waapOrphanApiWeight = waapOrphanApiWeight;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Relative risk weight for shadow api traffic in app composition.
   * Allowed values are 0-5.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return waapShadowApiWeight
   */
  @VsoMethod
  public Float getWaapShadowApiWeight() {
    return waapShadowApiWeight;
  }

  /**
   * This is the setter method to the attribute.
   * Relative risk weight for shadow api traffic in app composition.
   * Allowed values are 0-5.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param waapShadowApiWeight set the waapShadowApiWeight.
   */
  @VsoMethod
  public void setWaapShadowApiWeight(Float  waapShadowApiWeight) {
    this.waapShadowApiWeight = waapShadowApiWeight;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sigmoid midpoint for waap violation ratio (violation_count/total_hits at which sub-score is ~50).
   * Allowed values are 0.001-1.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return waapViolationRatioThreshold
   */
  @VsoMethod
  public Float getWaapViolationRatioThreshold() {
    return waapViolationRatioThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * Sigmoid midpoint for waap violation ratio (violation_count/total_hits at which sub-score is ~50).
   * Allowed values are 0.001-1.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param waapViolationRatioThreshold set the waapViolationRatioThreshold.
   */
  @VsoMethod
  public void setWaapViolationRatioThreshold(Float  waapViolationRatioThreshold) {
    this.waapViolationRatioThreshold = waapViolationRatioThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Relative weight for violation ratio in combined waap penalty.
   * Allowed values are 0-10.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return waapViolationRatioWeight
   */
  @VsoMethod
  public Float getWaapViolationRatioWeight() {
    return waapViolationRatioWeight;
  }

  /**
   * This is the setter method to the attribute.
   * Relative weight for violation ratio in combined waap penalty.
   * Allowed values are 0-10.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param waapViolationRatioWeight set the waapViolationRatioWeight.
   */
  @VsoMethod
  public void setWaapViolationRatioWeight(Float  waapViolationRatioWeight) {
    this.waapViolationRatioWeight = waapViolationRatioWeight;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Relative risk weight for zombie api traffic in app composition.
   * Allowed values are 0-5.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return waapZombieApiWeight
   */
  @VsoMethod
  public Float getWaapZombieApiWeight() {
    return waapZombieApiWeight;
  }

  /**
   * This is the setter method to the attribute.
   * Relative risk weight for zombie api traffic in app composition.
   * Allowed values are 0-5.0.
   * Field introduced in 32.1.4.
   * Unit is ratio.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param waapZombieApiWeight set the waapZombieApiWeight.
   */
  @VsoMethod
  public void setWaapZombieApiWeight(Float  waapZombieApiWeight) {
    this.waapZombieApiWeight = waapZombieApiWeight;
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
  Objects.equals(this.skipHsDbWrites, objHSMgrDebugFilter.skipHsDbWrites)&&
  Objects.equals(this.waapViolationRatioThreshold, objHSMgrDebugFilter.waapViolationRatioThreshold)&&
  Objects.equals(this.waapShadowApiWeight, objHSMgrDebugFilter.waapShadowApiWeight)&&
  Objects.equals(this.waapOrphanApiWeight, objHSMgrDebugFilter.waapOrphanApiWeight)&&
  Objects.equals(this.waapZombieApiWeight, objHSMgrDebugFilter.waapZombieApiWeight)&&
  Objects.equals(this.waapAppCompThreshold, objHSMgrDebugFilter.waapAppCompThreshold)&&
  Objects.equals(this.waapViolationRatioWeight, objHSMgrDebugFilter.waapViolationRatioWeight)&&
  Objects.equals(this.waapAppCompWeight, objHSMgrDebugFilter.waapAppCompWeight)&&
  Objects.equals(this.waapConfigWeight, objHSMgrDebugFilter.waapConfigWeight)&&
  Objects.equals(this.vsSecurityMetricsBatchSize, objHSMgrDebugFilter.vsSecurityMetricsBatchSize);
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
        sb.append("    vsSecurityMetricsBatchSize: ").append(toIndentedString(vsSecurityMetricsBatchSize)).append("\n");
        sb.append("    waapAppCompThreshold: ").append(toIndentedString(waapAppCompThreshold)).append("\n");
        sb.append("    waapAppCompWeight: ").append(toIndentedString(waapAppCompWeight)).append("\n");
        sb.append("    waapConfigWeight: ").append(toIndentedString(waapConfigWeight)).append("\n");
        sb.append("    waapOrphanApiWeight: ").append(toIndentedString(waapOrphanApiWeight)).append("\n");
        sb.append("    waapShadowApiWeight: ").append(toIndentedString(waapShadowApiWeight)).append("\n");
        sb.append("    waapViolationRatioThreshold: ").append(toIndentedString(waapViolationRatioThreshold)).append("\n");
        sb.append("    waapViolationRatioWeight: ").append(toIndentedString(waapViolationRatioWeight)).append("\n");
        sb.append("    waapZombieApiWeight: ").append(toIndentedString(waapZombieApiWeight)).append("\n");
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

