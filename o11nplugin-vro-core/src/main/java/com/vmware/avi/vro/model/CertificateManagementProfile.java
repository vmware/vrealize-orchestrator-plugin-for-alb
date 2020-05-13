package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CustomParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * CertificateManagementProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CertificateManagementProfile")
@VsoFinder(name = Constants.FINDER_VRO_CERTIFICATEMANAGEMENTPROFILE, idAccessor = "getObjectID()")
@Service
public class CertificateManagementProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("script_params")
  @Valid
  private List<CustomParams> scriptParams = null;

  @JsonProperty("script_path")
  private String scriptPath = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

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
   * Name of the PKI Profile.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the PKI Profile.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public CertificateManagementProfile addScriptParamsItem(CustomParams scriptParamsItem) {
    if (this.scriptParams == null) {
      this.scriptParams = new ArrayList<CustomParams>();
    }
    this.scriptParams.add(scriptParamsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property script_params of obj type CertificateManagementProfile field type str  type object
   * @return scriptParams
  **/
  @ApiModelProperty(value = "Placeholder for description of property script_params of obj type CertificateManagementProfile field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<CustomParams> getScriptParams() {
    return scriptParams;
  }
    
  @VsoMethod
  public void setScriptParams(List<CustomParams> scriptParams) {
    this.scriptParams = scriptParams;
  }

  
  /**
   * script_path of CertificateManagementProfile.
   * @return scriptPath
  **/
  @ApiModelProperty(required = true, value = "script_path of CertificateManagementProfile.")
  @NotNull


 
  @VsoMethod  
  public String getScriptPath() {
    return scriptPath;
  }
    
  @VsoMethod
  public void setScriptPath(String scriptPath) {
    this.scriptPath = scriptPath;
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
		return "CertificateManagementProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateManagementProfile certificateManagementProfile = (CertificateManagementProfile) o;
    return Objects.equals(this.lastModified, certificateManagementProfile.lastModified) &&
        Objects.equals(this.name, certificateManagementProfile.name) &&
        Objects.equals(this.scriptParams, certificateManagementProfile.scriptParams) &&
        Objects.equals(this.scriptPath, certificateManagementProfile.scriptPath) &&
        Objects.equals(this.tenantRef, certificateManagementProfile.tenantRef) &&
        Objects.equals(this.url, certificateManagementProfile.url) &&
        Objects.equals(this.uuid, certificateManagementProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, name, scriptParams, scriptPath, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateManagementProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
    sb.append("    scriptPath: ").append(toIndentedString(scriptPath)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

