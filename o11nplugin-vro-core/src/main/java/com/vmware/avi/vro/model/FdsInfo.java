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
 * The FdsInfo is a POJO class extends AviRestResource that used for creating
 * FdsInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FdsInfo")
@VsoFinder(name = Constants.FINDER_VRO_FDSINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FdsInfo extends AviRestResource {
    @JsonProperty("objects")
    @JsonInclude(Include.NON_NULL)
    private List<String> objects;

    @JsonProperty("timeline")
    @JsonInclude(Include.NON_NULL)
    private String timeline;



  /**
   * This is the getter method this will return the attribute value.
   * Captures the federated objects the site supports as per the controller version.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objects
   */
  @VsoMethod
  public List<String> getObjects() {
    return objects;
  }

  /**
   * This is the setter method. this will set the objects
   * Captures the federated objects the site supports as per the controller version.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objects
   */
  @VsoMethod
  public void setObjects(List<String>  objects) {
    this.objects = objects;
  }

  /**
   * This is the setter method this will set the objects
   * Captures the federated objects the site supports as per the controller version.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objects
   */
  @VsoMethod
  public FdsInfo addObjectsItem(String objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<String>();
    }
    this.objects.add(objectsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Capture fds timeline the client is using.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timeline
   */
  @VsoMethod
  public String getTimeline() {
    return timeline;
  }

  /**
   * This is the setter method to the attribute.
   * Capture fds timeline the client is using.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timeline set the timeline.
   */
  @VsoMethod
  public void setTimeline(String  timeline) {
    this.timeline = timeline;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  FdsInfo objFdsInfo = (FdsInfo) o;
  return   Objects.equals(this.timeline, objFdsInfo.timeline)&&
  Objects.equals(this.objects, objFdsInfo.objects);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class FdsInfo {\n");
      sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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

