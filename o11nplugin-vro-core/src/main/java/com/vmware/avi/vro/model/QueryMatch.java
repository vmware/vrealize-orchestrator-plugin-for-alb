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
 * QueryMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "QueryMatch")
@VsoFinder(name = Constants.FINDER_VRO_QUERYMATCH, idAccessor = "getObjectID()")
@Service
public class QueryMatch extends AviRestResource  {
  @JsonProperty("match_case")
  private String matchCase = "INSENSITIVE";

  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("match_str")
  @Valid
  private List<String> matchStr = null;

  @JsonProperty("string_group_refs")
  @Valid
  private List<String> stringGroupRefs = null;

  
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
   * Criterion to use for matching the query in HTTP request URI. Enum options - QUERY_MATCH_CONTAINS.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for matching the query in HTTP request URI. Enum options - QUERY_MATCH_CONTAINS.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  public QueryMatch addMatchStrItem(String matchStrItem) {
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

  
  public QueryMatch addStringGroupRefsItem(String stringGroupRefsItem) {
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
		return "QueryMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryMatch queryMatch = (QueryMatch) o;
    return Objects.equals(this.matchCase, queryMatch.matchCase) &&
        Objects.equals(this.matchCriteria, queryMatch.matchCriteria) &&
        Objects.equals(this.matchStr, queryMatch.matchStr) &&
        Objects.equals(this.stringGroupRefs, queryMatch.stringGroupRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCase, matchCriteria, matchStr, stringGroupRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryMatch {\n");
    
    sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
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

