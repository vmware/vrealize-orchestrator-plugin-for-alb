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
 * TimeStamp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "TimeStamp")
@VsoFinder(name = Constants.FINDER_VRO_TIMESTAMP, idAccessor = "getObjectID()")
@Service
public class TimeStamp extends AviRestResource  {
  @JsonProperty("secs")
  private Long secs = null;

  @JsonProperty("usecs")
  private Long usecs = null;

  
  /**
   * Number of secs.
   * @return secs
  **/
  @ApiModelProperty(required = true, value = "Number of secs.")
  @NotNull


 
  @VsoMethod  
  public Long getSecs() {
    return secs;
  }
    
  @VsoMethod
  public void setSecs(Long secs) {
    this.secs = secs;
  }

  
  /**
   * Number of usecs.
   * @return usecs
  **/
  @ApiModelProperty(required = true, value = "Number of usecs.")
  @NotNull


 
  @VsoMethod  
  public Long getUsecs() {
    return usecs;
  }
    
  @VsoMethod
  public void setUsecs(Long usecs) {
    this.usecs = usecs;
  }

  
  public String getObjectID() {
		return "TimeStamp";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeStamp timeStamp = (TimeStamp) o;
    return Objects.equals(this.secs, timeStamp.secs) &&
        Objects.equals(this.usecs, timeStamp.usecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secs, usecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeStamp {\n");
    
    sb.append("    secs: ").append(toIndentedString(secs)).append("\n");
    sb.append("    usecs: ").append(toIndentedString(usecs)).append("\n");
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

