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
 * HSMThalesNetHsm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HSMThalesNetHsm")
@VsoFinder(name = Constants.FINDER_VRO_HSMTHALESNETHSM, idAccessor = "getObjectID()")
@Service
public class HSMThalesNetHsm extends AviRestResource  {
  @JsonProperty("esn")
  private String esn = null;

  @JsonProperty("keyhash")
  private String keyhash = null;

  @JsonProperty("module_id")
  private Integer moduleId = null;

  @JsonProperty("priority")
  private Integer priority = 100;

  @JsonProperty("remote_ip")
  private IpAddr remoteIp = null;

  @JsonProperty("remote_port")
  private Integer remotePort = 9004;

  
  /**
   * Electronic serial number of the netHSM device. Use Thales anonkneti utility to find the netHSM ESN.
   * @return esn
  **/
  @ApiModelProperty(required = true, value = "Electronic serial number of the netHSM device. Use Thales anonkneti utility to find the netHSM ESN.")
  @NotNull


 
  @VsoMethod  
  public String getEsn() {
    return esn;
  }
    
  @VsoMethod
  public void setEsn(String esn) {
    this.esn = esn;
  }

  
  /**
   * Hash of the key that netHSM device uses to authenticate itself. Use Thales anonkneti utility to find the netHSM keyhash.
   * @return keyhash
  **/
  @ApiModelProperty(required = true, value = "Hash of the key that netHSM device uses to authenticate itself. Use Thales anonkneti utility to find the netHSM keyhash.")
  @NotNull


 
  @VsoMethod  
  public String getKeyhash() {
    return keyhash;
  }
    
  @VsoMethod
  public void setKeyhash(String keyhash) {
    this.keyhash = keyhash;
  }

  
  /**
   * Local module id of the netHSM device.
   * @return moduleId
  **/
  @ApiModelProperty(value = "Local module id of the netHSM device.")


 
  @VsoMethod  
  public Integer getModuleId() {
    return moduleId;
  }
    
  @VsoMethod
  public void setModuleId(Integer moduleId) {
    this.moduleId = moduleId;
  }

  
  /**
   * Priority class of the nethsm in an high availability setup. 1 is the highest priority and 100 is the lowest priority. Allowed values are 1-100.
   * @return priority
  **/
  @ApiModelProperty(required = true, value = "Priority class of the nethsm in an high availability setup. 1 is the highest priority and 100 is the lowest priority. Allowed values are 1-100.")
  @NotNull


 
  @VsoMethod  
  public Integer getPriority() {
    return priority;
  }
    
  @VsoMethod
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   * IP address of the netHSM device.
   * @return remoteIp
  **/
  @ApiModelProperty(required = true, value = "IP address of the netHSM device.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getRemoteIp() {
    return remoteIp;
  }
    
  @VsoMethod
  public void setRemoteIp(IpAddr remoteIp) {
    this.remoteIp = remoteIp;
  }

  
  /**
   * Port at which the netHSM device accepts the connection. Allowed values are 1-65535.
   * @return remotePort
  **/
  @ApiModelProperty(value = "Port at which the netHSM device accepts the connection. Allowed values are 1-65535.")


 
  @VsoMethod  
  public Integer getRemotePort() {
    return remotePort;
  }
    
  @VsoMethod
  public void setRemotePort(Integer remotePort) {
    this.remotePort = remotePort;
  }

  
  public String getObjectID() {
		return "HSMThalesNetHsm";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HSMThalesNetHsm hsMThalesNetHsm = (HSMThalesNetHsm) o;
    return Objects.equals(this.esn, hsMThalesNetHsm.esn) &&
        Objects.equals(this.keyhash, hsMThalesNetHsm.keyhash) &&
        Objects.equals(this.moduleId, hsMThalesNetHsm.moduleId) &&
        Objects.equals(this.priority, hsMThalesNetHsm.priority) &&
        Objects.equals(this.remoteIp, hsMThalesNetHsm.remoteIp) &&
        Objects.equals(this.remotePort, hsMThalesNetHsm.remotePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(esn, keyhash, moduleId, priority, remoteIp, remotePort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HSMThalesNetHsm {\n");
    
    sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
    sb.append("    keyhash: ").append(toIndentedString(keyhash)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
    sb.append("    remotePort: ").append(toIndentedString(remotePort)).append("\n");
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

