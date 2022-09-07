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
 * The GCPTwoArmMode is a POJO class extends AviRestResource that used for creating
 * GCPTwoArmMode.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GCPTwoArmMode")
@VsoFinder(name = Constants.FINDER_VRO_GCPTWOARMMODE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GCPTwoArmMode extends AviRestResource {
    @JsonProperty("backend_data_vpc_network_name")
    @JsonInclude(Include.NON_NULL)
    private String backendDataVpcNetworkName = null;

    @JsonProperty("backend_data_vpc_project_id")
    @JsonInclude(Include.NON_NULL)
    private String backendDataVpcProjectId = null;

    @JsonProperty("backend_data_vpc_subnet_name")
    @JsonInclude(Include.NON_NULL)
    private String backendDataVpcSubnetName = null;

    @JsonProperty("frontend_data_vpc_network_name")
    @JsonInclude(Include.NON_NULL)
    private String frontendDataVpcNetworkName = null;

    @JsonProperty("frontend_data_vpc_project_id")
    @JsonInclude(Include.NON_NULL)
    private String frontendDataVpcProjectId = null;

    @JsonProperty("frontend_data_vpc_subnet_name")
    @JsonInclude(Include.NON_NULL)
    private String frontendDataVpcSubnetName = null;

    @JsonProperty("management_vpc_network_name")
    @JsonInclude(Include.NON_NULL)
    private String managementVpcNetworkName = null;

    @JsonProperty("management_vpc_project_id")
    @JsonInclude(Include.NON_NULL)
    private String managementVpcProjectId = null;

    @JsonProperty("management_vpc_subnet_name")
    @JsonInclude(Include.NON_NULL)
    private String managementVpcSubnetName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Service engine backend data network name.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return backendDataVpcNetworkName
   */
  @VsoMethod
  public String getBackendDataVpcNetworkName() {
    return backendDataVpcNetworkName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine backend data network name.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param backendDataVpcNetworkName set the backendDataVpcNetworkName.
   */
  @VsoMethod
  public void setBackendDataVpcNetworkName(String  backendDataVpcNetworkName) {
    this.backendDataVpcNetworkName = backendDataVpcNetworkName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Project id of the service engine backend data network.
   * By default, service engine project id will be used.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return backendDataVpcProjectId
   */
  @VsoMethod
  public String getBackendDataVpcProjectId() {
    return backendDataVpcProjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Project id of the service engine backend data network.
   * By default, service engine project id will be used.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param backendDataVpcProjectId set the backendDataVpcProjectId.
   */
  @VsoMethod
  public void setBackendDataVpcProjectId(String  backendDataVpcProjectId) {
    this.backendDataVpcProjectId = backendDataVpcProjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine backend data network subnet name.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return backendDataVpcSubnetName
   */
  @VsoMethod
  public String getBackendDataVpcSubnetName() {
    return backendDataVpcSubnetName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine backend data network subnet name.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param backendDataVpcSubnetName set the backendDataVpcSubnetName.
   */
  @VsoMethod
  public void setBackendDataVpcSubnetName(String  backendDataVpcSubnetName) {
    this.backendDataVpcSubnetName = backendDataVpcSubnetName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine frontend data network name.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return frontendDataVpcNetworkName
   */
  @VsoMethod
  public String getFrontendDataVpcNetworkName() {
    return frontendDataVpcNetworkName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine frontend data network name.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param frontendDataVpcNetworkName set the frontendDataVpcNetworkName.
   */
  @VsoMethod
  public void setFrontendDataVpcNetworkName(String  frontendDataVpcNetworkName) {
    this.frontendDataVpcNetworkName = frontendDataVpcNetworkName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Project id of the service engine frontend data network.
   * By default, service engine project id will be used.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return frontendDataVpcProjectId
   */
  @VsoMethod
  public String getFrontendDataVpcProjectId() {
    return frontendDataVpcProjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Project id of the service engine frontend data network.
   * By default, service engine project id will be used.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param frontendDataVpcProjectId set the frontendDataVpcProjectId.
   */
  @VsoMethod
  public void setFrontendDataVpcProjectId(String  frontendDataVpcProjectId) {
    this.frontendDataVpcProjectId = frontendDataVpcProjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine frontend data network subnet name.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return frontendDataVpcSubnetName
   */
  @VsoMethod
  public String getFrontendDataVpcSubnetName() {
    return frontendDataVpcSubnetName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine frontend data network subnet name.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param frontendDataVpcSubnetName set the frontendDataVpcSubnetName.
   */
  @VsoMethod
  public void setFrontendDataVpcSubnetName(String  frontendDataVpcSubnetName) {
    this.frontendDataVpcSubnetName = frontendDataVpcSubnetName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine management network name.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return managementVpcNetworkName
   */
  @VsoMethod
  public String getManagementVpcNetworkName() {
    return managementVpcNetworkName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine management network name.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param managementVpcNetworkName set the managementVpcNetworkName.
   */
  @VsoMethod
  public void setManagementVpcNetworkName(String  managementVpcNetworkName) {
    this.managementVpcNetworkName = managementVpcNetworkName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Project id of the service engine management network.
   * By default, service engine project id will be used.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return managementVpcProjectId
   */
  @VsoMethod
  public String getManagementVpcProjectId() {
    return managementVpcProjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Project id of the service engine management network.
   * By default, service engine project id will be used.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param managementVpcProjectId set the managementVpcProjectId.
   */
  @VsoMethod
  public void setManagementVpcProjectId(String  managementVpcProjectId) {
    this.managementVpcProjectId = managementVpcProjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine management network subnet name.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return managementVpcSubnetName
   */
  @VsoMethod
  public String getManagementVpcSubnetName() {
    return managementVpcSubnetName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine management network subnet name.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param managementVpcSubnetName set the managementVpcSubnetName.
   */
  @VsoMethod
  public void setManagementVpcSubnetName(String  managementVpcSubnetName) {
    this.managementVpcSubnetName = managementVpcSubnetName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GCPTwoArmMode objGCPTwoArmMode = (GCPTwoArmMode) o;
  return   Objects.equals(this.frontendDataVpcSubnetName, objGCPTwoArmMode.frontendDataVpcSubnetName)&&
  Objects.equals(this.frontendDataVpcProjectId, objGCPTwoArmMode.frontendDataVpcProjectId)&&
  Objects.equals(this.managementVpcSubnetName, objGCPTwoArmMode.managementVpcSubnetName)&&
  Objects.equals(this.backendDataVpcSubnetName, objGCPTwoArmMode.backendDataVpcSubnetName)&&
  Objects.equals(this.frontendDataVpcNetworkName, objGCPTwoArmMode.frontendDataVpcNetworkName)&&
  Objects.equals(this.managementVpcNetworkName, objGCPTwoArmMode.managementVpcNetworkName)&&
  Objects.equals(this.backendDataVpcNetworkName, objGCPTwoArmMode.backendDataVpcNetworkName)&&
  Objects.equals(this.managementVpcProjectId, objGCPTwoArmMode.managementVpcProjectId)&&
  Objects.equals(this.backendDataVpcProjectId, objGCPTwoArmMode.backendDataVpcProjectId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GCPTwoArmMode {\n");
      sb.append("    backendDataVpcNetworkName: ").append(toIndentedString(backendDataVpcNetworkName)).append("\n");
        sb.append("    backendDataVpcProjectId: ").append(toIndentedString(backendDataVpcProjectId)).append("\n");
        sb.append("    backendDataVpcSubnetName: ").append(toIndentedString(backendDataVpcSubnetName)).append("\n");
        sb.append("    frontendDataVpcNetworkName: ").append(toIndentedString(frontendDataVpcNetworkName)).append("\n");
        sb.append("    frontendDataVpcProjectId: ").append(toIndentedString(frontendDataVpcProjectId)).append("\n");
        sb.append("    frontendDataVpcSubnetName: ").append(toIndentedString(frontendDataVpcSubnetName)).append("\n");
        sb.append("    managementVpcNetworkName: ").append(toIndentedString(managementVpcNetworkName)).append("\n");
        sb.append("    managementVpcProjectId: ").append(toIndentedString(managementVpcProjectId)).append("\n");
        sb.append("    managementVpcSubnetName: ").append(toIndentedString(managementVpcSubnetName)).append("\n");
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

