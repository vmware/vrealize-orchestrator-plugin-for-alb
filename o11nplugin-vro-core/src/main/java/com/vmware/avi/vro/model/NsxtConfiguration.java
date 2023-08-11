package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DataNetworkConfig;
import com.vmware.avi.vro.model.ManagementNetworkConfig;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The NsxtConfiguration is a POJO class extends AviRestResource that used for creating
 * NsxtConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_NSXTCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtConfiguration extends AviRestResource {
    @JsonProperty("automate_dfw_rules")
    @JsonInclude(Include.NON_NULL)
    private Boolean automateDfwRules = false;

    @JsonProperty("data_network_config")
    @JsonInclude(Include.NON_NULL)
    private DataNetworkConfig dataNetworkConfig = null;

    @JsonProperty("domain_id")
    @JsonInclude(Include.NON_NULL)
    private String domainId = "default";

    @JsonProperty("enforcementpoint_id")
    @JsonInclude(Include.NON_NULL)
    private String enforcementpointId = "default";

    @JsonProperty("management_network_config")
    @JsonInclude(Include.NON_NULL)
    private ManagementNetworkConfig managementNetworkConfig = null;

    @JsonProperty("nsxt_credentials_ref")
    @JsonInclude(Include.NON_NULL)
    private String nsxtCredentialsRef = null;

    @JsonProperty("nsxt_url")
    @JsonInclude(Include.NON_NULL)
    private String nsxtUrl = null;

    @JsonProperty("site_id")
    @JsonInclude(Include.NON_NULL)
    private String siteId = "default";

    @JsonProperty("vmc_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean vmcMode = false;

    @JsonProperty("vpc_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean vpcMode = null;



  /**
   * This is the getter method this will return the attribute value.
   * Automatically create dfw rules for virtualservice in nsx-t manager.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, basic edition(allowed values- false), essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return automateDfwRules
   */
  @VsoMethod
  public Boolean getAutomateDfwRules() {
    return automateDfwRules;
  }

  /**
   * This is the setter method to the attribute.
   * Automatically create dfw rules for virtualservice in nsx-t manager.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, basic edition(allowed values- false), essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param automateDfwRules set the automateDfwRules.
   */
  @VsoMethod
  public void setAutomateDfwRules(Boolean  automateDfwRules) {
    this.automateDfwRules = automateDfwRules;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Data network configuration for avi service engines.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dataNetworkConfig
   */
  @VsoMethod
  public DataNetworkConfig getDataNetworkConfig() {
    return dataNetworkConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Data network configuration for avi service engines.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dataNetworkConfig set the dataNetworkConfig.
   */
  @VsoMethod
  public void setDataNetworkConfig(DataNetworkConfig dataNetworkConfig) {
    this.dataNetworkConfig = dataNetworkConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Domain where nsgroup objects belongs to.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default".
   * @return domainId
   */
  @VsoMethod
  public String getDomainId() {
    return domainId;
  }

  /**
   * This is the setter method to the attribute.
   * Domain where nsgroup objects belongs to.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default".
   * @param domainId set the domainId.
   */
  @VsoMethod
  public void setDomainId(String  domainId) {
    this.domainId = domainId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enforcement point is where the rules of a policy to apply.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default".
   * @return enforcementpointId
   */
  @VsoMethod
  public String getEnforcementpointId() {
    return enforcementpointId;
  }

  /**
   * This is the setter method to the attribute.
   * Enforcement point is where the rules of a policy to apply.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default".
   * @param enforcementpointId set the enforcementpointId.
   */
  @VsoMethod
  public void setEnforcementpointId(String  enforcementpointId) {
    this.enforcementpointId = enforcementpointId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Management network configuration for avi service engines.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return managementNetworkConfig
   */
  @VsoMethod
  public ManagementNetworkConfig getManagementNetworkConfig() {
    return managementNetworkConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Management network configuration for avi service engines.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param managementNetworkConfig set the managementNetworkConfig.
   */
  @VsoMethod
  public void setManagementNetworkConfig(ManagementNetworkConfig managementNetworkConfig) {
    this.managementNetworkConfig = managementNetworkConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Credentials to access nsx-t manager.
   * It is a reference to an object of type cloudconnectoruser.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nsxtCredentialsRef
   */
  @VsoMethod
  public String getNsxtCredentialsRef() {
    return nsxtCredentialsRef;
  }

  /**
   * This is the setter method to the attribute.
   * Credentials to access nsx-t manager.
   * It is a reference to an object of type cloudconnectoruser.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nsxtCredentialsRef set the nsxtCredentialsRef.
   */
  @VsoMethod
  public void setNsxtCredentialsRef(String  nsxtCredentialsRef) {
    this.nsxtCredentialsRef = nsxtCredentialsRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Nsx-t manager hostname or ip address.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nsxtUrl
   */
  @VsoMethod
  public String getNsxtUrl() {
    return nsxtUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Nsx-t manager hostname or ip address.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nsxtUrl set the nsxtUrl.
   */
  @VsoMethod
  public void setNsxtUrl(String  nsxtUrl) {
    this.nsxtUrl = nsxtUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Site where transport zone belongs to.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default".
   * @return siteId
   */
  @VsoMethod
  public String getSiteId() {
    return siteId;
  }

  /**
   * This is the setter method to the attribute.
   * Site where transport zone belongs to.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default".
   * @param siteId set the siteId.
   */
  @VsoMethod
  public void setSiteId(String  siteId) {
    this.siteId = siteId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vmc mode.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return vmcMode
   */
  @VsoMethod
  public Boolean getVmcMode() {
    return vmcMode;
  }

  /**
   * This is the setter method to the attribute.
   * Vmc mode.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param vmcMode set the vmcMode.
   */
  @VsoMethod
  public void setVmcMode(Boolean  vmcMode) {
    this.vmcMode = vmcMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vpc mode.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vpcMode
   */
  @VsoMethod
  public Boolean getVpcMode() {
    return vpcMode;
  }

  /**
   * This is the setter method to the attribute.
   * Vpc mode.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vpcMode set the vpcMode.
   */
  @VsoMethod
  public void setVpcMode(Boolean  vpcMode) {
    this.vpcMode = vpcMode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NsxtConfiguration objNsxtConfiguration = (NsxtConfiguration) o;
  return   Objects.equals(this.nsxtUrl, objNsxtConfiguration.nsxtUrl)&&
  Objects.equals(this.nsxtCredentialsRef, objNsxtConfiguration.nsxtCredentialsRef)&&
  Objects.equals(this.siteId, objNsxtConfiguration.siteId)&&
  Objects.equals(this.enforcementpointId, objNsxtConfiguration.enforcementpointId)&&
  Objects.equals(this.domainId, objNsxtConfiguration.domainId)&&
  Objects.equals(this.automateDfwRules, objNsxtConfiguration.automateDfwRules)&&
  Objects.equals(this.managementNetworkConfig, objNsxtConfiguration.managementNetworkConfig)&&
  Objects.equals(this.dataNetworkConfig, objNsxtConfiguration.dataNetworkConfig)&&
  Objects.equals(this.vpcMode, objNsxtConfiguration.vpcMode)&&
  Objects.equals(this.vmcMode, objNsxtConfiguration.vmcMode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtConfiguration {\n");
      sb.append("    automateDfwRules: ").append(toIndentedString(automateDfwRules)).append("\n");
        sb.append("    dataNetworkConfig: ").append(toIndentedString(dataNetworkConfig)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    enforcementpointId: ").append(toIndentedString(enforcementpointId)).append("\n");
        sb.append("    managementNetworkConfig: ").append(toIndentedString(managementNetworkConfig)).append("\n");
        sb.append("    nsxtCredentialsRef: ").append(toIndentedString(nsxtCredentialsRef)).append("\n");
        sb.append("    nsxtUrl: ").append(toIndentedString(nsxtUrl)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    vmcMode: ").append(toIndentedString(vmcMode)).append("\n");
        sb.append("    vpcMode: ").append(toIndentedString(vpcMode)).append("\n");
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

