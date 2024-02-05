package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.CC_AgentProperties;
import com.vmware.avi.vro.model.ControllerProperties;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The CloudInfo is a POJO class extends AviRestResource that used for creating
 * CloudInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudInfo")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudInfo extends AviRestResource {
    @JsonProperty("cca_props")
    @JsonInclude(Include.NON_NULL)
    private CC_AgentProperties ccaProps;

    @JsonProperty("controller_props")
    @JsonInclude(Include.NON_NULL)
    private ControllerProperties controllerProps;

    @JsonProperty("flavor_props")
    @JsonInclude(Include.NON_NULL)
    private List<CloudFlavor> flavorProps;

    @JsonProperty("flavor_regex_filter")
    @JsonInclude(Include.NON_NULL)
    private String flavorRegexFilter;

    @JsonProperty("htypes")
    @JsonInclude(Include.NON_NULL)
    private List<String> htypes;

    @JsonProperty("vtype")
    @JsonInclude(Include.NON_NULL)
    private String vtype;



  /**
   * This is the getter method this will return the attribute value.
   * Cloudconnectoragent properties specific to this cloud type.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccaProps
   */
  @VsoMethod
  public CC_AgentProperties getCcaProps() {
    return ccaProps;
  }

  /**
   * This is the setter method to the attribute.
   * Cloudconnectoragent properties specific to this cloud type.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccaProps set the ccaProps.
   */
  @VsoMethod
  public void setCcaProps(CC_AgentProperties ccaProps) {
    this.ccaProps = ccaProps;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Controller properties specific to this cloud type.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerProps
   */
  @VsoMethod
  public ControllerProperties getControllerProps() {
    return controllerProps;
  }

  /**
   * This is the setter method to the attribute.
   * Controller properties specific to this cloud type.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerProps set the controllerProps.
   */
  @VsoMethod
  public void setControllerProps(ControllerProperties controllerProps) {
    this.controllerProps = controllerProps;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flavor properties specific to this cloud type.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flavorProps
   */
  @VsoMethod
  public List<CloudFlavor> getFlavorProps() {
    return flavorProps;
  }

  /**
   * This is the setter method. this will set the flavorProps
   * Flavor properties specific to this cloud type.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flavorProps
   */
  @VsoMethod
  public void setFlavorProps(List<CloudFlavor>  flavorProps) {
    this.flavorProps = flavorProps;
  }

  /**
   * This is the setter method this will set the flavorProps
   * Flavor properties specific to this cloud type.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flavorProps
   */
  @VsoMethod
  public CloudInfo addFlavorPropsItem(CloudFlavor flavorPropsItem) {
    if (this.flavorProps == null) {
      this.flavorProps = new ArrayList<CloudFlavor>();
    }
    this.flavorProps.add(flavorPropsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flavorRegexFilter
   */
  @VsoMethod
  public String getFlavorRegexFilter() {
    return flavorRegexFilter;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param flavorRegexFilter set the flavorRegexFilter.
   */
  @VsoMethod
  public void setFlavorRegexFilter(String  flavorRegexFilter) {
    this.flavorRegexFilter = flavorRegexFilter;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Supported hypervisors.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return htypes
   */
  @VsoMethod
  public List<String> getHtypes() {
    return htypes;
  }

  /**
   * This is the setter method. this will set the htypes
   * Supported hypervisors.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return htypes
   */
  @VsoMethod
  public void setHtypes(List<String>  htypes) {
    this.htypes = htypes;
  }

  /**
   * This is the setter method this will set the htypes
   * Supported hypervisors.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return htypes
   */
  @VsoMethod
  public CloudInfo addHtypesItem(String htypesItem) {
    if (this.htypes == null) {
      this.htypes = new ArrayList<String>();
    }
    this.htypes.add(htypesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Cloud type.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vtype
   */
  @VsoMethod
  public String getVtype() {
    return vtype;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud type.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vtype set the vtype.
   */
  @VsoMethod
  public void setVtype(String  vtype) {
    this.vtype = vtype;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CloudInfo objCloudInfo = (CloudInfo) o;
  return   Objects.equals(this.vtype, objCloudInfo.vtype)&&
  Objects.equals(this.htypes, objCloudInfo.htypes)&&
  Objects.equals(this.flavorRegexFilter, objCloudInfo.flavorRegexFilter)&&
  Objects.equals(this.flavorProps, objCloudInfo.flavorProps)&&
  Objects.equals(this.ccaProps, objCloudInfo.ccaProps)&&
  Objects.equals(this.controllerProps, objCloudInfo.controllerProps);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CloudInfo {\n");
      sb.append("    ccaProps: ").append(toIndentedString(ccaProps)).append("\n");
        sb.append("    controllerProps: ").append(toIndentedString(controllerProps)).append("\n");
        sb.append("    flavorProps: ").append(toIndentedString(flavorProps)).append("\n");
        sb.append("    flavorRegexFilter: ").append(toIndentedString(flavorRegexFilter)).append("\n");
        sb.append("    htypes: ").append(toIndentedString(htypes)).append("\n");
        sb.append("    vtype: ").append(toIndentedString(vtype)).append("\n");
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

