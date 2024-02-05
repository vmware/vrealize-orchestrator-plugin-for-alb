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
 * The VipSymmetryDetails is a POJO class extends AviRestResource that used for creating
 * VipSymmetryDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VipSymmetryDetails")
@VsoFinder(name = Constants.FINDER_VRO_VIPSYMMETRYDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VipSymmetryDetails extends AviRestResource {
    @JsonProperty("max_num_se_assigned")
    @JsonInclude(Include.NON_NULL)
    private Integer maxNumSeAssigned;

    @JsonProperty("max_num_se_requested")
    @JsonInclude(Include.NON_NULL)
    private Integer maxNumSeRequested;

    @JsonProperty("min_num_se_assigned")
    @JsonInclude(Include.NON_NULL)
    private Integer minNumSeAssigned;

    @JsonProperty("min_num_se_requested")
    @JsonInclude(Include.NON_NULL)
    private Integer minNumSeRequested;

    @JsonProperty("num_vs")
    @JsonInclude(Include.NON_NULL)
    private Integer numVs;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason;

    @JsonProperty("vip_id")
    @JsonInclude(Include.NON_NULL)
    private String vipId;

    @JsonProperty("vsvip_name")
    @JsonInclude(Include.NON_NULL)
    private String vsvipName;

    @JsonProperty("vsvip_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsvipUuid;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of ses assigned across all virtual services sharing this vip.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxNumSeAssigned
   */
  @VsoMethod
  public Integer getMaxNumSeAssigned() {
    return maxNumSeAssigned;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of ses assigned across all virtual services sharing this vip.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxNumSeAssigned set the maxNumSeAssigned.
   */
  @VsoMethod
  public void setMaxNumSeAssigned(Integer  maxNumSeAssigned) {
    this.maxNumSeAssigned = maxNumSeAssigned;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of ses requested across all virtual services sharing this vip.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxNumSeRequested
   */
  @VsoMethod
  public Integer getMaxNumSeRequested() {
    return maxNumSeRequested;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of ses requested across all virtual services sharing this vip.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxNumSeRequested set the maxNumSeRequested.
   */
  @VsoMethod
  public void setMaxNumSeRequested(Integer  maxNumSeRequested) {
    this.maxNumSeRequested = maxNumSeRequested;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of ses assigned across all virtual services sharing this vip.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return minNumSeAssigned
   */
  @VsoMethod
  public Integer getMinNumSeAssigned() {
    return minNumSeAssigned;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of ses assigned across all virtual services sharing this vip.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param minNumSeAssigned set the minNumSeAssigned.
   */
  @VsoMethod
  public void setMinNumSeAssigned(Integer  minNumSeAssigned) {
    this.minNumSeAssigned = minNumSeAssigned;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of ses requested across all virtual services sharing this vip.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return minNumSeRequested
   */
  @VsoMethod
  public Integer getMinNumSeRequested() {
    return minNumSeRequested;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of ses requested across all virtual services sharing this vip.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param minNumSeRequested set the minNumSeRequested.
   */
  @VsoMethod
  public void setMinNumSeRequested(Integer  minNumSeRequested) {
    this.minNumSeRequested = minNumSeRequested;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of virtual services sharing vsvip.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numVs
   */
  @VsoMethod
  public Integer getNumVs() {
    return numVs;
  }

  /**
   * This is the setter method to the attribute.
   * Number of virtual services sharing vsvip.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numVs set the numVs.
   */
  @VsoMethod
  public void setNumVs(Integer  numVs) {
    this.numVs = numVs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for symmetric/asymmetric shared vip event.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for symmetric/asymmetric shared vip event.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip id.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipId
   */
  @VsoMethod
  public String getVipId() {
    return vipId;
  }

  /**
   * This is the setter method to the attribute.
   * Vip id.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipId set the vipId.
   */
  @VsoMethod
  public void setVipId(String  vipId) {
    this.vipId = vipId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vsvip name.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsvipName
   */
  @VsoMethod
  public String getVsvipName() {
    return vsvipName;
  }

  /**
   * This is the setter method to the attribute.
   * Vsvip name.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsvipName set the vsvipName.
   */
  @VsoMethod
  public void setVsvipName(String  vsvipName) {
    this.vsvipName = vsvipName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vsvip uuid.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsvipUuid
   */
  @VsoMethod
  public String getVsvipUuid() {
    return vsvipUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Vsvip uuid.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsvipUuid set the vsvipUuid.
   */
  @VsoMethod
  public void setVsvipUuid(String  vsvipUuid) {
    this.vsvipUuid = vsvipUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VipSymmetryDetails objVipSymmetryDetails = (VipSymmetryDetails) o;
  return   Objects.equals(this.vsvipUuid, objVipSymmetryDetails.vsvipUuid)&&
  Objects.equals(this.vsvipName, objVipSymmetryDetails.vsvipName)&&
  Objects.equals(this.vipId, objVipSymmetryDetails.vipId)&&
  Objects.equals(this.numVs, objVipSymmetryDetails.numVs)&&
  Objects.equals(this.maxNumSeRequested, objVipSymmetryDetails.maxNumSeRequested)&&
  Objects.equals(this.minNumSeRequested, objVipSymmetryDetails.minNumSeRequested)&&
  Objects.equals(this.maxNumSeAssigned, objVipSymmetryDetails.maxNumSeAssigned)&&
  Objects.equals(this.minNumSeAssigned, objVipSymmetryDetails.minNumSeAssigned)&&
  Objects.equals(this.reason, objVipSymmetryDetails.reason);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VipSymmetryDetails {\n");
      sb.append("    maxNumSeAssigned: ").append(toIndentedString(maxNumSeAssigned)).append("\n");
        sb.append("    maxNumSeRequested: ").append(toIndentedString(maxNumSeRequested)).append("\n");
        sb.append("    minNumSeAssigned: ").append(toIndentedString(minNumSeAssigned)).append("\n");
        sb.append("    minNumSeRequested: ").append(toIndentedString(minNumSeRequested)).append("\n");
        sb.append("    numVs: ").append(toIndentedString(numVs)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
        sb.append("    vsvipName: ").append(toIndentedString(vsvipName)).append("\n");
        sb.append("    vsvipUuid: ").append(toIndentedString(vsvipUuid)).append("\n");
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

