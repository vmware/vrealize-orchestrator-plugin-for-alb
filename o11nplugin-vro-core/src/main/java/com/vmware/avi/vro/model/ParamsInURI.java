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
 * The ParamsInURI is a POJO class extends AviRestResource that used for creating
 * ParamsInURI.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ParamsInURI")
@VsoFinder(name = Constants.FINDER_VRO_PARAMSINURI)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ParamsInURI extends AviRestResource {
    @JsonProperty("param_info")
    @JsonInclude(Include.NON_NULL)
    private List<ParamInURI> paramInfo = null;



  /**
   * This is the getter method this will return the attribute value.
   * Params info in hitted signature rule which has args match element.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramInfo
   */
  @VsoMethod
  public List<ParamInURI> getParamInfo() {
    return paramInfo;
  }

  /**
   * This is the setter method. this will set the paramInfo
   * Params info in hitted signature rule which has args match element.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramInfo
   */
  @VsoMethod
  public void setParamInfo(List<ParamInURI>  paramInfo) {
    this.paramInfo = paramInfo;
  }

  /**
   * This is the setter method this will set the paramInfo
   * Params info in hitted signature rule which has args match element.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramInfo
   */
  @VsoMethod
  public ParamsInURI addParamInfoItem(ParamInURI paramInfoItem) {
    if (this.paramInfo == null) {
      this.paramInfo = new ArrayList<ParamInURI>();
    }
    this.paramInfo.add(paramInfoItem);
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
  ParamsInURI objParamsInURI = (ParamsInURI) o;
  return   Objects.equals(this.paramInfo, objParamsInURI.paramInfo);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ParamsInURI {\n");
      sb.append("    paramInfo: ").append(toIndentedString(paramInfo)).append("\n");
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

