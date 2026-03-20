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
 * The AZHost is a POJO class extends AviRestResource that used for creating
 * AZHost.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AZHost")
@VsoFinder(name = Constants.FINDER_VRO_AZHOST)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AZHost extends AviRestResource {
    @JsonProperty("host_ids")
    @JsonInclude(Include.NON_NULL)
    private List<String> hostIds;

    @JsonProperty("vcenter_ref")
    @JsonInclude(Include.NON_NULL)
    private String vcenterRef;



  /**
   * This is the getter method this will return the attribute value.
   * A list of managed object ids (moids) of vcenter hosts that are part of this availability zone.
   * Field introduced in 31.2.1.
   * Minimum of 1 items required.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostIds
   */
  @VsoMethod
  public List<String> getHostIds() {
    return hostIds;
  }

  /**
   * This is the setter method. this will set the hostIds
   * A list of managed object ids (moids) of vcenter hosts that are part of this availability zone.
   * Field introduced in 31.2.1.
   * Minimum of 1 items required.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostIds
   */
  @VsoMethod
  public void setHostIds(List<String>  hostIds) {
    this.hostIds = hostIds;
  }

  /**
   * This is the setter method this will set the hostIds
   * A list of managed object ids (moids) of vcenter hosts that are part of this availability zone.
   * Field introduced in 31.2.1.
   * Minimum of 1 items required.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostIds
   */
  @VsoMethod
  public AZHost addHostIdsItem(String hostIdsItem) {
    if (this.hostIds == null) {
      this.hostIds = new ArrayList<String>();
    }
    this.hostIds.add(hostIdsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The uuid of the vcenter server that manages the hosts associated with this availabilityzone.
   * It is a reference to an object of type vcenterserver.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterRef
   */
  @VsoMethod
  public String getVcenterRef() {
    return vcenterRef;
  }

  /**
   * This is the setter method to the attribute.
   * The uuid of the vcenter server that manages the hosts associated with this availabilityzone.
   * It is a reference to an object of type vcenterserver.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterRef set the vcenterRef.
   */
  @VsoMethod
  public void setVcenterRef(String  vcenterRef) {
    this.vcenterRef = vcenterRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AZHost objAZHost = (AZHost) o;
  return   Objects.equals(this.vcenterRef, objAZHost.vcenterRef)&&
  Objects.equals(this.hostIds, objAZHost.hostIds);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AZHost {\n");
      sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
        sb.append("    vcenterRef: ").append(toIndentedString(vcenterRef)).append("\n");
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

