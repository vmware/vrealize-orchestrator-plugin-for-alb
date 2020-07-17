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
 * The NTPConfiguration is a POJO class extends AviRestResource that used for creating
 * NTPConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NTPConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_NTPCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NTPConfiguration extends AviRestResource {
  @JsonProperty("ntp_authentication_keys")
  @JsonInclude(Include.NON_NULL)
  private List<NTPAuthenticationKey> ntpAuthenticationKeys = null;

  @JsonProperty("ntp_server_list")
  @JsonInclude(Include.NON_NULL)
  private List<IpAddr> ntpServerList = null;

  @JsonProperty("ntp_servers")
  @JsonInclude(Include.NON_NULL)
  private List<NTPServer> ntpServers = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ntp authentication keys.
   * @return ntpAuthenticationKeys
   */
  @VsoMethod
  public List<NTPAuthenticationKey> getNtpAuthenticationKeys() {
    return ntpAuthenticationKeys;
  }

  /**
   * This is the setter method. this will set the ntpAuthenticationKeys
   * Ntp authentication keys.
   * @return ntpAuthenticationKeys
   */
  @VsoMethod
  public void setNtpAuthenticationKeys(List<NTPAuthenticationKey>  ntpAuthenticationKeys) {
    this.ntpAuthenticationKeys = ntpAuthenticationKeys;
  }

  /**
   * This is the setter method this will set the ntpAuthenticationKeys
   * Ntp authentication keys.
   * @return ntpAuthenticationKeys
   */
  @VsoMethod
  public NTPConfiguration addNtpAuthenticationKeysItem(NTPAuthenticationKey ntpAuthenticationKeysItem) {
    if (this.ntpAuthenticationKeys == null) {
      this.ntpAuthenticationKeys = new ArrayList<NTPAuthenticationKey>();
    }
    this.ntpAuthenticationKeys.add(ntpAuthenticationKeysItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * List of ntp server hostnames or ip addresses.
   * @return ntpServerList
   */
  @VsoMethod
  public List<IpAddr> getNtpServerList() {
    return ntpServerList;
  }

  /**
   * This is the setter method. this will set the ntpServerList
   * List of ntp server hostnames or ip addresses.
   * @return ntpServerList
   */
  @VsoMethod
  public void setNtpServerList(List<IpAddr>  ntpServerList) {
    this.ntpServerList = ntpServerList;
  }

  /**
   * This is the setter method this will set the ntpServerList
   * List of ntp server hostnames or ip addresses.
   * @return ntpServerList
   */
  @VsoMethod
  public NTPConfiguration addNtpServerListItem(IpAddr ntpServerListItem) {
    if (this.ntpServerList == null) {
      this.ntpServerList = new ArrayList<IpAddr>();
    }
    this.ntpServerList.add(ntpServerListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * List of ntp servers.
   * @return ntpServers
   */
  @VsoMethod
  public List<NTPServer> getNtpServers() {
    return ntpServers;
  }

  /**
   * This is the setter method. this will set the ntpServers
   * List of ntp servers.
   * @return ntpServers
   */
  @VsoMethod
  public void setNtpServers(List<NTPServer>  ntpServers) {
    this.ntpServers = ntpServers;
  }

  /**
   * This is the setter method this will set the ntpServers
   * List of ntp servers.
   * @return ntpServers
   */
  @VsoMethod
  public NTPConfiguration addNtpServersItem(NTPServer ntpServersItem) {
    if (this.ntpServers == null) {
      this.ntpServers = new ArrayList<NTPServer>();
    }
    this.ntpServers.add(ntpServersItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NTPConfiguration objNTPConfiguration = (NTPConfiguration) o;
  return   Objects.equals(this.ntpServers, objNTPConfiguration.ntpServers)&&
  Objects.equals(this.ntpAuthenticationKeys, objNTPConfiguration.ntpAuthenticationKeys)&&
  Objects.equals(this.ntpServerList, objNTPConfiguration.ntpServerList);
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

