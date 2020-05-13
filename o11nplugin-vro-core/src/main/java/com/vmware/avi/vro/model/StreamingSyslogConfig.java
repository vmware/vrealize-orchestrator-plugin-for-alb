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
 * StreamingSyslogConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "StreamingSyslogConfig")
@VsoFinder(name = Constants.FINDER_VRO_STREAMINGSYSLOGCONFIG, idAccessor = "getObjectID()")
@Service
public class StreamingSyslogConfig extends AviRestResource  {
  @JsonProperty("facility")
  private Integer facility = 16;

  @JsonProperty("filtered_log_severity")
  private Integer filteredLogSeverity = 5;

  @JsonProperty("hostname")
  private String hostname = "AviVantage";

  @JsonProperty("non_significant_log_severity")
  private Integer nonSignificantLogSeverity = 6;

  @JsonProperty("significant_log_severity")
  private Integer significantLogSeverity = 4;

  
  /**
   * Facility value, as defined in RFC5424, must be between 0 and 23 inclusive. Allowed values are 0-23. Field introduced in 18.1.1.
   * @return facility
  **/
  @ApiModelProperty(value = "Facility value, as defined in RFC5424, must be between 0 and 23 inclusive. Allowed values are 0-23. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getFacility() {
    return facility;
  }
    
  @VsoMethod
  public void setFacility(Integer facility) {
    this.facility = facility;
  }

  
  /**
   * Severity code, as defined in RFC5424, for filtered logs. This must be between 0 and 7 inclusive. Allowed values are 0-7. Field introduced in 18.1.1.
   * @return filteredLogSeverity
  **/
  @ApiModelProperty(value = "Severity code, as defined in RFC5424, for filtered logs. This must be between 0 and 7 inclusive. Allowed values are 0-7. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getFilteredLogSeverity() {
    return filteredLogSeverity;
  }
    
  @VsoMethod
  public void setFilteredLogSeverity(Integer filteredLogSeverity) {
    this.filteredLogSeverity = filteredLogSeverity;
  }

  
  /**
   * String to use as the hostname in the syslog messages. This string can contain only printable ASCII characters (hex 21 to hex 7E; no space allowed). Field introduced in 18.1.1.
   * @return hostname
  **/
  @ApiModelProperty(value = "String to use as the hostname in the syslog messages. This string can contain only printable ASCII characters (hex 21 to hex 7E; no space allowed). Field introduced in 18.1.1.")


 
  @VsoMethod  
  public String getHostname() {
    return hostname;
  }
    
  @VsoMethod
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  
  /**
   * Severity code, as defined in RFC5424, for non-significant logs. This must be between 0 and 7 inclusive. Allowed values are 0-7. Field introduced in 18.1.1.
   * @return nonSignificantLogSeverity
  **/
  @ApiModelProperty(value = "Severity code, as defined in RFC5424, for non-significant logs. This must be between 0 and 7 inclusive. Allowed values are 0-7. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getNonSignificantLogSeverity() {
    return nonSignificantLogSeverity;
  }
    
  @VsoMethod
  public void setNonSignificantLogSeverity(Integer nonSignificantLogSeverity) {
    this.nonSignificantLogSeverity = nonSignificantLogSeverity;
  }

  
  /**
   * Severity code, as defined in RFC5424, for significant logs. This must be between 0 and 7 inclusive. Allowed values are 0-7. Field introduced in 18.1.1.
   * @return significantLogSeverity
  **/
  @ApiModelProperty(value = "Severity code, as defined in RFC5424, for significant logs. This must be between 0 and 7 inclusive. Allowed values are 0-7. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getSignificantLogSeverity() {
    return significantLogSeverity;
  }
    
  @VsoMethod
  public void setSignificantLogSeverity(Integer significantLogSeverity) {
    this.significantLogSeverity = significantLogSeverity;
  }

  
  public String getObjectID() {
		return "StreamingSyslogConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamingSyslogConfig streamingSyslogConfig = (StreamingSyslogConfig) o;
    return Objects.equals(this.facility, streamingSyslogConfig.facility) &&
        Objects.equals(this.filteredLogSeverity, streamingSyslogConfig.filteredLogSeverity) &&
        Objects.equals(this.hostname, streamingSyslogConfig.hostname) &&
        Objects.equals(this.nonSignificantLogSeverity, streamingSyslogConfig.nonSignificantLogSeverity) &&
        Objects.equals(this.significantLogSeverity, streamingSyslogConfig.significantLogSeverity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facility, filteredLogSeverity, hostname, nonSignificantLogSeverity, significantLogSeverity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamingSyslogConfig {\n");
    
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    filteredLogSeverity: ").append(toIndentedString(filteredLogSeverity)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    nonSignificantLogSeverity: ").append(toIndentedString(nonSignificantLogSeverity)).append("\n");
    sb.append("    significantLogSeverity: ").append(toIndentedString(significantLogSeverity)).append("\n");
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

