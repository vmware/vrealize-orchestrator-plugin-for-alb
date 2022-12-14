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
 * The CloudStackConfiguration is a POJO class extends AviRestResource that used for creating
 * CloudStackConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudStackConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDSTACKCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudStackConfiguration extends AviRestResource {
    @JsonProperty("access_key_id")
    @JsonInclude(Include.NON_NULL)
    private String accessKeyId = null;

    @JsonProperty("api_url")
    @JsonInclude(Include.NON_NULL)
    private String apiUrl = null;

    @JsonProperty("cntr_public_ip")
    @JsonInclude(Include.NON_NULL)
    private String cntrPublicIp = null;

    @JsonProperty("hypervisor")
    @JsonInclude(Include.NON_NULL)
    private String hypervisor = "KVM";

    @JsonProperty("mgmt_network_name")
    @JsonInclude(Include.NON_NULL)
    private String mgmtNetworkName = null;

    @JsonProperty("mgmt_network_uuid")
    @JsonInclude(Include.NON_NULL)
    private String mgmtNetworkUuid = null;

    @JsonProperty("secret_access_key")
    @JsonInclude(Include.NON_NULL)
    private String secretAccessKey = null;



  /**
   * This is the getter method this will return the attribute value.
   * Cloudstack api key.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return accessKeyId
   */
  @VsoMethod
  public String getAccessKeyId() {
    return accessKeyId;
  }

  /**
   * This is the setter method to the attribute.
   * Cloudstack api key.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param accessKeyId set the accessKeyId.
   */
  @VsoMethod
  public void setAccessKeyId(String  accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloudstack api url.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return apiUrl
   */
  @VsoMethod
  public String getApiUrl() {
    return apiUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Cloudstack api url.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param apiUrl set the apiUrl.
   */
  @VsoMethod
  public void setApiUrl(String  apiUrl) {
    this.apiUrl = apiUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If controller's management ip is in a private network, a publicly accessible ip to reach the controller.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cntrPublicIp
   */
  @VsoMethod
  public String getCntrPublicIp() {
    return cntrPublicIp;
  }

  /**
   * This is the setter method to the attribute.
   * If controller's management ip is in a private network, a publicly accessible ip to reach the controller.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cntrPublicIp set the cntrPublicIp.
   */
  @VsoMethod
  public void setCntrPublicIp(String  cntrPublicIp) {
    this.cntrPublicIp = cntrPublicIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default hypervisor type.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "KVM".
   * @return hypervisor
   */
  @VsoMethod
  public String getHypervisor() {
    return hypervisor;
  }

  /**
   * This is the setter method to the attribute.
   * Default hypervisor type.
   * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "KVM".
   * @param hypervisor set the hypervisor.
   */
  @VsoMethod
  public void setHypervisor(String  hypervisor) {
    this.hypervisor = hypervisor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Avi management network name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mgmtNetworkName
   */
  @VsoMethod
  public String getMgmtNetworkName() {
    return mgmtNetworkName;
  }

  /**
   * This is the setter method to the attribute.
   * Avi management network name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mgmtNetworkName set the mgmtNetworkName.
   */
  @VsoMethod
  public void setMgmtNetworkName(String  mgmtNetworkName) {
    this.mgmtNetworkName = mgmtNetworkName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Avi management network name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mgmtNetworkUuid
   */
  @VsoMethod
  public String getMgmtNetworkUuid() {
    return mgmtNetworkUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Avi management network name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mgmtNetworkUuid set the mgmtNetworkUuid.
   */
  @VsoMethod
  public void setMgmtNetworkUuid(String  mgmtNetworkUuid) {
    this.mgmtNetworkUuid = mgmtNetworkUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloudstack secret key.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return secretAccessKey
   */
  @VsoMethod
  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  /**
   * This is the setter method to the attribute.
   * Cloudstack secret key.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param secretAccessKey set the secretAccessKey.
   */
  @VsoMethod
  public void setSecretAccessKey(String  secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CloudStackConfiguration objCloudStackConfiguration = (CloudStackConfiguration) o;
  return   Objects.equals(this.apiUrl, objCloudStackConfiguration.apiUrl)&&
  Objects.equals(this.accessKeyId, objCloudStackConfiguration.accessKeyId)&&
  Objects.equals(this.secretAccessKey, objCloudStackConfiguration.secretAccessKey)&&
  Objects.equals(this.mgmtNetworkName, objCloudStackConfiguration.mgmtNetworkName)&&
  Objects.equals(this.mgmtNetworkUuid, objCloudStackConfiguration.mgmtNetworkUuid)&&
  Objects.equals(this.cntrPublicIp, objCloudStackConfiguration.cntrPublicIp)&&
  Objects.equals(this.hypervisor, objCloudStackConfiguration.hypervisor);
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

