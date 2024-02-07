package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ALBServicesFileDownloadMetadata;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ALBServicesFileDownload is a POJO class extends AviRestResource that used for creating
 * ALBServicesFileDownload.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ALBServicesFileDownload")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESFILEDOWNLOAD, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ALBServicesFileDownload extends AviRestResource {
    @JsonProperty("destination_dir")
    @JsonInclude(Include.NON_NULL)
    private String destinationDir;

    @JsonProperty("file_type")
    @JsonInclude(Include.NON_NULL)
    private String fileType;

    @JsonProperty("file_uri")
    @JsonInclude(Include.NON_NULL)
    private String fileUri;

    @JsonProperty("message")
    @JsonInclude(Include.NON_NULL)
    private String message;

    @JsonProperty("metadata")
    @JsonInclude(Include.NON_NULL)
    private ALBServicesFileDownloadMetadata metadata;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Destination of the file to be saved.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return destinationDir
   */
  @VsoMethod
  public String getDestinationDir() {
    return destinationDir;
  }

  /**
   * This is the setter method to the attribute.
   * Destination of the file to be saved.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param destinationDir set the destinationDir.
   */
  @VsoMethod
  public void setDestinationDir(String  destinationDir) {
    this.destinationDir = destinationDir;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Software / crs/ inventory.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fileType
   */
  @VsoMethod
  public String getFileType() {
    return fileType;
  }

  /**
   * This is the setter method to the attribute.
   * Software / crs/ inventory.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fileType set the fileType.
   */
  @VsoMethod
  public void setFileType(String  fileType) {
    this.fileType = fileType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * File uri on the cloud bucket.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fileUri
   */
  @VsoMethod
  public String getFileUri() {
    return fileUri;
  }

  /**
   * This is the setter method to the attribute.
   * File uri on the cloud bucket.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fileUri set the fileUri.
   */
  @VsoMethod
  public void setFileUri(String  fileUri) {
    this.fileUri = fileUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Download's success / failure message.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return message
   */
  @VsoMethod
  public String getMessage() {
    return message;
  }

  /**
   * This is the setter method to the attribute.
   * Download's success / failure message.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param message set the message.
   */
  @VsoMethod
  public void setMessage(String  message) {
    this.message = message;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Metadata of the file from pulse.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return metadata
   */
  @VsoMethod
  public ALBServicesFileDownloadMetadata getMetadata() {
    return metadata;
  }

  /**
   * This is the setter method to the attribute.
   * Metadata of the file from pulse.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param metadata set the metadata.
   */
  @VsoMethod
  public void setMetadata(ALBServicesFileDownloadMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the file with which it is saved to the disk.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the file with which it is saved to the disk.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status of file download.
   * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
   * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
   * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_BAD_REQUEST...
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Status of file download.
   * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
   * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
   * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_BAD_REQUEST...
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant uuid associated with the object.
   * It is a reference to an object of type tenant.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant uuid associated with the object.
   * It is a reference to an object of type tenant.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
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
   * Unique id of the object.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique id of the object.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
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
  ALBServicesFileDownload objALBServicesFileDownload = (ALBServicesFileDownload) o;
  return   Objects.equals(this.uuid, objALBServicesFileDownload.uuid)&&
  Objects.equals(this.name, objALBServicesFileDownload.name)&&
  Objects.equals(this.tenantRef, objALBServicesFileDownload.tenantRef)&&
  Objects.equals(this.fileType, objALBServicesFileDownload.fileType)&&
  Objects.equals(this.metadata, objALBServicesFileDownload.metadata)&&
  Objects.equals(this.status, objALBServicesFileDownload.status)&&
  Objects.equals(this.message, objALBServicesFileDownload.message)&&
  Objects.equals(this.destinationDir, objALBServicesFileDownload.destinationDir)&&
  Objects.equals(this.fileUri, objALBServicesFileDownload.fileUri);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ALBServicesFileDownload {\n");
      sb.append("    destinationDir: ").append(toIndentedString(destinationDir)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fileUri: ").append(toIndentedString(fileUri)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

