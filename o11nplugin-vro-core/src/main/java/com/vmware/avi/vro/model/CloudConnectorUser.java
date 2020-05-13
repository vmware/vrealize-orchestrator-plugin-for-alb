package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AzureServicePrincipalCredentials;
import com.vmware.avi.vro.model.AzureUserPassCredentials;
import com.vmware.avi.vro.model.GCPCredentials;
import com.vmware.avi.vro.model.OCICredentials;
import com.vmware.avi.vro.model.TencentCredentials;
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
 * CloudConnectorUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CloudConnectorUser")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDCONNECTORUSER, idAccessor = "getObjectID()")
@Service
public class CloudConnectorUser extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("azure_serviceprincipal")
  private AzureServicePrincipalCredentials azureServiceprincipal = null;

  @JsonProperty("azure_userpass")
  private AzureUserPassCredentials azureUserpass = null;

  @JsonProperty("gcp_credentials")
  private GCPCredentials gcpCredentials = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("oci_credentials")
  private OCICredentials ociCredentials = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("private_key")
  private String privateKey = null;

  @JsonProperty("public_key")
  private String publicKey = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("tencent_credentials")
  private TencentCredentials tencentCredentials = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   *  Field introduced in 17.2.1.
   * @return azureServiceprincipal
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public AzureServicePrincipalCredentials getAzureServiceprincipal() {
    return azureServiceprincipal;
  }
    
  @VsoMethod
  public void setAzureServiceprincipal(AzureServicePrincipalCredentials azureServiceprincipal) {
    this.azureServiceprincipal = azureServiceprincipal;
  }

  
  /**
   *  Field introduced in 17.2.1.
   * @return azureUserpass
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public AzureUserPassCredentials getAzureUserpass() {
    return azureUserpass;
  }
    
  @VsoMethod
  public void setAzureUserpass(AzureUserPassCredentials azureUserpass) {
    this.azureUserpass = azureUserpass;
  }

  
  /**
   * Credentials for Google Cloud Platform. Field introduced in 18.2.1.
   * @return gcpCredentials
  **/
  @ApiModelProperty(value = "Credentials for Google Cloud Platform. Field introduced in 18.2.1.")

  @Valid

 
  @VsoMethod  
  public GCPCredentials getGcpCredentials() {
    return gcpCredentials;
  }
    
  @VsoMethod
  public void setGcpCredentials(GCPCredentials gcpCredentials) {
    this.gcpCredentials = gcpCredentials;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Credentials for Oracle Cloud Infrastructure. Field introduced in 18.2.1,18.1.3.
   * @return ociCredentials
  **/
  @ApiModelProperty(value = "Credentials for Oracle Cloud Infrastructure. Field introduced in 18.2.1,18.1.3.")

  @Valid

 
  @VsoMethod  
  public OCICredentials getOciCredentials() {
    return ociCredentials;
  }
    
  @VsoMethod
  public void setOciCredentials(OCICredentials ociCredentials) {
    this.ociCredentials = ociCredentials;
  }

  
  /**
   * password of CloudConnectorUser.
   * @return password
  **/
  @ApiModelProperty(value = "password of CloudConnectorUser.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * private_key of CloudConnectorUser.
   * @return privateKey
  **/
  @ApiModelProperty(value = "private_key of CloudConnectorUser.")


 
  @VsoMethod  
  public String getPrivateKey() {
    return privateKey;
  }
    
  @VsoMethod
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  
  /**
   * public_key of CloudConnectorUser.
   * @return publicKey
  **/
  @ApiModelProperty(value = "public_key of CloudConnectorUser.")


 
  @VsoMethod  
  public String getPublicKey() {
    return publicKey;
  }
    
  @VsoMethod
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * Credentials for Tencent Cloud. Field introduced in 18.2.3.
   * @return tencentCredentials
  **/
  @ApiModelProperty(value = "Credentials for Tencent Cloud. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public TencentCredentials getTencentCredentials() {
    return tencentCredentials;
  }
    
  @VsoMethod
  public void setTencentCredentials(TencentCredentials tencentCredentials) {
    this.tencentCredentials = tencentCredentials;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "CloudConnectorUser";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudConnectorUser cloudConnectorUser = (CloudConnectorUser) o;
    return Objects.equals(this.lastModified, cloudConnectorUser.lastModified) &&
        Objects.equals(this.azureServiceprincipal, cloudConnectorUser.azureServiceprincipal) &&
        Objects.equals(this.azureUserpass, cloudConnectorUser.azureUserpass) &&
        Objects.equals(this.gcpCredentials, cloudConnectorUser.gcpCredentials) &&
        Objects.equals(this.name, cloudConnectorUser.name) &&
        Objects.equals(this.ociCredentials, cloudConnectorUser.ociCredentials) &&
        Objects.equals(this.password, cloudConnectorUser.password) &&
        Objects.equals(this.privateKey, cloudConnectorUser.privateKey) &&
        Objects.equals(this.publicKey, cloudConnectorUser.publicKey) &&
        Objects.equals(this.tenantRef, cloudConnectorUser.tenantRef) &&
        Objects.equals(this.tencentCredentials, cloudConnectorUser.tencentCredentials) &&
        Objects.equals(this.url, cloudConnectorUser.url) &&
        Objects.equals(this.uuid, cloudConnectorUser.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, azureServiceprincipal, azureUserpass, gcpCredentials, name, ociCredentials, password, privateKey, publicKey, tenantRef, tencentCredentials, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConnectorUser {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    azureServiceprincipal: ").append(toIndentedString(azureServiceprincipal)).append("\n");
    sb.append("    azureUserpass: ").append(toIndentedString(azureUserpass)).append("\n");
    sb.append("    gcpCredentials: ").append(toIndentedString(gcpCredentials)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ociCredentials: ").append(toIndentedString(ociCredentials)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    tencentCredentials: ").append(toIndentedString(tencentCredentials)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

