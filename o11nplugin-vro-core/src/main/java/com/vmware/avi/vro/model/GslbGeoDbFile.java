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
 * GslbGeoDbFile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GslbGeoDbFile")
@VsoFinder(name = Constants.FINDER_VRO_GSLBGEODBFILE, idAccessor = "getObjectID()")
@Service
public class GslbGeoDbFile extends AviRestResource  {
  @JsonProperty("checksum")
  private String checksum = null;

  @JsonProperty("file_id")
  private String fileId = null;

  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("format")
  private String format = "GSLB_GEODB_FILE_FORMAT_AVI";

  @JsonProperty("timestamp")
  private Long timestamp = null;

  
  /**
   * File checksum is internally computed. Field introduced in 17.1.1.
   * @return checksum
  **/
  @ApiModelProperty(readOnly = true, value = "File checksum is internally computed. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getChecksum() {
    return checksum;
  }
    
  @VsoMethod
  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  
  /**
   * System internal identifier for the file. Field introduced in 17.1.1.
   * @return fileId
  **/
  @ApiModelProperty(readOnly = true, value = "System internal identifier for the file. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getFileId() {
    return fileId;
  }
    
  @VsoMethod
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  
  /**
   * Geodb Filename in the Avi supported formats. Field introduced in 17.1.1.
   * @return filename
  **/
  @ApiModelProperty(value = "Geodb Filename in the Avi supported formats. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getFilename() {
    return filename;
  }
    
  @VsoMethod
  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  /**
   * This field indicates the file format. Enum options - GSLB_GEODB_FILE_FORMAT_AVI, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY. Field introduced in 17.1.1.
   * @return format
  **/
  @ApiModelProperty(value = "This field indicates the file format. Enum options - GSLB_GEODB_FILE_FORMAT_AVI, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getFormat() {
    return format;
  }
    
  @VsoMethod
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   * Internal timestamp associated with the file. Field introduced in 17.1.1.
   * @return timestamp
  **/
  @ApiModelProperty(readOnly = true, value = "Internal timestamp associated with the file. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Long getTimestamp() {
    return timestamp;
  }
    
  @VsoMethod
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  
  public String getObjectID() {
		return "GslbGeoDbFile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbGeoDbFile gslbGeoDbFile = (GslbGeoDbFile) o;
    return Objects.equals(this.checksum, gslbGeoDbFile.checksum) &&
        Objects.equals(this.fileId, gslbGeoDbFile.fileId) &&
        Objects.equals(this.filename, gslbGeoDbFile.filename) &&
        Objects.equals(this.format, gslbGeoDbFile.format) &&
        Objects.equals(this.timestamp, gslbGeoDbFile.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checksum, fileId, filename, format, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbGeoDbFile {\n");
    
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

