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
 * VCloudAirConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VCloudAirConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_VCLOUDAIRCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class VCloudAirConfiguration extends AviRestResource  {
  @JsonProperty("privilege")
  private String privilege = "WRITE_ACCESS";

  @JsonProperty("vca_host")
  private String vcaHost = null;

  @JsonProperty("vca_instance")
  private String vcaInstance = null;

  @JsonProperty("vca_mgmt_network")
  private String vcaMgmtNetwork = null;

  @JsonProperty("vca_orgnization")
  private String vcaOrgnization = null;

  @JsonProperty("vca_password")
  private String vcaPassword = null;

  @JsonProperty("vca_username")
  private String vcaUsername = null;

  @JsonProperty("vca_vdc")
  private String vcaVdc = null;

  
  /**
   * vCloudAir access mode. Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * @return privilege
  **/
  @ApiModelProperty(required = true, value = "vCloudAir access mode. Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.")
  @NotNull


 
  @VsoMethod  
  public String getPrivilege() {
    return privilege;
  }
    
  @VsoMethod
  public void setPrivilege(String privilege) {
    this.privilege = privilege;
  }

  
  /**
   * vCloudAir host address.
   * @return vcaHost
  **/
  @ApiModelProperty(required = true, value = "vCloudAir host address.")
  @NotNull


 
  @VsoMethod  
  public String getVcaHost() {
    return vcaHost;
  }
    
  @VsoMethod
  public void setVcaHost(String vcaHost) {
    this.vcaHost = vcaHost;
  }

  
  /**
   * vCloudAir instance ID.
   * @return vcaInstance
  **/
  @ApiModelProperty(required = true, value = "vCloudAir instance ID.")
  @NotNull


 
  @VsoMethod  
  public String getVcaInstance() {
    return vcaInstance;
  }
    
  @VsoMethod
  public void setVcaInstance(String vcaInstance) {
    this.vcaInstance = vcaInstance;
  }

  
  /**
   * vCloudAir management network.
   * @return vcaMgmtNetwork
  **/
  @ApiModelProperty(required = true, value = "vCloudAir management network.")
  @NotNull


 
  @VsoMethod  
  public String getVcaMgmtNetwork() {
    return vcaMgmtNetwork;
  }
    
  @VsoMethod
  public void setVcaMgmtNetwork(String vcaMgmtNetwork) {
    this.vcaMgmtNetwork = vcaMgmtNetwork;
  }

  
  /**
   * vCloudAir orgnization ID.
   * @return vcaOrgnization
  **/
  @ApiModelProperty(required = true, value = "vCloudAir orgnization ID.")
  @NotNull


 
  @VsoMethod  
  public String getVcaOrgnization() {
    return vcaOrgnization;
  }
    
  @VsoMethod
  public void setVcaOrgnization(String vcaOrgnization) {
    this.vcaOrgnization = vcaOrgnization;
  }

  
  /**
   * vCloudAir password.
   * @return vcaPassword
  **/
  @ApiModelProperty(required = true, value = "vCloudAir password.")
  @NotNull


 
  @VsoMethod  
  public String getVcaPassword() {
    return vcaPassword;
  }
    
  @VsoMethod
  public void setVcaPassword(String vcaPassword) {
    this.vcaPassword = vcaPassword;
  }

  
  /**
   * vCloudAir username.
   * @return vcaUsername
  **/
  @ApiModelProperty(required = true, value = "vCloudAir username.")
  @NotNull


 
  @VsoMethod  
  public String getVcaUsername() {
    return vcaUsername;
  }
    
  @VsoMethod
  public void setVcaUsername(String vcaUsername) {
    this.vcaUsername = vcaUsername;
  }

  
  /**
   * vCloudAir virtual data center name.
   * @return vcaVdc
  **/
  @ApiModelProperty(required = true, value = "vCloudAir virtual data center name.")
  @NotNull


 
  @VsoMethod  
  public String getVcaVdc() {
    return vcaVdc;
  }
    
  @VsoMethod
  public void setVcaVdc(String vcaVdc) {
    this.vcaVdc = vcaVdc;
  }

  
  public String getObjectID() {
		return "VCloudAirConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VCloudAirConfiguration vCloudAirConfiguration = (VCloudAirConfiguration) o;
    return Objects.equals(this.privilege, vCloudAirConfiguration.privilege) &&
        Objects.equals(this.vcaHost, vCloudAirConfiguration.vcaHost) &&
        Objects.equals(this.vcaInstance, vCloudAirConfiguration.vcaInstance) &&
        Objects.equals(this.vcaMgmtNetwork, vCloudAirConfiguration.vcaMgmtNetwork) &&
        Objects.equals(this.vcaOrgnization, vCloudAirConfiguration.vcaOrgnization) &&
        Objects.equals(this.vcaPassword, vCloudAirConfiguration.vcaPassword) &&
        Objects.equals(this.vcaUsername, vCloudAirConfiguration.vcaUsername) &&
        Objects.equals(this.vcaVdc, vCloudAirConfiguration.vcaVdc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilege, vcaHost, vcaInstance, vcaMgmtNetwork, vcaOrgnization, vcaPassword, vcaUsername, vcaVdc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VCloudAirConfiguration {\n");
    
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

