package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DockerRegistry;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.MesosAttribute;
import com.vmware.avi.vro.model.NuageSDNController;
import com.vmware.avi.vro.model.SSHSeDeployment;
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
 * RancherConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "RancherConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_RANCHERCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class RancherConfiguration extends AviRestResource  {
  @JsonProperty("access_key")
  private String accessKey = null;

  @JsonProperty("app_sync_frequency")
  private Integer appSyncFrequency = 60;

  @JsonProperty("container_port_match_http_service")
  private Boolean containerPortMatchHttpService = true;

  @JsonProperty("coredump_directory")
  private String coredumpDirectory = "/var/lib/systemd/coredump";

  @JsonProperty("disable_auto_backend_service_sync")
  private Boolean disableAutoBackendServiceSync = null;

  @JsonProperty("disable_auto_frontend_service_sync")
  private Boolean disableAutoFrontendServiceSync = null;

  @JsonProperty("disable_auto_se_creation")
  private Boolean disableAutoSeCreation = null;

  @JsonProperty("docker_registry_se")
  private DockerRegistry dockerRegistrySe = null;

  @JsonProperty("east_west_placement_subnet")
  private IpAddrPrefix eastWestPlacementSubnet = null;

  @JsonProperty("enable_event_subscription")
  private Boolean enableEventSubscription = true;

  @JsonProperty("feproxy_container_port_as_service")
  private Boolean feproxyContainerPortAsService = null;

  @JsonProperty("feproxy_vips_enable_proxy_arp")
  private Boolean feproxyVipsEnableProxyArp = true;

  @JsonProperty("fleet_endpoint")
  private String fleetEndpoint = null;

  @JsonProperty("http_container_ports")
  @Valid
  private List<Integer> httpContainerPorts = null;

  @JsonProperty("nuage_controller")
  private NuageSDNController nuageController = null;

  @JsonProperty("rancher_servers")
  @Valid
  private List<String> rancherServers = null;

  @JsonProperty("se_deployment_method")
  private String seDeploymentMethod = "SE_CREATE_SSH";

  @JsonProperty("se_exclude_attributes")
  @Valid
  private List<MesosAttribute> seExcludeAttributes = null;

  @JsonProperty("se_include_attributes")
  @Valid
  private List<MesosAttribute> seIncludeAttributes = null;

  @JsonProperty("se_spawn_rate")
  private Integer seSpawnRate = 25;

  @JsonProperty("se_volume")
  private String seVolume = "/opt/avi";

  @JsonProperty("secret_key")
  private String secretKey = null;

  @JsonProperty("services_accessible_all_interfaces")
  private Boolean servicesAccessibleAllInterfaces = null;

  @JsonProperty("ssh_se_deployment")
  private SSHSeDeployment sshSeDeployment = null;

  @JsonProperty("ssh_user_ref")
  private String sshUserRef = null;

  @JsonProperty("use_container_ip_port")
  private Boolean useContainerIpPort = null;

  @JsonProperty("use_controller_image")
  private Boolean useControllerImage = null;

  
  /**
   * Access key.
   * @return accessKey
  **/
  @ApiModelProperty(value = "Access key.")


 
  @VsoMethod  
  public String getAccessKey() {
    return accessKey;
  }
    
  @VsoMethod
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  
  /**
   * Sync frequency in seconds with frameworks.
   * @return appSyncFrequency
  **/
  @ApiModelProperty(value = "Sync frequency in seconds with frameworks.")


 
  @VsoMethod  
  public Integer getAppSyncFrequency() {
    return appSyncFrequency;
  }
    
  @VsoMethod
  public void setAppSyncFrequency(Integer appSyncFrequency) {
    this.appSyncFrequency = appSyncFrequency;
  }

  
  /**
   * Perform container port matching to create a HTTP Virtualservice instead of a TCP/UDP VirtualService.
   * @return containerPortMatchHttpService
  **/
  @ApiModelProperty(value = "Perform container port matching to create a HTTP Virtualservice instead of a TCP/UDP VirtualService.")


 
  @VsoMethod  
  public Boolean isContainerPortMatchHttpService() {
    return containerPortMatchHttpService;
  }
    
  @VsoMethod
  public void setContainerPortMatchHttpService(Boolean containerPortMatchHttpService) {
    this.containerPortMatchHttpService = containerPortMatchHttpService;
  }

  
  /**
   * Directory to mount to check for core dumps on Service Engines. This will be mapped read only to /var/crash on any new Service Engines. This is a disruptive change.
   * @return coredumpDirectory
  **/
  @ApiModelProperty(value = "Directory to mount to check for core dumps on Service Engines. This will be mapped read only to /var/crash on any new Service Engines. This is a disruptive change.")


 
  @VsoMethod  
  public String getCoredumpDirectory() {
    return coredumpDirectory;
  }
    
  @VsoMethod
  public void setCoredumpDirectory(String coredumpDirectory) {
    this.coredumpDirectory = coredumpDirectory;
  }

  
  /**
   * Disable auto service sync for back end services.
   * @return disableAutoBackendServiceSync
  **/
  @ApiModelProperty(value = "Disable auto service sync for back end services.")


 
  @VsoMethod  
  public Boolean isDisableAutoBackendServiceSync() {
    return disableAutoBackendServiceSync;
  }
    
  @VsoMethod
  public void setDisableAutoBackendServiceSync(Boolean disableAutoBackendServiceSync) {
    this.disableAutoBackendServiceSync = disableAutoBackendServiceSync;
  }

  
  /**
   * Disable auto service sync for front end services.
   * @return disableAutoFrontendServiceSync
  **/
  @ApiModelProperty(value = "Disable auto service sync for front end services.")


 
  @VsoMethod  
  public Boolean isDisableAutoFrontendServiceSync() {
    return disableAutoFrontendServiceSync;
  }
    
  @VsoMethod
  public void setDisableAutoFrontendServiceSync(Boolean disableAutoFrontendServiceSync) {
    this.disableAutoFrontendServiceSync = disableAutoFrontendServiceSync;
  }

  
  /**
   * Disable SE creation.
   * @return disableAutoSeCreation
  **/
  @ApiModelProperty(value = "Disable SE creation.")


 
  @VsoMethod  
  public Boolean isDisableAutoSeCreation() {
    return disableAutoSeCreation;
  }
    
  @VsoMethod
  public void setDisableAutoSeCreation(Boolean disableAutoSeCreation) {
    this.disableAutoSeCreation = disableAutoSeCreation;
  }

  
  /**
   * Docker registry for ServiceEngine image.
   * @return dockerRegistrySe
  **/
  @ApiModelProperty(value = "Docker registry for ServiceEngine image.")

  @Valid

 
  @VsoMethod  
  public DockerRegistry getDockerRegistrySe() {
    return dockerRegistrySe;
  }
    
  @VsoMethod
  public void setDockerRegistrySe(DockerRegistry dockerRegistrySe) {
    this.dockerRegistrySe = dockerRegistrySe;
  }

  
  /**
   * Match against this prefix when placing east-west VSs on SEs .
   * @return eastWestPlacementSubnet
  **/
  @ApiModelProperty(value = "Match against this prefix when placing east-west VSs on SEs .")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getEastWestPlacementSubnet() {
    return eastWestPlacementSubnet;
  }
    
  @VsoMethod
  public void setEastWestPlacementSubnet(IpAddrPrefix eastWestPlacementSubnet) {
    this.eastWestPlacementSubnet = eastWestPlacementSubnet;
  }

  
  /**
   * Enable Docker event subscription.
   * @return enableEventSubscription
  **/
  @ApiModelProperty(value = "Enable Docker event subscription.")


 
  @VsoMethod  
  public Boolean isEnableEventSubscription() {
    return enableEventSubscription;
  }
    
  @VsoMethod
  public void setEnableEventSubscription(Boolean enableEventSubscription) {
    this.enableEventSubscription = enableEventSubscription;
  }

  
  /**
   * For Front End proxies, use container port as service port.
   * @return feproxyContainerPortAsService
  **/
  @ApiModelProperty(value = "For Front End proxies, use container port as service port.")


 
  @VsoMethod  
  public Boolean isFeproxyContainerPortAsService() {
    return feproxyContainerPortAsService;
  }
    
  @VsoMethod
  public void setFeproxyContainerPortAsService(Boolean feproxyContainerPortAsService) {
    this.feproxyContainerPortAsService = feproxyContainerPortAsService;
  }

  
  /**
   * Enable proxy ARP from Host interface for Front End  proxies.
   * @return feproxyVipsEnableProxyArp
  **/
  @ApiModelProperty(value = "Enable proxy ARP from Host interface for Front End  proxies.")


 
  @VsoMethod  
  public Boolean isFeproxyVipsEnableProxyArp() {
    return feproxyVipsEnableProxyArp;
  }
    
  @VsoMethod
  public void setFeproxyVipsEnableProxyArp(Boolean feproxyVipsEnableProxyArp) {
    this.feproxyVipsEnableProxyArp = feproxyVipsEnableProxyArp;
  }

  
  /**
   * Optional fleet remote endpoint if fleet is used for SE deployment.
   * @return fleetEndpoint
  **/
  @ApiModelProperty(value = "Optional fleet remote endpoint if fleet is used for SE deployment.")


 
  @VsoMethod  
  public String getFleetEndpoint() {
    return fleetEndpoint;
  }
    
  @VsoMethod
  public void setFleetEndpoint(String fleetEndpoint) {
    this.fleetEndpoint = fleetEndpoint;
  }

  
  public RancherConfiguration addHttpContainerPortsItem(Integer httpContainerPortsItem) {
    if (this.httpContainerPorts == null) {
      this.httpContainerPorts = new ArrayList<Integer>();
    }
    this.httpContainerPorts.add(httpContainerPortsItem);
    return this;
  }
  
  /**
   * List of container ports that create a HTTP Virtualservice instead of a TCP/UDP VirtualService. Defaults to 80.
   * @return httpContainerPorts
  **/
  @ApiModelProperty(value = "List of container ports that create a HTTP Virtualservice instead of a TCP/UDP VirtualService. Defaults to 80.")


 
  @VsoMethod  
  public List<Integer> getHttpContainerPorts() {
    return httpContainerPorts;
  }
    
  @VsoMethod
  public void setHttpContainerPorts(List<Integer> httpContainerPorts) {
    this.httpContainerPorts = httpContainerPorts;
  }

  
  /**
   * Nuage Overlay SDN Controller information.
   * @return nuageController
  **/
  @ApiModelProperty(value = "Nuage Overlay SDN Controller information.")

  @Valid

 
  @VsoMethod  
  public NuageSDNController getNuageController() {
    return nuageController;
  }
    
  @VsoMethod
  public void setNuageController(NuageSDNController nuageController) {
    this.nuageController = nuageController;
  }

  
  public RancherConfiguration addRancherServersItem(String rancherServersItem) {
    if (this.rancherServers == null) {
      this.rancherServers = new ArrayList<String>();
    }
    this.rancherServers.add(rancherServersItem);
    return this;
  }
  
  /**
   * List of Rancher servers; In case of a load balanced Rancher multi cluster, use Virtual IP of the cluster.
   * @return rancherServers
  **/
  @ApiModelProperty(value = "List of Rancher servers; In case of a load balanced Rancher multi cluster, use Virtual IP of the cluster.")


 
  @VsoMethod  
  public List<String> getRancherServers() {
    return rancherServers;
  }
    
  @VsoMethod
  public void setRancherServers(List<String> rancherServers) {
    this.rancherServers = rancherServers;
  }

  
  /**
   * Use Fleet/SSH for SE deployment. Enum options - SE_CREATE_FLEET, SE_CREATE_SSH, SE_CREATE_POD.
   * @return seDeploymentMethod
  **/
  @ApiModelProperty(value = "Use Fleet/SSH for SE deployment. Enum options - SE_CREATE_FLEET, SE_CREATE_SSH, SE_CREATE_POD.")


 
  @VsoMethod  
  public String getSeDeploymentMethod() {
    return seDeploymentMethod;
  }
    
  @VsoMethod
  public void setSeDeploymentMethod(String seDeploymentMethod) {
    this.seDeploymentMethod = seDeploymentMethod;
  }

  
  public RancherConfiguration addSeExcludeAttributesItem(MesosAttribute seExcludeAttributesItem) {
    if (this.seExcludeAttributes == null) {
      this.seExcludeAttributes = new ArrayList<MesosAttribute>();
    }
    this.seExcludeAttributes.add(seExcludeAttributesItem);
    return this;
  }
  
  /**
   * Exclude hosts with attributes for SE creation.
   * @return seExcludeAttributes
  **/
  @ApiModelProperty(value = "Exclude hosts with attributes for SE creation.")

  @Valid

 
  @VsoMethod  
  public List<MesosAttribute> getSeExcludeAttributes() {
    return seExcludeAttributes;
  }
    
  @VsoMethod
  public void setSeExcludeAttributes(List<MesosAttribute> seExcludeAttributes) {
    this.seExcludeAttributes = seExcludeAttributes;
  }

  
  public RancherConfiguration addSeIncludeAttributesItem(MesosAttribute seIncludeAttributesItem) {
    if (this.seIncludeAttributes == null) {
      this.seIncludeAttributes = new ArrayList<MesosAttribute>();
    }
    this.seIncludeAttributes.add(seIncludeAttributesItem);
    return this;
  }
  
  /**
   * Create SEs just on hosts with include attributes.
   * @return seIncludeAttributes
  **/
  @ApiModelProperty(value = "Create SEs just on hosts with include attributes.")

  @Valid

 
  @VsoMethod  
  public List<MesosAttribute> getSeIncludeAttributes() {
    return seIncludeAttributes;
  }
    
  @VsoMethod
  public void setSeIncludeAttributes(List<MesosAttribute> seIncludeAttributes) {
    this.seIncludeAttributes = seIncludeAttributes;
  }

  
  /**
   * New SE spawn rate per minute.
   * @return seSpawnRate
  **/
  @ApiModelProperty(value = "New SE spawn rate per minute.")


 
  @VsoMethod  
  public Integer getSeSpawnRate() {
    return seSpawnRate;
  }
    
  @VsoMethod
  public void setSeSpawnRate(Integer seSpawnRate) {
    this.seSpawnRate = seSpawnRate;
  }

  
  /**
   * Host volume to be used as a disk for Avi SE, This is a disruptive change.
   * @return seVolume
  **/
  @ApiModelProperty(value = "Host volume to be used as a disk for Avi SE, This is a disruptive change.")


 
  @VsoMethod  
  public String getSeVolume() {
    return seVolume;
  }
    
  @VsoMethod
  public void setSeVolume(String seVolume) {
    this.seVolume = seVolume;
  }

  
  /**
   * Secret key.
   * @return secretKey
  **/
  @ApiModelProperty(value = "Secret key.")


 
  @VsoMethod  
  public String getSecretKey() {
    return secretKey;
  }
    
  @VsoMethod
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  
  /**
   * Make service ports accessible on all Host interfaces in addition to East-West VIP and/or bridge IP. Usually enabled AWS clusters to export East-West services on Host interface.
   * @return servicesAccessibleAllInterfaces
  **/
  @ApiModelProperty(value = "Make service ports accessible on all Host interfaces in addition to East-West VIP and/or bridge IP. Usually enabled AWS clusters to export East-West services on Host interface.")


 
  @VsoMethod  
  public Boolean isServicesAccessibleAllInterfaces() {
    return servicesAccessibleAllInterfaces;
  }
    
  @VsoMethod
  public void setServicesAccessibleAllInterfaces(Boolean servicesAccessibleAllInterfaces) {
    this.servicesAccessibleAllInterfaces = servicesAccessibleAllInterfaces;
  }

  
  /**
   * Parameters for SSH SE deployment. Field deprecated in 17.1.1.
   * @return sshSeDeployment
  **/
  @ApiModelProperty(value = "Parameters for SSH SE deployment. Field deprecated in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public SSHSeDeployment getSshSeDeployment() {
    return sshSeDeployment;
  }
    
  @VsoMethod
  public void setSshSeDeployment(SSHSeDeployment sshSeDeployment) {
    this.sshSeDeployment = sshSeDeployment;
  }

  
  /**
   * Cloud connector user uuid for SSH to hosts. It is a reference to an object of type CloudConnectorUser. Field introduced in 17.1.1.
   * @return sshUserRef
  **/
  @ApiModelProperty(value = "Cloud connector user uuid for SSH to hosts. It is a reference to an object of type CloudConnectorUser. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getSshUserRef() {
    return sshUserRef;
  }
    
  @VsoMethod
  public void setSshUserRef(String sshUserRef) {
    this.sshUserRef = sshUserRef;
  }

  
  /**
   * Use container IP address port for pool instead of host IP address hostport. This mode is applicable if the container IP is reachable (not a private NATed IP) from other hosts in a routed environment for containers.
   * @return useContainerIpPort
  **/
  @ApiModelProperty(value = "Use container IP address port for pool instead of host IP address hostport. This mode is applicable if the container IP is reachable (not a private NATed IP) from other hosts in a routed environment for containers.")


 
  @VsoMethod  
  public Boolean isUseContainerIpPort() {
    return useContainerIpPort;
  }
    
  @VsoMethod
  public void setUseContainerIpPort(Boolean useContainerIpPort) {
    this.useContainerIpPort = useContainerIpPort;
  }

  
  /**
   * If true, use controller generated SE docker image via fileservice, else use docker repository image as defined by docker_registry_se.
   * @return useControllerImage
  **/
  @ApiModelProperty(value = "If true, use controller generated SE docker image via fileservice, else use docker repository image as defined by docker_registry_se.")


 
  @VsoMethod  
  public Boolean isUseControllerImage() {
    return useControllerImage;
  }
    
  @VsoMethod
  public void setUseControllerImage(Boolean useControllerImage) {
    this.useControllerImage = useControllerImage;
  }

  
  public String getObjectID() {
		return "RancherConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RancherConfiguration rancherConfiguration = (RancherConfiguration) o;
    return Objects.equals(this.accessKey, rancherConfiguration.accessKey) &&
        Objects.equals(this.appSyncFrequency, rancherConfiguration.appSyncFrequency) &&
        Objects.equals(this.containerPortMatchHttpService, rancherConfiguration.containerPortMatchHttpService) &&
        Objects.equals(this.coredumpDirectory, rancherConfiguration.coredumpDirectory) &&
        Objects.equals(this.disableAutoBackendServiceSync, rancherConfiguration.disableAutoBackendServiceSync) &&
        Objects.equals(this.disableAutoFrontendServiceSync, rancherConfiguration.disableAutoFrontendServiceSync) &&
        Objects.equals(this.disableAutoSeCreation, rancherConfiguration.disableAutoSeCreation) &&
        Objects.equals(this.dockerRegistrySe, rancherConfiguration.dockerRegistrySe) &&
        Objects.equals(this.eastWestPlacementSubnet, rancherConfiguration.eastWestPlacementSubnet) &&
        Objects.equals(this.enableEventSubscription, rancherConfiguration.enableEventSubscription) &&
        Objects.equals(this.feproxyContainerPortAsService, rancherConfiguration.feproxyContainerPortAsService) &&
        Objects.equals(this.feproxyVipsEnableProxyArp, rancherConfiguration.feproxyVipsEnableProxyArp) &&
        Objects.equals(this.fleetEndpoint, rancherConfiguration.fleetEndpoint) &&
        Objects.equals(this.httpContainerPorts, rancherConfiguration.httpContainerPorts) &&
        Objects.equals(this.nuageController, rancherConfiguration.nuageController) &&
        Objects.equals(this.rancherServers, rancherConfiguration.rancherServers) &&
        Objects.equals(this.seDeploymentMethod, rancherConfiguration.seDeploymentMethod) &&
        Objects.equals(this.seExcludeAttributes, rancherConfiguration.seExcludeAttributes) &&
        Objects.equals(this.seIncludeAttributes, rancherConfiguration.seIncludeAttributes) &&
        Objects.equals(this.seSpawnRate, rancherConfiguration.seSpawnRate) &&
        Objects.equals(this.seVolume, rancherConfiguration.seVolume) &&
        Objects.equals(this.secretKey, rancherConfiguration.secretKey) &&
        Objects.equals(this.servicesAccessibleAllInterfaces, rancherConfiguration.servicesAccessibleAllInterfaces) &&
        Objects.equals(this.sshSeDeployment, rancherConfiguration.sshSeDeployment) &&
        Objects.equals(this.sshUserRef, rancherConfiguration.sshUserRef) &&
        Objects.equals(this.useContainerIpPort, rancherConfiguration.useContainerIpPort) &&
        Objects.equals(this.useControllerImage, rancherConfiguration.useControllerImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, appSyncFrequency, containerPortMatchHttpService, coredumpDirectory, disableAutoBackendServiceSync, disableAutoFrontendServiceSync, disableAutoSeCreation, dockerRegistrySe, eastWestPlacementSubnet, enableEventSubscription, feproxyContainerPortAsService, feproxyVipsEnableProxyArp, fleetEndpoint, httpContainerPorts, nuageController, rancherServers, seDeploymentMethod, seExcludeAttributes, seIncludeAttributes, seSpawnRate, seVolume, secretKey, servicesAccessibleAllInterfaces, sshSeDeployment, sshUserRef, useContainerIpPort, useControllerImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RancherConfiguration {\n");
    
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    appSyncFrequency: ").append(toIndentedString(appSyncFrequency)).append("\n");
    sb.append("    containerPortMatchHttpService: ").append(toIndentedString(containerPortMatchHttpService)).append("\n");
    sb.append("    coredumpDirectory: ").append(toIndentedString(coredumpDirectory)).append("\n");
    sb.append("    disableAutoBackendServiceSync: ").append(toIndentedString(disableAutoBackendServiceSync)).append("\n");
    sb.append("    disableAutoFrontendServiceSync: ").append(toIndentedString(disableAutoFrontendServiceSync)).append("\n");
    sb.append("    disableAutoSeCreation: ").append(toIndentedString(disableAutoSeCreation)).append("\n");
    sb.append("    dockerRegistrySe: ").append(toIndentedString(dockerRegistrySe)).append("\n");
    sb.append("    eastWestPlacementSubnet: ").append(toIndentedString(eastWestPlacementSubnet)).append("\n");
    sb.append("    enableEventSubscription: ").append(toIndentedString(enableEventSubscription)).append("\n");
    sb.append("    feproxyContainerPortAsService: ").append(toIndentedString(feproxyContainerPortAsService)).append("\n");
    sb.append("    feproxyVipsEnableProxyArp: ").append(toIndentedString(feproxyVipsEnableProxyArp)).append("\n");
    sb.append("    fleetEndpoint: ").append(toIndentedString(fleetEndpoint)).append("\n");
    sb.append("    httpContainerPorts: ").append(toIndentedString(httpContainerPorts)).append("\n");
    sb.append("    nuageController: ").append(toIndentedString(nuageController)).append("\n");
    sb.append("    rancherServers: ").append(toIndentedString(rancherServers)).append("\n");
    sb.append("    seDeploymentMethod: ").append(toIndentedString(seDeploymentMethod)).append("\n");
    sb.append("    seExcludeAttributes: ").append(toIndentedString(seExcludeAttributes)).append("\n");
    sb.append("    seIncludeAttributes: ").append(toIndentedString(seIncludeAttributes)).append("\n");
    sb.append("    seSpawnRate: ").append(toIndentedString(seSpawnRate)).append("\n");
    sb.append("    seVolume: ").append(toIndentedString(seVolume)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    servicesAccessibleAllInterfaces: ").append(toIndentedString(servicesAccessibleAllInterfaces)).append("\n");
    sb.append("    sshSeDeployment: ").append(toIndentedString(sshSeDeployment)).append("\n");
    sb.append("    sshUserRef: ").append(toIndentedString(sshUserRef)).append("\n");
    sb.append("    useContainerIpPort: ").append(toIndentedString(useContainerIpPort)).append("\n");
    sb.append("    useControllerImage: ").append(toIndentedString(useControllerImage)).append("\n");
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

