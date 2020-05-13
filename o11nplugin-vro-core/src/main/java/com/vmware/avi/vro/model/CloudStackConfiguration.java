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
 * CloudStackConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CloudStackConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDSTACKCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class CloudStackConfiguration extends AviRestResource  {
  @JsonProperty("access_key_id")
  private String accessKeyId = null;

  @JsonProperty("api_url")
  private String apiUrl = null;

  @JsonProperty("cntr_public_ip")
  private String cntrPublicIp = null;

  @JsonProperty("hypervisor")
  private String hypervisor = "KVM";

  @JsonProperty("mgmt_network_name")
  private String mgmtNetworkName = null;

  @JsonProperty("mgmt_network_uuid")
  private String mgmtNetworkUuid = null;

  @JsonProperty("secret_access_key")
  private String secretAccessKey = null;

  
  /**
   * CloudStack API Key.
   * @return accessKeyId
  **/
  @ApiModelProperty(required = true, value = "CloudStack API Key.")
  @NotNull


 
  @VsoMethod  
  public String getAccessKeyId() {
    return accessKeyId;
  }
    
  @VsoMethod
  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  
  /**
   * CloudStack API URL.
   * @return apiUrl
  **/
  @ApiModelProperty(required = true, value = "CloudStack API URL.")
  @NotNull


 
  @VsoMethod  
  public String getApiUrl() {
    return apiUrl;
  }
    
  @VsoMethod
  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  
  /**
   * If controller's management IP is in a private network, a publicly accessible IP to reach the controller.
   * @return cntrPublicIp
  **/
  @ApiModelProperty(value = "If controller's management IP is in a private network, a publicly accessible IP to reach the controller.")


 
  @VsoMethod  
  public String getCntrPublicIp() {
    return cntrPublicIp;
  }
    
  @VsoMethod
  public void setCntrPublicIp(String cntrPublicIp) {
    this.cntrPublicIp = cntrPublicIp;
  }

  
  /**
   * Default hypervisor type. Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * @return hypervisor
  **/
  @ApiModelProperty(value = "Default hypervisor type. Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.")


 
  @VsoMethod  
  public String getHypervisor() {
    return hypervisor;
  }
    
  @VsoMethod
  public void setHypervisor(String hypervisor) {
    this.hypervisor = hypervisor;
  }

  
  /**
   * Avi Management network name.
   * @return mgmtNetworkName
  **/
  @ApiModelProperty(required = true, value = "Avi Management network name.")
  @NotNull


 
  @VsoMethod  
  public String getMgmtNetworkName() {
    return mgmtNetworkName;
  }
    
  @VsoMethod
  public void setMgmtNetworkName(String mgmtNetworkName) {
    this.mgmtNetworkName = mgmtNetworkName;
  }

  
  /**
   * Avi Management network name.
   * @return mgmtNetworkUuid
  **/
  @ApiModelProperty(value = "Avi Management network name.")


 
  @VsoMethod  
  public String getMgmtNetworkUuid() {
    return mgmtNetworkUuid;
  }
    
  @VsoMethod
  public void setMgmtNetworkUuid(String mgmtNetworkUuid) {
    this.mgmtNetworkUuid = mgmtNetworkUuid;
  }

  
  /**
   * CloudStack Secret Key.
   * @return secretAccessKey
  **/
  @ApiModelProperty(required = true, value = "CloudStack Secret Key.")
  @NotNull


 
  @VsoMethod  
  public String getSecretAccessKey() {
    return secretAccessKey;
  }
    
  @VsoMethod
  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }

  
  public String getObjectID() {
		return "CloudStackConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudStackConfiguration cloudStackConfiguration = (CloudStackConfiguration) o;
    return Objects.equals(this.accessKeyId, cloudStackConfiguration.accessKeyId) &&
        Objects.equals(this.apiUrl, cloudStackConfiguration.apiUrl) &&
        Objects.equals(this.cntrPublicIp, cloudStackConfiguration.cntrPublicIp) &&
        Objects.equals(this.hypervisor, cloudStackConfiguration.hypervisor) &&
        Objects.equals(this.mgmtNetworkName, cloudStackConfiguration.mgmtNetworkName) &&
        Objects.equals(this.mgmtNetworkUuid, cloudStackConfiguration.mgmtNetworkUuid) &&
        Objects.equals(this.secretAccessKey, cloudStackConfiguration.secretAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, apiUrl, cntrPublicIp, hypervisor, mgmtNetworkName, mgmtNetworkUuid, secretAccessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudStackConfiguration {\n");
    
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    cntrPublicIp: ").append(toIndentedString(cntrPublicIp)).append("\n");
    sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
    sb.append("    mgmtNetworkName: ").append(toIndentedString(mgmtNetworkName)).append("\n");
    sb.append("    mgmtNetworkUuid: ").append(toIndentedString(mgmtNetworkUuid)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
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

