package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The vCloudAirConfiguration is a POJO class extends AviRestResource that used for creating
 * vCloudAirConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "vCloudAirConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_VCLOUDAIRCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class vCloudAirConfiguration extends AviRestResource {
    @JsonProperty("privilege")
    @JsonInclude(Include.NON_NULL)
    private String privilege = "WRITE_ACCESS";

    @JsonProperty("vca_host")
    @JsonInclude(Include.NON_NULL)
    private String vcaHost = null;

    @JsonProperty("vca_instance")
    @JsonInclude(Include.NON_NULL)
    private String vcaInstance = null;

    @JsonProperty("vca_mgmt_network")
    @JsonInclude(Include.NON_NULL)
    private String vcaMgmtNetwork = null;

    @JsonProperty("vca_orgnization")
    @JsonInclude(Include.NON_NULL)
    private String vcaOrgnization = null;

    @JsonProperty("vca_password")
    @JsonInclude(Include.NON_NULL)
    private String vcaPassword = null;

    @JsonProperty("vca_username")
    @JsonInclude(Include.NON_NULL)
    private String vcaUsername = null;

    @JsonProperty("vca_vdc")
    @JsonInclude(Include.NON_NULL)
    private String vcaVdc = null;



  /**
   * This is the getter method this will return the attribute value.
   * Vcloudair access mode.
   * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * Default value when not specified in API or module is interpreted by Avi Controller as "WRITE_ACCESS".
   * @return privilege
   */
  @VsoMethod
  public String getPrivilege() {
    return privilege;
  }

  /**
   * This is the setter method to the attribute.
   * Vcloudair access mode.
   * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * Default value when not specified in API or module is interpreted by Avi Controller as "WRITE_ACCESS".
   * @param privilege set the privilege.
   */
  @VsoMethod
  public void setPrivilege(String  privilege) {
    this.privilege = privilege;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vcloudair host address.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcaHost
   */
  @VsoMethod
  public String getVcaHost() {
    return vcaHost;
  }

  /**
   * This is the setter method to the attribute.
   * Vcloudair host address.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcaHost set the vcaHost.
   */
  @VsoMethod
  public void setVcaHost(String  vcaHost) {
    this.vcaHost = vcaHost;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vcloudair instance id.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcaInstance
   */
  @VsoMethod
  public String getVcaInstance() {
    return vcaInstance;
  }

  /**
   * This is the setter method to the attribute.
   * Vcloudair instance id.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcaInstance set the vcaInstance.
   */
  @VsoMethod
  public void setVcaInstance(String  vcaInstance) {
    this.vcaInstance = vcaInstance;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vcloudair management network.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcaMgmtNetwork
   */
  @VsoMethod
  public String getVcaMgmtNetwork() {
    return vcaMgmtNetwork;
  }

  /**
   * This is the setter method to the attribute.
   * Vcloudair management network.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcaMgmtNetwork set the vcaMgmtNetwork.
   */
  @VsoMethod
  public void setVcaMgmtNetwork(String  vcaMgmtNetwork) {
    this.vcaMgmtNetwork = vcaMgmtNetwork;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vcloudair orgnization id.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcaOrgnization
   */
  @VsoMethod
  public String getVcaOrgnization() {
    return vcaOrgnization;
  }

  /**
   * This is the setter method to the attribute.
   * Vcloudair orgnization id.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcaOrgnization set the vcaOrgnization.
   */
  @VsoMethod
  public void setVcaOrgnization(String  vcaOrgnization) {
    this.vcaOrgnization = vcaOrgnization;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vcloudair password.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcaPassword
   */
  @VsoMethod
  public String getVcaPassword() {
    return vcaPassword;
  }

  /**
   * This is the setter method to the attribute.
   * Vcloudair password.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcaPassword set the vcaPassword.
   */
  @VsoMethod
  public void setVcaPassword(String  vcaPassword) {
    this.vcaPassword = vcaPassword;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vcloudair username.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcaUsername
   */
  @VsoMethod
  public String getVcaUsername() {
    return vcaUsername;
  }

  /**
   * This is the setter method to the attribute.
   * Vcloudair username.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcaUsername set the vcaUsername.
   */
  @VsoMethod
  public void setVcaUsername(String  vcaUsername) {
    this.vcaUsername = vcaUsername;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vcloudair virtual data center name.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcaVdc
   */
  @VsoMethod
  public String getVcaVdc() {
    return vcaVdc;
  }

  /**
   * This is the setter method to the attribute.
   * Vcloudair virtual data center name.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcaVdc set the vcaVdc.
   */
  @VsoMethod
  public void setVcaVdc(String  vcaVdc) {
    this.vcaVdc = vcaVdc;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  vCloudAirConfiguration objvCloudAirConfiguration = (vCloudAirConfiguration) o;
  return   Objects.equals(this.vcaUsername, objvCloudAirConfiguration.vcaUsername)&&
  Objects.equals(this.vcaPassword, objvCloudAirConfiguration.vcaPassword)&&
  Objects.equals(this.vcaHost, objvCloudAirConfiguration.vcaHost)&&
  Objects.equals(this.privilege, objvCloudAirConfiguration.privilege)&&
  Objects.equals(this.vcaInstance, objvCloudAirConfiguration.vcaInstance)&&
  Objects.equals(this.vcaOrgnization, objvCloudAirConfiguration.vcaOrgnization)&&
  Objects.equals(this.vcaVdc, objvCloudAirConfiguration.vcaVdc)&&
  Objects.equals(this.vcaMgmtNetwork, objvCloudAirConfiguration.vcaMgmtNetwork);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class vCloudAirConfiguration {\n");
      sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
        sb.append("    vcaHost: ").append(toIndentedString(vcaHost)).append("\n");
        sb.append("    vcaInstance: ").append(toIndentedString(vcaInstance)).append("\n");
        sb.append("    vcaMgmtNetwork: ").append(toIndentedString(vcaMgmtNetwork)).append("\n");
        sb.append("    vcaOrgnization: ").append(toIndentedString(vcaOrgnization)).append("\n");
        sb.append("    vcaPassword: ").append(toIndentedString(vcaPassword)).append("\n");
        sb.append("    vcaUsername: ").append(toIndentedString(vcaUsername)).append("\n");
        sb.append("    vcaVdc: ").append(toIndentedString(vcaVdc)).append("\n");
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

