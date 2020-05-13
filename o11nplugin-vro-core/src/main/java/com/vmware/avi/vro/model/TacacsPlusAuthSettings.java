package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AuthTacacsPlusAttributeValuePair;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * TacacsPlusAuthSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "TacacsPlusAuthSettings")
@VsoFinder(name = Constants.FINDER_VRO_TACACSPLUSAUTHSETTINGS, idAccessor = "getObjectID()")
@Service
public class TacacsPlusAuthSettings extends AviRestResource  {
  @JsonProperty("authorization_attrs")
  @Valid
  private List<AuthTacacsPlusAttributeValuePair> authorizationAttrs = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("port")
  private Integer port = 49;

  @JsonProperty("server")
  @Valid
  private List<String> server = null;

  @JsonProperty("service")
  private String service = "AUTH_TACACS_PLUS_SERVICE_LOGIN";

  
  public TacacsPlusAuthSettings addAuthorizationAttrsItem(AuthTacacsPlusAttributeValuePair authorizationAttrsItem) {
    if (this.authorizationAttrs == null) {
      this.authorizationAttrs = new ArrayList<AuthTacacsPlusAttributeValuePair>();
    }
    this.authorizationAttrs.add(authorizationAttrsItem);
    return this;
  }
  
  /**
   * TACACS+ authorization attribute value pairs.
   * @return authorizationAttrs
  **/
  @ApiModelProperty(value = "TACACS+ authorization attribute value pairs.")

  @Valid

 
  @VsoMethod  
  public List<AuthTacacsPlusAttributeValuePair> getAuthorizationAttrs() {
    return authorizationAttrs;
  }
    
  @VsoMethod
  public void setAuthorizationAttrs(List<AuthTacacsPlusAttributeValuePair> authorizationAttrs) {
    this.authorizationAttrs = authorizationAttrs;
  }

  
  /**
   * TACACS+ server shared secret.
   * @return password
  **/
  @ApiModelProperty(value = "TACACS+ server shared secret.")


 
  @VsoMethod  
  public String getPassword() {
    return password;
  }
    
  @VsoMethod
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * TACACS+ server listening port.
   * @return port
  **/
  @ApiModelProperty(value = "TACACS+ server listening port.")


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  public TacacsPlusAuthSettings addServerItem(String serverItem) {
    if (this.server == null) {
      this.server = new ArrayList<String>();
    }
    this.server.add(serverItem);
    return this;
  }
  
  /**
   * TACACS+ server IP address or FQDN.
   * @return server
  **/
  @ApiModelProperty(value = "TACACS+ server IP address or FQDN.")


 
  @VsoMethod  
  public List<String> getServer() {
    return server;
  }
    
  @VsoMethod
  public void setServer(List<String> server) {
    this.server = server;
  }

  
  /**
   * TACACS+ service. Enum options - AUTH_TACACS_PLUS_SERVICE_NONE, AUTH_TACACS_PLUS_SERVICE_LOGIN, AUTH_TACACS_PLUS_SERVICE_ENABLE, AUTH_TACACS_PLUS_SERVICE_PPP, AUTH_TACACS_PLUS_SERVICE_ARAP, AUTH_TACACS_PLUS_SERVICE_PT, AUTH_TACACS_PLUS_SERVICE_RCMD, AUTH_TACACS_PLUS_SERVICE_X25, AUTH_TACACS_PLUS_SERVICE_NASI, AUTH_TACACS_PLUS_SERVICE_FWPROXY.
   * @return service
  **/
  @ApiModelProperty(value = "TACACS+ service. Enum options - AUTH_TACACS_PLUS_SERVICE_NONE, AUTH_TACACS_PLUS_SERVICE_LOGIN, AUTH_TACACS_PLUS_SERVICE_ENABLE, AUTH_TACACS_PLUS_SERVICE_PPP, AUTH_TACACS_PLUS_SERVICE_ARAP, AUTH_TACACS_PLUS_SERVICE_PT, AUTH_TACACS_PLUS_SERVICE_RCMD, AUTH_TACACS_PLUS_SERVICE_X25, AUTH_TACACS_PLUS_SERVICE_NASI, AUTH_TACACS_PLUS_SERVICE_FWPROXY.")


 
  @VsoMethod  
  public String getService() {
    return service;
  }
    
  @VsoMethod
  public void setService(String service) {
    this.service = service;
  }

  
  public String getObjectID() {
		return "TacacsPlusAuthSettings";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TacacsPlusAuthSettings tacacsPlusAuthSettings = (TacacsPlusAuthSettings) o;
    return Objects.equals(this.authorizationAttrs, tacacsPlusAuthSettings.authorizationAttrs) &&
        Objects.equals(this.password, tacacsPlusAuthSettings.password) &&
        Objects.equals(this.port, tacacsPlusAuthSettings.port) &&
        Objects.equals(this.server, tacacsPlusAuthSettings.server) &&
        Objects.equals(this.service, tacacsPlusAuthSettings.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationAttrs, password, port, server, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TacacsPlusAuthSettings {\n");
    
    sb.append("    authorizationAttrs: ").append(toIndentedString(authorizationAttrs)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

