package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.EquivalentLabels;
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
 * PriorityLabels
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PriorityLabels")
@VsoFinder(name = Constants.FINDER_VRO_PRIORITYLABELS, idAccessor = "getObjectID()")
@Service
public class PriorityLabels extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("equivalent_labels")
  @Valid
  private List<EquivalentLabels> equivalentLabels = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

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
   *  It is a reference to an object of type Cloud.
   * @return cloudRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Cloud.")


 
  @VsoMethod  
  public String getCloudRef() {
    return cloudRef;
  }
    
  @VsoMethod
  public void setCloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
  }

  
  /**
   * A description of the priority labels.
   * @return description
  **/
  @ApiModelProperty(value = "A description of the priority labels.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  public PriorityLabels addEquivalentLabelsItem(EquivalentLabels equivalentLabelsItem) {
    if (this.equivalentLabels == null) {
      this.equivalentLabels = new ArrayList<EquivalentLabels>();
    }
    this.equivalentLabels.add(equivalentLabelsItem);
    return this;
  }
  
  /**
   * Equivalent priority labels in descending order.
   * @return equivalentLabels
  **/
  @ApiModelProperty(value = "Equivalent priority labels in descending order.")

  @Valid

 
  @VsoMethod  
  public List<EquivalentLabels> getEquivalentLabels() {
    return equivalentLabels;
  }
    
  @VsoMethod
  public void setEquivalentLabels(List<EquivalentLabels> equivalentLabels) {
    this.equivalentLabels = equivalentLabels;
  }

  
  /**
   * The name of the priority labels.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the priority labels.")
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
   * UUID of the priority labels.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the priority labels.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "PriorityLabels";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriorityLabels priorityLabels = (PriorityLabels) o;
    return Objects.equals(this.lastModified, priorityLabels.lastModified) &&
        Objects.equals(this.cloudRef, priorityLabels.cloudRef) &&
        Objects.equals(this.description, priorityLabels.description) &&
        Objects.equals(this.equivalentLabels, priorityLabels.equivalentLabels) &&
        Objects.equals(this.name, priorityLabels.name) &&
        Objects.equals(this.tenantRef, priorityLabels.tenantRef) &&
        Objects.equals(this.url, priorityLabels.url) &&
        Objects.equals(this.uuid, priorityLabels.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, cloudRef, description, equivalentLabels, name, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriorityLabels {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    equivalentLabels: ").append(toIndentedString(equivalentLabels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

