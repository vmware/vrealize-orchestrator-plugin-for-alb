package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GeoLocation;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsResourceRecord is a POJO class extends AviRestResource that used for creating
 * DnsResourceRecord.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsResourceRecord")
@VsoFinder(name = Constants.FINDER_VRO_DNSRESOURCERECORD)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsResourceRecord extends AviRestResource {
    @JsonProperty("addr6_ip_str")
    @JsonInclude(Include.NON_NULL)
    private String addr6IpStr = null;

    @JsonProperty("addr_ip")
    @JsonInclude(Include.NON_NULL)
    private Integer addrIp = null;

    @JsonProperty("cname")
    @JsonInclude(Include.NON_NULL)
    private String cname = null;

    @JsonProperty("dclass")
    @JsonInclude(Include.NON_NULL)
    private Integer dclass = null;

    @JsonProperty("location")
    @JsonInclude(Include.NON_NULL)
    private GeoLocation location = null;

    @JsonProperty("mail_server")
    @JsonInclude(Include.NON_NULL)
    private String mailServer = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("nsname")
    @JsonInclude(Include.NON_NULL)
    private String nsname = null;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port = null;

    @JsonProperty("priority")
    @JsonInclude(Include.NON_NULL)
    private Integer priority = null;

    @JsonProperty("site_name")
    @JsonInclude(Include.NON_NULL)
    private String siteName = null;

    @JsonProperty("text_rdata")
    @JsonInclude(Include.NON_NULL)
    private String textRdata = null;

    @JsonProperty("ttl")
    @JsonInclude(Include.NON_NULL)
    private Integer ttl = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;

    @JsonProperty("vs_name")
    @JsonInclude(Include.NON_NULL)
    private String vsName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 address of the requested fqdn.
   * Field introduced in 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return addr6IpStr
   */
  @VsoMethod
  public String getAddr6IpStr() {
    return addr6IpStr;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 address of the requested fqdn.
   * Field introduced in 18.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param addr6IpStr set the addr6IpStr.
   */
  @VsoMethod
  public void setAddr6IpStr(String  addr6IpStr) {
    this.addr6IpStr = addr6IpStr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv4 address of the requested fqdn.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return addrIp
   */
  @VsoMethod
  public Integer getAddrIp() {
    return addrIp;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv4 address of the requested fqdn.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param addrIp set the addrIp.
   */
  @VsoMethod
  public void setAddrIp(Integer  addrIp) {
    this.addrIp = addrIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Canonical (real) name of the requested fqdn.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cname
   */
  @VsoMethod
  public String getCname() {
    return cname;
  }

  /**
   * This is the setter method to the attribute.
   * Canonical (real) name of the requested fqdn.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cname set the cname.
   */
  @VsoMethod
  public void setCname(String  cname) {
    this.cname = cname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Class of the data in the resource record.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dclass
   */
  @VsoMethod
  public Integer getDclass() {
    return dclass;
  }

  /**
   * This is the setter method to the attribute.
   * Class of the data in the resource record.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dclass set the dclass.
   */
  @VsoMethod
  public void setDclass(Integer  dclass) {
    this.dclass = dclass;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Geo location of member.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return location
   */
  @VsoMethod
  public GeoLocation getLocation() {
    return location;
  }

  /**
   * This is the setter method to the attribute.
   * Geo location of member.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param location set the location.
   */
  @VsoMethod
  public void setLocation(GeoLocation location) {
    this.location = location;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Fully qualified domain name of a mail server in the mx record.
   * Field introduced in 18.2.9, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mailServer
   */
  @VsoMethod
  public String getMailServer() {
    return mailServer;
  }

  /**
   * This is the setter method to the attribute.
   * Fully qualified domain name of a mail server in the mx record.
   * Field introduced in 18.2.9, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mailServer set the mailServer.
   */
  @VsoMethod
  public void setMailServer(String  mailServer) {
    this.mailServer = mailServer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Domain name of the resource record.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Domain name of the resource record.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Domain name of the name server that is authoritative for the requested fqdn.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nsname
   */
  @VsoMethod
  public String getNsname() {
    return nsname;
  }

  /**
   * This is the setter method to the attribute.
   * Domain name of the name server that is authoritative for the requested fqdn.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nsname set the nsname.
   */
  @VsoMethod
  public void setNsname(String  nsname) {
    this.nsname = nsname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service port.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Service port.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The priority field identifies which mail server should be preferred.
   * Field introduced in 18.2.9, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return priority
   */
  @VsoMethod
  public Integer getPriority() {
    return priority;
  }

  /**
   * This is the setter method to the attribute.
   * The priority field identifies which mail server should be preferred.
   * Field introduced in 18.2.9, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param priority set the priority.
   */
  @VsoMethod
  public void setPriority(Integer  priority) {
    this.priority = priority;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Site controller cluster name - applicable only for avi vs gslb member.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return siteName
   */
  @VsoMethod
  public String getSiteName() {
    return siteName;
  }

  /**
   * This is the setter method to the attribute.
   * Site controller cluster name - applicable only for avi vs gslb member.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param siteName set the siteName.
   */
  @VsoMethod
  public void setSiteName(String  siteName) {
    this.siteName = siteName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Text resource record.
   * Field introduced in 18.2.9, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return textRdata
   */
  @VsoMethod
  public String getTextRdata() {
    return textRdata;
  }

  /**
   * This is the setter method to the attribute.
   * Text resource record.
   * Field introduced in 18.2.9, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param textRdata set the textRdata.
   */
  @VsoMethod
  public void setTextRdata(String  textRdata) {
    this.textRdata = textRdata;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of seconds the resource record can be cached.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ttl
   */
  @VsoMethod
  public Integer getTtl() {
    return ttl;
  }

  /**
   * This is the setter method to the attribute.
   * Number of seconds the resource record can be cached.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ttl set the ttl.
   */
  @VsoMethod
  public void setTtl(Integer  ttl) {
    this.ttl = ttl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of resource record.
   * Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX,
   * DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR,
   * DNS_RECORD_ANY.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of resource record.
   * Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX,
   * DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR,
   * DNS_RECORD_ANY.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtual service name - applicable only for avi vs gslb member.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsName
   */
  @VsoMethod
  public String getVsName() {
    return vsName;
  }

  /**
   * This is the setter method to the attribute.
   * Virtual service name - applicable only for avi vs gslb member.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsName set the vsName.
   */
  @VsoMethod
  public void setVsName(String  vsName) {
    this.vsName = vsName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsResourceRecord objDnsResourceRecord = (DnsResourceRecord) o;
  return   Objects.equals(this.type, objDnsResourceRecord.type)&&
  Objects.equals(this.ttl, objDnsResourceRecord.ttl)&&
  Objects.equals(this.dclass, objDnsResourceRecord.dclass)&&
  Objects.equals(this.addrIp, objDnsResourceRecord.addrIp)&&
  Objects.equals(this.nsname, objDnsResourceRecord.nsname)&&
  Objects.equals(this.cname, objDnsResourceRecord.cname)&&
  Objects.equals(this.port, objDnsResourceRecord.port)&&
  Objects.equals(this.siteName, objDnsResourceRecord.siteName)&&
  Objects.equals(this.vsName, objDnsResourceRecord.vsName)&&
  Objects.equals(this.location, objDnsResourceRecord.location)&&
  Objects.equals(this.addr6IpStr, objDnsResourceRecord.addr6IpStr)&&
  Objects.equals(this.mailServer, objDnsResourceRecord.mailServer)&&
  Objects.equals(this.priority, objDnsResourceRecord.priority)&&
  Objects.equals(this.textRdata, objDnsResourceRecord.textRdata)&&
  Objects.equals(this.name, objDnsResourceRecord.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsResourceRecord {\n");
      sb.append("    addr6IpStr: ").append(toIndentedString(addr6IpStr)).append("\n");
        sb.append("    addrIp: ").append(toIndentedString(addrIp)).append("\n");
        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
        sb.append("    dclass: ").append(toIndentedString(dclass)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    mailServer: ").append(toIndentedString(mailServer)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nsname: ").append(toIndentedString(nsname)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
        sb.append("    textRdata: ").append(toIndentedString(textRdata)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
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

