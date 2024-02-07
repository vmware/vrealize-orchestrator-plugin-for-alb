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
 * The LicenseLedgerDetails is a POJO class extends AviRestResource that used for creating
 * LicenseLedgerDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicenseLedgerDetails")
@VsoFinder(name = Constants.FINDER_VRO_LICENSELEDGERDETAILS, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicenseLedgerDetails extends AviRestResource {
    @JsonProperty("escrow_infos")
    @JsonInclude(Include.NON_NULL)
    private List<LicenseInfo> escrowInfos;

    @JsonProperty("se_infos")
    @JsonInclude(Include.NON_NULL)
    private List<LicenseInfo> seInfos;

    @JsonProperty("tier_usages")
    @JsonInclude(Include.NON_NULL)
    private List<LicenseTierUsage> tierUsages;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Maintain information about reservation against cookie.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return escrowInfos
   */
  @VsoMethod
  public List<LicenseInfo> getEscrowInfos() {
    return escrowInfos;
  }

  /**
   * This is the setter method. this will set the escrowInfos
   * Maintain information about reservation against cookie.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return escrowInfos
   */
  @VsoMethod
  public void setEscrowInfos(List<LicenseInfo>  escrowInfos) {
    this.escrowInfos = escrowInfos;
  }

  /**
   * This is the setter method this will set the escrowInfos
   * Maintain information about reservation against cookie.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return escrowInfos
   */
  @VsoMethod
  public LicenseLedgerDetails addEscrowInfosItem(LicenseInfo escrowInfosItem) {
    if (this.escrowInfos == null) {
      this.escrowInfos = new ArrayList<LicenseInfo>();
    }
    this.escrowInfos.add(escrowInfosItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Maintain information about consumed licenses against se_uuid.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seInfos
   */
  @VsoMethod
  public List<LicenseInfo> getSeInfos() {
    return seInfos;
  }

  /**
   * This is the setter method. this will set the seInfos
   * Maintain information about consumed licenses against se_uuid.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seInfos
   */
  @VsoMethod
  public void setSeInfos(List<LicenseInfo>  seInfos) {
    this.seInfos = seInfos;
  }

  /**
   * This is the setter method this will set the seInfos
   * Maintain information about consumed licenses against se_uuid.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seInfos
   */
  @VsoMethod
  public LicenseLedgerDetails addSeInfosItem(LicenseInfo seInfosItem) {
    if (this.seInfos == null) {
      this.seInfos = new ArrayList<LicenseInfo>();
    }
    this.seInfos.add(seInfosItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * License usage per tier.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tierUsages
   */
  @VsoMethod
  public List<LicenseTierUsage> getTierUsages() {
    return tierUsages;
  }

  /**
   * This is the setter method. this will set the tierUsages
   * License usage per tier.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tierUsages
   */
  @VsoMethod
  public void setTierUsages(List<LicenseTierUsage>  tierUsages) {
    this.tierUsages = tierUsages;
  }

  /**
   * This is the setter method this will set the tierUsages
   * License usage per tier.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tierUsages
   */
  @VsoMethod
  public LicenseLedgerDetails addTierUsagesItem(LicenseTierUsage tierUsagesItem) {
    if (this.tierUsages == null) {
      this.tierUsages = new ArrayList<LicenseTierUsage>();
    }
    this.tierUsages.add(tierUsagesItem);
    return this;
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
   * Uuid for reference.
   * Field introduced in 20.1.1.
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
   * Uuid for reference.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return "LicenseLedgerDetails" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LicenseLedgerDetails objLicenseLedgerDetails = (LicenseLedgerDetails) o;
  return   Objects.equals(this.uuid, objLicenseLedgerDetails.uuid)&&
  Objects.equals(this.tierUsages, objLicenseLedgerDetails.tierUsages)&&
  Objects.equals(this.escrowInfos, objLicenseLedgerDetails.escrowInfos)&&
  Objects.equals(this.seInfos, objLicenseLedgerDetails.seInfos);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicenseLedgerDetails {\n");
      sb.append("    escrowInfos: ").append(toIndentedString(escrowInfos)).append("\n");
        sb.append("    seInfos: ").append(toIndentedString(seInfos)).append("\n");
        sb.append("    tierUsages: ").append(toIndentedString(tierUsages)).append("\n");
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

