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
 * HTTPVersionMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPVersionMatch")
@VsoFinder(name = Constants.FINDER_VRO_HTTPVERSIONMATCH, idAccessor = "getObjectID()")
@Service
public class HTTPVersionMatch extends AviRestResource  {
  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("versions")
  @Valid
  private List<String> versions = null;

  
  /**
   * Criterion to use for HTTP version matching the version used in the HTTP request. Enum options - IS_IN, IS_NOT_IN.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for HTTP version matching the version used in the HTTP request. Enum options - IS_IN, IS_NOT_IN.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  public HTTPVersionMatch addVersionsItem(String versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<String>();
    }
    this.versions.add(versionsItem);
    return this;
  }
  
  /**
   * HTTP protocol version. Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO.
   * @return versions
  **/
  @ApiModelProperty(value = "HTTP protocol version. Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO.")


 
  @VsoMethod  
  public List<String> getVersions() {
    return versions;
  }
    
  @VsoMethod
  public void setVersions(List<String> versions) {
    this.versions = versions;
  }

  
  public String getObjectID() {
		return "HTTPVersionMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPVersionMatch htTPVersionMatch = (HTTPVersionMatch) o;
    return Objects.equals(this.matchCriteria, htTPVersionMatch.matchCriteria) &&
        Objects.equals(this.versions, htTPVersionMatch.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCriteria, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPVersionMatch {\n");
    
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

