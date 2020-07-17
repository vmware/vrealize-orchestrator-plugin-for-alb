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
 * The SeMigrateEventDetails is a POJO class extends AviRestResource that used for creating
 * SeMigrateEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeMigrateEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEMIGRATEEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeMigrateEventDetails extends AviRestResource {
  @JsonProperty("num_vs")
  @JsonInclude(Include.NON_NULL)
  private Integer numVs = null;

  @JsonProperty("reason")
  @JsonInclude(Include.NON_NULL)
  private List<String> reason = null;

  @JsonProperty("se_name")
  @JsonInclude(Include.NON_NULL)
  private String seName = null;

  @JsonProperty("se_uuid")
  @JsonInclude(Include.NON_NULL)
  private String seUuid = null;

  @JsonProperty("vs_name")
  @JsonInclude(Include.NON_NULL)
  private String vsName = null;

  @JsonProperty("vs_uuid")
  @JsonInclude(Include.NON_NULL)
  private String vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_vs of obj type semigrateeventdetails field type str  type integer.
   * @return numVs
   */
  @VsoMethod
  public Integer getNumVs() {
    return numVs;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_vs of obj type semigrateeventdetails field type str  type integer.
   * @param numVs set the numVs.
   */
  @VsoMethod
  public void setNumVs(Integer  numVs) {
    this.numVs = numVs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type semigrateeventdetails field type str  type array.
   * @return reason
   */
  @VsoMethod
  public List<String> getReason() {
    return reason;
  }

  /**
   * This is the setter method. this will set the reason
   * Placeholder for description of property reason of obj type semigrateeventdetails field type str  type array.
   * @return reason
   */
  @VsoMethod
  public void setReason(List<String>  reason) {
    this.reason = reason;
  }

  /**
   * This is the setter method this will set the reason
   * Placeholder for description of property reason of obj type semigrateeventdetails field type str  type array.
   * @return reason
   */
  @VsoMethod
  public SeMigrateEventDetails addReasonItem(String reasonItem) {
    if (this.reason == null) {
      this.reason = new ArrayList<String>();
    }
    this.reason.add(reasonItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_name of obj type semigrateeventdetails field type str  type string.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_name of obj type semigrateeventdetails field type str  type string.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

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
   * Placeholder for description of property vs_name of obj type semigrateeventdetails field type str  type string.
   * @return vsName
   */
  @VsoMethod
  public String getVsName() {
    return vsName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vs_name of obj type semigrateeventdetails field type str  type string.
   * @param vsName set the vsName.
   */
  @VsoMethod
  public void setVsName(String  vsName) {
    this.vsName = vsName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of vs.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of vs.
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
  SeMigrateEventDetails objSeMigrateEventDetails = (SeMigrateEventDetails) o;
  return   Objects.equals(this.numVs, objSeMigrateEventDetails.numVs)&&
  Objects.equals(this.vsName, objSeMigrateEventDetails.vsName)&&
  Objects.equals(this.vsUuid, objSeMigrateEventDetails.vsUuid)&&
  Objects.equals(this.reason, objSeMigrateEventDetails.reason)&&
  Objects.equals(this.seUuid, objSeMigrateEventDetails.seUuid)&&
  Objects.equals(this.seName, objSeMigrateEventDetails.seName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeMigrateEventDetails {\n");
      sb.append("    numVs: ").append(toIndentedString(numVs)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
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

