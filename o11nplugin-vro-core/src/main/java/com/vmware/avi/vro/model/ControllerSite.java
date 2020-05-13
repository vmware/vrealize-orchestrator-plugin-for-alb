package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ControllerSite
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ControllerSite")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERSITE, idAccessor = "getObjectID()")
@Service
public class ControllerSite extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("port")
  private Integer port = 443;

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
   * IP Address or a DNS resolvable, fully qualified domain name of the Site Controller Cluster. Field introduced in 18.2.5.
   * @return address
  **/
  @ApiModelProperty(required = true, value = "IP Address or a DNS resolvable, fully qualified domain name of the Site Controller Cluster. Field introduced in 18.2.5.")
  @NotNull


 
  @VsoMethod  
  public String getAddress() {
    return address;
  }
    
  @VsoMethod
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * Name for the Site Controller Cluster. Field introduced in 18.2.5.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name for the Site Controller Cluster. Field introduced in 18.2.5.")
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
   * The Controller Site Cluster's REST API port number. Allowed values are 1-65535. Field introduced in 18.2.5.
   * @return port
  **/
  @ApiModelProperty(value = "The Controller Site Cluster's REST API port number. Allowed values are 1-65535. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * Reference for the Tenant. It is a reference to an object of type Tenant. Field introduced in 18.2.5.
   * @return tenantRef
  **/
  @ApiModelProperty(value = "Reference for the Tenant. It is a reference to an object of type Tenant. Field introduced in 18.2.5.")


 
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
   * Reference for the Site Controller Cluster. Field introduced in 18.2.5.
   * @return uuid
  **/
  @ApiModelProperty(value = "Reference for the Site Controller Cluster. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "ControllerSite";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerSite controllerSite = (ControllerSite) o;
    return Objects.equals(this.lastModified, controllerSite.lastModified) &&
        Objects.equals(this.address, controllerSite.address) &&
        Objects.equals(this.name, controllerSite.name) &&
        Objects.equals(this.port, controllerSite.port) &&
        Objects.equals(this.tenantRef, controllerSite.tenantRef) &&
        Objects.equals(this.url, controllerSite.url) &&
        Objects.equals(this.uuid, controllerSite.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, address, name, port, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerSite {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

