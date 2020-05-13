package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsCnameRdata;
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
 * DnsInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsInfo")
@VsoFinder(name = Constants.FINDER_VRO_DNSINFO, idAccessor = "getObjectID()")
@Service
public class DnsInfo extends AviRestResource  {
  @JsonProperty("algorithm")
  private String algorithm = "DNS_RECORD_RESPONSE_CONSISTENT_HASH";

  @JsonProperty("cname")
  private DnsCnameRdata cname = null;

  @JsonProperty("fqdn")
  private String fqdn = null;

  @JsonProperty("metadata")
  private String metadata = null;

  @JsonProperty("num_records_in_response")
  private Integer numRecordsInResponse = 1;

  @JsonProperty("ttl")
  private Integer ttl = null;

  @JsonProperty("type")
  private String type = "DNS_RECORD_A";

  
  /**
   * Specifies the algorithm to pick the IP address(es) to be returned, when multiple entries are configured. This does not apply if num_records_in_response is 0. Default is consistent hash. Enum options - DNS_RECORD_RESPONSE_ROUND_ROBIN, DNS_RECORD_RESPONSE_CONSISTENT_HASH. Field introduced in 17.1.1.
   * @return algorithm
  **/
  @ApiModelProperty(value = "Specifies the algorithm to pick the IP address(es) to be returned, when multiple entries are configured. This does not apply if num_records_in_response is 0. Default is consistent hash. Enum options - DNS_RECORD_RESPONSE_ROUND_ROBIN, DNS_RECORD_RESPONSE_CONSISTENT_HASH. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getAlgorithm() {
    return algorithm;
  }
    
  @VsoMethod
  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  
  /**
   * Canonical name in CNAME record. Field introduced in 17.2.1.
   * @return cname
  **/
  @ApiModelProperty(value = "Canonical name in CNAME record. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public DnsCnameRdata getCname() {
    return cname;
  }
    
  @VsoMethod
  public void setCname(DnsCnameRdata cname) {
    this.cname = cname;
  }

  
  /**
   * Fully qualified domain name.
   * @return fqdn
  **/
  @ApiModelProperty(value = "Fully qualified domain name.")


 
  @VsoMethod  
  public String getFqdn() {
    return fqdn;
  }
    
  @VsoMethod
  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

  
  /**
   * Any metadata associated with this record. Field introduced in 17.2.2.
   * @return metadata
  **/
  @ApiModelProperty(readOnly = true, value = "Any metadata associated with this record. Field introduced in 17.2.2.")


 
  @VsoMethod  
  public String getMetadata() {
    return metadata;
  }
    
  @VsoMethod
  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  
  /**
   * Specifies the number of records returned for this FQDN. Enter 0 to return all records. Default is 0. Allowed values are 0-20. Special values are 0- 'Return all records'. Field introduced in 17.1.1.
   * @return numRecordsInResponse
  **/
  @ApiModelProperty(value = "Specifies the number of records returned for this FQDN. Enter 0 to return all records. Default is 0. Allowed values are 0-20. Special values are 0- 'Return all records'. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Integer getNumRecordsInResponse() {
    return numRecordsInResponse;
  }
    
  @VsoMethod
  public void setNumRecordsInResponse(Integer numRecordsInResponse) {
    this.numRecordsInResponse = numRecordsInResponse;
  }

  
  /**
   * Time to live for fqdn record. Default value is chosen from DNS profile for this cloud if no value provided.
   * @return ttl
  **/
  @ApiModelProperty(value = "Time to live for fqdn record. Default value is chosen from DNS profile for this cloud if no value provided.")


 
  @VsoMethod  
  public Integer getTtl() {
    return ttl;
  }
    
  @VsoMethod
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }

  
  /**
   * DNS record type. Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX, DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR, DNS_RECORD_ANY.
   * @return type
  **/
  @ApiModelProperty(value = "DNS record type. Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX, DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR, DNS_RECORD_ANY.")


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "DnsInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsInfo dnsInfo = (DnsInfo) o;
    return Objects.equals(this.algorithm, dnsInfo.algorithm) &&
        Objects.equals(this.cname, dnsInfo.cname) &&
        Objects.equals(this.fqdn, dnsInfo.fqdn) &&
        Objects.equals(this.metadata, dnsInfo.metadata) &&
        Objects.equals(this.numRecordsInResponse, dnsInfo.numRecordsInResponse) &&
        Objects.equals(this.ttl, dnsInfo.ttl) &&
        Objects.equals(this.type, dnsInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, cname, fqdn, metadata, numRecordsInResponse, ttl, type);
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

