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
 * The DnsEdnsOption is a POJO class extends AviRestResource that used for creating
 * DnsEdnsOption.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsEdnsOption")
@VsoFinder(name = Constants.FINDER_VRO_DNSEDNSOPTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsEdnsOption extends AviRestResource {
    @JsonProperty("addr_family")
    @JsonInclude(Include.NON_NULL)
    private Integer addrFamily = null;

    @JsonProperty("code")
    @JsonInclude(Include.NON_NULL)
    private String code = null;

    @JsonProperty("scope_prefix_len")
    @JsonInclude(Include.NON_NULL)
    private Integer scopePrefixLen = null;

    @JsonProperty("source_prefix_len")
    @JsonInclude(Include.NON_NULL)
    private Integer sourcePrefixLen = null;

    @JsonProperty("subnet_ip")
    @JsonInclude(Include.NON_NULL)
    private Integer subnetIp = null;

    @JsonProperty("subnet_ip6")
    @JsonInclude(Include.NON_NULL)
    private String subnetIp6 = null;



  /**
   * This is the getter method this will return the attribute value.
   * Address family.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return addrFamily
   */
  @VsoMethod
  public Integer getAddrFamily() {
    return addrFamily;
  }

  /**
   * This is the setter method to the attribute.
   * Address family.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param addrFamily set the addrFamily.
   */
  @VsoMethod
  public void setAddrFamily(Integer  addrFamily) {
    this.addrFamily = addrFamily;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Edns option code.
   * Enum options - EDNS_OPTION_CODE_NSID, EDNS_OPTION_CODE_DNSSEC_DAU, EDNS_OPTION_CODE_DNSSEC_DHU, EDNS_OPTION_CODE_DNSSEC_N3U,
   * EDNS_OPTION_CODE_CLIENT_SUBNET, EDNS_OPTION_CODE_EXPIRE, EDNS_OPTION_CODE_COOKIE, EDNS_OPTION_CODE_TCP_KEEPALIVE, EDNS_OPTION_CODE_PADDING,
   * EDNS_OPTION_CODE_CHAIN.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return code
   */
  @VsoMethod
  public String getCode() {
    return code;
  }

  /**
   * This is the setter method to the attribute.
   * Edns option code.
   * Enum options - EDNS_OPTION_CODE_NSID, EDNS_OPTION_CODE_DNSSEC_DAU, EDNS_OPTION_CODE_DNSSEC_DHU, EDNS_OPTION_CODE_DNSSEC_N3U,
   * EDNS_OPTION_CODE_CLIENT_SUBNET, EDNS_OPTION_CODE_EXPIRE, EDNS_OPTION_CODE_COOKIE, EDNS_OPTION_CODE_TCP_KEEPALIVE, EDNS_OPTION_CODE_PADDING,
   * EDNS_OPTION_CODE_CHAIN.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param code set the code.
   */
  @VsoMethod
  public void setCode(String  code) {
    this.code = code;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Scope prefix length of address.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scopePrefixLen
   */
  @VsoMethod
  public Integer getScopePrefixLen() {
    return scopePrefixLen;
  }

  /**
   * This is the setter method to the attribute.
   * Scope prefix length of address.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param scopePrefixLen set the scopePrefixLen.
   */
  @VsoMethod
  public void setScopePrefixLen(Integer  scopePrefixLen) {
    this.scopePrefixLen = scopePrefixLen;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Source prefix length of address.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sourcePrefixLen
   */
  @VsoMethod
  public Integer getSourcePrefixLen() {
    return sourcePrefixLen;
  }

  /**
   * This is the setter method to the attribute.
   * Source prefix length of address.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sourcePrefixLen set the sourcePrefixLen.
   */
  @VsoMethod
  public void setSourcePrefixLen(Integer  sourcePrefixLen) {
    this.sourcePrefixLen = sourcePrefixLen;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv4 address of the client subnet.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnetIp
   */
  @VsoMethod
  public Integer getSubnetIp() {
    return subnetIp;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv4 address of the client subnet.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnetIp set the subnetIp.
   */
  @VsoMethod
  public void setSubnetIp(Integer  subnetIp) {
    this.subnetIp = subnetIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 address of the client subnet.
   * Field introduced in 18.2.12, 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnetIp6
   */
  @VsoMethod
  public String getSubnetIp6() {
    return subnetIp6;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 address of the client subnet.
   * Field introduced in 18.2.12, 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnetIp6 set the subnetIp6.
   */
  @VsoMethod
  public void setSubnetIp6(String  subnetIp6) {
    this.subnetIp6 = subnetIp6;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsEdnsOption objDnsEdnsOption = (DnsEdnsOption) o;
  return   Objects.equals(this.code, objDnsEdnsOption.code)&&
  Objects.equals(this.addrFamily, objDnsEdnsOption.addrFamily)&&
  Objects.equals(this.sourcePrefixLen, objDnsEdnsOption.sourcePrefixLen)&&
  Objects.equals(this.scopePrefixLen, objDnsEdnsOption.scopePrefixLen)&&
  Objects.equals(this.subnetIp, objDnsEdnsOption.subnetIp)&&
  Objects.equals(this.subnetIp6, objDnsEdnsOption.subnetIp6);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsEdnsOption {\n");
      sb.append("    addrFamily: ").append(toIndentedString(addrFamily)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    scopePrefixLen: ").append(toIndentedString(scopePrefixLen)).append("\n");
        sb.append("    sourcePrefixLen: ").append(toIndentedString(sourcePrefixLen)).append("\n");
        sb.append("    subnetIp: ").append(toIndentedString(subnetIp)).append("\n");
        sb.append("    subnetIp6: ").append(toIndentedString(subnetIp6)).append("\n");
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

