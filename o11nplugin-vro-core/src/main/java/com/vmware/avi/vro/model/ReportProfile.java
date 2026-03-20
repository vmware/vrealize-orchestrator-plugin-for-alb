package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.CollectionRules;
import com.vmware.avi.vro.model.RemoteController;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ReportProfile is a POJO class extends AviRestResource that used for creating
 * ReportProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ReportProfile")
@VsoFinder(name = Constants.FINDER_VRO_REPORTPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ReportProfile extends AviRestResource {
    @JsonProperty("collection_rules")
    @JsonInclude(Include.NON_NULL)
    private CollectionRules collectionRules;

    @JsonIgnore
    private Integer maxConcurrentReports = 1;

    @JsonProperty("remote_controller")
    @JsonInclude(Include.NON_NULL)
    private RemoteController remoteController;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Collection rules for the report.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return collectionRules
   */
  @VsoMethod
  public CollectionRules getCollectionRules() {
    return collectionRules;
  }

  /**
   * This is the setter method to the attribute.
   * Collection rules for the report.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param collectionRules set the collectionRules.
   */
  @VsoMethod
  public void setCollectionRules(CollectionRules collectionRules) {
    this.collectionRules = collectionRules;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of concurrent reports allowed to be generated.
   * Allowed values are 1-10.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return maxConcurrentReports
   */
  @VsoMethod
  public Integer getMaxConcurrentReports() {
    return maxConcurrentReports;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of concurrent reports allowed to be generated.
   * Allowed values are 1-10.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param maxConcurrentReports set the maxConcurrentReports.
   */
  @VsoMethod
  public void setMaxConcurrentReports(Integer  maxConcurrentReports) {
    this.maxConcurrentReports = maxConcurrentReports;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Remote controller request to enable report generation for remote controller.
   * If enabled, the report generation will be done for the remote controller.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return remoteController
   */
  @VsoMethod
  public RemoteController getRemoteController() {
    return remoteController;
  }

  /**
   * This is the setter method to the attribute.
   * Remote controller request to enable report generation for remote controller.
   * If enabled, the report generation will be done for the remote controller.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param remoteController set the remoteController.
   */
  @VsoMethod
  public void setRemoteController(RemoteController remoteController) {
    this.remoteController = remoteController;
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
   * Uuid identifier for the reportprofile object.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid identifier for the reportprofile object.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return "ReportProfile" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ReportProfile objReportProfile = (ReportProfile) o;
  return   Objects.equals(this.uuid, objReportProfile.uuid)&&
  Objects.equals(this.maxConcurrentReports, objReportProfile.maxConcurrentReports)&&
  Objects.equals(this.collectionRules, objReportProfile.collectionRules)&&
  Objects.equals(this.remoteController, objReportProfile.remoteController);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ReportProfile {\n");
      sb.append("    collectionRules: ").append(toIndentedString(collectionRules)).append("\n");
        sb.append("    maxConcurrentReports: ").append(toIndentedString(maxConcurrentReports)).append("\n");
        sb.append("    remoteController: ").append(toIndentedString(remoteController)).append("\n");
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

