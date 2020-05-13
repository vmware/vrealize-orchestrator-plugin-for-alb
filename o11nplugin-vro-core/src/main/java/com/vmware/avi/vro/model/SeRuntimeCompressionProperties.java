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
 * SeRuntimeCompressionProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeRuntimeCompressionProperties")
@VsoFinder(name = Constants.FINDER_VRO_SERUNTIMECOMPRESSIONPROPERTIES, idAccessor = "getObjectID()")
@Service
public class SeRuntimeCompressionProperties extends AviRestResource  {
  @JsonProperty("max_low_rtt")
  private Integer maxLowRtt = 10;

  @JsonProperty("min_high_rtt")
  private Integer minHighRtt = 200;

  @JsonProperty("min_length")
  private Integer minLength = 128;

  @JsonProperty("mobile_str")
  @Valid
  private List<String> mobileStr = null;

  
  /**
   * If client RTT is higher than this threshold, enable normal compression on the response.
   * @return maxLowRtt
  **/
  @ApiModelProperty(value = "If client RTT is higher than this threshold, enable normal compression on the response.")


 
  @VsoMethod  
  public Integer getMaxLowRtt() {
    return maxLowRtt;
  }
    
  @VsoMethod
  public void setMaxLowRtt(Integer maxLowRtt) {
    this.maxLowRtt = maxLowRtt;
  }

  
  /**
   * If client RTT is higher than this threshold, enable aggressive compression on the response.
   * @return minHighRtt
  **/
  @ApiModelProperty(value = "If client RTT is higher than this threshold, enable aggressive compression on the response.")


 
  @VsoMethod  
  public Integer getMinHighRtt() {
    return minHighRtt;
  }
    
  @VsoMethod
  public void setMinHighRtt(Integer minHighRtt) {
    this.minHighRtt = minHighRtt;
  }

  
  /**
   * Minimum response content length to enable compression.
   * @return minLength
  **/
  @ApiModelProperty(value = "Minimum response content length to enable compression.")


 
  @VsoMethod  
  public Integer getMinLength() {
    return minLength;
  }
    
  @VsoMethod
  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  
  public SeRuntimeCompressionProperties addMobileStrItem(String mobileStrItem) {
    if (this.mobileStr == null) {
      this.mobileStr = new ArrayList<String>();
    }
    this.mobileStr.add(mobileStrItem);
    return this;
  }
  
  /**
   * Values that identify mobile browsers in order to enable aggressive compression.
   * @return mobileStr
  **/
  @ApiModelProperty(value = "Values that identify mobile browsers in order to enable aggressive compression.")


 
  @VsoMethod  
  public List<String> getMobileStr() {
    return mobileStr;
  }
    
  @VsoMethod
  public void setMobileStr(List<String> mobileStr) {
    this.mobileStr = mobileStr;
  }

  
  public String getObjectID() {
		return "SeRuntimeCompressionProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeRuntimeCompressionProperties seRuntimeCompressionProperties = (SeRuntimeCompressionProperties) o;
    return Objects.equals(this.maxLowRtt, seRuntimeCompressionProperties.maxLowRtt) &&
        Objects.equals(this.minHighRtt, seRuntimeCompressionProperties.minHighRtt) &&
        Objects.equals(this.minLength, seRuntimeCompressionProperties.minLength) &&
        Objects.equals(this.mobileStr, seRuntimeCompressionProperties.mobileStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxLowRtt, minHighRtt, minLength, mobileStr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeRuntimeCompressionProperties {\n");
    
    sb.append("    maxLowRtt: ").append(toIndentedString(maxLowRtt)).append("\n");
    sb.append("    minHighRtt: ").append(toIndentedString(minHighRtt)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    mobileStr: ").append(toIndentedString(mobileStr)).append("\n");
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

