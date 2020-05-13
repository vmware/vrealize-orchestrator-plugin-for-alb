package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AzureClusterInfo;
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
 * ClusterCloudDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ClusterCloudDetails")
@VsoFinder(name = Constants.FINDER_VRO_CLUSTERCLOUDDETAILS, idAccessor = "getObjectID()")
@Service
public class ClusterCloudDetails extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("azure_info")
  private AzureClusterInfo azureInfo = null;

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
   * Azure info to configure cluster_vip on the controller. Field introduced in 17.2.5.
   * @return azureInfo
  **/
  @ApiModelProperty(value = "Azure info to configure cluster_vip on the controller. Field introduced in 17.2.5.")

  @Valid

 
  @VsoMethod  
  public AzureClusterInfo getAzureInfo() {
    return azureInfo;
  }
    
  @VsoMethod
  public void setAzureInfo(AzureClusterInfo azureInfo) {
    this.azureInfo = azureInfo;
  }

  
  /**
   *  Field introduced in 17.2.5.
   * @return name
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 17.2.5.")
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
   *  It is a reference to an object of type Tenant. Field introduced in 17.2.5.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 17.2.5.")


 
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
   *  Field introduced in 17.2.5.
   * @return uuid
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "ClusterCloudDetails";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterCloudDetails clusterCloudDetails = (ClusterCloudDetails) o;
    return Objects.equals(this.lastModified, clusterCloudDetails.lastModified) &&
        Objects.equals(this.azureInfo, clusterCloudDetails.azureInfo) &&
        Objects.equals(this.name, clusterCloudDetails.name) &&
        Objects.equals(this.tenantRef, clusterCloudDetails.tenantRef) &&
        Objects.equals(this.url, clusterCloudDetails.url) &&
        Objects.equals(this.uuid, clusterCloudDetails.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, azureInfo, name, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterCloudDetails {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    azureInfo: ").append(toIndentedString(azureInfo)).append("\n");
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

