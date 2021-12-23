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
 * The PrimaryPool is a POJO class extends AviRestResource that used for creating
 * PrimaryPool.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PrimaryPool")
@VsoFinder(name = Constants.FINDER_VRO_PRIMARYPOOL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PrimaryPool extends AviRestResource {
    @JsonProperty("pool_uuid")
    @JsonInclude(Include.NON_NULL)
    private String poolUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Pool's id.
   * Field introduced in 20.1.7, 21.1.2, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolUuid
   */
  @VsoMethod
  public String getPoolUuid() {
    return poolUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Pool's id.
   * Field introduced in 20.1.7, 21.1.2, 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolUuid set the poolUuid.
   */
  @VsoMethod
  public void setPoolUuid(String  poolUuid) {
    this.poolUuid = poolUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PrimaryPool objPrimaryPool = (PrimaryPool) o;
  return   Objects.equals(this.poolUuid, objPrimaryPool.poolUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PrimaryPool {\n");
      sb.append("    poolUuid: ").append(toIndentedString(poolUuid)).append("\n");
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

