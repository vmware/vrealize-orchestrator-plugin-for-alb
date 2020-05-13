package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CCAgentProperties;
import com.vmware.avi.vro.model.CloudFlavor;
import com.vmware.avi.vro.model.ControllerProperties;
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
 * CloudInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CloudInfo")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDINFO, idAccessor = "getObjectID()")
@Service
public class CloudInfo extends AviRestResource  {
  @JsonProperty("cca_props")
  private CCAgentProperties ccaProps = null;

  @JsonProperty("controller_props")
  private ControllerProperties controllerProps = null;

  @JsonProperty("flavor_props")
  @Valid
  private List<CloudFlavor> flavorProps = null;

  @JsonProperty("flavor_regex_filter")
  private String flavorRegexFilter = null;

  @JsonProperty("htypes")
  @Valid
  private List<String> htypes = null;

  @JsonProperty("vtype")
  private String vtype = null;

  
  /**
   * CloudConnectorAgent properties specific to this cloud type.
   * @return ccaProps
  **/
  @ApiModelProperty(value = "CloudConnectorAgent properties specific to this cloud type.")

  @Valid

 
  @VsoMethod  
  public CCAgentProperties getCcaProps() {
    return ccaProps;
  }
    
  @VsoMethod
  public void setCcaProps(CCAgentProperties ccaProps) {
    this.ccaProps = ccaProps;
  }

  
  /**
   * Controller properties specific to this cloud type.
   * @return controllerProps
  **/
  @ApiModelProperty(value = "Controller properties specific to this cloud type.")

  @Valid

 
  @VsoMethod  
  public ControllerProperties getControllerProps() {
    return controllerProps;
  }
    
  @VsoMethod
  public void setControllerProps(ControllerProperties controllerProps) {
    this.controllerProps = controllerProps;
  }

  
  public CloudInfo addFlavorPropsItem(CloudFlavor flavorPropsItem) {
    if (this.flavorProps == null) {
      this.flavorProps = new ArrayList<CloudFlavor>();
    }
    this.flavorProps.add(flavorPropsItem);
    return this;
  }
  
  /**
   * Flavor properties specific to this cloud type.
   * @return flavorProps
  **/
  @ApiModelProperty(value = "Flavor properties specific to this cloud type.")

  @Valid

 
  @VsoMethod  
  public List<CloudFlavor> getFlavorProps() {
    return flavorProps;
  }
    
  @VsoMethod
  public void setFlavorProps(List<CloudFlavor> flavorProps) {
    this.flavorProps = flavorProps;
  }

  
  /**
   * flavor_regex_filter of CloudInfo.
   * @return flavorRegexFilter
  **/
  @ApiModelProperty(value = "flavor_regex_filter of CloudInfo.")


 
  @VsoMethod  
  public String getFlavorRegexFilter() {
    return flavorRegexFilter;
  }
    
  @VsoMethod
  public void setFlavorRegexFilter(String flavorRegexFilter) {
    this.flavorRegexFilter = flavorRegexFilter;
  }

  
  public CloudInfo addHtypesItem(String htypesItem) {
    if (this.htypes == null) {
      this.htypes = new ArrayList<String>();
    }
    this.htypes.add(htypesItem);
    return this;
  }
  
  /**
   * Supported hypervisors. Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * @return htypes
  **/
  @ApiModelProperty(value = "Supported hypervisors. Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.")


 
  @VsoMethod  
  public List<String> getHtypes() {
    return htypes;
  }
    
  @VsoMethod
  public void setHtypes(List<String> htypes) {
    this.htypes = htypes;
  }

  
  /**
   * Cloud type. Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.
   * @return vtype
  **/
  @ApiModelProperty(required = true, value = "Cloud type. Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.")
  @NotNull


 
  @VsoMethod  
  public String getVtype() {
    return vtype;
  }
    
  @VsoMethod
  public void setVtype(String vtype) {
    this.vtype = vtype;
  }

  
  public String getObjectID() {
		return "CloudInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudInfo cloudInfo = (CloudInfo) o;
    return Objects.equals(this.ccaProps, cloudInfo.ccaProps) &&
        Objects.equals(this.controllerProps, cloudInfo.controllerProps) &&
        Objects.equals(this.flavorProps, cloudInfo.flavorProps) &&
        Objects.equals(this.flavorRegexFilter, cloudInfo.flavorRegexFilter) &&
        Objects.equals(this.htypes, cloudInfo.htypes) &&
        Objects.equals(this.vtype, cloudInfo.vtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccaProps, controllerProps, flavorProps, flavorRegexFilter, htypes, vtype);
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

