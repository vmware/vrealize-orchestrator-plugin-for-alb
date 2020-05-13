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
 * ClientLogConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ClientLogConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_CLIENTLOGCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class ClientLogConfiguration extends AviRestResource  {
  @JsonProperty("enable_significant_log_collection")
  private Boolean enableSignificantLogCollection = true;

  @JsonProperty("filtered_log_processing")
  private String filteredLogProcessing = "LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND";

  @JsonProperty("non_significant_log_processing")
  private String nonSignificantLogProcessing = "LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND";

  @JsonProperty("significant_log_processing")
  private String significantLogProcessing = "LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND";

  
  /**
   * Enable significant log collection. By default, this flag is enabled, which means that Avi SEs collect significant logs and forward them to Controller for further processing. For example, these logs correspond to error conditions such as when the response code for a request is 500. Users can disable this flag to turn off default significant log collection.
   * @return enableSignificantLogCollection
  **/
  @ApiModelProperty(value = "Enable significant log collection. By default, this flag is enabled, which means that Avi SEs collect significant logs and forward them to Controller for further processing. For example, these logs correspond to error conditions such as when the response code for a request is 500. Users can disable this flag to turn off default significant log collection.")


 
  @VsoMethod  
  public Boolean isEnableSignificantLogCollection() {
    return enableSignificantLogCollection;
  }
    
  @VsoMethod
  public void setEnableSignificantLogCollection(Boolean enableSignificantLogCollection) {
    this.enableSignificantLogCollection = enableSignificantLogCollection;
  }

  
  /**
   * (Note  Only sync_and_index_on_demand is implemented at this time) Filtered logs are logs that match any client log filters or rules with logging enabled. Such logs are processed by the Logs Analytics system according to this setting. Enum options - LOGS_PROCESSING_NONE, LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND, LOGS_PROCESSING_AUTO_SYNC_AND_INDEX, LOGS_PROCESSING_AUTO_SYNC_BUT_INDEX_ON_DEMAND. Field introduced in 17.1.1.
   * @return filteredLogProcessing
  **/
  @ApiModelProperty(value = "(Note  Only sync_and_index_on_demand is implemented at this time) Filtered logs are logs that match any client log filters or rules with logging enabled. Such logs are processed by the Logs Analytics system according to this setting. Enum options - LOGS_PROCESSING_NONE, LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND, LOGS_PROCESSING_AUTO_SYNC_AND_INDEX, LOGS_PROCESSING_AUTO_SYNC_BUT_INDEX_ON_DEMAND. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getFilteredLogProcessing() {
    return filteredLogProcessing;
  }
    
  @VsoMethod
  public void setFilteredLogProcessing(String filteredLogProcessing) {
    this.filteredLogProcessing = filteredLogProcessing;
  }

  
  /**
   * (Note  Only sync_and_index_on_demand is implemented at this time) Logs that are neither significant nor filtered, are processed by the Logs Analytics system according to this setting. Enum options - LOGS_PROCESSING_NONE, LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND, LOGS_PROCESSING_AUTO_SYNC_AND_INDEX, LOGS_PROCESSING_AUTO_SYNC_BUT_INDEX_ON_DEMAND. Field introduced in 17.1.1.
   * @return nonSignificantLogProcessing
  **/
  @ApiModelProperty(value = "(Note  Only sync_and_index_on_demand is implemented at this time) Logs that are neither significant nor filtered, are processed by the Logs Analytics system according to this setting. Enum options - LOGS_PROCESSING_NONE, LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND, LOGS_PROCESSING_AUTO_SYNC_AND_INDEX, LOGS_PROCESSING_AUTO_SYNC_BUT_INDEX_ON_DEMAND. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getNonSignificantLogProcessing() {
    return nonSignificantLogProcessing;
  }
    
  @VsoMethod
  public void setNonSignificantLogProcessing(String nonSignificantLogProcessing) {
    this.nonSignificantLogProcessing = nonSignificantLogProcessing;
  }

  
  /**
   * Significant logs are processed by the Logs Analytics system according to this setting. Enum options - LOGS_PROCESSING_NONE, LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND, LOGS_PROCESSING_AUTO_SYNC_AND_INDEX, LOGS_PROCESSING_AUTO_SYNC_BUT_INDEX_ON_DEMAND. Field introduced in 17.1.1.
   * @return significantLogProcessing
  **/
  @ApiModelProperty(value = "Significant logs are processed by the Logs Analytics system according to this setting. Enum options - LOGS_PROCESSING_NONE, LOGS_PROCESSING_SYNC_AND_INDEX_ON_DEMAND, LOGS_PROCESSING_AUTO_SYNC_AND_INDEX, LOGS_PROCESSING_AUTO_SYNC_BUT_INDEX_ON_DEMAND. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getSignificantLogProcessing() {
    return significantLogProcessing;
  }
    
  @VsoMethod
  public void setSignificantLogProcessing(String significantLogProcessing) {
    this.significantLogProcessing = significantLogProcessing;
  }

  
  public String getObjectID() {
		return "ClientLogConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientLogConfiguration clientLogConfiguration = (ClientLogConfiguration) o;
    return Objects.equals(this.enableSignificantLogCollection, clientLogConfiguration.enableSignificantLogCollection) &&
        Objects.equals(this.filteredLogProcessing, clientLogConfiguration.filteredLogProcessing) &&
        Objects.equals(this.nonSignificantLogProcessing, clientLogConfiguration.nonSignificantLogProcessing) &&
        Objects.equals(this.significantLogProcessing, clientLogConfiguration.significantLogProcessing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableSignificantLogCollection, filteredLogProcessing, nonSignificantLogProcessing, significantLogProcessing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientLogConfiguration {\n");
    
    sb.append("    enableSignificantLogCollection: ").append(toIndentedString(enableSignificantLogCollection)).append("\n");
    sb.append("    filteredLogProcessing: ").append(toIndentedString(filteredLogProcessing)).append("\n");
    sb.append("    nonSignificantLogProcessing: ").append(toIndentedString(nonSignificantLogProcessing)).append("\n");
    sb.append("    significantLogProcessing: ").append(toIndentedString(significantLogProcessing)).append("\n");
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

