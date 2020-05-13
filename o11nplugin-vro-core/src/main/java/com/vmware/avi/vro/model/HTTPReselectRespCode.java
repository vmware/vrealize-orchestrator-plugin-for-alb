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
 * HTTPReselectRespCode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPReselectRespCode")
@VsoFinder(name = Constants.FINDER_VRO_HTTPRESELECTRESPCODE, idAccessor = "getObjectID()")
@Service
public class HTTPReselectRespCode extends AviRestResource  {
  @JsonProperty("codes")
  @Valid
  private List<Integer> codes = null;

  @JsonProperty("ranges")
  @Valid
  private List<HTTPStatusRange> ranges = null;

  @JsonProperty("resp_code_block")
  @Valid
  private List<String> respCodeBlock = null;

  
  public HTTPReselectRespCode addCodesItem(Integer codesItem) {
    if (this.codes == null) {
      this.codes = new ArrayList<Integer>();
    }
    this.codes.add(codesItem);
    return this;
  }
  
  /**
   * HTTP response code to be matched. Allowed values are 400-599.
   * @return codes
  **/
  @ApiModelProperty(value = "HTTP response code to be matched. Allowed values are 400-599.")


 
  @VsoMethod  
  public List<Integer> getCodes() {
    return codes;
  }
    
  @VsoMethod
  public void setCodes(List<Integer> codes) {
    this.codes = codes;
  }

  
  public HTTPReselectRespCode addRangesItem(HTTPStatusRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<HTTPStatusRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }
  
  /**
   * HTTP response code ranges to match.
   * @return ranges
  **/
  @ApiModelProperty(value = "HTTP response code ranges to match.")

  @Valid

 
  @VsoMethod  
  public List<HTTPStatusRange> getRanges() {
    return ranges;
  }
    
  @VsoMethod
  public void setRanges(List<HTTPStatusRange> ranges) {
    this.ranges = ranges;
  }

  
  public HTTPReselectRespCode addRespCodeBlockItem(String respCodeBlockItem) {
    if (this.respCodeBlock == null) {
      this.respCodeBlock = new ArrayList<String>();
    }
    this.respCodeBlock.add(respCodeBlockItem);
    return this;
  }
  
  /**
   * Block of HTTP response codes to match for server reselect. Enum options - HTTP_RSP_4XX, HTTP_RSP_5XX.
   * @return respCodeBlock
  **/
  @ApiModelProperty(value = "Block of HTTP response codes to match for server reselect. Enum options - HTTP_RSP_4XX, HTTP_RSP_5XX.")


 
  @VsoMethod  
  public List<String> getRespCodeBlock() {
    return respCodeBlock;
  }
    
  @VsoMethod
  public void setRespCodeBlock(List<String> respCodeBlock) {
    this.respCodeBlock = respCodeBlock;
  }

  
  public String getObjectID() {
		return "HTTPReselectRespCode";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPReselectRespCode htTPReselectRespCode = (HTTPReselectRespCode) o;
    return Objects.equals(this.codes, htTPReselectRespCode.codes) &&
        Objects.equals(this.ranges, htTPReselectRespCode.ranges) &&
        Objects.equals(this.respCodeBlock, htTPReselectRespCode.respCodeBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codes, ranges, respCodeBlock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPReselectRespCode {\n");
    
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    respCodeBlock: ").append(toIndentedString(respCodeBlock)).append("\n");
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

