package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CompressionFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * CompressionProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CompressionProfile")
@VsoFinder(name = Constants.FINDER_VRO_COMPRESSIONPROFILE, idAccessor = "getObjectID()")
@Service
public class CompressionProfile extends AviRestResource  {
  @JsonProperty("compressible_content_ref")
  private String compressibleContentRef = null;

  @JsonProperty("compression")
  private Boolean compression = null;

  @JsonProperty("filter")
  @Valid
  private List<CompressionFilter> filter = null;

  @JsonProperty("remove_accept_encoding_header")
  private Boolean removeAcceptEncodingHeader = true;

  @JsonProperty("type")
  private String type = "AUTO_COMPRESSION";

  
  /**
   * Compress only content types listed in this string group. Content types not present in this list are not compressed. It is a reference to an object of type StringGroup.
   * @return compressibleContentRef
  **/
  @ApiModelProperty(value = "Compress only content types listed in this string group. Content types not present in this list are not compressed. It is a reference to an object of type StringGroup.")


 
  @VsoMethod  
  public String getCompressibleContentRef() {
    return compressibleContentRef;
  }
    
  @VsoMethod
  public void setCompressibleContentRef(String compressibleContentRef) {
    this.compressibleContentRef = compressibleContentRef;
  }

  
  /**
   * Compress HTTP response content if it wasn't already compressed.
   * @return compression
  **/
  @ApiModelProperty(required = true, value = "Compress HTTP response content if it wasn't already compressed.")
  @NotNull


 
  @VsoMethod  
  public Boolean isCompression() {
    return compression;
  }
    
  @VsoMethod
  public void setCompression(Boolean compression) {
    this.compression = compression;
  }

  
  public CompressionProfile addFilterItem(CompressionFilter filterItem) {
    if (this.filter == null) {
      this.filter = new ArrayList<CompressionFilter>();
    }
    this.filter.add(filterItem);
    return this;
  }
  
  /**
   * Custom filters used when auto compression is not selected.
   * @return filter
  **/
  @ApiModelProperty(value = "Custom filters used when auto compression is not selected.")

  @Valid

 
  @VsoMethod  
  public List<CompressionFilter> getFilter() {
    return filter;
  }
    
  @VsoMethod
  public void setFilter(List<CompressionFilter> filter) {
    this.filter = filter;
  }

  
  /**
   * Offload compression from the servers to AVI. Saves compute cycles on the servers.
   * @return removeAcceptEncodingHeader
  **/
  @ApiModelProperty(required = true, value = "Offload compression from the servers to AVI. Saves compute cycles on the servers.")
  @NotNull


 
  @VsoMethod  
  public Boolean isRemoveAcceptEncodingHeader() {
    return removeAcceptEncodingHeader;
  }
    
  @VsoMethod
  public void setRemoveAcceptEncodingHeader(Boolean removeAcceptEncodingHeader) {
    this.removeAcceptEncodingHeader = removeAcceptEncodingHeader;
  }

  
  /**
   * Compress content automatically or add custom filters to define compressible content and compression levels. Enum options - AUTO_COMPRESSION, CUSTOM_COMPRESSION.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Compress content automatically or add custom filters to define compressible content and compression levels. Enum options - AUTO_COMPRESSION, CUSTOM_COMPRESSION.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "CompressionProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompressionProfile compressionProfile = (CompressionProfile) o;
    return Objects.equals(this.compressibleContentRef, compressionProfile.compressibleContentRef) &&
        Objects.equals(this.compression, compressionProfile.compression) &&
        Objects.equals(this.filter, compressionProfile.filter) &&
        Objects.equals(this.removeAcceptEncodingHeader, compressionProfile.removeAcceptEncodingHeader) &&
        Objects.equals(this.type, compressionProfile.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compressibleContentRef, compression, filter, removeAcceptEncodingHeader, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompressionProfile {\n");
    
    sb.append("    compressibleContentRef: ").append(toIndentedString(compressibleContentRef)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    removeAcceptEncodingHeader: ").append(toIndentedString(removeAcceptEncodingHeader)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

