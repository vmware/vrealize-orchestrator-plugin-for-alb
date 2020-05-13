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
 * FeProxyRoutePublishConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "FeProxyRoutePublishConfig")
@VsoFinder(name = Constants.FINDER_VRO_FEPROXYROUTEPUBLISHCONFIG, idAccessor = "getObjectID()")
@Service
public class FeProxyRoutePublishConfig extends AviRestResource  {
  @JsonProperty("mode")
  private String mode = "FE_PROXY_ROUTE_PUBLISH_NONE";

  @JsonProperty("publisher_port")
  private Integer publisherPort = 80;

  @JsonProperty("subnet")
  private Integer subnet = 32;

  @JsonProperty("token")
  private String token = null;

  
  /**
   * Publish ECMP route to upstream router for VIP. Enum options - FE_PROXY_ROUTE_PUBLISH_NONE, FE_PROXY_ROUTE_PUBLISH_QUAGGA_WEBAPP.
   * @return mode
  **/
  @ApiModelProperty(value = "Publish ECMP route to upstream router for VIP. Enum options - FE_PROXY_ROUTE_PUBLISH_NONE, FE_PROXY_ROUTE_PUBLISH_QUAGGA_WEBAPP.")


 
  @VsoMethod  
  public String getMode() {
    return mode;
  }
    
  @VsoMethod
  public void setMode(String mode) {
    this.mode = mode;
  }

  
  /**
   * Listener port for publisher.
   * @return publisherPort
  **/
  @ApiModelProperty(value = "Listener port for publisher.")


 
  @VsoMethod  
  public Integer getPublisherPort() {
    return publisherPort;
  }
    
  @VsoMethod
  public void setPublisherPort(Integer publisherPort) {
    this.publisherPort = publisherPort;
  }

  
  /**
   * Subnet for publisher.
   * @return subnet
  **/
  @ApiModelProperty(value = "Subnet for publisher.")


 
  @VsoMethod  
  public Integer getSubnet() {
    return subnet;
  }
    
  @VsoMethod
  public void setSubnet(Integer subnet) {
    this.subnet = subnet;
  }

  
  /**
   * Token for tracking changes.
   * @return token
  **/
  @ApiModelProperty(value = "Token for tracking changes.")


 
  @VsoMethod  
  public String getToken() {
    return token;
  }
    
  @VsoMethod
  public void setToken(String token) {
    this.token = token;
  }

  
  public String getObjectID() {
		return "FeProxyRoutePublishConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeProxyRoutePublishConfig feProxyRoutePublishConfig = (FeProxyRoutePublishConfig) o;
    return Objects.equals(this.mode, feProxyRoutePublishConfig.mode) &&
        Objects.equals(this.publisherPort, feProxyRoutePublishConfig.publisherPort) &&
        Objects.equals(this.subnet, feProxyRoutePublishConfig.subnet) &&
        Objects.equals(this.token, feProxyRoutePublishConfig.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, publisherPort, subnet, token);
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

