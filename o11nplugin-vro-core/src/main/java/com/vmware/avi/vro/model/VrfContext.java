package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.BfdProfile;
import com.vmware.avi.vro.model.BgpProfile;
import com.vmware.avi.vro.model.DebugVrfContext;
import com.vmware.avi.vro.model.GatewayMonitor;
import com.vmware.avi.vro.model.InternalGatewayMonitor;
import com.vmware.avi.vro.model.KeyValue;
import com.vmware.avi.vro.model.StaticRoute;
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
 * VrfContext
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VrfContext")
@VsoFinder(name = Constants.FINDER_VRO_VRFCONTEXT, idAccessor = "getObjectID()")
@Service
public class VrfContext extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("bfd_profile")
  private BfdProfile bfdProfile = null;

  @JsonProperty("bgp_profile")
  private BgpProfile bgpProfile = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("debugvrfcontext")
  private DebugVrfContext debugvrfcontext = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("gateway_mon")
  @Valid
  private List<GatewayMonitor> gatewayMon = null;

  @JsonProperty("internal_gateway_monitor")
  private InternalGatewayMonitor internalGatewayMonitor = null;

  @JsonProperty("labels")
  @Valid
  private List<KeyValue> labels = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("static_routes")
  @Valid
  private List<StaticRoute> staticRoutes = null;

  @JsonProperty("system_default")
  private Boolean systemDefault = null;

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
   * BFD configuration profile. Field introduced in 20.1.1.
   * @return bfdProfile
  **/
  @ApiModelProperty(value = "BFD configuration profile. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public BfdProfile getBfdProfile() {
    return bfdProfile;
  }
    
  @VsoMethod
  public void setBfdProfile(BfdProfile bfdProfile) {
    this.bfdProfile = bfdProfile;
  }

  
  /**
   * Bgp Local and Peer Info.
   * @return bgpProfile
  **/
  @ApiModelProperty(value = "Bgp Local and Peer Info.")

  @Valid

 
  @VsoMethod  
  public BgpProfile getBgpProfile() {
    return bgpProfile;
  }
    
  @VsoMethod
  public void setBgpProfile(BgpProfile bgpProfile) {
    this.bgpProfile = bgpProfile;
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
   * Configure debug flags for VRF. Field introduced in 17.1.1.
   * @return debugvrfcontext
  **/
  @ApiModelProperty(value = "Configure debug flags for VRF. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public DebugVrfContext getDebugvrfcontext() {
    return debugvrfcontext;
  }
    
  @VsoMethod
  public void setDebugvrfcontext(DebugVrfContext debugvrfcontext) {
    this.debugvrfcontext = debugvrfcontext;
  }

  
  /**
   * User defined description for the object.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for the object.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  public VrfContext addGatewayMonItem(GatewayMonitor gatewayMonItem) {
    if (this.gatewayMon == null) {
      this.gatewayMon = new ArrayList<GatewayMonitor>();
    }
    this.gatewayMon.add(gatewayMonItem);
    return this;
  }
  
  /**
   * Configure ping based heartbeat check for gateway in service engines of vrf.
   * @return gatewayMon
  **/
  @ApiModelProperty(value = "Configure ping based heartbeat check for gateway in service engines of vrf.")

  @Valid

 
  @VsoMethod  
  public List<GatewayMonitor> getGatewayMon() {
    return gatewayMon;
  }
    
  @VsoMethod
  public void setGatewayMon(List<GatewayMonitor> gatewayMon) {
    this.gatewayMon = gatewayMon;
  }

  
  /**
   * Configure ping based heartbeat check for all default gateways in service engines of vrf. Field introduced in 17.1.1.
   * @return internalGatewayMonitor
  **/
  @ApiModelProperty(value = "Configure ping based heartbeat check for all default gateways in service engines of vrf. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public InternalGatewayMonitor getInternalGatewayMonitor() {
    return internalGatewayMonitor;
  }
    
  @VsoMethod
  public void setInternalGatewayMonitor(InternalGatewayMonitor internalGatewayMonitor) {
    this.internalGatewayMonitor = internalGatewayMonitor;
  }

  
  public VrfContext addLabelsItem(KeyValue labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<KeyValue>();
    }
    this.labels.add(labelsItem);
    return this;
  }
  
  /**
   * Key/value labels which can be used for Object Access Policy permission scoping. Field introduced in 18.2.7, 20.1.1.
   * @return labels
  **/
  @ApiModelProperty(value = "Key/value labels which can be used for Object Access Policy permission scoping. Field introduced in 18.2.7, 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<KeyValue> getLabels() {
    return labels;
  }
    
  @VsoMethod
  public void setLabels(List<KeyValue> labels) {
    this.labels = labels;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public VrfContext addStaticRoutesItem(StaticRoute staticRoutesItem) {
    if (this.staticRoutes == null) {
      this.staticRoutes = new ArrayList<StaticRoute>();
    }
    this.staticRoutes.add(staticRoutesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property static_routes of obj type VrfContext field type str  type object
   * @return staticRoutes
  **/
  @ApiModelProperty(value = "Placeholder for description of property static_routes of obj type VrfContext field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<StaticRoute> getStaticRoutes() {
    return staticRoutes;
  }
    
  @VsoMethod
  public void setStaticRoutes(List<StaticRoute> staticRoutes) {
    this.staticRoutes = staticRoutes;
  }

  
  /**
   * Placeholder for description of property system_default of obj type VrfContext field type str  type boolean
   * @return systemDefault
  **/
  @ApiModelProperty(value = "Placeholder for description of property system_default of obj type VrfContext field type str  type boolean")


 
  @VsoMethod  
  public Boolean isSystemDefault() {
    return systemDefault;
  }
    
  @VsoMethod
  public void setSystemDefault(Boolean systemDefault) {
    this.systemDefault = systemDefault;
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
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "VrfContext";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VrfContext vrfContext = (VrfContext) o;
    return Objects.equals(this.lastModified, vrfContext.lastModified) &&
        Objects.equals(this.bfdProfile, vrfContext.bfdProfile) &&
        Objects.equals(this.bgpProfile, vrfContext.bgpProfile) &&
        Objects.equals(this.cloudRef, vrfContext.cloudRef) &&
        Objects.equals(this.debugvrfcontext, vrfContext.debugvrfcontext) &&
        Objects.equals(this.description, vrfContext.description) &&
        Objects.equals(this.gatewayMon, vrfContext.gatewayMon) &&
        Objects.equals(this.internalGatewayMonitor, vrfContext.internalGatewayMonitor) &&
        Objects.equals(this.labels, vrfContext.labels) &&
        Objects.equals(this.name, vrfContext.name) &&
        Objects.equals(this.staticRoutes, vrfContext.staticRoutes) &&
        Objects.equals(this.systemDefault, vrfContext.systemDefault) &&
        Objects.equals(this.tenantRef, vrfContext.tenantRef) &&
        Objects.equals(this.url, vrfContext.url) &&
        Objects.equals(this.uuid, vrfContext.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, bfdProfile, bgpProfile, cloudRef, debugvrfcontext, description, gatewayMon, internalGatewayMonitor, labels, name, staticRoutes, systemDefault, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VrfContext {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    bfdProfile: ").append(toIndentedString(bfdProfile)).append("\n");
    sb.append("    bgpProfile: ").append(toIndentedString(bgpProfile)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    debugvrfcontext: ").append(toIndentedString(debugvrfcontext)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gatewayMon: ").append(toIndentedString(gatewayMon)).append("\n");
    sb.append("    internalGatewayMonitor: ").append(toIndentedString(internalGatewayMonitor)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    staticRoutes: ").append(toIndentedString(staticRoutes)).append("\n");
    sb.append("    systemDefault: ").append(toIndentedString(systemDefault)).append("\n");
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

