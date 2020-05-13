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
 * Cif
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "Cif")
@VsoFinder(name = Constants.FINDER_VRO_CIF, idAccessor = "getObjectID()")
@Service
public class Cif extends AviRestResource  {
  @JsonProperty("adapter")
  private String adapter = null;

  @JsonProperty("cif")
  private String cif = null;

  @JsonProperty("mac_address")
  private String macAddress = null;

  @JsonProperty("resources")
  @Valid
  private List<String> resources = null;

  @JsonProperty("se_uuid")
  private String seUuid = null;

  
  /**
   * adapter of Cif.
   * @return adapter
  **/
  @ApiModelProperty(value = "adapter of Cif.")


 
  @VsoMethod  
  public String getAdapter() {
    return adapter;
  }
    
  @VsoMethod
  public void setAdapter(String adapter) {
    this.adapter = adapter;
  }

  
  /**
   * cif of Cif.
   * @return cif
  **/
  @ApiModelProperty(value = "cif of Cif.")


 
  @VsoMethod  
  public String getCif() {
    return cif;
  }
    
  @VsoMethod
  public void setCif(String cif) {
    this.cif = cif;
  }

  
  /**
   * mac_address of Cif.
   * @return macAddress
  **/
  @ApiModelProperty(value = "mac_address of Cif.")


 
  @VsoMethod  
  public String getMacAddress() {
    return macAddress;
  }
    
  @VsoMethod
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  
  public Cif addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<String>();
    }
    this.resources.add(resourcesItem);
    return this;
  }
  
  /**
   * resources of Cif.
   * @return resources
  **/
  @ApiModelProperty(value = "resources of Cif.")


 
  @VsoMethod  
  public List<String> getResources() {
    return resources;
  }
    
  @VsoMethod
  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  
  /**
   * Unique object identifier of se.
   * @return seUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of se.")


 
  @VsoMethod  
  public String getSeUuid() {
    return seUuid;
  }
    
  @VsoMethod
  public void setSeUuid(String seUuid) {
    this.seUuid = seUuid;
  }

  
  public String getObjectID() {
		return "Cif";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cif cif = (Cif) o;
    return Objects.equals(this.adapter, cif.adapter) &&
        Objects.equals(this.cif, cif.cif) &&
        Objects.equals(this.macAddress, cif.macAddress) &&
        Objects.equals(this.resources, cif.resources) &&
        Objects.equals(this.seUuid, cif.seUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adapter, cif, macAddress, resources, seUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cif {\n");
    
    sb.append("    adapter: ").append(toIndentedString(adapter)).append("\n");
    sb.append("    cif: ").append(toIndentedString(cif)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
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

