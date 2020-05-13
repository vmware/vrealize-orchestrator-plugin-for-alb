package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SnmpV3UserParams;
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
 * SnmpV3Configuration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SnmpV3Configuration")
@VsoFinder(name = Constants.FINDER_VRO_SNMPV3CONFIGURATION, idAccessor = "getObjectID()")
@Service
public class SnmpV3Configuration extends AviRestResource  {
  @JsonProperty("engine_id")
  private String engineId = null;

  @JsonProperty("user")
  private SnmpV3UserParams user = null;

  
  /**
   * Engine Id of the Avi Controller SNMP. Field introduced in 17.2.3.
   * @return engineId
  **/
  @ApiModelProperty(value = "Engine Id of the Avi Controller SNMP. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getEngineId() {
    return engineId;
  }
    
  @VsoMethod
  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }

  
  /**
   * SNMP ver 3 user definition. Field introduced in 17.2.3.
   * @return user
  **/
  @ApiModelProperty(value = "SNMP ver 3 user definition. Field introduced in 17.2.3.")

  @Valid

 
  @VsoMethod  
  public SnmpV3UserParams getUser() {
    return user;
  }
    
  @VsoMethod
  public void setUser(SnmpV3UserParams user) {
    this.user = user;
  }

  
  public String getObjectID() {
		return "SnmpV3Configuration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnmpV3Configuration snmpV3Configuration = (SnmpV3Configuration) o;
    return Objects.equals(this.engineId, snmpV3Configuration.engineId) &&
        Objects.equals(this.user, snmpV3Configuration.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineId, user);
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

