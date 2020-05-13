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
 * CustomIpamDnsProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CustomIpamDnsProfile")
@VsoFinder(name = Constants.FINDER_VRO_CUSTOMIPAMDNSPROFILE, idAccessor = "getObjectID()")
@Service
public class CustomIpamDnsProfile extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("script_params")
  @Valid
  private List<CustomParams> scriptParams = null;

  @JsonProperty("script_uri")
  private String scriptUri = null;

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
   * Name of the Custom IPAM DNS Profile. Field introduced in 17.1.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the Custom IPAM DNS Profile. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public CustomIpamDnsProfile addScriptParamsItem(CustomParams scriptParamsItem) {
    if (this.scriptParams == null) {
      this.scriptParams = new ArrayList<CustomParams>();
    }
    this.scriptParams.add(scriptParamsItem);
    return this;
  }
  
  /**
   * Parameters that are always passed to the IPAM/DNS script. Field introduced in 17.1.1.
   * @return scriptParams
  **/
  @ApiModelProperty(value = "Parameters that are always passed to the IPAM/DNS script. Field introduced in 17.1.1.")

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
   * Script URI of form controller //ipamdnsscripts/<file-name>. Field introduced in 17.1.1.
   * @return scriptUri
  **/
  @ApiModelProperty(required = true, value = "Script URI of form controller //ipamdnsscripts/<file-name>. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getScriptUri() {
    return scriptUri;
  }
    
  @VsoMethod
  public void setScriptUri(String scriptUri) {
    this.scriptUri = scriptUri;
  }

  
  /**
   *  It is a reference to an object of type Tenant. Field introduced in 17.1.1.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 17.1.1.")


 
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
   *  Field introduced in 17.1.1.
   * @return uuid
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "CustomIpamDnsProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomIpamDnsProfile customIpamDnsProfile = (CustomIpamDnsProfile) o;
    return Objects.equals(this.lastModified, customIpamDnsProfile.lastModified) &&
        Objects.equals(this.name, customIpamDnsProfile.name) &&
        Objects.equals(this.scriptParams, customIpamDnsProfile.scriptParams) &&
        Objects.equals(this.scriptUri, customIpamDnsProfile.scriptUri) &&
        Objects.equals(this.tenantRef, customIpamDnsProfile.tenantRef) &&
        Objects.equals(this.url, customIpamDnsProfile.url) &&
        Objects.equals(this.uuid, customIpamDnsProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, name, scriptParams, scriptUri, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomIpamDnsProfile {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
    sb.append("    scriptUri: ").append(toIndentedString(scriptUri)).append("\n");
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

