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
 * VcenterHosts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VcenterHosts")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERHOSTS, idAccessor = "getObjectID()")
@Service
public class VcenterHosts extends AviRestResource  {
  @JsonProperty("host_refs")
  @Valid
  private List<String> hostRefs = null;

  @JsonProperty("include")
  private Boolean include = null;

  
  public VcenterHosts addHostRefsItem(String hostRefsItem) {
    if (this.hostRefs == null) {
      this.hostRefs = new ArrayList<String>();
    }
    this.hostRefs.add(hostRefsItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type VIMgrHostRuntime.
   * @return hostRefs
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VIMgrHostRuntime.")


 
  @VsoMethod  
  public List<String> getHostRefs() {
    return hostRefs;
  }
    
  @VsoMethod
  public void setHostRefs(List<String> hostRefs) {
    this.hostRefs = hostRefs;
  }

  
  /**
   * Placeholder for description of property include of obj type VcenterHosts field type str  type boolean
   * @return include
  **/
  @ApiModelProperty(value = "Placeholder for description of property include of obj type VcenterHosts field type str  type boolean")


 
  @VsoMethod  
  public Boolean isInclude() {
    return include;
  }
    
  @VsoMethod
  public void setInclude(Boolean include) {
    this.include = include;
  }

  
  public String getObjectID() {
		return "VcenterHosts";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcenterHosts vcenterHosts = (VcenterHosts) o;
    return Objects.equals(this.hostRefs, vcenterHosts.hostRefs) &&
        Objects.equals(this.include, vcenterHosts.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostRefs, include);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcenterHosts {\n");
    
    sb.append("    hostRefs: ").append(toIndentedString(hostRefs)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
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

