package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPStatusRange;
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
 * HTTPStatusMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPStatusMatch")
@VsoFinder(name = Constants.FINDER_VRO_HTTPSTATUSMATCH, idAccessor = "getObjectID()")
@Service
public class HTTPStatusMatch extends AviRestResource  {
  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("ranges")
  @Valid
  private List<HTTPStatusRange> ranges = null;

  @JsonProperty("status_codes")
  @Valid
  private List<Integer> statusCodes = null;

  
  /**
   * Criterion to use for matching the HTTP response status code(s). Enum options - IS_IN, IS_NOT_IN.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for matching the HTTP response status code(s). Enum options - IS_IN, IS_NOT_IN.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  public HTTPStatusMatch addRangesItem(HTTPStatusRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<HTTPStatusRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }
  
  /**
   * HTTP response status code range(s).
   * @return ranges
  **/
  @ApiModelProperty(value = "HTTP response status code range(s).")

  @Valid

 
  @VsoMethod  
  public List<HTTPStatusRange> getRanges() {
    return ranges;
  }
    
  @VsoMethod
  public void setRanges(List<HTTPStatusRange> ranges) {
    this.ranges = ranges;
  }

  
  public HTTPStatusMatch addStatusCodesItem(Integer statusCodesItem) {
    if (this.statusCodes == null) {
      this.statusCodes = new ArrayList<Integer>();
    }
    this.statusCodes.add(statusCodesItem);
    return this;
  }
  
  /**
   * HTTP response status code(s).
   * @return statusCodes
  **/
  @ApiModelProperty(value = "HTTP response status code(s).")


 
  @VsoMethod  
  public List<Integer> getStatusCodes() {
    return statusCodes;
  }
    
  @VsoMethod
  public void setStatusCodes(List<Integer> statusCodes) {
    this.statusCodes = statusCodes;
  }

  
  public String getObjectID() {
		return "HTTPStatusMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPStatusMatch htTPStatusMatch = (HTTPStatusMatch) o;
    return Objects.equals(this.matchCriteria, htTPStatusMatch.matchCriteria) &&
        Objects.equals(this.ranges, htTPStatusMatch.ranges) &&
        Objects.equals(this.statusCodes, htTPStatusMatch.statusCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCriteria, ranges, statusCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPStatusMatch {\n");
    
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    statusCodes: ").append(toIndentedString(statusCodes)).append("\n");
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

