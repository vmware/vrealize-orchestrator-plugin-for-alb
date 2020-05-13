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
 * StringMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "StringMatch")
@VsoFinder(name = Constants.FINDER_VRO_STRINGMATCH, idAccessor = "getObjectID()")
@Service
public class StringMatch extends AviRestResource  {
  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("match_str")
  @Valid
  private List<String> matchStr = null;

  @JsonProperty("string_group_refs")
  @Valid
  private List<String> stringGroupRefs = null;

  
  /**
   * Criterion to use for string matching the HTTP request. Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH, REGEX_DOES_NOT_MATCH.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for string matching the HTTP request. Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH, REGEX_DOES_NOT_MATCH.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  public StringMatch addMatchStrItem(String matchStrItem) {
    if (this.matchStr == null) {
      this.matchStr = new ArrayList<String>();
    }
    this.matchStr.add(matchStrItem);
    return this;
  }
  
  /**
   * String value(s).
   * @return matchStr
  **/
  @ApiModelProperty(value = "String value(s).")


 
  @VsoMethod  
  public List<String> getMatchStr() {
    return matchStr;
  }
    
  @VsoMethod
  public void setMatchStr(List<String> matchStr) {
    this.matchStr = matchStr;
  }

  
  public StringMatch addStringGroupRefsItem(String stringGroupRefsItem) {
    if (this.stringGroupRefs == null) {
      this.stringGroupRefs = new ArrayList<String>();
    }
    this.stringGroupRefs.add(stringGroupRefsItem);
    return this;
  }
  
  /**
   * UUID of the string group(s). It is a reference to an object of type StringGroup.
   * @return stringGroupRefs
  **/
  @ApiModelProperty(value = "UUID of the string group(s). It is a reference to an object of type StringGroup.")


 
  @VsoMethod  
  public List<String> getStringGroupRefs() {
    return stringGroupRefs;
  }
    
  @VsoMethod
  public void setStringGroupRefs(List<String> stringGroupRefs) {
    this.stringGroupRefs = stringGroupRefs;
  }

  
  public String getObjectID() {
		return "StringMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringMatch stringMatch = (StringMatch) o;
    return Objects.equals(this.matchCriteria, stringMatch.matchCriteria) &&
        Objects.equals(this.matchStr, stringMatch.matchStr) &&
        Objects.equals(this.stringGroupRefs, stringMatch.stringGroupRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCriteria, matchStr, stringGroupRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringMatch {\n");
    
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    matchStr: ").append(toIndentedString(matchStr)).append("\n");
    sb.append("    stringGroupRefs: ").append(toIndentedString(stringGroupRefs)).append("\n");
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

