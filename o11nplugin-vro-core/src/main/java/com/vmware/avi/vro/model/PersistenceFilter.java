package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
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
 * PersistenceFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PersistenceFilter")
@VsoFinder(name = Constants.FINDER_VRO_PERSISTENCEFILTER, idAccessor = "getObjectID()")
@Service
public class PersistenceFilter extends AviRestResource  {
  @JsonProperty("persistence_cookie")
  private String persistenceCookie = null;

  @JsonProperty("persistence_end_ip")
  private IpAddr persistenceEndIp = null;

  @JsonProperty("persistence_ip")
  private IpAddr persistenceIp = null;

  @JsonProperty("persistence_mask")
  private Integer persistenceMask = null;

  @JsonProperty("server_end_ip")
  private IpAddr serverEndIp = null;

  @JsonProperty("server_ip")
  private IpAddr serverIp = null;

  @JsonProperty("server_mask")
  private Integer serverMask = null;

  @JsonProperty("server_port")
  private Integer serverPort = null;

  
  /**
   * Persistence cookie.
   * @return persistenceCookie
  **/
  @ApiModelProperty(value = "Persistence cookie.")


 
  @VsoMethod  
  public String getPersistenceCookie() {
    return persistenceCookie;
  }
    
  @VsoMethod
  public void setPersistenceCookie(String persistenceCookie) {
    this.persistenceCookie = persistenceCookie;
  }

  
  /**
   * Placeholder for description of property persistence_end_ip of obj type PersistenceFilter field type str  type object
   * @return persistenceEndIp
  **/
  @ApiModelProperty(value = "Placeholder for description of property persistence_end_ip of obj type PersistenceFilter field type str  type object")

  @Valid

 
  @VsoMethod  
  public IpAddr getPersistenceEndIp() {
    return persistenceEndIp;
  }
    
  @VsoMethod
  public void setPersistenceEndIp(IpAddr persistenceEndIp) {
    this.persistenceEndIp = persistenceEndIp;
  }

  
  /**
   * Placeholder for description of property persistence_ip of obj type PersistenceFilter field type str  type object
   * @return persistenceIp
  **/
  @ApiModelProperty(value = "Placeholder for description of property persistence_ip of obj type PersistenceFilter field type str  type object")

  @Valid

 
  @VsoMethod  
  public IpAddr getPersistenceIp() {
    return persistenceIp;
  }
    
  @VsoMethod
  public void setPersistenceIp(IpAddr persistenceIp) {
    this.persistenceIp = persistenceIp;
  }

  
  /**
   * Number of persistence_mask.
   * @return persistenceMask
  **/
  @ApiModelProperty(value = "Number of persistence_mask.")


 
  @VsoMethod  
  public Integer getPersistenceMask() {
    return persistenceMask;
  }
    
  @VsoMethod
  public void setPersistenceMask(Integer persistenceMask) {
    this.persistenceMask = persistenceMask;
  }

  
  /**
   * Placeholder for description of property server_end_ip of obj type PersistenceFilter field type str  type object
   * @return serverEndIp
  **/
  @ApiModelProperty(value = "Placeholder for description of property server_end_ip of obj type PersistenceFilter field type str  type object")

  @Valid

 
  @VsoMethod  
  public IpAddr getServerEndIp() {
    return serverEndIp;
  }
    
  @VsoMethod
  public void setServerEndIp(IpAddr serverEndIp) {
    this.serverEndIp = serverEndIp;
  }

  
  /**
   * Placeholder for description of property server_ip of obj type PersistenceFilter field type str  type object
   * @return serverIp
  **/
  @ApiModelProperty(value = "Placeholder for description of property server_ip of obj type PersistenceFilter field type str  type object")

  @Valid

 
  @VsoMethod  
  public IpAddr getServerIp() {
    return serverIp;
  }
    
  @VsoMethod
  public void setServerIp(IpAddr serverIp) {
    this.serverIp = serverIp;
  }

  
  /**
   * Number of server_mask.
   * @return serverMask
  **/
  @ApiModelProperty(value = "Number of server_mask.")


 
  @VsoMethod  
  public Integer getServerMask() {
    return serverMask;
  }
    
  @VsoMethod
  public void setServerMask(Integer serverMask) {
    this.serverMask = serverMask;
  }

  
  /**
   * Number of server_port.
   * @return serverPort
  **/
  @ApiModelProperty(value = "Number of server_port.")


 
  @VsoMethod  
  public Integer getServerPort() {
    return serverPort;
  }
    
  @VsoMethod
  public void setServerPort(Integer serverPort) {
    this.serverPort = serverPort;
  }

  
  public String getObjectID() {
		return "PersistenceFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersistenceFilter persistenceFilter = (PersistenceFilter) o;
    return Objects.equals(this.persistenceCookie, persistenceFilter.persistenceCookie) &&
        Objects.equals(this.persistenceEndIp, persistenceFilter.persistenceEndIp) &&
        Objects.equals(this.persistenceIp, persistenceFilter.persistenceIp) &&
        Objects.equals(this.persistenceMask, persistenceFilter.persistenceMask) &&
        Objects.equals(this.serverEndIp, persistenceFilter.serverEndIp) &&
        Objects.equals(this.serverIp, persistenceFilter.serverIp) &&
        Objects.equals(this.serverMask, persistenceFilter.serverMask) &&
        Objects.equals(this.serverPort, persistenceFilter.serverPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persistenceCookie, persistenceEndIp, persistenceIp, persistenceMask, serverEndIp, serverIp, serverMask, serverPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistenceFilter {\n");
    
    sb.append("    persistenceCookie: ").append(toIndentedString(persistenceCookie)).append("\n");
    sb.append("    persistenceEndIp: ").append(toIndentedString(persistenceEndIp)).append("\n");
    sb.append("    persistenceIp: ").append(toIndentedString(persistenceIp)).append("\n");
    sb.append("    persistenceMask: ").append(toIndentedString(persistenceMask)).append("\n");
    sb.append("    serverEndIp: ").append(toIndentedString(serverEndIp)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    serverMask: ").append(toIndentedString(serverMask)).append("\n");
    sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
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

