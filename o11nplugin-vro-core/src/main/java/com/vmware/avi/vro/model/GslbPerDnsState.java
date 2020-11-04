package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GslbDownloadStatus;
import com.vmware.avi.vro.model.GslbDownloadStatus;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbPerDnsState is a POJO class extends AviRestResource that used for creating
 * GslbPerDnsState.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbPerDnsState")
@VsoFinder(name = Constants.FINDER_VRO_GSLBPERDNSSTATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbPerDnsState extends AviRestResource {
    @JsonProperty("geo_download")
    @JsonInclude(Include.NON_NULL)
    private GslbDownloadStatus geoDownload = null;

    @JsonProperty("gslb_download")
    @JsonInclude(Include.NON_NULL)
    private GslbDownloadStatus gslbDownload = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("oper_status")
    @JsonInclude(Include.NON_NULL)
    private OperationalStatus operStatus = null;

    @JsonProperty("placement_rules")
    @JsonInclude(Include.NON_NULL)
    private List<GslbSubDomainPlacementRuntime> placementRules = null;

    @JsonProperty("se_list")
    @JsonInclude(Include.NON_NULL)
    private List<String> seList = null;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("valid_dns_vs")
    @JsonInclude(Include.NON_NULL)
    private Boolean validDnsVs = false;



  /**
   * This is the getter method this will return the attribute value.
   * This field describes the geodbprofile download status to the dns-vs.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return geoDownload
   */
  @VsoMethod
  public GslbDownloadStatus getGeoDownload() {
    return geoDownload;
  }

  /**
   * This is the setter method to the attribute.
   * This field describes the geodbprofile download status to the dns-vs.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param geoDownload set the geoDownload.
   */
  @VsoMethod
  public void setGeoDownload(GslbDownloadStatus geoDownload) {
    this.geoDownload = geoDownload;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field describes the gslb, gslbservice, healthmonitor download status to the dns-vs.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gslbDownload
   */
  @VsoMethod
  public GslbDownloadStatus getGslbDownload() {
    return gslbDownload;
  }

  /**
   * This is the setter method to the attribute.
   * This field describes the gslb, gslbservice, healthmonitor download status to the dns-vs.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gslbDownload set the gslbDownload.
   */
  @VsoMethod
  public void setGslbDownload(GslbDownloadStatus gslbDownload) {
    this.gslbDownload = gslbDownload;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configured dns-vs-name at the site.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Configured dns-vs-name at the site.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property oper_status of obj type gslbperdnsstate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return operStatus
   */
  @VsoMethod
  public OperationalStatus getOperStatus() {
    return operStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property oper_status of obj type gslbperdnsstate field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param operStatus set the operStatus.
   */
  @VsoMethod
  public void setOperStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field describes the subdomain placement rules for this dns-vs.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return placementRules
   */
  @VsoMethod
  public List<GslbSubDomainPlacementRuntime> getPlacementRules() {
    return placementRules;
  }

  /**
   * This is the setter method. this will set the placementRules
   * This field describes the subdomain placement rules for this dns-vs.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return placementRules
   */
  @VsoMethod
  public void setPlacementRules(List<GslbSubDomainPlacementRuntime>  placementRules) {
    this.placementRules = placementRules;
  }

  /**
   * This is the setter method this will set the placementRules
   * This field describes the subdomain placement rules for this dns-vs.
   * Field introduced in 17.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return placementRules
   */
  @VsoMethod
  public GslbPerDnsState addPlacementRulesItem(GslbSubDomainPlacementRuntime placementRulesItem) {
    if (this.placementRules == null) {
      this.placementRules = new ArrayList<GslbSubDomainPlacementRuntime>();
    }
    this.placementRules.add(placementRulesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The service engines associated with the dns-vs.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seList
   */
  @VsoMethod
  public List<String> getSeList() {
    return seList;
  }

  /**
   * This is the setter method. this will set the seList
   * The service engines associated with the dns-vs.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seList
   */
  @VsoMethod
  public void setSeList(List<String>  seList) {
    this.seList = seList;
  }

  /**
   * This is the setter method this will set the seList
   * The service engines associated with the dns-vs.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seList
   */
  @VsoMethod
  public GslbPerDnsState addSeListItem(String seListItem) {
    if (this.seList == null) {
      this.seList = new ArrayList<String>();
    }
    this.seList.add(seListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Configured dns-vs-uuid at the site.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Configured dns-vs-uuid at the site.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field indicates that the local vs is configured to be a dns service.
   * The services, network profile and application profile are configured in virtual service for dns operations.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return validDnsVs
   */
  @VsoMethod
  public Boolean getValidDnsVs() {
    return validDnsVs;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates that the local vs is configured to be a dns service.
   * The services, network profile and application profile are configured in virtual service for dns operations.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param validDnsVs set the validDnsVs.
   */
  @VsoMethod
  public void setValidDnsVs(Boolean  validDnsVs) {
    this.validDnsVs = validDnsVs;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbPerDnsState objGslbPerDnsState = (GslbPerDnsState) o;
  return   Objects.equals(this.uuid, objGslbPerDnsState.uuid)&&
  Objects.equals(this.name, objGslbPerDnsState.name)&&
  Objects.equals(this.validDnsVs, objGslbPerDnsState.validDnsVs)&&
  Objects.equals(this.operStatus, objGslbPerDnsState.operStatus)&&
  Objects.equals(this.seList, objGslbPerDnsState.seList)&&
  Objects.equals(this.gslbDownload, objGslbPerDnsState.gslbDownload)&&
  Objects.equals(this.geoDownload, objGslbPerDnsState.geoDownload)&&
  Objects.equals(this.placementRules, objGslbPerDnsState.placementRules);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbPerDnsState {\n");
      sb.append("    geoDownload: ").append(toIndentedString(geoDownload)).append("\n");
        sb.append("    gslbDownload: ").append(toIndentedString(gslbDownload)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
        sb.append("    placementRules: ").append(toIndentedString(placementRules)).append("\n");
        sb.append("    seList: ").append(toIndentedString(seList)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    validDnsVs: ").append(toIndentedString(validDnsVs)).append("\n");
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

