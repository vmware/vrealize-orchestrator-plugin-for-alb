package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * HostHdrMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HostHdrMatch")
@VsoFinder(name = Constants.FINDER_VRO_HOSTHDRMATCH, idAccessor = "getObjectID()")
@Service
public class HostHdrMatch extends AviRestResource  {
  @JsonProperty("match_case")
  private String matchCase = "INSENSITIVE";

  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("value")
  @Valid
  private List<String> value = null;

  
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
   * Criterion to use for the host header value match. Enum options - HDR_EXISTS, HDR_DOES_NOT_EXIST, HDR_BEGINS_WITH, HDR_DOES_NOT_BEGIN_WITH, HDR_CONTAINS, HDR_DOES_NOT_CONTAIN, HDR_ENDS_WITH, HDR_DOES_NOT_END_WITH, HDR_EQUALS, HDR_DOES_NOT_EQUAL.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for the host header value match. Enum options - HDR_EXISTS, HDR_DOES_NOT_EXIST, HDR_BEGINS_WITH, HDR_DOES_NOT_BEGIN_WITH, HDR_CONTAINS, HDR_DOES_NOT_CONTAIN, HDR_ENDS_WITH, HDR_DOES_NOT_END_WITH, HDR_EQUALS, HDR_DOES_NOT_EQUAL.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  public HostHdrMatch addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<String>();
    }
    this.value.add(valueItem);
    return this;
  }
  
  /**
   * String value(s) in the host header.
   * @return value
  **/
  @ApiModelProperty(value = "String value(s) in the host header.")


 
  @VsoMethod  
  public List<String> getValue() {
    return value;
  }
    
  @VsoMethod
  public void setValue(List<String> value) {
    this.value = value;
  }

  
  public String getObjectID() {
		return "HostHdrMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostHdrMatch hostHdrMatch = (HostHdrMatch) o;
    return Objects.equals(this.matchCase, hostHdrMatch.matchCase) &&
        Objects.equals(this.matchCriteria, hostHdrMatch.matchCriteria) &&
        Objects.equals(this.value, hostHdrMatch.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCase, matchCriteria, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostHdrMatch {\n");
    
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

