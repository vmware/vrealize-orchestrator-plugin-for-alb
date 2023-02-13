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
 * The DosThresholdProfile is a POJO class extends AviRestResource that used for creating
 * DosThresholdProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DosThresholdProfile")
@VsoFinder(name = Constants.FINDER_VRO_DOSTHRESHOLDPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DosThresholdProfile extends AviRestResource {
    @JsonProperty("thresh_info")
    @JsonInclude(Include.NON_NULL)
    private List<DosThreshold> threshInfo = null;

    @JsonProperty("thresh_period")
    @JsonInclude(Include.NON_NULL)
    private Integer threshPeriod = 5;



  /**
   * This is the getter method this will return the attribute value.
   * Attack type, min and max values for dos attack detection.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return threshInfo
   */
  @VsoMethod
  public List<DosThreshold> getThreshInfo() {
    return threshInfo;
  }

  /**
   * This is the setter method. this will set the threshInfo
   * Attack type, min and max values for dos attack detection.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return threshInfo
   */
  @VsoMethod
  public void setThreshInfo(List<DosThreshold>  threshInfo) {
    this.threshInfo = threshInfo;
  }

  /**
   * This is the setter method this will set the threshInfo
   * Attack type, min and max values for dos attack detection.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return threshInfo
   */
  @VsoMethod
  public DosThresholdProfile addThreshInfoItem(DosThreshold threshInfoItem) {
    if (this.threshInfo == null) {
      this.threshInfo = new ArrayList<DosThreshold>();
    }
    this.threshInfo.add(threshInfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Timer value in seconds to collect dos attack metrics based on threshold on the service engine for this virtual service.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return threshPeriod
   */
  @VsoMethod
  public Integer getThreshPeriod() {
    return threshPeriod;
  }

  /**
   * This is the setter method to the attribute.
   * Timer value in seconds to collect dos attack metrics based on threshold on the service engine for this virtual service.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param threshPeriod set the threshPeriod.
   */
  @VsoMethod
  public void setThreshPeriod(Integer  threshPeriod) {
    this.threshPeriod = threshPeriod;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DosThresholdProfile objDosThresholdProfile = (DosThresholdProfile) o;
  return   Objects.equals(this.threshPeriod, objDosThresholdProfile.threshPeriod)&&
  Objects.equals(this.threshInfo, objDosThresholdProfile.threshInfo);
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

