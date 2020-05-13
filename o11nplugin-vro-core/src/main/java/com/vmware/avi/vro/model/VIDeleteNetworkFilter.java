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
 * VIDeleteNetworkFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIDeleteNetworkFilter")
@VsoFinder(name = Constants.FINDER_VRO_VIDELETENETWORKFILTER, idAccessor = "getObjectID()")
@Service
public class VIDeleteNetworkFilter extends AviRestResource  {
  @JsonProperty("cloud_uuid")
  private String cloudUuid = null;

  @JsonProperty("datacenter")
  private String datacenter = null;

  @JsonProperty("network_uuid")
  private String networkUuid = null;

  @JsonProperty("vcenter_url")
  private String vcenterUrl = null;

  
  /**
   *  Field introduced in 17.1.3.
   * @return cloudUuid
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.3.")


 
  @VsoMethod  
  public String getCloudUuid() {
    return cloudUuid;
  }
    
  @VsoMethod
  public void setCloudUuid(String cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  
  /**
   *  Field introduced in 17.1.3.
   * @return datacenter
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.3.")


 
  @VsoMethod  
  public String getDatacenter() {
    return datacenter;
  }
    
  @VsoMethod
  public void setDatacenter(String datacenter) {
    this.datacenter = datacenter;
  }

  
  /**
   *  Field introduced in 17.1.3.
   * @return networkUuid
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.3.")


 
  @VsoMethod  
  public String getNetworkUuid() {
    return networkUuid;
  }
    
  @VsoMethod
  public void setNetworkUuid(String networkUuid) {
    this.networkUuid = networkUuid;
  }

  
  /**
   *  Field introduced in 17.1.3.
   * @return vcenterUrl
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.3.")


 
  @VsoMethod  
  public String getVcenterUrl() {
    return vcenterUrl;
  }
    
  @VsoMethod
  public void setVcenterUrl(String vcenterUrl) {
    this.vcenterUrl = vcenterUrl;
  }

  
  public String getObjectID() {
		return "VIDeleteNetworkFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIDeleteNetworkFilter viDeleteNetworkFilter = (VIDeleteNetworkFilter) o;
    return Objects.equals(this.cloudUuid, viDeleteNetworkFilter.cloudUuid) &&
        Objects.equals(this.datacenter, viDeleteNetworkFilter.datacenter) &&
        Objects.equals(this.networkUuid, viDeleteNetworkFilter.networkUuid) &&
        Objects.equals(this.vcenterUrl, viDeleteNetworkFilter.vcenterUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudUuid, datacenter, networkUuid, vcenterUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIDeleteNetworkFilter {\n");
    
    sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
    sb.append("    networkUuid: ").append(toIndentedString(networkUuid)).append("\n");
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

