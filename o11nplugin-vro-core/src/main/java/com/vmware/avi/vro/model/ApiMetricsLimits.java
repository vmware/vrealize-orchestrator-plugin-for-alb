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
 * The ApiMetricsLimits is a POJO class extends AviRestResource that used for creating
 * ApiMetricsLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiMetricsLimits")
@VsoFinder(name = Constants.FINDER_VRO_APIMETRICSLIMITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiMetricsLimits extends AviRestResource {
    @JsonProperty("num_apis")
    @JsonInclude(Include.NON_NULL)
    private Integer numApis;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of api endpoints for which metrics are tracked across the system.
   * Associating an apipolicy with a virtual service is rejected at config time if adding its metrics budget would exceed this limit.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numApis
   */
  @VsoMethod
  public Integer getNumApis() {
    return numApis;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of api endpoints for which metrics are tracked across the system.
   * Associating an apipolicy with a virtual service is rejected at config time if adding its metrics budget would exceed this limit.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numApis set the numApis.
   */
  @VsoMethod
  public void setNumApis(Integer  numApis) {
    this.numApis = numApis;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApiMetricsLimits objApiMetricsLimits = (ApiMetricsLimits) o;
  return   Objects.equals(this.numApis, objApiMetricsLimits.numApis);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiMetricsLimits {\n");
      sb.append("    numApis: ").append(toIndentedString(numApis)).append("\n");
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

