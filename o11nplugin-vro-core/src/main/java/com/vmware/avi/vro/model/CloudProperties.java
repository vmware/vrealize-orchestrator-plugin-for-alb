package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CCProperties;
import com.vmware.avi.vro.model.CloudInfo;
import com.vmware.avi.vro.model.HypervisorProperties;
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
 * CloudProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CloudProperties")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDPROPERTIES, idAccessor = "getObjectID()")
@Service
public class CloudProperties extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cc_props")
  private CCProperties ccProps = null;

  @JsonProperty("cc_vtypes")
  @Valid
  private List<String> ccVtypes = null;

  @JsonProperty("hyp_props")
  @Valid
  private List<HypervisorProperties> hypProps = null;

  @JsonProperty("info")
  @Valid
  private List<CloudInfo> info = null;

  @JsonProperty("url")
  private String url = null;

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
   * CloudConnector properties.
   * @return ccProps
  **/
  @ApiModelProperty(value = "CloudConnector properties.")

  @Valid

 
  @VsoMethod  
  public CCProperties getCcProps() {
    return ccProps;
  }
    
  @VsoMethod
  public void setCcProps(CCProperties ccProps) {
    this.ccProps = ccProps;
  }

  
  public CloudProperties addCcVtypesItem(String ccVtypesItem) {
    if (this.ccVtypes == null) {
      this.ccVtypes = new ArrayList<String>();
    }
    this.ccVtypes.add(ccVtypesItem);
    return this;
  }
  
  /**
   * Cloud types supported by CloudConnector. Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.
   * @return ccVtypes
  **/
  @ApiModelProperty(value = "Cloud types supported by CloudConnector. Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.")


 
  @VsoMethod  
  public List<String> getCcVtypes() {
    return ccVtypes;
  }
    
  @VsoMethod
  public void setCcVtypes(List<String> ccVtypes) {
    this.ccVtypes = ccVtypes;
  }

  
  public CloudProperties addHypPropsItem(HypervisorProperties hypPropsItem) {
    if (this.hypProps == null) {
      this.hypProps = new ArrayList<HypervisorProperties>();
    }
    this.hypProps.add(hypPropsItem);
    return this;
  }
  
  /**
   * Hypervisor properties.
   * @return hypProps
  **/
  @ApiModelProperty(value = "Hypervisor properties.")

  @Valid

 
  @VsoMethod  
  public List<HypervisorProperties> getHypProps() {
    return hypProps;
  }
    
  @VsoMethod
  public void setHypProps(List<HypervisorProperties> hypProps) {
    this.hypProps = hypProps;
  }

  
  public CloudProperties addInfoItem(CloudInfo infoItem) {
    if (this.info == null) {
      this.info = new ArrayList<CloudInfo>();
    }
    this.info.add(infoItem);
    return this;
  }
  
  /**
   * Properties specific to a cloud type.
   * @return info
  **/
  @ApiModelProperty(value = "Properties specific to a cloud type.")

  @Valid

 
  @VsoMethod  
  public List<CloudInfo> getInfo() {
    return info;
  }
    
  @VsoMethod
  public void setInfo(List<CloudInfo> info) {
    this.info = info;
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
		return "CloudProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudProperties cloudProperties = (CloudProperties) o;
    return Objects.equals(this.lastModified, cloudProperties.lastModified) &&
        Objects.equals(this.ccProps, cloudProperties.ccProps) &&
        Objects.equals(this.ccVtypes, cloudProperties.ccVtypes) &&
        Objects.equals(this.hypProps, cloudProperties.hypProps) &&
        Objects.equals(this.info, cloudProperties.info) &&
        Objects.equals(this.url, cloudProperties.url) &&
        Objects.equals(this.uuid, cloudProperties.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, ccProps, ccVtypes, hypProps, info, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudProperties {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    ccProps: ").append(toIndentedString(ccProps)).append("\n");
    sb.append("    ccVtypes: ").append(toIndentedString(ccVtypes)).append("\n");
    sb.append("    hypProps: ").append(toIndentedString(hypProps)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

