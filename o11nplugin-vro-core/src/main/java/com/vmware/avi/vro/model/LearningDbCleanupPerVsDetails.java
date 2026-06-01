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
 * The LearningDbCleanupPerVsDetails is a POJO class extends AviRestResource that used for creating
 * LearningDbCleanupPerVsDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LearningDbCleanupPerVsDetails")
@VsoFinder(name = Constants.FINDER_VRO_LEARNINGDBCLEANUPPERVSDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LearningDbCleanupPerVsDetails extends AviRestResource {
    @JsonProperty("num_endpoint_rows_deleted")
    @JsonInclude(Include.NON_NULL)
    private Integer numEndpointRowsDeleted;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsUuid;



  /**
   * This is the getter method this will return the attribute value.
   * Number of endpoint rows deleted for this vs.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numEndpointRowsDeleted
   */
  @VsoMethod
  public Integer getNumEndpointRowsDeleted() {
    return numEndpointRowsDeleted;
  }

  /**
   * This is the setter method to the attribute.
   * Number of endpoint rows deleted for this vs.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numEndpointRowsDeleted set the numEndpointRowsDeleted.
   */
  @VsoMethod
  public void setNumEndpointRowsDeleted(Integer  numEndpointRowsDeleted) {
    this.numEndpointRowsDeleted = numEndpointRowsDeleted;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtualservice uuid for which learning database cleanup was performed.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Virtualservice uuid for which learning database cleanup was performed.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LearningDbCleanupPerVsDetails objLearningDbCleanupPerVsDetails = (LearningDbCleanupPerVsDetails) o;
  return   Objects.equals(this.vsUuid, objLearningDbCleanupPerVsDetails.vsUuid)&&
  Objects.equals(this.numEndpointRowsDeleted, objLearningDbCleanupPerVsDetails.numEndpointRowsDeleted);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LearningDbCleanupPerVsDetails {\n");
      sb.append("    numEndpointRowsDeleted: ").append(toIndentedString(numEndpointRowsDeleted)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

