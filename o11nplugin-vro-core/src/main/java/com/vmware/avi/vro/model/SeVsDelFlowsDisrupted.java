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
 * The SeVsDelFlowsDisrupted is a POJO class extends AviRestResource that used for creating
 * SeVsDelFlowsDisrupted.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeVsDelFlowsDisrupted")
@VsoFinder(name = Constants.FINDER_VRO_SEVSDELFLOWSDISRUPTED)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeVsDelFlowsDisrupted extends AviRestResource {
    @JsonProperty("deleted_vs_name")
    @JsonInclude(Include.NON_NULL)
    private String deletedVsName;

    @JsonProperty("num_vs_flows_disrupted")
    @JsonInclude(Include.NON_NULL)
    private Integer numVsFlowsDisrupted;

    @JsonProperty("reporting_se_name")
    @JsonInclude(Include.NON_NULL)
    private String reportingSeName;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the vs which was deleted from the se.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return deletedVsName
   */
  @VsoMethod
  public String getDeletedVsName() {
    return deletedVsName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the vs which was deleted from the se.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param deletedVsName set the deletedVsName.
   */
  @VsoMethod
  public void setDeletedVsName(String  deletedVsName) {
    this.deletedVsName = deletedVsName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of vs flows disrupted when vs was deleted from the se.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numVsFlowsDisrupted
   */
  @VsoMethod
  public Integer getNumVsFlowsDisrupted() {
    return numVsFlowsDisrupted;
  }

  /**
   * This is the setter method to the attribute.
   * Number of vs flows disrupted when vs was deleted from the se.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numVsFlowsDisrupted set the numVsFlowsDisrupted.
   */
  @VsoMethod
  public void setNumVsFlowsDisrupted(Integer  numVsFlowsDisrupted) {
    this.numVsFlowsDisrupted = numVsFlowsDisrupted;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the se reporting this event.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reportingSeName
   */
  @VsoMethod
  public String getReportingSeName() {
    return reportingSeName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the se reporting this event.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reportingSeName set the reportingSeName.
   */
  @VsoMethod
  public void setReportingSeName(String  reportingSeName) {
    this.reportingSeName = reportingSeName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeVsDelFlowsDisrupted objSeVsDelFlowsDisrupted = (SeVsDelFlowsDisrupted) o;
  return   Objects.equals(this.reportingSeName, objSeVsDelFlowsDisrupted.reportingSeName)&&
  Objects.equals(this.deletedVsName, objSeVsDelFlowsDisrupted.deletedVsName)&&
  Objects.equals(this.numVsFlowsDisrupted, objSeVsDelFlowsDisrupted.numVsFlowsDisrupted);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeVsDelFlowsDisrupted {\n");
      sb.append("    deletedVsName: ").append(toIndentedString(deletedVsName)).append("\n");
        sb.append("    numVsFlowsDisrupted: ").append(toIndentedString(numVsFlowsDisrupted)).append("\n");
        sb.append("    reportingSeName: ").append(toIndentedString(reportingSeName)).append("\n");
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

