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
 * The ContainerCloudService is a POJO class extends AviRestResource that used for creating
 * ContainerCloudService.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ContainerCloudService")
@VsoFinder(name = Constants.FINDER_VRO_CONTAINERCLOUDSERVICE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ContainerCloudService extends AviRestResource {
    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId = null;

    @JsonProperty("object")
    @JsonInclude(Include.NON_NULL)
    private String object = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("service")
    @JsonInclude(Include.NON_NULL)
    private String service = null;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cc_id of obj type containercloudservice field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cc_id of obj type containercloudservice field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property object of obj type containercloudservice field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return object
   */
  @VsoMethod
  public String getObject() {
    return object;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property object of obj type containercloudservice field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param object set the object.
   */
  @VsoMethod
  public void setObject(String  object) {
    this.object = object;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type containercloudservice field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property reason of obj type containercloudservice field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property service of obj type containercloudservice field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return service
   */
  @VsoMethod
  public String getService() {
    return service;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property service of obj type containercloudservice field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param service set the service.
   */
  @VsoMethod
  public void setService(String  service) {
    this.service = service;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property status of obj type containercloudservice field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property status of obj type containercloudservice field type str  type string.
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
  ContainerCloudService objContainerCloudService = (ContainerCloudService) o;
  return   Objects.equals(this.ccId, objContainerCloudService.ccId)&&
  Objects.equals(this.service, objContainerCloudService.service)&&
  Objects.equals(this.object, objContainerCloudService.object)&&
  Objects.equals(this.status, objContainerCloudService.status)&&
  Objects.equals(this.reason, objContainerCloudService.reason);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ContainerCloudService {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

