package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrMatch;
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
 * MgmtIpAccessControl
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MgmtIpAccessControl")
@VsoFinder(name = Constants.FINDER_VRO_MGMTIPACCESSCONTROL, idAccessor = "getObjectID()")
@Service
public class MgmtIpAccessControl extends AviRestResource  {
  @JsonProperty("api_access")
  private IpAddrMatch apiAccess = null;

  @JsonProperty("shell_server_access")
  private IpAddrMatch shellServerAccess = null;

  @JsonProperty("snmp_access")
  private IpAddrMatch snmpAccess = null;

  @JsonProperty("ssh_access")
  private IpAddrMatch sshAccess = null;

  @JsonProperty("sysint_access")
  private IpAddrMatch sysintAccess = null;

  
  /**
   * Configure IP addresses to access controller using API.
   * @return apiAccess
  **/
  @ApiModelProperty(value = "Configure IP addresses to access controller using API.")

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getApiAccess() {
    return apiAccess;
  }
    
  @VsoMethod
  public void setApiAccess(IpAddrMatch apiAccess) {
    this.apiAccess = apiAccess;
  }

  
  /**
   * Configure IP addresses to access controller using CLI Shell.
   * @return shellServerAccess
  **/
  @ApiModelProperty(value = "Configure IP addresses to access controller using CLI Shell.")

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getShellServerAccess() {
    return shellServerAccess;
  }
    
  @VsoMethod
  public void setShellServerAccess(IpAddrMatch shellServerAccess) {
    this.shellServerAccess = shellServerAccess;
  }

  
  /**
   * Configure IP addresses to access controller using SNMP.
   * @return snmpAccess
  **/
  @ApiModelProperty(value = "Configure IP addresses to access controller using SNMP.")

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getSnmpAccess() {
    return snmpAccess;
  }
    
  @VsoMethod
  public void setSnmpAccess(IpAddrMatch snmpAccess) {
    this.snmpAccess = snmpAccess;
  }

  
  /**
   * Configure IP addresses to access controller using SSH.
   * @return sshAccess
  **/
  @ApiModelProperty(value = "Configure IP addresses to access controller using SSH.")

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getSshAccess() {
    return sshAccess;
  }
    
  @VsoMethod
  public void setSshAccess(IpAddrMatch sshAccess) {
    this.sshAccess = sshAccess;
  }

  
  /**
   * Configure IP addresses to access controller using sysint access. Field introduced in 18.1.3, 18.2.1.
   * @return sysintAccess
  **/
  @ApiModelProperty(value = "Configure IP addresses to access controller using sysint access. Field introduced in 18.1.3, 18.2.1.")

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getSysintAccess() {
    return sysintAccess;
  }
    
  @VsoMethod
  public void setSysintAccess(IpAddrMatch sysintAccess) {
    this.sysintAccess = sysintAccess;
  }

  
  public String getObjectID() {
		return "MgmtIpAccessControl";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MgmtIpAccessControl mgmtIpAccessControl = (MgmtIpAccessControl) o;
    return Objects.equals(this.apiAccess, mgmtIpAccessControl.apiAccess) &&
        Objects.equals(this.shellServerAccess, mgmtIpAccessControl.shellServerAccess) &&
        Objects.equals(this.snmpAccess, mgmtIpAccessControl.snmpAccess) &&
        Objects.equals(this.sshAccess, mgmtIpAccessControl.sshAccess) &&
        Objects.equals(this.sysintAccess, mgmtIpAccessControl.sysintAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiAccess, shellServerAccess, snmpAccess, sshAccess, sysintAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MgmtIpAccessControl {\n");
    
    sb.append("    apiAccess: ").append(toIndentedString(apiAccess)).append("\n");
    sb.append("    shellServerAccess: ").append(toIndentedString(shellServerAccess)).append("\n");
    sb.append("    snmpAccess: ").append(toIndentedString(snmpAccess)).append("\n");
    sb.append("    sshAccess: ").append(toIndentedString(sshAccess)).append("\n");
    sb.append("    sysintAccess: ").append(toIndentedString(sysintAccess)).append("\n");
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

