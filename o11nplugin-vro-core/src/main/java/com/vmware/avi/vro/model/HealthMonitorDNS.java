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
 * HealthMonitorDNS
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:14:41.363+05:30")

@VsoObject(create = false, name = "HealthMonitorDNS")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORDNS, idAccessor = "getObjectID()")
@Service
public class HealthMonitorDNS extends AviRestResource  {
  @JsonProperty("qtype")
  private String qtype = "DNS_QUERY_TYPE";

  @JsonProperty("query_name")
  private String queryName = null;

  @JsonProperty("rcode")
  private String rcode = "RCODE_NO_ERROR";

  @JsonProperty("record_type")
  private String recordType = "DNS_RECORD_A";

  @JsonProperty("response_string")
  private String responseString = null;

  
  /**
   *   Query_Type  Response has atleast one answer of which      the resource record type matches the query type   Any_Type  Response should contain atleast one answer  AnyThing  An empty answer is enough. Enum options - DNS_QUERY_TYPE, DNS_ANY_TYPE, DNS_ANY_THING.
   * @return qtype
  **/
  @ApiModelProperty(value = "  Query_Type  Response has atleast one answer of which      the resource record type matches the query type   Any_Type  Response should contain atleast one answer  AnyThing  An empty answer is enough. Enum options - DNS_QUERY_TYPE, DNS_ANY_TYPE, DNS_ANY_THING.")


 
  @VsoMethod  
  public String getQtype() {
    return qtype;
  }
    
  @VsoMethod
  public void setQtype(String qtype) {
    this.qtype = qtype;
  }

  
  /**
   * The DNS monitor will query the DNS server for the fully qualified name in this field.
   * @return queryName
  **/
  @ApiModelProperty(required = true, value = "The DNS monitor will query the DNS server for the fully qualified name in this field.")
  @NotNull


 
  @VsoMethod  
  public String getQueryName() {
    return queryName;
  }
    
  @VsoMethod
  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  
  /**
   * When No Error is selected, a DNS query will be marked failed is any error code is returned by the server.  With Any selected, the monitor ignores error code in the responses. Enum options - RCODE_NO_ERROR, RCODE_ANYTHING.
   * @return rcode
  **/
  @ApiModelProperty(value = "When No Error is selected, a DNS query will be marked failed is any error code is returned by the server.  With Any selected, the monitor ignores error code in the responses. Enum options - RCODE_NO_ERROR, RCODE_ANYTHING.")


 
  @VsoMethod  
  public String getRcode() {
    return rcode;
  }
    
  @VsoMethod
  public void setRcode(String rcode) {
    this.rcode = rcode;
  }

  
  /**
   * Resource record type used in the healthmonitor DNS query, only A or AAAA type supported. Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX, DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR, DNS_RECORD_ANY. Field introduced in 18.2.5.
   * @return recordType
  **/
  @ApiModelProperty(value = "Resource record type used in the healthmonitor DNS query, only A or AAAA type supported. Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX, DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR, DNS_RECORD_ANY. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public String getRecordType() {
    return recordType;
  }
    
  @VsoMethod
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  
  /**
   * The resource record of the queried DNS server's response for the Request Name must include the IP address defined in this field. .
   * @return responseString
  **/
  @ApiModelProperty(value = "The resource record of the queried DNS server's response for the Request Name must include the IP address defined in this field. .")


 
  @VsoMethod  
  public String getResponseString() {
    return responseString;
  }
    
  @VsoMethod
  public void setResponseString(String responseString) {
    this.responseString = responseString;
  }

  
  public String getObjectID() {
		return "HealthMonitorDNS";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthMonitorDNS healthMonitorDNS = (HealthMonitorDNS) o;
    return Objects.equals(this.qtype, healthMonitorDNS.qtype) &&
        Objects.equals(this.queryName, healthMonitorDNS.queryName) &&
        Objects.equals(this.rcode, healthMonitorDNS.rcode) &&
        Objects.equals(this.recordType, healthMonitorDNS.recordType) &&
        Objects.equals(this.responseString, healthMonitorDNS.responseString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qtype, queryName, rcode, recordType, responseString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthMonitorDNS {\n");
    
    sb.append("    qtype: ").append(toIndentedString(qtype)).append("\n");
    sb.append("    queryName: ").append(toIndentedString(queryName)).append("\n");
    sb.append("    rcode: ").append(toIndentedString(rcode)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    responseString: ").append(toIndentedString(responseString)).append("\n");
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

