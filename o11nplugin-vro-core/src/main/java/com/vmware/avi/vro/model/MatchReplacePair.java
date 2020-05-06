package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ReplaceStringVar;
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
 * MatchReplacePair
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "MatchReplacePair")
@VsoFinder(name = Constants.FINDER_VRO_MATCHREPLACEPAIR, idAccessor = "getObjectID()")
@Service
public class MatchReplacePair extends AviRestResource  {
  @JsonProperty("match_string")
  private String matchString = null;

  @JsonProperty("replacement_string")
  private ReplaceStringVar replacementString = null;

  
  /**
   * String to be matched.
   * @return matchString
  **/
  @ApiModelProperty(required = true, value = "String to be matched.")
  @NotNull


 
  @VsoMethod  
  public String getMatchString() {
    return matchString;
  }
    
  @VsoMethod
  public void setMatchString(String matchString) {
    this.matchString = matchString;
  }

  
  /**
   * Replacement string.
   * @return replacementString
  **/
  @ApiModelProperty(value = "Replacement string.")

  @Valid

 
  @VsoMethod  
  public ReplaceStringVar getReplacementString() {
    return replacementString;
  }
    
  @VsoMethod
  public void setReplacementString(ReplaceStringVar replacementString) {
    this.replacementString = replacementString;
  }

  
  public String getObjectID() {
		return "MatchReplacePair";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchReplacePair matchReplacePair = (MatchReplacePair) o;
    return Objects.equals(this.matchString, matchReplacePair.matchString) &&
        Objects.equals(this.replacementString, matchReplacePair.replacementString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchString, replacementString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchReplacePair {\n");
    
    sb.append("    matchString: ").append(toIndentedString(matchString)).append("\n");
    sb.append("    replacementString: ").append(toIndentedString(replacementString)).append("\n");
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

