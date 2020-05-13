package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
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
 * ClusterNode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ClusterNode")
@VsoFinder(name = Constants.FINDER_VRO_CLUSTERNODE, idAccessor = "getObjectID()")
@Service
public class ClusterNode extends AviRestResource  {
  @JsonProperty("categories")
  @Valid
  private List<String> categories = null;

  @JsonProperty("ip")
  private IpAddr ip = null;

  @JsonProperty("name")
  private String name = "node";

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("public_ip_or_name")
  private IpAddr publicIpOrName = null;

  @JsonProperty("vm_hostname")
  private String vmHostname = null;

  @JsonProperty("vm_mor")
  private String vmMor = null;

  @JsonProperty("vm_name")
  private String vmName = null;

  @JsonProperty("vm_uuid")
  private String vmUuid = null;

  
  public ClusterNode addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }
  
  /**
   * Optional service categories that a node can be assigned (e.g. SYSTEM, INFRASTRUCTURE or ANALYTICS). Field introduced in 18.1.1.
   * @return categories
  **/
  @ApiModelProperty(value = "Optional service categories that a node can be assigned (e.g. SYSTEM, INFRASTRUCTURE or ANALYTICS). Field introduced in 18.1.1.")


 
  @VsoMethod  
  public List<String> getCategories() {
    return categories;
  }
    
  @VsoMethod
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  
  /**
   * IP address of controller VM.
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "IP address of controller VM.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getIp() {
    return ip;
  }
    
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the object.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The password we will use when authenticating with this node (Not persisted). Field introduced in 18.2.3.
   * @return password
  **/
  @ApiModelProperty(value = "The password we will use when authenticating with this node (Not persisted). Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * Public IP address or hostname of the controller VM. Field introduced in 17.2.3.
   * @return publicIpOrName
  **/
  @ApiModelProperty(value = "Public IP address or hostname of the controller VM. Field introduced in 17.2.3.")

  @Valid

 
  @VsoMethod  
  public IpAddr getPublicIpOrName() {
    return publicIpOrName;
  }
    
  @VsoMethod
  public void setPublicIpOrName(IpAddr publicIpOrName) {
    this.publicIpOrName = publicIpOrName;
  }

  
  /**
   * Hostname assigned to this controller VM.
   * @return vmHostname
  **/
  @ApiModelProperty(value = "Hostname assigned to this controller VM.")


 
  @VsoMethod  
  public String getVmHostname() {
    return vmHostname;
  }
    
  @VsoMethod
  public void setVmHostname(String vmHostname) {
    this.vmHostname = vmHostname;
  }

  
  /**
   * Managed object reference of this controller VM.
   * @return vmMor
  **/
  @ApiModelProperty(value = "Managed object reference of this controller VM.")


 
  @VsoMethod  
  public String getVmMor() {
    return vmMor;
  }
    
  @VsoMethod
  public void setVmMor(String vmMor) {
    this.vmMor = vmMor;
  }

  
  /**
   * Name of the controller VM.
   * @return vmName
  **/
  @ApiModelProperty(value = "Name of the controller VM.")


 
  @VsoMethod  
  public String getVmName() {
    return vmName;
  }
    
  @VsoMethod
  public void setVmName(String vmName) {
    this.vmName = vmName;
  }

  
  /**
   * UUID on the controller VM.
   * @return vmUuid
  **/
  @ApiModelProperty(value = "UUID on the controller VM.")


 
  @VsoMethod  
  public String getVmUuid() {
    return vmUuid;
  }
    
  @VsoMethod
  public void setVmUuid(String vmUuid) {
    this.vmUuid = vmUuid;
  }

  
  public String getObjectID() {
		return "ClusterNode";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterNode clusterNode = (ClusterNode) o;
    return Objects.equals(this.categories, clusterNode.categories) &&
        Objects.equals(this.ip, clusterNode.ip) &&
        Objects.equals(this.name, clusterNode.name) &&
        Objects.equals(this.password, clusterNode.password) &&
        Objects.equals(this.publicIpOrName, clusterNode.publicIpOrName) &&
        Objects.equals(this.vmHostname, clusterNode.vmHostname) &&
        Objects.equals(this.vmMor, clusterNode.vmMor) &&
        Objects.equals(this.vmName, clusterNode.vmName) &&
        Objects.equals(this.vmUuid, clusterNode.vmUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, ip, name, password, publicIpOrName, vmHostname, vmMor, vmName, vmUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterNode {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    publicIpOrName: ").append(toIndentedString(publicIpOrName)).append("\n");
    sb.append("    vmHostname: ").append(toIndentedString(vmHostname)).append("\n");
    sb.append("    vmMor: ").append(toIndentedString(vmMor)).append("\n");
    sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
    sb.append("    vmUuid: ").append(toIndentedString(vmUuid)).append("\n");
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

