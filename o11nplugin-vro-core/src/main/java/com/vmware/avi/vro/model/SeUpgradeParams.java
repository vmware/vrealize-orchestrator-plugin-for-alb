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
 * The SeUpgradeParams is a POJO class extends AviRestResource that used for creating
 * SeUpgradeParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeUpgradeParams")
@VsoFinder(name = Constants.FINDER_VRO_SEUPGRADEPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeUpgradeParams extends AviRestResource {
    @JsonProperty("disruptive")
    @JsonInclude(Include.NON_NULL)
    private Boolean disruptive = false;

    @JsonProperty("force")
    @JsonInclude(Include.NON_NULL)
    private Boolean force;

    @JsonProperty("patch")
    @JsonInclude(Include.NON_NULL)
    private Boolean patch = false;

    @JsonProperty("patch_rollback")
    @JsonInclude(Include.NON_NULL)
    private Boolean patchRollback = false;

    @JsonProperty("rollback")
    @JsonInclude(Include.NON_NULL)
    private Boolean rollback = false;

    @JsonProperty("se_group_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> seGroupRefs = null;

    @JsonProperty("suspend_on_failure")
    @JsonInclude(Include.NON_NULL)
    private Boolean suspendOnFailure = false;

    @JsonProperty("test")
    @JsonInclude(Include.NON_NULL)
    private Boolean test;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * This field is used to disable scale-in/scale out operations during upgrade operations.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return disruptive
   */
  @VsoMethod
  public Boolean getDisruptive() {
    return disruptive;
  }

  /**
   * This is the setter method to the attribute.
   * This field is used to disable scale-in/scale out operations during upgrade operations.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param disruptive set the disruptive.
   */
  @VsoMethod
  public void setDisruptive(Boolean  disruptive) {
    this.disruptive = disruptive;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return force
   */
  @VsoMethod
  public Boolean getForce() {
    return force;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param force set the force.
   */
  @VsoMethod
  public void setForce(Boolean  force) {
    this.force = force;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Upgrade system with patch upgrade.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return patch
   */
  @VsoMethod
  public Boolean getPatch() {
    return patch;
  }

  /**
   * This is the setter method to the attribute.
   * Upgrade system with patch upgrade.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param patch set the patch.
   */
  @VsoMethod
  public void setPatch(Boolean  patch) {
    this.patch = patch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rollback system with patch upgrade.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return patchRollback
   */
  @VsoMethod
  public Boolean getPatchRollback() {
    return patchRollback;
  }

  /**
   * This is the setter method to the attribute.
   * Rollback system with patch upgrade.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param patchRollback set the patchRollback.
   */
  @VsoMethod
  public void setPatchRollback(Boolean  patchRollback) {
    this.patchRollback = patchRollback;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is used in rollback operations.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return rollback
   */
  @VsoMethod
  public Boolean getRollback() {
    return rollback;
  }

  /**
   * This is the setter method to the attribute.
   * It is used in rollback operations.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param rollback set the rollback.
   */
  @VsoMethod
  public void setRollback(Boolean  rollback) {
    this.rollback = rollback;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceenginegroup.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupRefs
   */
  @VsoMethod
  public List<String> getSeGroupRefs() {
    return seGroupRefs;
  }

  /**
   * This is the setter method. this will set the seGroupRefs
   * It is a reference to an object of type serviceenginegroup.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupRefs
   */
  @VsoMethod
  public void setSeGroupRefs(List<String>  seGroupRefs) {
    this.seGroupRefs = seGroupRefs;
  }

  /**
   * This is the setter method this will set the seGroupRefs
   * It is a reference to an object of type serviceenginegroup.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupRefs
   */
  @VsoMethod
  public SeUpgradeParams addSeGroupRefsItem(String seGroupRefsItem) {
    if (this.seGroupRefs == null) {
      this.seGroupRefs = new ArrayList<String>();
    }
    this.seGroupRefs.add(seGroupRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * When set to true, if there is any failure during the se upgrade, upgrade will be suspended for this se group and manual intervention would be
   * needed to resume the upgrade.
   * Field introduced in 17.1.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return suspendOnFailure
   */
  @VsoMethod
  public Boolean getSuspendOnFailure() {
    return suspendOnFailure;
  }

  /**
   * This is the setter method to the attribute.
   * When set to true, if there is any failure during the se upgrade, upgrade will be suspended for this se group and manual intervention would be
   * needed to resume the upgrade.
   * Field introduced in 17.1.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param suspendOnFailure set the suspendOnFailure.
   */
  @VsoMethod
  public void setSuspendOnFailure(Boolean  suspendOnFailure) {
    this.suspendOnFailure = suspendOnFailure;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @return test
   */
  @VsoMethod
  public Boolean getTest() {
    return test;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * @param test set the test.
   */
  @VsoMethod
  public void setTest(Boolean  test) {
    this.test = test;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeUpgradeParams objSeUpgradeParams = (SeUpgradeParams) o;
  return   Objects.equals(this.uuid, objSeUpgradeParams.uuid)&&
  Objects.equals(this.force, objSeUpgradeParams.force)&&
  Objects.equals(this.disruptive, objSeUpgradeParams.disruptive)&&
  Objects.equals(this.test, objSeUpgradeParams.test)&&
  Objects.equals(this.rollback, objSeUpgradeParams.rollback)&&
  Objects.equals(this.suspendOnFailure, objSeUpgradeParams.suspendOnFailure)&&
  Objects.equals(this.patch, objSeUpgradeParams.patch)&&
  Objects.equals(this.seGroupRefs, objSeUpgradeParams.seGroupRefs)&&
  Objects.equals(this.patchRollback, objSeUpgradeParams.patchRollback);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeUpgradeParams {\n");
      sb.append("    disruptive: ").append(toIndentedString(disruptive)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
        sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
        sb.append("    patchRollback: ").append(toIndentedString(patchRollback)).append("\n");
        sb.append("    rollback: ").append(toIndentedString(rollback)).append("\n");
        sb.append("    seGroupRefs: ").append(toIndentedString(seGroupRefs)).append("\n");
        sb.append("    suspendOnFailure: ").append(toIndentedString(suspendOnFailure)).append("\n");
        sb.append("    test: ").append(toIndentedString(test)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

