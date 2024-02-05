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
 * The HealthMonitorDNS is a POJO class extends AviRestResource that used for creating
 * HealthMonitorDNS.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HealthMonitorDNS")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORDNS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HealthMonitorDNS extends AviRestResource {
    @JsonProperty("qtype")
    @JsonInclude(Include.NON_NULL)
    private String qtype = "DNS_QUERY_TYPE";

    @JsonProperty("query_name")
    @JsonInclude(Include.NON_NULL)
    private String queryName;

    @JsonProperty("rcode")
    @JsonInclude(Include.NON_NULL)
    private String rcode = "RCODE_NO_ERROR";

    @JsonProperty("record_type")
    @JsonInclude(Include.NON_NULL)
    private String recordType = "DNS_RECORD_A";

    @JsonProperty("response_string")
    @JsonInclude(Include.NON_NULL)
    private String responseString;



  /**
   * This is the getter method this will return the attribute value.
   * Query_type  response has atleast one answer of which      the resource record type matches the query type   any_type  response should contain
   * atleast one answer  anything  an empty answer is enough.
   * Enum options - DNS_QUERY_TYPE, DNS_ANY_TYPE, DNS_ANY_THING.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "DNS_QUERY_TYPE".
   * @return qtype
   */
  @VsoMethod
  public String getQtype() {
    return qtype;
  }

  /**
   * This is the setter method to the attribute.
   * Query_type  response has atleast one answer of which      the resource record type matches the query type   any_type  response should contain
   * atleast one answer  anything  an empty answer is enough.
   * Enum options - DNS_QUERY_TYPE, DNS_ANY_TYPE, DNS_ANY_THING.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "DNS_QUERY_TYPE".
   * @param qtype set the qtype.
   */
  @VsoMethod
  public void setQtype(String  qtype) {
    this.qtype = qtype;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The dns monitor will query the dns server for the fully qualified name in this field.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return queryName
   */
  @VsoMethod
  public String getQueryName() {
    return queryName;
  }

  /**
   * This is the setter method to the attribute.
   * The dns monitor will query the dns server for the fully qualified name in this field.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param queryName set the queryName.
   */
  @VsoMethod
  public void setQueryName(String  queryName) {
    this.queryName = queryName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When no error is selected, a dns query will be marked failed is any error code is returned by the server.
   * With any selected, the monitor ignores error code in the responses.
   * Enum options - RCODE_NO_ERROR, RCODE_ANYTHING.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "RCODE_NO_ERROR".
   * @return rcode
   */
  @VsoMethod
  public String getRcode() {
    return rcode;
  }

  /**
   * This is the setter method to the attribute.
   * When no error is selected, a dns query will be marked failed is any error code is returned by the server.
   * With any selected, the monitor ignores error code in the responses.
   * Enum options - RCODE_NO_ERROR, RCODE_ANYTHING.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "RCODE_NO_ERROR".
   * @param rcode set the rcode.
   */
  @VsoMethod
  public void setRcode(String  rcode) {
    this.rcode = rcode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Resource record type used in the healthmonitor dns query, only a or aaaa type supported.
   * Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX,
   * DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR,
   * DNS_RECORD_ANY.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "DNS_RECORD_A".
   * @return recordType
   */
  @VsoMethod
  public String getRecordType() {
    return recordType;
  }

  /**
   * This is the setter method to the attribute.
   * Resource record type used in the healthmonitor dns query, only a or aaaa type supported.
   * Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX,
   * DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR,
   * DNS_RECORD_ANY.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "DNS_RECORD_A".
   * @param recordType set the recordType.
   */
  @VsoMethod
  public void setRecordType(String  recordType) {
    this.recordType = recordType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The resource record of the queried dns server's response for the request name must include the ip address defined in this field.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return responseString
   */
  @VsoMethod
  public String getResponseString() {
    return responseString;
  }

  /**
   * This is the setter method to the attribute.
   * The resource record of the queried dns server's response for the request name must include the ip address defined in this field.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param responseString set the responseString.
   */
  @VsoMethod
  public void setResponseString(String  responseString) {
    this.responseString = responseString;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HealthMonitorDNS objHealthMonitorDNS = (HealthMonitorDNS) o;
  return   Objects.equals(this.queryName, objHealthMonitorDNS.queryName)&&
  Objects.equals(this.qtype, objHealthMonitorDNS.qtype)&&
  Objects.equals(this.rcode, objHealthMonitorDNS.rcode)&&
  Objects.equals(this.responseString, objHealthMonitorDNS.responseString)&&
  Objects.equals(this.recordType, objHealthMonitorDNS.recordType);
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

