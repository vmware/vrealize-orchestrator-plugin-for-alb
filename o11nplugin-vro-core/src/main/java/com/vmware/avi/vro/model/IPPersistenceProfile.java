package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The IPPersistenceProfile is a POJO class extends AviRestResource that used for creating
 * IPPersistenceProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IPPersistenceProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPPERSISTENCEPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IPPersistenceProfile extends AviRestResource {
    @JsonProperty("ip_mask")
    @JsonInclude(Include.NON_NULL)
    private Integer ipMask;

    @JsonProperty("ip_persistent_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer ipPersistentTimeout = 5;



  /**
   * This is the getter method this will return the attribute value.
   * Mask to be applied on client ip.
   * This may be used to persist clients from a subnet to the same server.
   * When set to 0, all requests are sent to the same server.
   * Allowed values are 0-128.
   * Field introduced in 18.2.7.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipMask
   */
  @VsoMethod
  public Integer getIpMask() {
    return ipMask;
  }

  /**
   * This is the setter method to the attribute.
   * Mask to be applied on client ip.
   * This may be used to persist clients from a subnet to the same server.
   * When set to 0, all requests are sent to the same server.
   * Allowed values are 0-128.
   * Field introduced in 18.2.7.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipMask set the ipMask.
   */
  @VsoMethod
  public void setIpMask(Integer  ipMask) {
    this.ipMask = ipMask;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The length of time after a client's connections have closed before expiring the client's persistence to a server.
   * Allowed values are 1-720.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @return ipPersistentTimeout
   */
  @VsoMethod
  public Integer getIpPersistentTimeout() {
    return ipPersistentTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * The length of time after a client's connections have closed before expiring the client's persistence to a server.
   * Allowed values are 1-720.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 5.
   * @param ipPersistentTimeout set the ipPersistentTimeout.
   */
  @VsoMethod
  public void setIpPersistentTimeout(Integer  ipPersistentTimeout) {
    this.ipPersistentTimeout = ipPersistentTimeout;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IPPersistenceProfile objIPPersistenceProfile = (IPPersistenceProfile) o;
  return   Objects.equals(this.ipPersistentTimeout, objIPPersistenceProfile.ipPersistentTimeout)&&
  Objects.equals(this.ipMask, objIPPersistenceProfile.ipMask);
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

