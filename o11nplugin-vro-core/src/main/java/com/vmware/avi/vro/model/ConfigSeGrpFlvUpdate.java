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
 * The ConfigSeGrpFlvUpdate is a POJO class extends AviRestResource that used for creating
 * ConfigSeGrpFlvUpdate.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConfigSeGrpFlvUpdate")
@VsoFinder(name = Constants.FINDER_VRO_CONFIGSEGRPFLVUPDATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConfigSeGrpFlvUpdate extends AviRestResource {
  @JsonProperty("new_flv")
  @JsonInclude(Include.NON_NULL)
  private String newFlv = null;

  @JsonProperty("old_flv")
  @JsonInclude(Include.NON_NULL)
  private String oldFlv = null;

  @JsonProperty("se_group_name")
  @JsonInclude(Include.NON_NULL)
  private String seGroupName = null;

  @JsonProperty("se_group_uuid")
  @JsonInclude(Include.NON_NULL)
  private String seGroupUuid = null;

  @JsonProperty("tenant_name")
  @JsonInclude(Include.NON_NULL)
  private String tenantName = null;

  @JsonProperty("tenant_uuid")
  @JsonInclude(Include.NON_NULL)
  private String tenantUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * New flavor name.
   * @return newFlv
   */
  @VsoMethod
  public String getNewFlv() {
    return newFlv;
  }

  /**
   * This is the setter method to the attribute.
   * New flavor name.
   * @param newFlv set the newFlv.
   */
  @VsoMethod
  public void setNewFlv(String  newFlv) {
    this.newFlv = newFlv;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Old flavor name.
   * @return oldFlv
   */
  @VsoMethod
  public String getOldFlv() {
    return oldFlv;
  }

  /**
   * This is the setter method to the attribute.
   * Old flavor name.
   * @param oldFlv set the oldFlv.
   */
  @VsoMethod
  public void setOldFlv(String  oldFlv) {
    this.oldFlv = oldFlv;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Se group name.
   * @return seGroupName
   */
  @VsoMethod
  public String getSeGroupName() {
    return seGroupName;
  }

  /**
   * This is the setter method to the attribute.
   * Se group name.
   * @param seGroupName set the seGroupName.
   */
  @VsoMethod
  public void setSeGroupName(String  seGroupName) {
    this.seGroupName = seGroupName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Se group uuid.
   * @return seGroupUuid
   */
  @VsoMethod
  public String getSeGroupUuid() {
    return seGroupUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Se group uuid.
   * @param seGroupUuid set the seGroupUuid.
   */
  @VsoMethod
  public void setSeGroupUuid(String  seGroupUuid) {
    this.seGroupUuid = seGroupUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant name.
   * @return tenantName
   */
  @VsoMethod
  public String getTenantName() {
    return tenantName;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant name.
   * @param tenantName set the tenantName.
   */
  @VsoMethod
  public void setTenantName(String  tenantName) {
    this.tenantName = tenantName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant uuid.
   * @return tenantUuid
   */
  @VsoMethod
  public String getTenantUuid() {
    return tenantUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant uuid.
   * @param tenantUuid set the tenantUuid.
   */
  @VsoMethod
  public void setTenantUuid(String  tenantUuid) {
    this.tenantUuid = tenantUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConfigSeGrpFlvUpdate objConfigSeGrpFlvUpdate = (ConfigSeGrpFlvUpdate) o;
  return   Objects.equals(this.newFlv, objConfigSeGrpFlvUpdate.newFlv)&&
  Objects.equals(this.tenantName, objConfigSeGrpFlvUpdate.tenantName)&&
  Objects.equals(this.oldFlv, objConfigSeGrpFlvUpdate.oldFlv)&&
  Objects.equals(this.seGroupName, objConfigSeGrpFlvUpdate.seGroupName)&&
  Objects.equals(this.seGroupUuid, objConfigSeGrpFlvUpdate.seGroupUuid)&&
  Objects.equals(this.tenantUuid, objConfigSeGrpFlvUpdate.tenantUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConfigSeGrpFlvUpdate {\n");
      sb.append("    newFlv: ").append(toIndentedString(newFlv)).append("\n");
        sb.append("    oldFlv: ").append(toIndentedString(oldFlv)).append("\n");
        sb.append("    seGroupName: ").append(toIndentedString(seGroupName)).append("\n");
        sb.append("    seGroupUuid: ").append(toIndentedString(seGroupUuid)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
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
