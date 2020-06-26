package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.CC_Properties;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The CloudProperties is a POJO class extends AviRestResource that used for creating
 * CloudProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudProperties")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDPROPERTIES, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudProperties extends AviRestResource {
  @JsonProperty("cc_props")
  @JsonInclude(Include.NON_NULL)
  private CC_Properties ccProps = null;

  @JsonProperty("cc_vtypes")
  @JsonInclude(Include.NON_NULL)
  private List<String> ccVtypes = null;

  @JsonProperty("hyp_props")
  @JsonInclude(Include.NON_NULL)
  private List<Hypervisor_Properties> hypProps = null;

  @JsonProperty("info")
  @JsonInclude(Include.NON_NULL)
  private List<CloudInfo> info = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Cloudconnector properties.
   * @return ccProps
   */
  @VsoMethod
  public CC_Properties getCcProps() {
    return ccProps;
  }

  /**
   * This is the setter method to the attribute.
   * Cloudconnector properties.
   * @param ccProps set the ccProps.
   */
  @VsoMethod
  public void setCcProps(CC_Properties ccProps) {
    this.ccProps = ccProps;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud types supported by cloudconnector.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * @return ccVtypes
   */
  @VsoMethod
  public List<String> getCcVtypes() {
    return ccVtypes;
  }

  /**
   * This is the setter method. this will set the ccVtypes
   * Cloud types supported by cloudconnector.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * @return ccVtypes
   */
  @VsoMethod
  public void setCcVtypes(List<String>  ccVtypes) {
    this.ccVtypes = ccVtypes;
  }

  /**
   * This is the setter method this will set the ccVtypes
   * Cloud types supported by cloudconnector.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * @return ccVtypes
   */
  @VsoMethod
  public CloudProperties addCcVtypesItem(String ccVtypesItem) {
    if (this.ccVtypes == null) {
      this.ccVtypes = new ArrayList<String>();
    }
    this.ccVtypes.add(ccVtypesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Hypervisor properties.
   * @return hypProps
   */
  @VsoMethod
  public List<Hypervisor_Properties> getHypProps() {
    return hypProps;
  }

  /**
   * This is the setter method. this will set the hypProps
   * Hypervisor properties.
   * @return hypProps
   */
  @VsoMethod
  public void setHypProps(List<Hypervisor_Properties>  hypProps) {
    this.hypProps = hypProps;
  }

  /**
   * This is the setter method this will set the hypProps
   * Hypervisor properties.
   * @return hypProps
   */
  @VsoMethod
  public CloudProperties addHypPropsItem(Hypervisor_Properties hypPropsItem) {
    if (this.hypProps == null) {
      this.hypProps = new ArrayList<Hypervisor_Properties>();
    }
    this.hypProps.add(hypPropsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Properties specific to a cloud type.
   * @return info
   */
  @VsoMethod
  public List<CloudInfo> getInfo() {
    return info;
  }

  /**
   * This is the setter method. this will set the info
   * Properties specific to a cloud type.
   * @return info
   */
  @VsoMethod
  public void setInfo(List<CloudInfo>  info) {
    this.info = info;
  }

  /**
   * This is the setter method this will set the info
   * Properties specific to a cloud type.
   * @return info
   */
  @VsoMethod
  public CloudProperties addInfoItem(CloudInfo infoItem) {
    if (this.info == null) {
      this.info = new ArrayList<CloudInfo>();
    }
    this.info.add(infoItem);
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
    return "CloudProperties" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CloudProperties objCloudProperties = (CloudProperties) o;
  return   Objects.equals(this.info, objCloudProperties.info)&&
  Objects.equals(this.hypProps, objCloudProperties.hypProps)&&
  Objects.equals(this.uuid, objCloudProperties.uuid)&&
  Objects.equals(this.ccProps, objCloudProperties.ccProps)&&
  Objects.equals(this.ccVtypes, objCloudProperties.ccVtypes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CloudProperties {\n");
      sb.append("    ccProps: ").append(toIndentedString(ccProps)).append("\n");
        sb.append("    ccVtypes: ").append(toIndentedString(ccVtypes)).append("\n");
        sb.append("    hypProps: ").append(toIndentedString(hypProps)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
