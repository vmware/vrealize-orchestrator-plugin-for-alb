package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DockerRegistry;
import com.vmware.avi.vro.model.IngAttribute;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.MesosAttribute;
import com.vmware.avi.vro.model.NuageSDNController;
import com.vmware.avi.vro.model.OshiftSharedVirtualService;
import com.vmware.avi.vro.model.PodToleration;
import com.vmware.avi.vro.model.RouteInfo;
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
 * OShiftK8SConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "OShiftK8SConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_OSHIFTK8SCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class OShiftK8SConfiguration extends AviRestResource  {
  @JsonProperty("app_sync_frequency")
  private Integer appSyncFrequency = 300;

  @JsonProperty("auto_assign_fqdn")
  private Boolean autoAssignFqdn = true;

  @JsonProperty("avi_bridge_subnet")
  private IpAddrPrefix aviBridgeSubnet = null;

  @JsonProperty("ca_tls_key_and_certificate_ref")
  private String caTlsKeyAndCertificateRef = null;

  @JsonProperty("client_tls_key_and_certificate_ref")
  private String clientTlsKeyAndCertificateRef = null;

  @JsonProperty("cluster_tag")
  private String clusterTag = null;

  @JsonProperty("container_port_match_http_service")
  private Boolean containerPortMatchHttpService = true;

  @JsonProperty("coredump_directory")
  private String coredumpDirectory = "/var/lib/systemd/coredump";

  @JsonProperty("default_service_as_east_west_service")
  private Boolean defaultServiceAsEastWestService = true;

  @JsonProperty("default_shared_virtualservice")
  private OshiftSharedVirtualService defaultSharedVirtualservice = null;

  @JsonProperty("disable_auto_backend_service_sync")
  private Boolean disableAutoBackendServiceSync = null;

  @JsonProperty("disable_auto_frontend_service_sync")
  private Boolean disableAutoFrontendServiceSync = null;

  @JsonProperty("disable_auto_gs_sync")
  private Boolean disableAutoGsSync = null;

  @JsonProperty("disable_auto_se_creation")
  private Boolean disableAutoSeCreation = null;

  @JsonProperty("docker_endpoint")
  private String dockerEndpoint = "/var/run/docker.sock";

  @JsonProperty("docker_registry_se")
  private DockerRegistry dockerRegistrySe = null;

  @JsonProperty("east_west_placement_subnet")
  private IpAddrPrefix eastWestPlacementSubnet = null;

  @JsonProperty("enable_event_subscription")
  private Boolean enableEventSubscription = true;

  @JsonProperty("enable_route_ingress_hardening")
  private Boolean enableRouteIngressHardening = true;

  @JsonProperty("feproxy_vips_enable_proxy_arp")
  private Boolean feproxyVipsEnableProxyArp = true;

  @JsonProperty("fleet_endpoint")
  private String fleetEndpoint = null;

  @JsonProperty("http_container_ports")
  @Valid
  private List<Integer> httpContainerPorts = null;

  @JsonProperty("ing_exclude_attributes")
  @Valid
  private List<IngAttribute> ingExcludeAttributes = null;

  @JsonProperty("ing_include_attributes")
  @Valid
  private List<IngAttribute> ingIncludeAttributes = null;

  @JsonProperty("l4_health_monitoring")
  private Boolean l4HealthMonitoring = true;

  @JsonProperty("master_nodes")
  @Valid
  private List<String> masterNodes = null;

  @JsonProperty("node_availability_zone_label")
  private String nodeAvailabilityZoneLabel = null;

  @JsonProperty("ns_exclude_attributes")
  @Valid
  private List<MesosAttribute> nsExcludeAttributes = null;

  @JsonProperty("ns_include_attributes")
  @Valid
  private List<MesosAttribute> nsIncludeAttributes = null;

  @JsonProperty("nuage_controller")
  private NuageSDNController nuageController = null;

  @JsonProperty("num_shards")
  private Integer numShards = null;

  @JsonProperty("override_service_ports")
  private Boolean overrideServicePorts = true;

  @JsonProperty("persistent_volume_claim")
  private String persistentVolumeClaim = null;

  @JsonProperty("routes")
  @Valid
  private List<RouteInfo> routes = null;

  @JsonProperty("routes_share_virtualservice")
  private Boolean routesShareVirtualservice = null;

  @JsonProperty("sdn_overlay")
  private Boolean sdnOverlay = true;

  @JsonProperty("se_deployment_method")
  private String seDeploymentMethod = "SE_CREATE_POD";

  @JsonProperty("se_exclude_attributes")
  @Valid
  private List<MesosAttribute> seExcludeAttributes = null;

  @JsonProperty("se_image_pull_secret")
  private String seImagePullSecret = null;

  @JsonProperty("se_include_attributes")
  @Valid
  private List<MesosAttribute> seIncludeAttributes = null;

  @JsonProperty("se_namespace")
  private String seNamespace = "default";

  @JsonProperty("se_pod_tolerations")
  @Valid
  private List<PodToleration> sePodTolerations = null;

  @JsonProperty("se_priority_class")
  private String sePriorityClass = null;

  @JsonProperty("se_restart_batch_size")
  private Integer seRestartBatchSize = 1;

  @JsonProperty("se_restart_force")
  private Boolean seRestartForce = null;

  @JsonProperty("se_spawn_rate")
  private Integer seSpawnRate = 25;

  @JsonProperty("se_volume")
  private String seVolume = "/var/lib/avi";

  @JsonProperty("secure_egress_mode")
  private Boolean secureEgressMode = null;

  @JsonProperty("service_account_token")
  private String serviceAccountToken = null;

  @JsonProperty("service_port_match_http_service")
  private Boolean servicePortMatchHttpService = null;

  @JsonProperty("shard_prefix")
  private String shardPrefix = null;

  @JsonProperty("shared_virtualservice_namespace")
  private Boolean sharedVirtualserviceNamespace = null;

  @JsonProperty("ssh_se_deployment")
  private SSHSeDeployment sshSeDeployment = null;

  @JsonProperty("ssh_user_ref")
  private String sshUserRef = null;

  @JsonProperty("sync_not_ready_addresses")
  private Boolean syncNotReadyAddresses = true;

  @JsonProperty("use_controller_image")
  private Boolean useControllerImage = null;

  @JsonProperty("use_resource_definition_as_ssot")
  private Boolean useResourceDefinitionAsSsot = null;

  @JsonProperty("use_scheduling_disabled_nodes")
  private Boolean useSchedulingDisabledNodes = null;

  @JsonProperty("use_service_cluster_ip_as_ew_vip")
  private Boolean useServiceClusterIpAsEwVip = null;

  @JsonProperty("vip_default_gateway")
  private IpAddr vipDefaultGateway = null;

  
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
   * Auto assign FQDN to a virtual service if a valid FQDN is not configured. Field introduced in 17.2.8.
   * @return autoAssignFqdn
  **/
  @ApiModelProperty(value = "Auto assign FQDN to a virtual service if a valid FQDN is not configured. Field introduced in 17.2.8.")


 
  @VsoMethod  
  public Boolean isAutoAssignFqdn() {
    return autoAssignFqdn;
  }
    
  @VsoMethod
  public void setAutoAssignFqdn(Boolean autoAssignFqdn) {
    this.autoAssignFqdn = autoAssignFqdn;
  }

  
  /**
   * Avi Linux bridge subnet on OpenShift/K8s nodes.
   * @return aviBridgeSubnet
  **/
  @ApiModelProperty(value = "Avi Linux bridge subnet on OpenShift/K8s nodes.")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getAviBridgeSubnet() {
    return aviBridgeSubnet;
  }
    
  @VsoMethod
  public void setAviBridgeSubnet(IpAddrPrefix aviBridgeSubnet) {
    this.aviBridgeSubnet = aviBridgeSubnet;
  }

  
  /**
   * UUID of the UCP CA TLS cert and key. It is a reference to an object of type SSLKeyAndCertificate.
   * @return caTlsKeyAndCertificateRef
  **/
  @ApiModelProperty(value = "UUID of the UCP CA TLS cert and key. It is a reference to an object of type SSLKeyAndCertificate.")


 
  @VsoMethod  
  public String getCaTlsKeyAndCertificateRef() {
    return caTlsKeyAndCertificateRef;
  }
    
  @VsoMethod
  public void setCaTlsKeyAndCertificateRef(String caTlsKeyAndCertificateRef) {
    this.caTlsKeyAndCertificateRef = caTlsKeyAndCertificateRef;
  }

  
  /**
   * UUID of the client TLS cert and key instead of service account token. One of client certificate or token is required. It is a reference to an object of type SSLKeyAndCertificate.
   * @return clientTlsKeyAndCertificateRef
  **/
  @ApiModelProperty(value = "UUID of the client TLS cert and key instead of service account token. One of client certificate or token is required. It is a reference to an object of type SSLKeyAndCertificate.")


 
  @VsoMethod  
  public String getClientTlsKeyAndCertificateRef() {
    return clientTlsKeyAndCertificateRef;
  }
    
  @VsoMethod
  public void setClientTlsKeyAndCertificateRef(String clientTlsKeyAndCertificateRef) {
    this.clientTlsKeyAndCertificateRef = clientTlsKeyAndCertificateRef;
  }

  
  /**
   * Openshift/K8S Cluster ID used to uniquely map same named namespaces as tenants in Avi. In order to use more than one OpenShift/K8S cloud on this controller, cluster_tag has to be unique across these clouds. Changing cluster_tag is disruptive as all virtual services in the cloud will be recreated. Field introduced in 17.2.5.
   * @return clusterTag
  **/
  @ApiModelProperty(value = "Openshift/K8S Cluster ID used to uniquely map same named namespaces as tenants in Avi. In order to use more than one OpenShift/K8S cloud on this controller, cluster_tag has to be unique across these clouds. Changing cluster_tag is disruptive as all virtual services in the cloud will be recreated. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getClusterTag() {
    return clusterTag;
  }
    
  @VsoMethod
  public void setClusterTag(String clusterTag) {
    this.clusterTag = clusterTag;
  }

  
  /**
   * Perform container port matching to create a HTTP Virtualservice instead of a TCP/UDP VirtualService. By default, ports 80, 8080, 443, 8443 are considered HTTP.
   * @return containerPortMatchHttpService
  **/
  @ApiModelProperty(value = "Perform container port matching to create a HTTP Virtualservice instead of a TCP/UDP VirtualService. By default, ports 80, 8080, 443, 8443 are considered HTTP.")


 
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
   * If there is no explicit east_west_placement field in virtualservice configuration, treat service as a East-West service; default services such a OpenShift API server do not have virtualservice configuration.
   * @return defaultServiceAsEastWestService
  **/
  @ApiModelProperty(value = "If there is no explicit east_west_placement field in virtualservice configuration, treat service as a East-West service; default services such a OpenShift API server do not have virtualservice configuration.")


 
  @VsoMethod  
  public Boolean isDefaultServiceAsEastWestService() {
    return defaultServiceAsEastWestService;
  }
    
  @VsoMethod
  public void setDefaultServiceAsEastWestService(Boolean defaultServiceAsEastWestService) {
    this.defaultServiceAsEastWestService = defaultServiceAsEastWestService;
  }

  
  /**
   * Deprecated. Field deprecated in 17.1.9. Field introduced in 17.1.1.
   * @return defaultSharedVirtualservice
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 17.1.9. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public OshiftSharedVirtualService getDefaultSharedVirtualservice() {
    return defaultSharedVirtualservice;
  }
    
  @VsoMethod
  public void setDefaultSharedVirtualservice(OshiftSharedVirtualService defaultSharedVirtualservice) {
    this.defaultSharedVirtualservice = defaultSharedVirtualservice;
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
   * Disable auto sync for GSLB services. Field introduced in 17.1.3.
   * @return disableAutoGsSync
  **/
  @ApiModelProperty(value = "Disable auto sync for GSLB services. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Boolean isDisableAutoGsSync() {
    return disableAutoGsSync;
  }
    
  @VsoMethod
  public void setDisableAutoGsSync(Boolean disableAutoGsSync) {
    this.disableAutoGsSync = disableAutoGsSync;
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
   * Host Docker server UNIX socket endpoint. Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return dockerEndpoint
  **/
  @ApiModelProperty(value = "Host Docker server UNIX socket endpoint. Field introduced in 17.2.14, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public String getDockerEndpoint() {
    return dockerEndpoint;
  }
    
  @VsoMethod
  public void setDockerEndpoint(String dockerEndpoint) {
    this.dockerEndpoint = dockerEndpoint;
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
   * Enable Kubernetes event subscription.
   * @return enableEventSubscription
  **/
  @ApiModelProperty(value = "Enable Kubernetes event subscription.")


 
  @VsoMethod  
  public Boolean isEnableEventSubscription() {
    return enableEventSubscription;
  }
    
  @VsoMethod
  public void setEnableEventSubscription(Boolean enableEventSubscription) {
    this.enableEventSubscription = enableEventSubscription;
  }

  
  /**
   * Knob to turn on adding of HTTP drop rules for host and path combinations in incoming request header, specified as part of Ingress/Route spec. The default state is to enable this behavior. Note  Toggling this knob only affects any new routes/ingresses, existing routes/ingresses present in Avi will continue to function as-is. Field introduced in 18.2.6.
   * @return enableRouteIngressHardening
  **/
  @ApiModelProperty(value = "Knob to turn on adding of HTTP drop rules for host and path combinations in incoming request header, specified as part of Ingress/Route spec. The default state is to enable this behavior. Note  Toggling this knob only affects any new routes/ingresses, existing routes/ingresses present in Avi will continue to function as-is. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isEnableRouteIngressHardening() {
    return enableRouteIngressHardening;
  }
    
  @VsoMethod
  public void setEnableRouteIngressHardening(Boolean enableRouteIngressHardening) {
    this.enableRouteIngressHardening = enableRouteIngressHardening;
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
   * Optional fleet remote endpoint if fleet is used for SE deployment. Field deprecated in 17.2.13,18.1.5,18.2.1.
   * @return fleetEndpoint
  **/
  @ApiModelProperty(value = "Optional fleet remote endpoint if fleet is used for SE deployment. Field deprecated in 17.2.13,18.1.5,18.2.1.")


 
  @VsoMethod  
  public String getFleetEndpoint() {
    return fleetEndpoint;
  }
    
  @VsoMethod
  public void setFleetEndpoint(String fleetEndpoint) {
    this.fleetEndpoint = fleetEndpoint;
  }

  
  public OShiftK8SConfiguration addHttpContainerPortsItem(Integer httpContainerPortsItem) {
    if (this.httpContainerPorts == null) {
      this.httpContainerPorts = new ArrayList<Integer>();
    }
    this.httpContainerPorts.add(httpContainerPortsItem);
    return this;
  }
  
  /**
   * List of container ports that create a HTTP Virtualservice instead of a TCP/UDP VirtualService. Defaults to 80, 8080, 443 and 8443.
   * @return httpContainerPorts
  **/
  @ApiModelProperty(value = "List of container ports that create a HTTP Virtualservice instead of a TCP/UDP VirtualService. Defaults to 80, 8080, 443 and 8443.")


 
  @VsoMethod  
  public List<Integer> getHttpContainerPorts() {
    return httpContainerPorts;
  }
    
  @VsoMethod
  public void setHttpContainerPorts(List<Integer> httpContainerPorts) {
    this.httpContainerPorts = httpContainerPorts;
  }

  
  public OShiftK8SConfiguration addIngExcludeAttributesItem(IngAttribute ingExcludeAttributesItem) {
    if (this.ingExcludeAttributes == null) {
      this.ingExcludeAttributes = new ArrayList<IngAttribute>();
    }
    this.ingExcludeAttributes.add(ingExcludeAttributesItem);
    return this;
  }
  
  /**
   * Do not sync applications only for ingress that have these exclude attributes configured. Field introduced in 17.2.15, 18.1.5, 18.2.1.
   * @return ingExcludeAttributes
  **/
  @ApiModelProperty(value = "Do not sync applications only for ingress that have these exclude attributes configured. Field introduced in 17.2.15, 18.1.5, 18.2.1.")

  @Valid

 
  @VsoMethod  
  public List<IngAttribute> getIngExcludeAttributes() {
    return ingExcludeAttributes;
  }
    
  @VsoMethod
  public void setIngExcludeAttributes(List<IngAttribute> ingExcludeAttributes) {
    this.ingExcludeAttributes = ingExcludeAttributes;
  }

  
  public OShiftK8SConfiguration addIngIncludeAttributesItem(IngAttribute ingIncludeAttributesItem) {
    if (this.ingIncludeAttributes == null) {
      this.ingIncludeAttributes = new ArrayList<IngAttribute>();
    }
    this.ingIncludeAttributes.add(ingIncludeAttributesItem);
    return this;
  }
  
  /**
   * Sync applications only for ingress objects that have these include attributes configured. Default values are populated for this field if not provided. The default value are  'attribute'  'kubernetes.io/ingress.class', 'value' 'avi'. Field introduced in 17.2.15, 18.1.5, 18.2.1.
   * @return ingIncludeAttributes
  **/
  @ApiModelProperty(value = "Sync applications only for ingress objects that have these include attributes configured. Default values are populated for this field if not provided. The default value are  'attribute'  'kubernetes.io/ingress.class', 'value' 'avi'. Field introduced in 17.2.15, 18.1.5, 18.2.1.")

  @Valid

 
  @VsoMethod  
  public List<IngAttribute> getIngIncludeAttributes() {
    return ingIncludeAttributes;
  }
    
  @VsoMethod
  public void setIngIncludeAttributes(List<IngAttribute> ingIncludeAttributes) {
    this.ingIncludeAttributes = ingIncludeAttributes;
  }

  
  /**
   * Perform Layer4 (TCP/UDP) health monitoring even for Layer7 (HTTP) Pools.
   * @return l4HealthMonitoring
  **/
  @ApiModelProperty(value = "Perform Layer4 (TCP/UDP) health monitoring even for Layer7 (HTTP) Pools.")


 
  @VsoMethod  
  public Boolean isL4HealthMonitoring() {
    return l4HealthMonitoring;
  }
    
  @VsoMethod
  public void setL4HealthMonitoring(Boolean l4HealthMonitoring) {
    this.l4HealthMonitoring = l4HealthMonitoring;
  }

  
  public OShiftK8SConfiguration addMasterNodesItem(String masterNodesItem) {
    if (this.masterNodes == null) {
      this.masterNodes = new ArrayList<String>();
    }
    this.masterNodes.add(masterNodesItem);
    return this;
  }
  
  /**
   * List of OpenShift/Kubernetes master nodes; In case of a load balanced OpenShift/K8S cluster, use Virtual IP of the cluster. Each node is of the form node 8443 or http //node 8080. If scheme is not provided, https is assumed.
   * @return masterNodes
  **/
  @ApiModelProperty(value = "List of OpenShift/Kubernetes master nodes; In case of a load balanced OpenShift/K8S cluster, use Virtual IP of the cluster. Each node is of the form node 8443 or http //node 8080. If scheme is not provided, https is assumed.")


 
  @VsoMethod  
  public List<String> getMasterNodes() {
    return masterNodes;
  }
    
  @VsoMethod
  public void setMasterNodes(List<String> masterNodes) {
    this.masterNodes = masterNodes;
  }

  
  /**
   * OpenShift/K8S Node label to be used as OpenShift/K8S Node's availability zone in a dual availability zone deployment. ServiceEngines belonging to the availability zone will be rebooted during a manual DR failover.
   * @return nodeAvailabilityZoneLabel
  **/
  @ApiModelProperty(value = "OpenShift/K8S Node label to be used as OpenShift/K8S Node's availability zone in a dual availability zone deployment. ServiceEngines belonging to the availability zone will be rebooted during a manual DR failover.")


 
  @VsoMethod  
  public String getNodeAvailabilityZoneLabel() {
    return nodeAvailabilityZoneLabel;
  }
    
  @VsoMethod
  public void setNodeAvailabilityZoneLabel(String nodeAvailabilityZoneLabel) {
    this.nodeAvailabilityZoneLabel = nodeAvailabilityZoneLabel;
  }

  
  public OShiftK8SConfiguration addNsExcludeAttributesItem(MesosAttribute nsExcludeAttributesItem) {
    if (this.nsExcludeAttributes == null) {
      this.nsExcludeAttributes = new ArrayList<MesosAttribute>();
    }
    this.nsExcludeAttributes.add(nsExcludeAttributesItem);
    return this;
  }
  
  /**
   * Syncing of applications is disabled only for namespaces/projects that have these exclude attributes configured. If there are apps synced already for these namespaces, they will be removed from Avi. Field introduced in 17.1.9,17.2.3.
   * @return nsExcludeAttributes
  **/
  @ApiModelProperty(value = "Syncing of applications is disabled only for namespaces/projects that have these exclude attributes configured. If there are apps synced already for these namespaces, they will be removed from Avi. Field introduced in 17.1.9,17.2.3.")

  @Valid

 
  @VsoMethod  
  public List<MesosAttribute> getNsExcludeAttributes() {
    return nsExcludeAttributes;
  }
    
  @VsoMethod
  public void setNsExcludeAttributes(List<MesosAttribute> nsExcludeAttributes) {
    this.nsExcludeAttributes = nsExcludeAttributes;
  }

  
  public OShiftK8SConfiguration addNsIncludeAttributesItem(MesosAttribute nsIncludeAttributesItem) {
    if (this.nsIncludeAttributes == null) {
      this.nsIncludeAttributes = new ArrayList<MesosAttribute>();
    }
    this.nsIncludeAttributes.add(nsIncludeAttributesItem);
    return this;
  }
  
  /**
   * Sync applications only for namespaces/projects that have these include attributes configured. Field introduced in 17.1.9,17.2.3.
   * @return nsIncludeAttributes
  **/
  @ApiModelProperty(value = "Sync applications only for namespaces/projects that have these include attributes configured. Field introduced in 17.1.9,17.2.3.")

  @Valid

 
  @VsoMethod  
  public List<MesosAttribute> getNsIncludeAttributes() {
    return nsIncludeAttributes;
  }
    
  @VsoMethod
  public void setNsIncludeAttributes(List<MesosAttribute> nsIncludeAttributes) {
    this.nsIncludeAttributes = nsIncludeAttributes;
  }

  
  /**
   * Nuage Overlay SDN Controller information. Field deprecated in 17.2.13,18.1.5,18.2.1.
   * @return nuageController
  **/
  @ApiModelProperty(value = "Nuage Overlay SDN Controller information. Field deprecated in 17.2.13,18.1.5,18.2.1.")

  @Valid

 
  @VsoMethod  
  public NuageSDNController getNuageController() {
    return nuageController;
  }
    
  @VsoMethod
  public void setNuageController(NuageSDNController nuageController) {
    this.nuageController = nuageController;
  }

  
  /**
   * Enables sharding of Routes and Ingresses to this number (if non zero) of virtual services in the admin tenant per SEGroup. Sharding is done by hashing on the namespace of the Ingress/Route object. This knob is valid only if shared_virtualservice_namespace flag is set. Field introduced in 18.2.5.
   * @return numShards
  **/
  @ApiModelProperty(value = "Enables sharding of Routes and Ingresses to this number (if non zero) of virtual services in the admin tenant per SEGroup. Sharding is done by hashing on the namespace of the Ingress/Route object. This knob is valid only if shared_virtualservice_namespace flag is set. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getNumShards() {
    return numShards;
  }
    
  @VsoMethod
  public void setNumShards(Integer numShards) {
    this.numShards = numShards;
  }

  
  /**
   * Override Service Ports with well known ports (80/443) for http/https Route/Ingress VirtualServices. Field introduced in 17.2.12,18.1.3.
   * @return overrideServicePorts
  **/
  @ApiModelProperty(value = "Override Service Ports with well known ports (80/443) for http/https Route/Ingress VirtualServices. Field introduced in 17.2.12,18.1.3.")


 
  @VsoMethod  
  public Boolean isOverrideServicePorts() {
    return overrideServicePorts;
  }
    
  @VsoMethod
  public void setOverrideServicePorts(Boolean overrideServicePorts) {
    this.overrideServicePorts = overrideServicePorts;
  }

  
  /**
   * Persistent Volume Claim name to be used for persistent storage for Avi service engines. This could be used in scenarios where host based volumes are ephemeral. Refer https //kubernetes.io/docs/concepts/storage/persistent-volumes/#persistentvolumeclaims for more details on the usage of this field. Field introduced in 18.2.6.
   * @return persistentVolumeClaim
  **/
  @ApiModelProperty(value = "Persistent Volume Claim name to be used for persistent storage for Avi service engines. This could be used in scenarios where host based volumes are ephemeral. Refer https //kubernetes.io/docs/concepts/storage/persistent-volumes/#persistentvolumeclaims for more details on the usage of this field. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }
    
  @VsoMethod
  public void setPersistentVolumeClaim(String persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }

  
  public OShiftK8SConfiguration addRoutesItem(RouteInfo routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<RouteInfo>();
    }
    this.routes.add(routesItem);
    return this;
  }
  
  /**
   * Routes support adding routes to a particular namespace routing table in Openshift/K8s cluster. Each route is a combination of subnet and nexthop ip address or nexthop interface name, and a enum type is used to distinguish an entry in the host (default behaviour) or in the container/pod or in other namespace. This knob should be enabled in the following cases  1. Forwarding the network packets to the same network interface from where it came from in the OpenShift/K8s node. 2. OpenShift/K8s Node connected to the Internet via multiple network interfaces on different networks/ISPs.3. Handling North-South traffic originating from with in the node when the default gateway for outgoing traffic of vs is configured.4. Handling the container/pod traffic by adding the routes in the container/pod. Field introduced in 18.2.6.
   * @return routes
  **/
  @ApiModelProperty(value = "Routes support adding routes to a particular namespace routing table in Openshift/K8s cluster. Each route is a combination of subnet and nexthop ip address or nexthop interface name, and a enum type is used to distinguish an entry in the host (default behaviour) or in the container/pod or in other namespace. This knob should be enabled in the following cases  1. Forwarding the network packets to the same network interface from where it came from in the OpenShift/K8s node. 2. OpenShift/K8s Node connected to the Internet via multiple network interfaces on different networks/ISPs.3. Handling North-South traffic originating from with in the node when the default gateway for outgoing traffic of vs is configured.4. Handling the container/pod traffic by adding the routes in the container/pod. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public List<RouteInfo> getRoutes() {
    return routes;
  }
    
  @VsoMethod
  public void setRoutes(List<RouteInfo> routes) {
    this.routes = routes;
  }

  
  /**
   * Deprecated. Field deprecated in 17.1.9. Field introduced in 17.1.1.
   * @return routesShareVirtualservice
  **/
  @ApiModelProperty(value = "Deprecated. Field deprecated in 17.1.9. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isRoutesShareVirtualservice() {
    return routesShareVirtualservice;
  }
    
  @VsoMethod
  public void setRoutesShareVirtualservice(Boolean routesShareVirtualservice) {
    this.routesShareVirtualservice = routesShareVirtualservice;
  }

  
  /**
   * Cluster uses overlay based SDN. Enable this flag if cluster uses a overlay based SDN for OpenShift, Flannel, Weave, Nuage. Disable for routed mode.
   * @return sdnOverlay
  **/
  @ApiModelProperty(value = "Cluster uses overlay based SDN. Enable this flag if cluster uses a overlay based SDN for OpenShift, Flannel, Weave, Nuage. Disable for routed mode.")


 
  @VsoMethod  
  public Boolean isSdnOverlay() {
    return sdnOverlay;
  }
    
  @VsoMethod
  public void setSdnOverlay(Boolean sdnOverlay) {
    this.sdnOverlay = sdnOverlay;
  }

  
  /**
   * Use SSH/Pod for SE deployment. Enum options - SE_CREATE_FLEET, SE_CREATE_SSH, SE_CREATE_POD.
   * @return seDeploymentMethod
  **/
  @ApiModelProperty(value = "Use SSH/Pod for SE deployment. Enum options - SE_CREATE_FLEET, SE_CREATE_SSH, SE_CREATE_POD.")


 
  @VsoMethod  
  public String getSeDeploymentMethod() {
    return seDeploymentMethod;
  }
    
  @VsoMethod
  public void setSeDeploymentMethod(String seDeploymentMethod) {
    this.seDeploymentMethod = seDeploymentMethod;
  }

  
  public OShiftK8SConfiguration addSeExcludeAttributesItem(MesosAttribute seExcludeAttributesItem) {
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

  
  /**
   * OpenShift/K8S secret name to be used for private docker repos when deploying SE as a Pod. Reference Link  https //kubernetes.io/docs/tasks/configure-pod-container/pull-image-private-registry/. Field introduced in 17.2.13,18.1.3,18.2.1.
   * @return seImagePullSecret
  **/
  @ApiModelProperty(value = "OpenShift/K8S secret name to be used for private docker repos when deploying SE as a Pod. Reference Link  https //kubernetes.io/docs/tasks/configure-pod-container/pull-image-private-registry/. Field introduced in 17.2.13,18.1.3,18.2.1.")


 
  @VsoMethod  
  public String getSeImagePullSecret() {
    return seImagePullSecret;
  }
    
  @VsoMethod
  public void setSeImagePullSecret(String seImagePullSecret) {
    this.seImagePullSecret = seImagePullSecret;
  }

  
  public OShiftK8SConfiguration addSeIncludeAttributesItem(MesosAttribute seIncludeAttributesItem) {
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
   * Kubernetes namespace to be used for deploying Avi service engines. This namespace is used to create daemonsets, service accounts, etc. for Avi only use. Setting this value is a disruptive operation and assumes the namespace exists in kubernetes. 'default' namespace is picked if this field is unset. Field introduced in 18.2.6.
   * @return seNamespace
  **/
  @ApiModelProperty(value = "Kubernetes namespace to be used for deploying Avi service engines. This namespace is used to create daemonsets, service accounts, etc. for Avi only use. Setting this value is a disruptive operation and assumes the namespace exists in kubernetes. 'default' namespace is picked if this field is unset. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getSeNamespace() {
    return seNamespace;
  }
    
  @VsoMethod
  public void setSeNamespace(String seNamespace) {
    this.seNamespace = seNamespace;
  }

  
  public OShiftK8SConfiguration addSePodTolerationsItem(PodToleration sePodTolerationsItem) {
    if (this.sePodTolerations == null) {
      this.sePodTolerations = new ArrayList<PodToleration>();
    }
    this.sePodTolerations.add(sePodTolerationsItem);
    return this;
  }
  
  /**
   * Match SE Pod tolerations against taints of OpenShift/K8S nodes https //kubernetes.io/docs/concepts/configuration/taint-and-toleration/. Field introduced in 17.2.14, 18.1.5, 18.2.1.
   * @return sePodTolerations
  **/
  @ApiModelProperty(value = "Match SE Pod tolerations against taints of OpenShift/K8S nodes https //kubernetes.io/docs/concepts/configuration/taint-and-toleration/. Field introduced in 17.2.14, 18.1.5, 18.2.1.")

  @Valid

 
  @VsoMethod  
  public List<PodToleration> getSePodTolerations() {
    return sePodTolerations;
  }
    
  @VsoMethod
  public void setSePodTolerations(List<PodToleration> sePodTolerations) {
    this.sePodTolerations = sePodTolerations;
  }

  
  /**
   * Priority class for AVI SEs when running as pods. User is expected to have the priority class (with this name) created in Kubernetes, beforehand. If the priority class doesn't exist while assigning this field, the SE pods may not start. If empty no priority class will be used for deploying SE pods (default behaviour). Field introduced in 18.2.6.
   * @return sePriorityClass
  **/
  @ApiModelProperty(value = "Priority class for AVI SEs when running as pods. User is expected to have the priority class (with this name) created in Kubernetes, beforehand. If the priority class doesn't exist while assigning this field, the SE pods may not start. If empty no priority class will be used for deploying SE pods (default behaviour). Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getSePriorityClass() {
    return sePriorityClass;
  }
    
  @VsoMethod
  public void setSePriorityClass(String sePriorityClass) {
    this.sePriorityClass = sePriorityClass;
  }

  
  /**
   * Restart ServiceEngines by batch on ServiceEngineGroup updates (cpu, memory..etc). Field introduced in 17.2.15, 18.1.5, 18.2.1.
   * @return seRestartBatchSize
  **/
  @ApiModelProperty(value = "Restart ServiceEngines by batch on ServiceEngineGroup updates (cpu, memory..etc). Field introduced in 17.2.15, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Integer getSeRestartBatchSize() {
    return seRestartBatchSize;
  }
    
  @VsoMethod
  public void setSeRestartBatchSize(Integer seRestartBatchSize) {
    this.seRestartBatchSize = seRestartBatchSize;
  }

  
  /**
   * Restart ServiceEngines forcely if VirtualServices failed to migrate to another SE. Field introduced in 17.2.15, 18.1.5, 18.2.1.
   * @return seRestartForce
  **/
  @ApiModelProperty(value = "Restart ServiceEngines forcely if VirtualServices failed to migrate to another SE. Field introduced in 17.2.15, 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Boolean isSeRestartForce() {
    return seRestartForce;
  }
    
  @VsoMethod
  public void setSeRestartForce(Boolean seRestartForce) {
    this.seRestartForce = seRestartForce;
  }

  
  /**
   * New SE spawn rate per minute. Field deprecated in 17.2.13,18.1.5,18.2.1.
   * @return seSpawnRate
  **/
  @ApiModelProperty(value = "New SE spawn rate per minute. Field deprecated in 17.2.13,18.1.5,18.2.1.")


 
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
   * Allow Avi Vantage to create SecurityContextConstraints and ServiceAccounts which allow Egress Pods to run in privileged mode in an Openshift environment. Enabling this would exclude egress services from 'disable_auto_backend_service_sync' (if set) behaviour. Note  Access credentials must have cluster-admin role privileges. Field introduced in 17.1.1.
   * @return secureEgressMode
  **/
  @ApiModelProperty(value = "Allow Avi Vantage to create SecurityContextConstraints and ServiceAccounts which allow Egress Pods to run in privileged mode in an Openshift environment. Enabling this would exclude egress services from 'disable_auto_backend_service_sync' (if set) behaviour. Note  Access credentials must have cluster-admin role privileges. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isSecureEgressMode() {
    return secureEgressMode;
  }
    
  @VsoMethod
  public void setSecureEgressMode(Boolean secureEgressMode) {
    this.secureEgressMode = secureEgressMode;
  }

  
  /**
   * Authorization token for service account instead of client certificate. One of client certificate or token is required.
   * @return serviceAccountToken
  **/
  @ApiModelProperty(value = "Authorization token for service account instead of client certificate. One of client certificate or token is required.")


 
  @VsoMethod  
  public String getServiceAccountToken() {
    return serviceAccountToken;
  }
    
  @VsoMethod
  public void setServiceAccountToken(String serviceAccountToken) {
    this.serviceAccountToken = serviceAccountToken;
  }

  
  /**
   * Perform service port matching to create a HTTP Virtualservice instead of a TCP/UDP VirtualService. Field deprecated in 17.2.11,18.1.2.
   * @return servicePortMatchHttpService
  **/
  @ApiModelProperty(value = "Perform service port matching to create a HTTP Virtualservice instead of a TCP/UDP VirtualService. Field deprecated in 17.2.11,18.1.2.")


 
  @VsoMethod  
  public Boolean isServicePortMatchHttpService() {
    return servicePortMatchHttpService;
  }
    
  @VsoMethod
  public void setServicePortMatchHttpService(Boolean servicePortMatchHttpService) {
    this.servicePortMatchHttpService = servicePortMatchHttpService;
  }

  
  /**
   * Prefix to be used for Shard VS name when num_shards knob is non zero. Format for Shard VS name will be <shard_prefix>-<idx>-CloudName-SEGroupName. Field introduced in 18.2.5.
   * @return shardPrefix
  **/
  @ApiModelProperty(value = "Prefix to be used for Shard VS name when num_shards knob is non zero. Format for Shard VS name will be <shard_prefix>-<idx>-CloudName-SEGroupName. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getShardPrefix() {
    return shardPrefix;
  }
    
  @VsoMethod
  public void setShardPrefix(String shardPrefix) {
    this.shardPrefix = shardPrefix;
  }

  
  /**
   * Projects/Namespaces use a shared virtualservice for http/https Routes and Ingress objects unless overriden by the avi_virtualservice  dedicated|shared annotation. Field introduced in 17.1.9,17.2.3.
   * @return sharedVirtualserviceNamespace
  **/
  @ApiModelProperty(value = "Projects/Namespaces use a shared virtualservice for http/https Routes and Ingress objects unless overriden by the avi_virtualservice  dedicated|shared annotation. Field introduced in 17.1.9,17.2.3.")


 
  @VsoMethod  
  public Boolean isSharedVirtualserviceNamespace() {
    return sharedVirtualserviceNamespace;
  }
    
  @VsoMethod
  public void setSharedVirtualserviceNamespace(Boolean sharedVirtualserviceNamespace) {
    this.sharedVirtualserviceNamespace = sharedVirtualserviceNamespace;
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
   * Allow the not_ready_addresses in the kubernetes endpoint object to be added as servers in the AVI pool object. Field introduced in 18.2.5.
   * @return syncNotReadyAddresses
  **/
  @ApiModelProperty(value = "Allow the not_ready_addresses in the kubernetes endpoint object to be added as servers in the AVI pool object. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isSyncNotReadyAddresses() {
    return syncNotReadyAddresses;
  }
    
  @VsoMethod
  public void setSyncNotReadyAddresses(Boolean syncNotReadyAddresses) {
    this.syncNotReadyAddresses = syncNotReadyAddresses;
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

  
  /**
   * Use OpenShift/Kubernetes resource definition and annotations as single-source-of-truth. Any changes made in Avi Controller via UI or CLI will be overridden by values provided in annotations. Field introduced in 17.2.13, 18.1.4, 18.2.1.
   * @return useResourceDefinitionAsSsot
  **/
  @ApiModelProperty(value = "Use OpenShift/Kubernetes resource definition and annotations as single-source-of-truth. Any changes made in Avi Controller via UI or CLI will be overridden by values provided in annotations. Field introduced in 17.2.13, 18.1.4, 18.2.1.")


 
  @VsoMethod  
  public Boolean isUseResourceDefinitionAsSsot() {
    return useResourceDefinitionAsSsot;
  }
    
  @VsoMethod
  public void setUseResourceDefinitionAsSsot(Boolean useResourceDefinitionAsSsot) {
    this.useResourceDefinitionAsSsot = useResourceDefinitionAsSsot;
  }

  
  /**
   * Enable VirtualService placement on Service Engines on nodes with scheduling disabled. When false, Service Engines are disabled on nodes where scheduling is disabled.
   * @return useSchedulingDisabledNodes
  **/
  @ApiModelProperty(value = "Enable VirtualService placement on Service Engines on nodes with scheduling disabled. When false, Service Engines are disabled on nodes where scheduling is disabled.")


 
  @VsoMethod  
  public Boolean isUseSchedulingDisabledNodes() {
    return useSchedulingDisabledNodes;
  }
    
  @VsoMethod
  public void setUseSchedulingDisabledNodes(Boolean useSchedulingDisabledNodes) {
    this.useSchedulingDisabledNodes = useSchedulingDisabledNodes;
  }

  
  /**
   * Use Cluster IP of service as VIP for East-West services; This option requires that kube proxy is disabled on all nodes.
   * @return useServiceClusterIpAsEwVip
  **/
  @ApiModelProperty(value = "Use Cluster IP of service as VIP for East-West services; This option requires that kube proxy is disabled on all nodes.")


 
  @VsoMethod  
  public Boolean isUseServiceClusterIpAsEwVip() {
    return useServiceClusterIpAsEwVip;
  }
    
  @VsoMethod
  public void setUseServiceClusterIpAsEwVip(Boolean useServiceClusterIpAsEwVip) {
    this.useServiceClusterIpAsEwVip = useServiceClusterIpAsEwVip;
  }

  
  /**
   * VirtualService default gateway if multiple nics are present in the host. Field introduced in 18.2.2.
   * @return vipDefaultGateway
  **/
  @ApiModelProperty(value = "VirtualService default gateway if multiple nics are present in the host. Field introduced in 18.2.2.")

  @Valid

 
  @VsoMethod  
  public IpAddr getVipDefaultGateway() {
    return vipDefaultGateway;
  }
    
  @VsoMethod
  public void setVipDefaultGateway(IpAddr vipDefaultGateway) {
    this.vipDefaultGateway = vipDefaultGateway;
  }

  
  public String getObjectID() {
		return "OShiftK8SConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OShiftK8SConfiguration oshiftK8SConfiguration = (OShiftK8SConfiguration) o;
    return Objects.equals(this.appSyncFrequency, oshiftK8SConfiguration.appSyncFrequency) &&
        Objects.equals(this.autoAssignFqdn, oshiftK8SConfiguration.autoAssignFqdn) &&
        Objects.equals(this.aviBridgeSubnet, oshiftK8SConfiguration.aviBridgeSubnet) &&
        Objects.equals(this.caTlsKeyAndCertificateRef, oshiftK8SConfiguration.caTlsKeyAndCertificateRef) &&
        Objects.equals(this.clientTlsKeyAndCertificateRef, oshiftK8SConfiguration.clientTlsKeyAndCertificateRef) &&
        Objects.equals(this.clusterTag, oshiftK8SConfiguration.clusterTag) &&
        Objects.equals(this.containerPortMatchHttpService, oshiftK8SConfiguration.containerPortMatchHttpService) &&
        Objects.equals(this.coredumpDirectory, oshiftK8SConfiguration.coredumpDirectory) &&
        Objects.equals(this.defaultServiceAsEastWestService, oshiftK8SConfiguration.defaultServiceAsEastWestService) &&
        Objects.equals(this.defaultSharedVirtualservice, oshiftK8SConfiguration.defaultSharedVirtualservice) &&
        Objects.equals(this.disableAutoBackendServiceSync, oshiftK8SConfiguration.disableAutoBackendServiceSync) &&
        Objects.equals(this.disableAutoFrontendServiceSync, oshiftK8SConfiguration.disableAutoFrontendServiceSync) &&
        Objects.equals(this.disableAutoGsSync, oshiftK8SConfiguration.disableAutoGsSync) &&
        Objects.equals(this.disableAutoSeCreation, oshiftK8SConfiguration.disableAutoSeCreation) &&
        Objects.equals(this.dockerEndpoint, oshiftK8SConfiguration.dockerEndpoint) &&
        Objects.equals(this.dockerRegistrySe, oshiftK8SConfiguration.dockerRegistrySe) &&
        Objects.equals(this.eastWestPlacementSubnet, oshiftK8SConfiguration.eastWestPlacementSubnet) &&
        Objects.equals(this.enableEventSubscription, oshiftK8SConfiguration.enableEventSubscription) &&
        Objects.equals(this.enableRouteIngressHardening, oshiftK8SConfiguration.enableRouteIngressHardening) &&
        Objects.equals(this.feproxyVipsEnableProxyArp, oshiftK8SConfiguration.feproxyVipsEnableProxyArp) &&
        Objects.equals(this.fleetEndpoint, oshiftK8SConfiguration.fleetEndpoint) &&
        Objects.equals(this.httpContainerPorts, oshiftK8SConfiguration.httpContainerPorts) &&
        Objects.equals(this.ingExcludeAttributes, oshiftK8SConfiguration.ingExcludeAttributes) &&
        Objects.equals(this.ingIncludeAttributes, oshiftK8SConfiguration.ingIncludeAttributes) &&
        Objects.equals(this.l4HealthMonitoring, oshiftK8SConfiguration.l4HealthMonitoring) &&
        Objects.equals(this.masterNodes, oshiftK8SConfiguration.masterNodes) &&
        Objects.equals(this.nodeAvailabilityZoneLabel, oshiftK8SConfiguration.nodeAvailabilityZoneLabel) &&
        Objects.equals(this.nsExcludeAttributes, oshiftK8SConfiguration.nsExcludeAttributes) &&
        Objects.equals(this.nsIncludeAttributes, oshiftK8SConfiguration.nsIncludeAttributes) &&
        Objects.equals(this.nuageController, oshiftK8SConfiguration.nuageController) &&
        Objects.equals(this.numShards, oshiftK8SConfiguration.numShards) &&
        Objects.equals(this.overrideServicePorts, oshiftK8SConfiguration.overrideServicePorts) &&
        Objects.equals(this.persistentVolumeClaim, oshiftK8SConfiguration.persistentVolumeClaim) &&
        Objects.equals(this.routes, oshiftK8SConfiguration.routes) &&
        Objects.equals(this.routesShareVirtualservice, oshiftK8SConfiguration.routesShareVirtualservice) &&
        Objects.equals(this.sdnOverlay, oshiftK8SConfiguration.sdnOverlay) &&
        Objects.equals(this.seDeploymentMethod, oshiftK8SConfiguration.seDeploymentMethod) &&
        Objects.equals(this.seExcludeAttributes, oshiftK8SConfiguration.seExcludeAttributes) &&
        Objects.equals(this.seImagePullSecret, oshiftK8SConfiguration.seImagePullSecret) &&
        Objects.equals(this.seIncludeAttributes, oshiftK8SConfiguration.seIncludeAttributes) &&
        Objects.equals(this.seNamespace, oshiftK8SConfiguration.seNamespace) &&
        Objects.equals(this.sePodTolerations, oshiftK8SConfiguration.sePodTolerations) &&
        Objects.equals(this.sePriorityClass, oshiftK8SConfiguration.sePriorityClass) &&
        Objects.equals(this.seRestartBatchSize, oshiftK8SConfiguration.seRestartBatchSize) &&
        Objects.equals(this.seRestartForce, oshiftK8SConfiguration.seRestartForce) &&
        Objects.equals(this.seSpawnRate, oshiftK8SConfiguration.seSpawnRate) &&
        Objects.equals(this.seVolume, oshiftK8SConfiguration.seVolume) &&
        Objects.equals(this.secureEgressMode, oshiftK8SConfiguration.secureEgressMode) &&
        Objects.equals(this.serviceAccountToken, oshiftK8SConfiguration.serviceAccountToken) &&
        Objects.equals(this.servicePortMatchHttpService, oshiftK8SConfiguration.servicePortMatchHttpService) &&
        Objects.equals(this.shardPrefix, oshiftK8SConfiguration.shardPrefix) &&
        Objects.equals(this.sharedVirtualserviceNamespace, oshiftK8SConfiguration.sharedVirtualserviceNamespace) &&
        Objects.equals(this.sshSeDeployment, oshiftK8SConfiguration.sshSeDeployment) &&
        Objects.equals(this.sshUserRef, oshiftK8SConfiguration.sshUserRef) &&
        Objects.equals(this.syncNotReadyAddresses, oshiftK8SConfiguration.syncNotReadyAddresses) &&
        Objects.equals(this.useControllerImage, oshiftK8SConfiguration.useControllerImage) &&
        Objects.equals(this.useResourceDefinitionAsSsot, oshiftK8SConfiguration.useResourceDefinitionAsSsot) &&
        Objects.equals(this.useSchedulingDisabledNodes, oshiftK8SConfiguration.useSchedulingDisabledNodes) &&
        Objects.equals(this.useServiceClusterIpAsEwVip, oshiftK8SConfiguration.useServiceClusterIpAsEwVip) &&
        Objects.equals(this.vipDefaultGateway, oshiftK8SConfiguration.vipDefaultGateway);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appSyncFrequency, autoAssignFqdn, aviBridgeSubnet, caTlsKeyAndCertificateRef, clientTlsKeyAndCertificateRef, clusterTag, containerPortMatchHttpService, coredumpDirectory, defaultServiceAsEastWestService, defaultSharedVirtualservice, disableAutoBackendServiceSync, disableAutoFrontendServiceSync, disableAutoGsSync, disableAutoSeCreation, dockerEndpoint, dockerRegistrySe, eastWestPlacementSubnet, enableEventSubscription, enableRouteIngressHardening, feproxyVipsEnableProxyArp, fleetEndpoint, httpContainerPorts, ingExcludeAttributes, ingIncludeAttributes, l4HealthMonitoring, masterNodes, nodeAvailabilityZoneLabel, nsExcludeAttributes, nsIncludeAttributes, nuageController, numShards, overrideServicePorts, persistentVolumeClaim, routes, routesShareVirtualservice, sdnOverlay, seDeploymentMethod, seExcludeAttributes, seImagePullSecret, seIncludeAttributes, seNamespace, sePodTolerations, sePriorityClass, seRestartBatchSize, seRestartForce, seSpawnRate, seVolume, secureEgressMode, serviceAccountToken, servicePortMatchHttpService, shardPrefix, sharedVirtualserviceNamespace, sshSeDeployment, sshUserRef, syncNotReadyAddresses, useControllerImage, useResourceDefinitionAsSsot, useSchedulingDisabledNodes, useServiceClusterIpAsEwVip, vipDefaultGateway);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OShiftK8SConfiguration {\n");
    
    sb.append("    appSyncFrequency: ").append(toIndentedString(appSyncFrequency)).append("\n");
    sb.append("    autoAssignFqdn: ").append(toIndentedString(autoAssignFqdn)).append("\n");
    sb.append("    aviBridgeSubnet: ").append(toIndentedString(aviBridgeSubnet)).append("\n");
    sb.append("    caTlsKeyAndCertificateRef: ").append(toIndentedString(caTlsKeyAndCertificateRef)).append("\n");
    sb.append("    clientTlsKeyAndCertificateRef: ").append(toIndentedString(clientTlsKeyAndCertificateRef)).append("\n");
    sb.append("    clusterTag: ").append(toIndentedString(clusterTag)).append("\n");
    sb.append("    containerPortMatchHttpService: ").append(toIndentedString(containerPortMatchHttpService)).append("\n");
    sb.append("    coredumpDirectory: ").append(toIndentedString(coredumpDirectory)).append("\n");
    sb.append("    defaultServiceAsEastWestService: ").append(toIndentedString(defaultServiceAsEastWestService)).append("\n");
    sb.append("    defaultSharedVirtualservice: ").append(toIndentedString(defaultSharedVirtualservice)).append("\n");
    sb.append("    disableAutoBackendServiceSync: ").append(toIndentedString(disableAutoBackendServiceSync)).append("\n");
    sb.append("    disableAutoFrontendServiceSync: ").append(toIndentedString(disableAutoFrontendServiceSync)).append("\n");
    sb.append("    disableAutoGsSync: ").append(toIndentedString(disableAutoGsSync)).append("\n");
    sb.append("    disableAutoSeCreation: ").append(toIndentedString(disableAutoSeCreation)).append("\n");
    sb.append("    dockerEndpoint: ").append(toIndentedString(dockerEndpoint)).append("\n");
    sb.append("    dockerRegistrySe: ").append(toIndentedString(dockerRegistrySe)).append("\n");
    sb.append("    eastWestPlacementSubnet: ").append(toIndentedString(eastWestPlacementSubnet)).append("\n");
    sb.append("    enableEventSubscription: ").append(toIndentedString(enableEventSubscription)).append("\n");
    sb.append("    enableRouteIngressHardening: ").append(toIndentedString(enableRouteIngressHardening)).append("\n");
    sb.append("    feproxyVipsEnableProxyArp: ").append(toIndentedString(feproxyVipsEnableProxyArp)).append("\n");
    sb.append("    fleetEndpoint: ").append(toIndentedString(fleetEndpoint)).append("\n");
    sb.append("    httpContainerPorts: ").append(toIndentedString(httpContainerPorts)).append("\n");
    sb.append("    ingExcludeAttributes: ").append(toIndentedString(ingExcludeAttributes)).append("\n");
    sb.append("    ingIncludeAttributes: ").append(toIndentedString(ingIncludeAttributes)).append("\n");
    sb.append("    l4HealthMonitoring: ").append(toIndentedString(l4HealthMonitoring)).append("\n");
    sb.append("    masterNodes: ").append(toIndentedString(masterNodes)).append("\n");
    sb.append("    nodeAvailabilityZoneLabel: ").append(toIndentedString(nodeAvailabilityZoneLabel)).append("\n");
    sb.append("    nsExcludeAttributes: ").append(toIndentedString(nsExcludeAttributes)).append("\n");
    sb.append("    nsIncludeAttributes: ").append(toIndentedString(nsIncludeAttributes)).append("\n");
    sb.append("    nuageController: ").append(toIndentedString(nuageController)).append("\n");
    sb.append("    numShards: ").append(toIndentedString(numShards)).append("\n");
    sb.append("    overrideServicePorts: ").append(toIndentedString(overrideServicePorts)).append("\n");
    sb.append("    persistentVolumeClaim: ").append(toIndentedString(persistentVolumeClaim)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    routesShareVirtualservice: ").append(toIndentedString(routesShareVirtualservice)).append("\n");
    sb.append("    sdnOverlay: ").append(toIndentedString(sdnOverlay)).append("\n");
    sb.append("    seDeploymentMethod: ").append(toIndentedString(seDeploymentMethod)).append("\n");
    sb.append("    seExcludeAttributes: ").append(toIndentedString(seExcludeAttributes)).append("\n");
    sb.append("    seImagePullSecret: ").append(toIndentedString(seImagePullSecret)).append("\n");
    sb.append("    seIncludeAttributes: ").append(toIndentedString(seIncludeAttributes)).append("\n");
    sb.append("    seNamespace: ").append(toIndentedString(seNamespace)).append("\n");
    sb.append("    sePodTolerations: ").append(toIndentedString(sePodTolerations)).append("\n");
    sb.append("    sePriorityClass: ").append(toIndentedString(sePriorityClass)).append("\n");
    sb.append("    seRestartBatchSize: ").append(toIndentedString(seRestartBatchSize)).append("\n");
    sb.append("    seRestartForce: ").append(toIndentedString(seRestartForce)).append("\n");
    sb.append("    seSpawnRate: ").append(toIndentedString(seSpawnRate)).append("\n");
    sb.append("    seVolume: ").append(toIndentedString(seVolume)).append("\n");
    sb.append("    secureEgressMode: ").append(toIndentedString(secureEgressMode)).append("\n");
    sb.append("    serviceAccountToken: ").append(toIndentedString(serviceAccountToken)).append("\n");
    sb.append("    servicePortMatchHttpService: ").append(toIndentedString(servicePortMatchHttpService)).append("\n");
    sb.append("    shardPrefix: ").append(toIndentedString(shardPrefix)).append("\n");
    sb.append("    sharedVirtualserviceNamespace: ").append(toIndentedString(sharedVirtualserviceNamespace)).append("\n");
    sb.append("    sshSeDeployment: ").append(toIndentedString(sshSeDeployment)).append("\n");
    sb.append("    sshUserRef: ").append(toIndentedString(sshUserRef)).append("\n");
    sb.append("    syncNotReadyAddresses: ").append(toIndentedString(syncNotReadyAddresses)).append("\n");
    sb.append("    useControllerImage: ").append(toIndentedString(useControllerImage)).append("\n");
    sb.append("    useResourceDefinitionAsSsot: ").append(toIndentedString(useResourceDefinitionAsSsot)).append("\n");
    sb.append("    useSchedulingDisabledNodes: ").append(toIndentedString(useSchedulingDisabledNodes)).append("\n");
    sb.append("    useServiceClusterIpAsEwVip: ").append(toIndentedString(useServiceClusterIpAsEwVip)).append("\n");
    sb.append("    vipDefaultGateway: ").append(toIndentedString(vipDefaultGateway)).append("\n");
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

