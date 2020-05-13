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
 * VIMgrInterestedEntity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIMgrInterestedEntity")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRINTERESTEDENTITY, idAccessor = "getObjectID()")
@Service
public class VIMgrInterestedEntity extends AviRestResource  {
  @JsonProperty("interested_uuid")
  private String interestedUuid = null;

  
  /**
   * Unique object identifier of interested.
   * @return interestedUuid
  **/
  @ApiModelProperty(required = true, value = "Unique object identifier of interested.")
  @NotNull


 
  @VsoMethod  
  public String getInterestedUuid() {
    return interestedUuid;
  }
    
  @VsoMethod
  public void setInterestedUuid(String interestedUuid) {
    this.interestedUuid = interestedUuid;
  }

  
  public String getObjectID() {
		return "VIMgrInterestedEntity";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMgrInterestedEntity viMgrInterestedEntity = (VIMgrInterestedEntity) o;
    return Objects.equals(this.interestedUuid, viMgrInterestedEntity.interestedUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestedUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMgrInterestedEntity {\n");
    
    sb.append("    interestedUuid: ").append(toIndentedString(interestedUuid)).append("\n");
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

