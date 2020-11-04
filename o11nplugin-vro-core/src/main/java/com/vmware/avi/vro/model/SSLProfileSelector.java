package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SSLProfileSelector is a POJO class extends AviRestResource that used for creating
 * SSLProfileSelector.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSLProfileSelector")
@VsoFinder(name = Constants.FINDER_VRO_SSLPROFILESELECTOR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSLProfileSelector extends AviRestResource {
    @JsonProperty("client_ip_list")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch clientIpList = null;

    @JsonProperty("ssl_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String sslProfileRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Configure client ip address groups.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIpList
   */
  @VsoMethod
  public IpAddrMatch getClientIpList() {
    return clientIpList;
  }

  /**
   * This is the setter method to the attribute.
   * Configure client ip address groups.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIpList set the clientIpList.
   */
  @VsoMethod
  public void setClientIpList(IpAddrMatch clientIpList) {
    this.clientIpList = clientIpList;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ssl profile for the client ip addresses listed.
   * It is a reference to an object of type sslprofile.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslProfileRef
   */
  @VsoMethod
  public String getSslProfileRef() {
    return sslProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Ssl profile for the client ip addresses listed.
   * It is a reference to an object of type sslprofile.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sslProfileRef set the sslProfileRef.
   */
  @VsoMethod
  public void setSslProfileRef(String  sslProfileRef) {
    this.sslProfileRef = sslProfileRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SSLProfileSelector objSSLProfileSelector = (SSLProfileSelector) o;
  return   Objects.equals(this.clientIpList, objSSLProfileSelector.clientIpList)&&
  Objects.equals(this.sslProfileRef, objSSLProfileSelector.sslProfileRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SSLProfileSelector {\n");
      sb.append("    clientIpList: ").append(toIndentedString(clientIpList)).append("\n");
        sb.append("    sslProfileRef: ").append(toIndentedString(sslProfileRef)).append("\n");
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

