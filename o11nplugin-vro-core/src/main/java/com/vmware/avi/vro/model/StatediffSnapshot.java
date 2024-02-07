package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.postsnapshot;
import com.vmware.avi.vro.model.presnapshot;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The StatediffSnapshot is a POJO class extends AviRestResource that used for creating
 * StatediffSnapshot.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "StatediffSnapshot")
@VsoFinder(name = Constants.FINDER_VRO_STATEDIFFSNAPSHOT, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class StatediffSnapshot extends AviRestResource {
    @JsonProperty("gslb_name")
    @JsonInclude(Include.NON_NULL)
    private String gslbName;

    @JsonProperty("gslb_uuid")
    @JsonInclude(Include.NON_NULL)
    private String gslbUuid;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("pool_name")
    @JsonInclude(Include.NON_NULL)
    private String poolName;

    @JsonProperty("pool_uuid")
    @JsonInclude(Include.NON_NULL)
    private String poolUuid;

    @JsonProperty("post_snapshot")
    @JsonInclude(Include.NON_NULL)
    private postsnapshot postSnapshot;

    @JsonProperty("pre_snapshot")
    @JsonInclude(Include.NON_NULL)
    private presnapshot preSnapshot;

    @JsonProperty("se_group_name")
    @JsonInclude(Include.NON_NULL)
    private String seGroupName;

    @JsonProperty("se_group_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seGroupUuid;

    @JsonProperty("se_name")
    @JsonInclude(Include.NON_NULL)
    private String seName;

    @JsonProperty("se_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seUuid;

    @JsonProperty("snapshot_type")
    @JsonInclude(Include.NON_NULL)
    private String snapshotType;

    @JsonProperty("statediff_operation_ref")
    @JsonInclude(Include.NON_NULL)
    private String statediffOperationRef;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("vs_name")
    @JsonInclude(Include.NON_NULL)
    private String vsName;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsUuid;



  /**
   * This is the getter method this will return the attribute value.
   * Name of gslb object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gslbName
   */
  @VsoMethod
  public String getGslbName() {
    return gslbName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of gslb object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gslbName set the gslbName.
   */
  @VsoMethod
  public void setGslbName(String  gslbName) {
    this.gslbName = gslbName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reference to base gslb object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gslbUuid
   */
  @VsoMethod
  public String getGslbUuid() {
    return gslbUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Reference to base gslb object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gslbUuid set the gslbUuid.
   */
  @VsoMethod
  public void setGslbUuid(String  gslbUuid) {
    this.gslbUuid = gslbUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of statediff operation.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of statediff operation.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of pool object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolName
   */
  @VsoMethod
  public String getPoolName() {
    return poolName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of pool object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolName set the poolName.
   */
  @VsoMethod
  public void setPoolName(String  poolName) {
    this.poolName = poolName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reference to base pool object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolUuid
   */
  @VsoMethod
  public String getPoolUuid() {
    return poolUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Reference to base pool object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolUuid set the poolUuid.
   */
  @VsoMethod
  public void setPoolUuid(String  poolUuid) {
    this.poolUuid = poolUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Post-upgrade snapshot for vs.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return postSnapshot
   */
  @VsoMethod
  public postsnapshot getPostSnapshot() {
    return postSnapshot;
  }

  /**
   * This is the setter method to the attribute.
   * Post-upgrade snapshot for vs.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param postSnapshot set the postSnapshot.
   */
  @VsoMethod
  public void setPostSnapshot(postsnapshot postSnapshot) {
    this.postSnapshot = postSnapshot;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pre-upgrade snapshot for vs.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return preSnapshot
   */
  @VsoMethod
  public presnapshot getPreSnapshot() {
    return preSnapshot;
  }

  /**
   * This is the setter method to the attribute.
   * Pre-upgrade snapshot for vs.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param preSnapshot set the preSnapshot.
   */
  @VsoMethod
  public void setPreSnapshot(presnapshot preSnapshot) {
    this.preSnapshot = preSnapshot;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of seg object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupName
   */
  @VsoMethod
  public String getSeGroupName() {
    return seGroupName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of seg object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupName set the seGroupName.
   */
  @VsoMethod
  public void setSeGroupName(String  seGroupName) {
    this.seGroupName = seGroupName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reference to base seg object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupUuid
   */
  @VsoMethod
  public String getSeGroupUuid() {
    return seGroupUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Reference to base seg object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupUuid set the seGroupUuid.
   */
  @VsoMethod
  public void setSeGroupUuid(String  seGroupUuid) {
    this.seGroupUuid = seGroupUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of seg object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of seg object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reference to base se object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Reference to base se object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of snapshot eg.
   * Vs_snapshot, se_snapshot etc.
   * Enum options - FB_VS_SNAPSHOT, FB_SE_SNAPSHOT, FB_GSLB_SNAPSHOT, FB_POOL_SNAPSHOT.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return snapshotType
   */
  @VsoMethod
  public String getSnapshotType() {
    return snapshotType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of snapshot eg.
   * Vs_snapshot, se_snapshot etc.
   * Enum options - FB_VS_SNAPSHOT, FB_SE_SNAPSHOT, FB_GSLB_SNAPSHOT, FB_POOL_SNAPSHOT.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param snapshotType set the snapshotType.
   */
  @VsoMethod
  public void setSnapshotType(String  snapshotType) {
    this.snapshotType = snapshotType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Statediff operation uuid for identifying the operation.
   * It is a reference to an object of type statediffoperation.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return statediffOperationRef
   */
  @VsoMethod
  public String getStatediffOperationRef() {
    return statediffOperationRef;
  }

  /**
   * This is the setter method to the attribute.
   * Statediff operation uuid for identifying the operation.
   * It is a reference to an object of type statediffoperation.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param statediffOperationRef set the statediffOperationRef.
   */
  @VsoMethod
  public void setStatediffOperationRef(String  statediffOperationRef) {
    this.statediffOperationRef = statediffOperationRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique identifier for statediff entry.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique identifier for statediff entry.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of vs object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsName
   */
  @VsoMethod
  public String getVsName() {
    return vsName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of vs object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsName set the vsName.
   */
  @VsoMethod
  public void setVsName(String  vsName) {
    this.vsName = vsName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reference to base vs object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Reference to base vs object.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  StatediffSnapshot objStatediffSnapshot = (StatediffSnapshot) o;
  return   Objects.equals(this.uuid, objStatediffSnapshot.uuid)&&
  Objects.equals(this.name, objStatediffSnapshot.name)&&
  Objects.equals(this.statediffOperationRef, objStatediffSnapshot.statediffOperationRef)&&
  Objects.equals(this.preSnapshot, objStatediffSnapshot.preSnapshot)&&
  Objects.equals(this.postSnapshot, objStatediffSnapshot.postSnapshot)&&
  Objects.equals(this.vsUuid, objStatediffSnapshot.vsUuid)&&
  Objects.equals(this.seUuid, objStatediffSnapshot.seUuid)&&
  Objects.equals(this.gslbUuid, objStatediffSnapshot.gslbUuid)&&
  Objects.equals(this.poolUuid, objStatediffSnapshot.poolUuid)&&
  Objects.equals(this.seGroupUuid, objStatediffSnapshot.seGroupUuid)&&
  Objects.equals(this.vsName, objStatediffSnapshot.vsName)&&
  Objects.equals(this.seName, objStatediffSnapshot.seName)&&
  Objects.equals(this.poolName, objStatediffSnapshot.poolName)&&
  Objects.equals(this.gslbName, objStatediffSnapshot.gslbName)&&
  Objects.equals(this.seGroupName, objStatediffSnapshot.seGroupName)&&
  Objects.equals(this.snapshotType, objStatediffSnapshot.snapshotType)&&
  Objects.equals(this.tenantRef, objStatediffSnapshot.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class StatediffSnapshot {\n");
      sb.append("    gslbName: ").append(toIndentedString(gslbName)).append("\n");
        sb.append("    gslbUuid: ").append(toIndentedString(gslbUuid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    poolUuid: ").append(toIndentedString(poolUuid)).append("\n");
        sb.append("    postSnapshot: ").append(toIndentedString(postSnapshot)).append("\n");
        sb.append("    preSnapshot: ").append(toIndentedString(preSnapshot)).append("\n");
        sb.append("    seGroupName: ").append(toIndentedString(seGroupName)).append("\n");
        sb.append("    seGroupUuid: ").append(toIndentedString(seGroupUuid)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
        sb.append("    snapshotType: ").append(toIndentedString(snapshotType)).append("\n");
        sb.append("    statediffOperationRef: ").append(toIndentedString(statediffOperationRef)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
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

