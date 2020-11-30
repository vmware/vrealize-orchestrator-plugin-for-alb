package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AzureServicePrincipalCredentials;
import com.vmware.avi.vro.model.AzureUserPassCredentials;
import com.vmware.avi.vro.model.GCPCredentials;
import com.vmware.avi.vro.model.NsxtCredentials;
import com.vmware.avi.vro.model.OCICredentials;
import com.vmware.avi.vro.model.TencentCredentials;
import com.vmware.avi.vro.model.VCenterCredentials;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The CloudConnectorUser is a POJO class extends AviRestResource that used for creating
 * CloudConnectorUser.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudConnectorUser")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDCONNECTORUSER, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudConnectorUser extends AviRestResource {
    @JsonProperty("azure_serviceprincipal")
    @JsonInclude(Include.NON_NULL)
    private AzureServicePrincipalCredentials azureServiceprincipal = null;

    @JsonProperty("azure_userpass")
    @JsonInclude(Include.NON_NULL)
    private AzureUserPassCredentials azureUserpass = null;

    @JsonProperty("gcp_credentials")
    @JsonInclude(Include.NON_NULL)
    private GCPCredentials gcpCredentials = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("nsxt_credentials")
    @JsonInclude(Include.NON_NULL)
    private NsxtCredentials nsxtCredentials = null;

    @JsonProperty("oci_credentials")
    @JsonInclude(Include.NON_NULL)
    private OCICredentials ociCredentials = null;

    @JsonProperty("password")
    @JsonInclude(Include.NON_NULL)
    private String password = null;

    @JsonProperty("private_key")
    @JsonInclude(Include.NON_NULL)
    private String privateKey = null;

    @JsonProperty("public_key")
    @JsonInclude(Include.NON_NULL)
    private String publicKey = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("tencent_credentials")
    @JsonInclude(Include.NON_NULL)
    private TencentCredentials tencentCredentials = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("vcenter_credentials")
    @JsonInclude(Include.NON_NULL)
    private VCenterCredentials vcenterCredentials = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.1.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azureServiceprincipal
   */
  @VsoMethod
  public AzureServicePrincipalCredentials getAzureServiceprincipal() {
    return azureServiceprincipal;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.1.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param azureServiceprincipal set the azureServiceprincipal.
   */
  @VsoMethod
  public void setAzureServiceprincipal(AzureServicePrincipalCredentials azureServiceprincipal) {
    this.azureServiceprincipal = azureServiceprincipal;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.1.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azureUserpass
   */
  @VsoMethod
  public AzureUserPassCredentials getAzureUserpass() {
    return azureUserpass;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.1.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param azureUserpass set the azureUserpass.
   */
  @VsoMethod
  public void setAzureUserpass(AzureUserPassCredentials azureUserpass) {
    this.azureUserpass = azureUserpass;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Credentials for google cloud platform.
   * Field introduced in 18.2.1.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gcpCredentials
   */
  @VsoMethod
  public GCPCredentials getGcpCredentials() {
    return gcpCredentials;
  }

  /**
   * This is the setter method to the attribute.
   * Credentials for google cloud platform.
   * Field introduced in 18.2.1.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gcpCredentials set the gcpCredentials.
   */
  @VsoMethod
  public void setGcpCredentials(GCPCredentials gcpCredentials) {
    this.gcpCredentials = gcpCredentials;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Credentials to talk to nsx-t manager.
   * Field introduced in 20.1.1.
   * Allowed in essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nsxtCredentials
   */
  @VsoMethod
  public NsxtCredentials getNsxtCredentials() {
    return nsxtCredentials;
  }

  /**
   * This is the setter method to the attribute.
   * Credentials to talk to nsx-t manager.
   * Field introduced in 20.1.1.
   * Allowed in essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nsxtCredentials set the nsxtCredentials.
   */
  @VsoMethod
  public void setNsxtCredentials(NsxtCredentials nsxtCredentials) {
    this.nsxtCredentials = nsxtCredentials;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Credentials for oracle cloud infrastructure.
   * Field introduced in 18.2.1,18.1.3.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ociCredentials
   */
  @VsoMethod
  public OCICredentials getOciCredentials() {
    return ociCredentials;
  }

  /**
   * This is the setter method to the attribute.
   * Credentials for oracle cloud infrastructure.
   * Field introduced in 18.2.1,18.1.3.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ociCredentials set the ociCredentials.
   */
  @VsoMethod
  public void setOciCredentials(OCICredentials ociCredentials) {
    this.ociCredentials = ociCredentials;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property password of obj type cloudconnectoruser field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return password
   */
  @VsoMethod
  public String getPassword() {
    return password;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property password of obj type cloudconnectoruser field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param password set the password.
   */
  @VsoMethod
  public void setPassword(String  password) {
    this.password = password;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property private_key of obj type cloudconnectoruser field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return privateKey
   */
  @VsoMethod
  public String getPrivateKey() {
    return privateKey;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property private_key of obj type cloudconnectoruser field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param privateKey set the privateKey.
   */
  @VsoMethod
  public void setPrivateKey(String  privateKey) {
    this.privateKey = privateKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property public_key of obj type cloudconnectoruser field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return publicKey
   */
  @VsoMethod
  public String getPublicKey() {
    return publicKey;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property public_key of obj type cloudconnectoruser field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param publicKey set the publicKey.
   */
  @VsoMethod
  public void setPublicKey(String  publicKey) {
    this.publicKey = publicKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Credentials for tencent cloud.
   * Field introduced in 18.2.3.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tencentCredentials
   */
  @VsoMethod
  public TencentCredentials getTencentCredentials() {
    return tencentCredentials;
  }

  /**
   * This is the setter method to the attribute.
   * Credentials for tencent cloud.
   * Field introduced in 18.2.3.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tencentCredentials set the tencentCredentials.
   */
  @VsoMethod
  public void setTencentCredentials(TencentCredentials tencentCredentials) {
    this.tencentCredentials = tencentCredentials;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Credentials to talk to vcenter.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterCredentials
   */
  @VsoMethod
  public VCenterCredentials getVcenterCredentials() {
    return vcenterCredentials;
  }

  /**
   * This is the setter method to the attribute.
   * Credentials to talk to vcenter.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterCredentials set the vcenterCredentials.
   */
  @VsoMethod
  public void setVcenterCredentials(VCenterCredentials vcenterCredentials) {
    this.vcenterCredentials = vcenterCredentials;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CloudConnectorUser objCloudConnectorUser = (CloudConnectorUser) o;
  return   Objects.equals(this.uuid, objCloudConnectorUser.uuid)&&
  Objects.equals(this.name, objCloudConnectorUser.name)&&
  Objects.equals(this.privateKey, objCloudConnectorUser.privateKey)&&
  Objects.equals(this.publicKey, objCloudConnectorUser.publicKey)&&
  Objects.equals(this.password, objCloudConnectorUser.password)&&
  Objects.equals(this.azureUserpass, objCloudConnectorUser.azureUserpass)&&
  Objects.equals(this.azureServiceprincipal, objCloudConnectorUser.azureServiceprincipal)&&
  Objects.equals(this.ociCredentials, objCloudConnectorUser.ociCredentials)&&
  Objects.equals(this.gcpCredentials, objCloudConnectorUser.gcpCredentials)&&
  Objects.equals(this.tencentCredentials, objCloudConnectorUser.tencentCredentials)&&
  Objects.equals(this.nsxtCredentials, objCloudConnectorUser.nsxtCredentials)&&
  Objects.equals(this.vcenterCredentials, objCloudConnectorUser.vcenterCredentials)&&
  Objects.equals(this.tenantRef, objCloudConnectorUser.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CloudConnectorUser {\n");
      sb.append("    azureServiceprincipal: ").append(toIndentedString(azureServiceprincipal)).append("\n");
        sb.append("    azureUserpass: ").append(toIndentedString(azureUserpass)).append("\n");
        sb.append("    gcpCredentials: ").append(toIndentedString(gcpCredentials)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nsxtCredentials: ").append(toIndentedString(nsxtCredentials)).append("\n");
        sb.append("    ociCredentials: ").append(toIndentedString(ociCredentials)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    tencentCredentials: ").append(toIndentedString(tencentCredentials)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vcenterCredentials: ").append(toIndentedString(vcenterCredentials)).append("\n");
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

