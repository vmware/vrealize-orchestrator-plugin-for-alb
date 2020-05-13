package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.NTPAuthenticationKey;
import com.vmware.avi.vro.model.NTPServer;
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
 * NTPConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NTPConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_NTPCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class NTPConfiguration extends AviRestResource  {
  @JsonProperty("ntp_authentication_keys")
  @Valid
  private List<NTPAuthenticationKey> ntpAuthenticationKeys = null;

  @JsonProperty("ntp_server_list")
  @Valid
  private List<IpAddr> ntpServerList = null;

  @JsonProperty("ntp_servers")
  @Valid
  private List<NTPServer> ntpServers = null;

  
  public NTPConfiguration addNtpAuthenticationKeysItem(NTPAuthenticationKey ntpAuthenticationKeysItem) {
    if (this.ntpAuthenticationKeys == null) {
      this.ntpAuthenticationKeys = new ArrayList<NTPAuthenticationKey>();
    }
    this.ntpAuthenticationKeys.add(ntpAuthenticationKeysItem);
    return this;
  }
  
  /**
   * NTP Authentication keys.
   * @return ntpAuthenticationKeys
  **/
  @ApiModelProperty(value = "NTP Authentication keys.")

  @Valid

 
  @VsoMethod  
  public List<NTPAuthenticationKey> getNtpAuthenticationKeys() {
    return ntpAuthenticationKeys;
  }
    
  @VsoMethod
  public void setNtpAuthenticationKeys(List<NTPAuthenticationKey> ntpAuthenticationKeys) {
    this.ntpAuthenticationKeys = ntpAuthenticationKeys;
  }

  
  public NTPConfiguration addNtpServerListItem(IpAddr ntpServerListItem) {
    if (this.ntpServerList == null) {
      this.ntpServerList = new ArrayList<IpAddr>();
    }
    this.ntpServerList.add(ntpServerListItem);
    return this;
  }
  
  /**
   * List of NTP server hostnames or IP addresses.
   * @return ntpServerList
  **/
  @ApiModelProperty(value = "List of NTP server hostnames or IP addresses.")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getNtpServerList() {
    return ntpServerList;
  }
    
  @VsoMethod
  public void setNtpServerList(List<IpAddr> ntpServerList) {
    this.ntpServerList = ntpServerList;
  }

  
  public NTPConfiguration addNtpServersItem(NTPServer ntpServersItem) {
    if (this.ntpServers == null) {
      this.ntpServers = new ArrayList<NTPServer>();
    }
    this.ntpServers.add(ntpServersItem);
    return this;
  }
  
  /**
   * List of NTP Servers.
   * @return ntpServers
  **/
  @ApiModelProperty(value = "List of NTP Servers.")

  @Valid

 
  @VsoMethod  
  public List<NTPServer> getNtpServers() {
    return ntpServers;
  }
    
  @VsoMethod
  public void setNtpServers(List<NTPServer> ntpServers) {
    this.ntpServers = ntpServers;
  }

  
  public String getObjectID() {
		return "NTPConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NTPConfiguration ntPConfiguration = (NTPConfiguration) o;
    return Objects.equals(this.ntpAuthenticationKeys, ntPConfiguration.ntpAuthenticationKeys) &&
        Objects.equals(this.ntpServerList, ntPConfiguration.ntpServerList) &&
        Objects.equals(this.ntpServers, ntPConfiguration.ntpServers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ntpAuthenticationKeys, ntpServerList, ntpServers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NTPConfiguration {\n");
    
    sb.append("    ntpAuthenticationKeys: ").append(toIndentedString(ntpAuthenticationKeys)).append("\n");
    sb.append("    ntpServerList: ").append(toIndentedString(ntpServerList)).append("\n");
    sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
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

