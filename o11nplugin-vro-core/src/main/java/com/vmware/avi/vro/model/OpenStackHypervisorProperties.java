package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.Property;
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
 * OpenStackHypervisorProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "OpenStackHypervisorProperties")
@VsoFinder(name = Constants.FINDER_VRO_OPENSTACKHYPERVISORPROPERTIES, idAccessor = "getObjectID()")
@Service
public class OpenStackHypervisorProperties extends AviRestResource  {
  @JsonProperty("hypervisor")
  private String hypervisor = null;

  @JsonProperty("image_properties")
  @Valid
  private List<Property> imageProperties = null;

  
  /**
   * Hypervisor type. Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN. Field introduced in 17.2.1.
   * @return hypervisor
  **/
  @ApiModelProperty(required = true, value = "Hypervisor type. Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN. Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getHypervisor() {
    return hypervisor;
  }
    
  @VsoMethod
  public void setHypervisor(String hypervisor) {
    this.hypervisor = hypervisor;
  }

  
  public OpenStackHypervisorProperties addImagePropertiesItem(Property imagePropertiesItem) {
    if (this.imageProperties == null) {
      this.imageProperties = new ArrayList<Property>();
    }
    this.imageProperties.add(imagePropertiesItem);
    return this;
  }
  
  /**
   * Custom properties to be associated with the SE image in Glance for this hypervisor type. Field introduced in 17.2.1.
   * @return imageProperties
  **/
  @ApiModelProperty(value = "Custom properties to be associated with the SE image in Glance for this hypervisor type. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public List<Property> getImageProperties() {
    return imageProperties;
  }
    
  @VsoMethod
  public void setImageProperties(List<Property> imageProperties) {
    this.imageProperties = imageProperties;
  }

  
  public String getObjectID() {
		return "OpenStackHypervisorProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenStackHypervisorProperties openStackHypervisorProperties = (OpenStackHypervisorProperties) o;
    return Objects.equals(this.hypervisor, openStackHypervisorProperties.hypervisor) &&
        Objects.equals(this.imageProperties, openStackHypervisorProperties.imageProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hypervisor, imageProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenStackHypervisorProperties {\n");
    
    sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
    sb.append("    imageProperties: ").append(toIndentedString(imageProperties)).append("\n");
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

