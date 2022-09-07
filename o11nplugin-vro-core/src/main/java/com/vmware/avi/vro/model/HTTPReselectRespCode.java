package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HTTPReselectRespCode is a POJO class extends AviRestResource that used for creating
 * HTTPReselectRespCode.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPReselectRespCode")
@VsoFinder(name = Constants.FINDER_VRO_HTTPRESELECTRESPCODE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPReselectRespCode extends AviRestResource {
    @JsonProperty("codes")
    @JsonInclude(Include.NON_NULL)
    private List<Integer> codes = null;

    @JsonProperty("ranges")
    @JsonInclude(Include.NON_NULL)
    private List<HTTPStatusRange> ranges = null;

    @JsonProperty("resp_code_block")
    @JsonInclude(Include.NON_NULL)
    private List<String> respCodeBlock = null;



  /**
   * This is the getter method this will return the attribute value.
   * Http response code to be matched.
   * Allowed values are 400-599.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return codes
   */
  @VsoMethod
  public List<Integer> getCodes() {
    return codes;
  }

  /**
   * This is the setter method. this will set the codes
   * Http response code to be matched.
   * Allowed values are 400-599.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return codes
   */
  @VsoMethod
  public void setCodes(List<Integer>  codes) {
    this.codes = codes;
  }

  /**
   * This is the setter method this will set the codes
   * Http response code to be matched.
   * Allowed values are 400-599.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return codes
   */
  @VsoMethod
  public HTTPReselectRespCode addCodesItem(Integer codesItem) {
    if (this.codes == null) {
      this.codes = new ArrayList<Integer>();
    }
    this.codes.add(codesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Http response code ranges to match.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ranges
   */
  @VsoMethod
  public List<HTTPStatusRange> getRanges() {
    return ranges;
  }

  /**
   * This is the setter method. this will set the ranges
   * Http response code ranges to match.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ranges
   */
  @VsoMethod
  public void setRanges(List<HTTPStatusRange>  ranges) {
    this.ranges = ranges;
  }

  /**
   * This is the setter method this will set the ranges
   * Http response code ranges to match.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ranges
   */
  @VsoMethod
  public HTTPReselectRespCode addRangesItem(HTTPStatusRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<HTTPStatusRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Block of http response codes to match for server reselect.
   * Enum options - HTTP_RSP_4XX, HTTP_RSP_5XX.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return respCodeBlock
   */
  @VsoMethod
  public List<String> getRespCodeBlock() {
    return respCodeBlock;
  }

  /**
   * This is the setter method. this will set the respCodeBlock
   * Block of http response codes to match for server reselect.
   * Enum options - HTTP_RSP_4XX, HTTP_RSP_5XX.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return respCodeBlock
   */
  @VsoMethod
  public void setRespCodeBlock(List<String>  respCodeBlock) {
    this.respCodeBlock = respCodeBlock;
  }

  /**
   * This is the setter method this will set the respCodeBlock
   * Block of http response codes to match for server reselect.
   * Enum options - HTTP_RSP_4XX, HTTP_RSP_5XX.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return respCodeBlock
   */
  @VsoMethod
  public HTTPReselectRespCode addRespCodeBlockItem(String respCodeBlockItem) {
    if (this.respCodeBlock == null) {
      this.respCodeBlock = new ArrayList<String>();
    }
    this.respCodeBlock.add(respCodeBlockItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPReselectRespCode objHTTPReselectRespCode = (HTTPReselectRespCode) o;
  return   Objects.equals(this.codes, objHTTPReselectRespCode.codes)&&
  Objects.equals(this.ranges, objHTTPReselectRespCode.ranges)&&
  Objects.equals(this.respCodeBlock, objHTTPReselectRespCode.respCodeBlock);
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

