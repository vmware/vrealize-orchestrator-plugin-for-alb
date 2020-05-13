package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.GCPInBandManagement;
import com.vmware.avi.vro.model.GCPOneArmMode;
import com.vmware.avi.vro.model.GCPTwoArmMode;
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
 * GCPNetworkConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GCPNetworkConfig")
@VsoFinder(name = Constants.FINDER_VRO_GCPNETWORKCONFIG, idAccessor = "getObjectID()")
@Service
public class GCPNetworkConfig extends AviRestResource  {
  @JsonProperty("config")
  private String config = null;

  @JsonProperty("inband")
  private GCPInBandManagement inband = null;

  @JsonProperty("one_arm")
  private GCPOneArmMode oneArm = null;

  @JsonProperty("two_arm")
  private GCPTwoArmMode twoArm = null;

  
  /**
   * Config Mode for Google Cloud network configuration. Enum options - INBAND_MANAGEMENT, ONE_ARM_MODE, TWO_ARM_MODE. Field introduced in 18.2.1.
   * @return config
  **/
  @ApiModelProperty(required = true, value = "Config Mode for Google Cloud network configuration. Enum options - INBAND_MANAGEMENT, ONE_ARM_MODE, TWO_ARM_MODE. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getConfig() {
    return config;
  }
    
  @VsoMethod
  public void setConfig(String config) {
    this.config = config;
  }

  
  /**
   * Configure InBand Management as Google Cloud network configuration. In this configuration the data network and management network for Service Engines will be same. Field introduced in 18.2.1.
   * @return inband
  **/
  @ApiModelProperty(value = "Configure InBand Management as Google Cloud network configuration. In this configuration the data network and management network for Service Engines will be same. Field introduced in 18.2.1.")

  @Valid

 
  @VsoMethod  
  public GCPInBandManagement getInband() {
    return inband;
  }
    
  @VsoMethod
  public void setInband(GCPInBandManagement inband) {
    this.inband = inband;
  }

  
  /**
   * Configure One Arm Mode as Google Cloud network configuration. In this configuration the data network and the management network for the Service Engines will be separated. Field introduced in 18.2.1.
   * @return oneArm
  **/
  @ApiModelProperty(value = "Configure One Arm Mode as Google Cloud network configuration. In this configuration the data network and the management network for the Service Engines will be separated. Field introduced in 18.2.1.")

  @Valid

 
  @VsoMethod  
  public GCPOneArmMode getOneArm() {
    return oneArm;
  }
    
  @VsoMethod
  public void setOneArm(GCPOneArmMode oneArm) {
    this.oneArm = oneArm;
  }

  
  /**
   * Configure Two Arm Mode as Google Cloud network configuration. In this configuration the frontend data network, backend data network and the management network for the Service Engines will be separated. Field introduced in 18.2.1.
   * @return twoArm
  **/
  @ApiModelProperty(value = "Configure Two Arm Mode as Google Cloud network configuration. In this configuration the frontend data network, backend data network and the management network for the Service Engines will be separated. Field introduced in 18.2.1.")

  @Valid

 
  @VsoMethod  
  public GCPTwoArmMode getTwoArm() {
    return twoArm;
  }
    
  @VsoMethod
  public void setTwoArm(GCPTwoArmMode twoArm) {
    this.twoArm = twoArm;
  }

  
  public String getObjectID() {
		return "GCPNetworkConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPNetworkConfig gcPNetworkConfig = (GCPNetworkConfig) o;
    return Objects.equals(this.config, gcPNetworkConfig.config) &&
        Objects.equals(this.inband, gcPNetworkConfig.inband) &&
        Objects.equals(this.oneArm, gcPNetworkConfig.oneArm) &&
        Objects.equals(this.twoArm, gcPNetworkConfig.twoArm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, inband, oneArm, twoArm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPNetworkConfig {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    inband: ").append(toIndentedString(inband)).append("\n");
    sb.append("    oneArm: ").append(toIndentedString(oneArm)).append("\n");
    sb.append("    twoArm: ").append(toIndentedString(twoArm)).append("\n");
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

