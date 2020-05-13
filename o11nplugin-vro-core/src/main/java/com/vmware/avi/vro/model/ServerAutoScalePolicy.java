package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * ServerAutoScalePolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ServerAutoScalePolicy")
@VsoFinder(name = Constants.FINDER_VRO_SERVERAUTOSCALEPOLICY, idAccessor = "getObjectID()")
@Service
public class ServerAutoScalePolicy extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("intelligent_autoscale")
  private Boolean intelligentAutoscale = null;

  @JsonProperty("intelligent_scalein_margin")
  private Integer intelligentScaleinMargin = 40;

  @JsonProperty("intelligent_scaleout_margin")
  private Integer intelligentScaleoutMargin = 20;

  @JsonProperty("max_scalein_adjustment_step")
  private Integer maxScaleinAdjustmentStep = 1;

  @JsonProperty("max_scaleout_adjustment_step")
  private Integer maxScaleoutAdjustmentStep = 1;

  @JsonProperty("max_size")
  private Integer maxSize = null;

  @JsonProperty("min_size")
  private Integer minSize = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("scalein_alertconfig_refs")
  @Valid
  private List<String> scaleinAlertconfigRefs = null;

  @JsonProperty("scalein_cooldown")
  private Integer scaleinCooldown = 300;

  @JsonProperty("scaleout_alertconfig_refs")
  @Valid
  private List<String> scaleoutAlertconfigRefs = null;

  @JsonProperty("scaleout_cooldown")
  private Integer scaleoutCooldown = 300;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("use_predicted_load")
  private Boolean usePredictedLoad = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * User defined description for the object.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for the object.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Use Avi intelligent autoscale algorithm where autoscale is performed by comparing load on the pool against estimated capacity of all the servers.
   * @return intelligentAutoscale
  **/
  @ApiModelProperty(value = "Use Avi intelligent autoscale algorithm where autoscale is performed by comparing load on the pool against estimated capacity of all the servers.")


 
  @VsoMethod  
  public Boolean isIntelligentAutoscale() {
    return intelligentAutoscale;
  }
    
  @VsoMethod
  public void setIntelligentAutoscale(Boolean intelligentAutoscale) {
    this.intelligentAutoscale = intelligentAutoscale;
  }

  
  /**
   * Maximum extra capacity as percentage of load used by the intelligent scheme. Scalein is triggered when available capacity is more than this margin. Allowed values are 1-99.
   * @return intelligentScaleinMargin
  **/
  @ApiModelProperty(value = "Maximum extra capacity as percentage of load used by the intelligent scheme. Scalein is triggered when available capacity is more than this margin. Allowed values are 1-99.")


 
  @VsoMethod  
  public Integer getIntelligentScaleinMargin() {
    return intelligentScaleinMargin;
  }
    
  @VsoMethod
  public void setIntelligentScaleinMargin(Integer intelligentScaleinMargin) {
    this.intelligentScaleinMargin = intelligentScaleinMargin;
  }

  
  /**
   * Minimum extra capacity as percentage of load used by the intelligent scheme. Scaleout is triggered when available capacity is less than this margin. Allowed values are 1-99.
   * @return intelligentScaleoutMargin
  **/
  @ApiModelProperty(value = "Minimum extra capacity as percentage of load used by the intelligent scheme. Scaleout is triggered when available capacity is less than this margin. Allowed values are 1-99.")


 
  @VsoMethod  
  public Integer getIntelligentScaleoutMargin() {
    return intelligentScaleoutMargin;
  }
    
  @VsoMethod
  public void setIntelligentScaleoutMargin(Integer intelligentScaleoutMargin) {
    this.intelligentScaleoutMargin = intelligentScaleoutMargin;
  }

  
  /**
   * Maximum number of servers to scalein simultaneously. The actual number of servers to scalein is chosen such that target number of servers is always more than or equal to the min_size.
   * @return maxScaleinAdjustmentStep
  **/
  @ApiModelProperty(value = "Maximum number of servers to scalein simultaneously. The actual number of servers to scalein is chosen such that target number of servers is always more than or equal to the min_size.")


 
  @VsoMethod  
  public Integer getMaxScaleinAdjustmentStep() {
    return maxScaleinAdjustmentStep;
  }
    
  @VsoMethod
  public void setMaxScaleinAdjustmentStep(Integer maxScaleinAdjustmentStep) {
    this.maxScaleinAdjustmentStep = maxScaleinAdjustmentStep;
  }

  
  /**
   * Maximum number of servers to scaleout simultaneously. The actual number of servers to scaleout is chosen such that target number of servers is always less than or equal to the max_size.
   * @return maxScaleoutAdjustmentStep
  **/
  @ApiModelProperty(value = "Maximum number of servers to scaleout simultaneously. The actual number of servers to scaleout is chosen such that target number of servers is always less than or equal to the max_size.")


 
  @VsoMethod  
  public Integer getMaxScaleoutAdjustmentStep() {
    return maxScaleoutAdjustmentStep;
  }
    
  @VsoMethod
  public void setMaxScaleoutAdjustmentStep(Integer maxScaleoutAdjustmentStep) {
    this.maxScaleoutAdjustmentStep = maxScaleoutAdjustmentStep;
  }

  
  /**
   * Maximum number of servers after scaleout. Allowed values are 0-400.
   * @return maxSize
  **/
  @ApiModelProperty(value = "Maximum number of servers after scaleout. Allowed values are 0-400.")


 
  @VsoMethod  
  public Integer getMaxSize() {
    return maxSize;
  }
    
  @VsoMethod
  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }

  
  /**
   * No scale-in happens once number of operationally up servers reach min_servers. Allowed values are 0-400.
   * @return minSize
  **/
  @ApiModelProperty(value = "No scale-in happens once number of operationally up servers reach min_servers. Allowed values are 0-400.")


 
  @VsoMethod  
  public Integer getMinSize() {
    return minSize;
  }
    
  @VsoMethod
  public void setMinSize(Integer minSize) {
    this.minSize = minSize;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public ServerAutoScalePolicy addScaleinAlertconfigRefsItem(String scaleinAlertconfigRefsItem) {
    if (this.scaleinAlertconfigRefs == null) {
      this.scaleinAlertconfigRefs = new ArrayList<String>();
    }
    this.scaleinAlertconfigRefs.add(scaleinAlertconfigRefsItem);
    return this;
  }
  
  /**
   * Trigger scalein when alerts due to any of these Alert configurations are raised. It is a reference to an object of type AlertConfig.
   * @return scaleinAlertconfigRefs
  **/
  @ApiModelProperty(value = "Trigger scalein when alerts due to any of these Alert configurations are raised. It is a reference to an object of type AlertConfig.")


 
  @VsoMethod  
  public List<String> getScaleinAlertconfigRefs() {
    return scaleinAlertconfigRefs;
  }
    
  @VsoMethod
  public void setScaleinAlertconfigRefs(List<String> scaleinAlertconfigRefs) {
    this.scaleinAlertconfigRefs = scaleinAlertconfigRefs;
  }

  
  /**
   * Cooldown period during which no new scalein is triggered to allow previous scalein to successfully complete.
   * @return scaleinCooldown
  **/
  @ApiModelProperty(value = "Cooldown period during which no new scalein is triggered to allow previous scalein to successfully complete.")


 
  @VsoMethod  
  public Integer getScaleinCooldown() {
    return scaleinCooldown;
  }
    
  @VsoMethod
  public void setScaleinCooldown(Integer scaleinCooldown) {
    this.scaleinCooldown = scaleinCooldown;
  }

  
  public ServerAutoScalePolicy addScaleoutAlertconfigRefsItem(String scaleoutAlertconfigRefsItem) {
    if (this.scaleoutAlertconfigRefs == null) {
      this.scaleoutAlertconfigRefs = new ArrayList<String>();
    }
    this.scaleoutAlertconfigRefs.add(scaleoutAlertconfigRefsItem);
    return this;
  }
  
  /**
   * Trigger scaleout when alerts due to any of these Alert configurations are raised. It is a reference to an object of type AlertConfig.
   * @return scaleoutAlertconfigRefs
  **/
  @ApiModelProperty(value = "Trigger scaleout when alerts due to any of these Alert configurations are raised. It is a reference to an object of type AlertConfig.")


 
  @VsoMethod  
  public List<String> getScaleoutAlertconfigRefs() {
    return scaleoutAlertconfigRefs;
  }
    
  @VsoMethod
  public void setScaleoutAlertconfigRefs(List<String> scaleoutAlertconfigRefs) {
    this.scaleoutAlertconfigRefs = scaleoutAlertconfigRefs;
  }

  
  /**
   * Cooldown period during which no new scaleout is triggered to allow previous scaleout to successfully complete.
   * @return scaleoutCooldown
  **/
  @ApiModelProperty(value = "Cooldown period during which no new scaleout is triggered to allow previous scaleout to successfully complete.")


 
  @VsoMethod  
  public Integer getScaleoutCooldown() {
    return scaleoutCooldown;
  }
    
  @VsoMethod
  public void setScaleoutCooldown(Integer scaleoutCooldown) {
    this.scaleoutCooldown = scaleoutCooldown;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Use predicted load rather than current load.
   * @return usePredictedLoad
  **/
  @ApiModelProperty(value = "Use predicted load rather than current load.")


 
  @VsoMethod  
  public Boolean isUsePredictedLoad() {
    return usePredictedLoad;
  }
    
  @VsoMethod
  public void setUsePredictedLoad(Boolean usePredictedLoad) {
    this.usePredictedLoad = usePredictedLoad;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "ServerAutoScalePolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerAutoScalePolicy serverAutoScalePolicy = (ServerAutoScalePolicy) o;
    return Objects.equals(this.lastModified, serverAutoScalePolicy.lastModified) &&
        Objects.equals(this.description, serverAutoScalePolicy.description) &&
        Objects.equals(this.intelligentAutoscale, serverAutoScalePolicy.intelligentAutoscale) &&
        Objects.equals(this.intelligentScaleinMargin, serverAutoScalePolicy.intelligentScaleinMargin) &&
        Objects.equals(this.intelligentScaleoutMargin, serverAutoScalePolicy.intelligentScaleoutMargin) &&
        Objects.equals(this.maxScaleinAdjustmentStep, serverAutoScalePolicy.maxScaleinAdjustmentStep) &&
        Objects.equals(this.maxScaleoutAdjustmentStep, serverAutoScalePolicy.maxScaleoutAdjustmentStep) &&
        Objects.equals(this.maxSize, serverAutoScalePolicy.maxSize) &&
        Objects.equals(this.minSize, serverAutoScalePolicy.minSize) &&
        Objects.equals(this.name, serverAutoScalePolicy.name) &&
        Objects.equals(this.scaleinAlertconfigRefs, serverAutoScalePolicy.scaleinAlertconfigRefs) &&
        Objects.equals(this.scaleinCooldown, serverAutoScalePolicy.scaleinCooldown) &&
        Objects.equals(this.scaleoutAlertconfigRefs, serverAutoScalePolicy.scaleoutAlertconfigRefs) &&
        Objects.equals(this.scaleoutCooldown, serverAutoScalePolicy.scaleoutCooldown) &&
        Objects.equals(this.tenantRef, serverAutoScalePolicy.tenantRef) &&
        Objects.equals(this.url, serverAutoScalePolicy.url) &&
        Objects.equals(this.usePredictedLoad, serverAutoScalePolicy.usePredictedLoad) &&
        Objects.equals(this.uuid, serverAutoScalePolicy.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, description, intelligentAutoscale, intelligentScaleinMargin, intelligentScaleoutMargin, maxScaleinAdjustmentStep, maxScaleoutAdjustmentStep, maxSize, minSize, name, scaleinAlertconfigRefs, scaleinCooldown, scaleoutAlertconfigRefs, scaleoutCooldown, tenantRef, url, usePredictedLoad, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerAutoScalePolicy {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

