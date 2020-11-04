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
 * The SeUpgradeEventDetails is a POJO class extends AviRestResource that used for creating
 * SeUpgradeEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeUpgradeEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEUPGRADEEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeUpgradeEventDetails extends AviRestResource {
    @JsonProperty("notes")
    @JsonInclude(Include.NON_NULL)
    private List<String> notes = null;

    @JsonProperty("num_vs")
    @JsonInclude(Include.NON_NULL)
    private Integer numVs = null;

    @JsonProperty("se_grp_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seGrpUuid = null;

    @JsonProperty("se_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property notes of obj type seupgradeeventdetails field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return notes
   */
  @VsoMethod
  public List<String> getNotes() {
    return notes;
  }

  /**
   * This is the setter method. this will set the notes
   * Placeholder for description of property notes of obj type seupgradeeventdetails field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return notes
   */
  @VsoMethod
  public void setNotes(List<String>  notes) {
    this.notes = notes;
  }

  /**
   * This is the setter method this will set the notes
   * Placeholder for description of property notes of obj type seupgradeeventdetails field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return notes
   */
  @VsoMethod
  public SeUpgradeEventDetails addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property num_vs of obj type seupgradeeventdetails field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numVs
   */
  @VsoMethod
  public Integer getNumVs() {
    return numVs;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property num_vs of obj type seupgradeeventdetails field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numVs set the numVs.
   */
  @VsoMethod
  public void setNumVs(Integer  numVs) {
    this.numVs = numVs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se_grp.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGrpUuid
   */
  @VsoMethod
  public String getSeGrpUuid() {
    return seGrpUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se_grp.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGrpUuid set the seGrpUuid.
   */
  @VsoMethod
  public void setSeGrpUuid(String  seGrpUuid) {
    this.seGrpUuid = seGrpUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeUpgradeEventDetails objSeUpgradeEventDetails = (SeUpgradeEventDetails) o;
  return   Objects.equals(this.seUuid, objSeUpgradeEventDetails.seUuid)&&
  Objects.equals(this.seGrpUuid, objSeUpgradeEventDetails.seGrpUuid)&&
  Objects.equals(this.numVs, objSeUpgradeEventDetails.numVs)&&
  Objects.equals(this.notes, objSeUpgradeEventDetails.notes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeUpgradeEventDetails {\n");
      sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    numVs: ").append(toIndentedString(numVs)).append("\n");
        sb.append("    seGrpUuid: ").append(toIndentedString(seGrpUuid)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
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

