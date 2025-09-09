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
 * The ReportSubSection is a POJO class extends AviRestResource that used for creating
 * ReportSubSection.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ReportSubSection")
@VsoFinder(name = Constants.FINDER_VRO_REPORTSUBSECTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ReportSubSection extends AviRestResource {
    @JsonProperty("id")
    @JsonInclude(Include.NON_NULL)
    private String id;



  /**
   * This is the getter method this will return the attribute value.
   * The id of the sub section.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return id
   */
  @VsoMethod
  public String getId() {
    return id;
  }

  /**
   * This is the setter method to the attribute.
   * The id of the sub section.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param id set the id.
   */
  @VsoMethod
  public void setId(String  id) {
    this.id = id;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ReportSubSection objReportSubSection = (ReportSubSection) o;
  return   Objects.equals(this.id, objReportSubSection.id);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ReportSubSection {\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

