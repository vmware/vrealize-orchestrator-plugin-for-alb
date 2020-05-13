package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AutoScaleMesosSettings;
import com.vmware.avi.vro.model.AutoScaleOpenStackSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * AutoScaleLaunchConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AutoScaleLaunchConfig")
@VsoFinder(name = Constants.FINDER_VRO_AUTOSCALELAUNCHCONFIG, idAccessor = "getObjectID()")
@Service
public class AutoScaleLaunchConfig extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("image_id")
  private String imageId = null;

  @JsonProperty("mesos")
  private AutoScaleMesosSettings mesos = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("openstack")
  private AutoScaleOpenStackSettings openstack = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("use_external_asg")
  private Boolean useExternalAsg = true;

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
   * Unique ID of the Amazon Machine Image (AMI)  or OpenStack VM ID.
   * @return imageId
  **/
  @ApiModelProperty(value = "Unique ID of the Amazon Machine Image (AMI)  or OpenStack VM ID.")


 
  @VsoMethod  
  public String getImageId() {
    return imageId;
  }
    
  @VsoMethod
  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  
  /**
   * Placeholder for description of property mesos of obj type AutoScaleLaunchConfig field type str  type object
   * @return mesos
  **/
  @ApiModelProperty(value = "Placeholder for description of property mesos of obj type AutoScaleLaunchConfig field type str  type object")

  @Valid

 
  @VsoMethod  
  public AutoScaleMesosSettings getMesos() {
    return mesos;
  }
    
  @VsoMethod
  public void setMesos(AutoScaleMesosSettings mesos) {
    this.mesos = mesos;
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

  
  /**
   * Placeholder for description of property openstack of obj type AutoScaleLaunchConfig field type str  type object
   * @return openstack
  **/
  @ApiModelProperty(value = "Placeholder for description of property openstack of obj type AutoScaleLaunchConfig field type str  type object")

  @Valid

 
  @VsoMethod  
  public AutoScaleOpenStackSettings getOpenstack() {
    return openstack;
  }
    
  @VsoMethod
  public void setOpenstack(AutoScaleOpenStackSettings openstack) {
    this.openstack = openstack;
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
   * If set to True, ServerAutoscalePolicy will use the autoscaling group (external_autoscaling_groups) from Pool to perform scale up and scale down. Pool should have single autoscaling group configured. Field introduced in 17.2.3.
   * @return useExternalAsg
  **/
  @ApiModelProperty(value = "If set to True, ServerAutoscalePolicy will use the autoscaling group (external_autoscaling_groups) from Pool to perform scale up and scale down. Pool should have single autoscaling group configured. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public Boolean isUseExternalAsg() {
    return useExternalAsg;
  }
    
  @VsoMethod
  public void setUseExternalAsg(Boolean useExternalAsg) {
    this.useExternalAsg = useExternalAsg;
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
		return "AutoScaleLaunchConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScaleLaunchConfig autoScaleLaunchConfig = (AutoScaleLaunchConfig) o;
    return Objects.equals(this.lastModified, autoScaleLaunchConfig.lastModified) &&
        Objects.equals(this.description, autoScaleLaunchConfig.description) &&
        Objects.equals(this.imageId, autoScaleLaunchConfig.imageId) &&
        Objects.equals(this.mesos, autoScaleLaunchConfig.mesos) &&
        Objects.equals(this.name, autoScaleLaunchConfig.name) &&
        Objects.equals(this.openstack, autoScaleLaunchConfig.openstack) &&
        Objects.equals(this.tenantRef, autoScaleLaunchConfig.tenantRef) &&
        Objects.equals(this.url, autoScaleLaunchConfig.url) &&
        Objects.equals(this.useExternalAsg, autoScaleLaunchConfig.useExternalAsg) &&
        Objects.equals(this.uuid, autoScaleLaunchConfig.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, description, imageId, mesos, name, openstack, tenantRef, url, useExternalAsg, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScaleLaunchConfig {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    mesos: ").append(toIndentedString(mesos)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openstack: ").append(toIndentedString(openstack)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useExternalAsg: ").append(toIndentedString(useExternalAsg)).append("\n");
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

