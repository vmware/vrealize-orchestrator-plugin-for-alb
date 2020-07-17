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
 * The SeGeoDbDetails is a POJO class extends AviRestResource that used for creating
 * SeGeoDbDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeGeoDbDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEGEODBDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeGeoDbDetails extends AviRestResource {
  @JsonProperty("file_name")
  @JsonInclude(Include.NON_NULL)
  private String fileName = null;

  @JsonProperty("geo_db_profile_name")
  @JsonInclude(Include.NON_NULL)
  private String geoDbProfileName = null;

  @JsonProperty("geo_db_profile_ref")
  @JsonInclude(Include.NON_NULL)
  private String geoDbProfileRef = null;

  @JsonProperty("reason")
  @JsonInclude(Include.NON_NULL)
  private String reason = null;

  @JsonProperty("se_ref")
  @JsonInclude(Include.NON_NULL)
  private String seRef = null;

  @JsonProperty("vip_id")
  @JsonInclude(Include.NON_NULL)
  private String vipId = null;

  @JsonProperty("virtual_service")
  @JsonInclude(Include.NON_NULL)
  private String virtualService = null;



  /**
   * This is the getter method this will return the attribute value.
   * Geo db file name.
   * @return fileName
   */
  @VsoMethod
  public String getFileName() {
    return fileName;
  }

  /**
   * This is the setter method to the attribute.
   * Geo db file name.
   * @param fileName set the fileName.
   */
  @VsoMethod
  public void setFileName(String  fileName) {
    this.fileName = fileName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the gslb geo db profile.
   * @return geoDbProfileName
   */
  @VsoMethod
  public String getGeoDbProfileName() {
    return geoDbProfileName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the gslb geo db profile.
   * @param geoDbProfileName set the geoDbProfileName.
   */
  @VsoMethod
  public void setGeoDbProfileName(String  geoDbProfileName) {
    this.geoDbProfileName = geoDbProfileName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the gslb geo db profile.
   * It is a reference to an object of type gslbgeodbprofile.
   * @return geoDbProfileRef
   */
  @VsoMethod
  public String getGeoDbProfileRef() {
    return geoDbProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the gslb geo db profile.
   * It is a reference to an object of type gslbgeodbprofile.
   * @param geoDbProfileRef set the geoDbProfileRef.
   */
  @VsoMethod
  public void setGeoDbProfileRef(String  geoDbProfileRef) {
    this.geoDbProfileRef = geoDbProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for gslb geo db failure.
   * Enum options - NO_ERROR, FILE_ERROR, FILE_FORMAT_ERROR, FILE_NO_RESOURCES.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for gslb geo db failure.
   * Enum options - NO_ERROR, FILE_ERROR, FILE_FORMAT_ERROR, FILE_NO_RESOURCES.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * @return seRef
   */
  @VsoMethod
  public String getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * @param seRef set the seRef.
   */
  @VsoMethod
  public void setSeRef(String  seRef) {
    this.seRef = seRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip id.
   * @return vipId
   */
  @VsoMethod
  public String getVipId() {
    return vipId;
  }

  /**
   * This is the setter method to the attribute.
   * Vip id.
   * @param vipId set the vipId.
   */
  @VsoMethod
  public void setVipId(String  vipId) {
    this.vipId = vipId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtual service name.
   * It is a reference to an object of type virtualservice.
   * @return virtualService
   */
  @VsoMethod
  public String getVirtualService() {
    return virtualService;
  }

  /**
   * This is the setter method to the attribute.
   * Virtual service name.
   * It is a reference to an object of type virtualservice.
   * @param virtualService set the virtualService.
   */
  @VsoMethod
  public void setVirtualService(String  virtualService) {
    this.virtualService = virtualService;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeGeoDbDetails objSeGeoDbDetails = (SeGeoDbDetails) o;
  return   Objects.equals(this.vipId, objSeGeoDbDetails.vipId)&&
  Objects.equals(this.geoDbProfileName, objSeGeoDbDetails.geoDbProfileName)&&
  Objects.equals(this.fileName, objSeGeoDbDetails.fileName)&&
  Objects.equals(this.virtualService, objSeGeoDbDetails.virtualService)&&
  Objects.equals(this.geoDbProfileRef, objSeGeoDbDetails.geoDbProfileRef)&&
  Objects.equals(this.reason, objSeGeoDbDetails.reason)&&
  Objects.equals(this.seRef, objSeGeoDbDetails.seRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeGeoDbDetails {\n");
      sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    geoDbProfileName: ").append(toIndentedString(geoDbProfileName)).append("\n");
        sb.append("    geoDbProfileRef: ").append(toIndentedString(geoDbProfileRef)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
        sb.append("    virtualService: ").append(toIndentedString(virtualService)).append("\n");
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

