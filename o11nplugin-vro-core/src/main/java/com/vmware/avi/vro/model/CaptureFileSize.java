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
 * CaptureFileSize
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CaptureFileSize")
@VsoFinder(name = Constants.FINDER_VRO_CAPTUREFILESIZE, idAccessor = "getObjectID()")
@Service
public class CaptureFileSize extends AviRestResource  {
  @JsonProperty("absolute_size")
  private Integer absoluteSize = null;

  @JsonProperty("percentage_size")
  private Integer percentageSize = null;

  
  /**
   * Maximum size in MB. Set 0 for avi default size. Allowed values are 100-512000. Special values are 0 - 'AVI_DEFAULT'.
   * @return absoluteSize
  **/
  @ApiModelProperty(value = "Maximum size in MB. Set 0 for avi default size. Allowed values are 100-512000. Special values are 0 - 'AVI_DEFAULT'.")


 
  @VsoMethod  
  public Integer getAbsoluteSize() {
    return absoluteSize;
  }
    
  @VsoMethod
  public void setAbsoluteSize(Integer absoluteSize) {
    this.absoluteSize = absoluteSize;
  }

  
  /**
   * Limits capture to percentage of free disk space. Set 0 for avi default size. Allowed values are 0-75.
   * @return percentageSize
  **/
  @ApiModelProperty(value = "Limits capture to percentage of free disk space. Set 0 for avi default size. Allowed values are 0-75.")


 
  @VsoMethod  
  public Integer getPercentageSize() {
    return percentageSize;
  }
    
  @VsoMethod
  public void setPercentageSize(Integer percentageSize) {
    this.percentageSize = percentageSize;
  }

  
  public String getObjectID() {
		return "CaptureFileSize";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureFileSize captureFileSize = (CaptureFileSize) o;
    return Objects.equals(this.absoluteSize, captureFileSize.absoluteSize) &&
        Objects.equals(this.percentageSize, captureFileSize.percentageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteSize, percentageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureFileSize {\n");
    
    sb.append("    absoluteSize: ").append(toIndentedString(absoluteSize)).append("\n");
    sb.append("    percentageSize: ").append(toIndentedString(percentageSize)).append("\n");
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

