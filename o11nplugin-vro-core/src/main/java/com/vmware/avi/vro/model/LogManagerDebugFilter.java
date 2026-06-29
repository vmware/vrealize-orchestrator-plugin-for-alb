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
 * The LogManagerDebugFilter is a POJO class extends AviRestResource that used for creating
 * LogManagerDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LogManagerDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_LOGMANAGERDEBUGFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LogManagerDebugFilter extends AviRestResource {
    @JsonProperty("adf_protection_time_minutes")
    @JsonInclude(Include.NON_NULL)
    private Integer adfProtectionTimeMinutes = 1380;

    @JsonProperty("batch_queue_buffer_size")
    @JsonInclude(Include.NON_NULL)
    private Integer batchQueueBufferSize = 100;

    @JsonProperty("batch_worker_count")
    @JsonInclude(Include.NON_NULL)
    private Integer batchWorkerCount = 8;

    @JsonProperty("bulk_payload_buffer_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer bulkPayloadBufferPercent = 5;

    @JsonProperty("bulk_payload_string_size")
    @JsonInclude(Include.NON_NULL)
    private Integer bulkPayloadStringSize = 11000000;

    @JsonProperty("cache_cleanup_delay_ms")
    @JsonInclude(Include.NON_NULL)
    private Integer cacheCleanupDelayMs = 300000;

    @JsonProperty("client_index_op_timeout_seconds")
    @JsonInclude(Include.NON_NULL)
    private Integer clientIndexOpTimeoutSeconds = 5;

    @JsonProperty("db_notifn_chan_capacity")
    @JsonInclude(Include.NON_NULL)
    private Integer dbNotifnChanCapacity = 1000;

    @JsonProperty("entity_ref")
    @JsonInclude(Include.NON_NULL)
    private String entityRef;

    @JsonProperty("go_gc_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer goGcPercent = 50;

    @JsonProperty("incremental_timeout_buffer_ms")
    @JsonInclude(Include.NON_NULL)
    private Integer incrementalTimeoutBufferMs = 1000;

    @JsonProperty("index_cleaner_interval_minutes")
    @JsonInclude(Include.NON_NULL)
    private Integer indexCleanerIntervalMinutes = 30;

    @JsonProperty("index_config_path")
    @JsonInclude(Include.NON_NULL)
    private String indexConfigPath = "/var/lib/avi/indexer_configs";

    @JsonProperty("index_retention_period_minutes")
    @JsonInclude(Include.NON_NULL)
    private Integer indexRetentionPeriodMinutes = 1440;

    @JsonProperty("index_status_queue_buffer_size")
    @JsonInclude(Include.NON_NULL)
    private Integer indexStatusQueueBufferSize = 100;

    @JsonProperty("json_all_str_builder_size")
    @JsonInclude(Include.NON_NULL)
    private Integer jsonAllStrBuilderSize = 2048;

    @JsonProperty("json_everything_str_builder_size")
    @JsonInclude(Include.NON_NULL)
    private Integer jsonEverythingStrBuilderSize = 512;

    @JsonProperty("json_str_builder_size")
    @JsonInclude(Include.NON_NULL)
    private Integer jsonStrBuilderSize = 16384;

    @JsonProperty("log_indexer_task_timeout_ms")
    @JsonInclude(Include.NON_NULL)
    private Integer logIndexerTaskTimeoutMs = 60000;

    @JsonProperty("log_records_incremental_timeout_ms")
    @JsonInclude(Include.NON_NULL)
    private Integer logRecordsIncrementalTimeoutMs = 2000;

    @JsonProperty("log_records_task_timeout_ms")
    @JsonInclude(Include.NON_NULL)
    private Integer logRecordsTaskTimeoutMs = 1000;

    @JsonProperty("max_batch_duration_ms")
    @JsonInclude(Include.NON_NULL)
    private Integer maxBatchDurationMs = 500;

    @JsonProperty("max_batch_size")
    @JsonInclude(Include.NON_NULL)
    private Integer maxBatchSize = 10;

    @JsonProperty("max_files_per_index")
    @JsonInclude(Include.NON_NULL)
    private Integer maxFilesPerIndex = 2000;

    @JsonProperty("max_indices_events")
    @JsonInclude(Include.NON_NULL)
    private Integer maxIndicesEvents = 8;

    @JsonProperty("max_indices_per_vs")
    @JsonInclude(Include.NON_NULL)
    private Integer maxIndicesPerVs = 5;

    @JsonProperty("max_indices_system")
    @JsonInclude(Include.NON_NULL)
    private Integer maxIndicesSystem = 20;

    @JsonProperty("max_logs_per_index")
    @JsonInclude(Include.NON_NULL)
    private Integer maxLogsPerIndex = 2000000;

    @JsonProperty("max_num_workers")
    @JsonInclude(Include.NON_NULL)
    private Integer maxNumWorkers = 10;

    @JsonProperty("max_queue_size")
    @JsonInclude(Include.NON_NULL)
    private Integer maxQueueSize = 20;

    @JsonProperty("max_size_per_index_mb")
    @JsonInclude(Include.NON_NULL)
    private Integer maxSizePerIndexMb = 400;

    @JsonProperty("nf_protection_time_minutes")
    @JsonInclude(Include.NON_NULL)
    private Integer nfProtectionTimeMinutes = 30;

    @JsonProperty("opensearch_host")
    @JsonInclude(Include.NON_NULL)
    private String opensearchHost = "localhost";

    @JsonProperty("opensearch_num_replicas")
    @JsonInclude(Include.NON_NULL)
    private Integer opensearchNumReplicas = 0;

    @JsonProperty("opensearch_num_shards")
    @JsonInclude(Include.NON_NULL)
    private Integer opensearchNumShards = 9;

    @JsonProperty("opensearch_port")
    @JsonInclude(Include.NON_NULL)
    private String opensearchPort = "5010";

    @JsonProperty("query_queue_buffer_size")
    @JsonInclude(Include.NON_NULL)
    private Integer queryQueueBufferSize = 100;

    @JsonProperty("query_worker_count")
    @JsonInclude(Include.NON_NULL)
    private Integer queryWorkerCount = 8;

    @JsonProperty("records_status_queue_buffer_size")
    @JsonInclude(Include.NON_NULL)
    private Integer recordsStatusQueueBufferSize = 100;

    @JsonProperty("records_status_worker_count")
    @JsonInclude(Include.NON_NULL)
    private Integer recordsStatusWorkerCount = 8;

    @JsonProperty("reserved_1")
    @JsonInclude(Include.NON_NULL)
    private String reserved1;

    @JsonProperty("reserved_2")
    @JsonInclude(Include.NON_NULL)
    private String reserved2;

    @JsonProperty("reserved_3")
    @JsonInclude(Include.NON_NULL)
    private Integer reserved3;

    @JsonProperty("reserved_4")
    @JsonInclude(Include.NON_NULL)
    private Integer reserved4;

    @JsonProperty("search_query_timeout_ms")
    @JsonInclude(Include.NON_NULL)
    private Integer searchQueryTimeoutMs = 15000;

    @JsonProperty("task_re_enqueue_wait_time_seconds")
    @JsonInclude(Include.NON_NULL)
    private Integer taskReEnqueueWaitTimeSeconds = 1;

    @JsonProperty("telemetry_trace_log_level")
    @JsonInclude(Include.NON_NULL)
    private String telemetryTraceLogLevel;

    @JsonProperty("telemetry_trace_percentage")
    @JsonInclude(Include.NON_NULL)
    private Integer telemetryTracePercentage = 100;

    @JsonProperty("udf_protection_time_minutes")
    @JsonInclude(Include.NON_NULL)
    private Integer udfProtectionTimeMinutes = 60;



  /**
   * This is the getter method this will return the attribute value.
   * Delete protection time for adf indices in minutes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1380.
   * @return adfProtectionTimeMinutes
   */
  @VsoMethod
  public Integer getAdfProtectionTimeMinutes() {
    return adfProtectionTimeMinutes;
  }

  /**
   * This is the setter method to the attribute.
   * Delete protection time for adf indices in minutes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1380.
   * @param adfProtectionTimeMinutes set the adfProtectionTimeMinutes.
   */
  @VsoMethod
  public void setAdfProtectionTimeMinutes(Integer  adfProtectionTimeMinutes) {
    this.adfProtectionTimeMinutes = adfProtectionTimeMinutes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Buffer size for batch queues.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return batchQueueBufferSize
   */
  @VsoMethod
  public Integer getBatchQueueBufferSize() {
    return batchQueueBufferSize;
  }

  /**
   * This is the setter method to the attribute.
   * Buffer size for batch queues.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param batchQueueBufferSize set the batchQueueBufferSize.
   */
  @VsoMethod
  public void setBatchQueueBufferSize(Integer  batchQueueBufferSize) {
    this.batchQueueBufferSize = batchQueueBufferSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of workers for batch processing.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @return batchWorkerCount
   */
  @VsoMethod
  public Integer getBatchWorkerCount() {
    return batchWorkerCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of workers for batch processing.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @param batchWorkerCount set the batchWorkerCount.
   */
  @VsoMethod
  public void setBatchWorkerCount(Integer  batchWorkerCount) {
    this.batchWorkerCount = batchWorkerCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percentage of bulk_payload_string_size to reserve as buffer for ip group string replacement.
   * This buffer accounts for cases where short ip addresses are replaced with longer ip group names during batch processing.
   * Default is 5%.
   * Allowed values are 0-20.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return bulkPayloadBufferPercent
   */
  @VsoMethod
  public Integer getBulkPayloadBufferPercent() {
    return bulkPayloadBufferPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Percentage of bulk_payload_string_size to reserve as buffer for ip group string replacement.
   * This buffer accounts for cases where short ip addresses are replaced with longer ip group names during batch processing.
   * Default is 5%.
   * Allowed values are 0-20.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param bulkPayloadBufferPercent set the bulkPayloadBufferPercent.
   */
  @VsoMethod
  public void setBulkPayloadBufferPercent(Integer  bulkPayloadBufferPercent) {
    this.bulkPayloadBufferPercent = bulkPayloadBufferPercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Size of bulk payload buffer.
   * This is the max bulk payload size.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 11000000.
   * @return bulkPayloadStringSize
   */
  @VsoMethod
  public Integer getBulkPayloadStringSize() {
    return bulkPayloadStringSize;
  }

  /**
   * This is the setter method to the attribute.
   * Size of bulk payload buffer.
   * This is the max bulk payload size.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 11000000.
   * @param bulkPayloadStringSize set the bulkPayloadStringSize.
   */
  @VsoMethod
  public void setBulkPayloadStringSize(Integer  bulkPayloadStringSize) {
    this.bulkPayloadStringSize = bulkPayloadStringSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cache cleanup delay in milliseconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300000.
   * @return cacheCleanupDelayMs
   */
  @VsoMethod
  public Integer getCacheCleanupDelayMs() {
    return cacheCleanupDelayMs;
  }

  /**
   * This is the setter method to the attribute.
   * Cache cleanup delay in milliseconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300000.
   * @param cacheCleanupDelayMs set the cacheCleanupDelayMs.
   */
  @VsoMethod
  public void setCacheCleanupDelayMs(Integer  cacheCleanupDelayMs) {
    this.cacheCleanupDelayMs = cacheCleanupDelayMs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timeout for the client to create an index in seconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return clientIndexOpTimeoutSeconds
   */
  @VsoMethod
  public Integer getClientIndexOpTimeoutSeconds() {
    return clientIndexOpTimeoutSeconds;
  }

  /**
   * This is the setter method to the attribute.
   * Timeout for the client to create an index in seconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param clientIndexOpTimeoutSeconds set the clientIndexOpTimeoutSeconds.
   */
  @VsoMethod
  public void setClientIndexOpTimeoutSeconds(Integer  clientIndexOpTimeoutSeconds) {
    this.clientIndexOpTimeoutSeconds = clientIndexOpTimeoutSeconds;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Database notification channel capacity.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return dbNotifnChanCapacity
   */
  @VsoMethod
  public Integer getDbNotifnChanCapacity() {
    return dbNotifnChanCapacity;
  }

  /**
   * This is the setter method to the attribute.
   * Database notification channel capacity.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param dbNotifnChanCapacity set the dbNotifnChanCapacity.
   */
  @VsoMethod
  public void setDbNotifnChanCapacity(Integer  dbNotifnChanCapacity) {
    this.dbNotifnChanCapacity = dbNotifnChanCapacity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the entity.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 21.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return entityRef
   */
  @VsoMethod
  public String getEntityRef() {
    return entityRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the entity.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 21.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param entityRef set the entityRef.
   */
  @VsoMethod
  public void setEntityRef(String  entityRef) {
    this.entityRef = entityRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Go garbage collection percentage.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 50.
   * @return goGcPercent
   */
  @VsoMethod
  public Integer getGoGcPercent() {
    return goGcPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Go garbage collection percentage.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 50.
   * @param goGcPercent set the goGcPercent.
   */
  @VsoMethod
  public void setGoGcPercent(Integer  goGcPercent) {
    this.goGcPercent = goGcPercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Incremental timeout buffer in milliseconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return incrementalTimeoutBufferMs
   */
  @VsoMethod
  public Integer getIncrementalTimeoutBufferMs() {
    return incrementalTimeoutBufferMs;
  }

  /**
   * This is the setter method to the attribute.
   * Incremental timeout buffer in milliseconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param incrementalTimeoutBufferMs set the incrementalTimeoutBufferMs.
   */
  @VsoMethod
  public void setIncrementalTimeoutBufferMs(Integer  incrementalTimeoutBufferMs) {
    this.incrementalTimeoutBufferMs = incrementalTimeoutBufferMs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Index cleaner interval in minutes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return indexCleanerIntervalMinutes
   */
  @VsoMethod
  public Integer getIndexCleanerIntervalMinutes() {
    return indexCleanerIntervalMinutes;
  }

  /**
   * This is the setter method to the attribute.
   * Index cleaner interval in minutes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param indexCleanerIntervalMinutes set the indexCleanerIntervalMinutes.
   */
  @VsoMethod
  public void setIndexCleanerIntervalMinutes(Integer  indexCleanerIntervalMinutes) {
    this.indexCleanerIntervalMinutes = indexCleanerIntervalMinutes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Base path for search engine mappings and settings.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "/var/lib/avi/indexer_configs".
   * @return indexConfigPath
   */
  @VsoMethod
  public String getIndexConfigPath() {
    return indexConfigPath;
  }

  /**
   * This is the setter method to the attribute.
   * Base path for search engine mappings and settings.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "/var/lib/avi/indexer_configs".
   * @param indexConfigPath set the indexConfigPath.
   */
  @VsoMethod
  public void setIndexConfigPath(String  indexConfigPath) {
    this.indexConfigPath = indexConfigPath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Index retention period in minutes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1440.
   * @return indexRetentionPeriodMinutes
   */
  @VsoMethod
  public Integer getIndexRetentionPeriodMinutes() {
    return indexRetentionPeriodMinutes;
  }

  /**
   * This is the setter method to the attribute.
   * Index retention period in minutes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1440.
   * @param indexRetentionPeriodMinutes set the indexRetentionPeriodMinutes.
   */
  @VsoMethod
  public void setIndexRetentionPeriodMinutes(Integer  indexRetentionPeriodMinutes) {
    this.indexRetentionPeriodMinutes = indexRetentionPeriodMinutes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Buffer size for index status queue.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return indexStatusQueueBufferSize
   */
  @VsoMethod
  public Integer getIndexStatusQueueBufferSize() {
    return indexStatusQueueBufferSize;
  }

  /**
   * This is the setter method to the attribute.
   * Buffer size for index status queue.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param indexStatusQueueBufferSize set the indexStatusQueueBufferSize.
   */
  @VsoMethod
  public void setIndexStatusQueueBufferSize(Integer  indexStatusQueueBufferSize) {
    this.indexStatusQueueBufferSize = indexStatusQueueBufferSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Renderer configuration - json all string builder size.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
   * @return jsonAllStrBuilderSize
   */
  @VsoMethod
  public Integer getJsonAllStrBuilderSize() {
    return jsonAllStrBuilderSize;
  }

  /**
   * This is the setter method to the attribute.
   * Renderer configuration - json all string builder size.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
   * @param jsonAllStrBuilderSize set the jsonAllStrBuilderSize.
   */
  @VsoMethod
  public void setJsonAllStrBuilderSize(Integer  jsonAllStrBuilderSize) {
    this.jsonAllStrBuilderSize = jsonAllStrBuilderSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Renderer configuration - json everything string builder size.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 512.
   * @return jsonEverythingStrBuilderSize
   */
  @VsoMethod
  public Integer getJsonEverythingStrBuilderSize() {
    return jsonEverythingStrBuilderSize;
  }

  /**
   * This is the setter method to the attribute.
   * Renderer configuration - json everything string builder size.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 512.
   * @param jsonEverythingStrBuilderSize set the jsonEverythingStrBuilderSize.
   */
  @VsoMethod
  public void setJsonEverythingStrBuilderSize(Integer  jsonEverythingStrBuilderSize) {
    this.jsonEverythingStrBuilderSize = jsonEverythingStrBuilderSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Renderer configuration - json string builder size.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 16384.
   * @return jsonStrBuilderSize
   */
  @VsoMethod
  public Integer getJsonStrBuilderSize() {
    return jsonStrBuilderSize;
  }

  /**
   * This is the setter method to the attribute.
   * Renderer configuration - json string builder size.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 16384.
   * @param jsonStrBuilderSize set the jsonStrBuilderSize.
   */
  @VsoMethod
  public void setJsonStrBuilderSize(Integer  jsonStrBuilderSize) {
    this.jsonStrBuilderSize = jsonStrBuilderSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Log indexer task timeout in milliseconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60000.
   * @return logIndexerTaskTimeoutMs
   */
  @VsoMethod
  public Integer getLogIndexerTaskTimeoutMs() {
    return logIndexerTaskTimeoutMs;
  }

  /**
   * This is the setter method to the attribute.
   * Log indexer task timeout in milliseconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60000.
   * @param logIndexerTaskTimeoutMs set the logIndexerTaskTimeoutMs.
   */
  @VsoMethod
  public void setLogIndexerTaskTimeoutMs(Integer  logIndexerTaskTimeoutMs) {
    this.logIndexerTaskTimeoutMs = logIndexerTaskTimeoutMs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Log records incremental timeout in milliseconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @return logRecordsIncrementalTimeoutMs
   */
  @VsoMethod
  public Integer getLogRecordsIncrementalTimeoutMs() {
    return logRecordsIncrementalTimeoutMs;
  }

  /**
   * This is the setter method to the attribute.
   * Log records incremental timeout in milliseconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @param logRecordsIncrementalTimeoutMs set the logRecordsIncrementalTimeoutMs.
   */
  @VsoMethod
  public void setLogRecordsIncrementalTimeoutMs(Integer  logRecordsIncrementalTimeoutMs) {
    this.logRecordsIncrementalTimeoutMs = logRecordsIncrementalTimeoutMs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Log records task timeout in milliseconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return logRecordsTaskTimeoutMs
   */
  @VsoMethod
  public Integer getLogRecordsTaskTimeoutMs() {
    return logRecordsTaskTimeoutMs;
  }

  /**
   * This is the setter method to the attribute.
   * Log records task timeout in milliseconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param logRecordsTaskTimeoutMs set the logRecordsTaskTimeoutMs.
   */
  @VsoMethod
  public void setLogRecordsTaskTimeoutMs(Integer  logRecordsTaskTimeoutMs) {
    this.logRecordsTaskTimeoutMs = logRecordsTaskTimeoutMs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum duration to wait for batching files to indexer.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 500.
   * @return maxBatchDurationMs
   */
  @VsoMethod
  public Integer getMaxBatchDurationMs() {
    return maxBatchDurationMs;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum duration to wait for batching files to indexer.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 500.
   * @param maxBatchDurationMs set the maxBatchDurationMs.
   */
  @VsoMethod
  public void setMaxBatchDurationMs(Integer  maxBatchDurationMs) {
    this.maxBatchDurationMs = maxBatchDurationMs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of files in a batch to indexer.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return maxBatchSize
   */
  @VsoMethod
  public Integer getMaxBatchSize() {
    return maxBatchSize;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of files in a batch to indexer.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param maxBatchSize set the maxBatchSize.
   */
  @VsoMethod
  public void setMaxBatchSize(Integer  maxBatchSize) {
    this.maxBatchSize = maxBatchSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of files per index.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @return maxFilesPerIndex
   */
  @VsoMethod
  public Integer getMaxFilesPerIndex() {
    return maxFilesPerIndex;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of files per index.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @param maxFilesPerIndex set the maxFilesPerIndex.
   */
  @VsoMethod
  public void setMaxFilesPerIndex(Integer  maxFilesPerIndex) {
    this.maxFilesPerIndex = maxFilesPerIndex;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of indices for events.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @return maxIndicesEvents
   */
  @VsoMethod
  public Integer getMaxIndicesEvents() {
    return maxIndicesEvents;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of indices for events.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @param maxIndicesEvents set the maxIndicesEvents.
   */
  @VsoMethod
  public void setMaxIndicesEvents(Integer  maxIndicesEvents) {
    this.maxIndicesEvents = maxIndicesEvents;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of indices per vs.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return maxIndicesPerVs
   */
  @VsoMethod
  public Integer getMaxIndicesPerVs() {
    return maxIndicesPerVs;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of indices per vs.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param maxIndicesPerVs set the maxIndicesPerVs.
   */
  @VsoMethod
  public void setMaxIndicesPerVs(Integer  maxIndicesPerVs) {
    this.maxIndicesPerVs = maxIndicesPerVs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of indices for system.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return maxIndicesSystem
   */
  @VsoMethod
  public Integer getMaxIndicesSystem() {
    return maxIndicesSystem;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of indices for system.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param maxIndicesSystem set the maxIndicesSystem.
   */
  @VsoMethod
  public void setMaxIndicesSystem(Integer  maxIndicesSystem) {
    this.maxIndicesSystem = maxIndicesSystem;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of logs per index.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000000.
   * @return maxLogsPerIndex
   */
  @VsoMethod
  public Integer getMaxLogsPerIndex() {
    return maxLogsPerIndex;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of logs per index.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000000.
   * @param maxLogsPerIndex set the maxLogsPerIndex.
   */
  @VsoMethod
  public void setMaxLogsPerIndex(Integer  maxLogsPerIndex) {
    this.maxLogsPerIndex = maxLogsPerIndex;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of goroutines for indexer_worker.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return maxNumWorkers
   */
  @VsoMethod
  public Integer getMaxNumWorkers() {
    return maxNumWorkers;
  }

  /**
   * This is the setter method to the attribute.
   * Number of goroutines for indexer_worker.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param maxNumWorkers set the maxNumWorkers.
   */
  @VsoMethod
  public void setMaxNumWorkers(Integer  maxNumWorkers) {
    this.maxNumWorkers = maxNumWorkers;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max number of index task requests taken by indexer.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return maxQueueSize
   */
  @VsoMethod
  public Integer getMaxQueueSize() {
    return maxQueueSize;
  }

  /**
   * This is the setter method to the attribute.
   * Max number of index task requests taken by indexer.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param maxQueueSize set the maxQueueSize.
   */
  @VsoMethod
  public void setMaxQueueSize(Integer  maxQueueSize) {
    this.maxQueueSize = maxQueueSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum size per index in mb.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 400.
   * @return maxSizePerIndexMb
   */
  @VsoMethod
  public Integer getMaxSizePerIndexMb() {
    return maxSizePerIndexMb;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum size per index in mb.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 400.
   * @param maxSizePerIndexMb set the maxSizePerIndexMb.
   */
  @VsoMethod
  public void setMaxSizePerIndexMb(Integer  maxSizePerIndexMb) {
    this.maxSizePerIndexMb = maxSizePerIndexMb;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Delete protection time for nf indices in minutes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return nfProtectionTimeMinutes
   */
  @VsoMethod
  public Integer getNfProtectionTimeMinutes() {
    return nfProtectionTimeMinutes;
  }

  /**
   * This is the setter method to the attribute.
   * Delete protection time for nf indices in minutes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param nfProtectionTimeMinutes set the nfProtectionTimeMinutes.
   */
  @VsoMethod
  public void setNfProtectionTimeMinutes(Integer  nfProtectionTimeMinutes) {
    this.nfProtectionTimeMinutes = nfProtectionTimeMinutes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Opensearch host.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "localhost".
   * @return opensearchHost
   */
  @VsoMethod
  public String getOpensearchHost() {
    return opensearchHost;
  }

  /**
   * This is the setter method to the attribute.
   * Opensearch host.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "localhost".
   * @param opensearchHost set the opensearchHost.
   */
  @VsoMethod
  public void setOpensearchHost(String  opensearchHost) {
    this.opensearchHost = opensearchHost;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of replicas for opensearch.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return opensearchNumReplicas
   */
  @VsoMethod
  public Integer getOpensearchNumReplicas() {
    return opensearchNumReplicas;
  }

  /**
   * This is the setter method to the attribute.
   * Number of replicas for opensearch.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param opensearchNumReplicas set the opensearchNumReplicas.
   */
  @VsoMethod
  public void setOpensearchNumReplicas(Integer  opensearchNumReplicas) {
    this.opensearchNumReplicas = opensearchNumReplicas;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of shards for opensearch.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 9.
   * @return opensearchNumShards
   */
  @VsoMethod
  public Integer getOpensearchNumShards() {
    return opensearchNumShards;
  }

  /**
   * This is the setter method to the attribute.
   * Number of shards for opensearch.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 9.
   * @param opensearchNumShards set the opensearchNumShards.
   */
  @VsoMethod
  public void setOpensearchNumShards(Integer  opensearchNumShards) {
    this.opensearchNumShards = opensearchNumShards;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Opensearch port.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "5010".
   * @return opensearchPort
   */
  @VsoMethod
  public String getOpensearchPort() {
    return opensearchPort;
  }

  /**
   * This is the setter method to the attribute.
   * Opensearch port.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "5010".
   * @param opensearchPort set the opensearchPort.
   */
  @VsoMethod
  public void setOpensearchPort(String  opensearchPort) {
    this.opensearchPort = opensearchPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Buffer size for query queues.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return queryQueueBufferSize
   */
  @VsoMethod
  public Integer getQueryQueueBufferSize() {
    return queryQueueBufferSize;
  }

  /**
   * This is the setter method to the attribute.
   * Buffer size for query queues.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param queryQueueBufferSize set the queryQueueBufferSize.
   */
  @VsoMethod
  public void setQueryQueueBufferSize(Integer  queryQueueBufferSize) {
    this.queryQueueBufferSize = queryQueueBufferSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of workers for query processing.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @return queryWorkerCount
   */
  @VsoMethod
  public Integer getQueryWorkerCount() {
    return queryWorkerCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of workers for query processing.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @param queryWorkerCount set the queryWorkerCount.
   */
  @VsoMethod
  public void setQueryWorkerCount(Integer  queryWorkerCount) {
    this.queryWorkerCount = queryWorkerCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Buffer size for records status queue.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return recordsStatusQueueBufferSize
   */
  @VsoMethod
  public Integer getRecordsStatusQueueBufferSize() {
    return recordsStatusQueueBufferSize;
  }

  /**
   * This is the setter method to the attribute.
   * Buffer size for records status queue.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param recordsStatusQueueBufferSize set the recordsStatusQueueBufferSize.
   */
  @VsoMethod
  public void setRecordsStatusQueueBufferSize(Integer  recordsStatusQueueBufferSize) {
    this.recordsStatusQueueBufferSize = recordsStatusQueueBufferSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of workers for records status processing.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @return recordsStatusWorkerCount
   */
  @VsoMethod
  public Integer getRecordsStatusWorkerCount() {
    return recordsStatusWorkerCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of workers for records status processing.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 8.
   * @param recordsStatusWorkerCount set the recordsStatusWorkerCount.
   */
  @VsoMethod
  public void setRecordsStatusWorkerCount(Integer  recordsStatusWorkerCount) {
    this.recordsStatusWorkerCount = recordsStatusWorkerCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reserved field for future use.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reserved1
   */
  @VsoMethod
  public String getReserved1() {
    return reserved1;
  }

  /**
   * This is the setter method to the attribute.
   * Reserved field for future use.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reserved1 set the reserved1.
   */
  @VsoMethod
  public void setReserved1(String  reserved1) {
    this.reserved1 = reserved1;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reserved field for future use.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reserved2
   */
  @VsoMethod
  public String getReserved2() {
    return reserved2;
  }

  /**
   * This is the setter method to the attribute.
   * Reserved field for future use.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reserved2 set the reserved2.
   */
  @VsoMethod
  public void setReserved2(String  reserved2) {
    this.reserved2 = reserved2;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reserved field for future use.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reserved3
   */
  @VsoMethod
  public Integer getReserved3() {
    return reserved3;
  }

  /**
   * This is the setter method to the attribute.
   * Reserved field for future use.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reserved3 set the reserved3.
   */
  @VsoMethod
  public void setReserved3(Integer  reserved3) {
    this.reserved3 = reserved3;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reserved field for future use.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reserved4
   */
  @VsoMethod
  public Integer getReserved4() {
    return reserved4;
  }

  /**
   * This is the setter method to the attribute.
   * Reserved field for future use.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reserved4 set the reserved4.
   */
  @VsoMethod
  public void setReserved4(Integer  reserved4) {
    this.reserved4 = reserved4;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Search query timeout in milliseconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15000.
   * @return searchQueryTimeoutMs
   */
  @VsoMethod
  public Integer getSearchQueryTimeoutMs() {
    return searchQueryTimeoutMs;
  }

  /**
   * This is the setter method to the attribute.
   * Search query timeout in milliseconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 15000.
   * @param searchQueryTimeoutMs set the searchQueryTimeoutMs.
   */
  @VsoMethod
  public void setSearchQueryTimeoutMs(Integer  searchQueryTimeoutMs) {
    this.searchQueryTimeoutMs = searchQueryTimeoutMs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Wait time before re-enqueueing failed tasks in seconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return taskReEnqueueWaitTimeSeconds
   */
  @VsoMethod
  public Integer getTaskReEnqueueWaitTimeSeconds() {
    return taskReEnqueueWaitTimeSeconds;
  }

  /**
   * This is the setter method to the attribute.
   * Wait time before re-enqueueing failed tasks in seconds.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param taskReEnqueueWaitTimeSeconds set the taskReEnqueueWaitTimeSeconds.
   */
  @VsoMethod
  public void setTaskReEnqueueWaitTimeSeconds(Integer  taskReEnqueueWaitTimeSeconds) {
    this.taskReEnqueueWaitTimeSeconds = taskReEnqueueWaitTimeSeconds;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set the log level for telemetry trace logs.
   * Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR, LOG_LEVEL_DEBUG.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return telemetryTraceLogLevel
   */
  @VsoMethod
  public String getTelemetryTraceLogLevel() {
    return telemetryTraceLogLevel;
  }

  /**
   * This is the setter method to the attribute.
   * Set the log level for telemetry trace logs.
   * Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR, LOG_LEVEL_DEBUG.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param telemetryTraceLogLevel set the telemetryTraceLogLevel.
   */
  @VsoMethod
  public void setTelemetryTraceLogLevel(String  telemetryTraceLogLevel) {
    this.telemetryTraceLogLevel = telemetryTraceLogLevel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Telemetry trace percentage.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return telemetryTracePercentage
   */
  @VsoMethod
  public Integer getTelemetryTracePercentage() {
    return telemetryTracePercentage;
  }

  /**
   * This is the setter method to the attribute.
   * Telemetry trace percentage.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param telemetryTracePercentage set the telemetryTracePercentage.
   */
  @VsoMethod
  public void setTelemetryTracePercentage(Integer  telemetryTracePercentage) {
    this.telemetryTracePercentage = telemetryTracePercentage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Delete protection time for udf indices in minutes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return udfProtectionTimeMinutes
   */
  @VsoMethod
  public Integer getUdfProtectionTimeMinutes() {
    return udfProtectionTimeMinutes;
  }

  /**
   * This is the setter method to the attribute.
   * Delete protection time for udf indices in minutes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param udfProtectionTimeMinutes set the udfProtectionTimeMinutes.
   */
  @VsoMethod
  public void setUdfProtectionTimeMinutes(Integer  udfProtectionTimeMinutes) {
    this.udfProtectionTimeMinutes = udfProtectionTimeMinutes;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LogManagerDebugFilter objLogManagerDebugFilter = (LogManagerDebugFilter) o;
  return   Objects.equals(this.entityRef, objLogManagerDebugFilter.entityRef)&&
  Objects.equals(this.telemetryTraceLogLevel, objLogManagerDebugFilter.telemetryTraceLogLevel)&&
  Objects.equals(this.bulkPayloadStringSize, objLogManagerDebugFilter.bulkPayloadStringSize)&&
  Objects.equals(this.maxNumWorkers, objLogManagerDebugFilter.maxNumWorkers)&&
  Objects.equals(this.maxQueueSize, objLogManagerDebugFilter.maxQueueSize)&&
  Objects.equals(this.taskReEnqueueWaitTimeSeconds, objLogManagerDebugFilter.taskReEnqueueWaitTimeSeconds)&&
  Objects.equals(this.jsonStrBuilderSize, objLogManagerDebugFilter.jsonStrBuilderSize)&&
  Objects.equals(this.jsonAllStrBuilderSize, objLogManagerDebugFilter.jsonAllStrBuilderSize)&&
  Objects.equals(this.jsonEverythingStrBuilderSize, objLogManagerDebugFilter.jsonEverythingStrBuilderSize)&&
  Objects.equals(this.indexConfigPath, objLogManagerDebugFilter.indexConfigPath)&&
  Objects.equals(this.maxFilesPerIndex, objLogManagerDebugFilter.maxFilesPerIndex)&&
  Objects.equals(this.clientIndexOpTimeoutSeconds, objLogManagerDebugFilter.clientIndexOpTimeoutSeconds)&&
  Objects.equals(this.maxIndicesPerVs, objLogManagerDebugFilter.maxIndicesPerVs)&&
  Objects.equals(this.maxLogsPerIndex, objLogManagerDebugFilter.maxLogsPerIndex)&&
  Objects.equals(this.maxSizePerIndexMb, objLogManagerDebugFilter.maxSizePerIndexMb)&&
  Objects.equals(this.indexRetentionPeriodMinutes, objLogManagerDebugFilter.indexRetentionPeriodMinutes)&&
  Objects.equals(this.indexCleanerIntervalMinutes, objLogManagerDebugFilter.indexCleanerIntervalMinutes)&&
  Objects.equals(this.maxIndicesEvents, objLogManagerDebugFilter.maxIndicesEvents)&&
  Objects.equals(this.maxIndicesSystem, objLogManagerDebugFilter.maxIndicesSystem)&&
  Objects.equals(this.adfProtectionTimeMinutes, objLogManagerDebugFilter.adfProtectionTimeMinutes)&&
  Objects.equals(this.udfProtectionTimeMinutes, objLogManagerDebugFilter.udfProtectionTimeMinutes)&&
  Objects.equals(this.nfProtectionTimeMinutes, objLogManagerDebugFilter.nfProtectionTimeMinutes)&&
  Objects.equals(this.opensearchHost, objLogManagerDebugFilter.opensearchHost)&&
  Objects.equals(this.opensearchPort, objLogManagerDebugFilter.opensearchPort)&&
  Objects.equals(this.opensearchNumShards, objLogManagerDebugFilter.opensearchNumShards)&&
  Objects.equals(this.opensearchNumReplicas, objLogManagerDebugFilter.opensearchNumReplicas)&&
  Objects.equals(this.reserved1, objLogManagerDebugFilter.reserved1)&&
  Objects.equals(this.reserved2, objLogManagerDebugFilter.reserved2)&&
  Objects.equals(this.reserved3, objLogManagerDebugFilter.reserved3)&&
  Objects.equals(this.reserved4, objLogManagerDebugFilter.reserved4)&&
  Objects.equals(this.dbNotifnChanCapacity, objLogManagerDebugFilter.dbNotifnChanCapacity)&&
  Objects.equals(this.maxBatchSize, objLogManagerDebugFilter.maxBatchSize)&&
  Objects.equals(this.maxBatchDurationMs, objLogManagerDebugFilter.maxBatchDurationMs)&&
  Objects.equals(this.telemetryTracePercentage, objLogManagerDebugFilter.telemetryTracePercentage)&&
  Objects.equals(this.logRecordsTaskTimeoutMs, objLogManagerDebugFilter.logRecordsTaskTimeoutMs)&&
  Objects.equals(this.logIndexerTaskTimeoutMs, objLogManagerDebugFilter.logIndexerTaskTimeoutMs)&&
  Objects.equals(this.searchQueryTimeoutMs, objLogManagerDebugFilter.searchQueryTimeoutMs)&&
  Objects.equals(this.goGcPercent, objLogManagerDebugFilter.goGcPercent)&&
  Objects.equals(this.queryWorkerCount, objLogManagerDebugFilter.queryWorkerCount)&&
  Objects.equals(this.recordsStatusWorkerCount, objLogManagerDebugFilter.recordsStatusWorkerCount)&&
  Objects.equals(this.batchWorkerCount, objLogManagerDebugFilter.batchWorkerCount)&&
  Objects.equals(this.queryQueueBufferSize, objLogManagerDebugFilter.queryQueueBufferSize)&&
  Objects.equals(this.recordsStatusQueueBufferSize, objLogManagerDebugFilter.recordsStatusQueueBufferSize)&&
  Objects.equals(this.batchQueueBufferSize, objLogManagerDebugFilter.batchQueueBufferSize)&&
  Objects.equals(this.indexStatusQueueBufferSize, objLogManagerDebugFilter.indexStatusQueueBufferSize)&&
  Objects.equals(this.cacheCleanupDelayMs, objLogManagerDebugFilter.cacheCleanupDelayMs)&&
  Objects.equals(this.logRecordsIncrementalTimeoutMs, objLogManagerDebugFilter.logRecordsIncrementalTimeoutMs)&&
  Objects.equals(this.incrementalTimeoutBufferMs, objLogManagerDebugFilter.incrementalTimeoutBufferMs)&&
  Objects.equals(this.bulkPayloadBufferPercent, objLogManagerDebugFilter.bulkPayloadBufferPercent);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LogManagerDebugFilter {\n");
      sb.append("    adfProtectionTimeMinutes: ").append(toIndentedString(adfProtectionTimeMinutes)).append("\n");
        sb.append("    batchQueueBufferSize: ").append(toIndentedString(batchQueueBufferSize)).append("\n");
        sb.append("    batchWorkerCount: ").append(toIndentedString(batchWorkerCount)).append("\n");
        sb.append("    bulkPayloadBufferPercent: ").append(toIndentedString(bulkPayloadBufferPercent)).append("\n");
        sb.append("    bulkPayloadStringSize: ").append(toIndentedString(bulkPayloadStringSize)).append("\n");
        sb.append("    cacheCleanupDelayMs: ").append(toIndentedString(cacheCleanupDelayMs)).append("\n");
        sb.append("    clientIndexOpTimeoutSeconds: ").append(toIndentedString(clientIndexOpTimeoutSeconds)).append("\n");
        sb.append("    dbNotifnChanCapacity: ").append(toIndentedString(dbNotifnChanCapacity)).append("\n");
        sb.append("    entityRef: ").append(toIndentedString(entityRef)).append("\n");
        sb.append("    goGcPercent: ").append(toIndentedString(goGcPercent)).append("\n");
        sb.append("    incrementalTimeoutBufferMs: ").append(toIndentedString(incrementalTimeoutBufferMs)).append("\n");
        sb.append("    indexCleanerIntervalMinutes: ").append(toIndentedString(indexCleanerIntervalMinutes)).append("\n");
        sb.append("    indexConfigPath: ").append(toIndentedString(indexConfigPath)).append("\n");
        sb.append("    indexRetentionPeriodMinutes: ").append(toIndentedString(indexRetentionPeriodMinutes)).append("\n");
        sb.append("    indexStatusQueueBufferSize: ").append(toIndentedString(indexStatusQueueBufferSize)).append("\n");
        sb.append("    jsonAllStrBuilderSize: ").append(toIndentedString(jsonAllStrBuilderSize)).append("\n");
        sb.append("    jsonEverythingStrBuilderSize: ").append(toIndentedString(jsonEverythingStrBuilderSize)).append("\n");
        sb.append("    jsonStrBuilderSize: ").append(toIndentedString(jsonStrBuilderSize)).append("\n");
        sb.append("    logIndexerTaskTimeoutMs: ").append(toIndentedString(logIndexerTaskTimeoutMs)).append("\n");
        sb.append("    logRecordsIncrementalTimeoutMs: ").append(toIndentedString(logRecordsIncrementalTimeoutMs)).append("\n");
        sb.append("    logRecordsTaskTimeoutMs: ").append(toIndentedString(logRecordsTaskTimeoutMs)).append("\n");
        sb.append("    maxBatchDurationMs: ").append(toIndentedString(maxBatchDurationMs)).append("\n");
        sb.append("    maxBatchSize: ").append(toIndentedString(maxBatchSize)).append("\n");
        sb.append("    maxFilesPerIndex: ").append(toIndentedString(maxFilesPerIndex)).append("\n");
        sb.append("    maxIndicesEvents: ").append(toIndentedString(maxIndicesEvents)).append("\n");
        sb.append("    maxIndicesPerVs: ").append(toIndentedString(maxIndicesPerVs)).append("\n");
        sb.append("    maxIndicesSystem: ").append(toIndentedString(maxIndicesSystem)).append("\n");
        sb.append("    maxLogsPerIndex: ").append(toIndentedString(maxLogsPerIndex)).append("\n");
        sb.append("    maxNumWorkers: ").append(toIndentedString(maxNumWorkers)).append("\n");
        sb.append("    maxQueueSize: ").append(toIndentedString(maxQueueSize)).append("\n");
        sb.append("    maxSizePerIndexMb: ").append(toIndentedString(maxSizePerIndexMb)).append("\n");
        sb.append("    nfProtectionTimeMinutes: ").append(toIndentedString(nfProtectionTimeMinutes)).append("\n");
        sb.append("    opensearchHost: ").append(toIndentedString(opensearchHost)).append("\n");
        sb.append("    opensearchNumReplicas: ").append(toIndentedString(opensearchNumReplicas)).append("\n");
        sb.append("    opensearchNumShards: ").append(toIndentedString(opensearchNumShards)).append("\n");
        sb.append("    opensearchPort: ").append(toIndentedString(opensearchPort)).append("\n");
        sb.append("    queryQueueBufferSize: ").append(toIndentedString(queryQueueBufferSize)).append("\n");
        sb.append("    queryWorkerCount: ").append(toIndentedString(queryWorkerCount)).append("\n");
        sb.append("    recordsStatusQueueBufferSize: ").append(toIndentedString(recordsStatusQueueBufferSize)).append("\n");
        sb.append("    recordsStatusWorkerCount: ").append(toIndentedString(recordsStatusWorkerCount)).append("\n");
        sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
        sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
        sb.append("    reserved3: ").append(toIndentedString(reserved3)).append("\n");
        sb.append("    reserved4: ").append(toIndentedString(reserved4)).append("\n");
        sb.append("    searchQueryTimeoutMs: ").append(toIndentedString(searchQueryTimeoutMs)).append("\n");
        sb.append("    taskReEnqueueWaitTimeSeconds: ").append(toIndentedString(taskReEnqueueWaitTimeSeconds)).append("\n");
        sb.append("    telemetryTraceLogLevel: ").append(toIndentedString(telemetryTraceLogLevel)).append("\n");
        sb.append("    telemetryTracePercentage: ").append(toIndentedString(telemetryTracePercentage)).append("\n");
        sb.append("    udfProtectionTimeMinutes: ").append(toIndentedString(udfProtectionTimeMinutes)).append("\n");
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

