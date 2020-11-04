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
 * The SEBandwidthLimit is a POJO class extends AviRestResource that used for creating
 * SEBandwidthLimit.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SEBandwidthLimit")
@VsoFinder(name = Constants.FINDER_VRO_SEBANDWIDTHLIMIT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SEBandwidthLimit extends AviRestResource {
    @JsonProperty("count")
    @JsonInclude(Include.NON_NULL)
    private Integer count = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Total number of service engines for bandwidth based licenses.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return count
   */
  @VsoMethod
  public Integer getCount() {
    return count;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of service engines for bandwidth based licenses.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param count set the count.
   */
  @VsoMethod
  public void setCount(Integer  count) {
    this.count = count;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum bandwidth allowed by each service engine.
   * Enum options - SE_BANDWIDTH_UNLIMITED, SE_BANDWIDTH_25M, SE_BANDWIDTH_200M, SE_BANDWIDTH_1000M, SE_BANDWIDTH_10000M.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum bandwidth allowed by each service engine.
   * Enum options - SE_BANDWIDTH_UNLIMITED, SE_BANDWIDTH_25M, SE_BANDWIDTH_200M, SE_BANDWIDTH_1000M, SE_BANDWIDTH_10000M.
   * Field introduced in 17.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SEBandwidthLimit objSEBandwidthLimit = (SEBandwidthLimit) o;
  return   Objects.equals(this.type, objSEBandwidthLimit.type)&&
  Objects.equals(this.count, objSEBandwidthLimit.count);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SEBandwidthLimit {\n");
      sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

