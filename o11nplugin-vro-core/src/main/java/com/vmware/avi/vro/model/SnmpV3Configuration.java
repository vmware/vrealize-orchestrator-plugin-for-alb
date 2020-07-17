package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SnmpV3UserParams;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SnmpV3Configuration is a POJO class extends AviRestResource that used for creating
 * SnmpV3Configuration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SnmpV3Configuration")
@VsoFinder(name = Constants.FINDER_VRO_SNMPV3CONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SnmpV3Configuration extends AviRestResource {
  @JsonProperty("engine_id")
  @JsonInclude(Include.NON_NULL)
  private String engineId = null;

  @JsonProperty("user")
  @JsonInclude(Include.NON_NULL)
  private SnmpV3UserParams user = null;



  /**
   * This is the getter method this will return the attribute value.
   * Engine id of the avi controller snmp.
   * Field introduced in 17.2.3.
   * @return engineId
   */
  @VsoMethod
  public String getEngineId() {
    return engineId;
  }

  /**
   * This is the setter method to the attribute.
   * Engine id of the avi controller snmp.
   * Field introduced in 17.2.3.
   * @param engineId set the engineId.
   */
  @VsoMethod
  public void setEngineId(String  engineId) {
    this.engineId = engineId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Snmp ver 3 user definition.
   * Field introduced in 17.2.3.
   * @return user
   */
  @VsoMethod
  public SnmpV3UserParams getUser() {
    return user;
  }

  /**
   * This is the setter method to the attribute.
   * Snmp ver 3 user definition.
   * Field introduced in 17.2.3.
   * @param user set the user.
   */
  @VsoMethod
  public void setUser(SnmpV3UserParams user) {
    this.user = user;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SnmpV3Configuration objSnmpV3Configuration = (SnmpV3Configuration) o;
  return   Objects.equals(this.user, objSnmpV3Configuration.user)&&
  Objects.equals(this.engineId, objSnmpV3Configuration.engineId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SnmpV3Configuration {\n");
      sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

