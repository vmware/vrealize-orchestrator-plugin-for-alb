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
 * The SourcePortAddr is a POJO class extends AviRestResource that used for creating
 * SourcePortAddr.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SourcePortAddr")
@VsoFinder(name = Constants.FINDER_VRO_SOURCEPORTADDR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SourcePortAddr extends AviRestResource {
    @JsonProperty("match_operation")
    @JsonInclude(Include.NON_NULL)
    private String matchOperation = "IS_IN";

    @JsonProperty("src_port_end")
    @JsonInclude(Include.NON_NULL)
    private Integer srcPortEnd = null;

    @JsonProperty("src_port_start")
    @JsonInclude(Include.NON_NULL)
    private Integer srcPortStart = null;



  /**
   * This is the getter method this will return the attribute value.
   * Match criteria.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "IS_IN".
   * @return matchOperation
   */
  @VsoMethod
  public String getMatchOperation() {
    return matchOperation;
  }

  /**
   * This is the setter method to the attribute.
   * Match criteria.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "IS_IN".
   * @param matchOperation set the matchOperation.
   */
  @VsoMethod
  public void setMatchOperation(String  matchOperation) {
    this.matchOperation = matchOperation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tcp/udp port range end (inclusive).
   * Allowed values are 1-65535.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return srcPortEnd
   */
  @VsoMethod
  public Integer getSrcPortEnd() {
    return srcPortEnd;
  }

  /**
   * This is the setter method to the attribute.
   * Tcp/udp port range end (inclusive).
   * Allowed values are 1-65535.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param srcPortEnd set the srcPortEnd.
   */
  @VsoMethod
  public void setSrcPortEnd(Integer  srcPortEnd) {
    this.srcPortEnd = srcPortEnd;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tcp/udp port range start (inclusive).
   * Allowed values are 1-65535.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return srcPortStart
   */
  @VsoMethod
  public Integer getSrcPortStart() {
    return srcPortStart;
  }

  /**
   * This is the setter method to the attribute.
   * Tcp/udp port range start (inclusive).
   * Allowed values are 1-65535.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param srcPortStart set the srcPortStart.
   */
  @VsoMethod
  public void setSrcPortStart(Integer  srcPortStart) {
    this.srcPortStart = srcPortStart;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SourcePortAddr objSourcePortAddr = (SourcePortAddr) o;
  return   Objects.equals(this.srcPortStart, objSourcePortAddr.srcPortStart)&&
  Objects.equals(this.srcPortEnd, objSourcePortAddr.srcPortEnd)&&
  Objects.equals(this.matchOperation, objSourcePortAddr.matchOperation);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SourcePortAddr {\n");
      sb.append("    matchOperation: ").append(toIndentedString(matchOperation)).append("\n");
        sb.append("    srcPortEnd: ").append(toIndentedString(srcPortEnd)).append("\n");
        sb.append("    srcPortStart: ").append(toIndentedString(srcPortStart)).append("\n");
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

