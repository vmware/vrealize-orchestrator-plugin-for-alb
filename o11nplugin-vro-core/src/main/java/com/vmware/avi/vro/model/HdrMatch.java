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
 * The HdrMatch is a POJO class extends AviRestResource that used for creating
 * HdrMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HdrMatch")
@VsoFinder(name = Constants.FINDER_VRO_HDRMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HdrMatch extends AviRestResource {
  @JsonProperty("hdr")
  @JsonInclude(Include.NON_NULL)
  private String hdr = null;

  @JsonProperty("match_case")
  @JsonInclude(Include.NON_NULL)
  private String matchCase = "INSENSITIVE";

  @JsonProperty("match_criteria")
  @JsonInclude(Include.NON_NULL)
  private String matchCriteria = null;

  @JsonProperty("value")
  @JsonInclude(Include.NON_NULL)
  private List<String> value = null;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the http header whose value is to be matched.
   * @return hdr
   */
  @VsoMethod
  public String getHdr() {
    return hdr;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the http header whose value is to be matched.
   * @param hdr set the hdr.
   */
  @VsoMethod
  public void setHdr(String  hdr) {
    this.hdr = hdr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Case sensitivity to use for the match.
   * Enum options - SENSITIVE, INSENSITIVE.
   * Default value when not specified in API or module is interpreted by Avi Controller as INSENSITIVE.
   * @return matchCase
   */
  @VsoMethod
  public String getMatchCase() {
    return matchCase;
  }

  /**
   * This is the setter method to the attribute.
   * Case sensitivity to use for the match.
   * Enum options - SENSITIVE, INSENSITIVE.
   * Default value when not specified in API or module is interpreted by Avi Controller as INSENSITIVE.
   * @param matchCase set the matchCase.
   */
  @VsoMethod
  public void setMatchCase(String  matchCase) {
    this.matchCase = matchCase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for matching headers in the http request.
   * Enum options - HDR_EXISTS, HDR_DOES_NOT_EXIST, HDR_BEGINS_WITH, HDR_DOES_NOT_BEGIN_WITH, HDR_CONTAINS, HDR_DOES_NOT_CONTAIN, HDR_ENDS_WITH,
   * HDR_DOES_NOT_END_WITH, HDR_EQUALS, HDR_DOES_NOT_EQUAL.
   * @return matchCriteria
   */
  @VsoMethod
  public String getMatchCriteria() {
    return matchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for matching headers in the http request.
   * Enum options - HDR_EXISTS, HDR_DOES_NOT_EXIST, HDR_BEGINS_WITH, HDR_DOES_NOT_BEGIN_WITH, HDR_CONTAINS, HDR_DOES_NOT_CONTAIN, HDR_ENDS_WITH,
   * HDR_DOES_NOT_END_WITH, HDR_EQUALS, HDR_DOES_NOT_EQUAL.
   * @param matchCriteria set the matchCriteria.
   */
  @VsoMethod
  public void setMatchCriteria(String  matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * String values to match in the http header.
   * @return value
   */
  @VsoMethod
  public List<String> getValue() {
    return value;
  }

  /**
   * This is the setter method. this will set the value
   * String values to match in the http header.
   * @return value
   */
  @VsoMethod
  public void setValue(List<String>  value) {
    this.value = value;
  }

  /**
   * This is the setter method this will set the value
   * String values to match in the http header.
   * @return value
   */
  @VsoMethod
  public HdrMatch addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<String>();
    }
    this.value.add(valueItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HdrMatch objHdrMatch = (HdrMatch) o;
  return   Objects.equals(this.matchCase, objHdrMatch.matchCase)&&
  Objects.equals(this.hdr, objHdrMatch.hdr)&&
  Objects.equals(this.value, objHdrMatch.value)&&
  Objects.equals(this.matchCriteria, objHdrMatch.matchCriteria);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HdrMatch {\n");
      sb.append("    hdr: ").append(toIndentedString(hdr)).append("\n");
        sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
        sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
