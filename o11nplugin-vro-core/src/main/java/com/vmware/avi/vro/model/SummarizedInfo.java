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
 * The SummarizedInfo is a POJO class extends AviRestResource that used for creating
 * SummarizedInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SummarizedInfo")
@VsoFinder(name = Constants.FINDER_VRO_SUMMARIZEDINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SummarizedInfo extends AviRestResource {
  @JsonProperty("subnet_info")
  @JsonInclude(Include.NON_NULL)
  private List<SummarizedSubnetInfo> subnetInfo = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property subnet_info of obj type summarizedinfo field type str  type array.
   * @return subnetInfo
   */
  @VsoMethod
  public List<SummarizedSubnetInfo> getSubnetInfo() {
    return subnetInfo;
  }

  /**
   * This is the setter method. this will set the subnetInfo
   * Placeholder for description of property subnet_info of obj type summarizedinfo field type str  type array.
   * @return subnetInfo
   */
  @VsoMethod
  public void setSubnetInfo(List<SummarizedSubnetInfo>  subnetInfo) {
    this.subnetInfo = subnetInfo;
  }

  /**
   * This is the setter method this will set the subnetInfo
   * Placeholder for description of property subnet_info of obj type summarizedinfo field type str  type array.
   * @return subnetInfo
   */
  @VsoMethod
  public SummarizedInfo addSubnetInfoItem(SummarizedSubnetInfo subnetInfoItem) {
    if (this.subnetInfo == null) {
      this.subnetInfo = new ArrayList<SummarizedSubnetInfo>();
    }
    this.subnetInfo.add(subnetInfoItem);
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
  SummarizedInfo objSummarizedInfo = (SummarizedInfo) o;
  return   Objects.equals(this.subnetInfo, objSummarizedInfo.subnetInfo);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SummarizedInfo {\n");
      sb.append("    subnetInfo: ").append(toIndentedString(subnetInfo)).append("\n");
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

