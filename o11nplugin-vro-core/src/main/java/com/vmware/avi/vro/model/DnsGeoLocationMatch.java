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
 * DnsGeoLocationMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsGeoLocationMatch")
@VsoFinder(name = Constants.FINDER_VRO_DNSGEOLOCATIONMATCH, idAccessor = "getObjectID()")
@Service
public class DnsGeoLocationMatch extends AviRestResource  {
  @JsonProperty("geolocation_name")
  private String geolocationName = null;

  @JsonProperty("geolocation_tag")
  private String geolocationTag = null;

  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("use_edns_client_subnet_ip")
  private Boolean useEdnsClientSubnetIp = true;

  
  /**
   * Geographical location of the client IP to be used in the match. This location is of the format Country/State/City e.g. US/CA/Santa Clara. Field introduced in 17.1.5.
   * @return geolocationName
  **/
  @ApiModelProperty(value = "Geographical location of the client IP to be used in the match. This location is of the format Country/State/City e.g. US/CA/Santa Clara. Field introduced in 17.1.5.")


 
  @VsoMethod  
  public String getGeolocationName() {
    return geolocationName;
  }
    
  @VsoMethod
  public void setGeolocationName(String geolocationName) {
    this.geolocationName = geolocationName;
  }

  
  /**
   * Geolocation tag for the client IP. This could be any string value for the client IP, e.g. client IPs from US East Coast geolocation would be tagged as 'East Coast'. Field introduced in 17.1.5.
   * @return geolocationTag
  **/
  @ApiModelProperty(value = "Geolocation tag for the client IP. This could be any string value for the client IP, e.g. client IPs from US East Coast geolocation would be tagged as 'East Coast'. Field introduced in 17.1.5.")


 
  @VsoMethod  
  public String getGeolocationTag() {
    return geolocationTag;
  }
    
  @VsoMethod
  public void setGeolocationTag(String geolocationTag) {
    this.geolocationTag = geolocationTag;
  }

  
  /**
   * Criterion to use for matching the client IP's geographical location. Enum options - IS_IN, IS_NOT_IN. Field introduced in 17.1.5.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for matching the client IP's geographical location. Enum options - IS_IN, IS_NOT_IN. Field introduced in 17.1.5.")
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
   * Use the IP address from the EDNS client subnet option, if available, to derive geo location of the DNS query. Field introduced in 17.1.5.
   * @return useEdnsClientSubnetIp
  **/
  @ApiModelProperty(value = "Use the IP address from the EDNS client subnet option, if available, to derive geo location of the DNS query. Field introduced in 17.1.5.")


 
  @VsoMethod  
  public Boolean isUseEdnsClientSubnetIp() {
    return useEdnsClientSubnetIp;
  }
    
  @VsoMethod
  public void setUseEdnsClientSubnetIp(Boolean useEdnsClientSubnetIp) {
    this.useEdnsClientSubnetIp = useEdnsClientSubnetIp;
  }

  
  public String getObjectID() {
		return "DnsGeoLocationMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsGeoLocationMatch dnsGeoLocationMatch = (DnsGeoLocationMatch) o;
    return Objects.equals(this.geolocationName, dnsGeoLocationMatch.geolocationName) &&
        Objects.equals(this.geolocationTag, dnsGeoLocationMatch.geolocationTag) &&
        Objects.equals(this.matchCriteria, dnsGeoLocationMatch.matchCriteria) &&
        Objects.equals(this.useEdnsClientSubnetIp, dnsGeoLocationMatch.useEdnsClientSubnetIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geolocationName, geolocationTag, matchCriteria, useEdnsClientSubnetIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsGeoLocationMatch {\n");
    
    sb.append("    geolocationName: ").append(toIndentedString(geolocationName)).append("\n");
    sb.append("    geolocationTag: ").append(toIndentedString(geolocationTag)).append("\n");
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    useEdnsClientSubnetIp: ").append(toIndentedString(useEdnsClientSubnetIp)).append("\n");
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

