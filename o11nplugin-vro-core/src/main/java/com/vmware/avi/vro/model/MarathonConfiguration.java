package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.PortRange;
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
 * MarathonConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MarathonConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_MARATHONCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class MarathonConfiguration extends AviRestResource  {
  @JsonProperty("framework_tag")
  private String frameworkTag = null;

  @JsonProperty("marathon_password")
  private String marathonPassword = null;

  @JsonProperty("marathon_url")
  private String marathonUrl = "http://leader.mesos:8080";

  @JsonProperty("marathon_username")
  private String marathonUsername = null;

  @JsonProperty("private_port_range")
  private PortRange privatePortRange = null;

  @JsonProperty("public_port_range")
  private PortRange publicPortRange = null;

  @JsonProperty("tenant")
  private String tenant = "admin";

  @JsonProperty("use_token_auth")
  private Boolean useTokenAuth = null;

  @JsonProperty("vs_name_tag_framework")
  private Boolean vsNameTagFramework = null;

  
  /**
   * Framework tag to be used in Virtualservice name. Default is framework name from Mesos. If this tag is altered atruntime, Virtualservices will be deleted and re-created.
   * @return frameworkTag
  **/
  @ApiModelProperty(value = "Framework tag to be used in Virtualservice name. Default is framework name from Mesos. If this tag is altered atruntime, Virtualservices will be deleted and re-created.")


 
  @VsoMethod  
  public String getFrameworkTag() {
    return frameworkTag;
  }
    
  @VsoMethod
  public void setFrameworkTag(String frameworkTag) {
    this.frameworkTag = frameworkTag;
  }

  
  /**
   * Password for Marathon authentication.
   * @return marathonPassword
  **/
  @ApiModelProperty(value = "Password for Marathon authentication.")


 
  @VsoMethod  
  public String getMarathonPassword() {
    return marathonPassword;
  }
    
  @VsoMethod
  public void setMarathonPassword(String marathonPassword) {
    this.marathonPassword = marathonPassword;
  }

  
  /**
   * Marathon API URL of the form http //host port.
   * @return marathonUrl
  **/
  @ApiModelProperty(value = "Marathon API URL of the form http //host port.")


 
  @VsoMethod  
  public String getMarathonUrl() {
    return marathonUrl;
  }
    
  @VsoMethod
  public void setMarathonUrl(String marathonUrl) {
    this.marathonUrl = marathonUrl;
  }

  
  /**
   * Username for Marathon authentication.
   * @return marathonUsername
  **/
  @ApiModelProperty(value = "Username for Marathon authentication.")


 
  @VsoMethod  
  public String getMarathonUsername() {
    return marathonUsername;
  }
    
  @VsoMethod
  public void setMarathonUsername(String marathonUsername) {
    this.marathonUsername = marathonUsername;
  }

  
  /**
   * Private port range allocated to this Marathon framework instance.
   * @return privatePortRange
  **/
  @ApiModelProperty(value = "Private port range allocated to this Marathon framework instance.")

  @Valid

 
  @VsoMethod  
  public PortRange getPrivatePortRange() {
    return privatePortRange;
  }
    
  @VsoMethod
  public void setPrivatePortRange(PortRange privatePortRange) {
    this.privatePortRange = privatePortRange;
  }

  
  /**
   * Public port range allocated to this Marathon framework instance.
   * @return publicPortRange
  **/
  @ApiModelProperty(value = "Public port range allocated to this Marathon framework instance.")

  @Valid

 
  @VsoMethod  
  public PortRange getPublicPortRange() {
    return publicPortRange;
  }
    
  @VsoMethod
  public void setPublicPortRange(PortRange publicPortRange) {
    this.publicPortRange = publicPortRange;
  }

  
  /**
   * Tenant to pin this Marathon instance to. If set, a tenant object will be created in Avi bearing this name and all applications created in this marathon will be associated with this tenant regardless of, if any, tenant configuration in marathon label for this application.
   * @return tenant
  **/
  @ApiModelProperty(value = "Tenant to pin this Marathon instance to. If set, a tenant object will be created in Avi bearing this name and all applications created in this marathon will be associated with this tenant regardless of, if any, tenant configuration in marathon label for this application.")


 
  @VsoMethod  
  public String getTenant() {
    return tenant;
  }
    
  @VsoMethod
  public void setTenant(String tenant) {
    this.tenant = tenant;
  }

  
  /**
   * Use Token based authentication instead of basic authentication. Token is refreshed every 5 minutes.
   * @return useTokenAuth
  **/
  @ApiModelProperty(value = "Use Token based authentication instead of basic authentication. Token is refreshed every 5 minutes.")


 
  @VsoMethod  
  public Boolean isUseTokenAuth() {
    return useTokenAuth;
  }
    
  @VsoMethod
  public void setUseTokenAuth(Boolean useTokenAuth) {
    this.useTokenAuth = useTokenAuth;
  }

  
  /**
   * Tag VS name with framework name or framework_tag. Useful in deployments with multiple frameworks.
   * @return vsNameTagFramework
  **/
  @ApiModelProperty(value = "Tag VS name with framework name or framework_tag. Useful in deployments with multiple frameworks.")


 
  @VsoMethod  
  public Boolean isVsNameTagFramework() {
    return vsNameTagFramework;
  }
    
  @VsoMethod
  public void setVsNameTagFramework(Boolean vsNameTagFramework) {
    this.vsNameTagFramework = vsNameTagFramework;
  }

  
  public String getObjectID() {
		return "MarathonConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarathonConfiguration marathonConfiguration = (MarathonConfiguration) o;
    return Objects.equals(this.frameworkTag, marathonConfiguration.frameworkTag) &&
        Objects.equals(this.marathonPassword, marathonConfiguration.marathonPassword) &&
        Objects.equals(this.marathonUrl, marathonConfiguration.marathonUrl) &&
        Objects.equals(this.marathonUsername, marathonConfiguration.marathonUsername) &&
        Objects.equals(this.privatePortRange, marathonConfiguration.privatePortRange) &&
        Objects.equals(this.publicPortRange, marathonConfiguration.publicPortRange) &&
        Objects.equals(this.tenant, marathonConfiguration.tenant) &&
        Objects.equals(this.useTokenAuth, marathonConfiguration.useTokenAuth) &&
        Objects.equals(this.vsNameTagFramework, marathonConfiguration.vsNameTagFramework);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameworkTag, marathonPassword, marathonUrl, marathonUsername, privatePortRange, publicPortRange, tenant, useTokenAuth, vsNameTagFramework);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarathonConfiguration {\n");
    
    sb.append("    frameworkTag: ").append(toIndentedString(frameworkTag)).append("\n");
    sb.append("    marathonPassword: ").append(toIndentedString(marathonPassword)).append("\n");
    sb.append("    marathonUrl: ").append(toIndentedString(marathonUrl)).append("\n");
    sb.append("    marathonUsername: ").append(toIndentedString(marathonUsername)).append("\n");
    sb.append("    privatePortRange: ").append(toIndentedString(privatePortRange)).append("\n");
    sb.append("    publicPortRange: ").append(toIndentedString(publicPortRange)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    useTokenAuth: ").append(toIndentedString(useTokenAuth)).append("\n");
    sb.append("    vsNameTagFramework: ").append(toIndentedString(vsNameTagFramework)).append("\n");
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

