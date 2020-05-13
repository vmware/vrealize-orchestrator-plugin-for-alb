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
 * DebugVirtualServiceSeParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugVirtualServiceSeParams")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGVIRTUALSERVICESEPARAMS, idAccessor = "getObjectID()")
@Service
public class DebugVirtualServiceSeParams extends AviRestResource  {
  @JsonProperty("se_refs")
  @Valid
  private List<String> seRefs = null;

  
  public DebugVirtualServiceSeParams addSeRefsItem(String seRefsItem) {
    if (this.seRefs == null) {
      this.seRefs = new ArrayList<String>();
    }
    this.seRefs.add(seRefsItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type ServiceEngine.
   * @return seRefs
  **/
  @ApiModelProperty(value = " It is a reference to an object of type ServiceEngine.")


 
  @VsoMethod  
  public List<String> getSeRefs() {
    return seRefs;
  }
    
  @VsoMethod
  public void setSeRefs(List<String> seRefs) {
    this.seRefs = seRefs;
  }

  
  public String getObjectID() {
		return "DebugVirtualServiceSeParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugVirtualServiceSeParams debugVirtualServiceSeParams = (DebugVirtualServiceSeParams) o;
    return Objects.equals(this.seRefs, debugVirtualServiceSeParams.seRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugVirtualServiceSeParams {\n");
    
    sb.append("    seRefs: ").append(toIndentedString(seRefs)).append("\n");
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

