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
 * IPPersistenceProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IPPersistenceProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPPERSISTENCEPROFILE, idAccessor = "getObjectID()")
@Service
public class IPPersistenceProfile extends AviRestResource  {
  @JsonProperty("ip_mask")
  private Integer ipMask = null;

  @JsonProperty("ip_persistent_timeout")
  private Integer ipPersistentTimeout = 5;

  
  /**
   * Mask to be applied on client IP. This may be used to persist clients from a subnet to the same server. When set to 0, all requests are sent to the same server. Allowed values are 0-128. Field introduced in 18.2.7.
   * @return ipMask
  **/
  @ApiModelProperty(value = "Mask to be applied on client IP. This may be used to persist clients from a subnet to the same server. When set to 0, all requests are sent to the same server. Allowed values are 0-128. Field introduced in 18.2.7.")


 
  @VsoMethod  
  public Integer getIpMask() {
    return ipMask;
  }
    
  @VsoMethod
  public void setIpMask(Integer ipMask) {
    this.ipMask = ipMask;
  }

  
  /**
   * The length of time after a client's connections have closed before expiring the client's persistence to a server. Allowed values are 1-720.
   * @return ipPersistentTimeout
  **/
  @ApiModelProperty(value = "The length of time after a client's connections have closed before expiring the client's persistence to a server. Allowed values are 1-720.")


 
  @VsoMethod  
  public Integer getIpPersistentTimeout() {
    return ipPersistentTimeout;
  }
    
  @VsoMethod
  public void setIpPersistentTimeout(Integer ipPersistentTimeout) {
    this.ipPersistentTimeout = ipPersistentTimeout;
  }

  
  public String getObjectID() {
		return "IPPersistenceProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPPersistenceProfile ipPersistenceProfile = (IPPersistenceProfile) o;
    return Objects.equals(this.ipMask, ipPersistenceProfile.ipMask) &&
        Objects.equals(this.ipPersistentTimeout, ipPersistenceProfile.ipPersistentTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipMask, ipPersistentTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPPersistenceProfile {\n");
    
    sb.append("    ipMask: ").append(toIndentedString(ipMask)).append("\n");
    sb.append("    ipPersistentTimeout: ").append(toIndentedString(ipPersistentTimeout)).append("\n");
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

