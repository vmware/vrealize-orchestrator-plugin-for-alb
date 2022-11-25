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
 * The VcenterQuarantinedHostParams is a POJO class extends AviRestResource that used for creating
 * VcenterQuarantinedHostParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VcenterQuarantinedHostParams")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERQUARANTINEDHOSTPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VcenterQuarantinedHostParams extends AviRestResource {
    @JsonProperty("cloud_uuid")
    @JsonInclude(Include.NON_NULL)
    private String cloudUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Vcenter cloud id.
   * Field introduced in 21.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudUuid
   */
  @VsoMethod
  public String getCloudUuid() {
    return cloudUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Vcenter cloud id.
   * Field introduced in 21.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  VcenterQuarantinedHostParams objVcenterQuarantinedHostParams = (VcenterQuarantinedHostParams) o;
  return   Objects.equals(this.cloudUuid, objVcenterQuarantinedHostParams.cloudUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VcenterQuarantinedHostParams {\n");
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

