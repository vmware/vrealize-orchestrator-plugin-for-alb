package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ClusterNode is a POJO class extends AviRestResource that used for creating
 * ClusterNode.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ClusterNode")
@VsoFinder(name = Constants.FINDER_VRO_CLUSTERNODE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ClusterNode extends AviRestResource {
    @JsonProperty("categories")
    @JsonInclude(Include.NON_NULL)
    private List<String> categories = null;

    @JsonProperty("interfaces")
    @JsonInclude(Include.NON_NULL)
    private List<ControllerInterface> interfaces = null;

    @JsonProperty("ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ip = null;

    @JsonProperty("ip6")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ip6 = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = "node";

    @JsonProperty("password")
    @JsonInclude(Include.NON_NULL)
    private String password = null;

    @JsonProperty("public_ip_or_name")
    @JsonInclude(Include.NON_NULL)
    private IpAddr publicIpOrName = null;

    @JsonProperty("static_routes")
    @JsonInclude(Include.NON_NULL)
    private List<StaticRoute> staticRoutes = null;

    @JsonProperty("vm_hostname")
    @JsonInclude(Include.NON_NULL)
    private String vmHostname = null;

    @JsonProperty("vm_mor")
    @JsonInclude(Include.NON_NULL)
    private String vmMor = null;

    @JsonProperty("vm_name")
    @JsonInclude(Include.NON_NULL)
    private String vmName = null;

    @JsonProperty("vm_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vmUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Optional service categories that a node can be assigned (e.g.
   * System, infrastructure or analytics).
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return categories
   */
  @VsoMethod
  public List<String> getCategories() {
    return categories;
  }

  /**
   * This is the setter method. this will set the categories
   * Optional service categories that a node can be assigned (e.g.
   * System, infrastructure or analytics).
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return categories
   */
  @VsoMethod
  public void setCategories(List<String>  categories) {
    this.categories = categories;
  }

  /**
   * This is the setter method this will set the categories
   * Optional service categories that a node can be assigned (e.g.
   * System, infrastructure or analytics).
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return categories
   */
  @VsoMethod
  public ClusterNode addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Interface details of the controller node.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return interfaces
   */
  @VsoMethod
  public List<ControllerInterface> getInterfaces() {
    return interfaces;
  }

  /**
   * This is the setter method. this will set the interfaces
   * Interface details of the controller node.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return interfaces
   */
  @VsoMethod
  public void setInterfaces(List<ControllerInterface>  interfaces) {
    this.interfaces = interfaces;
  }

  /**
   * This is the setter method this will set the interfaces
   * Interface details of the controller node.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return interfaces
   */
  @VsoMethod
  public ClusterNode addInterfacesItem(ControllerInterface interfacesItem) {
    if (this.interfaces == null) {
      this.interfaces = new ArrayList<ControllerInterface>();
    }
    this.interfaces.add(interfacesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * V4 ip address of controller vm.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * V4 ip address of controller vm.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * V6 ip address of controller vm.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip6
   */
  @VsoMethod
  public IpAddr getIp6() {
    return ip6;
  }

  /**
   * This is the setter method to the attribute.
   * V6 ip address of controller vm.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip6 set the ip6.
   */
  @VsoMethod
  public void setIp6(IpAddr ip6) {
    this.ip6 = ip6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "node".
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "node".
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The password we will use when authenticating with this node (not persisted).
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return password
   */
  @VsoMethod
  public String getPassword() {
    return password;
  }

  /**
   * This is the setter method to the attribute.
   * The password we will use when authenticating with this node (not persisted).
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param password set the password.
   */
  @VsoMethod
  public void setPassword(String  password) {
    this.password = password;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Public ip address or hostname of the controller vm.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return publicIpOrName
   */
  @VsoMethod
  public IpAddr getPublicIpOrName() {
    return publicIpOrName;
  }

  /**
   * This is the setter method to the attribute.
   * Public ip address or hostname of the controller vm.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param publicIpOrName set the publicIpOrName.
   */
  @VsoMethod
  public void setPublicIpOrName(IpAddr publicIpOrName) {
    this.publicIpOrName = publicIpOrName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Static routes configured on the controller node.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return staticRoutes
   */
  @VsoMethod
  public List<StaticRoute> getStaticRoutes() {
    return staticRoutes;
  }

  /**
   * This is the setter method. this will set the staticRoutes
   * Static routes configured on the controller node.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return staticRoutes
   */
  @VsoMethod
  public void setStaticRoutes(List<StaticRoute>  staticRoutes) {
    this.staticRoutes = staticRoutes;
  }

  /**
   * This is the setter method this will set the staticRoutes
   * Static routes configured on the controller node.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return staticRoutes
   */
  @VsoMethod
  public ClusterNode addStaticRoutesItem(StaticRoute staticRoutesItem) {
    if (this.staticRoutes == null) {
      this.staticRoutes = new ArrayList<StaticRoute>();
    }
    this.staticRoutes.add(staticRoutesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Hostname assigned to this controller vm.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vmHostname
   */
  @VsoMethod
  public String getVmHostname() {
    return vmHostname;
  }

  /**
   * This is the setter method to the attribute.
   * Hostname assigned to this controller vm.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vmHostname set the vmHostname.
   */
  @VsoMethod
  public void setVmHostname(String  vmHostname) {
    this.vmHostname = vmHostname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Managed object reference of this controller vm.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vmMor
   */
  @VsoMethod
  public String getVmMor() {
    return vmMor;
  }

  /**
   * This is the setter method to the attribute.
   * Managed object reference of this controller vm.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vmMor set the vmMor.
   */
  @VsoMethod
  public void setVmMor(String  vmMor) {
    this.vmMor = vmMor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the controller vm.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vmName
   */
  @VsoMethod
  public String getVmName() {
    return vmName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the controller vm.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vmName set the vmName.
   */
  @VsoMethod
  public void setVmName(String  vmName) {
    this.vmName = vmName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid on the controller vm.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vmUuid
   */
  @VsoMethod
  public String getVmUuid() {
    return vmUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid on the controller vm.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vmUuid set the vmUuid.
   */
  @VsoMethod
  public void setVmUuid(String  vmUuid) {
    this.vmUuid = vmUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ClusterNode objClusterNode = (ClusterNode) o;
  return   Objects.equals(this.name, objClusterNode.name)&&
  Objects.equals(this.ip, objClusterNode.ip)&&
  Objects.equals(this.vmUuid, objClusterNode.vmUuid)&&
  Objects.equals(this.vmName, objClusterNode.vmName)&&
  Objects.equals(this.vmMor, objClusterNode.vmMor)&&
  Objects.equals(this.vmHostname, objClusterNode.vmHostname)&&
  Objects.equals(this.publicIpOrName, objClusterNode.publicIpOrName)&&
  Objects.equals(this.categories, objClusterNode.categories)&&
  Objects.equals(this.password, objClusterNode.password)&&
  Objects.equals(this.interfaces, objClusterNode.interfaces)&&
  Objects.equals(this.staticRoutes, objClusterNode.staticRoutes)&&
  Objects.equals(this.ip6, objClusterNode.ip6);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ClusterNode {\n");
      sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    ip6: ").append(toIndentedString(ip6)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    publicIpOrName: ").append(toIndentedString(publicIpOrName)).append("\n");
        sb.append("    staticRoutes: ").append(toIndentedString(staticRoutes)).append("\n");
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

