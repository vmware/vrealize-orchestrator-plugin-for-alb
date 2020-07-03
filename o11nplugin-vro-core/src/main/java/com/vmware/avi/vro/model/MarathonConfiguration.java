package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.PortRange;
import com.vmware.avi.vro.model.PortRange;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The MarathonConfiguration is a POJO class extends AviRestResource that used for creating
 * MarathonConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MarathonConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_MARATHONCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MarathonConfiguration extends AviRestResource {
  @JsonProperty("framework_tag")
  @JsonInclude(Include.NON_NULL)
  private String frameworkTag = null;

  @JsonProperty("marathon_password")
  @JsonInclude(Include.NON_NULL)
  private String marathonPassword = null;

  @JsonProperty("marathon_url")
  @JsonInclude(Include.NON_NULL)
  private String marathonUrl = "http://leader.mesos:8080";

  @JsonProperty("marathon_username")
  @JsonInclude(Include.NON_NULL)
  private String marathonUsername = null;

  @JsonProperty("private_port_range")
  @JsonInclude(Include.NON_NULL)
  private PortRange privatePortRange = null;

  @JsonProperty("public_port_range")
  @JsonInclude(Include.NON_NULL)
  private PortRange publicPortRange = null;

  @JsonProperty("tenant")
  @JsonInclude(Include.NON_NULL)
  private String tenant = "admin";

  @JsonProperty("use_token_auth")
  @JsonInclude(Include.NON_NULL)
  private Boolean useTokenAuth = false;

  @JsonProperty("vs_name_tag_framework")
  @JsonInclude(Include.NON_NULL)
  private Boolean vsNameTagFramework = false;



  /**
   * This is the getter method this will return the attribute value.
   * Framework tag to be used in virtualservice name.
   * Default is framework name from mesos.
   * If this tag is altered atruntime, virtualservices will be deleted and re-created.
   * @return frameworkTag
   */
  @VsoMethod
  public String getFrameworkTag() {
    return frameworkTag;
  }

  /**
   * This is the setter method to the attribute.
   * Framework tag to be used in virtualservice name.
   * Default is framework name from mesos.
   * If this tag is altered atruntime, virtualservices will be deleted and re-created.
   * @param frameworkTag set the frameworkTag.
   */
  @VsoMethod
  public void setFrameworkTag(String  frameworkTag) {
    this.frameworkTag = frameworkTag;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Password for marathon authentication.
   * @return marathonPassword
   */
  @VsoMethod
  public String getMarathonPassword() {
    return marathonPassword;
  }

  /**
   * This is the setter method to the attribute.
   * Password for marathon authentication.
   * @param marathonPassword set the marathonPassword.
   */
  @VsoMethod
  public void setMarathonPassword(String  marathonPassword) {
    this.marathonPassword = marathonPassword;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Marathon api url of the form http //host port.
   * Default value when not specified in API or module is interpreted by Avi Controller as http://leader.mesos:8080.
   * @return marathonUrl
   */
  @VsoMethod
  public String getMarathonUrl() {
    return marathonUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Marathon api url of the form http //host port.
   * Default value when not specified in API or module is interpreted by Avi Controller as http://leader.mesos:8080.
   * @param marathonUrl set the marathonUrl.
   */
  @VsoMethod
  public void setMarathonUrl(String  marathonUrl) {
    this.marathonUrl = marathonUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Username for marathon authentication.
   * @return marathonUsername
   */
  @VsoMethod
  public String getMarathonUsername() {
    return marathonUsername;
  }

  /**
   * This is the setter method to the attribute.
   * Username for marathon authentication.
   * @param marathonUsername set the marathonUsername.
   */
  @VsoMethod
  public void setMarathonUsername(String  marathonUsername) {
    this.marathonUsername = marathonUsername;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Private port range allocated to this marathon framework instance.
   * @return privatePortRange
   */
  @VsoMethod
  public PortRange getPrivatePortRange() {
    return privatePortRange;
  }

  /**
   * This is the setter method to the attribute.
   * Private port range allocated to this marathon framework instance.
   * @param privatePortRange set the privatePortRange.
   */
  @VsoMethod
  public void setPrivatePortRange(PortRange privatePortRange) {
    this.privatePortRange = privatePortRange;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Public port range allocated to this marathon framework instance.
   * @return publicPortRange
   */
  @VsoMethod
  public PortRange getPublicPortRange() {
    return publicPortRange;
  }

  /**
   * This is the setter method to the attribute.
   * Public port range allocated to this marathon framework instance.
   * @param publicPortRange set the publicPortRange.
   */
  @VsoMethod
  public void setPublicPortRange(PortRange publicPortRange) {
    this.publicPortRange = publicPortRange;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant to pin this marathon instance to.
   * If set, a tenant object will be created in avi bearing this name and all applications created in this marathon will be associated with this
   * tenant regardless of, if any, tenant configuration in marathon label for this application.
   * Default value when not specified in API or module is interpreted by Avi Controller as admin.
   * @return tenant
   */
  @VsoMethod
  public String getTenant() {
    return tenant;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant to pin this marathon instance to.
   * If set, a tenant object will be created in avi bearing this name and all applications created in this marathon will be associated with this
   * tenant regardless of, if any, tenant configuration in marathon label for this application.
   * Default value when not specified in API or module is interpreted by Avi Controller as admin.
   * @param tenant set the tenant.
   */
  @VsoMethod
  public void setTenant(String  tenant) {
    this.tenant = tenant;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use token based authentication instead of basic authentication.
   * Token is refreshed every 5 minutes.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useTokenAuth
   */
  @VsoMethod
  public Boolean getUseTokenAuth() {
    return useTokenAuth;
  }

  /**
   * This is the setter method to the attribute.
   * Use token based authentication instead of basic authentication.
   * Token is refreshed every 5 minutes.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useTokenAuth set the useTokenAuth.
   */
  @VsoMethod
  public void setUseTokenAuth(Boolean  useTokenAuth) {
    this.useTokenAuth = useTokenAuth;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tag vs name with framework name or framework_tag.
   * Useful in deployments with multiple frameworks.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return vsNameTagFramework
   */
  @VsoMethod
  public Boolean getVsNameTagFramework() {
    return vsNameTagFramework;
  }

  /**
   * This is the setter method to the attribute.
   * Tag vs name with framework name or framework_tag.
   * Useful in deployments with multiple frameworks.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param vsNameTagFramework set the vsNameTagFramework.
   */
  @VsoMethod
  public void setVsNameTagFramework(Boolean  vsNameTagFramework) {
    this.vsNameTagFramework = vsNameTagFramework;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MarathonConfiguration objMarathonConfiguration = (MarathonConfiguration) o;
  return   Objects.equals(this.marathonUrl, objMarathonConfiguration.marathonUrl)&&
  Objects.equals(this.marathonPassword, objMarathonConfiguration.marathonPassword)&&
  Objects.equals(this.privatePortRange, objMarathonConfiguration.privatePortRange)&&
  Objects.equals(this.useTokenAuth, objMarathonConfiguration.useTokenAuth)&&
  Objects.equals(this.marathonUsername, objMarathonConfiguration.marathonUsername)&&
  Objects.equals(this.publicPortRange, objMarathonConfiguration.publicPortRange)&&
  Objects.equals(this.vsNameTagFramework, objMarathonConfiguration.vsNameTagFramework)&&
  Objects.equals(this.frameworkTag, objMarathonConfiguration.frameworkTag)&&
  Objects.equals(this.tenant, objMarathonConfiguration.tenant);
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
