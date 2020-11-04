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
 * The DnsGeoLocationMatch is a POJO class extends AviRestResource that used for creating
 * DnsGeoLocationMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsGeoLocationMatch")
@VsoFinder(name = Constants.FINDER_VRO_DNSGEOLOCATIONMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsGeoLocationMatch extends AviRestResource {
    @JsonProperty("geolocation_name")
    @JsonInclude(Include.NON_NULL)
    private String geolocationName = null;

    @JsonProperty("geolocation_tag")
    @JsonInclude(Include.NON_NULL)
    private String geolocationTag = null;

    @JsonProperty("match_criteria")
    @JsonInclude(Include.NON_NULL)
    private String matchCriteria = null;

    @JsonProperty("use_edns_client_subnet_ip")
    @JsonInclude(Include.NON_NULL)
    private Boolean useEdnsClientSubnetIp = true;



  /**
   * This is the getter method this will return the attribute value.
   * Geographical location of the client ip to be used in the match.
   * This location is of the format country/state/city e.g.
   * Us/ca/santa clara.
   * Field introduced in 17.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return geolocationName
   */
  @VsoMethod
  public String getGeolocationName() {
    return geolocationName;
  }

  /**
   * This is the setter method to the attribute.
   * Geographical location of the client ip to be used in the match.
   * This location is of the format country/state/city e.g.
   * Us/ca/santa clara.
   * Field introduced in 17.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param geolocationName set the geolocationName.
   */
  @VsoMethod
  public void setGeolocationName(String  geolocationName) {
    this.geolocationName = geolocationName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Geolocation tag for the client ip.
   * This could be any string value for the client ip, e.g.
   * Client ips from us east coast geolocation would be tagged as 'east coast'.
   * Field introduced in 17.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return geolocationTag
   */
  @VsoMethod
  public String getGeolocationTag() {
    return geolocationTag;
  }

  /**
   * This is the setter method to the attribute.
   * Geolocation tag for the client ip.
   * This could be any string value for the client ip, e.g.
   * Client ips from us east coast geolocation would be tagged as 'east coast'.
   * Field introduced in 17.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param geolocationTag set the geolocationTag.
   */
  @VsoMethod
  public void setGeolocationTag(String  geolocationTag) {
    this.geolocationTag = geolocationTag;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for matching the client ip's geographical location.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 17.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchCriteria
   */
  @VsoMethod
  public String getMatchCriteria() {
    return matchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for matching the client ip's geographical location.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 17.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchCriteria set the matchCriteria.
   */
  @VsoMethod
  public void setMatchCriteria(String  matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use the ip address from the edns client subnet option, if available, to derive geo location of the dns query.
   * Field introduced in 17.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return useEdnsClientSubnetIp
   */
  @VsoMethod
  public Boolean getUseEdnsClientSubnetIp() {
    return useEdnsClientSubnetIp;
  }

  /**
   * This is the setter method to the attribute.
   * Use the ip address from the edns client subnet option, if available, to derive geo location of the dns query.
   * Field introduced in 17.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param useEdnsClientSubnetIp set the useEdnsClientSubnetIp.
   */
  @VsoMethod
  public void setUseEdnsClientSubnetIp(Boolean  useEdnsClientSubnetIp) {
    this.useEdnsClientSubnetIp = useEdnsClientSubnetIp;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsGeoLocationMatch objDnsGeoLocationMatch = (DnsGeoLocationMatch) o;
  return   Objects.equals(this.matchCriteria, objDnsGeoLocationMatch.matchCriteria)&&
  Objects.equals(this.useEdnsClientSubnetIp, objDnsGeoLocationMatch.useEdnsClientSubnetIp)&&
  Objects.equals(this.geolocationName, objDnsGeoLocationMatch.geolocationName)&&
  Objects.equals(this.geolocationTag, objDnsGeoLocationMatch.geolocationTag);
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

