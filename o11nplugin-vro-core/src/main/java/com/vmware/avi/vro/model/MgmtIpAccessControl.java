package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The MgmtIpAccessControl is a POJO class extends AviRestResource that used for creating
 * MgmtIpAccessControl.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MgmtIpAccessControl")
@VsoFinder(name = Constants.FINDER_VRO_MGMTIPACCESSCONTROL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MgmtIpAccessControl extends AviRestResource {
    @JsonProperty("api_access")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch apiAccess = null;

    @JsonProperty("shell_server_access")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch shellServerAccess = null;

    @JsonProperty("snmp_access")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch snmpAccess = null;

    @JsonProperty("ssh_access")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch sshAccess = null;

    @JsonProperty("sysint_access")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch sysintAccess = null;



  /**
   * This is the getter method this will return the attribute value.
   * Configure ip addresses to access controller using api.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return apiAccess
   */
  @VsoMethod
  public IpAddrMatch getApiAccess() {
    return apiAccess;
  }

  /**
   * This is the setter method to the attribute.
   * Configure ip addresses to access controller using api.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param apiAccess set the apiAccess.
   */
  @VsoMethod
  public void setApiAccess(IpAddrMatch apiAccess) {
    this.apiAccess = apiAccess;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure ip addresses to access controller using cli shell.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return shellServerAccess
   */
  @VsoMethod
  public IpAddrMatch getShellServerAccess() {
    return shellServerAccess;
  }

  /**
   * This is the setter method to the attribute.
   * Configure ip addresses to access controller using cli shell.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param shellServerAccess set the shellServerAccess.
   */
  @VsoMethod
  public void setShellServerAccess(IpAddrMatch shellServerAccess) {
    this.shellServerAccess = shellServerAccess;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure ip addresses to access controller using snmp.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return snmpAccess
   */
  @VsoMethod
  public IpAddrMatch getSnmpAccess() {
    return snmpAccess;
  }

  /**
   * This is the setter method to the attribute.
   * Configure ip addresses to access controller using snmp.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param snmpAccess set the snmpAccess.
   */
  @VsoMethod
  public void setSnmpAccess(IpAddrMatch snmpAccess) {
    this.snmpAccess = snmpAccess;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure ip addresses to access controller using ssh.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshAccess
   */
  @VsoMethod
  public IpAddrMatch getSshAccess() {
    return sshAccess;
  }

  /**
   * This is the setter method to the attribute.
   * Configure ip addresses to access controller using ssh.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sshAccess set the sshAccess.
   */
  @VsoMethod
  public void setSshAccess(IpAddrMatch sshAccess) {
    this.sshAccess = sshAccess;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure ip addresses to access controller using sysint access.
   * Field introduced in 18.1.3, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sysintAccess
   */
  @VsoMethod
  public IpAddrMatch getSysintAccess() {
    return sysintAccess;
  }

  /**
   * This is the setter method to the attribute.
   * Configure ip addresses to access controller using sysint access.
   * Field introduced in 18.1.3, 18.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sysintAccess set the sysintAccess.
   */
  @VsoMethod
  public void setSysintAccess(IpAddrMatch sysintAccess) {
    this.sysintAccess = sysintAccess;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MgmtIpAccessControl objMgmtIpAccessControl = (MgmtIpAccessControl) o;
  return   Objects.equals(this.sshAccess, objMgmtIpAccessControl.sshAccess)&&
  Objects.equals(this.apiAccess, objMgmtIpAccessControl.apiAccess)&&
  Objects.equals(this.shellServerAccess, objMgmtIpAccessControl.shellServerAccess)&&
  Objects.equals(this.snmpAccess, objMgmtIpAccessControl.snmpAccess)&&
  Objects.equals(this.sysintAccess, objMgmtIpAccessControl.sysintAccess);
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

