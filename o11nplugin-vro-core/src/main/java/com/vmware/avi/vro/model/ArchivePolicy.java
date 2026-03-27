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
 * The ArchivePolicy is a POJO class extends AviRestResource that used for creating
 * ArchivePolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ArchivePolicy")
@VsoFinder(name = Constants.FINDER_VRO_ARCHIVEPOLICY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ArchivePolicy extends AviRestResource {
    @JsonProperty("file_path")
    @JsonInclude(Include.NON_NULL)
    private String filePath;

    @JsonProperty("threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer threshold = 128;



  /**
   * This is the getter method this will return the attribute value.
   * Specify a file path to add archive rule.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return filePath
   */
  @VsoMethod
  public String getFilePath() {
    return filePath;
  }

  /**
   * This is the setter method to the attribute.
   * Specify a file path to add archive rule.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param filePath set the filePath.
   */
  @VsoMethod
  public void setFilePath(String  filePath) {
    this.filePath = filePath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specify a threshold for file path in mb.
   * Field introduced in 31.2.1.
   * Unit is mb.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @return threshold
   */
  @VsoMethod
  public Integer getThreshold() {
    return threshold;
  }

  /**
   * This is the setter method to the attribute.
   * Specify a threshold for file path in mb.
   * Field introduced in 31.2.1.
   * Unit is mb.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @param threshold set the threshold.
   */
  @VsoMethod
  public void setThreshold(Integer  threshold) {
    this.threshold = threshold;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ArchivePolicy objArchivePolicy = (ArchivePolicy) o;
  return   Objects.equals(this.filePath, objArchivePolicy.filePath)&&
  Objects.equals(this.threshold, objArchivePolicy.threshold);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ArchivePolicy {\n");
      sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

