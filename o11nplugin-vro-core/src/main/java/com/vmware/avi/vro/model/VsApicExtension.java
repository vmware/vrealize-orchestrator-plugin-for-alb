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
 * The VsApicExtension is a POJO class extends AviRestResource that used for creating
 * VsApicExtension.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VsApicExtension")
@VsoFinder(name = Constants.FINDER_VRO_VSAPICEXTENSION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VsApicExtension extends AviRestResource {
  @JsonProperty("se_uuid")
  @JsonInclude(Include.NON_NULL)
  private String seUuid = null;

  @JsonProperty("txn_uuid")
  @JsonInclude(Include.NON_NULL)
  private String txnUuid = null;

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;

  @JsonProperty("vnic")
  @JsonInclude(Include.NON_NULL)
  private List<VsSeVnic> vnic = null;



  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of txn.
   * @return txnUuid
   */
  @VsoMethod
  public String getTxnUuid() {
    return txnUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of txn.
   * @param txnUuid set the txnUuid.
   */
  @VsoMethod
  public void setTxnUuid(String  txnUuid) {
    this.txnUuid = txnUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vnic of obj type vsapicextension field type str  type array.
   * @return vnic
   */
  @VsoMethod
  public List<VsSeVnic> getVnic() {
    return vnic;
  }

  /**
   * This is the setter method. this will set the vnic
   * Placeholder for description of property vnic of obj type vsapicextension field type str  type array.
   * @return vnic
   */
  @VsoMethod
  public void setVnic(List<VsSeVnic>  vnic) {
    this.vnic = vnic;
  }

  /**
   * This is the setter method this will set the vnic
   * Placeholder for description of property vnic of obj type vsapicextension field type str  type array.
   * @return vnic
   */
  @VsoMethod
  public VsApicExtension addVnicItem(VsSeVnic vnicItem) {
    if (this.vnic == null) {
      this.vnic = new ArrayList<VsSeVnic>();
    }
    this.vnic.add(vnicItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VsApicExtension objVsApicExtension = (VsApicExtension) o;
  return   Objects.equals(this.uuid, objVsApicExtension.uuid)&&
  Objects.equals(this.txnUuid, objVsApicExtension.txnUuid)&&
  Objects.equals(this.seUuid, objVsApicExtension.seUuid)&&
  Objects.equals(this.vnic, objVsApicExtension.vnic);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VsApicExtension {\n");
      sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
        sb.append("    txnUuid: ").append(toIndentedString(txnUuid)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vnic: ").append(toIndentedString(vnic)).append("\n");
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

