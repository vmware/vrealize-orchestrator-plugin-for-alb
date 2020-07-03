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
 * The ServerAutoScalePolicy is a POJO class extends AviRestResource that used for creating
 * ServerAutoScalePolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServerAutoScalePolicy")
@VsoFinder(name = Constants.FINDER_VRO_SERVERAUTOSCALEPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServerAutoScalePolicy extends AviRestResource {
  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("intelligent_autoscale")
  @JsonInclude(Include.NON_NULL)
  private Boolean intelligentAutoscale = false;

  @JsonProperty("intelligent_scalein_margin")
  @JsonInclude(Include.NON_NULL)
  private Integer intelligentScaleinMargin = 40;

  @JsonProperty("intelligent_scaleout_margin")
  @JsonInclude(Include.NON_NULL)
  private Integer intelligentScaleoutMargin = 20;

  @JsonProperty("max_scalein_adjustment_step")
  @JsonInclude(Include.NON_NULL)
  private Integer maxScaleinAdjustmentStep = 1;

  @JsonProperty("max_scaleout_adjustment_step")
  @JsonInclude(Include.NON_NULL)
  private Integer maxScaleoutAdjustmentStep = 1;

  @JsonProperty("max_size")
  @JsonInclude(Include.NON_NULL)
  private Integer maxSize = null;

  @JsonProperty("min_size")
  @JsonInclude(Include.NON_NULL)
  private Integer minSize = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("scalein_alertconfig_refs")
  @JsonInclude(Include.NON_NULL)
  private List<String> scaleinAlertconfigRefs = null;

  @JsonProperty("scalein_cooldown")
  @JsonInclude(Include.NON_NULL)
  private Integer scaleinCooldown = 300;

  @JsonProperty("scaleout_alertconfig_refs")
  @JsonInclude(Include.NON_NULL)
  private List<String> scaleoutAlertconfigRefs = null;

  @JsonProperty("scaleout_cooldown")
  @JsonInclude(Include.NON_NULL)
  private Integer scaleoutCooldown = 300;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("use_predicted_load")
  @JsonInclude(Include.NON_NULL)
  private Boolean usePredictedLoad = false;

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * User defined description for the object.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User defined description for the object.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use avi intelligent autoscale algorithm where autoscale is performed by comparing load on the pool against estimated capacity of all the servers.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return intelligentAutoscale
   */
  @VsoMethod
  public Boolean getIntelligentAutoscale() {
    return intelligentAutoscale;
  }

  /**
   * This is the setter method to the attribute.
   * Use avi intelligent autoscale algorithm where autoscale is performed by comparing load on the pool against estimated capacity of all the servers.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param intelligentAutoscale set the intelligentAutoscale.
   */
  @VsoMethod
  public void setIntelligentAutoscale(Boolean  intelligentAutoscale) {
    this.intelligentAutoscale = intelligentAutoscale;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum extra capacity as percentage of load used by the intelligent scheme.
   * Scalein is triggered when available capacity is more than this margin.
   * Allowed values are 1-99.
   * Default value when not specified in API or module is interpreted by Avi Controller as 40.
   * @return intelligentScaleinMargin
   */
  @VsoMethod
  public Integer getIntelligentScaleinMargin() {
    return intelligentScaleinMargin;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum extra capacity as percentage of load used by the intelligent scheme.
   * Scalein is triggered when available capacity is more than this margin.
   * Allowed values are 1-99.
   * Default value when not specified in API or module is interpreted by Avi Controller as 40.
   * @param intelligentScaleinMargin set the intelligentScaleinMargin.
   */
  @VsoMethod
  public void setIntelligentScaleinMargin(Integer  intelligentScaleinMargin) {
    this.intelligentScaleinMargin = intelligentScaleinMargin;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum extra capacity as percentage of load used by the intelligent scheme.
   * Scaleout is triggered when available capacity is less than this margin.
   * Allowed values are 1-99.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @return intelligentScaleoutMargin
   */
  @VsoMethod
  public Integer getIntelligentScaleoutMargin() {
    return intelligentScaleoutMargin;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum extra capacity as percentage of load used by the intelligent scheme.
   * Scaleout is triggered when available capacity is less than this margin.
   * Allowed values are 1-99.
   * Default value when not specified in API or module is interpreted by Avi Controller as 20.
   * @param intelligentScaleoutMargin set the intelligentScaleoutMargin.
   */
  @VsoMethod
  public void setIntelligentScaleoutMargin(Integer  intelligentScaleoutMargin) {
    this.intelligentScaleoutMargin = intelligentScaleoutMargin;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of servers to scalein simultaneously.
   * The actual number of servers to scalein is chosen such that target number of servers is always more than or equal to the min_size.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return maxScaleinAdjustmentStep
   */
  @VsoMethod
  public Integer getMaxScaleinAdjustmentStep() {
    return maxScaleinAdjustmentStep;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of servers to scalein simultaneously.
   * The actual number of servers to scalein is chosen such that target number of servers is always more than or equal to the min_size.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param maxScaleinAdjustmentStep set the maxScaleinAdjustmentStep.
   */
  @VsoMethod
  public void setMaxScaleinAdjustmentStep(Integer  maxScaleinAdjustmentStep) {
    this.maxScaleinAdjustmentStep = maxScaleinAdjustmentStep;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of servers to scaleout simultaneously.
   * The actual number of servers to scaleout is chosen such that target number of servers is always less than or equal to the max_size.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return maxScaleoutAdjustmentStep
   */
  @VsoMethod
  public Integer getMaxScaleoutAdjustmentStep() {
    return maxScaleoutAdjustmentStep;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of servers to scaleout simultaneously.
   * The actual number of servers to scaleout is chosen such that target number of servers is always less than or equal to the max_size.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param maxScaleoutAdjustmentStep set the maxScaleoutAdjustmentStep.
   */
  @VsoMethod
  public void setMaxScaleoutAdjustmentStep(Integer  maxScaleoutAdjustmentStep) {
    this.maxScaleoutAdjustmentStep = maxScaleoutAdjustmentStep;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of servers after scaleout.
   * Allowed values are 0-400.
   * @return maxSize
   */
  @VsoMethod
  public Integer getMaxSize() {
    return maxSize;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of servers after scaleout.
   * Allowed values are 0-400.
   * @param maxSize set the maxSize.
   */
  @VsoMethod
  public void setMaxSize(Integer  maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * No scale-in happens once number of operationally up servers reach min_servers.
   * Allowed values are 0-400.
   * @return minSize
   */
  @VsoMethod
  public Integer getMinSize() {
    return minSize;
  }

  /**
   * This is the setter method to the attribute.
   * No scale-in happens once number of operationally up servers reach min_servers.
   * Allowed values are 0-400.
   * @param minSize set the minSize.
   */
  @VsoMethod
  public void setMinSize(Integer  minSize) {
    this.minSize = minSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Trigger scalein when alerts due to any of these alert configurations are raised.
   * It is a reference to an object of type alertconfig.
   * @return scaleinAlertconfigRefs
   */
  @VsoMethod
  public List<String> getScaleinAlertconfigRefs() {
    return scaleinAlertconfigRefs;
  }

  /**
   * This is the setter method. this will set the scaleinAlertconfigRefs
   * Trigger scalein when alerts due to any of these alert configurations are raised.
   * It is a reference to an object of type alertconfig.
   * @return scaleinAlertconfigRefs
   */
  @VsoMethod
  public void setScaleinAlertconfigRefs(List<String>  scaleinAlertconfigRefs) {
    this.scaleinAlertconfigRefs = scaleinAlertconfigRefs;
  }

  /**
   * This is the setter method this will set the scaleinAlertconfigRefs
   * Trigger scalein when alerts due to any of these alert configurations are raised.
   * It is a reference to an object of type alertconfig.
   * @return scaleinAlertconfigRefs
   */
  @VsoMethod
  public ServerAutoScalePolicy addScaleinAlertconfigRefsItem(String scaleinAlertconfigRefsItem) {
    if (this.scaleinAlertconfigRefs == null) {
      this.scaleinAlertconfigRefs = new ArrayList<String>();
    }
    this.scaleinAlertconfigRefs.add(scaleinAlertconfigRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Cooldown period during which no new scalein is triggered to allow previous scalein to successfully complete.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return scaleinCooldown
   */
  @VsoMethod
  public Integer getScaleinCooldown() {
    return scaleinCooldown;
  }

  /**
   * This is the setter method to the attribute.
   * Cooldown period during which no new scalein is triggered to allow previous scalein to successfully complete.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param scaleinCooldown set the scaleinCooldown.
   */
  @VsoMethod
  public void setScaleinCooldown(Integer  scaleinCooldown) {
    this.scaleinCooldown = scaleinCooldown;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Trigger scaleout when alerts due to any of these alert configurations are raised.
   * It is a reference to an object of type alertconfig.
   * @return scaleoutAlertconfigRefs
   */
  @VsoMethod
  public List<String> getScaleoutAlertconfigRefs() {
    return scaleoutAlertconfigRefs;
  }

  /**
   * This is the setter method. this will set the scaleoutAlertconfigRefs
   * Trigger scaleout when alerts due to any of these alert configurations are raised.
   * It is a reference to an object of type alertconfig.
   * @return scaleoutAlertconfigRefs
   */
  @VsoMethod
  public void setScaleoutAlertconfigRefs(List<String>  scaleoutAlertconfigRefs) {
    this.scaleoutAlertconfigRefs = scaleoutAlertconfigRefs;
  }

  /**
   * This is the setter method this will set the scaleoutAlertconfigRefs
   * Trigger scaleout when alerts due to any of these alert configurations are raised.
   * It is a reference to an object of type alertconfig.
   * @return scaleoutAlertconfigRefs
   */
  @VsoMethod
  public ServerAutoScalePolicy addScaleoutAlertconfigRefsItem(String scaleoutAlertconfigRefsItem) {
    if (this.scaleoutAlertconfigRefs == null) {
      this.scaleoutAlertconfigRefs = new ArrayList<String>();
    }
    this.scaleoutAlertconfigRefs.add(scaleoutAlertconfigRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Cooldown period during which no new scaleout is triggered to allow previous scaleout to successfully complete.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return scaleoutCooldown
   */
  @VsoMethod
  public Integer getScaleoutCooldown() {
    return scaleoutCooldown;
  }

  /**
   * This is the setter method to the attribute.
   * Cooldown period during which no new scaleout is triggered to allow previous scaleout to successfully complete.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param scaleoutCooldown set the scaleoutCooldown.
   */
  @VsoMethod
  public void setScaleoutCooldown(Integer  scaleoutCooldown) {
    this.scaleoutCooldown = scaleoutCooldown;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
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
   * Use predicted load rather than current load.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return usePredictedLoad
   */
  @VsoMethod
  public Boolean getUsePredictedLoad() {
    return usePredictedLoad;
  }

  /**
   * This is the setter method to the attribute.
   * Use predicted load rather than current load.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param usePredictedLoad set the usePredictedLoad.
   */
  @VsoMethod
  public void setUsePredictedLoad(Boolean  usePredictedLoad) {
    this.usePredictedLoad = usePredictedLoad;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ServerAutoScalePolicy objServerAutoScalePolicy = (ServerAutoScalePolicy) o;
  return   Objects.equals(this.scaleoutAlertconfigRefs, objServerAutoScalePolicy.scaleoutAlertconfigRefs)&&
  Objects.equals(this.maxScaleinAdjustmentStep, objServerAutoScalePolicy.maxScaleinAdjustmentStep)&&
  Objects.equals(this.intelligentAutoscale, objServerAutoScalePolicy.intelligentAutoscale)&&
  Objects.equals(this.intelligentScaleinMargin, objServerAutoScalePolicy.intelligentScaleinMargin)&&
  Objects.equals(this.uuid, objServerAutoScalePolicy.uuid)&&
  Objects.equals(this.scaleinAlertconfigRefs, objServerAutoScalePolicy.scaleinAlertconfigRefs)&&
  Objects.equals(this.usePredictedLoad, objServerAutoScalePolicy.usePredictedLoad)&&
  Objects.equals(this.intelligentScaleoutMargin, objServerAutoScalePolicy.intelligentScaleoutMargin)&&
  Objects.equals(this.description, objServerAutoScalePolicy.description)&&
  Objects.equals(this.minSize, objServerAutoScalePolicy.minSize)&&
  Objects.equals(this.scaleinCooldown, objServerAutoScalePolicy.scaleinCooldown)&&
  Objects.equals(this.maxScaleoutAdjustmentStep, objServerAutoScalePolicy.maxScaleoutAdjustmentStep)&&
  Objects.equals(this.scaleoutCooldown, objServerAutoScalePolicy.scaleoutCooldown)&&
  Objects.equals(this.tenantRef, objServerAutoScalePolicy.tenantRef)&&
  Objects.equals(this.maxSize, objServerAutoScalePolicy.maxSize)&&
  Objects.equals(this.name, objServerAutoScalePolicy.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServerAutoScalePolicy {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    intelligentAutoscale: ").append(toIndentedString(intelligentAutoscale)).append("\n");
        sb.append("    intelligentScaleinMargin: ").append(toIndentedString(intelligentScaleinMargin)).append("\n");
        sb.append("    intelligentScaleoutMargin: ").append(toIndentedString(intelligentScaleoutMargin)).append("\n");
        sb.append("    maxScaleinAdjustmentStep: ").append(toIndentedString(maxScaleinAdjustmentStep)).append("\n");
        sb.append("    maxScaleoutAdjustmentStep: ").append(toIndentedString(maxScaleoutAdjustmentStep)).append("\n");
        sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
        sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scaleinAlertconfigRefs: ").append(toIndentedString(scaleinAlertconfigRefs)).append("\n");
        sb.append("    scaleinCooldown: ").append(toIndentedString(scaleinCooldown)).append("\n");
        sb.append("    scaleoutAlertconfigRefs: ").append(toIndentedString(scaleoutAlertconfigRefs)).append("\n");
        sb.append("    scaleoutCooldown: ").append(toIndentedString(scaleoutCooldown)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    usePredictedLoad: ").append(toIndentedString(usePredictedLoad)).append("\n");
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
