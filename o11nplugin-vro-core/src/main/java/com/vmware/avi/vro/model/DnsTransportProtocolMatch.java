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
 * DnsTransportProtocolMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsTransportProtocolMatch")
@VsoFinder(name = Constants.FINDER_VRO_DNSTRANSPORTPROTOCOLMATCH, idAccessor = "getObjectID()")
@Service
public class DnsTransportProtocolMatch extends AviRestResource  {
  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("protocol")
  private String protocol = null;

  
  /**
   * Criterion to use for matching the DNS transport protocol. Enum options - IS_IN, IS_NOT_IN. Field introduced in 17.1.1.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for matching the DNS transport protocol. Enum options - IS_IN, IS_NOT_IN. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  /**
   * Protocol to match against transport protocol used by DNS query. Enum options - DNS_OVER_UDP, DNS_OVER_TCP. Field introduced in 17.1.1.
   * @return protocol
  **/
  @ApiModelProperty(required = true, value = "Protocol to match against transport protocol used by DNS query. Enum options - DNS_OVER_UDP, DNS_OVER_TCP. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getProtocol() {
    return protocol;
  }
    
  @VsoMethod
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  
  public String getObjectID() {
		return "DnsTransportProtocolMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsTransportProtocolMatch dnsTransportProtocolMatch = (DnsTransportProtocolMatch) o;
    return Objects.equals(this.matchCriteria, dnsTransportProtocolMatch.matchCriteria) &&
        Objects.equals(this.protocol, dnsTransportProtocolMatch.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCriteria, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsTransportProtocolMatch {\n");
    
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

