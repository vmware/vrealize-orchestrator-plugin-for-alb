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
 * The GslbGeoDbEntry is a POJO class extends AviRestResource that used for creating
 * GslbGeoDbEntry.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbGeoDbEntry")
@VsoFinder(name = Constants.FINDER_VRO_GSLBGEODBENTRY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbGeoDbEntry extends AviRestResource {
    @JsonProperty("file_obj_ref")
    @JsonInclude(Include.NON_NULL)
    private String fileObjRef;

    @JsonProperty("priority")
    @JsonInclude(Include.NON_NULL)
    private Integer priority = 10;



  /**
   * This is the getter method this will return the attribute value.
   * This is referred to fileobject that is associtated with the giveb geodb profile.
   * It is a reference to an object of type fileobject.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fileObjRef
   */
  @VsoMethod
  public String getFileObjRef() {
    return fileObjRef;
  }

  /**
   * This is the setter method to the attribute.
   * This is referred to fileobject that is associtated with the giveb geodb profile.
   * It is a reference to an object of type fileobject.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fileObjRef set the fileObjRef.
   */
  @VsoMethod
  public void setFileObjRef(String  fileObjRef) {
    this.fileObjRef = fileObjRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Priority of this geodb entry.
   * This value should be unique in a repeated list of geodb entries.
   * Higher the value, then greater is the priority.
   * Allowed values are 1-100.
   * Field introduced in 17.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return priority
   */
  @VsoMethod
  public Integer getPriority() {
    return priority;
  }

  /**
   * This is the setter method to the attribute.
   * Priority of this geodb entry.
   * This value should be unique in a repeated list of geodb entries.
   * Higher the value, then greater is the priority.
   * Allowed values are 1-100.
   * Field introduced in 17.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param priority set the priority.
   */
  @VsoMethod
  public void setPriority(Integer  priority) {
    this.priority = priority;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbGeoDbEntry objGslbGeoDbEntry = (GslbGeoDbEntry) o;
  return   Objects.equals(this.priority, objGslbGeoDbEntry.priority)&&
  Objects.equals(this.fileObjRef, objGslbGeoDbEntry.fileObjRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbGeoDbEntry {\n");
      sb.append("    fileObjRef: ").append(toIndentedString(fileObjRef)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

