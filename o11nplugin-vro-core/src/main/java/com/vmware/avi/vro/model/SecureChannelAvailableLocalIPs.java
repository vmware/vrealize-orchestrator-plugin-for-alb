package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * SecureChannelAvailableLocalIPs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SecureChannelAvailableLocalIPs")
@VsoFinder(name = Constants.FINDER_VRO_SECURECHANNELAVAILABLELOCALIPS, idAccessor = "getObjectID()")
@Service
public class SecureChannelAvailableLocalIPs extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("end")
  private Integer end = null;

  @JsonProperty("free_controller_ips")
  @Valid
  private List<String> freeControllerIps = null;

  @JsonProperty("free_ips")
  @Valid
  private List<String> freeIps = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * Number of end.
   * @return end
  **/
  @ApiModelProperty(value = "Number of end.")


 
  @VsoMethod  
  public Integer getEnd() {
    return end;
  }
    
  @VsoMethod
  public void setEnd(Integer end) {
    this.end = end;
  }

  
  public SecureChannelAvailableLocalIPs addFreeControllerIpsItem(String freeControllerIpsItem) {
    if (this.freeControllerIps == null) {
      this.freeControllerIps = new ArrayList<String>();
    }
    this.freeControllerIps.add(freeControllerIpsItem);
    return this;
  }
  
  /**
   * free_controller_ips of SecureChannelAvailableLocalIPs.
   * @return freeControllerIps
  **/
  @ApiModelProperty(value = "free_controller_ips of SecureChannelAvailableLocalIPs.")


 
  @VsoMethod  
  public List<String> getFreeControllerIps() {
    return freeControllerIps;
  }
    
  @VsoMethod
  public void setFreeControllerIps(List<String> freeControllerIps) {
    this.freeControllerIps = freeControllerIps;
  }

  
  public SecureChannelAvailableLocalIPs addFreeIpsItem(String freeIpsItem) {
    if (this.freeIps == null) {
      this.freeIps = new ArrayList<String>();
    }
    this.freeIps.add(freeIpsItem);
    return this;
  }
  
  /**
   * free_ips of SecureChannelAvailableLocalIPs.
   * @return freeIps
  **/
  @ApiModelProperty(value = "free_ips of SecureChannelAvailableLocalIPs.")


 
  @VsoMethod  
  public List<String> getFreeIps() {
    return freeIps;
  }
    
  @VsoMethod
  public void setFreeIps(List<String> freeIps) {
    this.freeIps = freeIps;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Number of start.
   * @return start
  **/
  @ApiModelProperty(value = "Number of start.")


 
  @VsoMethod  
  public Integer getStart() {
    return start;
  }
    
  @VsoMethod
  public void setStart(Integer start) {
    this.start = start;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "SecureChannelAvailableLocalIPs";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecureChannelAvailableLocalIPs secureChannelAvailableLocalIPs = (SecureChannelAvailableLocalIPs) o;
    return Objects.equals(this.lastModified, secureChannelAvailableLocalIPs.lastModified) &&
        Objects.equals(this.end, secureChannelAvailableLocalIPs.end) &&
        Objects.equals(this.freeControllerIps, secureChannelAvailableLocalIPs.freeControllerIps) &&
        Objects.equals(this.freeIps, secureChannelAvailableLocalIPs.freeIps) &&
        Objects.equals(this.name, secureChannelAvailableLocalIPs.name) &&
        Objects.equals(this.start, secureChannelAvailableLocalIPs.start) &&
        Objects.equals(this.url, secureChannelAvailableLocalIPs.url) &&
        Objects.equals(this.uuid, secureChannelAvailableLocalIPs.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, end, freeControllerIps, freeIps, name, start, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecureChannelAvailableLocalIPs {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    freeControllerIps: ").append(toIndentedString(freeControllerIps)).append("\n");
    sb.append("    freeIps: ").append(toIndentedString(freeIps)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

