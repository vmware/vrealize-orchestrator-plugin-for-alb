package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The TrustedHost is a POJO class extends AviRestResource that used for creating
 * TrustedHost.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TrustedHost")
@VsoFinder(name = Constants.FINDER_VRO_TRUSTEDHOST)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TrustedHost extends AviRestResource {
    @JsonProperty("host")
    @JsonInclude(Include.NON_NULL)
    private IpAddr host;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port;



  /**
   * This is the getter method this will return the attribute value.
   * Any valid ipv4, ipv6, or domain address.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return host
   */
  @VsoMethod
  public IpAddr getHost() {
    return host;
  }

  /**
   * This is the setter method to the attribute.
   * Any valid ipv4, ipv6, or domain address.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param host set the host.
   */
  @VsoMethod
  public void setHost(IpAddr host) {
    this.host = host;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Optionally specify the port number.
   * Allowed values are 1-65535.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Optionally specify the port number.
   * Allowed values are 1-65535.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TrustedHost objTrustedHost = (TrustedHost) o;
  return   Objects.equals(this.host, objTrustedHost.host)&&
  Objects.equals(this.port, objTrustedHost.port);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TrustedHost {\n");
      sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

