package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.VsGs;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VsGsStatus is a POJO class extends AviRestResource that used for creating
 * VsGsStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VsGsStatus")
@VsoFinder(name = Constants.FINDER_VRO_VSGSSTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VsGsStatus extends AviRestResource {
    @JsonProperty("details")
    @JsonInclude(Include.NON_NULL)
    private List<String> details;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("vsgs_obj")
    @JsonInclude(Include.NON_NULL)
    private VsGs vsgsObj;



  /**
   * This is the getter method this will return the attribute value.
   * Details of the event.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return details
   */
  @VsoMethod
  public List<String> getDetails() {
    return details;
  }

  /**
   * This is the setter method. this will set the details
   * Details of the event.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return details
   */
  @VsoMethod
  public void setDetails(List<String>  details) {
    this.details = details;
  }

  /**
   * This is the setter method this will set the details
   * Details of the event.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return details
   */
  @VsoMethod
  public VsGsStatus addDetailsItem(String detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<String>();
    }
    this.details.add(detailsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Config object name.
   * Field introduced in 31.1.1.
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
   * Config object name.
   * Field introduced in 31.1.1.
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
   * Config object uuid.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Config object uuid.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vsgs config object data.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsgsObj
   */
  @VsoMethod
  public VsGs getVsgsObj() {
    return vsgsObj;
  }

  /**
   * This is the setter method to the attribute.
   * Vsgs config object data.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsgsObj set the vsgsObj.
   */
  @VsoMethod
  public void setVsgsObj(VsGs vsgsObj) {
    this.vsgsObj = vsgsObj;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VsGsStatus objVsGsStatus = (VsGsStatus) o;
  return   Objects.equals(this.uuid, objVsGsStatus.uuid)&&
  Objects.equals(this.name, objVsGsStatus.name)&&
  Objects.equals(this.details, objVsGsStatus.details)&&
  Objects.equals(this.vsgsObj, objVsGsStatus.vsgsObj);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VsGsStatus {\n");
      sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vsgsObj: ").append(toIndentedString(vsgsObj)).append("\n");
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

