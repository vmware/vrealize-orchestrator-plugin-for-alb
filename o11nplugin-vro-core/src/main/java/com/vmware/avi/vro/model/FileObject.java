package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ApiSpecDetail;
import com.vmware.avi.vro.model.CRL;
import com.vmware.avi.vro.model.FileObjectState;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The FileObject is a POJO class extends AviRestResource that used for creating
 * FileObject.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FileObject")
@VsoFinder(name = Constants.FINDER_VRO_FILEOBJECT, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FileObject extends AviRestResource {
    @JsonProperty("api_spec_detail")
    @JsonInclude(Include.NON_NULL)
    private ApiSpecDetail apiSpecDetail;

    @JsonProperty("checksum")
    @JsonInclude(Include.NON_NULL)
    private String checksum;

    @JsonProperty("child_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> childRefs;

    @JsonProperty("completed_events")
    @JsonInclude(Include.NON_NULL)
    private Integer completedEvents;

    @JsonProperty("compressed")
    @JsonInclude(Include.NON_NULL)
    private Boolean compressed = false;

    @JsonProperty("created")
    @JsonInclude(Include.NON_NULL)
    private String created;

    @JsonProperty("crl_info")
    @JsonInclude(Include.NON_NULL)
    private CRL crlInfo;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration;

    @JsonProperty("end_time")
    @JsonInclude(Include.NON_NULL)
    private String endTime;

    @JsonProperty("events")
    @JsonInclude(Include.NON_NULL)
    private List<FileObjectEventMap> events;

    @JsonProperty("expires_at")
    @JsonInclude(Include.NON_NULL)
    private String expiresAt;

    @JsonProperty("gslb_geodb_format")
    @JsonInclude(Include.NON_NULL)
    private String gslbGeodbFormat;

    @JsonProperty("has_parent")
    @JsonInclude(Include.NON_NULL)
    private Boolean hasParent = false;

    @JsonProperty("history")
    @JsonInclude(Include.NON_NULL)
    private List<TaskEventHistory> history;

    @JsonProperty("is_federated")
    @JsonInclude(Include.NON_NULL)
    private Boolean isFederated = false;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private String path;

    @JsonProperty("progress")
    @JsonInclude(Include.NON_NULL)
    private Integer progress;

    @JsonProperty("read_only")
    @JsonInclude(Include.NON_NULL)
    private Boolean readOnly;

    @JsonProperty("restrict_download")
    @JsonInclude(Include.NON_NULL)
    private Boolean restrictDownload;

    @JsonProperty("size")
    @JsonInclude(Include.NON_NULL)
    private Integer size;

    @JsonProperty("start_time")
    @JsonInclude(Include.NON_NULL)
    private String startTime;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private FileObjectState state;

    @JsonProperty("task_events")
    @JsonInclude(Include.NON_NULL)
    private List<TaskEventMap> taskEvents;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("total_events")
    @JsonInclude(Include.NON_NULL)
    private Integer totalEvents;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version;



  /**
   * This is the getter method this will return the attribute value.
   * Api specification details extracted from the file, populated for open_api_spec type only.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return apiSpecDetail
   */
  @VsoMethod
  public ApiSpecDetail getApiSpecDetail() {
    return apiSpecDetail;
  }

  /**
   * This is the setter method to the attribute.
   * Api specification details extracted from the file, populated for open_api_spec type only.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @param apiSpecDetail set the apiSpecDetail.
   */
  @VsoMethod
  public void setApiSpecDetail(ApiSpecDetail apiSpecDetail) {
    this.apiSpecDetail = apiSpecDetail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sha1 checksum of the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return checksum
   */
  @VsoMethod
  public String getChecksum() {
    return checksum;
  }

  /**
   * This is the setter method to the attribute.
   * Sha1 checksum of the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param checksum set the checksum.
   */
  @VsoMethod
  public void setChecksum(String  checksum) {
    this.checksum = checksum;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Avi internal formatted/converted files.
   * It is a reference to an object of type fileobject.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return childRefs
   */
  @VsoMethod
  public List<String> getChildRefs() {
    return childRefs;
  }

  /**
   * This is the setter method. this will set the childRefs
   * Avi internal formatted/converted files.
   * It is a reference to an object of type fileobject.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return childRefs
   */
  @VsoMethod
  public void setChildRefs(List<String>  childRefs) {
    this.childRefs = childRefs;
  }

  /**
   * This is the setter method this will set the childRefs
   * Avi internal formatted/converted files.
   * It is a reference to an object of type fileobject.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return childRefs
   */
  @VsoMethod
  public FileObject addChildRefsItem(String childRefsItem) {
    if (this.childRefs == null) {
      this.childRefs = new ArrayList<String>();
    }
    this.childRefs.add(childRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Number of processing events that have completed.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return completedEvents
   */
  @VsoMethod
  public Integer getCompletedEvents() {
    return completedEvents;
  }

  /**
   * This is the setter method to the attribute.
   * Number of processing events that have completed.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param completedEvents set the completedEvents.
   */
  @VsoMethod
  public void setCompletedEvents(Integer  completedEvents) {
    this.completedEvents = completedEvents;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field indicates whether the file is gzip-compressed.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return compressed
   */
  @VsoMethod
  public Boolean getCompressed() {
    return compressed;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates whether the file is gzip-compressed.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param compressed set the compressed.
   */
  @VsoMethod
  public void setCompressed(Boolean  compressed) {
    this.compressed = compressed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp of creation for the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return created
   */
  @VsoMethod
  public String getCreated() {
    return created;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp of creation for the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param created set the created.
   */
  @VsoMethod
  public void setCreated(String  created) {
    this.created = created;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field contains crl metadata.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return crlInfo
   */
  @VsoMethod
  public CRL getCrlInfo() {
    return crlInfo;
  }

  /**
   * This is the setter method to the attribute.
   * This field contains crl metadata.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param crlInfo set the crlInfo.
   */
  @VsoMethod
  public void setCrlInfo(CRL crlInfo) {
    this.crlInfo = crlInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Description of the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Description of the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time taken to complete the operation in seconds.
   * Field introduced in 32.1.4.
   * Unit is sec.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Time taken to complete the operation in seconds.
   * Field introduced in 32.1.4.
   * Unit is sec.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * End time of the file object processing operation.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endTime
   */
  @VsoMethod
  public String getEndTime() {
    return endTime;
  }

  /**
   * This is the setter method to the attribute.
   * End time of the file object processing operation.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endTime set the endTime.
   */
  @VsoMethod
  public void setEndTime(String  endTime) {
    this.endTime = endTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of all fileobject events.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public List<FileObjectEventMap> getEvents() {
    return events;
  }

  /**
   * This is the setter method. this will set the events
   * List of all fileobject events.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public void setEvents(List<FileObjectEventMap>  events) {
    this.events = events;
  }

  /**
   * This is the setter method this will set the events
   * List of all fileobject events.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return events
   */
  @VsoMethod
  public FileObject addEventsItem(FileObjectEventMap eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<FileObjectEventMap>();
    }
    this.events.add(eventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Timestamp when the crl contents are no longer valid and hence crl-file will be no longer needed and can be removed by the system.
   * If this is set, a garbage collector process shall remove the crl-file after this time.
   * This field is applicable in the crl context.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return expiresAt
   */
  @VsoMethod
  public String getExpiresAt() {
    return expiresAt;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp when the crl contents are no longer valid and hence crl-file will be no longer needed and can be removed by the system.
   * If this is set, a garbage collector process shall remove the crl-file after this time.
   * This field is applicable in the crl context.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param expiresAt set the expiresAt.
   */
  @VsoMethod
  public void setExpiresAt(String  expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field indicates the file format(avi/maxmind and v4/v6/v4-v6) of gslb geodb file type.
   * Enum options - GSLB_GEODB_FILE_FORMAT_AVI, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V6,
   * GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V4_AND_V6, GSLB_GEODB_FILE_FORMAT_AVI_V6, GSLB_GEODB_FILE_FORMAT_AVI_V4_AND_V6.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gslbGeodbFormat
   */
  @VsoMethod
  public String getGslbGeodbFormat() {
    return gslbGeodbFormat;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates the file format(avi/maxmind and v4/v6/v4-v6) of gslb geodb file type.
   * Enum options - GSLB_GEODB_FILE_FORMAT_AVI, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V6,
   * GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V4_AND_V6, GSLB_GEODB_FILE_FORMAT_AVI_V6, GSLB_GEODB_FILE_FORMAT_AVI_V4_AND_V6.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gslbGeodbFormat set the gslbGeodbFormat.
   */
  @VsoMethod
  public void setGslbGeodbFormat(String  gslbGeodbFormat) {
    this.gslbGeodbFormat = gslbGeodbFormat;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field indicates if the the given fileobjecthas a parent fileobject or not.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return hasParent
   */
  @VsoMethod
  public Boolean getHasParent() {
    return hasParent;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates if the the given fileobjecthas a parent fileobject or not.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param hasParent set the hasParent.
   */
  @VsoMethod
  public void setHasParent(Boolean  hasParent) {
    this.hasParent = hasParent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * File object processing events history for the version specified.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return history
   */
  @VsoMethod
  public List<TaskEventHistory> getHistory() {
    return history;
  }

  /**
   * This is the setter method. this will set the history
   * File object processing events history for the version specified.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return history
   */
  @VsoMethod
  public void setHistory(List<TaskEventHistory>  history) {
    this.history = history;
  }

  /**
   * This is the setter method this will set the history
   * File object processing events history for the version specified.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return history
   */
  @VsoMethod
  public FileObject addHistoryItem(TaskEventHistory historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<TaskEventHistory>();
    }
    this.history.add(historyItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * This field describes the object's replication scope.
   * If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.
   * If the field is set to true, then the object is replicated across the gslb federation.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isFederated
   */
  @VsoMethod
  public Boolean getIsFederated() {
    return isFederated;
  }

  /**
   * This is the setter method to the attribute.
   * This field describes the object's replication scope.
   * If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.
   * If the field is set to true, then the object is replicated across the gslb federation.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isFederated set the isFederated.
   */
  @VsoMethod
  public void setIsFederated(Boolean  isFederated) {
    this.isFederated = isFederated;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the file object.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the file object.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Path to the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public String getPath() {
    return path;
  }

  /**
   * This is the setter method to the attribute.
   * Path to the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(String  path) {
    this.path = path;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percentage of completed events.
   * Allowed values are 0-100.
   * Field introduced in 32.1.4.
   * Unit is percent.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return progress
   */
  @VsoMethod
  public Integer getProgress() {
    return progress;
  }

  /**
   * This is the setter method to the attribute.
   * Percentage of completed events.
   * Allowed values are 0-100.
   * Field introduced in 32.1.4.
   * Unit is percent.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param progress set the progress.
   */
  @VsoMethod
  public void setProgress(Integer  progress) {
    this.progress = progress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enforce read-only on the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return readOnly
   */
  @VsoMethod
  public Boolean getReadOnly() {
    return readOnly;
  }

  /**
   * This is the setter method to the attribute.
   * Enforce read-only on the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param readOnly set the readOnly.
   */
  @VsoMethod
  public void setReadOnly(Boolean  readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag to allow/restrict download of the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictDownload
   */
  @VsoMethod
  public Boolean getRestrictDownload() {
    return restrictDownload;
  }

  /**
   * This is the setter method to the attribute.
   * Flag to allow/restrict download of the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param restrictDownload set the restrictDownload.
   */
  @VsoMethod
  public void setRestrictDownload(Boolean  restrictDownload) {
    this.restrictDownload = restrictDownload;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Size of the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return size
   */
  @VsoMethod
  public Integer getSize() {
    return size;
  }

  /**
   * This is the setter method to the attribute.
   * Size of the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param size set the size.
   */
  @VsoMethod
  public void setSize(Integer  size) {
    this.size = size;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Start time of the file object processing operation.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Start time of the file object processing operation.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * State of the file object.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public FileObjectState getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * State of the file object.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(FileObjectState state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * File object processing events for the version specified.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return taskEvents
   */
  @VsoMethod
  public List<TaskEventMap> getTaskEvents() {
    return taskEvents;
  }

  /**
   * This is the setter method. this will set the taskEvents
   * File object processing events for the version specified.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return taskEvents
   */
  @VsoMethod
  public void setTaskEvents(List<TaskEventMap>  taskEvents) {
    this.taskEvents = taskEvents;
  }

  /**
   * This is the setter method this will set the taskEvents
   * File object processing events for the version specified.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return taskEvents
   */
  @VsoMethod
  public FileObject addTaskEventsItem(TaskEventMap taskEventsItem) {
    if (this.taskEvents == null) {
      this.taskEvents = new ArrayList<TaskEventMap>();
    }
    this.taskEvents.add(taskEventsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of processing events for this file object.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalEvents
   */
  @VsoMethod
  public Integer getTotalEvents() {
    return totalEvents;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of processing events for this file object.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalEvents set the totalEvents.
   */
  @VsoMethod
  public void setTotalEvents(Integer  totalEvents) {
    this.totalEvents = totalEvents;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of the file.
   * Enum options - OTHER_FILE_TYPES, IP_REPUTATION, GEO_DB, TECH_SUPPORT, HSMPACKAGES, IPAMDNSSCRIPTS, CONTROLLER_IMAGE, CRL_DATA,
   * IP_REPUTATION_IPV6, GSLB_GEO_DB, CSRF_JS, KNOWN_HOSTS, OPEN_API_SPEC.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the file.
   * Enum options - OTHER_FILE_TYPES, IP_REPUTATION, GEO_DB, TECH_SUPPORT, HSMPACKAGES, IPAMDNSSCRIPTS, CONTROLLER_IMAGE, CRL_DATA,
   * IP_REPUTATION_IPV6, GSLB_GEO_DB, CSRF_JS, KNOWN_HOSTS, OPEN_API_SPEC.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Version of the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Version of the file.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  FileObject objFileObject = (FileObject) o;
  return   Objects.equals(this.uuid, objFileObject.uuid)&&
  Objects.equals(this.tenantRef, objFileObject.tenantRef)&&
  Objects.equals(this.name, objFileObject.name)&&
  Objects.equals(this.path, objFileObject.path)&&
  Objects.equals(this.size, objFileObject.size)&&
  Objects.equals(this.checksum, objFileObject.checksum)&&
  Objects.equals(this.type, objFileObject.type)&&
  Objects.equals(this.readOnly, objFileObject.readOnly)&&
  Objects.equals(this.version, objFileObject.version)&&
  Objects.equals(this.description, objFileObject.description)&&
  Objects.equals(this.created, objFileObject.created)&&
  Objects.equals(this.restrictDownload, objFileObject.restrictDownload)&&
  Objects.equals(this.isFederated, objFileObject.isFederated)&&
  Objects.equals(this.compressed, objFileObject.compressed)&&
  Objects.equals(this.expiresAt, objFileObject.expiresAt)&&
  Objects.equals(this.crlInfo, objFileObject.crlInfo)&&
  Objects.equals(this.childRefs, objFileObject.childRefs)&&
  Objects.equals(this.events, objFileObject.events)&&
  Objects.equals(this.hasParent, objFileObject.hasParent)&&
  Objects.equals(this.gslbGeodbFormat, objFileObject.gslbGeodbFormat)&&
  Objects.equals(this.state, objFileObject.state)&&
  Objects.equals(this.taskEvents, objFileObject.taskEvents)&&
  Objects.equals(this.totalEvents, objFileObject.totalEvents)&&
  Objects.equals(this.completedEvents, objFileObject.completedEvents)&&
  Objects.equals(this.progress, objFileObject.progress)&&
  Objects.equals(this.startTime, objFileObject.startTime)&&
  Objects.equals(this.endTime, objFileObject.endTime)&&
  Objects.equals(this.duration, objFileObject.duration)&&
  Objects.equals(this.history, objFileObject.history)&&
  Objects.equals(this.apiSpecDetail, objFileObject.apiSpecDetail);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class FileObject {\n");
      sb.append("    apiSpecDetail: ").append(toIndentedString(apiSpecDetail)).append("\n");
        sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
        sb.append("    childRefs: ").append(toIndentedString(childRefs)).append("\n");
        sb.append("    completedEvents: ").append(toIndentedString(completedEvents)).append("\n");
        sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    crlInfo: ").append(toIndentedString(crlInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    gslbGeodbFormat: ").append(toIndentedString(gslbGeodbFormat)).append("\n");
        sb.append("    hasParent: ").append(toIndentedString(hasParent)).append("\n");
        sb.append("    history: ").append(toIndentedString(history)).append("\n");
        sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    restrictDownload: ").append(toIndentedString(restrictDownload)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    taskEvents: ").append(toIndentedString(taskEvents)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    totalEvents: ").append(toIndentedString(totalEvents)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

