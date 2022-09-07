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
 * The NetworkFilter is a POJO class extends AviRestResource that used for creating
 * NetworkFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NetworkFilter")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NetworkFilter extends AviRestResource {
    @JsonProperty("network_ref")
    @JsonInclude(Include.NON_NULL)
    private String networkRef = null;

    @JsonProperty("server_filter")
    @JsonInclude(Include.NON_NULL)
    private String serverFilter = null;



  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type vimgrnwruntime.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkRef
   */
  @VsoMethod
  public String getNetworkRef() {
    return networkRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type vimgrnwruntime.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param networkRef set the networkRef.
   */
  @VsoMethod
  public void setNetworkRef(String  networkRef) {
    this.networkRef = networkRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverFilter
   */
  @VsoMethod
  public String getServerFilter() {
    return serverFilter;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverFilter set the serverFilter.
   */
  @VsoMethod
  public void setServerFilter(String  serverFilter) {
    this.serverFilter = serverFilter;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NetworkFilter objNetworkFilter = (NetworkFilter) o;
  return   Objects.equals(this.networkRef, objNetworkFilter.networkRef)&&
  Objects.equals(this.serverFilter, objNetworkFilter.serverFilter);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NetworkFilter {\n");
      sb.append("    networkRef: ").append(toIndentedString(networkRef)).append("\n");
        sb.append("    serverFilter: ").append(toIndentedString(serverFilter)).append("\n");
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

