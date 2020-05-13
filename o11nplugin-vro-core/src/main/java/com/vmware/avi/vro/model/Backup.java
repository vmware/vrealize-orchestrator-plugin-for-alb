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
 * Backup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "Backup")
@VsoFinder(name = Constants.FINDER_VRO_BACKUP, idAccessor = "getObjectID()")
@Service
public class Backup extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("backup_config_ref")
  private String backupConfigRef = null;

  @JsonProperty("file_name")
  private String fileName = null;

  @JsonProperty("local_file_url")
  private String localFileUrl = null;

  @JsonProperty("remote_file_url")
  private String remoteFileUrl = null;

  @JsonProperty("scheduler_ref")
  private String schedulerRef = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * BackupConfiguration Information. It is a reference to an object of type BackupConfiguration.
   * @return backupConfigRef
  **/
  @ApiModelProperty(value = "BackupConfiguration Information. It is a reference to an object of type BackupConfiguration.")


 
  @VsoMethod  
  public String getBackupConfigRef() {
    return backupConfigRef;
  }
    
  @VsoMethod
  public void setBackupConfigRef(String backupConfigRef) {
    this.backupConfigRef = backupConfigRef;
  }

  
  /**
   * The file name of backup.
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "The file name of backup.")
  @NotNull


 
  @VsoMethod  
  public String getFileName() {
    return fileName;
  }
    
  @VsoMethod
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  
  /**
   * URL to download the backup file.
   * @return localFileUrl
  **/
  @ApiModelProperty(value = "URL to download the backup file.")


 
  @VsoMethod  
  public String getLocalFileUrl() {
    return localFileUrl;
  }
    
  @VsoMethod
  public void setLocalFileUrl(String localFileUrl) {
    this.localFileUrl = localFileUrl;
  }

  
  /**
   * URL to download the backup file.
   * @return remoteFileUrl
  **/
  @ApiModelProperty(value = "URL to download the backup file.")


 
  @VsoMethod  
  public String getRemoteFileUrl() {
    return remoteFileUrl;
  }
    
  @VsoMethod
  public void setRemoteFileUrl(String remoteFileUrl) {
    this.remoteFileUrl = remoteFileUrl;
  }

  
  /**
   * Scheduler Information. It is a reference to an object of type Scheduler.
   * @return schedulerRef
  **/
  @ApiModelProperty(value = "Scheduler Information. It is a reference to an object of type Scheduler.")


 
  @VsoMethod  
  public String getSchedulerRef() {
    return schedulerRef;
  }
    
  @VsoMethod
  public void setSchedulerRef(String schedulerRef) {
    this.schedulerRef = schedulerRef;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * Unix Timestamp of when the backup file is created.
   * @return timestamp
  **/
  @ApiModelProperty(value = "Unix Timestamp of when the backup file is created.")


 
  @VsoMethod  
  public String getTimestamp() {
    return timestamp;
  }
    
  @VsoMethod
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "Backup";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Backup backup = (Backup) o;
    return Objects.equals(this.lastModified, backup.lastModified) &&
        Objects.equals(this.backupConfigRef, backup.backupConfigRef) &&
        Objects.equals(this.fileName, backup.fileName) &&
        Objects.equals(this.localFileUrl, backup.localFileUrl) &&
        Objects.equals(this.remoteFileUrl, backup.remoteFileUrl) &&
        Objects.equals(this.schedulerRef, backup.schedulerRef) &&
        Objects.equals(this.tenantRef, backup.tenantRef) &&
        Objects.equals(this.timestamp, backup.timestamp) &&
        Objects.equals(this.url, backup.url) &&
        Objects.equals(this.uuid, backup.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, backupConfigRef, fileName, localFileUrl, remoteFileUrl, schedulerRef, tenantRef, timestamp, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Backup {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    backupConfigRef: ").append(toIndentedString(backupConfigRef)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    localFileUrl: ").append(toIndentedString(localFileUrl)).append("\n");
    sb.append("    remoteFileUrl: ").append(toIndentedString(remoteFileUrl)).append("\n");
    sb.append("    schedulerRef: ").append(toIndentedString(schedulerRef)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

