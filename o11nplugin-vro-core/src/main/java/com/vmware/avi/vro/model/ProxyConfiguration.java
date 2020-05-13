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
 * ProxyConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ProxyConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_PROXYCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class ProxyConfiguration extends AviRestResource  {
  @JsonProperty("host")
  private String host = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("username")
  private String username = null;

  
  /**
   * Proxy hostname or IP address.
   * @return host
  **/
  @ApiModelProperty(required = true, value = "Proxy hostname or IP address.")
  @NotNull


 
  @VsoMethod  
  public String getHost() {
    return host;
  }
    
  @VsoMethod
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   * Password for proxy.
   * @return password
  **/
  @ApiModelProperty(value = "Password for proxy.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * Proxy port.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "Proxy port.")
  @NotNull


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * Username for proxy.
   * @return username
  **/
  @ApiModelProperty(value = "Username for proxy.")


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  public String getObjectID() {
		return "ProxyConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProxyConfiguration proxyConfiguration = (ProxyConfiguration) o;
    return Objects.equals(this.host, proxyConfiguration.host) &&
        Objects.equals(this.password, proxyConfiguration.password) &&
        Objects.equals(this.port, proxyConfiguration.port) &&
        Objects.equals(this.username, proxyConfiguration.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, password, port, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProxyConfiguration {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

