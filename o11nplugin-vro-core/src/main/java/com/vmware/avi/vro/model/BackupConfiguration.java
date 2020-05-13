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
 * BackupConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "BackupConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_BACKUPCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class BackupConfiguration extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("aws_access_key")
  private String awsAccessKey = null;

  @JsonProperty("aws_bucket_id")
  private String awsBucketId = null;

  @JsonProperty("aws_secret_access")
  private String awsSecretAccess = null;

  @JsonProperty("backup_file_prefix")
  private String backupFilePrefix = null;

  @JsonProperty("backup_passphrase")
  private String backupPassphrase = null;

  @JsonProperty("maximum_backups_stored")
  private Integer maximumBackupsStored = 4;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("remote_directory")
  private String remoteDirectory = null;

  @JsonProperty("remote_hostname")
  private String remoteHostname = null;

  @JsonProperty("save_local")
  private Boolean saveLocal = null;

  @JsonProperty("ssh_user_ref")
  private String sshUserRef = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("upload_to_remote_host")
  private Boolean uploadToRemoteHost = null;

  @JsonProperty("upload_to_s3")
  private Boolean uploadToS3 = null;

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
   * AWS Access Key ID. Field introduced in 18.2.3.
   * @return awsAccessKey
  **/
  @ApiModelProperty(value = "AWS Access Key ID. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getAwsAccessKey() {
    return awsAccessKey;
  }
    
  @VsoMethod
  public void setAwsAccessKey(String awsAccessKey) {
    this.awsAccessKey = awsAccessKey;
  }

  
  /**
   * AWS bucket. Field introduced in 18.2.3.
   * @return awsBucketId
  **/
  @ApiModelProperty(value = "AWS bucket. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getAwsBucketId() {
    return awsBucketId;
  }
    
  @VsoMethod
  public void setAwsBucketId(String awsBucketId) {
    this.awsBucketId = awsBucketId;
  }

  
  /**
   * AWS Secret Access Key. Field introduced in 18.2.3.
   * @return awsSecretAccess
  **/
  @ApiModelProperty(value = "AWS Secret Access Key. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getAwsSecretAccess() {
    return awsSecretAccess;
  }
    
  @VsoMethod
  public void setAwsSecretAccess(String awsSecretAccess) {
    this.awsSecretAccess = awsSecretAccess;
  }

  
  /**
   * Prefix of the exported configuration file. Field introduced in 17.1.1.
   * @return backupFilePrefix
  **/
  @ApiModelProperty(value = "Prefix of the exported configuration file. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getBackupFilePrefix() {
    return backupFilePrefix;
  }
    
  @VsoMethod
  public void setBackupFilePrefix(String backupFilePrefix) {
    this.backupFilePrefix = backupFilePrefix;
  }

  
  /**
   * Passphrase of backup configuration.
   * @return backupPassphrase
  **/
  @ApiModelProperty(value = "Passphrase of backup configuration.")


 
  @VsoMethod  
  public String getBackupPassphrase() {
    return backupPassphrase;
  }
    
  @VsoMethod
  public void setBackupPassphrase(String backupPassphrase) {
    this.backupPassphrase = backupPassphrase;
  }

  
  /**
   * Rotate the backup files based on this count. Allowed values are 1-20.
   * @return maximumBackupsStored
  **/
  @ApiModelProperty(value = "Rotate the backup files based on this count. Allowed values are 1-20.")


 
  @VsoMethod  
  public Integer getMaximumBackupsStored() {
    return maximumBackupsStored;
  }
    
  @VsoMethod
  public void setMaximumBackupsStored(Integer maximumBackupsStored) {
    this.maximumBackupsStored = maximumBackupsStored;
  }

  
  /**
   * Name of backup configuration.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of backup configuration.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Directory at remote destination with write permission for ssh user.
   * @return remoteDirectory
  **/
  @ApiModelProperty(value = "Directory at remote destination with write permission for ssh user.")


 
  @VsoMethod  
  public String getRemoteDirectory() {
    return remoteDirectory;
  }
    
  @VsoMethod
  public void setRemoteDirectory(String remoteDirectory) {
    this.remoteDirectory = remoteDirectory;
  }

  
  /**
   * Remote Destination.
   * @return remoteHostname
  **/
  @ApiModelProperty(value = "Remote Destination.")


 
  @VsoMethod  
  public String getRemoteHostname() {
    return remoteHostname;
  }
    
  @VsoMethod
  public void setRemoteHostname(String remoteHostname) {
    this.remoteHostname = remoteHostname;
  }

  
  /**
   * Local Backup.
   * @return saveLocal
  **/
  @ApiModelProperty(value = "Local Backup.")


 
  @VsoMethod  
  public Boolean isSaveLocal() {
    return saveLocal;
  }
    
  @VsoMethod
  public void setSaveLocal(Boolean saveLocal) {
    this.saveLocal = saveLocal;
  }

  
  /**
   * Access Credentials for remote destination. It is a reference to an object of type CloudConnectorUser.
   * @return sshUserRef
  **/
  @ApiModelProperty(value = "Access Credentials for remote destination. It is a reference to an object of type CloudConnectorUser.")


 
  @VsoMethod  
  public String getSshUserRef() {
    return sshUserRef;
  }
    
  @VsoMethod
  public void setSshUserRef(String sshUserRef) {
    this.sshUserRef = sshUserRef;
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
   * Remote Backup.
   * @return uploadToRemoteHost
  **/
  @ApiModelProperty(value = "Remote Backup.")


 
  @VsoMethod  
  public Boolean isUploadToRemoteHost() {
    return uploadToRemoteHost;
  }
    
  @VsoMethod
  public void setUploadToRemoteHost(Boolean uploadToRemoteHost) {
    this.uploadToRemoteHost = uploadToRemoteHost;
  }

  
  /**
   * Cloud Backup. Field introduced in 18.2.3.
   * @return uploadToS3
  **/
  @ApiModelProperty(value = "Cloud Backup. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isUploadToS3() {
    return uploadToS3;
  }
    
  @VsoMethod
  public void setUploadToS3(Boolean uploadToS3) {
    this.uploadToS3 = uploadToS3;
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
		return "BackupConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupConfiguration backupConfiguration = (BackupConfiguration) o;
    return Objects.equals(this.lastModified, backupConfiguration.lastModified) &&
        Objects.equals(this.awsAccessKey, backupConfiguration.awsAccessKey) &&
        Objects.equals(this.awsBucketId, backupConfiguration.awsBucketId) &&
        Objects.equals(this.awsSecretAccess, backupConfiguration.awsSecretAccess) &&
        Objects.equals(this.backupFilePrefix, backupConfiguration.backupFilePrefix) &&
        Objects.equals(this.backupPassphrase, backupConfiguration.backupPassphrase) &&
        Objects.equals(this.maximumBackupsStored, backupConfiguration.maximumBackupsStored) &&
        Objects.equals(this.name, backupConfiguration.name) &&
        Objects.equals(this.remoteDirectory, backupConfiguration.remoteDirectory) &&
        Objects.equals(this.remoteHostname, backupConfiguration.remoteHostname) &&
        Objects.equals(this.saveLocal, backupConfiguration.saveLocal) &&
        Objects.equals(this.sshUserRef, backupConfiguration.sshUserRef) &&
        Objects.equals(this.tenantRef, backupConfiguration.tenantRef) &&
        Objects.equals(this.uploadToRemoteHost, backupConfiguration.uploadToRemoteHost) &&
        Objects.equals(this.uploadToS3, backupConfiguration.uploadToS3) &&
        Objects.equals(this.url, backupConfiguration.url) &&
        Objects.equals(this.uuid, backupConfiguration.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, awsAccessKey, awsBucketId, awsSecretAccess, backupFilePrefix, backupPassphrase, maximumBackupsStored, name, remoteDirectory, remoteHostname, saveLocal, sshUserRef, tenantRef, uploadToRemoteHost, uploadToS3, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupConfiguration {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    awsAccessKey: ").append(toIndentedString(awsAccessKey)).append("\n");
    sb.append("    awsBucketId: ").append(toIndentedString(awsBucketId)).append("\n");
    sb.append("    awsSecretAccess: ").append(toIndentedString(awsSecretAccess)).append("\n");
    sb.append("    backupFilePrefix: ").append(toIndentedString(backupFilePrefix)).append("\n");
    sb.append("    backupPassphrase: ").append(toIndentedString(backupPassphrase)).append("\n");
    sb.append("    maximumBackupsStored: ").append(toIndentedString(maximumBackupsStored)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remoteDirectory: ").append(toIndentedString(remoteDirectory)).append("\n");
    sb.append("    remoteHostname: ").append(toIndentedString(remoteHostname)).append("\n");
    sb.append("    saveLocal: ").append(toIndentedString(saveLocal)).append("\n");
    sb.append("    sshUserRef: ").append(toIndentedString(sshUserRef)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    uploadToRemoteHost: ").append(toIndentedString(uploadToRemoteHost)).append("\n");
    sb.append("    uploadToS3: ").append(toIndentedString(uploadToS3)).append("\n");
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

