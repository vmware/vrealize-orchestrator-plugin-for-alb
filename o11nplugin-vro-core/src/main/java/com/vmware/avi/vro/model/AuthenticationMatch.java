package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HostHdrMatch;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.PathMatch;
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
 * AuthenticationMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "AuthenticationMatch")
@VsoFinder(name = Constants.FINDER_VRO_AUTHENTICATIONMATCH, idAccessor = "getObjectID()")
@Service
public class AuthenticationMatch extends AviRestResource  {
  @JsonProperty("client_ip")
  private IpAddrMatch clientIp = null;

  @JsonProperty("host_hdr")
  private HostHdrMatch hostHdr = null;

  @JsonProperty("path")
  private PathMatch path = null;

  
  /**
   * Configure client ip addresses. Field introduced in 18.2.5.
   * @return clientIp
  **/
  @ApiModelProperty(value = "Configure client ip addresses. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getClientIp() {
    return clientIp;
  }
    
  @VsoMethod
  public void setClientIp(IpAddrMatch clientIp) {
    this.clientIp = clientIp;
  }

  
  /**
   * Configure the host header. Field introduced in 18.2.5.
   * @return hostHdr
  **/
  @ApiModelProperty(value = "Configure the host header. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public HostHdrMatch getHostHdr() {
    return hostHdr;
  }
    
  @VsoMethod
  public void setHostHdr(HostHdrMatch hostHdr) {
    this.hostHdr = hostHdr;
  }

  
  /**
   * Configure request paths. Field introduced in 18.2.5.
   * @return path
  **/
  @ApiModelProperty(value = "Configure request paths. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public PathMatch getPath() {
    return path;
  }
    
  @VsoMethod
  public void setPath(PathMatch path) {
    this.path = path;
  }

  
  public String getObjectID() {
		return "AuthenticationMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationMatch authenticationMatch = (AuthenticationMatch) o;
    return Objects.equals(this.clientIp, authenticationMatch.clientIp) &&
        Objects.equals(this.hostHdr, authenticationMatch.hostHdr) &&
        Objects.equals(this.path, authenticationMatch.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIp, hostHdr, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationMatch {\n");
    
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    hostHdr: ").append(toIndentedString(hostHdr)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

