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
 * The UploadParams is a POJO class extends AviRestResource that used for creating
 * UploadParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UploadParams")
@VsoFinder(name = Constants.FINDER_VRO_UPLOADPARAMS, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UploadParams extends AviRestResource {
    @JsonProperty("allow_update")
    @JsonInclude(Include.NON_NULL)
    private Boolean allowUpdate = false;

    @JsonProperty("collate")
    @JsonInclude(Include.NON_NULL)
    private Boolean collate = false;

    @JsonProperty("compressed")
    @JsonInclude(Include.NON_NULL)
    private Boolean compressed = false;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("expires_at")
    @JsonInclude(Include.NON_NULL)
    private String expiresAt;

    @JsonProperty("gslb_geodb_format")
    @JsonInclude(Include.NON_NULL)
    private String gslbGeodbFormat;

    @JsonProperty("is_federated")
    @JsonInclude(Include.NON_NULL)
    private Boolean isFederated = false;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("part")
    @JsonInclude(Include.NON_NULL)
    private String part;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private String path;

    @JsonProperty("read_only")
    @JsonInclude(Include.NON_NULL)
    private Boolean readOnly;

    @JsonProperty("restrict_download")
    @JsonInclude(Include.NON_NULL)
    private Boolean restrictDownload;

    @JsonProperty("size")
    @JsonInclude(Include.NON_NULL)
    private Integer size;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type;

    @JsonProperty("update_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer updateInterval = 1440;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";



  /**
   * This is the getter method this will return the attribute value.
   * Allow updating an existing fileobject with the same name.
   * Currently enforced for open_api_spec type only  without this flag, a post whose name matches an existing oas fileobject returns http 409.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return allowUpdate
   */
  @VsoMethod
  public Boolean getAllowUpdate() {
    return allowUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * Allow updating an existing fileobject with the same name.
   * Currently enforced for open_api_spec type only  without this flag, a post whose name matches an existing oas fileobject returns http 409.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param allowUpdate set the allowUpdate.
   */
  @VsoMethod
  public void setAllowUpdate(Boolean  allowUpdate) {
    this.allowUpdate = allowUpdate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Signal to merge all previously uploaded parts into the final file.
   * Set to true on the last request of a chunked upload sequence.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return collate
   */
  @VsoMethod
  public Boolean getCollate() {
    return collate;
  }

  /**
   * This is the setter method to the attribute.
   * Signal to merge all previously uploaded parts into the final file.
   * Set to true on the last request of a chunked upload sequence.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param collate set the collate.
   */
  @VsoMethod
  public void setCollate(Boolean  collate) {
    this.collate = collate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Whether the file is gzip-compressed.
   * Field introduced in 32.1.4.
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
   * Whether the file is gzip-compressed.
   * Field introduced in 32.1.4.
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
   * A short user-friendly description related to the uploaded file.
   * Field introduced in 30.2.1.
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
   * A short user-friendly description related to the uploaded file.
   * Field introduced in 30.2.1.
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
   * Timestamp indicating when the file can be automatically deleted.
   * Used for garbage collection by crl and ip reputation file types.
   * Field introduced in 30.2.1.
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
   * Timestamp indicating when the file can be automatically deleted.
   * Used for garbage collection by crl and ip reputation file types.
   * Field introduced in 30.2.1.
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
   * Field introduced in 31.2.1.
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
   * Field introduced in 31.2.1.
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
   * This field determines if an object is replicated across the gslb federation (true) or visible within the controller-cluster and its service
   * engines (false).
   * Field introduced in 30.2.1.
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
   * This field determines if an object is replicated across the gslb federation (true) or visible within the controller-cluster and its service
   * engines (false).
   * Field introduced in 30.2.1.
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
   * Name of the file.
   * Field introduced in 30.2.1.
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
   * Name of the file.
   * Field introduced in 30.2.1.
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
   * Part identifier for chunked or multipart uploads.
   * When set, indicates a partial upload in progress.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return part
   */
  @VsoMethod
  public String getPart() {
    return part;
  }

  /**
   * This is the setter method to the attribute.
   * Part identifier for chunked or multipart uploads.
   * When set, indicates a partial upload in progress.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param part set the part.
   */
  @VsoMethod
  public void setPart(String  part) {
    this.part = part;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Source path of the file in the local disk.
   * Only applicable in cli.
   * Field introduced in 31.2.1.
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
   * Source path of the file in the local disk.
   * Only applicable in cli.
   * Field introduced in 31.2.1.
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
   * Enforce read-only on the file.
   * Field introduced in 32.1.4.
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
   * Field introduced in 32.1.4.
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
   * Restrict download of the file.
   * Field introduced in 32.1.4.
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
   * Restrict download of the file.
   * Field introduced in 32.1.4.
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
   * Size of the file in bytes.
   * Field introduced in 32.1.4.
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
   * Size of the file in bytes.
   * Field introduced in 32.1.4.
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
   * Type of the file.
   * Enum options - OTHER_FILE_TYPES, IP_REPUTATION, GEO_DB, TECH_SUPPORT, HSMPACKAGES, IPAMDNSSCRIPTS, CONTROLLER_IMAGE, CRL_DATA,
   * IP_REPUTATION_IPV6, GSLB_GEO_DB, CSRF_JS, KNOWN_HOSTS, OPEN_API_SPEC.
   * Field introduced in 31.2.1.
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
   * Field introduced in 31.2.1.
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
   * Interval in minutes to check for update.
   * If not specified, interval will be 1 day.
   * This field is applicable in the crl context.
   * Allowed values are 30-525600.
   * Field introduced in 30.2.1.
   * Unit is min.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1440.
   * @return updateInterval
   */
  @VsoMethod
  public Integer getUpdateInterval() {
    return updateInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Interval in minutes to check for update.
   * If not specified, interval will be 1 day.
   * This field is applicable in the crl context.
   * Allowed values are 30-525600.
   * Field introduced in 30.2.1.
   * Unit is min.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1440.
   * @param updateInterval set the updateInterval.
   */
  @VsoMethod
  public void setUpdateInterval(Integer  updateInterval) {
    this.updateInterval = updateInterval;
  }
/**
   * This is the getter method this will return the attribute value.
   * Url to download the crl file.
   * This field is applicable in the crl context.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Url to download the crl file.
   * This field is applicable in the crl context.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  UploadParams objUploadParams = (UploadParams) o;
  return   Objects.equals(this.name, objUploadParams.name)&&
  Objects.equals(this.updateInterval, objUploadParams.updateInterval)&&
  Objects.equals(this.description, objUploadParams.description)&&
  Objects.equals(this.isFederated, objUploadParams.isFederated)&&
  Objects.equals(this.expiresAt, objUploadParams.expiresAt)&&
  Objects.equals(this.path, objUploadParams.path)&&
  Objects.equals(this.type, objUploadParams.type)&&
  Objects.equals(this.gslbGeodbFormat, objUploadParams.gslbGeodbFormat)&&
  Objects.equals(this.part, objUploadParams.part)&&
  Objects.equals(this.size, objUploadParams.size)&&
  Objects.equals(this.compressed, objUploadParams.compressed)&&
  Objects.equals(this.readOnly, objUploadParams.readOnly)&&
  Objects.equals(this.restrictDownload, objUploadParams.restrictDownload)&&
  Objects.equals(this.collate, objUploadParams.collate)&&
  Objects.equals(this.allowUpdate, objUploadParams.allowUpdate);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UploadParams {\n");
      sb.append("    allowUpdate: ").append(toIndentedString(allowUpdate)).append("\n");
        sb.append("    collate: ").append(toIndentedString(collate)).append("\n");
        sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    gslbGeodbFormat: ").append(toIndentedString(gslbGeodbFormat)).append("\n");
        sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    part: ").append(toIndentedString(part)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    restrictDownload: ").append(toIndentedString(restrictDownload)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updateInterval: ").append(toIndentedString(updateInterval)).append("\n");
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

