package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ControllerParams;
import com.vmware.avi.vro.model.ControllerParams;
import com.vmware.avi.vro.model.DryRunParams;
import com.vmware.avi.vro.model.ImageParams;
import com.vmware.avi.vro.model.PreChecksParams;
import com.vmware.avi.vro.model.ServiceEngineParams;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The UpgradeProfile is a POJO class extends AviRestResource that used for creating
 * UpgradeProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UpgradeProfile")
@VsoFinder(name = Constants.FINDER_VRO_UPGRADEPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UpgradeProfile extends AviRestResource {
    @JsonProperty("controller")
    @JsonInclude(Include.NON_NULL)
    private ControllerParams controller;

    @JsonProperty("controller_params")
    @JsonInclude(Include.NON_NULL)
    private ControllerParams controllerParams;

    @JsonProperty("dry_run")
    @JsonInclude(Include.NON_NULL)
    private DryRunParams dryRun;

    @JsonProperty("image")
    @JsonInclude(Include.NON_NULL)
    private ImageParams image;

    @JsonProperty("pre_checks")
    @JsonInclude(Include.NON_NULL)
    private PreChecksParams preChecks;

    @JsonProperty("service_engine")
    @JsonInclude(Include.NON_NULL)
    private ServiceEngineParams serviceEngine;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * List of controller upgrade related configurable parameters.
   * Field deprecated in 31.2.1.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * @return controller
   */
  @VsoMethod
  public ControllerParams getController() {
    return controller;
  }

  /**
   * This is the setter method to the attribute.
   * List of controller upgrade related configurable parameters.
   * Field deprecated in 31.2.1.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * @param controller set the controller.
   */
  @VsoMethod
  public void setController(ControllerParams controller) {
    this.controller = controller;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of controller upgrade related configurable parameters.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerParams
   */
  @VsoMethod
  public ControllerParams getControllerParams() {
    return controllerParams;
  }

  /**
   * This is the setter method to the attribute.
   * List of controller upgrade related configurable parameters.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerParams set the controllerParams.
   */
  @VsoMethod
  public void setControllerParams(ControllerParams controllerParams) {
    this.controllerParams = controllerParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of dryrun related configurable parameters.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dryRun
   */
  @VsoMethod
  public DryRunParams getDryRun() {
    return dryRun;
  }

  /**
   * This is the setter method to the attribute.
   * List of dryrun related configurable parameters.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dryRun set the dryRun.
   */
  @VsoMethod
  public void setDryRun(DryRunParams dryRun) {
    this.dryRun = dryRun;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of image related configurable parameters.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return image
   */
  @VsoMethod
  public ImageParams getImage() {
    return image;
  }

  /**
   * This is the setter method to the attribute.
   * List of image related configurable parameters.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param image set the image.
   */
  @VsoMethod
  public void setImage(ImageParams image) {
    this.image = image;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of upgrade pre-checks related configurable parameters.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return preChecks
   */
  @VsoMethod
  public PreChecksParams getPreChecks() {
    return preChecks;
  }

  /**
   * This is the setter method to the attribute.
   * List of upgrade pre-checks related configurable parameters.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param preChecks set the preChecks.
   */
  @VsoMethod
  public void setPreChecks(PreChecksParams preChecks) {
    this.preChecks = preChecks;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of service engine upgrade related configurable parameters.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceEngine
   */
  @VsoMethod
  public ServiceEngineParams getServiceEngine() {
    return serviceEngine;
  }

  /**
   * This is the setter method to the attribute.
   * List of service engine upgrade related configurable parameters.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceEngine set the serviceEngine.
   */
  @VsoMethod
  public void setServiceEngine(ServiceEngineParams serviceEngine) {
    this.serviceEngine = serviceEngine;
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
   * Uuid identifier for the upgradeprofile object.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid identifier for the upgradeprofile object.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return "UpgradeProfile" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  UpgradeProfile objUpgradeProfile = (UpgradeProfile) o;
  return   Objects.equals(this.uuid, objUpgradeProfile.uuid)&&
  Objects.equals(this.controller, objUpgradeProfile.controller)&&
  Objects.equals(this.serviceEngine, objUpgradeProfile.serviceEngine)&&
  Objects.equals(this.image, objUpgradeProfile.image)&&
  Objects.equals(this.dryRun, objUpgradeProfile.dryRun)&&
  Objects.equals(this.preChecks, objUpgradeProfile.preChecks)&&
  Objects.equals(this.controllerParams, objUpgradeProfile.controllerParams);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UpgradeProfile {\n");
      sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
        sb.append("    controllerParams: ").append(toIndentedString(controllerParams)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    preChecks: ").append(toIndentedString(preChecks)).append("\n");
        sb.append("    serviceEngine: ").append(toIndentedString(serviceEngine)).append("\n");
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

