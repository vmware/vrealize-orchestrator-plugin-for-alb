package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * VsResyncParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "VsResyncParams")
@VsoFinder(name = Constants.FINDER_VRO_VSRESYNCPARAMS, idAccessor = "getObjectID()")
@Service
public class VsResyncParams extends AviRestResource  {
  @JsonProperty("se_ref")
  @Valid
  private List<String> seRef = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  public VsResyncParams addSeRefItem(String seRefItem) {
    if (this.seRef == null) {
      this.seRef = new ArrayList<String>();
    }
    this.seRef.add(seRefItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type ServiceEngine.
   * @return seRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public List<String> getSeRef() {
    return seRef;
  }
    
  @VsoMethod
  public void setSeRef(List<String> seRef) {
    this.seRef = seRef;
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
		return "VsResyncParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsResyncParams vsResyncParams = (VsResyncParams) o;
    return Objects.equals(this.seRef, vsResyncParams.seRef) &&
        Objects.equals(this.uuid, vsResyncParams.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seRef, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsResyncParams {\n");
    
    sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
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

