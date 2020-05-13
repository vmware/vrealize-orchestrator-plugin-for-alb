package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ClientLogStreamingFormat
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ClientLogStreamingFormat")
@VsoFinder(name = Constants.FINDER_VRO_CLIENTLOGSTREAMINGFORMAT, idAccessor = "getObjectID()")
@Service
public class ClientLogStreamingFormat extends AviRestResource  {
  @JsonProperty("format")
  private String format = null;

  @JsonProperty("included_fields")
  @Valid
  private List<String> includedFields = null;

  
  /**
   * Format for the streamed logs. Enum options - LOG_STREAMING_FORMAT_JSON_FULL, LOG_STREAMING_FORMAT_JSON_SELECTED. Field introduced in 18.2.5.
   * @return format
  **/
  @ApiModelProperty(required = true, value = "Format for the streamed logs. Enum options - LOG_STREAMING_FORMAT_JSON_FULL, LOG_STREAMING_FORMAT_JSON_SELECTED. Field introduced in 18.2.5.")
  @NotNull


 
  @VsoMethod  
  public String getFormat() {
    return format;
  }
    
  @VsoMethod
  public void setFormat(String format) {
    this.format = format;
  }

  
  public ClientLogStreamingFormat addIncludedFieldsItem(String includedFieldsItem) {
    if (this.includedFields == null) {
      this.includedFields = new ArrayList<String>();
    }
    this.includedFields.add(includedFieldsItem);
    return this;
  }
  
  /**
   * List of log fields to be streamed, when selective fields (LOG_STREAMING_FORMAT_JSON_SELECTED) option is chosen. Only top-level fields in application or connection logs are supported. Field introduced in 18.2.5.
   * @return includedFields
  **/
  @ApiModelProperty(value = "List of log fields to be streamed, when selective fields (LOG_STREAMING_FORMAT_JSON_SELECTED) option is chosen. Only top-level fields in application or connection logs are supported. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public List<String> getIncludedFields() {
    return includedFields;
  }
    
  @VsoMethod
  public void setIncludedFields(List<String> includedFields) {
    this.includedFields = includedFields;
  }

  
  public String getObjectID() {
		return "ClientLogStreamingFormat";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientLogStreamingFormat clientLogStreamingFormat = (ClientLogStreamingFormat) o;
    return Objects.equals(this.format, clientLogStreamingFormat.format) &&
        Objects.equals(this.includedFields, clientLogStreamingFormat.includedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, includedFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientLogStreamingFormat {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    includedFields: ").append(toIndentedString(includedFields)).append("\n");
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

