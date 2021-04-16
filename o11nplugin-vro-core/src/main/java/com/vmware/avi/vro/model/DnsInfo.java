package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DnsCnameRdata;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsInfo is a POJO class extends AviRestResource that used for creating
 * DnsInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsInfo")
@VsoFinder(name = Constants.FINDER_VRO_DNSINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsInfo extends AviRestResource {
    @JsonProperty("algorithm")
    @JsonInclude(Include.NON_NULL)
    private String algorithm = "DNS_RECORD_RESPONSE_CONSISTENT_HASH";

    @JsonProperty("cname")
    @JsonInclude(Include.NON_NULL)
    private DnsCnameRdata cname = null;

    @JsonProperty("fqdn")
    @JsonInclude(Include.NON_NULL)
    private String fqdn = null;

    @JsonProperty("metadata")
    @JsonInclude(Include.NON_NULL)
    private String metadata = null;

    @JsonProperty("num_records_in_response")
    @JsonInclude(Include.NON_NULL)
    private Integer numRecordsInResponse = null;

    @JsonProperty("ttl")
    @JsonInclude(Include.NON_NULL)
    private Integer ttl = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = "DNS_RECORD_A";



  /**
   * This is the getter method this will return the attribute value.
   * Specifies the algorithm to pick the ip address(es) to be returned, when multiple entries are configured.
   * This does not apply if num_records_in_response is 0.
   * Default is consistent hash.
   * Enum options - DNS_RECORD_RESPONSE_ROUND_ROBIN, DNS_RECORD_RESPONSE_CONSISTENT_HASH.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as "DNS_RECORD_RESPONSE_CONSISTENT_HASH".
   * @return algorithm
   */
  @VsoMethod
  public String getAlgorithm() {
    return algorithm;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the algorithm to pick the ip address(es) to be returned, when multiple entries are configured.
   * This does not apply if num_records_in_response is 0.
   * Default is consistent hash.
   * Enum options - DNS_RECORD_RESPONSE_ROUND_ROBIN, DNS_RECORD_RESPONSE_CONSISTENT_HASH.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as "DNS_RECORD_RESPONSE_CONSISTENT_HASH".
   * @param algorithm set the algorithm.
   */
  @VsoMethod
  public void setAlgorithm(String  algorithm) {
    this.algorithm = algorithm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Canonical name in cname record.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cname
   */
  @VsoMethod
  public DnsCnameRdata getCname() {
    return cname;
  }

  /**
   * This is the setter method to the attribute.
   * Canonical name in cname record.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cname set the cname.
   */
  @VsoMethod
  public void setCname(DnsCnameRdata cname) {
    this.cname = cname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Fully qualified domain name.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fqdn
   */
  @VsoMethod
  public String getFqdn() {
    return fqdn;
  }

  /**
   * This is the setter method to the attribute.
   * Fully qualified domain name.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fqdn set the fqdn.
   */
  @VsoMethod
  public void setFqdn(String  fqdn) {
    this.fqdn = fqdn;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Any metadata associated with this record.
   * Field introduced in 17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metadata
   */
  @VsoMethod
  public String getMetadata() {
    return metadata;
  }

  /**
   * This is the setter method to the attribute.
   * Any metadata associated with this record.
   * Field introduced in 17.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metadata set the metadata.
   */
  @VsoMethod
  public void setMetadata(String  metadata) {
    this.metadata = metadata;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the number of records returned for this fqdn.
   * Enter 0 to return all records.
   * Default is 0.
   * Allowed values are 0-20.
   * Special values are 0- 'return all records'.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numRecordsInResponse
   */
  @VsoMethod
  public Integer getNumRecordsInResponse() {
    return numRecordsInResponse;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the number of records returned for this fqdn.
   * Enter 0 to return all records.
   * Default is 0.
   * Allowed values are 0-20.
   * Special values are 0- 'return all records'.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numRecordsInResponse set the numRecordsInResponse.
   */
  @VsoMethod
  public void setNumRecordsInResponse(Integer  numRecordsInResponse) {
    this.numRecordsInResponse = numRecordsInResponse;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time to live for fqdn record.
   * Default value is chosen from dns profile for this cloud if no value provided.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ttl
   */
  @VsoMethod
  public Integer getTtl() {
    return ttl;
  }

  /**
   * This is the setter method to the attribute.
   * Time to live for fqdn record.
   * Default value is chosen from dns profile for this cloud if no value provided.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ttl set the ttl.
   */
  @VsoMethod
  public void setTtl(Integer  ttl) {
    this.ttl = ttl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dns record type.
   * Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX,
   * DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR,
   * DNS_RECORD_ANY.
   * Default value when not specified in API or module is interpreted by Avi Controller as "DNS_RECORD_A".
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Dns record type.
   * Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX,
   * DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR,
   * DNS_RECORD_ANY.
   * Default value when not specified in API or module is interpreted by Avi Controller as "DNS_RECORD_A".
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsInfo objDnsInfo = (DnsInfo) o;
  return   Objects.equals(this.fqdn, objDnsInfo.fqdn)&&
  Objects.equals(this.ttl, objDnsInfo.ttl)&&
  Objects.equals(this.type, objDnsInfo.type)&&
  Objects.equals(this.numRecordsInResponse, objDnsInfo.numRecordsInResponse)&&
  Objects.equals(this.algorithm, objDnsInfo.algorithm)&&
  Objects.equals(this.cname, objDnsInfo.cname)&&
  Objects.equals(this.metadata, objDnsInfo.metadata);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsInfo {\n");
      sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
        sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    numRecordsInResponse: ").append(toIndentedString(numRecordsInResponse)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

