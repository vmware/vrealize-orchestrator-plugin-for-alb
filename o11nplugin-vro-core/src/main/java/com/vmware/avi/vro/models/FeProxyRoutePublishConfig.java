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
 * The FeProxyRoutePublishConfig is a POJO class extends AviRestResource that used for creating
 * FeProxyRoutePublishConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FeProxyRoutePublishConfig")
@VsoFinder(name = Constants.FINDER_VRO_FEPROXYROUTEPUBLISHCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FeProxyRoutePublishConfig extends AviRestResource {
    @JsonProperty("mode")
    @JsonInclude(Include.NON_NULL)
    private String mode = "FE_PROXY_ROUTE_PUBLISH_NONE";

    @JsonProperty("publisher_port")
    @JsonInclude(Include.NON_NULL)
    private Integer publisherPort = 80;

    @JsonProperty("subnet")
    @JsonInclude(Include.NON_NULL)
    private Integer subnet = 32;

    @JsonProperty("token")
    @JsonInclude(Include.NON_NULL)
    private String token = null;



  /**
   * This is the getter method this will return the attribute value.
   * Publish ecmp route to upstream router for vip.
   * Enum options - FE_PROXY_ROUTE_PUBLISH_NONE, FE_PROXY_ROUTE_PUBLISH_QUAGGA_WEBAPP.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "FE_PROXY_ROUTE_PUBLISH_NONE".
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Publish ecmp route to upstream router for vip.
   * Enum options - FE_PROXY_ROUTE_PUBLISH_NONE, FE_PROXY_ROUTE_PUBLISH_QUAGGA_WEBAPP.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "FE_PROXY_ROUTE_PUBLISH_NONE".
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Listener port for publisher.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 80.
   * @return publisherPort
   */
  @VsoMethod
  public Integer getPublisherPort() {
    return publisherPort;
  }

  /**
   * This is the setter method to the attribute.
   * Listener port for publisher.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 80.
   * @param publisherPort set the publisherPort.
   */
  @VsoMethod
  public void setPublisherPort(Integer  publisherPort) {
    this.publisherPort = publisherPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subnet for publisher.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 32.
   * @return subnet
   */
  @VsoMethod
  public Integer getSubnet() {
    return subnet;
  }

  /**
   * This is the setter method to the attribute.
   * Subnet for publisher.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 32.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(Integer  subnet) {
    this.subnet = subnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Token for tracking changes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return token
   */
  @VsoMethod
  public String getToken() {
    return token;
  }

  /**
   * This is the setter method to the attribute.
   * Token for tracking changes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param token set the token.
   */
  @VsoMethod
  public void setToken(String  token) {
    this.token = token;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  FeProxyRoutePublishConfig objFeProxyRoutePublishConfig = (FeProxyRoutePublishConfig) o;
  return   Objects.equals(this.mode, objFeProxyRoutePublishConfig.mode)&&
  Objects.equals(this.token, objFeProxyRoutePublishConfig.token)&&
  Objects.equals(this.subnet, objFeProxyRoutePublishConfig.subnet)&&
  Objects.equals(this.publisherPort, objFeProxyRoutePublishConfig.publisherPort);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class FeProxyRoutePublishConfig {\n");
      sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    publisherPort: ").append(toIndentedString(publisherPort)).append("\n");
        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

