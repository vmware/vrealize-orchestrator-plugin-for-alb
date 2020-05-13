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
 * AppHdr
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AppHdr")
@VsoFinder(name = Constants.FINDER_VRO_APPHDR, idAccessor = "getObjectID()")
@Service
public class AppHdr extends AviRestResource  {
  @JsonProperty("hdr_match_case")
  private String hdrMatchCase = null;

  @JsonProperty("hdr_name")
  private String hdrName = null;

  @JsonProperty("hdr_string_op")
  private String hdrStringOp = null;

  
  /**
   *  Enum options - SENSITIVE, INSENSITIVE.
   * @return hdrMatchCase
  **/
  @ApiModelProperty(required = true, value = " Enum options - SENSITIVE, INSENSITIVE.")
  @NotNull


 
  @VsoMethod  
  public String getHdrMatchCase() {
    return hdrMatchCase;
  }
    
  @VsoMethod
  public void setHdrMatchCase(String hdrMatchCase) {
    this.hdrMatchCase = hdrMatchCase;
  }

  
  /**
   * hdr_name of AppHdr.
   * @return hdrName
  **/
  @ApiModelProperty(required = true, value = "hdr_name of AppHdr.")
  @NotNull


 
  @VsoMethod  
  public String getHdrName() {
    return hdrName;
  }
    
  @VsoMethod
  public void setHdrName(String hdrName) {
    this.hdrName = hdrName;
  }

  
  /**
   *  Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH, REGEX_DOES_NOT_MATCH.
   * @return hdrStringOp
  **/
  @ApiModelProperty(required = true, value = " Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH, REGEX_DOES_NOT_MATCH.")
  @NotNull


 
  @VsoMethod  
  public String getHdrStringOp() {
    return hdrStringOp;
  }
    
  @VsoMethod
  public void setHdrStringOp(String hdrStringOp) {
    this.hdrStringOp = hdrStringOp;
  }

  
  public String getObjectID() {
		return "AppHdr";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppHdr appHdr = (AppHdr) o;
    return Objects.equals(this.hdrMatchCase, appHdr.hdrMatchCase) &&
        Objects.equals(this.hdrName, appHdr.hdrName) &&
        Objects.equals(this.hdrStringOp, appHdr.hdrStringOp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hdrMatchCase, hdrName, hdrStringOp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppHdr {\n");
    
    sb.append("    hdrMatchCase: ").append(toIndentedString(hdrMatchCase)).append("\n");
    sb.append("    hdrName: ").append(toIndentedString(hdrName)).append("\n");
    sb.append("    hdrStringOp: ").append(toIndentedString(hdrStringOp)).append("\n");
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

