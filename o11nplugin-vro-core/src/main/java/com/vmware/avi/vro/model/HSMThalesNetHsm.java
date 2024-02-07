package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HSMThalesNetHsm is a POJO class extends AviRestResource that used for creating
 * HSMThalesNetHsm.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HSMThalesNetHsm")
@VsoFinder(name = Constants.FINDER_VRO_HSMTHALESNETHSM)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HSMThalesNetHsm extends AviRestResource {
    @JsonProperty("esn")
    @JsonInclude(Include.NON_NULL)
    private String esn;

    @JsonProperty("keyhash")
    @JsonInclude(Include.NON_NULL)
    private String keyhash;

    @JsonProperty("module_id")
    @JsonInclude(Include.NON_NULL)
    private Integer moduleId = 0;

    @JsonProperty("priority")
    @JsonInclude(Include.NON_NULL)
    private Integer priority = 100;

    @JsonProperty("remote_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr remoteIp;

    @JsonProperty("remote_port")
    @JsonInclude(Include.NON_NULL)
    private Integer remotePort = 9004;



  /**
   * This is the getter method this will return the attribute value.
   * Electronic serial number of the nethsm device.
   * Use thales anonkneti utility to find the nethsm esn.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return esn
   */
  @VsoMethod
  public String getEsn() {
    return esn;
  }

  /**
   * This is the setter method to the attribute.
   * Electronic serial number of the nethsm device.
   * Use thales anonkneti utility to find the nethsm esn.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param esn set the esn.
   */
  @VsoMethod
  public void setEsn(String  esn) {
    this.esn = esn;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Hash of the key that nethsm device uses to authenticate itself.
   * Use thales anonkneti utility to find the nethsm keyhash.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return keyhash
   */
  @VsoMethod
  public String getKeyhash() {
    return keyhash;
  }

  /**
   * This is the setter method to the attribute.
   * Hash of the key that nethsm device uses to authenticate itself.
   * Use thales anonkneti utility to find the nethsm keyhash.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param keyhash set the keyhash.
   */
  @VsoMethod
  public void setKeyhash(String  keyhash) {
    this.keyhash = keyhash;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Local module id of the nethsm device.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return moduleId
   */
  @VsoMethod
  public Integer getModuleId() {
    return moduleId;
  }

  /**
   * This is the setter method to the attribute.
   * Local module id of the nethsm device.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param moduleId set the moduleId.
   */
  @VsoMethod
  public void setModuleId(Integer  moduleId) {
    this.moduleId = moduleId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Priority class of the nethsm in an high availability setup.
   * 1 is the highest priority and 100 is the lowest priority.
   * Allowed values are 1-100.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return priority
   */
  @VsoMethod
  public Integer getPriority() {
    return priority;
  }

  /**
   * This is the setter method to the attribute.
   * Priority class of the nethsm in an high availability setup.
   * 1 is the highest priority and 100 is the lowest priority.
   * Allowed values are 1-100.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param priority set the priority.
   */
  @VsoMethod
  public void setPriority(Integer  priority) {
    this.priority = priority;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address of the nethsm device.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return remoteIp
   */
  @VsoMethod
  public IpAddr getRemoteIp() {
    return remoteIp;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address of the nethsm device.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param remoteIp set the remoteIp.
   */
  @VsoMethod
  public void setRemoteIp(IpAddr remoteIp) {
    this.remoteIp = remoteIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Port at which the nethsm device accepts the connection.
   * Allowed values are 1-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 9004.
   * @return remotePort
   */
  @VsoMethod
  public Integer getRemotePort() {
    return remotePort;
  }

  /**
   * This is the setter method to the attribute.
   * Port at which the nethsm device accepts the connection.
   * Allowed values are 1-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 9004.
   * @param remotePort set the remotePort.
   */
  @VsoMethod
  public void setRemotePort(Integer  remotePort) {
    this.remotePort = remotePort;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HSMThalesNetHsm objHSMThalesNetHsm = (HSMThalesNetHsm) o;
  return   Objects.equals(this.remoteIp, objHSMThalesNetHsm.remoteIp)&&
  Objects.equals(this.remotePort, objHSMThalesNetHsm.remotePort)&&
  Objects.equals(this.esn, objHSMThalesNetHsm.esn)&&
  Objects.equals(this.moduleId, objHSMThalesNetHsm.moduleId)&&
  Objects.equals(this.keyhash, objHSMThalesNetHsm.keyhash)&&
  Objects.equals(this.priority, objHSMThalesNetHsm.priority);
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

