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
 * The UsageMeteringCloud is a POJO class extends AviRestResource that used for creating
 * UsageMeteringCloud.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UsageMeteringCloud")
@VsoFinder(name = Constants.FINDER_VRO_USAGEMETERINGCLOUD)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UsageMeteringCloud extends AviRestResource {
    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the cloud.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the cloud.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status of the task for the cloud.
   * Enum options - USAGE_METERING_CLOUD_STATUS_SUCCESS, USAGE_METERING_CLOUD_STATUS_FAILURE, USAGE_METERING_CLOUD_STATUS_SKIPPED.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Status of the task for the cloud.
   * Enum options - USAGE_METERING_CLOUD_STATUS_SUCCESS, USAGE_METERING_CLOUD_STATUS_FAILURE, USAGE_METERING_CLOUD_STATUS_SKIPPED.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  UsageMeteringCloud objUsageMeteringCloud = (UsageMeteringCloud) o;
  return   Objects.equals(this.name, objUsageMeteringCloud.name)&&
  Objects.equals(this.status, objUsageMeteringCloud.status);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UsageMeteringCloud {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

