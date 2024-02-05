package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GCPInBandManagement;
import com.vmware.avi.vro.model.GCPOneArmMode;
import com.vmware.avi.vro.model.GCPTwoArmMode;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GCPNetworkConfig is a POJO class extends AviRestResource that used for creating
 * GCPNetworkConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GCPNetworkConfig")
@VsoFinder(name = Constants.FINDER_VRO_GCPNETWORKCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GCPNetworkConfig extends AviRestResource {
    @JsonProperty("config")
    @JsonInclude(Include.NON_NULL)
    private String config;

    @JsonProperty("inband")
    @JsonInclude(Include.NON_NULL)
    private GCPInBandManagement inband;

    @JsonProperty("one_arm")
    @JsonInclude(Include.NON_NULL)
    private GCPOneArmMode oneArm;

    @JsonProperty("two_arm")
    @JsonInclude(Include.NON_NULL)
    private GCPTwoArmMode twoArm;



  /**
   * This is the getter method this will return the attribute value.
   * Config mode for google cloud network configuration.
   * Enum options - INBAND_MANAGEMENT, ONE_ARM_MODE, TWO_ARM_MODE.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return config
   */
  @VsoMethod
  public String getConfig() {
    return config;
  }

  /**
   * This is the setter method to the attribute.
   * Config mode for google cloud network configuration.
   * Enum options - INBAND_MANAGEMENT, ONE_ARM_MODE, TWO_ARM_MODE.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param config set the config.
   */
  @VsoMethod
  public void setConfig(String  config) {
    this.config = config;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure inband management as google cloud network configuration.
   * In this configuration the data network and management network for service engines will be same.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return inband
   */
  @VsoMethod
  public GCPInBandManagement getInband() {
    return inband;
  }

  /**
   * This is the setter method to the attribute.
   * Configure inband management as google cloud network configuration.
   * In this configuration the data network and management network for service engines will be same.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param inband set the inband.
   */
  @VsoMethod
  public void setInband(GCPInBandManagement inband) {
    this.inband = inband;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure one arm mode as google cloud network configuration.
   * In this configuration the data network and the management network for the service engines will be separated.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oneArm
   */
  @VsoMethod
  public GCPOneArmMode getOneArm() {
    return oneArm;
  }

  /**
   * This is the setter method to the attribute.
   * Configure one arm mode as google cloud network configuration.
   * In this configuration the data network and the management network for the service engines will be separated.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oneArm set the oneArm.
   */
  @VsoMethod
  public void setOneArm(GCPOneArmMode oneArm) {
    this.oneArm = oneArm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure two arm mode as google cloud network configuration.
   * In this configuration the frontend data network, backend data network and the management network for the service engines will be separated.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return twoArm
   */
  @VsoMethod
  public GCPTwoArmMode getTwoArm() {
    return twoArm;
  }

  /**
   * This is the setter method to the attribute.
   * Configure two arm mode as google cloud network configuration.
   * In this configuration the frontend data network, backend data network and the management network for the service engines will be separated.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param twoArm set the twoArm.
   */
  @VsoMethod
  public void setTwoArm(GCPTwoArmMode twoArm) {
    this.twoArm = twoArm;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GCPNetworkConfig objGCPNetworkConfig = (GCPNetworkConfig) o;
  return   Objects.equals(this.config, objGCPNetworkConfig.config)&&
  Objects.equals(this.inband, objGCPNetworkConfig.inband)&&
  Objects.equals(this.oneArm, objGCPNetworkConfig.oneArm)&&
  Objects.equals(this.twoArm, objGCPNetworkConfig.twoArm);
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

