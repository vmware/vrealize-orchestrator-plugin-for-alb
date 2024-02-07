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
 * The ALBServicesFileDownloadMetadata is a POJO class extends AviRestResource that used for creating
 * ALBServicesFileDownloadMetadata.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ALBServicesFileDownloadMetadata")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESFILEDOWNLOADMETADATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ALBServicesFileDownloadMetadata extends AviRestResource {
    @JsonProperty("checksum")
    @JsonInclude(Include.NON_NULL)
    private String checksum;

    @JsonProperty("checksum_type")
    @JsonInclude(Include.NON_NULL)
    private String checksumType;

    @JsonProperty("chunk_size")
    @JsonInclude(Include.NON_NULL)
    private Integer chunkSize;

    @JsonProperty("is_multi_part_download")
    @JsonInclude(Include.NON_NULL)
    private Boolean isMultiPartDownload;

    @JsonProperty("signed_url")
    @JsonInclude(Include.NON_NULL)
    private String signedUrl;

    @JsonProperty("total_size")
    @JsonInclude(Include.NON_NULL)
    private Integer totalSize;



  /**
   * This is the getter method this will return the attribute value.
   * Checksum of the file.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return checksum
   */
  @VsoMethod
  public String getChecksum() {
    return checksum;
  }

  /**
   * This is the setter method to the attribute.
   * Checksum of the file.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param checksum set the checksum.
   */
  @VsoMethod
  public void setChecksum(String  checksum) {
    this.checksum = checksum;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Currently only md5 checksum type is supported.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return checksumType
   */
  @VsoMethod
  public String getChecksumType() {
    return checksumType;
  }

  /**
   * This is the setter method to the attribute.
   * Currently only md5 checksum type is supported.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param checksumType set the checksumType.
   */
  @VsoMethod
  public void setChecksumType(String  checksumType) {
    this.checksumType = checksumType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Checksum size in bytes.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return chunkSize
   */
  @VsoMethod
  public Integer getChunkSize() {
    return chunkSize;
  }

  /**
   * This is the setter method to the attribute.
   * Checksum size in bytes.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param chunkSize set the chunkSize.
   */
  @VsoMethod
  public void setChunkSize(Integer  chunkSize) {
    this.chunkSize = chunkSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Whether the file can be downloaded in parts or not.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return isMultiPartDownload
   */
  @VsoMethod
  public Boolean getIsMultiPartDownload() {
    return isMultiPartDownload;
  }

  /**
   * This is the setter method to the attribute.
   * Whether the file can be downloaded in parts or not.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param isMultiPartDownload set the isMultiPartDownload.
   */
  @VsoMethod
  public void setIsMultiPartDownload(Boolean  isMultiPartDownload) {
    this.isMultiPartDownload = isMultiPartDownload;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sigend url of the file from pulse.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return signedUrl
   */
  @VsoMethod
  public String getSignedUrl() {
    return signedUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Sigend url of the file from pulse.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param signedUrl set the signedUrl.
   */
  @VsoMethod
  public void setSignedUrl(String  signedUrl) {
    this.signedUrl = signedUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total size of the file in bytes.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalSize
   */
  @VsoMethod
  public Integer getTotalSize() {
    return totalSize;
  }

  /**
   * This is the setter method to the attribute.
   * Total size of the file in bytes.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalSize set the totalSize.
   */
  @VsoMethod
  public void setTotalSize(Integer  totalSize) {
    this.totalSize = totalSize;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ALBServicesFileDownloadMetadata objALBServicesFileDownloadMetadata = (ALBServicesFileDownloadMetadata) o;
  return   Objects.equals(this.signedUrl, objALBServicesFileDownloadMetadata.signedUrl)&&
  Objects.equals(this.checksum, objALBServicesFileDownloadMetadata.checksum)&&
  Objects.equals(this.checksumType, objALBServicesFileDownloadMetadata.checksumType)&&
  Objects.equals(this.totalSize, objALBServicesFileDownloadMetadata.totalSize)&&
  Objects.equals(this.chunkSize, objALBServicesFileDownloadMetadata.chunkSize)&&
  Objects.equals(this.isMultiPartDownload, objALBServicesFileDownloadMetadata.isMultiPartDownload);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ALBServicesFileDownloadMetadata {\n");
      sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
        sb.append("    checksumType: ").append(toIndentedString(checksumType)).append("\n");
        sb.append("    chunkSize: ").append(toIndentedString(chunkSize)).append("\n");
        sb.append("    isMultiPartDownload: ").append(toIndentedString(isMultiPartDownload)).append("\n");
        sb.append("    signedUrl: ").append(toIndentedString(signedUrl)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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

