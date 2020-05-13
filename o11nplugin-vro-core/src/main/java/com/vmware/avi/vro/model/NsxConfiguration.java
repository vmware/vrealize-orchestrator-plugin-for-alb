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
 * NsxConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NsxConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_NSXCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class NsxConfiguration extends AviRestResource  {
  @JsonProperty("avi_nsx_prefix")
  private String aviNsxPrefix = null;

  @JsonProperty("nsx_manager_name")
  private String nsxManagerName = null;

  @JsonProperty("nsx_manager_password")
  private String nsxManagerPassword = null;

  @JsonProperty("nsx_manager_username")
  private String nsxManagerUsername = null;

  @JsonProperty("nsx_poll_time")
  private Integer nsxPollTime = 300;

  
  /**
   * This prefix will be added to the names of all NSX objects created by Avi Controller. It should be unique across all the Avi Controller clusters. Field introduced in 17.1.1.
   * @return aviNsxPrefix
  **/
  @ApiModelProperty(required = true, value = "This prefix will be added to the names of all NSX objects created by Avi Controller. It should be unique across all the Avi Controller clusters. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getAviNsxPrefix() {
    return aviNsxPrefix;
  }
    
  @VsoMethod
  public void setAviNsxPrefix(String aviNsxPrefix) {
    this.aviNsxPrefix = aviNsxPrefix;
  }

  
  /**
   * The hostname or IP address of the NSX MGr. Field introduced in 17.1.1.
   * @return nsxManagerName
  **/
  @ApiModelProperty(required = true, value = "The hostname or IP address of the NSX MGr. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getNsxManagerName() {
    return nsxManagerName;
  }
    
  @VsoMethod
  public void setNsxManagerName(String nsxManagerName) {
    this.nsxManagerName = nsxManagerName;
  }

  
  /**
   * The password Avi Vantage will use when authenticating with NSX Mgr. Field introduced in 17.1.1.
   * @return nsxManagerPassword
  **/
  @ApiModelProperty(required = true, value = "The password Avi Vantage will use when authenticating with NSX Mgr. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getNsxManagerPassword() {
    return nsxManagerPassword;
  }
    
  @VsoMethod
  public void setNsxManagerPassword(String nsxManagerPassword) {
    this.nsxManagerPassword = nsxManagerPassword;
  }

  
  /**
   * The username Avi Vantage will use when authenticating with NSX Mgr. Field introduced in 17.1.1.
   * @return nsxManagerUsername
  **/
  @ApiModelProperty(required = true, value = "The username Avi Vantage will use when authenticating with NSX Mgr. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getNsxManagerUsername() {
    return nsxManagerUsername;
  }
    
  @VsoMethod
  public void setNsxManagerUsername(String nsxManagerUsername) {
    this.nsxManagerUsername = nsxManagerUsername;
  }

  
  /**
   * The interval (in secs) with which Avi Controller polls the NSX Manager for updates. Field introduced in 17.1.1.
   * @return nsxPollTime
  **/
  @ApiModelProperty(required = true, value = "The interval (in secs) with which Avi Controller polls the NSX Manager for updates. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public Integer getNsxPollTime() {
    return nsxPollTime;
  }
    
  @VsoMethod
  public void setNsxPollTime(Integer nsxPollTime) {
    this.nsxPollTime = nsxPollTime;
  }

  
  public String getObjectID() {
		return "NsxConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NsxConfiguration nsxConfiguration = (NsxConfiguration) o;
    return Objects.equals(this.aviNsxPrefix, nsxConfiguration.aviNsxPrefix) &&
        Objects.equals(this.nsxManagerName, nsxConfiguration.nsxManagerName) &&
        Objects.equals(this.nsxManagerPassword, nsxConfiguration.nsxManagerPassword) &&
        Objects.equals(this.nsxManagerUsername, nsxConfiguration.nsxManagerUsername) &&
        Objects.equals(this.nsxPollTime, nsxConfiguration.nsxPollTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aviNsxPrefix, nsxManagerName, nsxManagerPassword, nsxManagerUsername, nsxPollTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NsxConfiguration {\n");
    
    sb.append("    aviNsxPrefix: ").append(toIndentedString(aviNsxPrefix)).append("\n");
    sb.append("    nsxManagerName: ").append(toIndentedString(nsxManagerName)).append("\n");
    sb.append("    nsxManagerPassword: ").append(toIndentedString(nsxManagerPassword)).append("\n");
    sb.append("    nsxManagerUsername: ").append(toIndentedString(nsxManagerUsername)).append("\n");
    sb.append("    nsxPollTime: ").append(toIndentedString(nsxPollTime)).append("\n");
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

