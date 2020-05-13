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
 * VIRetrievePGNames
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIRetrievePGNames")
@VsoFinder(name = Constants.FINDER_VRO_VIRETRIEVEPGNAMES, idAccessor = "getObjectID()")
@Service
public class VIRetrievePGNames extends AviRestResource  {
  @JsonProperty("cloud_uuid")
  private String cloudUuid = null;

  @JsonProperty("datacenter")
  private String datacenter = null;

  @JsonProperty("password")
  private String password = "vmware";

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
   * datacenter of VIRetrievePGNames.
   * @return datacenter
  **/
  @ApiModelProperty(value = "datacenter of VIRetrievePGNames.")


 
  @VsoMethod  
  public String getDatacenter() {
    return datacenter;
  }
    
  @VsoMethod
  public void setDatacenter(String datacenter) {
    this.datacenter = datacenter;
  }

  
  /**
   * password of VIRetrievePGNames.
   * @return password
  **/
  @ApiModelProperty(value = "password of VIRetrievePGNames.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * username of VIRetrievePGNames.
   * @return username
  **/
  @ApiModelProperty(value = "username of VIRetrievePGNames.")


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   * vcenter_url of VIRetrievePGNames.
   * @return vcenterUrl
  **/
  @ApiModelProperty(value = "vcenter_url of VIRetrievePGNames.")


 
  @VsoMethod  
  public String getVcenterUrl() {
    return vcenterUrl;
  }
    
  @VsoMethod
  public void setVcenterUrl(String vcenterUrl) {
    this.vcenterUrl = vcenterUrl;
  }

  
  public String getObjectID() {
		return "VIRetrievePGNames";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIRetrievePGNames viRetrievePGNames = (VIRetrievePGNames) o;
    return Objects.equals(this.cloudUuid, viRetrievePGNames.cloudUuid) &&
        Objects.equals(this.datacenter, viRetrievePGNames.datacenter) &&
        Objects.equals(this.password, viRetrievePGNames.password) &&
        Objects.equals(this.username, viRetrievePGNames.username) &&
        Objects.equals(this.vcenterUrl, viRetrievePGNames.vcenterUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudUuid, datacenter, password, username, vcenterUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIRetrievePGNames {\n");
    
    sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

