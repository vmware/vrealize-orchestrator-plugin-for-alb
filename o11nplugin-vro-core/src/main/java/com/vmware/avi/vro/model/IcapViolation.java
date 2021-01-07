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
 * The IcapViolation is a POJO class extends AviRestResource that used for creating
 * IcapViolation.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IcapViolation")
@VsoFinder(name = Constants.FINDER_VRO_ICAPVIOLATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IcapViolation extends AviRestResource {
    @JsonProperty("file_name")
    @JsonInclude(Include.NON_NULL)
    private String fileName = null;

    @JsonProperty("resolution")
    @JsonInclude(Include.NON_NULL)
    private String resolution = null;

    @JsonProperty("threat_name")
    @JsonInclude(Include.NON_NULL)
    private String threatName = null;



  /**
   * This is the getter method this will return the attribute value.
   * The file that icap server has identified as containing a violation.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fileName
   */
  @VsoMethod
  public String getFileName() {
    return fileName;
  }

  /**
   * This is the setter method to the attribute.
   * The file that icap server has identified as containing a violation.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fileName set the fileName.
   */
  @VsoMethod
  public void setFileName(String  fileName) {
    this.fileName = fileName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Action taken by icap server in response to this threat.
   * Enum options - ICAP_FILE_NOT_REPAIRED, ICAP_FILE_REPAIRED, ICAP_VIOLATING_SECTION_REMOVED.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resolution
   */
  @VsoMethod
  public String getResolution() {
    return resolution;
  }

  /**
   * This is the setter method to the attribute.
   * Action taken by icap server in response to this threat.
   * Enum options - ICAP_FILE_NOT_REPAIRED, ICAP_FILE_REPAIRED, ICAP_VIOLATING_SECTION_REMOVED.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resolution set the resolution.
   */
  @VsoMethod
  public void setResolution(String  resolution) {
    this.resolution = resolution;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the threat.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return threatName
   */
  @VsoMethod
  public String getThreatName() {
    return threatName;
  }

  /**
   * This is the setter method to the attribute.
   * The name of the threat.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param threatName set the threatName.
   */
  @VsoMethod
  public void setThreatName(String  threatName) {
    this.threatName = threatName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IcapViolation objIcapViolation = (IcapViolation) o;
  return   Objects.equals(this.fileName, objIcapViolation.fileName)&&
  Objects.equals(this.threatName, objIcapViolation.threatName)&&
  Objects.equals(this.resolution, objIcapViolation.resolution);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IcapViolation {\n");
      sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    threatName: ").append(toIndentedString(threatName)).append("\n");
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

