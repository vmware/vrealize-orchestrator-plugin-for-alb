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
 * The LearningDbCleanupEventDetails is a POJO class extends AviRestResource that used for creating
 * LearningDbCleanupEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LearningDbCleanupEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_LEARNINGDBCLEANUPEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LearningDbCleanupEventDetails extends AviRestResource {
    @JsonProperty("error_message")
    @JsonInclude(Include.NON_NULL)
    private String errorMessage;

    @JsonProperty("total_num_endpoint_rows_deleted")
    @JsonInclude(Include.NON_NULL)
    private Integer totalNumEndpointRowsDeleted;

    @JsonProperty("total_size_freed")
    @JsonInclude(Include.NON_NULL)
    private Integer totalSizeFreed;

    @JsonProperty("vs_cleanup_details")
    @JsonInclude(Include.NON_NULL)
    private List<LearningDbCleanupPerVsDetails> vsCleanupDetails;



  /**
   * This is the getter method this will return the attribute value.
   * Error message if the cleanup failed for this database.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorMessage
   */
  @VsoMethod
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * This is the setter method to the attribute.
   * Error message if the cleanup failed for this database.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorMessage set the errorMessage.
   */
  @VsoMethod
  public void setErrorMessage(String  errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of endpoint rows deleted for all vses.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalNumEndpointRowsDeleted
   */
  @VsoMethod
  public Integer getTotalNumEndpointRowsDeleted() {
    return totalNumEndpointRowsDeleted;
  }

  /**
   * This is the setter method to the attribute.
   * Number of endpoint rows deleted for all vses.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalNumEndpointRowsDeleted set the totalNumEndpointRowsDeleted.
   */
  @VsoMethod
  public void setTotalNumEndpointRowsDeleted(Integer  totalNumEndpointRowsDeleted) {
    this.totalNumEndpointRowsDeleted = totalNumEndpointRowsDeleted;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Size freed from the learning database.
   * Field introduced in 32.1.4.
   * Unit is bytes.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalSizeFreed
   */
  @VsoMethod
  public Integer getTotalSizeFreed() {
    return totalSizeFreed;
  }

  /**
   * This is the setter method to the attribute.
   * Size freed from the learning database.
   * Field introduced in 32.1.4.
   * Unit is bytes.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalSizeFreed set the totalSizeFreed.
   */
  @VsoMethod
  public void setTotalSizeFreed(Integer  totalSizeFreed) {
    this.totalSizeFreed = totalSizeFreed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Details for each vs for which learning database cleanup was performed.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsCleanupDetails
   */
  @VsoMethod
  public List<LearningDbCleanupPerVsDetails> getVsCleanupDetails() {
    return vsCleanupDetails;
  }

  /**
   * This is the setter method. this will set the vsCleanupDetails
   * Details for each vs for which learning database cleanup was performed.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsCleanupDetails
   */
  @VsoMethod
  public void setVsCleanupDetails(List<LearningDbCleanupPerVsDetails>  vsCleanupDetails) {
    this.vsCleanupDetails = vsCleanupDetails;
  }

  /**
   * This is the setter method this will set the vsCleanupDetails
   * Details for each vs for which learning database cleanup was performed.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsCleanupDetails
   */
  @VsoMethod
  public LearningDbCleanupEventDetails addVsCleanupDetailsItem(LearningDbCleanupPerVsDetails vsCleanupDetailsItem) {
    if (this.vsCleanupDetails == null) {
      this.vsCleanupDetails = new ArrayList<LearningDbCleanupPerVsDetails>();
    }
    this.vsCleanupDetails.add(vsCleanupDetailsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LearningDbCleanupEventDetails objLearningDbCleanupEventDetails = (LearningDbCleanupEventDetails) o;
  return   Objects.equals(this.vsCleanupDetails, objLearningDbCleanupEventDetails.vsCleanupDetails)&&
  Objects.equals(this.totalSizeFreed, objLearningDbCleanupEventDetails.totalSizeFreed)&&
  Objects.equals(this.totalNumEndpointRowsDeleted, objLearningDbCleanupEventDetails.totalNumEndpointRowsDeleted)&&
  Objects.equals(this.errorMessage, objLearningDbCleanupEventDetails.errorMessage);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LearningDbCleanupEventDetails {\n");
      sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    totalNumEndpointRowsDeleted: ").append(toIndentedString(totalNumEndpointRowsDeleted)).append("\n");
        sb.append("    totalSizeFreed: ").append(toIndentedString(totalSizeFreed)).append("\n");
        sb.append("    vsCleanupDetails: ").append(toIndentedString(vsCleanupDetails)).append("\n");
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

