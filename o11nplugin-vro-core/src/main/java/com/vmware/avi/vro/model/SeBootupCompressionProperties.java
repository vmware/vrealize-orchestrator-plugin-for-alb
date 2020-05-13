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
 * SeBootupCompressionProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeBootupCompressionProperties")
@VsoFinder(name = Constants.FINDER_VRO_SEBOOTUPCOMPRESSIONPROPERTIES, idAccessor = "getObjectID()")
@Service
public class SeBootupCompressionProperties extends AviRestResource  {
  @JsonProperty("buf_num")
  private Integer bufNum = 128;

  @JsonProperty("buf_size")
  private Integer bufSize = 4096;

  @JsonProperty("hash_size")
  private Integer hashSize = 16384;

  @JsonProperty("level_aggressive")
  private Integer levelAggressive = 5;

  @JsonProperty("level_normal")
  private Integer levelNormal = 1;

  @JsonProperty("window_size")
  private Integer windowSize = 4096;

  
  /**
   * Number of buffers to use for compression output.
   * @return bufNum
  **/
  @ApiModelProperty(value = "Number of buffers to use for compression output.")


 
  @VsoMethod  
  public Integer getBufNum() {
    return bufNum;
  }
    
  @VsoMethod
  public void setBufNum(Integer bufNum) {
    this.bufNum = bufNum;
  }

  
  /**
   * Size of each buffer used for compression output, this should ideally be a multiple of pagesize.
   * @return bufSize
  **/
  @ApiModelProperty(value = "Size of each buffer used for compression output, this should ideally be a multiple of pagesize.")


 
  @VsoMethod  
  public Integer getBufSize() {
    return bufSize;
  }
    
  @VsoMethod
  public void setBufSize(Integer bufSize) {
    this.bufSize = bufSize;
  }

  
  /**
   * hash size used by compression, rounded to the last power of 2.
   * @return hashSize
  **/
  @ApiModelProperty(value = "hash size used by compression, rounded to the last power of 2.")


 
  @VsoMethod  
  public Integer getHashSize() {
    return hashSize;
  }
    
  @VsoMethod
  public void setHashSize(Integer hashSize) {
    this.hashSize = hashSize;
  }

  
  /**
   * Level of compression to apply on content selected for aggressive compression.
   * @return levelAggressive
  **/
  @ApiModelProperty(value = "Level of compression to apply on content selected for aggressive compression.")


 
  @VsoMethod  
  public Integer getLevelAggressive() {
    return levelAggressive;
  }
    
  @VsoMethod
  public void setLevelAggressive(Integer levelAggressive) {
    this.levelAggressive = levelAggressive;
  }

  
  /**
   * Level of compression to apply on content selected for normal compression.
   * @return levelNormal
  **/
  @ApiModelProperty(value = "Level of compression to apply on content selected for normal compression.")


 
  @VsoMethod  
  public Integer getLevelNormal() {
    return levelNormal;
  }
    
  @VsoMethod
  public void setLevelNormal(Integer levelNormal) {
    this.levelNormal = levelNormal;
  }

  
  /**
   * window size used by compression, rounded to the last power of 2.
   * @return windowSize
  **/
  @ApiModelProperty(value = "window size used by compression, rounded to the last power of 2.")


 
  @VsoMethod  
  public Integer getWindowSize() {
    return windowSize;
  }
    
  @VsoMethod
  public void setWindowSize(Integer windowSize) {
    this.windowSize = windowSize;
  }

  
  public String getObjectID() {
		return "SeBootupCompressionProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeBootupCompressionProperties seBootupCompressionProperties = (SeBootupCompressionProperties) o;
    return Objects.equals(this.bufNum, seBootupCompressionProperties.bufNum) &&
        Objects.equals(this.bufSize, seBootupCompressionProperties.bufSize) &&
        Objects.equals(this.hashSize, seBootupCompressionProperties.hashSize) &&
        Objects.equals(this.levelAggressive, seBootupCompressionProperties.levelAggressive) &&
        Objects.equals(this.levelNormal, seBootupCompressionProperties.levelNormal) &&
        Objects.equals(this.windowSize, seBootupCompressionProperties.windowSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bufNum, bufSize, hashSize, levelAggressive, levelNormal, windowSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeBootupCompressionProperties {\n");
    
    sb.append("    bufNum: ").append(toIndentedString(bufNum)).append("\n");
    sb.append("    bufSize: ").append(toIndentedString(bufSize)).append("\n");
    sb.append("    hashSize: ").append(toIndentedString(hashSize)).append("\n");
    sb.append("    levelAggressive: ").append(toIndentedString(levelAggressive)).append("\n");
    sb.append("    levelNormal: ").append(toIndentedString(levelNormal)).append("\n");
    sb.append("    windowSize: ").append(toIndentedString(windowSize)).append("\n");
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

