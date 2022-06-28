package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.VsMigrateParams;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The RebalanceMigrateEventDetails is a POJO class extends AviRestResource that used for creating
 * RebalanceMigrateEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RebalanceMigrateEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_REBALANCEMIGRATEEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RebalanceMigrateEventDetails extends AviRestResource {
    @JsonProperty("migrate_params")
    @JsonInclude(Include.NON_NULL)
    private VsMigrateParams migrateParams = null;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return migrateParams
   */
  @VsoMethod
  public VsMigrateParams getMigrateParams() {
    return migrateParams;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param migrateParams set the migrateParams.
   */
  @VsoMethod
  public void setMigrateParams(VsMigrateParams migrateParams) {
    this.migrateParams = migrateParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RebalanceMigrateEventDetails objRebalanceMigrateEventDetails = (RebalanceMigrateEventDetails) o;
  return   Objects.equals(this.vsUuid, objRebalanceMigrateEventDetails.vsUuid)&&
  Objects.equals(this.migrateParams, objRebalanceMigrateEventDetails.migrateParams);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RebalanceMigrateEventDetails {\n");
      sb.append("    migrateParams: ").append(toIndentedString(migrateParams)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

