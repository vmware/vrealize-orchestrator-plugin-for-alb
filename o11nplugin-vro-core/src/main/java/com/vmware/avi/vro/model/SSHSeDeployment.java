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
 * SSHSeDeployment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SSHSeDeployment")
@VsoFinder(name = Constants.FINDER_VRO_SSHSEDEPLOYMENT, idAccessor = "getObjectID()")
@Service
public class SSHSeDeployment extends AviRestResource  {
  @JsonProperty("host_os")
  private String hostOs = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("ssh_user")
  private String sshUser = null;

  @JsonProperty("sudo_user")
  private String sudoUser = null;

  
  /**
   * Host OS distribution e.g. COREOS, UBUNTU, REDHAT. Field deprecated in 17.1.1.
   * @return hostOs
  **/
  @ApiModelProperty(value = "Host OS distribution e.g. COREOS, UBUNTU, REDHAT. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public String getHostOs() {
    return hostOs;
  }
    
  @VsoMethod
  public void setHostOs(String hostOs) {
    this.hostOs = hostOs;
  }

  
  /**
   * Password for ssh and/or sudo. Field deprecated in 17.1.1.
   * @return password
  **/
  @ApiModelProperty(value = "Password for ssh and/or sudo. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * Username for SSH access to hosts. Field deprecated in 17.1.1.
   * @return sshUser
  **/
  @ApiModelProperty(value = "Username for SSH access to hosts. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public String getSshUser() {
    return sshUser;
  }
    
  @VsoMethod
  public void setSshUser(String sshUser) {
    this.sshUser = sshUser;
  }

  
  /**
   * Username for sudo. Field deprecated in 17.1.1.
   * @return sudoUser
  **/
  @ApiModelProperty(value = "Username for sudo. Field deprecated in 17.1.1.")


 
  @VsoMethod  
  public String getSudoUser() {
    return sudoUser;
  }
    
  @VsoMethod
  public void setSudoUser(String sudoUser) {
    this.sudoUser = sudoUser;
  }

  
  public String getObjectID() {
		return "SSHSeDeployment";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSHSeDeployment ssHSeDeployment = (SSHSeDeployment) o;
    return Objects.equals(this.hostOs, ssHSeDeployment.hostOs) &&
        Objects.equals(this.password, ssHSeDeployment.password) &&
        Objects.equals(this.sshUser, ssHSeDeployment.sshUser) &&
        Objects.equals(this.sudoUser, ssHSeDeployment.sudoUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostOs, password, sshUser, sudoUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSHSeDeployment {\n");
    
    sb.append("    hostOs: ").append(toIndentedString(hostOs)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sshUser: ").append(toIndentedString(sshUser)).append("\n");
    sb.append("    sudoUser: ").append(toIndentedString(sudoUser)).append("\n");
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

