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
 * The OCISetup is a POJO class extends AviRestResource that used for creating
 * OCISetup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OCISetup")
@VsoFinder(name = Constants.FINDER_VRO_OCISETUP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OCISetup extends AviRestResource {
  @JsonProperty("cc_id")
  @JsonInclude(Include.NON_NULL)
  private String ccId = null;

  @JsonProperty("compartment_id")
  @JsonInclude(Include.NON_NULL)
  private String compartmentId = null;

  @JsonProperty("reason")
  @JsonInclude(Include.NON_NULL)
  private String reason = null;

  @JsonProperty("status")
  @JsonInclude(Include.NON_NULL)
  private String status = null;

  @JsonProperty("tenancy")
  @JsonInclude(Include.NON_NULL)
  private String tenancy = null;

  @JsonProperty("vcn_id")
  @JsonInclude(Include.NON_NULL)
  private String vcnId = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cc_id of obj type ocisetup field type str  type string.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cc_id of obj type ocisetup field type str  type string.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property compartment_id of obj type ocisetup field type str  type string.
   * @return compartmentId
   */
  @VsoMethod
  public String getCompartmentId() {
    return compartmentId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property compartment_id of obj type ocisetup field type str  type string.
   * @param compartmentId set the compartmentId.
   */
  @VsoMethod
  public void setCompartmentId(String  compartmentId) {
    this.compartmentId = compartmentId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type ocisetup field type str  type string.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property reason of obj type ocisetup field type str  type string.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property status of obj type ocisetup field type str  type string.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property status of obj type ocisetup field type str  type string.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tenancy of obj type ocisetup field type str  type string.
   * @return tenancy
   */
  @VsoMethod
  public String getTenancy() {
    return tenancy;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property tenancy of obj type ocisetup field type str  type string.
   * @param tenancy set the tenancy.
   */
  @VsoMethod
  public void setTenancy(String  tenancy) {
    this.tenancy = tenancy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcn_id of obj type ocisetup field type str  type string.
   * @return vcnId
   */
  @VsoMethod
  public String getVcnId() {
    return vcnId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcn_id of obj type ocisetup field type str  type string.
   * @param vcnId set the vcnId.
   */
  @VsoMethod
  public void setVcnId(String  vcnId) {
    this.vcnId = vcnId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OCISetup objOCISetup = (OCISetup) o;
  return   Objects.equals(this.status, objOCISetup.status)&&
  Objects.equals(this.vcnId, objOCISetup.vcnId)&&
  Objects.equals(this.compartmentId, objOCISetup.compartmentId)&&
  Objects.equals(this.reason, objOCISetup.reason)&&
  Objects.equals(this.tenancy, objOCISetup.tenancy)&&
  Objects.equals(this.ccId, objOCISetup.ccId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OCISetup {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    compartmentId: ").append(toIndentedString(compartmentId)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
        sb.append("    vcnId: ").append(toIndentedString(vcnId)).append("\n");
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
