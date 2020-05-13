package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
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
 * OshiftDockerRegistryMetaData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "OshiftDockerRegistryMetaData")
@VsoFinder(name = Constants.FINDER_VRO_OSHIFTDOCKERREGISTRYMETADATA, idAccessor = "getObjectID()")
@Service
public class OshiftDockerRegistryMetaData extends AviRestResource  {
  @JsonProperty("registry_namespace")
  private String registryNamespace = "default";

  @JsonProperty("registry_service")
  private String registryService = "docker-registry";

  @JsonProperty("registry_vip")
  private IpAddr registryVip = null;

  
  /**
   * Namespace for the ServiceEngine image to be hosted in Openshift Integrated registry.
   * @return registryNamespace
  **/
  @ApiModelProperty(value = "Namespace for the ServiceEngine image to be hosted in Openshift Integrated registry.")


 
  @VsoMethod  
  public String getRegistryNamespace() {
    return registryNamespace;
  }
    
  @VsoMethod
  public void setRegistryNamespace(String registryNamespace) {
    this.registryNamespace = registryNamespace;
  }

  
  /**
   * Name of the Integrated registry Service in Openshift.
   * @return registryService
  **/
  @ApiModelProperty(value = "Name of the Integrated registry Service in Openshift.")


 
  @VsoMethod  
  public String getRegistryService() {
    return registryService;
  }
    
  @VsoMethod
  public void setRegistryService(String registryService) {
    this.registryService = registryService;
  }

  
  /**
   * Static VIP for 'docker-registry' service in Openshift if Avi is proxying for this service.This VIP should be outside the cluster IP subnet in Kubernetes and within the subnet configured (but outside the available pool of IPs) in the East West IPAM profile configuration for this Cloud. For example, if kubernetes cluster VIP range is 172.30.0.0/16 and subnet configured in East West IPAM profile is 172.50.0.0/16, then 172.50.0.2 can be used for this vip and IP pool can start from 172.50.0.3 onwards. Use this static VIP in '--insecure-registry <this-vip> 5000' docker config if using an insecure registry or add this to the list of IPs/hostnames when generating certificates if using a secure TLS registry.
   * @return registryVip
  **/
  @ApiModelProperty(value = "Static VIP for 'docker-registry' service in Openshift if Avi is proxying for this service.This VIP should be outside the cluster IP subnet in Kubernetes and within the subnet configured (but outside the available pool of IPs) in the East West IPAM profile configuration for this Cloud. For example, if kubernetes cluster VIP range is 172.30.0.0/16 and subnet configured in East West IPAM profile is 172.50.0.0/16, then 172.50.0.2 can be used for this vip and IP pool can start from 172.50.0.3 onwards. Use this static VIP in '--insecure-registry <this-vip> 5000' docker config if using an insecure registry or add this to the list of IPs/hostnames when generating certificates if using a secure TLS registry.")

  @Valid

 
  @VsoMethod  
  public IpAddr getRegistryVip() {
    return registryVip;
  }
    
  @VsoMethod
  public void setRegistryVip(IpAddr registryVip) {
    this.registryVip = registryVip;
  }

  
  public String getObjectID() {
		return "OshiftDockerRegistryMetaData";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OshiftDockerRegistryMetaData oshiftDockerRegistryMetaData = (OshiftDockerRegistryMetaData) o;
    return Objects.equals(this.registryNamespace, oshiftDockerRegistryMetaData.registryNamespace) &&
        Objects.equals(this.registryService, oshiftDockerRegistryMetaData.registryService) &&
        Objects.equals(this.registryVip, oshiftDockerRegistryMetaData.registryVip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registryNamespace, registryService, registryVip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OshiftDockerRegistryMetaData {\n");
    
    sb.append("    registryNamespace: ").append(toIndentedString(registryNamespace)).append("\n");
    sb.append("    registryService: ").append(toIndentedString(registryService)).append("\n");
    sb.append("    registryVip: ").append(toIndentedString(registryVip)).append("\n");
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

