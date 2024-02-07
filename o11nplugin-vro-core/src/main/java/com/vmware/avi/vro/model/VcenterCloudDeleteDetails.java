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
 * The VcenterCloudDeleteDetails is a POJO class extends AviRestResource that used for creating
 * VcenterCloudDeleteDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VcenterCloudDeleteDetails")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERCLOUDDELETEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VcenterCloudDeleteDetails extends AviRestResource {
    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId;

    @JsonProperty("objects")
    @JsonInclude(Include.NON_NULL)
    private String objects;



  /**
   * This is the getter method this will return the attribute value.
   * Cloud id.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud id.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Objects having reference to the cloud.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objects
   */
  @VsoMethod
  public String getObjects() {
    return objects;
  }

  /**
   * This is the setter method to the attribute.
   * Objects having reference to the cloud.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objects set the objects.
   */
  @VsoMethod
  public void setObjects(String  objects) {
    this.objects = objects;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VcenterCloudDeleteDetails objVcenterCloudDeleteDetails = (VcenterCloudDeleteDetails) o;
  return   Objects.equals(this.ccId, objVcenterCloudDeleteDetails.ccId)&&
  Objects.equals(this.objects, objVcenterCloudDeleteDetails.objects);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VcenterCloudDeleteDetails {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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

