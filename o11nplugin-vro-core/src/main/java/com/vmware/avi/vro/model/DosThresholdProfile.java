package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DosThreshold;
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
 * DosThresholdProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DosThresholdProfile")
@VsoFinder(name = Constants.FINDER_VRO_DOSTHRESHOLDPROFILE, idAccessor = "getObjectID()")
@Service
public class DosThresholdProfile extends AviRestResource  {
  @JsonProperty("thresh_info")
  @Valid
  private List<DosThreshold> threshInfo = null;

  @JsonProperty("thresh_period")
  private Integer threshPeriod = 5;

  
  public DosThresholdProfile addThreshInfoItem(DosThreshold threshInfoItem) {
    if (this.threshInfo == null) {
      this.threshInfo = new ArrayList<DosThreshold>();
    }
    this.threshInfo.add(threshInfoItem);
    return this;
  }
  
  /**
   * Attack type, min and max values for DoS attack detection.
   * @return threshInfo
  **/
  @ApiModelProperty(value = "Attack type, min and max values for DoS attack detection.")

  @Valid

 
  @VsoMethod  
  public List<DosThreshold> getThreshInfo() {
    return threshInfo;
  }
    
  @VsoMethod
  public void setThreshInfo(List<DosThreshold> threshInfo) {
    this.threshInfo = threshInfo;
  }

  
  /**
   * Timer value in seconds to collect DoS attack metrics based on threshold on the Service Engine for this Virtual Service.
   * @return threshPeriod
  **/
  @ApiModelProperty(required = true, value = "Timer value in seconds to collect DoS attack metrics based on threshold on the Service Engine for this Virtual Service.")
  @NotNull


 
  @VsoMethod  
  public Integer getThreshPeriod() {
    return threshPeriod;
  }
    
  @VsoMethod
  public void setThreshPeriod(Integer threshPeriod) {
    this.threshPeriod = threshPeriod;
  }

  
  public String getObjectID() {
		return "DosThresholdProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DosThresholdProfile dosThresholdProfile = (DosThresholdProfile) o;
    return Objects.equals(this.threshInfo, dosThresholdProfile.threshInfo) &&
        Objects.equals(this.threshPeriod, dosThresholdProfile.threshPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshInfo, threshPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DosThresholdProfile {\n");
    
    sb.append("    threshInfo: ").append(toIndentedString(threshInfo)).append("\n");
    sb.append("    threshPeriod: ").append(toIndentedString(threshPeriod)).append("\n");
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

