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
 * WafExclusionType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafExclusionType")
@VsoFinder(name = Constants.FINDER_VRO_WAFEXCLUSIONTYPE, idAccessor = "getObjectID()")
@Service
public class WafExclusionType extends AviRestResource  {
  @JsonProperty("match_case")
  private String matchCase = "SENSITIVE";

  @JsonProperty("match_op")
  private String matchOp = "EQUALS";

  
  /**
   * Case sensitivity to use for the matching. Enum options - SENSITIVE, INSENSITIVE. Field introduced in 17.2.8.
   * @return matchCase
  **/
  @ApiModelProperty(required = true, value = "Case sensitivity to use for the matching. Enum options - SENSITIVE, INSENSITIVE. Field introduced in 17.2.8.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCase() {
    return matchCase;
  }
    
  @VsoMethod
  public void setMatchCase(String matchCase) {
    this.matchCase = matchCase;
  }

  
  /**
   * String Operation to use for matching the Exclusion. Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH, REGEX_DOES_NOT_MATCH. Field introduced in 17.2.8.
   * @return matchOp
  **/
  @ApiModelProperty(required = true, value = "String Operation to use for matching the Exclusion. Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH, REGEX_DOES_NOT_MATCH. Field introduced in 17.2.8.")
  @NotNull


 
  @VsoMethod  
  public String getMatchOp() {
    return matchOp;
  }
    
  @VsoMethod
  public void setMatchOp(String matchOp) {
    this.matchOp = matchOp;
  }

  
  public String getObjectID() {
		return "WafExclusionType";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafExclusionType wafExclusionType = (WafExclusionType) o;
    return Objects.equals(this.matchCase, wafExclusionType.matchCase) &&
        Objects.equals(this.matchOp, wafExclusionType.matchOp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCase, matchOp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafExclusionType {\n");
    
    sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
    sb.append("    matchOp: ").append(toIndentedString(matchOp)).append("\n");
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

