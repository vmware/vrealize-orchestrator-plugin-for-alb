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
 * The VcenterCloudStatusReq is a POJO class extends AviRestResource that used for creating
 * VcenterCloudStatusReq.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VcenterCloudStatusReq")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERCLOUDSTATUSREQ)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VcenterCloudStatusReq extends AviRestResource {
  @JsonProperty("cloud_uuid")
  @JsonInclude(Include.NON_NULL)
  private String cloudUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of cloud.
   * @return cloudUuid
   */
  @VsoMethod
  public String getCloudUuid() {
    return cloudUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of cloud.
   * @param cloudUuid set the cloudUuid.
   */
  @VsoMethod
  public void setCloudUuid(String  cloudUuid) {
    this.cloudUuid = cloudUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VcenterCloudStatusReq objVcenterCloudStatusReq = (VcenterCloudStatusReq) o;
  return   Objects.equals(this.cloudUuid, objVcenterCloudStatusReq.cloudUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VcenterCloudStatusReq {\n");
      sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
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

