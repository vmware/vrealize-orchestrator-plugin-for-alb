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
 * The DnsZone is a POJO class extends AviRestResource that used for creating
 * DnsZone.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsZone")
@VsoFinder(name = Constants.FINDER_VRO_DNSZONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsZone extends AviRestResource {
  @JsonProperty("admin_email")
  @JsonInclude(Include.NON_NULL)
  private String adminEmail = null;

  @JsonProperty("domain_name")
  @JsonInclude(Include.NON_NULL)
  private String domainName = null;

  @JsonProperty("name_server")
  @JsonInclude(Include.NON_NULL)
  private String nameServer = null;



  /**
   * This is the getter method this will return the attribute value.
   * Email address of the administrator responsible for this zone.
   * This field is used in soa records as rname (rfc 1035).
   * If not configured, it is inherited from the dns service profile.
   * Field introduced in 18.2.6.
   * @return adminEmail
   */
  @VsoMethod
  public String getAdminEmail() {
    return adminEmail;
  }

  /**
   * This is the setter method to the attribute.
   * Email address of the administrator responsible for this zone.
   * This field is used in soa records as rname (rfc 1035).
   * If not configured, it is inherited from the dns service profile.
   * Field introduced in 18.2.6.
   * @param adminEmail set the adminEmail.
   */
  @VsoMethod
  public void setAdminEmail(String  adminEmail) {
    this.adminEmail = adminEmail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Domain name authoritatively serviced by this virtual service.
   * Queries for fqdns that are sub domains of this domain and do not have any dns record in avi are dropped or nxdomain response sent.
   * For domains which are present, soa parameters are sent in answer section of response if query type is soa.
   * Field introduced in 18.2.6.
   * @return domainName
   */
  @VsoMethod
  public String getDomainName() {
    return domainName;
  }

  /**
   * This is the setter method to the attribute.
   * Domain name authoritatively serviced by this virtual service.
   * Queries for fqdns that are sub domains of this domain and do not have any dns record in avi are dropped or nxdomain response sent.
   * For domains which are present, soa parameters are sent in answer section of response if query type is soa.
   * Field introduced in 18.2.6.
   * @param domainName set the domainName.
   */
  @VsoMethod
  public void setDomainName(String  domainName) {
    this.domainName = domainName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The primary name server for this zone.
   * This field is used in soa records as mname (rfc 1035).
   * If not configured, it is inherited from the dns service profile.
   * If even that is not configured, the domain name is used instead.
   * Field introduced in 18.2.6.
   * @return nameServer
   */
  @VsoMethod
  public String getNameServer() {
    return nameServer;
  }

  /**
   * This is the setter method to the attribute.
   * The primary name server for this zone.
   * This field is used in soa records as mname (rfc 1035).
   * If not configured, it is inherited from the dns service profile.
   * If even that is not configured, the domain name is used instead.
   * Field introduced in 18.2.6.
   * @param nameServer set the nameServer.
   */
  @VsoMethod
  public void setNameServer(String  nameServer) {
    this.nameServer = nameServer;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsZone objDnsZone = (DnsZone) o;
  return   Objects.equals(this.adminEmail, objDnsZone.adminEmail)&&
  Objects.equals(this.domainName, objDnsZone.domainName)&&
  Objects.equals(this.nameServer, objDnsZone.nameServer);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsZone {\n");
      sb.append("    adminEmail: ").append(toIndentedString(adminEmail)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    nameServer: ").append(toIndentedString(nameServer)).append("\n");
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

