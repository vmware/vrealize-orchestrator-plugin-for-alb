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
 * CookieMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CookieMatch")
@VsoFinder(name = Constants.FINDER_VRO_COOKIEMATCH, idAccessor = "getObjectID()")
@Service
public class CookieMatch extends AviRestResource  {
  @JsonProperty("match_case")
  private String matchCase = "INSENSITIVE";

  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  
  /**
   * Case sensitivity to use for the match. Enum options - SENSITIVE, INSENSITIVE.
   * @return matchCase
  **/
  @ApiModelProperty(value = "Case sensitivity to use for the match. Enum options - SENSITIVE, INSENSITIVE.")


 
  @VsoMethod  
  public String getMatchCase() {
    return matchCase;
  }
    
  @VsoMethod
  public void setMatchCase(String matchCase) {
    this.matchCase = matchCase;
  }

  
  /**
   * Criterion to use for matching the cookie in the HTTP request. Enum options - HDR_EXISTS, HDR_DOES_NOT_EXIST, HDR_BEGINS_WITH, HDR_DOES_NOT_BEGIN_WITH, HDR_CONTAINS, HDR_DOES_NOT_CONTAIN, HDR_ENDS_WITH, HDR_DOES_NOT_END_WITH, HDR_EQUALS, HDR_DOES_NOT_EQUAL.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for matching the cookie in the HTTP request. Enum options - HDR_EXISTS, HDR_DOES_NOT_EXIST, HDR_BEGINS_WITH, HDR_DOES_NOT_BEGIN_WITH, HDR_CONTAINS, HDR_DOES_NOT_CONTAIN, HDR_ENDS_WITH, HDR_DOES_NOT_END_WITH, HDR_EQUALS, HDR_DOES_NOT_EQUAL.")
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
   * Name of the cookie.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the cookie.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * String value in the cookie.
   * @return value
  **/
  @ApiModelProperty(value = "String value in the cookie.")


 
  @VsoMethod  
  public String getValue() {
    return value;
  }
    
  @VsoMethod
  public void setValue(String value) {
    this.value = value;
  }

  
  public String getObjectID() {
		return "CookieMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CookieMatch cookieMatch = (CookieMatch) o;
    return Objects.equals(this.matchCase, cookieMatch.matchCase) &&
        Objects.equals(this.matchCriteria, cookieMatch.matchCriteria) &&
        Objects.equals(this.name, cookieMatch.name) &&
        Objects.equals(this.value, cookieMatch.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCase, matchCriteria, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CookieMatch {\n");
    
    sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

