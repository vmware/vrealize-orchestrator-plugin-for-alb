package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DockerRegistry;
import com.vmware.avi.vro.model.LinuxServerHost;
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
 * LinuxServerConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "LinuxServerConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_LINUXSERVERCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class LinuxServerConfiguration extends AviRestResource  {
  @JsonProperty("docker_registry_se")
  private DockerRegistry dockerRegistrySe = null;

  @JsonProperty("hosts")
  @Valid
  private List<LinuxServerHost> hosts = null;

  @JsonProperty("se_inband_mgmt")
  private Boolean seInbandMgmt = null;

  @JsonProperty("se_log_disk_path")
  private String seLogDiskPath = null;

  @JsonProperty("se_log_disk_size_GB")
  private Integer seLogDiskSizeGB = 5;

  @JsonProperty("se_sys_disk_path")
  private String seSysDiskPath = null;

  @JsonProperty("se_sys_disk_size_GB")
  private Integer seSysDiskSizeGB = 10;

  @JsonProperty("ssh_attr")
  private SSHSeDeployment sshAttr = null;

  @JsonProperty("ssh_user_ref")
  private String sshUserRef = null;

  
  /**
   * Private docker registry for SE image storage. Field deprecated in 17.1.2.
   * @return dockerRegistrySe
  **/
  @ApiModelProperty(value = "Private docker registry for SE image storage. Field deprecated in 17.1.2.")

  @Valid

 
  @VsoMethod  
  public DockerRegistry getDockerRegistrySe() {
    return dockerRegistrySe;
  }
    
  @VsoMethod
  public void setDockerRegistrySe(DockerRegistry dockerRegistrySe) {
    this.dockerRegistrySe = dockerRegistrySe;
  }

  
  public LinuxServerConfiguration addHostsItem(LinuxServerHost hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<LinuxServerHost>();
    }
    this.hosts.add(hostsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property hosts of obj type LinuxServerConfiguration field type str  type object
   * @return hosts
  **/
  @ApiModelProperty(value = "Placeholder for description of property hosts of obj type LinuxServerConfiguration field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<LinuxServerHost> getHosts() {
    return hosts;
  }
    
  @VsoMethod
  public void setHosts(List<LinuxServerHost> hosts) {
    this.hosts = hosts;
  }

  
  /**
   * Flag to notify the SE's in this cloud have an inband management interface, this can be overridden at SE host level by setting host_attr attr_key as SE_INBAND_MGMT with value of true or false.
   * @return seInbandMgmt
  **/
  @ApiModelProperty(value = "Flag to notify the SE's in this cloud have an inband management interface, this can be overridden at SE host level by setting host_attr attr_key as SE_INBAND_MGMT with value of true or false.")


 
  @VsoMethod  
  public Boolean isSeInbandMgmt() {
    return seInbandMgmt;
  }
    
  @VsoMethod
  public void setSeInbandMgmt(Boolean seInbandMgmt) {
    this.seInbandMgmt = seInbandMgmt;
  }

  
  /**
   * SE Client Logs disk path for cloud.
   * @return seLogDiskPath
  **/
  @ApiModelProperty(value = "SE Client Logs disk path for cloud.")


 
  @VsoMethod  
  public String getSeLogDiskPath() {
    return seLogDiskPath;
  }
    
  @VsoMethod
  public void setSeLogDiskPath(String seLogDiskPath) {
    this.seLogDiskPath = seLogDiskPath;
  }

  
  /**
   * SE Client Log disk size for cloud.
   * @return seLogDiskSizeGB
  **/
  @ApiModelProperty(value = "SE Client Log disk size for cloud.")


 
  @VsoMethod  
  public Integer getSeLogDiskSizeGB() {
    return seLogDiskSizeGB;
  }
    
  @VsoMethod
  public void setSeLogDiskSizeGB(Integer seLogDiskSizeGB) {
    this.seLogDiskSizeGB = seLogDiskSizeGB;
  }

  
  /**
   * SE System Logs disk path for cloud.
   * @return seSysDiskPath
  **/
  @ApiModelProperty(value = "SE System Logs disk path for cloud.")


 
  @VsoMethod  
  public String getSeSysDiskPath() {
    return seSysDiskPath;
  }
    
  @VsoMethod
  public void setSeSysDiskPath(String seSysDiskPath) {
    this.seSysDiskPath = seSysDiskPath;
  }

  
  /**
   * SE System Logs disk size for cloud.
   * @return seSysDiskSizeGB
  **/
  @ApiModelProperty(value = "SE System Logs disk size for cloud.")


 
  @VsoMethod  
  public Integer getSeSysDiskSizeGB() {
    return seSysDiskSizeGB;
  }
    
  @VsoMethod
  public void setSeSysDiskSizeGB(Integer seSysDiskSizeGB) {
    this.seSysDiskSizeGB = seSysDiskSizeGB;
  }

  
  /**
   * Parameters for SSH to hosts. Field deprecated in 17.1.1.
   * @return sshAttr
  **/
  @ApiModelProperty(value = "Parameters for SSH to hosts. Field deprecated in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public SSHSeDeployment getSshAttr() {
    return sshAttr;
  }
    
  @VsoMethod
  public void setSshAttr(SSHSeDeployment sshAttr) {
    this.sshAttr = sshAttr;
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

  
  public String getObjectID() {
		return "LinuxServerConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinuxServerConfiguration linuxServerConfiguration = (LinuxServerConfiguration) o;
    return Objects.equals(this.dockerRegistrySe, linuxServerConfiguration.dockerRegistrySe) &&
        Objects.equals(this.hosts, linuxServerConfiguration.hosts) &&
        Objects.equals(this.seInbandMgmt, linuxServerConfiguration.seInbandMgmt) &&
        Objects.equals(this.seLogDiskPath, linuxServerConfiguration.seLogDiskPath) &&
        Objects.equals(this.seLogDiskSizeGB, linuxServerConfiguration.seLogDiskSizeGB) &&
        Objects.equals(this.seSysDiskPath, linuxServerConfiguration.seSysDiskPath) &&
        Objects.equals(this.seSysDiskSizeGB, linuxServerConfiguration.seSysDiskSizeGB) &&
        Objects.equals(this.sshAttr, linuxServerConfiguration.sshAttr) &&
        Objects.equals(this.sshUserRef, linuxServerConfiguration.sshUserRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dockerRegistrySe, hosts, seInbandMgmt, seLogDiskPath, seLogDiskSizeGB, seSysDiskPath, seSysDiskSizeGB, sshAttr, sshUserRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinuxServerConfiguration {\n");
    
    sb.append("    dockerRegistrySe: ").append(toIndentedString(dockerRegistrySe)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    seInbandMgmt: ").append(toIndentedString(seInbandMgmt)).append("\n");
    sb.append("    seLogDiskPath: ").append(toIndentedString(seLogDiskPath)).append("\n");
    sb.append("    seLogDiskSizeGB: ").append(toIndentedString(seLogDiskSizeGB)).append("\n");
    sb.append("    seSysDiskPath: ").append(toIndentedString(seSysDiskPath)).append("\n");
    sb.append("    seSysDiskSizeGB: ").append(toIndentedString(seSysDiskSizeGB)).append("\n");
    sb.append("    sshAttr: ").append(toIndentedString(sshAttr)).append("\n");
    sb.append("    sshUserRef: ").append(toIndentedString(sshUserRef)).append("\n");
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

