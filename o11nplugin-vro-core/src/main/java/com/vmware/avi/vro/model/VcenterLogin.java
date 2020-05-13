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
 * VcenterLogin
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VcenterLogin")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERLOGIN, idAccessor = "getObjectID()")
@Service
public class VcenterLogin extends AviRestResource  {
  @JsonProperty("cloud_uuid")
  private String cloudUuid = null;

  @JsonProperty("password")
  private String password = "vmware";

  @JsonProperty("start_ts")
  private Long startTs = null;

  @JsonProperty("username")
  private String username = "root";

  @JsonProperty("vcenter_url")
  private String vcenterUrl = null;

  
  /**
   * Unique object identifier of cloud.
   * @return cloudUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of cloud.")


 
  @VsoMethod  
  public String getCloudUuid() {
    return cloudUuid;
  }
    
  @VsoMethod
  public void setCloudUuid(String cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  
  /**
   * password of VcenterLogin.
   * @return password
  **/
  @ApiModelProperty(value = "password of VcenterLogin.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * Number of start_ts.
   * @return startTs
  **/
  @ApiModelProperty(value = "Number of start_ts.")


 
  @VsoMethod  
  public Long getStartTs() {
    return startTs;
  }
    
  @VsoMethod
  public void setStartTs(Long startTs) {
    this.startTs = startTs;
  }

  
  /**
   * username of VcenterLogin.
   * @return username
  **/
  @ApiModelProperty(value = "username of VcenterLogin.")


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   * vcenter_url of VcenterLogin.
   * @return vcenterUrl
  **/
  @ApiModelProperty(value = "vcenter_url of VcenterLogin.")


 
  @VsoMethod  
  public String getVcenterUrl() {
    return vcenterUrl;
  }
    
  @VsoMethod
  public void setVcenterUrl(String vcenterUrl) {
    this.vcenterUrl = vcenterUrl;
  }

  
  public String getObjectID() {
		return "VcenterLogin";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcenterLogin vcenterLogin = (VcenterLogin) o;
    return Objects.equals(this.cloudUuid, vcenterLogin.cloudUuid) &&
        Objects.equals(this.password, vcenterLogin.password) &&
        Objects.equals(this.startTs, vcenterLogin.startTs) &&
        Objects.equals(this.username, vcenterLogin.username) &&
        Objects.equals(this.vcenterUrl, vcenterLogin.vcenterUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudUuid, password, startTs, username, vcenterUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcenterLogin {\n");
    
    sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    vcenterUrl: ").append(toIndentedString(vcenterUrl)).append("\n");
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

