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
 * DispatcherTableDumpClear
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DispatcherTableDumpClear")
@VsoFinder(name = Constants.FINDER_VRO_DISPATCHERTABLEDUMPCLEAR, idAccessor = "getObjectID()")
@Service
public class DispatcherTableDumpClear extends AviRestResource  {
  @JsonProperty("se_uuid")
  private String seUuid = null;

  
  /**
   * Unique object identifier of se.
   * @return seUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of se.")


 
  @VsoMethod  
  public String getSeUuid() {
    return seUuid;
  }
    
  @VsoMethod
  public void setSeUuid(String seUuid) {
    this.seUuid = seUuid;
  }

  
  public String getObjectID() {
		return "DispatcherTableDumpClear";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatcherTableDumpClear dispatcherTableDumpClear = (DispatcherTableDumpClear) o;
    return Objects.equals(this.seUuid, dispatcherTableDumpClear.seUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispatcherTableDumpClear {\n");
    
    sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
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

