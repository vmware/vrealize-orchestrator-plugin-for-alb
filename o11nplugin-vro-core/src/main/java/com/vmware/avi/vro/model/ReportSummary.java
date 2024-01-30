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
 * The ReportSummary is a POJO class extends AviRestResource that used for creating
 * ReportSummary.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ReportSummary")
@VsoFinder(name = Constants.FINDER_VRO_REPORTSUMMARY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ReportSummary extends AviRestResource {
    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("previews")
    @JsonInclude(Include.NON_NULL)
    private List<String> previews = null;

    @JsonProperty("title")
    @JsonInclude(Include.NON_NULL)
    private String title = null;



  /**
   * This is the getter method this will return the attribute value.
   * Detailed description of the report.
   * Field introduced in 22.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Detailed description of the report.
   * Field introduced in 22.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Preview of the operations performed in the report.
   * Ex  upgrade pre-check previews.
   * Field introduced in 22.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previews
   */
  @VsoMethod
  public List<String> getPreviews() {
    return previews;
  }

  /**
   * This is the setter method. this will set the previews
   * Preview of the operations performed in the report.
   * Ex  upgrade pre-check previews.
   * Field introduced in 22.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previews
   */
  @VsoMethod
  public void setPreviews(List<String>  previews) {
    this.previews = previews;
  }

  /**
   * This is the setter method this will set the previews
   * Preview of the operations performed in the report.
   * Ex  upgrade pre-check previews.
   * Field introduced in 22.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return previews
   */
  @VsoMethod
  public ReportSummary addPreviewsItem(String previewsItem) {
    if (this.previews == null) {
      this.previews = new ArrayList<String>();
    }
    this.previews.add(previewsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * User friendly title for the report.
   * Field introduced in 22.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return title
   */
  @VsoMethod
  public String getTitle() {
    return title;
  }

  /**
   * This is the setter method to the attribute.
   * User friendly title for the report.
   * Field introduced in 22.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param title set the title.
   */
  @VsoMethod
  public void setTitle(String  title) {
    this.title = title;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ReportSummary objReportSummary = (ReportSummary) o;
  return   Objects.equals(this.title, objReportSummary.title)&&
  Objects.equals(this.description, objReportSummary.description)&&
  Objects.equals(this.previews, objReportSummary.previews);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ReportSummary {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    previews: ").append(toIndentedString(previews)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

