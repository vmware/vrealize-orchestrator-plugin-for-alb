package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ServerScaleOutParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ServerScaleOutParams")
@VsoFinder(name = Constants.FINDER_VRO_SERVERSCALEOUTPARAMS, idAccessor = "getObjectID()")
@Service
public class ServerScaleOutParams extends AviRestResource  {
  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * Reason for the manual scaleout.
   * @return reason
  **/
  @ApiModelProperty(value = "Reason for the manual scaleout.")


 
  @VsoMethod  
  public String getReason() {
    return reason;
  }
    
  @VsoMethod
  public void setReason(String reason) {
    this.reason = reason;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "ServerScaleOutParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerScaleOutParams serverScaleOutParams = (ServerScaleOutParams) o;
    return Objects.equals(this.reason, serverScaleOutParams.reason) &&
        Objects.equals(this.uuid, serverScaleOutParams.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerScaleOutParams {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

