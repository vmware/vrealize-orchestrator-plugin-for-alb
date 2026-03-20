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
 * The SeQatModeEventDetail is a POJO class extends AviRestResource that used for creating
 * SeQatModeEventDetail.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeQatModeEventDetail")
@VsoFinder(name = Constants.FINDER_VRO_SEQATMODEEVENTDETAIL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeQatModeEventDetail extends AviRestResource {
    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("se_name")
    @JsonInclude(Include.NON_NULL)
    private String seName;

    @JsonProperty("se_ref")
    @JsonInclude(Include.NON_NULL)
    private String seRef;



  /**
   * This is the getter method this will return the attribute value.
   * Intel qat service is oper_down.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Intel qat service is oper_down.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the se, reporting this event.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the se, reporting this event.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the se, responsible for this event.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seRef
   */
  @VsoMethod
  public String getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the se, responsible for this event.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seRef set the seRef.
   */
  @VsoMethod
  public void setSeRef(String  seRef) {
    this.seRef = seRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeQatModeEventDetail objSeQatModeEventDetail = (SeQatModeEventDetail) o;
  return   Objects.equals(this.description, objSeQatModeEventDetail.description)&&
  Objects.equals(this.seName, objSeQatModeEventDetail.seName)&&
  Objects.equals(this.seRef, objSeQatModeEventDetail.seRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeQatModeEventDetail {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
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

