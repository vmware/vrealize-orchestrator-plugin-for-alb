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
 * DnsZone
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsZone")
@VsoFinder(name = Constants.FINDER_VRO_DNSZONE, idAccessor = "getObjectID()")
@Service
public class DnsZone extends AviRestResource  {
  @JsonProperty("admin_email")
  private String adminEmail = null;

  @JsonProperty("domain_name")
  private String domainName = null;

  @JsonProperty("name_server")
  private String nameServer = null;

  
  /**
   * Email address of the administrator responsible for this zone. This field is used in SOA records as rname (RFC 1035). If not configured, it is inherited from the DNS service profile. Field introduced in 18.2.6.
   * @return adminEmail
  **/
  @ApiModelProperty(value = "Email address of the administrator responsible for this zone. This field is used in SOA records as rname (RFC 1035). If not configured, it is inherited from the DNS service profile. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getAdminEmail() {
    return adminEmail;
  }
    
  @VsoMethod
  public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }

  
  /**
   * Domain name authoritatively serviced by this Virtual Service. Queries for FQDNs that are sub domains of this domain and do not have any DNS record in Avi are dropped or NXDomain response sent. For domains which are present, SOA parameters are sent in answer section of response if query type is SOA. Field introduced in 18.2.6.
   * @return domainName
  **/
  @ApiModelProperty(required = true, value = "Domain name authoritatively serviced by this Virtual Service. Queries for FQDNs that are sub domains of this domain and do not have any DNS record in Avi are dropped or NXDomain response sent. For domains which are present, SOA parameters are sent in answer section of response if query type is SOA. Field introduced in 18.2.6.")
  @NotNull


 
  @VsoMethod  
  public String getDomainName() {
    return domainName;
  }
    
  @VsoMethod
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  
  /**
   * The primary name server for this zone. This field is used in SOA records as mname (RFC 1035). If not configured, it is inherited from the DNS service profile. If even that is not configured, the domain name is used instead. Field introduced in 18.2.6.
   * @return nameServer
  **/
  @ApiModelProperty(value = "The primary name server for this zone. This field is used in SOA records as mname (RFC 1035). If not configured, it is inherited from the DNS service profile. If even that is not configured, the domain name is used instead. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getNameServer() {
    return nameServer;
  }
    
  @VsoMethod
  public void setNameServer(String nameServer) {
    this.nameServer = nameServer;
  }

  
  public String getObjectID() {
		return "DnsZone";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsZone dnsZone = (DnsZone) o;
    return Objects.equals(this.adminEmail, dnsZone.adminEmail) &&
        Objects.equals(this.domainName, dnsZone.domainName) &&
        Objects.equals(this.nameServer, dnsZone.nameServer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminEmail, domainName, nameServer);
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

