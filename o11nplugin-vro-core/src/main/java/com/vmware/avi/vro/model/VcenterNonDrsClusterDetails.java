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
 * The VcenterNonDrsClusterDetails is a POJO class extends AviRestResource that used for creating
 * VcenterNonDrsClusterDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VcenterNonDrsClusterDetails")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERNONDRSCLUSTERDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VcenterNonDrsClusterDetails extends AviRestResource {
    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId;

    @JsonProperty("non_drs_cluster_ids")
    @JsonInclude(Include.NON_NULL)
    private List<String> nonDrsClusterIds;

    @JsonProperty("se_vm_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seVmUuid;



  /**
   * This is the getter method this will return the attribute value.
   * Cloud id.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A list of cluster ids having drs disabled.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nonDrsClusterIds
   */
  @VsoMethod
  public List<String> getNonDrsClusterIds() {
    return nonDrsClusterIds;
  }

  /**
   * This is the setter method. this will set the nonDrsClusterIds
   * A list of cluster ids having drs disabled.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nonDrsClusterIds
   */
  @VsoMethod
  public void setNonDrsClusterIds(List<String>  nonDrsClusterIds) {
    this.nonDrsClusterIds = nonDrsClusterIds;
  }

  /**
   * This is the setter method this will set the nonDrsClusterIds
   * A list of cluster ids having drs disabled.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nonDrsClusterIds
   */
  @VsoMethod
  public VcenterNonDrsClusterDetails addNonDrsClusterIdsItem(String nonDrsClusterIdsItem) {
    if (this.nonDrsClusterIds == null) {
      this.nonDrsClusterIds = new ArrayList<String>();
    }
    this.nonDrsClusterIds.add(nonDrsClusterIdsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The uuid of the service engine whose placement triggered this event.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seVmUuid
   */
  @VsoMethod
  public String getSeVmUuid() {
    return seVmUuid;
  }

  /**
   * This is the setter method to the attribute.
   * The uuid of the service engine whose placement triggered this event.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seVmUuid set the seVmUuid.
   */
  @VsoMethod
  public void setSeVmUuid(String  seVmUuid) {
    this.seVmUuid = seVmUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VcenterNonDrsClusterDetails objVcenterNonDrsClusterDetails = (VcenterNonDrsClusterDetails) o;
  return   Objects.equals(this.ccId, objVcenterNonDrsClusterDetails.ccId)&&
  Objects.equals(this.seVmUuid, objVcenterNonDrsClusterDetails.seVmUuid)&&
  Objects.equals(this.nonDrsClusterIds, objVcenterNonDrsClusterDetails.nonDrsClusterIds);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VcenterNonDrsClusterDetails {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    nonDrsClusterIds: ").append(toIndentedString(nonDrsClusterIds)).append("\n");
        sb.append("    seVmUuid: ").append(toIndentedString(seVmUuid)).append("\n");
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

